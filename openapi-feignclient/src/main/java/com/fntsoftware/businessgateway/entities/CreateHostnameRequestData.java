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
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkAliasRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkDomainRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkIpv4AddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateHostnameCreateLinkPersonRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateHostnameRequestData
 */
@JsonPropertyOrder({
  CreateHostnameRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateHostnameRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateHostnameRequestData.JSON_PROPERTY_HOSTNAME,
  CreateHostnameRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateHostnameRequestData.JSON_PROPERTY_SUBDOMAIN,
  CreateHostnameRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateHostnameRequestData.JSON_PROPERTY_REMARK,
  CreateHostnameRequestData.JSON_PROPERTY_REMOTE,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_ALIAS,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_CONTRACT,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_DOMAIN,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_IPV4_ADDRESS,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_NET_MANDATOR,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_PERSON,
  CreateHostnameRequestData.JSON_PROPERTY_CREATE_LINK_PERSON_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateHostnameRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_SUBDOMAIN = "subdomain";
  private String subdomain;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_REMOTE = "remote";
  private Boolean remote;

  public static final String JSON_PROPERTY_CREATE_LINK_ALIAS = "createLinkAlias";
  private List<CreateHostnameCreateLinkAliasRequestData> createLinkAlias;

  public static final String JSON_PROPERTY_CREATE_LINK_CONTRACT = "createLinkContract";
  private List<CreateHostnameCreateLinkContractRequestData> createLinkContract;

  public static final String JSON_PROPERTY_CREATE_LINK_DOMAIN = "createLinkDomain";
  private CreateHostnameCreateLinkDomainRequestData createLinkDomain;

  public static final String JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT = "createLinkFrameContract";
  private List<CreateHostnameCreateLinkFrameContractRequestData> createLinkFrameContract;

  public static final String JSON_PROPERTY_CREATE_LINK_IPV4_ADDRESS = "createLinkIpv4Address";
  private List<CreateHostnameCreateLinkIpv4AddressRequestData> createLinkIpv4Address;

  public static final String JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS = "createLinkIpv6Address";
  private List<CreateHostnameCreateLinkIpv6AddressRequestData> createLinkIpv6Address;

  public static final String JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT = "createLinkMaintenanceContract";
  private List<CreateHostnameCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract;

  public static final String JSON_PROPERTY_CREATE_LINK_NET_MANDATOR = "createLinkNetMandator";
  private CreateHostnameCreateLinkNetMandatorRequestData createLinkNetMandator;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<CreateHostnameCreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON = "createLinkPerson";
  private List<CreateHostnameCreateLinkPersonRequestData> createLinkPerson;

  public static final String JSON_PROPERTY_CREATE_LINK_PERSON_GROUP = "createLinkPersonGroup";
  private List<CreateHostnameCreateLinkPersonGroupRequestData> createLinkPersonGroup;

  public CreateHostnameRequestData() {
  }

  public CreateHostnameRequestData sourceId(String sourceId) {
    
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


  public CreateHostnameRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateHostnameRequestData hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostname() {
    return hostname;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public CreateHostnameRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateHostnameRequestData subdomain(String subdomain) {
    
    this.subdomain = subdomain;
    return this;
  }

   /**
   * Get subdomain
   * @return subdomain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubdomain() {
    return subdomain;
  }


  @JsonProperty(JSON_PROPERTY_SUBDOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }


  public CreateHostnameRequestData contextId(String contextId) {
    
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


  public CreateHostnameRequestData remark(String remark) {
    
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


  public CreateHostnameRequestData remote(Boolean remote) {
    
    this.remote = remote;
    return this;
  }

   /**
   * Get remote
   * @return remote
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemote() {
    return remote;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemote(Boolean remote) {
    this.remote = remote;
  }


  public CreateHostnameRequestData createLinkAlias(List<CreateHostnameCreateLinkAliasRequestData> createLinkAlias) {
    
    this.createLinkAlias = createLinkAlias;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkAliasItem(CreateHostnameCreateLinkAliasRequestData createLinkAliasItem) {
    if (this.createLinkAlias == null) {
      this.createLinkAlias = new ArrayList<>();
    }
    this.createLinkAlias.add(createLinkAliasItem);
    return this;
  }

   /**
   * Get createLinkAlias
   * @return createLinkAlias
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateHostnameCreateLinkAliasRequestData> getCreateLinkAlias() {
    return createLinkAlias;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkAlias(List<CreateHostnameCreateLinkAliasRequestData> createLinkAlias) {
    this.createLinkAlias = createLinkAlias;
  }


  public CreateHostnameRequestData createLinkContract(List<CreateHostnameCreateLinkContractRequestData> createLinkContract) {
    
    this.createLinkContract = createLinkContract;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkContractItem(CreateHostnameCreateLinkContractRequestData createLinkContractItem) {
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

  public List<CreateHostnameCreateLinkContractRequestData> getCreateLinkContract() {
    return createLinkContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkContract(List<CreateHostnameCreateLinkContractRequestData> createLinkContract) {
    this.createLinkContract = createLinkContract;
  }


  public CreateHostnameRequestData createLinkDomain(CreateHostnameCreateLinkDomainRequestData createLinkDomain) {
    
    this.createLinkDomain = createLinkDomain;
    return this;
  }

   /**
   * Get createLinkDomain
   * @return createLinkDomain
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateHostnameCreateLinkDomainRequestData getCreateLinkDomain() {
    return createLinkDomain;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkDomain(CreateHostnameCreateLinkDomainRequestData createLinkDomain) {
    this.createLinkDomain = createLinkDomain;
  }


  public CreateHostnameRequestData createLinkFrameContract(List<CreateHostnameCreateLinkFrameContractRequestData> createLinkFrameContract) {
    
    this.createLinkFrameContract = createLinkFrameContract;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkFrameContractItem(CreateHostnameCreateLinkFrameContractRequestData createLinkFrameContractItem) {
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

  public List<CreateHostnameCreateLinkFrameContractRequestData> getCreateLinkFrameContract() {
    return createLinkFrameContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_FRAME_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkFrameContract(List<CreateHostnameCreateLinkFrameContractRequestData> createLinkFrameContract) {
    this.createLinkFrameContract = createLinkFrameContract;
  }


  public CreateHostnameRequestData createLinkIpv4Address(List<CreateHostnameCreateLinkIpv4AddressRequestData> createLinkIpv4Address) {
    
    this.createLinkIpv4Address = createLinkIpv4Address;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkIpv4AddressItem(CreateHostnameCreateLinkIpv4AddressRequestData createLinkIpv4AddressItem) {
    if (this.createLinkIpv4Address == null) {
      this.createLinkIpv4Address = new ArrayList<>();
    }
    this.createLinkIpv4Address.add(createLinkIpv4AddressItem);
    return this;
  }

   /**
   * Get createLinkIpv4Address
   * @return createLinkIpv4Address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_IPV4_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateHostnameCreateLinkIpv4AddressRequestData> getCreateLinkIpv4Address() {
    return createLinkIpv4Address;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_IPV4_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkIpv4Address(List<CreateHostnameCreateLinkIpv4AddressRequestData> createLinkIpv4Address) {
    this.createLinkIpv4Address = createLinkIpv4Address;
  }


  public CreateHostnameRequestData createLinkIpv6Address(List<CreateHostnameCreateLinkIpv6AddressRequestData> createLinkIpv6Address) {
    
    this.createLinkIpv6Address = createLinkIpv6Address;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkIpv6AddressItem(CreateHostnameCreateLinkIpv6AddressRequestData createLinkIpv6AddressItem) {
    if (this.createLinkIpv6Address == null) {
      this.createLinkIpv6Address = new ArrayList<>();
    }
    this.createLinkIpv6Address.add(createLinkIpv6AddressItem);
    return this;
  }

   /**
   * Get createLinkIpv6Address
   * @return createLinkIpv6Address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateHostnameCreateLinkIpv6AddressRequestData> getCreateLinkIpv6Address() {
    return createLinkIpv6Address;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkIpv6Address(List<CreateHostnameCreateLinkIpv6AddressRequestData> createLinkIpv6Address) {
    this.createLinkIpv6Address = createLinkIpv6Address;
  }


  public CreateHostnameRequestData createLinkMaintenanceContract(List<CreateHostnameCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkMaintenanceContractItem(CreateHostnameCreateLinkMaintenanceContractRequestData createLinkMaintenanceContractItem) {
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

  public List<CreateHostnameCreateLinkMaintenanceContractRequestData> getCreateLinkMaintenanceContract() {
    return createLinkMaintenanceContract;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_MAINTENANCE_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkMaintenanceContract(List<CreateHostnameCreateLinkMaintenanceContractRequestData> createLinkMaintenanceContract) {
    this.createLinkMaintenanceContract = createLinkMaintenanceContract;
  }


  public CreateHostnameRequestData createLinkNetMandator(CreateHostnameCreateLinkNetMandatorRequestData createLinkNetMandator) {
    
    this.createLinkNetMandator = createLinkNetMandator;
    return this;
  }

   /**
   * Get createLinkNetMandator
   * @return createLinkNetMandator
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_NET_MANDATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateHostnameCreateLinkNetMandatorRequestData getCreateLinkNetMandator() {
    return createLinkNetMandator;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_NET_MANDATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkNetMandator(CreateHostnameCreateLinkNetMandatorRequestData createLinkNetMandator) {
    this.createLinkNetMandator = createLinkNetMandator;
  }


  public CreateHostnameRequestData createLinkOrganization(List<CreateHostnameCreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkOrganizationItem(CreateHostnameCreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<CreateHostnameCreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<CreateHostnameCreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public CreateHostnameRequestData createLinkPerson(List<CreateHostnameCreateLinkPersonRequestData> createLinkPerson) {
    
    this.createLinkPerson = createLinkPerson;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkPersonItem(CreateHostnameCreateLinkPersonRequestData createLinkPersonItem) {
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

  public List<CreateHostnameCreateLinkPersonRequestData> getCreateLinkPerson() {
    return createLinkPerson;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPerson(List<CreateHostnameCreateLinkPersonRequestData> createLinkPerson) {
    this.createLinkPerson = createLinkPerson;
  }


  public CreateHostnameRequestData createLinkPersonGroup(List<CreateHostnameCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
    
    this.createLinkPersonGroup = createLinkPersonGroup;
    return this;
  }

  public CreateHostnameRequestData addCreateLinkPersonGroupItem(CreateHostnameCreateLinkPersonGroupRequestData createLinkPersonGroupItem) {
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

  public List<CreateHostnameCreateLinkPersonGroupRequestData> getCreateLinkPersonGroup() {
    return createLinkPersonGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_PERSON_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkPersonGroup(List<CreateHostnameCreateLinkPersonGroupRequestData> createLinkPersonGroup) {
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
    CreateHostnameRequestData createHostnameRequestData = (CreateHostnameRequestData) o;
    return Objects.equals(this.sourceId, createHostnameRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createHostnameRequestData.ownerSystem) &&
        Objects.equals(this.hostname, createHostnameRequestData.hostname) &&
        Objects.equals(this.sourceSystem, createHostnameRequestData.sourceSystem) &&
        Objects.equals(this.subdomain, createHostnameRequestData.subdomain) &&
        Objects.equals(this.contextId, createHostnameRequestData.contextId) &&
        Objects.equals(this.remark, createHostnameRequestData.remark) &&
        Objects.equals(this.remote, createHostnameRequestData.remote) &&
        Objects.equals(this.createLinkAlias, createHostnameRequestData.createLinkAlias) &&
        Objects.equals(this.createLinkContract, createHostnameRequestData.createLinkContract) &&
        Objects.equals(this.createLinkDomain, createHostnameRequestData.createLinkDomain) &&
        Objects.equals(this.createLinkFrameContract, createHostnameRequestData.createLinkFrameContract) &&
        Objects.equals(this.createLinkIpv4Address, createHostnameRequestData.createLinkIpv4Address) &&
        Objects.equals(this.createLinkIpv6Address, createHostnameRequestData.createLinkIpv6Address) &&
        Objects.equals(this.createLinkMaintenanceContract, createHostnameRequestData.createLinkMaintenanceContract) &&
        Objects.equals(this.createLinkNetMandator, createHostnameRequestData.createLinkNetMandator) &&
        Objects.equals(this.createLinkOrganization, createHostnameRequestData.createLinkOrganization) &&
        Objects.equals(this.createLinkPerson, createHostnameRequestData.createLinkPerson) &&
        Objects.equals(this.createLinkPersonGroup, createHostnameRequestData.createLinkPersonGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, hostname, sourceSystem, subdomain, contextId, remark, remote, createLinkAlias, createLinkContract, createLinkDomain, createLinkFrameContract, createLinkIpv4Address, createLinkIpv6Address, createLinkMaintenanceContract, createLinkNetMandator, createLinkOrganization, createLinkPerson, createLinkPersonGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHostnameRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    createLinkAlias: ").append(toIndentedString(createLinkAlias)).append("\n");
    sb.append("    createLinkContract: ").append(toIndentedString(createLinkContract)).append("\n");
    sb.append("    createLinkDomain: ").append(toIndentedString(createLinkDomain)).append("\n");
    sb.append("    createLinkFrameContract: ").append(toIndentedString(createLinkFrameContract)).append("\n");
    sb.append("    createLinkIpv4Address: ").append(toIndentedString(createLinkIpv4Address)).append("\n");
    sb.append("    createLinkIpv6Address: ").append(toIndentedString(createLinkIpv6Address)).append("\n");
    sb.append("    createLinkMaintenanceContract: ").append(toIndentedString(createLinkMaintenanceContract)).append("\n");
    sb.append("    createLinkNetMandator: ").append(toIndentedString(createLinkNetMandator)).append("\n");
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
