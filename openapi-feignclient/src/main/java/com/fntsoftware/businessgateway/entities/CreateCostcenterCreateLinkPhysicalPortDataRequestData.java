/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240226111547
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
 * CreateCostcenterCreateLinkPhysicalPortDataRequestData
 */
@JsonPropertyOrder({
  CreateCostcenterCreateLinkPhysicalPortDataRequestData.JSON_PROPERTY_PORT_IDENTIFIER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class CreateCostcenterCreateLinkPhysicalPortDataRequestData {
  public static final String JSON_PROPERTY_PORT_IDENTIFIER = "portIdentifier";
  private String portIdentifier;

  public CreateCostcenterCreateLinkPhysicalPortDataRequestData() {
  }

  public CreateCostcenterCreateLinkPhysicalPortDataRequestData portIdentifier(String portIdentifier) {
    
    this.portIdentifier = portIdentifier;
    return this;
  }

   /**
   * Get portIdentifier
   * @return portIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortIdentifier() {
    return portIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortIdentifier(String portIdentifier) {
    this.portIdentifier = portIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCostcenterCreateLinkPhysicalPortDataRequestData createCostcenterCreateLinkPhysicalPortDataRequestData = (CreateCostcenterCreateLinkPhysicalPortDataRequestData) o;
    return Objects.equals(this.portIdentifier, createCostcenterCreateLinkPhysicalPortDataRequestData.portIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCostcenterCreateLinkPhysicalPortDataRequestData {\n");
    sb.append("    portIdentifier: ").append(toIndentedString(portIdentifier)).append("\n");
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
