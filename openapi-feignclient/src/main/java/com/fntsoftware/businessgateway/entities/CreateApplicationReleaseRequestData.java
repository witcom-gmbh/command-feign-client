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
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkPersonRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseCreateLinkSoftwareProductRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateApplicationReleaseRequestData
 */
@JsonPropertyOrder({
  CreateApplicationReleaseRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_INSTALL_REQUIREMENT,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_APPLICATION,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_DESCRIPTION,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_HOTLINE_NO,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_REMARK,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_ID,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_VERSION,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP,
  CreateApplicationReleaseRequestData.JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateApplicationReleaseRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_INSTALL_REQUIREMENT = "installRequirement";
  private String installRequirement;

  public static final String JSON_PROPERTY_APPLICATION = "application";
  private String application;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_HOTLINE_NO = "hotlineNo";
  private String hotlineNo;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<CreateApplicationReleaseCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<CreateApplicationReleaseCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<CreateApplicationReleaseCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<CreateApplicationReleaseCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<CreateApplicationReleaseCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<CreateApplicationReleaseCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public static final String JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT = "createLinkSoftwareProduct";
  private List<CreateApplicationReleaseCreateLinkSoftwareProductRequestData> createLinkSoftwareProduct;

  public CreateApplicationReleaseRequestData() {
  }

  public CreateApplicationReleaseRequestData sourceId(String sourceId) {
    
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


  public CreateApplicationReleaseRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateApplicationReleaseRequestData installRequirement(String installRequirement) {
    
    this.installRequirement = installRequirement;
    return this;
  }

   /**
   * Get installRequirement
   * @return installRequirement
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstallRequirement() {
    return installRequirement;
  }


  @JsonProperty(JSON_PROPERTY_INSTALL_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallRequirement(String installRequirement) {
    this.installRequirement = installRequirement;
  }


  public CreateApplicationReleaseRequestData application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplication() {
    return application;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(String application) {
    this.application = application;
  }


  public CreateApplicationReleaseRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateApplicationReleaseRequestData description(String description) {
    
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


  public CreateApplicationReleaseRequestData contextId(String contextId) {
    
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


  public CreateApplicationReleaseRequestData hotlineNo(String hotlineNo) {
    
    this.hotlineNo = hotlineNo;
    return this;
  }

   /**
   * Get hotlineNo
   * @return hotlineNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOTLINE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHotlineNo() {
    return hotlineNo;
  }


  @JsonProperty(JSON_PROPERTY_HOTLINE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHotlineNo(String hotlineNo) {
    this.hotlineNo = hotlineNo;
  }


  public CreateApplicationReleaseRequestData remark(String remark) {
    
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


  public CreateApplicationReleaseRequestData id(String id) {
    
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


  public CreateApplicationReleaseRequestData version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public CreateApplicationReleaseRequestData createLinkContract(List<CreateApplicationReleaseCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkContractItem(CreateApplicationReleaseCreateLinkContractRequestData createLinkContractItem) {
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

  public List<CreateApplicationReleaseCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<CreateApplicationReleaseCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public CreateApplicationReleaseRequestData createLinkFrameContract(List<CreateApplicationReleaseCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkFrameContractItem(CreateApplicationReleaseCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<CreateApplicationReleaseCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<CreateApplicationReleaseCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public CreateApplicationReleaseRequestData createLinkMaintenanceContract(List<CreateApplicationReleaseCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkMaintenanceContractItem(CreateApplicationReleaseCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<CreateApplicationReleaseCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<CreateApplicationReleaseCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public CreateApplicationReleaseRequestData createLinkOrganization(List<CreateApplicationReleaseCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkOrganizationItem(CreateApplicationReleaseCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<CreateApplicationReleaseCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<CreateApplicationReleaseCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public CreateApplicationReleaseRequestData createLinkPerson(List<CreateApplicationReleaseCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkPersonItem(CreateApplicationReleaseCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<CreateApplicationReleaseCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<CreateApplicationReleaseCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public CreateApplicationReleaseRequestData createLinkPersonGroup(List<CreateApplicationReleaseCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkPersonGroupItem(CreateApplicationReleaseCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<CreateApplicationReleaseCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<CreateApplicationReleaseCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    this.createLinkPersonGroup = createLinkPersonGroup;
  }


  public CreateApplicationReleaseRequestData createLinkSoftwareProduct(List<CreateApplicationReleaseCreateLinkSoftwareProductRequestData> createLinkSoftwareProduct) {
    
    this.createLinkSoftwareProduct = createLinkSoftwareProduct;
    return this;
  }

  public CreateApplicationReleaseRequestData addCreateLinkSoftwareProductItem(CreateApplicationReleaseCreateLinkSoftwareProductRequestData createLinkSoftwareProductItem) {
    if (this.createLinkSoftwareProduct == null) {
      this.createLinkSoftwareProduct = new ArrayList<>();
    }
    this.createLinkSoftwareProduct.add(createLinkSoftwareProductItem);
    return this;
  }

   /**
   * Get createLinkSoftwareProduct
   * @return createLinkSoftwareProduct
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateApplicationReleaseCreateLinkSoftwareProductRequestData> getCreateLinkSoftwareProduct() {
    return createLinkSoftwareProduct;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkSoftwareProduct(List<CreateApplicationReleaseCreateLinkSoftwareProductRequestData> createLinkSoftwareProduct) {
    this.createLinkSoftwareProduct = createLinkSoftwareProduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicationReleaseRequestData createApplicationReleaseRequestData = (CreateApplicationReleaseRequestData) o;
    return Objects.equals(this.sourceId, createApplicationReleaseRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createApplicationReleaseRequestData.ownerSystem) &&
        Objects.equals(this.installRequirement, createApplicationReleaseRequestData.installRequirement) &&
        Objects.equals(this.application, createApplicationReleaseRequestData.application) &&
        Objects.equals(this.sourceSystem, createApplicationReleaseRequestData.sourceSystem) &&
        Objects.equals(this.description, createApplicationReleaseRequestData.description) &&
        Objects.equals(this.contextId, createApplicationReleaseRequestData.contextId) &&
        Objects.equals(this.hotlineNo, createApplicationReleaseRequestData.hotlineNo) &&
        Objects.equals(this.remark, createApplicationReleaseRequestData.remark) &&
        Objects.equals(this.id, createApplicationReleaseRequestData.id) &&
        Objects.equals(this.version, createApplicationReleaseRequestData.version) &&
        Objects.equals(this.createLinkContract, createApplicationReleaseRequestData.createLinkContract) &&
        Objects.equals(this.createLinkFrameContract, createApplicationReleaseRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkMaintenanceContract, createApplicationReleaseRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkOrganization, createApplicationReleaseRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, createApplicationReleaseRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, createApplicationReleaseRequestData.createLinkPersonGroup) &&
        Objects.equals(this.createLinkSoftwareProduct, createApplicationReleaseRequestData.createLinkSoftwareProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, installRequirement, application, sourceSystem, description, contextId, hotlineNo, remark, id, version, createLinkContract, createLinkFrameContract, createLinkMaintenanceContract, createLinkOrganization, createLinkPerson, createLinkPersonGroup, createLinkSoftwareProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicationReleaseRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    installRequirement: ").append(toIndentedString(installRequirement)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    hotlineNo: ").append(toIndentedString(hotlineNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    createLinkPerson: ").append(toIndentedString(createLinkPerson)).append("\n");
    sb.append("    createLinkPersonGroup: ").append(toIndentedString(createLinkPersonGroup)).append("\n");
    sb.append("    createLinkSoftwareProduct: ").append(toIndentedString(createLinkSoftwareProduct)).append("\n");
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
