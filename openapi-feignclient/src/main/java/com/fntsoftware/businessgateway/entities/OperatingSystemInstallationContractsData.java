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
import com.fntsoftware.businessgateway.entities.ContractData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationContractsRelation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OperatingSystemInstallationContractsData
 */
@JsonPropertyOrder({
  OperatingSystemInstallationContractsData.JSON_PROPERTY_ENTITY,
  OperatingSystemInstallationContractsData.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class OperatingSystemInstallationContractsData {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private ContractData entity;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private OperatingSystemInstallationContractsRelation relation;

  public OperatingSystemInstallationContractsData() {
  }

  public OperatingSystemInstallationContractsData entity(ContractData entity) {
    
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

  public ContractData getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(ContractData entity) {
    this.entity = entity;
  }


  public OperatingSystemInstallationContractsData relation(OperatingSystemInstallationContractsRelation relation) {
    
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

  public OperatingSystemInstallationContractsRelation getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(OperatingSystemInstallationContractsRelation relation) {
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
    OperatingSystemInstallationContractsData operatingSystemInstallationContractsData = (OperatingSystemInstallationContractsData) o;
    return Objects.equals(this.entity, operatingSystemInstallationContractsData.entity) &&
        Objects.equals(this.relation, operatingSystemInstallationContractsData.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingSystemInstallationContractsData {\n");
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
