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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData
 */
@JsonPropertyOrder({
  CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData.JSON_PROPERTY_PROTOCOL,
  CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData.JSON_PROPERTY_FROM_PORT,
  CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData.JSON_PROPERTY_LINK_DESCRIPTION,
  CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData.JSON_PROPERTY_TO_PORT,
  CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData {
  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public static final String JSON_PROPERTY_FROM_PORT = "fromPort";
  private BigDecimal fromPort;

  public static final String JSON_PROPERTY_LINK_DESCRIPTION = "linkDescription";
  private String linkDescription;

  public static final String JSON_PROPERTY_TO_PORT = "toPort";
  private BigDecimal toPort;

  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData() {
  }

  public CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData fromPort(BigDecimal fromPort) {
    
    this.fromPort = fromPort;
    return this;
  }

   /**
   * Get fromPort
   * @return fromPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFromPort() {
    return fromPort;
  }


  @JsonProperty(JSON_PROPERTY_FROM_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromPort(BigDecimal fromPort) {
    this.fromPort = fromPort;
  }


  public CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData linkDescription(String linkDescription) {
    
    this.linkDescription = linkDescription;
    return this;
  }

   /**
   * Get linkDescription
   * @return linkDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkDescription() {
    return linkDescription;
  }


  @JsonProperty(JSON_PROPERTY_LINK_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkDescription(String linkDescription) {
    this.linkDescription = linkDescription;
  }


  public CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData toPort(BigDecimal toPort) {
    
    this.toPort = toPort;
    return this;
  }

   /**
   * Get toPort
   * @return toPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getToPort() {
    return toPort;
  }


  @JsonProperty(JSON_PROPERTY_TO_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToPort(BigDecimal toPort) {
    this.toPort = toPort;
  }


  public CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData linkedElid(String linkedElid) {
    
    this.linkedElid = linkedElid;
    return this;
  }

   /**
   * Get linkedElid
   * @return linkedElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedElid() {
    return linkedElid;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedElid(String linkedElid) {
    this.linkedElid = linkedElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData createViaNetIpv6AddressCreateLinkIpv6AddressRequestData = (CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData) o;
    return Objects.equals(this.protocol, createViaNetIpv6AddressCreateLinkIpv6AddressRequestData.protocol) &&
        Objects.equals(this.fromPort, createViaNetIpv6AddressCreateLinkIpv6AddressRequestData.fromPort) &&
        Objects.equals(this.linkDescription, createViaNetIpv6AddressCreateLinkIpv6AddressRequestData.linkDescription) &&
        Objects.equals(this.toPort, createViaNetIpv6AddressCreateLinkIpv6AddressRequestData.toPort) &&
        Objects.equals(this.linkedElid, createViaNetIpv6AddressCreateLinkIpv6AddressRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, fromPort, linkDescription, toPort, linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateViaNetIpv6AddressCreateLinkIpv6AddressRequestData {\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
    sb.append("    linkDescription: ").append(toIndentedString(linkDescription)).append("\n");
    sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
    sb.append("    linkedElid: ").append(toIndentedString(linkedElid)).append("\n");
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
