package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeStorageRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeStorageResponse;
import com.fntsoftware.businessgateway.entities.DeleteStorageRequestData;
import com.fntsoftware.businessgateway.entities.DeleteStorageResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetStorageRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetStorageResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotStorageRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotStorageResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseStorageRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseStorageResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneStorageRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneStorageResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetStorageRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetStorageResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotStorageRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotStorageResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseStorageRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseStorageResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneStorageRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneStorageResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectStorageRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectStorageResponse;
import com.fntsoftware.businessgateway.entities.StorageContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.StorageDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.StorageDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.StorageDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.StorageDrivesRequestData;
import com.fntsoftware.businessgateway.entities.StorageDrivesResponseData;
import com.fntsoftware.businessgateway.entities.StorageDuctDataRequest;
import com.fntsoftware.businessgateway.entities.StorageDuctDataResponse;
import com.fntsoftware.businessgateway.entities.StorageDuctsRequestData;
import com.fntsoftware.businessgateway.entities.StorageDuctsResponseData;
import com.fntsoftware.businessgateway.entities.StorageFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageHardDisksRequestData;
import com.fntsoftware.businessgateway.entities.StorageHardDisksResponseData;
import com.fntsoftware.businessgateway.entities.StorageInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.StorageInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.StorageInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.StorageInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.StorageInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.StorageInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.StorageInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.StorageInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.StorageIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.StorageIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.StorageIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.StorageIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.StorageIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.StorageIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.StorageIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.StorageIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.StorageLocationRequest;
import com.fntsoftware.businessgateway.entities.StorageLocationResponse;
import com.fntsoftware.businessgateway.entities.StorageLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.StorageLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.StorageMainMemoryRequestData;
import com.fntsoftware.businessgateway.entities.StorageMainMemoryResponseData;
import com.fntsoftware.businessgateway.entities.StorageMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.StorageMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.StorageModemsRequestData;
import com.fntsoftware.businessgateway.entities.StorageModemsResponseData;
import com.fntsoftware.businessgateway.entities.StorageMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.StorageMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.StorageNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.StorageNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.StorageOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.StorageOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.StorageOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StoragePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StoragePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StoragePersonsRequestData;
import com.fntsoftware.businessgateway.entities.StoragePersonsResponseData;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.StoragePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.StoragePluginCardsRequestData;
import com.fntsoftware.businessgateway.entities.StoragePluginCardsResponseData;
import com.fntsoftware.businessgateway.entities.StorageProcessorsRequestData;
import com.fntsoftware.businessgateway.entities.StorageProcessorsResponseData;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.StorageQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.StorageQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageRaidControllersRequestData;
import com.fntsoftware.businessgateway.entities.StorageRaidControllersResponseData;
import com.fntsoftware.businessgateway.entities.StorageServicesRequest;
import com.fntsoftware.businessgateway.entities.StorageServicesResponse;
import com.fntsoftware.businessgateway.entities.StorageSitesRequestData;
import com.fntsoftware.businessgateway.entities.StorageSitesResponseData;
import com.fntsoftware.businessgateway.entities.StorageSlotRequestData;
import com.fntsoftware.businessgateway.entities.StorageSlotResponseData;
import com.fntsoftware.businessgateway.entities.StorageStorageUnitVolumesRequestData;
import com.fntsoftware.businessgateway.entities.StorageStorageUnitVolumesResponseData;
import com.fntsoftware.businessgateway.entities.StorageSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.StorageSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.StorageVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.StorageVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.StorageVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.StorageVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.StorageVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.StorageVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.StorageVlansRequest;
import com.fntsoftware.businessgateway.entities.StorageVlansResponse;
import com.fntsoftware.businessgateway.entities.StorageWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.StorageWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.StorageZoneRequestData;
import com.fntsoftware.businessgateway.entities.StorageZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateStorageRequestData;
import com.fntsoftware.businessgateway.entities.UpdateStorageResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface StorageApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeStorageResponse changeTypeStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeStorageRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeStorage</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeStorageResponse> changeTypeStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeStorageRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeStorageResponse changeTypeStorage(@Param("elid") String elid, ChangeTypeStorageRequestData body, @QueryMap(encoded=true) ChangeTypeStorageQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeStorageResponse> changeTypeStorageWithHttpInfo(@Param("elid") String elid, ChangeTypeStorageRequestData body, @QueryMap(encoded=true) ChangeTypeStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeStorage</code> method in a fluent style.
   */
  public static class ChangeTypeStorageQueryParams extends HashMap<String, Object> {
    public ChangeTypeStorageQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteStorageResponse deleteStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageRequestData body);

  /**
   * Delete
   * Similar to <code>deleteStorage</code> but it also returns the http response headers .
   * Delete storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteStorageResponse> deleteStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageRequestData body);


  /**
   * Delete
   * Delete storage
   * Note, this is equivalent to the other <code>deleteStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteStorageResponse deleteStorage(@Param("elid") String elid, DeleteStorageRequestData body, @QueryMap(encoded=true) DeleteStorageQueryParams queryParams);

  /**
  * Delete
  * Delete storage
  * Note, this is equivalent to the other <code>deleteStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteStorageResponse> deleteStorageWithHttpInfo(@Param("elid") String elid, DeleteStorageRequestData body, @QueryMap(encoded=true) DeleteStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorage</code> method in a fluent style.
   */
  public static class DeleteStorageQueryParams extends HashMap<String, Object> {
    public DeleteStorageQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetStorageResponse moveToCabinetStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetStorageRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetStorage</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetStorageResponse> moveToCabinetStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetStorageRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetStorageResponse moveToCabinetStorage(@Param("elid") String elid, MoveToCabinetStorageRequestData body, @QueryMap(encoded=true) MoveToCabinetStorageQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetStorageResponse> moveToCabinetStorageWithHttpInfo(@Param("elid") String elid, MoveToCabinetStorageRequestData body, @QueryMap(encoded=true) MoveToCabinetStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetStorage</code> method in a fluent style.
   */
  public static class MoveToCabinetStorageQueryParams extends HashMap<String, Object> {
    public MoveToCabinetStorageQueryParams sessionId(final String value) {
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
   * @return MoveToSlotStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotStorageResponse moveToSlotStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotStorageRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotStorage</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotStorageResponse> moveToSlotStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotStorageRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotStorageResponse moveToSlotStorage(@Param("elid") String elid, MoveToSlotStorageRequestData body, @QueryMap(encoded=true) MoveToSlotStorageQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotStorageResponse> moveToSlotStorageWithHttpInfo(@Param("elid") String elid, MoveToSlotStorageRequestData body, @QueryMap(encoded=true) MoveToSlotStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotStorage</code> method in a fluent style.
   */
  public static class MoveToSlotStorageQueryParams extends HashMap<String, Object> {
    public MoveToSlotStorageQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseStorageResponse moveToWarehouseStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseStorageRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseStorage</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseStorageResponse> moveToWarehouseStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseStorageRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseStorageResponse moveToWarehouseStorage(@Param("elid") String elid, MoveToWarehouseStorageRequestData body, @QueryMap(encoded=true) MoveToWarehouseStorageQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseStorageResponse> moveToWarehouseStorageWithHttpInfo(@Param("elid") String elid, MoveToWarehouseStorageRequestData body, @QueryMap(encoded=true) MoveToWarehouseStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseStorage</code> method in a fluent style.
   */
  public static class MoveToWarehouseStorageQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseStorageQueryParams sessionId(final String value) {
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
   * @return MoveToZoneStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneStorageResponse moveToZoneStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneStorageRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneStorage</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneStorageResponse> moveToZoneStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneStorageRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneStorageResponse moveToZoneStorage(@Param("elid") String elid, MoveToZoneStorageRequestData body, @QueryMap(encoded=true) MoveToZoneStorageQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneStorageResponse> moveToZoneStorageWithHttpInfo(@Param("elid") String elid, MoveToZoneStorageRequestData body, @QueryMap(encoded=true) MoveToZoneStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneStorage</code> method in a fluent style.
   */
  public static class MoveToZoneStorageQueryParams extends HashMap<String, Object> {
    public MoveToZoneStorageQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetStorageResponse placeInCabinetStorage(@Param("sessionId") String sessionId, PlaceInCabinetStorageRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetStorage</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetStorageResponse> placeInCabinetStorageWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetStorageRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetStorageResponse placeInCabinetStorage(PlaceInCabinetStorageRequestData body, @QueryMap(encoded=true) PlaceInCabinetStorageQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetStorageResponse> placeInCabinetStorageWithHttpInfo(PlaceInCabinetStorageRequestData body, @QueryMap(encoded=true) PlaceInCabinetStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetStorage</code> method in a fluent style.
   */
  public static class PlaceInCabinetStorageQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetStorageQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotStorageResponse placeInSlotStorage(@Param("sessionId") String sessionId, PlaceInSlotStorageRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotStorage</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotStorageResponse> placeInSlotStorageWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotStorageRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotStorageResponse placeInSlotStorage(PlaceInSlotStorageRequestData body, @QueryMap(encoded=true) PlaceInSlotStorageQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotStorageResponse> placeInSlotStorageWithHttpInfo(PlaceInSlotStorageRequestData body, @QueryMap(encoded=true) PlaceInSlotStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotStorage</code> method in a fluent style.
   */
  public static class PlaceInSlotStorageQueryParams extends HashMap<String, Object> {
    public PlaceInSlotStorageQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseStorageResponse placeInWarehouseStorage(@Param("sessionId") String sessionId, PlaceInWarehouseStorageRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseStorage</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseStorageResponse> placeInWarehouseStorageWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseStorageRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseStorageResponse placeInWarehouseStorage(PlaceInWarehouseStorageRequestData body, @QueryMap(encoded=true) PlaceInWarehouseStorageQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseStorageResponse> placeInWarehouseStorageWithHttpInfo(PlaceInWarehouseStorageRequestData body, @QueryMap(encoded=true) PlaceInWarehouseStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseStorage</code> method in a fluent style.
   */
  public static class PlaceInWarehouseStorageQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseStorageQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneStorageResponse placeInZoneStorage(@Param("sessionId") String sessionId, PlaceInZoneStorageRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneStorage</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneStorageResponse> placeInZoneStorageWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneStorageRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneStorageResponse placeInZoneStorage(PlaceInZoneStorageRequestData body, @QueryMap(encoded=true) PlaceInZoneStorageQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneStorageResponse> placeInZoneStorageWithHttpInfo(PlaceInZoneStorageRequestData body, @QueryMap(encoded=true) PlaceInZoneStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneStorage</code> method in a fluent style.
   */
  public static class PlaceInZoneStorageQueryParams extends HashMap<String, Object> {
    public PlaceInZoneStorageQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectStorageResponse replaceObjectStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectStorageRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectStorage</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectStorageResponse> replaceObjectStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectStorageRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectStorageResponse replaceObjectStorage(@Param("elid") String elid, ReplaceObjectStorageRequestData body, @QueryMap(encoded=true) ReplaceObjectStorageQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectStorageResponse> replaceObjectStorageWithHttpInfo(@Param("elid") String elid, ReplaceObjectStorageRequestData body, @QueryMap(encoded=true) ReplaceObjectStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectStorage</code> method in a fluent style.
   */
  public static class ReplaceObjectStorageQueryParams extends HashMap<String, Object> {
    public ReplaceObjectStorageQueryParams sessionId(final String value) {
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
   * @return StorageContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageContractsResponseData storageContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>storageContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageContractsResponseData> storageContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>storageContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageContractsResponseData storageContracts(@Param("elid") String elid, StorageContractsRequestData body, @QueryMap(encoded=true) StorageContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>storageContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageContractsResponseData> storageContractsWithHttpInfo(@Param("elid") String elid, StorageContractsRequestData body, @QueryMap(encoded=true) StorageContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageContracts</code> method in a fluent style.
   */
  public static class StorageContractsQueryParams extends HashMap<String, Object> {
    public StorageContractsQueryParams sessionId(final String value) {
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
   * @return StorageDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageDeviceMasterResponseData storageDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>storageDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageDeviceMasterResponseData> storageDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>storageDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageDeviceMasterResponseData storageDeviceMaster(@Param("elid") String elid, StorageDeviceMasterRequestData body, @QueryMap(encoded=true) StorageDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>storageDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageDeviceMasterResponseData> storageDeviceMasterWithHttpInfo(@Param("elid") String elid, StorageDeviceMasterRequestData body, @QueryMap(encoded=true) StorageDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageDeviceMaster</code> method in a fluent style.
   */
  public static class StorageDeviceMasterQueryParams extends HashMap<String, Object> {
    public StorageDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageDevicesAllResponseData storageDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>storageDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageDevicesAllResponseData> storageDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>storageDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageDevicesAllResponseData storageDevicesAll(@Param("elid") String elid, StorageDevicesAllRequestData body, @QueryMap(encoded=true) StorageDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>storageDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageDevicesAllResponseData> storageDevicesAllWithHttpInfo(@Param("elid") String elid, StorageDevicesAllRequestData body, @QueryMap(encoded=true) StorageDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageDevicesAll</code> method in a fluent style.
   */
  public static class StorageDevicesAllQueryParams extends HashMap<String, Object> {
    public StorageDevicesAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Drive entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageDrivesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Drives?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageDrivesResponseData storageDrives(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDrivesRequestData body);

  /**
   * Get relations to Drive entities
   * Similar to <code>storageDrives</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Drives?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageDrivesResponseData> storageDrivesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDrivesRequestData body);


  /**
   * Get relations to Drive entities
   * 
   * Note, this is equivalent to the other <code>storageDrives</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageDrivesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageDrivesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Drives?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageDrivesResponseData storageDrives(@Param("elid") String elid, StorageDrivesRequestData body, @QueryMap(encoded=true) StorageDrivesQueryParams queryParams);

  /**
  * Get relations to Drive entities
  * 
  * Note, this is equivalent to the other <code>storageDrives</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageDrivesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Drives?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageDrivesResponseData> storageDrivesWithHttpInfo(@Param("elid") String elid, StorageDrivesRequestData body, @QueryMap(encoded=true) StorageDrivesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageDrives</code> method in a fluent style.
   */
  public static class StorageDrivesQueryParams extends HashMap<String, Object> {
    public StorageDrivesQueryParams sessionId(final String value) {
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
   * @return StorageDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageDuctDataResponse storageDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>storageDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageDuctDataResponse> storageDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>storageDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageDuctDataResponse storageDuctData(@Param("elid") String elid, StorageDuctDataRequest body, @QueryMap(encoded=true) StorageDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>storageDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageDuctDataResponse> storageDuctDataWithHttpInfo(@Param("elid") String elid, StorageDuctDataRequest body, @QueryMap(encoded=true) StorageDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageDuctData</code> method in a fluent style.
   */
  public static class StorageDuctDataQueryParams extends HashMap<String, Object> {
    public StorageDuctDataQueryParams sessionId(final String value) {
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
   * @return StorageDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageDuctsResponseData storageDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>storageDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageDuctsResponseData> storageDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>storageDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageDuctsResponseData storageDucts(@Param("elid") String elid, StorageDuctsRequestData body, @QueryMap(encoded=true) StorageDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>storageDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageDuctsResponseData> storageDuctsWithHttpInfo(@Param("elid") String elid, StorageDuctsRequestData body, @QueryMap(encoded=true) StorageDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageDucts</code> method in a fluent style.
   */
  public static class StorageDuctsQueryParams extends HashMap<String, Object> {
    public StorageDuctsQueryParams sessionId(final String value) {
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
   * @return StorageFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageFrameContractsResponseData storageFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageFrameContractsResponseData> storageFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageFrameContractsResponseData storageFrameContracts(@Param("elid") String elid, StorageFrameContractsRequestData body, @QueryMap(encoded=true) StorageFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageFrameContractsResponseData> storageFrameContractsWithHttpInfo(@Param("elid") String elid, StorageFrameContractsRequestData body, @QueryMap(encoded=true) StorageFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageFrameContracts</code> method in a fluent style.
   */
  public static class StorageFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Hard disk entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageHardDisksResponseData storageHardDisks(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageHardDisksRequestData body);

  /**
   * Get relations to Hard disk entities
   * Similar to <code>storageHardDisks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageHardDisksResponseData> storageHardDisksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageHardDisksRequestData body);


  /**
   * Get relations to Hard disk entities
   * 
   * Note, this is equivalent to the other <code>storageHardDisks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageHardDisksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageHardDisksResponseData storageHardDisks(@Param("elid") String elid, StorageHardDisksRequestData body, @QueryMap(encoded=true) StorageHardDisksQueryParams queryParams);

  /**
  * Get relations to Hard disk entities
  * 
  * Note, this is equivalent to the other <code>storageHardDisks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageHardDisksResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/HardDisks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageHardDisksResponseData> storageHardDisksWithHttpInfo(@Param("elid") String elid, StorageHardDisksRequestData body, @QueryMap(encoded=true) StorageHardDisksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageHardDisks</code> method in a fluent style.
   */
  public static class StorageHardDisksQueryParams extends HashMap<String, Object> {
    public StorageHardDisksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageInheritedGeoCoordinatesResponse storageInheritedGeoCoordinates(@Param("sessionId") String sessionId, StorageInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>storageInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageInheritedGeoCoordinatesResponse> storageInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, StorageInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>storageInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageInheritedGeoCoordinatesResponse storageInheritedGeoCoordinates(StorageInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>storageInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/storage/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageInheritedGeoCoordinatesResponse> storageInheritedGeoCoordinatesWithHttpInfo(StorageInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class StorageInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public StorageInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return StorageInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageInstalledSubCardsResponse storageInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>storageInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageInstalledSubCardsResponse> storageInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>storageInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageInstalledSubCardsResponse storageInstalledSubCards(@Param("elid") String elid, StorageInstalledSubCardsRequest body, @QueryMap(encoded=true) StorageInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>storageInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageInstalledSubCardsResponse> storageInstalledSubCardsWithHttpInfo(@Param("elid") String elid, StorageInstalledSubCardsRequest body, @QueryMap(encoded=true) StorageInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageInstalledSubCards</code> method in a fluent style.
   */
  public static class StorageInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public StorageInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return StorageInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageInstalledSubCardsRecursiveResponse storageInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>storageInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageInstalledSubCardsRecursiveResponse> storageInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>storageInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageInstalledSubCardsRecursiveResponse storageInstalledSubCardsRecursive(@Param("elid") String elid, StorageInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) StorageInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>storageInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageInstalledSubCardsRecursiveResponse> storageInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, StorageInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) StorageInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class StorageInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public StorageInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return StorageInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageInterfacesResponseData storageInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>storageInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageInterfacesResponseData> storageInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>storageInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageInterfacesResponseData storageInterfaces(@Param("elid") String elid, StorageInterfacesRequestData body, @QueryMap(encoded=true) StorageInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>storageInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageInterfacesResponseData> storageInterfacesWithHttpInfo(@Param("elid") String elid, StorageInterfacesRequestData body, @QueryMap(encoded=true) StorageInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageInterfaces</code> method in a fluent style.
   */
  public static class StorageInterfacesQueryParams extends HashMap<String, Object> {
    public StorageInterfacesQueryParams sessionId(final String value) {
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
   * @return StorageIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageIpAddressesResponse storageIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>storageIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageIpAddressesResponse> storageIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>storageIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageIpAddressesResponse storageIpAddresses(@Param("elid") String elid, StorageIpAddressesRequest body, @QueryMap(encoded=true) StorageIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>storageIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageIpAddressesResponse> storageIpAddressesWithHttpInfo(@Param("elid") String elid, StorageIpAddressesRequest body, @QueryMap(encoded=true) StorageIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageIpAddresses</code> method in a fluent style.
   */
  public static class StorageIpAddressesQueryParams extends HashMap<String, Object> {
    public StorageIpAddressesQueryParams sessionId(final String value) {
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
   * @return StorageIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageIpv4AddressesResponseData storageIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>storageIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageIpv4AddressesResponseData> storageIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>storageIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageIpv4AddressesResponseData storageIpv4Addresses(@Param("elid") String elid, StorageIpv4AddressesRequestData body, @QueryMap(encoded=true) StorageIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>storageIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageIpv4AddressesResponseData> storageIpv4AddressesWithHttpInfo(@Param("elid") String elid, StorageIpv4AddressesRequestData body, @QueryMap(encoded=true) StorageIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageIpv4Addresses</code> method in a fluent style.
   */
  public static class StorageIpv4AddressesQueryParams extends HashMap<String, Object> {
    public StorageIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return StorageIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageIpv4NetrangesResponseData storageIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>storageIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageIpv4NetrangesResponseData> storageIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>storageIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageIpv4NetrangesResponseData storageIpv4Netranges(@Param("elid") String elid, StorageIpv4NetrangesRequestData body, @QueryMap(encoded=true) StorageIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>storageIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageIpv4NetrangesResponseData> storageIpv4NetrangesWithHttpInfo(@Param("elid") String elid, StorageIpv4NetrangesRequestData body, @QueryMap(encoded=true) StorageIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageIpv4Netranges</code> method in a fluent style.
   */
  public static class StorageIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public StorageIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return StorageIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageIpv4NetworksResponseData storageIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>storageIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageIpv4NetworksResponseData> storageIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>storageIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageIpv4NetworksResponseData storageIpv4Networks(@Param("elid") String elid, StorageIpv4NetworksRequestData body, @QueryMap(encoded=true) StorageIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>storageIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageIpv4NetworksResponseData> storageIpv4NetworksWithHttpInfo(@Param("elid") String elid, StorageIpv4NetworksRequestData body, @QueryMap(encoded=true) StorageIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageIpv4Networks</code> method in a fluent style.
   */
  public static class StorageIpv4NetworksQueryParams extends HashMap<String, Object> {
    public StorageIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return StorageLocationResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageLocationResponse storageLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageLocationRequest body);

  /**
   * Location
   * Similar to <code>storageLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageLocationResponse> storageLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>storageLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageLocationResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageLocationResponse storageLocation(@Param("elid") String elid, StorageLocationRequest body, @QueryMap(encoded=true) StorageLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>storageLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageLocationResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageLocationResponse> storageLocationWithHttpInfo(@Param("elid") String elid, StorageLocationRequest body, @QueryMap(encoded=true) StorageLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageLocation</code> method in a fluent style.
   */
  public static class StorageLocationQueryParams extends HashMap<String, Object> {
    public StorageLocationQueryParams sessionId(final String value) {
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
   * @return StorageLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageLogicalPortsResponseData storageLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>storageLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageLogicalPortsResponseData> storageLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>storageLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageLogicalPortsResponseData storageLogicalPorts(@Param("elid") String elid, StorageLogicalPortsRequestData body, @QueryMap(encoded=true) StorageLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>storageLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageLogicalPortsResponseData> storageLogicalPortsWithHttpInfo(@Param("elid") String elid, StorageLogicalPortsRequestData body, @QueryMap(encoded=true) StorageLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageLogicalPorts</code> method in a fluent style.
   */
  public static class StorageLogicalPortsQueryParams extends HashMap<String, Object> {
    public StorageLogicalPortsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Main memory entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageMainMemoryResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MainMemory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageMainMemoryResponseData storageMainMemory(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMainMemoryRequestData body);

  /**
   * Get relations to Main memory entities
   * Similar to <code>storageMainMemory</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MainMemory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageMainMemoryResponseData> storageMainMemoryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMainMemoryRequestData body);


  /**
   * Get relations to Main memory entities
   * 
   * Note, this is equivalent to the other <code>storageMainMemory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageMainMemoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageMainMemoryResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MainMemory?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageMainMemoryResponseData storageMainMemory(@Param("elid") String elid, StorageMainMemoryRequestData body, @QueryMap(encoded=true) StorageMainMemoryQueryParams queryParams);

  /**
  * Get relations to Main memory entities
  * 
  * Note, this is equivalent to the other <code>storageMainMemory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageMainMemoryResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/MainMemory?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageMainMemoryResponseData> storageMainMemoryWithHttpInfo(@Param("elid") String elid, StorageMainMemoryRequestData body, @QueryMap(encoded=true) StorageMainMemoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageMainMemory</code> method in a fluent style.
   */
  public static class StorageMainMemoryQueryParams extends HashMap<String, Object> {
    public StorageMainMemoryQueryParams sessionId(final String value) {
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
   * @return StorageMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageMaintenanceContractsResponseData storageMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>storageMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageMaintenanceContractsResponseData> storageMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>storageMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageMaintenanceContractsResponseData storageMaintenanceContracts(@Param("elid") String elid, StorageMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>storageMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageMaintenanceContractsResponseData> storageMaintenanceContractsWithHttpInfo(@Param("elid") String elid, StorageMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageMaintenanceContracts</code> method in a fluent style.
   */
  public static class StorageMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public StorageMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance window entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageMaintenanceWindowsResponseData storageMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>storageMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageMaintenanceWindowsResponseData> storageMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>storageMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageMaintenanceWindowsResponseData storageMaintenanceWindows(@Param("elid") String elid, StorageMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>storageMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageMaintenanceWindowsResponseData> storageMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, StorageMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageMaintenanceWindows</code> method in a fluent style.
   */
  public static class StorageMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public StorageMaintenanceWindowsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Modem entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageModemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Modems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageModemsResponseData storageModems(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageModemsRequestData body);

  /**
   * Get relations to Modem entities
   * Similar to <code>storageModems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Modems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageModemsResponseData> storageModemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageModemsRequestData body);


  /**
   * Get relations to Modem entities
   * 
   * Note, this is equivalent to the other <code>storageModems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageModemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageModemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Modems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageModemsResponseData storageModems(@Param("elid") String elid, StorageModemsRequestData body, @QueryMap(encoded=true) StorageModemsQueryParams queryParams);

  /**
  * Get relations to Modem entities
  * 
  * Note, this is equivalent to the other <code>storageModems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageModemsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Modems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageModemsResponseData> storageModemsWithHttpInfo(@Param("elid") String elid, StorageModemsRequestData body, @QueryMap(encoded=true) StorageModemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageModems</code> method in a fluent style.
   */
  public static class StorageModemsQueryParams extends HashMap<String, Object> {
    public StorageModemsQueryParams sessionId(final String value) {
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
   * @return StorageMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageMultiDuctsResponseData storageMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>storageMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageMultiDuctsResponseData> storageMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>storageMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageMultiDuctsResponseData storageMultiDucts(@Param("elid") String elid, StorageMultiDuctsRequestData body, @QueryMap(encoded=true) StorageMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>storageMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageMultiDuctsResponseData> storageMultiDuctsWithHttpInfo(@Param("elid") String elid, StorageMultiDuctsRequestData body, @QueryMap(encoded=true) StorageMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageMultiDucts</code> method in a fluent style.
   */
  public static class StorageMultiDuctsQueryParams extends HashMap<String, Object> {
    public StorageMultiDuctsQueryParams sessionId(final String value) {
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
   * @return StorageNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageNetworksAndNetrangesResponse storageNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>storageNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageNetworksAndNetrangesResponse> storageNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>storageNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageNetworksAndNetrangesResponse storageNetworksAndNetranges(@Param("elid") String elid, StorageNetworksAndNetrangesRequest body, @QueryMap(encoded=true) StorageNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>storageNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageNetworksAndNetrangesResponse> storageNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, StorageNetworksAndNetrangesRequest body, @QueryMap(encoded=true) StorageNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageNetworksAndNetranges</code> method in a fluent style.
   */
  public static class StorageNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public StorageNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return StorageOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageOperatingSystemInstallationResponseData storageOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>storageOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageOperatingSystemInstallationResponseData> storageOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>storageOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageOperatingSystemInstallationResponseData storageOperatingSystemInstallation(@Param("elid") String elid, StorageOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) StorageOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>storageOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageOperatingSystemInstallationResponseData> storageOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, StorageOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) StorageOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class StorageOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public StorageOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return StorageOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageOrganizationsResponseData storageOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageOrganizationsResponseData> storageOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageOrganizationsResponseData storageOrganizations(@Param("elid") String elid, StorageOrganizationsRequestData body, @QueryMap(encoded=true) StorageOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageOrganizationsResponseData> storageOrganizationsWithHttpInfo(@Param("elid") String elid, StorageOrganizationsRequestData body, @QueryMap(encoded=true) StorageOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageOrganizations</code> method in a fluent style.
   */
  public static class StorageOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageOrganizationsQueryParams sessionId(final String value) {
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
   * @return StoragePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePersonGroupsResponseData storagePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storagePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePersonGroupsResponseData> storagePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storagePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePersonGroupsResponseData storagePersonGroups(@Param("elid") String elid, StoragePersonGroupsRequestData body, @QueryMap(encoded=true) StoragePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storagePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePersonGroupsResponseData> storagePersonGroupsWithHttpInfo(@Param("elid") String elid, StoragePersonGroupsRequestData body, @QueryMap(encoded=true) StoragePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePersonGroups</code> method in a fluent style.
   */
  public static class StoragePersonGroupsQueryParams extends HashMap<String, Object> {
    public StoragePersonGroupsQueryParams sessionId(final String value) {
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
   * @return StoragePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePersonsResponseData storagePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storagePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePersonsResponseData> storagePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storagePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePersonsResponseData storagePersons(@Param("elid") String elid, StoragePersonsRequestData body, @QueryMap(encoded=true) StoragePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storagePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePersonsResponseData> storagePersonsWithHttpInfo(@Param("elid") String elid, StoragePersonsRequestData body, @QueryMap(encoded=true) StoragePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePersons</code> method in a fluent style.
   */
  public static class StoragePersonsQueryParams extends HashMap<String, Object> {
    public StoragePersonsQueryParams sessionId(final String value) {
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
   * @return StoragePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePhysicalPortsDataResponseData storagePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>storagePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePhysicalPortsDataResponseData> storagePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>storagePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePhysicalPortsDataResponseData storagePhysicalPortsData(@Param("elid") String elid, StoragePhysicalPortsDataRequestData body, @QueryMap(encoded=true) StoragePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>storagePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePhysicalPortsDataResponseData> storagePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, StoragePhysicalPortsDataRequestData body, @QueryMap(encoded=true) StoragePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePhysicalPortsData</code> method in a fluent style.
   */
  public static class StoragePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public StoragePhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return StoragePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePhysicalPortsDataExtendedResponse storagePhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>storagePhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePhysicalPortsDataExtendedResponse> storagePhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storagePhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePhysicalPortsDataExtendedResponse storagePhysicalPortsDataExtended(@Param("elid") String elid, StoragePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) StoragePhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storagePhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePhysicalPortsDataExtendedResponse> storagePhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, StoragePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) StoragePhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class StoragePhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public StoragePhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return StoragePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePhysicalPortsPowerResponseData storagePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>storagePhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePhysicalPortsPowerResponseData> storagePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>storagePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePhysicalPortsPowerResponseData storagePhysicalPortsPower(@Param("elid") String elid, StoragePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) StoragePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>storagePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePhysicalPortsPowerResponseData> storagePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, StoragePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) StoragePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePhysicalPortsPower</code> method in a fluent style.
   */
  public static class StoragePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public StoragePhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return StoragePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePhysicalPortsPowerExtendedResponse storagePhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>storagePhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePhysicalPortsPowerExtendedResponse> storagePhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storagePhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePhysicalPortsPowerExtendedResponse storagePhysicalPortsPowerExtended(@Param("elid") String elid, StoragePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) StoragePhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storagePhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePhysicalPortsPowerExtendedResponse> storagePhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, StoragePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) StoragePhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class StoragePhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public StoragePhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Plugin card entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StoragePluginCardsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PluginCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StoragePluginCardsResponseData storagePluginCards(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePluginCardsRequestData body);

  /**
   * Get relations to Plugin card entities
   * Similar to <code>storagePluginCards</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PluginCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StoragePluginCardsResponseData> storagePluginCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StoragePluginCardsRequestData body);


  /**
   * Get relations to Plugin card entities
   * 
   * Note, this is equivalent to the other <code>storagePluginCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StoragePluginCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StoragePluginCardsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/PluginCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StoragePluginCardsResponseData storagePluginCards(@Param("elid") String elid, StoragePluginCardsRequestData body, @QueryMap(encoded=true) StoragePluginCardsQueryParams queryParams);

  /**
  * Get relations to Plugin card entities
  * 
  * Note, this is equivalent to the other <code>storagePluginCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StoragePluginCardsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/PluginCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StoragePluginCardsResponseData> storagePluginCardsWithHttpInfo(@Param("elid") String elid, StoragePluginCardsRequestData body, @QueryMap(encoded=true) StoragePluginCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storagePluginCards</code> method in a fluent style.
   */
  public static class StoragePluginCardsQueryParams extends HashMap<String, Object> {
    public StoragePluginCardsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Processor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageProcessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Processors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageProcessorsResponseData storageProcessors(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageProcessorsRequestData body);

  /**
   * Get relations to Processor entities
   * Similar to <code>storageProcessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Processors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageProcessorsResponseData> storageProcessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageProcessorsRequestData body);


  /**
   * Get relations to Processor entities
   * 
   * Note, this is equivalent to the other <code>storageProcessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageProcessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageProcessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Processors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageProcessorsResponseData storageProcessors(@Param("elid") String elid, StorageProcessorsRequestData body, @QueryMap(encoded=true) StorageProcessorsQueryParams queryParams);

  /**
  * Get relations to Processor entities
  * 
  * Note, this is equivalent to the other <code>storageProcessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageProcessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Processors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageProcessorsResponseData> storageProcessorsWithHttpInfo(@Param("elid") String elid, StorageProcessorsRequestData body, @QueryMap(encoded=true) StorageProcessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageProcessors</code> method in a fluent style.
   */
  public static class StorageProcessorsQueryParams extends HashMap<String, Object> {
    public StorageProcessorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storage/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageQueryResponse storageQuery(@Param("sessionId") String sessionId, StorageQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageQueryResponse> storageQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>storageQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storage/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageQueryResponse storageQuery(StorageQueryRequest body, @QueryMap(encoded=true) StorageQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>storageQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storage/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageQueryResponse> storageQueryWithHttpInfo(StorageQueryRequest body, @QueryMap(encoded=true) StorageQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageQuery</code> method in a fluent style.
   */
  public static class StorageQueryQueryParams extends HashMap<String, Object> {
    public StorageQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageQueryExtendedResponse storageQueryExtended(@Param("sessionId") String sessionId, StorageQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>storageQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageQueryExtendedResponse> storageQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, StorageQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>storageQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageQueryExtendedResponse storageQueryExtended(StorageQueryExtendedRequest body, @QueryMap(encoded=true) StorageQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>storageQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/storage/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageQueryExtendedResponse> storageQueryExtendedWithHttpInfo(StorageQueryExtendedRequest body, @QueryMap(encoded=true) StorageQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageQueryExtended</code> method in a fluent style.
   */
  public static class StorageQueryExtendedQueryParams extends HashMap<String, Object> {
    public StorageQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageQueryExtendedGeoCoordinatesResponse storageQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, StorageQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>storageQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageQueryExtendedGeoCoordinatesResponse> storageQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, StorageQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>storageQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageQueryExtendedGeoCoordinatesResponse storageQueryExtendedGeoCoordinates(StorageQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>storageQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/storage/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageQueryExtendedGeoCoordinatesResponse> storageQueryExtendedGeoCoordinatesWithHttpInfo(StorageQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class StorageQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public StorageQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageQueryExtendedScrollFirstResponse storageQueryExtendedScrollFirst(@Param("sessionId") String sessionId, StorageQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>storageQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageQueryExtendedScrollFirstResponse> storageQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, StorageQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>storageQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageQueryExtendedScrollFirstResponse storageQueryExtendedScrollFirst(StorageQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) StorageQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>storageQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageQueryExtendedScrollFirstResponse> storageQueryExtendedScrollFirstWithHttpInfo(StorageQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) StorageQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class StorageQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public StorageQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageQueryExtendedScrollMoreResponse storageQueryExtendedScrollMore(@Param("sessionId") String sessionId, StorageQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>storageQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageQueryExtendedScrollMoreResponse> storageQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, StorageQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>storageQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageQueryExtendedScrollMoreResponse storageQueryExtendedScrollMore(StorageQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) StorageQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>storageQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/storage/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageQueryExtendedScrollMoreResponse> storageQueryExtendedScrollMoreWithHttpInfo(StorageQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) StorageQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class StorageQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public StorageQueryExtendedScrollMoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to RAID controller entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageRaidControllersResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/RaidControllers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageRaidControllersResponseData storageRaidControllers(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageRaidControllersRequestData body);

  /**
   * Get relations to RAID controller entities
   * Similar to <code>storageRaidControllers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/RaidControllers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageRaidControllersResponseData> storageRaidControllersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageRaidControllersRequestData body);


  /**
   * Get relations to RAID controller entities
   * 
   * Note, this is equivalent to the other <code>storageRaidControllers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageRaidControllersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageRaidControllersResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/RaidControllers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageRaidControllersResponseData storageRaidControllers(@Param("elid") String elid, StorageRaidControllersRequestData body, @QueryMap(encoded=true) StorageRaidControllersQueryParams queryParams);

  /**
  * Get relations to RAID controller entities
  * 
  * Note, this is equivalent to the other <code>storageRaidControllers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageRaidControllersResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/RaidControllers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageRaidControllersResponseData> storageRaidControllersWithHttpInfo(@Param("elid") String elid, StorageRaidControllersRequestData body, @QueryMap(encoded=true) StorageRaidControllersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageRaidControllers</code> method in a fluent style.
   */
  public static class StorageRaidControllersQueryParams extends HashMap<String, Object> {
    public StorageRaidControllersQueryParams sessionId(final String value) {
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
   * @return StorageServicesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageServicesResponse storageServices(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>storageServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageServicesResponse> storageServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>storageServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageServicesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageServicesResponse storageServices(@Param("elid") String elid, StorageServicesRequest body, @QueryMap(encoded=true) StorageServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>storageServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageServicesResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageServicesResponse> storageServicesWithHttpInfo(@Param("elid") String elid, StorageServicesRequest body, @QueryMap(encoded=true) StorageServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageServices</code> method in a fluent style.
   */
  public static class StorageServicesQueryParams extends HashMap<String, Object> {
    public StorageServicesQueryParams sessionId(final String value) {
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
   * @return StorageSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSitesResponseData storageSites(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>storageSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSitesResponseData> storageSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>storageSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSitesResponseData storageSites(@Param("elid") String elid, StorageSitesRequestData body, @QueryMap(encoded=true) StorageSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>storageSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSitesResponseData> storageSitesWithHttpInfo(@Param("elid") String elid, StorageSitesRequestData body, @QueryMap(encoded=true) StorageSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSites</code> method in a fluent style.
   */
  public static class StorageSitesQueryParams extends HashMap<String, Object> {
    public StorageSitesQueryParams sessionId(final String value) {
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
   * @return StorageSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSlotResponseData storageSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>storageSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSlotResponseData> storageSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>storageSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSlotResponseData storageSlot(@Param("elid") String elid, StorageSlotRequestData body, @QueryMap(encoded=true) StorageSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>storageSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSlotResponseData> storageSlotWithHttpInfo(@Param("elid") String elid, StorageSlotRequestData body, @QueryMap(encoded=true) StorageSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSlot</code> method in a fluent style.
   */
  public static class StorageSlotQueryParams extends HashMap<String, Object> {
    public StorageSlotQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit Volume entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageStorageUnitVolumesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/StorageUnitVolumes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageStorageUnitVolumesResponseData storageStorageUnitVolumes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageStorageUnitVolumesRequestData body);

  /**
   * Get relations to Storage unit Volume entities
   * Similar to <code>storageStorageUnitVolumes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/StorageUnitVolumes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageStorageUnitVolumesResponseData> storageStorageUnitVolumesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageStorageUnitVolumesRequestData body);


  /**
   * Get relations to Storage unit Volume entities
   * 
   * Note, this is equivalent to the other <code>storageStorageUnitVolumes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageStorageUnitVolumesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageStorageUnitVolumesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/StorageUnitVolumes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageStorageUnitVolumesResponseData storageStorageUnitVolumes(@Param("elid") String elid, StorageStorageUnitVolumesRequestData body, @QueryMap(encoded=true) StorageStorageUnitVolumesQueryParams queryParams);

  /**
  * Get relations to Storage unit Volume entities
  * 
  * Note, this is equivalent to the other <code>storageStorageUnitVolumes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageStorageUnitVolumesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/StorageUnitVolumes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageStorageUnitVolumesResponseData> storageStorageUnitVolumesWithHttpInfo(@Param("elid") String elid, StorageStorageUnitVolumesRequestData body, @QueryMap(encoded=true) StorageStorageUnitVolumesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageStorageUnitVolumes</code> method in a fluent style.
   */
  public static class StorageStorageUnitVolumesQueryParams extends HashMap<String, Object> {
    public StorageStorageUnitVolumesQueryParams sessionId(final String value) {
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
   * @return StorageSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSwitchCabinetResponseData storageSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>storageSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSwitchCabinetResponseData> storageSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>storageSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSwitchCabinetResponseData storageSwitchCabinet(@Param("elid") String elid, StorageSwitchCabinetRequestData body, @QueryMap(encoded=true) StorageSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>storageSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSwitchCabinetResponseData> storageSwitchCabinetWithHttpInfo(@Param("elid") String elid, StorageSwitchCabinetRequestData body, @QueryMap(encoded=true) StorageSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSwitchCabinet</code> method in a fluent style.
   */
  public static class StorageSwitchCabinetQueryParams extends HashMap<String, Object> {
    public StorageSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return StorageSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemAttributesResponse storageSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemAttributesResponse> storageSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>storageSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemAttributesResponse storageSystemAttributes(@Param("elid") String elid, StorageSystemAttributesRequest body, @QueryMap(encoded=true) StorageSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>storageSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemAttributesResponse> storageSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageSystemAttributesRequest body, @QueryMap(encoded=true) StorageSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemAttributes</code> method in a fluent style.
   */
  public static class StorageSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual NAS server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageVirtualNasServersResponseData storageVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>storageVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageVirtualNasServersResponseData> storageVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>storageVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageVirtualNasServersResponseData storageVirtualNasServers(@Param("elid") String elid, StorageVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>storageVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageVirtualNasServersResponseData> storageVirtualNasServersWithHttpInfo(@Param("elid") String elid, StorageVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageVirtualNasServers</code> method in a fluent style.
   */
  public static class StorageVirtualNasServersQueryParams extends HashMap<String, Object> {
    public StorageVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return StorageVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageVirtualSwitchesResponseData storageVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>storageVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageVirtualSwitchesResponseData> storageVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>storageVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageVirtualSwitchesResponseData storageVirtualSwitches(@Param("elid") String elid, StorageVirtualSwitchesRequestData body, @QueryMap(encoded=true) StorageVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>storageVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageVirtualSwitchesResponseData> storageVirtualSwitchesWithHttpInfo(@Param("elid") String elid, StorageVirtualSwitchesRequestData body, @QueryMap(encoded=true) StorageVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageVirtualSwitches</code> method in a fluent style.
   */
  public static class StorageVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public StorageVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return StorageVlansResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageVlansResponse storageVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVlansRequest body);

  /**
   * VLANs
   * Similar to <code>storageVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageVlansResponse> storageVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>storageVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageVlansResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageVlansResponse storageVlans(@Param("elid") String elid, StorageVlansRequest body, @QueryMap(encoded=true) StorageVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>storageVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageVlansResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageVlansResponse> storageVlansWithHttpInfo(@Param("elid") String elid, StorageVlansRequest body, @QueryMap(encoded=true) StorageVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageVlans</code> method in a fluent style.
   */
  public static class StorageVlansQueryParams extends HashMap<String, Object> {
    public StorageVlansQueryParams sessionId(final String value) {
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
   * @return StorageVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageVlansAtSlotResponse storageVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>storageVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageVlansAtSlotResponse> storageVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>storageVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageVlansAtSlotResponse storageVlansAtSlot(@Param("elid") String elid, StorageVlansAtSlotRequest body, @QueryMap(encoded=true) StorageVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>storageVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageVlansAtSlotResponse> storageVlansAtSlotWithHttpInfo(@Param("elid") String elid, StorageVlansAtSlotRequest body, @QueryMap(encoded=true) StorageVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageVlansAtSlot</code> method in a fluent style.
   */
  public static class StorageVlansAtSlotQueryParams extends HashMap<String, Object> {
    public StorageVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return StorageWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageWarehouseResponseData storageWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>storageWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageWarehouseResponseData> storageWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>storageWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageWarehouseResponseData storageWarehouse(@Param("elid") String elid, StorageWarehouseRequestData body, @QueryMap(encoded=true) StorageWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>storageWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageWarehouseResponseData> storageWarehouseWithHttpInfo(@Param("elid") String elid, StorageWarehouseRequestData body, @QueryMap(encoded=true) StorageWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageWarehouse</code> method in a fluent style.
   */
  public static class StorageWarehouseQueryParams extends HashMap<String, Object> {
    public StorageWarehouseQueryParams sessionId(final String value) {
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
   * @return StorageZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageZoneResponseData storageZone(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>storageZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageZoneResponseData> storageZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>storageZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageZoneResponseData storageZone(@Param("elid") String elid, StorageZoneRequestData body, @QueryMap(encoded=true) StorageZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>storageZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageZoneResponseData> storageZoneWithHttpInfo(@Param("elid") String elid, StorageZoneRequestData body, @QueryMap(encoded=true) StorageZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageZone</code> method in a fluent style.
   */
  public static class StorageZoneQueryParams extends HashMap<String, Object> {
    public StorageZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateStorageResponse updateStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageRequestData body);

  /**
   * Modify
   * Similar to <code>updateStorage</code> but it also returns the http response headers .
   * Modify storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateStorageResponse> updateStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageRequestData body);


  /**
   * Modify
   * Modify storage
   * Note, this is equivalent to the other <code>updateStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateStorageResponse updateStorage(@Param("elid") String elid, UpdateStorageRequestData body, @QueryMap(encoded=true) UpdateStorageQueryParams queryParams);

  /**
  * Modify
  * Modify storage
  * Note, this is equivalent to the other <code>updateStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateStorageResponse> updateStorageWithHttpInfo(@Param("elid") String elid, UpdateStorageRequestData body, @QueryMap(encoded=true) UpdateStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateStorage</code> method in a fluent style.
   */
  public static class UpdateStorageQueryParams extends HashMap<String, Object> {
    public UpdateStorageQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageResponse updateSystemAttributesStorage(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorage</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageResponse> updateSystemAttributesStorageWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageResponse
   */
  @RequestLine("POST /api/rest/entity/storage/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageResponse updateSystemAttributesStorage(@Param("elid") String elid, UpdateSystemAttributesStorageRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageResponse
      */
      @RequestLine("POST /api/rest/entity/storage/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageResponse> updateSystemAttributesStorageWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorage</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
