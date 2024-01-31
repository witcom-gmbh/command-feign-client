package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxFistQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxFistQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxFistSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxFistSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DeviceMasterJunctionBoxFistApi extends ApiClient.Api {


  /**
   * Query Device master junction box fist
   * Query the basic data from device master Junction box fist
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistRequest body);

  /**
   * Query Device master junction box fist
   * Similar to <code>deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFist</code> but it also returns the http response headers .
   * Query the basic data from device master Junction box fist
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse> deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistRequest body);


  /**
   * Query Device master junction box fist
   * Query the basic data from device master Junction box fist
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFist(@Param("elid") String elid, DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistQueryParams queryParams);

  /**
  * Query Device master junction box fist
  * Query the basic data from device master Junction box fist
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistResponse> deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistWithHttpInfo(@Param("elid") String elid, DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxFistDeviceMasterJunctionBoxFist</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxFistDeviceMasterJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterJunctionBoxFistQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxFistQueryResponse deviceMasterJunctionBoxFistQuery(@Param("sessionId") String sessionId, DeviceMasterJunctionBoxFistQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterJunctionBoxFistQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxFistQueryResponse> deviceMasterJunctionBoxFistQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterJunctionBoxFistQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxFistQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxFistQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxFistQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxFistQueryResponse deviceMasterJunctionBoxFistQuery(DeviceMasterJunctionBoxFistQueryRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxFistQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxFistQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxFistQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxFistQueryResponse> deviceMasterJunctionBoxFistQueryWithHttpInfo(DeviceMasterJunctionBoxFistQueryRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxFistQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxFistQuery</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxFistQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxFistQueryQueryParams sessionId(final String value) {
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
   * @return DeviceMasterJunctionBoxFistSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxFistSystemAttributesResponse deviceMasterJunctionBoxFistSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxFistSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterJunctionBoxFistSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxFistSystemAttributesResponse> deviceMasterJunctionBoxFistSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxFistSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxFistSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxFistSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxFistSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxFistSystemAttributesResponse deviceMasterJunctionBoxFistSystemAttributes(@Param("elid") String elid, DeviceMasterJunctionBoxFistSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxFistSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxFistSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxFistSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterJunctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxFistSystemAttributesResponse> deviceMasterJunctionBoxFistSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterJunctionBoxFistSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxFistSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxFistSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxFistSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxFistSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
