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
 * QueryEditorReportsBuildingWithoutOrgResponseData
 */
@JsonPropertyOrder({
  QueryEditorReportsBuildingWithoutOrgResponseData.JSON_PROPERTY_BUILDING_NAME,
  QueryEditorReportsBuildingWithoutOrgResponseData.JSON_PROPERTY_BUILDING_REMARK,
  QueryEditorReportsBuildingWithoutOrgResponseData.JSON_PROPERTY_CAMPUS_NAME,
  QueryEditorReportsBuildingWithoutOrgResponseData.JSON_PROPERTY_NUMBER_OF_DUPLICATES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class QueryEditorReportsBuildingWithoutOrgResponseData {
  public static final String JSON_PROPERTY_BUILDING_NAME = "buildingName";
  private String buildingName;

  public static final String JSON_PROPERTY_BUILDING_REMARK = "buildingRemark";
  private String buildingRemark;

  public static final String JSON_PROPERTY_CAMPUS_NAME = "campusName";
  private String campusName;

  public static final String JSON_PROPERTY_NUMBER_OF_DUPLICATES = "numberOfDuplicates";
  private BigDecimal numberOfDuplicates;

  public QueryEditorReportsBuildingWithoutOrgResponseData() {
  }

  public QueryEditorReportsBuildingWithoutOrgResponseData buildingName(String buildingName) {
    
    this.buildingName = buildingName;
    return this;
  }

   /**
   * Get buildingName
   * @return buildingName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingName() {
    return buildingName;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public QueryEditorReportsBuildingWithoutOrgResponseData buildingRemark(String buildingRemark) {
    
    this.buildingRemark = buildingRemark;
    return this;
  }

   /**
   * Get buildingRemark
   * @return buildingRemark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingRemark() {
    return buildingRemark;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingRemark(String buildingRemark) {
    this.buildingRemark = buildingRemark;
  }


  public QueryEditorReportsBuildingWithoutOrgResponseData campusName(String campusName) {
    
    this.campusName = campusName;
    return this;
  }

   /**
   * Get campusName
   * @return campusName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampusName() {
    return campusName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampusName(String campusName) {
    this.campusName = campusName;
  }


  public QueryEditorReportsBuildingWithoutOrgResponseData numberOfDuplicates(BigDecimal numberOfDuplicates) {
    
    this.numberOfDuplicates = numberOfDuplicates;
    return this;
  }

   /**
   * Get numberOfDuplicates
   * @return numberOfDuplicates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DUPLICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberOfDuplicates() {
    return numberOfDuplicates;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DUPLICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfDuplicates(BigDecimal numberOfDuplicates) {
    this.numberOfDuplicates = numberOfDuplicates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEditorReportsBuildingWithoutOrgResponseData queryEditorReportsBuildingWithoutOrgResponseData = (QueryEditorReportsBuildingWithoutOrgResponseData) o;
    return Objects.equals(this.buildingName, queryEditorReportsBuildingWithoutOrgResponseData.buildingName) &&
        Objects.equals(this.buildingRemark, queryEditorReportsBuildingWithoutOrgResponseData.buildingRemark) &&
        Objects.equals(this.campusName, queryEditorReportsBuildingWithoutOrgResponseData.campusName) &&
        Objects.equals(this.numberOfDuplicates, queryEditorReportsBuildingWithoutOrgResponseData.numberOfDuplicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildingName, buildingRemark, campusName, numberOfDuplicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEditorReportsBuildingWithoutOrgResponseData {\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    buildingRemark: ").append(toIndentedString(buildingRemark)).append("\n");
    sb.append("    campusName: ").append(toIndentedString(campusName)).append("\n");
    sb.append("    numberOfDuplicates: ").append(toIndentedString(numberOfDuplicates)).append("\n");
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
