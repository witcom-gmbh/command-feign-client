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
 * ConfigurationDataLayerQueryResponseData
 */
@JsonPropertyOrder({
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_CATALOG_NAME,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_EDITABLE,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_CUSTOM,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_DESCRIPTION,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_MSG_ID,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_COPY_IN,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_ID,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_USE_VALIDITY_DATE,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_COPY_OUT,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_ID_ALIAS,
  ConfigurationDataLayerQueryResponseData.JSON_PROPERTY_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ConfigurationDataLayerQueryResponseData {
  public static final String JSON_PROPERTY_CATALOG_NAME = "catalogName";
  private String catalogName;

  public static final String JSON_PROPERTY_EDITABLE = "editable";
  private Boolean editable;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Boolean custom;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MSG_ID = "msgId";
  private BigDecimal msgId;

  public static final String JSON_PROPERTY_COPY_IN = "copyIn";
  private Boolean copyIn;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USE_VALIDITY_DATE = "useValidityDate";
  private Boolean useValidityDate;

  public static final String JSON_PROPERTY_COPY_OUT = "copyOut";
  private Boolean copyOut;

  public static final String JSON_PROPERTY_ID_ALIAS = "idAlias";
  private String idAlias;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public ConfigurationDataLayerQueryResponseData() {
  }

  public ConfigurationDataLayerQueryResponseData catalogName(String catalogName) {
    
    this.catalogName = catalogName;
    return this;
  }

   /**
   * Get catalogName
   * @return catalogName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCatalogName() {
    return catalogName;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }


  public ConfigurationDataLayerQueryResponseData editable(Boolean editable) {
    
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEditable() {
    return editable;
  }


  @JsonProperty(JSON_PROPERTY_EDITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  public ConfigurationDataLayerQueryResponseData custom(Boolean custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCustom() {
    return custom;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustom(Boolean custom) {
    this.custom = custom;
  }


  public ConfigurationDataLayerQueryResponseData description(String description) {
    
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


  public ConfigurationDataLayerQueryResponseData msgId(BigDecimal msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * Get msgId
   * @return msgId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMsgId() {
    return msgId;
  }


  @JsonProperty(JSON_PROPERTY_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgId(BigDecimal msgId) {
    this.msgId = msgId;
  }


  public ConfigurationDataLayerQueryResponseData copyIn(Boolean copyIn) {
    
    this.copyIn = copyIn;
    return this;
  }

   /**
   * Get copyIn
   * @return copyIn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopyIn() {
    return copyIn;
  }


  @JsonProperty(JSON_PROPERTY_COPY_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyIn(Boolean copyIn) {
    this.copyIn = copyIn;
  }


  public ConfigurationDataLayerQueryResponseData id(String id) {
    
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


  public ConfigurationDataLayerQueryResponseData useValidityDate(Boolean useValidityDate) {
    
    this.useValidityDate = useValidityDate;
    return this;
  }

   /**
   * Get useValidityDate
   * @return useValidityDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_VALIDITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseValidityDate() {
    return useValidityDate;
  }


  @JsonProperty(JSON_PROPERTY_USE_VALIDITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseValidityDate(Boolean useValidityDate) {
    this.useValidityDate = useValidityDate;
  }


  public ConfigurationDataLayerQueryResponseData copyOut(Boolean copyOut) {
    
    this.copyOut = copyOut;
    return this;
  }

   /**
   * Get copyOut
   * @return copyOut
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COPY_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCopyOut() {
    return copyOut;
  }


  @JsonProperty(JSON_PROPERTY_COPY_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyOut(Boolean copyOut) {
    this.copyOut = copyOut;
  }


  public ConfigurationDataLayerQueryResponseData idAlias(String idAlias) {
    
    this.idAlias = idAlias;
    return this;
  }

   /**
   * Get idAlias
   * @return idAlias
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdAlias() {
    return idAlias;
  }


  @JsonProperty(JSON_PROPERTY_ID_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdAlias(String idAlias) {
    this.idAlias = idAlias;
  }


  public ConfigurationDataLayerQueryResponseData elid(String elid) {
    
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
    ConfigurationDataLayerQueryResponseData configurationDataLayerQueryResponseData = (ConfigurationDataLayerQueryResponseData) o;
    return Objects.equals(this.catalogName, configurationDataLayerQueryResponseData.catalogName) &&
        Objects.equals(this.editable, configurationDataLayerQueryResponseData.editable) &&
        Objects.equals(this.custom, configurationDataLayerQueryResponseData.custom) &&
        Objects.equals(this.description, configurationDataLayerQueryResponseData.description) &&
        Objects.equals(this.msgId, configurationDataLayerQueryResponseData.msgId) &&
        Objects.equals(this.copyIn, configurationDataLayerQueryResponseData.copyIn) &&
        Objects.equals(this.id, configurationDataLayerQueryResponseData.id) &&
        Objects.equals(this.useValidityDate, configurationDataLayerQueryResponseData.useValidityDate) &&
        Objects.equals(this.copyOut, configurationDataLayerQueryResponseData.copyOut) &&
        Objects.equals(this.idAlias, configurationDataLayerQueryResponseData.idAlias) &&
        Objects.equals(this.elid, configurationDataLayerQueryResponseData.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, editable, custom, description, msgId, copyIn, id, useValidityDate, copyOut, idAlias, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDataLayerQueryResponseData {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    copyIn: ").append(toIndentedString(copyIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    useValidityDate: ").append(toIndentedString(useValidityDate)).append("\n");
    sb.append("    copyOut: ").append(toIndentedString(copyOut)).append("\n");
    sb.append("    idAlias: ").append(toIndentedString(idAlias)).append("\n");
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
