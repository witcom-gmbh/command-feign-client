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
 * DeleteLogicalGroupRequestData
 */
@JsonPropertyOrder({
  DeleteLogicalGroupRequestData.JSON_PROPERTY_DELETE_OPTION,
  DeleteLogicalGroupRequestData.JSON_PROPERTY_RELEASE_CONNECTIONS,
  DeleteLogicalGroupRequestData.JSON_PROPERTY_CONTEXT_ID,
  DeleteLogicalGroupRequestData.JSON_PROPERTY_RELEASE_PATCHES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DeleteLogicalGroupRequestData {
  public static final String JSON_PROPERTY_DELETE_OPTION = "deleteOption";
  private String deleteOption;

  public static final String JSON_PROPERTY_RELEASE_CONNECTIONS = "releaseConnections";
  private Boolean releaseConnections;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_RELEASE_PATCHES = "releasePatches";
  private Boolean releasePatches;

  public DeleteLogicalGroupRequestData() {
  }

  public DeleteLogicalGroupRequestData deleteOption(String deleteOption) {
    
    this.deleteOption = deleteOption;
    return this;
  }

   /**
   * Get deleteOption
   * @return deleteOption
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeleteOption() {
    return deleteOption;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOption(String deleteOption) {
    this.deleteOption = deleteOption;
  }


  public DeleteLogicalGroupRequestData releaseConnections(Boolean releaseConnections) {
    
    this.releaseConnections = releaseConnections;
    return this;
  }

   /**
   * Get releaseConnections
   * @return releaseConnections
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleaseConnections() {
    return releaseConnections;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseConnections(Boolean releaseConnections) {
    this.releaseConnections = releaseConnections;
  }


  public DeleteLogicalGroupRequestData contextId(String contextId) {
    
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


  public DeleteLogicalGroupRequestData releasePatches(Boolean releasePatches) {
    
    this.releasePatches = releasePatches;
    return this;
  }

   /**
   * Get releasePatches
   * @return releasePatches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_PATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleasePatches() {
    return releasePatches;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_PATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleasePatches(Boolean releasePatches) {
    this.releasePatches = releasePatches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteLogicalGroupRequestData deleteLogicalGroupRequestData = (DeleteLogicalGroupRequestData) o;
    return Objects.equals(this.deleteOption, deleteLogicalGroupRequestData.deleteOption) &&
        Objects.equals(this.releaseConnections, deleteLogicalGroupRequestData.releaseConnections) &&
        Objects.equals(this.contextId, deleteLogicalGroupRequestData.contextId) &&
        Objects.equals(this.releasePatches, deleteLogicalGroupRequestData.releasePatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOption, releaseConnections, contextId, releasePatches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteLogicalGroupRequestData {\n");
    sb.append("    deleteOption: ").append(toIndentedString(deleteOption)).append("\n");
    sb.append("    releaseConnections: ").append(toIndentedString(releaseConnections)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    releasePatches: ").append(toIndentedString(releasePatches)).append("\n");
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
