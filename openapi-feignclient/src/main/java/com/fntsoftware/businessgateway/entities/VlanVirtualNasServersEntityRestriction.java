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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VlanVirtualNasServersEntityRestriction
 */
@JsonPropertyOrder({
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS,
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_CRITICALITY,
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_REMARK,
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_ID,
  VlanVirtualNasServersEntityRestriction.JSON_PROPERTY_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class VlanVirtualNasServersEntityRestriction {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private RestrictionsDate lifecycleStatusDate;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private RestrictionsString lifecycleStatus;

  public static final String JSON_PROPERTY_CRITICALITY = "criticality";
  private RestrictionsString criticality;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public VlanVirtualNasServersEntityRestriction() {
  }

  public VlanVirtualNasServersEntityRestriction lifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    
    this.lifecycleStatusDate = lifecycleStatusDate;
    return this;
  }

   /**
   * Get lifecycleStatusDate
   * @return lifecycleStatusDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getLifecycleStatusDate() {
    return lifecycleStatusDate;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    this.lifecycleStatusDate = lifecycleStatusDate;
  }


  public VlanVirtualNasServersEntityRestriction lifecycleStatus(RestrictionsString lifecycleStatus) {
    
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * Get lifecycleStatus
   * @return lifecycleStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLifecycleStatus() {
    return lifecycleStatus;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycleStatus(RestrictionsString lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public VlanVirtualNasServersEntityRestriction criticality(RestrictionsString criticality) {
    
    this.criticality = criticality;
    return this;
  }

   /**
   * Get criticality
   * @return criticality
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITICALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getCriticality() {
    return criticality;
  }


  @JsonProperty(JSON_PROPERTY_CRITICALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriticality(RestrictionsString criticality) {
    this.criticality = criticality;
  }


  public VlanVirtualNasServersEntityRestriction remark(RestrictionsString remark) {
    
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


  public VlanVirtualNasServersEntityRestriction visibleId(RestrictionsString visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(RestrictionsString visibleId) {
    this.visibleId = visibleId;
  }


  public VlanVirtualNasServersEntityRestriction id(RestrictionsString id) {
    
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


  public VlanVirtualNasServersEntityRestriction elid(RestrictionsString elid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VlanVirtualNasServersEntityRestriction vlanVirtualNasServersEntityRestriction = (VlanVirtualNasServersEntityRestriction) o;
    return Objects.equals(this.lifecycleStatusDate, vlanVirtualNasServersEntityRestriction.lifecycleStatusDate) &&
        Objects.equals(this.lifecycleStatus, vlanVirtualNasServersEntityRestriction.lifecycleStatus) &&
        Objects.equals(this.criticality, vlanVirtualNasServersEntityRestriction.criticality) &&
        Objects.equals(this.remark, vlanVirtualNasServersEntityRestriction.remark) &&
        Objects.equals(this.visibleId, vlanVirtualNasServersEntityRestriction.visibleId) &&
        Objects.equals(this.id, vlanVirtualNasServersEntityRestriction.id) &&
        Objects.equals(this.elid, vlanVirtualNasServersEntityRestriction.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, lifecycleStatus, criticality, remark, visibleId, id, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlanVirtualNasServersEntityRestriction {\n");
    sb.append("    lifecycleStatusDate: ").append(toIndentedString(lifecycleStatusDate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
