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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConfigurationDataConfigurationQueryRestriction
 */
@JsonPropertyOrder({
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_CATALOG_NAME,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_ICON_NAME,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_CUSTOM,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_DESCRIPTION,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_MSG_ID,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_ID,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_ID_ALIAS,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_ELID,
  ConfigurationDataConfigurationQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ConfigurationDataConfigurationQueryRestriction {
  public static final String JSON_PROPERTY_CATALOG_NAME = "catalogName";
  private RestrictionsString catalogName;

  public static final String JSON_PROPERTY_ICON_NAME = "iconName";
  private RestrictionsString iconName;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private RestrictionsBoolean custom;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_MSG_ID = "msgId";
  private RestrictionsNumeric msgId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ID_ALIAS = "idAlias";
  private RestrictionsString idAlias;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public ConfigurationDataConfigurationQueryRestriction() {
  }

  public ConfigurationDataConfigurationQueryRestriction catalogName(RestrictionsString catalogName) {
    
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

  public RestrictionsString getCatalogName() {
    return catalogName;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogName(RestrictionsString catalogName) {
    this.catalogName = catalogName;
  }


  public ConfigurationDataConfigurationQueryRestriction iconName(RestrictionsString iconName) {
    
    this.iconName = iconName;
    return this;
  }

   /**
   * Get iconName
   * @return iconName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIconName() {
    return iconName;
  }


  @JsonProperty(JSON_PROPERTY_ICON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIconName(RestrictionsString iconName) {
    this.iconName = iconName;
  }


  public ConfigurationDataConfigurationQueryRestriction custom(RestrictionsBoolean custom) {
    
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

  public RestrictionsBoolean getCustom() {
    return custom;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustom(RestrictionsBoolean custom) {
    this.custom = custom;
  }


  public ConfigurationDataConfigurationQueryRestriction description(RestrictionsString description) {
    
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


  public ConfigurationDataConfigurationQueryRestriction msgId(RestrictionsNumeric msgId) {
    
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

  public RestrictionsNumeric getMsgId() {
    return msgId;
  }


  @JsonProperty(JSON_PROPERTY_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgId(RestrictionsNumeric msgId) {
    this.msgId = msgId;
  }


  public ConfigurationDataConfigurationQueryRestriction id(RestrictionsString id) {
    
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


  public ConfigurationDataConfigurationQueryRestriction idAlias(RestrictionsString idAlias) {
    
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

  public RestrictionsString getIdAlias() {
    return idAlias;
  }


  @JsonProperty(JSON_PROPERTY_ID_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdAlias(RestrictionsString idAlias) {
    this.idAlias = idAlias;
  }


  public ConfigurationDataConfigurationQueryRestriction elid(RestrictionsString elid) {
    
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


  public ConfigurationDataConfigurationQueryRestriction first(RestrictionsNumeric first) {
    
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
    ConfigurationDataConfigurationQueryRestriction configurationDataConfigurationQueryRestriction = (ConfigurationDataConfigurationQueryRestriction) o;
    return Objects.equals(this.catalogName, configurationDataConfigurationQueryRestriction.catalogName) &&
        Objects.equals(this.iconName, configurationDataConfigurationQueryRestriction.iconName) &&
        Objects.equals(this.custom, configurationDataConfigurationQueryRestriction.custom) &&
        Objects.equals(this.description, configurationDataConfigurationQueryRestriction.description) &&
        Objects.equals(this.msgId, configurationDataConfigurationQueryRestriction.msgId) &&
        Objects.equals(this.id, configurationDataConfigurationQueryRestriction.id) &&
        Objects.equals(this.idAlias, configurationDataConfigurationQueryRestriction.idAlias) &&
        Objects.equals(this.elid, configurationDataConfigurationQueryRestriction.elid) &&
        Objects.equals(this.first, configurationDataConfigurationQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, iconName, custom, description, msgId, id, idAlias, elid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDataConfigurationQueryRestriction {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    iconName: ").append(toIndentedString(iconName)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idAlias: ").append(toIndentedString(idAlias)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
