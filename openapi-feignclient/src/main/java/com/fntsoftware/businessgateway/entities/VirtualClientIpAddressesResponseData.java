/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240226111547
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
import com.fntsoftware.businessgateway.entities.InterfaceinterfaceWithAddressData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VirtualClientIpAddressesResponseData
 */
@JsonPropertyOrder({
  VirtualClientIpAddressesResponseData.JSON_PROPERTY_INTERFACE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class VirtualClientIpAddressesResponseData {
  public static final String JSON_PROPERTY_INTERFACE = "interface";
  private InterfaceinterfaceWithAddressData _interface;

  public VirtualClientIpAddressesResponseData() {
  }

  public VirtualClientIpAddressesResponseData _interface(InterfaceinterfaceWithAddressData _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterfaceinterfaceWithAddressData getInterface() {
    return _interface;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterface(InterfaceinterfaceWithAddressData _interface) {
    this._interface = _interface;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualClientIpAddressesResponseData virtualClientIpAddressesResponseData = (VirtualClientIpAddressesResponseData) o;
    return Objects.equals(this._interface, virtualClientIpAddressesResponseData._interface);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_interface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualClientIpAddressesResponseData {\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
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
