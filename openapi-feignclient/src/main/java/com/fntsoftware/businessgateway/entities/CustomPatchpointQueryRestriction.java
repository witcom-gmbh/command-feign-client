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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomPatchpointQueryRestriction
 */
@JsonPropertyOrder({
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REFERENCE_VALUE3,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REFERENCE_VALUE2,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REFERENCE_VALUE1,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REFERENCE_TYPE3,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REFERENCE_TYPE2,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REMARK,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_ID,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_REFERENCE_TYPE1,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_ELID,
  CustomPatchpointQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CustomPatchpointQueryRestriction {
  public static final String JSON_PROPERTY_REFERENCE_VALUE3 = "referenceValue3";
  private RestrictionsString referenceValue3;

  public static final String JSON_PROPERTY_REFERENCE_VALUE2 = "referenceValue2";
  private RestrictionsString referenceValue2;

  public static final String JSON_PROPERTY_REFERENCE_VALUE1 = "referenceValue1";
  private RestrictionsString referenceValue1;

  public static final String JSON_PROPERTY_REFERENCE_TYPE3 = "referenceType3";
  private RestrictionsString referenceType3;

  public static final String JSON_PROPERTY_REFERENCE_TYPE2 = "referenceType2";
  private RestrictionsString referenceType2;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_REFERENCE_TYPE1 = "referenceType1";
  private RestrictionsString referenceType1;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public CustomPatchpointQueryRestriction() {
  }

  public CustomPatchpointQueryRestriction referenceValue3(RestrictionsString referenceValue3) {
    
    this.referenceValue3 = referenceValue3;
    return this;
  }

   /**
   * Get referenceValue3
   * @return referenceValue3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferenceValue3() {
    return referenceValue3;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceValue3(RestrictionsString referenceValue3) {
    this.referenceValue3 = referenceValue3;
  }


  public CustomPatchpointQueryRestriction referenceValue2(RestrictionsString referenceValue2) {
    
    this.referenceValue2 = referenceValue2;
    return this;
  }

   /**
   * Get referenceValue2
   * @return referenceValue2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferenceValue2() {
    return referenceValue2;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceValue2(RestrictionsString referenceValue2) {
    this.referenceValue2 = referenceValue2;
  }


  public CustomPatchpointQueryRestriction referenceValue1(RestrictionsString referenceValue1) {
    
    this.referenceValue1 = referenceValue1;
    return this;
  }

   /**
   * Get referenceValue1
   * @return referenceValue1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferenceValue1() {
    return referenceValue1;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceValue1(RestrictionsString referenceValue1) {
    this.referenceValue1 = referenceValue1;
  }


  public CustomPatchpointQueryRestriction referenceType3(RestrictionsString referenceType3) {
    
    this.referenceType3 = referenceType3;
    return this;
  }

   /**
   * Get referenceType3
   * @return referenceType3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferenceType3() {
    return referenceType3;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType3(RestrictionsString referenceType3) {
    this.referenceType3 = referenceType3;
  }


  public CustomPatchpointQueryRestriction referenceType2(RestrictionsString referenceType2) {
    
    this.referenceType2 = referenceType2;
    return this;
  }

   /**
   * Get referenceType2
   * @return referenceType2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferenceType2() {
    return referenceType2;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType2(RestrictionsString referenceType2) {
    this.referenceType2 = referenceType2;
  }


  public CustomPatchpointQueryRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public CustomPatchpointQueryRestriction id(RestrictionsString id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public CustomPatchpointQueryRestriction referenceType1(RestrictionsString referenceType1) {
    
    this.referenceType1 = referenceType1;
    return this;
  }

   /**
   * Get referenceType1
   * @return referenceType1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getReferenceType1() {
    return referenceType1;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType1(RestrictionsString referenceType1) {
    this.referenceType1 = referenceType1;
  }


  public CustomPatchpointQueryRestriction elid(RestrictionsString elid) {
    
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


  public CustomPatchpointQueryRestriction first(RestrictionsNumeric first) {
    
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
    CustomPatchpointQueryRestriction customPatchpointQueryRestriction = (CustomPatchpointQueryRestriction) o;
    return Objects.equals(this.referenceValue3, customPatchpointQueryRestriction.referenceValue3) &&
        Objects.equals(this.referenceValue2, customPatchpointQueryRestriction.referenceValue2) &&
        Objects.equals(this.referenceValue1, customPatchpointQueryRestriction.referenceValue1) &&
        Objects.equals(this.referenceType3, customPatchpointQueryRestriction.referenceType3) &&
        Objects.equals(this.referenceType2, customPatchpointQueryRestriction.referenceType2) &&
        Objects.equals(this.remark, customPatchpointQueryRestriction.remark) &&
        Objects.equals(this.id, customPatchpointQueryRestriction.id) &&
        Objects.equals(this.referenceType1, customPatchpointQueryRestriction.referenceType1) &&
        Objects.equals(this.elid, customPatchpointQueryRestriction.elid) &&
        Objects.equals(this.first, customPatchpointQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceValue3, referenceValue2, referenceValue1, referenceType3, referenceType2, remark, id, referenceType1, elid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPatchpointQueryRestriction {\n");
    sb.append("    referenceValue3: ").append(toIndentedString(referenceValue3)).append("\n");
    sb.append("    referenceValue2: ").append(toIndentedString(referenceValue2)).append("\n");
    sb.append("    referenceValue1: ").append(toIndentedString(referenceValue1)).append("\n");
    sb.append("    referenceType3: ").append(toIndentedString(referenceType3)).append("\n");
    sb.append("    referenceType2: ").append(toIndentedString(referenceType2)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceType1: ").append(toIndentedString(referenceType1)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
