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
 * DataSocketqueryExtendedScrollReturnDataItem
 */
@JsonPropertyOrder({
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_FLOOR_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_ZONE_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_POWER_CONSUMPTION_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_PLAN_STATUS,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_SYSTEM_RUNTIME,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_WEIGHT_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_CAMPUS_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_REMARK,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_EXPLANATION,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_TYPE,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_MANUFACTURER,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_FUNCTION,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_ROOM_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_ID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_HEAT_EMISSION_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_CLIMATE_RELEVANT,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_POWER_CONSUMPTION,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_DIMENSION_WIDTH_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_WEIGHT,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_DIMENSION_DEPTH_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_DIMENSION_HEIGHT_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_CLIMATE_CAPACITY_SPC,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_LAST_SEEN,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_TYPE_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_VISIBLE_ID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_BUILDING_ELID,
  DataSocketqueryExtendedScrollReturnDataItem.JSON_PROPERTY_HEAT_EMISSION
})
@JsonTypeName("dataSocketqueryExtendedScrollReturnDataItem")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DataSocketqueryExtendedScrollReturnDataItem {
  public static final String JSON_PROPERTY_FLOOR_ELID = "floorElid";
  private String floorElid;

  public static final String JSON_PROPERTY_ZONE_ELID = "zoneElid";
  private String zoneElid;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION_SPC = "powerConsumptionSpc";
  private BigDecimal powerConsumptionSpc;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private String planStatus;

  public static final String JSON_PROPERTY_SYSTEM_RUNTIME = "systemRuntime";
  private BigDecimal systemRuntime;

  public static final String JSON_PROPERTY_WEIGHT_SPC = "weightSpc";
  private BigDecimal weightSpc;

  public static final String JSON_PROPERTY_CAMPUS_ELID = "campusElid";
  private String campusElid;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_ROOM_ELID = "roomElid";
  private String roomElid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_HEAT_EMISSION_SPC = "heatEmissionSpc";
  private BigDecimal heatEmissionSpc;

  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private Boolean climateRelevant;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private BigDecimal powerConsumption;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private String powerSwitchingStatus;

  public static final String JSON_PROPERTY_DIMENSION_WIDTH_SPC = "dimensionWidthSpc";
  private BigDecimal dimensionWidthSpc;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_DIMENSION_DEPTH_SPC = "dimensionDepthSpc";
  private BigDecimal dimensionDepthSpc;

  public static final String JSON_PROPERTY_DIMENSION_HEIGHT_SPC = "dimensionHeightSpc";
  private BigDecimal dimensionHeightSpc;

  public static final String JSON_PROPERTY_CLIMATE_CAPACITY_SPC = "climateCapacitySpc";
  private BigDecimal climateCapacitySpc;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private DateTime lastSeen;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_BUILDING_ELID = "buildingElid";
  private String buildingElid;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private BigDecimal heatEmission;

  public DataSocketqueryExtendedScrollReturnDataItem() {
  }

  public DataSocketqueryExtendedScrollReturnDataItem floorElid(String floorElid) {
    
    this.floorElid = floorElid;
    return this;
  }

   /**
   * Get floorElid
   * @return floorElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOOR_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFloorElid() {
    return floorElid;
  }


  @JsonProperty(JSON_PROPERTY_FLOOR_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloorElid(String floorElid) {
    this.floorElid = floorElid;
  }


  public DataSocketqueryExtendedScrollReturnDataItem zoneElid(String zoneElid) {
    
    this.zoneElid = zoneElid;
    return this;
  }

   /**
   * Get zoneElid
   * @return zoneElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZoneElid() {
    return zoneElid;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneElid(String zoneElid) {
    this.zoneElid = zoneElid;
  }


  public DataSocketqueryExtendedScrollReturnDataItem powerConsumptionSpc(BigDecimal powerConsumptionSpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem planStatus(String planStatus) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem systemRuntime(BigDecimal systemRuntime) {
    
    this.systemRuntime = systemRuntime;
    return this;
  }

   /**
   * Get systemRuntime
   * @return systemRuntime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSystemRuntime() {
    return systemRuntime;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemRuntime(BigDecimal systemRuntime) {
    this.systemRuntime = systemRuntime;
  }


  public DataSocketqueryExtendedScrollReturnDataItem weightSpc(BigDecimal weightSpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem campusElid(String campusElid) {
    
    this.campusElid = campusElid;
    return this;
  }

   /**
   * Get campusElid
   * @return campusElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPUS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampusElid() {
    return campusElid;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampusElid(String campusElid) {
    this.campusElid = campusElid;
  }


  public DataSocketqueryExtendedScrollReturnDataItem remark(String remark) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem explanation(String explanation) {
    
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExplanation() {
    return explanation;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  public DataSocketqueryExtendedScrollReturnDataItem type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public DataSocketqueryExtendedScrollReturnDataItem manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public DataSocketqueryExtendedScrollReturnDataItem function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(String function) {
    this.function = function;
  }


  public DataSocketqueryExtendedScrollReturnDataItem roomElid(String roomElid) {
    
    this.roomElid = roomElid;
    return this;
  }

   /**
   * Get roomElid
   * @return roomElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOM_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoomElid() {
    return roomElid;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomElid(String roomElid) {
    this.roomElid = roomElid;
  }


  public DataSocketqueryExtendedScrollReturnDataItem id(String id) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem heatEmissionSpc(BigDecimal heatEmissionSpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem climateRelevant(Boolean climateRelevant) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem powerConsumption(BigDecimal powerConsumption) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem powerSwitchingStatus(String powerSwitchingStatus) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem dimensionWidthSpc(BigDecimal dimensionWidthSpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem weight(BigDecimal weight) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem elid(String elid) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem dimensionDepthSpc(BigDecimal dimensionDepthSpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem dimensionHeightSpc(BigDecimal dimensionHeightSpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem climateCapacitySpc(BigDecimal climateCapacitySpc) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem lastSeen(DateTime lastSeen) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem typeElid(String typeElid) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem visibleId(String visibleId) {
    
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


  public DataSocketqueryExtendedScrollReturnDataItem buildingElid(String buildingElid) {
    
    this.buildingElid = buildingElid;
    return this;
  }

   /**
   * Get buildingElid
   * @return buildingElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingElid() {
    return buildingElid;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingElid(String buildingElid) {
    this.buildingElid = buildingElid;
  }


  public DataSocketqueryExtendedScrollReturnDataItem heatEmission(BigDecimal heatEmission) {
    
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
    DataSocketqueryExtendedScrollReturnDataItem dataSocketqueryExtendedScrollReturnDataItem = (DataSocketqueryExtendedScrollReturnDataItem) o;
    return Objects.equals(this.floorElid, dataSocketqueryExtendedScrollReturnDataItem.floorElid) &&
        Objects.equals(this.zoneElid, dataSocketqueryExtendedScrollReturnDataItem.zoneElid) &&
        Objects.equals(this.powerConsumptionSpc, dataSocketqueryExtendedScrollReturnDataItem.powerConsumptionSpc) &&
        Objects.equals(this.planStatus, dataSocketqueryExtendedScrollReturnDataItem.planStatus) &&
        Objects.equals(this.systemRuntime, dataSocketqueryExtendedScrollReturnDataItem.systemRuntime) &&
        Objects.equals(this.weightSpc, dataSocketqueryExtendedScrollReturnDataItem.weightSpc) &&
        Objects.equals(this.campusElid, dataSocketqueryExtendedScrollReturnDataItem.campusElid) &&
        Objects.equals(this.remark, dataSocketqueryExtendedScrollReturnDataItem.remark) &&
        Objects.equals(this.explanation, dataSocketqueryExtendedScrollReturnDataItem.explanation) &&
        Objects.equals(this.type, dataSocketqueryExtendedScrollReturnDataItem.type) &&
        Objects.equals(this.manufacturer, dataSocketqueryExtendedScrollReturnDataItem.manufacturer) &&
        Objects.equals(this.function, dataSocketqueryExtendedScrollReturnDataItem.function) &&
        Objects.equals(this.roomElid, dataSocketqueryExtendedScrollReturnDataItem.roomElid) &&
        Objects.equals(this.id, dataSocketqueryExtendedScrollReturnDataItem.id) &&
        Objects.equals(this.heatEmissionSpc, dataSocketqueryExtendedScrollReturnDataItem.heatEmissionSpc) &&
        Objects.equals(this.climateRelevant, dataSocketqueryExtendedScrollReturnDataItem.climateRelevant) &&
        Objects.equals(this.powerConsumption, dataSocketqueryExtendedScrollReturnDataItem.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, dataSocketqueryExtendedScrollReturnDataItem.powerSwitchingStatus) &&
        Objects.equals(this.dimensionWidthSpc, dataSocketqueryExtendedScrollReturnDataItem.dimensionWidthSpc) &&
        Objects.equals(this.weight, dataSocketqueryExtendedScrollReturnDataItem.weight) &&
        Objects.equals(this.elid, dataSocketqueryExtendedScrollReturnDataItem.elid) &&
        Objects.equals(this.dimensionDepthSpc, dataSocketqueryExtendedScrollReturnDataItem.dimensionDepthSpc) &&
        Objects.equals(this.dimensionHeightSpc, dataSocketqueryExtendedScrollReturnDataItem.dimensionHeightSpc) &&
        Objects.equals(this.climateCapacitySpc, dataSocketqueryExtendedScrollReturnDataItem.climateCapacitySpc) &&
        Objects.equals(this.lastSeen, dataSocketqueryExtendedScrollReturnDataItem.lastSeen) &&
        Objects.equals(this.typeElid, dataSocketqueryExtendedScrollReturnDataItem.typeElid) &&
        Objects.equals(this.visibleId, dataSocketqueryExtendedScrollReturnDataItem.visibleId) &&
        Objects.equals(this.buildingElid, dataSocketqueryExtendedScrollReturnDataItem.buildingElid) &&
        Objects.equals(this.heatEmission, dataSocketqueryExtendedScrollReturnDataItem.heatEmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floorElid, zoneElid, powerConsumptionSpc, planStatus, systemRuntime, weightSpc, campusElid, remark, explanation, type, manufacturer, function, roomElid, id, heatEmissionSpc, climateRelevant, powerConsumption, powerSwitchingStatus, dimensionWidthSpc, weight, elid, dimensionDepthSpc, dimensionHeightSpc, climateCapacitySpc, lastSeen, typeElid, visibleId, buildingElid, heatEmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSocketqueryExtendedScrollReturnDataItem {\n");
    sb.append("    floorElid: ").append(toIndentedString(floorElid)).append("\n");
    sb.append("    zoneElid: ").append(toIndentedString(zoneElid)).append("\n");
    sb.append("    powerConsumptionSpc: ").append(toIndentedString(powerConsumptionSpc)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    weightSpc: ").append(toIndentedString(weightSpc)).append("\n");
    sb.append("    campusElid: ").append(toIndentedString(campusElid)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    roomElid: ").append(toIndentedString(roomElid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heatEmissionSpc: ").append(toIndentedString(heatEmissionSpc)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    dimensionWidthSpc: ").append(toIndentedString(dimensionWidthSpc)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    dimensionDepthSpc: ").append(toIndentedString(dimensionDepthSpc)).append("\n");
    sb.append("    dimensionHeightSpc: ").append(toIndentedString(dimensionHeightSpc)).append("\n");
    sb.append("    climateCapacitySpc: ").append(toIndentedString(climateCapacitySpc)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    buildingElid: ").append(toIndentedString(buildingElid)).append("\n");
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
