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
 * FusetypePowerGridInputPhase
 */
@JsonPropertyOrder({
  FusetypePowerGridInputPhase.JSON_PROPERTY_POWER_GRID_ID,
  FusetypePowerGridInputPhase.JSON_PROPERTY_POWER_GRID_ELID,
  FusetypePowerGridInputPhase.JSON_PROPERTY_ID,
  FusetypePowerGridInputPhase.JSON_PROPERTY_ELID
})
@JsonTypeName("fusetypePowerGridInputPhase")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class FusetypePowerGridInputPhase {
  public static final String JSON_PROPERTY_POWER_GRID_ID = "powerGridId";
  private String powerGridId;

  public static final String JSON_PROPERTY_POWER_GRID_ELID = "powerGridElid";
  private String powerGridElid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public FusetypePowerGridInputPhase() {
  }

  public FusetypePowerGridInputPhase powerGridId(String powerGridId) {
    
    this.powerGridId = powerGridId;
    return this;
  }

   /**
   * Get powerGridId
   * @return powerGridId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_GRID_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPowerGridId() {
    return powerGridId;
  }


  @JsonProperty(JSON_PROPERTY_POWER_GRID_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerGridId(String powerGridId) {
    this.powerGridId = powerGridId;
  }


  public FusetypePowerGridInputPhase powerGridElid(String powerGridElid) {
    
    this.powerGridElid = powerGridElid;
    return this;
  }

   /**
   * Get powerGridElid
   * @return powerGridElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_GRID_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPowerGridElid() {
    return powerGridElid;
  }


  @JsonProperty(JSON_PROPERTY_POWER_GRID_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerGridElid(String powerGridElid) {
    this.powerGridElid = powerGridElid;
  }


  public FusetypePowerGridInputPhase id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public FusetypePowerGridInputPhase elid(String elid) {
    
    this.elid = elid;
    return this;
  }

   /**
   * Get elid
   * @return elid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FusetypePowerGridInputPhase fusetypePowerGridInputPhase = (FusetypePowerGridInputPhase) o;
    return Objects.equals(this.powerGridId, fusetypePowerGridInputPhase.powerGridId) &&
        Objects.equals(this.powerGridElid, fusetypePowerGridInputPhase.powerGridElid) &&
        Objects.equals(this.id, fusetypePowerGridInputPhase.id) &&
        Objects.equals(this.elid, fusetypePowerGridInputPhase.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerGridId, powerGridElid, id, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FusetypePowerGridInputPhase {\n");
    sb.append("    powerGridId: ").append(toIndentedString(powerGridId)).append("\n");
    sb.append("    powerGridElid: ").append(toIndentedString(powerGridElid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
