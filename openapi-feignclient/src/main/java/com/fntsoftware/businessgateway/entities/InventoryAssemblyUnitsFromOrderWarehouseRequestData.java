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
 * InventoryAssemblyUnitsFromOrderWarehouseRequestData
 */
@JsonPropertyOrder({
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_WARRANTY_END,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_ORDER_NO,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_QUANTITY,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_DELIVERY_NO,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_VISIBLE_ID,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_WARRANTY_TYPE,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_ID,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_ITEM_NO,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_DELIVERY_DATE,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_COLLECTION_MAIN_ELID,
  InventoryAssemblyUnitsFromOrderWarehouseRequestData.JSON_PROPERTY_WARRANTY_START
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class InventoryAssemblyUnitsFromOrderWarehouseRequestData {
  public static final String JSON_PROPERTY_WARRANTY_END = "warrantyEnd";
  private DateTime warrantyEnd;

  public static final String JSON_PROPERTY_ORDER_NO = "orderNo";
  private String orderNo;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_DELIVERY_NO = "deliveryNo";
  private String deliveryNo;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_WARRANTY_TYPE = "warrantyType";
  private String warrantyType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ITEM_NO = "itemNo";
  private String itemNo;

  public static final String JSON_PROPERTY_DELIVERY_DATE = "deliveryDate";
  private DateTime deliveryDate;

  public static final String JSON_PROPERTY_COLLECTION_MAIN_ELID = "collectionMainElid";
  private String collectionMainElid;

  public static final String JSON_PROPERTY_WARRANTY_START = "warrantyStart";
  private DateTime warrantyStart;

  public InventoryAssemblyUnitsFromOrderWarehouseRequestData() {
  }

  public InventoryAssemblyUnitsFromOrderWarehouseRequestData warrantyEnd(DateTime warrantyEnd) {
    
    this.warrantyEnd = warrantyEnd;
    return this;
  }

   /**
   * Get warrantyEnd
   * @return warrantyEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARRANTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getWarrantyEnd() {
    return warrantyEnd;
  }


  @JsonProperty(JSON_PROPERTY_WARRANTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarrantyEnd(DateTime warrantyEnd) {
    this.warrantyEnd = warrantyEnd;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderNo() {
    return orderNo;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData deliveryNo(String deliveryNo) {
    
    this.deliveryNo = deliveryNo;
    return this;
  }

   /**
   * Get deliveryNo
   * @return deliveryNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveryNo() {
    return deliveryNo;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryNo(String deliveryNo) {
    this.deliveryNo = deliveryNo;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData visibleId(String visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData warrantyType(String warrantyType) {
    
    this.warrantyType = warrantyType;
    return this;
  }

   /**
   * Get warrantyType
   * @return warrantyType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARRANTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWarrantyType() {
    return warrantyType;
  }


  @JsonProperty(JSON_PROPERTY_WARRANTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarrantyType(String warrantyType) {
    this.warrantyType = warrantyType;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData id(String id) {
    
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


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData itemNo(String itemNo) {
    
    this.itemNo = itemNo;
    return this;
  }

   /**
   * Get itemNo
   * @return itemNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEM_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getItemNo() {
    return itemNo;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemNo(String itemNo) {
    this.itemNo = itemNo;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData deliveryDate(DateTime deliveryDate) {
    
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * Get deliveryDate
   * @return deliveryDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getDeliveryDate() {
    return deliveryDate;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryDate(DateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData collectionMainElid(String collectionMainElid) {
    
    this.collectionMainElid = collectionMainElid;
    return this;
  }

   /**
   * Get collectionMainElid
   * @return collectionMainElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTION_MAIN_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectionMainElid() {
    return collectionMainElid;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION_MAIN_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectionMainElid(String collectionMainElid) {
    this.collectionMainElid = collectionMainElid;
  }


  public InventoryAssemblyUnitsFromOrderWarehouseRequestData warrantyStart(DateTime warrantyStart) {
    
    this.warrantyStart = warrantyStart;
    return this;
  }

   /**
   * Get warrantyStart
   * @return warrantyStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARRANTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getWarrantyStart() {
    return warrantyStart;
  }


  @JsonProperty(JSON_PROPERTY_WARRANTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarrantyStart(DateTime warrantyStart) {
    this.warrantyStart = warrantyStart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAssemblyUnitsFromOrderWarehouseRequestData inventoryAssemblyUnitsFromOrderWarehouseRequestData = (InventoryAssemblyUnitsFromOrderWarehouseRequestData) o;
    return Objects.equals(this.warrantyEnd, inventoryAssemblyUnitsFromOrderWarehouseRequestData.warrantyEnd) &&
        Objects.equals(this.orderNo, inventoryAssemblyUnitsFromOrderWarehouseRequestData.orderNo) &&
        Objects.equals(this.quantity, inventoryAssemblyUnitsFromOrderWarehouseRequestData.quantity) &&
        Objects.equals(this.deliveryNo, inventoryAssemblyUnitsFromOrderWarehouseRequestData.deliveryNo) &&
        Objects.equals(this.visibleId, inventoryAssemblyUnitsFromOrderWarehouseRequestData.visibleId) &&
        Objects.equals(this.warrantyType, inventoryAssemblyUnitsFromOrderWarehouseRequestData.warrantyType) &&
        Objects.equals(this.id, inventoryAssemblyUnitsFromOrderWarehouseRequestData.id) &&
        Objects.equals(this.itemNo, inventoryAssemblyUnitsFromOrderWarehouseRequestData.itemNo) &&
        Objects.equals(this.deliveryDate, inventoryAssemblyUnitsFromOrderWarehouseRequestData.deliveryDate) &&
        Objects.equals(this.collectionMainElid, inventoryAssemblyUnitsFromOrderWarehouseRequestData.collectionMainElid) &&
        Objects.equals(this.warrantyStart, inventoryAssemblyUnitsFromOrderWarehouseRequestData.warrantyStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warrantyEnd, orderNo, quantity, deliveryNo, visibleId, warrantyType, id, itemNo, deliveryDate, collectionMainElid, warrantyStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAssemblyUnitsFromOrderWarehouseRequestData {\n");
    sb.append("    warrantyEnd: ").append(toIndentedString(warrantyEnd)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    deliveryNo: ").append(toIndentedString(deliveryNo)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    warrantyType: ").append(toIndentedString(warrantyType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    collectionMainElid: ").append(toIndentedString(collectionMainElid)).append("\n");
    sb.append("    warrantyStart: ").append(toIndentedString(warrantyStart)).append("\n");
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
