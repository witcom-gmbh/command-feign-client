package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateOrderRequestData;
import com.fntsoftware.businessgateway.entities.CreateOrderResponse;
import com.fntsoftware.businessgateway.entities.DeleteOrderRequestData;
import com.fntsoftware.businessgateway.entities.DeleteOrderResponse;
import com.fntsoftware.businessgateway.entities.OrderQueryRequest;
import com.fntsoftware.businessgateway.entities.OrderQueryResponse;
import com.fntsoftware.businessgateway.entities.OrderSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.OrderSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.OrderWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.OrderWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.OrderZoneRequestData;
import com.fntsoftware.businessgateway.entities.OrderZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateOrderRequestData;
import com.fntsoftware.businessgateway.entities.UpdateOrderResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOrderRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOrderResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface OrderApi extends ApiClient.Api {


  /**
   * Create
   * Create Order
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateOrderResponse createOrder(@Param("sessionId") String sessionId, CreateOrderRequestData body);

  /**
   * Create
   * Similar to <code>createOrder</code> but it also returns the http response headers .
   * Create Order
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateOrderResponse> createOrderWithHttpInfo(@Param("sessionId") String sessionId, CreateOrderRequestData body);


  /**
   * Create
   * Create Order
   * Note, this is equivalent to the other <code>createOrder</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateOrderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateOrderResponse createOrder(CreateOrderRequestData body, @QueryMap(encoded=true) CreateOrderQueryParams queryParams);

  /**
  * Create
  * Create Order
  * Note, this is equivalent to the other <code>createOrder</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateOrderResponse
      */
      @RequestLine("POST /api/rest/entity/order/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateOrderResponse> createOrderWithHttpInfo(CreateOrderRequestData body, @QueryMap(encoded=true) CreateOrderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createOrder</code> method in a fluent style.
   */
  public static class CreateOrderQueryParams extends HashMap<String, Object> {
    public CreateOrderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Order
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteOrderResponse deleteOrder(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOrderRequestData body);

  /**
   * Delete
   * Similar to <code>deleteOrder</code> but it also returns the http response headers .
   * Delete Order
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteOrderResponse> deleteOrderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOrderRequestData body);


  /**
   * Delete
   * Delete Order
   * Note, this is equivalent to the other <code>deleteOrder</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOrderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteOrderResponse deleteOrder(@Param("elid") String elid, DeleteOrderRequestData body, @QueryMap(encoded=true) DeleteOrderQueryParams queryParams);

  /**
  * Delete
  * Delete Order
  * Note, this is equivalent to the other <code>deleteOrder</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteOrderResponse
      */
      @RequestLine("POST /api/rest/entity/order/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteOrderResponse> deleteOrderWithHttpInfo(@Param("elid") String elid, DeleteOrderRequestData body, @QueryMap(encoded=true) DeleteOrderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOrder</code> method in a fluent style.
   */
  public static class DeleteOrderQueryParams extends HashMap<String, Object> {
    public DeleteOrderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return OrderQueryResponse
   */
  @RequestLine("POST /api/rest/entity/order/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderQueryResponse orderQuery(@Param("sessionId") String sessionId, OrderQueryRequest body);

  /**
   * Basic query
   * Similar to <code>orderQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderQueryResponse> orderQueryWithHttpInfo(@Param("sessionId") String sessionId, OrderQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>orderQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderQueryResponse
   */
  @RequestLine("POST /api/rest/entity/order/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderQueryResponse orderQuery(OrderQueryRequest body, @QueryMap(encoded=true) OrderQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>orderQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderQueryResponse
      */
      @RequestLine("POST /api/rest/entity/order/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderQueryResponse> orderQueryWithHttpInfo(OrderQueryRequest body, @QueryMap(encoded=true) OrderQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderQuery</code> method in a fluent style.
   */
  public static class OrderQueryQueryParams extends HashMap<String, Object> {
    public OrderQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrderSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderSystemAttributesResponse orderSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>orderSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderSystemAttributesResponse> orderSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>orderSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderSystemAttributesResponse orderSystemAttributes(@Param("elid") String elid, OrderSystemAttributesRequest body, @QueryMap(encoded=true) OrderSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>orderSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/order/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderSystemAttributesResponse> orderSystemAttributesWithHttpInfo(@Param("elid") String elid, OrderSystemAttributesRequest body, @QueryMap(encoded=true) OrderSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderSystemAttributes</code> method in a fluent style.
   */
  public static class OrderSystemAttributesQueryParams extends HashMap<String, Object> {
    public OrderSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Warehouse entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrderWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderWarehouseResponseData orderWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>orderWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderWarehouseResponseData> orderWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>orderWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderWarehouseResponseData orderWarehouse(@Param("elid") String elid, OrderWarehouseRequestData body, @QueryMap(encoded=true) OrderWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>orderWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/order/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderWarehouseResponseData> orderWarehouseWithHttpInfo(@Param("elid") String elid, OrderWarehouseRequestData body, @QueryMap(encoded=true) OrderWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderWarehouse</code> method in a fluent style.
   */
  public static class OrderWarehouseQueryParams extends HashMap<String, Object> {
    public OrderWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrderZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderZoneResponseData orderZone(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>orderZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderZoneResponseData> orderZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>orderZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderZoneResponseData orderZone(@Param("elid") String elid, OrderZoneRequestData body, @QueryMap(encoded=true) OrderZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>orderZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/order/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderZoneResponseData> orderZoneWithHttpInfo(@Param("elid") String elid, OrderZoneRequestData body, @QueryMap(encoded=true) OrderZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderZone</code> method in a fluent style.
   */
  public static class OrderZoneQueryParams extends HashMap<String, Object> {
    public OrderZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Order
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateOrderResponse updateOrder(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateOrderRequestData body);

  /**
   * Modify
   * Similar to <code>updateOrder</code> but it also returns the http response headers .
   * Modify Order
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateOrderResponse> updateOrderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateOrderRequestData body);


  /**
   * Modify
   * Modify Order
   * Note, this is equivalent to the other <code>updateOrder</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateOrderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateOrderResponse updateOrder(@Param("elid") String elid, UpdateOrderRequestData body, @QueryMap(encoded=true) UpdateOrderQueryParams queryParams);

  /**
  * Modify
  * Modify Order
  * Note, this is equivalent to the other <code>updateOrder</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateOrderResponse
      */
      @RequestLine("POST /api/rest/entity/order/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateOrderResponse> updateOrderWithHttpInfo(@Param("elid") String elid, UpdateOrderRequestData body, @QueryMap(encoded=true) UpdateOrderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateOrder</code> method in a fluent style.
   */
  public static class UpdateOrderQueryParams extends HashMap<String, Object> {
    public UpdateOrderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesOrderResponse updateSystemAttributesOrder(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOrderRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesOrder</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesOrderResponse> updateSystemAttributesOrderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOrderRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesOrder</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesOrderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesOrderResponse
   */
  @RequestLine("POST /api/rest/entity/order/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesOrderResponse updateSystemAttributesOrder(@Param("elid") String elid, UpdateSystemAttributesOrderRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOrderQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesOrder</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesOrderResponse
      */
      @RequestLine("POST /api/rest/entity/order/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesOrderResponse> updateSystemAttributesOrderWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesOrderRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOrderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesOrder</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesOrderQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesOrderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
