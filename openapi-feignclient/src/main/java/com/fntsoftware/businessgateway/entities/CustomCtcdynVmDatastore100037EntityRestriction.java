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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomCtcdynVmDatastore100037EntityRestriction
 */
@JsonPropertyOrder({
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_USED_GB,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_C_POOL_NAME,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_REDUNDANCY_CLASS,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_C_STORAGE_CLASS,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_CAPACITY_GB,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_REMARK,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_ID,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_REDUNDANCY,
  CustomCtcdynVmDatastore100037EntityRestriction.JSON_PROPERTY_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CustomCtcdynVmDatastore100037EntityRestriction {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private RestrictionsDate lifecycleStatusDate;

  public static final String JSON_PROPERTY_USED_GB = "usedGb";
  private RestrictionsNumeric usedGb;

  public static final String JSON_PROPERTY_C_POOL_NAME = "cPoolName";
  private RestrictionsString cPoolName;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private RestrictionsString lifecycleStatus;

  public static final String JSON_PROPERTY_REDUNDANCY_CLASS = "redundancyClass";
  private RestrictionsString redundancyClass;

  public static final String JSON_PROPERTY_C_STORAGE_CLASS = "cStorageClass";
  private RestrictionsString cStorageClass;

  public static final String JSON_PROPERTY_CAPACITY_GB = "capacityGb";
  private RestrictionsNumeric capacityGb;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_REDUNDANCY = "redundancy";
  private RestrictionsBoolean redundancy;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public CustomCtcdynVmDatastore100037EntityRestriction() {
  }

  public CustomCtcdynVmDatastore100037EntityRestriction lifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    
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


  public CustomCtcdynVmDatastore100037EntityRestriction usedGb(RestrictionsNumeric usedGb) {
    
    this.usedGb = usedGb;
    return this;
  }

   /**
   * Get usedGb
   * @return usedGb
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getUsedGb() {
    return usedGb;
  }


  @JsonProperty(JSON_PROPERTY_USED_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedGb(RestrictionsNumeric usedGb) {
    this.usedGb = usedGb;
  }


  public CustomCtcdynVmDatastore100037EntityRestriction cPoolName(RestrictionsString cPoolName) {
    
    this.cPoolName = cPoolName;
    return this;
  }

   /**
   * Get cPoolName
   * @return cPoolName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_POOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcPoolName() {
    return cPoolName;
  }


  @JsonProperty(JSON_PROPERTY_C_POOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcPoolName(RestrictionsString cPoolName) {
    this.cPoolName = cPoolName;
  }


  public CustomCtcdynVmDatastore100037EntityRestriction lifecycleStatus(RestrictionsString lifecycleStatus) {
    
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


  public CustomCtcdynVmDatastore100037EntityRestriction redundancyClass(RestrictionsString redundancyClass) {
    
    this.redundancyClass = redundancyClass;
    return this;
  }

   /**
   * Get redundancyClass
   * @return redundancyClass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDUNDANCY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRedundancyClass() {
    return redundancyClass;
  }


  @JsonProperty(JSON_PROPERTY_REDUNDANCY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedundancyClass(RestrictionsString redundancyClass) {
    this.redundancyClass = redundancyClass;
  }


  public CustomCtcdynVmDatastore100037EntityRestriction cStorageClass(RestrictionsString cStorageClass) {
    
    this.cStorageClass = cStorageClass;
    return this;
  }

   /**
   * Get cStorageClass
   * @return cStorageClass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_STORAGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcStorageClass() {
    return cStorageClass;
  }


  @JsonProperty(JSON_PROPERTY_C_STORAGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcStorageClass(RestrictionsString cStorageClass) {
    this.cStorageClass = cStorageClass;
  }


  public CustomCtcdynVmDatastore100037EntityRestriction capacityGb(RestrictionsNumeric capacityGb) {
    
    this.capacityGb = capacityGb;
    return this;
  }

   /**
   * Get capacityGb
   * @return capacityGb
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getCapacityGb() {
    return capacityGb;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacityGb(RestrictionsNumeric capacityGb) {
    this.capacityGb = capacityGb;
  }


  public CustomCtcdynVmDatastore100037EntityRestriction remark(RestrictionsString remark) {
    
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


  public CustomCtcdynVmDatastore100037EntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public CustomCtcdynVmDatastore100037EntityRestriction id(RestrictionsString id) {
    
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


  public CustomCtcdynVmDatastore100037EntityRestriction redundancy(RestrictionsBoolean redundancy) {
    
    this.redundancy = redundancy;
    return this;
  }

   /**
   * Get redundancy
   * @return redundancy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDUNDANCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getRedundancy() {
    return redundancy;
  }


  @JsonProperty(JSON_PROPERTY_REDUNDANCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedundancy(RestrictionsBoolean redundancy) {
    this.redundancy = redundancy;
  }


  public CustomCtcdynVmDatastore100037EntityRestriction elid(RestrictionsString elid) {
    
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
    CustomCtcdynVmDatastore100037EntityRestriction customCtcdynVmDatastore100037EntityRestriction = (CustomCtcdynVmDatastore100037EntityRestriction) o;
    return Objects.equals(this.lifecycleStatusDate, customCtcdynVmDatastore100037EntityRestriction.lifecycleStatusDate) &&
        Objects.equals(this.usedGb, customCtcdynVmDatastore100037EntityRestriction.usedGb) &&
        Objects.equals(this.cPoolName, customCtcdynVmDatastore100037EntityRestriction.cPoolName) &&
        Objects.equals(this.lifecycleStatus, customCtcdynVmDatastore100037EntityRestriction.lifecycleStatus) &&
        Objects.equals(this.redundancyClass, customCtcdynVmDatastore100037EntityRestriction.redundancyClass) &&
        Objects.equals(this.cStorageClass, customCtcdynVmDatastore100037EntityRestriction.cStorageClass) &&
        Objects.equals(this.capacityGb, customCtcdynVmDatastore100037EntityRestriction.capacityGb) &&
        Objects.equals(this.remark, customCtcdynVmDatastore100037EntityRestriction.remark) &&
        Objects.equals(this.visibleId, customCtcdynVmDatastore100037EntityRestriction.visibleId) &&
        Objects.equals(this.id, customCtcdynVmDatastore100037EntityRestriction.id) &&
        Objects.equals(this.redundancy, customCtcdynVmDatastore100037EntityRestriction.redundancy) &&
        Objects.equals(this.elid, customCtcdynVmDatastore100037EntityRestriction.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, usedGb, cPoolName, lifecycleStatus, redundancyClass, cStorageClass, capacityGb, remark, visibleId, id, redundancy, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCtcdynVmDatastore100037EntityRestriction {\n");
    sb.append("    lifecycleStatusDate: ").append(toIndentedString(lifecycleStatusDate)).append("\n");
    sb.append("    usedGb: ").append(toIndentedString(usedGb)).append("\n");
    sb.append("    cPoolName: ").append(toIndentedString(cPoolName)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    redundancyClass: ").append(toIndentedString(redundancyClass)).append("\n");
    sb.append("    cStorageClass: ").append(toIndentedString(cStorageClass)).append("\n");
    sb.append("    capacityGb: ").append(toIndentedString(capacityGb)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
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
