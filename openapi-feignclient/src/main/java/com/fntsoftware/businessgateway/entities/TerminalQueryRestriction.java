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
 * TerminalQueryRestriction
 */
@JsonPropertyOrder({
  TerminalQueryRestriction.JSON_PROPERTY_POWER_CONSUMPTION_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_PLAN_STATUS,
  TerminalQueryRestriction.JSON_PROPERTY_SYSTEM_RUNTIME,
  TerminalQueryRestriction.JSON_PROPERTY_WEIGHT_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_REMARK,
  TerminalQueryRestriction.JSON_PROPERTY_C_INVENTORY_NO,
  TerminalQueryRestriction.JSON_PROPERTY_SERVICE_END,
  TerminalQueryRestriction.JSON_PROPERTY_SUPPLIER,
  TerminalQueryRestriction.JSON_PROPERTY_ID,
  TerminalQueryRestriction.JSON_PROPERTY_HEAT_EMISSION_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_CLIMATE_RELEVANT,
  TerminalQueryRestriction.JSON_PROPERTY_POWER_CONSUMPTION,
  TerminalQueryRestriction.JSON_PROPERTY_WARRANTY_UNTIL,
  TerminalQueryRestriction.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  TerminalQueryRestriction.JSON_PROPERTY_IP_ADDRESS,
  TerminalQueryRestriction.JSON_PROPERTY_DIMENSION_WIDTH_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_HOST_ID,
  TerminalQueryRestriction.JSON_PROPERTY_WEIGHT,
  TerminalQueryRestriction.JSON_PROPERTY_SUPPLY_DATE,
  TerminalQueryRestriction.JSON_PROPERTY_ELID,
  TerminalQueryRestriction.JSON_PROPERTY_SERIAL_NO,
  TerminalQueryRestriction.JSON_PROPERTY_DIMENSION_DEPTH_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_DIMENSION_HEIGHT_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_MAC_ADDRESS,
  TerminalQueryRestriction.JSON_PROPERTY_CLIMATE_CAPACITY_SPC,
  TerminalQueryRestriction.JSON_PROPERTY_LAST_SEEN,
  TerminalQueryRestriction.JSON_PROPERTY_TYPE_ELID,
  TerminalQueryRestriction.JSON_PROPERTY_SERVICE,
  TerminalQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  TerminalQueryRestriction.JSON_PROPERTY_HEAT_EMISSION,
  TerminalQueryRestriction.JSON_PROPERTY_FIRST,
  TerminalQueryRestriction.JSON_PROPERTY_SERVICE_AGENCY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class TerminalQueryRestriction {
  public static final String JSON_PROPERTY_POWER_CONSUMPTION_SPC = "powerConsumptionSpc";
  private RestrictionsNumeric powerConsumptionSpc;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private RestrictionsString planStatus;

  public static final String JSON_PROPERTY_SYSTEM_RUNTIME = "systemRuntime";
  private RestrictionsNumeric systemRuntime;

  public static final String JSON_PROPERTY_WEIGHT_SPC = "weightSpc";
  private RestrictionsNumeric weightSpc;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private RestrictionsString cInventoryNo;

  public static final String JSON_PROPERTY_SERVICE_END = "serviceEnd";
  private RestrictionsDate serviceEnd;

  public static final String JSON_PROPERTY_SUPPLIER = "supplier";
  private RestrictionsString supplier;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_HEAT_EMISSION_SPC = "heatEmissionSpc";
  private RestrictionsNumeric heatEmissionSpc;

  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private RestrictionsBoolean climateRelevant;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private RestrictionsNumeric powerConsumption;

  public static final String JSON_PROPERTY_WARRANTY_UNTIL = "warrantyUntil";
  private RestrictionsDate warrantyUntil;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private RestrictionsString powerSwitchingStatus;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private RestrictionsString ipAddress;

  public static final String JSON_PROPERTY_DIMENSION_WIDTH_SPC = "dimensionWidthSpc";
  private RestrictionsNumeric dimensionWidthSpc;

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

  public static final String JSON_PROPERTY_DIMENSION_DEPTH_SPC = "dimensionDepthSpc";
  private RestrictionsNumeric dimensionDepthSpc;

  public static final String JSON_PROPERTY_DIMENSION_HEIGHT_SPC = "dimensionHeightSpc";
  private RestrictionsNumeric dimensionHeightSpc;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "macAddress";
  private RestrictionsString macAddress;

  public static final String JSON_PROPERTY_CLIMATE_CAPACITY_SPC = "climateCapacitySpc";
  private RestrictionsNumeric climateCapacitySpc;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private RestrictionsDate lastSeen;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private RestrictionsBoolean service;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private RestrictionsNumeric heatEmission;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public static final String JSON_PROPERTY_SERVICE_AGENCY = "serviceAgency";
  private RestrictionsString serviceAgency;

  public TerminalQueryRestriction() {
  }

  public TerminalQueryRestriction powerConsumptionSpc(RestrictionsNumeric powerConsumptionSpc) {
    
    this.powerConsumptionSpc = powerConsumptionSpc;
    return this;
  }

   /**
   * Get powerConsumptionSpc
   * @return powerConsumptionSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPowerConsumptionSpc() {
    return powerConsumptionSpc;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumptionSpc(RestrictionsNumeric powerConsumptionSpc) {
    this.powerConsumptionSpc = powerConsumptionSpc;
  }


  public TerminalQueryRestriction planStatus(RestrictionsString planStatus) {
    
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


  public TerminalQueryRestriction systemRuntime(RestrictionsNumeric systemRuntime) {
    
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


  public TerminalQueryRestriction weightSpc(RestrictionsNumeric weightSpc) {
    
    this.weightSpc = weightSpc;
    return this;
  }

   /**
   * Get weightSpc
   * @return weightSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getWeightSpc() {
    return weightSpc;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightSpc(RestrictionsNumeric weightSpc) {
    this.weightSpc = weightSpc;
  }


  public TerminalQueryRestriction remark(RestrictionsString remark) {
    
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


  public TerminalQueryRestriction cInventoryNo(RestrictionsString cInventoryNo) {
    
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


  public TerminalQueryRestriction serviceEnd(RestrictionsDate serviceEnd) {
    
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


  public TerminalQueryRestriction supplier(RestrictionsString supplier) {
    
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


  public TerminalQueryRestriction id(RestrictionsString id) {
    
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


  public TerminalQueryRestriction heatEmissionSpc(RestrictionsNumeric heatEmissionSpc) {
    
    this.heatEmissionSpc = heatEmissionSpc;
    return this;
  }

   /**
   * Get heatEmissionSpc
   * @return heatEmissionSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getHeatEmissionSpc() {
    return heatEmissionSpc;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmissionSpc(RestrictionsNumeric heatEmissionSpc) {
    this.heatEmissionSpc = heatEmissionSpc;
  }


  public TerminalQueryRestriction climateRelevant(RestrictionsBoolean climateRelevant) {
    
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


  public TerminalQueryRestriction powerConsumption(RestrictionsNumeric powerConsumption) {
    
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


  public TerminalQueryRestriction warrantyUntil(RestrictionsDate warrantyUntil) {
    
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


  public TerminalQueryRestriction powerSwitchingStatus(RestrictionsString powerSwitchingStatus) {
    
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


  public TerminalQueryRestriction ipAddress(RestrictionsString ipAddress) {
    
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


  public TerminalQueryRestriction dimensionWidthSpc(RestrictionsNumeric dimensionWidthSpc) {
    
    this.dimensionWidthSpc = dimensionWidthSpc;
    return this;
  }

   /**
   * Get dimensionWidthSpc
   * @return dimensionWidthSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDimensionWidthSpc() {
    return dimensionWidthSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionWidthSpc(RestrictionsNumeric dimensionWidthSpc) {
    this.dimensionWidthSpc = dimensionWidthSpc;
  }


  public TerminalQueryRestriction hostId(RestrictionsString hostId) {
    
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


  public TerminalQueryRestriction weight(RestrictionsNumeric weight) {
    
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


  public TerminalQueryRestriction supplyDate(RestrictionsDate supplyDate) {
    
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


  public TerminalQueryRestriction elid(RestrictionsString elid) {
    
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


  public TerminalQueryRestriction serialNo(RestrictionsString serialNo) {
    
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


  public TerminalQueryRestriction dimensionDepthSpc(RestrictionsNumeric dimensionDepthSpc) {
    
    this.dimensionDepthSpc = dimensionDepthSpc;
    return this;
  }

   /**
   * Get dimensionDepthSpc
   * @return dimensionDepthSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDimensionDepthSpc() {
    return dimensionDepthSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionDepthSpc(RestrictionsNumeric dimensionDepthSpc) {
    this.dimensionDepthSpc = dimensionDepthSpc;
  }


  public TerminalQueryRestriction dimensionHeightSpc(RestrictionsNumeric dimensionHeightSpc) {
    
    this.dimensionHeightSpc = dimensionHeightSpc;
    return this;
  }

   /**
   * Get dimensionHeightSpc
   * @return dimensionHeightSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDimensionHeightSpc() {
    return dimensionHeightSpc;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionHeightSpc(RestrictionsNumeric dimensionHeightSpc) {
    this.dimensionHeightSpc = dimensionHeightSpc;
  }


  public TerminalQueryRestriction macAddress(RestrictionsString macAddress) {
    
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


  public TerminalQueryRestriction climateCapacitySpc(RestrictionsNumeric climateCapacitySpc) {
    
    this.climateCapacitySpc = climateCapacitySpc;
    return this;
  }

   /**
   * Get climateCapacitySpc
   * @return climateCapacitySpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getClimateCapacitySpc() {
    return climateCapacitySpc;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_CAPACITY_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateCapacitySpc(RestrictionsNumeric climateCapacitySpc) {
    this.climateCapacitySpc = climateCapacitySpc;
  }


  public TerminalQueryRestriction lastSeen(RestrictionsDate lastSeen) {
    
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


  public TerminalQueryRestriction typeElid(RestrictionsString typeElid) {
    
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


  public TerminalQueryRestriction service(RestrictionsBoolean service) {
    
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


  public TerminalQueryRestriction visibleId(RestrictionsString visibleId) {
    
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


  public TerminalQueryRestriction heatEmission(RestrictionsNumeric heatEmission) {
    
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


  public TerminalQueryRestriction first(RestrictionsNumeric first) {
    
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


  public TerminalQueryRestriction serviceAgency(RestrictionsString serviceAgency) {
    
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
    TerminalQueryRestriction terminalQueryRestriction = (TerminalQueryRestriction) o;
    return Objects.equals(this.powerConsumptionSpc, terminalQueryRestriction.powerConsumptionSpc) &&
        Objects.equals(this.planStatus, terminalQueryRestriction.planStatus) &&
        Objects.equals(this.systemRuntime, terminalQueryRestriction.systemRuntime) &&
        Objects.equals(this.weightSpc, terminalQueryRestriction.weightSpc) &&
        Objects.equals(this.remark, terminalQueryRestriction.remark) &&
        Objects.equals(this.cInventoryNo, terminalQueryRestriction.cInventoryNo) &&
        Objects.equals(this.serviceEnd, terminalQueryRestriction.serviceEnd) &&
        Objects.equals(this.supplier, terminalQueryRestriction.supplier) &&
        Objects.equals(this.id, terminalQueryRestriction.id) &&
        Objects.equals(this.heatEmissionSpc, terminalQueryRestriction.heatEmissionSpc) &&
        Objects.equals(this.climateRelevant, terminalQueryRestriction.climateRelevant) &&
        Objects.equals(this.powerConsumption, terminalQueryRestriction.powerConsumption) &&
        Objects.equals(this.warrantyUntil, terminalQueryRestriction.warrantyUntil) &&
        Objects.equals(this.powerSwitchingStatus, terminalQueryRestriction.powerSwitchingStatus) &&
        Objects.equals(this.ipAddress, terminalQueryRestriction.ipAddress) &&
        Objects.equals(this.dimensionWidthSpc, terminalQueryRestriction.dimensionWidthSpc) &&
        Objects.equals(this.hostId, terminalQueryRestriction.hostId) &&
        Objects.equals(this.weight, terminalQueryRestriction.weight) &&
        Objects.equals(this.supplyDate, terminalQueryRestriction.supplyDate) &&
        Objects.equals(this.elid, terminalQueryRestriction.elid) &&
        Objects.equals(this.serialNo, terminalQueryRestriction.serialNo) &&
        Objects.equals(this.dimensionDepthSpc, terminalQueryRestriction.dimensionDepthSpc) &&
        Objects.equals(this.dimensionHeightSpc, terminalQueryRestriction.dimensionHeightSpc) &&
        Objects.equals(this.macAddress, terminalQueryRestriction.macAddress) &&
        Objects.equals(this.climateCapacitySpc, terminalQueryRestriction.climateCapacitySpc) &&
        Objects.equals(this.lastSeen, terminalQueryRestriction.lastSeen) &&
        Objects.equals(this.typeElid, terminalQueryRestriction.typeElid) &&
        Objects.equals(this.service, terminalQueryRestriction.service) &&
        Objects.equals(this.visibleId, terminalQueryRestriction.visibleId) &&
        Objects.equals(this.heatEmission, terminalQueryRestriction.heatEmission) &&
        Objects.equals(this.first, terminalQueryRestriction.first) &&
        Objects.equals(this.serviceAgency, terminalQueryRestriction.serviceAgency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumptionSpc, planStatus, systemRuntime, weightSpc, remark, cInventoryNo, serviceEnd, supplier, id, heatEmissionSpc, climateRelevant, powerConsumption, warrantyUntil, powerSwitchingStatus, ipAddress, dimensionWidthSpc, hostId, weight, supplyDate, elid, serialNo, dimensionDepthSpc, dimensionHeightSpc, macAddress, climateCapacitySpc, lastSeen, typeElid, service, visibleId, heatEmission, first, serviceAgency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalQueryRestriction {\n");
    sb.append("    powerConsumptionSpc: ").append(toIndentedString(powerConsumptionSpc)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    weightSpc: ").append(toIndentedString(weightSpc)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    serviceEnd: ").append(toIndentedString(serviceEnd)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heatEmissionSpc: ").append(toIndentedString(heatEmissionSpc)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    warrantyUntil: ").append(toIndentedString(warrantyUntil)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    dimensionWidthSpc: ").append(toIndentedString(dimensionWidthSpc)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    supplyDate: ").append(toIndentedString(supplyDate)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    dimensionDepthSpc: ").append(toIndentedString(dimensionDepthSpc)).append("\n");
    sb.append("    dimensionHeightSpc: ").append(toIndentedString(dimensionHeightSpc)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    climateCapacitySpc: ").append(toIndentedString(climateCapacitySpc)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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

