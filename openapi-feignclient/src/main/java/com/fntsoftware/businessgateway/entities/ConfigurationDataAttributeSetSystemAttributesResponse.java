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
import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetSystemAttributesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceStatusData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConfigurationDataAttributeSetSystemAttributesResponse
 */
@JsonPropertyOrder({
  ConfigurationDataAttributeSetSystemAttributesResponse.JSON_PROPERTY_RETURN_DATA,
  ConfigurationDataAttributeSetSystemAttributesResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ConfigurationDataAttributeSetSystemAttributesResponse {
  public static final String JSON_PROPERTY_RETURN_DATA = "returnData";
  private List<ConfigurationDataAttributeSetSystemAttributesResponseData> returnData;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ServiceStatusData status;

  public ConfigurationDataAttributeSetSystemAttributesResponse() {
  }

  public ConfigurationDataAttributeSetSystemAttributesResponse returnData(List<ConfigurationDataAttributeSetSystemAttributesResponseData> returnData) {
    
    this.returnData = returnData;
    return this;
  }

  public ConfigurationDataAttributeSetSystemAttributesResponse addReturnDataItem(ConfigurationDataAttributeSetSystemAttributesResponseData returnDataItem) {
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

  public List<ConfigurationDataAttributeSetSystemAttributesResponseData> getReturnData() {
    return returnData;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnData(List<ConfigurationDataAttributeSetSystemAttributesResponseData> returnData) {
    this.returnData = returnData;
  }


  public ConfigurationDataAttributeSetSystemAttributesResponse status(ServiceStatusData status) {
    
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
    ConfigurationDataAttributeSetSystemAttributesResponse configurationDataAttributeSetSystemAttributesResponse = (ConfigurationDataAttributeSetSystemAttributesResponse) o;
    return Objects.equals(this.returnData, configurationDataAttributeSetSystemAttributesResponse.returnData) &&
        Objects.equals(this.status, configurationDataAttributeSetSystemAttributesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnData, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDataAttributeSetSystemAttributesResponse {\n");
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
