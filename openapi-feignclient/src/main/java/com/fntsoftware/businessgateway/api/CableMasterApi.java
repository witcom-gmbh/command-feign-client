package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CableMasterQueryRequest;
import com.fntsoftware.businessgateway.entities.CableMasterQueryResponse;
import com.fntsoftware.businessgateway.entities.CableMasterSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CableMasterSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CableMasterApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CableMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterQueryResponse cableMasterQuery(@Param("sessionId") String sessionId, CableMasterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cableMasterQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterQueryResponse> cableMasterQueryWithHttpInfo(@Param("sessionId") String sessionId, CableMasterQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>cableMasterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMaster/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterQueryResponse cableMasterQuery(CableMasterQueryRequest body, @QueryMap(encoded=true) CableMasterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>cableMasterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cableMaster/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterQueryResponse> cableMasterQueryWithHttpInfo(CableMasterQueryRequest body, @QueryMap(encoded=true) CableMasterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterQuery</code> method in a fluent style.
   */
  public static class CableMasterQueryQueryParams extends HashMap<String, Object> {
    public CableMasterQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CableMasterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterSystemAttributesResponse cableMasterSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cableMasterSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterSystemAttributesResponse> cableMasterSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>cableMasterSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterSystemAttributesResponse cableMasterSystemAttributes(@Param("elid") String elid, CableMasterSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>cableMasterSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cableMaster/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterSystemAttributesResponse> cableMasterSystemAttributesWithHttpInfo(@Param("elid") String elid, CableMasterSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterSystemAttributes</code> method in a fluent style.
   */
  public static class CableMasterSystemAttributesQueryParams extends HashMap<String, Object> {
    public CableMasterSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
