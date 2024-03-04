package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddChangeTypeDeviceMasterDeviceRequestData;
import com.fntsoftware.businessgateway.entities.AddChangeTypeDeviceMasterDeviceResponse;
import com.fntsoftware.businessgateway.entities.AddModuleSlotCompatibilityDeviceMasterDeviceRequestData;
import com.fntsoftware.businessgateway.entities.AddModuleSlotCompatibilityDeviceMasterDeviceResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceChassisRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceChassisResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceDataSocketsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceDataSocketsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceDeviceMasterDeviceRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceDeviceMasterDeviceResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceIsModuleValidForSlotRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceIsModuleValidForSlotResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceModulesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceModulesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDevicePassiveModulesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDevicePassiveModulesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDevicePowerGridRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDevicePowerGridResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceServersBaseRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceServersBaseResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceServersRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceServersResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceSlotsRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceSlotsResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceStoragesBaseRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceStoragesBaseResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceStoragesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceStoragesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDeviceTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.RemoveChangeTypeDeviceMasterDeviceRequestData;
import com.fntsoftware.businessgateway.entities.RemoveChangeTypeDeviceMasterDeviceResponse;
import com.fntsoftware.businessgateway.entities.RemoveModuleSlotCompatibilityDeviceMasterDeviceRequestData;
import com.fntsoftware.businessgateway.entities.RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DeviceMasterDeviceApi extends ApiClient.Api {


  /**
   * Add change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddChangeTypeDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddChangeTypeDeviceMasterDeviceResponse addChangeTypeDeviceMasterDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, AddChangeTypeDeviceMasterDeviceRequestData body);

  /**
   * Add change type
   * Similar to <code>addChangeTypeDeviceMasterDevice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddChangeTypeDeviceMasterDeviceResponse> addChangeTypeDeviceMasterDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddChangeTypeDeviceMasterDeviceRequestData body);


  /**
   * Add change type
   * 
   * Note, this is equivalent to the other <code>addChangeTypeDeviceMasterDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddChangeTypeDeviceMasterDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddChangeTypeDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addChangeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddChangeTypeDeviceMasterDeviceResponse addChangeTypeDeviceMasterDevice(@Param("elid") String elid, AddChangeTypeDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) AddChangeTypeDeviceMasterDeviceQueryParams queryParams);

  /**
  * Add change type
  * 
  * Note, this is equivalent to the other <code>addChangeTypeDeviceMasterDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddChangeTypeDeviceMasterDeviceResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addChangeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddChangeTypeDeviceMasterDeviceResponse> addChangeTypeDeviceMasterDeviceWithHttpInfo(@Param("elid") String elid, AddChangeTypeDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) AddChangeTypeDeviceMasterDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addChangeTypeDeviceMasterDevice</code> method in a fluent style.
   */
  public static class AddChangeTypeDeviceMasterDeviceQueryParams extends HashMap<String, Object> {
    public AddChangeTypeDeviceMasterDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Add module/slot
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddModuleSlotCompatibilityDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addModuleSlotCompatibility?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddModuleSlotCompatibilityDeviceMasterDeviceResponse addModuleSlotCompatibilityDeviceMasterDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, AddModuleSlotCompatibilityDeviceMasterDeviceRequestData body);

  /**
   * Add module/slot
   * Similar to <code>addModuleSlotCompatibilityDeviceMasterDevice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addModuleSlotCompatibility?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddModuleSlotCompatibilityDeviceMasterDeviceResponse> addModuleSlotCompatibilityDeviceMasterDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddModuleSlotCompatibilityDeviceMasterDeviceRequestData body);


  /**
   * Add module/slot
   * 
   * Note, this is equivalent to the other <code>addModuleSlotCompatibilityDeviceMasterDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddModuleSlotCompatibilityDeviceMasterDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddModuleSlotCompatibilityDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addModuleSlotCompatibility?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddModuleSlotCompatibilityDeviceMasterDeviceResponse addModuleSlotCompatibilityDeviceMasterDevice(@Param("elid") String elid, AddModuleSlotCompatibilityDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) AddModuleSlotCompatibilityDeviceMasterDeviceQueryParams queryParams);

  /**
  * Add module/slot
  * 
  * Note, this is equivalent to the other <code>addModuleSlotCompatibilityDeviceMasterDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddModuleSlotCompatibilityDeviceMasterDeviceResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/addModuleSlotCompatibility?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddModuleSlotCompatibilityDeviceMasterDeviceResponse> addModuleSlotCompatibilityDeviceMasterDeviceWithHttpInfo(@Param("elid") String elid, AddModuleSlotCompatibilityDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) AddModuleSlotCompatibilityDeviceMasterDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addModuleSlotCompatibilityDeviceMasterDevice</code> method in a fluent style.
   */
  public static class AddModuleSlotCompatibilityDeviceMasterDeviceQueryParams extends HashMap<String, Object> {
    public AddModuleSlotCompatibilityDeviceMasterDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Chassis entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceChassisResponseData deviceMasterDeviceChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>deviceMasterDeviceChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceChassisResponseData> deviceMasterDeviceChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceChassisResponseData deviceMasterDeviceChassis(@Param("elid") String elid, DeviceMasterDeviceChassisRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceChassisResponseData> deviceMasterDeviceChassisWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceChassisRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceChassis</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceChassisQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data socket entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceDataSocketsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/DataSockets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceDataSocketsResponseData deviceMasterDeviceDataSockets(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceDataSocketsRequestData body);

  /**
   * Get relations to Data socket entities
   * Similar to <code>deviceMasterDeviceDataSockets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/DataSockets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceDataSocketsResponseData> deviceMasterDeviceDataSocketsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceDataSocketsRequestData body);


  /**
   * Get relations to Data socket entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceDataSockets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceDataSocketsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceDataSocketsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/DataSockets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceDataSocketsResponseData deviceMasterDeviceDataSockets(@Param("elid") String elid, DeviceMasterDeviceDataSocketsRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceDataSocketsQueryParams queryParams);

  /**
  * Get relations to Data socket entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceDataSockets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceDataSocketsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/DataSockets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceDataSocketsResponseData> deviceMasterDeviceDataSocketsWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceDataSocketsRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceDataSocketsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceDataSockets</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceDataSocketsQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceDataSocketsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Device master Device
   * Query the basic data from device master Device
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceDeviceMasterDeviceResponse deviceMasterDeviceDeviceMasterDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceDeviceMasterDeviceRequest body);

  /**
   * Query Device master Device
   * Similar to <code>deviceMasterDeviceDeviceMasterDevice</code> but it also returns the http response headers .
   * Query the basic data from device master Device
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceDeviceMasterDeviceResponse> deviceMasterDeviceDeviceMasterDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceDeviceMasterDeviceRequest body);


  /**
   * Query Device master Device
   * Query the basic data from device master Device
   * Note, this is equivalent to the other <code>deviceMasterDeviceDeviceMasterDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceDeviceMasterDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceDeviceMasterDeviceResponse deviceMasterDeviceDeviceMasterDevice(@Param("elid") String elid, DeviceMasterDeviceDeviceMasterDeviceRequest body, @QueryMap(encoded=true) DeviceMasterDeviceDeviceMasterDeviceQueryParams queryParams);

  /**
  * Query Device master Device
  * Query the basic data from device master Device
  * Note, this is equivalent to the other <code>deviceMasterDeviceDeviceMasterDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceDeviceMasterDeviceResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceDeviceMasterDeviceResponse> deviceMasterDeviceDeviceMasterDeviceWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceDeviceMasterDeviceRequest body, @QueryMap(encoded=true) DeviceMasterDeviceDeviceMasterDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceDeviceMasterDevice</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceDeviceMasterDeviceQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceDeviceMasterDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Check Module
   * Check module
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterDeviceIsModuleValidForSlotResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/isModuleValidForSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceIsModuleValidForSlotResponse deviceMasterDeviceIsModuleValidForSlot(@Param("sessionId") String sessionId, DeviceMasterDeviceIsModuleValidForSlotRequest body);

  /**
   * Check Module
   * Similar to <code>deviceMasterDeviceIsModuleValidForSlot</code> but it also returns the http response headers .
   * Check module
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/isModuleValidForSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceIsModuleValidForSlotResponse> deviceMasterDeviceIsModuleValidForSlotWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterDeviceIsModuleValidForSlotRequest body);


  /**
   * Check Module
   * Check module
   * Note, this is equivalent to the other <code>deviceMasterDeviceIsModuleValidForSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceIsModuleValidForSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceIsModuleValidForSlotResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/isModuleValidForSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceIsModuleValidForSlotResponse deviceMasterDeviceIsModuleValidForSlot(DeviceMasterDeviceIsModuleValidForSlotRequest body, @QueryMap(encoded=true) DeviceMasterDeviceIsModuleValidForSlotQueryParams queryParams);

  /**
  * Check Module
  * Check module
  * Note, this is equivalent to the other <code>deviceMasterDeviceIsModuleValidForSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceIsModuleValidForSlotResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/isModuleValidForSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceIsModuleValidForSlotResponse> deviceMasterDeviceIsModuleValidForSlotWithHttpInfo(DeviceMasterDeviceIsModuleValidForSlotRequest body, @QueryMap(encoded=true) DeviceMasterDeviceIsModuleValidForSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceIsModuleValidForSlot</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceIsModuleValidForSlotQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceIsModuleValidForSlotQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Module entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Modules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceModulesResponseData deviceMasterDeviceModules(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceModulesRequestData body);

  /**
   * Get relations to Module entities
   * Similar to <code>deviceMasterDeviceModules</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Modules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceModulesResponseData> deviceMasterDeviceModulesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceModulesRequestData body);


  /**
   * Get relations to Module entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceModules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceModulesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Modules?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceModulesResponseData deviceMasterDeviceModules(@Param("elid") String elid, DeviceMasterDeviceModulesRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceModulesQueryParams queryParams);

  /**
  * Get relations to Module entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceModules</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceModulesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Modules?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceModulesResponseData> deviceMasterDeviceModulesWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceModulesRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceModulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceModules</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceModulesQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceModulesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Passive module entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDevicePassiveModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PassiveModules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDevicePassiveModulesResponseData deviceMasterDevicePassiveModules(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDevicePassiveModulesRequestData body);

  /**
   * Get relations to Passive module entities
   * Similar to <code>deviceMasterDevicePassiveModules</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PassiveModules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDevicePassiveModulesResponseData> deviceMasterDevicePassiveModulesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDevicePassiveModulesRequestData body);


  /**
   * Get relations to Passive module entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDevicePassiveModules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDevicePassiveModulesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDevicePassiveModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PassiveModules?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDevicePassiveModulesResponseData deviceMasterDevicePassiveModules(@Param("elid") String elid, DeviceMasterDevicePassiveModulesRequestData body, @QueryMap(encoded=true) DeviceMasterDevicePassiveModulesQueryParams queryParams);

  /**
  * Get relations to Passive module entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDevicePassiveModules</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDevicePassiveModulesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PassiveModules?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDevicePassiveModulesResponseData> deviceMasterDevicePassiveModulesWithHttpInfo(@Param("elid") String elid, DeviceMasterDevicePassiveModulesRequestData body, @QueryMap(encoded=true) DeviceMasterDevicePassiveModulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDevicePassiveModules</code> method in a fluent style.
   */
  public static class DeviceMasterDevicePassiveModulesQueryParams extends HashMap<String, Object> {
    public DeviceMasterDevicePassiveModulesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power grid entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDevicePowerGridResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PowerGrid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDevicePowerGridResponseData deviceMasterDevicePowerGrid(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDevicePowerGridRequestData body);

  /**
   * Get relations to Power grid entities
   * Similar to <code>deviceMasterDevicePowerGrid</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PowerGrid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDevicePowerGridResponseData> deviceMasterDevicePowerGridWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDevicePowerGridRequestData body);


  /**
   * Get relations to Power grid entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDevicePowerGrid</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDevicePowerGridQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDevicePowerGridResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PowerGrid?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDevicePowerGridResponseData deviceMasterDevicePowerGrid(@Param("elid") String elid, DeviceMasterDevicePowerGridRequestData body, @QueryMap(encoded=true) DeviceMasterDevicePowerGridQueryParams queryParams);

  /**
  * Get relations to Power grid entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDevicePowerGrid</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDevicePowerGridResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/PowerGrid?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDevicePowerGridResponseData> deviceMasterDevicePowerGridWithHttpInfo(@Param("elid") String elid, DeviceMasterDevicePowerGridRequestData body, @QueryMap(encoded=true) DeviceMasterDevicePowerGridQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDevicePowerGrid</code> method in a fluent style.
   */
  public static class DeviceMasterDevicePowerGridQueryParams extends HashMap<String, Object> {
    public DeviceMasterDevicePowerGridQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterDeviceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceQueryResponse deviceMasterDeviceQuery(@Param("sessionId") String sessionId, DeviceMasterDeviceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterDeviceQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceQueryResponse> deviceMasterDeviceQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterDeviceQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterDeviceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceQueryResponse deviceMasterDeviceQuery(DeviceMasterDeviceQueryRequest body, @QueryMap(encoded=true) DeviceMasterDeviceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterDeviceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceQueryResponse> deviceMasterDeviceQueryWithHttpInfo(DeviceMasterDeviceQueryRequest body, @QueryMap(encoded=true) DeviceMasterDeviceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceQuery</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceServersResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceServersResponseData deviceMasterDeviceServers(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>deviceMasterDeviceServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceServersResponseData> deviceMasterDeviceServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceServersResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceServersResponseData deviceMasterDeviceServers(@Param("elid") String elid, DeviceMasterDeviceServersRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceServersResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceServersResponseData> deviceMasterDeviceServersWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceServersRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceServers</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceServersQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server (base) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceServersBaseResponseData deviceMasterDeviceServersBase(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceServersBaseRequestData body);

  /**
   * Get relations to Server (base) entities
   * Similar to <code>deviceMasterDeviceServersBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceServersBaseResponseData> deviceMasterDeviceServersBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceServersBaseRequestData body);


  /**
   * Get relations to Server (base) entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceServersBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceServersBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceServersBaseResponseData deviceMasterDeviceServersBase(@Param("elid") String elid, DeviceMasterDeviceServersBaseRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceServersBaseQueryParams queryParams);

  /**
  * Get relations to Server (base) entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceServersBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceServersBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/ServersBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceServersBaseResponseData> deviceMasterDeviceServersBaseWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceServersBaseRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceServersBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceServersBase</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceServersBaseQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceServersBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Slots
   * Query the basic data from Slots
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceSlotsResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Slots?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceSlotsResponse deviceMasterDeviceSlots(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceSlotsRequest body);

  /**
   * Query Slots
   * Similar to <code>deviceMasterDeviceSlots</code> but it also returns the http response headers .
   * Query the basic data from Slots
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Slots?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceSlotsResponse> deviceMasterDeviceSlotsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceSlotsRequest body);


  /**
   * Query Slots
   * Query the basic data from Slots
   * Note, this is equivalent to the other <code>deviceMasterDeviceSlots</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceSlotsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceSlotsResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Slots?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceSlotsResponse deviceMasterDeviceSlots(@Param("elid") String elid, DeviceMasterDeviceSlotsRequest body, @QueryMap(encoded=true) DeviceMasterDeviceSlotsQueryParams queryParams);

  /**
  * Query Slots
  * Query the basic data from Slots
  * Note, this is equivalent to the other <code>deviceMasterDeviceSlots</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceSlotsResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Slots?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceSlotsResponse> deviceMasterDeviceSlotsWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceSlotsRequest body, @QueryMap(encoded=true) DeviceMasterDeviceSlotsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceSlots</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceSlotsQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceSlotsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceStoragesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Storages?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceStoragesResponseData deviceMasterDeviceStorages(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceStoragesRequestData body);

  /**
   * Get relations to Storage entities
   * Similar to <code>deviceMasterDeviceStorages</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Storages?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceStoragesResponseData> deviceMasterDeviceStoragesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceStoragesRequestData body);


  /**
   * Get relations to Storage entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceStorages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceStoragesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceStoragesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Storages?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceStoragesResponseData deviceMasterDeviceStorages(@Param("elid") String elid, DeviceMasterDeviceStoragesRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceStoragesQueryParams queryParams);

  /**
  * Get relations to Storage entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceStorages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceStoragesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Storages?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceStoragesResponseData> deviceMasterDeviceStoragesWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceStoragesRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceStoragesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceStorages</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceStoragesQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceStoragesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage (base) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceStoragesBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/StoragesBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceStoragesBaseResponseData deviceMasterDeviceStoragesBase(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceStoragesBaseRequestData body);

  /**
   * Get relations to Storage (base) entities
   * Similar to <code>deviceMasterDeviceStoragesBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/StoragesBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceStoragesBaseResponseData> deviceMasterDeviceStoragesBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceStoragesBaseRequestData body);


  /**
   * Get relations to Storage (base) entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceStoragesBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceStoragesBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceStoragesBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/StoragesBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceStoragesBaseResponseData deviceMasterDeviceStoragesBase(@Param("elid") String elid, DeviceMasterDeviceStoragesBaseRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceStoragesBaseQueryParams queryParams);

  /**
  * Get relations to Storage (base) entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceStoragesBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceStoragesBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/StoragesBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceStoragesBaseResponseData> deviceMasterDeviceStoragesBaseWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceStoragesBaseRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceStoragesBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceStoragesBase</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceStoragesBaseQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceStoragesBaseQueryParams sessionId(final String value) {
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
   * @return DeviceMasterDeviceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceSystemAttributesResponse deviceMasterDeviceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterDeviceSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceSystemAttributesResponse> deviceMasterDeviceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterDeviceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceSystemAttributesResponse deviceMasterDeviceSystemAttributes(@Param("elid") String elid, DeviceMasterDeviceSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterDeviceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterDeviceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceSystemAttributesResponse> deviceMasterDeviceSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterDeviceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Terminal entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDeviceTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDeviceTerminalsResponseData deviceMasterDeviceTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>deviceMasterDeviceTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDeviceTerminalsResponseData> deviceMasterDeviceTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDeviceTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDeviceTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDeviceTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDeviceTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDeviceTerminalsResponseData deviceMasterDeviceTerminals(@Param("elid") String elid, DeviceMasterDeviceTerminalsRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDeviceTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDeviceTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDeviceTerminalsResponseData> deviceMasterDeviceTerminalsWithHttpInfo(@Param("elid") String elid, DeviceMasterDeviceTerminalsRequestData body, @QueryMap(encoded=true) DeviceMasterDeviceTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDeviceTerminals</code> method in a fluent style.
   */
  public static class DeviceMasterDeviceTerminalsQueryParams extends HashMap<String, Object> {
    public DeviceMasterDeviceTerminalsQueryParams sessionId(final String value) {
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
   * @return RemoveChangeTypeDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveChangeTypeDeviceMasterDeviceResponse removeChangeTypeDeviceMasterDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveChangeTypeDeviceMasterDeviceRequestData body);

  /**
   * Remove change type
   * Similar to <code>removeChangeTypeDeviceMasterDevice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveChangeTypeDeviceMasterDeviceResponse> removeChangeTypeDeviceMasterDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveChangeTypeDeviceMasterDeviceRequestData body);


  /**
   * Remove change type
   * 
   * Note, this is equivalent to the other <code>removeChangeTypeDeviceMasterDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveChangeTypeDeviceMasterDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveChangeTypeDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeChangeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveChangeTypeDeviceMasterDeviceResponse removeChangeTypeDeviceMasterDevice(@Param("elid") String elid, RemoveChangeTypeDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) RemoveChangeTypeDeviceMasterDeviceQueryParams queryParams);

  /**
  * Remove change type
  * 
  * Note, this is equivalent to the other <code>removeChangeTypeDeviceMasterDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveChangeTypeDeviceMasterDeviceResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeChangeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveChangeTypeDeviceMasterDeviceResponse> removeChangeTypeDeviceMasterDeviceWithHttpInfo(@Param("elid") String elid, RemoveChangeTypeDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) RemoveChangeTypeDeviceMasterDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeChangeTypeDeviceMasterDevice</code> method in a fluent style.
   */
  public static class RemoveChangeTypeDeviceMasterDeviceQueryParams extends HashMap<String, Object> {
    public RemoveChangeTypeDeviceMasterDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove module/slot
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeModuleSlotCompatibility?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse removeModuleSlotCompatibilityDeviceMasterDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveModuleSlotCompatibilityDeviceMasterDeviceRequestData body);

  /**
   * Remove module/slot
   * Similar to <code>removeModuleSlotCompatibilityDeviceMasterDevice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeModuleSlotCompatibility?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse> removeModuleSlotCompatibilityDeviceMasterDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveModuleSlotCompatibilityDeviceMasterDeviceRequestData body);


  /**
   * Remove module/slot
   * 
   * Note, this is equivalent to the other <code>removeModuleSlotCompatibilityDeviceMasterDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveModuleSlotCompatibilityDeviceMasterDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeModuleSlotCompatibility?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse removeModuleSlotCompatibilityDeviceMasterDevice(@Param("elid") String elid, RemoveModuleSlotCompatibilityDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) RemoveModuleSlotCompatibilityDeviceMasterDeviceQueryParams queryParams);

  /**
  * Remove module/slot
  * 
  * Note, this is equivalent to the other <code>removeModuleSlotCompatibilityDeviceMasterDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMasterDevice/{elid}/removeModuleSlotCompatibility?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveModuleSlotCompatibilityDeviceMasterDeviceResponse> removeModuleSlotCompatibilityDeviceMasterDeviceWithHttpInfo(@Param("elid") String elid, RemoveModuleSlotCompatibilityDeviceMasterDeviceRequestData body, @QueryMap(encoded=true) RemoveModuleSlotCompatibilityDeviceMasterDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeModuleSlotCompatibilityDeviceMasterDevice</code> method in a fluent style.
   */
  public static class RemoveModuleSlotCompatibilityDeviceMasterDeviceQueryParams extends HashMap<String, Object> {
    public RemoveModuleSlotCompatibilityDeviceMasterDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
