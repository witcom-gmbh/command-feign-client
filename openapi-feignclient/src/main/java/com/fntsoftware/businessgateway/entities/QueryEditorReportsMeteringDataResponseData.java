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
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * QueryEditorReportsMeteringDataResponseData
 */
@JsonPropertyOrder({
  QueryEditorReportsMeteringDataResponseData.JSON_PROPERTY_WITCOM_QED_METERING_DATA_SERVICEID,
  QueryEditorReportsMeteringDataResponseData.JSON_PROPERTY_WITCOM_QED_METERING_DATA_COLLECTION_DATE,
  QueryEditorReportsMeteringDataResponseData.JSON_PROPERTY_NUMBER_OF_DUPLICATES,
  QueryEditorReportsMeteringDataResponseData.JSON_PROPERTY_STCDEV_DEVICE_SERIAL_NO,
  QueryEditorReportsMeteringDataResponseData.JSON_PROPERTY_WITCOM_QED_METERING_DATA_COUNTER_READING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class QueryEditorReportsMeteringDataResponseData {
  public static final String JSON_PROPERTY_WITCOM_QED_METERING_DATA_SERVICEID = "witcomQedMeteringDataServiceid";
  private String witcomQedMeteringDataServiceid;

  public static final String JSON_PROPERTY_WITCOM_QED_METERING_DATA_COLLECTION_DATE = "witcomQedMeteringDataCollectionDate";
  private DateTime witcomQedMeteringDataCollectionDate;

  public static final String JSON_PROPERTY_NUMBER_OF_DUPLICATES = "numberOfDuplicates";
  private BigDecimal numberOfDuplicates;

  public static final String JSON_PROPERTY_STCDEV_DEVICE_SERIAL_NO = "stcdevDeviceSerialNo";
  private String stcdevDeviceSerialNo;

  public static final String JSON_PROPERTY_WITCOM_QED_METERING_DATA_COUNTER_READING = "witcomQedMeteringDataCounterReading";
  private BigDecimal witcomQedMeteringDataCounterReading;

  public QueryEditorReportsMeteringDataResponseData() {
  }

  public QueryEditorReportsMeteringDataResponseData witcomQedMeteringDataServiceid(String witcomQedMeteringDataServiceid) {
    
    this.witcomQedMeteringDataServiceid = witcomQedMeteringDataServiceid;
    return this;
  }

   /**
   * Get witcomQedMeteringDataServiceid
   * @return witcomQedMeteringDataServiceid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITCOM_QED_METERING_DATA_SERVICEID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWitcomQedMeteringDataServiceid() {
    return witcomQedMeteringDataServiceid;
  }


  @JsonProperty(JSON_PROPERTY_WITCOM_QED_METERING_DATA_SERVICEID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWitcomQedMeteringDataServiceid(String witcomQedMeteringDataServiceid) {
    this.witcomQedMeteringDataServiceid = witcomQedMeteringDataServiceid;
  }


  public QueryEditorReportsMeteringDataResponseData witcomQedMeteringDataCollectionDate(DateTime witcomQedMeteringDataCollectionDate) {
    
    this.witcomQedMeteringDataCollectionDate = witcomQedMeteringDataCollectionDate;
    return this;
  }

   /**
   * Get witcomQedMeteringDataCollectionDate
   * @return witcomQedMeteringDataCollectionDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITCOM_QED_METERING_DATA_COLLECTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getWitcomQedMeteringDataCollectionDate() {
    return witcomQedMeteringDataCollectionDate;
  }


  @JsonProperty(JSON_PROPERTY_WITCOM_QED_METERING_DATA_COLLECTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWitcomQedMeteringDataCollectionDate(DateTime witcomQedMeteringDataCollectionDate) {
    this.witcomQedMeteringDataCollectionDate = witcomQedMeteringDataCollectionDate;
  }


  public QueryEditorReportsMeteringDataResponseData numberOfDuplicates(BigDecimal numberOfDuplicates) {
    
    this.numberOfDuplicates = numberOfDuplicates;
    return this;
  }

   /**
   * Get numberOfDuplicates
   * @return numberOfDuplicates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DUPLICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberOfDuplicates() {
    return numberOfDuplicates;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DUPLICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfDuplicates(BigDecimal numberOfDuplicates) {
    this.numberOfDuplicates = numberOfDuplicates;
  }


  public QueryEditorReportsMeteringDataResponseData stcdevDeviceSerialNo(String stcdevDeviceSerialNo) {
    
    this.stcdevDeviceSerialNo = stcdevDeviceSerialNo;
    return this;
  }

   /**
   * Get stcdevDeviceSerialNo
   * @return stcdevDeviceSerialNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STCDEV_DEVICE_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStcdevDeviceSerialNo() {
    return stcdevDeviceSerialNo;
  }


  @JsonProperty(JSON_PROPERTY_STCDEV_DEVICE_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStcdevDeviceSerialNo(String stcdevDeviceSerialNo) {
    this.stcdevDeviceSerialNo = stcdevDeviceSerialNo;
  }


  public QueryEditorReportsMeteringDataResponseData witcomQedMeteringDataCounterReading(BigDecimal witcomQedMeteringDataCounterReading) {
    
    this.witcomQedMeteringDataCounterReading = witcomQedMeteringDataCounterReading;
    return this;
  }

   /**
   * Get witcomQedMeteringDataCounterReading
   * @return witcomQedMeteringDataCounterReading
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITCOM_QED_METERING_DATA_COUNTER_READING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWitcomQedMeteringDataCounterReading() {
    return witcomQedMeteringDataCounterReading;
  }


  @JsonProperty(JSON_PROPERTY_WITCOM_QED_METERING_DATA_COUNTER_READING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWitcomQedMeteringDataCounterReading(BigDecimal witcomQedMeteringDataCounterReading) {
    this.witcomQedMeteringDataCounterReading = witcomQedMeteringDataCounterReading;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEditorReportsMeteringDataResponseData queryEditorReportsMeteringDataResponseData = (QueryEditorReportsMeteringDataResponseData) o;
    return Objects.equals(this.witcomQedMeteringDataServiceid, queryEditorReportsMeteringDataResponseData.witcomQedMeteringDataServiceid) &&
        Objects.equals(this.witcomQedMeteringDataCollectionDate, queryEditorReportsMeteringDataResponseData.witcomQedMeteringDataCollectionDate) &&
        Objects.equals(this.numberOfDuplicates, queryEditorReportsMeteringDataResponseData.numberOfDuplicates) &&
        Objects.equals(this.stcdevDeviceSerialNo, queryEditorReportsMeteringDataResponseData.stcdevDeviceSerialNo) &&
        Objects.equals(this.witcomQedMeteringDataCounterReading, queryEditorReportsMeteringDataResponseData.witcomQedMeteringDataCounterReading);
  }

  @Override
  public int hashCode() {
    return Objects.hash(witcomQedMeteringDataServiceid, witcomQedMeteringDataCollectionDate, numberOfDuplicates, stcdevDeviceSerialNo, witcomQedMeteringDataCounterReading);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEditorReportsMeteringDataResponseData {\n");
    sb.append("    witcomQedMeteringDataServiceid: ").append(toIndentedString(witcomQedMeteringDataServiceid)).append("\n");
    sb.append("    witcomQedMeteringDataCollectionDate: ").append(toIndentedString(witcomQedMeteringDataCollectionDate)).append("\n");
    sb.append("    numberOfDuplicates: ").append(toIndentedString(numberOfDuplicates)).append("\n");
    sb.append("    stcdevDeviceSerialNo: ").append(toIndentedString(stcdevDeviceSerialNo)).append("\n");
    sb.append("    witcomQedMeteringDataCounterReading: ").append(toIndentedString(witcomQedMeteringDataCounterReading)).append("\n");
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
