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
 * DeleteCassetteJunctionBoxFistRequestData
 */
@JsonPropertyOrder({
  DeleteCassetteJunctionBoxFistRequestData.JSON_PROPERTY_CASSETTE_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DeleteCassetteJunctionBoxFistRequestData {
  public static final String JSON_PROPERTY_CASSETTE_ELID = "cassetteElid";
  private String cassetteElid;

  public DeleteCassetteJunctionBoxFistRequestData() {
  }

  public DeleteCassetteJunctionBoxFistRequestData cassetteElid(String cassetteElid) {
    
    this.cassetteElid = cassetteElid;
    return this;
  }

   /**
   * Get cassetteElid
   * @return cassetteElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASSETTE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCassetteElid() {
    return cassetteElid;
  }


  @JsonProperty(JSON_PROPERTY_CASSETTE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCassetteElid(String cassetteElid) {
    this.cassetteElid = cassetteElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteCassetteJunctionBoxFistRequestData deleteCassetteJunctionBoxFistRequestData = (DeleteCassetteJunctionBoxFistRequestData) o;
    return Objects.equals(this.cassetteElid, deleteCassetteJunctionBoxFistRequestData.cassetteElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cassetteElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCassetteJunctionBoxFistRequestData {\n");
    sb.append("    cassetteElid: ").append(toIndentedString(cassetteElid)).append("\n");
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
