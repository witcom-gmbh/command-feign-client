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
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VirtualNasServerData
 */
@JsonPropertyOrder({
  VirtualNasServerData.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  VirtualNasServerData.JSON_PROPERTY_LIFECYCLE_STATUS,
  VirtualNasServerData.JSON_PROPERTY_CRITICALITY,
  VirtualNasServerData.JSON_PROPERTY_REMARK,
  VirtualNasServerData.JSON_PROPERTY_VISIBLE_ID,
  VirtualNasServerData.JSON_PROPERTY_ID,
  VirtualNasServerData.JSON_PROPERTY_ELID
})
@JsonTypeName("virtualNasServerData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class VirtualNasServerData {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private DateTime lifecycleStatusDate;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private String lifecycleStatus;

  public static final String JSON_PROPERTY_CRITICALITY = "criticality";
  private String criticality;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public VirtualNasServerData() {
  }

  public VirtualNasServerData lifecycleStatusDate(DateTime lifecycleStatusDate) {
    
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

  public DateTime getLifecycleStatusDate() {
    return lifecycleStatusDate;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycleStatusDate(DateTime lifecycleStatusDate) {
    this.lifecycleStatusDate = lifecycleStatusDate;
  }


  public VirtualNasServerData lifecycleStatus(String lifecycleStatus) {
    
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

  public String getLifecycleStatus() {
    return lifecycleStatus;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public VirtualNasServerData criticality(String criticality) {
    
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

  public String getCriticality() {
    return criticality;
  }


  @JsonProperty(JSON_PROPERTY_CRITICALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriticality(String criticality) {
    this.criticality = criticality;
  }


  public VirtualNasServerData remark(String remark) {
    
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

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public VirtualNasServerData visibleId(String visibleId) {
    
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

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public VirtualNasServerData id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public VirtualNasServerData elid(String elid) {
    
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
    VirtualNasServerData virtualNasServerData = (VirtualNasServerData) o;
    return Objects.equals(this.lifecycleStatusDate, virtualNasServerData.lifecycleStatusDate) &&
        Objects.equals(this.lifecycleStatus, virtualNasServerData.lifecycleStatus) &&
        Objects.equals(this.criticality, virtualNasServerData.criticality) &&
        Objects.equals(this.remark, virtualNasServerData.remark) &&
        Objects.equals(this.visibleId, virtualNasServerData.visibleId) &&
        Objects.equals(this.id, virtualNasServerData.id) &&
        Objects.equals(this.elid, virtualNasServerData.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, lifecycleStatus, criticality, remark, visibleId, id, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualNasServerData {\n");
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
