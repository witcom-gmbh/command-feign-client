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
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfAreaData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPath100042Relation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceTelcoUnroutedPath100042Data
 */
@JsonPropertyOrder({
  ServiceTelcoUnroutedPath100042Data.JSON_PROPERTY_ENTITY,
  ServiceTelcoUnroutedPath100042Data.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServiceTelcoUnroutedPath100042Data {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private CustomCtcdynOspfAreaData entity;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private ServiceTelcoUnroutedPath100042Relation relation;

  public ServiceTelcoUnroutedPath100042Data() {
  }

  public ServiceTelcoUnroutedPath100042Data entity(CustomCtcdynOspfAreaData entity) {
    
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

  public CustomCtcdynOspfAreaData getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(CustomCtcdynOspfAreaData entity) {
    this.entity = entity;
  }


  public ServiceTelcoUnroutedPath100042Data relation(ServiceTelcoUnroutedPath100042Relation relation) {
    
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

  public ServiceTelcoUnroutedPath100042Relation getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(ServiceTelcoUnroutedPath100042Relation relation) {
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
    ServiceTelcoUnroutedPath100042Data serviceTelcoUnroutedPath100042Data = (ServiceTelcoUnroutedPath100042Data) o;
    return Objects.equals(this.entity, serviceTelcoUnroutedPath100042Data.entity) &&
        Objects.equals(this.relation, serviceTelcoUnroutedPath100042Data.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoUnroutedPath100042Data {\n");
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
