package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.DeleteDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscContractsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscContractsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscDuctDataRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscDuctDataResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscDuctsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscDuctsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscLocationRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscLocationResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPersonsRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPersonsResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscPhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscQueryResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscServicesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscServicesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscSitesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscSitesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscSlotRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscSlotResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscVlansRequest;
import com.fntsoftware.businessgateway.entities.DeviceMiscVlansResponse;
import com.fntsoftware.businessgateway.entities.DeviceMiscWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.DeviceMiscZoneRequestData;
import com.fntsoftware.businessgateway.entities.DeviceMiscZoneResponseData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.UpdateDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDeviceMiscResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDeviceMiscRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDeviceMiscResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DeviceMiscApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeDeviceMiscResponse changeTypeDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeDeviceMiscRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeDeviceMisc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeDeviceMiscResponse> changeTypeDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeDeviceMiscRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeDeviceMiscResponse changeTypeDeviceMisc(@Param("elid") String elid, ChangeTypeDeviceMiscRequestData body, @QueryMap(encoded=true) ChangeTypeDeviceMiscQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeDeviceMiscResponse> changeTypeDeviceMiscWithHttpInfo(@Param("elid") String elid, ChangeTypeDeviceMiscRequestData body, @QueryMap(encoded=true) ChangeTypeDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeDeviceMisc</code> method in a fluent style.
   */
  public static class ChangeTypeDeviceMiscQueryParams extends HashMap<String, Object> {
    public ChangeTypeDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Device
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDeviceMiscResponse deleteDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDeviceMiscRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDeviceMisc</code> but it also returns the http response headers .
   * Delete Device
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDeviceMiscResponse> deleteDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDeviceMiscRequestData body);


  /**
   * Delete
   * Delete Device
   * Note, this is equivalent to the other <code>deleteDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDeviceMiscResponse deleteDeviceMisc(@Param("elid") String elid, DeleteDeviceMiscRequestData body, @QueryMap(encoded=true) DeleteDeviceMiscQueryParams queryParams);

  /**
  * Delete
  * Delete Device
  * Note, this is equivalent to the other <code>deleteDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDeviceMiscResponse> deleteDeviceMiscWithHttpInfo(@Param("elid") String elid, DeleteDeviceMiscRequestData body, @QueryMap(encoded=true) DeleteDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDeviceMisc</code> method in a fluent style.
   */
  public static class DeleteDeviceMiscQueryParams extends HashMap<String, Object> {
    public DeleteDeviceMiscQueryParams sessionId(final String value) {
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
   * @return DeviceMiscContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscContractsResponseData deviceMiscContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>deviceMiscContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscContractsResponseData> deviceMiscContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscContractsResponseData deviceMiscContracts(@Param("elid") String elid, DeviceMiscContractsRequestData body, @QueryMap(encoded=true) DeviceMiscContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscContractsResponseData> deviceMiscContractsWithHttpInfo(@Param("elid") String elid, DeviceMiscContractsRequestData body, @QueryMap(encoded=true) DeviceMiscContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscContracts</code> method in a fluent style.
   */
  public static class DeviceMiscContractsQueryParams extends HashMap<String, Object> {
    public DeviceMiscContractsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscDeviceMasterResponseData deviceMiscDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>deviceMiscDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscDeviceMasterResponseData> deviceMiscDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscDeviceMasterResponseData deviceMiscDeviceMaster(@Param("elid") String elid, DeviceMiscDeviceMasterRequestData body, @QueryMap(encoded=true) DeviceMiscDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscDeviceMasterResponseData> deviceMiscDeviceMasterWithHttpInfo(@Param("elid") String elid, DeviceMiscDeviceMasterRequestData body, @QueryMap(encoded=true) DeviceMiscDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscDeviceMaster</code> method in a fluent style.
   */
  public static class DeviceMiscDeviceMasterQueryParams extends HashMap<String, Object> {
    public DeviceMiscDeviceMasterQueryParams sessionId(final String value) {
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
   * @return DeviceMiscDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscDuctDataResponse deviceMiscDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>deviceMiscDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscDuctDataResponse> deviceMiscDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>deviceMiscDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscDuctDataResponse deviceMiscDuctData(@Param("elid") String elid, DeviceMiscDuctDataRequest body, @QueryMap(encoded=true) DeviceMiscDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>deviceMiscDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscDuctDataResponse> deviceMiscDuctDataWithHttpInfo(@Param("elid") String elid, DeviceMiscDuctDataRequest body, @QueryMap(encoded=true) DeviceMiscDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscDuctData</code> method in a fluent style.
   */
  public static class DeviceMiscDuctDataQueryParams extends HashMap<String, Object> {
    public DeviceMiscDuctDataQueryParams sessionId(final String value) {
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
   * @return DeviceMiscDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscDuctsResponseData deviceMiscDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>deviceMiscDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscDuctsResponseData> deviceMiscDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscDuctsResponseData deviceMiscDucts(@Param("elid") String elid, DeviceMiscDuctsRequestData body, @QueryMap(encoded=true) DeviceMiscDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscDuctsResponseData> deviceMiscDuctsWithHttpInfo(@Param("elid") String elid, DeviceMiscDuctsRequestData body, @QueryMap(encoded=true) DeviceMiscDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscDucts</code> method in a fluent style.
   */
  public static class DeviceMiscDuctsQueryParams extends HashMap<String, Object> {
    public DeviceMiscDuctsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscFrameContractsResponseData deviceMiscFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>deviceMiscFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscFrameContractsResponseData> deviceMiscFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscFrameContractsResponseData deviceMiscFrameContracts(@Param("elid") String elid, DeviceMiscFrameContractsRequestData body, @QueryMap(encoded=true) DeviceMiscFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscFrameContractsResponseData> deviceMiscFrameContractsWithHttpInfo(@Param("elid") String elid, DeviceMiscFrameContractsRequestData body, @QueryMap(encoded=true) DeviceMiscFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscFrameContracts</code> method in a fluent style.
   */
  public static class DeviceMiscFrameContractsQueryParams extends HashMap<String, Object> {
    public DeviceMiscFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMiscInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscInheritedGeoCoordinatesResponse deviceMiscInheritedGeoCoordinates(@Param("sessionId") String sessionId, DeviceMiscInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>deviceMiscInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscInheritedGeoCoordinatesResponse> deviceMiscInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, DeviceMiscInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>deviceMiscInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscInheritedGeoCoordinatesResponse deviceMiscInheritedGeoCoordinates(DeviceMiscInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceMiscInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>deviceMiscInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscInheritedGeoCoordinatesResponse> deviceMiscInheritedGeoCoordinatesWithHttpInfo(DeviceMiscInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceMiscInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class DeviceMiscInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public DeviceMiscInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscInstalledSubCardsResponse deviceMiscInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>deviceMiscInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscInstalledSubCardsResponse> deviceMiscInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>deviceMiscInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscInstalledSubCardsResponse deviceMiscInstalledSubCards(@Param("elid") String elid, DeviceMiscInstalledSubCardsRequest body, @QueryMap(encoded=true) DeviceMiscInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>deviceMiscInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscInstalledSubCardsResponse> deviceMiscInstalledSubCardsWithHttpInfo(@Param("elid") String elid, DeviceMiscInstalledSubCardsRequest body, @QueryMap(encoded=true) DeviceMiscInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscInstalledSubCards</code> method in a fluent style.
   */
  public static class DeviceMiscInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public DeviceMiscInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscInstalledSubCardsRecursiveResponse deviceMiscInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>deviceMiscInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscInstalledSubCardsRecursiveResponse> deviceMiscInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>deviceMiscInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscInstalledSubCardsRecursiveResponse deviceMiscInstalledSubCardsRecursive(@Param("elid") String elid, DeviceMiscInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) DeviceMiscInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>deviceMiscInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscInstalledSubCardsRecursiveResponse> deviceMiscInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, DeviceMiscInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) DeviceMiscInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class DeviceMiscInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public DeviceMiscInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return DeviceMiscInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscInterfacesResponseData deviceMiscInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>deviceMiscInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscInterfacesResponseData> deviceMiscInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscInterfacesResponseData deviceMiscInterfaces(@Param("elid") String elid, DeviceMiscInterfacesRequestData body, @QueryMap(encoded=true) DeviceMiscInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscInterfacesResponseData> deviceMiscInterfacesWithHttpInfo(@Param("elid") String elid, DeviceMiscInterfacesRequestData body, @QueryMap(encoded=true) DeviceMiscInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscInterfaces</code> method in a fluent style.
   */
  public static class DeviceMiscInterfacesQueryParams extends HashMap<String, Object> {
    public DeviceMiscInterfacesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscIpAddressesResponse deviceMiscIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>deviceMiscIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscIpAddressesResponse> deviceMiscIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceMiscIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscIpAddressesResponse deviceMiscIpAddresses(@Param("elid") String elid, DeviceMiscIpAddressesRequest body, @QueryMap(encoded=true) DeviceMiscIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceMiscIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscIpAddressesResponse> deviceMiscIpAddressesWithHttpInfo(@Param("elid") String elid, DeviceMiscIpAddressesRequest body, @QueryMap(encoded=true) DeviceMiscIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscIpAddresses</code> method in a fluent style.
   */
  public static class DeviceMiscIpAddressesQueryParams extends HashMap<String, Object> {
    public DeviceMiscIpAddressesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscIpv4AddressesResponseData deviceMiscIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>deviceMiscIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscIpv4AddressesResponseData> deviceMiscIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscIpv4AddressesResponseData deviceMiscIpv4Addresses(@Param("elid") String elid, DeviceMiscIpv4AddressesRequestData body, @QueryMap(encoded=true) DeviceMiscIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscIpv4AddressesResponseData> deviceMiscIpv4AddressesWithHttpInfo(@Param("elid") String elid, DeviceMiscIpv4AddressesRequestData body, @QueryMap(encoded=true) DeviceMiscIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscIpv4Addresses</code> method in a fluent style.
   */
  public static class DeviceMiscIpv4AddressesQueryParams extends HashMap<String, Object> {
    public DeviceMiscIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscIpv4NetrangesResponseData deviceMiscIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>deviceMiscIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscIpv4NetrangesResponseData> deviceMiscIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscIpv4NetrangesResponseData deviceMiscIpv4Netranges(@Param("elid") String elid, DeviceMiscIpv4NetrangesRequestData body, @QueryMap(encoded=true) DeviceMiscIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscIpv4NetrangesResponseData> deviceMiscIpv4NetrangesWithHttpInfo(@Param("elid") String elid, DeviceMiscIpv4NetrangesRequestData body, @QueryMap(encoded=true) DeviceMiscIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscIpv4Netranges</code> method in a fluent style.
   */
  public static class DeviceMiscIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public DeviceMiscIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscIpv4NetworksResponseData deviceMiscIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>deviceMiscIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscIpv4NetworksResponseData> deviceMiscIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscIpv4NetworksResponseData deviceMiscIpv4Networks(@Param("elid") String elid, DeviceMiscIpv4NetworksRequestData body, @QueryMap(encoded=true) DeviceMiscIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscIpv4NetworksResponseData> deviceMiscIpv4NetworksWithHttpInfo(@Param("elid") String elid, DeviceMiscIpv4NetworksRequestData body, @QueryMap(encoded=true) DeviceMiscIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscIpv4Networks</code> method in a fluent style.
   */
  public static class DeviceMiscIpv4NetworksQueryParams extends HashMap<String, Object> {
    public DeviceMiscIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return DeviceMiscLocationResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscLocationResponse deviceMiscLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscLocationRequest body);

  /**
   * Location
   * Similar to <code>deviceMiscLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscLocationResponse> deviceMiscLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>deviceMiscLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscLocationResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscLocationResponse deviceMiscLocation(@Param("elid") String elid, DeviceMiscLocationRequest body, @QueryMap(encoded=true) DeviceMiscLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>deviceMiscLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscLocationResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscLocationResponse> deviceMiscLocationWithHttpInfo(@Param("elid") String elid, DeviceMiscLocationRequest body, @QueryMap(encoded=true) DeviceMiscLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscLocation</code> method in a fluent style.
   */
  public static class DeviceMiscLocationQueryParams extends HashMap<String, Object> {
    public DeviceMiscLocationQueryParams sessionId(final String value) {
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
   * @return DeviceMiscLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscLogicalPortsResponseData deviceMiscLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>deviceMiscLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscLogicalPortsResponseData> deviceMiscLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscLogicalPortsResponseData deviceMiscLogicalPorts(@Param("elid") String elid, DeviceMiscLogicalPortsRequestData body, @QueryMap(encoded=true) DeviceMiscLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscLogicalPortsResponseData> deviceMiscLogicalPortsWithHttpInfo(@Param("elid") String elid, DeviceMiscLogicalPortsRequestData body, @QueryMap(encoded=true) DeviceMiscLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscLogicalPorts</code> method in a fluent style.
   */
  public static class DeviceMiscLogicalPortsQueryParams extends HashMap<String, Object> {
    public DeviceMiscLogicalPortsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscMaintenanceContractsResponseData deviceMiscMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>deviceMiscMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscMaintenanceContractsResponseData> deviceMiscMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscMaintenanceContractsResponseData deviceMiscMaintenanceContracts(@Param("elid") String elid, DeviceMiscMaintenanceContractsRequestData body, @QueryMap(encoded=true) DeviceMiscMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscMaintenanceContractsResponseData> deviceMiscMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DeviceMiscMaintenanceContractsRequestData body, @QueryMap(encoded=true) DeviceMiscMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscMaintenanceContracts</code> method in a fluent style.
   */
  public static class DeviceMiscMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DeviceMiscMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscMultiDuctsResponseData deviceMiscMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>deviceMiscMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscMultiDuctsResponseData> deviceMiscMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscMultiDuctsResponseData deviceMiscMultiDucts(@Param("elid") String elid, DeviceMiscMultiDuctsRequestData body, @QueryMap(encoded=true) DeviceMiscMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscMultiDuctsResponseData> deviceMiscMultiDuctsWithHttpInfo(@Param("elid") String elid, DeviceMiscMultiDuctsRequestData body, @QueryMap(encoded=true) DeviceMiscMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscMultiDucts</code> method in a fluent style.
   */
  public static class DeviceMiscMultiDuctsQueryParams extends HashMap<String, Object> {
    public DeviceMiscMultiDuctsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscNetworksAndNetrangesResponse deviceMiscNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>deviceMiscNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscNetworksAndNetrangesResponse> deviceMiscNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceMiscNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscNetworksAndNetrangesResponse deviceMiscNetworksAndNetranges(@Param("elid") String elid, DeviceMiscNetworksAndNetrangesRequest body, @QueryMap(encoded=true) DeviceMiscNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceMiscNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscNetworksAndNetrangesResponse> deviceMiscNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, DeviceMiscNetworksAndNetrangesRequest body, @QueryMap(encoded=true) DeviceMiscNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscNetworksAndNetranges</code> method in a fluent style.
   */
  public static class DeviceMiscNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public DeviceMiscNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscOperatingSystemInstallationResponseData deviceMiscOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>deviceMiscOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscOperatingSystemInstallationResponseData> deviceMiscOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscOperatingSystemInstallationResponseData deviceMiscOperatingSystemInstallation(@Param("elid") String elid, DeviceMiscOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) DeviceMiscOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscOperatingSystemInstallationResponseData> deviceMiscOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, DeviceMiscOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) DeviceMiscOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class DeviceMiscOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public DeviceMiscOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return DeviceMiscOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscOrganizationsResponseData deviceMiscOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>deviceMiscOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscOrganizationsResponseData> deviceMiscOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscOrganizationsResponseData deviceMiscOrganizations(@Param("elid") String elid, DeviceMiscOrganizationsRequestData body, @QueryMap(encoded=true) DeviceMiscOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscOrganizationsResponseData> deviceMiscOrganizationsWithHttpInfo(@Param("elid") String elid, DeviceMiscOrganizationsRequestData body, @QueryMap(encoded=true) DeviceMiscOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscOrganizations</code> method in a fluent style.
   */
  public static class DeviceMiscOrganizationsQueryParams extends HashMap<String, Object> {
    public DeviceMiscOrganizationsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscPersonGroupsResponseData deviceMiscPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>deviceMiscPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscPersonGroupsResponseData> deviceMiscPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscPersonGroupsResponseData deviceMiscPersonGroups(@Param("elid") String elid, DeviceMiscPersonGroupsRequestData body, @QueryMap(encoded=true) DeviceMiscPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscPersonGroupsResponseData> deviceMiscPersonGroupsWithHttpInfo(@Param("elid") String elid, DeviceMiscPersonGroupsRequestData body, @QueryMap(encoded=true) DeviceMiscPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscPersonGroups</code> method in a fluent style.
   */
  public static class DeviceMiscPersonGroupsQueryParams extends HashMap<String, Object> {
    public DeviceMiscPersonGroupsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscPersonsResponseData deviceMiscPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>deviceMiscPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscPersonsResponseData> deviceMiscPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscPersonsResponseData deviceMiscPersons(@Param("elid") String elid, DeviceMiscPersonsRequestData body, @QueryMap(encoded=true) DeviceMiscPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscPersonsResponseData> deviceMiscPersonsWithHttpInfo(@Param("elid") String elid, DeviceMiscPersonsRequestData body, @QueryMap(encoded=true) DeviceMiscPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscPersons</code> method in a fluent style.
   */
  public static class DeviceMiscPersonsQueryParams extends HashMap<String, Object> {
    public DeviceMiscPersonsQueryParams sessionId(final String value) {
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
   * @return DeviceMiscPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscPhysicalPortsDataResponseData deviceMiscPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>deviceMiscPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscPhysicalPortsDataResponseData> deviceMiscPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscPhysicalPortsDataResponseData deviceMiscPhysicalPortsData(@Param("elid") String elid, DeviceMiscPhysicalPortsDataRequestData body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscPhysicalPortsDataResponseData> deviceMiscPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, DeviceMiscPhysicalPortsDataRequestData body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscPhysicalPortsData</code> method in a fluent style.
   */
  public static class DeviceMiscPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public DeviceMiscPhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return DeviceMiscPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscPhysicalPortsDataExtendedResponse deviceMiscPhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>deviceMiscPhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscPhysicalPortsDataExtendedResponse> deviceMiscPhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscPhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscPhysicalPortsDataExtendedResponse deviceMiscPhysicalPortsDataExtended(@Param("elid") String elid, DeviceMiscPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscPhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscPhysicalPortsDataExtendedResponse> deviceMiscPhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, DeviceMiscPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscPhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class DeviceMiscPhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public DeviceMiscPhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return DeviceMiscPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscPhysicalPortsPowerResponseData deviceMiscPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>deviceMiscPhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscPhysicalPortsPowerResponseData> deviceMiscPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscPhysicalPortsPowerResponseData deviceMiscPhysicalPortsPower(@Param("elid") String elid, DeviceMiscPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscPhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscPhysicalPortsPowerResponseData> deviceMiscPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, DeviceMiscPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscPhysicalPortsPower</code> method in a fluent style.
   */
  public static class DeviceMiscPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public DeviceMiscPhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return DeviceMiscPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscPhysicalPortsPowerExtendedResponse deviceMiscPhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>deviceMiscPhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscPhysicalPortsPowerExtendedResponse> deviceMiscPhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscPhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscPhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscPhysicalPortsPowerExtendedResponse deviceMiscPhysicalPortsPowerExtended(@Param("elid") String elid, DeviceMiscPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>deviceMiscPhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscPhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscPhysicalPortsPowerExtendedResponse> deviceMiscPhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, DeviceMiscPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) DeviceMiscPhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscPhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class DeviceMiscPhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public DeviceMiscPhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMiscQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscQueryResponse deviceMiscQuery(@Param("sessionId") String sessionId, DeviceMiscQueryRequest body);

  /**
   * Basic query
   * Similar to <code>deviceMiscQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscQueryResponse> deviceMiscQueryWithHttpInfo(@Param("sessionId") String sessionId, DeviceMiscQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceMiscQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscQueryResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscQueryResponse deviceMiscQuery(DeviceMiscQueryRequest body, @QueryMap(encoded=true) DeviceMiscQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceMiscQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscQueryResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscQueryResponse> deviceMiscQueryWithHttpInfo(DeviceMiscQueryRequest body, @QueryMap(encoded=true) DeviceMiscQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscQuery</code> method in a fluent style.
   */
  public static class DeviceMiscQueryQueryParams extends HashMap<String, Object> {
    public DeviceMiscQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMiscQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscQueryExtendedResponse deviceMiscQueryExtended(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>deviceMiscQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscQueryExtendedResponse> deviceMiscQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>deviceMiscQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscQueryExtendedResponse deviceMiscQueryExtended(DeviceMiscQueryExtendedRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>deviceMiscQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscQueryExtendedResponse> deviceMiscQueryExtendedWithHttpInfo(DeviceMiscQueryExtendedRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscQueryExtended</code> method in a fluent style.
   */
  public static class DeviceMiscQueryExtendedQueryParams extends HashMap<String, Object> {
    public DeviceMiscQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMiscQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscQueryExtendedGeoCoordinatesResponse deviceMiscQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>deviceMiscQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscQueryExtendedGeoCoordinatesResponse> deviceMiscQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>deviceMiscQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscQueryExtendedGeoCoordinatesResponse deviceMiscQueryExtendedGeoCoordinates(DeviceMiscQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>deviceMiscQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscQueryExtendedGeoCoordinatesResponse> deviceMiscQueryExtendedGeoCoordinatesWithHttpInfo(DeviceMiscQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class DeviceMiscQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public DeviceMiscQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMiscQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscQueryExtendedScrollFirstResponse deviceMiscQueryExtendedScrollFirst(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>deviceMiscQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscQueryExtendedScrollFirstResponse> deviceMiscQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>deviceMiscQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscQueryExtendedScrollFirstResponse deviceMiscQueryExtendedScrollFirst(DeviceMiscQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>deviceMiscQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscQueryExtendedScrollFirstResponse> deviceMiscQueryExtendedScrollFirstWithHttpInfo(DeviceMiscQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class DeviceMiscQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public DeviceMiscQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeviceMiscQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscQueryExtendedScrollMoreResponse deviceMiscQueryExtendedScrollMore(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>deviceMiscQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscQueryExtendedScrollMoreResponse> deviceMiscQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, DeviceMiscQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>deviceMiscQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscQueryExtendedScrollMoreResponse deviceMiscQueryExtendedScrollMore(DeviceMiscQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>deviceMiscQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscQueryExtendedScrollMoreResponse> deviceMiscQueryExtendedScrollMoreWithHttpInfo(DeviceMiscQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) DeviceMiscQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class DeviceMiscQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public DeviceMiscQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return DeviceMiscServicesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscServicesResponse deviceMiscServices(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>deviceMiscServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscServicesResponse> deviceMiscServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>deviceMiscServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscServicesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscServicesResponse deviceMiscServices(@Param("elid") String elid, DeviceMiscServicesRequest body, @QueryMap(encoded=true) DeviceMiscServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>deviceMiscServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscServicesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscServicesResponse> deviceMiscServicesWithHttpInfo(@Param("elid") String elid, DeviceMiscServicesRequest body, @QueryMap(encoded=true) DeviceMiscServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscServices</code> method in a fluent style.
   */
  public static class DeviceMiscServicesQueryParams extends HashMap<String, Object> {
    public DeviceMiscServicesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscSitesResponseData deviceMiscSites(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>deviceMiscSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscSitesResponseData> deviceMiscSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscSitesResponseData deviceMiscSites(@Param("elid") String elid, DeviceMiscSitesRequestData body, @QueryMap(encoded=true) DeviceMiscSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscSitesResponseData> deviceMiscSitesWithHttpInfo(@Param("elid") String elid, DeviceMiscSitesRequestData body, @QueryMap(encoded=true) DeviceMiscSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscSites</code> method in a fluent style.
   */
  public static class DeviceMiscSitesQueryParams extends HashMap<String, Object> {
    public DeviceMiscSitesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeviceMiscSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscSlotResponseData deviceMiscSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>deviceMiscSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscSlotResponseData> deviceMiscSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>deviceMiscSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscSlotResponseData deviceMiscSlot(@Param("elid") String elid, DeviceMiscSlotRequestData body, @QueryMap(encoded=true) DeviceMiscSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>deviceMiscSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscSlotResponseData> deviceMiscSlotWithHttpInfo(@Param("elid") String elid, DeviceMiscSlotRequestData body, @QueryMap(encoded=true) DeviceMiscSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscSlot</code> method in a fluent style.
   */
  public static class DeviceMiscSlotQueryParams extends HashMap<String, Object> {
    public DeviceMiscSlotQueryParams sessionId(final String value) {
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
   * @return DeviceMiscSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscSwitchCabinetResponseData deviceMiscSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>deviceMiscSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscSwitchCabinetResponseData> deviceMiscSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscSwitchCabinetResponseData deviceMiscSwitchCabinet(@Param("elid") String elid, DeviceMiscSwitchCabinetRequestData body, @QueryMap(encoded=true) DeviceMiscSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscSwitchCabinetResponseData> deviceMiscSwitchCabinetWithHttpInfo(@Param("elid") String elid, DeviceMiscSwitchCabinetRequestData body, @QueryMap(encoded=true) DeviceMiscSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscSwitchCabinet</code> method in a fluent style.
   */
  public static class DeviceMiscSwitchCabinetQueryParams extends HashMap<String, Object> {
    public DeviceMiscSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return DeviceMiscSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscSystemAttributesResponse deviceMiscSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>deviceMiscSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscSystemAttributesResponse> deviceMiscSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>deviceMiscSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscSystemAttributesResponse deviceMiscSystemAttributes(@Param("elid") String elid, DeviceMiscSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMiscSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>deviceMiscSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscSystemAttributesResponse> deviceMiscSystemAttributesWithHttpInfo(@Param("elid") String elid, DeviceMiscSystemAttributesRequest body, @QueryMap(encoded=true) DeviceMiscSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscSystemAttributes</code> method in a fluent style.
   */
  public static class DeviceMiscSystemAttributesQueryParams extends HashMap<String, Object> {
    public DeviceMiscSystemAttributesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscVirtualSwitchesResponseData deviceMiscVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>deviceMiscVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscVirtualSwitchesResponseData> deviceMiscVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscVirtualSwitchesResponseData deviceMiscVirtualSwitches(@Param("elid") String elid, DeviceMiscVirtualSwitchesRequestData body, @QueryMap(encoded=true) DeviceMiscVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscVirtualSwitchesResponseData> deviceMiscVirtualSwitchesWithHttpInfo(@Param("elid") String elid, DeviceMiscVirtualSwitchesRequestData body, @QueryMap(encoded=true) DeviceMiscVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscVirtualSwitches</code> method in a fluent style.
   */
  public static class DeviceMiscVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public DeviceMiscVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return DeviceMiscVlansResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscVlansResponse deviceMiscVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscVlansRequest body);

  /**
   * VLANs
   * Similar to <code>deviceMiscVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscVlansResponse> deviceMiscVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceMiscVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscVlansResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscVlansResponse deviceMiscVlans(@Param("elid") String elid, DeviceMiscVlansRequest body, @QueryMap(encoded=true) DeviceMiscVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceMiscVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscVlansResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscVlansResponse> deviceMiscVlansWithHttpInfo(@Param("elid") String elid, DeviceMiscVlansRequest body, @QueryMap(encoded=true) DeviceMiscVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscVlans</code> method in a fluent style.
   */
  public static class DeviceMiscVlansQueryParams extends HashMap<String, Object> {
    public DeviceMiscVlansQueryParams sessionId(final String value) {
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
   * @return DeviceMiscVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscVlansAtSlotResponse deviceMiscVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>deviceMiscVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscVlansAtSlotResponse> deviceMiscVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>deviceMiscVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscVlansAtSlotResponse deviceMiscVlansAtSlot(@Param("elid") String elid, DeviceMiscVlansAtSlotRequest body, @QueryMap(encoded=true) DeviceMiscVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>deviceMiscVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscVlansAtSlotResponse> deviceMiscVlansAtSlotWithHttpInfo(@Param("elid") String elid, DeviceMiscVlansAtSlotRequest body, @QueryMap(encoded=true) DeviceMiscVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscVlansAtSlot</code> method in a fluent style.
   */
  public static class DeviceMiscVlansAtSlotQueryParams extends HashMap<String, Object> {
    public DeviceMiscVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return DeviceMiscWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscWarehouseResponseData deviceMiscWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>deviceMiscWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscWarehouseResponseData> deviceMiscWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscWarehouseResponseData deviceMiscWarehouse(@Param("elid") String elid, DeviceMiscWarehouseRequestData body, @QueryMap(encoded=true) DeviceMiscWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscWarehouseResponseData> deviceMiscWarehouseWithHttpInfo(@Param("elid") String elid, DeviceMiscWarehouseRequestData body, @QueryMap(encoded=true) DeviceMiscWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscWarehouse</code> method in a fluent style.
   */
  public static class DeviceMiscWarehouseQueryParams extends HashMap<String, Object> {
    public DeviceMiscWarehouseQueryParams sessionId(final String value) {
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
   * @return DeviceMiscZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeviceMiscZoneResponseData deviceMiscZone(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>deviceMiscZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeviceMiscZoneResponseData> deviceMiscZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeviceMiscZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>deviceMiscZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeviceMiscZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeviceMiscZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeviceMiscZoneResponseData deviceMiscZone(@Param("elid") String elid, DeviceMiscZoneRequestData body, @QueryMap(encoded=true) DeviceMiscZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>deviceMiscZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeviceMiscZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeviceMiscZoneResponseData> deviceMiscZoneWithHttpInfo(@Param("elid") String elid, DeviceMiscZoneRequestData body, @QueryMap(encoded=true) DeviceMiscZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deviceMiscZone</code> method in a fluent style.
   */
  public static class DeviceMiscZoneQueryParams extends HashMap<String, Object> {
    public DeviceMiscZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to cabinet
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToCabinetDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetDeviceMiscResponse moveToCabinetDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetDeviceMiscRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetDeviceMisc</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetDeviceMiscResponse> moveToCabinetDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetDeviceMiscRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetDeviceMiscResponse moveToCabinetDeviceMisc(@Param("elid") String elid, MoveToCabinetDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToCabinetDeviceMiscQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetDeviceMiscResponse> moveToCabinetDeviceMiscWithHttpInfo(@Param("elid") String elid, MoveToCabinetDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToCabinetDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetDeviceMisc</code> method in a fluent style.
   */
  public static class MoveToCabinetDeviceMiscQueryParams extends HashMap<String, Object> {
    public MoveToCabinetDeviceMiscQueryParams sessionId(final String value) {
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
   * @return MoveToSlotDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotDeviceMiscResponse moveToSlotDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotDeviceMiscRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotDeviceMisc</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotDeviceMiscResponse> moveToSlotDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotDeviceMiscRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotDeviceMiscResponse moveToSlotDeviceMisc(@Param("elid") String elid, MoveToSlotDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToSlotDeviceMiscQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotDeviceMiscResponse> moveToSlotDeviceMiscWithHttpInfo(@Param("elid") String elid, MoveToSlotDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToSlotDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotDeviceMisc</code> method in a fluent style.
   */
  public static class MoveToSlotDeviceMiscQueryParams extends HashMap<String, Object> {
    public MoveToSlotDeviceMiscQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseDeviceMiscResponse moveToWarehouseDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseDeviceMiscRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseDeviceMisc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseDeviceMiscResponse> moveToWarehouseDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseDeviceMiscRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseDeviceMiscResponse moveToWarehouseDeviceMisc(@Param("elid") String elid, MoveToWarehouseDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToWarehouseDeviceMiscQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseDeviceMiscResponse> moveToWarehouseDeviceMiscWithHttpInfo(@Param("elid") String elid, MoveToWarehouseDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToWarehouseDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseDeviceMisc</code> method in a fluent style.
   */
  public static class MoveToWarehouseDeviceMiscQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseDeviceMiscQueryParams sessionId(final String value) {
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
   * @return MoveToZoneDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneDeviceMiscResponse moveToZoneDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneDeviceMiscRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneDeviceMisc</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneDeviceMiscResponse> moveToZoneDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneDeviceMiscRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneDeviceMiscResponse moveToZoneDeviceMisc(@Param("elid") String elid, MoveToZoneDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToZoneDeviceMiscQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneDeviceMiscResponse> moveToZoneDeviceMiscWithHttpInfo(@Param("elid") String elid, MoveToZoneDeviceMiscRequestData body, @QueryMap(encoded=true) MoveToZoneDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneDeviceMisc</code> method in a fluent style.
   */
  public static class MoveToZoneDeviceMiscQueryParams extends HashMap<String, Object> {
    public MoveToZoneDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetDeviceMiscResponse placeInCabinetDeviceMisc(@Param("sessionId") String sessionId, PlaceInCabinetDeviceMiscRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetDeviceMisc</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetDeviceMiscResponse> placeInCabinetDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetDeviceMiscRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetDeviceMiscResponse placeInCabinetDeviceMisc(PlaceInCabinetDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInCabinetDeviceMiscQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetDeviceMiscResponse> placeInCabinetDeviceMiscWithHttpInfo(PlaceInCabinetDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInCabinetDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetDeviceMisc</code> method in a fluent style.
   */
  public static class PlaceInCabinetDeviceMiscQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotDeviceMiscResponse placeInSlotDeviceMisc(@Param("sessionId") String sessionId, PlaceInSlotDeviceMiscRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotDeviceMisc</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotDeviceMiscResponse> placeInSlotDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotDeviceMiscRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotDeviceMiscResponse placeInSlotDeviceMisc(PlaceInSlotDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInSlotDeviceMiscQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotDeviceMiscResponse> placeInSlotDeviceMiscWithHttpInfo(PlaceInSlotDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInSlotDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotDeviceMisc</code> method in a fluent style.
   */
  public static class PlaceInSlotDeviceMiscQueryParams extends HashMap<String, Object> {
    public PlaceInSlotDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseDeviceMiscResponse placeInWarehouseDeviceMisc(@Param("sessionId") String sessionId, PlaceInWarehouseDeviceMiscRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseDeviceMisc</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseDeviceMiscResponse> placeInWarehouseDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseDeviceMiscRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseDeviceMiscResponse placeInWarehouseDeviceMisc(PlaceInWarehouseDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInWarehouseDeviceMiscQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseDeviceMiscResponse> placeInWarehouseDeviceMiscWithHttpInfo(PlaceInWarehouseDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInWarehouseDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseDeviceMisc</code> method in a fluent style.
   */
  public static class PlaceInWarehouseDeviceMiscQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneDeviceMiscResponse placeInZoneDeviceMisc(@Param("sessionId") String sessionId, PlaceInZoneDeviceMiscRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneDeviceMisc</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneDeviceMiscResponse> placeInZoneDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneDeviceMiscRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneDeviceMiscResponse placeInZoneDeviceMisc(PlaceInZoneDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInZoneDeviceMiscQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneDeviceMiscResponse> placeInZoneDeviceMiscWithHttpInfo(PlaceInZoneDeviceMiscRequestData body, @QueryMap(encoded=true) PlaceInZoneDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneDeviceMisc</code> method in a fluent style.
   */
  public static class PlaceInZoneDeviceMiscQueryParams extends HashMap<String, Object> {
    public PlaceInZoneDeviceMiscQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectDeviceMiscResponse replaceObjectDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectDeviceMiscRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectDeviceMisc</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectDeviceMiscResponse> replaceObjectDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectDeviceMiscRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectDeviceMiscResponse replaceObjectDeviceMisc(@Param("elid") String elid, ReplaceObjectDeviceMiscRequestData body, @QueryMap(encoded=true) ReplaceObjectDeviceMiscQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectDeviceMiscResponse> replaceObjectDeviceMiscWithHttpInfo(@Param("elid") String elid, ReplaceObjectDeviceMiscRequestData body, @QueryMap(encoded=true) ReplaceObjectDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectDeviceMisc</code> method in a fluent style.
   */
  public static class ReplaceObjectDeviceMiscQueryParams extends HashMap<String, Object> {
    public ReplaceObjectDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Device
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDeviceMiscResponse updateDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeviceMiscRequestData body);

  /**
   * Modify
   * Similar to <code>updateDeviceMisc</code> but it also returns the http response headers .
   * Modify Device
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDeviceMiscResponse> updateDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDeviceMiscRequestData body);


  /**
   * Modify
   * Modify Device
   * Note, this is equivalent to the other <code>updateDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDeviceMiscResponse updateDeviceMisc(@Param("elid") String elid, UpdateDeviceMiscRequestData body, @QueryMap(encoded=true) UpdateDeviceMiscQueryParams queryParams);

  /**
  * Modify
  * Modify Device
  * Note, this is equivalent to the other <code>updateDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDeviceMiscResponse> updateDeviceMiscWithHttpInfo(@Param("elid") String elid, UpdateDeviceMiscRequestData body, @QueryMap(encoded=true) UpdateDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDeviceMisc</code> method in a fluent style.
   */
  public static class UpdateDeviceMiscQueryParams extends HashMap<String, Object> {
    public UpdateDeviceMiscQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDeviceMiscResponse updateSystemAttributesDeviceMisc(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDeviceMiscRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDeviceMisc</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDeviceMiscResponse> updateSystemAttributesDeviceMiscWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDeviceMiscRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDeviceMisc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDeviceMiscQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDeviceMiscResponse
   */
  @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDeviceMiscResponse updateSystemAttributesDeviceMisc(@Param("elid") String elid, UpdateSystemAttributesDeviceMiscRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDeviceMiscQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDeviceMisc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDeviceMiscResponse
      */
      @RequestLine("POST /api/rest/entity/deviceMisc/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDeviceMiscResponse> updateSystemAttributesDeviceMiscWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDeviceMiscRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDeviceMiscQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDeviceMisc</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDeviceMiscQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDeviceMiscQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
