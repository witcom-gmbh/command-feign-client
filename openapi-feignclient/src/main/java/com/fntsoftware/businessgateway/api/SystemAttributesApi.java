package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.QuerySystemAttributesSystemAttributesRequestData;
import com.fntsoftware.businessgateway.entities.QuerySystemAttributesSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.SystemAttributesGetSystemAttributesByElidRequest;
import com.fntsoftware.businessgateway.entities.SystemAttributesGetSystemAttributesByElidResponse;
import com.fntsoftware.businessgateway.entities.SystemAttributesGetSystemAttributesByUuidRequest;
import com.fntsoftware.businessgateway.entities.SystemAttributesGetSystemAttributesByUuidResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SystemAttributesApi extends ApiClient.Api {


  /**
   * Query system attributes
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QuerySystemAttributesSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/querySystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QuerySystemAttributesSystemAttributesResponse querySystemAttributesSystemAttributes(@Param("sessionId") String sessionId, QuerySystemAttributesSystemAttributesRequestData body);

  /**
   * Query system attributes
   * Similar to <code>querySystemAttributesSystemAttributes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/querySystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QuerySystemAttributesSystemAttributesResponse> querySystemAttributesSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, QuerySystemAttributesSystemAttributesRequestData body);


  /**
   * Query system attributes
   * 
   * Note, this is equivalent to the other <code>querySystemAttributesSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QuerySystemAttributesSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QuerySystemAttributesSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/querySystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QuerySystemAttributesSystemAttributesResponse querySystemAttributesSystemAttributes(QuerySystemAttributesSystemAttributesRequestData body, @QueryMap(encoded=true) QuerySystemAttributesSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * 
  * Note, this is equivalent to the other <code>querySystemAttributesSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QuerySystemAttributesSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/systemAttributes/querySystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QuerySystemAttributesSystemAttributesResponse> querySystemAttributesSystemAttributesWithHttpInfo(QuerySystemAttributesSystemAttributesRequestData body, @QueryMap(encoded=true) QuerySystemAttributesSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>querySystemAttributesSystemAttributes</code> method in a fluent style.
   */
  public static class QuerySystemAttributesSystemAttributesQueryParams extends HashMap<String, Object> {
    public QuerySystemAttributesSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by ELID
   * Query by ELID
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SystemAttributesGetSystemAttributesByElidResponse
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByElid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemAttributesGetSystemAttributesByElidResponse systemAttributesGetSystemAttributesByElid(@Param("sessionId") String sessionId, SystemAttributesGetSystemAttributesByElidRequest body);

  /**
   * Query by ELID
   * Similar to <code>systemAttributesGetSystemAttributesByElid</code> but it also returns the http response headers .
   * Query by ELID
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByElid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SystemAttributesGetSystemAttributesByElidResponse> systemAttributesGetSystemAttributesByElidWithHttpInfo(@Param("sessionId") String sessionId, SystemAttributesGetSystemAttributesByElidRequest body);


  /**
   * Query by ELID
   * Query by ELID
   * Note, this is equivalent to the other <code>systemAttributesGetSystemAttributesByElid</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SystemAttributesGetSystemAttributesByElidQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SystemAttributesGetSystemAttributesByElidResponse
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByElid?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SystemAttributesGetSystemAttributesByElidResponse systemAttributesGetSystemAttributesByElid(SystemAttributesGetSystemAttributesByElidRequest body, @QueryMap(encoded=true) SystemAttributesGetSystemAttributesByElidQueryParams queryParams);

  /**
  * Query by ELID
  * Query by ELID
  * Note, this is equivalent to the other <code>systemAttributesGetSystemAttributesByElid</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SystemAttributesGetSystemAttributesByElidResponse
      */
      @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByElid?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SystemAttributesGetSystemAttributesByElidResponse> systemAttributesGetSystemAttributesByElidWithHttpInfo(SystemAttributesGetSystemAttributesByElidRequest body, @QueryMap(encoded=true) SystemAttributesGetSystemAttributesByElidQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>systemAttributesGetSystemAttributesByElid</code> method in a fluent style.
   */
  public static class SystemAttributesGetSystemAttributesByElidQueryParams extends HashMap<String, Object> {
    public SystemAttributesGetSystemAttributesByElidQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by UUID
   * Query by UUID
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SystemAttributesGetSystemAttributesByUuidResponse
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByUuid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SystemAttributesGetSystemAttributesByUuidResponse systemAttributesGetSystemAttributesByUuid(@Param("sessionId") String sessionId, SystemAttributesGetSystemAttributesByUuidRequest body);

  /**
   * Query by UUID
   * Similar to <code>systemAttributesGetSystemAttributesByUuid</code> but it also returns the http response headers .
   * Query by UUID
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByUuid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SystemAttributesGetSystemAttributesByUuidResponse> systemAttributesGetSystemAttributesByUuidWithHttpInfo(@Param("sessionId") String sessionId, SystemAttributesGetSystemAttributesByUuidRequest body);


  /**
   * Query by UUID
   * Query by UUID
   * Note, this is equivalent to the other <code>systemAttributesGetSystemAttributesByUuid</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SystemAttributesGetSystemAttributesByUuidQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SystemAttributesGetSystemAttributesByUuidResponse
   */
  @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByUuid?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SystemAttributesGetSystemAttributesByUuidResponse systemAttributesGetSystemAttributesByUuid(SystemAttributesGetSystemAttributesByUuidRequest body, @QueryMap(encoded=true) SystemAttributesGetSystemAttributesByUuidQueryParams queryParams);

  /**
  * Query by UUID
  * Query by UUID
  * Note, this is equivalent to the other <code>systemAttributesGetSystemAttributesByUuid</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SystemAttributesGetSystemAttributesByUuidResponse
      */
      @RequestLine("POST /api/rest/entity/systemAttributes/getSystemAttributesByUuid?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SystemAttributesGetSystemAttributesByUuidResponse> systemAttributesGetSystemAttributesByUuidWithHttpInfo(SystemAttributesGetSystemAttributesByUuidRequest body, @QueryMap(encoded=true) SystemAttributesGetSystemAttributesByUuidQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>systemAttributesGetSystemAttributesByUuid</code> method in a fluent style.
   */
  public static class SystemAttributesGetSystemAttributesByUuidQueryParams extends HashMap<String, Object> {
    public SystemAttributesGetSystemAttributesByUuidQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
