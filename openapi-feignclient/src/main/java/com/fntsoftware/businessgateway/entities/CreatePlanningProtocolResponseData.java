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
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreatePlanningProtocolResponseData
 */
@JsonPropertyOrder({
  CreatePlanningProtocolResponseData.JSON_PROPERTY_PLAN_ID,
  CreatePlanningProtocolResponseData.JSON_PROPERTY_ELID,
  CreatePlanningProtocolResponseData.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreatePlanningProtocolResponseData {
  public static final String JSON_PROPERTY_PLAN_ID = "planId";
  private BigDecimal planId;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private DateTime timestamp;

  public CreatePlanningProtocolResponseData() {
  }

  public CreatePlanningProtocolResponseData planId(BigDecimal planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanId(BigDecimal planId) {
    this.planId = planId;
  }


  public CreatePlanningProtocolResponseData elid(String elid) {
    
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


  public CreatePlanningProtocolResponseData timestamp(DateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlanningProtocolResponseData createPlanningProtocolResponseData = (CreatePlanningProtocolResponseData) o;
    return Objects.equals(this.planId, createPlanningProtocolResponseData.planId) &&
        Objects.equals(this.elid, createPlanningProtocolResponseData.elid) &&
        Objects.equals(this.timestamp, createPlanningProtocolResponseData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, elid, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlanningProtocolResponseData {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
