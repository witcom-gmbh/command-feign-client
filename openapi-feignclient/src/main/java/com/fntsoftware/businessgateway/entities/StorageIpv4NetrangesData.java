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
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeData;
import com.fntsoftware.businessgateway.entities.StorageIpv4NetrangesRelation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StorageIpv4NetrangesData
 */
@JsonPropertyOrder({
  StorageIpv4NetrangesData.JSON_PROPERTY_ENTITY,
  StorageIpv4NetrangesData.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class StorageIpv4NetrangesData {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private Ipv4NetrangeData entity;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private StorageIpv4NetrangesRelation relation;

  public StorageIpv4NetrangesData() {
  }

  public StorageIpv4NetrangesData entity(Ipv4NetrangeData entity) {
    
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

  public Ipv4NetrangeData getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(Ipv4NetrangeData entity) {
    this.entity = entity;
  }


  public StorageIpv4NetrangesData relation(StorageIpv4NetrangesRelation relation) {
    
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

  public StorageIpv4NetrangesRelation getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(StorageIpv4NetrangesRelation relation) {
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
    StorageIpv4NetrangesData storageIpv4NetrangesData = (StorageIpv4NetrangesData) o;
    return Objects.equals(this.entity, storageIpv4NetrangesData.entity) &&
        Objects.equals(this.relation, storageIpv4NetrangesData.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageIpv4NetrangesData {\n");
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
