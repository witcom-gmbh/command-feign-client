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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TerminalDeviceMasterEntityRestriction
 */
@JsonPropertyOrder({
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER,
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_IS_STANDARD,
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_FUNCTION,
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_EXPLANATION,
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_TYPE,
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_ELID,
  TerminalDeviceMasterEntityRestriction.JSON_PROPERTY_MANUFACTURER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class TerminalDeviceMasterEntityRestriction {
  public static final String JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER = "manufacturerArticleNumber";
  private RestrictionsString manufacturerArticleNumber;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private RestrictionsBoolean isStandard;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private RestrictionsString function;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private RestrictionsString explanation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public TerminalDeviceMasterEntityRestriction() {
  }

  public TerminalDeviceMasterEntityRestriction manufacturerArticleNumber(RestrictionsString manufacturerArticleNumber) {
    
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


  public TerminalDeviceMasterEntityRestriction isStandard(RestrictionsBoolean isStandard) {
    
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


  public TerminalDeviceMasterEntityRestriction function(RestrictionsString function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(RestrictionsString function) {
    this.function = function;
  }


  public TerminalDeviceMasterEntityRestriction explanation(RestrictionsString explanation) {
    
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


  public TerminalDeviceMasterEntityRestriction type(RestrictionsString type) {
    
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


  public TerminalDeviceMasterEntityRestriction elid(RestrictionsString elid) {
    
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


  public TerminalDeviceMasterEntityRestriction manufacturer(RestrictionsString manufacturer) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalDeviceMasterEntityRestriction terminalDeviceMasterEntityRestriction = (TerminalDeviceMasterEntityRestriction) o;
    return Objects.equals(this.manufacturerArticleNumber, terminalDeviceMasterEntityRestriction.manufacturerArticleNumber) &&
        Objects.equals(this.isStandard, terminalDeviceMasterEntityRestriction.isStandard) &&
        Objects.equals(this.function, terminalDeviceMasterEntityRestriction.function) &&
        Objects.equals(this.explanation, terminalDeviceMasterEntityRestriction.explanation) &&
        Objects.equals(this.type, terminalDeviceMasterEntityRestriction.type) &&
        Objects.equals(this.elid, terminalDeviceMasterEntityRestriction.elid) &&
        Objects.equals(this.manufacturer, terminalDeviceMasterEntityRestriction.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturerArticleNumber, isStandard, function, explanation, type, elid, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalDeviceMasterEntityRestriction {\n");
    sb.append("    manufacturerArticleNumber: ").append(toIndentedString(manufacturerArticleNumber)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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
