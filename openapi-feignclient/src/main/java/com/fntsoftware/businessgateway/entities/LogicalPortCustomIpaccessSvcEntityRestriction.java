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
 * LogicalPortCustomIpaccessSvcEntityRestriction
 */
@JsonPropertyOrder({
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_REFERENCET1,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_BANDWIDTH,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_REMARK,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_ID,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_TECHNOLOGY,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_ELID,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_REFERENCEV1,
  LogicalPortCustomIpaccessSvcEntityRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class LogicalPortCustomIpaccessSvcEntityRestriction {
  public static final String JSON_PROPERTY_REFERENCET1 = "referencet1";
  private RestrictionsString referencet1;

  public static final String JSON_PROPERTY_BANDWIDTH = "bandwidth";
  private RestrictionsString bandwidth;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_TECHNOLOGY = "technology";
  private RestrictionsString technology;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_REFERENCEV1 = "referencev1";
  private RestrictionsString referencev1;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public LogicalPortCustomIpaccessSvcEntityRestriction() {
  }

  public LogicalPortCustomIpaccessSvcEntityRestriction referencet1(RestrictionsString referencet1) {
    
    this.referencet1 = referencet1;
    return this;
  }

   /**
   * Get referencet1
   * @return referencet1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCET1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferencet1() {
    return referencet1;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCET1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferencet1(RestrictionsString referencet1) {
    this.referencet1 = referencet1;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction bandwidth(RestrictionsString bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getBandwidth() {
    return bandwidth;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidth(RestrictionsString bandwidth) {
    this.bandwidth = bandwidth;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction id(RestrictionsString id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction technology(RestrictionsString technology) {
    
    this.technology = technology;
    return this;
  }

   /**
   * Get technology
   * @return technology
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTechnology() {
    return technology;
  }


  @JsonProperty(JSON_PROPERTY_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechnology(RestrictionsString technology) {
    this.technology = technology;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction elid(RestrictionsString elid) {
    
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

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction referencev1(RestrictionsString referencev1) {
    
    this.referencev1 = referencev1;
    return this;
  }

   /**
   * Get referencev1
   * @return referencev1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCEV1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferencev1() {
    return referencev1;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCEV1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferencev1(RestrictionsString referencev1) {
    this.referencev1 = referencev1;
  }


  public LogicalPortCustomIpaccessSvcEntityRestriction status(RestrictionsString status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(RestrictionsString status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalPortCustomIpaccessSvcEntityRestriction logicalPortCustomIpaccessSvcEntityRestriction = (LogicalPortCustomIpaccessSvcEntityRestriction) o;
    return Objects.equals(this.referencet1, logicalPortCustomIpaccessSvcEntityRestriction.referencet1) &&
        Objects.equals(this.bandwidth, logicalPortCustomIpaccessSvcEntityRestriction.bandwidth) &&
        Objects.equals(this.remark, logicalPortCustomIpaccessSvcEntityRestriction.remark) &&
        Objects.equals(this.id, logicalPortCustomIpaccessSvcEntityRestriction.id) &&
        Objects.equals(this.technology, logicalPortCustomIpaccessSvcEntityRestriction.technology) &&
        Objects.equals(this.elid, logicalPortCustomIpaccessSvcEntityRestriction.elid) &&
        Objects.equals(this.referencev1, logicalPortCustomIpaccessSvcEntityRestriction.referencev1) &&
        Objects.equals(this.status, logicalPortCustomIpaccessSvcEntityRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencet1, bandwidth, remark, id, technology, elid, referencev1, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalPortCustomIpaccessSvcEntityRestriction {\n");
    sb.append("    referencet1: ").append(toIndentedString(referencet1)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    referencev1: ").append(toIndentedString(referencev1)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

