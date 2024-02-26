package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetSwitchCabinetsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetSwitchCabinetsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DeviceMasterSwitchCabinetApi extends ApiClient.Api {


  /**
   * Query Device master switch cabinet
   * Query the basic data from device master Switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse deviceMasterSwitchCabinetDeviceMasterSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetRequest body);

  /**
   * Query Device master switch cabinet
   * Similar to <code>deviceMasterSwitchCabinetDeviceMasterSwitchCabinet</code> but it also returns the http response headers .
   * Query the basic data from device master Switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse> deviceMasterSwitchCabinetDeviceMasterSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetRequest body);


  /**
   * Query Device master switch cabinet
   * Query the basic data from device master Switch cabinet
   * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetDeviceMasterSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse deviceMasterSwitchCabinetDeviceMasterSwitchCabinet(@Param("elid") String elid, DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetRequest body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetQueryParams queryParams);

  /**
  * Query Device master switch cabinet
  * Query the basic data from device master Switch cabinet
  * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetDeviceMasterSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetResponse> deviceMasterSwitchCabinetDeviceMasterSwitchCabinetWithHttpInfo(@Param("elid") String elid, DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetRequest body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterSwitchCabinetDeviceMasterSwitchCabinet</code> method in a fluent style.
   */
  public static class DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetQueryParams extends HashMap<String, Object> {
    public DeviceMasterSwitchCabinetDeviceMasterSwitchCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterSwitchCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterSwitchCabinetQueryResponse deviceMasterSwitchCabinetQuery(@Param("sessionId") String sessionId, DeviceMasterSwitchCabinetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterSwitchCabinetQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterSwitchCabinetQueryResponse> deviceMasterSwitchCabinetQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterSwitchCabinetQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterSwitchCabinetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterSwitchCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterSwitchCabinetQueryResponse deviceMasterSwitchCabinetQuery(DeviceMasterSwitchCabinetQueryRequest body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterSwitchCabinetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterSwitchCabinetQueryResponse> deviceMasterSwitchCabinetQueryWithHttpInfo(DeviceMasterSwitchCabinetQueryRequest body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterSwitchCabinetQuery</code> method in a fluent style.
   */
  public static class DeviceMasterSwitchCabinetQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterSwitchCabinetQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Switch cabinet entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterSwitchCabinetSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterSwitchCabinetSwitchCabinetsResponseData deviceMasterSwitchCabinetSwitchCabinets(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetSwitchCabinetsRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>deviceMasterSwitchCabinetSwitchCabinets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterSwitchCabinetSwitchCabinetsResponseData> deviceMasterSwitchCabinetSwitchCabinetsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetSwitchCabinetsRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetSwitchCabinets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterSwitchCabinetSwitchCabinetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterSwitchCabinetSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterSwitchCabinetSwitchCabinetsResponseData deviceMasterSwitchCabinetSwitchCabinets(@Param("elid") String elid, DeviceMasterSwitchCabinetSwitchCabinetsRequestData body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetSwitchCabinetsQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetSwitchCabinets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterSwitchCabinetSwitchCabinetsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterSwitchCabinetSwitchCabinetsResponseData> deviceMasterSwitchCabinetSwitchCabinetsWithHttpInfo(@Param("elid") String elid, DeviceMasterSwitchCabinetSwitchCabinetsRequestData body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetSwitchCabinetsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterSwitchCabinetSwitchCabinets</code> method in a fluent style.
   */
  public static class DeviceMasterSwitchCabinetSwitchCabinetsQueryParams extends HashMap<String, Object> {
    public DeviceMasterSwitchCabinetSwitchCabinetsQueryParams sessionId(final String value) {
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
   * @return DeviceMasterSwitchCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterSwitchCabinetSystemAttributesResponse deviceMasterSwitchCabinetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterSwitchCabinetSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterSwitchCabinetSystemAttributesResponse> deviceMasterSwitchCabinetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterSwitchCabinetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterSwitchCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterSwitchCabinetSystemAttributesResponse deviceMasterSwitchCabinetSystemAttributes(@Param("elid") String elid, DeviceMasterSwitchCabinetSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterSwitchCabinetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterSwitchCabinetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterSwitchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterSwitchCabinetSystemAttributesResponse> deviceMasterSwitchCabinetSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterSwitchCabinetSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterSwitchCabinetSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterSwitchCabinetSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterSwitchCabinetSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
