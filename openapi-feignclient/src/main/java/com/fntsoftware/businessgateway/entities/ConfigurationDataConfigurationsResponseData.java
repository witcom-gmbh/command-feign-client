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
 * ConfigurationDataConfigurationsResponseData
 */
@JsonPropertyOrder({
  ConfigurationDataConfigurationsResponseData.JSON_PROPERTY_CONFIGURATION,
  ConfigurationDataConfigurationsResponseData.JSON_PROPERTY_CONFIGURATION_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ConfigurationDataConfigurationsResponseData {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private String _configuration;

  public static final String JSON_PROPERTY_CONFIGURATION_ELID = "configurationElid";
  private String configurationElid;

  public ConfigurationDataConfigurationsResponseData() {
  }

  public ConfigurationDataConfigurationsResponseData _configuration(String _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }


  public ConfigurationDataConfigurationsResponseData configurationElid(String configurationElid) {
    
    this.configurationElid = configurationElid;
    return this;
  }

   /**
   * Get configurationElid
   * @return configurationElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfigurationElid() {
    return configurationElid;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationElid(String configurationElid) {
    this.configurationElid = configurationElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationDataConfigurationsResponseData configurationDataConfigurationsResponseData = (ConfigurationDataConfigurationsResponseData) o;
    return Objects.equals(this._configuration, configurationDataConfigurationsResponseData._configuration) &&
        Objects.equals(this.configurationElid, configurationDataConfigurationsResponseData.configurationElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, configurationElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationDataConfigurationsResponseData {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    configurationElid: ").append(toIndentedString(configurationElid)).append("\n");
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
