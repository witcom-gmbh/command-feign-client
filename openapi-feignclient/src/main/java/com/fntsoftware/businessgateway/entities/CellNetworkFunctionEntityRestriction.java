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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CellNetworkFunctionEntityRestriction
 */
@JsonPropertyOrder({
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_NOTE,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_NAME,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_PLAN_STATUS,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_ID,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_CATEGORY,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_TYPE,
  CellNetworkFunctionEntityRestriction.JSON_PROPERTY_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CellNetworkFunctionEntityRestriction {
  public static final String JSON_PROPERTY_NOTE = "note";
  private RestrictionsString note;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private RestrictionsString planStatus;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private RestrictionsString category;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public CellNetworkFunctionEntityRestriction() {
  }

  public CellNetworkFunctionEntityRestriction note(RestrictionsString note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNote() {
    return note;
  }


  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNote(RestrictionsString note) {
    this.note = note;
  }


  public CellNetworkFunctionEntityRestriction name(RestrictionsString name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(RestrictionsString name) {
    this.name = name;
  }


  public CellNetworkFunctionEntityRestriction description(RestrictionsString description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(RestrictionsString description) {
    this.description = description;
  }


  public CellNetworkFunctionEntityRestriction planStatus(RestrictionsString planStatus) {
    
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


  public CellNetworkFunctionEntityRestriction id(RestrictionsString id) {
    
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


  public CellNetworkFunctionEntityRestriction category(RestrictionsString category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(RestrictionsString category) {
    this.category = category;
  }


  public CellNetworkFunctionEntityRestriction type(RestrictionsString type) {
    
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


  public CellNetworkFunctionEntityRestriction elid(RestrictionsString elid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellNetworkFunctionEntityRestriction cellNetworkFunctionEntityRestriction = (CellNetworkFunctionEntityRestriction) o;
    return Objects.equals(this.note, cellNetworkFunctionEntityRestriction.note) &&
        Objects.equals(this.name, cellNetworkFunctionEntityRestriction.name) &&
        Objects.equals(this.description, cellNetworkFunctionEntityRestriction.description) &&
        Objects.equals(this.planStatus, cellNetworkFunctionEntityRestriction.planStatus) &&
        Objects.equals(this.id, cellNetworkFunctionEntityRestriction.id) &&
        Objects.equals(this.category, cellNetworkFunctionEntityRestriction.category) &&
        Objects.equals(this.type, cellNetworkFunctionEntityRestriction.type) &&
        Objects.equals(this.elid, cellNetworkFunctionEntityRestriction.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, name, description, planStatus, id, category, type, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellNetworkFunctionEntityRestriction {\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
