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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateUniqueIdHierarchyRequestData
 */
@JsonPropertyOrder({
  CreateUniqueIdHierarchyRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateUniqueIdHierarchyRequestData.JSON_PROPERTY_PARENT_UNIQUE_ID,
  CreateUniqueIdHierarchyRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateUniqueIdHierarchyRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateUniqueIdHierarchyRequestData.JSON_PROPERTY_UNIQUE_ID,
  CreateUniqueIdHierarchyRequestData.JSON_PROPERTY_EXTERNAL_SYSTEM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateUniqueIdHierarchyRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_PARENT_UNIQUE_ID = "parentUniqueId";
  private String parentUniqueId;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  private String uniqueId;

  public static final String JSON_PROPERTY_EXTERNAL_SYSTEM = "externalSystem";
  private String externalSystem;

  public CreateUniqueIdHierarchyRequestData() {
  }

  public CreateUniqueIdHierarchyRequestData sourceId(String sourceId) {
    
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


  public CreateUniqueIdHierarchyRequestData parentUniqueId(String parentUniqueId) {
    
    this.parentUniqueId = parentUniqueId;
    return this;
  }

   /**
   * Get parentUniqueId
   * @return parentUniqueId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentUniqueId() {
    return parentUniqueId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentUniqueId(String parentUniqueId) {
    this.parentUniqueId = parentUniqueId;
  }


  public CreateUniqueIdHierarchyRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateUniqueIdHierarchyRequestData contextId(String contextId) {
    
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


  public CreateUniqueIdHierarchyRequestData uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public CreateUniqueIdHierarchyRequestData externalSystem(String externalSystem) {
    
    this.externalSystem = externalSystem;
    return this;
  }

   /**
   * Get externalSystem
   * @return externalSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalSystem() {
    return externalSystem;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalSystem(String externalSystem) {
    this.externalSystem = externalSystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUniqueIdHierarchyRequestData createUniqueIdHierarchyRequestData = (CreateUniqueIdHierarchyRequestData) o;
    return Objects.equals(this.sourceId, createUniqueIdHierarchyRequestData.sourceId) &&
        Objects.equals(this.parentUniqueId, createUniqueIdHierarchyRequestData.parentUniqueId) &&
        Objects.equals(this.sourceSystem, createUniqueIdHierarchyRequestData.sourceSystem) &&
        Objects.equals(this.contextId, createUniqueIdHierarchyRequestData.contextId) &&
        Objects.equals(this.uniqueId, createUniqueIdHierarchyRequestData.uniqueId) &&
        Objects.equals(this.externalSystem, createUniqueIdHierarchyRequestData.externalSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, parentUniqueId, sourceSystem, contextId, uniqueId, externalSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUniqueIdHierarchyRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    parentUniqueId: ").append(toIndentedString(parentUniqueId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    externalSystem: ").append(toIndentedString(externalSystem)).append("\n");
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
