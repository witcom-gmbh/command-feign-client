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
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkSiteRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesCreateLinkWarehouseRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlaceInWarehouseCabinetSuppliesRequestData
 */
@JsonPropertyOrder({
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CLIMATE_RELEVANT,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_SOURCE_ID,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_POWER_CONSUMPTION,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_POWER_SWITCHING_STATUS,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_WEIGHT,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CONTEXT_ID,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_REMARK,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_C_INVENTORY_NO,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_LAST_SEEN,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_C_LABEL_MISSING,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_VISIBLE_ID,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_ID,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_HEAT_EMISSION,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_SITE,
  PlaceInWarehouseCabinetSuppliesRequestData.JSON_PROPERTY_CREATE_LINK_WAREHOUSE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PlaceInWarehouseCabinetSuppliesRequestData {
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

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

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
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER = "createLinkDeviceMaster";
  private PlaceInWarehouseCabinetSuppliesCreateLinkDeviceMasterRequestData createLinkDeviceMaster;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_SITE = "createLinkSite";
  private List<PlaceInWarehouseCabinetSuppliesCreateLinkSiteRequestData> createLinkSite;

  public static final String JSON_PROPERTY_CREATE_LINK_WAREHOUSE = "createLinkWarehouse";
  private PlaceInWarehouseCabinetSuppliesCreateLinkWarehouseRequestData createLinkWarehouse;

  public PlaceInWarehouseCabinetSuppliesRequestData() {
  }

  public PlaceInWarehouseCabinetSuppliesRequestData climateRelevant(Boolean climateRelevant) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData sourceId(String sourceId) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData powerConsumption(BigDecimal powerConsumption) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData powerSwitchingStatus(String powerSwitchingStatus) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData sourceSystem(String sourceSystem) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData weight(BigDecimal weight) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData contextId(String contextId) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData remark(String remark) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData cInventoryNo(String cInventoryNo) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData ownerSystem(String ownerSystem) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData lastSeen(DateTime lastSeen) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData cLabelMissing(String cLabelMissing) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData visibleId(String visibleId) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData id(String id) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData heatEmission(BigDecimal heatEmission) {
    
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


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkContract(List<PlaceInWarehouseCabinetSuppliesCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkContractItem(PlaceInWarehouseCabinetSuppliesCreateLinkContractRequestData createLinkContractItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<PlaceInWarehouseCabinetSuppliesCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkDeviceMaster(PlaceInWarehouseCabinetSuppliesCreateLinkDeviceMasterRequestData createLinkDeviceMaster) {
    
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

  public PlaceInWarehouseCabinetSuppliesCreateLinkDeviceMasterRequestData getCreateLinkDeviceMaster() {
    return createLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkDeviceMaster(PlaceInWarehouseCabinetSuppliesCreateLinkDeviceMasterRequestData createLinkDeviceMaster) {
    this.createLinkDeviceMaster = createLinkDeviceMaster;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkFrameContract(List<PlaceInWarehouseCabinetSuppliesCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkFrameContractItem(PlaceInWarehouseCabinetSuppliesCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<PlaceInWarehouseCabinetSuppliesCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkMaintenanceContract(List<PlaceInWarehouseCabinetSuppliesCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkMaintenanceContractItem(PlaceInWarehouseCabinetSuppliesCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<PlaceInWarehouseCabinetSuppliesCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkOrganization(List<PlaceInWarehouseCabinetSuppliesCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkOrganizationItem(PlaceInWarehouseCabinetSuppliesCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<PlaceInWarehouseCabinetSuppliesCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkPerson(List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkPersonItem(PlaceInWarehouseCabinetSuppliesCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkPersonGroup(List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkPersonGroupItem(PlaceInWarehouseCabinetSuppliesCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<PlaceInWarehouseCabinetSuppliesCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkSite(List<PlaceInWarehouseCabinetSuppliesCreateLinkSiteRequestData> createLinkSite) {
    
    this.createLinkSite = createLinkSite;
    return this;
  }

  public PlaceInWarehouseCabinetSuppliesRequestData addCreateLinkSiteItem(PlaceInWarehouseCabinetSuppliesCreateLinkSiteRequestData createLinkSiteItem) {
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

  public List<PlaceInWarehouseCabinetSuppliesCreateLinkSiteRequestData> getCreateLinkSite() {
    return createLinkSite;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkSite(List<PlaceInWarehouseCabinetSuppliesCreateLinkSiteRequestData> createLinkSite) {
    this.createLinkSite = createLinkSite;
  }


  public PlaceInWarehouseCabinetSuppliesRequestData createLinkWarehouse(PlaceInWarehouseCabinetSuppliesCreateLinkWarehouseRequestData createLinkWarehouse) {
    
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

  public PlaceInWarehouseCabinetSuppliesCreateLinkWarehouseRequestData getCreateLinkWarehouse() {
    return createLinkWarehouse;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkWarehouse(PlaceInWarehouseCabinetSuppliesCreateLinkWarehouseRequestData createLinkWarehouse) {
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
    PlaceInWarehouseCabinetSuppliesRequestData placeInWarehouseCabinetSuppliesRequestData = (PlaceInWarehouseCabinetSuppliesRequestData) o;
    return Objects.equals(this.climateRelevant, placeInWarehouseCabinetSuppliesRequestData.climateRelevant) &&
        Objects.equals(this.sourceId, placeInWarehouseCabinetSuppliesRequestData.sourceId) &&
        Objects.equals(this.powerConsumption, placeInWarehouseCabinetSuppliesRequestData.powerConsumption) &&
        Objects.equals(this.powerSwitchingStatus, placeInWarehouseCabinetSuppliesRequestData.powerSwitchingStatus) &&
        Objects.equals(this.sourceSystem, placeInWarehouseCabinetSuppliesRequestData.sourceSystem) &&
        Objects.equals(this.weight, placeInWarehouseCabinetSuppliesRequestData.weight) &&
        Objects.equals(this.contextId, placeInWarehouseCabinetSuppliesRequestData.contextId) &&
        Objects.equals(this.remark, placeInWarehouseCabinetSuppliesRequestData.remark) &&
        Objects.equals(this.cInventoryNo, placeInWarehouseCabinetSuppliesRequestData.cInventoryNo) &&
        Objects.equals(this.ownerSystem, placeInWarehouseCabinetSuppliesRequestData.ownerSystem) &&
        Objects.equals(this.lastSeen, placeInWarehouseCabinetSuppliesRequestData.lastSeen) &&
        Objects.equals(this.cLabelMissing, placeInWarehouseCabinetSuppliesRequestData.cLabelMissing) &&
        Objects.equals(this.visibleId, placeInWarehouseCabinetSuppliesRequestData.visibleId) &&
        Objects.equals(this.id, placeInWarehouseCabinetSuppliesRequestData.id) &&
        Objects.equals(this.heatEmission, placeInWarehouseCabinetSuppliesRequestData.heatEmission) &&
        Objects.equals(this.createLinkContract, placeInWarehouseCabinetSuppliesRequestData.createLinkContract) &&
        Objects.equals(this.createLinkDeviceMaster, placeInWarehouseCabinetSuppliesRequestData.createLinkDeviceMaster) &&
        Objects.equals(this.createLinkFrameContract, placeInWarehouseCabinetSuppliesRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, placeInWarehouseCabinetSuppliesRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, placeInWarehouseCabinetSuppliesRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, placeInWarehouseCabinetSuppliesRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, placeInWarehouseCabinetSuppliesRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkSite, placeInWarehouseCabinetSuppliesRequestData.createLinkSite) &&
        Objects.equals(this.createLinkWarehouse, placeInWarehouseCabinetSuppliesRequestData.createLinkWarehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(climateRelevant, sourceId, powerConsumption, powerSwitchingStatus, sourceSystem, weight, contextId, remark, cInventoryNo, ownerSystem, lastSeen, cLabelMissing, visibleId, id, heatEmission, createLinkContract, createLinkDeviceMaster, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkSite, createLinkWarehouse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceInWarehouseCabinetSuppliesRequestData {\n");
    sb.append("    climateRelevant: ").append(toIndentedString(climateRelevant)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    powerConsumption: ").append(toIndentedString(powerConsumption)).append("\n");
    sb.append("    powerSwitchingStatus: ").append(toIndentedString(powerSwitchingStatus)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
