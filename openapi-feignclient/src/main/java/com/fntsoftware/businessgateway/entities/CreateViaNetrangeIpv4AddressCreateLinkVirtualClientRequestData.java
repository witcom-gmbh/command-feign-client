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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData
 */
@JsonPropertyOrder({
  CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData.JSON_PROPERTY_VIRTUAL_CLIENT_ELID,
  CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData.JSON_PROPERTY_INTERFACE_ID,
  CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData.JSON_PROPERTY_INTERFACE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData {
  public static final String JSON_PROPERTY_VIRTUAL_CLIENT_ELID = "virtualClientElid";
  private String virtualClientElid;

  public static final String JSON_PROPERTY_INTERFACE_ID = "interfaceId";
  private String interfaceId;

  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData() {
  }

  public CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData virtualClientElid(String virtualClientElid) {
    
    this.virtualClientElid = virtualClientElid;
    return this;
  }

   /**
   * Get virtualClientElid
   * @return virtualClientElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_CLIENT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualClientElid() {
    return virtualClientElid;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_CLIENT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualClientElid(String virtualClientElid) {
    this.virtualClientElid = virtualClientElid;
  }


  public CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData interfaceId(String interfaceId) {
    
    this.interfaceId = interfaceId;
    return this;
  }

   /**
   * Get interfaceId
   * @return interfaceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterfaceId() {
    return interfaceId;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
  }


  public CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData interfaceName(String interfaceName) {
    
    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * Get interfaceName
   * @return interfaceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterfaceName() {
    return interfaceName;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData createViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData = (CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData) o;
    return Objects.equals(this.virtualClientElid, createViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData.virtualClientElid) &&
        Objects.equals(this.interfaceId, createViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData.interfaceId) &&
        Objects.equals(this.interfaceName, createViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData.interfaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualClientElid, interfaceId, interfaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateViaNetrangeIpv4AddressCreateLinkVirtualClientRequestData {\n");
    sb.append("    virtualClientElid: ").append(toIndentedString(virtualClientElid)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
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
