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
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseOperatingSystemInstallationsRelation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SoftwareLicenseOperatingSystemInstallationsData
 */
@JsonPropertyOrder({
  SoftwareLicenseOperatingSystemInstallationsData.JSON_PROPERTY_ENTITY,
  SoftwareLicenseOperatingSystemInstallationsData.JSON_PROPERTY_RELATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class SoftwareLicenseOperatingSystemInstallationsData {
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private OperatingSystemInstallationData entity;

  public static final String JSON_PROPERTY_RELATION = "relation";
  private SoftwareLicenseOperatingSystemInstallationsRelation relation;

  public SoftwareLicenseOperatingSystemInstallationsData() {
  }

  public SoftwareLicenseOperatingSystemInstallationsData entity(OperatingSystemInstallationData entity) {
    
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

  public OperatingSystemInstallationData getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(OperatingSystemInstallationData entity) {
    this.entity = entity;
  }


  public SoftwareLicenseOperatingSystemInstallationsData relation(SoftwareLicenseOperatingSystemInstallationsRelation relation) {
    
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

  public SoftwareLicenseOperatingSystemInstallationsRelation getRelation() {
    return relation;
  }


  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelation(SoftwareLicenseOperatingSystemInstallationsRelation relation) {
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
    SoftwareLicenseOperatingSystemInstallationsData softwareLicenseOperatingSystemInstallationsData = (SoftwareLicenseOperatingSystemInstallationsData) o;
    return Objects.equals(this.entity, softwareLicenseOperatingSystemInstallationsData.entity) &&
        Objects.equals(this.relation, softwareLicenseOperatingSystemInstallationsData.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, relation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareLicenseOperatingSystemInstallationsData {\n");
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

