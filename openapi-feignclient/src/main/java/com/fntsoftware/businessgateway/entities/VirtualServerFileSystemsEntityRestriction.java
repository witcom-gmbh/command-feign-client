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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VirtualServerFileSystemsEntityRestriction
 */
@JsonPropertyOrder({
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_USED_GB,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_CAPACITY_GB,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_ID,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_ELID,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_FS_TYPE,
  VirtualServerFileSystemsEntityRestriction.JSON_PROPERTY_MOUNTPOINT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class VirtualServerFileSystemsEntityRestriction {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private RestrictionsDate lifecycleStatusDate;

  public static final String JSON_PROPERTY_USED_GB = "usedGb";
  private RestrictionsNumeric usedGb;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private RestrictionsString lifecycleStatus;

  public static final String JSON_PROPERTY_CAPACITY_GB = "capacityGb";
  private RestrictionsNumeric capacityGb;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FS_TYPE = "fsType";
  private RestrictionsString fsType;

  public static final String JSON_PROPERTY_MOUNTPOINT = "mountpoint";
  private RestrictionsString mountpoint;

  public VirtualServerFileSystemsEntityRestriction() {
  }

  public VirtualServerFileSystemsEntityRestriction lifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    
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


  public VirtualServerFileSystemsEntityRestriction usedGb(RestrictionsNumeric usedGb) {
    
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


  public VirtualServerFileSystemsEntityRestriction lifecycleStatus(RestrictionsString lifecycleStatus) {
    
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


  public VirtualServerFileSystemsEntityRestriction capacityGb(RestrictionsNumeric capacityGb) {
    
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


  public VirtualServerFileSystemsEntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public VirtualServerFileSystemsEntityRestriction id(RestrictionsString id) {
    
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


  public VirtualServerFileSystemsEntityRestriction elid(RestrictionsString elid) {
    
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


  public VirtualServerFileSystemsEntityRestriction fsType(RestrictionsString fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Get fsType
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFsType() {
    return fsType;
  }


  @JsonProperty(JSON_PROPERTY_FS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsType(RestrictionsString fsType) {
    this.fsType = fsType;
  }


  public VirtualServerFileSystemsEntityRestriction mountpoint(RestrictionsString mountpoint) {
    
    this.mountpoint = mountpoint;
    return this;
  }

   /**
   * Get mountpoint
   * @return mountpoint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOUNTPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMountpoint() {
    return mountpoint;
  }


  @JsonProperty(JSON_PROPERTY_MOUNTPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMountpoint(RestrictionsString mountpoint) {
    this.mountpoint = mountpoint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualServerFileSystemsEntityRestriction virtualServerFileSystemsEntityRestriction = (VirtualServerFileSystemsEntityRestriction) o;
    return Objects.equals(this.lifecycleStatusDate, virtualServerFileSystemsEntityRestriction.lifecycleStatusDate) &&
        Objects.equals(this.usedGb, virtualServerFileSystemsEntityRestriction.usedGb) &&
        Objects.equals(this.lifecycleStatus, virtualServerFileSystemsEntityRestriction.lifecycleStatus) &&
        Objects.equals(this.capacityGb, virtualServerFileSystemsEntityRestriction.capacityGb) &&
        Objects.equals(this.visibleId, virtualServerFileSystemsEntityRestriction.visibleId) &&
        Objects.equals(this.id, virtualServerFileSystemsEntityRestriction.id) &&
        Objects.equals(this.elid, virtualServerFileSystemsEntityRestriction.elid) &&
        Objects.equals(this.fsType, virtualServerFileSystemsEntityRestriction.fsType) &&
        Objects.equals(this.mountpoint, virtualServerFileSystemsEntityRestriction.mountpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, usedGb, lifecycleStatus, capacityGb, visibleId, id, elid, fsType, mountpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualServerFileSystemsEntityRestriction {\n");
    sb.append("    lifecycleStatusDate: ").append(toIndentedString(lifecycleStatusDate)).append("\n");
    sb.append("    usedGb: ").append(toIndentedString(usedGb)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    capacityGb: ").append(toIndentedString(capacityGb)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    mountpoint: ").append(toIndentedString(mountpoint)).append("\n");
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
