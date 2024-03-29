/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240304133000
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceAllchassisPosition
 */
@JsonPropertyOrder({
  DeviceAllchassisPosition.JSON_PROPERTY_SLOT_NAME,
  DeviceAllchassisPosition.JSON_PROPERTY_CHASSIS_ID,
  DeviceAllchassisPosition.JSON_PROPERTY_CHASSIS_ELID,
  DeviceAllchassisPosition.JSON_PROPERTY_CHASSIS_VISIBLE_ID,
  DeviceAllchassisPosition.JSON_PROPERTY_SLOT_NO
})
@JsonTypeName("deviceAllchassisPosition")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class DeviceAllchassisPosition {
  public static final String JSON_PROPERTY_SLOT_NAME = "slotName";
  private String slotName;

  public static final String JSON_PROPERTY_CHASSIS_ID = "chassisId";
  private String chassisId;

  public static final String JSON_PROPERTY_CHASSIS_ELID = "chassisElid";
  private String chassisElid;

  public static final String JSON_PROPERTY_CHASSIS_VISIBLE_ID = "chassisVisibleId";
  private String chassisVisibleId;

  public static final String JSON_PROPERTY_SLOT_NO = "slotNo";
  private BigDecimal slotNo;

  public DeviceAllchassisPosition() {
  }

  public DeviceAllchassisPosition slotName(String slotName) {
    
    this.slotName = slotName;
    return this;
  }

   /**
   * Get slotName
   * @return slotName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlotName() {
    return slotName;
  }


  @JsonProperty(JSON_PROPERTY_SLOT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlotName(String slotName) {
    this.slotName = slotName;
  }


  public DeviceAllchassisPosition chassisId(String chassisId) {
    
    this.chassisId = chassisId;
    return this;
  }

   /**
   * Get chassisId
   * @return chassisId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHASSIS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChassisId() {
    return chassisId;
  }


  @JsonProperty(JSON_PROPERTY_CHASSIS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChassisId(String chassisId) {
    this.chassisId = chassisId;
  }


  public DeviceAllchassisPosition chassisElid(String chassisElid) {
    
    this.chassisElid = chassisElid;
    return this;
  }

   /**
   * Get chassisElid
   * @return chassisElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHASSIS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChassisElid() {
    return chassisElid;
  }


  @JsonProperty(JSON_PROPERTY_CHASSIS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChassisElid(String chassisElid) {
    this.chassisElid = chassisElid;
  }


  public DeviceAllchassisPosition chassisVisibleId(String chassisVisibleId) {
    
    this.chassisVisibleId = chassisVisibleId;
    return this;
  }

   /**
   * Get chassisVisibleId
   * @return chassisVisibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHASSIS_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChassisVisibleId() {
    return chassisVisibleId;
  }


  @JsonProperty(JSON_PROPERTY_CHASSIS_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChassisVisibleId(String chassisVisibleId) {
    this.chassisVisibleId = chassisVisibleId;
  }


  public DeviceAllchassisPosition slotNo(BigDecimal slotNo) {
    
    this.slotNo = slotNo;
    return this;
  }

   /**
   * Get slotNo
   * @return slotNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSlotNo() {
    return slotNo;
  }


  @JsonProperty(JSON_PROPERTY_SLOT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlotNo(BigDecimal slotNo) {
    this.slotNo = slotNo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAllchassisPosition deviceAllchassisPosition = (DeviceAllchassisPosition) o;
    return Objects.equals(this.slotName, deviceAllchassisPosition.slotName) &&
        Objects.equals(this.chassisId, deviceAllchassisPosition.chassisId) &&
        Objects.equals(this.chassisElid, deviceAllchassisPosition.chassisElid) &&
        Objects.equals(this.chassisVisibleId, deviceAllchassisPosition.chassisVisibleId) &&
        Objects.equals(this.slotNo, deviceAllchassisPosition.slotNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotName, chassisId, chassisElid, chassisVisibleId, slotNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAllchassisPosition {\n");
    sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
    sb.append("    chassisId: ").append(toIndentedString(chassisId)).append("\n");
    sb.append("    chassisElid: ").append(toIndentedString(chassisElid)).append("\n");
    sb.append("    chassisVisibleId: ").append(toIndentedString(chassisVisibleId)).append("\n");
    sb.append("    slotNo: ").append(toIndentedString(slotNo)).append("\n");
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

