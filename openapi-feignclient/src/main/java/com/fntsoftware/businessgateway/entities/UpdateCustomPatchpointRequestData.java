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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateCustomPatchpointRequestData
 */
@JsonPropertyOrder({
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REFERENCE_VALUE3,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REFERENCE_VALUE2,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REFERENCE_VALUE1,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REFERENCE_TYPE3,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REFERENCE_TYPE2,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REMARK,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_ID,
  UpdateCustomPatchpointRequestData.JSON_PROPERTY_REFERENCE_TYPE1
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateCustomPatchpointRequestData {
  public static final String JSON_PROPERTY_REFERENCE_VALUE3 = "referenceValue3";
  private String referenceValue3;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_REFERENCE_VALUE2 = "referenceValue2";
  private String referenceValue2;

  public static final String JSON_PROPERTY_REFERENCE_VALUE1 = "referenceValue1";
  private String referenceValue1;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_REFERENCE_TYPE3 = "referenceType3";
  private String referenceType3;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_REFERENCE_TYPE2 = "referenceType2";
  private String referenceType2;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REFERENCE_TYPE1 = "referenceType1";
  private String referenceType1;

  public UpdateCustomPatchpointRequestData() {
  }

  public UpdateCustomPatchpointRequestData referenceValue3(String referenceValue3) {
    
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

  public String getReferenceValue3() {
    return referenceValue3;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceValue3(String referenceValue3) {
    this.referenceValue3 = referenceValue3;
  }


  public UpdateCustomPatchpointRequestData sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public UpdateCustomPatchpointRequestData referenceValue2(String referenceValue2) {
    
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

  public String getReferenceValue2() {
    return referenceValue2;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceValue2(String referenceValue2) {
    this.referenceValue2 = referenceValue2;
  }


  public UpdateCustomPatchpointRequestData referenceValue1(String referenceValue1) {
    
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

  public String getReferenceValue1() {
    return referenceValue1;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VALUE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceValue1(String referenceValue1) {
    this.referenceValue1 = referenceValue1;
  }


  public UpdateCustomPatchpointRequestData sourceSystem(String sourceSystem) {
    
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Get sourceSystem
   * @return sourceSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceSystem() {
    return sourceSystem;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }


  public UpdateCustomPatchpointRequestData referenceType3(String referenceType3) {
    
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

  public String getReferenceType3() {
    return referenceType3;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType3(String referenceType3) {
    this.referenceType3 = referenceType3;
  }


  public UpdateCustomPatchpointRequestData contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public UpdateCustomPatchpointRequestData referenceType2(String referenceType2) {
    
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

  public String getReferenceType2() {
    return referenceType2;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType2(String referenceType2) {
    this.referenceType2 = referenceType2;
  }


  public UpdateCustomPatchpointRequestData remark(String remark) {
    
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

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public UpdateCustomPatchpointRequestData id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public UpdateCustomPatchpointRequestData referenceType1(String referenceType1) {
    
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

  public String getReferenceType1() {
    return referenceType1;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceType1(String referenceType1) {
    this.referenceType1 = referenceType1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomPatchpointRequestData updateCustomPatchpointRequestData = (UpdateCustomPatchpointRequestData) o;
    return Objects.equals(this.referenceValue3, updateCustomPatchpointRequestData.referenceValue3) &&
        Objects.equals(this.sourceId, updateCustomPatchpointRequestData.sourceId) &&
        Objects.equals(this.referenceValue2, updateCustomPatchpointRequestData.referenceValue2) &&
        Objects.equals(this.referenceValue1, updateCustomPatchpointRequestData.referenceValue1) &&
        Objects.equals(this.sourceSystem, updateCustomPatchpointRequestData.sourceSystem) &&
        Objects.equals(this.referenceType3, updateCustomPatchpointRequestData.referenceType3) &&
        Objects.equals(this.contextId, updateCustomPatchpointRequestData.contextId) &&
        Objects.equals(this.referenceType2, updateCustomPatchpointRequestData.referenceType2) &&
        Objects.equals(this.remark, updateCustomPatchpointRequestData.remark) &&
        Objects.equals(this.id, updateCustomPatchpointRequestData.id) &&
        Objects.equals(this.referenceType1, updateCustomPatchpointRequestData.referenceType1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceValue3, sourceId, referenceValue2, referenceValue1, sourceSystem, referenceType3, contextId, referenceType2, remark, id, referenceType1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomPatchpointRequestData {\n");
    sb.append("    referenceValue3: ").append(toIndentedString(referenceValue3)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    referenceValue2: ").append(toIndentedString(referenceValue2)).append("\n");
    sb.append("    referenceValue1: ").append(toIndentedString(referenceValue1)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    referenceType3: ").append(toIndentedString(referenceType3)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    referenceType2: ").append(toIndentedString(referenceType2)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceType1: ").append(toIndentedString(referenceType1)).append("\n");
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
