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
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceCreateLinkSoftwareInstallationRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateSoftwareInstanceRequestData
 */
@JsonPropertyOrder({
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_NAME,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_DESCRIPTION,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_ID,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_STATUS,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  CreateSoftwareInstanceRequestData.JSON_PROPERTY_CREATE_LINK_SOFTWARE_INSTALLATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateSoftwareInstanceRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<CreateSoftwareInstanceCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<CreateSoftwareInstanceCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<CreateSoftwareInstanceCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<CreateSoftwareInstanceCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<CreateSoftwareInstanceCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<CreateSoftwareInstanceCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_SOFTWARE_INSTALLATION = "createLinkSoftwareInstallation";
  private CreateSoftwareInstanceCreateLinkSoftwareInstallationRequestData createLinkSoftwareInstallation;

  public CreateSoftwareInstanceRequestData() {
  }

  public CreateSoftwareInstanceRequestData sourceId(String sourceId) {
    
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


  public CreateSoftwareInstanceRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateSoftwareInstanceRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateSoftwareInstanceRequestData name(String name) {
    
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


  public CreateSoftwareInstanceRequestData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateSoftwareInstanceRequestData contextId(String contextId) {
    
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


  public CreateSoftwareInstanceRequestData id(String id) {
    
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


  public CreateSoftwareInstanceRequestData status(String status) {
    
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


  public CreateSoftwareInstanceRequestData createLinkContract(List<CreateSoftwareInstanceCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public CreateSoftwareInstanceRequestData addCreateLinkContractItem(CreateSoftwareInstanceCreateLinkContractRequestData createLinkContractItem) {
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

  public List<CreateSoftwareInstanceCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<CreateSoftwareInstanceCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public CreateSoftwareInstanceRequestData createLinkFrameContract(List<CreateSoftwareInstanceCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public CreateSoftwareInstanceRequestData addCreateLinkFrameContractItem(CreateSoftwareInstanceCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<CreateSoftwareInstanceCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<CreateSoftwareInstanceCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public CreateSoftwareInstanceRequestData createLinkMaintenanceContract(List<CreateSoftwareInstanceCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public CreateSoftwareInstanceRequestData addCreateLinkMaintenanceContractItem(CreateSoftwareInstanceCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<CreateSoftwareInstanceCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<CreateSoftwareInstanceCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public CreateSoftwareInstanceRequestData createLinkOrganization(List<CreateSoftwareInstanceCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public CreateSoftwareInstanceRequestData addCreateLinkOrganizationItem(CreateSoftwareInstanceCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<CreateSoftwareInstanceCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<CreateSoftwareInstanceCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public CreateSoftwareInstanceRequestData createLinkPerson(List<CreateSoftwareInstanceCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public CreateSoftwareInstanceRequestData addCreateLinkPersonItem(CreateSoftwareInstanceCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<CreateSoftwareInstanceCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<CreateSoftwareInstanceCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public CreateSoftwareInstanceRequestData createLinkPersonGroup(List<CreateSoftwareInstanceCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public CreateSoftwareInstanceRequestData addCreateLinkPersonGroupItem(CreateSoftwareInstanceCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<CreateSoftwareInstanceCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<CreateSoftwareInstanceCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public CreateSoftwareInstanceRequestData createLinkSoftwareInstallation(CreateSoftwareInstanceCreateLinkSoftwareInstallationRequestData createLinkSoftwareInstallation) {
    
    this.createLinkSoftwareInstallation = createLinkSoftwareInstallation;
    return this;
  }

   /**
   * Get createLinkSoftwareInstallation
   * @return createLinkSoftwareInstallation
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SOFTWARE_INSTALLATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateSoftwareInstanceCreateLinkSoftwareInstallationRequestData getCreateLinkSoftwareInstallation() {
    return createLinkSoftwareInstallation;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SOFTWARE_INSTALLATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkSoftwareInstallation(CreateSoftwareInstanceCreateLinkSoftwareInstallationRequestData createLinkSoftwareInstallation) {
    this.createLinkSoftwareInstallation = createLinkSoftwareInstallation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSoftwareInstanceRequestData createSoftwareInstanceRequestData = (CreateSoftwareInstanceRequestData) o;
    return Objects.equals(this.sourceId, createSoftwareInstanceRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createSoftwareInstanceRequestData.ownerSystem) &&
        Objects.equals(this.sourceSystem, createSoftwareInstanceRequestData.sourceSystem) &&
        Objects.equals(this.name, createSoftwareInstanceRequestData.name) &&
        Objects.equals(this.description, createSoftwareInstanceRequestData.description) &&
        Objects.equals(this.contextId, createSoftwareInstanceRequestData.contextId) &&
        Objects.equals(this.id, createSoftwareInstanceRequestData.id) &&
        Objects.equals(this.status, createSoftwareInstanceRequestData.status) &&
        Objects.equals(this.createLinkContract, createSoftwareInstanceRequestData.createLinkContract) &&
        Objects.equals(this.createLinkFrameContract, createSoftwareInstanceRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, createSoftwareInstanceRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, createSoftwareInstanceRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, createSoftwareInstanceRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, createSoftwareInstanceRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkSoftwareInstallation, createSoftwareInstanceRequestData.createLinkSoftwareInstallation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, sourceSystem, name, description, contextId, id, status, createLinkContract, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkSoftwareInstallation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSoftwareInstanceRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    createLinkPerson: ").append(toIndentedString(createLinkPerson)).append("\n");
    sb.append("    createLinkPersonGroup: ").append(toIndentedString(createLinkPersonGroup)).append("\n");
    sb.append("    createLinkSoftwareInstallation: ").append(toIndentedString(createLinkSoftwareInstallation)).append("\n");
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
