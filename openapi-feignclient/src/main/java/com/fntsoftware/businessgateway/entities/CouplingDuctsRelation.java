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
 * CouplingDuctsRelation
 */
@JsonPropertyOrder({
  CouplingDuctsRelation.JSON_PROPERTY_ARG2,
  CouplingDuctsRelation.JSON_PROPERTY_ARG1,
  CouplingDuctsRelation.JSON_PROPERTY_LINK_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CouplingDuctsRelation {
  public static final String JSON_PROPERTY_ARG2 = "arg2";
  private String arg2;

  public static final String JSON_PROPERTY_ARG1 = "arg1";
  private String arg1;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public CouplingDuctsRelation() {
  }

  public CouplingDuctsRelation arg2(String arg2) {
    
    this.arg2 = arg2;
    return this;
  }

   /**
   * Get arg2
   * @return arg2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARG2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArg2() {
    return arg2;
  }


  @JsonProperty(JSON_PROPERTY_ARG2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArg2(String arg2) {
    this.arg2 = arg2;
  }


  public CouplingDuctsRelation arg1(String arg1) {
    
    this.arg1 = arg1;
    return this;
  }

   /**
   * Get arg1
   * @return arg1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARG1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArg1() {
    return arg1;
  }


  @JsonProperty(JSON_PROPERTY_ARG1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArg1(String arg1) {
    this.arg1 = arg1;
  }


  public CouplingDuctsRelation linkElid(String linkElid) {
    
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
    CouplingDuctsRelation couplingDuctsRelation = (CouplingDuctsRelation) o;
    return Objects.equals(this.arg2, couplingDuctsRelation.arg2) &&
        Objects.equals(this.arg1, couplingDuctsRelation.arg1) &&
        Objects.equals(this.linkElid, couplingDuctsRelation.linkElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arg2, arg1, linkElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouplingDuctsRelation {\n");
    sb.append("    arg2: ").append(toIndentedString(arg2)).append("\n");
    sb.append("    arg1: ").append(toIndentedString(arg1)).append("\n");
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
