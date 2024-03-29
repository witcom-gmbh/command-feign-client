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
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateServiceTypePathWdmServiceTypeDefinitionRequestData
 */
@JsonPropertyOrder({
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_SERVICE_TYPE,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_IS_CUSTOMER_SERVICE,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_PROVIDED_RESOURCE_AMOUNT,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_ID_PREFIX,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_PROVIDED_RESOURCE,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_BASE_BANDWIDTH,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_LINE_TYPE,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_OUTPUT_RESOURCE,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_SERVICE_TYPE_NAME,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  CreateServiceTypePathWdmServiceTypeDefinitionRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateServiceTypePathWdmServiceTypeDefinitionRequestData {
  public static final String JSON_PROPERTY_SERVICE_TYPE = "serviceType";
  private String serviceType;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_IS_CUSTOMER_SERVICE = "isCustomerService";
  private Boolean isCustomerService;

  public static final String JSON_PROPERTY_PROVIDED_RESOURCE_AMOUNT = "providedResourceAmount";
  private BigDecimal providedResourceAmount;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private String idPrefix;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_PROVIDED_RESOURCE = "providedResource";
  private String providedResource;

  public static final String JSON_PROPERTY_BASE_BANDWIDTH = "baseBandwidth";
  private BigDecimal baseBandwidth;

  public static final String JSON_PROPERTY_LINE_TYPE = "lineType";
  private String lineType;

  public static final String JSON_PROPERTY_OUTPUT_RESOURCE = "outputResource";
  private String outputResource;

  public static final String JSON_PROPERTY_SERVICE_TYPE_NAME = "serviceTypeName";
  private String serviceTypeName;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData() {
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceType() {
    return serviceType;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData sourceId(String sourceId) {
    
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


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData isCustomerService(Boolean isCustomerService) {
    
    this.isCustomerService = isCustomerService;
    return this;
  }

   /**
   * Get isCustomerService
   * @return isCustomerService
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CUSTOMER_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCustomerService() {
    return isCustomerService;
  }


  @JsonProperty(JSON_PROPERTY_IS_CUSTOMER_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCustomerService(Boolean isCustomerService) {
    this.isCustomerService = isCustomerService;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData providedResourceAmount(BigDecimal providedResourceAmount) {
    
    this.providedResourceAmount = providedResourceAmount;
    return this;
  }

   /**
   * Get providedResourceAmount
   * @return providedResourceAmount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDED_RESOURCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getProvidedResourceAmount() {
    return providedResourceAmount;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDED_RESOURCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvidedResourceAmount(BigDecimal providedResourceAmount) {
    this.providedResourceAmount = providedResourceAmount;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData idPrefix(String idPrefix) {
    
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


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData contextId(String contextId) {
    
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


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData providedResource(String providedResource) {
    
    this.providedResource = providedResource;
    return this;
  }

   /**
   * Get providedResource
   * @return providedResource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDED_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvidedResource() {
    return providedResource;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDED_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvidedResource(String providedResource) {
    this.providedResource = providedResource;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData baseBandwidth(BigDecimal baseBandwidth) {
    
    this.baseBandwidth = baseBandwidth;
    return this;
  }

   /**
   * Get baseBandwidth
   * @return baseBandwidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBaseBandwidth() {
    return baseBandwidth;
  }


  @JsonProperty(JSON_PROPERTY_BASE_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseBandwidth(BigDecimal baseBandwidth) {
    this.baseBandwidth = baseBandwidth;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData lineType(String lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineType() {
    return lineType;
  }


  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData outputResource(String outputResource) {
    
    this.outputResource = outputResource;
    return this;
  }

   /**
   * Get outputResource
   * @return outputResource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutputResource() {
    return outputResource;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputResource(String outputResource) {
    this.outputResource = outputResource;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData serviceTypeName(String serviceTypeName) {
    
    this.serviceTypeName = serviceTypeName;
    return this;
  }

   /**
   * Get serviceTypeName
   * @return serviceTypeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceTypeName() {
    return serviceTypeName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData createLinkContract(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData addCreateLinkContractItem(CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkContractRequestData createLinkContractItem) {
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

  public List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData createLinkFrameContract(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData addCreateLinkFrameContractItem(CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData createLinkMaintenanceContract(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData addCreateLinkMaintenanceContractItem(CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData createLinkOrganization(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData addCreateLinkOrganizationItem(CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData createLinkPerson(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData addCreateLinkPersonItem(CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData createLinkPersonGroup(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public CreateServiceTypePathWdmServiceTypeDefinitionRequestData addCreateLinkPersonGroupItem(CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<CreateServiceTypePathWdmServiceTypeDefinitionCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
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
    CreateServiceTypePathWdmServiceTypeDefinitionRequestData createServiceTypePathWdmServiceTypeDefinitionRequestData = (CreateServiceTypePathWdmServiceTypeDefinitionRequestData) o;
    return Objects.equals(this.serviceType, createServiceTypePathWdmServiceTypeDefinitionRequestData.serviceType) &&
        Objects.equals(this.sourceId, createServiceTypePathWdmServiceTypeDefinitionRequestData.sourceId) &&
        Objects.equals(this.isCustomerService, createServiceTypePathWdmServiceTypeDefinitionRequestData.isCustomerService) &&
        Objects.equals(this.providedResourceAmount, createServiceTypePathWdmServiceTypeDefinitionRequestData.providedResourceAmount) &&
        Objects.equals(this.sourceSystem, createServiceTypePathWdmServiceTypeDefinitionRequestData.sourceSystem) &&
        Objects.equals(this.idPrefix, createServiceTypePathWdmServiceTypeDefinitionRequestData.idPrefix) &&
        Objects.equals(this.contextId, createServiceTypePathWdmServiceTypeDefinitionRequestData.contextId) &&
        Objects.equals(this.ownerSystem, createServiceTypePathWdmServiceTypeDefinitionRequestData.ownerSystem) &&
        Objects.equals(this.providedResource, createServiceTypePathWdmServiceTypeDefinitionRequestData.providedResource) &&
        Objects.equals(this.baseBandwidth, createServiceTypePathWdmServiceTypeDefinitionRequestData.baseBandwidth) &&
        Objects.equals(this.lineType, createServiceTypePathWdmServiceTypeDefinitionRequestData.lineType) &&
        Objects.equals(this.outputResource, createServiceTypePathWdmServiceTypeDefinitionRequestData.outputResource) &&
        Objects.equals(this.serviceTypeName, createServiceTypePathWdmServiceTypeDefinitionRequestData.serviceTypeName) &&
        Objects.equals(this.createLinkContract, createServiceTypePathWdmServiceTypeDefinitionRequestData.createLinkContract) &&
        Objects.equals(this.createLinkFrameContract, createServiceTypePathWdmServiceTypeDefinitionRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, createServiceTypePathWdmServiceTypeDefinitionRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, createServiceTypePathWdmServiceTypeDefinitionRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, createServiceTypePathWdmServiceTypeDefinitionRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, createServiceTypePathWdmServiceTypeDefinitionRequestData.createLinkPersonGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, sourceId, isCustomerService, providedResourceAmount, sourceSystem, idPrefix, contextId, ownerSystem, providedResource, baseBandwidth, lineType, outputResource, serviceTypeName, createLinkContract, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceTypePathWdmServiceTypeDefinitionRequestData {\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    isCustomerService: ").append(toIndentedString(isCustomerService)).append("\n");
    sb.append("    providedResourceAmount: ").append(toIndentedString(providedResourceAmount)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    providedResource: ").append(toIndentedString(providedResource)).append("\n");
    sb.append("    baseBandwidth: ").append(toIndentedString(baseBandwidth)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    outputResource: ").append(toIndentedString(outputResource)).append("\n");
    sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
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

