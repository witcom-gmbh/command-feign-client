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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceMasterNmModulesEntityRestriction
 */
@JsonPropertyOrder({
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_PLAN_STATUS,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SYSTEM_RUNTIME,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_REMARK,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_C_INVENTORY_NO,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_IP_GATEWAY,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SERVICE_END,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SUPPLIER,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_C_DELIVERY_NO,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_ID,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_CLIMATE_RELEVANT,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_POWER_CONSUMPTION,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_WARRANTY_UNTIL,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_IP_DOMAIN,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_IP_ADDRESS,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_HOST_ID,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_WEIGHT,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SUPPLY_DATE,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_ELID,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SERIAL_NO,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_IP_HOSTNAME,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_LAST_SEEN,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_TYPE_ELID,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_C_LABEL_MISSING,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SERVICE,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_HEAT_EMISSION,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_HW_REVISION,
  DeviceMasterNmModulesEntityRestriction.JSON_PROPERTY_SERVICE_AGENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class DeviceMasterNmModulesEntityRestriction {
  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private RestrictionsString planStatus;

  public static final String JSON_PROPERTY_SYSTEM_RUNTIME = "systemRuntime";
  private RestrictionsNumeric systemRuntime;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private RestrictionsString cInventoryNo;

  public static final String JSON_PROPERTY_IP_GATEWAY = "ipGateway";
  private RestrictionsString ipGateway;

  public static final String JSON_PROPERTY_SERVICE_END = "serviceEnd";
  private RestrictionsDate serviceEnd;

  public static final String JSON_PROPERTY_SUPPLIER = "supplier";
  private RestrictionsString supplier;

  public static final String JSON_PROPERTY_C_DELIVERY_NO = "cDeliveryNo";
  private RestrictionsString cDeliveryNo;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private RestrictionsBoolean climateRelevant;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private RestrictionsNumeric powerConsumption;

  public static final String JSON_PROPERTY_WARRANTY_UNTIL = "warrantyUntil";
  private RestrictionsDate warrantyUntil;

  public static final String JSON_PROPERTY_IP_DOMAIN = "ipDomain";
  private RestrictionsString ipDomain;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private RestrictionsString powerSwitchingStatus;

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

  public static final String JSON_PROPERTY_IP_HOSTNAME = "ipHostname";
  private RestrictionsString ipHostname;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private RestrictionsDate lastSeen;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_C_LABEL_MISSING = "cLabelMissing";
  private RestrictionsString cLabelMissing;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private RestrictionsBoolean service;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private RestrictionsNumeric heatEmission;

  public static final String JSON_PROPERTY_HW_REVISION = "hwRevision";
  private RestrictionsString hwRevision;

  public static final String JSON_PROPERTY_SERVICE_AGENCY = "serviceAgency";
  private RestrictionsString serviceAgency;

  public DeviceMasterNmModulesEntityRestriction() {
  }

  public DeviceMasterNmModulesEntityRestriction planStatus(RestrictionsString planStatus) {
    
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


  public DeviceMasterNmModulesEntityRestriction systemRuntime(RestrictionsNumeric systemRuntime) {
    
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


  public DeviceMasterNmModulesEntityRestriction remark(RestrictionsString remark) {
    
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


  public DeviceMasterNmModulesEntityRestriction cInventoryNo(RestrictionsString cInventoryNo) {
    
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


  public DeviceMasterNmModulesEntityRestriction ipGateway(RestrictionsString ipGateway) {
    
    this.ipGateway = ipGateway;
    return this;
  }

   /**
   * Get ipGateway
   * @return ipGateway
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIpGateway() {
    return ipGateway;
  }


  @JsonProperty(JSON_PROPERTY_IP_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpGateway(RestrictionsString ipGateway) {
    this.ipGateway = ipGateway;
  }


  public DeviceMasterNmModulesEntityRestriction serviceEnd(RestrictionsDate serviceEnd) {
    
    this.serviceEnd = serviceEnd;
    return this;
  }

   /**
   * Get serviceEnd
   * @return serviceEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getServiceEnd() {
    return serviceEnd;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceEnd(RestrictionsDate serviceEnd) {
    this.serviceEnd = serviceEnd;
  }


  public DeviceMasterNmModulesEntityRestriction supplier(RestrictionsString supplier) {
    
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


  public DeviceMasterNmModulesEntityRestriction cDeliveryNo(RestrictionsString cDeliveryNo) {
    
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


  public DeviceMasterNmModulesEntityRestriction id(RestrictionsString id) {
    
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


  public DeviceMasterNmModulesEntityRestriction climateRelevant(RestrictionsBoolean climateRelevant) {
    
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


  public DeviceMasterNmModulesEntityRestriction powerConsumption(RestrictionsNumeric powerConsumption) {
    
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


  public DeviceMasterNmModulesEntityRestriction warrantyUntil(RestrictionsDate warrantyUntil) {
    
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


  public DeviceMasterNmModulesEntityRestriction ipDomain(RestrictionsString ipDomain) {
    
    this.ipDomain = ipDomain;
    return this;
  }

   /**
   * Get ipDomain
   * @return ipDomain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIpDomain() {
    return ipDomain;
  }


  @JsonProperty(JSON_PROPERTY_IP_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpDomain(RestrictionsString ipDomain) {
    this.ipDomain = ipDomain;
  }


  public DeviceMasterNmModulesEntityRestriction powerSwitchingStatus(RestrictionsString powerSwitchingStatus) {
    
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


  public DeviceMasterNmModulesEntityRestriction ipAddress(RestrictionsString ipAddress) {
    
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


  public DeviceMasterNmModulesEntityRestriction hostId(RestrictionsString hostId) {
    
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


  public DeviceMasterNmModulesEntityRestriction weight(RestrictionsNumeric weight) {
    
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


  public DeviceMasterNmModulesEntityRestriction supplyDate(RestrictionsDate supplyDate) {
    
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


  public DeviceMasterNmModulesEntityRestriction elid(RestrictionsString elid) {
    
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


  public DeviceMasterNmModulesEntityRestriction serialNo(RestrictionsString serialNo) {
    
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


  public DeviceMasterNmModulesEntityRestriction ipHostname(RestrictionsString ipHostname) {
    
    this.ipHostname = ipHostname;
    return this;
  }

   /**
   * Get ipHostname
   * @return ipHostname
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIpHostname() {
    return ipHostname;
  }


  @JsonProperty(JSON_PROPERTY_IP_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpHostname(RestrictionsString ipHostname) {
    this.ipHostname = ipHostname;
  }


  public DeviceMasterNmModulesEntityRestriction lastSeen(RestrictionsDate lastSeen) {
    
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


  public DeviceMasterNmModulesEntityRestriction typeElid(RestrictionsString typeElid) {
    
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


  public DeviceMasterNmModulesEntityRestriction cLabelMissing(RestrictionsString cLabelMissing) {
    
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


  public DeviceMasterNmModulesEntityRestriction service(RestrictionsBoolean service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(RestrictionsBoolean service) {
    this.service = service;
  }


  public DeviceMasterNmModulesEntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public DeviceMasterNmModulesEntityRestriction heatEmission(RestrictionsNumeric heatEmission) {
    
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


  public DeviceMasterNmModulesEntityRestriction hwRevision(RestrictionsString hwRevision) {
    
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


  public DeviceMasterNmModulesEntityRestriction serviceAgency(RestrictionsString serviceAgency) {
    
    this.serviceAgency = serviceAgency;
    return this;
  }

   /**
   * Get serviceAgency
   * @return serviceAgency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_AGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getServiceAgency() {
    return serviceAgency;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_AGENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceAgency(RestrictionsString serviceAgency) {
    this.serviceAgency = serviceAgency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMasterNmModulesEntityRestriction deviceMasterNmModulesEntityRestriction = (DeviceMasterNmModulesEntityRestriction) o;
    return Objects.equals(this.planStatus, deviceMasterNmModulesEntityRestriction.planStatus) &&
        Objects.equals(this.systemRuntime, deviceMasterNmModulesEntityRestriction.systemRuntime) &&
        Objects.equals(this.remark, deviceMasterNmModulesEntityRestriction.remark) &&
        Objects.equals(this.cInventoryNo, deviceMasterNmModulesEntityRestriction.cInventoryNo) &&
        Objects.equals(this.ipGateway, deviceMasterNmModulesEntityRestriction.ipGateway) &&
        Objects.equals(this.serviceEnd, deviceMasterNmModulesEntityRestriction.serviceEnd) &&
        Objects.equals(this.supplier, deviceMasterNmModulesEntityRestriction.supplier) &&
        Objects.equals(this.cDeliveryNo, deviceMasterNmModulesEntityRestriction.cDeliveryNo) &&
        Objects.equals(this.id, deviceMasterNmModulesEntityRestriction.id) &&
        Objects.equals(this.climateRelevant, deviceMasterNmModulesEntityRestriction.climateRelevant) &&
        Objects.equals(this.powerConsumption, deviceMasterNmModulesEntityRestriction.powerConsumption) &&
        Objects.equals(this.warrantyUntil, deviceMasterNmModulesEntityRestriction.warrantyUntil) &&
        Objects.equals(this.ipDomain, deviceMasterNmModulesEntityRestriction.ipDomain) &&
        Objects.equals(this.powerSwitchingStatus, deviceMasterNmModulesEntityRestriction.powerSwitchingStatus) &&
        Objects.equals(this.ipAddress, deviceMasterNmModulesEntityRestriction.ipAddress) &&
        Objects.equals(this.hostId, deviceMasterNmModulesEntityRestriction.hostId) &&
        Objects.equals(this.weight, deviceMasterNmModulesEntityRestriction.weight) &&
        Objects.equals(this.supplyDate, deviceMasterNmModulesEntityRestriction.supplyDate) &&
        Objects.equals(this.elid, deviceMasterNmModulesEntityRestriction.elid) &&
        Objects.equals(this.serialNo, deviceMasterNmModulesEntityRestriction.serialNo) &&
        Objects.equals(this.ipHostname, deviceMasterNmModulesEntityRestriction.ipHostname) &&
        Objects.equals(this.lastSeen, deviceMasterNmModulesEntityRestriction.lastSeen) &&
        Objects.equals(this.typeElid, deviceMasterNmModulesEntityRestriction.typeElid) &&
        Objects.equals(this.cLabelMissing, deviceMasterNmModulesEntityRestriction.cLabelMissing) &&
        Objects.equals(this.service, deviceMasterNmModulesEntityRestriction.service) &&
        Objects.equals(this.visibleId, deviceMasterNmModulesEntityRestriction.visibleId) &&
        Objects.equals(this.heatEmission, deviceMasterNmModulesEntityRestriction.heatEmission) &&
        Objects.equals(this.hwRevision, deviceMasterNmModulesEntityRestriction.hwRevision) &&
        Objects.equals(this.serviceAgency, deviceMasterNmModulesEntityRestriction.serviceAgency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planStatus, systemRuntime, remark, cInventoryNo, ipGateway, serviceEnd, supplier, cDeliveryNo, id, climateRelevant, powerConsumption, warrantyUntil, ipDomain, powerSwitchingStatus, ipAddress, hostId, weight, supplyDate, elid, serialNo, ipHostname, lastSeen, typeElid, cLabelMissing, service, visibleId, heatEmission, hwRevision, serviceAgency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMasterNmModulesEntityRestriction {\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    ipGateway: ").append(toIndentedString(ipGateway)).append("\n");
    sb.append("    serviceEnd: ").append(toIndentedString(serviceEnd)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    cDeliveryNo: ").append(toIndentedString(cDeliveryNo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    warrantyUntil: ").append(toIndentedString(warrantyUntil)).append("\n");
    sb.append("    ipDomain: ").append(toIndentedString(ipDomain)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    supplyDate: ").append(toIndentedString(supplyDate)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    ipHostname: ").append(toIndentedString(ipHostname)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    cLabelMissing: ").append(toIndentedString(cLabelMissing)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("    hwRevision: ").append(toIndentedString(hwRevision)).append("\n");
    sb.append("    serviceAgency: ").append(toIndentedString(serviceAgency)).append("\n");
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

