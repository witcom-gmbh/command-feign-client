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
import com.fntsoftware.businessgateway.entities.MoveTopzoneCreateLinkTopzoneParentRequestData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MoveTopzoneRequestData
 */
@JsonPropertyOrder({
  MoveTopzoneRequestData.JSON_PROPERTY_CREATE_LINK_TOPZONE_PARENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class MoveTopzoneRequestData {
  public static final String JSON_PROPERTY_CREATE_LINK_TOPZONE_PARENT = "createLinkTopzoneParent";
  private MoveTopzoneCreateLinkTopzoneParentRequestData createLinkTopzoneParent;

  public MoveTopzoneRequestData() {
  }

  public MoveTopzoneRequestData createLinkTopzoneParent(MoveTopzoneCreateLinkTopzoneParentRequestData createLinkTopzoneParent) {
    
    this.createLinkTopzoneParent = createLinkTopzoneParent;
    return this;
  }

   /**
   * Get createLinkTopzoneParent
   * @return createLinkTopzoneParent
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_TOPZONE_PARENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MoveTopzoneCreateLinkTopzoneParentRequestData getCreateLinkTopzoneParent() {
    return createLinkTopzoneParent;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_TOPZONE_PARENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkTopzoneParent(MoveTopzoneCreateLinkTopzoneParentRequestData createLinkTopzoneParent) {
    this.createLinkTopzoneParent = createLinkTopzoneParent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveTopzoneRequestData moveTopzoneRequestData = (MoveTopzoneRequestData) o;
    return Objects.equals(this.createLinkTopzoneParent, moveTopzoneRequestData.createLinkTopzoneParent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createLinkTopzoneParent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveTopzoneRequestData {\n");
    sb.append("    createLinkTopzoneParent: ").append(toIndentedString(createLinkTopzoneParent)).append("\n");
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
