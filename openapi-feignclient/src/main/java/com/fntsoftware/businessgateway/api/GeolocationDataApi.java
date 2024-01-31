package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateGeolocationDataRequestData;
import com.fntsoftware.businessgateway.entities.CreateGeolocationDataResponse;
import com.fntsoftware.businessgateway.entities.DeleteGeolocationDataRequestData;
import com.fntsoftware.businessgateway.entities.DeleteGeolocationDataResponse;
import com.fntsoftware.businessgateway.entities.GeolocationDataQueryRequest;
import com.fntsoftware.businessgateway.entities.GeolocationDataQueryResponse;
import com.fntsoftware.businessgateway.entities.UpdateGeolocationDataRequestData;
import com.fntsoftware.businessgateway.entities.UpdateGeolocationDataResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface GeolocationDataApi extends ApiClient.Api {


  /**
   * Create
   * Create Synchronization status
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateGeolocationDataResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateGeolocationDataResponse createGeolocationData(@Param("sessionId") String sessionId, CreateGeolocationDataRequestData body);

  /**
   * Create
   * Similar to <code>createGeolocationData</code> but it also returns the http response headers .
   * Create Synchronization status
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/geolocationData/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateGeolocationDataResponse> createGeolocationDataWithHttpInfo(@Param("sessionId") String sessionId, CreateGeolocationDataRequestData body);


  /**
   * Create
   * Create Synchronization status
   * Note, this is equivalent to the other <code>createGeolocationData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateGeolocationDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateGeolocationDataResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateGeolocationDataResponse createGeolocationData(CreateGeolocationDataRequestData body, @QueryMap(encoded=true) CreateGeolocationDataQueryParams queryParams);

  /**
  * Create
  * Create Synchronization status
  * Note, this is equivalent to the other <code>createGeolocationData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateGeolocationDataResponse
      */
      @RequestLine("POST /api/rest/entity/geolocationData/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateGeolocationDataResponse> createGeolocationDataWithHttpInfo(CreateGeolocationDataRequestData body, @QueryMap(encoded=true) CreateGeolocationDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createGeolocationData</code> method in a fluent style.
   */
  public static class CreateGeolocationDataQueryParams extends HashMap<String, Object> {
    public CreateGeolocationDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Synchronization status
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteGeolocationDataResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteGeolocationDataResponse deleteGeolocationData(@Param("sessionId") String sessionId, DeleteGeolocationDataRequestData body);

  /**
   * Delete
   * Similar to <code>deleteGeolocationData</code> but it also returns the http response headers .
   * Delete Synchronization status
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/geolocationData/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteGeolocationDataResponse> deleteGeolocationDataWithHttpInfo(@Param("sessionId") String sessionId, DeleteGeolocationDataRequestData body);


  /**
   * Delete
   * Delete Synchronization status
   * Note, this is equivalent to the other <code>deleteGeolocationData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteGeolocationDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteGeolocationDataResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteGeolocationDataResponse deleteGeolocationData(DeleteGeolocationDataRequestData body, @QueryMap(encoded=true) DeleteGeolocationDataQueryParams queryParams);

  /**
  * Delete
  * Delete Synchronization status
  * Note, this is equivalent to the other <code>deleteGeolocationData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteGeolocationDataResponse
      */
      @RequestLine("POST /api/rest/entity/geolocationData/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteGeolocationDataResponse> deleteGeolocationDataWithHttpInfo(DeleteGeolocationDataRequestData body, @QueryMap(encoded=true) DeleteGeolocationDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteGeolocationData</code> method in a fluent style.
   */
  public static class DeleteGeolocationDataQueryParams extends HashMap<String, Object> {
    public DeleteGeolocationDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return GeolocationDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GeolocationDataQueryResponse geolocationDataQuery(@Param("sessionId") String sessionId, GeolocationDataQueryRequest body);

  /**
   * Basic query
   * Similar to <code>geolocationDataQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/geolocationData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GeolocationDataQueryResponse> geolocationDataQueryWithHttpInfo(@Param("sessionId") String sessionId, GeolocationDataQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>geolocationDataQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GeolocationDataQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GeolocationDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GeolocationDataQueryResponse geolocationDataQuery(GeolocationDataQueryRequest body, @QueryMap(encoded=true) GeolocationDataQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>geolocationDataQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GeolocationDataQueryResponse
      */
      @RequestLine("POST /api/rest/entity/geolocationData/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GeolocationDataQueryResponse> geolocationDataQueryWithHttpInfo(GeolocationDataQueryRequest body, @QueryMap(encoded=true) GeolocationDataQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>geolocationDataQuery</code> method in a fluent style.
   */
  public static class GeolocationDataQueryQueryParams extends HashMap<String, Object> {
    public GeolocationDataQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Synchronization status
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UpdateGeolocationDataResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateGeolocationDataResponse updateGeolocationData(@Param("sessionId") String sessionId, UpdateGeolocationDataRequestData body);

  /**
   * Modify
   * Similar to <code>updateGeolocationData</code> but it also returns the http response headers .
   * Modify Synchronization status
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/geolocationData/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateGeolocationDataResponse> updateGeolocationDataWithHttpInfo(@Param("sessionId") String sessionId, UpdateGeolocationDataRequestData body);


  /**
   * Modify
   * Modify Synchronization status
   * Note, this is equivalent to the other <code>updateGeolocationData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateGeolocationDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateGeolocationDataResponse
   */
  @RequestLine("POST /api/rest/entity/geolocationData/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateGeolocationDataResponse updateGeolocationData(UpdateGeolocationDataRequestData body, @QueryMap(encoded=true) UpdateGeolocationDataQueryParams queryParams);

  /**
  * Modify
  * Modify Synchronization status
  * Note, this is equivalent to the other <code>updateGeolocationData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateGeolocationDataResponse
      */
      @RequestLine("POST /api/rest/entity/geolocationData/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateGeolocationDataResponse> updateGeolocationDataWithHttpInfo(UpdateGeolocationDataRequestData body, @QueryMap(encoded=true) UpdateGeolocationDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateGeolocationData</code> method in a fluent style.
   */
  public static class UpdateGeolocationDataQueryParams extends HashMap<String, Object> {
    public UpdateGeolocationDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
