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
import com.fntsoftware.businessgateway.entities.CreateLinkSubdividedPortsLogicalPortAddSubdivisionsRequestData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateLinkSubdividedPortsLogicalPortRequestData
 */
@JsonPropertyOrder({
  CreateLinkSubdividedPortsLogicalPortRequestData.JSON_PROPERTY_COUNT,
  CreateLinkSubdividedPortsLogicalPortRequestData.JSON_PROPERTY_PORT_NAME_ORG,
  CreateLinkSubdividedPortsLogicalPortRequestData.JSON_PROPERTY_ADD_SUBDIVISIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateLinkSubdividedPortsLogicalPortRequestData {
  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public static final String JSON_PROPERTY_PORT_NAME_ORG = "portNameOrg";
  private String portNameOrg;

  public static final String JSON_PROPERTY_ADD_SUBDIVISIONS = "addSubdivisions";
  private List<CreateLinkSubdividedPortsLogicalPortAddSubdivisionsRequestData> addSubdivisions;

  public CreateLinkSubdividedPortsLogicalPortRequestData() {
  }

  public CreateLinkSubdividedPortsLogicalPortRequestData count(BigDecimal count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  public CreateLinkSubdividedPortsLogicalPortRequestData portNameOrg(String portNameOrg) {
    
    this.portNameOrg = portNameOrg;
    return this;
  }

   /**
   * Get portNameOrg
   * @return portNameOrg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NAME_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortNameOrg() {
    return portNameOrg;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NAME_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortNameOrg(String portNameOrg) {
    this.portNameOrg = portNameOrg;
  }


  public CreateLinkSubdividedPortsLogicalPortRequestData addSubdivisions(List<CreateLinkSubdividedPortsLogicalPortAddSubdivisionsRequestData> addSubdivisions) {
    
    this.addSubdivisions = addSubdivisions;
    return this;
  }

  public CreateLinkSubdividedPortsLogicalPortRequestData addAddSubdivisionsItem(CreateLinkSubdividedPortsLogicalPortAddSubdivisionsRequestData addSubdivisionsItem) {
    if (this.addSubdivisions == null) {
      this.addSubdivisions = new ArrayList<>();
    }
    this.addSubdivisions.add(addSubdivisionsItem);
    return this;
  }

   /**
   * Get addSubdivisions
   * @return addSubdivisions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_SUBDIVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateLinkSubdividedPortsLogicalPortAddSubdivisionsRequestData> getAddSubdivisions() {
    return addSubdivisions;
  }


  @JsonProperty(JSON_PROPERTY_ADD_SUBDIVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddSubdivisions(List<CreateLinkSubdividedPortsLogicalPortAddSubdivisionsRequestData> addSubdivisions) {
    this.addSubdivisions = addSubdivisions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkSubdividedPortsLogicalPortRequestData createLinkSubdividedPortsLogicalPortRequestData = (CreateLinkSubdividedPortsLogicalPortRequestData) o;
    return Objects.equals(this.count, createLinkSubdividedPortsLogicalPortRequestData.count) &&
        Objects.equals(this.portNameOrg, createLinkSubdividedPortsLogicalPortRequestData.portNameOrg) &&
        Objects.equals(this.addSubdivisions, createLinkSubdividedPortsLogicalPortRequestData.addSubdivisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, portNameOrg, addSubdivisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkSubdividedPortsLogicalPortRequestData {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    portNameOrg: ").append(toIndentedString(portNameOrg)).append("\n");
    sb.append("    addSubdivisions: ").append(toIndentedString(addSubdivisions)).append("\n");
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

