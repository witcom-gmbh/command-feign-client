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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MetaSchemaGetLinksRestriction
 */
@JsonPropertyOrder({
  MetaSchemaGetLinksRestriction.JSON_PROPERTY_REL_ID,
  MetaSchemaGetLinksRestriction.JSON_PROPERTY_ENTITY_GROUP_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class MetaSchemaGetLinksRestriction {
  public static final String JSON_PROPERTY_REL_ID = "relId";
  private RestrictionsString relId;

  public static final String JSON_PROPERTY_ENTITY_GROUP_NAME = "entityGroupName";
  private RestrictionsString entityGroupName;

  public MetaSchemaGetLinksRestriction() {
  }

  public MetaSchemaGetLinksRestriction relId(RestrictionsString relId) {
    
    this.relId = relId;
    return this;
  }

   /**
   * Get relId
   * @return relId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRelId() {
    return relId;
  }


  @JsonProperty(JSON_PROPERTY_REL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelId(RestrictionsString relId) {
    this.relId = relId;
  }


  public MetaSchemaGetLinksRestriction entityGroupName(RestrictionsString entityGroupName) {
    
    this.entityGroupName = entityGroupName;
    return this;
  }

   /**
   * Get entityGroupName
   * @return entityGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getEntityGroupName() {
    return entityGroupName;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityGroupName(RestrictionsString entityGroupName) {
    this.entityGroupName = entityGroupName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaSchemaGetLinksRestriction metaSchemaGetLinksRestriction = (MetaSchemaGetLinksRestriction) o;
    return Objects.equals(this.relId, metaSchemaGetLinksRestriction.relId) &&
        Objects.equals(this.entityGroupName, metaSchemaGetLinksRestriction.entityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relId, entityGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaSchemaGetLinksRestriction {\n");
    sb.append("    relId: ").append(toIndentedString(relId)).append("\n");
    sb.append("    entityGroupName: ").append(toIndentedString(entityGroupName)).append("\n");
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
