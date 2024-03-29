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
 * CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData
 */
@JsonPropertyOrder({
  CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData.JSON_PROPERTY_PORT_IDENTIFIER,
  CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData.JSON_PROPERTY_INTERFACE_ID,
  CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData.JSON_PROPERTY_INTERFACE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData {
  public static final String JSON_PROPERTY_PORT_IDENTIFIER = "portIdentifier";
  private String portIdentifier;

  public static final String JSON_PROPERTY_INTERFACE_ID = "interfaceId";
  private String interfaceId;

  public static final String JSON_PROPERTY_INTERFACE_NAME = "interfaceName";
  private String interfaceName;

  public CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData() {
  }

  public CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData portIdentifier(String portIdentifier) {
    
    this.portIdentifier = portIdentifier;
    return this;
  }

   /**
   * Get portIdentifier
   * @return portIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortIdentifier() {
    return portIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortIdentifier(String portIdentifier) {
    this.portIdentifier = portIdentifier;
  }


  public CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData interfaceId(String interfaceId) {
    
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


  public CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData interfaceName(String interfaceName) {
    
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
    CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData createViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData = (CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData) o;
    return Objects.equals(this.portIdentifier, createViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData.portIdentifier) &&
        Objects.equals(this.interfaceId, createViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData.interfaceId) &&
        Objects.equals(this.interfaceName, createViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData.interfaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portIdentifier, interfaceId, interfaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateViaNetrangeIpv4AddressCreateLinkPhysicalPortDataRequestData {\n");
    sb.append("    portIdentifier: ").append(toIndentedString(portIdentifier)).append("\n");
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

