package za.co.fredkobo.arcorelocationpoc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ar.core.Frame;
import com.google.ar.core.Plane;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.UnavailableException;
import com.google.ar.sceneform.ArSceneView;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.ViewRenderable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import uk.co.appoly.arcorelocation.LocationMarker;
import uk.co.appoly.arcorelocation.LocationScene;
import uk.co.appoly.arcorelocation.rendering.LocationNode;
import uk.co.appoly.arcorelocation.rendering.LocationNodeRender;
import uk.co.appoly.arcorelocation.utils.ARLocationPermissionHelper;

public class MainActivity extends AppCompatActivity {
    private boolean installRequested;
    private boolean hasFinishedLoading = false;

    private ArSceneView arSceneView;

    // Renderables for this example
    private List<ViewRenderable> layoutRenderables = new ArrayList<>();

    // Our ARCore-Location scene
    private LocationScene locationScene;

    private List<CompletableFuture<ViewRenderable>> viewRenderables = new ArrayList<>();

    @Override
    @SuppressWarnings({"AndroidApiChecker", "FutureReturnValueIgnored"})
    // CompletableFuture requires api level 24
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arSceneView = findViewById(R.id.ar_scene_view);



        for(Position position: getMockPositions()){
            // Build a renderable from a 2D View.
            CompletableFuture<ViewRenderable> exampleLayout =
                    ViewRenderable.builder()
                            .setView(this, R.layout.renderable_layout)
                            .build();
            viewRenderables.add(exampleLayout);
        }

        for(CompletableFuture<ViewRenderable> renderableCompletableFuture: viewRenderables){
            CompletableFuture.allOf(
                    renderableCompletableFuture)
                    .handle(
                            (notUsed, throwable) -> {
                                // When you build a Renderable, Sceneform loads its resources in the background while
                                // returning a CompletableFuture. Call handle(), thenAccept(), or check isDone()
                                // before calling get().

                                if (throwable != null) {
                                    DemoUtils.displayError(this, "Unable to load renderables", throwable);
                                    return null;
                                }

                                try {
                                    layoutRenderables.add(renderableCompletableFuture.get());
                                    hasFinishedLoading = true;

                                } catch (InterruptedException | ExecutionException ex) {
                                    DemoUtils.displayError(this, "Unable to load renderables", ex);
                                }

                                return null;
                            });
        }





        // Set an update listener on the Scene that will hide the loading message once a Plane is
        // detected.
        arSceneView
                .getScene()
                .setOnUpdateListener(
                        frameTime -> {
                            if (!hasFinishedLoading) {
                                return;
                            }

                            if (locationScene == null) {
                                // If our locationScene object hasn't been setup yet, this is a good time to do it
                                // We know that here, the AR components have been initiated.
                                locationScene = new LocationScene(this, this, arSceneView);
                                //locationScene.setAnchorRefreshInterval(120);

                                int i = 0;
                                for(Position position : getMockPositions()){
                                    // Now lets create our location markers.
                                    // First, a layout

                                    Node base = new Node();
                                    base.setRenderable(layoutRenderables.get(i));
                                    Context c = this;
                                    // Add  listeners etc here
                                    View eView = layoutRenderables.get(i).getView();
                                    eView.setOnTouchListener((v, event) -> {
                                        Toast.makeText(
                                                c, "Location marker " + position.getLabel() + " touched.", Toast.LENGTH_SHORT)
                                                .show();
                                        return false;
                                    });

                                    LocationMarker layoutLocationMarker = new LocationMarker(
                                            position.getLongitude(), position.getLatitude(),
                                            base
                                    );



                                    // An example "onRender" event, called every frame
                                    // Updates the layout with the markers distance
                                    int finalI = i;
                                    layoutLocationMarker.setRenderEvent(new LocationNodeRender() {
                                        @Override
                                        public void render(LocationNode node) {
                                            View eView = layoutRenderables.get(finalI).getView();
                                            TextView distanceTextView = eView.findViewById(R.id.tv_distance);
                                            double distance = node.getDistance() / 1000.0;
                                            distanceTextView.setText(distance + " km");
                                        }
                                    });

                                    // Adding the marker
                                    locationScene.mLocationMarkers.add(layoutLocationMarker);
                                    i++;
                                }
                            }

                            Frame frame = arSceneView.getArFrame();
                            if (frame == null) {
                                return;
                            }

                            if (frame.getCamera().getTrackingState() != TrackingState.TRACKING) {
                                return;
                            }

                            if (locationScene != null) {
                                locationScene.processFrame(frame);
                            }

                        });

        // Lastly request CAMERA & fine location permission which is required by ARCore-Location.
        ARLocationPermissionHelper.requestPermission(this);
    }


    /**
     * Make sure we call locationScene.resume();
     */
    @Override
    protected void onResume() {
        super.onResume();

        if (locationScene != null) {
            locationScene.resume();
        }

        if (arSceneView.getSession() == null) {
            // If the session wasn't created yet, don't resume rendering.
            // This can happen if ARCore needs to be updated or permissions are not granted yet.
            try {
                Session session = DemoUtils.createArSession(this, installRequested);
                if (session == null) {
                    installRequested = ARLocationPermissionHelper.hasPermission(this);
                    return;
                } else {
                    arSceneView.setupSession(session);
                }
            } catch (UnavailableException e) {
                DemoUtils.handleSessionException(this, e);
            }
        }

        try {
            arSceneView.resume();
        } catch (CameraNotAvailableException ex) {
            DemoUtils.displayError(this, "Unable to get camera", ex);
            finish();
            return;
        }
    }

    /**
     * Make sure we call locationScene.pause();
     */
    @Override
    public void onPause() {
        super.onPause();

        if (locationScene != null) {
            locationScene.pause();
        }

        arSceneView.pause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        arSceneView.destroy();
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String[] permissions, @NonNull int[] results) {
        if (!ARLocationPermissionHelper.hasPermission(this)) {
            if (!ARLocationPermissionHelper.shouldShowRequestPermissionRationale(this)) {
                // Permission denied with checking "Do not ask again".
                ARLocationPermissionHelper.launchPermissionSettings(this);
            } else {
                Toast.makeText(
                        this, "Camera permission is needed to run this application", Toast.LENGTH_LONG)
                        .show();
            }
            finish();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            // Standard Android full-screen functionality.
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
    }

    private List<Position> getMockPositions(){
        List<Position> mockpos = new ArrayList<>();
        mockpos.add(new Position(-26.110890,27.931336, "A"));
        mockpos.add(new Position(-26.1187,27.9522, "B"));
        mockpos.add(new Position(-26.1036,27.9459, "C"));
        mockpos.add(new Position(-26.0998,27.9411, "D"));
        mockpos.add(new Position(-26.128190,27.973400, "E"));
        mockpos.add(new Position(-26.1254,27.9442, "F"));
        mockpos.add(new Position(-26.1323,27.973400, "G"));
        mockpos.add(new Position(-26.101,27.95, "H"));
        return mockpos;
    }

}
