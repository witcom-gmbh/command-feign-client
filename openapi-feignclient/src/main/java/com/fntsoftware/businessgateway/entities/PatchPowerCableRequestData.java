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
import com.fntsoftware.businessgateway.entities.PatchPowerCableSwapLinkDeviceRequestData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PatchPowerCableRequestData
 */
@JsonPropertyOrder({
  PatchPowerCableRequestData.JSON_PROPERTY_SWAP_LINK_DEVICE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class PatchPowerCableRequestData {
  public static final String JSON_PROPERTY_SWAP_LINK_DEVICE = "swapLinkDevice";
  private PatchPowerCableSwapLinkDeviceRequestData swapLinkDevice;

  public PatchPowerCableRequestData() {
  }

  public PatchPowerCableRequestData swapLinkDevice(PatchPowerCableSwapLinkDeviceRequestData swapLinkDevice) {
    
    this.swapLinkDevice = swapLinkDevice;
    return this;
  }

   /**
   * Get swapLinkDevice
   * @return swapLinkDevice
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SWAP_LINK_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PatchPowerCableSwapLinkDeviceRequestData getSwapLinkDevice() {
    return swapLinkDevice;
  }


  @JsonProperty(JSON_PROPERTY_SWAP_LINK_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSwapLinkDevice(PatchPowerCableSwapLinkDeviceRequestData swapLinkDevice) {
    this.swapLinkDevice = swapLinkDevice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchPowerCableRequestData patchPowerCableRequestData = (PatchPowerCableRequestData) o;
    return Objects.equals(this.swapLinkDevice, patchPowerCableRequestData.swapLinkDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swapLinkDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchPowerCableRequestData {\n");
    sb.append("    swapLinkDevice: ").append(toIndentedString(swapLinkDevice)).append("\n");
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
