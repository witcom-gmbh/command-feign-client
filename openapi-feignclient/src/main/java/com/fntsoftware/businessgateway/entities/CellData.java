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
 * CellData
 */
@JsonPropertyOrder({
  CellData.JSON_PROPERTY_E_NODE_B_ID,
  CellData.JSON_PROPERTY_MNC,
  CellData.JSON_PROPERTY_CELL_NAME,
  CellData.JSON_PROPERTY_PLAN_STATUS,
  CellData.JSON_PROPERTY_REMARK,
  CellData.JSON_PROPERTY_TECHNOLOGY,
  CellData.JSON_PROPERTY_CELL_ID,
  CellData.JSON_PROPERTY_MCC,
  CellData.JSON_PROPERTY_ELID,
  CellData.JSON_PROPERTY_LAC,
  CellData.JSON_PROPERTY_CELL_TYPE,
  CellData.JSON_PROPERTY_SAC,
  CellData.JSON_PROPERTY_RAC,
  CellData.JSON_PROPERTY_TAC,
  CellData.JSON_PROPERTY_CELL_GLOBAL_ID,
  CellData.JSON_PROPERTY_ID
})
@JsonTypeName("cellData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CellData {
  public static final String JSON_PROPERTY_E_NODE_B_ID = "eNodeBId";
  private String eNodeBId;

  public static final String JSON_PROPERTY_MNC = "mnc";
  private String mnc;

  public static final String JSON_PROPERTY_CELL_NAME = "cellName";
  private String cellName;

  public static final String JSON_PROPERTY_PLAN_STATUS = "planStatus";
  private String planStatus;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_TECHNOLOGY = "technology";
  private String technology;

  public static final String JSON_PROPERTY_CELL_ID = "cellId";
  private String cellId;

  public static final String JSON_PROPERTY_MCC = "mcc";
  private String mcc;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_LAC = "lac";
  private String lac;

  public static final String JSON_PROPERTY_CELL_TYPE = "cellType";
  private String cellType;

  public static final String JSON_PROPERTY_SAC = "sac";
  private String sac;

  public static final String JSON_PROPERTY_RAC = "rac";
  private String rac;

  public static final String JSON_PROPERTY_TAC = "tac";
  private String tac;

  public static final String JSON_PROPERTY_CELL_GLOBAL_ID = "cellGlobalId";
  private String cellGlobalId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public CellData() {
  }

  public CellData eNodeBId(String eNodeBId) {
    
    this.eNodeBId = eNodeBId;
    return this;
  }

   /**
   * Get eNodeBId
   * @return eNodeBId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_NODE_B_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String geteNodeBId() {
    return eNodeBId;
  }


  @JsonProperty(JSON_PROPERTY_E_NODE_B_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void seteNodeBId(String eNodeBId) {
    this.eNodeBId = eNodeBId;
  }


  public CellData mnc(String mnc) {
    
    this.mnc = mnc;
    return this;
  }

   /**
   * Get mnc
   * @return mnc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMnc() {
    return mnc;
  }


  @JsonProperty(JSON_PROPERTY_MNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMnc(String mnc) {
    this.mnc = mnc;
  }


  public CellData cellName(String cellName) {
    
    this.cellName = cellName;
    return this;
  }

   /**
   * Get cellName
   * @return cellName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellName() {
    return cellName;
  }


  @JsonProperty(JSON_PROPERTY_CELL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellName(String cellName) {
    this.cellName = cellName;
  }


  public CellData planStatus(String planStatus) {
    
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


  public CellData remark(String remark) {
    
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


  public CellData technology(String technology) {
    
    this.technology = technology;
    return this;
  }

   /**
   * Get technology
   * @return technology
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTechnology() {
    return technology;
  }


  @JsonProperty(JSON_PROPERTY_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechnology(String technology) {
    this.technology = technology;
  }


  public CellData cellId(String cellId) {
    
    this.cellId = cellId;
    return this;
  }

   /**
   * Get cellId
   * @return cellId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellId() {
    return cellId;
  }


  @JsonProperty(JSON_PROPERTY_CELL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellId(String cellId) {
    this.cellId = cellId;
  }


  public CellData mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * Get mcc
   * @return mcc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMcc() {
    return mcc;
  }


  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public CellData elid(String elid) {
    
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


  public CellData lac(String lac) {
    
    this.lac = lac;
    return this;
  }

   /**
   * Get lac
   * @return lac
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLac() {
    return lac;
  }


  @JsonProperty(JSON_PROPERTY_LAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLac(String lac) {
    this.lac = lac;
  }


  public CellData cellType(String cellType) {
    
    this.cellType = cellType;
    return this;
  }

   /**
   * Get cellType
   * @return cellType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellType() {
    return cellType;
  }


  @JsonProperty(JSON_PROPERTY_CELL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellType(String cellType) {
    this.cellType = cellType;
  }


  public CellData sac(String sac) {
    
    this.sac = sac;
    return this;
  }

   /**
   * Get sac
   * @return sac
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSac() {
    return sac;
  }


  @JsonProperty(JSON_PROPERTY_SAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSac(String sac) {
    this.sac = sac;
  }


  public CellData rac(String rac) {
    
    this.rac = rac;
    return this;
  }

   /**
   * Get rac
   * @return rac
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRac() {
    return rac;
  }


  @JsonProperty(JSON_PROPERTY_RAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRac(String rac) {
    this.rac = rac;
  }


  public CellData tac(String tac) {
    
    this.tac = tac;
    return this;
  }

   /**
   * Get tac
   * @return tac
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTac() {
    return tac;
  }


  @JsonProperty(JSON_PROPERTY_TAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTac(String tac) {
    this.tac = tac;
  }


  public CellData cellGlobalId(String cellGlobalId) {
    
    this.cellGlobalId = cellGlobalId;
    return this;
  }

   /**
   * Get cellGlobalId
   * @return cellGlobalId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellGlobalId() {
    return cellGlobalId;
  }


  @JsonProperty(JSON_PROPERTY_CELL_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellGlobalId(String cellGlobalId) {
    this.cellGlobalId = cellGlobalId;
  }


  public CellData id(String id) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellData cellData = (CellData) o;
    return Objects.equals(this.eNodeBId, cellData.eNodeBId) &&
        Objects.equals(this.mnc, cellData.mnc) &&
        Objects.equals(this.cellName, cellData.cellName) &&
        Objects.equals(this.planStatus, cellData.planStatus) &&
        Objects.equals(this.remark, cellData.remark) &&
        Objects.equals(this.technology, cellData.technology) &&
        Objects.equals(this.cellId, cellData.cellId) &&
        Objects.equals(this.mcc, cellData.mcc) &&
        Objects.equals(this.elid, cellData.elid) &&
        Objects.equals(this.lac, cellData.lac) &&
        Objects.equals(this.cellType, cellData.cellType) &&
        Objects.equals(this.sac, cellData.sac) &&
        Objects.equals(this.rac, cellData.rac) &&
        Objects.equals(this.tac, cellData.tac) &&
        Objects.equals(this.cellGlobalId, cellData.cellGlobalId) &&
        Objects.equals(this.id, cellData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eNodeBId, mnc, cellName, planStatus, remark, technology, cellId, mcc, elid, lac, cellType, sac, rac, tac, cellGlobalId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellData {\n");
    sb.append("    eNodeBId: ").append(toIndentedString(eNodeBId)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
    sb.append("    cellName: ").append(toIndentedString(cellName)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    lac: ").append(toIndentedString(lac)).append("\n");
    sb.append("    cellType: ").append(toIndentedString(cellType)).append("\n");
    sb.append("    sac: ").append(toIndentedString(sac)).append("\n");
    sb.append("    rac: ").append(toIndentedString(rac)).append("\n");
    sb.append("    tac: ").append(toIndentedString(tac)).append("\n");
    sb.append("    cellGlobalId: ").append(toIndentedString(cellGlobalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
