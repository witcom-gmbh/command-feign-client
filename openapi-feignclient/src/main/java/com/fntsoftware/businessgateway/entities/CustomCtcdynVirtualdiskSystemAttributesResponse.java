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
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdiskSystemAttributesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceStatusData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomCtcdynVirtualdiskSystemAttributesResponse
 */
@JsonPropertyOrder({
  CustomCtcdynVirtualdiskSystemAttributesResponse.JSON_PROPERTY_RETURN_DATA,
  CustomCtcdynVirtualdiskSystemAttributesResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CustomCtcdynVirtualdiskSystemAttributesResponse {
  public static final String JSON_PROPERTY_RETURN_DATA = "returnData";
  private List<CustomCtcdynVirtualdiskSystemAttributesResponseData> returnData;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ServiceStatusData status;

  public CustomCtcdynVirtualdiskSystemAttributesResponse() {
  }

  public CustomCtcdynVirtualdiskSystemAttributesResponse returnData(List<CustomCtcdynVirtualdiskSystemAttributesResponseData> returnData) {
    
    this.returnData = returnData;
    return this;
  }

  public CustomCtcdynVirtualdiskSystemAttributesResponse addReturnDataItem(CustomCtcdynVirtualdiskSystemAttributesResponseData returnDataItem) {
    if (this.returnData == null) {
      this.returnData = new ArrayList<>();
    }
    this.returnData.add(returnDataItem);
    return this;
  }

   /**
   * Get returnData
   * @return returnData
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomCtcdynVirtualdiskSystemAttributesResponseData> getReturnData() {
    return returnData;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnData(List<CustomCtcdynVirtualdiskSystemAttributesResponseData> returnData) {
    this.returnData = returnData;
  }


  public CustomCtcdynVirtualdiskSystemAttributesResponse status(ServiceStatusData status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceStatusData getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ServiceStatusData status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCtcdynVirtualdiskSystemAttributesResponse customCtcdynVirtualdiskSystemAttributesResponse = (CustomCtcdynVirtualdiskSystemAttributesResponse) o;
    return Objects.equals(this.returnData, customCtcdynVirtualdiskSystemAttributesResponse.returnData) &&
        Objects.equals(this.status, customCtcdynVirtualdiskSystemAttributesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnData, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCtcdynVirtualdiskSystemAttributesResponse {\n");
    sb.append("    returnData: ").append(toIndentedString(returnData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

