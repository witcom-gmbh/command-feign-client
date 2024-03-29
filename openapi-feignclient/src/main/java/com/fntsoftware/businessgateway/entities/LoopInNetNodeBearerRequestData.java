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
import com.fntsoftware.businessgateway.entities.LoopInNetNodeBearerLogicalPortsInRequestData;
import com.fntsoftware.businessgateway.entities.LoopInNetNodeBearerLogicalPortsOutRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LoopInNetNodeBearerRequestData
 */
@JsonPropertyOrder({
  LoopInNetNodeBearerRequestData.JSON_PROPERTY_LOGICAL_PORTS_IN,
  LoopInNetNodeBearerRequestData.JSON_PROPERTY_LOGICAL_PORTS_OUT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class LoopInNetNodeBearerRequestData {
  public static final String JSON_PROPERTY_LOGICAL_PORTS_IN = "logicalPortsIn";
  private List<LoopInNetNodeBearerLogicalPortsInRequestData> logicalPortsIn = new ArrayList<>();

  public static final String JSON_PROPERTY_LOGICAL_PORTS_OUT = "logicalPortsOut";
  private List<LoopInNetNodeBearerLogicalPortsOutRequestData> logicalPortsOut = new ArrayList<>();

  public LoopInNetNodeBearerRequestData() {
  }

  public LoopInNetNodeBearerRequestData logicalPortsIn(List<LoopInNetNodeBearerLogicalPortsInRequestData> logicalPortsIn) {
    
    this.logicalPortsIn = logicalPortsIn;
    return this;
  }

  public LoopInNetNodeBearerRequestData addLogicalPortsInItem(LoopInNetNodeBearerLogicalPortsInRequestData logicalPortsInItem) {
    if (this.logicalPortsIn == null) {
      this.logicalPortsIn = new ArrayList<>();
    }
    this.logicalPortsIn.add(logicalPortsInItem);
    return this;
  }

   /**
   * Get logicalPortsIn
   * @return logicalPortsIn
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGICAL_PORTS_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LoopInNetNodeBearerLogicalPortsInRequestData> getLogicalPortsIn() {
    return logicalPortsIn;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_PORTS_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogicalPortsIn(List<LoopInNetNodeBearerLogicalPortsInRequestData> logicalPortsIn) {
    this.logicalPortsIn = logicalPortsIn;
  }


  public LoopInNetNodeBearerRequestData logicalPortsOut(List<LoopInNetNodeBearerLogicalPortsOutRequestData> logicalPortsOut) {
    
    this.logicalPortsOut = logicalPortsOut;
    return this;
  }

  public LoopInNetNodeBearerRequestData addLogicalPortsOutItem(LoopInNetNodeBearerLogicalPortsOutRequestData logicalPortsOutItem) {
    if (this.logicalPortsOut == null) {
      this.logicalPortsOut = new ArrayList<>();
    }
    this.logicalPortsOut.add(logicalPortsOutItem);
    return this;
  }

   /**
   * Get logicalPortsOut
   * @return logicalPortsOut
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGICAL_PORTS_OUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LoopInNetNodeBearerLogicalPortsOutRequestData> getLogicalPortsOut() {
    return logicalPortsOut;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_PORTS_OUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogicalPortsOut(List<LoopInNetNodeBearerLogicalPortsOutRequestData> logicalPortsOut) {
    this.logicalPortsOut = logicalPortsOut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoopInNetNodeBearerRequestData loopInNetNodeBearerRequestData = (LoopInNetNodeBearerRequestData) o;
    return Objects.equals(this.logicalPortsIn, loopInNetNodeBearerRequestData.logicalPortsIn) &&
        Objects.equals(this.logicalPortsOut, loopInNetNodeBearerRequestData.logicalPortsOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalPortsIn, logicalPortsOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoopInNetNodeBearerRequestData {\n");
    sb.append("    logicalPortsIn: ").append(toIndentedString(logicalPortsIn)).append("\n");
    sb.append("    logicalPortsOut: ").append(toIndentedString(logicalPortsOut)).append("\n");
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

