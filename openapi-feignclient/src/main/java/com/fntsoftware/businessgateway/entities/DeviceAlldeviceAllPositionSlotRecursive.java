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
import com.fntsoftware.businessgateway.entities.DeviceAlldeviceAllInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceAlldeviceAllPositionSlotRecursive
 */
@JsonPropertyOrder({
  DeviceAlldeviceAllPositionSlotRecursive.JSON_PROPERTY_SUB_DEVICES,
  DeviceAlldeviceAllPositionSlotRecursive.JSON_PROPERTY_PLAN_STATUS,
  DeviceAlldeviceAllPositionSlotRecursive.JSON_PROPERTY_SLOT_NO,
  DeviceAlldeviceAllPositionSlotRecursive.JSON_PROPERTY_DEVICE
})
@JsonTypeName("deviceAlldeviceAllPositionSlotRecursive")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class DeviceAlldeviceAllPositionSlotRecursive {
  public static final String JSON_PROPERTY_SUB_DEVICES = "subDevices";
  private List<DeviceAlldeviceAllPositionSlotRecursive> subDevices;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private String planStatus;

  public static final String JSON_PROPERTY_SLOT_NO = "slotNo";
  private BigDecimal slotNo;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private DeviceAlldeviceAllInfo device;

  public DeviceAlldeviceAllPositionSlotRecursive() {
  }

  public DeviceAlldeviceAllPositionSlotRecursive subDevices(List<DeviceAlldeviceAllPositionSlotRecursive> subDevices) {
    
    this.subDevices = subDevices;
    return this;
  }

  public DeviceAlldeviceAllPositionSlotRecursive addSubDevicesItem(DeviceAlldeviceAllPositionSlotRecursive subDevicesItem) {
    if (this.subDevices == null) {
      this.subDevices = new ArrayList<>();
    }
    this.subDevices.add(subDevicesItem);
    return this;
  }

   /**
   * Get subDevices
   * @return subDevices
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeviceAlldeviceAllPositionSlotRecursive> getSubDevices() {
    return subDevices;
  }


  @JsonProperty(JSON_PROPERTY_SUB_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubDevices(List<DeviceAlldeviceAllPositionSlotRecursive> subDevices) {
    this.subDevices = subDevices;
  }


  public DeviceAlldeviceAllPositionSlotRecursive planStatus(String planStatus) {
    
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


  public DeviceAlldeviceAllPositionSlotRecursive slotNo(BigDecimal slotNo) {
    
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


  public DeviceAlldeviceAllPositionSlotRecursive device(DeviceAlldeviceAllInfo device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeviceAlldeviceAllInfo getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(DeviceAlldeviceAllInfo device) {
    this.device = device;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAlldeviceAllPositionSlotRecursive deviceAlldeviceAllPositionSlotRecursive = (DeviceAlldeviceAllPositionSlotRecursive) o;
    return Objects.equals(this.subDevices, deviceAlldeviceAllPositionSlotRecursive.subDevices) &&
        Objects.equals(this.planStatus, deviceAlldeviceAllPositionSlotRecursive.planStatus) &&
        Objects.equals(this.slotNo, deviceAlldeviceAllPositionSlotRecursive.slotNo) &&
        Objects.equals(this.device, deviceAlldeviceAllPositionSlotRecursive.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subDevices, planStatus, slotNo, device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAlldeviceAllPositionSlotRecursive {\n");
    sb.append("    subDevices: ").append(toIndentedString(subDevices)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    slotNo: ").append(toIndentedString(slotNo)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
