/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131110751
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fntsoftware.businessgateway.entities;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PowerDistributorSystemQueryResponseData
 */
@JsonPropertyOrder({
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_BATTERY_BRIDGING_TIME,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_C_GEO_LONGITUDE,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_POWER_CONSUMPTION_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_PLAN_STATUS,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_WEIGHT_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_REMARK,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_DISTRIBUTION_SYSTEM_MODEL,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_C_INVENTORY_NO,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_ID,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_HEAT_EMISSION_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_C_REFERENCE_T1,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_CLIMATE_RELEVANT,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_POWER_CONSUMPTION,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_C_REFERENCE_V1,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_CHECK_CLIMATE_THRESHOLD,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_DIMENSION_WIDTH_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_HOST_ID,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_WEIGHT,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_ELID,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_SERIAL_NO,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_DIMENSION_DEPTH_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_DIMENSION_HEIGHT_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_CLIMATE_CAPACITY_OVERALL,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_CLIMATE_CAPACITY_SPC,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_LAST_SEEN,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_CLIMATE_CAPACITY,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_TYPE_ELID,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_C_GEO_LATITUDE,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_C_LABEL_MISSING,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_CHECK_WEIGHT_THRESHOLD,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_VISIBLE_ID,
  PowerDistributorSystemQueryResponseData.JSON_PROPERTY_HEAT_EMISSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PowerDistributorSystemQueryResponseData {
  public static final String JSON_PROPERTY_BATTERY_BRIDGING_TIME = "batteryBridgingTime";
  private BigDecimal batteryBridgingTime;

  public static final String JSON_PROPERTY_C_GEO_LONGITUDE = "cGeoLongitude";
  private BigDecimal cGeoLongitude;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION_SPC = "powerConsumptionSpc";
  private BigDecimal powerConsumptionSpc;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private String planStatus;

  public static final String JSON_PROPERTY_WEIGHT_SPC = "weightSpc";
  private BigDecimal weightSpc;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_DISTRIBUTION_SYSTEM_MODEL = "distributionSystemModel";
  private String distributionSystemModel;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private String cInventoryNo;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_HEAT_EMISSION_SPC = "heatEmissionSpc";
  private BigDecimal heatEmissionSpc;

  public static final String JSON_PROPERTY_C_REFERENCE_T1 = "cReferenceT1";
  private String cReferenceT1;

  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private Boolean climateRelevant;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private BigDecimal powerConsumption;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private String powerSwitchingStatus;

  public static final String JSON_PROPERTY_C_REFERENCE_V1 = "cReferenceV1";
  private String cReferenceV1;

  public static final String JSON_PROPERTY_CHECK_CLIMATE_THRESHOLD = "checkClimateThreshold";
  private Boolean checkClimateThreshold;

  public static final String JSON_PROPERTY_DIMENSION_WIDTH_SPC = "dimensionWidthSpc";
  private BigDecimal dimensionWidthSpc;

  public static final String JSON_PROPERTY_HOST_ID = "hostId";
  private String hostId;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private String serialNo;

  public static final String JSON_PROPERTY_DIMENSION_DEPTH_SPC = "dimensionDepthSpc";
  private BigDecimal dimensionDepthSpc;

  public static final String JSON_PROPERTY_DIMENSION_HEIGHT_SPC = "dimensionHeightSpc";
  private BigDecimal dimensionHeightSpc;

  public static final String JSON_PROPERTY_CLIMATE_CAPACITY_OVERALL = "climateCapacityOverall";
  private BigDecimal climateCapacityOverall;

  public static final String JSON_PROPERTY_CLIMATE_CAPACITY_SPC = "climateCapacitySpc";
  private BigDecimal climateCapacitySpc;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private DateTime lastSeen;

  public static final String JSON_PROPERTY_CLIMATE_CAPACITY = "climateCapacity";
  private BigDecimal climateCapacity;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_C_GEO_LATITUDE = "cGeoLatitude";
  private BigDecimal cGeoLatitude;

  public static final String JSON_PROPERTY_C_LABEL_MISSING = "cLabelMissing";
  private String cLabelMissing;

  public static final String JSON_PROPERTY_CHECK_WEIGHT_THRESHOLD = "checkWeightThreshold";
  private Boolean checkWeightThreshold;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private BigDecimal heatEmission;

  public PowerDistributorSystemQueryResponseData() {
  }

  public PowerDistributorSystemQueryResponseData batteryBridgingTime(BigDecimal batteryBridgingTime) {
    
    this.batteryBridgingTime = batteryBridgingTime;
    return this;
  }

   /**
   * Get batteryBridgingTime
   * @return batteryBridgingTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATTERY_BRIDGING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBatteryBridgingTime() {
    return batteryBridgingTime;
  }


  @JsonProperty(JSON_PROPERTY_BATTERY_BRIDGING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatteryBridgingTime(BigDecimal batteryBridgingTime) {
    this.batteryBridgingTime = batteryBridgingTime;
  }


  public PowerDistributorSystemQueryResponseData cGeoLongitude(BigDecimal cGeoLongitude) {
    
    this.cGeoLongitude = cGeoLongitude;
    return this;
  }

   /**
   * Get cGeoLongitude
   * @return cGeoLongitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_GEO_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getcGeoLongitude() {
    return cGeoLongitude;
  }


  @JsonProperty(JSON_PROPERTY_C_GEO_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcGeoLongitude(BigDecimal cGeoLongitude) {
    this.cGeoLongitude = cGeoLongitude;
  }


  public PowerDistributorSystemQueryResponseData powerConsumptionSpc(BigDecimal powerConsumptionSpc) {
    
    this.powerConsumptionSpc = powerConsumptionSpc;
    return this;
  }

   /**
   * Get powerConsumptionSpc
   * @return powerConsumptionSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPowerConsumptionSpc() {
    return powerConsumptionSpc;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumptionSpc(BigDecimal powerConsumptionSpc) {
    this.powerConsumptionSpc = powerConsumptionSpc;
  }


  public PowerDistributorSystemQueryResponseData planStatus(String planStatus) {
    
    this.planStatus = planStatus;
    return this;
  }

   /**
   * Get planStatus
   * @return planStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanStatus() {
    return planStatus;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanStatus(String planStatus) {
    this.planStatus = planStatus;
  }


  public PowerDistributorSystemQueryResponseData weightSpc(BigDecimal weightSpc) {
    
    this.weightSpc = weightSpc;
    return this;
  }

   /**
   * Get weightSpc
   * @return weightSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeightSpc() {
    return weightSpc;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightSpc(BigDecimal weightSpc) {
    this.weightSpc = weightSpc;
  }


  public PowerDistributorSystemQueryResponseData remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public PowerDistributorSystemQueryResponseData distributionSystemModel(String distributionSystemModel) {
    
    this.distributionSystemModel = distributionSystemModel;
    return this;
  }

   /**
   * Get distributionSystemModel
   * @return distributionSystemModel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_SYSTEM_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDistributionSystemModel() {
    return distributionSystemModel;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_SYSTEM_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributionSystemModel(String distributionSystemModel) {
    this.distributionSystemModel = distributionSystemModel;
  }


  public PowerDistributorSystemQueryResponseData cInventoryNo(String cInventoryNo) {
    
    this.cInventoryNo = cInventoryNo;
    return this;
  }

   /**
   * Get cInventoryNo
   * @return cInventoryNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcInventoryNo() {
    return cInventoryNo;
  }


  @JsonProperty(JSON_PROPERTY_C_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcInventoryNo(String cInventoryNo) {
    this.cInventoryNo = cInventoryNo;
  }


  public PowerDistributorSystemQueryResponseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PowerDistributorSystemQueryResponseData heatEmissionSpc(BigDecimal heatEmissionSpc) {
    
    this.heatEmissionSpc = heatEmissionSpc;
    return this;
  }

   /**
   * Get heatEmissionSpc
   * @return heatEmissionSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeatEmissionSpc() {
    return heatEmissionSpc;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmissionSpc(BigDecimal heatEmissionSpc) {
    this.heatEmissionSpc = heatEmissionSpc;
  }


  public PowerDistributorSystemQueryResponseData cReferenceT1(String cReferenceT1) {
    
    this.cReferenceT1 = cReferenceT1;
    return this;
  }

   /**
   * Get cReferenceT1
   * @return cReferenceT1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcReferenceT1() {
    return cReferenceT1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReferenceT1(String cReferenceT1) {
    this.cReferenceT1 = cReferenceT1;
  }


  public PowerDistributorSystemQueryResponseData climateRelevant(Boolean climateRelevant) {
    
    this.climateRelevant = climateRelevant;
    return this;
  }

   /**
   * Get climateRelevant
   * @return climateRelevant
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIMATE_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getClimateRelevant() {
    return climateRelevant;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateRelevant(Boolean climateRelevant) {
    this.climateRelevant = climateRelevant;
  }


  public PowerDistributorSystemQueryResponseData powerConsumption(BigDecimal powerConsumption) {
    
    this.powerConsumption = powerConsumption;
    return this;
  }

   /**
   * Get powerConsumption
   * @return powerConsumption
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPowerConsumption() {
    return powerConsumption;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumption(BigDecimal powerConsumption) {
    this.powerConsumption = powerConsumption;
  }


  public PowerDistributorSystemQueryResponseData powerSwitchingStatus(String powerSwitchingStatus) {
    
    this.powerSwitchingStatus = powerSwitchingStatus;
    return this;
  }

   /**
   * Get powerSwitchingStatus
   * @return powerSwitchingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_SWITCHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPowerSwitchingStatus() {
    return powerSwitchingStatus;
  }


  @JsonProperty(JSON_PROPERTY_POWER_SWITCHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerSwitchingStatus(String powerSwitchingStatus) {
    this.powerSwitchingStatus = powerSwitchingStatus;
  }


  public PowerDistributorSystemQueryResponseData cReferenceV1(String cReferenceV1) {
    
    this.cReferenceV1 = cReferenceV1;
    return this;
  }

   /**
   * Get cReferenceV1
   * @return cReferenceV1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcReferenceV1() {
    return cReferenceV1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReferenceV1(String cReferenceV1) {
    this.cReferenceV1 = cReferenceV1;
  }


  public PowerDistributorSystemQueryResponseData checkClimateThreshold(Boolean checkClimateThreshold) {
    
    this.checkClimateThreshold = checkClimateThreshold;
    return this;
  }

   /**
   * Get checkClimateThreshold
   * @return checkClimateThreshold
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_CLIMATE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCheckClimateThreshold() {
    return checkClimateThreshold;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_CLIMATE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckClimateThreshold(Boolean checkClimateThreshold) {
    this.checkClimateThreshold = checkClimateThreshold;
  }


  public PowerDistributorSystemQueryResponseData dimensionWidthSpc(BigDecimal dimensionWidthSpc) {
    
    this.dimensionWidthSpc = dimensionWidthSpc;
    return this;
  }

   /**
   * Get dimensionWidthSpc
   * @return dimensionWidthSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDimensionWidthSpc() {
    return dimensionWidthSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionWidthSpc(BigDecimal dimensionWidthSpc) {
    this.dimensionWidthSpc = dimensionWidthSpc;
  }


  public PowerDistributorSystemQueryResponseData hostId(String hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostId() {
    return hostId;
  }


  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public PowerDistributorSystemQueryResponseData weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public PowerDistributorSystemQueryResponseData elid(String elid) {
    
    this.elid = elid;
    return this;
  }

   /**
   * Get elid
   * @return elid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  public PowerDistributorSystemQueryResponseData serialNo(String serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * Get serialNo
   * @return serialNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerialNo() {
    return serialNo;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }


  public PowerDistributorSystemQueryResponseData dimensionDepthSpc(BigDecimal dimensionDepthSpc) {
    
    this.dimensionDepthSpc = dimensionDepthSpc;
    return this;
  }

   /**
   * Get dimensionDepthSpc
   * @return dimensionDepthSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDimensionDepthSpc() {
    return dimensionDepthSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionDepthSpc(BigDecimal dimensionDepthSpc) {
    this.dimensionDepthSpc = dimensionDepthSpc;
  }


  public PowerDistributorSystemQueryResponseData dimensionHeightSpc(BigDecimal dimensionHeightSpc) {
    
    this.dimensionHeightSpc = dimensionHeightSpc;
    return this;
  }

   /**
   * Get dimensionHeightSpc
   * @return dimensionHeightSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDimensionHeightSpc() {
    return dimensionHeightSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionHeightSpc(BigDecimal dimensionHeightSpc) {
    this.dimensionHeightSpc = dimensionHeightSpc;
  }


  public PowerDistributorSystemQueryResponseData climateCapacityOverall(BigDecimal climateCapacityOverall) {
    
    this.climateCapacityOverall = climateCapacityOverall;
    return this;
  }

   /**
   * Get climateCapacityOverall
   * @return climateCapacityOverall
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_OVERALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClimateCapacityOverall() {
    return climateCapacityOverall;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_OVERALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateCapacityOverall(BigDecimal climateCapacityOverall) {
    this.climateCapacityOverall = climateCapacityOverall;
  }


  public PowerDistributorSystemQueryResponseData climateCapacitySpc(BigDecimal climateCapacitySpc) {
    
    this.climateCapacitySpc = climateCapacitySpc;
    return this;
  }

   /**
   * Get climateCapacitySpc
   * @return climateCapacitySpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClimateCapacitySpc() {
    return climateCapacitySpc;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateCapacitySpc(BigDecimal climateCapacitySpc) {
    this.climateCapacitySpc = climateCapacitySpc;
  }


  public PowerDistributorSystemQueryResponseData lastSeen(DateTime lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getLastSeen() {
    return lastSeen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeen(DateTime lastSeen) {
    this.lastSeen = lastSeen;
  }


  public PowerDistributorSystemQueryResponseData climateCapacity(BigDecimal climateCapacity) {
    
    this.climateCapacity = climateCapacity;
    return this;
  }

   /**
   * Get climateCapacity
   * @return climateCapacity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getClimateCapacity() {
    return climateCapacity;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateCapacity(BigDecimal climateCapacity) {
    this.climateCapacity = climateCapacity;
  }


  public PowerDistributorSystemQueryResponseData typeElid(String typeElid) {
    
    this.typeElid = typeElid;
    return this;
  }

   /**
   * Get typeElid
   * @return typeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(String typeElid) {
    this.typeElid = typeElid;
  }


  public PowerDistributorSystemQueryResponseData cGeoLatitude(BigDecimal cGeoLatitude) {
    
    this.cGeoLatitude = cGeoLatitude;
    return this;
  }

   /**
   * Get cGeoLatitude
   * @return cGeoLatitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_GEO_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getcGeoLatitude() {
    return cGeoLatitude;
  }


  @JsonProperty(JSON_PROPERTY_C_GEO_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcGeoLatitude(BigDecimal cGeoLatitude) {
    this.cGeoLatitude = cGeoLatitude;
  }


  public PowerDistributorSystemQueryResponseData cLabelMissing(String cLabelMissing) {
    
    this.cLabelMissing = cLabelMissing;
    return this;
  }

   /**
   * Get cLabelMissing
   * @return cLabelMissing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_LABEL_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcLabelMissing() {
    return cLabelMissing;
  }


  @JsonProperty(JSON_PROPERTY_C_LABEL_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLabelMissing(String cLabelMissing) {
    this.cLabelMissing = cLabelMissing;
  }


  public PowerDistributorSystemQueryResponseData checkWeightThreshold(Boolean checkWeightThreshold) {
    
    this.checkWeightThreshold = checkWeightThreshold;
    return this;
  }

   /**
   * Get checkWeightThreshold
   * @return checkWeightThreshold
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_WEIGHT_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCheckWeightThreshold() {
    return checkWeightThreshold;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_WEIGHT_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckWeightThreshold(Boolean checkWeightThreshold) {
    this.checkWeightThreshold = checkWeightThreshold;
  }


  public PowerDistributorSystemQueryResponseData visibleId(String visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public PowerDistributorSystemQueryResponseData heatEmission(BigDecimal heatEmission) {
    
    this.heatEmission = heatEmission;
    return this;
  }

   /**
   * Get heatEmission
   * @return heatEmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeatEmission() {
    return heatEmission;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmission(BigDecimal heatEmission) {
    this.heatEmission = heatEmission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerDistributorSystemQueryResponseData powerDistributorSystemQueryResponseData = (PowerDistributorSystemQueryResponseData) o;
    return Objects.equals(this.batteryBridgingTime, powerDistributorSystemQueryResponseData.batteryBridgingTime) &&
        Objects.equals(this.cGeoLongitude, powerDistributorSystemQueryResponseData.cGeoLongitude) &&
        Objects.equals(this.powerConsumptionSpc, powerDistributorSystemQueryResponseData.powerConsumptionSpc) &&
        Objects.equals(this.planStatus, powerDistributorSystemQueryResponseData.planStatus) &&
        Objects.equals(this.weightSpc, powerDistributorSystemQueryResponseData.weightSpc) &&
        Objects.equals(this.remark, powerDistributorSystemQueryResponseData.remark) &&
        Objects.equals(this.distributionSystemModel, powerDistributorSystemQueryResponseData.distributionSystemModel) &&
        Objects.equals(this.cInventoryNo, powerDistributorSystemQueryResponseData.cInventoryNo) &&
        Objects.equals(this.id, powerDistributorSystemQueryResponseData.id) &&
        Objects.equals(this.heatEmissionSpc, powerDistributorSystemQueryResponseData.heatEmissionSpc) &&
        Objects.equals(this.cReferenceT1, powerDistributorSystemQueryResponseData.cReferenceT1) &&
        Objects.equals(this.climateRelevant, powerDistributorSystemQueryResponseData.climateRelevant) &&
        Objects.equals(this.powerConsumption, powerDistributorSystemQueryResponseData.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, powerDistributorSystemQueryResponseData.powerSwitchingStatus) &&
        Objects.equals(this.cReferenceV1, powerDistributorSystemQueryResponseData.cReferenceV1) &&
        Objects.equals(this.checkClimateThreshold, powerDistributorSystemQueryResponseData.checkClimateThreshold) &&
        Objects.equals(this.dimensionWidthSpc, powerDistributorSystemQueryResponseData.dimensionWidthSpc) &&
        Objects.equals(this.hostId, powerDistributorSystemQueryResponseData.hostId) &&
        Objects.equals(this.weight, powerDistributorSystemQueryResponseData.weight) &&
        Objects.equals(this.elid, powerDistributorSystemQueryResponseData.elid) &&
        Objects.equals(this.serialNo, powerDistributorSystemQueryResponseData.serialNo) &&
        Objects.equals(this.dimensionDepthSpc, powerDistributorSystemQueryResponseData.dimensionDepthSpc) &&
        Objects.equals(this.dimensionHeightSpc, powerDistributorSystemQueryResponseData.dimensionHeightSpc) &&
        Objects.equals(this.climateCapacityOverall, powerDistributorSystemQueryResponseData.climateCapacityOverall) &&
        Objects.equals(this.climateCapacitySpc, powerDistributorSystemQueryResponseData.climateCapacitySpc) &&
        Objects.equals(this.lastSeen, powerDistributorSystemQueryResponseData.lastSeen) &&
        Objects.equals(this.climateCapacity, powerDistributorSystemQueryResponseData.climateCapacity) &&
        Objects.equals(this.typeElid, powerDistributorSystemQueryResponseData.typeElid) &&
        Objects.equals(this.cGeoLatitude, powerDistributorSystemQueryResponseData.cGeoLatitude) &&
        Objects.equals(this.cLabelMissing, powerDistributorSystemQueryResponseData.cLabelMissing) &&
        Objects.equals(this.checkWeightThreshold, powerDistributorSystemQueryResponseData.checkWeightThreshold) &&
        Objects.equals(this.visibleId, powerDistributorSystemQueryResponseData.visibleId) &&
        Objects.equals(this.heatEmission, powerDistributorSystemQueryResponseData.heatEmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryBridgingTime, cGeoLongitude, powerConsumptionSpc, planStatus, weightSpc, remark, distributionSystemModel, cInventoryNo, id, heatEmissionSpc, cReferenceT1, climateRelevant, powerConsumption, powerSwitchingStatus, cReferenceV1, checkClimateThreshold, dimensionWidthSpc, hostId, weight, elid, serialNo, dimensionDepthSpc, dimensionHeightSpc, climateCapacityOverall, climateCapacitySpc, lastSeen, climateCapacity, typeElid, cGeoLatitude, cLabelMissing, checkWeightThreshold, visibleId, heatEmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerDistributorSystemQueryResponseData {\n");
    sb.append("    batteryBridgingTime: ").append(toIndentedString(batteryBridgingTime)).append("\n");
    sb.append("    cGeoLongitude: ").append(toIndentedString(cGeoLongitude)).append("\n");
    sb.append("    powerConsumptionSpc: ").append(toIndentedString(powerConsumptionSpc)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    weightSpc: ").append(toIndentedString(weightSpc)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    distributionSystemModel: ").append(toIndentedString(distributionSystemModel)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heatEmissionSpc: ").append(toIndentedString(heatEmissionSpc)).append("\n");
    sb.append("    cReferenceT1: ").append(toIndentedString(cReferenceT1)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    cReferenceV1: ").append(toIndentedString(cReferenceV1)).append("\n");
    sb.append("    checkClimateThreshold: ").append(toIndentedString(checkClimateThreshold)).append("\n");
    sb.append("    dimensionWidthSpc: ").append(toIndentedString(dimensionWidthSpc)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    dimensionDepthSpc: ").append(toIndentedString(dimensionDepthSpc)).append("\n");
    sb.append("    dimensionHeightSpc: ").append(toIndentedString(dimensionHeightSpc)).append("\n");
    sb.append("    climateCapacityOverall: ").append(toIndentedString(climateCapacityOverall)).append("\n");
    sb.append("    climateCapacitySpc: ").append(toIndentedString(climateCapacitySpc)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    climateCapacity: ").append(toIndentedString(climateCapacity)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    cGeoLatitude: ").append(toIndentedString(cGeoLatitude)).append("\n");
    sb.append("    cLabelMissing: ").append(toIndentedString(cLabelMissing)).append("\n");
    sb.append("    checkWeightThreshold: ").append(toIndentedString(checkWeightThreshold)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
