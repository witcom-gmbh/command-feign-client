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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceTelcoUnroutedPathVlansEntityRestriction
 */
@JsonPropertyOrder({
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_COLOR,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_VLAN_ID,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_VLAN_POOL_ELID,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_REMARK,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_VLAN_NAME,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_C_REFERENCE,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_TYPE,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_ELID,
  ServiceTelcoUnroutedPathVlansEntityRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServiceTelcoUnroutedPathVlansEntityRestriction {
  public static final String JSON_PROPERTY_COLOR = "color";
  private RestrictionsString color;

  public static final String JSON_PROPERTY_VLAN_ID = "vlanId";
  private RestrictionsNumeric vlanId;

  public static final String JSON_PROPERTY_VLAN_POOL_ELID = "vlanPoolElid";
  private RestrictionsString vlanPoolElid;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_VLAN_NAME = "vlanName";
  private RestrictionsString vlanName;

  public static final String JSON_PROPERTY_C_REFERENCE = "cReference";
  private RestrictionsString cReference;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public ServiceTelcoUnroutedPathVlansEntityRestriction() {
  }

  public ServiceTelcoUnroutedPathVlansEntityRestriction color(RestrictionsString color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(RestrictionsString color) {
    this.color = color;
  }


  public ServiceTelcoUnroutedPathVlansEntityRestriction vlanId(RestrictionsNumeric vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getVlanId() {
    return vlanId;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanId(RestrictionsNumeric vlanId) {
    this.vlanId = vlanId;
  }


  public ServiceTelcoUnroutedPathVlansEntityRestriction vlanPoolElid(RestrictionsString vlanPoolElid) {
    
    this.vlanPoolElid = vlanPoolElid;
    return this;
  }

   /**
   * Get vlanPoolElid
   * @return vlanPoolElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_POOL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVlanPoolElid() {
    return vlanPoolElid;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_POOL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanPoolElid(RestrictionsString vlanPoolElid) {
    this.vlanPoolElid = vlanPoolElid;
  }


  public ServiceTelcoUnroutedPathVlansEntityRestriction remark(RestrictionsString remark) {
    
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


  public ServiceTelcoUnroutedPathVlansEntityRestriction vlanName(RestrictionsString vlanName) {
    
    this.vlanName = vlanName;
    return this;
  }

   /**
   * Get vlanName
   * @return vlanName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVlanName() {
    return vlanName;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanName(RestrictionsString vlanName) {
    this.vlanName = vlanName;
  }


  public ServiceTelcoUnroutedPathVlansEntityRestriction cReference(RestrictionsString cReference) {
    
    this.cReference = cReference;
    return this;
  }

   /**
   * Get cReference
   * @return cReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcReference() {
    return cReference;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReference(RestrictionsString cReference) {
    this.cReference = cReference;
  }


  public ServiceTelcoUnroutedPathVlansEntityRestriction type(RestrictionsString type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RestrictionsString type) {
    this.type = type;
  }


  public ServiceTelcoUnroutedPathVlansEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServiceTelcoUnroutedPathVlansEntityRestriction status(RestrictionsString status) {
    
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
    ServiceTelcoUnroutedPathVlansEntityRestriction serviceTelcoUnroutedPathVlansEntityRestriction = (ServiceTelcoUnroutedPathVlansEntityRestriction) o;
    return Objects.equals(this.color, serviceTelcoUnroutedPathVlansEntityRestriction.color) &&
        Objects.equals(this.vlanId, serviceTelcoUnroutedPathVlansEntityRestriction.vlanId) &&
        Objects.equals(this.vlanPoolElid, serviceTelcoUnroutedPathVlansEntityRestriction.vlanPoolElid) &&
        Objects.equals(this.remark, serviceTelcoUnroutedPathVlansEntityRestriction.remark) &&
        Objects.equals(this.vlanName, serviceTelcoUnroutedPathVlansEntityRestriction.vlanName) &&
        Objects.equals(this.cReference, serviceTelcoUnroutedPathVlansEntityRestriction.cReference) &&
        Objects.equals(this.type, serviceTelcoUnroutedPathVlansEntityRestriction.type) &&
        Objects.equals(this.elid, serviceTelcoUnroutedPathVlansEntityRestriction.elid) &&
        Objects.equals(this.status, serviceTelcoUnroutedPathVlansEntityRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, vlanId, vlanPoolElid, remark, vlanName, cReference, type, elid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoUnroutedPathVlansEntityRestriction {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanPoolElid: ").append(toIndentedString(vlanPoolElid)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    vlanName: ").append(toIndentedString(vlanName)).append("\n");
    sb.append("    cReference: ").append(toIndentedString(cReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
