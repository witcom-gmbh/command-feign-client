/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131102312
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
 * MoveToSlotChassisCreateLinkToSlotRequestData
 */
@JsonPropertyOrder({
  MoveToSlotChassisCreateLinkToSlotRequestData.JSON_PROPERTY_DEVICE_ALL_ELID,
  MoveToSlotChassisCreateLinkToSlotRequestData.JSON_PROPERTY_SLOT_NO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class MoveToSlotChassisCreateLinkToSlotRequestData {
  public static final String JSON_PROPERTY_DEVICE_ALL_ELID = "deviceAllElid";
  private String deviceAllElid;

  public static final String JSON_PROPERTY_SLOT_NO = "slotNo";
  private BigDecimal slotNo;

  public MoveToSlotChassisCreateLinkToSlotRequestData() {
  }

  public MoveToSlotChassisCreateLinkToSlotRequestData deviceAllElid(String deviceAllElid) {
    
    this.deviceAllElid = deviceAllElid;
    return this;
  }

   /**
   * Get deviceAllElid
   * @return deviceAllElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceAllElid() {
    return deviceAllElid;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAllElid(String deviceAllElid) {
    this.deviceAllElid = deviceAllElid;
  }


  public MoveToSlotChassisCreateLinkToSlotRequestData slotNo(BigDecimal slotNo) {
    
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
    MoveToSlotChassisCreateLinkToSlotRequestData moveToSlotChassisCreateLinkToSlotRequestData = (MoveToSlotChassisCreateLinkToSlotRequestData) o;
    return Objects.equals(this.deviceAllElid, moveToSlotChassisCreateLinkToSlotRequestData.deviceAllElid) &&
        Objects.equals(this.slotNo, moveToSlotChassisCreateLinkToSlotRequestData.slotNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceAllElid, slotNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveToSlotChassisCreateLinkToSlotRequestData {\n");
    sb.append("    deviceAllElid: ").append(toIndentedString(deviceAllElid)).append("\n");
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
