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
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkVlanRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupCreateLinkZoneRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateVlanGroupRequestData
 */
@JsonPropertyOrder({
  CreateVlanGroupRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateVlanGroupRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateVlanGroupRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateVlanGroupRequestData.JSON_PROPERTY_NAME,
  CreateVlanGroupRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateVlanGroupRequestData.JSON_PROPERTY_REMARK,
  CreateVlanGroupRequestData.JSON_PROPERTY_STATUS,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_VLAN,
  CreateVlanGroupRequestData.JSON_PROPERTY_CREATE_LINK_ZONE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateVlanGroupRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

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
  private List<CreateVlanGroupCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<CreateVlanGroupCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<CreateVlanGroupCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<CreateVlanGroupCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<CreateVlanGroupCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<CreateVlanGroupCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_VLAN = "createLinkVlan";
  private List<CreateVlanGroupCreateLinkVlanRequestData> createLinkVlan;

  public static final String JSON_PROPERTY_CREATE_LINK_ZONE = "createLinkZone";
  private List<CreateVlanGroupCreateLinkZoneRequestData> createLinkZone;

  public CreateVlanGroupRequestData() {
  }

  public CreateVlanGroupRequestData sourceId(String sourceId) {
    
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


  public CreateVlanGroupRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateVlanGroupRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateVlanGroupRequestData name(String name) {
    
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


  public CreateVlanGroupRequestData contextId(String contextId) {
    
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


  public CreateVlanGroupRequestData remark(String remark) {
    
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


  public CreateVlanGroupRequestData status(String status) {
    
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


  public CreateVlanGroupRequestData createLinkContract(List<CreateVlanGroupCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkContractItem(CreateVlanGroupCreateLinkContractRequestData createLinkContractItem) {
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

  public List<CreateVlanGroupCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<CreateVlanGroupCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public CreateVlanGroupRequestData createLinkFrameContract(List<CreateVlanGroupCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkFrameContractItem(CreateVlanGroupCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<CreateVlanGroupCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<CreateVlanGroupCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public CreateVlanGroupRequestData createLinkMaintenanceContract(List<CreateVlanGroupCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkMaintenanceContractItem(CreateVlanGroupCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<CreateVlanGroupCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<CreateVlanGroupCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public CreateVlanGroupRequestData createLinkOrganization(List<CreateVlanGroupCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkOrganizationItem(CreateVlanGroupCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<CreateVlanGroupCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<CreateVlanGroupCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public CreateVlanGroupRequestData createLinkPerson(List<CreateVlanGroupCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkPersonItem(CreateVlanGroupCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<CreateVlanGroupCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<CreateVlanGroupCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public CreateVlanGroupRequestData createLinkPersonGroup(List<CreateVlanGroupCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkPersonGroupItem(CreateVlanGroupCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<CreateVlanGroupCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<CreateVlanGroupCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public CreateVlanGroupRequestData createLinkVlan(List<CreateVlanGroupCreateLinkVlanRequestData> createLinkVlan) {
    
    this.createLinkVlan = createLinkVlan;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkVlanItem(CreateVlanGroupCreateLinkVlanRequestData createLinkVlanItem) {
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

  public List<CreateVlanGroupCreateLinkVlanRequestData> getCreateLinkVlan() {
    return createLinkVlan;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkVlan(List<CreateVlanGroupCreateLinkVlanRequestData> createLinkVlan) {
    this.createLinkVlan = createLinkVlan;
  }


  public CreateVlanGroupRequestData createLinkZone(List<CreateVlanGroupCreateLinkZoneRequestData> createLinkZone) {
    
    this.createLinkZone = createLinkZone;
    return this;
  }

  public CreateVlanGroupRequestData addCreateLinkZoneItem(CreateVlanGroupCreateLinkZoneRequestData createLinkZoneItem) {
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

  public List<CreateVlanGroupCreateLinkZoneRequestData> getCreateLinkZone() {
    return createLinkZone;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkZone(List<CreateVlanGroupCreateLinkZoneRequestData> createLinkZone) {
    this.createLinkZone = createLinkZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVlanGroupRequestData createVlanGroupRequestData = (CreateVlanGroupRequestData) o;
    return Objects.equals(this.sourceId, createVlanGroupRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createVlanGroupRequestData.ownerSystem) &&
        Objects.equals(this.sourceSystem, createVlanGroupRequestData.sourceSystem) &&
        Objects.equals(this.name, createVlanGroupRequestData.name) &&
        Objects.equals(this.contextId, createVlanGroupRequestData.contextId) &&
        Objects.equals(this.remark, createVlanGroupRequestData.remark) &&
        Objects.equals(this.status, createVlanGroupRequestData.status) &&
        Objects.equals(this.createLinkContract, createVlanGroupRequestData.createLinkContract) &&
        Objects.equals(this.createLinkFrameContract, createVlanGroupRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, createVlanGroupRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, createVlanGroupRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, createVlanGroupRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, createVlanGroupRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkVlan, createVlanGroupRequestData.createLinkVlan) &&
        Objects.equals(this.createLinkZone, createVlanGroupRequestData.createLinkZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, sourceSystem, name, contextId, remark, status, createLinkContract, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkVlan, createLinkZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVlanGroupRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
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
