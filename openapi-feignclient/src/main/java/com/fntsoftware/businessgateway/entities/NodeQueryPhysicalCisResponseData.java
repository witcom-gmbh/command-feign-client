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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NodeQueryPhysicalCisResponseData
 */
@JsonPropertyOrder({
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_CAMPUS,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_STATUS_ACTION,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_ZONE_ELID,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_TYPE,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_ELID,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_BUILDING,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_ROOM,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_MANUFACTURER,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_FUNCTION,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_VISIBLE_ID,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_ID,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_LINK_ELID,
  NodeQueryPhysicalCisResponseData.JSON_PROPERTY_FLOOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class NodeQueryPhysicalCisResponseData {
  public static final String JSON_PROPERTY_CAMPUS = "campus";
  private String campus;

  public static final String JSON_PROPERTY_STATUS_ACTION = "statusAction";
  private BigDecimal statusAction;

  public static final String JSON_PROPERTY_ZONE_ELID = "zoneElid";
  private String zoneElid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_BUILDING = "building";
  private String building;

  public static final String JSON_PROPERTY_ROOM = "room";
  private String room;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public static final String JSON_PROPERTY_FLOOR = "floor";
  private String floor;

  public NodeQueryPhysicalCisResponseData() {
  }

  public NodeQueryPhysicalCisResponseData campus(String campus) {
    
    this.campus = campus;
    return this;
  }

   /**
   * Get campus
   * @return campus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampus() {
    return campus;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampus(String campus) {
    this.campus = campus;
  }


  public NodeQueryPhysicalCisResponseData statusAction(BigDecimal statusAction) {
    
    this.statusAction = statusAction;
    return this;
  }

   /**
   * Get statusAction
   * @return statusAction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStatusAction() {
    return statusAction;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusAction(BigDecimal statusAction) {
    this.statusAction = statusAction;
  }


  public NodeQueryPhysicalCisResponseData zoneElid(String zoneElid) {
    
    this.zoneElid = zoneElid;
    return this;
  }

   /**
   * Get zoneElid
   * @return zoneElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZoneElid() {
    return zoneElid;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneElid(String zoneElid) {
    this.zoneElid = zoneElid;
  }


  public NodeQueryPhysicalCisResponseData type(String type) {
    
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

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public NodeQueryPhysicalCisResponseData elid(String elid) {
    
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


  public NodeQueryPhysicalCisResponseData building(String building) {
    
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuilding() {
    return building;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilding(String building) {
    this.building = building;
  }


  public NodeQueryPhysicalCisResponseData room(String room) {
    
    this.room = room;
    return this;
  }

   /**
   * Get room
   * @return room
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoom() {
    return room;
  }


  @JsonProperty(JSON_PROPERTY_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoom(String room) {
    this.room = room;
  }


  public NodeQueryPhysicalCisResponseData manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public NodeQueryPhysicalCisResponseData function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(String function) {
    this.function = function;
  }


  public NodeQueryPhysicalCisResponseData visibleId(String visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public NodeQueryPhysicalCisResponseData id(String id) {
    
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


  public NodeQueryPhysicalCisResponseData linkElid(String linkElid) {
    
    this.linkElid = linkElid;
    return this;
  }

   /**
   * Get linkElid
   * @return linkElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(String linkElid) {
    this.linkElid = linkElid;
  }


  public NodeQueryPhysicalCisResponseData floor(String floor) {
    
    this.floor = floor;
    return this;
  }

   /**
   * Get floor
   * @return floor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFloor() {
    return floor;
  }


  @JsonProperty(JSON_PROPERTY_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloor(String floor) {
    this.floor = floor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeQueryPhysicalCisResponseData nodeQueryPhysicalCisResponseData = (NodeQueryPhysicalCisResponseData) o;
    return Objects.equals(this.campus, nodeQueryPhysicalCisResponseData.campus) &&
        Objects.equals(this.statusAction, nodeQueryPhysicalCisResponseData.statusAction) &&
        Objects.equals(this.zoneElid, nodeQueryPhysicalCisResponseData.zoneElid) &&
        Objects.equals(this.type, nodeQueryPhysicalCisResponseData.type) &&
        Objects.equals(this.elid, nodeQueryPhysicalCisResponseData.elid) &&
        Objects.equals(this.building, nodeQueryPhysicalCisResponseData.building) &&
        Objects.equals(this.room, nodeQueryPhysicalCisResponseData.room) &&
        Objects.equals(this.manufacturer, nodeQueryPhysicalCisResponseData.manufacturer) &&
        Objects.equals(this.function, nodeQueryPhysicalCisResponseData.function) &&
        Objects.equals(this.visibleId, nodeQueryPhysicalCisResponseData.visibleId) &&
        Objects.equals(this.id, nodeQueryPhysicalCisResponseData.id) &&
        Objects.equals(this.linkElid, nodeQueryPhysicalCisResponseData.linkElid) &&
        Objects.equals(this.floor, nodeQueryPhysicalCisResponseData.floor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campus, statusAction, zoneElid, type, elid, building, room, manufacturer, function, visibleId, id, linkElid, floor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeQueryPhysicalCisResponseData {\n");
    sb.append("    campus: ").append(toIndentedString(campus)).append("\n");
    sb.append("    statusAction: ").append(toIndentedString(statusAction)).append("\n");
    sb.append("    zoneElid: ").append(toIndentedString(zoneElid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
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
