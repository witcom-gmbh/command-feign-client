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
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyOrganizationReassignObjectRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReassignAssignmentsPartiallyOrganizationRequestData
 */
@JsonPropertyOrder({
  ReassignAssignmentsPartiallyOrganizationRequestData.JSON_PROPERTY_TARGET_ELID,
  ReassignAssignmentsPartiallyOrganizationRequestData.JSON_PROPERTY_REASSIGN_OBJECT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ReassignAssignmentsPartiallyOrganizationRequestData {
  public static final String JSON_PROPERTY_TARGET_ELID = "targetElid";
  private String targetElid;

  public static final String JSON_PROPERTY_REASSIGN_OBJECT = "reassignObject";
  private List<ReassignAssignmentsPartiallyOrganizationReassignObjectRequestData> reassignObject = new ArrayList<>();

  public ReassignAssignmentsPartiallyOrganizationRequestData() {
  }

  public ReassignAssignmentsPartiallyOrganizationRequestData targetElid(String targetElid) {
    
    this.targetElid = targetElid;
    return this;
  }

   /**
   * Get targetElid
   * @return targetElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetElid() {
    return targetElid;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetElid(String targetElid) {
    this.targetElid = targetElid;
  }


  public ReassignAssignmentsPartiallyOrganizationRequestData reassignObject(List<ReassignAssignmentsPartiallyOrganizationReassignObjectRequestData> reassignObject) {
    
    this.reassignObject = reassignObject;
    return this;
  }

  public ReassignAssignmentsPartiallyOrganizationRequestData addReassignObjectItem(ReassignAssignmentsPartiallyOrganizationReassignObjectRequestData reassignObjectItem) {
    if (this.reassignObject == null) {
      this.reassignObject = new ArrayList<>();
    }
    this.reassignObject.add(reassignObjectItem);
    return this;
  }

   /**
   * Get reassignObject
   * @return reassignObject
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REASSIGN_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ReassignAssignmentsPartiallyOrganizationReassignObjectRequestData> getReassignObject() {
    return reassignObject;
  }


  @JsonProperty(JSON_PROPERTY_REASSIGN_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReassignObject(List<ReassignAssignmentsPartiallyOrganizationReassignObjectRequestData> reassignObject) {
    this.reassignObject = reassignObject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReassignAssignmentsPartiallyOrganizationRequestData reassignAssignmentsPartiallyOrganizationRequestData = (ReassignAssignmentsPartiallyOrganizationRequestData) o;
    return Objects.equals(this.targetElid, reassignAssignmentsPartiallyOrganizationRequestData.targetElid) &&
        Objects.equals(this.reassignObject, reassignAssignmentsPartiallyOrganizationRequestData.reassignObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetElid, reassignObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReassignAssignmentsPartiallyOrganizationRequestData {\n");
    sb.append("    targetElid: ").append(toIndentedString(targetElid)).append("\n");
    sb.append("    reassignObject: ").append(toIndentedString(reassignObject)).append("\n");
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
