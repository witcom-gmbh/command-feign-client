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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateDataSocketCreateLinkVlanRequestData
 */
@JsonPropertyOrder({
  UpdateDataSocketCreateLinkVlanRequestData.JSON_PROPERTY_ASSIGNED_DIRECTLY,
  UpdateDataSocketCreateLinkVlanRequestData.JSON_PROPERTY_PORT_NUMBERS,
  UpdateDataSocketCreateLinkVlanRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class UpdateDataSocketCreateLinkVlanRequestData {
  public static final String JSON_PROPERTY_ASSIGNED_DIRECTLY = "assignedDirectly";
  private Boolean assignedDirectly;

  public static final String JSON_PROPERTY_PORT_NUMBERS = "portNumbers";
  private String portNumbers;

  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public UpdateDataSocketCreateLinkVlanRequestData() {
  }

  public UpdateDataSocketCreateLinkVlanRequestData assignedDirectly(Boolean assignedDirectly) {
    
    this.assignedDirectly = assignedDirectly;
    return this;
  }

   /**
   * Get assignedDirectly
   * @return assignedDirectly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_DIRECTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAssignedDirectly() {
    return assignedDirectly;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_DIRECTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedDirectly(Boolean assignedDirectly) {
    this.assignedDirectly = assignedDirectly;
  }


  public UpdateDataSocketCreateLinkVlanRequestData portNumbers(String portNumbers) {
    
    this.portNumbers = portNumbers;
    return this;
  }

   /**
   * Get portNumbers
   * @return portNumbers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortNumbers() {
    return portNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortNumbers(String portNumbers) {
    this.portNumbers = portNumbers;
  }


  public UpdateDataSocketCreateLinkVlanRequestData linkedElid(String linkedElid) {
    
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
    UpdateDataSocketCreateLinkVlanRequestData updateDataSocketCreateLinkVlanRequestData = (UpdateDataSocketCreateLinkVlanRequestData) o;
    return Objects.equals(this.assignedDirectly, updateDataSocketCreateLinkVlanRequestData.assignedDirectly) &&
        Objects.equals(this.portNumbers, updateDataSocketCreateLinkVlanRequestData.portNumbers) &&
        Objects.equals(this.linkedElid, updateDataSocketCreateLinkVlanRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedDirectly, portNumbers, linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataSocketCreateLinkVlanRequestData {\n");
    sb.append("    assignedDirectly: ").append(toIndentedString(assignedDirectly)).append("\n");
    sb.append("    portNumbers: ").append(toIndentedString(portNumbers)).append("\n");
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

