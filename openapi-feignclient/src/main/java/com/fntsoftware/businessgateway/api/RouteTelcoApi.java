package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.RouteTelcoQueryRequest;
import com.fntsoftware.businessgateway.entities.RouteTelcoQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface RouteTelcoApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return RouteTelcoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/routeTelco/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RouteTelcoQueryResponse routeTelcoQuery(@Param("sessionId") String sessionId, RouteTelcoQueryRequest body);

  /**
   * Basic query
   * Similar to <code>routeTelcoQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/routeTelco/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RouteTelcoQueryResponse> routeTelcoQueryWithHttpInfo(@Param("sessionId") String sessionId, RouteTelcoQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>routeTelcoQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RouteTelcoQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RouteTelcoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/routeTelco/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RouteTelcoQueryResponse routeTelcoQuery(RouteTelcoQueryRequest body, @QueryMap(encoded=true) RouteTelcoQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>routeTelcoQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RouteTelcoQueryResponse
      */
      @RequestLine("POST /api/rest/entity/routeTelco/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RouteTelcoQueryResponse> routeTelcoQueryWithHttpInfo(RouteTelcoQueryRequest body, @QueryMap(encoded=true) RouteTelcoQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>routeTelcoQuery</code> method in a fluent style.
   */
  public static class RouteTelcoQueryQueryParams extends HashMap<String, Object> {
    public RouteTelcoQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
