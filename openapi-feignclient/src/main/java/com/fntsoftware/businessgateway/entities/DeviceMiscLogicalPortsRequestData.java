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
import com.fntsoftware.businessgateway.entities.DeviceMiscLogicalPortsEntityRestriction;
import com.fntsoftware.businessgateway.entities.DeviceMiscLogicalPortsRelationRestriction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceMiscLogicalPortsRequestData
 */
@JsonPropertyOrder({
  DeviceMiscLogicalPortsRequestData.JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES,
  DeviceMiscLogicalPortsRequestData.JSON_PROPERTY_ENTITY_RESTRICTIONS,
  DeviceMiscLogicalPortsRequestData.JSON_PROPERTY_RELATION_RESTRICTIONS,
  DeviceMiscLogicalPortsRequestData.JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DeviceMiscLogicalPortsRequestData {
  public static final String JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES = "returnEntityAttributes";
  private List<String> returnEntityAttributes;

  public static final String JSON_PROPERTY_ENTITY_RESTRICTIONS = "entityRestrictions";
  private DeviceMiscLogicalPortsEntityRestriction entityRestrictions;

  public static final String JSON_PROPERTY_RELATION_RESTRICTIONS = "relationRestrictions";
  private DeviceMiscLogicalPortsRelationRestriction relationRestrictions;

  public static final String JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES = "returnRelationAttributes";
  private List<String> returnRelationAttributes;

  public DeviceMiscLogicalPortsRequestData() {
  }

  public DeviceMiscLogicalPortsRequestData returnEntityAttributes(List<String> returnEntityAttributes) {
    
    this.returnEntityAttributes = returnEntityAttributes;
    return this;
  }

  public DeviceMiscLogicalPortsRequestData addReturnEntityAttributesItem(String returnEntityAttributesItem) {
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


  public DeviceMiscLogicalPortsRequestData entityRestrictions(DeviceMiscLogicalPortsEntityRestriction entityRestrictions) {
    
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

  public DeviceMiscLogicalPortsEntityRestriction getEntityRestrictions() {
    return entityRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityRestrictions(DeviceMiscLogicalPortsEntityRestriction entityRestrictions) {
    this.entityRestrictions = entityRestrictions;
  }


  public DeviceMiscLogicalPortsRequestData relationRestrictions(DeviceMiscLogicalPortsRelationRestriction relationRestrictions) {
    
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

  public DeviceMiscLogicalPortsRelationRestriction getRelationRestrictions() {
    return relationRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_RELATION_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationRestrictions(DeviceMiscLogicalPortsRelationRestriction relationRestrictions) {
    this.relationRestrictions = relationRestrictions;
  }


  public DeviceMiscLogicalPortsRequestData returnRelationAttributes(List<String> returnRelationAttributes) {
    
    this.returnRelationAttributes = returnRelationAttributes;
    return this;
  }

  public DeviceMiscLogicalPortsRequestData addReturnRelationAttributesItem(String returnRelationAttributesItem) {
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
    DeviceMiscLogicalPortsRequestData deviceMiscLogicalPortsRequestData = (DeviceMiscLogicalPortsRequestData) o;
    return Objects.equals(this.returnEntityAttributes, deviceMiscLogicalPortsRequestData.returnEntityAttributes) &&
        Objects.equals(this.entityRestrictions, deviceMiscLogicalPortsRequestData.entityRestrictions) &&
        Objects.equals(this.relationRestrictions, deviceMiscLogicalPortsRequestData.relationRestrictions) &&
        Objects.equals(this.returnRelationAttributes, deviceMiscLogicalPortsRequestData.returnRelationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnEntityAttributes, entityRestrictions, relationRestrictions, returnRelationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMiscLogicalPortsRequestData {\n");
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
