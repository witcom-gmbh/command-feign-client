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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CableMasterPowerCableData
 */
@JsonPropertyOrder({
  CableMasterPowerCableData.JSON_PROPERTY_CONNECTOR1,
  CableMasterPowerCableData.JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER,
  CableMasterPowerCableData.JSON_PROPERTY_CONNECTOR2,
  CableMasterPowerCableData.JSON_PROPERTY_SUB_CATEGORY,
  CableMasterPowerCableData.JSON_PROPERTY_PATCH_CABLE,
  CableMasterPowerCableData.JSON_PROPERTY_PREFIX,
  CableMasterPowerCableData.JSON_PROPERTY_WEIGHT,
  CableMasterPowerCableData.JSON_PROPERTY_MEDIUM,
  CableMasterPowerCableData.JSON_PROPERTY_EXPLANATION,
  CableMasterPowerCableData.JSON_PROPERTY_TYPE,
  CableMasterPowerCableData.JSON_PROPERTY_ELID,
  CableMasterPowerCableData.JSON_PROPERTY_MANUFACTURER,
  CableMasterPowerCableData.JSON_PROPERTY_DELIVER_LENGTH,
  CableMasterPowerCableData.JSON_PROPERTY_IS_STANDARD,
  CableMasterPowerCableData.JSON_PROPERTY_DIAMETER,
  CableMasterPowerCableData.JSON_PROPERTY_LINE_TYPE,
  CableMasterPowerCableData.JSON_PROPERTY_NUM_CABLE_LINES
})
@JsonTypeName("cableMasterPowerCableData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CableMasterPowerCableData {
  public static final String JSON_PROPERTY_CONNECTOR1 = "connector1";
  private String connector1;

  public static final String JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER = "manufacturerArticleNumber";
  private String manufacturerArticleNumber;

  public static final String JSON_PROPERTY_CONNECTOR2 = "connector2";
  private String connector2;

  public static final String JSON_PROPERTY_SUB_CATEGORY = "subCategory";
  private String subCategory;

  public static final String JSON_PROPERTY_PATCH_CABLE = "patchCable";
  private Boolean patchCable;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private String medium;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_DELIVER_LENGTH = "deliverLength";
  private BigDecimal deliverLength;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private Boolean isStandard;

  public static final String JSON_PROPERTY_DIAMETER = "diameter";
  private BigDecimal diameter;

  public static final String JSON_PROPERTY_LINE_TYPE = "lineType";
  private String lineType;

  public static final String JSON_PROPERTY_NUM_CABLE_LINES = "numCableLines";
  private BigDecimal numCableLines;

  public CableMasterPowerCableData() {
  }

  public CableMasterPowerCableData connector1(String connector1) {
    
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

  public String getConnector1() {
    return connector1;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector1(String connector1) {
    this.connector1 = connector1;
  }


  public CableMasterPowerCableData manufacturerArticleNumber(String manufacturerArticleNumber) {
    
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

  public String getManufacturerArticleNumber() {
    return manufacturerArticleNumber;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturerArticleNumber(String manufacturerArticleNumber) {
    this.manufacturerArticleNumber = manufacturerArticleNumber;
  }


  public CableMasterPowerCableData connector2(String connector2) {
    
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

  public String getConnector2() {
    return connector2;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector2(String connector2) {
    this.connector2 = connector2;
  }


  public CableMasterPowerCableData subCategory(String subCategory) {
    
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

  public String getSubCategory() {
    return subCategory;
  }


  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  public CableMasterPowerCableData patchCable(Boolean patchCable) {
    
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

  public Boolean getPatchCable() {
    return patchCable;
  }


  @JsonProperty(JSON_PROPERTY_PATCH_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatchCable(Boolean patchCable) {
    this.patchCable = patchCable;
  }


  public CableMasterPowerCableData prefix(String prefix) {
    
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

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public CableMasterPowerCableData weight(BigDecimal weight) {
    
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

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public CableMasterPowerCableData medium(String medium) {
    
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

  public String getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(String medium) {
    this.medium = medium;
  }


  public CableMasterPowerCableData explanation(String explanation) {
    
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

  public String getExplanation() {
    return explanation;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  public CableMasterPowerCableData type(String type) {
    
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

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public CableMasterPowerCableData elid(String elid) {
    
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

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  public CableMasterPowerCableData manufacturer(String manufacturer) {
    
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

  public String getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public CableMasterPowerCableData deliverLength(BigDecimal deliverLength) {
    
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

  public BigDecimal getDeliverLength() {
    return deliverLength;
  }


  @JsonProperty(JSON_PROPERTY_DELIVER_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliverLength(BigDecimal deliverLength) {
    this.deliverLength = deliverLength;
  }


  public CableMasterPowerCableData isStandard(Boolean isStandard) {
    
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

  public Boolean getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  public CableMasterPowerCableData diameter(BigDecimal diameter) {
    
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

  public BigDecimal getDiameter() {
    return diameter;
  }


  @JsonProperty(JSON_PROPERTY_DIAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiameter(BigDecimal diameter) {
    this.diameter = diameter;
  }


  public CableMasterPowerCableData lineType(String lineType) {
    
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

  public String getLineType() {
    return lineType;
  }


  @JsonProperty(JSON_PROPERTY_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineType(String lineType) {
    this.lineType = lineType;
  }


  public CableMasterPowerCableData numCableLines(BigDecimal numCableLines) {
    
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

  public BigDecimal getNumCableLines() {
    return numCableLines;
  }


  @JsonProperty(JSON_PROPERTY_NUM_CABLE_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumCableLines(BigDecimal numCableLines) {
    this.numCableLines = numCableLines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CableMasterPowerCableData cableMasterPowerCableData = (CableMasterPowerCableData) o;
    return Objects.equals(this.connector1, cableMasterPowerCableData.connector1) &&
        Objects.equals(this.manufacturerArticleNumber, cableMasterPowerCableData.manufacturerArticleNumber) &&
        Objects.equals(this.connector2, cableMasterPowerCableData.connector2) &&
        Objects.equals(this.subCategory, cableMasterPowerCableData.subCategory) &&
        Objects.equals(this.patchCable, cableMasterPowerCableData.patchCable) &&
        Objects.equals(this.prefix, cableMasterPowerCableData.prefix) &&
        Objects.equals(this.weight, cableMasterPowerCableData.weight) &&
        Objects.equals(this.medium, cableMasterPowerCableData.medium) &&
        Objects.equals(this.explanation, cableMasterPowerCableData.explanation) &&
        Objects.equals(this.type, cableMasterPowerCableData.type) &&
        Objects.equals(this.elid, cableMasterPowerCableData.elid) &&
        Objects.equals(this.manufacturer, cableMasterPowerCableData.manufacturer) &&
        Objects.equals(this.deliverLength, cableMasterPowerCableData.deliverLength) &&
        Objects.equals(this.isStandard, cableMasterPowerCableData.isStandard) &&
        Objects.equals(this.diameter, cableMasterPowerCableData.diameter) &&
        Objects.equals(this.lineType, cableMasterPowerCableData.lineType) &&
        Objects.equals(this.numCableLines, cableMasterPowerCableData.numCableLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector1, manufacturerArticleNumber, connector2, subCategory, patchCable, prefix, weight, medium, explanation, type, elid, manufacturer, deliverLength, isStandard, diameter, lineType, numCableLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CableMasterPowerCableData {\n");
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
