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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CabinetSuppliesQueryRestriction
 */
@JsonPropertyOrder({
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_CLIMATE_RELEVANT,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_POWER_CONSUMPTION,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_POWER_CONSUMPTION_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_DIMENSION_WIDTH_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_PLAN_STATUS,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_WEIGHT,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_WEIGHT_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_REMARK,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_ELID,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_DIMENSION_DEPTH_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_DIMENSION_HEIGHT_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_C_INVENTORY_NO,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_CLIMATE_CAPACITY_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_LAST_SEEN,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_TYPE_ELID,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_C_LABEL_MISSING,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_ID,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_HEAT_EMISSION,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_HEAT_EMISSION_SPC,
  CabinetSuppliesQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CabinetSuppliesQueryRestriction {
  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private RestrictionsBoolean climateRelevant;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private RestrictionsNumeric powerConsumption;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private RestrictionsString powerSwitchingStatus;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION_SPC = "powerConsumptionSpc";
  private RestrictionsNumeric powerConsumptionSpc;

  public static final String JSON_PROPERTY_DIMENSION_WIDTH_SPC = "dimensionWidthSpc";
  private RestrictionsNumeric dimensionWidthSpc;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private RestrictionsString planStatus;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private RestrictionsNumeric weight;

  public static final String JSON_PROPERTY_WEIGHT_SPC = "weightSpc";
  private RestrictionsNumeric weightSpc;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_DIMENSION_DEPTH_SPC = "dimensionDepthSpc";
  private RestrictionsNumeric dimensionDepthSpc;

  public static final String JSON_PROPERTY_DIMENSION_HEIGHT_SPC = "dimensionHeightSpc";
  private RestrictionsNumeric dimensionHeightSpc;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private RestrictionsString cInventoryNo;

  public static final String JSON_PROPERTY_CLIMATE_CAPACITY_SPC = "climateCapacitySpc";
  private RestrictionsNumeric climateCapacitySpc;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private RestrictionsDate lastSeen;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_C_LABEL_MISSING = "cLabelMissing";
  private RestrictionsString cLabelMissing;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private RestrictionsNumeric heatEmission;

  public static final String JSON_PROPERTY_HEAT_EMISSION_SPC = "heatEmissionSpc";
  private RestrictionsNumeric heatEmissionSpc;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public CabinetSuppliesQueryRestriction() {
  }

  public CabinetSuppliesQueryRestriction climateRelevant(RestrictionsBoolean climateRelevant) {
    
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

  public RestrictionsBoolean getClimateRelevant() {
    return climateRelevant;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateRelevant(RestrictionsBoolean climateRelevant) {
    this.climateRelevant = climateRelevant;
  }


  public CabinetSuppliesQueryRestriction powerConsumption(RestrictionsNumeric powerConsumption) {
    
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

  public RestrictionsNumeric getPowerConsumption() {
    return powerConsumption;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumption(RestrictionsNumeric powerConsumption) {
    this.powerConsumption = powerConsumption;
  }


  public CabinetSuppliesQueryRestriction powerSwitchingStatus(RestrictionsString powerSwitchingStatus) {
    
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

  public RestrictionsString getPowerSwitchingStatus() {
    return powerSwitchingStatus;
  }


  @JsonProperty(JSON_PROPERTY_POWER_SWITCHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerSwitchingStatus(RestrictionsString powerSwitchingStatus) {
    this.powerSwitchingStatus = powerSwitchingStatus;
  }


  public CabinetSuppliesQueryRestriction powerConsumptionSpc(RestrictionsNumeric powerConsumptionSpc) {
    
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

  public RestrictionsNumeric getPowerConsumptionSpc() {
    return powerConsumptionSpc;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumptionSpc(RestrictionsNumeric powerConsumptionSpc) {
    this.powerConsumptionSpc = powerConsumptionSpc;
  }


  public CabinetSuppliesQueryRestriction dimensionWidthSpc(RestrictionsNumeric dimensionWidthSpc) {
    
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

  public RestrictionsNumeric getDimensionWidthSpc() {
    return dimensionWidthSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionWidthSpc(RestrictionsNumeric dimensionWidthSpc) {
    this.dimensionWidthSpc = dimensionWidthSpc;
  }


  public CabinetSuppliesQueryRestriction planStatus(RestrictionsString planStatus) {
    
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

  public RestrictionsString getPlanStatus() {
    return planStatus;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanStatus(RestrictionsString planStatus) {
    this.planStatus = planStatus;
  }


  public CabinetSuppliesQueryRestriction weight(RestrictionsNumeric weight) {
    
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

  public RestrictionsNumeric getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(RestrictionsNumeric weight) {
    this.weight = weight;
  }


  public CabinetSuppliesQueryRestriction weightSpc(RestrictionsNumeric weightSpc) {
    
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

  public RestrictionsNumeric getWeightSpc() {
    return weightSpc;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightSpc(RestrictionsNumeric weightSpc) {
    this.weightSpc = weightSpc;
  }


  public CabinetSuppliesQueryRestriction remark(RestrictionsString remark) {
    
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

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public CabinetSuppliesQueryRestriction elid(RestrictionsString elid) {
    
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

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public CabinetSuppliesQueryRestriction dimensionDepthSpc(RestrictionsNumeric dimensionDepthSpc) {
    
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

  public RestrictionsNumeric getDimensionDepthSpc() {
    return dimensionDepthSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionDepthSpc(RestrictionsNumeric dimensionDepthSpc) {
    this.dimensionDepthSpc = dimensionDepthSpc;
  }


  public CabinetSuppliesQueryRestriction dimensionHeightSpc(RestrictionsNumeric dimensionHeightSpc) {
    
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

  public RestrictionsNumeric getDimensionHeightSpc() {
    return dimensionHeightSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionHeightSpc(RestrictionsNumeric dimensionHeightSpc) {
    this.dimensionHeightSpc = dimensionHeightSpc;
  }


  public CabinetSuppliesQueryRestriction cInventoryNo(RestrictionsString cInventoryNo) {
    
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

  public RestrictionsString getcInventoryNo() {
    return cInventoryNo;
  }


  @JsonProperty(JSON_PROPERTY_C_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcInventoryNo(RestrictionsString cInventoryNo) {
    this.cInventoryNo = cInventoryNo;
  }


  public CabinetSuppliesQueryRestriction climateCapacitySpc(RestrictionsNumeric climateCapacitySpc) {
    
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

  public RestrictionsNumeric getClimateCapacitySpc() {
    return climateCapacitySpc;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateCapacitySpc(RestrictionsNumeric climateCapacitySpc) {
    this.climateCapacitySpc = climateCapacitySpc;
  }


  public CabinetSuppliesQueryRestriction lastSeen(RestrictionsDate lastSeen) {
    
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

  public RestrictionsDate getLastSeen() {
    return lastSeen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeen(RestrictionsDate lastSeen) {
    this.lastSeen = lastSeen;
  }


  public CabinetSuppliesQueryRestriction typeElid(RestrictionsString typeElid) {
    
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

  public RestrictionsString getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(RestrictionsString typeElid) {
    this.typeElid = typeElid;
  }


  public CabinetSuppliesQueryRestriction cLabelMissing(RestrictionsString cLabelMissing) {
    
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

  public RestrictionsString getcLabelMissing() {
    return cLabelMissing;
  }


  @JsonProperty(JSON_PROPERTY_C_LABEL_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLabelMissing(RestrictionsString cLabelMissing) {
    this.cLabelMissing = cLabelMissing;
  }


  public CabinetSuppliesQueryRestriction visibleId(RestrictionsString visibleId) {
    
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

  public RestrictionsString getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(RestrictionsString visibleId) {
    this.visibleId = visibleId;
  }


  public CabinetSuppliesQueryRestriction id(RestrictionsString id) {
    
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

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public CabinetSuppliesQueryRestriction heatEmission(RestrictionsNumeric heatEmission) {
    
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

  public RestrictionsNumeric getHeatEmission() {
    return heatEmission;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmission(RestrictionsNumeric heatEmission) {
    this.heatEmission = heatEmission;
  }


  public CabinetSuppliesQueryRestriction heatEmissionSpc(RestrictionsNumeric heatEmissionSpc) {
    
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

  public RestrictionsNumeric getHeatEmissionSpc() {
    return heatEmissionSpc;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmissionSpc(RestrictionsNumeric heatEmissionSpc) {
    this.heatEmissionSpc = heatEmissionSpc;
  }


  public CabinetSuppliesQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CabinetSuppliesQueryRestriction cabinetSuppliesQueryRestriction = (CabinetSuppliesQueryRestriction) o;
    return Objects.equals(this.climateRelevant, cabinetSuppliesQueryRestriction.climateRelevant) &&
        Objects.equals(this.powerConsumption, cabinetSuppliesQueryRestriction.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, cabinetSuppliesQueryRestriction.powerSwitchingStatus) &&
        Objects.equals(this.powerConsumptionSpc, cabinetSuppliesQueryRestriction.powerConsumptionSpc) &&
        Objects.equals(this.dimensionWidthSpc, cabinetSuppliesQueryRestriction.dimensionWidthSpc) &&
        Objects.equals(this.planStatus, cabinetSuppliesQueryRestriction.planStatus) &&
        Objects.equals(this.weight, cabinetSuppliesQueryRestriction.weight) &&
        Objects.equals(this.weightSpc, cabinetSuppliesQueryRestriction.weightSpc) &&
        Objects.equals(this.remark, cabinetSuppliesQueryRestriction.remark) &&
        Objects.equals(this.elid, cabinetSuppliesQueryRestriction.elid) &&
        Objects.equals(this.dimensionDepthSpc, cabinetSuppliesQueryRestriction.dimensionDepthSpc) &&
        Objects.equals(this.dimensionHeightSpc, cabinetSuppliesQueryRestriction.dimensionHeightSpc) &&
        Objects.equals(this.cInventoryNo, cabinetSuppliesQueryRestriction.cInventoryNo) &&
        Objects.equals(this.climateCapacitySpc, cabinetSuppliesQueryRestriction.climateCapacitySpc) &&
        Objects.equals(this.lastSeen, cabinetSuppliesQueryRestriction.lastSeen) &&
        Objects.equals(this.typeElid, cabinetSuppliesQueryRestriction.typeElid) &&
        Objects.equals(this.cLabelMissing, cabinetSuppliesQueryRestriction.cLabelMissing) &&
        Objects.equals(this.visibleId, cabinetSuppliesQueryRestriction.visibleId) &&
        Objects.equals(this.id, cabinetSuppliesQueryRestriction.id) &&
        Objects.equals(this.heatEmission, cabinetSuppliesQueryRestriction.heatEmission) &&
        Objects.equals(this.heatEmissionSpc, cabinetSuppliesQueryRestriction.heatEmissionSpc) &&
        Objects.equals(this.first, cabinetSuppliesQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(climateRelevant, powerConsumption, powerSwitchingStatus, powerConsumptionSpc, dimensionWidthSpc, planStatus, weight, weightSpc, remark, elid, dimensionDepthSpc, dimensionHeightSpc, cInventoryNo, climateCapacitySpc, lastSeen, typeElid, cLabelMissing, visibleId, id, heatEmission, heatEmissionSpc, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinetSuppliesQueryRestriction {\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    powerConsumptionSpc: ").append(toIndentedString(powerConsumptionSpc)).append("\n");
    sb.append("    dimensionWidthSpc: ").append(toIndentedString(dimensionWidthSpc)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightSpc: ").append(toIndentedString(weightSpc)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    dimensionDepthSpc: ").append(toIndentedString(dimensionDepthSpc)).append("\n");
    sb.append("    dimensionHeightSpc: ").append(toIndentedString(dimensionHeightSpc)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    climateCapacitySpc: ").append(toIndentedString(climateCapacitySpc)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    cLabelMissing: ").append(toIndentedString(cLabelMissing)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("    heatEmissionSpc: ").append(toIndentedString(heatEmissionSpc)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
