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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServerBaseSitesEntityRestriction
 */
@JsonPropertyOrder({
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_ROOF_TYPE,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_REMARK,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_ELID,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_MAST_CONSTRUCTION,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_AREA_TYPE,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_BUILDING_HEIGHT,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_NAME,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_MAST_TYPE_OF_USE,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_ID,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_CATEGORY,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_BUILDING_TYPE,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_DEVELOPMENT_STATUS,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_LAND_USE,
  ServerBaseSitesEntityRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ServerBaseSitesEntityRestriction {
  public static final String JSON_PROPERTY_ROOF_TYPE = "roofType";
  private RestrictionsString roofType;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_MAST_CONSTRUCTION = "mastConstruction";
  private RestrictionsString mastConstruction;

  public static final String JSON_PROPERTY_AREA_TYPE = "areaType";
  private RestrictionsString areaType;

  public static final String JSON_PROPERTY_BUILDING_HEIGHT = "buildingHeight";
  private RestrictionsNumeric buildingHeight;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_MAST_TYPE_OF_USE = "mastTypeOfUse";
  private RestrictionsString mastTypeOfUse;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private RestrictionsString category;

  public static final String JSON_PROPERTY_BUILDING_TYPE = "buildingType";
  private RestrictionsString buildingType;

  public static final String JSON_PROPERTY_DEVELOPMENT_STATUS = "developmentStatus";
  private RestrictionsString developmentStatus;

  public static final String JSON_PROPERTY_LAND_USE = "landUse";
  private RestrictionsString landUse;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public ServerBaseSitesEntityRestriction() {
  }

  public ServerBaseSitesEntityRestriction roofType(RestrictionsString roofType) {
    
    this.roofType = roofType;
    return this;
  }

   /**
   * Get roofType
   * @return roofType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRoofType() {
    return roofType;
  }


  @JsonProperty(JSON_PROPERTY_ROOF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoofType(RestrictionsString roofType) {
    this.roofType = roofType;
  }


  public ServerBaseSitesEntityRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public ServerBaseSitesEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServerBaseSitesEntityRestriction mastConstruction(RestrictionsString mastConstruction) {
    
    this.mastConstruction = mastConstruction;
    return this;
  }

   /**
   * Get mastConstruction
   * @return mastConstruction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAST_CONSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMastConstruction() {
    return mastConstruction;
  }


  @JsonProperty(JSON_PROPERTY_MAST_CONSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMastConstruction(RestrictionsString mastConstruction) {
    this.mastConstruction = mastConstruction;
  }


  public ServerBaseSitesEntityRestriction areaType(RestrictionsString areaType) {
    
    this.areaType = areaType;
    return this;
  }

   /**
   * Get areaType
   * @return areaType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AREA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getAreaType() {
    return areaType;
  }


  @JsonProperty(JSON_PROPERTY_AREA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAreaType(RestrictionsString areaType) {
    this.areaType = areaType;
  }


  public ServerBaseSitesEntityRestriction buildingHeight(RestrictionsNumeric buildingHeight) {
    
    this.buildingHeight = buildingHeight;
    return this;
  }

   /**
   * Get buildingHeight
   * @return buildingHeight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getBuildingHeight() {
    return buildingHeight;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingHeight(RestrictionsNumeric buildingHeight) {
    this.buildingHeight = buildingHeight;
  }


  public ServerBaseSitesEntityRestriction name(RestrictionsString name) {
    
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


  public ServerBaseSitesEntityRestriction mastTypeOfUse(RestrictionsString mastTypeOfUse) {
    
    this.mastTypeOfUse = mastTypeOfUse;
    return this;
  }

   /**
   * Get mastTypeOfUse
   * @return mastTypeOfUse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAST_TYPE_OF_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMastTypeOfUse() {
    return mastTypeOfUse;
  }


  @JsonProperty(JSON_PROPERTY_MAST_TYPE_OF_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMastTypeOfUse(RestrictionsString mastTypeOfUse) {
    this.mastTypeOfUse = mastTypeOfUse;
  }


  public ServerBaseSitesEntityRestriction id(RestrictionsString id) {
    
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


  public ServerBaseSitesEntityRestriction category(RestrictionsString category) {
    
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


  public ServerBaseSitesEntityRestriction buildingType(RestrictionsString buildingType) {
    
    this.buildingType = buildingType;
    return this;
  }

   /**
   * Get buildingType
   * @return buildingType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getBuildingType() {
    return buildingType;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildingType(RestrictionsString buildingType) {
    this.buildingType = buildingType;
  }


  public ServerBaseSitesEntityRestriction developmentStatus(RestrictionsString developmentStatus) {
    
    this.developmentStatus = developmentStatus;
    return this;
  }

   /**
   * Get developmentStatus
   * @return developmentStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVELOPMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDevelopmentStatus() {
    return developmentStatus;
  }


  @JsonProperty(JSON_PROPERTY_DEVELOPMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevelopmentStatus(RestrictionsString developmentStatus) {
    this.developmentStatus = developmentStatus;
  }


  public ServerBaseSitesEntityRestriction landUse(RestrictionsString landUse) {
    
    this.landUse = landUse;
    return this;
  }

   /**
   * Get landUse
   * @return landUse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAND_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLandUse() {
    return landUse;
  }


  @JsonProperty(JSON_PROPERTY_LAND_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandUse(RestrictionsString landUse) {
    this.landUse = landUse;
  }


  public ServerBaseSitesEntityRestriction status(RestrictionsString status) {
    
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

  public RestrictionsString getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(RestrictionsString status) {
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
    ServerBaseSitesEntityRestriction serverBaseSitesEntityRestriction = (ServerBaseSitesEntityRestriction) o;
    return Objects.equals(this.roofType, serverBaseSitesEntityRestriction.roofType) &&
        Objects.equals(this.remark, serverBaseSitesEntityRestriction.remark) &&
        Objects.equals(this.elid, serverBaseSitesEntityRestriction.elid) &&
        Objects.equals(this.mastConstruction, serverBaseSitesEntityRestriction.mastConstruction) &&
        Objects.equals(this.areaType, serverBaseSitesEntityRestriction.areaType) &&
        Objects.equals(this.buildingHeight, serverBaseSitesEntityRestriction.buildingHeight) &&
        Objects.equals(this.name, serverBaseSitesEntityRestriction.name) &&
        Objects.equals(this.mastTypeOfUse, serverBaseSitesEntityRestriction.mastTypeOfUse) &&
        Objects.equals(this.id, serverBaseSitesEntityRestriction.id) &&
        Objects.equals(this.category, serverBaseSitesEntityRestriction.category) &&
        Objects.equals(this.buildingType, serverBaseSitesEntityRestriction.buildingType) &&
        Objects.equals(this.developmentStatus, serverBaseSitesEntityRestriction.developmentStatus) &&
        Objects.equals(this.landUse, serverBaseSitesEntityRestriction.landUse) &&
        Objects.equals(this.status, serverBaseSitesEntityRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roofType, remark, elid, mastConstruction, areaType, buildingHeight, name, mastTypeOfUse, id, category, buildingType, developmentStatus, landUse, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerBaseSitesEntityRestriction {\n");
    sb.append("    roofType: ").append(toIndentedString(roofType)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    mastConstruction: ").append(toIndentedString(mastConstruction)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    buildingHeight: ").append(toIndentedString(buildingHeight)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mastTypeOfUse: ").append(toIndentedString(mastTypeOfUse)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    buildingType: ").append(toIndentedString(buildingType)).append("\n");
    sb.append("    developmentStatus: ").append(toIndentedString(developmentStatus)).append("\n");
    sb.append("    landUse: ").append(toIndentedString(landUse)).append("\n");
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
