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
import com.fntsoftware.businessgateway.entities.FrameContractData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyFrameContractsRelation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceSignalmgmtTelephonyFrameContractsData
 */
@JsonPropertyOrder({
  ServiceSignalmgmtTelephonyFrameContractsData.JSON_PROPERTY_ENTITY,
  ServiceSignalmgmtTelephonyFrameContractsData.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceSignalmgmtTelephonyFrameContractsData {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private FrameContractData entity;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private ServiceSignalmgmtTelephonyFrameContractsRelation relation;

  public ServiceSignalmgmtTelephonyFrameContractsData() {
  }

  public ServiceSignalmgmtTelephonyFrameContractsData entity(FrameContractData entity) {
    
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

  public FrameContractData getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(FrameContractData entity) {
    this.entity = entity;
  }


  public ServiceSignalmgmtTelephonyFrameContractsData relation(ServiceSignalmgmtTelephonyFrameContractsRelation relation) {
    
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

  public ServiceSignalmgmtTelephonyFrameContractsRelation getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(ServiceSignalmgmtTelephonyFrameContractsRelation relation) {
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
    ServiceSignalmgmtTelephonyFrameContractsData serviceSignalmgmtTelephonyFrameContractsData = (ServiceSignalmgmtTelephonyFrameContractsData) o;
    return Objects.equals(this.entity, serviceSignalmgmtTelephonyFrameContractsData.entity) &&
        Objects.equals(this.relation, serviceSignalmgmtTelephonyFrameContractsData.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSignalmgmtTelephonyFrameContractsData {\n");
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
