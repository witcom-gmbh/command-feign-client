package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.HistorizationAttributesHistoryRequest;
import com.fntsoftware.businessgateway.entities.HistorizationAttributesHistoryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface HistorizationApi extends ApiClient.Api {


  /**
   * Atributes  history
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HistorizationAttributesHistoryResponse
   */
  @RequestLine("POST /api/rest/entity/historization/attributesHistory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HistorizationAttributesHistoryResponse historizationAttributesHistory(@Param("sessionId") String sessionId, HistorizationAttributesHistoryRequest body);

  /**
   * Atributes  history
   * Similar to <code>historizationAttributesHistory</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/historization/attributesHistory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HistorizationAttributesHistoryResponse> historizationAttributesHistoryWithHttpInfo(@Param("sessionId") String sessionId, HistorizationAttributesHistoryRequest body);


  /**
   * Atributes  history
   * 
   * Note, this is equivalent to the other <code>historizationAttributesHistory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HistorizationAttributesHistoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HistorizationAttributesHistoryResponse
   */
  @RequestLine("POST /api/rest/entity/historization/attributesHistory?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HistorizationAttributesHistoryResponse historizationAttributesHistory(HistorizationAttributesHistoryRequest body, @QueryMap(encoded=true) HistorizationAttributesHistoryQueryParams queryParams);

  /**
  * Atributes  history
  * 
  * Note, this is equivalent to the other <code>historizationAttributesHistory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HistorizationAttributesHistoryResponse
      */
      @RequestLine("POST /api/rest/entity/historization/attributesHistory?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HistorizationAttributesHistoryResponse> historizationAttributesHistoryWithHttpInfo(HistorizationAttributesHistoryRequest body, @QueryMap(encoded=true) HistorizationAttributesHistoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>historizationAttributesHistory</code> method in a fluent style.
   */
  public static class HistorizationAttributesHistoryQueryParams extends HashMap<String, Object> {
    public HistorizationAttributesHistoryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
