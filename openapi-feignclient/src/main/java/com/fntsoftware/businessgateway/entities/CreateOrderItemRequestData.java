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
import com.fntsoftware.businessgateway.entities.CreateOrderItemCreateLinkOrderRequestData;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateOrderItemRequestData
 */
@JsonPropertyOrder({
  CreateOrderItemRequestData.JSON_PROPERTY_SOURCE_ID,
  CreateOrderItemRequestData.JSON_PROPERTY_OWNER_SYSTEM,
  CreateOrderItemRequestData.JSON_PROPERTY_QUANTITY,
  CreateOrderItemRequestData.JSON_PROPERTY_TYPE_ELID,
  CreateOrderItemRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  CreateOrderItemRequestData.JSON_PROPERTY_CONTEXT_ID,
  CreateOrderItemRequestData.JSON_PROPERTY_ITEM_NO,
  CreateOrderItemRequestData.JSON_PROPERTY_CREATE_LINK_ORDER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CreateOrderItemRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_OWNER_SYSTEM = "ownerSystem";
  private String ownerSystem;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_ITEM_NO = "itemNo";
  private String itemNo;

  public static final String JSON_PROPERTY_CREATE_LINK_ORDER = "createLinkOrder";
  private CreateOrderItemCreateLinkOrderRequestData createLinkOrder;

  public CreateOrderItemRequestData() {
  }

  public CreateOrderItemRequestData sourceId(String sourceId) {
    
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


  public CreateOrderItemRequestData ownerSystem(String ownerSystem) {
    
    this.ownerSystem = ownerSystem;
    return this;
  }

   /**
   * Get ownerSystem
   * @return ownerSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerSystem() {
    return ownerSystem;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerSystem(String ownerSystem) {
    this.ownerSystem = ownerSystem;
  }


  public CreateOrderItemRequestData quantity(BigDecimal quantity) {
    
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


  public CreateOrderItemRequestData typeElid(String typeElid) {
    
    this.typeElid = typeElid;
    return this;
  }

   /**
   * Get typeElid
   * @return typeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(String typeElid) {
    this.typeElid = typeElid;
  }


  public CreateOrderItemRequestData sourceSystem(String sourceSystem) {
    
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


  public CreateOrderItemRequestData contextId(String contextId) {
    
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


  public CreateOrderItemRequestData itemNo(String itemNo) {
    
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


  public CreateOrderItemRequestData createLinkOrder(CreateOrderItemCreateLinkOrderRequestData createLinkOrder) {
    
    this.createLinkOrder = createLinkOrder;
    return this;
  }

   /**
   * Get createLinkOrder
   * @return createLinkOrder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateOrderItemCreateLinkOrderRequestData getCreateLinkOrder() {
    return createLinkOrder;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkOrder(CreateOrderItemCreateLinkOrderRequestData createLinkOrder) {
    this.createLinkOrder = createLinkOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderItemRequestData createOrderItemRequestData = (CreateOrderItemRequestData) o;
    return Objects.equals(this.sourceId, createOrderItemRequestData.sourceId) &&
        Objects.equals(this.ownerSystem, createOrderItemRequestData.ownerSystem) &&
        Objects.equals(this.quantity, createOrderItemRequestData.quantity) &&
        Objects.equals(this.typeElid, createOrderItemRequestData.typeElid) &&
        Objects.equals(this.sourceSystem, createOrderItemRequestData.sourceSystem) &&
        Objects.equals(this.contextId, createOrderItemRequestData.contextId) &&
        Objects.equals(this.itemNo, createOrderItemRequestData.itemNo) &&
        Objects.equals(this.createLinkOrder, createOrderItemRequestData.createLinkOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, ownerSystem, quantity, typeElid, sourceSystem, contextId, itemNo, createLinkOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderItemRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    ownerSystem: ").append(toIndentedString(ownerSystem)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    createLinkOrder: ").append(toIndentedString(createLinkOrder)).append("\n");
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
