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
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6CreateLinkIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6CreateLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6DeleteLinkIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6DeleteLinkOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6UpdateLinkIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6UpdateLinkOrganizationRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateCustomBgpnbv6RequestData
 */
@JsonPropertyOrder({
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_LOCAL_AS,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_REMOTE_AS,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_ID,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_CREATE_LINK_ORGANIZATION,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_DELETE_LINK_IPV6_ADDRESS,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_DELETE_LINK_ORGANIZATION,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_UPDATE_LINK_IPV6_ADDRESS,
  UpdateCustomBgpnbv6RequestData.JSON_PROPERTY_UPDATE_LINK_ORGANIZATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateCustomBgpnbv6RequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_LOCAL_AS = "localAs";
  private String localAs;

  public static final String JSON_PROPERTY_REMOTE_AS = "remoteAs";
  private String remoteAs;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS = "createLinkIpv6Address";
  private List<UpdateCustomBgpnbv6CreateLinkIpv6AddressRequestData> createLinkIpv6Address;

  public static final String JSON_PROPERTY_CREATE_LINK_ORGANIZATION = "createLinkOrganization";
  private List<UpdateCustomBgpnbv6CreateLinkOrganizationRequestData> createLinkOrganization;

  public static final String JSON_PROPERTY_DELETE_LINK_IPV6_ADDRESS = "deleteLinkIpv6Address";
  private List<UpdateCustomBgpnbv6DeleteLinkIpv6AddressRequestData> deleteLinkIpv6Address;

  public static final String JSON_PROPERTY_DELETE_LINK_ORGANIZATION = "deleteLinkOrganization";
  private List<UpdateCustomBgpnbv6DeleteLinkOrganizationRequestData> deleteLinkOrganization;

  public static final String JSON_PROPERTY_UPDATE_LINK_IPV6_ADDRESS = "updateLinkIpv6Address";
  private List<UpdateCustomBgpnbv6UpdateLinkIpv6AddressRequestData> updateLinkIpv6Address;

  public static final String JSON_PROPERTY_UPDATE_LINK_ORGANIZATION = "updateLinkOrganization";
  private List<UpdateCustomBgpnbv6UpdateLinkOrganizationRequestData> updateLinkOrganization;

  public UpdateCustomBgpnbv6RequestData() {
  }

  public UpdateCustomBgpnbv6RequestData sourceId(String sourceId) {
    
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


  public UpdateCustomBgpnbv6RequestData localAs(String localAs) {
    
    this.localAs = localAs;
    return this;
  }

   /**
   * Get localAs
   * @return localAs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalAs() {
    return localAs;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalAs(String localAs) {
    this.localAs = localAs;
  }


  public UpdateCustomBgpnbv6RequestData remoteAs(String remoteAs) {
    
    this.remoteAs = remoteAs;
    return this;
  }

   /**
   * Get remoteAs
   * @return remoteAs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemoteAs() {
    return remoteAs;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoteAs(String remoteAs) {
    this.remoteAs = remoteAs;
  }


  public UpdateCustomBgpnbv6RequestData sourceSystem(String sourceSystem) {
    
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


  public UpdateCustomBgpnbv6RequestData contextId(String contextId) {
    
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


  public UpdateCustomBgpnbv6RequestData id(String id) {
    
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


  public UpdateCustomBgpnbv6RequestData createLinkIpv6Address(List<UpdateCustomBgpnbv6CreateLinkIpv6AddressRequestData> createLinkIpv6Address) {
    
    this.createLinkIpv6Address = createLinkIpv6Address;
    return this;
  }

  public UpdateCustomBgpnbv6RequestData addCreateLinkIpv6AddressItem(UpdateCustomBgpnbv6CreateLinkIpv6AddressRequestData createLinkIpv6AddressItem) {
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

  public List<UpdateCustomBgpnbv6CreateLinkIpv6AddressRequestData> getCreateLinkIpv6Address() {
    return createLinkIpv6Address;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkIpv6Address(List<UpdateCustomBgpnbv6CreateLinkIpv6AddressRequestData> createLinkIpv6Address) {
    this.createLinkIpv6Address = createLinkIpv6Address;
  }


  public UpdateCustomBgpnbv6RequestData createLinkOrganization(List<UpdateCustomBgpnbv6CreateLinkOrganizationRequestData> createLinkOrganization) {
    
    this.createLinkOrganization = createLinkOrganization;
    return this;
  }

  public UpdateCustomBgpnbv6RequestData addCreateLinkOrganizationItem(UpdateCustomBgpnbv6CreateLinkOrganizationRequestData createLinkOrganizationItem) {
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

  public List<UpdateCustomBgpnbv6CreateLinkOrganizationRequestData> getCreateLinkOrganization() {
    return createLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrganization(List<UpdateCustomBgpnbv6CreateLinkOrganizationRequestData> createLinkOrganization) {
    this.createLinkOrganization = createLinkOrganization;
  }


  public UpdateCustomBgpnbv6RequestData deleteLinkIpv6Address(List<UpdateCustomBgpnbv6DeleteLinkIpv6AddressRequestData> deleteLinkIpv6Address) {
    
    this.deleteLinkIpv6Address = deleteLinkIpv6Address;
    return this;
  }

  public UpdateCustomBgpnbv6RequestData addDeleteLinkIpv6AddressItem(UpdateCustomBgpnbv6DeleteLinkIpv6AddressRequestData deleteLinkIpv6AddressItem) {
    if (this.deleteLinkIpv6Address == null) {
      this.deleteLinkIpv6Address = new ArrayList<>();
    }
    this.deleteLinkIpv6Address.add(deleteLinkIpv6AddressItem);
    return this;
  }

   /**
   * Get deleteLinkIpv6Address
   * @return deleteLinkIpv6Address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomBgpnbv6DeleteLinkIpv6AddressRequestData> getDeleteLinkIpv6Address() {
    return deleteLinkIpv6Address;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkIpv6Address(List<UpdateCustomBgpnbv6DeleteLinkIpv6AddressRequestData> deleteLinkIpv6Address) {
    this.deleteLinkIpv6Address = deleteLinkIpv6Address;
  }


  public UpdateCustomBgpnbv6RequestData deleteLinkOrganization(List<UpdateCustomBgpnbv6DeleteLinkOrganizationRequestData> deleteLinkOrganization) {
    
    this.deleteLinkOrganization = deleteLinkOrganization;
    return this;
  }

  public UpdateCustomBgpnbv6RequestData addDeleteLinkOrganizationItem(UpdateCustomBgpnbv6DeleteLinkOrganizationRequestData deleteLinkOrganizationItem) {
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

  public List<UpdateCustomBgpnbv6DeleteLinkOrganizationRequestData> getDeleteLinkOrganization() {
    return deleteLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkOrganization(List<UpdateCustomBgpnbv6DeleteLinkOrganizationRequestData> deleteLinkOrganization) {
    this.deleteLinkOrganization = deleteLinkOrganization;
  }


  public UpdateCustomBgpnbv6RequestData updateLinkIpv6Address(List<UpdateCustomBgpnbv6UpdateLinkIpv6AddressRequestData> updateLinkIpv6Address) {
    
    this.updateLinkIpv6Address = updateLinkIpv6Address;
    return this;
  }

  public UpdateCustomBgpnbv6RequestData addUpdateLinkIpv6AddressItem(UpdateCustomBgpnbv6UpdateLinkIpv6AddressRequestData updateLinkIpv6AddressItem) {
    if (this.updateLinkIpv6Address == null) {
      this.updateLinkIpv6Address = new ArrayList<>();
    }
    this.updateLinkIpv6Address.add(updateLinkIpv6AddressItem);
    return this;
  }

   /**
   * Get updateLinkIpv6Address
   * @return updateLinkIpv6Address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomBgpnbv6UpdateLinkIpv6AddressRequestData> getUpdateLinkIpv6Address() {
    return updateLinkIpv6Address;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkIpv6Address(List<UpdateCustomBgpnbv6UpdateLinkIpv6AddressRequestData> updateLinkIpv6Address) {
    this.updateLinkIpv6Address = updateLinkIpv6Address;
  }


  public UpdateCustomBgpnbv6RequestData updateLinkOrganization(List<UpdateCustomBgpnbv6UpdateLinkOrganizationRequestData> updateLinkOrganization) {
    
    this.updateLinkOrganization = updateLinkOrganization;
    return this;
  }

  public UpdateCustomBgpnbv6RequestData addUpdateLinkOrganizationItem(UpdateCustomBgpnbv6UpdateLinkOrganizationRequestData updateLinkOrganizationItem) {
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

  public List<UpdateCustomBgpnbv6UpdateLinkOrganizationRequestData> getUpdateLinkOrganization() {
    return updateLinkOrganization;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkOrganization(List<UpdateCustomBgpnbv6UpdateLinkOrganizationRequestData> updateLinkOrganization) {
    this.updateLinkOrganization = updateLinkOrganization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomBgpnbv6RequestData updateCustomBgpnbv6RequestData = (UpdateCustomBgpnbv6RequestData) o;
    return Objects.equals(this.sourceId, updateCustomBgpnbv6RequestData.sourceId) &&
        Objects.equals(this.localAs, updateCustomBgpnbv6RequestData.localAs) &&
        Objects.equals(this.remoteAs, updateCustomBgpnbv6RequestData.remoteAs) &&
        Objects.equals(this.sourceSystem, updateCustomBgpnbv6RequestData.sourceSystem) &&
        Objects.equals(this.contextId, updateCustomBgpnbv6RequestData.contextId) &&
        Objects.equals(this.id, updateCustomBgpnbv6RequestData.id) &&
        Objects.equals(this.createLinkIpv6Address, updateCustomBgpnbv6RequestData.createLinkIpv6Address) &&
        Objects.equals(this.createLinkOrganization, updateCustomBgpnbv6RequestData.createLinkOrganization) &&
        Objects.equals(this.deleteLinkIpv6Address, updateCustomBgpnbv6RequestData.deleteLinkIpv6Address) &&
        Objects.equals(this.deleteLinkOrganization, updateCustomBgpnbv6RequestData.deleteLinkOrganization) &&
        Objects.equals(this.updateLinkIpv6Address, updateCustomBgpnbv6RequestData.updateLinkIpv6Address) &&
        Objects.equals(this.updateLinkOrganization, updateCustomBgpnbv6RequestData.updateLinkOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, localAs, remoteAs, sourceSystem, contextId, id, createLinkIpv6Address, createLinkOrganization, deleteLinkIpv6Address, deleteLinkOrganization, updateLinkIpv6Address, updateLinkOrganization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomBgpnbv6RequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    localAs: ").append(toIndentedString(localAs)).append("\n");
    sb.append("    remoteAs: ").append(toIndentedString(remoteAs)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createLinkIpv6Address: ").append(toIndentedString(createLinkIpv6Address)).append("\n");
    sb.append("    createLinkOrganization: ").append(toIndentedString(createLinkOrganization)).append("\n");
    sb.append("    deleteLinkIpv6Address: ").append(toIndentedString(deleteLinkIpv6Address)).append("\n");
    sb.append("    deleteLinkOrganization: ").append(toIndentedString(deleteLinkOrganization)).append("\n");
    sb.append("    updateLinkIpv6Address: ").append(toIndentedString(updateLinkIpv6Address)).append("\n");
    sb.append("    updateLinkOrganization: ").append(toIndentedString(updateLinkOrganization)).append("\n");
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
