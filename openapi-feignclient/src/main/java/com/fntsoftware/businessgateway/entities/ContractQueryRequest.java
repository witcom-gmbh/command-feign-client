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
import com.fntsoftware.businessgateway.entities.ContractQueryRestriction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContractQueryRequest
 */
@JsonPropertyOrder({
  ContractQueryRequest.JSON_PROPERTY_RETURN_ATTRIBUTES,
  ContractQueryRequest.JSON_PROPERTY_RESTRICTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ContractQueryRequest {
  public static final String JSON_PROPERTY_RETURN_ATTRIBUTES = "returnAttributes";
  private List<String> returnAttributes;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private ContractQueryRestriction restrictions;

  public ContractQueryRequest() {
  }

  public ContractQueryRequest returnAttributes(List<String> returnAttributes) {
    
    this.returnAttributes = returnAttributes;
    return this;
  }

  public ContractQueryRequest addReturnAttributesItem(String returnAttributesItem) {
    if (this.returnAttributes == null) {
      this.returnAttributes = new ArrayList<>();
    }
    this.returnAttributes.add(returnAttributesItem);
    return this;
  }

   /**
   * Get returnAttributes
   * @return returnAttributes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getReturnAttributes() {
    return returnAttributes;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnAttributes(List<String> returnAttributes) {
    this.returnAttributes = returnAttributes;
  }


  public ContractQueryRequest restrictions(ContractQueryRestriction restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContractQueryRestriction getRestrictions() {
    return restrictions;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrictions(ContractQueryRestriction restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractQueryRequest contractQueryRequest = (ContractQueryRequest) o;
    return Objects.equals(this.returnAttributes, contractQueryRequest.returnAttributes) &&
        Objects.equals(this.restrictions, contractQueryRequest.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAttributes, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractQueryRequest {\n");
    sb.append("    returnAttributes: ").append(toIndentedString(returnAttributes)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
