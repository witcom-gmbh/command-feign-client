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
import com.fntsoftware.businessgateway.entities.DeviceMiscPersonGroupsEntityRestriction;
import com.fntsoftware.businessgateway.entities.DeviceMiscPersonGroupsRelationRestriction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceMiscPersonGroupsRequestData
 */
@JsonPropertyOrder({
  DeviceMiscPersonGroupsRequestData.JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES,
  DeviceMiscPersonGroupsRequestData.JSON_PROPERTY_ENTITY_RESTRICTIONS,
  DeviceMiscPersonGroupsRequestData.JSON_PROPERTY_RELATION_RESTRICTIONS,
  DeviceMiscPersonGroupsRequestData.JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DeviceMiscPersonGroupsRequestData {
  public static final String JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES = "returnEntityAttributes";
  private List<String> returnEntityAttributes;

  public static final String JSON_PROPERTY_ENTITY_RESTRICTIONS = "entityRestrictions";
  private DeviceMiscPersonGroupsEntityRestriction entityRestrictions;

  public static final String JSON_PROPERTY_RELATION_RESTRICTIONS = "relationRestrictions";
  private DeviceMiscPersonGroupsRelationRestriction relationRestrictions;

  public static final String JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES = "returnRelationAttributes";
  private List<String> returnRelationAttributes;

  public DeviceMiscPersonGroupsRequestData() {
  }

  public DeviceMiscPersonGroupsRequestData returnEntityAttributes(List<String> returnEntityAttributes) {
    
    this.returnEntityAttributes = returnEntityAttributes;
    return this;
  }

  public DeviceMiscPersonGroupsRequestData addReturnEntityAttributesItem(String returnEntityAttributesItem) {
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


  public DeviceMiscPersonGroupsRequestData entityRestrictions(DeviceMiscPersonGroupsEntityRestriction entityRestrictions) {
    
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

  public DeviceMiscPersonGroupsEntityRestriction getEntityRestrictions() {
    return entityRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityRestrictions(DeviceMiscPersonGroupsEntityRestriction entityRestrictions) {
    this.entityRestrictions = entityRestrictions;
  }


  public DeviceMiscPersonGroupsRequestData relationRestrictions(DeviceMiscPersonGroupsRelationRestriction relationRestrictions) {
    
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

  public DeviceMiscPersonGroupsRelationRestriction getRelationRestrictions() {
    return relationRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_RELATION_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationRestrictions(DeviceMiscPersonGroupsRelationRestriction relationRestrictions) {
    this.relationRestrictions = relationRestrictions;
  }


  public DeviceMiscPersonGroupsRequestData returnRelationAttributes(List<String> returnRelationAttributes) {
    
    this.returnRelationAttributes = returnRelationAttributes;
    return this;
  }

  public DeviceMiscPersonGroupsRequestData addReturnRelationAttributesItem(String returnRelationAttributesItem) {
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
    DeviceMiscPersonGroupsRequestData deviceMiscPersonGroupsRequestData = (DeviceMiscPersonGroupsRequestData) o;
    return Objects.equals(this.returnEntityAttributes, deviceMiscPersonGroupsRequestData.returnEntityAttributes) &&
        Objects.equals(this.entityRestrictions, deviceMiscPersonGroupsRequestData.entityRestrictions) &&
        Objects.equals(this.relationRestrictions, deviceMiscPersonGroupsRequestData.relationRestrictions) &&
        Objects.equals(this.returnRelationAttributes, deviceMiscPersonGroupsRequestData.returnRelationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnEntityAttributes, entityRestrictions, relationRestrictions, returnRelationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMiscPersonGroupsRequestData {\n");
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
