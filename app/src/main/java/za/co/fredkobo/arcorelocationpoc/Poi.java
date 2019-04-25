package za.co.fredkobo.arcorelocationpoc;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Poi {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("generalLongitude")
    @Expose
    private Double generalLongitude;
    @SerializedName("generalLatitude")
    @Expose
    private Double generalLatitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("suburb")
    @Expose
    private String suburb;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("arEntityType")
    @Expose
    private String arEntityType;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("phoneIcon")
    @Expose
    private String phoneIcon;
    @SerializedName("partnerId")
    @Expose
    private Integer partnerId;
    @SerializedName("partnerShortName")
    @Expose
    private String partnerShortName;
    @SerializedName("altitude")
    @Expose
    private Double altitude;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("storeLevel")
    @Expose
    private String storeLevel;
    @SerializedName("storeLevelShort")
    @Expose
    private String storeLevelShort;
    @SerializedName("tel")
    @Expose
    private String tel;
    @SerializedName("isStoreClosed")
    @Expose
    private String isStoreClosed;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("scale")
    @Expose
    private Double scale;
    @SerializedName("offsetX")
    @Expose
    private Double offsetX;
    @SerializedName("offsetY")
    @Expose
    private Double offsetY;
    @SerializedName("skin")
    @Expose
    private String skin;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("opacity")
    @Expose
    private Double opacity;
    @SerializedName("cluster")
    @Expose
    private Boolean cluster;
    @SerializedName("clusterName")
    @Expose
    private String clusterName;
    @SerializedName("atmChildren")
    @Expose
    private List<Object> atmChildren = null;
    @SerializedName("branchChildren")
    @Expose
    private List<Object> branchChildren = null;
    @SerializedName("termId")
    @Expose
    private Integer termId;
    @SerializedName("acceptCashDeposit")
    @Expose
    private Boolean acceptCashDeposit;
    @SerializedName("acceptCoinDeposit")
    @Expose
    private Boolean acceptCoinDeposit;
    @SerializedName("acceptEnvelopeDeposit")
    @Expose
    private Boolean acceptEnvelopeDeposit;
    @SerializedName("hasCashDispenser")
    @Expose
    private Boolean hasCashDispenser;
    @SerializedName("hasChequeReader")
    @Expose
    private Boolean hasChequeReader;
    @SerializedName("printStatement")
    @Expose
    private Boolean printStatement;
    @SerializedName("branchCode")
    @Expose
    private String branchCode;
    @SerializedName("costCenterCode")
    @Expose
    private String costCenterCode;
    @SerializedName("branchType")
    @Expose
    private String branchType;
    @SerializedName("globalEmail")
    @Expose
    private String globalEmail;
    @SerializedName("adt")
    @Expose
    private Boolean adt;
    @SerializedName("mondayOpen")
    @Expose
    private String mondayOpen;
    @SerializedName("tuesdayOpen")
    @Expose
    private String tuesdayOpen;
    @SerializedName("wednesdayOpen")
    @Expose
    private String wednesdayOpen;
    @SerializedName("thursdayOpen")
    @Expose
    private String thursdayOpen;
    @SerializedName("fridayOpen")
    @Expose
    private String fridayOpen;
    @SerializedName("saturdayOpen")
    @Expose
    private String saturdayOpen;
    @SerializedName("sundayOpen")
    @Expose
    private String sundayOpen;
    @SerializedName("mondayClose")
    @Expose
    private String mondayClose;
    @SerializedName("tuesdayClose")
    @Expose
    private String tuesdayClose;
    @SerializedName("wednesdayClose")
    @Expose
    private String wednesdayClose;
    @SerializedName("thursdayClose")
    @Expose
    private String thursdayClose;
    @SerializedName("fridayClose")
    @Expose
    private String fridayClose;
    @SerializedName("saturdayClose")
    @Expose
    private String saturdayClose;
    @SerializedName("sundayClose")
    @Expose
    private String sundayClose;
    @SerializedName("publicHolidayOpen")
    @Expose
    private String publicHolidayOpen;
    @SerializedName("publicHolidayClose")
    @Expose
    private String publicHolidayClose;
    @SerializedName("tellerMondayClose")
    @Expose
    private String tellerMondayClose;
    @SerializedName("tellerTuesdayClose")
    @Expose
    private String tellerTuesdayClose;
    @SerializedName("tellerWednesdayClose")
    @Expose
    private String tellerWednesdayClose;
    @SerializedName("tellerThursdayClose")
    @Expose
    private String tellerThursdayClose;
    @SerializedName("tellerFridayClose")
    @Expose
    private String tellerFridayClose;
    @SerializedName("tellerSaturdayClose")
    @Expose
    private String tellerSaturdayClose;
    @SerializedName("tellerSundayClose")
    @Expose
    private String tellerSundayClose;
    @SerializedName("tellerMondayOpen")
    @Expose
    private String tellerMondayOpen;
    @SerializedName("tellerTuesdayOpen")
    @Expose
    private String tellerTuesdayOpen;
    @SerializedName("tellerWednesdayOpen")
    @Expose
    private String tellerWednesdayOpen;
    @SerializedName("tellerThursdayOpen")
    @Expose
    private String tellerThursdayOpen;
    @SerializedName("tellerFridayOpen")
    @Expose
    private String tellerFridayOpen;
    @SerializedName("tellerSaturdayOpen")
    @Expose
    private String tellerSaturdayOpen;
    @SerializedName("tellerSundayOpen")
    @Expose
    private String tellerSundayOpen;
    @SerializedName("generatorAvailable")
    @Expose
    private Boolean generatorAvailable;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("callCentreNumber")
    @Expose
    private String callCentreNumber;
    @SerializedName("tellersInBranch")
    @Expose
    private Boolean tellersInBranch;
    @SerializedName("wifiAvailable")
    @Expose
    private Boolean wifiAvailable;
    @SerializedName("eBanker")
    @Expose
    private Boolean eBanker;
    @SerializedName("smartIdCapable")
    @Expose
    private Boolean smartIdCapable;
    @SerializedName("cardDeliverAvailable")
    @Expose
    private Boolean cardDeliverAvailable;
    @SerializedName("countryCode")
    @Expose
    private Integer countryCode;
    @SerializedName("emailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("branchRevamp")
    @Expose
    private Boolean branchRevamp;
    @SerializedName("queueZones")
    @Expose
    private List<Object> queueZones = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGeneralLongitude() {
        return generalLongitude;
    }

    public void setGeneralLongitude(Double generalLongitude) {
        this.generalLongitude = generalLongitude;
    }

    public Double getGeneralLatitude() {
        return generalLatitude;
    }

    public void setGeneralLatitude(Double generalLatitude) {
        this.generalLatitude = generalLatitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getArEntityType() {
        return arEntityType;
    }

    public void setArEntityType(String arEntityType) {
        this.arEntityType = arEntityType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneIcon() {
        return phoneIcon;
    }

    public void setPhoneIcon(String phoneIcon) {
        this.phoneIcon = phoneIcon;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerShortName() {
        return partnerShortName;
    }

    public void setPartnerShortName(String partnerShortName) {
        this.partnerShortName = partnerShortName;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(String storeLevel) {
        this.storeLevel = storeLevel;
    }

    public String getStoreLevelShort() {
        return storeLevelShort;
    }

    public void setStoreLevelShort(String storeLevelShort) {
        this.storeLevelShort = storeLevelShort;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIsStoreClosed() {
        return isStoreClosed;
    }

    public void setIsStoreClosed(String isStoreClosed) {
        this.isStoreClosed = isStoreClosed;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public Boolean getCluster() {
        return cluster;
    }

    public void setCluster(Boolean cluster) {
        this.cluster = cluster;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public List<Object> getAtmChildren() {
        return atmChildren;
    }

    public void setAtmChildren(List<Object> atmChildren) {
        this.atmChildren = atmChildren;
    }

    public List<Object> getBranchChildren() {
        return branchChildren;
    }

    public void setBranchChildren(List<Object> branchChildren) {
        this.branchChildren = branchChildren;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public Boolean getAcceptCashDeposit() {
        return acceptCashDeposit;
    }

    public void setAcceptCashDeposit(Boolean acceptCashDeposit) {
        this.acceptCashDeposit = acceptCashDeposit;
    }

    public Boolean getAcceptCoinDeposit() {
        return acceptCoinDeposit;
    }

    public void setAcceptCoinDeposit(Boolean acceptCoinDeposit) {
        this.acceptCoinDeposit = acceptCoinDeposit;
    }

    public Boolean getAcceptEnvelopeDeposit() {
        return acceptEnvelopeDeposit;
    }

    public void setAcceptEnvelopeDeposit(Boolean acceptEnvelopeDeposit) {
        this.acceptEnvelopeDeposit = acceptEnvelopeDeposit;
    }

    public Boolean getHasCashDispenser() {
        return hasCashDispenser;
    }

    public void setHasCashDispenser(Boolean hasCashDispenser) {
        this.hasCashDispenser = hasCashDispenser;
    }

    public Boolean getHasChequeReader() {
        return hasChequeReader;
    }

    public void setHasChequeReader(Boolean hasChequeReader) {
        this.hasChequeReader = hasChequeReader;
    }

    public Boolean getPrintStatement() {
        return printStatement;
    }

    public void setPrintStatement(Boolean printStatement) {
        this.printStatement = printStatement;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getBranchType() {
        return branchType;
    }

    public void setBranchType(String branchType) {
        this.branchType = branchType;
    }

    public String getGlobalEmail() {
        return globalEmail;
    }

    public void setGlobalEmail(String globalEmail) {
        this.globalEmail = globalEmail;
    }

    public Boolean getAdt() {
        return adt;
    }

    public void setAdt(Boolean adt) {
        this.adt = adt;
    }

    public String getMondayOpen() {
        return mondayOpen;
    }

    public void setMondayOpen(String mondayOpen) {
        this.mondayOpen = mondayOpen;
    }

    public String getTuesdayOpen() {
        return tuesdayOpen;
    }

    public void setTuesdayOpen(String tuesdayOpen) {
        this.tuesdayOpen = tuesdayOpen;
    }

    public String getWednesdayOpen() {
        return wednesdayOpen;
    }

    public void setWednesdayOpen(String wednesdayOpen) {
        this.wednesdayOpen = wednesdayOpen;
    }

    public String getThursdayOpen() {
        return thursdayOpen;
    }

    public void setThursdayOpen(String thursdayOpen) {
        this.thursdayOpen = thursdayOpen;
    }

    public String getFridayOpen() {
        return fridayOpen;
    }

    public void setFridayOpen(String fridayOpen) {
        this.fridayOpen = fridayOpen;
    }

    public String getSaturdayOpen() {
        return saturdayOpen;
    }

    public void setSaturdayOpen(String saturdayOpen) {
        this.saturdayOpen = saturdayOpen;
    }

    public String getSundayOpen() {
        return sundayOpen;
    }

    public void setSundayOpen(String sundayOpen) {
        this.sundayOpen = sundayOpen;
    }

    public String getMondayClose() {
        return mondayClose;
    }

    public void setMondayClose(String mondayClose) {
        this.mondayClose = mondayClose;
    }

    public String getTuesdayClose() {
        return tuesdayClose;
    }

    public void setTuesdayClose(String tuesdayClose) {
        this.tuesdayClose = tuesdayClose;
    }

    public String getWednesdayClose() {
        return wednesdayClose;
    }

    public void setWednesdayClose(String wednesdayClose) {
        this.wednesdayClose = wednesdayClose;
    }

    public String getThursdayClose() {
        return thursdayClose;
    }

    public void setThursdayClose(String thursdayClose) {
        this.thursdayClose = thursdayClose;
    }

    public String getFridayClose() {
        return fridayClose;
    }

    public void setFridayClose(String fridayClose) {
        this.fridayClose = fridayClose;
    }

    public String getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(String saturdayClose) {
        this.saturdayClose = saturdayClose;
    }

    public String getSundayClose() {
        return sundayClose;
    }

    public void setSundayClose(String sundayClose) {
        this.sundayClose = sundayClose;
    }

    public String getPublicHolidayOpen() {
        return publicHolidayOpen;
    }

    public void setPublicHolidayOpen(String publicHolidayOpen) {
        this.publicHolidayOpen = publicHolidayOpen;
    }

    public String getPublicHolidayClose() {
        return publicHolidayClose;
    }

    public void setPublicHolidayClose(String publicHolidayClose) {
        this.publicHolidayClose = publicHolidayClose;
    }

    public String getTellerMondayClose() {
        return tellerMondayClose;
    }

    public void setTellerMondayClose(String tellerMondayClose) {
        this.tellerMondayClose = tellerMondayClose;
    }

    public String getTellerTuesdayClose() {
        return tellerTuesdayClose;
    }

    public void setTellerTuesdayClose(String tellerTuesdayClose) {
        this.tellerTuesdayClose = tellerTuesdayClose;
    }

    public String getTellerWednesdayClose() {
        return tellerWednesdayClose;
    }

    public void setTellerWednesdayClose(String tellerWednesdayClose) {
        this.tellerWednesdayClose = tellerWednesdayClose;
    }

    public String getTellerThursdayClose() {
        return tellerThursdayClose;
    }

    public void setTellerThursdayClose(String tellerThursdayClose) {
        this.tellerThursdayClose = tellerThursdayClose;
    }

    public String getTellerFridayClose() {
        return tellerFridayClose;
    }

    public void setTellerFridayClose(String tellerFridayClose) {
        this.tellerFridayClose = tellerFridayClose;
    }

    public String getTellerSaturdayClose() {
        return tellerSaturdayClose;
    }

    public void setTellerSaturdayClose(String tellerSaturdayClose) {
        this.tellerSaturdayClose = tellerSaturdayClose;
    }

    public String getTellerSundayClose() {
        return tellerSundayClose;
    }

    public void setTellerSundayClose(String tellerSundayClose) {
        this.tellerSundayClose = tellerSundayClose;
    }

    public String getTellerMondayOpen() {
        return tellerMondayOpen;
    }

    public void setTellerMondayOpen(String tellerMondayOpen) {
        this.tellerMondayOpen = tellerMondayOpen;
    }

    public String getTellerTuesdayOpen() {
        return tellerTuesdayOpen;
    }

    public void setTellerTuesdayOpen(String tellerTuesdayOpen) {
        this.tellerTuesdayOpen = tellerTuesdayOpen;
    }

    public String getTellerWednesdayOpen() {
        return tellerWednesdayOpen;
    }

    public void setTellerWednesdayOpen(String tellerWednesdayOpen) {
        this.tellerWednesdayOpen = tellerWednesdayOpen;
    }

    public String getTellerThursdayOpen() {
        return tellerThursdayOpen;
    }

    public void setTellerThursdayOpen(String tellerThursdayOpen) {
        this.tellerThursdayOpen = tellerThursdayOpen;
    }

    public String getTellerFridayOpen() {
        return tellerFridayOpen;
    }

    public void setTellerFridayOpen(String tellerFridayOpen) {
        this.tellerFridayOpen = tellerFridayOpen;
    }

    public String getTellerSaturdayOpen() {
        return tellerSaturdayOpen;
    }

    public void setTellerSaturdayOpen(String tellerSaturdayOpen) {
        this.tellerSaturdayOpen = tellerSaturdayOpen;
    }

    public String getTellerSundayOpen() {
        return tellerSundayOpen;
    }

    public void setTellerSundayOpen(String tellerSundayOpen) {
        this.tellerSundayOpen = tellerSundayOpen;
    }

    public Boolean getGeneratorAvailable() {
        return generatorAvailable;
    }

    public void setGeneratorAvailable(Boolean generatorAvailable) {
        this.generatorAvailable = generatorAvailable;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCallCentreNumber() {
        return callCentreNumber;
    }

    public void setCallCentreNumber(String callCentreNumber) {
        this.callCentreNumber = callCentreNumber;
    }

    public Boolean getTellersInBranch() {
        return tellersInBranch;
    }

    public void setTellersInBranch(Boolean tellersInBranch) {
        this.tellersInBranch = tellersInBranch;
    }

    public Boolean getWifiAvailable() {
        return wifiAvailable;
    }

    public void setWifiAvailable(Boolean wifiAvailable) {
        this.wifiAvailable = wifiAvailable;
    }

    public Boolean getEBanker() {
        return eBanker;
    }

    public void setEBanker(Boolean eBanker) {
        this.eBanker = eBanker;
    }

    public Boolean getSmartIdCapable() {
        return smartIdCapable;
    }

    public void setSmartIdCapable(Boolean smartIdCapable) {
        this.smartIdCapable = smartIdCapable;
    }

    public Boolean getCardDeliverAvailable() {
        return cardDeliverAvailable;
    }

    public void setCardDeliverAvailable(Boolean cardDeliverAvailable) {
        this.cardDeliverAvailable = cardDeliverAvailable;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getBranchRevamp() {
        return branchRevamp;
    }

    public void setBranchRevamp(Boolean branchRevamp) {
        this.branchRevamp = branchRevamp;
    }

    public List<Object> getQueueZones() {
        return queueZones;
    }

    public void setQueueZones(List<Object> queueZones) {
        this.queueZones = queueZones;
    }

}
