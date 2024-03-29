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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServerBaseIpv4NetworksRelationRestriction
 */
@JsonPropertyOrder({
  ServerBaseIpv4NetworksRelationRestriction.JSON_PROPERTY_LINK_ELID,
  ServerBaseIpv4NetworksRelationRestriction.JSON_PROPERTY_PORT_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ServerBaseIpv4NetworksRelationRestriction {
  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private RestrictionsString linkElid;

  public static final String JSON_PROPERTY_PORT_NAME = "portName";
  private RestrictionsString portName;

  public ServerBaseIpv4NetworksRelationRestriction() {
  }

  public ServerBaseIpv4NetworksRelationRestriction linkElid(RestrictionsString linkElid) {
    
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

  public RestrictionsString getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(RestrictionsString linkElid) {
    this.linkElid = linkElid;
  }


  public ServerBaseIpv4NetworksRelationRestriction portName(RestrictionsString portName) {
    
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

  public RestrictionsString getPortName() {
    return portName;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortName(RestrictionsString portName) {
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
    ServerBaseIpv4NetworksRelationRestriction serverBaseIpv4NetworksRelationRestriction = (ServerBaseIpv4NetworksRelationRestriction) o;
    return Objects.equals(this.linkElid, serverBaseIpv4NetworksRelationRestriction.linkElid) &&
        Objects.equals(this.portName, serverBaseIpv4NetworksRelationRestriction.portName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkElid, portName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerBaseIpv4NetworksRelationRestriction {\n");
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

