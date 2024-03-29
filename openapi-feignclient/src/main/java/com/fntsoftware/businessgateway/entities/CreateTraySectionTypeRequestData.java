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
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionTypeCreateLinkPersonRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateTraySectionTypeRequestData
 */
@JsonPropertyOrder({
  CreateTraySectionTypeRequestData.JSON_PROPERTY_ALLOW_CABLE_LINKS,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_IS_STANDARD,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_DESCRIPTION,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_ID_PREFIX,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_SLACK_CORRECTION,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_TYPE,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_DUCT_TYPE,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  CreateTraySectionTypeRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateTraySectionTypeRequestData {
  public static final String JSON_PROPERTY_ALLOW_CABLE_LINKS = "allowCableLinks";
  private Boolean allowCableLinks;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private Boolean isStandard;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private String idPrefix;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_SLACK_CORRECTION = "slackCorrection";
  private BigDecimal slackCorrection;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<CreateTraySectionTypeCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_DUCT_TYPE = "createLinkDuctType";
  private List<CreateTraySectionTypeCreateLinkDuctTypeRequestData> createLinkDuctType;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<CreateTraySectionTypeCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<CreateTraySectionTypeCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<CreateTraySectionTypeCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<CreateTraySectionTypeCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<CreateTraySectionTypeCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public CreateTraySectionTypeRequestData() {
  }

  public CreateTraySectionTypeRequestData allowCableLinks(Boolean allowCableLinks) {
    
    this.allowCableLinks = allowCableLinks;
    return this;
  }

   /**
   * Get allowCableLinks
   * @return allowCableLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_CABLE_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowCableLinks() {
    return allowCableLinks;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_CABLE_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowCableLinks(Boolean allowCableLinks) {
    this.allowCableLinks = allowCableLinks;
  }


  public CreateTraySectionTypeRequestData sourceId(String sourceId) {
    
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


  public CreateTraySectionTypeRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateTraySectionTypeRequestData isStandard(Boolean isStandard) {
    
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Get isStandard
   * @return isStandard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  public CreateTraySectionTypeRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateTraySectionTypeRequestData description(String description) {
    
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


  public CreateTraySectionTypeRequestData idPrefix(String idPrefix) {
    
    this.idPrefix = idPrefix;
    return this;
  }

   /**
   * Get idPrefix
   * @return idPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdPrefix() {
    return idPrefix;
  }


  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPrefix(String idPrefix) {
    this.idPrefix = idPrefix;
  }


  public CreateTraySectionTypeRequestData contextId(String contextId) {
    
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


  public CreateTraySectionTypeRequestData slackCorrection(BigDecimal slackCorrection) {
    
    this.slackCorrection = slackCorrection;
    return this;
  }

   /**
   * Get slackCorrection
   * @return slackCorrection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLACK_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSlackCorrection() {
    return slackCorrection;
  }


  @JsonProperty(JSON_PROPERTY_SLACK_CORRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlackCorrection(BigDecimal slackCorrection) {
    this.slackCorrection = slackCorrection;
  }


  public CreateTraySectionTypeRequestData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public CreateTraySectionTypeRequestData createLinkContract(List<CreateTraySectionTypeCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkContractItem(CreateTraySectionTypeCreateLinkContractRequestData createLinkContractItem) {
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

  public List<CreateTraySectionTypeCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<CreateTraySectionTypeCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public CreateTraySectionTypeRequestData createLinkDuctType(List<CreateTraySectionTypeCreateLinkDuctTypeRequestData> createLinkDuctType) {
    
    this.createLinkDuctType = createLinkDuctType;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkDuctTypeItem(CreateTraySectionTypeCreateLinkDuctTypeRequestData createLinkDuctTypeItem) {
    if (this.createLinkDuctType == null) {
      this.createLinkDuctType = new ArrayList<>();
    }
    this.createLinkDuctType.add(createLinkDuctTypeItem);
    return this;
  }

   /**
   * Get createLinkDuctType
   * @return createLinkDuctType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateTraySectionTypeCreateLinkDuctTypeRequestData> getCreateLinkDuctType() {
    return createLinkDuctType;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkDuctType(List<CreateTraySectionTypeCreateLinkDuctTypeRequestData> createLinkDuctType) {
    this.createLinkDuctType = createLinkDuctType;
  }


  public CreateTraySectionTypeRequestData createLinkFrameContract(List<CreateTraySectionTypeCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkFrameContractItem(CreateTraySectionTypeCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<CreateTraySectionTypeCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<CreateTraySectionTypeCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public CreateTraySectionTypeRequestData createLinkMaintenanceContract(List<CreateTraySectionTypeCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkMaintenanceContractItem(CreateTraySectionTypeCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<CreateTraySectionTypeCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<CreateTraySectionTypeCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public CreateTraySectionTypeRequestData createLinkOrganization(List<CreateTraySectionTypeCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkOrganizationItem(CreateTraySectionTypeCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<CreateTraySectionTypeCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<CreateTraySectionTypeCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public CreateTraySectionTypeRequestData createLinkPerson(List<CreateTraySectionTypeCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkPersonItem(CreateTraySectionTypeCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<CreateTraySectionTypeCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<CreateTraySectionTypeCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public CreateTraySectionTypeRequestData createLinkPersonGroup(List<CreateTraySectionTypeCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public CreateTraySectionTypeRequestData addCreateLinkPersonGroupItem(CreateTraySectionTypeCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<CreateTraySectionTypeCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<CreateTraySectionTypeCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTraySectionTypeRequestData createTraySectionTypeRequestData = (CreateTraySectionTypeRequestData) o;
    return Objects.equals(this.allowCableLinks, createTraySectionTypeRequestData.allowCableLinks) &&
        Objects.equals(this.sourceId, createTraySectionTypeRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createTraySectionTypeRequestData.ownerSystem) &&
        Objects.equals(this.isStandard, createTraySectionTypeRequestData.isStandard) &&
        Objects.equals(this.sourceSystem, createTraySectionTypeRequestData.sourceSystem) &&
        Objects.equals(this.description, createTraySectionTypeRequestData.description) &&
        Objects.equals(this.idPrefix, createTraySectionTypeRequestData.idPrefix) &&
        Objects.equals(this.contextId, createTraySectionTypeRequestData.contextId) &&
        Objects.equals(this.slackCorrection, createTraySectionTypeRequestData.slackCorrection) &&
        Objects.equals(this.type, createTraySectionTypeRequestData.type) &&
        Objects.equals(this.createLinkContract, createTraySectionTypeRequestData.createLinkContract) &&
        Objects.equals(this.createLinkDuctType, createTraySectionTypeRequestData.createLinkDuctType) &&
        Objects.equals(this.createLinkFrameContract, createTraySectionTypeRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, createTraySectionTypeRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, createTraySectionTypeRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, createTraySectionTypeRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, createTraySectionTypeRequestData.createLinkPersonGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCableLinks, sourceId, ownerSystem, isStandard, sourceSystem, description, idPrefix, contextId, slackCorrection, type, createLinkContract, createLinkDuctType, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTraySectionTypeRequestData {\n");
    sb.append("    allowCableLinks: ").append(toIndentedString(allowCableLinks)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    slackCorrection: ").append(toIndentedString(slackCorrection)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkDuctType: ").append(toIndentedString(createLinkDuctType)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    createLinkPerson: ").append(toIndentedString(createLinkPerson)).append("\n");
    sb.append("    createLinkPersonGroup: ").append(toIndentedString(createLinkPersonGroup)).append("\n");
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

