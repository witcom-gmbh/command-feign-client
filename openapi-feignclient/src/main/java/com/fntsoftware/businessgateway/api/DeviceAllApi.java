package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.DeleteDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllContractsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllContractsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllDuctDataRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllDuctDataResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllDuctsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllDuctsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllFilteredDeviceFunctionsForZoneRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllFilteredDeviceFunctionsForZoneResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllGenerateIdRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllGenerateIdResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllLocationRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllLocationResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllNetworkElementResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllPersonsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllPersonsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllPhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllServicesRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllServicesResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllSitesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllSitesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllSlotRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllSlotResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllVlansRequest;
import com.fntsoftware.businessgateway.entities.DeviceAllVlansResponse;
import com.fntsoftware.businessgateway.entities.DeviceAllWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.DeviceAllZoneRequestData;
import com.fntsoftware.businessgateway.entities.DeviceAllZoneResponseData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.PlaceAssemblyUnitInCabinetDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PlaceAssemblyUnitInCabinetDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.PlaceAssemblyUnitInZoneDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PlaceAssemblyUnitInZoneDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.UpdateDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDeviceAllResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDeviceAllResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DeviceAllApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeDeviceAllResponse changeTypeDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeDeviceAllRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeDeviceAllResponse> changeTypeDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeDeviceAllRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeDeviceAllResponse changeTypeDeviceAll(@Param("elid") String elid, ChangeTypeDeviceAllRequestData body, @QueryMap(encoded=true) ChangeTypeDeviceAllQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeDeviceAllResponse> changeTypeDeviceAllWithHttpInfo(@Param("elid") String elid, ChangeTypeDeviceAllRequestData body, @QueryMap(encoded=true) ChangeTypeDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeDeviceAll</code> method in a fluent style.
   */
  public static class ChangeTypeDeviceAllQueryParams extends HashMap<String, Object> {
    public ChangeTypeDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete device (all)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDeviceAllResponse deleteDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDeviceAllRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDeviceAll</code> but it also returns the http response headers .
   * Delete device (all)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDeviceAllResponse> deleteDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDeviceAllRequestData body);


  /**
   * Delete
   * Delete device (all)
   * Note, this is equivalent to the other <code>deleteDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDeviceAllResponse deleteDeviceAll(@Param("elid") String elid, DeleteDeviceAllRequestData body, @QueryMap(encoded=true) DeleteDeviceAllQueryParams queryParams);

  /**
  * Delete
  * Delete device (all)
  * Note, this is equivalent to the other <code>deleteDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDeviceAllResponse> deleteDeviceAllWithHttpInfo(@Param("elid") String elid, DeleteDeviceAllRequestData body, @QueryMap(encoded=true) DeleteDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDeviceAll</code> method in a fluent style.
   */
  public static class DeleteDeviceAllQueryParams extends HashMap<String, Object> {
    public DeleteDeviceAllQueryParams sessionId(final String value) {
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
   * @return DeviceAllContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllContractsResponseData deviceAllContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>deviceAllContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllContractsResponseData> deviceAllContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>deviceAllContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllContractsResponseData deviceAllContracts(@Param("elid") String elid, DeviceAllContractsRequestData body, @QueryMap(encoded=true) DeviceAllContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>deviceAllContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllContractsResponseData> deviceAllContractsWithHttpInfo(@Param("elid") String elid, DeviceAllContractsRequestData body, @QueryMap(encoded=true) DeviceAllContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllContracts</code> method in a fluent style.
   */
  public static class DeviceAllContractsQueryParams extends HashMap<String, Object> {
    public DeviceAllContractsQueryParams sessionId(final String value) {
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
   * @return DeviceAllDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllDeviceMasterResponseData deviceAllDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>deviceAllDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllDeviceMasterResponseData> deviceAllDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>deviceAllDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllDeviceMasterResponseData deviceAllDeviceMaster(@Param("elid") String elid, DeviceAllDeviceMasterRequestData body, @QueryMap(encoded=true) DeviceAllDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>deviceAllDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllDeviceMasterResponseData> deviceAllDeviceMasterWithHttpInfo(@Param("elid") String elid, DeviceAllDeviceMasterRequestData body, @QueryMap(encoded=true) DeviceAllDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllDeviceMaster</code> method in a fluent style.
   */
  public static class DeviceAllDeviceMasterQueryParams extends HashMap<String, Object> {
    public DeviceAllDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query duct data
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllDuctDataResponse deviceAllDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>deviceAllDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllDuctDataResponse> deviceAllDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>deviceAllDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllDuctDataResponse deviceAllDuctData(@Param("elid") String elid, DeviceAllDuctDataRequest body, @QueryMap(encoded=true) DeviceAllDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>deviceAllDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllDuctDataResponse> deviceAllDuctDataWithHttpInfo(@Param("elid") String elid, DeviceAllDuctDataRequest body, @QueryMap(encoded=true) DeviceAllDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllDuctData</code> method in a fluent style.
   */
  public static class DeviceAllDuctDataQueryParams extends HashMap<String, Object> {
    public DeviceAllDuctDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllDuctsResponseData deviceAllDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>deviceAllDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllDuctsResponseData> deviceAllDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>deviceAllDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllDuctsResponseData deviceAllDucts(@Param("elid") String elid, DeviceAllDuctsRequestData body, @QueryMap(encoded=true) DeviceAllDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>deviceAllDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllDuctsResponseData> deviceAllDuctsWithHttpInfo(@Param("elid") String elid, DeviceAllDuctsRequestData body, @QueryMap(encoded=true) DeviceAllDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllDucts</code> method in a fluent style.
   */
  public static class DeviceAllDuctsQueryParams extends HashMap<String, Object> {
    public DeviceAllDuctsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Device functions
   * Get device functions for specific zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllFilteredDeviceFunctionsForZoneResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/filteredDeviceFunctionsForZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllFilteredDeviceFunctionsForZoneResponse deviceAllFilteredDeviceFunctionsForZone(@Param("sessionId") String sessionId, DeviceAllFilteredDeviceFunctionsForZoneRequest body);

  /**
   * Device functions
   * Similar to <code>deviceAllFilteredDeviceFunctionsForZone</code> but it also returns the http response headers .
   * Get device functions for specific zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/filteredDeviceFunctionsForZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllFilteredDeviceFunctionsForZoneResponse> deviceAllFilteredDeviceFunctionsForZoneWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllFilteredDeviceFunctionsForZoneRequest body);


  /**
   * Device functions
   * Get device functions for specific zone
   * Note, this is equivalent to the other <code>deviceAllFilteredDeviceFunctionsForZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllFilteredDeviceFunctionsForZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllFilteredDeviceFunctionsForZoneResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/filteredDeviceFunctionsForZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllFilteredDeviceFunctionsForZoneResponse deviceAllFilteredDeviceFunctionsForZone(DeviceAllFilteredDeviceFunctionsForZoneRequest body, @QueryMap(encoded=true) DeviceAllFilteredDeviceFunctionsForZoneQueryParams queryParams);

  /**
  * Device functions
  * Get device functions for specific zone
  * Note, this is equivalent to the other <code>deviceAllFilteredDeviceFunctionsForZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllFilteredDeviceFunctionsForZoneResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/filteredDeviceFunctionsForZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllFilteredDeviceFunctionsForZoneResponse> deviceAllFilteredDeviceFunctionsForZoneWithHttpInfo(DeviceAllFilteredDeviceFunctionsForZoneRequest body, @QueryMap(encoded=true) DeviceAllFilteredDeviceFunctionsForZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllFilteredDeviceFunctionsForZone</code> method in a fluent style.
   */
  public static class DeviceAllFilteredDeviceFunctionsForZoneQueryParams extends HashMap<String, Object> {
    public DeviceAllFilteredDeviceFunctionsForZoneQueryParams sessionId(final String value) {
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
   * @return DeviceAllFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllFrameContractsResponseData deviceAllFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>deviceAllFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllFrameContractsResponseData> deviceAllFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>deviceAllFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllFrameContractsResponseData deviceAllFrameContracts(@Param("elid") String elid, DeviceAllFrameContractsRequestData body, @QueryMap(encoded=true) DeviceAllFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>deviceAllFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllFrameContractsResponseData> deviceAllFrameContractsWithHttpInfo(@Param("elid") String elid, DeviceAllFrameContractsRequestData body, @QueryMap(encoded=true) DeviceAllFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllFrameContracts</code> method in a fluent style.
   */
  public static class DeviceAllFrameContractsQueryParams extends HashMap<String, Object> {
    public DeviceAllFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generate ID
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllGenerateIdResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/generateId?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllGenerateIdResponse deviceAllGenerateId(@Param("sessionId") String sessionId, DeviceAllGenerateIdRequest body);

  /**
   * Generate ID
   * Similar to <code>deviceAllGenerateId</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/generateId?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllGenerateIdResponse> deviceAllGenerateIdWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllGenerateIdRequest body);


  /**
   * Generate ID
   * 
   * Note, this is equivalent to the other <code>deviceAllGenerateId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllGenerateIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllGenerateIdResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/generateId?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllGenerateIdResponse deviceAllGenerateId(DeviceAllGenerateIdRequest body, @QueryMap(encoded=true) DeviceAllGenerateIdQueryParams queryParams);

  /**
  * Generate ID
  * 
  * Note, this is equivalent to the other <code>deviceAllGenerateId</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllGenerateIdResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/generateId?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllGenerateIdResponse> deviceAllGenerateIdWithHttpInfo(DeviceAllGenerateIdRequest body, @QueryMap(encoded=true) DeviceAllGenerateIdQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllGenerateId</code> method in a fluent style.
   */
  public static class DeviceAllGenerateIdQueryParams extends HashMap<String, Object> {
    public DeviceAllGenerateIdQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllInheritedGeoCoordinatesResponse deviceAllInheritedGeoCoordinates(@Param("sessionId") String sessionId, DeviceAllInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>deviceAllInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllInheritedGeoCoordinatesResponse> deviceAllInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>deviceAllInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllInheritedGeoCoordinatesResponse deviceAllInheritedGeoCoordinates(DeviceAllInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceAllInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>deviceAllInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllInheritedGeoCoordinatesResponse> deviceAllInheritedGeoCoordinatesWithHttpInfo(DeviceAllInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceAllInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class DeviceAllInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public DeviceAllInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return DeviceAllInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllInstalledSubCardsResponse deviceAllInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>deviceAllInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllInstalledSubCardsResponse> deviceAllInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>deviceAllInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllInstalledSubCardsResponse deviceAllInstalledSubCards(@Param("elid") String elid, DeviceAllInstalledSubCardsRequest body, @QueryMap(encoded=true) DeviceAllInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>deviceAllInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllInstalledSubCardsResponse> deviceAllInstalledSubCardsWithHttpInfo(@Param("elid") String elid, DeviceAllInstalledSubCardsRequest body, @QueryMap(encoded=true) DeviceAllInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllInstalledSubCards</code> method in a fluent style.
   */
  public static class DeviceAllInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public DeviceAllInstalledSubCardsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllInstalledSubCardsRecursiveResponse deviceAllInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>deviceAllInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllInstalledSubCardsRecursiveResponse> deviceAllInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>deviceAllInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllInstalledSubCardsRecursiveResponse deviceAllInstalledSubCardsRecursive(@Param("elid") String elid, DeviceAllInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) DeviceAllInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>deviceAllInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllInstalledSubCardsRecursiveResponse> deviceAllInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, DeviceAllInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) DeviceAllInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class DeviceAllInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public DeviceAllInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return DeviceAllInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllInterfacesResponseData deviceAllInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>deviceAllInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllInterfacesResponseData> deviceAllInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>deviceAllInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllInterfacesResponseData deviceAllInterfaces(@Param("elid") String elid, DeviceAllInterfacesRequestData body, @QueryMap(encoded=true) DeviceAllInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>deviceAllInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllInterfacesResponseData> deviceAllInterfacesWithHttpInfo(@Param("elid") String elid, DeviceAllInterfacesRequestData body, @QueryMap(encoded=true) DeviceAllInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllInterfaces</code> method in a fluent style.
   */
  public static class DeviceAllInterfacesQueryParams extends HashMap<String, Object> {
    public DeviceAllInterfacesQueryParams sessionId(final String value) {
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
   * @return DeviceAllIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllIpAddressesResponse deviceAllIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>deviceAllIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllIpAddressesResponse> deviceAllIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceAllIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllIpAddressesResponse deviceAllIpAddresses(@Param("elid") String elid, DeviceAllIpAddressesRequest body, @QueryMap(encoded=true) DeviceAllIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceAllIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllIpAddressesResponse> deviceAllIpAddressesWithHttpInfo(@Param("elid") String elid, DeviceAllIpAddressesRequest body, @QueryMap(encoded=true) DeviceAllIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllIpAddresses</code> method in a fluent style.
   */
  public static class DeviceAllIpAddressesQueryParams extends HashMap<String, Object> {
    public DeviceAllIpAddressesQueryParams sessionId(final String value) {
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
   * @return DeviceAllIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllIpv4AddressesResponseData deviceAllIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>deviceAllIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllIpv4AddressesResponseData> deviceAllIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>deviceAllIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllIpv4AddressesResponseData deviceAllIpv4Addresses(@Param("elid") String elid, DeviceAllIpv4AddressesRequestData body, @QueryMap(encoded=true) DeviceAllIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>deviceAllIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllIpv4AddressesResponseData> deviceAllIpv4AddressesWithHttpInfo(@Param("elid") String elid, DeviceAllIpv4AddressesRequestData body, @QueryMap(encoded=true) DeviceAllIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllIpv4Addresses</code> method in a fluent style.
   */
  public static class DeviceAllIpv4AddressesQueryParams extends HashMap<String, Object> {
    public DeviceAllIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return DeviceAllIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllIpv4NetrangesResponseData deviceAllIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>deviceAllIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllIpv4NetrangesResponseData> deviceAllIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>deviceAllIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllIpv4NetrangesResponseData deviceAllIpv4Netranges(@Param("elid") String elid, DeviceAllIpv4NetrangesRequestData body, @QueryMap(encoded=true) DeviceAllIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>deviceAllIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllIpv4NetrangesResponseData> deviceAllIpv4NetrangesWithHttpInfo(@Param("elid") String elid, DeviceAllIpv4NetrangesRequestData body, @QueryMap(encoded=true) DeviceAllIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllIpv4Netranges</code> method in a fluent style.
   */
  public static class DeviceAllIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public DeviceAllIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return DeviceAllIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllIpv4NetworksResponseData deviceAllIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>deviceAllIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllIpv4NetworksResponseData> deviceAllIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>deviceAllIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllIpv4NetworksResponseData deviceAllIpv4Networks(@Param("elid") String elid, DeviceAllIpv4NetworksRequestData body, @QueryMap(encoded=true) DeviceAllIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>deviceAllIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllIpv4NetworksResponseData> deviceAllIpv4NetworksWithHttpInfo(@Param("elid") String elid, DeviceAllIpv4NetworksRequestData body, @QueryMap(encoded=true) DeviceAllIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllIpv4Networks</code> method in a fluent style.
   */
  public static class DeviceAllIpv4NetworksQueryParams extends HashMap<String, Object> {
    public DeviceAllIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return DeviceAllLocationResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllLocationResponse deviceAllLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllLocationRequest body);

  /**
   * Location
   * Similar to <code>deviceAllLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllLocationResponse> deviceAllLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>deviceAllLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllLocationResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllLocationResponse deviceAllLocation(@Param("elid") String elid, DeviceAllLocationRequest body, @QueryMap(encoded=true) DeviceAllLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>deviceAllLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllLocationResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllLocationResponse> deviceAllLocationWithHttpInfo(@Param("elid") String elid, DeviceAllLocationRequest body, @QueryMap(encoded=true) DeviceAllLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllLocation</code> method in a fluent style.
   */
  public static class DeviceAllLocationQueryParams extends HashMap<String, Object> {
    public DeviceAllLocationQueryParams sessionId(final String value) {
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
   * @return DeviceAllLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllLogicalPortsResponseData deviceAllLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>deviceAllLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllLogicalPortsResponseData> deviceAllLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>deviceAllLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllLogicalPortsResponseData deviceAllLogicalPorts(@Param("elid") String elid, DeviceAllLogicalPortsRequestData body, @QueryMap(encoded=true) DeviceAllLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>deviceAllLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllLogicalPortsResponseData> deviceAllLogicalPortsWithHttpInfo(@Param("elid") String elid, DeviceAllLogicalPortsRequestData body, @QueryMap(encoded=true) DeviceAllLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllLogicalPorts</code> method in a fluent style.
   */
  public static class DeviceAllLogicalPortsQueryParams extends HashMap<String, Object> {
    public DeviceAllLogicalPortsQueryParams sessionId(final String value) {
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
   * @return DeviceAllMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllMaintenanceContractsResponseData deviceAllMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>deviceAllMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllMaintenanceContractsResponseData> deviceAllMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>deviceAllMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllMaintenanceContractsResponseData deviceAllMaintenanceContracts(@Param("elid") String elid, DeviceAllMaintenanceContractsRequestData body, @QueryMap(encoded=true) DeviceAllMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>deviceAllMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllMaintenanceContractsResponseData> deviceAllMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DeviceAllMaintenanceContractsRequestData body, @QueryMap(encoded=true) DeviceAllMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllMaintenanceContracts</code> method in a fluent style.
   */
  public static class DeviceAllMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DeviceAllMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Multiducts entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllMultiDuctsResponseData deviceAllMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>deviceAllMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllMultiDuctsResponseData> deviceAllMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>deviceAllMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllMultiDuctsResponseData deviceAllMultiDucts(@Param("elid") String elid, DeviceAllMultiDuctsRequestData body, @QueryMap(encoded=true) DeviceAllMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>deviceAllMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllMultiDuctsResponseData> deviceAllMultiDuctsWithHttpInfo(@Param("elid") String elid, DeviceAllMultiDuctsRequestData body, @QueryMap(encoded=true) DeviceAllMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllMultiDucts</code> method in a fluent style.
   */
  public static class DeviceAllMultiDuctsQueryParams extends HashMap<String, Object> {
    public DeviceAllMultiDuctsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Network element entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllNetworkElementResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllNetworkElementResponseData deviceAllNetworkElement(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllNetworkElementRequestData body);

  /**
   * Get relations to Network element entities
   * Similar to <code>deviceAllNetworkElement</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllNetworkElementResponseData> deviceAllNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllNetworkElementRequestData body);


  /**
   * Get relations to Network element entities
   * 
   * Note, this is equivalent to the other <code>deviceAllNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllNetworkElementResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllNetworkElementResponseData deviceAllNetworkElement(@Param("elid") String elid, DeviceAllNetworkElementRequestData body, @QueryMap(encoded=true) DeviceAllNetworkElementQueryParams queryParams);

  /**
  * Get relations to Network element entities
  * 
  * Note, this is equivalent to the other <code>deviceAllNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllNetworkElementResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworkElement?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllNetworkElementResponseData> deviceAllNetworkElementWithHttpInfo(@Param("elid") String elid, DeviceAllNetworkElementRequestData body, @QueryMap(encoded=true) DeviceAllNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllNetworkElement</code> method in a fluent style.
   */
  public static class DeviceAllNetworkElementQueryParams extends HashMap<String, Object> {
    public DeviceAllNetworkElementQueryParams sessionId(final String value) {
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
   * @return DeviceAllNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllNetworksAndNetrangesResponse deviceAllNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>deviceAllNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllNetworksAndNetrangesResponse> deviceAllNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceAllNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllNetworksAndNetrangesResponse deviceAllNetworksAndNetranges(@Param("elid") String elid, DeviceAllNetworksAndNetrangesRequest body, @QueryMap(encoded=true) DeviceAllNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceAllNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllNetworksAndNetrangesResponse> deviceAllNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, DeviceAllNetworksAndNetrangesRequest body, @QueryMap(encoded=true) DeviceAllNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllNetworksAndNetranges</code> method in a fluent style.
   */
  public static class DeviceAllNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public DeviceAllNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return DeviceAllOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllOrganizationsResponseData deviceAllOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>deviceAllOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllOrganizationsResponseData> deviceAllOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>deviceAllOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllOrganizationsResponseData deviceAllOrganizations(@Param("elid") String elid, DeviceAllOrganizationsRequestData body, @QueryMap(encoded=true) DeviceAllOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>deviceAllOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllOrganizationsResponseData> deviceAllOrganizationsWithHttpInfo(@Param("elid") String elid, DeviceAllOrganizationsRequestData body, @QueryMap(encoded=true) DeviceAllOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllOrganizations</code> method in a fluent style.
   */
  public static class DeviceAllOrganizationsQueryParams extends HashMap<String, Object> {
    public DeviceAllOrganizationsQueryParams sessionId(final String value) {
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
   * @return DeviceAllPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllPersonGroupsResponseData deviceAllPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>deviceAllPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllPersonGroupsResponseData> deviceAllPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>deviceAllPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllPersonGroupsResponseData deviceAllPersonGroups(@Param("elid") String elid, DeviceAllPersonGroupsRequestData body, @QueryMap(encoded=true) DeviceAllPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>deviceAllPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllPersonGroupsResponseData> deviceAllPersonGroupsWithHttpInfo(@Param("elid") String elid, DeviceAllPersonGroupsRequestData body, @QueryMap(encoded=true) DeviceAllPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllPersonGroups</code> method in a fluent style.
   */
  public static class DeviceAllPersonGroupsQueryParams extends HashMap<String, Object> {
    public DeviceAllPersonGroupsQueryParams sessionId(final String value) {
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
   * @return DeviceAllPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllPersonsResponseData deviceAllPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>deviceAllPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllPersonsResponseData> deviceAllPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>deviceAllPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllPersonsResponseData deviceAllPersons(@Param("elid") String elid, DeviceAllPersonsRequestData body, @QueryMap(encoded=true) DeviceAllPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>deviceAllPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllPersonsResponseData> deviceAllPersonsWithHttpInfo(@Param("elid") String elid, DeviceAllPersonsRequestData body, @QueryMap(encoded=true) DeviceAllPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllPersons</code> method in a fluent style.
   */
  public static class DeviceAllPersonsQueryParams extends HashMap<String, Object> {
    public DeviceAllPersonsQueryParams sessionId(final String value) {
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
   * @return DeviceAllPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllPhysicalPortsDataResponseData deviceAllPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>deviceAllPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllPhysicalPortsDataResponseData> deviceAllPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>deviceAllPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllPhysicalPortsDataResponseData deviceAllPhysicalPortsData(@Param("elid") String elid, DeviceAllPhysicalPortsDataRequestData body, @QueryMap(encoded=true) DeviceAllPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>deviceAllPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllPhysicalPortsDataResponseData> deviceAllPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, DeviceAllPhysicalPortsDataRequestData body, @QueryMap(encoded=true) DeviceAllPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllPhysicalPortsData</code> method in a fluent style.
   */
  public static class DeviceAllPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public DeviceAllPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllPhysicalPortsDataExtendedResponse deviceAllPhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>deviceAllPhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllPhysicalPortsDataExtendedResponse> deviceAllPhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>deviceAllPhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllPhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllPhysicalPortsDataExtendedResponse deviceAllPhysicalPortsDataExtended(@Param("elid") String elid, DeviceAllPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) DeviceAllPhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>deviceAllPhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllPhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllPhysicalPortsDataExtendedResponse> deviceAllPhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, DeviceAllPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) DeviceAllPhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllPhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class DeviceAllPhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public DeviceAllPhysicalPortsDataExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllPhysicalPortsPowerResponseData deviceAllPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>deviceAllPhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllPhysicalPortsPowerResponseData> deviceAllPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>deviceAllPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllPhysicalPortsPowerResponseData deviceAllPhysicalPortsPower(@Param("elid") String elid, DeviceAllPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) DeviceAllPhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>deviceAllPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllPhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllPhysicalPortsPowerResponseData> deviceAllPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, DeviceAllPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) DeviceAllPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllPhysicalPortsPower</code> method in a fluent style.
   */
  public static class DeviceAllPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public DeviceAllPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllPhysicalPortsPowerExtendedResponse deviceAllPhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>deviceAllPhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllPhysicalPortsPowerExtendedResponse> deviceAllPhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllPhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>deviceAllPhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllPhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllPhysicalPortsPowerExtendedResponse deviceAllPhysicalPortsPowerExtended(@Param("elid") String elid, DeviceAllPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) DeviceAllPhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>deviceAllPhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllPhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllPhysicalPortsPowerExtendedResponse> deviceAllPhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, DeviceAllPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) DeviceAllPhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllPhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class DeviceAllPhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public DeviceAllPhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllQueryResponse deviceAllQuery(@Param("sessionId") String sessionId, DeviceAllQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceAllQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllQueryResponse> deviceAllQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
   * Note, this is equivalent to the other <code>deviceAllQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllQueryResponse deviceAllQuery(DeviceAllQueryRequest body, @QueryMap(encoded=true) DeviceAllQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
  * Note, this is equivalent to the other <code>deviceAllQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllQueryResponse> deviceAllQueryWithHttpInfo(DeviceAllQueryRequest body, @QueryMap(encoded=true) DeviceAllQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllQuery</code> method in a fluent style.
   */
  public static class DeviceAllQueryQueryParams extends HashMap<String, Object> {
    public DeviceAllQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllQueryExtendedResponse deviceAllQueryExtended(@Param("sessionId") String sessionId, DeviceAllQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>deviceAllQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllQueryExtendedResponse> deviceAllQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
   * Note, this is equivalent to the other <code>deviceAllQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllQueryExtendedResponse deviceAllQueryExtended(DeviceAllQueryExtendedRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data. Possible values for attribute &#39;{[attrib]}&#39; ({[desc]}) are: {[values]}
  * Note, this is equivalent to the other <code>deviceAllQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllQueryExtendedResponse> deviceAllQueryExtendedWithHttpInfo(DeviceAllQueryExtendedRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllQueryExtended</code> method in a fluent style.
   */
  public static class DeviceAllQueryExtendedQueryParams extends HashMap<String, Object> {
    public DeviceAllQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllQueryExtendedGeoCoordinatesResponse deviceAllQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, DeviceAllQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>deviceAllQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllQueryExtendedGeoCoordinatesResponse> deviceAllQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>deviceAllQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllQueryExtendedGeoCoordinatesResponse deviceAllQueryExtendedGeoCoordinates(DeviceAllQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>deviceAllQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllQueryExtendedGeoCoordinatesResponse> deviceAllQueryExtendedGeoCoordinatesWithHttpInfo(DeviceAllQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class DeviceAllQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public DeviceAllQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllQueryExtendedScrollFirstResponse deviceAllQueryExtendedScrollFirst(@Param("sessionId") String sessionId, DeviceAllQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>deviceAllQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllQueryExtendedScrollFirstResponse> deviceAllQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>deviceAllQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllQueryExtendedScrollFirstResponse deviceAllQueryExtendedScrollFirst(DeviceAllQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>deviceAllQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllQueryExtendedScrollFirstResponse> deviceAllQueryExtendedScrollFirstWithHttpInfo(DeviceAllQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class DeviceAllQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public DeviceAllQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceAllQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllQueryExtendedScrollMoreResponse deviceAllQueryExtendedScrollMore(@Param("sessionId") String sessionId, DeviceAllQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>deviceAllQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllQueryExtendedScrollMoreResponse> deviceAllQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, DeviceAllQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>deviceAllQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllQueryExtendedScrollMoreResponse deviceAllQueryExtendedScrollMore(DeviceAllQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>deviceAllQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllQueryExtendedScrollMoreResponse> deviceAllQueryExtendedScrollMoreWithHttpInfo(DeviceAllQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) DeviceAllQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class DeviceAllQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public DeviceAllQueryExtendedScrollMoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query device services 
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllServicesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllServicesResponse deviceAllServices(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>deviceAllServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllServicesResponse> deviceAllServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>deviceAllServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllServicesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllServicesResponse deviceAllServices(@Param("elid") String elid, DeviceAllServicesRequest body, @QueryMap(encoded=true) DeviceAllServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>deviceAllServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllServicesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllServicesResponse> deviceAllServicesWithHttpInfo(@Param("elid") String elid, DeviceAllServicesRequest body, @QueryMap(encoded=true) DeviceAllServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllServices</code> method in a fluent style.
   */
  public static class DeviceAllServicesQueryParams extends HashMap<String, Object> {
    public DeviceAllServicesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Site entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceAllSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllSitesResponseData deviceAllSites(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>deviceAllSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllSitesResponseData> deviceAllSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>deviceAllSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllSitesResponseData deviceAllSites(@Param("elid") String elid, DeviceAllSitesRequestData body, @QueryMap(encoded=true) DeviceAllSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>deviceAllSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllSitesResponseData> deviceAllSitesWithHttpInfo(@Param("elid") String elid, DeviceAllSitesRequestData body, @QueryMap(encoded=true) DeviceAllSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllSites</code> method in a fluent style.
   */
  public static class DeviceAllSitesQueryParams extends HashMap<String, Object> {
    public DeviceAllSitesQueryParams sessionId(final String value) {
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
   * @return DeviceAllSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllSlotResponseData deviceAllSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>deviceAllSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllSlotResponseData> deviceAllSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>deviceAllSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllSlotResponseData deviceAllSlot(@Param("elid") String elid, DeviceAllSlotRequestData body, @QueryMap(encoded=true) DeviceAllSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>deviceAllSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllSlotResponseData> deviceAllSlotWithHttpInfo(@Param("elid") String elid, DeviceAllSlotRequestData body, @QueryMap(encoded=true) DeviceAllSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllSlot</code> method in a fluent style.
   */
  public static class DeviceAllSlotQueryParams extends HashMap<String, Object> {
    public DeviceAllSlotQueryParams sessionId(final String value) {
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
   * @return DeviceAllSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllSwitchCabinetResponseData deviceAllSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>deviceAllSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllSwitchCabinetResponseData> deviceAllSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>deviceAllSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllSwitchCabinetResponseData deviceAllSwitchCabinet(@Param("elid") String elid, DeviceAllSwitchCabinetRequestData body, @QueryMap(encoded=true) DeviceAllSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>deviceAllSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllSwitchCabinetResponseData> deviceAllSwitchCabinetWithHttpInfo(@Param("elid") String elid, DeviceAllSwitchCabinetRequestData body, @QueryMap(encoded=true) DeviceAllSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllSwitchCabinet</code> method in a fluent style.
   */
  public static class DeviceAllSwitchCabinetQueryParams extends HashMap<String, Object> {
    public DeviceAllSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return DeviceAllSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllSystemAttributesResponse deviceAllSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceAllSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllSystemAttributesResponse> deviceAllSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>deviceAllSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllSystemAttributesResponse deviceAllSystemAttributes(@Param("elid") String elid, DeviceAllSystemAttributesRequest body, @QueryMap(encoded=true) DeviceAllSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>deviceAllSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllSystemAttributesResponse> deviceAllSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceAllSystemAttributesRequest body, @QueryMap(encoded=true) DeviceAllSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceAllSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceAllSystemAttributesQueryParams sessionId(final String value) {
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
   * @return DeviceAllVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllVirtualSwitchesResponseData deviceAllVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>deviceAllVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllVirtualSwitchesResponseData> deviceAllVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>deviceAllVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllVirtualSwitchesResponseData deviceAllVirtualSwitches(@Param("elid") String elid, DeviceAllVirtualSwitchesRequestData body, @QueryMap(encoded=true) DeviceAllVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>deviceAllVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllVirtualSwitchesResponseData> deviceAllVirtualSwitchesWithHttpInfo(@Param("elid") String elid, DeviceAllVirtualSwitchesRequestData body, @QueryMap(encoded=true) DeviceAllVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllVirtualSwitches</code> method in a fluent style.
   */
  public static class DeviceAllVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public DeviceAllVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return DeviceAllVlansResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllVlansResponse deviceAllVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllVlansRequest body);

  /**
   * VLANs
   * Similar to <code>deviceAllVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllVlansResponse> deviceAllVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceAllVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllVlansResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllVlansResponse deviceAllVlans(@Param("elid") String elid, DeviceAllVlansRequest body, @QueryMap(encoded=true) DeviceAllVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceAllVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllVlansResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllVlansResponse> deviceAllVlansWithHttpInfo(@Param("elid") String elid, DeviceAllVlansRequest body, @QueryMap(encoded=true) DeviceAllVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllVlans</code> method in a fluent style.
   */
  public static class DeviceAllVlansQueryParams extends HashMap<String, Object> {
    public DeviceAllVlansQueryParams sessionId(final String value) {
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
   * @return DeviceAllVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllVlansAtSlotResponse deviceAllVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>deviceAllVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllVlansAtSlotResponse> deviceAllVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceAllVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllVlansAtSlotResponse deviceAllVlansAtSlot(@Param("elid") String elid, DeviceAllVlansAtSlotRequest body, @QueryMap(encoded=true) DeviceAllVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceAllVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllVlansAtSlotResponse> deviceAllVlansAtSlotWithHttpInfo(@Param("elid") String elid, DeviceAllVlansAtSlotRequest body, @QueryMap(encoded=true) DeviceAllVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllVlansAtSlot</code> method in a fluent style.
   */
  public static class DeviceAllVlansAtSlotQueryParams extends HashMap<String, Object> {
    public DeviceAllVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return DeviceAllWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllWarehouseResponseData deviceAllWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>deviceAllWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllWarehouseResponseData> deviceAllWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>deviceAllWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllWarehouseResponseData deviceAllWarehouse(@Param("elid") String elid, DeviceAllWarehouseRequestData body, @QueryMap(encoded=true) DeviceAllWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>deviceAllWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllWarehouseResponseData> deviceAllWarehouseWithHttpInfo(@Param("elid") String elid, DeviceAllWarehouseRequestData body, @QueryMap(encoded=true) DeviceAllWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllWarehouse</code> method in a fluent style.
   */
  public static class DeviceAllWarehouseQueryParams extends HashMap<String, Object> {
    public DeviceAllWarehouseQueryParams sessionId(final String value) {
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
   * @return DeviceAllZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceAllZoneResponseData deviceAllZone(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>deviceAllZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceAllZoneResponseData> deviceAllZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceAllZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>deviceAllZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceAllZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceAllZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceAllZoneResponseData deviceAllZone(@Param("elid") String elid, DeviceAllZoneRequestData body, @QueryMap(encoded=true) DeviceAllZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>deviceAllZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceAllZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceAllZoneResponseData> deviceAllZoneWithHttpInfo(@Param("elid") String elid, DeviceAllZoneRequestData body, @QueryMap(encoded=true) DeviceAllZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceAllZone</code> method in a fluent style.
   */
  public static class DeviceAllZoneQueryParams extends HashMap<String, Object> {
    public DeviceAllZoneQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetDeviceAllResponse moveToCabinetDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetDeviceAllRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetDeviceAll</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetDeviceAllResponse> moveToCabinetDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetDeviceAllRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetDeviceAllResponse moveToCabinetDeviceAll(@Param("elid") String elid, MoveToCabinetDeviceAllRequestData body, @QueryMap(encoded=true) MoveToCabinetDeviceAllQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetDeviceAllResponse> moveToCabinetDeviceAllWithHttpInfo(@Param("elid") String elid, MoveToCabinetDeviceAllRequestData body, @QueryMap(encoded=true) MoveToCabinetDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetDeviceAll</code> method in a fluent style.
   */
  public static class MoveToCabinetDeviceAllQueryParams extends HashMap<String, Object> {
    public MoveToCabinetDeviceAllQueryParams sessionId(final String value) {
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
   * @return MoveToSlotDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotDeviceAllResponse moveToSlotDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotDeviceAllRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotDeviceAll</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotDeviceAllResponse> moveToSlotDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotDeviceAllRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotDeviceAllResponse moveToSlotDeviceAll(@Param("elid") String elid, MoveToSlotDeviceAllRequestData body, @QueryMap(encoded=true) MoveToSlotDeviceAllQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotDeviceAllResponse> moveToSlotDeviceAllWithHttpInfo(@Param("elid") String elid, MoveToSlotDeviceAllRequestData body, @QueryMap(encoded=true) MoveToSlotDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotDeviceAll</code> method in a fluent style.
   */
  public static class MoveToSlotDeviceAllQueryParams extends HashMap<String, Object> {
    public MoveToSlotDeviceAllQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseDeviceAllResponse moveToWarehouseDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseDeviceAllRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseDeviceAllResponse> moveToWarehouseDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseDeviceAllRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseDeviceAllResponse moveToWarehouseDeviceAll(@Param("elid") String elid, MoveToWarehouseDeviceAllRequestData body, @QueryMap(encoded=true) MoveToWarehouseDeviceAllQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseDeviceAllResponse> moveToWarehouseDeviceAllWithHttpInfo(@Param("elid") String elid, MoveToWarehouseDeviceAllRequestData body, @QueryMap(encoded=true) MoveToWarehouseDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseDeviceAll</code> method in a fluent style.
   */
  public static class MoveToWarehouseDeviceAllQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseDeviceAllQueryParams sessionId(final String value) {
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
   * @return MoveToZoneDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneDeviceAllResponse moveToZoneDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneDeviceAllRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneDeviceAll</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneDeviceAllResponse> moveToZoneDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneDeviceAllRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneDeviceAllResponse moveToZoneDeviceAll(@Param("elid") String elid, MoveToZoneDeviceAllRequestData body, @QueryMap(encoded=true) MoveToZoneDeviceAllQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneDeviceAllResponse> moveToZoneDeviceAllWithHttpInfo(@Param("elid") String elid, MoveToZoneDeviceAllRequestData body, @QueryMap(encoded=true) MoveToZoneDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneDeviceAll</code> method in a fluent style.
   */
  public static class MoveToZoneDeviceAllQueryParams extends HashMap<String, Object> {
    public MoveToZoneDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place assembly unit in cabinet
   * Use this operation to place assembly units in a cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceAssemblyUnitInCabinetDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceAssemblyUnitInCabinetDeviceAllResponse placeAssemblyUnitInCabinetDeviceAll(@Param("sessionId") String sessionId, PlaceAssemblyUnitInCabinetDeviceAllRequestData body);

  /**
   * Place assembly unit in cabinet
   * Similar to <code>placeAssemblyUnitInCabinetDeviceAll</code> but it also returns the http response headers .
   * Use this operation to place assembly units in a cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceAssemblyUnitInCabinetDeviceAllResponse> placeAssemblyUnitInCabinetDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, PlaceAssemblyUnitInCabinetDeviceAllRequestData body);


  /**
   * Place assembly unit in cabinet
   * Use this operation to place assembly units in a cabinet
   * Note, this is equivalent to the other <code>placeAssemblyUnitInCabinetDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceAssemblyUnitInCabinetDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceAssemblyUnitInCabinetDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceAssemblyUnitInCabinetDeviceAllResponse placeAssemblyUnitInCabinetDeviceAll(PlaceAssemblyUnitInCabinetDeviceAllRequestData body, @QueryMap(encoded=true) PlaceAssemblyUnitInCabinetDeviceAllQueryParams queryParams);

  /**
  * Place assembly unit in cabinet
  * Use this operation to place assembly units in a cabinet
  * Note, this is equivalent to the other <code>placeAssemblyUnitInCabinetDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceAssemblyUnitInCabinetDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceAssemblyUnitInCabinetDeviceAllResponse> placeAssemblyUnitInCabinetDeviceAllWithHttpInfo(PlaceAssemblyUnitInCabinetDeviceAllRequestData body, @QueryMap(encoded=true) PlaceAssemblyUnitInCabinetDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeAssemblyUnitInCabinetDeviceAll</code> method in a fluent style.
   */
  public static class PlaceAssemblyUnitInCabinetDeviceAllQueryParams extends HashMap<String, Object> {
    public PlaceAssemblyUnitInCabinetDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place assembly unit in zone
   * Use this operation to place assembly units in a zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceAssemblyUnitInZoneDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceAssemblyUnitInZoneDeviceAllResponse placeAssemblyUnitInZoneDeviceAll(@Param("sessionId") String sessionId, PlaceAssemblyUnitInZoneDeviceAllRequestData body);

  /**
   * Place assembly unit in zone
   * Similar to <code>placeAssemblyUnitInZoneDeviceAll</code> but it also returns the http response headers .
   * Use this operation to place assembly units in a zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceAssemblyUnitInZoneDeviceAllResponse> placeAssemblyUnitInZoneDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, PlaceAssemblyUnitInZoneDeviceAllRequestData body);


  /**
   * Place assembly unit in zone
   * Use this operation to place assembly units in a zone
   * Note, this is equivalent to the other <code>placeAssemblyUnitInZoneDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceAssemblyUnitInZoneDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceAssemblyUnitInZoneDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceAssemblyUnitInZoneDeviceAllResponse placeAssemblyUnitInZoneDeviceAll(PlaceAssemblyUnitInZoneDeviceAllRequestData body, @QueryMap(encoded=true) PlaceAssemblyUnitInZoneDeviceAllQueryParams queryParams);

  /**
  * Place assembly unit in zone
  * Use this operation to place assembly units in a zone
  * Note, this is equivalent to the other <code>placeAssemblyUnitInZoneDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceAssemblyUnitInZoneDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/placeAssemblyUnitInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceAssemblyUnitInZoneDeviceAllResponse> placeAssemblyUnitInZoneDeviceAllWithHttpInfo(PlaceAssemblyUnitInZoneDeviceAllRequestData body, @QueryMap(encoded=true) PlaceAssemblyUnitInZoneDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeAssemblyUnitInZoneDeviceAll</code> method in a fluent style.
   */
  public static class PlaceAssemblyUnitInZoneDeviceAllQueryParams extends HashMap<String, Object> {
    public PlaceAssemblyUnitInZoneDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetDeviceAllResponse placeInCabinetDeviceAll(@Param("sessionId") String sessionId, PlaceInCabinetDeviceAllRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetDeviceAll</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetDeviceAllResponse> placeInCabinetDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetDeviceAllRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetDeviceAllResponse placeInCabinetDeviceAll(PlaceInCabinetDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInCabinetDeviceAllQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetDeviceAllResponse> placeInCabinetDeviceAllWithHttpInfo(PlaceInCabinetDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInCabinetDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetDeviceAll</code> method in a fluent style.
   */
  public static class PlaceInCabinetDeviceAllQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotDeviceAllResponse placeInSlotDeviceAll(@Param("sessionId") String sessionId, PlaceInSlotDeviceAllRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotDeviceAll</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotDeviceAllResponse> placeInSlotDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotDeviceAllRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotDeviceAllResponse placeInSlotDeviceAll(PlaceInSlotDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInSlotDeviceAllQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotDeviceAllResponse> placeInSlotDeviceAllWithHttpInfo(PlaceInSlotDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInSlotDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotDeviceAll</code> method in a fluent style.
   */
  public static class PlaceInSlotDeviceAllQueryParams extends HashMap<String, Object> {
    public PlaceInSlotDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseDeviceAllResponse placeInWarehouseDeviceAll(@Param("sessionId") String sessionId, PlaceInWarehouseDeviceAllRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseDeviceAll</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseDeviceAllResponse> placeInWarehouseDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseDeviceAllRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseDeviceAllResponse placeInWarehouseDeviceAll(PlaceInWarehouseDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInWarehouseDeviceAllQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseDeviceAllResponse> placeInWarehouseDeviceAllWithHttpInfo(PlaceInWarehouseDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInWarehouseDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseDeviceAll</code> method in a fluent style.
   */
  public static class PlaceInWarehouseDeviceAllQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneDeviceAllResponse placeInZoneDeviceAll(@Param("sessionId") String sessionId, PlaceInZoneDeviceAllRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneDeviceAll</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneDeviceAllResponse> placeInZoneDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneDeviceAllRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneDeviceAllResponse placeInZoneDeviceAll(PlaceInZoneDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInZoneDeviceAllQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneDeviceAllResponse> placeInZoneDeviceAllWithHttpInfo(PlaceInZoneDeviceAllRequestData body, @QueryMap(encoded=true) PlaceInZoneDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneDeviceAll</code> method in a fluent style.
   */
  public static class PlaceInZoneDeviceAllQueryParams extends HashMap<String, Object> {
    public PlaceInZoneDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Replace object
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReplaceObjectDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectDeviceAllResponse replaceObjectDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectDeviceAllRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectDeviceAll</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectDeviceAllResponse> replaceObjectDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectDeviceAllRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectDeviceAllResponse replaceObjectDeviceAll(@Param("elid") String elid, ReplaceObjectDeviceAllRequestData body, @QueryMap(encoded=true) ReplaceObjectDeviceAllQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectDeviceAllResponse> replaceObjectDeviceAllWithHttpInfo(@Param("elid") String elid, ReplaceObjectDeviceAllRequestData body, @QueryMap(encoded=true) ReplaceObjectDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectDeviceAll</code> method in a fluent style.
   */
  public static class ReplaceObjectDeviceAllQueryParams extends HashMap<String, Object> {
    public ReplaceObjectDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify device (all)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDeviceAllResponse updateDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeviceAllRequestData body);

  /**
   * Modify
   * Similar to <code>updateDeviceAll</code> but it also returns the http response headers .
   * Modify device (all)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDeviceAllResponse> updateDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeviceAllRequestData body);


  /**
   * Modify
   * Modify device (all)
   * Note, this is equivalent to the other <code>updateDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDeviceAllResponse updateDeviceAll(@Param("elid") String elid, UpdateDeviceAllRequestData body, @QueryMap(encoded=true) UpdateDeviceAllQueryParams queryParams);

  /**
  * Modify
  * Modify device (all)
  * Note, this is equivalent to the other <code>updateDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDeviceAllResponse> updateDeviceAllWithHttpInfo(@Param("elid") String elid, UpdateDeviceAllRequestData body, @QueryMap(encoded=true) UpdateDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDeviceAll</code> method in a fluent style.
   */
  public static class UpdateDeviceAllQueryParams extends HashMap<String, Object> {
    public UpdateDeviceAllQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDeviceAllResponse updateSystemAttributesDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDeviceAllRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDeviceAll</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDeviceAllResponse> updateSystemAttributesDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDeviceAllRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDeviceAllResponse
   */
  @RequestLine("POST /api/rest/entity/deviceAll/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDeviceAllResponse updateSystemAttributesDeviceAll(@Param("elid") String elid, UpdateSystemAttributesDeviceAllRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDeviceAllQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDeviceAllResponse
      */
      @RequestLine("POST /api/rest/entity/deviceAll/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDeviceAllResponse> updateSystemAttributesDeviceAllWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDeviceAllRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDeviceAll</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDeviceAllQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
