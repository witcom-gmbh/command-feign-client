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
 * BuildingQueryResponseData
 */
@JsonPropertyOrder({
  BuildingQueryResponseData.JSON_PROPERTY_C_HASGEE,
  BuildingQueryResponseData.JSON_PROPERTY_C_LONGITUDE,
  BuildingQueryResponseData.JSON_PROPERTY_C_ACCESSPOLICY,
  BuildingQueryResponseData.JSON_PROPERTY_C_LOCATIONKEYSAFE,
  BuildingQueryResponseData.JSON_PROPERTY_CAMPUS,
  BuildingQueryResponseData.JSON_PROPERTY_C_ONNET,
  BuildingQueryResponseData.JSON_PROPERTY_DESCRIPTION,
  BuildingQueryResponseData.JSON_PROPERTY_REMARK,
  BuildingQueryResponseData.JSON_PROPERTY_C_SUBLOCALITY1,
  BuildingQueryResponseData.JSON_PROPERTY_C_HASKVA,
  BuildingQueryResponseData.JSON_PROPERTY_ELID,
  BuildingQueryResponseData.JSON_PROPERTY_C_ACCESSINFO,
  BuildingQueryResponseData.JSON_PROPERTY_C_PARKING,
  BuildingQueryResponseData.JSON_PROPERTY_C_LATITUDE,
  BuildingQueryResponseData.JSON_PROPERTY_C_DIRECTIONS,
  BuildingQueryResponseData.JSON_PROPERTY_C_ZIP_CODE,
  BuildingQueryResponseData.JSON_PROPERTY_C_LOCATION,
  BuildingQueryResponseData.JSON_PROPERTY_NAME,
  BuildingQueryResponseData.JSON_PROPERTY_C_HASACCESS24,
  BuildingQueryResponseData.JSON_PROPERTY_C_HOUSE_NO,
  BuildingQueryResponseData.JSON_PROPERTY_C_ONNETSTATUS,
  BuildingQueryResponseData.JSON_PROPERTY_C_STREETNAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class BuildingQueryResponseData {
  public static final String JSON_PROPERTY_C_HASGEE = "cHasgee";
  private String cHasgee;

  public static final String JSON_PROPERTY_C_LONGITUDE = "cLongitude";
  private BigDecimal cLongitude;

  public static final String JSON_PROPERTY_C_ACCESSPOLICY = "cAccesspolicy";
  private String cAccesspolicy;

  public static final String JSON_PROPERTY_C_LOCATIONKEYSAFE = "cLocationkeysafe";
  private String cLocationkeysafe;

  public static final String JSON_PROPERTY_CAMPUS = "campus";
  private String campus;

  public static final String JSON_PROPERTY_C_ONNET = "cOnnet";
  private String cOnnet;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_C_SUBLOCALITY1 = "cSublocality1";
  private String cSublocality1;

  public static final String JSON_PROPERTY_C_HASKVA = "cHaskva";
  private String cHaskva;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_C_ACCESSINFO = "cAccessinfo";
  private String cAccessinfo;

  public static final String JSON_PROPERTY_C_PARKING = "cParking";
  private String cParking;

  public static final String JSON_PROPERTY_C_LATITUDE = "cLatitude";
  private BigDecimal cLatitude;

  public static final String JSON_PROPERTY_C_DIRECTIONS = "cDirections";
  private String cDirections;

  public static final String JSON_PROPERTY_C_ZIP_CODE = "cZipCode";
  private String cZipCode;

  public static final String JSON_PROPERTY_C_LOCATION = "cLocation";
  private String cLocation;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_C_HASACCESS24 = "cHasaccess24";
  private String cHasaccess24;

  public static final String JSON_PROPERTY_C_HOUSE_NO = "cHouseNo";
  private String cHouseNo;

  public static final String JSON_PROPERTY_C_ONNETSTATUS = "cOnnetstatus";
  private String cOnnetstatus;

  public static final String JSON_PROPERTY_C_STREETNAME = "cStreetname";
  private String cStreetname;

  public BuildingQueryResponseData() {
  }

  public BuildingQueryResponseData cHasgee(String cHasgee) {
    
    this.cHasgee = cHasgee;
    return this;
  }

   /**
   * Get cHasgee
   * @return cHasgee
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_HASGEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcHasgee() {
    return cHasgee;
  }


  @JsonProperty(JSON_PROPERTY_C_HASGEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcHasgee(String cHasgee) {
    this.cHasgee = cHasgee;
  }


  public BuildingQueryResponseData cLongitude(BigDecimal cLongitude) {
    
    this.cLongitude = cLongitude;
    return this;
  }

   /**
   * Get cLongitude
   * @return cLongitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getcLongitude() {
    return cLongitude;
  }


  @JsonProperty(JSON_PROPERTY_C_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLongitude(BigDecimal cLongitude) {
    this.cLongitude = cLongitude;
  }


  public BuildingQueryResponseData cAccesspolicy(String cAccesspolicy) {
    
    this.cAccesspolicy = cAccesspolicy;
    return this;
  }

   /**
   * Get cAccesspolicy
   * @return cAccesspolicy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_ACCESSPOLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcAccesspolicy() {
    return cAccesspolicy;
  }


  @JsonProperty(JSON_PROPERTY_C_ACCESSPOLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcAccesspolicy(String cAccesspolicy) {
    this.cAccesspolicy = cAccesspolicy;
  }


  public BuildingQueryResponseData cLocationkeysafe(String cLocationkeysafe) {
    
    this.cLocationkeysafe = cLocationkeysafe;
    return this;
  }

   /**
   * Get cLocationkeysafe
   * @return cLocationkeysafe
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_LOCATIONKEYSAFE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcLocationkeysafe() {
    return cLocationkeysafe;
  }


  @JsonProperty(JSON_PROPERTY_C_LOCATIONKEYSAFE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLocationkeysafe(String cLocationkeysafe) {
    this.cLocationkeysafe = cLocationkeysafe;
  }


  public BuildingQueryResponseData campus(String campus) {
    
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


  public BuildingQueryResponseData cOnnet(String cOnnet) {
    
    this.cOnnet = cOnnet;
    return this;
  }

   /**
   * Get cOnnet
   * @return cOnnet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_ONNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcOnnet() {
    return cOnnet;
  }


  @JsonProperty(JSON_PROPERTY_C_ONNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcOnnet(String cOnnet) {
    this.cOnnet = cOnnet;
  }


  public BuildingQueryResponseData description(String description) {
    
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


  public BuildingQueryResponseData remark(String remark) {
    
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

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public BuildingQueryResponseData cSublocality1(String cSublocality1) {
    
    this.cSublocality1 = cSublocality1;
    return this;
  }

   /**
   * Get cSublocality1
   * @return cSublocality1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SUBLOCALITY1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcSublocality1() {
    return cSublocality1;
  }


  @JsonProperty(JSON_PROPERTY_C_SUBLOCALITY1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcSublocality1(String cSublocality1) {
    this.cSublocality1 = cSublocality1;
  }


  public BuildingQueryResponseData cHaskva(String cHaskva) {
    
    this.cHaskva = cHaskva;
    return this;
  }

   /**
   * Get cHaskva
   * @return cHaskva
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_HASKVA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcHaskva() {
    return cHaskva;
  }


  @JsonProperty(JSON_PROPERTY_C_HASKVA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcHaskva(String cHaskva) {
    this.cHaskva = cHaskva;
  }


  public BuildingQueryResponseData elid(String elid) {
    
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


  public BuildingQueryResponseData cAccessinfo(String cAccessinfo) {
    
    this.cAccessinfo = cAccessinfo;
    return this;
  }

   /**
   * Get cAccessinfo
   * @return cAccessinfo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_ACCESSINFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcAccessinfo() {
    return cAccessinfo;
  }


  @JsonProperty(JSON_PROPERTY_C_ACCESSINFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcAccessinfo(String cAccessinfo) {
    this.cAccessinfo = cAccessinfo;
  }


  public BuildingQueryResponseData cParking(String cParking) {
    
    this.cParking = cParking;
    return this;
  }

   /**
   * Get cParking
   * @return cParking
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_PARKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcParking() {
    return cParking;
  }


  @JsonProperty(JSON_PROPERTY_C_PARKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcParking(String cParking) {
    this.cParking = cParking;
  }


  public BuildingQueryResponseData cLatitude(BigDecimal cLatitude) {
    
    this.cLatitude = cLatitude;
    return this;
  }

   /**
   * Get cLatitude
   * @return cLatitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getcLatitude() {
    return cLatitude;
  }


  @JsonProperty(JSON_PROPERTY_C_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLatitude(BigDecimal cLatitude) {
    this.cLatitude = cLatitude;
  }


  public BuildingQueryResponseData cDirections(String cDirections) {
    
    this.cDirections = cDirections;
    return this;
  }

   /**
   * Get cDirections
   * @return cDirections
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DIRECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcDirections() {
    return cDirections;
  }


  @JsonProperty(JSON_PROPERTY_C_DIRECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDirections(String cDirections) {
    this.cDirections = cDirections;
  }


  public BuildingQueryResponseData cZipCode(String cZipCode) {
    
    this.cZipCode = cZipCode;
    return this;
  }

   /**
   * Get cZipCode
   * @return cZipCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcZipCode() {
    return cZipCode;
  }


  @JsonProperty(JSON_PROPERTY_C_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcZipCode(String cZipCode) {
    this.cZipCode = cZipCode;
  }


  public BuildingQueryResponseData cLocation(String cLocation) {
    
    this.cLocation = cLocation;
    return this;
  }

   /**
   * Get cLocation
   * @return cLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcLocation() {
    return cLocation;
  }


  @JsonProperty(JSON_PROPERTY_C_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcLocation(String cLocation) {
    this.cLocation = cLocation;
  }


  public BuildingQueryResponseData name(String name) {
    
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

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public BuildingQueryResponseData cHasaccess24(String cHasaccess24) {
    
    this.cHasaccess24 = cHasaccess24;
    return this;
  }

   /**
   * Get cHasaccess24
   * @return cHasaccess24
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_HASACCESS24)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcHasaccess24() {
    return cHasaccess24;
  }


  @JsonProperty(JSON_PROPERTY_C_HASACCESS24)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcHasaccess24(String cHasaccess24) {
    this.cHasaccess24 = cHasaccess24;
  }


  public BuildingQueryResponseData cHouseNo(String cHouseNo) {
    
    this.cHouseNo = cHouseNo;
    return this;
  }

   /**
   * Get cHouseNo
   * @return cHouseNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_HOUSE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcHouseNo() {
    return cHouseNo;
  }


  @JsonProperty(JSON_PROPERTY_C_HOUSE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcHouseNo(String cHouseNo) {
    this.cHouseNo = cHouseNo;
  }


  public BuildingQueryResponseData cOnnetstatus(String cOnnetstatus) {
    
    this.cOnnetstatus = cOnnetstatus;
    return this;
  }

   /**
   * Get cOnnetstatus
   * @return cOnnetstatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_ONNETSTATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcOnnetstatus() {
    return cOnnetstatus;
  }


  @JsonProperty(JSON_PROPERTY_C_ONNETSTATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcOnnetstatus(String cOnnetstatus) {
    this.cOnnetstatus = cOnnetstatus;
  }


  public BuildingQueryResponseData cStreetname(String cStreetname) {
    
    this.cStreetname = cStreetname;
    return this;
  }

   /**
   * Get cStreetname
   * @return cStreetname
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_STREETNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcStreetname() {
    return cStreetname;
  }


  @JsonProperty(JSON_PROPERTY_C_STREETNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcStreetname(String cStreetname) {
    this.cStreetname = cStreetname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildingQueryResponseData buildingQueryResponseData = (BuildingQueryResponseData) o;
    return Objects.equals(this.cHasgee, buildingQueryResponseData.cHasgee) &&
        Objects.equals(this.cLongitude, buildingQueryResponseData.cLongitude) &&
        Objects.equals(this.cAccesspolicy, buildingQueryResponseData.cAccesspolicy) &&
        Objects.equals(this.cLocationkeysafe, buildingQueryResponseData.cLocationkeysafe) &&
        Objects.equals(this.campus, buildingQueryResponseData.campus) &&
        Objects.equals(this.cOnnet, buildingQueryResponseData.cOnnet) &&
        Objects.equals(this.description, buildingQueryResponseData.description) &&
        Objects.equals(this.remark, buildingQueryResponseData.remark) &&
        Objects.equals(this.cSublocality1, buildingQueryResponseData.cSublocality1) &&
        Objects.equals(this.cHaskva, buildingQueryResponseData.cHaskva) &&
        Objects.equals(this.elid, buildingQueryResponseData.elid) &&
        Objects.equals(this.cAccessinfo, buildingQueryResponseData.cAccessinfo) &&
        Objects.equals(this.cParking, buildingQueryResponseData.cParking) &&
        Objects.equals(this.cLatitude, buildingQueryResponseData.cLatitude) &&
        Objects.equals(this.cDirections, buildingQueryResponseData.cDirections) &&
        Objects.equals(this.cZipCode, buildingQueryResponseData.cZipCode) &&
        Objects.equals(this.cLocation, buildingQueryResponseData.cLocation) &&
        Objects.equals(this.name, buildingQueryResponseData.name) &&
        Objects.equals(this.cHasaccess24, buildingQueryResponseData.cHasaccess24) &&
        Objects.equals(this.cHouseNo, buildingQueryResponseData.cHouseNo) &&
        Objects.equals(this.cOnnetstatus, buildingQueryResponseData.cOnnetstatus) &&
        Objects.equals(this.cStreetname, buildingQueryResponseData.cStreetname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cHasgee, cLongitude, cAccesspolicy, cLocationkeysafe, campus, cOnnet, description, remark, cSublocality1, cHaskva, elid, cAccessinfo, cParking, cLatitude, cDirections, cZipCode, cLocation, name, cHasaccess24, cHouseNo, cOnnetstatus, cStreetname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildingQueryResponseData {\n");
    sb.append("    cHasgee: ").append(toIndentedString(cHasgee)).append("\n");
    sb.append("    cLongitude: ").append(toIndentedString(cLongitude)).append("\n");
    sb.append("    cAccesspolicy: ").append(toIndentedString(cAccesspolicy)).append("\n");
    sb.append("    cLocationkeysafe: ").append(toIndentedString(cLocationkeysafe)).append("\n");
    sb.append("    campus: ").append(toIndentedString(campus)).append("\n");
    sb.append("    cOnnet: ").append(toIndentedString(cOnnet)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    cSublocality1: ").append(toIndentedString(cSublocality1)).append("\n");
    sb.append("    cHaskva: ").append(toIndentedString(cHaskva)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    cAccessinfo: ").append(toIndentedString(cAccessinfo)).append("\n");
    sb.append("    cParking: ").append(toIndentedString(cParking)).append("\n");
    sb.append("    cLatitude: ").append(toIndentedString(cLatitude)).append("\n");
    sb.append("    cDirections: ").append(toIndentedString(cDirections)).append("\n");
    sb.append("    cZipCode: ").append(toIndentedString(cZipCode)).append("\n");
    sb.append("    cLocation: ").append(toIndentedString(cLocation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cHasaccess24: ").append(toIndentedString(cHasaccess24)).append("\n");
    sb.append("    cHouseNo: ").append(toIndentedString(cHouseNo)).append("\n");
    sb.append("    cOnnetstatus: ").append(toIndentedString(cOnnetstatus)).append("\n");
    sb.append("    cStreetname: ").append(toIndentedString(cStreetname)).append("\n");
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
