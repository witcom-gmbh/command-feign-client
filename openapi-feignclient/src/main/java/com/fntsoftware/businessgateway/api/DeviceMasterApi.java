package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeviceMasterAntennasRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterAntennasResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterCabinetSuppliesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterChassisRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterChassisResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDataSocketsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDataSocketsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDevicesMiscRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterDevicesMiscResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxesFistRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxesFistResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterJunctionBoxesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterModulesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterModulesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterNmModulesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterNmModulesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPassiveModulesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPassiveModulesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPdusRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPdusResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterPowerDistributorSystemsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterServersBaseRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterServersBaseResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterServersRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterServersResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterStoragesBaseRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterStoragesBaseResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterStoragesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterStoragesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterSwitchCabinetsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMasterSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMasterSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMasterTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMasterTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.UpdateDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDeviceMasterResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DeviceMasterApi extends ApiClient.Api {


  /**
   * Get relations to Antenna entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterAntennasResponseData deviceMasterAntennas(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennasRequestData body);

  /**
   * Get relations to Antenna entities
   * Similar to <code>deviceMasterAntennas</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterAntennasResponseData> deviceMasterAntennasWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterAntennasRequestData body);


  /**
   * Get relations to Antenna entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterAntennas</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterAntennasQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterAntennasResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Antennas?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterAntennasResponseData deviceMasterAntennas(@Param("elid") String elid, DeviceMasterAntennasRequestData body, @QueryMap(encoded=true) DeviceMasterAntennasQueryParams queryParams);

  /**
  * Get relations to Antenna entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterAntennas</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterAntennasResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Antennas?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterAntennasResponseData> deviceMasterAntennasWithHttpInfo(@Param("elid") String elid, DeviceMasterAntennasRequestData body, @QueryMap(encoded=true) DeviceMasterAntennasQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterAntennas</code> method in a fluent style.
   */
  public static class DeviceMasterAntennasQueryParams extends HashMap<String, Object> {
    public DeviceMasterAntennasQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cabinet supplies entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterCabinetSuppliesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/CabinetSupplies?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterCabinetSuppliesResponseData deviceMasterCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetSuppliesRequestData body);

  /**
   * Get relations to Cabinet supplies entities
   * Similar to <code>deviceMasterCabinetSupplies</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/CabinetSupplies?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterCabinetSuppliesResponseData> deviceMasterCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterCabinetSuppliesRequestData body);


  /**
   * Get relations to Cabinet supplies entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterCabinetSuppliesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/CabinetSupplies?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterCabinetSuppliesResponseData deviceMasterCabinetSupplies(@Param("elid") String elid, DeviceMasterCabinetSuppliesRequestData body, @QueryMap(encoded=true) DeviceMasterCabinetSuppliesQueryParams queryParams);

  /**
  * Get relations to Cabinet supplies entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterCabinetSuppliesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/CabinetSupplies?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterCabinetSuppliesResponseData> deviceMasterCabinetSuppliesWithHttpInfo(@Param("elid") String elid, DeviceMasterCabinetSuppliesRequestData body, @QueryMap(encoded=true) DeviceMasterCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterCabinetSupplies</code> method in a fluent style.
   */
  public static class DeviceMasterCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public DeviceMasterCabinetSuppliesQueryParams sessionId(final String value) {
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
   * @return DeviceMasterChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterChassisResponseData deviceMasterChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>deviceMasterChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterChassisResponseData> deviceMasterChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterChassisResponseData deviceMasterChassis(@Param("elid") String elid, DeviceMasterChassisRequestData body, @QueryMap(encoded=true) DeviceMasterChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterChassisResponseData> deviceMasterChassisWithHttpInfo(@Param("elid") String elid, DeviceMasterChassisRequestData body, @QueryMap(encoded=true) DeviceMasterChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterChassis</code> method in a fluent style.
   */
  public static class DeviceMasterChassisQueryParams extends HashMap<String, Object> {
    public DeviceMasterChassisQueryParams sessionId(final String value) {
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
   * @return DeviceMasterDataSocketsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DataSockets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDataSocketsResponseData deviceMasterDataSockets(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDataSocketsRequestData body);

  /**
   * Get relations to Data socket entities
   * Similar to <code>deviceMasterDataSockets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DataSockets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDataSocketsResponseData> deviceMasterDataSocketsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDataSocketsRequestData body);


  /**
   * Get relations to Data socket entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDataSockets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDataSocketsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDataSocketsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DataSockets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDataSocketsResponseData deviceMasterDataSockets(@Param("elid") String elid, DeviceMasterDataSocketsRequestData body, @QueryMap(encoded=true) DeviceMasterDataSocketsQueryParams queryParams);

  /**
  * Get relations to Data socket entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDataSockets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDataSocketsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DataSockets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDataSocketsResponseData> deviceMasterDataSocketsWithHttpInfo(@Param("elid") String elid, DeviceMasterDataSocketsRequestData body, @QueryMap(encoded=true) DeviceMasterDataSocketsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDataSockets</code> method in a fluent style.
   */
  public static class DeviceMasterDataSocketsQueryParams extends HashMap<String, Object> {
    public DeviceMasterDataSocketsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (misc) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterDevicesMiscResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DevicesMisc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterDevicesMiscResponseData deviceMasterDevicesMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDevicesMiscRequestData body);

  /**
   * Get relations to Device (misc) entities
   * Similar to <code>deviceMasterDevicesMisc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DevicesMisc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterDevicesMiscResponseData> deviceMasterDevicesMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterDevicesMiscRequestData body);


  /**
   * Get relations to Device (misc) entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterDevicesMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterDevicesMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterDevicesMiscResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DevicesMisc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterDevicesMiscResponseData deviceMasterDevicesMisc(@Param("elid") String elid, DeviceMasterDevicesMiscRequestData body, @QueryMap(encoded=true) DeviceMasterDevicesMiscQueryParams queryParams);

  /**
  * Get relations to Device (misc) entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterDevicesMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterDevicesMiscResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/DevicesMisc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterDevicesMiscResponseData> deviceMasterDevicesMiscWithHttpInfo(@Param("elid") String elid, DeviceMasterDevicesMiscRequestData body, @QueryMap(encoded=true) DeviceMasterDevicesMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterDevicesMisc</code> method in a fluent style.
   */
  public static class DeviceMasterDevicesMiscQueryParams extends HashMap<String, Object> {
    public DeviceMasterDevicesMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Junction box entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterJunctionBoxesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxesResponseData deviceMasterJunctionBoxes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxesRequestData body);

  /**
   * Get relations to Junction box entities
   * Similar to <code>deviceMasterJunctionBoxes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxesResponseData> deviceMasterJunctionBoxesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxesRequestData body);


  /**
   * Get relations to Junction box entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxesResponseData deviceMasterJunctionBoxes(@Param("elid") String elid, DeviceMasterJunctionBoxesRequestData body, @QueryMap(encoded=true) DeviceMasterJunctionBoxesQueryParams queryParams);

  /**
  * Get relations to Junction box entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxesResponseData> deviceMasterJunctionBoxesWithHttpInfo(@Param("elid") String elid, DeviceMasterJunctionBoxesRequestData body, @QueryMap(encoded=true) DeviceMasterJunctionBoxesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxes</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxesQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Junction box FIST entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterJunctionBoxesFistResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxesFist?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterJunctionBoxesFistResponseData deviceMasterJunctionBoxesFist(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxesFistRequestData body);

  /**
   * Get relations to Junction box FIST entities
   * Similar to <code>deviceMasterJunctionBoxesFist</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxesFist?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterJunctionBoxesFistResponseData> deviceMasterJunctionBoxesFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterJunctionBoxesFistRequestData body);


  /**
   * Get relations to Junction box FIST entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterJunctionBoxesFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterJunctionBoxesFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterJunctionBoxesFistResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxesFist?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterJunctionBoxesFistResponseData deviceMasterJunctionBoxesFist(@Param("elid") String elid, DeviceMasterJunctionBoxesFistRequestData body, @QueryMap(encoded=true) DeviceMasterJunctionBoxesFistQueryParams queryParams);

  /**
  * Get relations to Junction box FIST entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterJunctionBoxesFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterJunctionBoxesFistResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/JunctionBoxesFist?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterJunctionBoxesFistResponseData> deviceMasterJunctionBoxesFistWithHttpInfo(@Param("elid") String elid, DeviceMasterJunctionBoxesFistRequestData body, @QueryMap(encoded=true) DeviceMasterJunctionBoxesFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterJunctionBoxesFist</code> method in a fluent style.
   */
  public static class DeviceMasterJunctionBoxesFistQueryParams extends HashMap<String, Object> {
    public DeviceMasterJunctionBoxesFistQueryParams sessionId(final String value) {
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
   * @return DeviceMasterModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Modules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterModulesResponseData deviceMasterModules(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterModulesRequestData body);

  /**
   * Get relations to Module entities
   * Similar to <code>deviceMasterModules</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Modules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterModulesResponseData> deviceMasterModulesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterModulesRequestData body);


  /**
   * Get relations to Module entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterModules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterModulesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Modules?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterModulesResponseData deviceMasterModules(@Param("elid") String elid, DeviceMasterModulesRequestData body, @QueryMap(encoded=true) DeviceMasterModulesQueryParams queryParams);

  /**
  * Get relations to Module entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterModules</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterModulesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Modules?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterModulesResponseData> deviceMasterModulesWithHttpInfo(@Param("elid") String elid, DeviceMasterModulesRequestData body, @QueryMap(encoded=true) DeviceMasterModulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterModules</code> method in a fluent style.
   */
  public static class DeviceMasterModulesQueryParams extends HashMap<String, Object> {
    public DeviceMasterModulesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to NM Module entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterNmModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/NmModules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterNmModulesResponseData deviceMasterNmModules(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterNmModulesRequestData body);

  /**
   * Get relations to NM Module entities
   * Similar to <code>deviceMasterNmModules</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/NmModules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterNmModulesResponseData> deviceMasterNmModulesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterNmModulesRequestData body);


  /**
   * Get relations to NM Module entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterNmModules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterNmModulesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterNmModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/NmModules?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterNmModulesResponseData deviceMasterNmModules(@Param("elid") String elid, DeviceMasterNmModulesRequestData body, @QueryMap(encoded=true) DeviceMasterNmModulesQueryParams queryParams);

  /**
  * Get relations to NM Module entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterNmModules</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterNmModulesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/NmModules?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterNmModulesResponseData> deviceMasterNmModulesWithHttpInfo(@Param("elid") String elid, DeviceMasterNmModulesRequestData body, @QueryMap(encoded=true) DeviceMasterNmModulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterNmModules</code> method in a fluent style.
   */
  public static class DeviceMasterNmModulesQueryParams extends HashMap<String, Object> {
    public DeviceMasterNmModulesQueryParams sessionId(final String value) {
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
   * @return DeviceMasterPassiveModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PassiveModules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPassiveModulesResponseData deviceMasterPassiveModules(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPassiveModulesRequestData body);

  /**
   * Get relations to Passive module entities
   * Similar to <code>deviceMasterPassiveModules</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PassiveModules?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPassiveModulesResponseData> deviceMasterPassiveModulesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPassiveModulesRequestData body);


  /**
   * Get relations to Passive module entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterPassiveModules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPassiveModulesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPassiveModulesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PassiveModules?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPassiveModulesResponseData deviceMasterPassiveModules(@Param("elid") String elid, DeviceMasterPassiveModulesRequestData body, @QueryMap(encoded=true) DeviceMasterPassiveModulesQueryParams queryParams);

  /**
  * Get relations to Passive module entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterPassiveModules</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPassiveModulesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PassiveModules?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPassiveModulesResponseData> deviceMasterPassiveModulesWithHttpInfo(@Param("elid") String elid, DeviceMasterPassiveModulesRequestData body, @QueryMap(encoded=true) DeviceMasterPassiveModulesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPassiveModules</code> method in a fluent style.
   */
  public static class DeviceMasterPassiveModulesQueryParams extends HashMap<String, Object> {
    public DeviceMasterPassiveModulesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to PDU entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMasterPdusResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Pdus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPdusResponseData deviceMasterPdus(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPdusRequestData body);

  /**
   * Get relations to PDU entities
   * Similar to <code>deviceMasterPdus</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Pdus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPdusResponseData> deviceMasterPdusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPdusRequestData body);


  /**
   * Get relations to PDU entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterPdus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPdusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPdusResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Pdus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPdusResponseData deviceMasterPdus(@Param("elid") String elid, DeviceMasterPdusRequestData body, @QueryMap(encoded=true) DeviceMasterPdusQueryParams queryParams);

  /**
  * Get relations to PDU entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterPdus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPdusResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Pdus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPdusResponseData> deviceMasterPdusWithHttpInfo(@Param("elid") String elid, DeviceMasterPdusRequestData body, @QueryMap(encoded=true) DeviceMasterPdusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPdus</code> method in a fluent style.
   */
  public static class DeviceMasterPdusQueryParams extends HashMap<String, Object> {
    public DeviceMasterPdusQueryParams sessionId(final String value) {
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
   * @return DeviceMasterPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemsResponseData deviceMasterPowerDistributorSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemsRequestData body);

  /**
   * Get relations to Power distributor system entities
   * Similar to <code>deviceMasterPowerDistributorSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterPowerDistributorSystemsResponseData> deviceMasterPowerDistributorSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterPowerDistributorSystemsRequestData body);


  /**
   * Get relations to Power distributor system entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterPowerDistributorSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterPowerDistributorSystemsResponseData deviceMasterPowerDistributorSystems(@Param("elid") String elid, DeviceMasterPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemsQueryParams queryParams);

  /**
  * Get relations to Power distributor system entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterPowerDistributorSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterPowerDistributorSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/PowerDistributorSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterPowerDistributorSystemsResponseData> deviceMasterPowerDistributorSystemsWithHttpInfo(@Param("elid") String elid, DeviceMasterPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) DeviceMasterPowerDistributorSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterPowerDistributorSystems</code> method in a fluent style.
   */
  public static class DeviceMasterPowerDistributorSystemsQueryParams extends HashMap<String, Object> {
    public DeviceMasterPowerDistributorSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterQueryResponse deviceMasterQuery(@Param("sessionId") String sessionId, DeviceMasterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMasterQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterQueryResponse> deviceMasterQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMasterQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>deviceMasterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterQueryResponse deviceMasterQuery(DeviceMasterQueryRequest body, @QueryMap(encoded=true) DeviceMasterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>deviceMasterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterQueryResponse> deviceMasterQueryWithHttpInfo(DeviceMasterQueryRequest body, @QueryMap(encoded=true) DeviceMasterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterQuery</code> method in a fluent style.
   */
  public static class DeviceMasterQueryQueryParams extends HashMap<String, Object> {
    public DeviceMasterQueryQueryParams sessionId(final String value) {
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
   * @return DeviceMasterServersResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterServersResponseData deviceMasterServers(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>deviceMasterServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterServersResponseData> deviceMasterServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterServersResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterServersResponseData deviceMasterServers(@Param("elid") String elid, DeviceMasterServersRequestData body, @QueryMap(encoded=true) DeviceMasterServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterServersResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterServersResponseData> deviceMasterServersWithHttpInfo(@Param("elid") String elid, DeviceMasterServersRequestData body, @QueryMap(encoded=true) DeviceMasterServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterServers</code> method in a fluent style.
   */
  public static class DeviceMasterServersQueryParams extends HashMap<String, Object> {
    public DeviceMasterServersQueryParams sessionId(final String value) {
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
   * @return DeviceMasterServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterServersBaseResponseData deviceMasterServersBase(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterServersBaseRequestData body);

  /**
   * Get relations to Server (base) entities
   * Similar to <code>deviceMasterServersBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterServersBaseResponseData> deviceMasterServersBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterServersBaseRequestData body);


  /**
   * Get relations to Server (base) entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterServersBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterServersBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterServersBaseResponseData deviceMasterServersBase(@Param("elid") String elid, DeviceMasterServersBaseRequestData body, @QueryMap(encoded=true) DeviceMasterServersBaseQueryParams queryParams);

  /**
  * Get relations to Server (base) entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterServersBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterServersBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/ServersBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterServersBaseResponseData> deviceMasterServersBaseWithHttpInfo(@Param("elid") String elid, DeviceMasterServersBaseRequestData body, @QueryMap(encoded=true) DeviceMasterServersBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterServersBase</code> method in a fluent style.
   */
  public static class DeviceMasterServersBaseQueryParams extends HashMap<String, Object> {
    public DeviceMasterServersBaseQueryParams sessionId(final String value) {
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
   * @return DeviceMasterStoragesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Storages?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterStoragesResponseData deviceMasterStorages(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterStoragesRequestData body);

  /**
   * Get relations to Storage entities
   * Similar to <code>deviceMasterStorages</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Storages?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterStoragesResponseData> deviceMasterStoragesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterStoragesRequestData body);


  /**
   * Get relations to Storage entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterStorages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterStoragesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterStoragesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Storages?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterStoragesResponseData deviceMasterStorages(@Param("elid") String elid, DeviceMasterStoragesRequestData body, @QueryMap(encoded=true) DeviceMasterStoragesQueryParams queryParams);

  /**
  * Get relations to Storage entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterStorages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterStoragesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Storages?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterStoragesResponseData> deviceMasterStoragesWithHttpInfo(@Param("elid") String elid, DeviceMasterStoragesRequestData body, @QueryMap(encoded=true) DeviceMasterStoragesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterStorages</code> method in a fluent style.
   */
  public static class DeviceMasterStoragesQueryParams extends HashMap<String, Object> {
    public DeviceMasterStoragesQueryParams sessionId(final String value) {
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
   * @return DeviceMasterStoragesBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/StoragesBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterStoragesBaseResponseData deviceMasterStoragesBase(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterStoragesBaseRequestData body);

  /**
   * Get relations to Storage (base) entities
   * Similar to <code>deviceMasterStoragesBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/StoragesBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterStoragesBaseResponseData> deviceMasterStoragesBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterStoragesBaseRequestData body);


  /**
   * Get relations to Storage (base) entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterStoragesBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterStoragesBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterStoragesBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/StoragesBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterStoragesBaseResponseData deviceMasterStoragesBase(@Param("elid") String elid, DeviceMasterStoragesBaseRequestData body, @QueryMap(encoded=true) DeviceMasterStoragesBaseQueryParams queryParams);

  /**
  * Get relations to Storage (base) entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterStoragesBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterStoragesBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/StoragesBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterStoragesBaseResponseData> deviceMasterStoragesBaseWithHttpInfo(@Param("elid") String elid, DeviceMasterStoragesBaseRequestData body, @QueryMap(encoded=true) DeviceMasterStoragesBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterStoragesBase</code> method in a fluent style.
   */
  public static class DeviceMasterStoragesBaseQueryParams extends HashMap<String, Object> {
    public DeviceMasterStoragesBaseQueryParams sessionId(final String value) {
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
   * @return DeviceMasterSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterSwitchCabinetsResponseData deviceMasterSwitchCabinets(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetsRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>deviceMasterSwitchCabinets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterSwitchCabinetsResponseData> deviceMasterSwitchCabinetsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSwitchCabinetsRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterSwitchCabinets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterSwitchCabinetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterSwitchCabinetsResponseData deviceMasterSwitchCabinets(@Param("elid") String elid, DeviceMasterSwitchCabinetsRequestData body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetsQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterSwitchCabinets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterSwitchCabinetsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SwitchCabinets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterSwitchCabinetsResponseData> deviceMasterSwitchCabinetsWithHttpInfo(@Param("elid") String elid, DeviceMasterSwitchCabinetsRequestData body, @QueryMap(encoded=true) DeviceMasterSwitchCabinetsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterSwitchCabinets</code> method in a fluent style.
   */
  public static class DeviceMasterSwitchCabinetsQueryParams extends HashMap<String, Object> {
    public DeviceMasterSwitchCabinetsQueryParams sessionId(final String value) {
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
   * @return DeviceMasterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterSystemAttributesResponse deviceMasterSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMasterSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterSystemAttributesResponse> deviceMasterSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceMasterSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterSystemAttributesResponse deviceMasterSystemAttributes(@Param("elid") String elid, DeviceMasterSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceMasterSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterSystemAttributesResponse> deviceMasterSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMasterSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMasterSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMasterSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMasterSystemAttributesQueryParams sessionId(final String value) {
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
   * @return DeviceMasterTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMasterTerminalsResponseData deviceMasterTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>deviceMasterTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMasterTerminalsResponseData> deviceMasterTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMasterTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>deviceMasterTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMasterTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMasterTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMasterTerminalsResponseData deviceMasterTerminals(@Param("elid") String elid, DeviceMasterTerminalsRequestData body, @QueryMap(encoded=true) DeviceMasterTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>deviceMasterTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMasterTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMasterTerminalsResponseData> deviceMasterTerminalsWithHttpInfo(@Param("elid") String elid, DeviceMasterTerminalsRequestData body, @QueryMap(encoded=true) DeviceMasterTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMasterTerminals</code> method in a fluent style.
   */
  public static class DeviceMasterTerminalsQueryParams extends HashMap<String, Object> {
    public DeviceMasterTerminalsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Devices (master data)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDeviceMasterResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDeviceMasterResponse updateDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeviceMasterRequestData body);

  /**
   * Modify
   * Similar to <code>updateDeviceMaster</code> but it also returns the http response headers .
   * Modify Devices (master data)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDeviceMasterResponse> updateDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeviceMasterRequestData body);


  /**
   * Modify
   * Modify Devices (master data)
   * Note, this is equivalent to the other <code>updateDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDeviceMasterResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDeviceMasterResponse updateDeviceMaster(@Param("elid") String elid, UpdateDeviceMasterRequestData body, @QueryMap(encoded=true) UpdateDeviceMasterQueryParams queryParams);

  /**
  * Modify
  * Modify Devices (master data)
  * Note, this is equivalent to the other <code>updateDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDeviceMasterResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMaster/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDeviceMasterResponse> updateDeviceMasterWithHttpInfo(@Param("elid") String elid, UpdateDeviceMasterRequestData body, @QueryMap(encoded=true) UpdateDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDeviceMaster</code> method in a fluent style.
   */
  public static class UpdateDeviceMasterQueryParams extends HashMap<String, Object> {
    public UpdateDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
