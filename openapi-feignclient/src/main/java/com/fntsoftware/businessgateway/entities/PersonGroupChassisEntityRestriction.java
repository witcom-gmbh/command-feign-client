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
 * PersonGroupChassisEntityRestriction
 */
@JsonPropertyOrder({
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_SW_REVISION,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_PLAN_STATUS,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_SYSTEM_RUNTIME,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE_ID,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_REMARK,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_INVENTORY_NO,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_SUPPLIER,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_DELIVERY_NO,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_ID,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_REFERENCE_T1,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_CLIMATE_RELEVANT,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE_DELETED,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_POWER_CONSUMPTION,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_WARRANTY_UNTIL,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_REFERENCE_V1,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_IP_ADDRESS,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_HOST_ID,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_WEIGHT,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_SUPPLY_DATE,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_ELID,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_SERIAL_NO,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_MAC_ADDRESS,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_MAC_ADDRESS,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_LAST_SEEN,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_TYPE_ELID,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_C_LABEL_MISSING,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_HEAT_EMISSION,
  PersonGroupChassisEntityRestriction.JSON_PROPERTY_HW_REVISION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PersonGroupChassisEntityRestriction {
  public static final String JSON_PROPERTY_SW_REVISION = "swRevision";
  private RestrictionsString swRevision;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private RestrictionsString planStatus;

  public static final String JSON_PROPERTY_SYSTEM_RUNTIME = "systemRuntime";
  private RestrictionsNumeric systemRuntime;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_ID = "cDataSourceId";
  private RestrictionsString cDataSourceId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private RestrictionsString cInventoryNo;

  public static final String JSON_PROPERTY_SUPPLIER = "supplier";
  private RestrictionsString supplier;

  public static final String JSON_PROPERTY_C_DELIVERY_NO = "cDeliveryNo";
  private RestrictionsString cDeliveryNo;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_C_REFERENCE_T1 = "cReferenceT1";
  private RestrictionsString cReferenceT1;

  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private RestrictionsBoolean climateRelevant;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_DELETED = "cDataSourceDeleted";
  private RestrictionsString cDataSourceDeleted;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private RestrictionsNumeric powerConsumption;

  public static final String JSON_PROPERTY_WARRANTY_UNTIL = "warrantyUntil";
  private RestrictionsDate warrantyUntil;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private RestrictionsString powerSwitchingStatus;

  public static final String JSON_PROPERTY_C_REFERENCE_V1 = "cReferenceV1";
  private RestrictionsString cReferenceV1;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private RestrictionsString ipAddress;

  public static final String JSON_PROPERTY_HOST_ID = "hostId";
  private RestrictionsString hostId;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private RestrictionsNumeric weight;

  public static final String JSON_PROPERTY_SUPPLY_DATE = "supplyDate";
  private RestrictionsDate supplyDate;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private RestrictionsString serialNo;

  public static final String JSON_PROPERTY_C_MAC_ADDRESS = "cMacAddress";
  private RestrictionsString cMacAddress;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "macAddress";
  private RestrictionsString macAddress;

  public static final String JSON_PROPERTY_C_DATA_SOURCE = "cDataSource";
  private RestrictionsString cDataSource;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private RestrictionsDate lastSeen;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_C_LABEL_MISSING = "cLabelMissing";
  private RestrictionsString cLabelMissing;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private RestrictionsNumeric heatEmission;

  public static final String JSON_PROPERTY_HW_REVISION = "hwRevision";
  private RestrictionsString hwRevision;

  public PersonGroupChassisEntityRestriction() {
  }

  public PersonGroupChassisEntityRestriction swRevision(RestrictionsString swRevision) {
    
    this.swRevision = swRevision;
    return this;
  }

   /**
   * Get swRevision
   * @return swRevision
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSwRevision() {
    return swRevision;
  }


  @JsonProperty(JSON_PROPERTY_SW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwRevision(RestrictionsString swRevision) {
    this.swRevision = swRevision;
  }


  public PersonGroupChassisEntityRestriction planStatus(RestrictionsString planStatus) {
    
    this.planStatus = planStatus;
    return this;
  }

   /**
   * Get planStatus
   * @return planStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPlanStatus() {
    return planStatus;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanStatus(RestrictionsString planStatus) {
    this.planStatus = planStatus;
  }


  public PersonGroupChassisEntityRestriction systemRuntime(RestrictionsNumeric systemRuntime) {
    
    this.systemRuntime = systemRuntime;
    return this;
  }

   /**
   * Get systemRuntime
   * @return systemRuntime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getSystemRuntime() {
    return systemRuntime;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemRuntime(RestrictionsNumeric systemRuntime) {
    this.systemRuntime = systemRuntime;
  }


  public PersonGroupChassisEntityRestriction cDataSourceId(RestrictionsString cDataSourceId) {
    
    this.cDataSourceId = cDataSourceId;
    return this;
  }

   /**
   * Get cDataSourceId
   * @return cDataSourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDataSourceId() {
    return cDataSourceId;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSourceId(RestrictionsString cDataSourceId) {
    this.cDataSourceId = cDataSourceId;
  }


  public PersonGroupChassisEntityRestriction remark(RestrictionsString remark) {
    
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


  public PersonGroupChassisEntityRestriction cInventoryNo(RestrictionsString cInventoryNo) {
    
    this.cInventoryNo = cInventoryNo;
    return this;
  }

   /**
   * Get cInventoryNo
   * @return cInventoryNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcInventoryNo() {
    return cInventoryNo;
  }


  @JsonProperty(JSON_PROPERTY_C_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcInventoryNo(RestrictionsString cInventoryNo) {
    this.cInventoryNo = cInventoryNo;
  }


  public PersonGroupChassisEntityRestriction supplier(RestrictionsString supplier) {
    
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSupplier() {
    return supplier;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplier(RestrictionsString supplier) {
    this.supplier = supplier;
  }


  public PersonGroupChassisEntityRestriction cDeliveryNo(RestrictionsString cDeliveryNo) {
    
    this.cDeliveryNo = cDeliveryNo;
    return this;
  }

   /**
   * Get cDeliveryNo
   * @return cDeliveryNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DELIVERY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDeliveryNo() {
    return cDeliveryNo;
  }


  @JsonProperty(JSON_PROPERTY_C_DELIVERY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDeliveryNo(RestrictionsString cDeliveryNo) {
    this.cDeliveryNo = cDeliveryNo;
  }


  public PersonGroupChassisEntityRestriction id(RestrictionsString id) {
    
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


  public PersonGroupChassisEntityRestriction cReferenceT1(RestrictionsString cReferenceT1) {
    
    this.cReferenceT1 = cReferenceT1;
    return this;
  }

   /**
   * Get cReferenceT1
   * @return cReferenceT1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcReferenceT1() {
    return cReferenceT1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReferenceT1(RestrictionsString cReferenceT1) {
    this.cReferenceT1 = cReferenceT1;
  }


  public PersonGroupChassisEntityRestriction climateRelevant(RestrictionsBoolean climateRelevant) {
    
    this.climateRelevant = climateRelevant;
    return this;
  }

   /**
   * Get climateRelevant
   * @return climateRelevant
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIMATE_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getClimateRelevant() {
    return climateRelevant;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateRelevant(RestrictionsBoolean climateRelevant) {
    this.climateRelevant = climateRelevant;
  }


  public PersonGroupChassisEntityRestriction cDataSourceDeleted(RestrictionsString cDataSourceDeleted) {
    
    this.cDataSourceDeleted = cDataSourceDeleted;
    return this;
  }

   /**
   * Get cDataSourceDeleted
   * @return cDataSourceDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDataSourceDeleted() {
    return cDataSourceDeleted;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSourceDeleted(RestrictionsString cDataSourceDeleted) {
    this.cDataSourceDeleted = cDataSourceDeleted;
  }


  public PersonGroupChassisEntityRestriction powerConsumption(RestrictionsNumeric powerConsumption) {
    
    this.powerConsumption = powerConsumption;
    return this;
  }

   /**
   * Get powerConsumption
   * @return powerConsumption
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPowerConsumption() {
    return powerConsumption;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumption(RestrictionsNumeric powerConsumption) {
    this.powerConsumption = powerConsumption;
  }


  public PersonGroupChassisEntityRestriction warrantyUntil(RestrictionsDate warrantyUntil) {
    
    this.warrantyUntil = warrantyUntil;
    return this;
  }

   /**
   * Get warrantyUntil
   * @return warrantyUntil
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARRANTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getWarrantyUntil() {
    return warrantyUntil;
  }


  @JsonProperty(JSON_PROPERTY_WARRANTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarrantyUntil(RestrictionsDate warrantyUntil) {
    this.warrantyUntil = warrantyUntil;
  }


  public PersonGroupChassisEntityRestriction powerSwitchingStatus(RestrictionsString powerSwitchingStatus) {
    
    this.powerSwitchingStatus = powerSwitchingStatus;
    return this;
  }

   /**
   * Get powerSwitchingStatus
   * @return powerSwitchingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_SWITCHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPowerSwitchingStatus() {
    return powerSwitchingStatus;
  }


  @JsonProperty(JSON_PROPERTY_POWER_SWITCHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerSwitchingStatus(RestrictionsString powerSwitchingStatus) {
    this.powerSwitchingStatus = powerSwitchingStatus;
  }


  public PersonGroupChassisEntityRestriction cReferenceV1(RestrictionsString cReferenceV1) {
    
    this.cReferenceV1 = cReferenceV1;
    return this;
  }

   /**
   * Get cReferenceV1
   * @return cReferenceV1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcReferenceV1() {
    return cReferenceV1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReferenceV1(RestrictionsString cReferenceV1) {
    this.cReferenceV1 = cReferenceV1;
  }


  public PersonGroupChassisEntityRestriction ipAddress(RestrictionsString ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(RestrictionsString ipAddress) {
    this.ipAddress = ipAddress;
  }


  public PersonGroupChassisEntityRestriction hostId(RestrictionsString hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getHostId() {
    return hostId;
  }


  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostId(RestrictionsString hostId) {
    this.hostId = hostId;
  }


  public PersonGroupChassisEntityRestriction weight(RestrictionsNumeric weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(RestrictionsNumeric weight) {
    this.weight = weight;
  }


  public PersonGroupChassisEntityRestriction supplyDate(RestrictionsDate supplyDate) {
    
    this.supplyDate = supplyDate;
    return this;
  }

   /**
   * Get supplyDate
   * @return supplyDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getSupplyDate() {
    return supplyDate;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplyDate(RestrictionsDate supplyDate) {
    this.supplyDate = supplyDate;
  }


  public PersonGroupChassisEntityRestriction elid(RestrictionsString elid) {
    
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


  public PersonGroupChassisEntityRestriction serialNo(RestrictionsString serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * Get serialNo
   * @return serialNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSerialNo() {
    return serialNo;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNo(RestrictionsString serialNo) {
    this.serialNo = serialNo;
  }


  public PersonGroupChassisEntityRestriction cMacAddress(RestrictionsString cMacAddress) {
    
    this.cMacAddress = cMacAddress;
    return this;
  }

   /**
   * Get cMacAddress
   * @return cMacAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcMacAddress() {
    return cMacAddress;
  }


  @JsonProperty(JSON_PROPERTY_C_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcMacAddress(RestrictionsString cMacAddress) {
    this.cMacAddress = cMacAddress;
  }


  public PersonGroupChassisEntityRestriction macAddress(RestrictionsString macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMacAddress() {
    return macAddress;
  }


  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacAddress(RestrictionsString macAddress) {
    this.macAddress = macAddress;
  }


  public PersonGroupChassisEntityRestriction cDataSource(RestrictionsString cDataSource) {
    
    this.cDataSource = cDataSource;
    return this;
  }

   /**
   * Get cDataSource
   * @return cDataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDataSource() {
    return cDataSource;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSource(RestrictionsString cDataSource) {
    this.cDataSource = cDataSource;
  }


  public PersonGroupChassisEntityRestriction lastSeen(RestrictionsDate lastSeen) {
    
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

  public RestrictionsDate getLastSeen() {
    return lastSeen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeen(RestrictionsDate lastSeen) {
    this.lastSeen = lastSeen;
  }


  public PersonGroupChassisEntityRestriction typeElid(RestrictionsString typeElid) {
    
    this.typeElid = typeElid;
    return this;
  }

   /**
   * Get typeElid
   * @return typeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(RestrictionsString typeElid) {
    this.typeElid = typeElid;
  }


  public PersonGroupChassisEntityRestriction cLabelMissing(RestrictionsString cLabelMissing) {
    
    this.cLabelMissing = cLabelMissing;
    return this;
  }

   /**
   * Get cLabelMissing
   * @return cLabelMissing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_LABEL_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcLabelMissing() {
    return cLabelMissing;
  }


  @JsonProperty(JSON_PROPERTY_C_LABEL_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLabelMissing(RestrictionsString cLabelMissing) {
    this.cLabelMissing = cLabelMissing;
  }


  public PersonGroupChassisEntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public PersonGroupChassisEntityRestriction heatEmission(RestrictionsNumeric heatEmission) {
    
    this.heatEmission = heatEmission;
    return this;
  }

   /**
   * Get heatEmission
   * @return heatEmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getHeatEmission() {
    return heatEmission;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmission(RestrictionsNumeric heatEmission) {
    this.heatEmission = heatEmission;
  }


  public PersonGroupChassisEntityRestriction hwRevision(RestrictionsString hwRevision) {
    
    this.hwRevision = hwRevision;
    return this;
  }

   /**
   * Get hwRevision
   * @return hwRevision
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getHwRevision() {
    return hwRevision;
  }


  @JsonProperty(JSON_PROPERTY_HW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHwRevision(RestrictionsString hwRevision) {
    this.hwRevision = hwRevision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonGroupChassisEntityRestriction personGroupChassisEntityRestriction = (PersonGroupChassisEntityRestriction) o;
    return Objects.equals(this.swRevision, personGroupChassisEntityRestriction.swRevision) &&
        Objects.equals(this.planStatus, personGroupChassisEntityRestriction.planStatus) &&
        Objects.equals(this.systemRuntime, personGroupChassisEntityRestriction.systemRuntime) &&
        Objects.equals(this.cDataSourceId, personGroupChassisEntityRestriction.cDataSourceId) &&
        Objects.equals(this.remark, personGroupChassisEntityRestriction.remark) &&
        Objects.equals(this.cInventoryNo, personGroupChassisEntityRestriction.cInventoryNo) &&
        Objects.equals(this.supplier, personGroupChassisEntityRestriction.supplier) &&
        Objects.equals(this.cDeliveryNo, personGroupChassisEntityRestriction.cDeliveryNo) &&
        Objects.equals(this.id, personGroupChassisEntityRestriction.id) &&
        Objects.equals(this.cReferenceT1, personGroupChassisEntityRestriction.cReferenceT1) &&
        Objects.equals(this.climateRelevant, personGroupChassisEntityRestriction.climateRelevant) &&
        Objects.equals(this.cDataSourceDeleted, personGroupChassisEntityRestriction.cDataSourceDeleted) &&
        Objects.equals(this.powerConsumption, personGroupChassisEntityRestriction.powerConsumption) &&
        Objects.equals(this.warrantyUntil, personGroupChassisEntityRestriction.warrantyUntil) &&
        Objects.equals(this.powerSwitchingStatus, personGroupChassisEntityRestriction.powerSwitchingStatus) &&
        Objects.equals(this.cReferenceV1, personGroupChassisEntityRestriction.cReferenceV1) &&
        Objects.equals(this.ipAddress, personGroupChassisEntityRestriction.ipAddress) &&
        Objects.equals(this.hostId, personGroupChassisEntityRestriction.hostId) &&
        Objects.equals(this.weight, personGroupChassisEntityRestriction.weight) &&
        Objects.equals(this.supplyDate, personGroupChassisEntityRestriction.supplyDate) &&
        Objects.equals(this.elid, personGroupChassisEntityRestriction.elid) &&
        Objects.equals(this.serialNo, personGroupChassisEntityRestriction.serialNo) &&
        Objects.equals(this.cMacAddress, personGroupChassisEntityRestriction.cMacAddress) &&
        Objects.equals(this.macAddress, personGroupChassisEntityRestriction.macAddress) &&
        Objects.equals(this.cDataSource, personGroupChassisEntityRestriction.cDataSource) &&
        Objects.equals(this.lastSeen, personGroupChassisEntityRestriction.lastSeen) &&
        Objects.equals(this.typeElid, personGroupChassisEntityRestriction.typeElid) &&
        Objects.equals(this.cLabelMissing, personGroupChassisEntityRestriction.cLabelMissing) &&
        Objects.equals(this.visibleId, personGroupChassisEntityRestriction.visibleId) &&
        Objects.equals(this.heatEmission, personGroupChassisEntityRestriction.heatEmission) &&
        Objects.equals(this.hwRevision, personGroupChassisEntityRestriction.hwRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swRevision, planStatus, systemRuntime, cDataSourceId, remark, cInventoryNo, supplier, cDeliveryNo, id, cReferenceT1, climateRelevant, cDataSourceDeleted, powerConsumption, warrantyUntil, powerSwitchingStatus, cReferenceV1, ipAddress, hostId, weight, supplyDate, elid, serialNo, cMacAddress, macAddress, cDataSource, lastSeen, typeElid, cLabelMissing, visibleId, heatEmission, hwRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGroupChassisEntityRestriction {\n");
    sb.append("    swRevision: ").append(toIndentedString(swRevision)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    cDataSourceId: ").append(toIndentedString(cDataSourceId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    cDeliveryNo: ").append(toIndentedString(cDeliveryNo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cReferenceT1: ").append(toIndentedString(cReferenceT1)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    cDataSourceDeleted: ").append(toIndentedString(cDataSourceDeleted)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    warrantyUntil: ").append(toIndentedString(warrantyUntil)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    cReferenceV1: ").append(toIndentedString(cReferenceV1)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    supplyDate: ").append(toIndentedString(supplyDate)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    cMacAddress: ").append(toIndentedString(cMacAddress)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    cDataSource: ").append(toIndentedString(cDataSource)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    cLabelMissing: ").append(toIndentedString(cLabelMissing)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("    hwRevision: ").append(toIndentedString(hwRevision)).append("\n");
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
