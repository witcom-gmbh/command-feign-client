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
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StorageUnitVolumeData
 */
@JsonPropertyOrder({
  StorageUnitVolumeData.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  StorageUnitVolumeData.JSON_PROPERTY_SNAPSHOT_SCHEDULE,
  StorageUnitVolumeData.JSON_PROPERTY_SNAPSHOT_USED_GB,
  StorageUnitVolumeData.JSON_PROPERTY_VOLUME_TYPE,
  StorageUnitVolumeData.JSON_PROPERTY_C_POOL_NAME,
  StorageUnitVolumeData.JSON_PROPERTY_LIFECYCLE_STATUS,
  StorageUnitVolumeData.JSON_PROPERTY_REDUNDANCY_CLASS,
  StorageUnitVolumeData.JSON_PROPERTY_C_STORAGE_CLASS,
  StorageUnitVolumeData.JSON_PROPERTY_REMARK,
  StorageUnitVolumeData.JSON_PROPERTY_ELID,
  StorageUnitVolumeData.JSON_PROPERTY_SNAPSHOT_SIZE_GB,
  StorageUnitVolumeData.JSON_PROPERTY_USED_GB,
  StorageUnitVolumeData.JSON_PROPERTY_CAPACITY_GB,
  StorageUnitVolumeData.JSON_PROPERTY_ROOT_VOLUME,
  StorageUnitVolumeData.JSON_PROPERTY_VISIBLE_ID,
  StorageUnitVolumeData.JSON_PROPERTY_ID,
  StorageUnitVolumeData.JSON_PROPERTY_REDUNDANCY,
  StorageUnitVolumeData.JSON_PROPERTY_RAID_TYPE
})
@JsonTypeName("storageUnitVolumeData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class StorageUnitVolumeData {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private DateTime lifecycleStatusDate;

  public static final String JSON_PROPERTY_SNAPSHOT_SCHEDULE = "snapshotSchedule";
  private String snapshotSchedule;

  public static final String JSON_PROPERTY_SNAPSHOT_USED_GB = "snapshotUsedGb";
  private BigDecimal snapshotUsedGb;

  public static final String JSON_PROPERTY_VOLUME_TYPE = "volumeType";
  private String volumeType;

  public static final String JSON_PROPERTY_C_POOL_NAME = "cPoolName";
  private String cPoolName;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private String lifecycleStatus;

  public static final String JSON_PROPERTY_REDUNDANCY_CLASS = "redundancyClass";
  private String redundancyClass;

  public static final String JSON_PROPERTY_C_STORAGE_CLASS = "cStorageClass";
  private String cStorageClass;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_SNAPSHOT_SIZE_GB = "snapshotSizeGb";
  private BigDecimal snapshotSizeGb;

  public static final String JSON_PROPERTY_USED_GB = "usedGb";
  private BigDecimal usedGb;

  public static final String JSON_PROPERTY_CAPACITY_GB = "capacityGb";
  private BigDecimal capacityGb;

  public static final String JSON_PROPERTY_ROOT_VOLUME = "rootVolume";
  private Boolean rootVolume;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REDUNDANCY = "redundancy";
  private Boolean redundancy;

  public static final String JSON_PROPERTY_RAID_TYPE = "raidType";
  private String raidType;

  public StorageUnitVolumeData() {
  }

  public StorageUnitVolumeData lifecycleStatusDate(DateTime lifecycleStatusDate) {
    
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


  public StorageUnitVolumeData snapshotSchedule(String snapshotSchedule) {
    
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

  public String getSnapshotSchedule() {
    return snapshotSchedule;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotSchedule(String snapshotSchedule) {
    this.snapshotSchedule = snapshotSchedule;
  }


  public StorageUnitVolumeData snapshotUsedGb(BigDecimal snapshotUsedGb) {
    
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

  public BigDecimal getSnapshotUsedGb() {
    return snapshotUsedGb;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_USED_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotUsedGb(BigDecimal snapshotUsedGb) {
    this.snapshotUsedGb = snapshotUsedGb;
  }


  public StorageUnitVolumeData volumeType(String volumeType) {
    
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

  public String getVolumeType() {
    return volumeType;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }


  public StorageUnitVolumeData cPoolName(String cPoolName) {
    
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

  public String getcPoolName() {
    return cPoolName;
  }


  @JsonProperty(JSON_PROPERTY_C_POOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcPoolName(String cPoolName) {
    this.cPoolName = cPoolName;
  }


  public StorageUnitVolumeData lifecycleStatus(String lifecycleStatus) {
    
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


  public StorageUnitVolumeData redundancyClass(String redundancyClass) {
    
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

  public String getRedundancyClass() {
    return redundancyClass;
  }


  @JsonProperty(JSON_PROPERTY_REDUNDANCY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedundancyClass(String redundancyClass) {
    this.redundancyClass = redundancyClass;
  }


  public StorageUnitVolumeData cStorageClass(String cStorageClass) {
    
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

  public String getcStorageClass() {
    return cStorageClass;
  }


  @JsonProperty(JSON_PROPERTY_C_STORAGE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcStorageClass(String cStorageClass) {
    this.cStorageClass = cStorageClass;
  }


  public StorageUnitVolumeData remark(String remark) {
    
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


  public StorageUnitVolumeData elid(String elid) {
    
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


  public StorageUnitVolumeData snapshotSizeGb(BigDecimal snapshotSizeGb) {
    
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

  public BigDecimal getSnapshotSizeGb() {
    return snapshotSizeGb;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_SIZE_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotSizeGb(BigDecimal snapshotSizeGb) {
    this.snapshotSizeGb = snapshotSizeGb;
  }


  public StorageUnitVolumeData usedGb(BigDecimal usedGb) {
    
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

  public BigDecimal getUsedGb() {
    return usedGb;
  }


  @JsonProperty(JSON_PROPERTY_USED_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedGb(BigDecimal usedGb) {
    this.usedGb = usedGb;
  }


  public StorageUnitVolumeData capacityGb(BigDecimal capacityGb) {
    
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

  public BigDecimal getCapacityGb() {
    return capacityGb;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY_GB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacityGb(BigDecimal capacityGb) {
    this.capacityGb = capacityGb;
  }


  public StorageUnitVolumeData rootVolume(Boolean rootVolume) {
    
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

  public Boolean getRootVolume() {
    return rootVolume;
  }


  @JsonProperty(JSON_PROPERTY_ROOT_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRootVolume(Boolean rootVolume) {
    this.rootVolume = rootVolume;
  }


  public StorageUnitVolumeData visibleId(String visibleId) {
    
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


  public StorageUnitVolumeData id(String id) {
    
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


  public StorageUnitVolumeData redundancy(Boolean redundancy) {
    
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

  public Boolean getRedundancy() {
    return redundancy;
  }


  @JsonProperty(JSON_PROPERTY_REDUNDANCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedundancy(Boolean redundancy) {
    this.redundancy = redundancy;
  }


  public StorageUnitVolumeData raidType(String raidType) {
    
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

  public String getRaidType() {
    return raidType;
  }


  @JsonProperty(JSON_PROPERTY_RAID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRaidType(String raidType) {
    this.raidType = raidType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageUnitVolumeData storageUnitVolumeData = (StorageUnitVolumeData) o;
    return Objects.equals(this.lifecycleStatusDate, storageUnitVolumeData.lifecycleStatusDate) &&
        Objects.equals(this.snapshotSchedule, storageUnitVolumeData.snapshotSchedule) &&
        Objects.equals(this.snapshotUsedGb, storageUnitVolumeData.snapshotUsedGb) &&
        Objects.equals(this.volumeType, storageUnitVolumeData.volumeType) &&
        Objects.equals(this.cPoolName, storageUnitVolumeData.cPoolName) &&
        Objects.equals(this.lifecycleStatus, storageUnitVolumeData.lifecycleStatus) &&
        Objects.equals(this.redundancyClass, storageUnitVolumeData.redundancyClass) &&
        Objects.equals(this.cStorageClass, storageUnitVolumeData.cStorageClass) &&
        Objects.equals(this.remark, storageUnitVolumeData.remark) &&
        Objects.equals(this.elid, storageUnitVolumeData.elid) &&
        Objects.equals(this.snapshotSizeGb, storageUnitVolumeData.snapshotSizeGb) &&
        Objects.equals(this.usedGb, storageUnitVolumeData.usedGb) &&
        Objects.equals(this.capacityGb, storageUnitVolumeData.capacityGb) &&
        Objects.equals(this.rootVolume, storageUnitVolumeData.rootVolume) &&
        Objects.equals(this.visibleId, storageUnitVolumeData.visibleId) &&
        Objects.equals(this.id, storageUnitVolumeData.id) &&
        Objects.equals(this.redundancy, storageUnitVolumeData.redundancy) &&
        Objects.equals(this.raidType, storageUnitVolumeData.raidType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, snapshotSchedule, snapshotUsedGb, volumeType, cPoolName, lifecycleStatus, redundancyClass, cStorageClass, remark, elid, snapshotSizeGb, usedGb, capacityGb, rootVolume, visibleId, id, redundancy, raidType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageUnitVolumeData {\n");
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
