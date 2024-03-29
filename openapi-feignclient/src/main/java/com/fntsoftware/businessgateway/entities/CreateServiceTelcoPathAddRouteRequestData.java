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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateServiceTelcoPathAddRouteRequestData
 */
@JsonPropertyOrder({
  CreateServiceTelcoPathAddRouteRequestData.JSON_PROPERTY_SEQUENCE_NO,
  CreateServiceTelcoPathAddRouteRequestData.JSON_PROPERTY_STRUCTURE_IDS,
  CreateServiceTelcoPathAddRouteRequestData.JSON_PROPERTY_DIRECTION,
  CreateServiceTelcoPathAddRouteRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateServiceTelcoPathAddRouteRequestData {
  public static final String JSON_PROPERTY_SEQUENCE_NO = "sequenceNo";
  private BigDecimal sequenceNo;

  public static final String JSON_PROPERTY_STRUCTURE_IDS = "structureIds";
  private String structureIds;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction;

  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public CreateServiceTelcoPathAddRouteRequestData() {
  }

  public CreateServiceTelcoPathAddRouteRequestData sequenceNo(BigDecimal sequenceNo) {
    
    this.sequenceNo = sequenceNo;
    return this;
  }

   /**
   * Get sequenceNo
   * @return sequenceNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEQUENCE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSequenceNo() {
    return sequenceNo;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequenceNo(BigDecimal sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  public CreateServiceTelcoPathAddRouteRequestData structureIds(String structureIds) {
    
    this.structureIds = structureIds;
    return this;
  }

   /**
   * Get structureIds
   * @return structureIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRUCTURE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStructureIds() {
    return structureIds;
  }


  @JsonProperty(JSON_PROPERTY_STRUCTURE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructureIds(String structureIds) {
    this.structureIds = structureIds;
  }


  public CreateServiceTelcoPathAddRouteRequestData direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  public CreateServiceTelcoPathAddRouteRequestData linkedElid(String linkedElid) {
    
    this.linkedElid = linkedElid;
    return this;
  }

   /**
   * Get linkedElid
   * @return linkedElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedElid() {
    return linkedElid;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedElid(String linkedElid) {
    this.linkedElid = linkedElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceTelcoPathAddRouteRequestData createServiceTelcoPathAddRouteRequestData = (CreateServiceTelcoPathAddRouteRequestData) o;
    return Objects.equals(this.sequenceNo, createServiceTelcoPathAddRouteRequestData.sequenceNo) &&
        Objects.equals(this.structureIds, createServiceTelcoPathAddRouteRequestData.structureIds) &&
        Objects.equals(this.direction, createServiceTelcoPathAddRouteRequestData.direction) &&
        Objects.equals(this.linkedElid, createServiceTelcoPathAddRouteRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNo, structureIds, direction, linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceTelcoPathAddRouteRequestData {\n");
    sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
    sb.append("    structureIds: ").append(toIndentedString(structureIds)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    linkedElid: ").append(toIndentedString(linkedElid)).append("\n");
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

