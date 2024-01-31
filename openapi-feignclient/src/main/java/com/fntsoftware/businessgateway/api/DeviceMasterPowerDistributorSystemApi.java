package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddChangeTypeDeviceMasterPowerDistributorSystemRequestData;
import com.fntsoftware.businessgateway.entities.AddChangeTypeDeviceMasterPowerDistributorSystemResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemPowerDistributorSystemsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.RemoveChangeTypeDeviceMasterPowerDistributorSystemRequestData;
import com.fntsoftware.businessgateway.entities.RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DeviceMasterPowerDistributorSystemApi extends ApiClient.Api {


  /**
   * Add change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddChangeTypeDeviceMasterPowerDistributorSystemResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddChangeTypeDeviceMasterPowerDistributorSystemResponse addChangeTypeDeviceMasterPowerDistributorSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, AddChangeTypeDeviceMasterPowerDistributorSystemRequestData body);

  /**
   * Add change type
   * Similar to <code>addChangeTypeDeviceMasterPowerDistributorSystem</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddChangeTypeDeviceMasterPowerDistributorSystemResponse> addChangeTypeDeviceMasterPowerDistributorSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddChangeTypeDeviceMasterPowerDistributorSystemRequestData body);


  /**
   * Add change type
   * 
   * Note, this is equivalent to the other <code>addChangeTypeDeviceMasterPowerDistributorSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddChangeTypeDeviceMasterPowerDistributorSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddChangeTypeDeviceMasterPowerDistributorSystemResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddChangeTypeDeviceMasterPowerDistributorSystemResponse addChangeTypeDeviceMasterPowerDistributorSystem(@Param("elid") String elid, AddChangeTypeDeviceMasterPowerDistributorSystemRequestData body, @QueryMap(encoded=true) AddChangeTypeDeviceMasterPowerDistributorSystemQueryParams queryParams);

  /**
  * Add change type
  * 
  * Note, this is equivalent to the other <code>addChangeTypeDeviceMasterPowerDistributorSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddChangeTypeDeviceMasterPowerDistributorSystemResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/addChangeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddChangeTypeDeviceMasterPowerDistributorSystemResponse> addChangeTypeDeviceMasterPowerDistributorSystemWithHttpInfo(@Param("elid") String elid, AddChangeTypeDeviceMasterPowerDistributorSystemRequestData body, @QueryMap(encoded=true) AddChangeTypeDeviceMasterPowerDistributorSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addChangeTypeDeviceMasterPowerDistributorSystem</code> method in a fluent style.
   */
  public static class AddChangeTypeDeviceMasterPowerDistributorSystemQueryParams extends HashMap<String, Object> {
    public AddChangeTypeDeviceMasterPowerDistributorSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Device master power distributor system
   * Query the basic data from device master Power distributor system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemRequest body);

  /**
   * Query Device master power distributor system
   * Similar to <code>deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystem</code> but it also returns the http response headers .
   * Query the basic data from device master Power distributor system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse> deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemRequest body);


  /**
   * Query Device master power distributor system
   * Query the basic data from device master Power distributor system
   * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystem(@Param("elid") String elid, DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemRequest body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemQueryParams queryParams);

  /**
  * Query Device master power distributor system
  * Query the basic data from device master Power distributor system
  * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemResponse> deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemWithHttpInfo(@Param("elid") String elid, DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemRequest body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystem</code> method in a fluent style.
   */
  public static class DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemQueryParams extends HashMap<String, Object> {
    public DeviceMasterPowerDistributorSystemDeviceMasterPowerDistributorSystemQueryParams sessionId(final String value) {
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
   * @return DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData deviceMasterPowerDistributorSystemPowerDistributorSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemPowerDistributorSystemsRequestData body);

  /**
   * Get relations to Power distributor system entities
   * Similar to <code>deviceMasterPowerDistributorSystemPowerDistributorSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData> deviceMasterPowerDistributorSystemPowerDistributorSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemPowerDistributorSystemsRequestData body);


  /**
   * Get relations to Power distributor system entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemPowerDistributorSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPowerDistributorSystemPowerDistributorSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData deviceMasterPowerDistributorSystemPowerDistributorSystems(@Param("elid") String elid, DeviceMasterPowerDistributorSystemPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemPowerDistributorSystemsQueryParams queryParams);

  /**
  * Get relations to Power distributor system entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemPowerDistributorSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/PowerDistributorSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPowerDistributorSystemPowerDistributorSystemsResponseData> deviceMasterPowerDistributorSystemPowerDistributorSystemsWithHttpInfo(@Param("elid") String elid, DeviceMasterPowerDistributorSystemPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemPowerDistributorSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPowerDistributorSystemPowerDistributorSystems</code> method in a fluent style.
   */
  public static class DeviceMasterPowerDistributorSystemPowerDistributorSystemsQueryParams extends HashMap<String, Object> {
    public DeviceMasterPowerDistributorSystemPowerDistributorSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterPowerDistributorSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemQueryResponse deviceMasterPowerDistributorSystemQuery(@Param("sessionId") String sessionId, DeviceMasterPowerDistributorSystemQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterPowerDistributorSystemQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPowerDistributorSystemQueryResponse> deviceMasterPowerDistributorSystemQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterPowerDistributorSystemQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPowerDistributorSystemQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPowerDistributorSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemQueryResponse deviceMasterPowerDistributorSystemQuery(DeviceMasterPowerDistributorSystemQueryRequest body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPowerDistributorSystemQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPowerDistributorSystemQueryResponse> deviceMasterPowerDistributorSystemQueryWithHttpInfo(DeviceMasterPowerDistributorSystemQueryRequest body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPowerDistributorSystemQuery</code> method in a fluent style.
   */
  public static class DeviceMasterPowerDistributorSystemQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterPowerDistributorSystemQueryQueryParams sessionId(final String value) {
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
   * @return DeviceMasterPowerDistributorSystemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemSystemAttributesResponse deviceMasterPowerDistributorSystemSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterPowerDistributorSystemSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPowerDistributorSystemSystemAttributesResponse> deviceMasterPowerDistributorSystemSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPowerDistributorSystemSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPowerDistributorSystemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemSystemAttributesResponse deviceMasterPowerDistributorSystemSystemAttributes(@Param("elid") String elid, DeviceMasterPowerDistributorSystemSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystemSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPowerDistributorSystemSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPowerDistributorSystemSystemAttributesResponse> deviceMasterPowerDistributorSystemSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterPowerDistributorSystemSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPowerDistributorSystemSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterPowerDistributorSystemSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterPowerDistributorSystemSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse removeChangeTypeDeviceMasterPowerDistributorSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveChangeTypeDeviceMasterPowerDistributorSystemRequestData body);

  /**
   * Remove change type
   * Similar to <code>removeChangeTypeDeviceMasterPowerDistributorSystem</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse> removeChangeTypeDeviceMasterPowerDistributorSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveChangeTypeDeviceMasterPowerDistributorSystemRequestData body);


  /**
   * Remove change type
   * 
   * Note, this is equivalent to the other <code>removeChangeTypeDeviceMasterPowerDistributorSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveChangeTypeDeviceMasterPowerDistributorSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse removeChangeTypeDeviceMasterPowerDistributorSystem(@Param("elid") String elid, RemoveChangeTypeDeviceMasterPowerDistributorSystemRequestData body, @QueryMap(encoded=true) RemoveChangeTypeDeviceMasterPowerDistributorSystemQueryParams queryParams);

  /**
  * Remove change type
  * 
  * Note, this is equivalent to the other <code>removeChangeTypeDeviceMasterPowerDistributorSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterPowerDistributorSystem/{elid}/removeChangeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveChangeTypeDeviceMasterPowerDistributorSystemResponse> removeChangeTypeDeviceMasterPowerDistributorSystemWithHttpInfo(@Param("elid") String elid, RemoveChangeTypeDeviceMasterPowerDistributorSystemRequestData body, @QueryMap(encoded=true) RemoveChangeTypeDeviceMasterPowerDistributorSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeChangeTypeDeviceMasterPowerDistributorSystem</code> method in a fluent style.
   */
  public static class RemoveChangeTypeDeviceMasterPowerDistributorSystemQueryParams extends HashMap<String, Object> {
    public RemoveChangeTypeDeviceMasterPowerDistributorSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
