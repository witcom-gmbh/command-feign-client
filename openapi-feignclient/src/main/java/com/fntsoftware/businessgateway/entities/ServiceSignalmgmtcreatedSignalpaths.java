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
 * ServiceSignalmgmtcreatedSignalpaths
 */
@JsonPropertyOrder({
  ServiceSignalmgmtcreatedSignalpaths.JSON_PROPERTY_LINK_ELID,
  ServiceSignalmgmtcreatedSignalpaths.JSON_PROPERTY_ELID
})
@JsonTypeName("serviceSignalmgmtcreatedSignalpaths")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceSignalmgmtcreatedSignalpaths {
  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public ServiceSignalmgmtcreatedSignalpaths() {
  }

  public ServiceSignalmgmtcreatedSignalpaths linkElid(String linkElid) {
    
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


  public ServiceSignalmgmtcreatedSignalpaths elid(String elid) {
    
    this.elid = elid;
    return this;
  }

   /**
   * Get elid
   * @return elid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSignalmgmtcreatedSignalpaths serviceSignalmgmtcreatedSignalpaths = (ServiceSignalmgmtcreatedSignalpaths) o;
    return Objects.equals(this.linkElid, serviceSignalmgmtcreatedSignalpaths.linkElid) &&
        Objects.equals(this.elid, serviceSignalmgmtcreatedSignalpaths.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkElid, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSignalmgmtcreatedSignalpaths {\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
