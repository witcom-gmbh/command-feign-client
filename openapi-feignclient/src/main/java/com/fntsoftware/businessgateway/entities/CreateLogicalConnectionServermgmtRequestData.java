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
 * CreateLogicalConnectionServermgmtRequestData
 */
@JsonPropertyOrder({
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_WWN2,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_WWN1,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_WWN2_ROLE,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_WWN1_ROLE,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_OPTIONS,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateLogicalConnectionServermgmtRequestData.JSON_PROPERTY_STORAGE_UNIT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateLogicalConnectionServermgmtRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_WWN2 = "wwn2";
  private String wwn2;

  public static final String JSON_PROPERTY_WWN1 = "wwn1";
  private String wwn1;

  public static final String JSON_PROPERTY_WWN2_ROLE = "wwn2Role";
  private String wwn2Role;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_WWN1_ROLE = "wwn1Role";
  private String wwn1Role;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private String options;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_STORAGE_UNIT_ID = "storageUnitId";
  private String storageUnitId;

  public CreateLogicalConnectionServermgmtRequestData() {
  }

  public CreateLogicalConnectionServermgmtRequestData sourceId(String sourceId) {
    
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


  public CreateLogicalConnectionServermgmtRequestData ownerSystem(String ownerSystem) {
    
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


  public CreateLogicalConnectionServermgmtRequestData wwn2(String wwn2) {
    
    this.wwn2 = wwn2;
    return this;
  }

   /**
   * Get wwn2
   * @return wwn2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WWN2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWwn2() {
    return wwn2;
  }


  @JsonProperty(JSON_PROPERTY_WWN2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwn2(String wwn2) {
    this.wwn2 = wwn2;
  }


  public CreateLogicalConnectionServermgmtRequestData wwn1(String wwn1) {
    
    this.wwn1 = wwn1;
    return this;
  }

   /**
   * Get wwn1
   * @return wwn1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WWN1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWwn1() {
    return wwn1;
  }


  @JsonProperty(JSON_PROPERTY_WWN1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwn1(String wwn1) {
    this.wwn1 = wwn1;
  }


  public CreateLogicalConnectionServermgmtRequestData wwn2Role(String wwn2Role) {
    
    this.wwn2Role = wwn2Role;
    return this;
  }

   /**
   * Get wwn2Role
   * @return wwn2Role
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WWN2_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWwn2Role() {
    return wwn2Role;
  }


  @JsonProperty(JSON_PROPERTY_WWN2_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwn2Role(String wwn2Role) {
    this.wwn2Role = wwn2Role;
  }


  public CreateLogicalConnectionServermgmtRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateLogicalConnectionServermgmtRequestData wwn1Role(String wwn1Role) {
    
    this.wwn1Role = wwn1Role;
    return this;
  }

   /**
   * Get wwn1Role
   * @return wwn1Role
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WWN1_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWwn1Role() {
    return wwn1Role;
  }


  @JsonProperty(JSON_PROPERTY_WWN1_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwn1Role(String wwn1Role) {
    this.wwn1Role = wwn1Role;
  }


  public CreateLogicalConnectionServermgmtRequestData options(String options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(String options) {
    this.options = options;
  }


  public CreateLogicalConnectionServermgmtRequestData contextId(String contextId) {
    
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


  public CreateLogicalConnectionServermgmtRequestData storageUnitId(String storageUnitId) {
    
    this.storageUnitId = storageUnitId;
    return this;
  }

   /**
   * Get storageUnitId
   * @return storageUnitId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStorageUnitId() {
    return storageUnitId;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageUnitId(String storageUnitId) {
    this.storageUnitId = storageUnitId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLogicalConnectionServermgmtRequestData createLogicalConnectionServermgmtRequestData = (CreateLogicalConnectionServermgmtRequestData) o;
    return Objects.equals(this.sourceId, createLogicalConnectionServermgmtRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createLogicalConnectionServermgmtRequestData.ownerSystem) &&
        Objects.equals(this.wwn2, createLogicalConnectionServermgmtRequestData.wwn2) &&
        Objects.equals(this.wwn1, createLogicalConnectionServermgmtRequestData.wwn1) &&
        Objects.equals(this.wwn2Role, createLogicalConnectionServermgmtRequestData.wwn2Role) &&
        Objects.equals(this.sourceSystem, createLogicalConnectionServermgmtRequestData.sourceSystem) &&
        Objects.equals(this.wwn1Role, createLogicalConnectionServermgmtRequestData.wwn1Role) &&
        Objects.equals(this.options, createLogicalConnectionServermgmtRequestData.options) &&
        Objects.equals(this.contextId, createLogicalConnectionServermgmtRequestData.contextId) &&
        Objects.equals(this.storageUnitId, createLogicalConnectionServermgmtRequestData.storageUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, wwn2, wwn1, wwn2Role, sourceSystem, wwn1Role, options, contextId, storageUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLogicalConnectionServermgmtRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    wwn2: ").append(toIndentedString(wwn2)).append("\n");
    sb.append("    wwn1: ").append(toIndentedString(wwn1)).append("\n");
    sb.append("    wwn2Role: ").append(toIndentedString(wwn2Role)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    wwn1Role: ").append(toIndentedString(wwn1Role)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    storageUnitId: ").append(toIndentedString(storageUnitId)).append("\n");
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
