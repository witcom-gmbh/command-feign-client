package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.OpenWithOpenWithRequest;
import com.fntsoftware.businessgateway.entities.OpenWithOpenWithResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface OpenWithApi extends ApiClient.Api {


  /**
   * Fetch \&quot;Open with¿ entries
   * Supplies all applications in which a specific object can be opened.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return OpenWithOpenWithResponse
   */
  @RequestLine("POST /api/rest/entity/openWith/openWith?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OpenWithOpenWithResponse openWithOpenWith(@Param("sessionId") String sessionId, OpenWithOpenWithRequest body);

  /**
   * Fetch \&quot;Open with¿ entries
   * Similar to <code>openWithOpenWith</code> but it also returns the http response headers .
   * Supplies all applications in which a specific object can be opened.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/openWith/openWith?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OpenWithOpenWithResponse> openWithOpenWithWithHttpInfo(@Param("sessionId") String sessionId, OpenWithOpenWithRequest body);


  /**
   * Fetch \&quot;Open with¿ entries
   * Supplies all applications in which a specific object can be opened.
   * Note, this is equivalent to the other <code>openWithOpenWith</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OpenWithOpenWithQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OpenWithOpenWithResponse
   */
  @RequestLine("POST /api/rest/entity/openWith/openWith?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OpenWithOpenWithResponse openWithOpenWith(OpenWithOpenWithRequest body, @QueryMap(encoded=true) OpenWithOpenWithQueryParams queryParams);

  /**
  * Fetch \&quot;Open with¿ entries
  * Supplies all applications in which a specific object can be opened.
  * Note, this is equivalent to the other <code>openWithOpenWith</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OpenWithOpenWithResponse
      */
      @RequestLine("POST /api/rest/entity/openWith/openWith?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OpenWithOpenWithResponse> openWithOpenWithWithHttpInfo(OpenWithOpenWithRequest body, @QueryMap(encoded=true) OpenWithOpenWithQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>openWithOpenWith</code> method in a fluent style.
   */
  public static class OpenWithOpenWithQueryParams extends HashMap<String, Object> {
    public OpenWithOpenWithQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
