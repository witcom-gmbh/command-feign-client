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
 * VirtualServerData
 */
@JsonPropertyOrder({
  VirtualServerData.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  VirtualServerData.JSON_PROPERTY_LIFECYCLE_STATUS,
  VirtualServerData.JSON_PROPERTY_PURPOSE,
  VirtualServerData.JSON_PROPERTY_USAGE,
  VirtualServerData.JSON_PROPERTY_CRITICALITY,
  VirtualServerData.JSON_PROPERTY_REMARK,
  VirtualServerData.JSON_PROPERTY_CAPACITY,
  VirtualServerData.JSON_PROPERTY_POWER_STATE,
  VirtualServerData.JSON_PROPERTY_INSTALL_DATE,
  VirtualServerData.JSON_PROPERTY_DATASOURCE_ID,
  VirtualServerData.JSON_PROPERTY_ID,
  VirtualServerData.JSON_PROPERTY_OPERATING_STATUS,
  VirtualServerData.JSON_PROPERTY_USAGE_TYPE,
  VirtualServerData.JSON_PROPERTY_COST_CENTER,
  VirtualServerData.JSON_PROPERTY_MOVEABLE,
  VirtualServerData.JSON_PROPERTY_ELID,
  VirtualServerData.JSON_PROPERTY_PARTITION_TYPE,
  VirtualServerData.JSON_PROPERTY_URL,
  VirtualServerData.JSON_PROPERTY_CPU_AMOUNT,
  VirtualServerData.JSON_PROPERTY_LAST_SEEN,
  VirtualServerData.JSON_PROPERTY_C_ISAPPLIANCE,
  VirtualServerData.JSON_PROPERTY_DATASOURCE,
  VirtualServerData.JSON_PROPERTY_VALID_UNTIL,
  VirtualServerData.JSON_PROPERTY_SUB_TYPE,
  VirtualServerData.JSON_PROPERTY_VISIBLE_ID,
  VirtualServerData.JSON_PROPERTY_VIRTUAL_MACHINE_TYPE
})
@JsonTypeName("virtualServerData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class VirtualServerData {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private DateTime lifecycleStatusDate;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private String lifecycleStatus;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private String purpose;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private String usage;

  public static final String JSON_PROPERTY_CRITICALITY = "criticality";
  private String criticality;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_CAPACITY = "capacity";
  private BigDecimal capacity;

  public static final String JSON_PROPERTY_POWER_STATE = "powerState";
  private String powerState;

  public static final String JSON_PROPERTY_INSTALL_DATE = "installDate";
  private DateTime installDate;

  public static final String JSON_PROPERTY_DATASOURCE_ID = "datasourceId";
  private String datasourceId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OPERATING_STATUS = "operatingStatus";
  private String operatingStatus;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usageType";
  private String usageType;

  public static final String JSON_PROPERTY_COST_CENTER = "costCenter";
  private String costCenter;

  public static final String JSON_PROPERTY_MOVEABLE = "moveable";
  private Boolean moveable;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_PARTITION_TYPE = "partitionType";
  private String partitionType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CPU_AMOUNT = "cpuAmount";
  private BigDecimal cpuAmount;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private DateTime lastSeen;

  public static final String JSON_PROPERTY_C_ISAPPLIANCE = "cIsappliance";
  private String cIsappliance;

  public static final String JSON_PROPERTY_DATASOURCE = "datasource";
  private String datasource;

  public static final String JSON_PROPERTY_VALID_UNTIL = "validUntil";
  private DateTime validUntil;

  public static final String JSON_PROPERTY_SUB_TYPE = "subType";
  private String subType;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_VIRTUAL_MACHINE_TYPE = "virtualMachineType";
  private String virtualMachineType;

  public VirtualServerData() {
  }

  public VirtualServerData lifecycleStatusDate(DateTime lifecycleStatusDate) {
    
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


  public VirtualServerData lifecycleStatus(String lifecycleStatus) {
    
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


  public VirtualServerData purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public VirtualServerData usage(String usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(String usage) {
    this.usage = usage;
  }


  public VirtualServerData criticality(String criticality) {
    
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


  public VirtualServerData remark(String remark) {
    
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


  public VirtualServerData capacity(BigDecimal capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCapacity() {
    return capacity;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }


  public VirtualServerData powerState(String powerState) {
    
    this.powerState = powerState;
    return this;
  }

   /**
   * Get powerState
   * @return powerState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPowerState() {
    return powerState;
  }


  @JsonProperty(JSON_PROPERTY_POWER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerState(String powerState) {
    this.powerState = powerState;
  }


  public VirtualServerData installDate(DateTime installDate) {
    
    this.installDate = installDate;
    return this;
  }

   /**
   * Get installDate
   * @return installDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getInstallDate() {
    return installDate;
  }


  @JsonProperty(JSON_PROPERTY_INSTALL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallDate(DateTime installDate) {
    this.installDate = installDate;
  }


  public VirtualServerData datasourceId(String datasourceId) {
    
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * Get datasourceId
   * @return datasourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatasourceId() {
    return datasourceId;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
  }


  public VirtualServerData id(String id) {
    
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


  public VirtualServerData operatingStatus(String operatingStatus) {
    
    this.operatingStatus = operatingStatus;
    return this;
  }

   /**
   * Get operatingStatus
   * @return operatingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperatingStatus() {
    return operatingStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingStatus(String operatingStatus) {
    this.operatingStatus = operatingStatus;
  }


  public VirtualServerData usageType(String usageType) {
    
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsageType() {
    return usageType;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }


  public VirtualServerData costCenter(String costCenter) {
    
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_CENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCostCenter() {
    return costCenter;
  }


  @JsonProperty(JSON_PROPERTY_COST_CENTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }


  public VirtualServerData moveable(Boolean moveable) {
    
    this.moveable = moveable;
    return this;
  }

   /**
   * Get moveable
   * @return moveable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOVEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMoveable() {
    return moveable;
  }


  @JsonProperty(JSON_PROPERTY_MOVEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMoveable(Boolean moveable) {
    this.moveable = moveable;
  }


  public VirtualServerData elid(String elid) {
    
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


  public VirtualServerData partitionType(String partitionType) {
    
    this.partitionType = partitionType;
    return this;
  }

   /**
   * Get partitionType
   * @return partitionType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPartitionType() {
    return partitionType;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartitionType(String partitionType) {
    this.partitionType = partitionType;
  }


  public VirtualServerData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public VirtualServerData cpuAmount(BigDecimal cpuAmount) {
    
    this.cpuAmount = cpuAmount;
    return this;
  }

   /**
   * Get cpuAmount
   * @return cpuAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCpuAmount() {
    return cpuAmount;
  }


  @JsonProperty(JSON_PROPERTY_CPU_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuAmount(BigDecimal cpuAmount) {
    this.cpuAmount = cpuAmount;
  }


  public VirtualServerData lastSeen(DateTime lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getLastSeen() {
    return lastSeen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeen(DateTime lastSeen) {
    this.lastSeen = lastSeen;
  }


  public VirtualServerData cIsappliance(String cIsappliance) {
    
    this.cIsappliance = cIsappliance;
    return this;
  }

   /**
   * Get cIsappliance
   * @return cIsappliance
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_ISAPPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcIsappliance() {
    return cIsappliance;
  }


  @JsonProperty(JSON_PROPERTY_C_ISAPPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcIsappliance(String cIsappliance) {
    this.cIsappliance = cIsappliance;
  }


  public VirtualServerData datasource(String datasource) {
    
    this.datasource = datasource;
    return this;
  }

   /**
   * Get datasource
   * @return datasource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatasource() {
    return datasource;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }


  public VirtualServerData validUntil(DateTime validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * Get validUntil
   * @return validUntil
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getValidUntil() {
    return validUntil;
  }


  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidUntil(DateTime validUntil) {
    this.validUntil = validUntil;
  }


  public VirtualServerData subType(String subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubType() {
    return subType;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubType(String subType) {
    this.subType = subType;
  }


  public VirtualServerData visibleId(String visibleId) {
    
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


  public VirtualServerData virtualMachineType(String virtualMachineType) {
    
    this.virtualMachineType = virtualMachineType;
    return this;
  }

   /**
   * Get virtualMachineType
   * @return virtualMachineType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_MACHINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualMachineType() {
    return virtualMachineType;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_MACHINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualMachineType(String virtualMachineType) {
    this.virtualMachineType = virtualMachineType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualServerData virtualServerData = (VirtualServerData) o;
    return Objects.equals(this.lifecycleStatusDate, virtualServerData.lifecycleStatusDate) &&
        Objects.equals(this.lifecycleStatus, virtualServerData.lifecycleStatus) &&
        Objects.equals(this.purpose, virtualServerData.purpose) &&
        Objects.equals(this.usage, virtualServerData.usage) &&
        Objects.equals(this.criticality, virtualServerData.criticality) &&
        Objects.equals(this.remark, virtualServerData.remark) &&
        Objects.equals(this.capacity, virtualServerData.capacity) &&
        Objects.equals(this.powerState, virtualServerData.powerState) &&
        Objects.equals(this.installDate, virtualServerData.installDate) &&
        Objects.equals(this.datasourceId, virtualServerData.datasourceId) &&
        Objects.equals(this.id, virtualServerData.id) &&
        Objects.equals(this.operatingStatus, virtualServerData.operatingStatus) &&
        Objects.equals(this.usageType, virtualServerData.usageType) &&
        Objects.equals(this.costCenter, virtualServerData.costCenter) &&
        Objects.equals(this.moveable, virtualServerData.moveable) &&
        Objects.equals(this.elid, virtualServerData.elid) &&
        Objects.equals(this.partitionType, virtualServerData.partitionType) &&
        Objects.equals(this.url, virtualServerData.url) &&
        Objects.equals(this.cpuAmount, virtualServerData.cpuAmount) &&
        Objects.equals(this.lastSeen, virtualServerData.lastSeen) &&
        Objects.equals(this.cIsappliance, virtualServerData.cIsappliance) &&
        Objects.equals(this.datasource, virtualServerData.datasource) &&
        Objects.equals(this.validUntil, virtualServerData.validUntil) &&
        Objects.equals(this.subType, virtualServerData.subType) &&
        Objects.equals(this.visibleId, virtualServerData.visibleId) &&
        Objects.equals(this.virtualMachineType, virtualServerData.virtualMachineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, lifecycleStatus, purpose, usage, criticality, remark, capacity, powerState, installDate, datasourceId, id, operatingStatus, usageType, costCenter, moveable, elid, partitionType, url, cpuAmount, lastSeen, cIsappliance, datasource, validUntil, subType, visibleId, virtualMachineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualServerData {\n");
    sb.append("    lifecycleStatusDate: ").append(toIndentedString(lifecycleStatusDate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    installDate: ").append(toIndentedString(installDate)).append("\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    moveable: ").append(toIndentedString(moveable)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    partitionType: ").append(toIndentedString(partitionType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    cpuAmount: ").append(toIndentedString(cpuAmount)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    cIsappliance: ").append(toIndentedString(cIsappliance)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    virtualMachineType: ").append(toIndentedString(virtualMachineType)).append("\n");
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
