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
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkSiteRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleCreateLinkSwitchCabinetRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlaceInCabinetPassiveModuleRequestData
 */
@JsonPropertyOrder({
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_C_REFERENCE_T1,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CLIMATE_RELEVANT,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_SOURCE_ID,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_POWER_CONSUMPTION,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_C_REFERENCE_V1,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_SYSTEM_RUNTIME,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_WEIGHT,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CONTEXT_ID,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_REMARK,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_C_CABLESCOUTID,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_SERIAL_NO,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_C_INVENTORY_NO,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_LAST_SEEN,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_C_LABEL_MISSING,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_VISIBLE_ID,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_ID,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_HEAT_EMISSION,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_SITE,
  PlaceInCabinetPassiveModuleRequestData.JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PlaceInCabinetPassiveModuleRequestData {
  public static final String JSON_PROPERTY_C_REFERENCE_T1 = "cReferenceT1";
  private String cReferenceT1;

  public static final String JSON_PROPERTY_CLIMATE_RELEVANT = "climateRelevant";
  private Boolean climateRelevant;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION = "powerConsumption";
  private BigDecimal powerConsumption;

  public static final String JSON_PROPERTY_POWER_SWITCHING_STATUS = "powerSwitchingStatus";
  private String powerSwitchingStatus;

  public static final String JSON_PROPERTY_C_REFERENCE_V1 = "cReferenceV1";
  private String cReferenceV1;

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

  public static final String JSON_PROPERTY_C_CABLESCOUTID = "cCablescoutid";
  private String cCablescoutid;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private String serialNo;

  public static final String JSON_PROPERTY_C_INVENTORY_NO = "cInventoryNo";
  private String cInventoryNo;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private DateTime lastSeen;

  public static final String JSON_PROPERTY_C_LABEL_MISSING = "cLabelMissing";
  private String cLabelMissing;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_HEAT_EMISSION = "heatEmission";
  private BigDecimal heatEmission;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<PlaceInCabinetPassiveModuleCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER = "createLinkDeviceMaster";
  private PlaceInCabinetPassiveModuleCreateLinkDeviceMasterRequestData createLinkDeviceMaster;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<PlaceInCabinetPassiveModuleCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<PlaceInCabinetPassiveModuleCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<PlaceInCabinetPassiveModuleCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<PlaceInCabinetPassiveModuleCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<PlaceInCabinetPassiveModuleCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_SITE = "createLinkSite";
  private List<PlaceInCabinetPassiveModuleCreateLinkSiteRequestData> createLinkSite;

  public static final String JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET = "createLinkSwitchCabinet";
  private PlaceInCabinetPassiveModuleCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet;

  public PlaceInCabinetPassiveModuleRequestData() {
  }

  public PlaceInCabinetPassiveModuleRequestData cReferenceT1(String cReferenceT1) {
    
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

  public String getcReferenceT1() {
    return cReferenceT1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE_T1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReferenceT1(String cReferenceT1) {
    this.cReferenceT1 = cReferenceT1;
  }


  public PlaceInCabinetPassiveModuleRequestData climateRelevant(Boolean climateRelevant) {
    
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


  public PlaceInCabinetPassiveModuleRequestData sourceId(String sourceId) {
    
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


  public PlaceInCabinetPassiveModuleRequestData powerConsumption(BigDecimal powerConsumption) {
    
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


  public PlaceInCabinetPassiveModuleRequestData powerSwitchingStatus(String powerSwitchingStatus) {
    
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


  public PlaceInCabinetPassiveModuleRequestData cReferenceV1(String cReferenceV1) {
    
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

  public String getcReferenceV1() {
    return cReferenceV1;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE_V1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReferenceV1(String cReferenceV1) {
    this.cReferenceV1 = cReferenceV1;
  }


  public PlaceInCabinetPassiveModuleRequestData sourceSystem(String sourceSystem) {
    
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


  public PlaceInCabinetPassiveModuleRequestData systemRuntime(BigDecimal systemRuntime) {
    
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


  public PlaceInCabinetPassiveModuleRequestData weight(BigDecimal weight) {
    
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


  public PlaceInCabinetPassiveModuleRequestData contextId(String contextId) {
    
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


  public PlaceInCabinetPassiveModuleRequestData remark(String remark) {
    
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


  public PlaceInCabinetPassiveModuleRequestData cCablescoutid(String cCablescoutid) {
    
    this.cCablescoutid = cCablescoutid;
    return this;
  }

   /**
   * Get cCablescoutid
   * @return cCablescoutid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_CABLESCOUTID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcCablescoutid() {
    return cCablescoutid;
  }


  @JsonProperty(JSON_PROPERTY_C_CABLESCOUTID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcCablescoutid(String cCablescoutid) {
    this.cCablescoutid = cCablescoutid;
  }


  public PlaceInCabinetPassiveModuleRequestData serialNo(String serialNo) {
    
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


  public PlaceInCabinetPassiveModuleRequestData cInventoryNo(String cInventoryNo) {
    
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

  public String getcInventoryNo() {
    return cInventoryNo;
  }


  @JsonProperty(JSON_PROPERTY_C_INVENTORY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcInventoryNo(String cInventoryNo) {
    this.cInventoryNo = cInventoryNo;
  }


  public PlaceInCabinetPassiveModuleRequestData ownerSystem(String ownerSystem) {
    
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


  public PlaceInCabinetPassiveModuleRequestData lastSeen(DateTime lastSeen) {
    
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


  public PlaceInCabinetPassiveModuleRequestData cLabelMissing(String cLabelMissing) {
    
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

  public String getcLabelMissing() {
    return cLabelMissing;
  }


  @JsonProperty(JSON_PROPERTY_C_LABEL_MISSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLabelMissing(String cLabelMissing) {
    this.cLabelMissing = cLabelMissing;
  }


  public PlaceInCabinetPassiveModuleRequestData visibleId(String visibleId) {
    
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


  public PlaceInCabinetPassiveModuleRequestData id(String id) {
    
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


  public PlaceInCabinetPassiveModuleRequestData heatEmission(BigDecimal heatEmission) {
    
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


  public PlaceInCabinetPassiveModuleRequestData createLinkContract(List<PlaceInCabinetPassiveModuleCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkContractItem(PlaceInCabinetPassiveModuleCreateLinkContractRequestData createLinkContractItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<PlaceInCabinetPassiveModuleCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkDeviceMaster(PlaceInCabinetPassiveModuleCreateLinkDeviceMasterRequestData createLinkDeviceMaster) {
    
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

  public PlaceInCabinetPassiveModuleCreateLinkDeviceMasterRequestData getCreateLinkDeviceMaster() {
    return createLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkDeviceMaster(PlaceInCabinetPassiveModuleCreateLinkDeviceMasterRequestData createLinkDeviceMaster) {
    this.createLinkDeviceMaster = createLinkDeviceMaster;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkFrameContract(List<PlaceInCabinetPassiveModuleCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkFrameContractItem(PlaceInCabinetPassiveModuleCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<PlaceInCabinetPassiveModuleCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkMaintenanceContract(List<PlaceInCabinetPassiveModuleCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkMaintenanceContractItem(PlaceInCabinetPassiveModuleCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<PlaceInCabinetPassiveModuleCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkOrganization(List<PlaceInCabinetPassiveModuleCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkOrganizationItem(PlaceInCabinetPassiveModuleCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<PlaceInCabinetPassiveModuleCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkPerson(List<PlaceInCabinetPassiveModuleCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkPersonItem(PlaceInCabinetPassiveModuleCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<PlaceInCabinetPassiveModuleCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkPersonGroup(List<PlaceInCabinetPassiveModuleCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkPersonGroupItem(PlaceInCabinetPassiveModuleCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<PlaceInCabinetPassiveModuleCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkSite(List<PlaceInCabinetPassiveModuleCreateLinkSiteRequestData> createLinkSite) {
    
    this.createLinkSite = createLinkSite;
    return this;
  }

  public PlaceInCabinetPassiveModuleRequestData addCreateLinkSiteItem(PlaceInCabinetPassiveModuleCreateLinkSiteRequestData createLinkSiteItem) {
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

  public List<PlaceInCabinetPassiveModuleCreateLinkSiteRequestData> getCreateLinkSite() {
    return createLinkSite;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkSite(List<PlaceInCabinetPassiveModuleCreateLinkSiteRequestData> createLinkSite) {
    this.createLinkSite = createLinkSite;
  }


  public PlaceInCabinetPassiveModuleRequestData createLinkSwitchCabinet(PlaceInCabinetPassiveModuleCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet) {
    
    this.createLinkSwitchCabinet = createLinkSwitchCabinet;
    return this;
  }

   /**
   * Get createLinkSwitchCabinet
   * @return createLinkSwitchCabinet
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PlaceInCabinetPassiveModuleCreateLinkSwitchCabinetRequestData getCreateLinkSwitchCabinet() {
    return createLinkSwitchCabinet;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkSwitchCabinet(PlaceInCabinetPassiveModuleCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet) {
    this.createLinkSwitchCabinet = createLinkSwitchCabinet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceInCabinetPassiveModuleRequestData placeInCabinetPassiveModuleRequestData = (PlaceInCabinetPassiveModuleRequestData) o;
    return Objects.equals(this.cReferenceT1, placeInCabinetPassiveModuleRequestData.cReferenceT1) &&
        Objects.equals(this.climateRelevant, placeInCabinetPassiveModuleRequestData.climateRelevant) &&
        Objects.equals(this.sourceId, placeInCabinetPassiveModuleRequestData.sourceId) &&
        Objects.equals(this.powerConsumption, placeInCabinetPassiveModuleRequestData.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, placeInCabinetPassiveModuleRequestData.powerSwitchingStatus) &&
        Objects.equals(this.cReferenceV1, placeInCabinetPassiveModuleRequestData.cReferenceV1) &&
        Objects.equals(this.sourceSystem, placeInCabinetPassiveModuleRequestData.sourceSystem) &&
        Objects.equals(this.systemRuntime, placeInCabinetPassiveModuleRequestData.systemRuntime) &&
        Objects.equals(this.weight, placeInCabinetPassiveModuleRequestData.weight) &&
        Objects.equals(this.contextId, placeInCabinetPassiveModuleRequestData.contextId) &&
        Objects.equals(this.remark, placeInCabinetPassiveModuleRequestData.remark) &&
        Objects.equals(this.cCablescoutid, placeInCabinetPassiveModuleRequestData.cCablescoutid) &&
        Objects.equals(this.serialNo, placeInCabinetPassiveModuleRequestData.serialNo) &&
        Objects.equals(this.cInventoryNo, placeInCabinetPassiveModuleRequestData.cInventoryNo) &&
        Objects.equals(this.ownerSystem, placeInCabinetPassiveModuleRequestData.ownerSystem) &&
        Objects.equals(this.lastSeen, placeInCabinetPassiveModuleRequestData.lastSeen) &&
        Objects.equals(this.cLabelMissing, placeInCabinetPassiveModuleRequestData.cLabelMissing) &&
        Objects.equals(this.visibleId, placeInCabinetPassiveModuleRequestData.visibleId) &&
        Objects.equals(this.id, placeInCabinetPassiveModuleRequestData.id) &&
        Objects.equals(this.heatEmission, placeInCabinetPassiveModuleRequestData.heatEmission) &&
        Objects.equals(this.createLinkContract, placeInCabinetPassiveModuleRequestData.createLinkContract) &&
        Objects.equals(this.createLinkDeviceMaster, placeInCabinetPassiveModuleRequestData.createLinkDeviceMaster) &&
        Objects.equals(this.createLinkFrameContract, placeInCabinetPassiveModuleRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, placeInCabinetPassiveModuleRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, placeInCabinetPassiveModuleRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, placeInCabinetPassiveModuleRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, placeInCabinetPassiveModuleRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkSite, placeInCabinetPassiveModuleRequestData.createLinkSite) &&
        Objects.equals(this.createLinkSwitchCabinet, placeInCabinetPassiveModuleRequestData.createLinkSwitchCabinet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cReferenceT1, climateRelevant, sourceId, powerConsumption, powerSwitchingStatus, cReferenceV1, sourceSystem, systemRuntime, weight, contextId, remark, cCablescoutid, serialNo, cInventoryNo, ownerSystem, lastSeen, cLabelMissing, visibleId, id, heatEmission, createLinkContract, createLinkDeviceMaster, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkSite, createLinkSwitchCabinet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceInCabinetPassiveModuleRequestData {\n");
    sb.append("    cReferenceT1: ").append(toIndentedString(cReferenceT1)).append("\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    cReferenceV1: ").append(toIndentedString(cReferenceV1)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    systemRuntime: ").append(toIndentedString(systemRuntime)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cCablescoutid: ").append(toIndentedString(cCablescoutid)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    cInventoryNo: ").append(toIndentedString(cInventoryNo)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    cLabelMissing: ").append(toIndentedString(cLabelMissing)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    heatEmission: ").append(toIndentedString(heatEmission)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkDeviceMaster: ").append(toIndentedString(createLinkDeviceMaster)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    createLinkPerson: ").append(toIndentedString(createLinkPerson)).append("\n");
    sb.append("    createLinkPersonGroup: ").append(toIndentedString(createLinkPersonGroup)).append("\n");
    sb.append("    createLinkSite: ").append(toIndentedString(createLinkSite)).append("\n");
    sb.append("    createLinkSwitchCabinet: ").append(toIndentedString(createLinkSwitchCabinet)).append("\n");
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
