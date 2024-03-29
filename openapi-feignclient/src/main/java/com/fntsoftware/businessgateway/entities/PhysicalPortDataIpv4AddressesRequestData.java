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
import com.fntsoftware.businessgateway.entities.PhysicalPortDataIpv4AddressesEntityRestriction;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataIpv4AddressesRelationRestriction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PhysicalPortDataIpv4AddressesRequestData
 */
@JsonPropertyOrder({
  PhysicalPortDataIpv4AddressesRequestData.JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES,
  PhysicalPortDataIpv4AddressesRequestData.JSON_PROPERTY_ENTITY_RESTRICTIONS,
  PhysicalPortDataIpv4AddressesRequestData.JSON_PROPERTY_RELATION_RESTRICTIONS,
  PhysicalPortDataIpv4AddressesRequestData.JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class PhysicalPortDataIpv4AddressesRequestData {
  public static final String JSON_PROPERTY_RETURN_ENTITY_ATTRIBUTES = "returnEntityAttributes";
  private List<String> returnEntityAttributes;

  public static final String JSON_PROPERTY_ENTITY_RESTRICTIONS = "entityRestrictions";
  private PhysicalPortDataIpv4AddressesEntityRestriction entityRestrictions;

  public static final String JSON_PROPERTY_RELATION_RESTRICTIONS = "relationRestrictions";
  private PhysicalPortDataIpv4AddressesRelationRestriction relationRestrictions;

  public static final String JSON_PROPERTY_RETURN_RELATION_ATTRIBUTES = "returnRelationAttributes";
  private List<String> returnRelationAttributes;

  public PhysicalPortDataIpv4AddressesRequestData() {
  }

  public PhysicalPortDataIpv4AddressesRequestData returnEntityAttributes(List<String> returnEntityAttributes) {
    
    this.returnEntityAttributes = returnEntityAttributes;
    return this;
  }

  public PhysicalPortDataIpv4AddressesRequestData addReturnEntityAttributesItem(String returnEntityAttributesItem) {
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


  public PhysicalPortDataIpv4AddressesRequestData entityRestrictions(PhysicalPortDataIpv4AddressesEntityRestriction entityRestrictions) {
    
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

  public PhysicalPortDataIpv4AddressesEntityRestriction getEntityRestrictions() {
    return entityRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityRestrictions(PhysicalPortDataIpv4AddressesEntityRestriction entityRestrictions) {
    this.entityRestrictions = entityRestrictions;
  }


  public PhysicalPortDataIpv4AddressesRequestData relationRestrictions(PhysicalPortDataIpv4AddressesRelationRestriction relationRestrictions) {
    
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

  public PhysicalPortDataIpv4AddressesRelationRestriction getRelationRestrictions() {
    return relationRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_RELATION_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationRestrictions(PhysicalPortDataIpv4AddressesRelationRestriction relationRestrictions) {
    this.relationRestrictions = relationRestrictions;
  }


  public PhysicalPortDataIpv4AddressesRequestData returnRelationAttributes(List<String> returnRelationAttributes) {
    
    this.returnRelationAttributes = returnRelationAttributes;
    return this;
  }

  public PhysicalPortDataIpv4AddressesRequestData addReturnRelationAttributesItem(String returnRelationAttributesItem) {
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
    PhysicalPortDataIpv4AddressesRequestData physicalPortDataIpv4AddressesRequestData = (PhysicalPortDataIpv4AddressesRequestData) o;
    return Objects.equals(this.returnEntityAttributes, physicalPortDataIpv4AddressesRequestData.returnEntityAttributes) &&
        Objects.equals(this.entityRestrictions, physicalPortDataIpv4AddressesRequestData.entityRestrictions) &&
        Objects.equals(this.relationRestrictions, physicalPortDataIpv4AddressesRequestData.relationRestrictions) &&
        Objects.equals(this.returnRelationAttributes, physicalPortDataIpv4AddressesRequestData.returnRelationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnEntityAttributes, entityRestrictions, relationRestrictions, returnRelationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalPortDataIpv4AddressesRequestData {\n");
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

