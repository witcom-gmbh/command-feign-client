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
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100042YRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100043YRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateCustomCtcdynOspfAreaRequestData
 */
@JsonPropertyOrder({
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_AREA_ID,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_ID,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_SOURCE,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100042_Y,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100042_Y,
  UpdateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100043_Y
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateCustomCtcdynOspfAreaRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_AREA_ID = "areaId";
  private String areaId;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100042_Y = "createLinkCtcdynOspfArea100042Y";
  private List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> createLinkCtcdynOspfArea100042Y;

  public static final String JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y = "createLinkCtcdynOspfArea100043Y";
  private List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> createLinkCtcdynOspfArea100043Y;

  public static final String JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100042_Y = "deleteLinkCtcdynOspfArea100042Y";
  private List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100042YRequestData> deleteLinkCtcdynOspfArea100042Y;

  public static final String JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100043_Y = "deleteLinkCtcdynOspfArea100043Y";
  private List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100043YRequestData> deleteLinkCtcdynOspfArea100043Y;

  public UpdateCustomCtcdynOspfAreaRequestData() {
  }

  public UpdateCustomCtcdynOspfAreaRequestData sourceId(String sourceId) {
    
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


  public UpdateCustomCtcdynOspfAreaRequestData areaId(String areaId) {
    
    this.areaId = areaId;
    return this;
  }

   /**
   * Get areaId
   * @return areaId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AREA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAreaId() {
    return areaId;
  }


  @JsonProperty(JSON_PROPERTY_AREA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }


  public UpdateCustomCtcdynOspfAreaRequestData sourceSystem(String sourceSystem) {
    
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


  public UpdateCustomCtcdynOspfAreaRequestData contextId(String contextId) {
    
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


  public UpdateCustomCtcdynOspfAreaRequestData id(String id) {
    
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


  public UpdateCustomCtcdynOspfAreaRequestData source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public UpdateCustomCtcdynOspfAreaRequestData createLinkCtcdynOspfArea100042Y(List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> createLinkCtcdynOspfArea100042Y) {
    
    this.createLinkCtcdynOspfArea100042Y = createLinkCtcdynOspfArea100042Y;
    return this;
  }

  public UpdateCustomCtcdynOspfAreaRequestData addCreateLinkCtcdynOspfArea100042YItem(UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData createLinkCtcdynOspfArea100042YItem) {
    if (this.createLinkCtcdynOspfArea100042Y == null) {
      this.createLinkCtcdynOspfArea100042Y = new ArrayList<>();
    }
    this.createLinkCtcdynOspfArea100042Y.add(createLinkCtcdynOspfArea100042YItem);
    return this;
  }

   /**
   * Get createLinkCtcdynOspfArea100042Y
   * @return createLinkCtcdynOspfArea100042Y
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100042_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> getCreateLinkCtcdynOspfArea100042Y() {
    return createLinkCtcdynOspfArea100042Y;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100042_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkCtcdynOspfArea100042Y(List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> createLinkCtcdynOspfArea100042Y) {
    this.createLinkCtcdynOspfArea100042Y = createLinkCtcdynOspfArea100042Y;
  }


  public UpdateCustomCtcdynOspfAreaRequestData createLinkCtcdynOspfArea100043Y(List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> createLinkCtcdynOspfArea100043Y) {
    
    this.createLinkCtcdynOspfArea100043Y = createLinkCtcdynOspfArea100043Y;
    return this;
  }

  public UpdateCustomCtcdynOspfAreaRequestData addCreateLinkCtcdynOspfArea100043YItem(UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData createLinkCtcdynOspfArea100043YItem) {
    if (this.createLinkCtcdynOspfArea100043Y == null) {
      this.createLinkCtcdynOspfArea100043Y = new ArrayList<>();
    }
    this.createLinkCtcdynOspfArea100043Y.add(createLinkCtcdynOspfArea100043YItem);
    return this;
  }

   /**
   * Get createLinkCtcdynOspfArea100043Y
   * @return createLinkCtcdynOspfArea100043Y
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> getCreateLinkCtcdynOspfArea100043Y() {
    return createLinkCtcdynOspfArea100043Y;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkCtcdynOspfArea100043Y(List<UpdateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> createLinkCtcdynOspfArea100043Y) {
    this.createLinkCtcdynOspfArea100043Y = createLinkCtcdynOspfArea100043Y;
  }


  public UpdateCustomCtcdynOspfAreaRequestData deleteLinkCtcdynOspfArea100042Y(List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100042YRequestData> deleteLinkCtcdynOspfArea100042Y) {
    
    this.deleteLinkCtcdynOspfArea100042Y = deleteLinkCtcdynOspfArea100042Y;
    return this;
  }

  public UpdateCustomCtcdynOspfAreaRequestData addDeleteLinkCtcdynOspfArea100042YItem(UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100042YRequestData deleteLinkCtcdynOspfArea100042YItem) {
    if (this.deleteLinkCtcdynOspfArea100042Y == null) {
      this.deleteLinkCtcdynOspfArea100042Y = new ArrayList<>();
    }
    this.deleteLinkCtcdynOspfArea100042Y.add(deleteLinkCtcdynOspfArea100042YItem);
    return this;
  }

   /**
   * Get deleteLinkCtcdynOspfArea100042Y
   * @return deleteLinkCtcdynOspfArea100042Y
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100042_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100042YRequestData> getDeleteLinkCtcdynOspfArea100042Y() {
    return deleteLinkCtcdynOspfArea100042Y;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100042_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkCtcdynOspfArea100042Y(List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100042YRequestData> deleteLinkCtcdynOspfArea100042Y) {
    this.deleteLinkCtcdynOspfArea100042Y = deleteLinkCtcdynOspfArea100042Y;
  }


  public UpdateCustomCtcdynOspfAreaRequestData deleteLinkCtcdynOspfArea100043Y(List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100043YRequestData> deleteLinkCtcdynOspfArea100043Y) {
    
    this.deleteLinkCtcdynOspfArea100043Y = deleteLinkCtcdynOspfArea100043Y;
    return this;
  }

  public UpdateCustomCtcdynOspfAreaRequestData addDeleteLinkCtcdynOspfArea100043YItem(UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100043YRequestData deleteLinkCtcdynOspfArea100043YItem) {
    if (this.deleteLinkCtcdynOspfArea100043Y == null) {
      this.deleteLinkCtcdynOspfArea100043Y = new ArrayList<>();
    }
    this.deleteLinkCtcdynOspfArea100043Y.add(deleteLinkCtcdynOspfArea100043YItem);
    return this;
  }

   /**
   * Get deleteLinkCtcdynOspfArea100043Y
   * @return deleteLinkCtcdynOspfArea100043Y
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100043_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100043YRequestData> getDeleteLinkCtcdynOspfArea100043Y() {
    return deleteLinkCtcdynOspfArea100043Y;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_CTCDYN_OSPF_AREA100043_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkCtcdynOspfArea100043Y(List<UpdateCustomCtcdynOspfAreaDeleteLinkCtcdynOspfArea100043YRequestData> deleteLinkCtcdynOspfArea100043Y) {
    this.deleteLinkCtcdynOspfArea100043Y = deleteLinkCtcdynOspfArea100043Y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomCtcdynOspfAreaRequestData updateCustomCtcdynOspfAreaRequestData = (UpdateCustomCtcdynOspfAreaRequestData) o;
    return Objects.equals(this.sourceId, updateCustomCtcdynOspfAreaRequestData.sourceId) &&
        Objects.equals(this.areaId, updateCustomCtcdynOspfAreaRequestData.areaId) &&
        Objects.equals(this.sourceSystem, updateCustomCtcdynOspfAreaRequestData.sourceSystem) &&
        Objects.equals(this.contextId, updateCustomCtcdynOspfAreaRequestData.contextId) &&
        Objects.equals(this.id, updateCustomCtcdynOspfAreaRequestData.id) &&
        Objects.equals(this.source, updateCustomCtcdynOspfAreaRequestData.source) &&
        Objects.equals(this.createLinkCtcdynOspfArea100042Y, updateCustomCtcdynOspfAreaRequestData.createLinkCtcdynOspfArea100042Y) &&
        Objects.equals(this.createLinkCtcdynOspfArea100043Y, updateCustomCtcdynOspfAreaRequestData.createLinkCtcdynOspfArea100043Y) &&
        Objects.equals(this.deleteLinkCtcdynOspfArea100042Y, updateCustomCtcdynOspfAreaRequestData.deleteLinkCtcdynOspfArea100042Y) &&
        Objects.equals(this.deleteLinkCtcdynOspfArea100043Y, updateCustomCtcdynOspfAreaRequestData.deleteLinkCtcdynOspfArea100043Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, areaId, sourceSystem, contextId, id, source, createLinkCtcdynOspfArea100042Y, createLinkCtcdynOspfArea100043Y, deleteLinkCtcdynOspfArea100042Y, deleteLinkCtcdynOspfArea100043Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomCtcdynOspfAreaRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    createLinkCtcdynOspfArea100042Y: ").append(toIndentedString(createLinkCtcdynOspfArea100042Y)).append("\n");
    sb.append("    createLinkCtcdynOspfArea100043Y: ").append(toIndentedString(createLinkCtcdynOspfArea100043Y)).append("\n");
    sb.append("    deleteLinkCtcdynOspfArea100042Y: ").append(toIndentedString(deleteLinkCtcdynOspfArea100042Y)).append("\n");
    sb.append("    deleteLinkCtcdynOspfArea100043Y: ").append(toIndentedString(deleteLinkCtcdynOspfArea100043Y)).append("\n");
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
