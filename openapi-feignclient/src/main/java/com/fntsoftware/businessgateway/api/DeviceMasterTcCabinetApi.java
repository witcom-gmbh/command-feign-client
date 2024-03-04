package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddChangeTypeDeviceMasterTcCabinetRequestData;
import com.fntsoftware.businessgateway.entities.AddChangeTypeDeviceMasterTcCabinetResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterTcCabinetDeviceMasterTcCabinetRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterTcCabinetDeviceMasterTcCabinetResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterTcCabinetQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterTcCabinetQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterTcCabinetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterTcCabinetSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.RemoveChangeTypeDeviceMasterTcCabinetRequestData;
import com.fntsoftware.businessgateway.entities.RemoveChangeTypeDeviceMasterTcCabinetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DeviceMasterTcCabinetApi extends ApiClient.Api {


  /**
   * Add change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddChangeTypeDeviceMasterTcCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddChangeTypeDeviceMasterTcCabinetResponse addChangeTypeDeviceMasterTcCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, AddChangeTypeDeviceMasterTcCabinetRequestData body);

  /**
   * Add change type
   * Similar to <code>addChangeTypeDeviceMasterTcCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddChangeTypeDeviceMasterTcCabinetResponse> addChangeTypeDeviceMasterTcCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddChangeTypeDeviceMasterTcCabinetRequestData body);


  /**
   * Add change type
   * 
   * Note, this is equivalent to the other <code>addChangeTypeDeviceMasterTcCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddChangeTypeDeviceMasterTcCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddChangeTypeDeviceMasterTcCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddChangeTypeDeviceMasterTcCabinetResponse addChangeTypeDeviceMasterTcCabinet(@Param("elid") String elid, AddChangeTypeDeviceMasterTcCabinetRequestData body, @QueryMap(encoded=true) AddChangeTypeDeviceMasterTcCabinetQueryParams queryParams);

  /**
  * Add change type
  * 
  * Note, this is equivalent to the other <code>addChangeTypeDeviceMasterTcCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddChangeTypeDeviceMasterTcCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/addChangeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddChangeTypeDeviceMasterTcCabinetResponse> addChangeTypeDeviceMasterTcCabinetWithHttpInfo(@Param("elid") String elid, AddChangeTypeDeviceMasterTcCabinetRequestData body, @QueryMap(encoded=true) AddChangeTypeDeviceMasterTcCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addChangeTypeDeviceMasterTcCabinet</code> method in a fluent style.
   */
  public static class AddChangeTypeDeviceMasterTcCabinetQueryParams extends HashMap<String, Object> {
    public AddChangeTypeDeviceMasterTcCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Device master TC cabinet
   * Query the basic data from device master TC cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterTcCabinetDeviceMasterTcCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterTcCabinetDeviceMasterTcCabinetResponse deviceMasterTcCabinetDeviceMasterTcCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterTcCabinetDeviceMasterTcCabinetRequest body);

  /**
   * Query Device master TC cabinet
   * Similar to <code>deviceMasterTcCabinetDeviceMasterTcCabinet</code> but it also returns the http response headers .
   * Query the basic data from device master TC cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterTcCabinetDeviceMasterTcCabinetResponse> deviceMasterTcCabinetDeviceMasterTcCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterTcCabinetDeviceMasterTcCabinetRequest body);


  /**
   * Query Device master TC cabinet
   * Query the basic data from device master TC cabinet
   * Note, this is equivalent to the other <code>deviceMasterTcCabinetDeviceMasterTcCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterTcCabinetDeviceMasterTcCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterTcCabinetDeviceMasterTcCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterTcCabinetDeviceMasterTcCabinetResponse deviceMasterTcCabinetDeviceMasterTcCabinet(@Param("elid") String elid, DeviceMasterTcCabinetDeviceMasterTcCabinetRequest body, @QueryMap(encoded=true) DeviceMasterTcCabinetDeviceMasterTcCabinetQueryParams queryParams);

  /**
  * Query Device master TC cabinet
  * Query the basic data from device master TC cabinet
  * Note, this is equivalent to the other <code>deviceMasterTcCabinetDeviceMasterTcCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterTcCabinetDeviceMasterTcCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterTcCabinetDeviceMasterTcCabinetResponse> deviceMasterTcCabinetDeviceMasterTcCabinetWithHttpInfo(@Param("elid") String elid, DeviceMasterTcCabinetDeviceMasterTcCabinetRequest body, @QueryMap(encoded=true) DeviceMasterTcCabinetDeviceMasterTcCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterTcCabinetDeviceMasterTcCabinet</code> method in a fluent style.
   */
  public static class DeviceMasterTcCabinetDeviceMasterTcCabinetQueryParams extends HashMap<String, Object> {
    public DeviceMasterTcCabinetDeviceMasterTcCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterTcCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterTcCabinetQueryResponse deviceMasterTcCabinetQuery(@Param("sessionId") String sessionId, DeviceMasterTcCabinetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterTcCabinetQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterTcCabinetQueryResponse> deviceMasterTcCabinetQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterTcCabinetQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterTcCabinetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterTcCabinetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterTcCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterTcCabinetQueryResponse deviceMasterTcCabinetQuery(DeviceMasterTcCabinetQueryRequest body, @QueryMap(encoded=true) DeviceMasterTcCabinetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterTcCabinetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterTcCabinetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterTcCabinetQueryResponse> deviceMasterTcCabinetQueryWithHttpInfo(DeviceMasterTcCabinetQueryRequest body, @QueryMap(encoded=true) DeviceMasterTcCabinetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterTcCabinetQuery</code> method in a fluent style.
   */
  public static class DeviceMasterTcCabinetQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterTcCabinetQueryQueryParams sessionId(final String value) {
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
   * @return DeviceMasterTcCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterTcCabinetSystemAttributesResponse deviceMasterTcCabinetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterTcCabinetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterTcCabinetSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterTcCabinetSystemAttributesResponse> deviceMasterTcCabinetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterTcCabinetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterTcCabinetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterTcCabinetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterTcCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterTcCabinetSystemAttributesResponse deviceMasterTcCabinetSystemAttributes(@Param("elid") String elid, DeviceMasterTcCabinetSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterTcCabinetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterTcCabinetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterTcCabinetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterTcCabinetSystemAttributesResponse> deviceMasterTcCabinetSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterTcCabinetSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterTcCabinetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterTcCabinetSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterTcCabinetSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterTcCabinetSystemAttributesQueryParams sessionId(final String value) {
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
   * @return RemoveChangeTypeDeviceMasterTcCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveChangeTypeDeviceMasterTcCabinetResponse removeChangeTypeDeviceMasterTcCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveChangeTypeDeviceMasterTcCabinetRequestData body);

  /**
   * Remove change type
   * Similar to <code>removeChangeTypeDeviceMasterTcCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveChangeTypeDeviceMasterTcCabinetResponse> removeChangeTypeDeviceMasterTcCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveChangeTypeDeviceMasterTcCabinetRequestData body);


  /**
   * Remove change type
   * 
   * Note, this is equivalent to the other <code>removeChangeTypeDeviceMasterTcCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveChangeTypeDeviceMasterTcCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveChangeTypeDeviceMasterTcCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveChangeTypeDeviceMasterTcCabinetResponse removeChangeTypeDeviceMasterTcCabinet(@Param("elid") String elid, RemoveChangeTypeDeviceMasterTcCabinetRequestData body, @QueryMap(encoded=true) RemoveChangeTypeDeviceMasterTcCabinetQueryParams queryParams);

  /**
  * Remove change type
  * 
  * Note, this is equivalent to the other <code>removeChangeTypeDeviceMasterTcCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveChangeTypeDeviceMasterTcCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterTcCabinet/{elid}/removeChangeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveChangeTypeDeviceMasterTcCabinetResponse> removeChangeTypeDeviceMasterTcCabinetWithHttpInfo(@Param("elid") String elid, RemoveChangeTypeDeviceMasterTcCabinetRequestData body, @QueryMap(encoded=true) RemoveChangeTypeDeviceMasterTcCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeChangeTypeDeviceMasterTcCabinet</code> method in a fluent style.
   */
  public static class RemoveChangeTypeDeviceMasterTcCabinetQueryParams extends HashMap<String, Object> {
    public RemoveChangeTypeDeviceMasterTcCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
