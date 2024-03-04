package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateBulkOrderDomainOrderDomainRequestData;
import com.fntsoftware.businessgateway.entities.CreateBulkOrderDomainOrderDomainResponse;
import com.fntsoftware.businessgateway.entities.CreateOrderDomainRequestData;
import com.fntsoftware.businessgateway.entities.CreateOrderDomainResponse;
import com.fntsoftware.businessgateway.entities.DeleteOrderDomainRequestData;
import com.fntsoftware.businessgateway.entities.DeleteOrderDomainResponse;
import com.fntsoftware.businessgateway.entities.OrderDomainQueryRequest;
import com.fntsoftware.businessgateway.entities.OrderDomainQueryResponse;
import com.fntsoftware.businessgateway.entities.UpdateOrderDomainRequestData;
import com.fntsoftware.businessgateway.entities.UpdateOrderDomainResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface OrderDomainApi extends ApiClient.Api {


  /**
   * Create bulk for order domain
   * Create bulk order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateBulkOrderDomainOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/createBulkOrderDomain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateBulkOrderDomainOrderDomainResponse createBulkOrderDomainOrderDomain(@Param("sessionId") String sessionId, CreateBulkOrderDomainOrderDomainRequestData body);

  /**
   * Create bulk for order domain
   * Similar to <code>createBulkOrderDomainOrderDomain</code> but it also returns the http response headers .
   * Create bulk order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderDomain/createBulkOrderDomain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateBulkOrderDomainOrderDomainResponse> createBulkOrderDomainOrderDomainWithHttpInfo(@Param("sessionId") String sessionId, CreateBulkOrderDomainOrderDomainRequestData body);


  /**
   * Create bulk for order domain
   * Create bulk order domain
   * Note, this is equivalent to the other <code>createBulkOrderDomainOrderDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateBulkOrderDomainOrderDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateBulkOrderDomainOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/createBulkOrderDomain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateBulkOrderDomainOrderDomainResponse createBulkOrderDomainOrderDomain(CreateBulkOrderDomainOrderDomainRequestData body, @QueryMap(encoded=true) CreateBulkOrderDomainOrderDomainQueryParams queryParams);

  /**
  * Create bulk for order domain
  * Create bulk order domain
  * Note, this is equivalent to the other <code>createBulkOrderDomainOrderDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateBulkOrderDomainOrderDomainResponse
      */
      @RequestLine("POST /api/rest/entity/orderDomain/createBulkOrderDomain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateBulkOrderDomainOrderDomainResponse> createBulkOrderDomainOrderDomainWithHttpInfo(CreateBulkOrderDomainOrderDomainRequestData body, @QueryMap(encoded=true) CreateBulkOrderDomainOrderDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createBulkOrderDomainOrderDomain</code> method in a fluent style.
   */
  public static class CreateBulkOrderDomainOrderDomainQueryParams extends HashMap<String, Object> {
    public CreateBulkOrderDomainOrderDomainQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateOrderDomainResponse createOrderDomain(@Param("sessionId") String sessionId, CreateOrderDomainRequestData body);

  /**
   * Create
   * Similar to <code>createOrderDomain</code> but it also returns the http response headers .
   * Create Order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderDomain/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateOrderDomainResponse> createOrderDomainWithHttpInfo(@Param("sessionId") String sessionId, CreateOrderDomainRequestData body);


  /**
   * Create
   * Create Order domain
   * Note, this is equivalent to the other <code>createOrderDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateOrderDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateOrderDomainResponse createOrderDomain(CreateOrderDomainRequestData body, @QueryMap(encoded=true) CreateOrderDomainQueryParams queryParams);

  /**
  * Create
  * Create Order domain
  * Note, this is equivalent to the other <code>createOrderDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateOrderDomainResponse
      */
      @RequestLine("POST /api/rest/entity/orderDomain/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateOrderDomainResponse> createOrderDomainWithHttpInfo(CreateOrderDomainRequestData body, @QueryMap(encoded=true) CreateOrderDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createOrderDomain</code> method in a fluent style.
   */
  public static class CreateOrderDomainQueryParams extends HashMap<String, Object> {
    public CreateOrderDomainQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteOrderDomainResponse deleteOrderDomain(@Param("sessionId") String sessionId, DeleteOrderDomainRequestData body);

  /**
   * Delete
   * Similar to <code>deleteOrderDomain</code> but it also returns the http response headers .
   * Delete Order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderDomain/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteOrderDomainResponse> deleteOrderDomainWithHttpInfo(@Param("sessionId") String sessionId, DeleteOrderDomainRequestData body);


  /**
   * Delete
   * Delete Order domain
   * Note, this is equivalent to the other <code>deleteOrderDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOrderDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteOrderDomainResponse deleteOrderDomain(DeleteOrderDomainRequestData body, @QueryMap(encoded=true) DeleteOrderDomainQueryParams queryParams);

  /**
  * Delete
  * Delete Order domain
  * Note, this is equivalent to the other <code>deleteOrderDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteOrderDomainResponse
      */
      @RequestLine("POST /api/rest/entity/orderDomain/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteOrderDomainResponse> deleteOrderDomainWithHttpInfo(DeleteOrderDomainRequestData body, @QueryMap(encoded=true) DeleteOrderDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOrderDomain</code> method in a fluent style.
   */
  public static class DeleteOrderDomainQueryParams extends HashMap<String, Object> {
    public DeleteOrderDomainQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return OrderDomainQueryResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrderDomainQueryResponse orderDomainQuery(@Param("sessionId") String sessionId, OrderDomainQueryRequest body);

  /**
   * Basic query
   * Similar to <code>orderDomainQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderDomain/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrderDomainQueryResponse> orderDomainQueryWithHttpInfo(@Param("sessionId") String sessionId, OrderDomainQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>orderDomainQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrderDomainQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrderDomainQueryResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrderDomainQueryResponse orderDomainQuery(OrderDomainQueryRequest body, @QueryMap(encoded=true) OrderDomainQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>orderDomainQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrderDomainQueryResponse
      */
      @RequestLine("POST /api/rest/entity/orderDomain/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrderDomainQueryResponse> orderDomainQueryWithHttpInfo(OrderDomainQueryRequest body, @QueryMap(encoded=true) OrderDomainQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>orderDomainQuery</code> method in a fluent style.
   */
  public static class OrderDomainQueryQueryParams extends HashMap<String, Object> {
    public OrderDomainQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UpdateOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateOrderDomainResponse updateOrderDomain(@Param("sessionId") String sessionId, UpdateOrderDomainRequestData body);

  /**
   * Modify
   * Similar to <code>updateOrderDomain</code> but it also returns the http response headers .
   * Modify Order domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/orderDomain/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateOrderDomainResponse> updateOrderDomainWithHttpInfo(@Param("sessionId") String sessionId, UpdateOrderDomainRequestData body);


  /**
   * Modify
   * Modify Order domain
   * Note, this is equivalent to the other <code>updateOrderDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateOrderDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateOrderDomainResponse
   */
  @RequestLine("POST /api/rest/entity/orderDomain/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateOrderDomainResponse updateOrderDomain(UpdateOrderDomainRequestData body, @QueryMap(encoded=true) UpdateOrderDomainQueryParams queryParams);

  /**
  * Modify
  * Modify Order domain
  * Note, this is equivalent to the other <code>updateOrderDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateOrderDomainResponse
      */
      @RequestLine("POST /api/rest/entity/orderDomain/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateOrderDomainResponse> updateOrderDomainWithHttpInfo(UpdateOrderDomainRequestData body, @QueryMap(encoded=true) UpdateOrderDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateOrderDomain</code> method in a fluent style.
   */
  public static class UpdateOrderDomainQueryParams extends HashMap<String, Object> {
    public UpdateOrderDomainQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
