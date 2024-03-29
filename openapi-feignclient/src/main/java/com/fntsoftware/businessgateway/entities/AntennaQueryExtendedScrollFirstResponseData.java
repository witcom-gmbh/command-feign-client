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
import com.fntsoftware.businessgateway.entities.AntennaqueryExtendedScrollReturnDataItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AntennaQueryExtendedScrollFirstResponseData
 */
@JsonPropertyOrder({
  AntennaQueryExtendedScrollFirstResponseData.JSON_PROPERTY_DATA,
  AntennaQueryExtendedScrollFirstResponseData.JSON_PROPERTY_NEXT_PAGE,
  AntennaQueryExtendedScrollFirstResponseData.JSON_PROPERTY_PAGE,
  AntennaQueryExtendedScrollFirstResponseData.JSON_PROPERTY_DONE,
  AntennaQueryExtendedScrollFirstResponseData.JSON_PROPERTY_SCROLL_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class AntennaQueryExtendedScrollFirstResponseData {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<AntennaqueryExtendedScrollReturnDataItem> data;

  public static final String JSON_PROPERTY_NEXT_PAGE = "nextPage";
  private BigDecimal nextPage;

  public static final String JSON_PROPERTY_PAGE = "page";
  private BigDecimal page;

  public static final String JSON_PROPERTY_DONE = "done";
  private Boolean done;

  public static final String JSON_PROPERTY_SCROLL_ID = "scrollId";
  private BigDecimal scrollId;

  public AntennaQueryExtendedScrollFirstResponseData() {
  }

  public AntennaQueryExtendedScrollFirstResponseData data(List<AntennaqueryExtendedScrollReturnDataItem> data) {
    
    this.data = data;
    return this;
  }

  public AntennaQueryExtendedScrollFirstResponseData addDataItem(AntennaqueryExtendedScrollReturnDataItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AntennaqueryExtendedScrollReturnDataItem> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<AntennaqueryExtendedScrollReturnDataItem> data) {
    this.data = data;
  }


  public AntennaQueryExtendedScrollFirstResponseData nextPage(BigDecimal nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNextPage() {
    return nextPage;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPage(BigDecimal nextPage) {
    this.nextPage = nextPage;
  }


  public AntennaQueryExtendedScrollFirstResponseData page(BigDecimal page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(BigDecimal page) {
    this.page = page;
  }


  public AntennaQueryExtendedScrollFirstResponseData done(Boolean done) {
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDone() {
    return done;
  }


  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDone(Boolean done) {
    this.done = done;
  }


  public AntennaQueryExtendedScrollFirstResponseData scrollId(BigDecimal scrollId) {
    
    this.scrollId = scrollId;
    return this;
  }

   /**
   * Get scrollId
   * @return scrollId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCROLL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getScrollId() {
    return scrollId;
  }


  @JsonProperty(JSON_PROPERTY_SCROLL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScrollId(BigDecimal scrollId) {
    this.scrollId = scrollId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntennaQueryExtendedScrollFirstResponseData antennaQueryExtendedScrollFirstResponseData = (AntennaQueryExtendedScrollFirstResponseData) o;
    return Objects.equals(this.data, antennaQueryExtendedScrollFirstResponseData.data) &&
        Objects.equals(this.nextPage, antennaQueryExtendedScrollFirstResponseData.nextPage) &&
        Objects.equals(this.page, antennaQueryExtendedScrollFirstResponseData.page) &&
        Objects.equals(this.done, antennaQueryExtendedScrollFirstResponseData.done) &&
        Objects.equals(this.scrollId, antennaQueryExtendedScrollFirstResponseData.scrollId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, nextPage, page, done, scrollId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntennaQueryExtendedScrollFirstResponseData {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
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

