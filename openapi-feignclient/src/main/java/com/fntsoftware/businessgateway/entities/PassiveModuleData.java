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
 * PassiveModuleData
 */
@JsonPropertyOrder({
  PassiveModuleData.JSON_PROPERTY_C_REFERENCE_T1,
  PassiveModuleData.JSON_PROPERTY_CLIMATE_RELEVANT,
  PassiveModuleData.JSON_PROPERTY_POWER_CONSUMPTION,
  PassiveModuleData.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  PassiveModuleData.JSON_PROPERTY_C_REFERENCE_V1,
  PassiveModuleData.JSON_PROPERTY_PLAN_STATUS,
  PassiveModuleData.JSON_PROPERTY_SYSTEM_RUNTIME,
  PassiveModuleData.JSON_PROPERTY_WEIGHT,
  PassiveModuleData.JSON_PROPERTY_REMARK,
  PassiveModuleData.JSON_PROPERTY_C_CABLESCOUTID,
  PassiveModuleData.JSON_PROPERTY_ELID,
  PassiveModuleData.JSON_PROPERTY_SERIAL_NO,
  PassiveModuleData.JSON_PROPERTY_C_INVENTORY_NO,
  PassiveModuleData.JSON_PROPERTY_LAST_SEEN,
  PassiveModuleData.JSON_PROPERTY_TYPE_ELID,
  PassiveModuleData.JSON_PROPERTY_C_LABEL_MISSING,
  PassiveModuleData.JSON_PROPERTY_VISIBLE_ID,
  PassiveModuleData.JSON_PROPERTY_ID,
  PassiveModuleData.JSON_PROPERTY_HEAT_EMISSION
})
@JsonTypeName("passiveModuleData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PassiveModuleData {
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

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private String planStatus;

  public static final String JSON_PROPERTY_SYSTEM_RUNTIME = "systemRuntime";
  private BigDecimal systemRuntime;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_C_CABLESCOUTID = "cCablescoutid";
  private String cCablescoutid;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private String serialNo;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private String cInventoryNo;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private DateTime lastSeen;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_C_LABEL_MISSING = "cLabelMissing";
  private String cLabelMissing;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private BigDecimal heatEmission;

  public PassiveModuleData() {
  }

  public PassiveModuleData cReferenceT1(String cReferenceT1) {
    
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


  public PassiveModuleData climateRelevant(Boolean climateRelevant) {
    
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


  public PassiveModuleData powerConsumption(BigDecimal powerConsumption) {
    
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


  public PassiveModuleData powerSwitchingStatus(String powerSwitchingStatus) {
    
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


  public PassiveModuleData cReferenceV1(String cReferenceV1) {
    
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


  public PassiveModuleData planStatus(String planStatus) {
    
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


  public PassiveModuleData systemRuntime(BigDecimal systemRuntime) {
    
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


  public PassiveModuleData weight(BigDecimal weight) {
    
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


  public PassiveModuleData remark(String remark) {
    
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


  public PassiveModuleData cCablescoutid(String cCablescoutid) {
    
    this.cCablescoutid = cCablescoutid;
    return this;
  }

   /**
   * Get cCablescoutid
   * @return cCablescoutid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_CABLESCOUTID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcCablescoutid() {
    return cCablescoutid;
  }


  @JsonProperty(JSON_PROPERTY_C_CABLESCOUTID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcCablescoutid(String cCablescoutid) {
    this.cCablescoutid = cCablescoutid;
  }


  public PassiveModuleData elid(String elid) {
    
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


  public PassiveModuleData serialNo(String serialNo) {
    
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


  public PassiveModuleData cInventoryNo(String cInventoryNo) {
    
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


  public PassiveModuleData lastSeen(DateTime lastSeen) {
    
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


  public PassiveModuleData typeElid(String typeElid) {
    
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


  public PassiveModuleData cLabelMissing(String cLabelMissing) {
    
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


  public PassiveModuleData visibleId(String visibleId) {
    
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


  public PassiveModuleData id(String id) {
    
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


  public PassiveModuleData heatEmission(BigDecimal heatEmission) {
    
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
    PassiveModuleData passiveModuleData = (PassiveModuleData) o;
    return Objects.equals(this.cReferenceT1, passiveModuleData.cReferenceT1) &&
        Objects.equals(this.climateRelevant, passiveModuleData.climateRelevant) &&
        Objects.equals(this.powerConsumption, passiveModuleData.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, passiveModuleData.powerSwitchingStatus) &&
        Objects.equals(this.cReferenceV1, passiveModuleData.cReferenceV1) &&
        Objects.equals(this.planStatus, passiveModuleData.planStatus) &&
        Objects.equals(this.systemRuntime, passiveModuleData.systemRuntime) &&
        Objects.equals(this.weight, passiveModuleData.weight) &&
        Objects.equals(this.remark, passiveModuleData.remark) &&
        Objects.equals(this.cCablescoutid, passiveModuleData.cCablescoutid) &&
        Objects.equals(this.elid, passiveModuleData.elid) &&
        Objects.equals(this.serialNo, passiveModuleData.serialNo) &&
        Objects.equals(this.cInventoryNo, passiveModuleData.cInventoryNo) &&
        Objects.equals(this.lastSeen, passiveModuleData.lastSeen) &&
        Objects.equals(this.typeElid, passiveModuleData.typeElid) &&
        Objects.equals(this.cLabelMissing, passiveModuleData.cLabelMissing) &&
        Objects.equals(this.visibleId, passiveModuleData.visibleId) &&
        Objects.equals(this.id, passiveModuleData.id) &&
        Objects.equals(this.heatEmission, passiveModuleData.heatEmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cReferenceT1, climateRelevant, powerConsumption, powerSwitchingStatus, cReferenceV1, planStatus, systemRuntime, weight, remark, cCablescoutid, elid, serialNo, cInventoryNo, lastSeen, typeElid, cLabelMissing, visibleId, id, heatEmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassiveModuleData {\n");
    sb.append("    cReferenceT1: ").append(toIndentedString(cReferenceT1)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    cReferenceV1: ").append(toIndentedString(cReferenceV1)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cCablescoutid: ").append(toIndentedString(cCablescoutid)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    cLabelMissing: ").append(toIndentedString(cLabelMissing)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
