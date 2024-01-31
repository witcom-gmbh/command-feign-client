package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PhysicalConnectionPhysicalConnectionRequest;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPhysicalConnectionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PhysicalConnectionApi extends ApiClient.Api {


  /**
   * Query Physical connection
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionPhysicalConnectionResponse
   */
  @RequestLine("POST /api/rest/entity/physicalConnection/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionPhysicalConnectionResponse physicalConnectionPhysicalConnection(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPhysicalConnectionRequest body);

  /**
   * Query Physical connection
   * Similar to <code>physicalConnectionPhysicalConnection</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnection/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionPhysicalConnectionResponse> physicalConnectionPhysicalConnectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPhysicalConnectionRequest body);


  /**
   * Query Physical connection
   * 
   * Note, this is equivalent to the other <code>physicalConnectionPhysicalConnection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionPhysicalConnectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionPhysicalConnectionResponse
   */
  @RequestLine("POST /api/rest/entity/physicalConnection/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionPhysicalConnectionResponse physicalConnectionPhysicalConnection(@Param("elid") String elid, PhysicalConnectionPhysicalConnectionRequest body, @QueryMap(encoded=true) PhysicalConnectionPhysicalConnectionQueryParams queryParams);

  /**
  * Query Physical connection
  * 
  * Note, this is equivalent to the other <code>physicalConnectionPhysicalConnection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionPhysicalConnectionResponse
      */
      @RequestLine("POST /api/rest/entity/physicalConnection/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionPhysicalConnectionResponse> physicalConnectionPhysicalConnectionWithHttpInfo(@Param("elid") String elid, PhysicalConnectionPhysicalConnectionRequest body, @QueryMap(encoded=true) PhysicalConnectionPhysicalConnectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionPhysicalConnection</code> method in a fluent style.
   */
  public static class PhysicalConnectionPhysicalConnectionQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionPhysicalConnectionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
