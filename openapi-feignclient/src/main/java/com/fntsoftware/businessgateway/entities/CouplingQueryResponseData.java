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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CouplingQueryResponseData
 */
@JsonPropertyOrder({
  CouplingQueryResponseData.JSON_PROPERTY_COORD_X,
  CouplingQueryResponseData.JSON_PROPERTY_COORD_Y,
  CouplingQueryResponseData.JSON_PROPERTY_COORD_Z,
  CouplingQueryResponseData.JSON_PROPERTY_FLOOR_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_ZONE_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_DESCRIPTION,
  CouplingQueryResponseData.JSON_PROPERTY_ID_PREFIX,
  CouplingQueryResponseData.JSON_PROPERTY_CAMPUS_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_TYPE,
  CouplingQueryResponseData.JSON_PROPERTY_BUILDING,
  CouplingQueryResponseData.JSON_PROPERTY_DIAMETER_OUT,
  CouplingQueryResponseData.JSON_PROPERTY_MANUFACTURER,
  CouplingQueryResponseData.JSON_PROPERTY_OFFSET_Z,
  CouplingQueryResponseData.JSON_PROPERTY_DIAMETER_IN,
  CouplingQueryResponseData.JSON_PROPERTY_BASELINE_Z,
  CouplingQueryResponseData.JSON_PROPERTY_ROOM_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_ID,
  CouplingQueryResponseData.JSON_PROPERTY_FLOOR,
  CouplingQueryResponseData.JSON_PROPERTY_CAMPUS,
  CouplingQueryResponseData.JSON_PROPERTY_STATUS_ACTION,
  CouplingQueryResponseData.JSON_PROPERTY_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_ROOM,
  CouplingQueryResponseData.JSON_PROPERTY_COORD_SYSTEM,
  CouplingQueryResponseData.JSON_PROPERTY_IS_STANDARD,
  CouplingQueryResponseData.JSON_PROPERTY_TYPE_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_REFERENCE_OBJECT_ELID,
  CouplingQueryResponseData.JSON_PROPERTY_VISIBLE_ID,
  CouplingQueryResponseData.JSON_PROPERTY_ZONE_STR,
  CouplingQueryResponseData.JSON_PROPERTY_BUILDING_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CouplingQueryResponseData {
  public static final String JSON_PROPERTY_COORD_X = "coordX";
  private BigDecimal coordX;

  public static final String JSON_PROPERTY_COORD_Y = "coordY";
  private BigDecimal coordY;

  public static final String JSON_PROPERTY_COORD_Z = "coordZ";
  private BigDecimal coordZ;

  public static final String JSON_PROPERTY_FLOOR_ELID = "floorElid";
  private String floorElid;

  public static final String JSON_PROPERTY_ZONE_ELID = "zoneElid";
  private String zoneElid;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private String idPrefix;

  public static final String JSON_PROPERTY_CAMPUS_ELID = "campusElid";
  private String campusElid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_BUILDING = "building";
  private String building;

  public static final String JSON_PROPERTY_DIAMETER_OUT = "diameterOut";
  private BigDecimal diameterOut;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_OFFSET_Z = "offsetZ";
  private BigDecimal offsetZ;

  public static final String JSON_PROPERTY_DIAMETER_IN = "diameterIn";
  private BigDecimal diameterIn;

  public static final String JSON_PROPERTY_BASELINE_Z = "baselineZ";
  private BigDecimal baselineZ;

  public static final String JSON_PROPERTY_ROOM_ELID = "roomElid";
  private String roomElid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_FLOOR = "floor";
  private String floor;

  public static final String JSON_PROPERTY_CAMPUS = "campus";
  private String campus;

  public static final String JSON_PROPERTY_STATUS_ACTION = "statusAction";
  private BigDecimal statusAction;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_ROOM = "room";
  private String room;

  public static final String JSON_PROPERTY_COORD_SYSTEM = "coordSystem";
  private String coordSystem;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private String isStandard;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_REFERENCE_OBJECT_ELID = "referenceObjectElid";
  private String referenceObjectElid;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ZONE_STR = "zoneStr";
  private String zoneStr;

  public static final String JSON_PROPERTY_BUILDING_ELID = "buildingElid";
  private String buildingElid;

  public CouplingQueryResponseData() {
  }

  public CouplingQueryResponseData coordX(BigDecimal coordX) {
    
    this.coordX = coordX;
    return this;
  }

   /**
   * Get coordX
   * @return coordX
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORD_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCoordX() {
    return coordX;
  }


  @JsonProperty(JSON_PROPERTY_COORD_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordX(BigDecimal coordX) {
    this.coordX = coordX;
  }


  public CouplingQueryResponseData coordY(BigDecimal coordY) {
    
    this.coordY = coordY;
    return this;
  }

   /**
   * Get coordY
   * @return coordY
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORD_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCoordY() {
    return coordY;
  }


  @JsonProperty(JSON_PROPERTY_COORD_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordY(BigDecimal coordY) {
    this.coordY = coordY;
  }


  public CouplingQueryResponseData coordZ(BigDecimal coordZ) {
    
    this.coordZ = coordZ;
    return this;
  }

   /**
   * Get coordZ
   * @return coordZ
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORD_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCoordZ() {
    return coordZ;
  }


  @JsonProperty(JSON_PROPERTY_COORD_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordZ(BigDecimal coordZ) {
    this.coordZ = coordZ;
  }


  public CouplingQueryResponseData floorElid(String floorElid) {
    
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

  public String getFloorElid() {
    return floorElid;
  }


  @JsonProperty(JSON_PROPERTY_FLOOR_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloorElid(String floorElid) {
    this.floorElid = floorElid;
  }


  public CouplingQueryResponseData zoneElid(String zoneElid) {
    
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


  public CouplingQueryResponseData description(String description) {
    
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

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CouplingQueryResponseData idPrefix(String idPrefix) {
    
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

  public String getIdPrefix() {
    return idPrefix;
  }


  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPrefix(String idPrefix) {
    this.idPrefix = idPrefix;
  }


  public CouplingQueryResponseData campusElid(String campusElid) {
    
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

  public String getCampusElid() {
    return campusElid;
  }


  @JsonProperty(JSON_PROPERTY_CAMPUS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampusElid(String campusElid) {
    this.campusElid = campusElid;
  }


  public CouplingQueryResponseData type(String type) {
    
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


  public CouplingQueryResponseData building(String building) {
    
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


  public CouplingQueryResponseData diameterOut(BigDecimal diameterOut) {
    
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

  public BigDecimal getDiameterOut() {
    return diameterOut;
  }


  @JsonProperty(JSON_PROPERTY_DIAMETER_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiameterOut(BigDecimal diameterOut) {
    this.diameterOut = diameterOut;
  }


  public CouplingQueryResponseData manufacturer(String manufacturer) {
    
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


  public CouplingQueryResponseData offsetZ(BigDecimal offsetZ) {
    
    this.offsetZ = offsetZ;
    return this;
  }

   /**
   * Get offsetZ
   * @return offsetZ
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOffsetZ() {
    return offsetZ;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffsetZ(BigDecimal offsetZ) {
    this.offsetZ = offsetZ;
  }


  public CouplingQueryResponseData diameterIn(BigDecimal diameterIn) {
    
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

  public BigDecimal getDiameterIn() {
    return diameterIn;
  }


  @JsonProperty(JSON_PROPERTY_DIAMETER_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiameterIn(BigDecimal diameterIn) {
    this.diameterIn = diameterIn;
  }


  public CouplingQueryResponseData baselineZ(BigDecimal baselineZ) {
    
    this.baselineZ = baselineZ;
    return this;
  }

   /**
   * Get baselineZ
   * @return baselineZ
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASELINE_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBaselineZ() {
    return baselineZ;
  }


  @JsonProperty(JSON_PROPERTY_BASELINE_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaselineZ(BigDecimal baselineZ) {
    this.baselineZ = baselineZ;
  }


  public CouplingQueryResponseData roomElid(String roomElid) {
    
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

  public String getRoomElid() {
    return roomElid;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomElid(String roomElid) {
    this.roomElid = roomElid;
  }


  public CouplingQueryResponseData id(String id) {
    
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


  public CouplingQueryResponseData floor(String floor) {
    
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


  public CouplingQueryResponseData campus(String campus) {
    
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


  public CouplingQueryResponseData statusAction(BigDecimal statusAction) {
    
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


  public CouplingQueryResponseData elid(String elid) {
    
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


  public CouplingQueryResponseData room(String room) {
    
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


  public CouplingQueryResponseData coordSystem(String coordSystem) {
    
    this.coordSystem = coordSystem;
    return this;
  }

   /**
   * Get coordSystem
   * @return coordSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORD_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoordSystem() {
    return coordSystem;
  }


  @JsonProperty(JSON_PROPERTY_COORD_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordSystem(String coordSystem) {
    this.coordSystem = coordSystem;
  }


  public CouplingQueryResponseData isStandard(String isStandard) {
    
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

  public String getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(String isStandard) {
    this.isStandard = isStandard;
  }


  public CouplingQueryResponseData typeElid(String typeElid) {
    
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

  public String getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(String typeElid) {
    this.typeElid = typeElid;
  }


  public CouplingQueryResponseData referenceObjectElid(String referenceObjectElid) {
    
    this.referenceObjectElid = referenceObjectElid;
    return this;
  }

   /**
   * Get referenceObjectElid
   * @return referenceObjectElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_OBJECT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceObjectElid() {
    return referenceObjectElid;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_OBJECT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceObjectElid(String referenceObjectElid) {
    this.referenceObjectElid = referenceObjectElid;
  }


  public CouplingQueryResponseData visibleId(String visibleId) {
    
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


  public CouplingQueryResponseData zoneStr(String zoneStr) {
    
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

  public String getZoneStr() {
    return zoneStr;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_STR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneStr(String zoneStr) {
    this.zoneStr = zoneStr;
  }


  public CouplingQueryResponseData buildingElid(String buildingElid) {
    
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

  public String getBuildingElid() {
    return buildingElid;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingElid(String buildingElid) {
    this.buildingElid = buildingElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouplingQueryResponseData couplingQueryResponseData = (CouplingQueryResponseData) o;
    return Objects.equals(this.coordX, couplingQueryResponseData.coordX) &&
        Objects.equals(this.coordY, couplingQueryResponseData.coordY) &&
        Objects.equals(this.coordZ, couplingQueryResponseData.coordZ) &&
        Objects.equals(this.floorElid, couplingQueryResponseData.floorElid) &&
        Objects.equals(this.zoneElid, couplingQueryResponseData.zoneElid) &&
        Objects.equals(this.description, couplingQueryResponseData.description) &&
        Objects.equals(this.idPrefix, couplingQueryResponseData.idPrefix) &&
        Objects.equals(this.campusElid, couplingQueryResponseData.campusElid) &&
        Objects.equals(this.type, couplingQueryResponseData.type) &&
        Objects.equals(this.building, couplingQueryResponseData.building) &&
        Objects.equals(this.diameterOut, couplingQueryResponseData.diameterOut) &&
        Objects.equals(this.manufacturer, couplingQueryResponseData.manufacturer) &&
        Objects.equals(this.offsetZ, couplingQueryResponseData.offsetZ) &&
        Objects.equals(this.diameterIn, couplingQueryResponseData.diameterIn) &&
        Objects.equals(this.baselineZ, couplingQueryResponseData.baselineZ) &&
        Objects.equals(this.roomElid, couplingQueryResponseData.roomElid) &&
        Objects.equals(this.id, couplingQueryResponseData.id) &&
        Objects.equals(this.floor, couplingQueryResponseData.floor) &&
        Objects.equals(this.campus, couplingQueryResponseData.campus) &&
        Objects.equals(this.statusAction, couplingQueryResponseData.statusAction) &&
        Objects.equals(this.elid, couplingQueryResponseData.elid) &&
        Objects.equals(this.room, couplingQueryResponseData.room) &&
        Objects.equals(this.coordSystem, couplingQueryResponseData.coordSystem) &&
        Objects.equals(this.isStandard, couplingQueryResponseData.isStandard) &&
        Objects.equals(this.typeElid, couplingQueryResponseData.typeElid) &&
        Objects.equals(this.referenceObjectElid, couplingQueryResponseData.referenceObjectElid) &&
        Objects.equals(this.visibleId, couplingQueryResponseData.visibleId) &&
        Objects.equals(this.zoneStr, couplingQueryResponseData.zoneStr) &&
        Objects.equals(this.buildingElid, couplingQueryResponseData.buildingElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordX, coordY, coordZ, floorElid, zoneElid, description, idPrefix, campusElid, type, building, diameterOut, manufacturer, offsetZ, diameterIn, baselineZ, roomElid, id, floor, campus, statusAction, elid, room, coordSystem, isStandard, typeElid, referenceObjectElid, visibleId, zoneStr, buildingElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouplingQueryResponseData {\n");
    sb.append("    coordX: ").append(toIndentedString(coordX)).append("\n");
    sb.append("    coordY: ").append(toIndentedString(coordY)).append("\n");
    sb.append("    coordZ: ").append(toIndentedString(coordZ)).append("\n");
    sb.append("    floorElid: ").append(toIndentedString(floorElid)).append("\n");
    sb.append("    zoneElid: ").append(toIndentedString(zoneElid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    campusElid: ").append(toIndentedString(campusElid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    diameterOut: ").append(toIndentedString(diameterOut)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    offsetZ: ").append(toIndentedString(offsetZ)).append("\n");
    sb.append("    diameterIn: ").append(toIndentedString(diameterIn)).append("\n");
    sb.append("    baselineZ: ").append(toIndentedString(baselineZ)).append("\n");
    sb.append("    roomElid: ").append(toIndentedString(roomElid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    campus: ").append(toIndentedString(campus)).append("\n");
    sb.append("    statusAction: ").append(toIndentedString(statusAction)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    coordSystem: ").append(toIndentedString(coordSystem)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    referenceObjectElid: ").append(toIndentedString(referenceObjectElid)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    zoneStr: ").append(toIndentedString(zoneStr)).append("\n");
    sb.append("    buildingElid: ").append(toIndentedString(buildingElid)).append("\n");
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
