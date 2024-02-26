package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaAntennasRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaAntennasResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaDeviceMasterAntennaRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaDeviceMasterAntennaResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaLogicalAntennasRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaLogicalAntennasResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennaSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DeviceMasterAntennaApi extends ApiClient.Api {


  /**
   * Get relations to Antenna entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterAntennaAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterAntennaAntennasResponseData deviceMasterAntennaAntennas(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaAntennasRequestData body);

  /**
   * Get relations to Antenna entities
   * Similar to <code>deviceMasterAntennaAntennas</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterAntennaAntennasResponseData> deviceMasterAntennaAntennasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaAntennasRequestData body);


  /**
   * Get relations to Antenna entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterAntennaAntennas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterAntennaAntennasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterAntennaAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterAntennaAntennasResponseData deviceMasterAntennaAntennas(@Param("elid") String elid, DeviceMasterAntennaAntennasRequestData body, @QueryMap(encoded=true) DeviceMasterAntennaAntennasQueryParams queryParams);

  /**
  * Get relations to Antenna entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterAntennaAntennas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterAntennaAntennasResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/Antennas?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterAntennaAntennasResponseData> deviceMasterAntennaAntennasWithHttpInfo(@Param("elid") String elid, DeviceMasterAntennaAntennasRequestData body, @QueryMap(encoded=true) DeviceMasterAntennaAntennasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterAntennaAntennas</code> method in a fluent style.
   */
  public static class DeviceMasterAntennaAntennasQueryParams extends HashMap<String, Object> {
    public DeviceMasterAntennaAntennasQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Antenna device master data
   * Query of the Antenna device master data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterAntennaDeviceMasterAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterAntennaDeviceMasterAntennaResponse deviceMasterAntennaDeviceMasterAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaDeviceMasterAntennaRequest body);

  /**
   * Query Antenna device master data
   * Similar to <code>deviceMasterAntennaDeviceMasterAntenna</code> but it also returns the http response headers .
   * Query of the Antenna device master data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterAntennaDeviceMasterAntennaResponse> deviceMasterAntennaDeviceMasterAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaDeviceMasterAntennaRequest body);


  /**
   * Query Antenna device master data
   * Query of the Antenna device master data
   * Note, this is equivalent to the other <code>deviceMasterAntennaDeviceMasterAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterAntennaDeviceMasterAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterAntennaDeviceMasterAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterAntennaDeviceMasterAntennaResponse deviceMasterAntennaDeviceMasterAntenna(@Param("elid") String elid, DeviceMasterAntennaDeviceMasterAntennaRequest body, @QueryMap(encoded=true) DeviceMasterAntennaDeviceMasterAntennaQueryParams queryParams);

  /**
  * Query Antenna device master data
  * Query of the Antenna device master data
  * Note, this is equivalent to the other <code>deviceMasterAntennaDeviceMasterAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterAntennaDeviceMasterAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterAntennaDeviceMasterAntennaResponse> deviceMasterAntennaDeviceMasterAntennaWithHttpInfo(@Param("elid") String elid, DeviceMasterAntennaDeviceMasterAntennaRequest body, @QueryMap(encoded=true) DeviceMasterAntennaDeviceMasterAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterAntennaDeviceMasterAntenna</code> method in a fluent style.
   */
  public static class DeviceMasterAntennaDeviceMasterAntennaQueryParams extends HashMap<String, Object> {
    public DeviceMasterAntennaDeviceMasterAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical antenna entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterAntennaLogicalAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/LogicalAntennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterAntennaLogicalAntennasResponseData deviceMasterAntennaLogicalAntennas(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaLogicalAntennasRequestData body);

  /**
   * Get relations to Logical antenna entities
   * Similar to <code>deviceMasterAntennaLogicalAntennas</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/LogicalAntennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterAntennaLogicalAntennasResponseData> deviceMasterAntennaLogicalAntennasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaLogicalAntennasRequestData body);


  /**
   * Get relations to Logical antenna entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterAntennaLogicalAntennas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterAntennaLogicalAntennasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterAntennaLogicalAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/LogicalAntennas?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterAntennaLogicalAntennasResponseData deviceMasterAntennaLogicalAntennas(@Param("elid") String elid, DeviceMasterAntennaLogicalAntennasRequestData body, @QueryMap(encoded=true) DeviceMasterAntennaLogicalAntennasQueryParams queryParams);

  /**
  * Get relations to Logical antenna entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterAntennaLogicalAntennas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterAntennaLogicalAntennasResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/LogicalAntennas?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterAntennaLogicalAntennasResponseData> deviceMasterAntennaLogicalAntennasWithHttpInfo(@Param("elid") String elid, DeviceMasterAntennaLogicalAntennasRequestData body, @QueryMap(encoded=true) DeviceMasterAntennaLogicalAntennasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterAntennaLogicalAntennas</code> method in a fluent style.
   */
  public static class DeviceMasterAntennaLogicalAntennasQueryParams extends HashMap<String, Object> {
    public DeviceMasterAntennaLogicalAntennasQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterAntennaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterAntennaQueryResponse deviceMasterAntennaQuery(@Param("sessionId") String sessionId, DeviceMasterAntennaQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterAntennaQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterAntennaQueryResponse> deviceMasterAntennaQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterAntennaQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>deviceMasterAntennaQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterAntennaQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterAntennaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterAntennaQueryResponse deviceMasterAntennaQuery(DeviceMasterAntennaQueryRequest body, @QueryMap(encoded=true) DeviceMasterAntennaQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>deviceMasterAntennaQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterAntennaQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterAntenna/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterAntennaQueryResponse> deviceMasterAntennaQueryWithHttpInfo(DeviceMasterAntennaQueryRequest body, @QueryMap(encoded=true) DeviceMasterAntennaQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterAntennaQuery</code> method in a fluent style.
   */
  public static class DeviceMasterAntennaQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterAntennaQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterAntennaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterAntennaSystemAttributesResponse deviceMasterAntennaSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterAntennaSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterAntennaSystemAttributesResponse> deviceMasterAntennaSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennaSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>deviceMasterAntennaSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterAntennaSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterAntennaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterAntennaSystemAttributesResponse deviceMasterAntennaSystemAttributes(@Param("elid") String elid, DeviceMasterAntennaSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterAntennaSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>deviceMasterAntennaSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterAntennaSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterAntennaSystemAttributesResponse> deviceMasterAntennaSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterAntennaSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterAntennaSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterAntennaSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterAntennaSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterAntennaSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
