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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PduIpv4NetrangesRelation
 */
@JsonPropertyOrder({
  PduIpv4NetrangesRelation.JSON_PROPERTY_LINK_ELID,
  PduIpv4NetrangesRelation.JSON_PROPERTY_PORT_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PduIpv4NetrangesRelation {
  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public static final String JSON_PROPERTY_PORT_NAME = "portName";
  private String portName;

  public PduIpv4NetrangesRelation() {
  }

  public PduIpv4NetrangesRelation linkElid(String linkElid) {
    
    this.linkElid = linkElid;
    return this;
  }

   /**
   * Get linkElid
   * @return linkElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(String linkElid) {
    this.linkElid = linkElid;
  }


  public PduIpv4NetrangesRelation portName(String portName) {
    
    this.portName = portName;
    return this;
  }

   /**
   * Get portName
   * @return portName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortName() {
    return portName;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortName(String portName) {
    this.portName = portName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PduIpv4NetrangesRelation pduIpv4NetrangesRelation = (PduIpv4NetrangesRelation) o;
    return Objects.equals(this.linkElid, pduIpv4NetrangesRelation.linkElid) &&
        Objects.equals(this.portName, pduIpv4NetrangesRelation.portName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkElid, portName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PduIpv4NetrangesRelation {\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
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
