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
import com.fntsoftware.businessgateway.entities.ConnectJunctionBoxConnectToDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.ConnectJunctionBoxConnectToJunctionBoxRequestData;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectJunctionBoxRequestData
 */
@JsonPropertyOrder({
  ConnectJunctionBoxRequestData.JSON_PROPERTY_GEO_DIRECTION,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_START_WIRE,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_NUMBER_OF_WIRES,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_CABLE_VISIBLE_ID,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_CABLE_LENGTH,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_CABLE_ID,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_CABLE_TYPE_ELID,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_USE_BUNDLE_CABLE,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_CONNECT_TO_DEVICE_ALL,
  ConnectJunctionBoxRequestData.JSON_PROPERTY_CONNECT_TO_JUNCTION_BOX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ConnectJunctionBoxRequestData {
  public static final String JSON_PROPERTY_GEO_DIRECTION = "geoDirection";
  private String geoDirection;

  public static final String JSON_PROPERTY_START_WIRE = "startWire";
  private BigDecimal startWire;

  public static final String JSON_PROPERTY_NUMBER_OF_WIRES = "numberOfWires";
  private BigDecimal numberOfWires;

  public static final String JSON_PROPERTY_CABLE_VISIBLE_ID = "cableVisibleId";
  private String cableVisibleId;

  public static final String JSON_PROPERTY_CABLE_LENGTH = "cableLength";
  private BigDecimal cableLength;

  public static final String JSON_PROPERTY_CABLE_ID = "cableId";
  private String cableId;

  public static final String JSON_PROPERTY_CABLE_TYPE_ELID = "cableTypeElid";
  private String cableTypeElid;

  public static final String JSON_PROPERTY_USE_BUNDLE_CABLE = "useBundleCable";
  private Boolean useBundleCable;

  public static final String JSON_PROPERTY_CONNECT_TO_DEVICE_ALL = "connectToDeviceAll";
  private ConnectJunctionBoxConnectToDeviceAllRequestData connectToDeviceAll;

  public static final String JSON_PROPERTY_CONNECT_TO_JUNCTION_BOX = "connectToJunctionBox";
  private ConnectJunctionBoxConnectToJunctionBoxRequestData connectToJunctionBox;

  public ConnectJunctionBoxRequestData() {
  }

  public ConnectJunctionBoxRequestData geoDirection(String geoDirection) {
    
    this.geoDirection = geoDirection;
    return this;
  }

   /**
   * Get geoDirection
   * @return geoDirection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeoDirection() {
    return geoDirection;
  }


  @JsonProperty(JSON_PROPERTY_GEO_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoDirection(String geoDirection) {
    this.geoDirection = geoDirection;
  }


  public ConnectJunctionBoxRequestData startWire(BigDecimal startWire) {
    
    this.startWire = startWire;
    return this;
  }

   /**
   * Get startWire
   * @return startWire
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_WIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartWire() {
    return startWire;
  }


  @JsonProperty(JSON_PROPERTY_START_WIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartWire(BigDecimal startWire) {
    this.startWire = startWire;
  }


  public ConnectJunctionBoxRequestData numberOfWires(BigDecimal numberOfWires) {
    
    this.numberOfWires = numberOfWires;
    return this;
  }

   /**
   * Get numberOfWires
   * @return numberOfWires
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_WIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberOfWires() {
    return numberOfWires;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_WIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfWires(BigDecimal numberOfWires) {
    this.numberOfWires = numberOfWires;
  }


  public ConnectJunctionBoxRequestData cableVisibleId(String cableVisibleId) {
    
    this.cableVisibleId = cableVisibleId;
    return this;
  }

   /**
   * Get cableVisibleId
   * @return cableVisibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABLE_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCableVisibleId() {
    return cableVisibleId;
  }


  @JsonProperty(JSON_PROPERTY_CABLE_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCableVisibleId(String cableVisibleId) {
    this.cableVisibleId = cableVisibleId;
  }


  public ConnectJunctionBoxRequestData cableLength(BigDecimal cableLength) {
    
    this.cableLength = cableLength;
    return this;
  }

   /**
   * Get cableLength
   * @return cableLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABLE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCableLength() {
    return cableLength;
  }


  @JsonProperty(JSON_PROPERTY_CABLE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCableLength(BigDecimal cableLength) {
    this.cableLength = cableLength;
  }


  public ConnectJunctionBoxRequestData cableId(String cableId) {
    
    this.cableId = cableId;
    return this;
  }

   /**
   * Get cableId
   * @return cableId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCableId() {
    return cableId;
  }


  @JsonProperty(JSON_PROPERTY_CABLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCableId(String cableId) {
    this.cableId = cableId;
  }


  public ConnectJunctionBoxRequestData cableTypeElid(String cableTypeElid) {
    
    this.cableTypeElid = cableTypeElid;
    return this;
  }

   /**
   * Get cableTypeElid
   * @return cableTypeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABLE_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCableTypeElid() {
    return cableTypeElid;
  }


  @JsonProperty(JSON_PROPERTY_CABLE_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCableTypeElid(String cableTypeElid) {
    this.cableTypeElid = cableTypeElid;
  }


  public ConnectJunctionBoxRequestData useBundleCable(Boolean useBundleCable) {
    
    this.useBundleCable = useBundleCable;
    return this;
  }

   /**
   * Get useBundleCable
   * @return useBundleCable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_BUNDLE_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseBundleCable() {
    return useBundleCable;
  }


  @JsonProperty(JSON_PROPERTY_USE_BUNDLE_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseBundleCable(Boolean useBundleCable) {
    this.useBundleCable = useBundleCable;
  }


  public ConnectJunctionBoxRequestData connectToDeviceAll(ConnectJunctionBoxConnectToDeviceAllRequestData connectToDeviceAll) {
    
    this.connectToDeviceAll = connectToDeviceAll;
    return this;
  }

   /**
   * Get connectToDeviceAll
   * @return connectToDeviceAll
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TO_DEVICE_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectJunctionBoxConnectToDeviceAllRequestData getConnectToDeviceAll() {
    return connectToDeviceAll;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_TO_DEVICE_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectToDeviceAll(ConnectJunctionBoxConnectToDeviceAllRequestData connectToDeviceAll) {
    this.connectToDeviceAll = connectToDeviceAll;
  }


  public ConnectJunctionBoxRequestData connectToJunctionBox(ConnectJunctionBoxConnectToJunctionBoxRequestData connectToJunctionBox) {
    
    this.connectToJunctionBox = connectToJunctionBox;
    return this;
  }

   /**
   * Get connectToJunctionBox
   * @return connectToJunctionBox
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TO_JUNCTION_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectJunctionBoxConnectToJunctionBoxRequestData getConnectToJunctionBox() {
    return connectToJunctionBox;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_TO_JUNCTION_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectToJunctionBox(ConnectJunctionBoxConnectToJunctionBoxRequestData connectToJunctionBox) {
    this.connectToJunctionBox = connectToJunctionBox;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectJunctionBoxRequestData connectJunctionBoxRequestData = (ConnectJunctionBoxRequestData) o;
    return Objects.equals(this.geoDirection, connectJunctionBoxRequestData.geoDirection) &&
        Objects.equals(this.startWire, connectJunctionBoxRequestData.startWire) &&
        Objects.equals(this.numberOfWires, connectJunctionBoxRequestData.numberOfWires) &&
        Objects.equals(this.cableVisibleId, connectJunctionBoxRequestData.cableVisibleId) &&
        Objects.equals(this.cableLength, connectJunctionBoxRequestData.cableLength) &&
        Objects.equals(this.cableId, connectJunctionBoxRequestData.cableId) &&
        Objects.equals(this.cableTypeElid, connectJunctionBoxRequestData.cableTypeElid) &&
        Objects.equals(this.useBundleCable, connectJunctionBoxRequestData.useBundleCable) &&
        Objects.equals(this.connectToDeviceAll, connectJunctionBoxRequestData.connectToDeviceAll) &&
        Objects.equals(this.connectToJunctionBox, connectJunctionBoxRequestData.connectToJunctionBox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoDirection, startWire, numberOfWires, cableVisibleId, cableLength, cableId, cableTypeElid, useBundleCable, connectToDeviceAll, connectToJunctionBox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectJunctionBoxRequestData {\n");
    sb.append("    geoDirection: ").append(toIndentedString(geoDirection)).append("\n");
    sb.append("    startWire: ").append(toIndentedString(startWire)).append("\n");
    sb.append("    numberOfWires: ").append(toIndentedString(numberOfWires)).append("\n");
    sb.append("    cableVisibleId: ").append(toIndentedString(cableVisibleId)).append("\n");
    sb.append("    cableLength: ").append(toIndentedString(cableLength)).append("\n");
    sb.append("    cableId: ").append(toIndentedString(cableId)).append("\n");
    sb.append("    cableTypeElid: ").append(toIndentedString(cableTypeElid)).append("\n");
    sb.append("    useBundleCable: ").append(toIndentedString(useBundleCable)).append("\n");
    sb.append("    connectToDeviceAll: ").append(toIndentedString(connectToDeviceAll)).append("\n");
    sb.append("    connectToJunctionBox: ").append(toIndentedString(connectToJunctionBox)).append("\n");
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
