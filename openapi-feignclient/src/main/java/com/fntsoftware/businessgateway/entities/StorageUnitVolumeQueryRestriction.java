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
 * StorageUnitVolumeQueryRestriction
 */
@JsonPropertyOrder({
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_SNAPSHOT_SCHEDULE,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_SNAPSHOT_USED_GB,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_VOLUME_TYPE,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_C_POOL_NAME,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_LIFECYCLE_STATUS,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_REDUNDANCY_CLASS,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_C_STORAGE_CLASS,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_REMARK,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_ELID,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_SNAPSHOT_SIZE_GB,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_USED_GB,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_CAPACITY_GB,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_ROOT_VOLUME,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_ID,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_REDUNDANCY,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_RAID_TYPE,
  StorageUnitVolumeQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class StorageUnitVolumeQueryRestriction {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private RestrictionsDate lifecycleStatusDate;

  public static final String JSON_PROPERTY_SNAPSHOT_SCHEDULE = "snapshotSchedule";
  private RestrictionsString snapshotSchedule;

  public static final String JSON_PROPERTY_SNAPSHOT_USED_GB = "snapshotUsedGb";
  private RestrictionsNumeric snapshotUsedGb;

  public static final String JSON_PROPERTY_VOLUME_TYPE = "volumeType";
  private RestrictionsString volumeType;

  public static final String JSON_PROPERTY_C_POOL_NAME = "cPoolName";
  private RestrictionsString cPoolName;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private RestrictionsString lifecycleStatus;

  public static final String JSON_PROPERTY_REDUNDANCY_CLASS = "redundancyClass";
  private RestrictionsString redundancyClass;

  public static final String JSON_PROPERTY_C_STORAGE_CLASS = "cStorageClass";
  private RestrictionsString cStorageClass;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_SNAPSHOT_SIZE_GB = "snapshotSizeGb";
  private RestrictionsNumeric snapshotSizeGb;

  public static final String JSON_PROPERTY_USED_GB = "usedGb";
  private RestrictionsNumeric usedGb;

  public static final String JSON_PROPERTY_CAPACITY_GB = "capacityGb";
  private RestrictionsNumeric capacityGb;

  public static final String JSON_PROPERTY_ROOT_VOLUME = "rootVolume";
  private RestrictionsBoolean rootVolume;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_REDUNDANCY = "redundancy";
  private RestrictionsBoolean redundancy;

  public static final String JSON_PROPERTY_RAID_TYPE = "raidType";
  private RestrictionsString raidType;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public StorageUnitVolumeQueryRestriction() {
  }

  public StorageUnitVolumeQueryRestriction lifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    
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


  public StorageUnitVolumeQueryRestriction snapshotSchedule(RestrictionsString snapshotSchedule) {
    
    this.snapshotSchedule = snapshotSchedule;
    return this;
  }

   /**
   * Get snapshotSchedule
   * @return snapshotSchedule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSnapshotSchedule() {
    return snapshotSchedule;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotSchedule(RestrictionsString snapshotSchedule) {
    this.snapshotSchedule = snapshotSchedule;
  }


  public StorageUnitVolumeQueryRestriction snapshotUsedGb(RestrictionsNumeric snapshotUsedGb) {
    
    this.snapshotUsedGb = snapshotUsedGb;
    return this;
  }

   /**
   * Get snapshotUsedGb
   * @return snapshotUsedGb
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_USED_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getSnapshotUsedGb() {
    return snapshotUsedGb;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_USED_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotUsedGb(RestrictionsNumeric snapshotUsedGb) {
    this.snapshotUsedGb = snapshotUsedGb;
  }


  public StorageUnitVolumeQueryRestriction volumeType(RestrictionsString volumeType) {
    
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVolumeType() {
    return volumeType;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeType(RestrictionsString volumeType) {
    this.volumeType = volumeType;
  }


  public StorageUnitVolumeQueryRestriction cPoolName(RestrictionsString cPoolName) {
    
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


  public StorageUnitVolumeQueryRestriction lifecycleStatus(RestrictionsString lifecycleStatus) {
    
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


  public StorageUnitVolumeQueryRestriction redundancyClass(RestrictionsString redundancyClass) {
    
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


  public StorageUnitVolumeQueryRestriction cStorageClass(RestrictionsString cStorageClass) {
    
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


  public StorageUnitVolumeQueryRestriction remark(RestrictionsString remark) {
    
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


  public StorageUnitVolumeQueryRestriction elid(RestrictionsString elid) {
    
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


  public StorageUnitVolumeQueryRestriction snapshotSizeGb(RestrictionsNumeric snapshotSizeGb) {
    
    this.snapshotSizeGb = snapshotSizeGb;
    return this;
  }

   /**
   * Get snapshotSizeGb
   * @return snapshotSizeGb
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_SIZE_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getSnapshotSizeGb() {
    return snapshotSizeGb;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_SIZE_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotSizeGb(RestrictionsNumeric snapshotSizeGb) {
    this.snapshotSizeGb = snapshotSizeGb;
  }


  public StorageUnitVolumeQueryRestriction usedGb(RestrictionsNumeric usedGb) {
    
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


  public StorageUnitVolumeQueryRestriction capacityGb(RestrictionsNumeric capacityGb) {
    
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


  public StorageUnitVolumeQueryRestriction rootVolume(RestrictionsBoolean rootVolume) {
    
    this.rootVolume = rootVolume;
    return this;
  }

   /**
   * Get rootVolume
   * @return rootVolume
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getRootVolume() {
    return rootVolume;
  }


  @JsonProperty(JSON_PROPERTY_ROOT_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootVolume(RestrictionsBoolean rootVolume) {
    this.rootVolume = rootVolume;
  }


  public StorageUnitVolumeQueryRestriction visibleId(RestrictionsString visibleId) {
    
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


  public StorageUnitVolumeQueryRestriction id(RestrictionsString id) {
    
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


  public StorageUnitVolumeQueryRestriction redundancy(RestrictionsBoolean redundancy) {
    
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


  public StorageUnitVolumeQueryRestriction raidType(RestrictionsString raidType) {
    
    this.raidType = raidType;
    return this;
  }

   /**
   * Get raidType
   * @return raidType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRaidType() {
    return raidType;
  }


  @JsonProperty(JSON_PROPERTY_RAID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRaidType(RestrictionsString raidType) {
    this.raidType = raidType;
  }


  public StorageUnitVolumeQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageUnitVolumeQueryRestriction storageUnitVolumeQueryRestriction = (StorageUnitVolumeQueryRestriction) o;
    return Objects.equals(this.lifecycleStatusDate, storageUnitVolumeQueryRestriction.lifecycleStatusDate) &&
        Objects.equals(this.snapshotSchedule, storageUnitVolumeQueryRestriction.snapshotSchedule) &&
        Objects.equals(this.snapshotUsedGb, storageUnitVolumeQueryRestriction.snapshotUsedGb) &&
        Objects.equals(this.volumeType, storageUnitVolumeQueryRestriction.volumeType) &&
        Objects.equals(this.cPoolName, storageUnitVolumeQueryRestriction.cPoolName) &&
        Objects.equals(this.lifecycleStatus, storageUnitVolumeQueryRestriction.lifecycleStatus) &&
        Objects.equals(this.redundancyClass, storageUnitVolumeQueryRestriction.redundancyClass) &&
        Objects.equals(this.cStorageClass, storageUnitVolumeQueryRestriction.cStorageClass) &&
        Objects.equals(this.remark, storageUnitVolumeQueryRestriction.remark) &&
        Objects.equals(this.elid, storageUnitVolumeQueryRestriction.elid) &&
        Objects.equals(this.snapshotSizeGb, storageUnitVolumeQueryRestriction.snapshotSizeGb) &&
        Objects.equals(this.usedGb, storageUnitVolumeQueryRestriction.usedGb) &&
        Objects.equals(this.capacityGb, storageUnitVolumeQueryRestriction.capacityGb) &&
        Objects.equals(this.rootVolume, storageUnitVolumeQueryRestriction.rootVolume) &&
        Objects.equals(this.visibleId, storageUnitVolumeQueryRestriction.visibleId) &&
        Objects.equals(this.id, storageUnitVolumeQueryRestriction.id) &&
        Objects.equals(this.redundancy, storageUnitVolumeQueryRestriction.redundancy) &&
        Objects.equals(this.raidType, storageUnitVolumeQueryRestriction.raidType) &&
        Objects.equals(this.first, storageUnitVolumeQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, snapshotSchedule, snapshotUsedGb, volumeType, cPoolName, lifecycleStatus, redundancyClass, cStorageClass, remark, elid, snapshotSizeGb, usedGb, capacityGb, rootVolume, visibleId, id, redundancy, raidType, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageUnitVolumeQueryRestriction {\n");
    sb.append("    lifecycleStatusDate: ").append(toIndentedString(lifecycleStatusDate)).append("\n");
    sb.append("    snapshotSchedule: ").append(toIndentedString(snapshotSchedule)).append("\n");
    sb.append("    snapshotUsedGb: ").append(toIndentedString(snapshotUsedGb)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    cPoolName: ").append(toIndentedString(cPoolName)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    redundancyClass: ").append(toIndentedString(redundancyClass)).append("\n");
    sb.append("    cStorageClass: ").append(toIndentedString(cStorageClass)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    snapshotSizeGb: ").append(toIndentedString(snapshotSizeGb)).append("\n");
    sb.append("    usedGb: ").append(toIndentedString(usedGb)).append("\n");
    sb.append("    capacityGb: ").append(toIndentedString(capacityGb)).append("\n");
    sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    raidType: ").append(toIndentedString(raidType)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
