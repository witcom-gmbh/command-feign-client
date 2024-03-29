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
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupCreateLinkZoneRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupDeleteLinkZoneRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupUpdateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupUpdateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupUpdateLinkPersonRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateVlanGroupRequestData
 */
@JsonPropertyOrder({
  UpdateVlanGroupRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateVlanGroupRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateVlanGroupRequestData.JSON_PROPERTY_NAME,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateVlanGroupRequestData.JSON_PROPERTY_REMARK,
  UpdateVlanGroupRequestData.JSON_PROPERTY_STATUS,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_VLAN,
  UpdateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_ZONE,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_CONTRACT,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_FRAME_CONTRACT,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_MAINTENANCE_CONTRACT,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_ORGANIZATION,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_PERSON,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_PERSON_GROUP,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_VLAN,
  UpdateVlanGroupRequestData.JSON_PROPERTY_DELETE_LINK_ZONE,
  UpdateVlanGroupRequestData.JSON_PROPERTY_UPDATE_LINK_ORGANIZATION,
  UpdateVlanGroupRequestData.JSON_PROPERTY_UPDATE_LINK_PERSON,
  UpdateVlanGroupRequestData.JSON_PROPERTY_UPDATE_LINK_PERSON_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class UpdateVlanGroupRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<UpdateVlanGroupCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<UpdateVlanGroupCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<UpdateVlanGroupCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<UpdateVlanGroupCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<UpdateVlanGroupCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<UpdateVlanGroupCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_VLAN = "createLinkVlan";
  private List<UpdateVlanGroupCreateLinkVlanRequestData> createLinkVlan;

  public static final String JSON_PROPERTY_CREATE_LINK_ZONE = "createLinkZone";
  private List<UpdateVlanGroupCreateLinkZoneRequestData> createLinkZone;

  public static final String JSON_PROPERTY_DELETE_LINK_CONTRACT = "deleteLinkContract";
  private List<UpdateVlanGroupDeleteLinkContractRequestData> deleteLinkContract;

  public static final String JSON_PROPERTY_DELETE_LINK_FRAME_CONTRACT = "deleteLinkFrameContract";
  private List<UpdateVlanGroupDeleteLinkFrameContractRequestData> deleteLinkFrameContract;

  public static final String JSON_PROPERTY_DELETE_LINK_MAINTENANCE_CONTRACT = "deleteLinkMaintenanceContract";
  private List<UpdateVlanGroupDeleteLinkMaintenanceContractRequestData> deleteLinkMaintenanceContract;

  public static final String JSON_PROPERTY_DELETE_LINK_ORGANIZATION = "deleteLinkOrganization";
  private List<UpdateVlanGroupDeleteLinkOrganizationRequestData> deleteLinkOrganization;

  public static final String JSON_PROPERTY_DELETE_LINK_PERSON = "deleteLinkPerson";
  private List<UpdateVlanGroupDeleteLinkPersonRequestData> deleteLinkPerson;

  public static final String JSON_PROPERTY_DELETE_LINK_PERSON_GROUP = "deleteLinkPersonGroup";
  private List<UpdateVlanGroupDeleteLinkPersonGroupRequestData> deleteLinkPersonGroup;

  public static final String JSON_PROPERTY_DELETE_LINK_VLAN = "deleteLinkVlan";
  private List<UpdateVlanGroupDeleteLinkVlanRequestData> deleteLinkVlan;

  public static final String JSON_PROPERTY_DELETE_LINK_ZONE = "deleteLinkZone";
  private List<UpdateVlanGroupDeleteLinkZoneRequestData> deleteLinkZone;

  public static final String JSON_PROPERTY_UPDATE_LINK_ORGANIZATION = "updateLinkOrganization";
  private List<UpdateVlanGroupUpdateLinkOrganizationRequestData> updateLinkOrganization;

  public static final String JSON_PROPERTY_UPDATE_LINK_PERSON = "updateLinkPerson";
  private List<UpdateVlanGroupUpdateLinkPersonRequestData> updateLinkPerson;

  public static final String JSON_PROPERTY_UPDATE_LINK_PERSON_GROUP = "updateLinkPersonGroup";
  private List<UpdateVlanGroupUpdateLinkPersonGroupRequestData> updateLinkPersonGroup;

  public UpdateVlanGroupRequestData() {
  }

  public UpdateVlanGroupRequestData sourceId(String sourceId) {
    
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


  public UpdateVlanGroupRequestData sourceSystem(String sourceSystem) {
    
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


  public UpdateVlanGroupRequestData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateVlanGroupRequestData contextId(String contextId) {
    
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


  public UpdateVlanGroupRequestData remark(String remark) {
    
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


  public UpdateVlanGroupRequestData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public UpdateVlanGroupRequestData createLinkContract(List<UpdateVlanGroupCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkContractItem(UpdateVlanGroupCreateLinkContractRequestData createLinkContractItem) {
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

  public List<UpdateVlanGroupCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<UpdateVlanGroupCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public UpdateVlanGroupRequestData createLinkFrameContract(List<UpdateVlanGroupCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkFrameContractItem(UpdateVlanGroupCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<UpdateVlanGroupCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<UpdateVlanGroupCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public UpdateVlanGroupRequestData createLinkMaintenanceContract(List<UpdateVlanGroupCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkMaintenanceContractItem(UpdateVlanGroupCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<UpdateVlanGroupCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<UpdateVlanGroupCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public UpdateVlanGroupRequestData createLinkOrganization(List<UpdateVlanGroupCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkOrganizationItem(UpdateVlanGroupCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<UpdateVlanGroupCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<UpdateVlanGroupCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public UpdateVlanGroupRequestData createLinkPerson(List<UpdateVlanGroupCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkPersonItem(UpdateVlanGroupCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<UpdateVlanGroupCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<UpdateVlanGroupCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public UpdateVlanGroupRequestData createLinkPersonGroup(List<UpdateVlanGroupCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkPersonGroupItem(UpdateVlanGroupCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<UpdateVlanGroupCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<UpdateVlanGroupCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public UpdateVlanGroupRequestData createLinkVlan(List<UpdateVlanGroupCreateLinkVlanRequestData> createLinkVlan) {
    
    this.createLinkVlan = createLinkVlan;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkVlanItem(UpdateVlanGroupCreateLinkVlanRequestData createLinkVlanItem) {
    if (this.createLinkVlan == null) {
      this.createLinkVlan = new ArrayList<>();
    }
    this.createLinkVlan.add(createLinkVlanItem);
    return this;
  }

   /**
   * Get createLinkVlan
   * @return createLinkVlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupCreateLinkVlanRequestData> getCreateLinkVlan() {
    return createLinkVlan;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkVlan(List<UpdateVlanGroupCreateLinkVlanRequestData> createLinkVlan) {
    this.createLinkVlan = createLinkVlan;
  }


  public UpdateVlanGroupRequestData createLinkZone(List<UpdateVlanGroupCreateLinkZoneRequestData> createLinkZone) {
    
    this.createLinkZone = createLinkZone;
    return this;
  }

  public UpdateVlanGroupRequestData addCreateLinkZoneItem(UpdateVlanGroupCreateLinkZoneRequestData createLinkZoneItem) {
    if (this.createLinkZone == null) {
      this.createLinkZone = new ArrayList<>();
    }
    this.createLinkZone.add(createLinkZoneItem);
    return this;
  }

   /**
   * Get createLinkZone
   * @return createLinkZone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupCreateLinkZoneRequestData> getCreateLinkZone() {
    return createLinkZone;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkZone(List<UpdateVlanGroupCreateLinkZoneRequestData> createLinkZone) {
    this.createLinkZone = createLinkZone;
  }


  public UpdateVlanGroupRequestData deleteLinkContract(List<UpdateVlanGroupDeleteLinkContractRequestData> deleteLinkContract) {
    
    this.deleteLinkContract = deleteLinkContract;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkContractItem(UpdateVlanGroupDeleteLinkContractRequestData deleteLinkContractItem) {
    if (this.deleteLinkContract == null) {
      this.deleteLinkContract = new ArrayList<>();
    }
    this.deleteLinkContract.add(deleteLinkContractItem);
    return this;
  }

   /**
   * Get deleteLinkContract
   * @return deleteLinkContract
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkContractRequestData> getDeleteLinkContract() {
    return deleteLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkContract(List<UpdateVlanGroupDeleteLinkContractRequestData> deleteLinkContract) {
    this.deleteLinkContract = deleteLinkContract;
  }


  public UpdateVlanGroupRequestData deleteLinkFrameContract(List<UpdateVlanGroupDeleteLinkFrameContractRequestData> deleteLinkFrameContract) {
    
    this.deleteLinkFrameContract = deleteLinkFrameContract;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkFrameContractItem(UpdateVlanGroupDeleteLinkFrameContractRequestData deleteLinkFrameContractItem) {
    if (this.deleteLinkFrameContract == null) {
      this.deleteLinkFrameContract = new ArrayList<>();
    }
    this.deleteLinkFrameContract.add(deleteLinkFrameContractItem);
    return this;
  }

   /**
   * Get deleteLinkFrameContract
   * @return deleteLinkFrameContract
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkFrameContractRequestData> getDeleteLinkFrameContract() {
    return deleteLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkFrameContract(List<UpdateVlanGroupDeleteLinkFrameContractRequestData> deleteLinkFrameContract) {
    this.deleteLinkFrameContract = deleteLinkFrameContract;
  }


  public UpdateVlanGroupRequestData deleteLinkMaintenanceContract(List<UpdateVlanGroupDeleteLinkMaintenanceContractRequestData> deleteLinkMaintenanceContract) {
    
    this.deleteLinkMaintenanceContract = deleteLinkMaintenanceContract;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkMaintenanceContractItem(UpdateVlanGroupDeleteLinkMaintenanceContractRequestData deleteLinkMaintenanceContractItem) {
    if (this.deleteLinkMaintenanceContract == null) {
      this.deleteLinkMaintenanceContract = new ArrayList<>();
    }
    this.deleteLinkMaintenanceContract.add(deleteLinkMaintenanceContractItem);
    return this;
  }

   /**
   * Get deleteLinkMaintenanceContract
   * @return deleteLinkMaintenanceContract
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkMaintenanceContractRequestData> getDeleteLinkMaintenanceContract() {
    return deleteLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkMaintenanceContract(List<UpdateVlanGroupDeleteLinkMaintenanceContractRequestData> deleteLinkMaintenanceContract) {
    this.deleteLinkMaintenanceContract = deleteLinkMaintenanceContract;
  }


  public UpdateVlanGroupRequestData deleteLinkOrganization(List<UpdateVlanGroupDeleteLinkOrganizationRequestData> deleteLinkOrganization) {
    
    this.deleteLinkOrganization = deleteLinkOrganization;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkOrganizationItem(UpdateVlanGroupDeleteLinkOrganizationRequestData deleteLinkOrganizationItem) {
    if (this.deleteLinkOrganization == null) {
      this.deleteLinkOrganization = new ArrayList<>();
    }
    this.deleteLinkOrganization.add(deleteLinkOrganizationItem);
    return this;
  }

   /**
   * Get deleteLinkOrganization
   * @return deleteLinkOrganization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkOrganizationRequestData> getDeleteLinkOrganization() {
    return deleteLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkOrganization(List<UpdateVlanGroupDeleteLinkOrganizationRequestData> deleteLinkOrganization) {
    this.deleteLinkOrganization = deleteLinkOrganization;
  }


  public UpdateVlanGroupRequestData deleteLinkPerson(List<UpdateVlanGroupDeleteLinkPersonRequestData> deleteLinkPerson) {
    
    this.deleteLinkPerson = deleteLinkPerson;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkPersonItem(UpdateVlanGroupDeleteLinkPersonRequestData deleteLinkPersonItem) {
    if (this.deleteLinkPerson == null) {
      this.deleteLinkPerson = new ArrayList<>();
    }
    this.deleteLinkPerson.add(deleteLinkPersonItem);
    return this;
  }

   /**
   * Get deleteLinkPerson
   * @return deleteLinkPerson
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkPersonRequestData> getDeleteLinkPerson() {
    return deleteLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkPerson(List<UpdateVlanGroupDeleteLinkPersonRequestData> deleteLinkPerson) {
    this.deleteLinkPerson = deleteLinkPerson;
  }


  public UpdateVlanGroupRequestData deleteLinkPersonGroup(List<UpdateVlanGroupDeleteLinkPersonGroupRequestData> deleteLinkPersonGroup) {
    
    this.deleteLinkPersonGroup = deleteLinkPersonGroup;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkPersonGroupItem(UpdateVlanGroupDeleteLinkPersonGroupRequestData deleteLinkPersonGroupItem) {
    if (this.deleteLinkPersonGroup == null) {
      this.deleteLinkPersonGroup = new ArrayList<>();
    }
    this.deleteLinkPersonGroup.add(deleteLinkPersonGroupItem);
    return this;
  }

   /**
   * Get deleteLinkPersonGroup
   * @return deleteLinkPersonGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkPersonGroupRequestData> getDeleteLinkPersonGroup() {
    return deleteLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkPersonGroup(List<UpdateVlanGroupDeleteLinkPersonGroupRequestData> deleteLinkPersonGroup) {
    this.deleteLinkPersonGroup = deleteLinkPersonGroup;
  }


  public UpdateVlanGroupRequestData deleteLinkVlan(List<UpdateVlanGroupDeleteLinkVlanRequestData> deleteLinkVlan) {
    
    this.deleteLinkVlan = deleteLinkVlan;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkVlanItem(UpdateVlanGroupDeleteLinkVlanRequestData deleteLinkVlanItem) {
    if (this.deleteLinkVlan == null) {
      this.deleteLinkVlan = new ArrayList<>();
    }
    this.deleteLinkVlan.add(deleteLinkVlanItem);
    return this;
  }

   /**
   * Get deleteLinkVlan
   * @return deleteLinkVlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkVlanRequestData> getDeleteLinkVlan() {
    return deleteLinkVlan;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkVlan(List<UpdateVlanGroupDeleteLinkVlanRequestData> deleteLinkVlan) {
    this.deleteLinkVlan = deleteLinkVlan;
  }


  public UpdateVlanGroupRequestData deleteLinkZone(List<UpdateVlanGroupDeleteLinkZoneRequestData> deleteLinkZone) {
    
    this.deleteLinkZone = deleteLinkZone;
    return this;
  }

  public UpdateVlanGroupRequestData addDeleteLinkZoneItem(UpdateVlanGroupDeleteLinkZoneRequestData deleteLinkZoneItem) {
    if (this.deleteLinkZone == null) {
      this.deleteLinkZone = new ArrayList<>();
    }
    this.deleteLinkZone.add(deleteLinkZoneItem);
    return this;
  }

   /**
   * Get deleteLinkZone
   * @return deleteLinkZone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupDeleteLinkZoneRequestData> getDeleteLinkZone() {
    return deleteLinkZone;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkZone(List<UpdateVlanGroupDeleteLinkZoneRequestData> deleteLinkZone) {
    this.deleteLinkZone = deleteLinkZone;
  }


  public UpdateVlanGroupRequestData updateLinkOrganization(List<UpdateVlanGroupUpdateLinkOrganizationRequestData> updateLinkOrganization) {
    
    this.updateLinkOrganization = updateLinkOrganization;
    return this;
  }

  public UpdateVlanGroupRequestData addUpdateLinkOrganizationItem(UpdateVlanGroupUpdateLinkOrganizationRequestData updateLinkOrganizationItem) {
    if (this.updateLinkOrganization == null) {
      this.updateLinkOrganization = new ArrayList<>();
    }
    this.updateLinkOrganization.add(updateLinkOrganizationItem);
    return this;
  }

   /**
   * Get updateLinkOrganization
   * @return updateLinkOrganization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupUpdateLinkOrganizationRequestData> getUpdateLinkOrganization() {
    return updateLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkOrganization(List<UpdateVlanGroupUpdateLinkOrganizationRequestData> updateLinkOrganization) {
    this.updateLinkOrganization = updateLinkOrganization;
  }


  public UpdateVlanGroupRequestData updateLinkPerson(List<UpdateVlanGroupUpdateLinkPersonRequestData> updateLinkPerson) {
    
    this.updateLinkPerson = updateLinkPerson;
    return this;
  }

  public UpdateVlanGroupRequestData addUpdateLinkPersonItem(UpdateVlanGroupUpdateLinkPersonRequestData updateLinkPersonItem) {
    if (this.updateLinkPerson == null) {
      this.updateLinkPerson = new ArrayList<>();
    }
    this.updateLinkPerson.add(updateLinkPersonItem);
    return this;
  }

   /**
   * Get updateLinkPerson
   * @return updateLinkPerson
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupUpdateLinkPersonRequestData> getUpdateLinkPerson() {
    return updateLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkPerson(List<UpdateVlanGroupUpdateLinkPersonRequestData> updateLinkPerson) {
    this.updateLinkPerson = updateLinkPerson;
  }


  public UpdateVlanGroupRequestData updateLinkPersonGroup(List<UpdateVlanGroupUpdateLinkPersonGroupRequestData> updateLinkPersonGroup) {
    
    this.updateLinkPersonGroup = updateLinkPersonGroup;
    return this;
  }

  public UpdateVlanGroupRequestData addUpdateLinkPersonGroupItem(UpdateVlanGroupUpdateLinkPersonGroupRequestData updateLinkPersonGroupItem) {
    if (this.updateLinkPersonGroup == null) {
      this.updateLinkPersonGroup = new ArrayList<>();
    }
    this.updateLinkPersonGroup.add(updateLinkPersonGroupItem);
    return this;
  }

   /**
   * Get updateLinkPersonGroup
   * @return updateLinkPersonGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateVlanGroupUpdateLinkPersonGroupRequestData> getUpdateLinkPersonGroup() {
    return updateLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkPersonGroup(List<UpdateVlanGroupUpdateLinkPersonGroupRequestData> updateLinkPersonGroup) {
    this.updateLinkPersonGroup = updateLinkPersonGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVlanGroupRequestData updateVlanGroupRequestData = (UpdateVlanGroupRequestData) o;
    return Objects.equals(this.sourceId, updateVlanGroupRequestData.sourceId) &&
        Objects.equals(this.sourceSystem, updateVlanGroupRequestData.sourceSystem) &&
        Objects.equals(this.name, updateVlanGroupRequestData.name) &&
        Objects.equals(this.contextId, updateVlanGroupRequestData.contextId) &&
        Objects.equals(this.remark, updateVlanGroupRequestData.remark) &&
        Objects.equals(this.status, updateVlanGroupRequestData.status) &&
        Objects.equals(this.createLinkContract, updateVlanGroupRequestData.createLinkContract) &&
        Objects.equals(this.createLinkFrameContract, updateVlanGroupRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, updateVlanGroupRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, updateVlanGroupRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, updateVlanGroupRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, updateVlanGroupRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkVlan, updateVlanGroupRequestData.createLinkVlan) &&
        Objects.equals(this.createLinkZone, updateVlanGroupRequestData.createLinkZone) &&
        Objects.equals(this.deleteLinkContract, updateVlanGroupRequestData.deleteLinkContract) &&
        Objects.equals(this.deleteLinkFrameContract, updateVlanGroupRequestData.deleteLinkFrameContract) &&
        Objects.equals(this.deleteLinkMaintenanceContract, updateVlanGroupRequestData.deleteLinkMaintenanceContract) &&
        Objects.equals(this.deleteLinkOrganization, updateVlanGroupRequestData.deleteLinkOrganization) &&
        Objects.equals(this.deleteLinkPerson, updateVlanGroupRequestData.deleteLinkPerson) &&
        Objects.equals(this.deleteLinkPersonGroup, updateVlanGroupRequestData.deleteLinkPersonGroup) &&
        Objects.equals(this.deleteLinkVlan, updateVlanGroupRequestData.deleteLinkVlan) &&
        Objects.equals(this.deleteLinkZone, updateVlanGroupRequestData.deleteLinkZone) &&
        Objects.equals(this.updateLinkOrganization, updateVlanGroupRequestData.updateLinkOrganization) &&
        Objects.equals(this.updateLinkPerson, updateVlanGroupRequestData.updateLinkPerson) &&
        Objects.equals(this.updateLinkPersonGroup, updateVlanGroupRequestData.updateLinkPersonGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, sourceSystem, name, contextId, remark, status, createLinkContract, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkVlan, createLinkZone, deleteLinkContract, deleteLinkFrameContract, deleteLinkMaintenanceContract, deleteLinkOrganization, deleteLinkPerson, deleteLinkPersonGroup, deleteLinkVlan, deleteLinkZone, updateLinkOrganization, updateLinkPerson, updateLinkPersonGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVlanGroupRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    createLinkPerson: ").append(toIndentedString(createLinkPerson)).append("\n");
    sb.append("    createLinkPersonGroup: ").append(toIndentedString(createLinkPersonGroup)).append("\n");
    sb.append("    createLinkVlan: ").append(toIndentedString(createLinkVlan)).append("\n");
    sb.append("    createLinkZone: ").append(toIndentedString(createLinkZone)).append("\n");
    sb.append("    deleteLinkContract: ").append(toIndentedString(deleteLinkContract)).append("\n");
    sb.append("    deleteLinkFrameContract: ").append(toIndentedString(deleteLinkFrameContract)).append("\n");
    sb.append("    deleteLinkMaintenanceContract: ").append(toIndentedString(deleteLinkMaintenanceContract)).append("\n");
    sb.append("    deleteLinkOrganization: ").append(toIndentedString(deleteLinkOrganization)).append("\n");
    sb.append("    deleteLinkPerson: ").append(toIndentedString(deleteLinkPerson)).append("\n");
    sb.append("    deleteLinkPersonGroup: ").append(toIndentedString(deleteLinkPersonGroup)).append("\n");
    sb.append("    deleteLinkVlan: ").append(toIndentedString(deleteLinkVlan)).append("\n");
    sb.append("    deleteLinkZone: ").append(toIndentedString(deleteLinkZone)).append("\n");
    sb.append("    updateLinkOrganization: ").append(toIndentedString(updateLinkOrganization)).append("\n");
    sb.append("    updateLinkPerson: ").append(toIndentedString(updateLinkPerson)).append("\n");
    sb.append("    updateLinkPersonGroup: ").append(toIndentedString(updateLinkPersonGroup)).append("\n");
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

