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
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkSiteRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduCreateLinkWarehouseRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlaceInWarehousePduRequestData
 */
@JsonPropertyOrder({
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CLIMATE_RELEVANT,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_SOURCE_ID,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_POWER_CONSUMPTION,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_SYSTEM_RUNTIME,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_WEIGHT,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CONTEXT_ID,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_REMARK,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_SERIAL_NO,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_NOMINAL_CURRENT,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_INVENTORY_NO,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_LAST_SEEN,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_VISIBLE_ID,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_ID,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_HEAT_EMISSION,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD_PC,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_SITE,
  PlaceInWarehousePduRequestData.JSON_PROPERTY_CREATE_LINK_WAREHOUSE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PlaceInWarehousePduRequestData {
  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private Boolean climateRelevant;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private BigDecimal powerConsumption;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private String powerSwitchingStatus;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_SYSTEM_RUNTIME = "systemRuntime";
  private BigDecimal systemRuntime;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private String serialNo;

  public static final String JSON_PROPERTY_NOMINAL_CURRENT = "nominalCurrent";
  private BigDecimal nominalCurrent;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_INVENTORY_NO = "inventoryNo";
  private String inventoryNo;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private DateTime lastSeen;

  public static final String JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD = "nominalCurrentThreshold";
  private BigDecimal nominalCurrentThreshold;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private BigDecimal heatEmission;

  public static final String JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD_PC = "nominalCurrentThresholdPc";
  private BigDecimal nominalCurrentThresholdPc;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<PlaceInWarehousePduCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER = "createLinkDeviceMaster";
  private PlaceInWarehousePduCreateLinkDeviceMasterRequestData createLinkDeviceMaster;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<PlaceInWarehousePduCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<PlaceInWarehousePduCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<PlaceInWarehousePduCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<PlaceInWarehousePduCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<PlaceInWarehousePduCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_SITE = "createLinkSite";
  private List<PlaceInWarehousePduCreateLinkSiteRequestData> createLinkSite;

  public static final String JSON_PROPERTY_CREATE_LINK_WAREHOUSE = "createLinkWarehouse";
  private PlaceInWarehousePduCreateLinkWarehouseRequestData createLinkWarehouse;

  public PlaceInWarehousePduRequestData() {
  }

  public PlaceInWarehousePduRequestData climateRelevant(Boolean climateRelevant) {
    
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

  public Boolean getClimateRelevant() {
    return climateRelevant;
  }


  @JsonProperty(JSON_PROPERTY_CLIMATE_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClimateRelevant(Boolean climateRelevant) {
    this.climateRelevant = climateRelevant;
  }


  public PlaceInWarehousePduRequestData sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public PlaceInWarehousePduRequestData powerConsumption(BigDecimal powerConsumption) {
    
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

  public BigDecimal getPowerConsumption() {
    return powerConsumption;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumption(BigDecimal powerConsumption) {
    this.powerConsumption = powerConsumption;
  }


  public PlaceInWarehousePduRequestData powerSwitchingStatus(String powerSwitchingStatus) {
    
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

  public String getPowerSwitchingStatus() {
    return powerSwitchingStatus;
  }


  @JsonProperty(JSON_PROPERTY_POWER_SWITCHING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerSwitchingStatus(String powerSwitchingStatus) {
    this.powerSwitchingStatus = powerSwitchingStatus;
  }


  public PlaceInWarehousePduRequestData sourceSystem(String sourceSystem) {
    
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Get sourceSystem
   * @return sourceSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceSystem() {
    return sourceSystem;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }


  public PlaceInWarehousePduRequestData systemRuntime(BigDecimal systemRuntime) {
    
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

  public BigDecimal getSystemRuntime() {
    return systemRuntime;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemRuntime(BigDecimal systemRuntime) {
    this.systemRuntime = systemRuntime;
  }


  public PlaceInWarehousePduRequestData weight(BigDecimal weight) {
    
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

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public PlaceInWarehousePduRequestData contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public PlaceInWarehousePduRequestData remark(String remark) {
    
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


  public PlaceInWarehousePduRequestData serialNo(String serialNo) {
    
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

  public String getSerialNo() {
    return serialNo;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }


  public PlaceInWarehousePduRequestData nominalCurrent(BigDecimal nominalCurrent) {
    
    this.nominalCurrent = nominalCurrent;
    return this;
  }

   /**
   * Get nominalCurrent
   * @return nominalCurrent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNominalCurrent() {
    return nominalCurrent;
  }


  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNominalCurrent(BigDecimal nominalCurrent) {
    this.nominalCurrent = nominalCurrent;
  }


  public PlaceInWarehousePduRequestData ownerSystem(String ownerSystem) {
    
    this.ownerSystem = ownerSystem;
    return this;
  }

   /**
   * Get ownerSystem
   * @return ownerSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerSystem() {
    return ownerSystem;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerSystem(String ownerSystem) {
    this.ownerSystem = ownerSystem;
  }


  public PlaceInWarehousePduRequestData inventoryNo(String inventoryNo) {
    
    this.inventoryNo = inventoryNo;
    return this;
  }

   /**
   * Get inventoryNo
   * @return inventoryNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInventoryNo() {
    return inventoryNo;
  }


  @JsonProperty(JSON_PROPERTY_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInventoryNo(String inventoryNo) {
    this.inventoryNo = inventoryNo;
  }


  public PlaceInWarehousePduRequestData lastSeen(DateTime lastSeen) {
    
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


  public PlaceInWarehousePduRequestData nominalCurrentThreshold(BigDecimal nominalCurrentThreshold) {
    
    this.nominalCurrentThreshold = nominalCurrentThreshold;
    return this;
  }

   /**
   * Get nominalCurrentThreshold
   * @return nominalCurrentThreshold
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNominalCurrentThreshold() {
    return nominalCurrentThreshold;
  }


  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNominalCurrentThreshold(BigDecimal nominalCurrentThreshold) {
    this.nominalCurrentThreshold = nominalCurrentThreshold;
  }


  public PlaceInWarehousePduRequestData visibleId(String visibleId) {
    
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


  public PlaceInWarehousePduRequestData id(String id) {
    
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


  public PlaceInWarehousePduRequestData heatEmission(BigDecimal heatEmission) {
    
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

  public BigDecimal getHeatEmission() {
    return heatEmission;
  }


  @JsonProperty(JSON_PROPERTY_HEAT_EMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeatEmission(BigDecimal heatEmission) {
    this.heatEmission = heatEmission;
  }


  public PlaceInWarehousePduRequestData nominalCurrentThresholdPc(BigDecimal nominalCurrentThresholdPc) {
    
    this.nominalCurrentThresholdPc = nominalCurrentThresholdPc;
    return this;
  }

   /**
   * Get nominalCurrentThresholdPc
   * @return nominalCurrentThresholdPc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD_PC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNominalCurrentThresholdPc() {
    return nominalCurrentThresholdPc;
  }


  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENT_THRESHOLD_PC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNominalCurrentThresholdPc(BigDecimal nominalCurrentThresholdPc) {
    this.nominalCurrentThresholdPc = nominalCurrentThresholdPc;
  }


  public PlaceInWarehousePduRequestData createLinkContract(List<PlaceInWarehousePduCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkContractItem(PlaceInWarehousePduCreateLinkContractRequestData createLinkContractItem) {
    if (this.createLinkContract == null) {
      this.createLinkContract = new ArrayList<>();
    }
    this.createLinkContract.add(createLinkContractItem);
    return this;
  }

   /**
   * Get createLinkContract
   * @return createLinkContract
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<PlaceInWarehousePduCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public PlaceInWarehousePduRequestData createLinkDeviceMaster(PlaceInWarehousePduCreateLinkDeviceMasterRequestData createLinkDeviceMaster) {
    
    this.createLinkDeviceMaster = createLinkDeviceMaster;
    return this;
  }

   /**
   * Get createLinkDeviceMaster
   * @return createLinkDeviceMaster
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PlaceInWarehousePduCreateLinkDeviceMasterRequestData getCreateLinkDeviceMaster() {
    return createLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkDeviceMaster(PlaceInWarehousePduCreateLinkDeviceMasterRequestData createLinkDeviceMaster) {
    this.createLinkDeviceMaster = createLinkDeviceMaster;
  }


  public PlaceInWarehousePduRequestData createLinkFrameContract(List<PlaceInWarehousePduCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkFrameContractItem(PlaceInWarehousePduCreateLinkFrameContractRequestData createLinkFrameContractItem) {
    if (this.createLinkFrameContract == null) {
      this.createLinkFrameContract = new ArrayList<>();
    }
    this.createLinkFrameContract.add(createLinkFrameContractItem);
    return this;
  }

   /**
   * Get createLinkFrameContract
   * @return createLinkFrameContract
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<PlaceInWarehousePduCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public PlaceInWarehousePduRequestData createLinkMaintenanceContract(List<PlaceInWarehousePduCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkMaintenanceContractItem(PlaceInWarehousePduCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
    if (this.createLinkMaintenanceContract == null) {
      this.createLinkMaintenanceContract = new ArrayList<>();
    }
    this.createLinkMaintenanceContract.add(createLinkMaintenanceContractItem);
    return this;
  }

   /**
   * Get createLinkMaintenanceContract
   * @return createLinkMaintenanceContract
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<PlaceInWarehousePduCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public PlaceInWarehousePduRequestData createLinkOrganization(List<PlaceInWarehousePduCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkOrganizationItem(PlaceInWarehousePduCreateLinkOrganizationRequestData createLinkOrganizationItem) {
    if (this.createLinkOrganization == null) {
      this.createLinkOrganization = new ArrayList<>();
    }
    this.createLinkOrganization.add(createLinkOrganizationItem);
    return this;
  }

   /**
   * Get createLinkOrganization
   * @return createLinkOrganization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<PlaceInWarehousePduCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public PlaceInWarehousePduRequestData createLinkPerson(List<PlaceInWarehousePduCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkPersonItem(PlaceInWarehousePduCreateLinkPersonRequestData createLinkPersonItem) {
    if (this.createLinkPerson == null) {
      this.createLinkPerson = new ArrayList<>();
    }
    this.createLinkPerson.add(createLinkPersonItem);
    return this;
  }

   /**
   * Get createLinkPerson
   * @return createLinkPerson
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<PlaceInWarehousePduCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public PlaceInWarehousePduRequestData createLinkPersonGroup(List<PlaceInWarehousePduCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkPersonGroupItem(PlaceInWarehousePduCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
    if (this.createLinkPersonGroup == null) {
      this.createLinkPersonGroup = new ArrayList<>();
    }
    this.createLinkPersonGroup.add(createLinkPersonGroupItem);
    return this;
  }

   /**
   * Get createLinkPersonGroup
   * @return createLinkPersonGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<PlaceInWarehousePduCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public PlaceInWarehousePduRequestData createLinkSite(List<PlaceInWarehousePduCreateLinkSiteRequestData> createLinkSite) {
    
    this.createLinkSite = createLinkSite;
    return this;
  }

  public PlaceInWarehousePduRequestData addCreateLinkSiteItem(PlaceInWarehousePduCreateLinkSiteRequestData createLinkSiteItem) {
    if (this.createLinkSite == null) {
      this.createLinkSite = new ArrayList<>();
    }
    this.createLinkSite.add(createLinkSiteItem);
    return this;
  }

   /**
   * Get createLinkSite
   * @return createLinkSite
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlaceInWarehousePduCreateLinkSiteRequestData> getCreateLinkSite() {
    return createLinkSite;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkSite(List<PlaceInWarehousePduCreateLinkSiteRequestData> createLinkSite) {
    this.createLinkSite = createLinkSite;
  }


  public PlaceInWarehousePduRequestData createLinkWarehouse(PlaceInWarehousePduCreateLinkWarehouseRequestData createLinkWarehouse) {
    
    this.createLinkWarehouse = createLinkWarehouse;
    return this;
  }

   /**
   * Get createLinkWarehouse
   * @return createLinkWarehouse
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PlaceInWarehousePduCreateLinkWarehouseRequestData getCreateLinkWarehouse() {
    return createLinkWarehouse;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkWarehouse(PlaceInWarehousePduCreateLinkWarehouseRequestData createLinkWarehouse) {
    this.createLinkWarehouse = createLinkWarehouse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceInWarehousePduRequestData placeInWarehousePduRequestData = (PlaceInWarehousePduRequestData) o;
    return Objects.equals(this.climateRelevant, placeInWarehousePduRequestData.climateRelevant) &&
        Objects.equals(this.sourceId, placeInWarehousePduRequestData.sourceId) &&
        Objects.equals(this.powerConsumption, placeInWarehousePduRequestData.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, placeInWarehousePduRequestData.powerSwitchingStatus) &&
        Objects.equals(this.sourceSystem, placeInWarehousePduRequestData.sourceSystem) &&
        Objects.equals(this.systemRuntime, placeInWarehousePduRequestData.systemRuntime) &&
        Objects.equals(this.weight, placeInWarehousePduRequestData.weight) &&
        Objects.equals(this.contextId, placeInWarehousePduRequestData.contextId) &&
        Objects.equals(this.remark, placeInWarehousePduRequestData.remark) &&
        Objects.equals(this.serialNo, placeInWarehousePduRequestData.serialNo) &&
        Objects.equals(this.nominalCurrent, placeInWarehousePduRequestData.nominalCurrent) &&
        Objects.equals(this.ownerSystem, placeInWarehousePduRequestData.ownerSystem) &&
        Objects.equals(this.inventoryNo, placeInWarehousePduRequestData.inventoryNo) &&
        Objects.equals(this.lastSeen, placeInWarehousePduRequestData.lastSeen) &&
        Objects.equals(this.nominalCurrentThreshold, placeInWarehousePduRequestData.nominalCurrentThreshold) &&
        Objects.equals(this.visibleId, placeInWarehousePduRequestData.visibleId) &&
        Objects.equals(this.id, placeInWarehousePduRequestData.id) &&
        Objects.equals(this.heatEmission, placeInWarehousePduRequestData.heatEmission) &&
        Objects.equals(this.nominalCurrentThresholdPc, placeInWarehousePduRequestData.nominalCurrentThresholdPc) &&
        Objects.equals(this.createLinkContract, placeInWarehousePduRequestData.createLinkContract) &&
        Objects.equals(this.createLinkDeviceMaster, placeInWarehousePduRequestData.createLinkDeviceMaster) &&
        Objects.equals(this.createLinkFrameContract, placeInWarehousePduRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, placeInWarehousePduRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, placeInWarehousePduRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, placeInWarehousePduRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, placeInWarehousePduRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkSite, placeInWarehousePduRequestData.createLinkSite) &&
        Objects.equals(this.createLinkWarehouse, placeInWarehousePduRequestData.createLinkWarehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(climateRelevant, sourceId, powerConsumption, powerSwitchingStatus, sourceSystem, systemRuntime, weight, contextId, remark, serialNo, nominalCurrent, ownerSystem, inventoryNo, lastSeen, nominalCurrentThreshold, visibleId, id, heatEmission, nominalCurrentThresholdPc, createLinkContract, createLinkDeviceMaster, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkSite, createLinkWarehouse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceInWarehousePduRequestData {\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    nominalCurrent: ").append(toIndentedString(nominalCurrent)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    inventoryNo: ").append(toIndentedString(inventoryNo)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    nominalCurrentThreshold: ").append(toIndentedString(nominalCurrentThreshold)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("    nominalCurrentThresholdPc: ").append(toIndentedString(nominalCurrentThresholdPc)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkDeviceMaster: ").append(toIndentedString(createLinkDeviceMaster)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    createLinkPerson: ").append(toIndentedString(createLinkPerson)).append("\n");
    sb.append("    createLinkPersonGroup: ").append(toIndentedString(createLinkPersonGroup)).append("\n");
    sb.append("    createLinkSite: ").append(toIndentedString(createLinkSite)).append("\n");
    sb.append("    createLinkWarehouse: ").append(toIndentedString(createLinkWarehouse)).append("\n");
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
