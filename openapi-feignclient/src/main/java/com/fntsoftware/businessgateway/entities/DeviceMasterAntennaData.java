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
 * DeviceMasterAntennaData
 */
@JsonPropertyOrder({
  DeviceMasterAntennaData.JSON_PROPERTY_REMARK,
  DeviceMasterAntennaData.JSON_PROPERTY_EXPLANATION,
  DeviceMasterAntennaData.JSON_PROPERTY_RET_INPUT_VOLTAGE_FROM,
  DeviceMasterAntennaData.JSON_PROPERTY_TYPE,
  DeviceMasterAntennaData.JSON_PROPERTY_MANUFACTURER,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_FROM,
  DeviceMasterAntennaData.JSON_PROPERTY_RET_REMARK,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_RF_CONNECTOR_LOCATION,
  DeviceMasterAntennaData.JSON_PROPERTY_FUNCTION,
  DeviceMasterAntennaData.JSON_PROPERTY_WIND_LOADING_MAX,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_TO,
  DeviceMasterAntennaData.JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER,
  DeviceMasterAntennaData.JSON_PROPERTY_DIMENSION_DEPTH,
  DeviceMasterAntennaData.JSON_PROPERTY_RET_PROTOCOL,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_POLARISATION,
  DeviceMasterAntennaData.JSON_PROPERTY_DIMENSION_HEIGHT,
  DeviceMasterAntennaData.JSON_PROPERTY_WIND_LOADING_REAR,
  DeviceMasterAntennaData.JSON_PROPERTY_RET_INPUT_VOLTAGE,
  DeviceMasterAntennaData.JSON_PROPERTY_WEIGHT,
  DeviceMasterAntennaData.JSON_PROPERTY_DIMENSION_WIDTH,
  DeviceMasterAntennaData.JSON_PROPERTY_WIND_LOADING_FRONT,
  DeviceMasterAntennaData.JSON_PROPERTY_ELID,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_SPEC_REMARK,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_BAND,
  DeviceMasterAntennaData.JSON_PROPERTY_IS_STANDARD,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_GROUNDING_TYPE,
  DeviceMasterAntennaData.JSON_PROPERTY_WIND_LOADING_SIDE,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_PORTFOLIO_STATUS,
  DeviceMasterAntennaData.JSON_PROPERTY_RET_INPUT_VOLTAGE_TO,
  DeviceMasterAntennaData.JSON_PROPERTY_WIND_SPEED_MAX,
  DeviceMasterAntennaData.JSON_PROPERTY_ANTENNA_MAX_EFF_POWER
})
@JsonTypeName("deviceMasterAntennaData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class DeviceMasterAntennaData {
  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_RET_INPUT_VOLTAGE_FROM = "retInputVoltageFrom";
  private BigDecimal retInputVoltageFrom;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_FROM = "antennaOpFrequencyBandFrom";
  private BigDecimal antennaOpFrequencyBandFrom;

  public static final String JSON_PROPERTY_RET_REMARK = "retRemark";
  private String retRemark;

  public static final String JSON_PROPERTY_ANTENNA_RF_CONNECTOR_LOCATION = "antennaRfConnectorLocation";
  private String antennaRfConnectorLocation;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_WIND_LOADING_MAX = "windLoadingMax";
  private String windLoadingMax;

  public static final String JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_TO = "antennaOpFrequencyBandTo";
  private BigDecimal antennaOpFrequencyBandTo;

  public static final String JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER = "manufacturerArticleNumber";
  private String manufacturerArticleNumber;

  public static final String JSON_PROPERTY_DIMENSION_DEPTH = "dimensionDepth";
  private BigDecimal dimensionDepth;

  public static final String JSON_PROPERTY_RET_PROTOCOL = "retProtocol";
  private String retProtocol;

  public static final String JSON_PROPERTY_ANTENNA_POLARISATION = "antennaPolarisation";
  private String antennaPolarisation;

  public static final String JSON_PROPERTY_DIMENSION_HEIGHT = "dimensionHeight";
  private BigDecimal dimensionHeight;

  public static final String JSON_PROPERTY_WIND_LOADING_REAR = "windLoadingRear";
  private String windLoadingRear;

  public static final String JSON_PROPERTY_RET_INPUT_VOLTAGE = "retInputVoltage";
  private String retInputVoltage;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public static final String JSON_PROPERTY_DIMENSION_WIDTH = "dimensionWidth";
  private BigDecimal dimensionWidth;

  public static final String JSON_PROPERTY_WIND_LOADING_FRONT = "windLoadingFront";
  private String windLoadingFront;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_ANTENNA_SPEC_REMARK = "antennaSpecRemark";
  private String antennaSpecRemark;

  public static final String JSON_PROPERTY_ANTENNA_BAND = "antennaBand";
  private String antennaBand;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private Boolean isStandard;

  public static final String JSON_PROPERTY_ANTENNA_GROUNDING_TYPE = "antennaGroundingType";
  private String antennaGroundingType;

  public static final String JSON_PROPERTY_WIND_LOADING_SIDE = "windLoadingSide";
  private String windLoadingSide;

  public static final String JSON_PROPERTY_ANTENNA_PORTFOLIO_STATUS = "antennaPortfolioStatus";
  private String antennaPortfolioStatus;

  public static final String JSON_PROPERTY_RET_INPUT_VOLTAGE_TO = "retInputVoltageTo";
  private BigDecimal retInputVoltageTo;

  public static final String JSON_PROPERTY_WIND_SPEED_MAX = "windSpeedMax";
  private String windSpeedMax;

  public static final String JSON_PROPERTY_ANTENNA_MAX_EFF_POWER = "antennaMaxEffPower";
  private BigDecimal antennaMaxEffPower;

  public DeviceMasterAntennaData() {
  }

  public DeviceMasterAntennaData remark(String remark) {
    
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


  public DeviceMasterAntennaData explanation(String explanation) {
    
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


  public DeviceMasterAntennaData retInputVoltageFrom(BigDecimal retInputVoltageFrom) {
    
    this.retInputVoltageFrom = retInputVoltageFrom;
    return this;
  }

   /**
   * Get retInputVoltageFrom
   * @return retInputVoltageFrom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RET_INPUT_VOLTAGE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRetInputVoltageFrom() {
    return retInputVoltageFrom;
  }


  @JsonProperty(JSON_PROPERTY_RET_INPUT_VOLTAGE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetInputVoltageFrom(BigDecimal retInputVoltageFrom) {
    this.retInputVoltageFrom = retInputVoltageFrom;
  }


  public DeviceMasterAntennaData type(String type) {
    
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


  public DeviceMasterAntennaData manufacturer(String manufacturer) {
    
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


  public DeviceMasterAntennaData antennaOpFrequencyBandFrom(BigDecimal antennaOpFrequencyBandFrom) {
    
    this.antennaOpFrequencyBandFrom = antennaOpFrequencyBandFrom;
    return this;
  }

   /**
   * Get antennaOpFrequencyBandFrom
   * @return antennaOpFrequencyBandFrom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAntennaOpFrequencyBandFrom() {
    return antennaOpFrequencyBandFrom;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaOpFrequencyBandFrom(BigDecimal antennaOpFrequencyBandFrom) {
    this.antennaOpFrequencyBandFrom = antennaOpFrequencyBandFrom;
  }


  public DeviceMasterAntennaData retRemark(String retRemark) {
    
    this.retRemark = retRemark;
    return this;
  }

   /**
   * Get retRemark
   * @return retRemark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RET_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetRemark() {
    return retRemark;
  }


  @JsonProperty(JSON_PROPERTY_RET_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetRemark(String retRemark) {
    this.retRemark = retRemark;
  }


  public DeviceMasterAntennaData antennaRfConnectorLocation(String antennaRfConnectorLocation) {
    
    this.antennaRfConnectorLocation = antennaRfConnectorLocation;
    return this;
  }

   /**
   * Get antennaRfConnectorLocation
   * @return antennaRfConnectorLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_RF_CONNECTOR_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAntennaRfConnectorLocation() {
    return antennaRfConnectorLocation;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_RF_CONNECTOR_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaRfConnectorLocation(String antennaRfConnectorLocation) {
    this.antennaRfConnectorLocation = antennaRfConnectorLocation;
  }


  public DeviceMasterAntennaData function(String function) {
    
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


  public DeviceMasterAntennaData windLoadingMax(String windLoadingMax) {
    
    this.windLoadingMax = windLoadingMax;
    return this;
  }

   /**
   * Get windLoadingMax
   * @return windLoadingMax
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIND_LOADING_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindLoadingMax() {
    return windLoadingMax;
  }


  @JsonProperty(JSON_PROPERTY_WIND_LOADING_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindLoadingMax(String windLoadingMax) {
    this.windLoadingMax = windLoadingMax;
  }


  public DeviceMasterAntennaData antennaOpFrequencyBandTo(BigDecimal antennaOpFrequencyBandTo) {
    
    this.antennaOpFrequencyBandTo = antennaOpFrequencyBandTo;
    return this;
  }

   /**
   * Get antennaOpFrequencyBandTo
   * @return antennaOpFrequencyBandTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAntennaOpFrequencyBandTo() {
    return antennaOpFrequencyBandTo;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_OP_FREQUENCY_BAND_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaOpFrequencyBandTo(BigDecimal antennaOpFrequencyBandTo) {
    this.antennaOpFrequencyBandTo = antennaOpFrequencyBandTo;
  }


  public DeviceMasterAntennaData manufacturerArticleNumber(String manufacturerArticleNumber) {
    
    this.manufacturerArticleNumber = manufacturerArticleNumber;
    return this;
  }

   /**
   * Get manufacturerArticleNumber
   * @return manufacturerArticleNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturerArticleNumber() {
    return manufacturerArticleNumber;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturerArticleNumber(String manufacturerArticleNumber) {
    this.manufacturerArticleNumber = manufacturerArticleNumber;
  }


  public DeviceMasterAntennaData dimensionDepth(BigDecimal dimensionDepth) {
    
    this.dimensionDepth = dimensionDepth;
    return this;
  }

   /**
   * Get dimensionDepth
   * @return dimensionDepth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDimensionDepth() {
    return dimensionDepth;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionDepth(BigDecimal dimensionDepth) {
    this.dimensionDepth = dimensionDepth;
  }


  public DeviceMasterAntennaData retProtocol(String retProtocol) {
    
    this.retProtocol = retProtocol;
    return this;
  }

   /**
   * Get retProtocol
   * @return retProtocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RET_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetProtocol() {
    return retProtocol;
  }


  @JsonProperty(JSON_PROPERTY_RET_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetProtocol(String retProtocol) {
    this.retProtocol = retProtocol;
  }


  public DeviceMasterAntennaData antennaPolarisation(String antennaPolarisation) {
    
    this.antennaPolarisation = antennaPolarisation;
    return this;
  }

   /**
   * Get antennaPolarisation
   * @return antennaPolarisation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_POLARISATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAntennaPolarisation() {
    return antennaPolarisation;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_POLARISATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaPolarisation(String antennaPolarisation) {
    this.antennaPolarisation = antennaPolarisation;
  }


  public DeviceMasterAntennaData dimensionHeight(BigDecimal dimensionHeight) {
    
    this.dimensionHeight = dimensionHeight;
    return this;
  }

   /**
   * Get dimensionHeight
   * @return dimensionHeight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDimensionHeight() {
    return dimensionHeight;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionHeight(BigDecimal dimensionHeight) {
    this.dimensionHeight = dimensionHeight;
  }


  public DeviceMasterAntennaData windLoadingRear(String windLoadingRear) {
    
    this.windLoadingRear = windLoadingRear;
    return this;
  }

   /**
   * Get windLoadingRear
   * @return windLoadingRear
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIND_LOADING_REAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindLoadingRear() {
    return windLoadingRear;
  }


  @JsonProperty(JSON_PROPERTY_WIND_LOADING_REAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindLoadingRear(String windLoadingRear) {
    this.windLoadingRear = windLoadingRear;
  }


  public DeviceMasterAntennaData retInputVoltage(String retInputVoltage) {
    
    this.retInputVoltage = retInputVoltage;
    return this;
  }

   /**
   * Get retInputVoltage
   * @return retInputVoltage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RET_INPUT_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetInputVoltage() {
    return retInputVoltage;
  }


  @JsonProperty(JSON_PROPERTY_RET_INPUT_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetInputVoltage(String retInputVoltage) {
    this.retInputVoltage = retInputVoltage;
  }


  public DeviceMasterAntennaData weight(BigDecimal weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public DeviceMasterAntennaData dimensionWidth(BigDecimal dimensionWidth) {
    
    this.dimensionWidth = dimensionWidth;
    return this;
  }

   /**
   * Get dimensionWidth
   * @return dimensionWidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDimensionWidth() {
    return dimensionWidth;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionWidth(BigDecimal dimensionWidth) {
    this.dimensionWidth = dimensionWidth;
  }


  public DeviceMasterAntennaData windLoadingFront(String windLoadingFront) {
    
    this.windLoadingFront = windLoadingFront;
    return this;
  }

   /**
   * Get windLoadingFront
   * @return windLoadingFront
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIND_LOADING_FRONT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindLoadingFront() {
    return windLoadingFront;
  }


  @JsonProperty(JSON_PROPERTY_WIND_LOADING_FRONT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindLoadingFront(String windLoadingFront) {
    this.windLoadingFront = windLoadingFront;
  }


  public DeviceMasterAntennaData elid(String elid) {
    
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


  public DeviceMasterAntennaData antennaSpecRemark(String antennaSpecRemark) {
    
    this.antennaSpecRemark = antennaSpecRemark;
    return this;
  }

   /**
   * Get antennaSpecRemark
   * @return antennaSpecRemark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_SPEC_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAntennaSpecRemark() {
    return antennaSpecRemark;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_SPEC_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaSpecRemark(String antennaSpecRemark) {
    this.antennaSpecRemark = antennaSpecRemark;
  }


  public DeviceMasterAntennaData antennaBand(String antennaBand) {
    
    this.antennaBand = antennaBand;
    return this;
  }

   /**
   * Get antennaBand
   * @return antennaBand
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_BAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAntennaBand() {
    return antennaBand;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_BAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaBand(String antennaBand) {
    this.antennaBand = antennaBand;
  }


  public DeviceMasterAntennaData isStandard(Boolean isStandard) {
    
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


  public DeviceMasterAntennaData antennaGroundingType(String antennaGroundingType) {
    
    this.antennaGroundingType = antennaGroundingType;
    return this;
  }

   /**
   * Get antennaGroundingType
   * @return antennaGroundingType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_GROUNDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAntennaGroundingType() {
    return antennaGroundingType;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_GROUNDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaGroundingType(String antennaGroundingType) {
    this.antennaGroundingType = antennaGroundingType;
  }


  public DeviceMasterAntennaData windLoadingSide(String windLoadingSide) {
    
    this.windLoadingSide = windLoadingSide;
    return this;
  }

   /**
   * Get windLoadingSide
   * @return windLoadingSide
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIND_LOADING_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindLoadingSide() {
    return windLoadingSide;
  }


  @JsonProperty(JSON_PROPERTY_WIND_LOADING_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindLoadingSide(String windLoadingSide) {
    this.windLoadingSide = windLoadingSide;
  }


  public DeviceMasterAntennaData antennaPortfolioStatus(String antennaPortfolioStatus) {
    
    this.antennaPortfolioStatus = antennaPortfolioStatus;
    return this;
  }

   /**
   * Get antennaPortfolioStatus
   * @return antennaPortfolioStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_PORTFOLIO_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAntennaPortfolioStatus() {
    return antennaPortfolioStatus;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_PORTFOLIO_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaPortfolioStatus(String antennaPortfolioStatus) {
    this.antennaPortfolioStatus = antennaPortfolioStatus;
  }


  public DeviceMasterAntennaData retInputVoltageTo(BigDecimal retInputVoltageTo) {
    
    this.retInputVoltageTo = retInputVoltageTo;
    return this;
  }

   /**
   * Get retInputVoltageTo
   * @return retInputVoltageTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RET_INPUT_VOLTAGE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRetInputVoltageTo() {
    return retInputVoltageTo;
  }


  @JsonProperty(JSON_PROPERTY_RET_INPUT_VOLTAGE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetInputVoltageTo(BigDecimal retInputVoltageTo) {
    this.retInputVoltageTo = retInputVoltageTo;
  }


  public DeviceMasterAntennaData windSpeedMax(String windSpeedMax) {
    
    this.windSpeedMax = windSpeedMax;
    return this;
  }

   /**
   * Get windSpeedMax
   * @return windSpeedMax
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIND_SPEED_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindSpeedMax() {
    return windSpeedMax;
  }


  @JsonProperty(JSON_PROPERTY_WIND_SPEED_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWindSpeedMax(String windSpeedMax) {
    this.windSpeedMax = windSpeedMax;
  }


  public DeviceMasterAntennaData antennaMaxEffPower(BigDecimal antennaMaxEffPower) {
    
    this.antennaMaxEffPower = antennaMaxEffPower;
    return this;
  }

   /**
   * Get antennaMaxEffPower
   * @return antennaMaxEffPower
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTENNA_MAX_EFF_POWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAntennaMaxEffPower() {
    return antennaMaxEffPower;
  }


  @JsonProperty(JSON_PROPERTY_ANTENNA_MAX_EFF_POWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntennaMaxEffPower(BigDecimal antennaMaxEffPower) {
    this.antennaMaxEffPower = antennaMaxEffPower;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMasterAntennaData deviceMasterAntennaData = (DeviceMasterAntennaData) o;
    return Objects.equals(this.remark, deviceMasterAntennaData.remark) &&
        Objects.equals(this.explanation, deviceMasterAntennaData.explanation) &&
        Objects.equals(this.retInputVoltageFrom, deviceMasterAntennaData.retInputVoltageFrom) &&
        Objects.equals(this.type, deviceMasterAntennaData.type) &&
        Objects.equals(this.manufacturer, deviceMasterAntennaData.manufacturer) &&
        Objects.equals(this.antennaOpFrequencyBandFrom, deviceMasterAntennaData.antennaOpFrequencyBandFrom) &&
        Objects.equals(this.retRemark, deviceMasterAntennaData.retRemark) &&
        Objects.equals(this.antennaRfConnectorLocation, deviceMasterAntennaData.antennaRfConnectorLocation) &&
        Objects.equals(this.function, deviceMasterAntennaData.function) &&
        Objects.equals(this.windLoadingMax, deviceMasterAntennaData.windLoadingMax) &&
        Objects.equals(this.antennaOpFrequencyBandTo, deviceMasterAntennaData.antennaOpFrequencyBandTo) &&
        Objects.equals(this.manufacturerArticleNumber, deviceMasterAntennaData.manufacturerArticleNumber) &&
        Objects.equals(this.dimensionDepth, deviceMasterAntennaData.dimensionDepth) &&
        Objects.equals(this.retProtocol, deviceMasterAntennaData.retProtocol) &&
        Objects.equals(this.antennaPolarisation, deviceMasterAntennaData.antennaPolarisation) &&
        Objects.equals(this.dimensionHeight, deviceMasterAntennaData.dimensionHeight) &&
        Objects.equals(this.windLoadingRear, deviceMasterAntennaData.windLoadingRear) &&
        Objects.equals(this.retInputVoltage, deviceMasterAntennaData.retInputVoltage) &&
        Objects.equals(this.weight, deviceMasterAntennaData.weight) &&
        Objects.equals(this.dimensionWidth, deviceMasterAntennaData.dimensionWidth) &&
        Objects.equals(this.windLoadingFront, deviceMasterAntennaData.windLoadingFront) &&
        Objects.equals(this.elid, deviceMasterAntennaData.elid) &&
        Objects.equals(this.antennaSpecRemark, deviceMasterAntennaData.antennaSpecRemark) &&
        Objects.equals(this.antennaBand, deviceMasterAntennaData.antennaBand) &&
        Objects.equals(this.isStandard, deviceMasterAntennaData.isStandard) &&
        Objects.equals(this.antennaGroundingType, deviceMasterAntennaData.antennaGroundingType) &&
        Objects.equals(this.windLoadingSide, deviceMasterAntennaData.windLoadingSide) &&
        Objects.equals(this.antennaPortfolioStatus, deviceMasterAntennaData.antennaPortfolioStatus) &&
        Objects.equals(this.retInputVoltageTo, deviceMasterAntennaData.retInputVoltageTo) &&
        Objects.equals(this.windSpeedMax, deviceMasterAntennaData.windSpeedMax) &&
        Objects.equals(this.antennaMaxEffPower, deviceMasterAntennaData.antennaMaxEffPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remark, explanation, retInputVoltageFrom, type, manufacturer, antennaOpFrequencyBandFrom, retRemark, antennaRfConnectorLocation, function, windLoadingMax, antennaOpFrequencyBandTo, manufacturerArticleNumber, dimensionDepth, retProtocol, antennaPolarisation, dimensionHeight, windLoadingRear, retInputVoltage, weight, dimensionWidth, windLoadingFront, elid, antennaSpecRemark, antennaBand, isStandard, antennaGroundingType, windLoadingSide, antennaPortfolioStatus, retInputVoltageTo, windSpeedMax, antennaMaxEffPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMasterAntennaData {\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    retInputVoltageFrom: ").append(toIndentedString(retInputVoltageFrom)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    antennaOpFrequencyBandFrom: ").append(toIndentedString(antennaOpFrequencyBandFrom)).append("\n");
    sb.append("    retRemark: ").append(toIndentedString(retRemark)).append("\n");
    sb.append("    antennaRfConnectorLocation: ").append(toIndentedString(antennaRfConnectorLocation)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    windLoadingMax: ").append(toIndentedString(windLoadingMax)).append("\n");
    sb.append("    antennaOpFrequencyBandTo: ").append(toIndentedString(antennaOpFrequencyBandTo)).append("\n");
    sb.append("    manufacturerArticleNumber: ").append(toIndentedString(manufacturerArticleNumber)).append("\n");
    sb.append("    dimensionDepth: ").append(toIndentedString(dimensionDepth)).append("\n");
    sb.append("    retProtocol: ").append(toIndentedString(retProtocol)).append("\n");
    sb.append("    antennaPolarisation: ").append(toIndentedString(antennaPolarisation)).append("\n");
    sb.append("    dimensionHeight: ").append(toIndentedString(dimensionHeight)).append("\n");
    sb.append("    windLoadingRear: ").append(toIndentedString(windLoadingRear)).append("\n");
    sb.append("    retInputVoltage: ").append(toIndentedString(retInputVoltage)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    dimensionWidth: ").append(toIndentedString(dimensionWidth)).append("\n");
    sb.append("    windLoadingFront: ").append(toIndentedString(windLoadingFront)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    antennaSpecRemark: ").append(toIndentedString(antennaSpecRemark)).append("\n");
    sb.append("    antennaBand: ").append(toIndentedString(antennaBand)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    antennaGroundingType: ").append(toIndentedString(antennaGroundingType)).append("\n");
    sb.append("    windLoadingSide: ").append(toIndentedString(windLoadingSide)).append("\n");
    sb.append("    antennaPortfolioStatus: ").append(toIndentedString(antennaPortfolioStatus)).append("\n");
    sb.append("    retInputVoltageTo: ").append(toIndentedString(retInputVoltageTo)).append("\n");
    sb.append("    windSpeedMax: ").append(toIndentedString(windSpeedMax)).append("\n");
    sb.append("    antennaMaxEffPower: ").append(toIndentedString(antennaMaxEffPower)).append("\n");
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

