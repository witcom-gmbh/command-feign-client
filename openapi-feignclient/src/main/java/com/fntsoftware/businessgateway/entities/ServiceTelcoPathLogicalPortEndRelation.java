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
 * ServiceTelcoPathLogicalPortEndRelation
 */
@JsonPropertyOrder({
  ServiceTelcoPathLogicalPortEndRelation.JSON_PROPERTY_PREFER_OUTPUT_PORT,
  ServiceTelcoPathLogicalPortEndRelation.JSON_PROPERTY_LINK_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServiceTelcoPathLogicalPortEndRelation {
  public static final String JSON_PROPERTY_PREFER_OUTPUT_PORT = "preferOutputPort";
  private Boolean preferOutputPort;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public ServiceTelcoPathLogicalPortEndRelation() {
  }

  public ServiceTelcoPathLogicalPortEndRelation preferOutputPort(Boolean preferOutputPort) {
    
    this.preferOutputPort = preferOutputPort;
    return this;
  }

   /**
   * Get preferOutputPort
   * @return preferOutputPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFER_OUTPUT_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreferOutputPort() {
    return preferOutputPort;
  }


  @JsonProperty(JSON_PROPERTY_PREFER_OUTPUT_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferOutputPort(Boolean preferOutputPort) {
    this.preferOutputPort = preferOutputPort;
  }


  public ServiceTelcoPathLogicalPortEndRelation linkElid(String linkElid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTelcoPathLogicalPortEndRelation serviceTelcoPathLogicalPortEndRelation = (ServiceTelcoPathLogicalPortEndRelation) o;
    return Objects.equals(this.preferOutputPort, serviceTelcoPathLogicalPortEndRelation.preferOutputPort) &&
        Objects.equals(this.linkElid, serviceTelcoPathLogicalPortEndRelation.linkElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferOutputPort, linkElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoPathLogicalPortEndRelation {\n");
    sb.append("    preferOutputPort: ").append(toIndentedString(preferOutputPort)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
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
