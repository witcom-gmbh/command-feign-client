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
import com.fntsoftware.businessgateway.entities.UpdateLifecycleCreateLifecyclePhaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleCreateLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleCreateLinkSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleDeleteLifecyclePhaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleDeleteLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleDeleteLinkSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleUpdateLifecyclePhaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleUpdateLinkDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleUpdateLinkSoftwareProductRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateLifecycleRequestData
 */
@JsonPropertyOrder({
  UpdateLifecycleRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateLifecycleRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateLifecycleRequestData.JSON_PROPERTY_NAME,
  UpdateLifecycleRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateLifecycleRequestData.JSON_PROPERTY_REMARK,
  UpdateLifecycleRequestData.JSON_PROPERTY_TYPE,
  UpdateLifecycleRequestData.JSON_PROPERTY_CREATE_LIFECYCLE_PHASE,
  UpdateLifecycleRequestData.JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER,
  UpdateLifecycleRequestData.JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT,
  UpdateLifecycleRequestData.JSON_PROPERTY_DELETE_LIFECYCLE_PHASE,
  UpdateLifecycleRequestData.JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER,
  UpdateLifecycleRequestData.JSON_PROPERTY_DELETE_LINK_SOFTWARE_PRODUCT,
  UpdateLifecycleRequestData.JSON_PROPERTY_UPDATE_LIFECYCLE_PHASE,
  UpdateLifecycleRequestData.JSON_PROPERTY_UPDATE_LINK_DEVICE_MASTER,
  UpdateLifecycleRequestData.JSON_PROPERTY_UPDATE_LINK_SOFTWARE_PRODUCT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateLifecycleRequestData {
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

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CREATE_LIFECYCLE_PHASE = "createLifecyclePhase";
  private List<UpdateLifecycleCreateLifecyclePhaseRequestData> createLifecyclePhase;

  public static final String JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER = "createLinkDeviceMaster";
  private List<UpdateLifecycleCreateLinkDeviceMasterRequestData> createLinkDeviceMaster;

  public static final String JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT = "createLinkSoftwareProduct";
  private List<UpdateLifecycleCreateLinkSoftwareProductRequestData> createLinkSoftwareProduct;

  public static final String JSON_PROPERTY_DELETE_LIFECYCLE_PHASE = "deleteLifecyclePhase";
  private List<UpdateLifecycleDeleteLifecyclePhaseRequestData> deleteLifecyclePhase;

  public static final String JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER = "deleteLinkDeviceMaster";
  private List<UpdateLifecycleDeleteLinkDeviceMasterRequestData> deleteLinkDeviceMaster;

  public static final String JSON_PROPERTY_DELETE_LINK_SOFTWARE_PRODUCT = "deleteLinkSoftwareProduct";
  private List<UpdateLifecycleDeleteLinkSoftwareProductRequestData> deleteLinkSoftwareProduct;

  public static final String JSON_PROPERTY_UPDATE_LIFECYCLE_PHASE = "updateLifecyclePhase";
  private List<UpdateLifecycleUpdateLifecyclePhaseRequestData> updateLifecyclePhase;

  public static final String JSON_PROPERTY_UPDATE_LINK_DEVICE_MASTER = "updateLinkDeviceMaster";
  private List<UpdateLifecycleUpdateLinkDeviceMasterRequestData> updateLinkDeviceMaster;

  public static final String JSON_PROPERTY_UPDATE_LINK_SOFTWARE_PRODUCT = "updateLinkSoftwareProduct";
  private List<UpdateLifecycleUpdateLinkSoftwareProductRequestData> updateLinkSoftwareProduct;

  public UpdateLifecycleRequestData() {
  }

  public UpdateLifecycleRequestData sourceId(String sourceId) {
    
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


  public UpdateLifecycleRequestData sourceSystem(String sourceSystem) {
    
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


  public UpdateLifecycleRequestData name(String name) {
    
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


  public UpdateLifecycleRequestData contextId(String contextId) {
    
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


  public UpdateLifecycleRequestData remark(String remark) {
    
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


  public UpdateLifecycleRequestData type(String type) {
    
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


  public UpdateLifecycleRequestData createLifecyclePhase(List<UpdateLifecycleCreateLifecyclePhaseRequestData> createLifecyclePhase) {
    
    this.createLifecyclePhase = createLifecyclePhase;
    return this;
  }

  public UpdateLifecycleRequestData addCreateLifecyclePhaseItem(UpdateLifecycleCreateLifecyclePhaseRequestData createLifecyclePhaseItem) {
    if (this.createLifecyclePhase == null) {
      this.createLifecyclePhase = new ArrayList<>();
    }
    this.createLifecyclePhase.add(createLifecyclePhaseItem);
    return this;
  }

   /**
   * Get createLifecyclePhase
   * @return createLifecyclePhase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LIFECYCLE_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateLifecycleCreateLifecyclePhaseRequestData> getCreateLifecyclePhase() {
    return createLifecyclePhase;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LIFECYCLE_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLifecyclePhase(List<UpdateLifecycleCreateLifecyclePhaseRequestData> createLifecyclePhase) {
    this.createLifecyclePhase = createLifecyclePhase;
  }


  public UpdateLifecycleRequestData createLinkDeviceMaster(List<UpdateLifecycleCreateLinkDeviceMasterRequestData> createLinkDeviceMaster) {
    
    this.createLinkDeviceMaster = createLinkDeviceMaster;
    return this;
  }

  public UpdateLifecycleRequestData addCreateLinkDeviceMasterItem(UpdateLifecycleCreateLinkDeviceMasterRequestData createLinkDeviceMasterItem) {
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

  public List<UpdateLifecycleCreateLinkDeviceMasterRequestData> getCreateLinkDeviceMaster() {
    return createLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkDeviceMaster(List<UpdateLifecycleCreateLinkDeviceMasterRequestData> createLinkDeviceMaster) {
    this.createLinkDeviceMaster = createLinkDeviceMaster;
  }


  public UpdateLifecycleRequestData createLinkSoftwareProduct(List<UpdateLifecycleCreateLinkSoftwareProductRequestData> createLinkSoftwareProduct) {
    
    this.createLinkSoftwareProduct = createLinkSoftwareProduct;
    return this;
  }

  public UpdateLifecycleRequestData addCreateLinkSoftwareProductItem(UpdateLifecycleCreateLinkSoftwareProductRequestData createLinkSoftwareProductItem) {
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

  public List<UpdateLifecycleCreateLinkSoftwareProductRequestData> getCreateLinkSoftwareProduct() {
    return createLinkSoftwareProduct;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkSoftwareProduct(List<UpdateLifecycleCreateLinkSoftwareProductRequestData> createLinkSoftwareProduct) {
    this.createLinkSoftwareProduct = createLinkSoftwareProduct;
  }


  public UpdateLifecycleRequestData deleteLifecyclePhase(List<UpdateLifecycleDeleteLifecyclePhaseRequestData> deleteLifecyclePhase) {
    
    this.deleteLifecyclePhase = deleteLifecyclePhase;
    return this;
  }

  public UpdateLifecycleRequestData addDeleteLifecyclePhaseItem(UpdateLifecycleDeleteLifecyclePhaseRequestData deleteLifecyclePhaseItem) {
    if (this.deleteLifecyclePhase == null) {
      this.deleteLifecyclePhase = new ArrayList<>();
    }
    this.deleteLifecyclePhase.add(deleteLifecyclePhaseItem);
    return this;
  }

   /**
   * Get deleteLifecyclePhase
   * @return deleteLifecyclePhase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LIFECYCLE_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateLifecycleDeleteLifecyclePhaseRequestData> getDeleteLifecyclePhase() {
    return deleteLifecyclePhase;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LIFECYCLE_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLifecyclePhase(List<UpdateLifecycleDeleteLifecyclePhaseRequestData> deleteLifecyclePhase) {
    this.deleteLifecyclePhase = deleteLifecyclePhase;
  }


  public UpdateLifecycleRequestData deleteLinkDeviceMaster(List<UpdateLifecycleDeleteLinkDeviceMasterRequestData> deleteLinkDeviceMaster) {
    
    this.deleteLinkDeviceMaster = deleteLinkDeviceMaster;
    return this;
  }

  public UpdateLifecycleRequestData addDeleteLinkDeviceMasterItem(UpdateLifecycleDeleteLinkDeviceMasterRequestData deleteLinkDeviceMasterItem) {
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

  public List<UpdateLifecycleDeleteLinkDeviceMasterRequestData> getDeleteLinkDeviceMaster() {
    return deleteLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkDeviceMaster(List<UpdateLifecycleDeleteLinkDeviceMasterRequestData> deleteLinkDeviceMaster) {
    this.deleteLinkDeviceMaster = deleteLinkDeviceMaster;
  }


  public UpdateLifecycleRequestData deleteLinkSoftwareProduct(List<UpdateLifecycleDeleteLinkSoftwareProductRequestData> deleteLinkSoftwareProduct) {
    
    this.deleteLinkSoftwareProduct = deleteLinkSoftwareProduct;
    return this;
  }

  public UpdateLifecycleRequestData addDeleteLinkSoftwareProductItem(UpdateLifecycleDeleteLinkSoftwareProductRequestData deleteLinkSoftwareProductItem) {
    if (this.deleteLinkSoftwareProduct == null) {
      this.deleteLinkSoftwareProduct = new ArrayList<>();
    }
    this.deleteLinkSoftwareProduct.add(deleteLinkSoftwareProductItem);
    return this;
  }

   /**
   * Get deleteLinkSoftwareProduct
   * @return deleteLinkSoftwareProduct
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateLifecycleDeleteLinkSoftwareProductRequestData> getDeleteLinkSoftwareProduct() {
    return deleteLinkSoftwareProduct;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkSoftwareProduct(List<UpdateLifecycleDeleteLinkSoftwareProductRequestData> deleteLinkSoftwareProduct) {
    this.deleteLinkSoftwareProduct = deleteLinkSoftwareProduct;
  }


  public UpdateLifecycleRequestData updateLifecyclePhase(List<UpdateLifecycleUpdateLifecyclePhaseRequestData> updateLifecyclePhase) {
    
    this.updateLifecyclePhase = updateLifecyclePhase;
    return this;
  }

  public UpdateLifecycleRequestData addUpdateLifecyclePhaseItem(UpdateLifecycleUpdateLifecyclePhaseRequestData updateLifecyclePhaseItem) {
    if (this.updateLifecyclePhase == null) {
      this.updateLifecyclePhase = new ArrayList<>();
    }
    this.updateLifecyclePhase.add(updateLifecyclePhaseItem);
    return this;
  }

   /**
   * Get updateLifecyclePhase
   * @return updateLifecyclePhase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LIFECYCLE_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateLifecycleUpdateLifecyclePhaseRequestData> getUpdateLifecyclePhase() {
    return updateLifecyclePhase;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LIFECYCLE_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLifecyclePhase(List<UpdateLifecycleUpdateLifecyclePhaseRequestData> updateLifecyclePhase) {
    this.updateLifecyclePhase = updateLifecyclePhase;
  }


  public UpdateLifecycleRequestData updateLinkDeviceMaster(List<UpdateLifecycleUpdateLinkDeviceMasterRequestData> updateLinkDeviceMaster) {
    
    this.updateLinkDeviceMaster = updateLinkDeviceMaster;
    return this;
  }

  public UpdateLifecycleRequestData addUpdateLinkDeviceMasterItem(UpdateLifecycleUpdateLinkDeviceMasterRequestData updateLinkDeviceMasterItem) {
    if (this.updateLinkDeviceMaster == null) {
      this.updateLinkDeviceMaster = new ArrayList<>();
    }
    this.updateLinkDeviceMaster.add(updateLinkDeviceMasterItem);
    return this;
  }

   /**
   * Get updateLinkDeviceMaster
   * @return updateLinkDeviceMaster
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateLifecycleUpdateLinkDeviceMasterRequestData> getUpdateLinkDeviceMaster() {
    return updateLinkDeviceMaster;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_DEVICE_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkDeviceMaster(List<UpdateLifecycleUpdateLinkDeviceMasterRequestData> updateLinkDeviceMaster) {
    this.updateLinkDeviceMaster = updateLinkDeviceMaster;
  }


  public UpdateLifecycleRequestData updateLinkSoftwareProduct(List<UpdateLifecycleUpdateLinkSoftwareProductRequestData> updateLinkSoftwareProduct) {
    
    this.updateLinkSoftwareProduct = updateLinkSoftwareProduct;
    return this;
  }

  public UpdateLifecycleRequestData addUpdateLinkSoftwareProductItem(UpdateLifecycleUpdateLinkSoftwareProductRequestData updateLinkSoftwareProductItem) {
    if (this.updateLinkSoftwareProduct == null) {
      this.updateLinkSoftwareProduct = new ArrayList<>();
    }
    this.updateLinkSoftwareProduct.add(updateLinkSoftwareProductItem);
    return this;
  }

   /**
   * Get updateLinkSoftwareProduct
   * @return updateLinkSoftwareProduct
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateLifecycleUpdateLinkSoftwareProductRequestData> getUpdateLinkSoftwareProduct() {
    return updateLinkSoftwareProduct;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_SOFTWARE_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkSoftwareProduct(List<UpdateLifecycleUpdateLinkSoftwareProductRequestData> updateLinkSoftwareProduct) {
    this.updateLinkSoftwareProduct = updateLinkSoftwareProduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLifecycleRequestData updateLifecycleRequestData = (UpdateLifecycleRequestData) o;
    return Objects.equals(this.sourceId, updateLifecycleRequestData.sourceId) &&
        Objects.equals(this.sourceSystem, updateLifecycleRequestData.sourceSystem) &&
        Objects.equals(this.name, updateLifecycleRequestData.name) &&
        Objects.equals(this.contextId, updateLifecycleRequestData.contextId) &&
        Objects.equals(this.remark, updateLifecycleRequestData.remark) &&
        Objects.equals(this.type, updateLifecycleRequestData.type) &&
        Objects.equals(this.createLifecyclePhase, updateLifecycleRequestData.createLifecyclePhase) &&
        Objects.equals(this.createLinkDeviceMaster, updateLifecycleRequestData.createLinkDeviceMaster) &&
        Objects.equals(this.createLinkSoftwareProduct, updateLifecycleRequestData.createLinkSoftwareProduct) &&
        Objects.equals(this.deleteLifecyclePhase, updateLifecycleRequestData.deleteLifecyclePhase) &&
        Objects.equals(this.deleteLinkDeviceMaster, updateLifecycleRequestData.deleteLinkDeviceMaster) &&
        Objects.equals(this.deleteLinkSoftwareProduct, updateLifecycleRequestData.deleteLinkSoftwareProduct) &&
        Objects.equals(this.updateLifecyclePhase, updateLifecycleRequestData.updateLifecyclePhase) &&
        Objects.equals(this.updateLinkDeviceMaster, updateLifecycleRequestData.updateLinkDeviceMaster) &&
        Objects.equals(this.updateLinkSoftwareProduct, updateLifecycleRequestData.updateLinkSoftwareProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, sourceSystem, name, contextId, remark, type, createLifecyclePhase, createLinkDeviceMaster, createLinkSoftwareProduct, deleteLifecyclePhase, deleteLinkDeviceMaster, deleteLinkSoftwareProduct, updateLifecyclePhase, updateLinkDeviceMaster, updateLinkSoftwareProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLifecycleRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createLifecyclePhase: ").append(toIndentedString(createLifecyclePhase)).append("\n");
    sb.append("    createLinkDeviceMaster: ").append(toIndentedString(createLinkDeviceMaster)).append("\n");
    sb.append("    createLinkSoftwareProduct: ").append(toIndentedString(createLinkSoftwareProduct)).append("\n");
    sb.append("    deleteLifecyclePhase: ").append(toIndentedString(deleteLifecyclePhase)).append("\n");
    sb.append("    deleteLinkDeviceMaster: ").append(toIndentedString(deleteLinkDeviceMaster)).append("\n");
    sb.append("    deleteLinkSoftwareProduct: ").append(toIndentedString(deleteLinkSoftwareProduct)).append("\n");
    sb.append("    updateLifecyclePhase: ").append(toIndentedString(updateLifecyclePhase)).append("\n");
    sb.append("    updateLinkDeviceMaster: ").append(toIndentedString(updateLinkDeviceMaster)).append("\n");
    sb.append("    updateLinkSoftwareProduct: ").append(toIndentedString(updateLinkSoftwareProduct)).append("\n");
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
