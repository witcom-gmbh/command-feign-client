package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetDeviceMasterCabinetRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetDeviceMasterCabinetResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetPowerDistributorSystemsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetPowerDistributorSystemsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetSwitchCabinetsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetSwitchCabinetsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DeviceMasterCabinetApi extends ApiClient.Api {


  /**
   * Query Device master cabinet
   * Query the basic data from device master switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterCabinetDeviceMasterCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterCabinetDeviceMasterCabinetResponse deviceMasterCabinetDeviceMasterCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetDeviceMasterCabinetRequest body);

  /**
   * Query Device master cabinet
   * Similar to <code>deviceMasterCabinetDeviceMasterCabinet</code> but it also returns the http response headers .
   * Query the basic data from device master switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterCabinetDeviceMasterCabinetResponse> deviceMasterCabinetDeviceMasterCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetDeviceMasterCabinetRequest body);


  /**
   * Query Device master cabinet
   * Query the basic data from device master switch cabinet
   * Note, this is equivalent to the other <code>deviceMasterCabinetDeviceMasterCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterCabinetDeviceMasterCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterCabinetDeviceMasterCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterCabinetDeviceMasterCabinetResponse deviceMasterCabinetDeviceMasterCabinet(@Param("elid") String elid, DeviceMasterCabinetDeviceMasterCabinetRequest body, @QueryMap(encoded=true) DeviceMasterCabinetDeviceMasterCabinetQueryParams queryParams);

  /**
  * Query Device master cabinet
  * Query the basic data from device master switch cabinet
  * Note, this is equivalent to the other <code>deviceMasterCabinetDeviceMasterCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterCabinetDeviceMasterCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterCabinetDeviceMasterCabinetResponse> deviceMasterCabinetDeviceMasterCabinetWithHttpInfo(@Param("elid") String elid, DeviceMasterCabinetDeviceMasterCabinetRequest body, @QueryMap(encoded=true) DeviceMasterCabinetDeviceMasterCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterCabinetDeviceMasterCabinet</code> method in a fluent style.
   */
  public static class DeviceMasterCabinetDeviceMasterCabinetQueryParams extends HashMap<String, Object> {
    public DeviceMasterCabinetDeviceMasterCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power distributor system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterCabinetPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterCabinetPowerDistributorSystemsResponseData deviceMasterCabinetPowerDistributorSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetPowerDistributorSystemsRequestData body);

  /**
   * Get relations to Power distributor system entities
   * Similar to <code>deviceMasterCabinetPowerDistributorSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterCabinetPowerDistributorSystemsResponseData> deviceMasterCabinetPowerDistributorSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetPowerDistributorSystemsRequestData body);


  /**
   * Get relations to Power distributor system entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterCabinetPowerDistributorSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterCabinetPowerDistributorSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterCabinetPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterCabinetPowerDistributorSystemsResponseData deviceMasterCabinetPowerDistributorSystems(@Param("elid") String elid, DeviceMasterCabinetPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) DeviceMasterCabinetPowerDistributorSystemsQueryParams queryParams);

  /**
  * Get relations to Power distributor system entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterCabinetPowerDistributorSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterCabinetPowerDistributorSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/PowerDistributorSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterCabinetPowerDistributorSystemsResponseData> deviceMasterCabinetPowerDistributorSystemsWithHttpInfo(@Param("elid") String elid, DeviceMasterCabinetPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) DeviceMasterCabinetPowerDistributorSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterCabinetPowerDistributorSystems</code> method in a fluent style.
   */
  public static class DeviceMasterCabinetPowerDistributorSystemsQueryParams extends HashMap<String, Object> {
    public DeviceMasterCabinetPowerDistributorSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterCabinetQueryResponse deviceMasterCabinetQuery(@Param("sessionId") String sessionId, DeviceMasterCabinetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterCabinetQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterCabinetQueryResponse> deviceMasterCabinetQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterCabinetQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterCabinetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterCabinetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterCabinetQueryResponse deviceMasterCabinetQuery(DeviceMasterCabinetQueryRequest body, @QueryMap(encoded=true) DeviceMasterCabinetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterCabinetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterCabinetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterCabinet/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterCabinetQueryResponse> deviceMasterCabinetQueryWithHttpInfo(DeviceMasterCabinetQueryRequest body, @QueryMap(encoded=true) DeviceMasterCabinetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterCabinetQuery</code> method in a fluent style.
   */
  public static class DeviceMasterCabinetQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterCabinetQueryQueryParams sessionId(final String value) {
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
   * @return DeviceMasterCabinetSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterCabinetSwitchCabinetsResponseData deviceMasterCabinetSwitchCabinets(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetSwitchCabinetsRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>deviceMasterCabinetSwitchCabinets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterCabinetSwitchCabinetsResponseData> deviceMasterCabinetSwitchCabinetsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetSwitchCabinetsRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterCabinetSwitchCabinets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterCabinetSwitchCabinetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterCabinetSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterCabinetSwitchCabinetsResponseData deviceMasterCabinetSwitchCabinets(@Param("elid") String elid, DeviceMasterCabinetSwitchCabinetsRequestData body, @QueryMap(encoded=true) DeviceMasterCabinetSwitchCabinetsQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterCabinetSwitchCabinets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterCabinetSwitchCabinetsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SwitchCabinets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterCabinetSwitchCabinetsResponseData> deviceMasterCabinetSwitchCabinetsWithHttpInfo(@Param("elid") String elid, DeviceMasterCabinetSwitchCabinetsRequestData body, @QueryMap(encoded=true) DeviceMasterCabinetSwitchCabinetsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterCabinetSwitchCabinets</code> method in a fluent style.
   */
  public static class DeviceMasterCabinetSwitchCabinetsQueryParams extends HashMap<String, Object> {
    public DeviceMasterCabinetSwitchCabinetsQueryParams sessionId(final String value) {
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
   * @return DeviceMasterCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterCabinetSystemAttributesResponse deviceMasterCabinetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterCabinetSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterCabinetSystemAttributesResponse> deviceMasterCabinetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterCabinetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterCabinetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterCabinetSystemAttributesResponse deviceMasterCabinetSystemAttributes(@Param("elid") String elid, DeviceMasterCabinetSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterCabinetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterCabinetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterCabinetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterCabinetSystemAttributesResponse> deviceMasterCabinetSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterCabinetSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterCabinetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterCabinetSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterCabinetSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterCabinetSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
