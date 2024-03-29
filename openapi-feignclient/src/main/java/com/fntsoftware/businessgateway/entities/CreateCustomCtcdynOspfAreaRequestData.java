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
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateCustomCtcdynOspfAreaRequestData
 */
@JsonPropertyOrder({
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_AREA_ID,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_ID,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_SOURCE,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100042_Y,
  CreateCustomCtcdynOspfAreaRequestData.JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateCustomCtcdynOspfAreaRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

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
  private List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> createLinkCtcdynOspfArea100042Y;

  public static final String JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y = "createLinkCtcdynOspfArea100043Y";
  private List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> createLinkCtcdynOspfArea100043Y;

  public CreateCustomCtcdynOspfAreaRequestData() {
  }

  public CreateCustomCtcdynOspfAreaRequestData sourceId(String sourceId) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData areaId(String areaId) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData contextId(String contextId) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData id(String id) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData source(String source) {
    
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


  public CreateCustomCtcdynOspfAreaRequestData createLinkCtcdynOspfArea100042Y(List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> createLinkCtcdynOspfArea100042Y) {
    
    this.createLinkCtcdynOspfArea100042Y = createLinkCtcdynOspfArea100042Y;
    return this;
  }

  public CreateCustomCtcdynOspfAreaRequestData addCreateLinkCtcdynOspfArea100042YItem(CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData createLinkCtcdynOspfArea100042YItem) {
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

  public List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> getCreateLinkCtcdynOspfArea100042Y() {
    return createLinkCtcdynOspfArea100042Y;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100042_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkCtcdynOspfArea100042Y(List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100042YRequestData> createLinkCtcdynOspfArea100042Y) {
    this.createLinkCtcdynOspfArea100042Y = createLinkCtcdynOspfArea100042Y;
  }


  public CreateCustomCtcdynOspfAreaRequestData createLinkCtcdynOspfArea100043Y(List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> createLinkCtcdynOspfArea100043Y) {
    
    this.createLinkCtcdynOspfArea100043Y = createLinkCtcdynOspfArea100043Y;
    return this;
  }

  public CreateCustomCtcdynOspfAreaRequestData addCreateLinkCtcdynOspfArea100043YItem(CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData createLinkCtcdynOspfArea100043YItem) {
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

  public List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> getCreateLinkCtcdynOspfArea100043Y() {
    return createLinkCtcdynOspfArea100043Y;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_CTCDYN_OSPF_AREA100043_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkCtcdynOspfArea100043Y(List<CreateCustomCtcdynOspfAreaCreateLinkCtcdynOspfArea100043YRequestData> createLinkCtcdynOspfArea100043Y) {
    this.createLinkCtcdynOspfArea100043Y = createLinkCtcdynOspfArea100043Y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomCtcdynOspfAreaRequestData createCustomCtcdynOspfAreaRequestData = (CreateCustomCtcdynOspfAreaRequestData) o;
    return Objects.equals(this.sourceId, createCustomCtcdynOspfAreaRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createCustomCtcdynOspfAreaRequestData.ownerSystem) &&
        Objects.equals(this.areaId, createCustomCtcdynOspfAreaRequestData.areaId) &&
        Objects.equals(this.sourceSystem, createCustomCtcdynOspfAreaRequestData.sourceSystem) &&
        Objects.equals(this.contextId, createCustomCtcdynOspfAreaRequestData.contextId) &&
        Objects.equals(this.id, createCustomCtcdynOspfAreaRequestData.id) &&
        Objects.equals(this.source, createCustomCtcdynOspfAreaRequestData.source) &&
        Objects.equals(this.createLinkCtcdynOspfArea100042Y, createCustomCtcdynOspfAreaRequestData.createLinkCtcdynOspfArea100042Y) &&
        Objects.equals(this.createLinkCtcdynOspfArea100043Y, createCustomCtcdynOspfAreaRequestData.createLinkCtcdynOspfArea100043Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, areaId, sourceSystem, contextId, id, source, createLinkCtcdynOspfArea100042Y, createLinkCtcdynOspfArea100043Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomCtcdynOspfAreaRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    createLinkCtcdynOspfArea100042Y: ").append(toIndentedString(createLinkCtcdynOspfArea100042Y)).append("\n");
    sb.append("    createLinkCtcdynOspfArea100043Y: ").append(toIndentedString(createLinkCtcdynOspfArea100043Y)).append("\n");
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

