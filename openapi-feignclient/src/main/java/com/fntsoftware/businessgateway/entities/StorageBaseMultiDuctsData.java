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
import com.fntsoftware.businessgateway.entities.MultiDuctData;
import com.fntsoftware.businessgateway.entities.StorageBaseMultiDuctsRelation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StorageBaseMultiDuctsData
 */
@JsonPropertyOrder({
  StorageBaseMultiDuctsData.JSON_PROPERTY_ENTITY,
  StorageBaseMultiDuctsData.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class StorageBaseMultiDuctsData {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private MultiDuctData entity;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private StorageBaseMultiDuctsRelation relation;

  public StorageBaseMultiDuctsData() {
  }

  public StorageBaseMultiDuctsData entity(MultiDuctData entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MultiDuctData getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(MultiDuctData entity) {
    this.entity = entity;
  }


  public StorageBaseMultiDuctsData relation(StorageBaseMultiDuctsRelation relation) {
    
    this.relation = relation;
    return this;
  }

   /**
   * Get relation
   * @return relation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StorageBaseMultiDuctsRelation getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(StorageBaseMultiDuctsRelation relation) {
    this.relation = relation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageBaseMultiDuctsData storageBaseMultiDuctsData = (StorageBaseMultiDuctsData) o;
    return Objects.equals(this.entity, storageBaseMultiDuctsData.entity) &&
        Objects.equals(this.relation, storageBaseMultiDuctsData.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageBaseMultiDuctsData {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
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

