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
 * CableMasterPowerCableQueryRestriction
 */
@JsonPropertyOrder({
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_CONNECTOR1,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_CONNECTOR2,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_SUB_CATEGORY,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_PATCH_CABLE,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_PREFIX,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_WEIGHT,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_MEDIUM,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_EXPLANATION,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_TYPE,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_ELID,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_MANUFACTURER,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_DELIVER_LENGTH,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_IS_STANDARD,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_DIAMETER,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_LINE_TYPE,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_NUM_CABLE_LINES,
  CableMasterPowerCableQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CableMasterPowerCableQueryRestriction {
  public static final String JSON_PROPERTY_CONNECTOR1 = "connector1";
  private RestrictionsString connector1;

  public static final String JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER = "manufacturerArticleNumber";
  private RestrictionsString manufacturerArticleNumber;

  public static final String JSON_PROPERTY_CONNECTOR2 = "connector2";
  private RestrictionsString connector2;

  public static final String JSON_PROPERTY_SUB_CATEGORY = "subCategory";
  private RestrictionsString subCategory;

  public static final String JSON_PROPERTY_PATCH_CABLE = "patchCable";
  private RestrictionsBoolean patchCable;

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

  public static final String JSON_PROPERTY_NUM_CABLE_LINES = "numCableLines";
  private RestrictionsNumeric numCableLines;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public CableMasterPowerCableQueryRestriction() {
  }

  public CableMasterPowerCableQueryRestriction connector1(RestrictionsString connector1) {
    
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


  public CableMasterPowerCableQueryRestriction manufacturerArticleNumber(RestrictionsString manufacturerArticleNumber) {
    
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


  public CableMasterPowerCableQueryRestriction connector2(RestrictionsString connector2) {
    
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


  public CableMasterPowerCableQueryRestriction subCategory(RestrictionsString subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

   /**
   * Get subCategory
   * @return subCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSubCategory() {
    return subCategory;
  }


  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubCategory(RestrictionsString subCategory) {
    this.subCategory = subCategory;
  }


  public CableMasterPowerCableQueryRestriction patchCable(RestrictionsBoolean patchCable) {
    
    this.patchCable = patchCable;
    return this;
  }

   /**
   * Get patchCable
   * @return patchCable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATCH_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getPatchCable() {
    return patchCable;
  }


  @JsonProperty(JSON_PROPERTY_PATCH_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatchCable(RestrictionsBoolean patchCable) {
    this.patchCable = patchCable;
  }


  public CableMasterPowerCableQueryRestriction prefix(RestrictionsString prefix) {
    
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


  public CableMasterPowerCableQueryRestriction weight(RestrictionsNumeric weight) {
    
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


  public CableMasterPowerCableQueryRestriction medium(RestrictionsString medium) {
    
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


  public CableMasterPowerCableQueryRestriction explanation(RestrictionsString explanation) {
    
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


  public CableMasterPowerCableQueryRestriction type(RestrictionsString type) {
    
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


  public CableMasterPowerCableQueryRestriction elid(RestrictionsString elid) {
    
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


  public CableMasterPowerCableQueryRestriction manufacturer(RestrictionsString manufacturer) {
    
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


  public CableMasterPowerCableQueryRestriction deliverLength(RestrictionsNumeric deliverLength) {
    
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


  public CableMasterPowerCableQueryRestriction isStandard(RestrictionsBoolean isStandard) {
    
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


  public CableMasterPowerCableQueryRestriction diameter(RestrictionsNumeric diameter) {
    
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


  public CableMasterPowerCableQueryRestriction lineType(RestrictionsString lineType) {
    
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


  public CableMasterPowerCableQueryRestriction numCableLines(RestrictionsNumeric numCableLines) {
    
    this.numCableLines = numCableLines;
    return this;
  }

   /**
   * Get numCableLines
   * @return numCableLines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_CABLE_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getNumCableLines() {
    return numCableLines;
  }


  @JsonProperty(JSON_PROPERTY_NUM_CABLE_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumCableLines(RestrictionsNumeric numCableLines) {
    this.numCableLines = numCableLines;
  }


  public CableMasterPowerCableQueryRestriction first(RestrictionsNumeric first) {
    
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
    CableMasterPowerCableQueryRestriction cableMasterPowerCableQueryRestriction = (CableMasterPowerCableQueryRestriction) o;
    return Objects.equals(this.connector1, cableMasterPowerCableQueryRestriction.connector1) &&
        Objects.equals(this.manufacturerArticleNumber, cableMasterPowerCableQueryRestriction.manufacturerArticleNumber) &&
        Objects.equals(this.connector2, cableMasterPowerCableQueryRestriction.connector2) &&
        Objects.equals(this.subCategory, cableMasterPowerCableQueryRestriction.subCategory) &&
        Objects.equals(this.patchCable, cableMasterPowerCableQueryRestriction.patchCable) &&
        Objects.equals(this.prefix, cableMasterPowerCableQueryRestriction.prefix) &&
        Objects.equals(this.weight, cableMasterPowerCableQueryRestriction.weight) &&
        Objects.equals(this.medium, cableMasterPowerCableQueryRestriction.medium) &&
        Objects.equals(this.explanation, cableMasterPowerCableQueryRestriction.explanation) &&
        Objects.equals(this.type, cableMasterPowerCableQueryRestriction.type) &&
        Objects.equals(this.elid, cableMasterPowerCableQueryRestriction.elid) &&
        Objects.equals(this.manufacturer, cableMasterPowerCableQueryRestriction.manufacturer) &&
        Objects.equals(this.deliverLength, cableMasterPowerCableQueryRestriction.deliverLength) &&
        Objects.equals(this.isStandard, cableMasterPowerCableQueryRestriction.isStandard) &&
        Objects.equals(this.diameter, cableMasterPowerCableQueryRestriction.diameter) &&
        Objects.equals(this.lineType, cableMasterPowerCableQueryRestriction.lineType) &&
        Objects.equals(this.numCableLines, cableMasterPowerCableQueryRestriction.numCableLines) &&
        Objects.equals(this.first, cableMasterPowerCableQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector1, manufacturerArticleNumber, connector2, subCategory, patchCable, prefix, weight, medium, explanation, type, elid, manufacturer, deliverLength, isStandard, diameter, lineType, numCableLines, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CableMasterPowerCableQueryRestriction {\n");
    sb.append("    connector1: ").append(toIndentedString(connector1)).append("\n");
    sb.append("    manufacturerArticleNumber: ").append(toIndentedString(manufacturerArticleNumber)).append("\n");
    sb.append("    connector2: ").append(toIndentedString(connector2)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    patchCable: ").append(toIndentedString(patchCable)).append("\n");
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
    sb.append("    numCableLines: ").append(toIndentedString(numCableLines)).append("\n");
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
