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
 * CouplingQueryRestriction
 */
@JsonPropertyOrder({
  CouplingQueryRestriction.JSON_PROPERTY_FLOOR_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_ZONE_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_DESCRIPTION,
  CouplingQueryRestriction.JSON_PROPERTY_ELID_LIST,
  CouplingQueryRestriction.JSON_PROPERTY_ID_PREFIX,
  CouplingQueryRestriction.JSON_PROPERTY_CAMPUS_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_TYPE,
  CouplingQueryRestriction.JSON_PROPERTY_BUILDING,
  CouplingQueryRestriction.JSON_PROPERTY_DIAMETER_OUT,
  CouplingQueryRestriction.JSON_PROPERTY_MANUFACTURER,
  CouplingQueryRestriction.JSON_PROPERTY_DIAMETER_IN,
  CouplingQueryRestriction.JSON_PROPERTY_ROOM_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_ID,
  CouplingQueryRestriction.JSON_PROPERTY_FLOOR,
  CouplingQueryRestriction.JSON_PROPERTY_CAMPUS,
  CouplingQueryRestriction.JSON_PROPERTY_STATUS_ACTION,
  CouplingQueryRestriction.JSON_PROPERTY_DUCT_TYPE_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_ROOM,
  CouplingQueryRestriction.JSON_PROPERTY_IS_STANDARD,
  CouplingQueryRestriction.JSON_PROPERTY_DUCT_TYPE,
  CouplingQueryRestriction.JSON_PROPERTY_TYPE_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_DUCT_ID,
  CouplingQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  CouplingQueryRestriction.JSON_PROPERTY_ZONE_STR,
  CouplingQueryRestriction.JSON_PROPERTY_BUILDING_ELID,
  CouplingQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CouplingQueryRestriction {
  public static final String JSON_PROPERTY_FLOOR_ELID = "floorElid";
  private RestrictionsString floorElid;

  public static final String JSON_PROPERTY_ZONE_ELID = "zoneElid";
  private RestrictionsString zoneElid;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_ELID_LIST = "elidList";
  private RestrictionsString elidList;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private RestrictionsString idPrefix;

  public static final String JSON_PROPERTY_CAMPUS_ELID = "campusElid";
  private RestrictionsString campusElid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_BUILDING = "building";
  private RestrictionsString building;

  public static final String JSON_PROPERTY_DIAMETER_OUT = "diameterOut";
  private RestrictionsNumeric diameterOut;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public static final String JSON_PROPERTY_DIAMETER_IN = "diameterIn";
  private RestrictionsNumeric diameterIn;

  public static final String JSON_PROPERTY_ROOM_ELID = "roomElid";
  private RestrictionsString roomElid;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_FLOOR = "floor";
  private RestrictionsString floor;

  public static final String JSON_PROPERTY_CAMPUS = "campus";
  private RestrictionsString campus;

  public static final String JSON_PROPERTY_STATUS_ACTION = "statusAction";
  private RestrictionsNumeric statusAction;

  public static final String JSON_PROPERTY_DUCT_TYPE_ELID = "ductTypeElid";
  private RestrictionsString ductTypeElid;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_ROOM = "room";
  private RestrictionsString room;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private RestrictionsString isStandard;

  public static final String JSON_PROPERTY_DUCT_TYPE = "ductType";
  private RestrictionsString ductType;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_DUCT_ID = "ductId";
  private RestrictionsString ductId;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ZONE_STR = "zoneStr";
  private RestrictionsString zoneStr;

  public static final String JSON_PROPERTY_BUILDING_ELID = "buildingElid";
  private RestrictionsString buildingElid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public CouplingQueryRestriction() {
  }

  public CouplingQueryRestriction floorElid(RestrictionsString floorElid) {
    
    this.floorElid = floorElid;
    return this;
  }

   /**
   * Get floorElid
   * @return floorElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOOR_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFloorElid() {
    return floorElid;
  }


  @JsonProperty(JSON_PROPERTY_FLOOR_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloorElid(RestrictionsString floorElid) {
    this.floorElid = floorElid;
  }


  public CouplingQueryRestriction zoneElid(RestrictionsString zoneElid) {
    
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

  public RestrictionsString getZoneElid() {
    return zoneElid;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneElid(RestrictionsString zoneElid) {
    this.zoneElid = zoneElid;
  }


  public CouplingQueryRestriction description(RestrictionsString description) {
    
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


  public CouplingQueryRestriction elidList(RestrictionsString elidList) {
    
    this.elidList = elidList;
    return this;
  }

   /**
   * Get elidList
   * @return elidList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getElidList() {
    return elidList;
  }


  @JsonProperty(JSON_PROPERTY_ELID_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElidList(RestrictionsString elidList) {
    this.elidList = elidList;
  }


  public CouplingQueryRestriction idPrefix(RestrictionsString idPrefix) {
    
    this.idPrefix = idPrefix;
    return this;
  }

   /**
   * Get idPrefix
   * @return idPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIdPrefix() {
    return idPrefix;
  }


  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPrefix(RestrictionsString idPrefix) {
    this.idPrefix = idPrefix;
  }


  public CouplingQueryRestriction campusElid(RestrictionsString campusElid) {
    
    this.campusElid = campusElid;
    return this;
  }

   /**
   * Get campusElid
   * @return campusElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPUS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getCampusElid() {
    return campusElid;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampusElid(RestrictionsString campusElid) {
    this.campusElid = campusElid;
  }


  public CouplingQueryRestriction type(RestrictionsString type) {
    
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


  public CouplingQueryRestriction building(RestrictionsString building) {
    
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

  public RestrictionsString getBuilding() {
    return building;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilding(RestrictionsString building) {
    this.building = building;
  }


  public CouplingQueryRestriction diameterOut(RestrictionsNumeric diameterOut) {
    
    this.diameterOut = diameterOut;
    return this;
  }

   /**
   * Get diameterOut
   * @return diameterOut
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAMETER_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDiameterOut() {
    return diameterOut;
  }


  @JsonProperty(JSON_PROPERTY_DIAMETER_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiameterOut(RestrictionsNumeric diameterOut) {
    this.diameterOut = diameterOut;
  }


  public CouplingQueryRestriction manufacturer(RestrictionsString manufacturer) {
    
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

  public RestrictionsString getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(RestrictionsString manufacturer) {
    this.manufacturer = manufacturer;
  }


  public CouplingQueryRestriction diameterIn(RestrictionsNumeric diameterIn) {
    
    this.diameterIn = diameterIn;
    return this;
  }

   /**
   * Get diameterIn
   * @return diameterIn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAMETER_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getDiameterIn() {
    return diameterIn;
  }


  @JsonProperty(JSON_PROPERTY_DIAMETER_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiameterIn(RestrictionsNumeric diameterIn) {
    this.diameterIn = diameterIn;
  }


  public CouplingQueryRestriction roomElid(RestrictionsString roomElid) {
    
    this.roomElid = roomElid;
    return this;
  }

   /**
   * Get roomElid
   * @return roomElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOM_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRoomElid() {
    return roomElid;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomElid(RestrictionsString roomElid) {
    this.roomElid = roomElid;
  }


  public CouplingQueryRestriction id(RestrictionsString id) {
    
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


  public CouplingQueryRestriction floor(RestrictionsString floor) {
    
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

  public RestrictionsString getFloor() {
    return floor;
  }


  @JsonProperty(JSON_PROPERTY_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloor(RestrictionsString floor) {
    this.floor = floor;
  }


  public CouplingQueryRestriction campus(RestrictionsString campus) {
    
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

  public RestrictionsString getCampus() {
    return campus;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampus(RestrictionsString campus) {
    this.campus = campus;
  }


  public CouplingQueryRestriction statusAction(RestrictionsNumeric statusAction) {
    
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

  public RestrictionsNumeric getStatusAction() {
    return statusAction;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusAction(RestrictionsNumeric statusAction) {
    this.statusAction = statusAction;
  }


  public CouplingQueryRestriction ductTypeElid(RestrictionsString ductTypeElid) {
    
    this.ductTypeElid = ductTypeElid;
    return this;
  }

   /**
   * Get ductTypeElid
   * @return ductTypeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUCT_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDuctTypeElid() {
    return ductTypeElid;
  }


  @JsonProperty(JSON_PROPERTY_DUCT_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuctTypeElid(RestrictionsString ductTypeElid) {
    this.ductTypeElid = ductTypeElid;
  }


  public CouplingQueryRestriction elid(RestrictionsString elid) {
    
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


  public CouplingQueryRestriction room(RestrictionsString room) {
    
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

  public RestrictionsString getRoom() {
    return room;
  }


  @JsonProperty(JSON_PROPERTY_ROOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoom(RestrictionsString room) {
    this.room = room;
  }


  public CouplingQueryRestriction isStandard(RestrictionsString isStandard) {
    
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Get isStandard
   * @return isStandard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(RestrictionsString isStandard) {
    this.isStandard = isStandard;
  }


  public CouplingQueryRestriction ductType(RestrictionsString ductType) {
    
    this.ductType = ductType;
    return this;
  }

   /**
   * Get ductType
   * @return ductType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDuctType() {
    return ductType;
  }


  @JsonProperty(JSON_PROPERTY_DUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuctType(RestrictionsString ductType) {
    this.ductType = ductType;
  }


  public CouplingQueryRestriction typeElid(RestrictionsString typeElid) {
    
    this.typeElid = typeElid;
    return this;
  }

   /**
   * Get typeElid
   * @return typeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(RestrictionsString typeElid) {
    this.typeElid = typeElid;
  }


  public CouplingQueryRestriction ductId(RestrictionsString ductId) {
    
    this.ductId = ductId;
    return this;
  }

   /**
   * Get ductId
   * @return ductId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDuctId() {
    return ductId;
  }


  @JsonProperty(JSON_PROPERTY_DUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuctId(RestrictionsString ductId) {
    this.ductId = ductId;
  }


  public CouplingQueryRestriction visibleId(RestrictionsString visibleId) {
    
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

  public RestrictionsString getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(RestrictionsString visibleId) {
    this.visibleId = visibleId;
  }


  public CouplingQueryRestriction zoneStr(RestrictionsString zoneStr) {
    
    this.zoneStr = zoneStr;
    return this;
  }

   /**
   * Get zoneStr
   * @return zoneStr
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONE_STR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getZoneStr() {
    return zoneStr;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_STR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneStr(RestrictionsString zoneStr) {
    this.zoneStr = zoneStr;
  }


  public CouplingQueryRestriction buildingElid(RestrictionsString buildingElid) {
    
    this.buildingElid = buildingElid;
    return this;
  }

   /**
   * Get buildingElid
   * @return buildingElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getBuildingElid() {
    return buildingElid;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingElid(RestrictionsString buildingElid) {
    this.buildingElid = buildingElid;
  }


  public CouplingQueryRestriction first(RestrictionsNumeric first) {
    
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
    CouplingQueryRestriction couplingQueryRestriction = (CouplingQueryRestriction) o;
    return Objects.equals(this.floorElid, couplingQueryRestriction.floorElid) &&
        Objects.equals(this.zoneElid, couplingQueryRestriction.zoneElid) &&
        Objects.equals(this.description, couplingQueryRestriction.description) &&
        Objects.equals(this.elidList, couplingQueryRestriction.elidList) &&
        Objects.equals(this.idPrefix, couplingQueryRestriction.idPrefix) &&
        Objects.equals(this.campusElid, couplingQueryRestriction.campusElid) &&
        Objects.equals(this.type, couplingQueryRestriction.type) &&
        Objects.equals(this.building, couplingQueryRestriction.building) &&
        Objects.equals(this.diameterOut, couplingQueryRestriction.diameterOut) &&
        Objects.equals(this.manufacturer, couplingQueryRestriction.manufacturer) &&
        Objects.equals(this.diameterIn, couplingQueryRestriction.diameterIn) &&
        Objects.equals(this.roomElid, couplingQueryRestriction.roomElid) &&
        Objects.equals(this.id, couplingQueryRestriction.id) &&
        Objects.equals(this.floor, couplingQueryRestriction.floor) &&
        Objects.equals(this.campus, couplingQueryRestriction.campus) &&
        Objects.equals(this.statusAction, couplingQueryRestriction.statusAction) &&
        Objects.equals(this.ductTypeElid, couplingQueryRestriction.ductTypeElid) &&
        Objects.equals(this.elid, couplingQueryRestriction.elid) &&
        Objects.equals(this.room, couplingQueryRestriction.room) &&
        Objects.equals(this.isStandard, couplingQueryRestriction.isStandard) &&
        Objects.equals(this.ductType, couplingQueryRestriction.ductType) &&
        Objects.equals(this.typeElid, couplingQueryRestriction.typeElid) &&
        Objects.equals(this.ductId, couplingQueryRestriction.ductId) &&
        Objects.equals(this.visibleId, couplingQueryRestriction.visibleId) &&
        Objects.equals(this.zoneStr, couplingQueryRestriction.zoneStr) &&
        Objects.equals(this.buildingElid, couplingQueryRestriction.buildingElid) &&
        Objects.equals(this.first, couplingQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floorElid, zoneElid, description, elidList, idPrefix, campusElid, type, building, diameterOut, manufacturer, diameterIn, roomElid, id, floor, campus, statusAction, ductTypeElid, elid, room, isStandard, ductType, typeElid, ductId, visibleId, zoneStr, buildingElid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouplingQueryRestriction {\n");
    sb.append("    floorElid: ").append(toIndentedString(floorElid)).append("\n");
    sb.append("    zoneElid: ").append(toIndentedString(zoneElid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    elidList: ").append(toIndentedString(elidList)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    campusElid: ").append(toIndentedString(campusElid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    diameterOut: ").append(toIndentedString(diameterOut)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    diameterIn: ").append(toIndentedString(diameterIn)).append("\n");
    sb.append("    roomElid: ").append(toIndentedString(roomElid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    campus: ").append(toIndentedString(campus)).append("\n");
    sb.append("    statusAction: ").append(toIndentedString(statusAction)).append("\n");
    sb.append("    ductTypeElid: ").append(toIndentedString(ductTypeElid)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    ductType: ").append(toIndentedString(ductType)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    ductId: ").append(toIndentedString(ductId)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    zoneStr: ").append(toIndentedString(zoneStr)).append("\n");
    sb.append("    buildingElid: ").append(toIndentedString(buildingElid)).append("\n");
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
