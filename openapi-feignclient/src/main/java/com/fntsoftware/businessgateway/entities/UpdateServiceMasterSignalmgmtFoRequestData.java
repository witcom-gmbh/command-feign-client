/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240226111547
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
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtFoCreateLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtFoDeleteLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtFoSwapLinkCableMasterDataCableRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateServiceMasterSignalmgmtFoRequestData
 */
@JsonPropertyOrder({
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_MANDANT_ONLY,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_SIGNALPATH_TYPE,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_ID_POSTFIX_START_AT,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_TRANSMISSION_MODE,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_DELETE_TYPE,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_DESCRIPTION,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_ID_PREFIX,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_SERVICE_GROUP,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_MEDIUM,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_TYPE,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_IS_DEFAULT,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_PROVIDER,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_FOREIGN_RENTING,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER,
  UpdateServiceMasterSignalmgmtFoRequestData.JSON_PROPERTY_SWAP_LINK_CABLE_MASTER_DATA_CABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class UpdateServiceMasterSignalmgmtFoRequestData {
  public static final String JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH = "idPostfixMinLength";
  private BigDecimal idPostfixMinLength;

  public static final String JSON_PROPERTY_MANDANT_ONLY = "mandantOnly";
  private Boolean mandantOnly;

  public static final String JSON_PROPERTY_SIGNALPATH_TYPE = "signalpathType";
  private String signalpathType;

  public static final String JSON_PROPERTY_ID_POSTFIX_START_AT = "idPostfixStartAt";
  private BigDecimal idPostfixStartAt;

  public static final String JSON_PROPERTY_TRANSMISSION_MODE = "transmissionMode";
  private String transmissionMode;

  public static final String JSON_PROPERTY_DELETE_TYPE = "deleteType";
  private String deleteType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private String idPrefix;

  public static final String JSON_PROPERTY_SERVICE_GROUP = "serviceGroup";
  private String serviceGroup;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private String medium;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_FOREIGN_RENTING = "foreignRenting";
  private Boolean foreignRenting;

  public static final String JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER = "createLinkDeviceMaster";
  private List<UpdateServiceMasterSignalmgmtFoCreateLinkDeviceMasterRequestData> createLinkDeviceMaster;

  public static final String JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER = "deleteLinkDeviceMaster";
  private List<UpdateServiceMasterSignalmgmtFoDeleteLinkDeviceMasterRequestData> deleteLinkDeviceMaster;

  public static final String JSON_PROPERTY_SWAP_LINK_CABLE_MASTER_DATA_CABLE = "swapLinkCableMasterDataCable";
  private UpdateServiceMasterSignalmgmtFoSwapLinkCableMasterDataCableRequestData swapLinkCableMasterDataCable;

  public UpdateServiceMasterSignalmgmtFoRequestData() {
  }

  public UpdateServiceMasterSignalmgmtFoRequestData idPostfixMinLength(BigDecimal idPostfixMinLength) {
    
    this.idPostfixMinLength = idPostfixMinLength;
    return this;
  }

   /**
   * Get idPostfixMinLength
   * @return idPostfixMinLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdPostfixMinLength() {
    return idPostfixMinLength;
  }


  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPostfixMinLength(BigDecimal idPostfixMinLength) {
    this.idPostfixMinLength = idPostfixMinLength;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData mandantOnly(Boolean mandantOnly) {
    
    this.mandantOnly = mandantOnly;
    return this;
  }

   /**
   * Get mandantOnly
   * @return mandantOnly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANDANT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMandantOnly() {
    return mandantOnly;
  }


  @JsonProperty(JSON_PROPERTY_MANDANT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandantOnly(Boolean mandantOnly) {
    this.mandantOnly = mandantOnly;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData signalpathType(String signalpathType) {
    
    this.signalpathType = signalpathType;
    return this;
  }

   /**
   * Get signalpathType
   * @return signalpathType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNALPATH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignalpathType() {
    return signalpathType;
  }


  @JsonProperty(JSON_PROPERTY_SIGNALPATH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignalpathType(String signalpathType) {
    this.signalpathType = signalpathType;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData idPostfixStartAt(BigDecimal idPostfixStartAt) {
    
    this.idPostfixStartAt = idPostfixStartAt;
    return this;
  }

   /**
   * Get idPostfixStartAt
   * @return idPostfixStartAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdPostfixStartAt() {
    return idPostfixStartAt;
  }


  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPostfixStartAt(BigDecimal idPostfixStartAt) {
    this.idPostfixStartAt = idPostfixStartAt;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData transmissionMode(String transmissionMode) {
    
    this.transmissionMode = transmissionMode;
    return this;
  }

   /**
   * Get transmissionMode
   * @return transmissionMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMISSION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransmissionMode() {
    return transmissionMode;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMISSION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmissionMode(String transmissionMode) {
    this.transmissionMode = transmissionMode;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData deleteType(String deleteType) {
    
    this.deleteType = deleteType;
    return this;
  }

   /**
   * Get deleteType
   * @return deleteType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeleteType() {
    return deleteType;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteType(String deleteType) {
    this.deleteType = deleteType;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData description(String description) {
    
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


  public UpdateServiceMasterSignalmgmtFoRequestData idPrefix(String idPrefix) {
    
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


  public UpdateServiceMasterSignalmgmtFoRequestData serviceGroup(String serviceGroup) {
    
    this.serviceGroup = serviceGroup;
    return this;
  }

   /**
   * Get serviceGroup
   * @return serviceGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceGroup() {
    return serviceGroup;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData contextId(String contextId) {
    
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


  public UpdateServiceMasterSignalmgmtFoRequestData medium(String medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(String medium) {
    this.medium = medium;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData type(String type) {
    
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


  public UpdateServiceMasterSignalmgmtFoRequestData isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(String provider) {
    this.provider = provider;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData foreignRenting(Boolean foreignRenting) {
    
    this.foreignRenting = foreignRenting;
    return this;
  }

   /**
   * Get foreignRenting
   * @return foreignRenting
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOREIGN_RENTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForeignRenting() {
    return foreignRenting;
  }


  @JsonProperty(JSON_PROPERTY_FOREIGN_RENTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignRenting(Boolean foreignRenting) {
    this.foreignRenting = foreignRenting;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData createLinkDeviceMaster(List<UpdateServiceMasterSignalmgmtFoCreateLinkDeviceMasterRequestData> createLinkDeviceMaster) {
    
    this.createLinkDeviceMaster = createLinkDeviceMaster;
    return this;
  }

  public UpdateServiceMasterSignalmgmtFoRequestData addCreateLinkDeviceMasterItem(UpdateServiceMasterSignalmgmtFoCreateLinkDeviceMasterRequestData createLinkDeviceMasterItem) {
    if (this.createLinkDeviceMaster == null) {
      this.createLinkDeviceMaster = new ArrayList<>();
    }
    this.createLinkDeviceMaster.add(createLinkDeviceMasterItem);
    return this;
  }

   /**
   * Get createLinkDeviceMaster
   * @return createLinkDeviceMaster
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateServiceMasterSignalmgmtFoCreateLinkDeviceMasterRequestData> getCreateLinkDeviceMaster() {
    return createLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkDeviceMaster(List<UpdateServiceMasterSignalmgmtFoCreateLinkDeviceMasterRequestData> createLinkDeviceMaster) {
    this.createLinkDeviceMaster = createLinkDeviceMaster;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData deleteLinkDeviceMaster(List<UpdateServiceMasterSignalmgmtFoDeleteLinkDeviceMasterRequestData> deleteLinkDeviceMaster) {
    
    this.deleteLinkDeviceMaster = deleteLinkDeviceMaster;
    return this;
  }

  public UpdateServiceMasterSignalmgmtFoRequestData addDeleteLinkDeviceMasterItem(UpdateServiceMasterSignalmgmtFoDeleteLinkDeviceMasterRequestData deleteLinkDeviceMasterItem) {
    if (this.deleteLinkDeviceMaster == null) {
      this.deleteLinkDeviceMaster = new ArrayList<>();
    }
    this.deleteLinkDeviceMaster.add(deleteLinkDeviceMasterItem);
    return this;
  }

   /**
   * Get deleteLinkDeviceMaster
   * @return deleteLinkDeviceMaster
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateServiceMasterSignalmgmtFoDeleteLinkDeviceMasterRequestData> getDeleteLinkDeviceMaster() {
    return deleteLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkDeviceMaster(List<UpdateServiceMasterSignalmgmtFoDeleteLinkDeviceMasterRequestData> deleteLinkDeviceMaster) {
    this.deleteLinkDeviceMaster = deleteLinkDeviceMaster;
  }


  public UpdateServiceMasterSignalmgmtFoRequestData swapLinkCableMasterDataCable(UpdateServiceMasterSignalmgmtFoSwapLinkCableMasterDataCableRequestData swapLinkCableMasterDataCable) {
    
    this.swapLinkCableMasterDataCable = swapLinkCableMasterDataCable;
    return this;
  }

   /**
   * Get swapLinkCableMasterDataCable
   * @return swapLinkCableMasterDataCable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SWAP_LINK_CABLE_MASTER_DATA_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateServiceMasterSignalmgmtFoSwapLinkCableMasterDataCableRequestData getSwapLinkCableMasterDataCable() {
    return swapLinkCableMasterDataCable;
  }


  @JsonProperty(JSON_PROPERTY_SWAP_LINK_CABLE_MASTER_DATA_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwapLinkCableMasterDataCable(UpdateServiceMasterSignalmgmtFoSwapLinkCableMasterDataCableRequestData swapLinkCableMasterDataCable) {
    this.swapLinkCableMasterDataCable = swapLinkCableMasterDataCable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceMasterSignalmgmtFoRequestData updateServiceMasterSignalmgmtFoRequestData = (UpdateServiceMasterSignalmgmtFoRequestData) o;
    return Objects.equals(this.idPostfixMinLength, updateServiceMasterSignalmgmtFoRequestData.idPostfixMinLength) &&
        Objects.equals(this.mandantOnly, updateServiceMasterSignalmgmtFoRequestData.mandantOnly) &&
        Objects.equals(this.signalpathType, updateServiceMasterSignalmgmtFoRequestData.signalpathType) &&
        Objects.equals(this.idPostfixStartAt, updateServiceMasterSignalmgmtFoRequestData.idPostfixStartAt) &&
        Objects.equals(this.transmissionMode, updateServiceMasterSignalmgmtFoRequestData.transmissionMode) &&
        Objects.equals(this.deleteType, updateServiceMasterSignalmgmtFoRequestData.deleteType) &&
        Objects.equals(this.description, updateServiceMasterSignalmgmtFoRequestData.description) &&
        Objects.equals(this.idPrefix, updateServiceMasterSignalmgmtFoRequestData.idPrefix) &&
        Objects.equals(this.serviceGroup, updateServiceMasterSignalmgmtFoRequestData.serviceGroup) &&
        Objects.equals(this.contextId, updateServiceMasterSignalmgmtFoRequestData.contextId) &&
        Objects.equals(this.medium, updateServiceMasterSignalmgmtFoRequestData.medium) &&
        Objects.equals(this.type, updateServiceMasterSignalmgmtFoRequestData.type) &&
        Objects.equals(this.isDefault, updateServiceMasterSignalmgmtFoRequestData.isDefault) &&
        Objects.equals(this.provider, updateServiceMasterSignalmgmtFoRequestData.provider) &&
        Objects.equals(this.foreignRenting, updateServiceMasterSignalmgmtFoRequestData.foreignRenting) &&
        Objects.equals(this.createLinkDeviceMaster, updateServiceMasterSignalmgmtFoRequestData.createLinkDeviceMaster) &&
        Objects.equals(this.deleteLinkDeviceMaster, updateServiceMasterSignalmgmtFoRequestData.deleteLinkDeviceMaster) &&
        Objects.equals(this.swapLinkCableMasterDataCable, updateServiceMasterSignalmgmtFoRequestData.swapLinkCableMasterDataCable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPostfixMinLength, mandantOnly, signalpathType, idPostfixStartAt, transmissionMode, deleteType, description, idPrefix, serviceGroup, contextId, medium, type, isDefault, provider, foreignRenting, createLinkDeviceMaster, deleteLinkDeviceMaster, swapLinkCableMasterDataCable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceMasterSignalmgmtFoRequestData {\n");
    sb.append("    idPostfixMinLength: ").append(toIndentedString(idPostfixMinLength)).append("\n");
    sb.append("    mandantOnly: ").append(toIndentedString(mandantOnly)).append("\n");
    sb.append("    signalpathType: ").append(toIndentedString(signalpathType)).append("\n");
    sb.append("    idPostfixStartAt: ").append(toIndentedString(idPostfixStartAt)).append("\n");
    sb.append("    transmissionMode: ").append(toIndentedString(transmissionMode)).append("\n");
    sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    foreignRenting: ").append(toIndentedString(foreignRenting)).append("\n");
    sb.append("    createLinkDeviceMaster: ").append(toIndentedString(createLinkDeviceMaster)).append("\n");
    sb.append("    deleteLinkDeviceMaster: ").append(toIndentedString(deleteLinkDeviceMaster)).append("\n");
    sb.append("    swapLinkCableMasterDataCable: ").append(toIndentedString(swapLinkCableMasterDataCable)).append("\n");
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
