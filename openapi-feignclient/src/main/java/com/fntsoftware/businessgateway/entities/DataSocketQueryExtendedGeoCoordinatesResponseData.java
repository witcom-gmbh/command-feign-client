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
 * DataSocketQueryExtendedGeoCoordinatesResponseData
 */
@JsonPropertyOrder({
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_COORD_X,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_COORD_Y,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_COORD_Z,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_FLOOR_ELID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_ZONE_ELID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_PLAN_STATUS,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_CAMPUS_ELID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_ENTITY_ID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_EXPLANATION,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_TYPE,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_COORD_SYSTEM,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_MANUFACTURER,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_OFFSET_Z,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_REFERENCE_OBJECT_ELID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_FUNCTION,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_BASELINE_Z,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_ROOM_ELID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_TARGET_SUB_ENTITY,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_VISIBLE_ID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_ID,
  DataSocketQueryExtendedGeoCoordinatesResponseData.JSON_PROPERTY_BUILDING_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DataSocketQueryExtendedGeoCoordinatesResponseData {
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

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private String planStatus;

  public static final String JSON_PROPERTY_CAMPUS_ELID = "campusElid";
  private String campusElid;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_COORD_SYSTEM = "coordSystem";
  private String coordSystem;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_OFFSET_Z = "offsetZ";
  private BigDecimal offsetZ;

  public static final String JSON_PROPERTY_REFERENCE_OBJECT_ELID = "referenceObjectElid";
  private String referenceObjectElid;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_BASELINE_Z = "baselineZ";
  private BigDecimal baselineZ;

  public static final String JSON_PROPERTY_ROOM_ELID = "roomElid";
  private String roomElid;

  public static final String JSON_PROPERTY_TARGET_SUB_ENTITY = "targetSubEntity";
  private String targetSubEntity;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_BUILDING_ELID = "buildingElid";
  private String buildingElid;

  public DataSocketQueryExtendedGeoCoordinatesResponseData() {
  }

  public DataSocketQueryExtendedGeoCoordinatesResponseData coordX(BigDecimal coordX) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData coordY(BigDecimal coordY) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData coordZ(BigDecimal coordZ) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData floorElid(String floorElid) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData zoneElid(String zoneElid) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData planStatus(String planStatus) {
    
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

  public String getPlanStatus() {
    return planStatus;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanStatus(String planStatus) {
    this.planStatus = planStatus;
  }


  public DataSocketQueryExtendedGeoCoordinatesResponseData campusElid(String campusElid) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public DataSocketQueryExtendedGeoCoordinatesResponseData explanation(String explanation) {
    
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExplanation() {
    return explanation;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  public DataSocketQueryExtendedGeoCoordinatesResponseData type(String type) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData coordSystem(String coordSystem) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData manufacturer(String manufacturer) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData offsetZ(BigDecimal offsetZ) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData referenceObjectElid(String referenceObjectElid) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData function(String function) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData baselineZ(BigDecimal baselineZ) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData roomElid(String roomElid) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData targetSubEntity(String targetSubEntity) {
    
    this.targetSubEntity = targetSubEntity;
    return this;
  }

   /**
   * Get targetSubEntity
   * @return targetSubEntity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_SUB_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetSubEntity() {
    return targetSubEntity;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_SUB_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetSubEntity(String targetSubEntity) {
    this.targetSubEntity = targetSubEntity;
  }


  public DataSocketQueryExtendedGeoCoordinatesResponseData visibleId(String visibleId) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData id(String id) {
    
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


  public DataSocketQueryExtendedGeoCoordinatesResponseData buildingElid(String buildingElid) {
    
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
    DataSocketQueryExtendedGeoCoordinatesResponseData dataSocketQueryExtendedGeoCoordinatesResponseData = (DataSocketQueryExtendedGeoCoordinatesResponseData) o;
    return Objects.equals(this.coordX, dataSocketQueryExtendedGeoCoordinatesResponseData.coordX) &&
        Objects.equals(this.coordY, dataSocketQueryExtendedGeoCoordinatesResponseData.coordY) &&
        Objects.equals(this.coordZ, dataSocketQueryExtendedGeoCoordinatesResponseData.coordZ) &&
        Objects.equals(this.floorElid, dataSocketQueryExtendedGeoCoordinatesResponseData.floorElid) &&
        Objects.equals(this.zoneElid, dataSocketQueryExtendedGeoCoordinatesResponseData.zoneElid) &&
        Objects.equals(this.planStatus, dataSocketQueryExtendedGeoCoordinatesResponseData.planStatus) &&
        Objects.equals(this.campusElid, dataSocketQueryExtendedGeoCoordinatesResponseData.campusElid) &&
        Objects.equals(this.entityId, dataSocketQueryExtendedGeoCoordinatesResponseData.entityId) &&
        Objects.equals(this.explanation, dataSocketQueryExtendedGeoCoordinatesResponseData.explanation) &&
        Objects.equals(this.type, dataSocketQueryExtendedGeoCoordinatesResponseData.type) &&
        Objects.equals(this.coordSystem, dataSocketQueryExtendedGeoCoordinatesResponseData.coordSystem) &&
        Objects.equals(this.manufacturer, dataSocketQueryExtendedGeoCoordinatesResponseData.manufacturer) &&
        Objects.equals(this.offsetZ, dataSocketQueryExtendedGeoCoordinatesResponseData.offsetZ) &&
        Objects.equals(this.referenceObjectElid, dataSocketQueryExtendedGeoCoordinatesResponseData.referenceObjectElid) &&
        Objects.equals(this.function, dataSocketQueryExtendedGeoCoordinatesResponseData.function) &&
        Objects.equals(this.baselineZ, dataSocketQueryExtendedGeoCoordinatesResponseData.baselineZ) &&
        Objects.equals(this.roomElid, dataSocketQueryExtendedGeoCoordinatesResponseData.roomElid) &&
        Objects.equals(this.targetSubEntity, dataSocketQueryExtendedGeoCoordinatesResponseData.targetSubEntity) &&
        Objects.equals(this.visibleId, dataSocketQueryExtendedGeoCoordinatesResponseData.visibleId) &&
        Objects.equals(this.id, dataSocketQueryExtendedGeoCoordinatesResponseData.id) &&
        Objects.equals(this.buildingElid, dataSocketQueryExtendedGeoCoordinatesResponseData.buildingElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordX, coordY, coordZ, floorElid, zoneElid, planStatus, campusElid, entityId, explanation, type, coordSystem, manufacturer, offsetZ, referenceObjectElid, function, baselineZ, roomElid, targetSubEntity, visibleId, id, buildingElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSocketQueryExtendedGeoCoordinatesResponseData {\n");
    sb.append("    coordX: ").append(toIndentedString(coordX)).append("\n");
    sb.append("    coordY: ").append(toIndentedString(coordY)).append("\n");
    sb.append("    coordZ: ").append(toIndentedString(coordZ)).append("\n");
    sb.append("    floorElid: ").append(toIndentedString(floorElid)).append("\n");
    sb.append("    zoneElid: ").append(toIndentedString(zoneElid)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    campusElid: ").append(toIndentedString(campusElid)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordSystem: ").append(toIndentedString(coordSystem)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    offsetZ: ").append(toIndentedString(offsetZ)).append("\n");
    sb.append("    referenceObjectElid: ").append(toIndentedString(referenceObjectElid)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    baselineZ: ").append(toIndentedString(baselineZ)).append("\n");
    sb.append("    roomElid: ").append(toIndentedString(roomElid)).append("\n");
    sb.append("    targetSubEntity: ").append(toIndentedString(targetSubEntity)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
