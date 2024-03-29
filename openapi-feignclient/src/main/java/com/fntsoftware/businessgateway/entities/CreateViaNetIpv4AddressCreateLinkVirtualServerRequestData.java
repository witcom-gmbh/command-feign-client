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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData
 */
@JsonPropertyOrder({
  CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData.JSON_PROPERTY_VIRTUAL_SERVER_ELID,
  CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData.JSON_PROPERTY_INTERFACE_ID,
  CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData.JSON_PROPERTY_INTERFACE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData {
  public static final String JSON_PROPERTY_VIRTUAL_SERVER_ELID = "virtualServerElid";
  private String virtualServerElid;

  public static final String JSON_PROPERTY_INTERFACE_ID = "interfaceId";
  private String interfaceId;

  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData() {
  }

  public CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData virtualServerElid(String virtualServerElid) {
    
    this.virtualServerElid = virtualServerElid;
    return this;
  }

   /**
   * Get virtualServerElid
   * @return virtualServerElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_SERVER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualServerElid() {
    return virtualServerElid;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_SERVER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualServerElid(String virtualServerElid) {
    this.virtualServerElid = virtualServerElid;
  }


  public CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData interfaceId(String interfaceId) {
    
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


  public CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData interfaceName(String interfaceName) {
    
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
    CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData createViaNetIpv4AddressCreateLinkVirtualServerRequestData = (CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData) o;
    return Objects.equals(this.virtualServerElid, createViaNetIpv4AddressCreateLinkVirtualServerRequestData.virtualServerElid) &&
        Objects.equals(this.interfaceId, createViaNetIpv4AddressCreateLinkVirtualServerRequestData.interfaceId) &&
        Objects.equals(this.interfaceName, createViaNetIpv4AddressCreateLinkVirtualServerRequestData.interfaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualServerElid, interfaceId, interfaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateViaNetIpv4AddressCreateLinkVirtualServerRequestData {\n");
    sb.append("    virtualServerElid: ").append(toIndentedString(virtualServerElid)).append("\n");
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

