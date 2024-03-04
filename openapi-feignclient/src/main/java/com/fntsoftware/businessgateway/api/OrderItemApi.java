package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateOrderItemRequestData;
import com.fntsoftware.businessgateway.entities.CreateOrderItemResponse;
import com.fntsoftware.businessgateway.entities.DeleteOrderItemRequestData;
import com.fntsoftware.businessgateway.entities.DeleteOrderItemResponse;
import com.fntsoftware.businessgateway.entities.OrderItemDeliveriesRequestData;
import com.fntsoftware.businessgateway.entities.OrderItemDeliveriesResponseData;
import com.fntsoftware.businessgateway.entities.OrderItemOrderRequestData;
import com.fntsoftware.businessgateway.entities.OrderItemOrderResponseData;
import com.fntsoftware.businessgateway.entities.OrderItemQueryRequest;
import com.fntsoftware.businessgateway.entities.OrderItemQueryResponse;
import com.fntsoftware.businessgateway.entities.OrderItemSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.OrderItemSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOrderItemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOrderItemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface OrderItemApi extends ApiClient.Api {


  /**
   * Create
   * Create Order item
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateOrderItemResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateOrderItemResponse createOrderItem(@Param("sessionId") String sessionId, CreateOrderItemRequestData body);

  /**
   * Create
   * Similar to <code>createOrderItem</code> but it also returns the http response headers .
   * Create Order item
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateOrderItemResponse> createOrderItemWithHttpInfo(@Param("sessionId") String sessionId, CreateOrderItemRequestData body);


  /**
   * Create
   * Create Order item
   * Note, this is equivalent to the other <code>createOrderItem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateOrderItemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateOrderItemResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateOrderItemResponse createOrderItem(CreateOrderItemRequestData body, @QueryMap(encoded=true) CreateOrderItemQueryParams queryParams);

  /**
  * Create
  * Create Order item
  * Note, this is equivalent to the other <code>createOrderItem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateOrderItemResponse
      */
      @RequestLine("POST /api/rest/entity/orderItem/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateOrderItemResponse> createOrderItemWithHttpInfo(CreateOrderItemRequestData body, @QueryMap(encoded=true) CreateOrderItemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createOrderItem</code> method in a fluent style.
   */
  public static class CreateOrderItemQueryParams extends HashMap<String, Object> {
    public CreateOrderItemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Order item
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteOrderItemResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteOrderItemResponse deleteOrderItem(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOrderItemRequestData body);

  /**
   * Delete
   * Similar to <code>deleteOrderItem</code> but it also returns the http response headers .
   * Delete Order item
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteOrderItemResponse> deleteOrderItemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOrderItemRequestData body);


  /**
   * Delete
   * Delete Order item
   * Note, this is equivalent to the other <code>deleteOrderItem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOrderItemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteOrderItemResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteOrderItemResponse deleteOrderItem(@Param("elid") String elid, DeleteOrderItemRequestData body, @QueryMap(encoded=true) DeleteOrderItemQueryParams queryParams);

  /**
  * Delete
  * Delete Order item
  * Note, this is equivalent to the other <code>deleteOrderItem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteOrderItemResponse
      */
      @RequestLine("POST /api/rest/entity/orderItem/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteOrderItemResponse> deleteOrderItemWithHttpInfo(@Param("elid") String elid, DeleteOrderItemRequestData body, @QueryMap(encoded=true) DeleteOrderItemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOrderItem</code> method in a fluent style.
   */
  public static class DeleteOrderItemQueryParams extends HashMap<String, Object> {
    public DeleteOrderItemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Delivery entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrderItemDeliveriesResponseData
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/Deliveries?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderItemDeliveriesResponseData orderItemDeliveries(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderItemDeliveriesRequestData body);

  /**
   * Get relations to Delivery entities
   * Similar to <code>orderItemDeliveries</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/Deliveries?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderItemDeliveriesResponseData> orderItemDeliveriesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderItemDeliveriesRequestData body);


  /**
   * Get relations to Delivery entities
   * 
   * Note, this is equivalent to the other <code>orderItemDeliveries</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderItemDeliveriesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderItemDeliveriesResponseData
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/Deliveries?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderItemDeliveriesResponseData orderItemDeliveries(@Param("elid") String elid, OrderItemDeliveriesRequestData body, @QueryMap(encoded=true) OrderItemDeliveriesQueryParams queryParams);

  /**
  * Get relations to Delivery entities
  * 
  * Note, this is equivalent to the other <code>orderItemDeliveries</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderItemDeliveriesResponseData
      */
      @RequestLine("POST /api/rest/entity/orderItem/{elid}/Deliveries?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderItemDeliveriesResponseData> orderItemDeliveriesWithHttpInfo(@Param("elid") String elid, OrderItemDeliveriesRequestData body, @QueryMap(encoded=true) OrderItemDeliveriesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderItemDeliveries</code> method in a fluent style.
   */
  public static class OrderItemDeliveriesQueryParams extends HashMap<String, Object> {
    public OrderItemDeliveriesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Order entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrderItemOrderResponseData
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/Order?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderItemOrderResponseData orderItemOrder(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderItemOrderRequestData body);

  /**
   * Get relations to Order entities
   * Similar to <code>orderItemOrder</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/Order?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderItemOrderResponseData> orderItemOrderWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderItemOrderRequestData body);


  /**
   * Get relations to Order entities
   * 
   * Note, this is equivalent to the other <code>orderItemOrder</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderItemOrderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderItemOrderResponseData
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/Order?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderItemOrderResponseData orderItemOrder(@Param("elid") String elid, OrderItemOrderRequestData body, @QueryMap(encoded=true) OrderItemOrderQueryParams queryParams);

  /**
  * Get relations to Order entities
  * 
  * Note, this is equivalent to the other <code>orderItemOrder</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderItemOrderResponseData
      */
      @RequestLine("POST /api/rest/entity/orderItem/{elid}/Order?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderItemOrderResponseData> orderItemOrderWithHttpInfo(@Param("elid") String elid, OrderItemOrderRequestData body, @QueryMap(encoded=true) OrderItemOrderQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderItemOrder</code> method in a fluent style.
   */
  public static class OrderItemOrderQueryParams extends HashMap<String, Object> {
    public OrderItemOrderQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return OrderItemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderItemQueryResponse orderItemQuery(@Param("sessionId") String sessionId, OrderItemQueryRequest body);

  /**
   * Basic query
   * Similar to <code>orderItemQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderItemQueryResponse> orderItemQueryWithHttpInfo(@Param("sessionId") String sessionId, OrderItemQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>orderItemQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderItemQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderItemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderItemQueryResponse orderItemQuery(OrderItemQueryRequest body, @QueryMap(encoded=true) OrderItemQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>orderItemQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderItemQueryResponse
      */
      @RequestLine("POST /api/rest/entity/orderItem/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderItemQueryResponse> orderItemQueryWithHttpInfo(OrderItemQueryRequest body, @QueryMap(encoded=true) OrderItemQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderItemQuery</code> method in a fluent style.
   */
  public static class OrderItemQueryQueryParams extends HashMap<String, Object> {
    public OrderItemQueryQueryParams sessionId(final String value) {
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
   * @return OrderItemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderItemSystemAttributesResponse orderItemSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderItemSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>orderItemSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderItemSystemAttributesResponse> orderItemSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrderItemSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>orderItemSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderItemSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderItemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderItemSystemAttributesResponse orderItemSystemAttributes(@Param("elid") String elid, OrderItemSystemAttributesRequest body, @QueryMap(encoded=true) OrderItemSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>orderItemSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderItemSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/orderItem/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderItemSystemAttributesResponse> orderItemSystemAttributesWithHttpInfo(@Param("elid") String elid, OrderItemSystemAttributesRequest body, @QueryMap(encoded=true) OrderItemSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderItemSystemAttributes</code> method in a fluent style.
   */
  public static class OrderItemSystemAttributesQueryParams extends HashMap<String, Object> {
    public OrderItemSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesOrderItemResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesOrderItemResponse updateSystemAttributesOrderItem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOrderItemRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesOrderItem</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesOrderItemResponse> updateSystemAttributesOrderItemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOrderItemRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesOrderItem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesOrderItemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesOrderItemResponse
   */
  @RequestLine("POST /api/rest/entity/orderItem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesOrderItemResponse updateSystemAttributesOrderItem(@Param("elid") String elid, UpdateSystemAttributesOrderItemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOrderItemQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesOrderItem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesOrderItemResponse
      */
      @RequestLine("POST /api/rest/entity/orderItem/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesOrderItemResponse> updateSystemAttributesOrderItemWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesOrderItemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOrderItemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesOrderItem</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesOrderItemQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesOrderItemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
