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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CableMasterClimateLineQueryRestriction
 */
@JsonPropertyOrder({
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_CONNECTOR1,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_CONNECTOR2,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_PREFIX,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_WEIGHT,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_MEDIUM,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_EXPLANATION,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_TYPE,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_ELID,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_MANUFACTURER,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_DELIVER_LENGTH,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_IS_STANDARD,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_DIAMETER,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_LINE_TYPE,
  CableMasterClimateLineQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CableMasterClimateLineQueryRestriction {
  public static final String JSON_PROPERTY_CONNECTOR1 = "connector1";
  private RestrictionsString connector1;

  public static final String JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER = "manufacturerArticleNumber";
  private RestrictionsString manufacturerArticleNumber;

  public static final String JSON_PROPERTY_CONNECTOR2 = "connector2";
  private RestrictionsString connector2;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private RestrictionsString prefix;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private RestrictionsNumeric weight;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private RestrictionsString medium;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private RestrictionsString explanation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public static final String JSON_PROPERTY_DELIVER_LENGTH = "deliverLength";
  private RestrictionsNumeric deliverLength;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private RestrictionsBoolean isStandard;

  public static final String JSON_PROPERTY_DIAMETER = "diameter";
  private RestrictionsNumeric diameter;

  public static final String JSON_PROPERTY_LINE_TYPE = "lineType";
  private RestrictionsString lineType;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public CableMasterClimateLineQueryRestriction() {
  }

  public CableMasterClimateLineQueryRestriction connector1(RestrictionsString connector1) {
    
    this.connector1 = connector1;
    return this;
  }

   /**
   * Get connector1
   * @return connector1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getConnector1() {
    return connector1;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector1(RestrictionsString connector1) {
    this.connector1 = connector1;
  }


  public CableMasterClimateLineQueryRestriction manufacturerArticleNumber(RestrictionsString manufacturerArticleNumber) {
    
    this.manufacturerArticleNumber = manufacturerArticleNumber;
    return this;
  }

   /**
   * Get manufacturerArticleNumber
   * @return manufacturerArticleNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getManufacturerArticleNumber() {
    return manufacturerArticleNumber;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturerArticleNumber(RestrictionsString manufacturerArticleNumber) {
    this.manufacturerArticleNumber = manufacturerArticleNumber;
  }


  public CableMasterClimateLineQueryRestriction connector2(RestrictionsString connector2) {
    
    this.connector2 = connector2;
    return this;
  }

   /**
   * Get connector2
   * @return connector2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getConnector2() {
    return connector2;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector2(RestrictionsString connector2) {
    this.connector2 = connector2;
  }


  public CableMasterClimateLineQueryRestriction prefix(RestrictionsString prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(RestrictionsString prefix) {
    this.prefix = prefix;
  }


  public CableMasterClimateLineQueryRestriction weight(RestrictionsNumeric weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(RestrictionsNumeric weight) {
    this.weight = weight;
  }


  public CableMasterClimateLineQueryRestriction medium(RestrictionsString medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(RestrictionsString medium) {
    this.medium = medium;
  }


  public CableMasterClimateLineQueryRestriction explanation(RestrictionsString explanation) {
    
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getExplanation() {
    return explanation;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanation(RestrictionsString explanation) {
    this.explanation = explanation;
  }


  public CableMasterClimateLineQueryRestriction type(RestrictionsString type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RestrictionsString type) {
    this.type = type;
  }


  public CableMasterClimateLineQueryRestriction elid(RestrictionsString elid) {
    
    this.elid = elid;
    return this;
  }

   /**
   * Get elid
   * @return elid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public CableMasterClimateLineQueryRestriction manufacturer(RestrictionsString manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(RestrictionsString manufacturer) {
    this.manufacturer = manufacturer;
  }


  public CableMasterClimateLineQueryRestriction deliverLength(RestrictionsNumeric deliverLength) {
    
    this.deliverLength = deliverLength;
    return this;
  }

   /**
   * Get deliverLength
   * @return deliverLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVER_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDeliverLength() {
    return deliverLength;
  }


  @JsonProperty(JSON_PROPERTY_DELIVER_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliverLength(RestrictionsNumeric deliverLength) {
    this.deliverLength = deliverLength;
  }


  public CableMasterClimateLineQueryRestriction isStandard(RestrictionsBoolean isStandard) {
    
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Get isStandard
   * @return isStandard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(RestrictionsBoolean isStandard) {
    this.isStandard = isStandard;
  }


  public CableMasterClimateLineQueryRestriction diameter(RestrictionsNumeric diameter) {
    
    this.diameter = diameter;
    return this;
  }

   /**
   * Get diameter
   * @return diameter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDiameter() {
    return diameter;
  }


  @JsonProperty(JSON_PROPERTY_DIAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiameter(RestrictionsNumeric diameter) {
    this.diameter = diameter;
  }


  public CableMasterClimateLineQueryRestriction lineType(RestrictionsString lineType) {
    
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLineType() {
    return lineType;
  }


  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineType(RestrictionsString lineType) {
    this.lineType = lineType;
  }


  public CableMasterClimateLineQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CableMasterClimateLineQueryRestriction cableMasterClimateLineQueryRestriction = (CableMasterClimateLineQueryRestriction) o;
    return Objects.equals(this.connector1, cableMasterClimateLineQueryRestriction.connector1) &&
        Objects.equals(this.manufacturerArticleNumber, cableMasterClimateLineQueryRestriction.manufacturerArticleNumber) &&
        Objects.equals(this.connector2, cableMasterClimateLineQueryRestriction.connector2) &&
        Objects.equals(this.prefix, cableMasterClimateLineQueryRestriction.prefix) &&
        Objects.equals(this.weight, cableMasterClimateLineQueryRestriction.weight) &&
        Objects.equals(this.medium, cableMasterClimateLineQueryRestriction.medium) &&
        Objects.equals(this.explanation, cableMasterClimateLineQueryRestriction.explanation) &&
        Objects.equals(this.type, cableMasterClimateLineQueryRestriction.type) &&
        Objects.equals(this.elid, cableMasterClimateLineQueryRestriction.elid) &&
        Objects.equals(this.manufacturer, cableMasterClimateLineQueryRestriction.manufacturer) &&
        Objects.equals(this.deliverLength, cableMasterClimateLineQueryRestriction.deliverLength) &&
        Objects.equals(this.isStandard, cableMasterClimateLineQueryRestriction.isStandard) &&
        Objects.equals(this.diameter, cableMasterClimateLineQueryRestriction.diameter) &&
        Objects.equals(this.lineType, cableMasterClimateLineQueryRestriction.lineType) &&
        Objects.equals(this.first, cableMasterClimateLineQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector1, manufacturerArticleNumber, connector2, prefix, weight, medium, explanation, type, elid, manufacturer, deliverLength, isStandard, diameter, lineType, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CableMasterClimateLineQueryRestriction {\n");
    sb.append("    connector1: ").append(toIndentedString(connector1)).append("\n");
    sb.append("    manufacturerArticleNumber: ").append(toIndentedString(manufacturerArticleNumber)).append("\n");
    sb.append("    connector2: ").append(toIndentedString(connector2)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    deliverLength: ").append(toIndentedString(deliverLength)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    diameter: ").append(toIndentedString(diameter)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
