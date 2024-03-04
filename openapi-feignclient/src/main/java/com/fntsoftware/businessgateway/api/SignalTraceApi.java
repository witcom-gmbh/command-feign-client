package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.SignalTraceGetByPhysicalPortRequest;
import com.fntsoftware.businessgateway.entities.SignalTraceGetByPhysicalPortResponse;
import com.fntsoftware.businessgateway.entities.SignalTraceGetTreeByPhysicalPortRequest;
import com.fntsoftware.businessgateway.entities.SignalTraceGetTreeByPhysicalPortResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface SignalTraceApi extends ApiClient.Api {


  /**
   * Query via physical port
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SignalTraceGetByPhysicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/signalTrace/getByPhysicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalTraceGetByPhysicalPortResponse signalTraceGetByPhysicalPort(@Param("sessionId") String sessionId, SignalTraceGetByPhysicalPortRequest body);

  /**
   * Query via physical port
   * Similar to <code>signalTraceGetByPhysicalPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalTrace/getByPhysicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalTraceGetByPhysicalPortResponse> signalTraceGetByPhysicalPortWithHttpInfo(@Param("sessionId") String sessionId, SignalTraceGetByPhysicalPortRequest body);


  /**
   * Query via physical port
   * 
   * Note, this is equivalent to the other <code>signalTraceGetByPhysicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalTraceGetByPhysicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalTraceGetByPhysicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/signalTrace/getByPhysicalPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalTraceGetByPhysicalPortResponse signalTraceGetByPhysicalPort(SignalTraceGetByPhysicalPortRequest body, @QueryMap(encoded=true) SignalTraceGetByPhysicalPortQueryParams queryParams);

  /**
  * Query via physical port
  * 
  * Note, this is equivalent to the other <code>signalTraceGetByPhysicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalTraceGetByPhysicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/signalTrace/getByPhysicalPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalTraceGetByPhysicalPortResponse> signalTraceGetByPhysicalPortWithHttpInfo(SignalTraceGetByPhysicalPortRequest body, @QueryMap(encoded=true) SignalTraceGetByPhysicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalTraceGetByPhysicalPort</code> method in a fluent style.
   */
  public static class SignalTraceGetByPhysicalPortQueryParams extends HashMap<String, Object> {
    public SignalTraceGetByPhysicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query tree structure via physical port
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SignalTraceGetTreeByPhysicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/signalTrace/getTreeByPhysicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalTraceGetTreeByPhysicalPortResponse signalTraceGetTreeByPhysicalPort(@Param("sessionId") String sessionId, SignalTraceGetTreeByPhysicalPortRequest body);

  /**
   * Query tree structure via physical port
   * Similar to <code>signalTraceGetTreeByPhysicalPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalTrace/getTreeByPhysicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalTraceGetTreeByPhysicalPortResponse> signalTraceGetTreeByPhysicalPortWithHttpInfo(@Param("sessionId") String sessionId, SignalTraceGetTreeByPhysicalPortRequest body);


  /**
   * Query tree structure via physical port
   * 
   * Note, this is equivalent to the other <code>signalTraceGetTreeByPhysicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalTraceGetTreeByPhysicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalTraceGetTreeByPhysicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/signalTrace/getTreeByPhysicalPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalTraceGetTreeByPhysicalPortResponse signalTraceGetTreeByPhysicalPort(SignalTraceGetTreeByPhysicalPortRequest body, @QueryMap(encoded=true) SignalTraceGetTreeByPhysicalPortQueryParams queryParams);

  /**
  * Query tree structure via physical port
  * 
  * Note, this is equivalent to the other <code>signalTraceGetTreeByPhysicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalTraceGetTreeByPhysicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/signalTrace/getTreeByPhysicalPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalTraceGetTreeByPhysicalPortResponse> signalTraceGetTreeByPhysicalPortWithHttpInfo(SignalTraceGetTreeByPhysicalPortRequest body, @QueryMap(encoded=true) SignalTraceGetTreeByPhysicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalTraceGetTreeByPhysicalPort</code> method in a fluent style.
   */
  public static class SignalTraceGetTreeByPhysicalPortQueryParams extends HashMap<String, Object> {
    public SignalTraceGetTreeByPhysicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
