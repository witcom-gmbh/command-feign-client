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
 * UpdateDuctPacketTypeRequestData
 */
@JsonPropertyOrder({
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_CATALOG_NAME,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_IS_STANDARD,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_CUSTOM,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_DESCRIPTION,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_MSG_ID,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_Y_SIZE,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_X_SIZE,
  UpdateDuctPacketTypeRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateDuctPacketTypeRequestData {
  public static final String JSON_PROPERTY_CATALOG_NAME = "catalogName";
  private String catalogName;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private Boolean isStandard;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Boolean custom;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MSG_ID = "msgId";
  private BigDecimal msgId;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_Y_SIZE = "ySize";
  private BigDecimal ySize;

  public static final String JSON_PROPERTY_X_SIZE = "xSize";
  private BigDecimal xSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public UpdateDuctPacketTypeRequestData() {
  }

  public UpdateDuctPacketTypeRequestData catalogName(String catalogName) {
    
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


  public UpdateDuctPacketTypeRequestData sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public UpdateDuctPacketTypeRequestData isStandard(Boolean isStandard) {
    
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

  public Boolean getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  public UpdateDuctPacketTypeRequestData sourceSystem(String sourceSystem) {
    
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Get sourceSystem
   * @return sourceSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceSystem() {
    return sourceSystem;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }


  public UpdateDuctPacketTypeRequestData custom(Boolean custom) {
    
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


  public UpdateDuctPacketTypeRequestData description(String description) {
    
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


  public UpdateDuctPacketTypeRequestData msgId(BigDecimal msgId) {
    
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


  public UpdateDuctPacketTypeRequestData contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public UpdateDuctPacketTypeRequestData ySize(BigDecimal ySize) {
    
    this.ySize = ySize;
    return this;
  }

   /**
   * Get ySize
   * @return ySize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Y_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getySize() {
    return ySize;
  }


  @JsonProperty(JSON_PROPERTY_Y_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setySize(BigDecimal ySize) {
    this.ySize = ySize;
  }


  public UpdateDuctPacketTypeRequestData xSize(BigDecimal xSize) {
    
    this.xSize = xSize;
    return this;
  }

   /**
   * Get xSize
   * @return xSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_X_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getxSize() {
    return xSize;
  }


  @JsonProperty(JSON_PROPERTY_X_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setxSize(BigDecimal xSize) {
    this.xSize = xSize;
  }


  public UpdateDuctPacketTypeRequestData type(String type) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDuctPacketTypeRequestData updateDuctPacketTypeRequestData = (UpdateDuctPacketTypeRequestData) o;
    return Objects.equals(this.catalogName, updateDuctPacketTypeRequestData.catalogName) &&
        Objects.equals(this.sourceId, updateDuctPacketTypeRequestData.sourceId) &&
        Objects.equals(this.isStandard, updateDuctPacketTypeRequestData.isStandard) &&
        Objects.equals(this.sourceSystem, updateDuctPacketTypeRequestData.sourceSystem) &&
        Objects.equals(this.custom, updateDuctPacketTypeRequestData.custom) &&
        Objects.equals(this.description, updateDuctPacketTypeRequestData.description) &&
        Objects.equals(this.msgId, updateDuctPacketTypeRequestData.msgId) &&
        Objects.equals(this.contextId, updateDuctPacketTypeRequestData.contextId) &&
        Objects.equals(this.ySize, updateDuctPacketTypeRequestData.ySize) &&
        Objects.equals(this.xSize, updateDuctPacketTypeRequestData.xSize) &&
        Objects.equals(this.type, updateDuctPacketTypeRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, sourceId, isStandard, sourceSystem, custom, description, msgId, contextId, ySize, xSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDuctPacketTypeRequestData {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    ySize: ").append(toIndentedString(ySize)).append("\n");
    sb.append("    xSize: ").append(toIndentedString(xSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
