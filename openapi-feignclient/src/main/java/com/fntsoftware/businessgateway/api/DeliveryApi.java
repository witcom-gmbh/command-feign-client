package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDeliveryRequestData;
import com.fntsoftware.businessgateway.entities.CreateDeliveryResponse;
import com.fntsoftware.businessgateway.entities.DeleteDeliveryRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDeliveryResponse;
import com.fntsoftware.businessgateway.entities.DeliveryDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.DeliveryDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.DeliveryOrderItemsRequestData;
import com.fntsoftware.businessgateway.entities.DeliveryOrderItemsResponseData;
import com.fntsoftware.businessgateway.entities.DeliveryQueryRequest;
import com.fntsoftware.businessgateway.entities.DeliveryQueryResponse;
import com.fntsoftware.businessgateway.entities.DeliverySystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeliverySystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateDeliveryRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDeliveryResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDeliveryRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDeliveryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DeliveryApi extends ApiClient.Api {


  /**
   * Create
   * Create Delivery
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDeliveryResponse createDelivery(@Param("sessionId") String sessionId, CreateDeliveryRequestData body);

  /**
   * Create
   * Similar to <code>createDelivery</code> but it also returns the http response headers .
   * Create Delivery
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDeliveryResponse> createDeliveryWithHttpInfo(@Param("sessionId") String sessionId, CreateDeliveryRequestData body);


  /**
   * Create
   * Create Delivery
   * Note, this is equivalent to the other <code>createDelivery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDeliveryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDeliveryResponse createDelivery(CreateDeliveryRequestData body, @QueryMap(encoded=true) CreateDeliveryQueryParams queryParams);

  /**
  * Create
  * Create Delivery
  * Note, this is equivalent to the other <code>createDelivery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDeliveryResponse
      */
      @RequestLine("POST /api/rest/entity/delivery/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDeliveryResponse> createDeliveryWithHttpInfo(CreateDeliveryRequestData body, @QueryMap(encoded=true) CreateDeliveryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDelivery</code> method in a fluent style.
   */
  public static class CreateDeliveryQueryParams extends HashMap<String, Object> {
    public CreateDeliveryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Delivery
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDeliveryResponse deleteDelivery(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDeliveryRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDelivery</code> but it also returns the http response headers .
   * Delete Delivery
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDeliveryResponse> deleteDeliveryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDeliveryRequestData body);


  /**
   * Delete
   * Delete Delivery
   * Note, this is equivalent to the other <code>deleteDelivery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDeliveryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDeliveryResponse deleteDelivery(@Param("elid") String elid, DeleteDeliveryRequestData body, @QueryMap(encoded=true) DeleteDeliveryQueryParams queryParams);

  /**
  * Delete
  * Delete Delivery
  * Note, this is equivalent to the other <code>deleteDelivery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDeliveryResponse
      */
      @RequestLine("POST /api/rest/entity/delivery/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDeliveryResponse> deleteDeliveryWithHttpInfo(@Param("elid") String elid, DeleteDeliveryRequestData body, @QueryMap(encoded=true) DeleteDeliveryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDelivery</code> method in a fluent style.
   */
  public static class DeleteDeliveryQueryParams extends HashMap<String, Object> {
    public DeleteDeliveryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeliveryDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeliveryDevicesAllResponseData deliveryDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, DeliveryDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>deliveryDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeliveryDevicesAllResponseData> deliveryDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeliveryDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>deliveryDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeliveryDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeliveryDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeliveryDevicesAllResponseData deliveryDevicesAll(@Param("elid") String elid, DeliveryDevicesAllRequestData body, @QueryMap(encoded=true) DeliveryDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>deliveryDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeliveryDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/delivery/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeliveryDevicesAllResponseData> deliveryDevicesAllWithHttpInfo(@Param("elid") String elid, DeliveryDevicesAllRequestData body, @QueryMap(encoded=true) DeliveryDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deliveryDevicesAll</code> method in a fluent style.
   */
  public static class DeliveryDevicesAllQueryParams extends HashMap<String, Object> {
    public DeliveryDevicesAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Order item entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeliveryOrderItemsResponseData
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/OrderItems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeliveryOrderItemsResponseData deliveryOrderItems(@Param("sessionId") String sessionId, @Param("elid") String elid, DeliveryOrderItemsRequestData body);

  /**
   * Get relations to Order item entities
   * Similar to <code>deliveryOrderItems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/OrderItems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeliveryOrderItemsResponseData> deliveryOrderItemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeliveryOrderItemsRequestData body);


  /**
   * Get relations to Order item entities
   * 
   * Note, this is equivalent to the other <code>deliveryOrderItems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeliveryOrderItemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeliveryOrderItemsResponseData
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/OrderItems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeliveryOrderItemsResponseData deliveryOrderItems(@Param("elid") String elid, DeliveryOrderItemsRequestData body, @QueryMap(encoded=true) DeliveryOrderItemsQueryParams queryParams);

  /**
  * Get relations to Order item entities
  * 
  * Note, this is equivalent to the other <code>deliveryOrderItems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeliveryOrderItemsResponseData
      */
      @RequestLine("POST /api/rest/entity/delivery/{elid}/OrderItems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeliveryOrderItemsResponseData> deliveryOrderItemsWithHttpInfo(@Param("elid") String elid, DeliveryOrderItemsRequestData body, @QueryMap(encoded=true) DeliveryOrderItemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deliveryOrderItems</code> method in a fluent style.
   */
  public static class DeliveryOrderItemsQueryParams extends HashMap<String, Object> {
    public DeliveryOrderItemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeliveryQueryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeliveryQueryResponse deliveryQuery(@Param("sessionId") String sessionId, DeliveryQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deliveryQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeliveryQueryResponse> deliveryQueryWithHttpInfo(@Param("sessionId") String sessionId, DeliveryQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>deliveryQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeliveryQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeliveryQueryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeliveryQueryResponse deliveryQuery(DeliveryQueryRequest body, @QueryMap(encoded=true) DeliveryQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>deliveryQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeliveryQueryResponse
      */
      @RequestLine("POST /api/rest/entity/delivery/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeliveryQueryResponse> deliveryQueryWithHttpInfo(DeliveryQueryRequest body, @QueryMap(encoded=true) DeliveryQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deliveryQuery</code> method in a fluent style.
   */
  public static class DeliveryQueryQueryParams extends HashMap<String, Object> {
    public DeliveryQueryQueryParams sessionId(final String value) {
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
   * @return DeliverySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeliverySystemAttributesResponse deliverySystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeliverySystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deliverySystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeliverySystemAttributesResponse> deliverySystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeliverySystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>deliverySystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeliverySystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeliverySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeliverySystemAttributesResponse deliverySystemAttributes(@Param("elid") String elid, DeliverySystemAttributesRequest body, @QueryMap(encoded=true) DeliverySystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>deliverySystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeliverySystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/delivery/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeliverySystemAttributesResponse> deliverySystemAttributesWithHttpInfo(@Param("elid") String elid, DeliverySystemAttributesRequest body, @QueryMap(encoded=true) DeliverySystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deliverySystemAttributes</code> method in a fluent style.
   */
  public static class DeliverySystemAttributesQueryParams extends HashMap<String, Object> {
    public DeliverySystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Delivery
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDeliveryResponse updateDelivery(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeliveryRequestData body);

  /**
   * Modify
   * Similar to <code>updateDelivery</code> but it also returns the http response headers .
   * Modify Delivery
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDeliveryResponse> updateDeliveryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeliveryRequestData body);


  /**
   * Modify
   * Modify Delivery
   * Note, this is equivalent to the other <code>updateDelivery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDeliveryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDeliveryResponse updateDelivery(@Param("elid") String elid, UpdateDeliveryRequestData body, @QueryMap(encoded=true) UpdateDeliveryQueryParams queryParams);

  /**
  * Modify
  * Modify Delivery
  * Note, this is equivalent to the other <code>updateDelivery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDeliveryResponse
      */
      @RequestLine("POST /api/rest/entity/delivery/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDeliveryResponse> updateDeliveryWithHttpInfo(@Param("elid") String elid, UpdateDeliveryRequestData body, @QueryMap(encoded=true) UpdateDeliveryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDelivery</code> method in a fluent style.
   */
  public static class UpdateDeliveryQueryParams extends HashMap<String, Object> {
    public UpdateDeliveryQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDeliveryResponse updateSystemAttributesDelivery(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDeliveryRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDelivery</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDeliveryResponse> updateSystemAttributesDeliveryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDeliveryRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDelivery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDeliveryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDeliveryResponse
   */
  @RequestLine("POST /api/rest/entity/delivery/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDeliveryResponse updateSystemAttributesDelivery(@Param("elid") String elid, UpdateSystemAttributesDeliveryRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDeliveryQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDelivery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDeliveryResponse
      */
      @RequestLine("POST /api/rest/entity/delivery/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDeliveryResponse> updateSystemAttributesDeliveryWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDeliveryRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDeliveryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDelivery</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDeliveryQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDeliveryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
