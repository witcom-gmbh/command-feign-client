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
 * ChangeServiceTypeBearerRequestData
 */
@JsonPropertyOrder({
  ChangeServiceTypeBearerRequestData.JSON_PROPERTY_SERVICE_TYPE_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ChangeServiceTypeBearerRequestData {
  public static final String JSON_PROPERTY_SERVICE_TYPE_ELID = "serviceTypeElid";
  private String serviceTypeElid;

  public ChangeServiceTypeBearerRequestData() {
  }

  public ChangeServiceTypeBearerRequestData serviceTypeElid(String serviceTypeElid) {
    
    this.serviceTypeElid = serviceTypeElid;
    return this;
  }

   /**
   * Get serviceTypeElid
   * @return serviceTypeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceTypeElid() {
    return serviceTypeElid;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTypeElid(String serviceTypeElid) {
    this.serviceTypeElid = serviceTypeElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeServiceTypeBearerRequestData changeServiceTypeBearerRequestData = (ChangeServiceTypeBearerRequestData) o;
    return Objects.equals(this.serviceTypeElid, changeServiceTypeBearerRequestData.serviceTypeElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceTypeElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeServiceTypeBearerRequestData {\n");
    sb.append("    serviceTypeElid: ").append(toIndentedString(serviceTypeElid)).append("\n");
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
