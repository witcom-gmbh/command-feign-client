package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeDataSocketResponse;
import com.fntsoftware.businessgateway.entities.DataSocketContractsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketContractsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.DataSocketInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.DataSocketInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.DataSocketIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.DataSocketIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketLocationRequest;
import com.fntsoftware.businessgateway.entities.DataSocketLocationResponse;
import com.fntsoftware.businessgateway.entities.DataSocketLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.DataSocketNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.DataSocketOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketPersonsRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketPersonsResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketPhysicalPortsPowerRequest;
import com.fntsoftware.businessgateway.entities.DataSocketPhysicalPortsPowerResponse;
import com.fntsoftware.businessgateway.entities.DataSocketQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.DataSocketQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.DataSocketQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.DataSocketQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.DataSocketQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.DataSocketQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.DataSocketQueryRequest;
import com.fntsoftware.businessgateway.entities.DataSocketQueryResponse;
import com.fntsoftware.businessgateway.entities.DataSocketSlotRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketSlotResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DataSocketSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DataSocketVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.DataSocketVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.DataSocketVlansRequest;
import com.fntsoftware.businessgateway.entities.DataSocketVlansResponse;
import com.fntsoftware.businessgateway.entities.DataSocketWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.DataSocketZoneRequestData;
import com.fntsoftware.businessgateway.entities.DataSocketZoneResponseData;
import com.fntsoftware.businessgateway.entities.DeleteDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDataSocketResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetDataSocketResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotDataSocketResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseDataSocketResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneDataSocketResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetDataSocketResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotDataSocketResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseDataSocketResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneDataSocketResponse;
import com.fntsoftware.businessgateway.entities.UpdateDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDataSocketResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDataSocketRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDataSocketResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DataSocketApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeDataSocketResponse changeTypeDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeDataSocketRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeDataSocket</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeDataSocketResponse> changeTypeDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeDataSocketRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeDataSocketResponse changeTypeDataSocket(@Param("elid") String elid, ChangeTypeDataSocketRequestData body, @QueryMap(encoded=true) ChangeTypeDataSocketQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeDataSocketResponse> changeTypeDataSocketWithHttpInfo(@Param("elid") String elid, ChangeTypeDataSocketRequestData body, @QueryMap(encoded=true) ChangeTypeDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeDataSocket</code> method in a fluent style.
   */
  public static class ChangeTypeDataSocketQueryParams extends HashMap<String, Object> {
    public ChangeTypeDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketContractsResponseData dataSocketContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>dataSocketContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketContractsResponseData> dataSocketContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>dataSocketContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketContractsResponseData dataSocketContracts(@Param("elid") String elid, DataSocketContractsRequestData body, @QueryMap(encoded=true) DataSocketContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>dataSocketContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketContractsResponseData> dataSocketContractsWithHttpInfo(@Param("elid") String elid, DataSocketContractsRequestData body, @QueryMap(encoded=true) DataSocketContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketContracts</code> method in a fluent style.
   */
  public static class DataSocketContractsQueryParams extends HashMap<String, Object> {
    public DataSocketContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketDeviceMasterResponseData dataSocketDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>dataSocketDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketDeviceMasterResponseData> dataSocketDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>dataSocketDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketDeviceMasterResponseData dataSocketDeviceMaster(@Param("elid") String elid, DataSocketDeviceMasterRequestData body, @QueryMap(encoded=true) DataSocketDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>dataSocketDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketDeviceMasterResponseData> dataSocketDeviceMasterWithHttpInfo(@Param("elid") String elid, DataSocketDeviceMasterRequestData body, @QueryMap(encoded=true) DataSocketDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketDeviceMaster</code> method in a fluent style.
   */
  public static class DataSocketDeviceMasterQueryParams extends HashMap<String, Object> {
    public DataSocketDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Frame contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketFrameContractsResponseData dataSocketFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>dataSocketFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketFrameContractsResponseData> dataSocketFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>dataSocketFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketFrameContractsResponseData dataSocketFrameContracts(@Param("elid") String elid, DataSocketFrameContractsRequestData body, @QueryMap(encoded=true) DataSocketFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>dataSocketFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketFrameContractsResponseData> dataSocketFrameContractsWithHttpInfo(@Param("elid") String elid, DataSocketFrameContractsRequestData body, @QueryMap(encoded=true) DataSocketFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketFrameContracts</code> method in a fluent style.
   */
  public static class DataSocketFrameContractsQueryParams extends HashMap<String, Object> {
    public DataSocketFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketInstalledSubCardsResponse dataSocketInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>dataSocketInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketInstalledSubCardsResponse> dataSocketInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>dataSocketInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketInstalledSubCardsResponse dataSocketInstalledSubCards(@Param("elid") String elid, DataSocketInstalledSubCardsRequest body, @QueryMap(encoded=true) DataSocketInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>dataSocketInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketInstalledSubCardsResponse> dataSocketInstalledSubCardsWithHttpInfo(@Param("elid") String elid, DataSocketInstalledSubCardsRequest body, @QueryMap(encoded=true) DataSocketInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketInstalledSubCards</code> method in a fluent style.
   */
  public static class DataSocketInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public DataSocketInstalledSubCardsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Interface entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketInterfacesResponseData dataSocketInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>dataSocketInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketInterfacesResponseData> dataSocketInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>dataSocketInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketInterfacesResponseData dataSocketInterfaces(@Param("elid") String elid, DataSocketInterfacesRequestData body, @QueryMap(encoded=true) DataSocketInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>dataSocketInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketInterfacesResponseData> dataSocketInterfacesWithHttpInfo(@Param("elid") String elid, DataSocketInterfacesRequestData body, @QueryMap(encoded=true) DataSocketInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketInterfaces</code> method in a fluent style.
   */
  public static class DataSocketInterfacesQueryParams extends HashMap<String, Object> {
    public DataSocketInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketIpAddressesResponse dataSocketIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>dataSocketIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketIpAddressesResponse> dataSocketIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>dataSocketIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketIpAddressesResponse dataSocketIpAddresses(@Param("elid") String elid, DataSocketIpAddressesRequest body, @QueryMap(encoded=true) DataSocketIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>dataSocketIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketIpAddressesResponse> dataSocketIpAddressesWithHttpInfo(@Param("elid") String elid, DataSocketIpAddressesRequest body, @QueryMap(encoded=true) DataSocketIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketIpAddresses</code> method in a fluent style.
   */
  public static class DataSocketIpAddressesQueryParams extends HashMap<String, Object> {
    public DataSocketIpAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketIpv4AddressesResponseData dataSocketIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>dataSocketIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketIpv4AddressesResponseData> dataSocketIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>dataSocketIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketIpv4AddressesResponseData dataSocketIpv4Addresses(@Param("elid") String elid, DataSocketIpv4AddressesRequestData body, @QueryMap(encoded=true) DataSocketIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>dataSocketIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketIpv4AddressesResponseData> dataSocketIpv4AddressesWithHttpInfo(@Param("elid") String elid, DataSocketIpv4AddressesRequestData body, @QueryMap(encoded=true) DataSocketIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketIpv4Addresses</code> method in a fluent style.
   */
  public static class DataSocketIpv4AddressesQueryParams extends HashMap<String, Object> {
    public DataSocketIpv4AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 netrange entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketIpv4NetrangesResponseData dataSocketIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>dataSocketIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketIpv4NetrangesResponseData> dataSocketIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>dataSocketIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketIpv4NetrangesResponseData dataSocketIpv4Netranges(@Param("elid") String elid, DataSocketIpv4NetrangesRequestData body, @QueryMap(encoded=true) DataSocketIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>dataSocketIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketIpv4NetrangesResponseData> dataSocketIpv4NetrangesWithHttpInfo(@Param("elid") String elid, DataSocketIpv4NetrangesRequestData body, @QueryMap(encoded=true) DataSocketIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketIpv4Netranges</code> method in a fluent style.
   */
  public static class DataSocketIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public DataSocketIpv4NetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 Network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketIpv4NetworksResponseData dataSocketIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>dataSocketIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketIpv4NetworksResponseData> dataSocketIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>dataSocketIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketIpv4NetworksResponseData dataSocketIpv4Networks(@Param("elid") String elid, DataSocketIpv4NetworksRequestData body, @QueryMap(encoded=true) DataSocketIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>dataSocketIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketIpv4NetworksResponseData> dataSocketIpv4NetworksWithHttpInfo(@Param("elid") String elid, DataSocketIpv4NetworksRequestData body, @QueryMap(encoded=true) DataSocketIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketIpv4Networks</code> method in a fluent style.
   */
  public static class DataSocketIpv4NetworksQueryParams extends HashMap<String, Object> {
    public DataSocketIpv4NetworksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Location
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketLocationResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketLocationResponse dataSocketLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketLocationRequest body);

  /**
   * Location
   * Similar to <code>dataSocketLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketLocationResponse> dataSocketLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>dataSocketLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketLocationResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketLocationResponse dataSocketLocation(@Param("elid") String elid, DataSocketLocationRequest body, @QueryMap(encoded=true) DataSocketLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>dataSocketLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketLocationResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketLocationResponse> dataSocketLocationWithHttpInfo(@Param("elid") String elid, DataSocketLocationRequest body, @QueryMap(encoded=true) DataSocketLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketLocation</code> method in a fluent style.
   */
  public static class DataSocketLocationQueryParams extends HashMap<String, Object> {
    public DataSocketLocationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketLogicalPortsResponseData dataSocketLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>dataSocketLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketLogicalPortsResponseData> dataSocketLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>dataSocketLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketLogicalPortsResponseData dataSocketLogicalPorts(@Param("elid") String elid, DataSocketLogicalPortsRequestData body, @QueryMap(encoded=true) DataSocketLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>dataSocketLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketLogicalPortsResponseData> dataSocketLogicalPortsWithHttpInfo(@Param("elid") String elid, DataSocketLogicalPortsRequestData body, @QueryMap(encoded=true) DataSocketLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketLogicalPorts</code> method in a fluent style.
   */
  public static class DataSocketLogicalPortsQueryParams extends HashMap<String, Object> {
    public DataSocketLogicalPortsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketMaintenanceContractsResponseData dataSocketMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>dataSocketMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketMaintenanceContractsResponseData> dataSocketMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>dataSocketMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketMaintenanceContractsResponseData dataSocketMaintenanceContracts(@Param("elid") String elid, DataSocketMaintenanceContractsRequestData body, @QueryMap(encoded=true) DataSocketMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>dataSocketMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketMaintenanceContractsResponseData> dataSocketMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DataSocketMaintenanceContractsRequestData body, @QueryMap(encoded=true) DataSocketMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketMaintenanceContracts</code> method in a fluent style.
   */
  public static class DataSocketMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DataSocketMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketNetworksAndNetrangesResponse dataSocketNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>dataSocketNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketNetworksAndNetrangesResponse> dataSocketNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>dataSocketNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketNetworksAndNetrangesResponse dataSocketNetworksAndNetranges(@Param("elid") String elid, DataSocketNetworksAndNetrangesRequest body, @QueryMap(encoded=true) DataSocketNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>dataSocketNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketNetworksAndNetrangesResponse> dataSocketNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, DataSocketNetworksAndNetrangesRequest body, @QueryMap(encoded=true) DataSocketNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketNetworksAndNetranges</code> method in a fluent style.
   */
  public static class DataSocketNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public DataSocketNetworksAndNetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Operating system installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketOperatingSystemInstallationResponseData dataSocketOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>dataSocketOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketOperatingSystemInstallationResponseData> dataSocketOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>dataSocketOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketOperatingSystemInstallationResponseData dataSocketOperatingSystemInstallation(@Param("elid") String elid, DataSocketOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) DataSocketOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>dataSocketOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketOperatingSystemInstallationResponseData> dataSocketOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, DataSocketOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) DataSocketOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class DataSocketOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public DataSocketOperatingSystemInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Organization entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketOrganizationsResponseData dataSocketOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>dataSocketOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketOrganizationsResponseData> dataSocketOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>dataSocketOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketOrganizationsResponseData dataSocketOrganizations(@Param("elid") String elid, DataSocketOrganizationsRequestData body, @QueryMap(encoded=true) DataSocketOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>dataSocketOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketOrganizationsResponseData> dataSocketOrganizationsWithHttpInfo(@Param("elid") String elid, DataSocketOrganizationsRequestData body, @QueryMap(encoded=true) DataSocketOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketOrganizations</code> method in a fluent style.
   */
  public static class DataSocketOrganizationsQueryParams extends HashMap<String, Object> {
    public DataSocketOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketPersonGroupsResponseData dataSocketPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>dataSocketPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketPersonGroupsResponseData> dataSocketPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>dataSocketPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketPersonGroupsResponseData dataSocketPersonGroups(@Param("elid") String elid, DataSocketPersonGroupsRequestData body, @QueryMap(encoded=true) DataSocketPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>dataSocketPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketPersonGroupsResponseData> dataSocketPersonGroupsWithHttpInfo(@Param("elid") String elid, DataSocketPersonGroupsRequestData body, @QueryMap(encoded=true) DataSocketPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketPersonGroups</code> method in a fluent style.
   */
  public static class DataSocketPersonGroupsQueryParams extends HashMap<String, Object> {
    public DataSocketPersonGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketPersonsResponseData dataSocketPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>dataSocketPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketPersonsResponseData> dataSocketPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>dataSocketPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketPersonsResponseData dataSocketPersons(@Param("elid") String elid, DataSocketPersonsRequestData body, @QueryMap(encoded=true) DataSocketPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>dataSocketPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketPersonsResponseData> dataSocketPersonsWithHttpInfo(@Param("elid") String elid, DataSocketPersonsRequestData body, @QueryMap(encoded=true) DataSocketPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketPersons</code> method in a fluent style.
   */
  public static class DataSocketPersonsQueryParams extends HashMap<String, Object> {
    public DataSocketPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (data) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketPhysicalPortsDataResponseData dataSocketPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>dataSocketPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketPhysicalPortsDataResponseData> dataSocketPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>dataSocketPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketPhysicalPortsDataResponseData dataSocketPhysicalPortsData(@Param("elid") String elid, DataSocketPhysicalPortsDataRequestData body, @QueryMap(encoded=true) DataSocketPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>dataSocketPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketPhysicalPortsDataResponseData> dataSocketPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, DataSocketPhysicalPortsDataRequestData body, @QueryMap(encoded=true) DataSocketPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketPhysicalPortsData</code> method in a fluent style.
   */
  public static class DataSocketPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public DataSocketPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Power ports
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketPhysicalPortsPowerResponse dataSocketPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPhysicalPortsPowerRequest body);

  /**
   * Query Power ports
   * Similar to <code>dataSocketPhysicalPortsPower</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketPhysicalPortsPowerResponse> dataSocketPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketPhysicalPortsPowerRequest body);


  /**
   * Query Power ports
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>dataSocketPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketPhysicalPortsPowerResponse dataSocketPhysicalPortsPower(@Param("elid") String elid, DataSocketPhysicalPortsPowerRequest body, @QueryMap(encoded=true) DataSocketPhysicalPortsPowerQueryParams queryParams);

  /**
  * Query Power ports
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>dataSocketPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketPhysicalPortsPowerResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketPhysicalPortsPowerResponse> dataSocketPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, DataSocketPhysicalPortsPowerRequest body, @QueryMap(encoded=true) DataSocketPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketPhysicalPortsPower</code> method in a fluent style.
   */
  public static class DataSocketPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public DataSocketPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataSocketQueryResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketQueryResponse dataSocketQuery(@Param("sessionId") String sessionId, DataSocketQueryRequest body);

  /**
   * Basic query
   * Similar to <code>dataSocketQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketQueryResponse> dataSocketQueryWithHttpInfo(@Param("sessionId") String sessionId, DataSocketQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>dataSocketQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketQueryResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketQueryResponse dataSocketQuery(DataSocketQueryRequest body, @QueryMap(encoded=true) DataSocketQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>dataSocketQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketQueryResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketQueryResponse> dataSocketQueryWithHttpInfo(DataSocketQueryRequest body, @QueryMap(encoded=true) DataSocketQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketQuery</code> method in a fluent style.
   */
  public static class DataSocketQueryQueryParams extends HashMap<String, Object> {
    public DataSocketQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataSocketQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketQueryExtendedResponse dataSocketQueryExtended(@Param("sessionId") String sessionId, DataSocketQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>dataSocketQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketQueryExtendedResponse> dataSocketQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, DataSocketQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>dataSocketQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketQueryExtendedResponse dataSocketQueryExtended(DataSocketQueryExtendedRequest body, @QueryMap(encoded=true) DataSocketQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>dataSocketQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketQueryExtendedResponse> dataSocketQueryExtendedWithHttpInfo(DataSocketQueryExtendedRequest body, @QueryMap(encoded=true) DataSocketQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketQueryExtended</code> method in a fluent style.
   */
  public static class DataSocketQueryExtendedQueryParams extends HashMap<String, Object> {
    public DataSocketQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataSocketQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketQueryExtendedScrollFirstResponse dataSocketQueryExtendedScrollFirst(@Param("sessionId") String sessionId, DataSocketQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>dataSocketQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketQueryExtendedScrollFirstResponse> dataSocketQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, DataSocketQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>dataSocketQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketQueryExtendedScrollFirstResponse dataSocketQueryExtendedScrollFirst(DataSocketQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) DataSocketQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>dataSocketQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketQueryExtendedScrollFirstResponse> dataSocketQueryExtendedScrollFirstWithHttpInfo(DataSocketQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) DataSocketQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class DataSocketQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public DataSocketQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataSocketQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketQueryExtendedScrollMoreResponse dataSocketQueryExtendedScrollMore(@Param("sessionId") String sessionId, DataSocketQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>dataSocketQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketQueryExtendedScrollMoreResponse> dataSocketQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, DataSocketQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>dataSocketQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketQueryExtendedScrollMoreResponse dataSocketQueryExtendedScrollMore(DataSocketQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) DataSocketQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>dataSocketQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketQueryExtendedScrollMoreResponse> dataSocketQueryExtendedScrollMoreWithHttpInfo(DataSocketQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) DataSocketQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class DataSocketQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public DataSocketQueryExtendedScrollMoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketSlotResponseData dataSocketSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>dataSocketSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketSlotResponseData> dataSocketSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>dataSocketSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketSlotResponseData dataSocketSlot(@Param("elid") String elid, DataSocketSlotRequestData body, @QueryMap(encoded=true) DataSocketSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>dataSocketSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketSlotResponseData> dataSocketSlotWithHttpInfo(@Param("elid") String elid, DataSocketSlotRequestData body, @QueryMap(encoded=true) DataSocketSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketSlot</code> method in a fluent style.
   */
  public static class DataSocketSlotQueryParams extends HashMap<String, Object> {
    public DataSocketSlotQueryParams sessionId(final String value) {
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
   * @return DataSocketSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketSwitchCabinetResponseData dataSocketSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>dataSocketSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketSwitchCabinetResponseData> dataSocketSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>dataSocketSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketSwitchCabinetResponseData dataSocketSwitchCabinet(@Param("elid") String elid, DataSocketSwitchCabinetRequestData body, @QueryMap(encoded=true) DataSocketSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>dataSocketSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketSwitchCabinetResponseData> dataSocketSwitchCabinetWithHttpInfo(@Param("elid") String elid, DataSocketSwitchCabinetRequestData body, @QueryMap(encoded=true) DataSocketSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketSwitchCabinet</code> method in a fluent style.
   */
  public static class DataSocketSwitchCabinetQueryParams extends HashMap<String, Object> {
    public DataSocketSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return DataSocketSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketSystemAttributesResponse dataSocketSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>dataSocketSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketSystemAttributesResponse> dataSocketSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>dataSocketSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketSystemAttributesResponse dataSocketSystemAttributes(@Param("elid") String elid, DataSocketSystemAttributesRequest body, @QueryMap(encoded=true) DataSocketSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>dataSocketSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketSystemAttributesResponse> dataSocketSystemAttributesWithHttpInfo(@Param("elid") String elid, DataSocketSystemAttributesRequest body, @QueryMap(encoded=true) DataSocketSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketSystemAttributes</code> method in a fluent style.
   */
  public static class DataSocketSystemAttributesQueryParams extends HashMap<String, Object> {
    public DataSocketSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual switch entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketVirtualSwitchesResponseData dataSocketVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>dataSocketVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketVirtualSwitchesResponseData> dataSocketVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>dataSocketVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketVirtualSwitchesResponseData dataSocketVirtualSwitches(@Param("elid") String elid, DataSocketVirtualSwitchesRequestData body, @QueryMap(encoded=true) DataSocketVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>dataSocketVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketVirtualSwitchesResponseData> dataSocketVirtualSwitchesWithHttpInfo(@Param("elid") String elid, DataSocketVirtualSwitchesRequestData body, @QueryMap(encoded=true) DataSocketVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketVirtualSwitches</code> method in a fluent style.
   */
  public static class DataSocketVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public DataSocketVirtualSwitchesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketVlansResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketVlansResponse dataSocketVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketVlansRequest body);

  /**
   * VLANs
   * Similar to <code>dataSocketVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketVlansResponse> dataSocketVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>dataSocketVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketVlansResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketVlansResponse dataSocketVlans(@Param("elid") String elid, DataSocketVlansRequest body, @QueryMap(encoded=true) DataSocketVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>dataSocketVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketVlansResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketVlansResponse> dataSocketVlansWithHttpInfo(@Param("elid") String elid, DataSocketVlansRequest body, @QueryMap(encoded=true) DataSocketVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketVlans</code> method in a fluent style.
   */
  public static class DataSocketVlansQueryParams extends HashMap<String, Object> {
    public DataSocketVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketVlansAtSlotResponse dataSocketVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>dataSocketVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketVlansAtSlotResponse> dataSocketVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>dataSocketVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketVlansAtSlotResponse dataSocketVlansAtSlot(@Param("elid") String elid, DataSocketVlansAtSlotRequest body, @QueryMap(encoded=true) DataSocketVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>dataSocketVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketVlansAtSlotResponse> dataSocketVlansAtSlotWithHttpInfo(@Param("elid") String elid, DataSocketVlansAtSlotRequest body, @QueryMap(encoded=true) DataSocketVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketVlansAtSlot</code> method in a fluent style.
   */
  public static class DataSocketVlansAtSlotQueryParams extends HashMap<String, Object> {
    public DataSocketVlansAtSlotQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Warehouse entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketWarehouseResponseData dataSocketWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>dataSocketWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketWarehouseResponseData> dataSocketWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>dataSocketWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketWarehouseResponseData dataSocketWarehouse(@Param("elid") String elid, DataSocketWarehouseRequestData body, @QueryMap(encoded=true) DataSocketWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>dataSocketWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketWarehouseResponseData> dataSocketWarehouseWithHttpInfo(@Param("elid") String elid, DataSocketWarehouseRequestData body, @QueryMap(encoded=true) DataSocketWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketWarehouse</code> method in a fluent style.
   */
  public static class DataSocketWarehouseQueryParams extends HashMap<String, Object> {
    public DataSocketWarehouseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DataSocketZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataSocketZoneResponseData dataSocketZone(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>dataSocketZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataSocketZoneResponseData> dataSocketZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DataSocketZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>dataSocketZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataSocketZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataSocketZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataSocketZoneResponseData dataSocketZone(@Param("elid") String elid, DataSocketZoneRequestData body, @QueryMap(encoded=true) DataSocketZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>dataSocketZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataSocketZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataSocketZoneResponseData> dataSocketZoneWithHttpInfo(@Param("elid") String elid, DataSocketZoneRequestData body, @QueryMap(encoded=true) DataSocketZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataSocketZone</code> method in a fluent style.
   */
  public static class DataSocketZoneQueryParams extends HashMap<String, Object> {
    public DataSocketZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete data socket
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDataSocketResponse deleteDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDataSocketRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDataSocket</code> but it also returns the http response headers .
   * Delete data socket
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDataSocketResponse> deleteDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDataSocketRequestData body);


  /**
   * Delete
   * Delete data socket
   * Note, this is equivalent to the other <code>deleteDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDataSocketResponse deleteDataSocket(@Param("elid") String elid, DeleteDataSocketRequestData body, @QueryMap(encoded=true) DeleteDataSocketQueryParams queryParams);

  /**
  * Delete
  * Delete data socket
  * Note, this is equivalent to the other <code>deleteDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDataSocketResponse> deleteDataSocketWithHttpInfo(@Param("elid") String elid, DeleteDataSocketRequestData body, @QueryMap(encoded=true) DeleteDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDataSocket</code> method in a fluent style.
   */
  public static class DeleteDataSocketQueryParams extends HashMap<String, Object> {
    public DeleteDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to cabinet
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToCabinetDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetDataSocketResponse moveToCabinetDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetDataSocketRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetDataSocket</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetDataSocketResponse> moveToCabinetDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetDataSocketRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetDataSocketResponse moveToCabinetDataSocket(@Param("elid") String elid, MoveToCabinetDataSocketRequestData body, @QueryMap(encoded=true) MoveToCabinetDataSocketQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetDataSocketResponse> moveToCabinetDataSocketWithHttpInfo(@Param("elid") String elid, MoveToCabinetDataSocketRequestData body, @QueryMap(encoded=true) MoveToCabinetDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetDataSocket</code> method in a fluent style.
   */
  public static class MoveToCabinetDataSocketQueryParams extends HashMap<String, Object> {
    public MoveToCabinetDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to slot
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToSlotDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotDataSocketResponse moveToSlotDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotDataSocketRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotDataSocket</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotDataSocketResponse> moveToSlotDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotDataSocketRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotDataSocketResponse moveToSlotDataSocket(@Param("elid") String elid, MoveToSlotDataSocketRequestData body, @QueryMap(encoded=true) MoveToSlotDataSocketQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotDataSocketResponse> moveToSlotDataSocketWithHttpInfo(@Param("elid") String elid, MoveToSlotDataSocketRequestData body, @QueryMap(encoded=true) MoveToSlotDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotDataSocket</code> method in a fluent style.
   */
  public static class MoveToSlotDataSocketQueryParams extends HashMap<String, Object> {
    public MoveToSlotDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to warehouse
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToWarehouseDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseDataSocketResponse moveToWarehouseDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseDataSocketRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseDataSocket</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseDataSocketResponse> moveToWarehouseDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseDataSocketRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseDataSocketResponse moveToWarehouseDataSocket(@Param("elid") String elid, MoveToWarehouseDataSocketRequestData body, @QueryMap(encoded=true) MoveToWarehouseDataSocketQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseDataSocketResponse> moveToWarehouseDataSocketWithHttpInfo(@Param("elid") String elid, MoveToWarehouseDataSocketRequestData body, @QueryMap(encoded=true) MoveToWarehouseDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseDataSocket</code> method in a fluent style.
   */
  public static class MoveToWarehouseDataSocketQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to zone
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToZoneDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneDataSocketResponse moveToZoneDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneDataSocketRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneDataSocket</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneDataSocketResponse> moveToZoneDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneDataSocketRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneDataSocketResponse moveToZoneDataSocket(@Param("elid") String elid, MoveToZoneDataSocketRequestData body, @QueryMap(encoded=true) MoveToZoneDataSocketQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneDataSocketResponse> moveToZoneDataSocketWithHttpInfo(@Param("elid") String elid, MoveToZoneDataSocketRequestData body, @QueryMap(encoded=true) MoveToZoneDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneDataSocket</code> method in a fluent style.
   */
  public static class MoveToZoneDataSocketQueryParams extends HashMap<String, Object> {
    public MoveToZoneDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetDataSocketResponse placeInCabinetDataSocket(@Param("sessionId") String sessionId, PlaceInCabinetDataSocketRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetDataSocket</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetDataSocketResponse> placeInCabinetDataSocketWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetDataSocketRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetDataSocketResponse placeInCabinetDataSocket(PlaceInCabinetDataSocketRequestData body, @QueryMap(encoded=true) PlaceInCabinetDataSocketQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetDataSocketResponse> placeInCabinetDataSocketWithHttpInfo(PlaceInCabinetDataSocketRequestData body, @QueryMap(encoded=true) PlaceInCabinetDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetDataSocket</code> method in a fluent style.
   */
  public static class PlaceInCabinetDataSocketQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotDataSocketResponse placeInSlotDataSocket(@Param("sessionId") String sessionId, PlaceInSlotDataSocketRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotDataSocket</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotDataSocketResponse> placeInSlotDataSocketWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotDataSocketRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotDataSocketResponse placeInSlotDataSocket(PlaceInSlotDataSocketRequestData body, @QueryMap(encoded=true) PlaceInSlotDataSocketQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotDataSocketResponse> placeInSlotDataSocketWithHttpInfo(PlaceInSlotDataSocketRequestData body, @QueryMap(encoded=true) PlaceInSlotDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotDataSocket</code> method in a fluent style.
   */
  public static class PlaceInSlotDataSocketQueryParams extends HashMap<String, Object> {
    public PlaceInSlotDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseDataSocketResponse placeInWarehouseDataSocket(@Param("sessionId") String sessionId, PlaceInWarehouseDataSocketRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseDataSocket</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseDataSocketResponse> placeInWarehouseDataSocketWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseDataSocketRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseDataSocketResponse placeInWarehouseDataSocket(PlaceInWarehouseDataSocketRequestData body, @QueryMap(encoded=true) PlaceInWarehouseDataSocketQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseDataSocketResponse> placeInWarehouseDataSocketWithHttpInfo(PlaceInWarehouseDataSocketRequestData body, @QueryMap(encoded=true) PlaceInWarehouseDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseDataSocket</code> method in a fluent style.
   */
  public static class PlaceInWarehouseDataSocketQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneDataSocketResponse placeInZoneDataSocket(@Param("sessionId") String sessionId, PlaceInZoneDataSocketRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneDataSocket</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneDataSocketResponse> placeInZoneDataSocketWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneDataSocketRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneDataSocketResponse placeInZoneDataSocket(PlaceInZoneDataSocketRequestData body, @QueryMap(encoded=true) PlaceInZoneDataSocketQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneDataSocketResponse> placeInZoneDataSocketWithHttpInfo(PlaceInZoneDataSocketRequestData body, @QueryMap(encoded=true) PlaceInZoneDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneDataSocket</code> method in a fluent style.
   */
  public static class PlaceInZoneDataSocketQueryParams extends HashMap<String, Object> {
    public PlaceInZoneDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify data socket
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDataSocketResponse updateDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDataSocketRequestData body);

  /**
   * Modify
   * Similar to <code>updateDataSocket</code> but it also returns the http response headers .
   * Modify data socket
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDataSocketResponse> updateDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDataSocketRequestData body);


  /**
   * Modify
   * Modify data socket
   * Note, this is equivalent to the other <code>updateDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDataSocketResponse updateDataSocket(@Param("elid") String elid, UpdateDataSocketRequestData body, @QueryMap(encoded=true) UpdateDataSocketQueryParams queryParams);

  /**
  * Modify
  * Modify data socket
  * Note, this is equivalent to the other <code>updateDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDataSocketResponse> updateDataSocketWithHttpInfo(@Param("elid") String elid, UpdateDataSocketRequestData body, @QueryMap(encoded=true) UpdateDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDataSocket</code> method in a fluent style.
   */
  public static class UpdateDataSocketQueryParams extends HashMap<String, Object> {
    public UpdateDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDataSocketResponse updateSystemAttributesDataSocket(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDataSocketRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDataSocket</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDataSocketResponse> updateSystemAttributesDataSocketWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDataSocketRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDataSocket</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDataSocketQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDataSocketResponse
   */
  @RequestLine("POST /api/rest/entity/dataSocket/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDataSocketResponse updateSystemAttributesDataSocket(@Param("elid") String elid, UpdateSystemAttributesDataSocketRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDataSocketQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDataSocket</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDataSocketResponse
      */
      @RequestLine("POST /api/rest/entity/dataSocket/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDataSocketResponse> updateSystemAttributesDataSocketWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDataSocketRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDataSocketQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDataSocket</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDataSocketQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDataSocketQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
