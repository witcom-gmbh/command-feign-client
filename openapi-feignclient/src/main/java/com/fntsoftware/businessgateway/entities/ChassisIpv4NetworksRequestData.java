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
import com.fntsoftware.businessgateway.entities.ChassisIpv4NetworksEntityRestriction;
import com.fntsoftware.businessgateway.entities.ChassisIpv4NetworksRelationRestriction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChassisIpv4NetworksRequestData
 */
@JsonPropertyOrder({
  ChassisIpv4NetworksRequestData.JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES,
  ChassisIpv4NetworksRequestData.JSON_PROPERTY_ENTITY_RESTRICTIONS,
  ChassisIpv4NetworksRequestData.JSON_PROPERTY_RELATION_RESTRICTIONS,
  ChassisIpv4NetworksRequestData.JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ChassisIpv4NetworksRequestData {
  public static final String JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES = "returnEntityAttributes";
  private List<String> returnEntityAttributes;

  public static final String JSON_PROPERTY_ENTITY_RESTRICTIONS = "entityRestrictions";
  private ChassisIpv4NetworksEntityRestriction entityRestrictions;

  public static final String JSON_PROPERTY_RELATION_RESTRICTIONS = "relationRestrictions";
  private ChassisIpv4NetworksRelationRestriction relationRestrictions;

  public static final String JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES = "returnRelationAttributes";
  private List<String> returnRelationAttributes;

  public ChassisIpv4NetworksRequestData() {
  }

  public ChassisIpv4NetworksRequestData returnEntityAttributes(List<String> returnEntityAttributes) {
    
    this.returnEntityAttributes = returnEntityAttributes;
    return this;
  }

  public ChassisIpv4NetworksRequestData addReturnEntityAttributesItem(String returnEntityAttributesItem) {
    if (this.returnEntityAttributes == null) {
      this.returnEntityAttributes = new ArrayList<>();
    }
    this.returnEntityAttributes.add(returnEntityAttributesItem);
    return this;
  }

   /**
   * Get returnEntityAttributes
   * @return returnEntityAttributes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getReturnEntityAttributes() {
    return returnEntityAttributes;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnEntityAttributes(List<String> returnEntityAttributes) {
    this.returnEntityAttributes = returnEntityAttributes;
  }


  public ChassisIpv4NetworksRequestData entityRestrictions(ChassisIpv4NetworksEntityRestriction entityRestrictions) {
    
    this.entityRestrictions = entityRestrictions;
    return this;
  }

   /**
   * Get entityRestrictions
   * @return entityRestrictions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChassisIpv4NetworksEntityRestriction getEntityRestrictions() {
    return entityRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityRestrictions(ChassisIpv4NetworksEntityRestriction entityRestrictions) {
    this.entityRestrictions = entityRestrictions;
  }


  public ChassisIpv4NetworksRequestData relationRestrictions(ChassisIpv4NetworksRelationRestriction relationRestrictions) {
    
    this.relationRestrictions = relationRestrictions;
    return this;
  }

   /**
   * Get relationRestrictions
   * @return relationRestrictions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATION_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChassisIpv4NetworksRelationRestriction getRelationRestrictions() {
    return relationRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_RELATION_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationRestrictions(ChassisIpv4NetworksRelationRestriction relationRestrictions) {
    this.relationRestrictions = relationRestrictions;
  }


  public ChassisIpv4NetworksRequestData returnRelationAttributes(List<String> returnRelationAttributes) {
    
    this.returnRelationAttributes = returnRelationAttributes;
    return this;
  }

  public ChassisIpv4NetworksRequestData addReturnRelationAttributesItem(String returnRelationAttributesItem) {
    if (this.returnRelationAttributes == null) {
      this.returnRelationAttributes = new ArrayList<>();
    }
    this.returnRelationAttributes.add(returnRelationAttributesItem);
    return this;
  }

   /**
   * Get returnRelationAttributes
   * @return returnRelationAttributes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getReturnRelationAttributes() {
    return returnRelationAttributes;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnRelationAttributes(List<String> returnRelationAttributes) {
    this.returnRelationAttributes = returnRelationAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChassisIpv4NetworksRequestData chassisIpv4NetworksRequestData = (ChassisIpv4NetworksRequestData) o;
    return Objects.equals(this.returnEntityAttributes, chassisIpv4NetworksRequestData.returnEntityAttributes) &&
        Objects.equals(this.entityRestrictions, chassisIpv4NetworksRequestData.entityRestrictions) &&
        Objects.equals(this.relationRestrictions, chassisIpv4NetworksRequestData.relationRestrictions) &&
        Objects.equals(this.returnRelationAttributes, chassisIpv4NetworksRequestData.returnRelationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnEntityAttributes, entityRestrictions, relationRestrictions, returnRelationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChassisIpv4NetworksRequestData {\n");
    sb.append("    returnEntityAttributes: ").append(toIndentedString(returnEntityAttributes)).append("\n");
    sb.append("    entityRestrictions: ").append(toIndentedString(entityRestrictions)).append("\n");
    sb.append("    relationRestrictions: ").append(toIndentedString(relationRestrictions)).append("\n");
    sb.append("    returnRelationAttributes: ").append(toIndentedString(returnRelationAttributes)).append("\n");
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

