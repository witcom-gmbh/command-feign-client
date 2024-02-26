package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DataOptionQueryRequest;
import com.fntsoftware.businessgateway.entities.DataOptionQueryResponse;
import com.fntsoftware.businessgateway.entities.DataOptionSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DataOptionSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDataOptionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDataOptionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DataOptionApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataOptionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/dataOption/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataOptionQueryResponse dataOptionQuery(@Param("sessionId") String sessionId, DataOptionQueryRequest body);

  /**
   * Basic query
   * Similar to <code>dataOptionQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataOption/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataOptionQueryResponse> dataOptionQueryWithHttpInfo(@Param("sessionId") String sessionId, DataOptionQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>dataOptionQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataOptionQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataOptionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/dataOption/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataOptionQueryResponse dataOptionQuery(DataOptionQueryRequest body, @QueryMap(encoded=true) DataOptionQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>dataOptionQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataOptionQueryResponse
      */
      @RequestLine("POST /api/rest/entity/dataOption/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataOptionQueryResponse> dataOptionQueryWithHttpInfo(DataOptionQueryRequest body, @QueryMap(encoded=true) DataOptionQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataOptionQuery</code> method in a fluent style.
   */
  public static class DataOptionQueryQueryParams extends HashMap<String, Object> {
    public DataOptionQueryQueryParams sessionId(final String value) {
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
   * @return DataOptionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/dataOption/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataOptionSystemAttributesResponse dataOptionSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DataOptionSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>dataOptionSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataOption/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataOptionSystemAttributesResponse> dataOptionSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataOptionSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>dataOptionSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataOptionSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataOptionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/dataOption/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataOptionSystemAttributesResponse dataOptionSystemAttributes(@Param("elid") String elid, DataOptionSystemAttributesRequest body, @QueryMap(encoded=true) DataOptionSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>dataOptionSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataOptionSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/dataOption/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataOptionSystemAttributesResponse> dataOptionSystemAttributesWithHttpInfo(@Param("elid") String elid, DataOptionSystemAttributesRequest body, @QueryMap(encoded=true) DataOptionSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataOptionSystemAttributes</code> method in a fluent style.
   */
  public static class DataOptionSystemAttributesQueryParams extends HashMap<String, Object> {
    public DataOptionSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDataOptionResponse
   */
  @RequestLine("POST /api/rest/entity/dataOption/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDataOptionResponse updateSystemAttributesDataOption(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDataOptionRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDataOption</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataOption/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDataOptionResponse> updateSystemAttributesDataOptionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDataOptionRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDataOption</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDataOptionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDataOptionResponse
   */
  @RequestLine("POST /api/rest/entity/dataOption/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDataOptionResponse updateSystemAttributesDataOption(@Param("elid") String elid, UpdateSystemAttributesDataOptionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDataOptionQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDataOption</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDataOptionResponse
      */
      @RequestLine("POST /api/rest/entity/dataOption/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDataOptionResponse> updateSystemAttributesDataOptionWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDataOptionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDataOptionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDataOption</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDataOptionQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDataOptionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
