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
 * UpdateSystemAttributesServerBaseDeleteGroupRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesServerBaseDeleteGroupRequestData.JSON_PROPERTY_USER_GROUP_ELID,
  UpdateSystemAttributesServerBaseDeleteGroupRequestData.JSON_PROPERTY_MANDANT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class UpdateSystemAttributesServerBaseDeleteGroupRequestData {
  public static final String JSON_PROPERTY_USER_GROUP_ELID = "userGroupElid";
  private String userGroupElid;

  public static final String JSON_PROPERTY_MANDANT_ID = "mandantId";
  private BigDecimal mandantId;

  public UpdateSystemAttributesServerBaseDeleteGroupRequestData() {
  }

  public UpdateSystemAttributesServerBaseDeleteGroupRequestData userGroupElid(String userGroupElid) {
    
    this.userGroupElid = userGroupElid;
    return this;
  }

   /**
   * Get userGroupElid
   * @return userGroupElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_GROUP_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserGroupElid() {
    return userGroupElid;
  }


  @JsonProperty(JSON_PROPERTY_USER_GROUP_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupElid(String userGroupElid) {
    this.userGroupElid = userGroupElid;
  }


  public UpdateSystemAttributesServerBaseDeleteGroupRequestData mandantId(BigDecimal mandantId) {
    
    this.mandantId = mandantId;
    return this;
  }

   /**
   * Get mandantId
   * @return mandantId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANDANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMandantId() {
    return mandantId;
  }


  @JsonProperty(JSON_PROPERTY_MANDANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandantId(BigDecimal mandantId) {
    this.mandantId = mandantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSystemAttributesServerBaseDeleteGroupRequestData updateSystemAttributesServerBaseDeleteGroupRequestData = (UpdateSystemAttributesServerBaseDeleteGroupRequestData) o;
    return Objects.equals(this.userGroupElid, updateSystemAttributesServerBaseDeleteGroupRequestData.userGroupElid) &&
        Objects.equals(this.mandantId, updateSystemAttributesServerBaseDeleteGroupRequestData.mandantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userGroupElid, mandantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesServerBaseDeleteGroupRequestData {\n");
    sb.append("    userGroupElid: ").append(toIndentedString(userGroupElid)).append("\n");
    sb.append("    mandantId: ").append(toIndentedString(mandantId)).append("\n");
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
