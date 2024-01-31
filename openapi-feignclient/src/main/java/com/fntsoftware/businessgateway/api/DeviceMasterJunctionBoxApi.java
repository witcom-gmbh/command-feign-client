package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxDeviceMasterJunctionBoxRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DeviceMasterJunctionBoxApi extends ApiClient.Api {


  /**
   * Query Device master Junction box
   * Query the basic data from device master Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse deviceMasterJunctionBoxDeviceMasterJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxDeviceMasterJunctionBoxRequest body);

  /**
   * Query Device master Junction box
   * Similar to <code>deviceMasterJunctionBoxDeviceMasterJunctionBox</code> but it also returns the http response headers .
   * Query the basic data from device master Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse> deviceMasterJunctionBoxDeviceMasterJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxDeviceMasterJunctionBoxRequest body);


  /**
   * Query Device master Junction box
   * Query the basic data from device master Junction box
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxDeviceMasterJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxDeviceMasterJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse deviceMasterJunctionBoxDeviceMasterJunctionBox(@Param("elid") String elid, DeviceMasterJunctionBoxDeviceMasterJunctionBoxRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxDeviceMasterJunctionBoxQueryParams queryParams);

  /**
  * Query Device master Junction box
  * Query the basic data from device master Junction box
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxDeviceMasterJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxDeviceMasterJunctionBoxResponse> deviceMasterJunctionBoxDeviceMasterJunctionBoxWithHttpInfo(@Param("elid") String elid, DeviceMasterJunctionBoxDeviceMasterJunctionBoxRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxDeviceMasterJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxDeviceMasterJunctionBox</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxDeviceMasterJunctionBoxQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxDeviceMasterJunctionBoxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterJunctionBoxQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxQueryResponse deviceMasterJunctionBoxQuery(@Param("sessionId") String sessionId, DeviceMasterJunctionBoxQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterJunctionBoxQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxQueryResponse> deviceMasterJunctionBoxQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterJunctionBoxQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxQueryResponse deviceMasterJunctionBoxQuery(DeviceMasterJunctionBoxQueryRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxQueryResponse> deviceMasterJunctionBoxQueryWithHttpInfo(DeviceMasterJunctionBoxQueryRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxQuery</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxQueryQueryParams sessionId(final String value) {
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
   * @return DeviceMasterJunctionBoxSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxSystemAttributesResponse deviceMasterJunctionBoxSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterJunctionBoxSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxSystemAttributesResponse> deviceMasterJunctionBoxSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxSystemAttributesResponse deviceMasterJunctionBoxSystemAttributes(@Param("elid") String elid, DeviceMasterJunctionBoxSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterJunctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxSystemAttributesResponse> deviceMasterJunctionBoxSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterJunctionBoxSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterJunctionBoxSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
