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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PowerRailQueryRestriction
 */
@JsonPropertyOrder({
  PowerRailQueryRestriction.JSON_PROPERTY_FIELD,
  PowerRailQueryRestriction.JSON_PROPERTY_LEAVING_NUMBERING_SCHEME,
  PowerRailQueryRestriction.JSON_PROPERTY_TAP_OFF_UNIT_LEAVING,
  PowerRailQueryRestriction.JSON_PROPERTY_CABINET_ELID,
  PowerRailQueryRestriction.JSON_PROPERTY_PLAN_STATUS,
  PowerRailQueryRestriction.JSON_PROPERTY_TAP_OFF_UNIT,
  PowerRailQueryRestriction.JSON_PROPERTY_ID,
  PowerRailQueryRestriction.JSON_PROPERTY_POSITION,
  PowerRailQueryRestriction.JSON_PROPERTY_LEAVING,
  PowerRailQueryRestriction.JSON_PROPERTY_TYPE,
  PowerRailQueryRestriction.JSON_PROPERTY_ELID,
  PowerRailQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class PowerRailQueryRestriction {
  public static final String JSON_PROPERTY_FIELD = "field";
  private RestrictionsNumeric field;

  public static final String JSON_PROPERTY_LEAVING_NUMBERING_SCHEME = "leavingNumberingScheme";
  private RestrictionsString leavingNumberingScheme;

  public static final String JSON_PROPERTY_TAP_OFF_UNIT_LEAVING = "tapOffUnitLeaving";
  private RestrictionsNumeric tapOffUnitLeaving;

  public static final String JSON_PROPERTY_CABINET_ELID = "cabinetElid";
  private RestrictionsString cabinetElid;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private RestrictionsString planStatus;

  public static final String JSON_PROPERTY_TAP_OFF_UNIT = "tapOffUnit";
  private RestrictionsNumeric tapOffUnit;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_POSITION = "position";
  private RestrictionsNumeric position;

  public static final String JSON_PROPERTY_LEAVING = "leaving";
  private RestrictionsNumeric leaving;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public PowerRailQueryRestriction() {
  }

  public PowerRailQueryRestriction field(RestrictionsNumeric field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(RestrictionsNumeric field) {
    this.field = field;
  }


  public PowerRailQueryRestriction leavingNumberingScheme(RestrictionsString leavingNumberingScheme) {
    
    this.leavingNumberingScheme = leavingNumberingScheme;
    return this;
  }

   /**
   * Get leavingNumberingScheme
   * @return leavingNumberingScheme
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEAVING_NUMBERING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLeavingNumberingScheme() {
    return leavingNumberingScheme;
  }


  @JsonProperty(JSON_PROPERTY_LEAVING_NUMBERING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeavingNumberingScheme(RestrictionsString leavingNumberingScheme) {
    this.leavingNumberingScheme = leavingNumberingScheme;
  }


  public PowerRailQueryRestriction tapOffUnitLeaving(RestrictionsNumeric tapOffUnitLeaving) {
    
    this.tapOffUnitLeaving = tapOffUnitLeaving;
    return this;
  }

   /**
   * Get tapOffUnitLeaving
   * @return tapOffUnitLeaving
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAP_OFF_UNIT_LEAVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getTapOffUnitLeaving() {
    return tapOffUnitLeaving;
  }


  @JsonProperty(JSON_PROPERTY_TAP_OFF_UNIT_LEAVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTapOffUnitLeaving(RestrictionsNumeric tapOffUnitLeaving) {
    this.tapOffUnitLeaving = tapOffUnitLeaving;
  }


  public PowerRailQueryRestriction cabinetElid(RestrictionsString cabinetElid) {
    
    this.cabinetElid = cabinetElid;
    return this;
  }

   /**
   * Get cabinetElid
   * @return cabinetElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABINET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getCabinetElid() {
    return cabinetElid;
  }


  @JsonProperty(JSON_PROPERTY_CABINET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCabinetElid(RestrictionsString cabinetElid) {
    this.cabinetElid = cabinetElid;
  }


  public PowerRailQueryRestriction planStatus(RestrictionsString planStatus) {
    
    this.planStatus = planStatus;
    return this;
  }

   /**
   * Get planStatus
   * @return planStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPlanStatus() {
    return planStatus;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanStatus(RestrictionsString planStatus) {
    this.planStatus = planStatus;
  }


  public PowerRailQueryRestriction tapOffUnit(RestrictionsNumeric tapOffUnit) {
    
    this.tapOffUnit = tapOffUnit;
    return this;
  }

   /**
   * Get tapOffUnit
   * @return tapOffUnit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAP_OFF_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getTapOffUnit() {
    return tapOffUnit;
  }


  @JsonProperty(JSON_PROPERTY_TAP_OFF_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTapOffUnit(RestrictionsNumeric tapOffUnit) {
    this.tapOffUnit = tapOffUnit;
  }


  public PowerRailQueryRestriction id(RestrictionsString id) {
    
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

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public PowerRailQueryRestriction position(RestrictionsNumeric position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(RestrictionsNumeric position) {
    this.position = position;
  }


  public PowerRailQueryRestriction leaving(RestrictionsNumeric leaving) {
    
    this.leaving = leaving;
    return this;
  }

   /**
   * Get leaving
   * @return leaving
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEAVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getLeaving() {
    return leaving;
  }


  @JsonProperty(JSON_PROPERTY_LEAVING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeaving(RestrictionsNumeric leaving) {
    this.leaving = leaving;
  }


  public PowerRailQueryRestriction type(RestrictionsString type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RestrictionsString type) {
    this.type = type;
  }


  public PowerRailQueryRestriction elid(RestrictionsString elid) {
    
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

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public PowerRailQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerRailQueryRestriction powerRailQueryRestriction = (PowerRailQueryRestriction) o;
    return Objects.equals(this.field, powerRailQueryRestriction.field) &&
        Objects.equals(this.leavingNumberingScheme, powerRailQueryRestriction.leavingNumberingScheme) &&
        Objects.equals(this.tapOffUnitLeaving, powerRailQueryRestriction.tapOffUnitLeaving) &&
        Objects.equals(this.cabinetElid, powerRailQueryRestriction.cabinetElid) &&
        Objects.equals(this.planStatus, powerRailQueryRestriction.planStatus) &&
        Objects.equals(this.tapOffUnit, powerRailQueryRestriction.tapOffUnit) &&
        Objects.equals(this.id, powerRailQueryRestriction.id) &&
        Objects.equals(this.position, powerRailQueryRestriction.position) &&
        Objects.equals(this.leaving, powerRailQueryRestriction.leaving) &&
        Objects.equals(this.type, powerRailQueryRestriction.type) &&
        Objects.equals(this.elid, powerRailQueryRestriction.elid) &&
        Objects.equals(this.first, powerRailQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, leavingNumberingScheme, tapOffUnitLeaving, cabinetElid, planStatus, tapOffUnit, id, position, leaving, type, elid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerRailQueryRestriction {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    leavingNumberingScheme: ").append(toIndentedString(leavingNumberingScheme)).append("\n");
    sb.append("    tapOffUnitLeaving: ").append(toIndentedString(tapOffUnitLeaving)).append("\n");
    sb.append("    cabinetElid: ").append(toIndentedString(cabinetElid)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    tapOffUnit: ").append(toIndentedString(tapOffUnit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    leaving: ").append(toIndentedString(leaving)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
