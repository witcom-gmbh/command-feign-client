package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.DeleteStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.DeleteStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseDuctDataRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseDuctDataResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseDuctsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseDuctsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseLocationRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseLocationResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBasePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBasePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBasePersonsRequestData;
import com.fntsoftware.businessgateway.entities.StorageBasePersonsResponseData;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.StorageBasePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseServicesRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseServicesResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseSitesRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseSitesResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseSlotRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseSlotResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseVlansRequest;
import com.fntsoftware.businessgateway.entities.StorageBaseVlansResponse;
import com.fntsoftware.businessgateway.entities.StorageBaseWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.StorageBaseZoneRequestData;
import com.fntsoftware.businessgateway.entities.StorageBaseZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateStorageBaseResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageBaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageBaseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface StorageBaseApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeStorageBaseResponse changeTypeStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeStorageBaseRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeStorageBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeStorageBaseResponse> changeTypeStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeStorageBaseRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeStorageBaseResponse changeTypeStorageBase(@Param("elid") String elid, ChangeTypeStorageBaseRequestData body, @QueryMap(encoded=true) ChangeTypeStorageBaseQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeStorageBaseResponse> changeTypeStorageBaseWithHttpInfo(@Param("elid") String elid, ChangeTypeStorageBaseRequestData body, @QueryMap(encoded=true) ChangeTypeStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeStorageBase</code> method in a fluent style.
   */
  public static class ChangeTypeStorageBaseQueryParams extends HashMap<String, Object> {
    public ChangeTypeStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteStorageBaseResponse deleteStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageBaseRequestData body);

  /**
   * Delete
   * Similar to <code>deleteStorageBase</code> but it also returns the http response headers .
   * Delete Storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteStorageBaseResponse> deleteStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageBaseRequestData body);


  /**
   * Delete
   * Delete Storage
   * Note, this is equivalent to the other <code>deleteStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteStorageBaseResponse deleteStorageBase(@Param("elid") String elid, DeleteStorageBaseRequestData body, @QueryMap(encoded=true) DeleteStorageBaseQueryParams queryParams);

  /**
  * Delete
  * Delete Storage
  * Note, this is equivalent to the other <code>deleteStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteStorageBaseResponse> deleteStorageBaseWithHttpInfo(@Param("elid") String elid, DeleteStorageBaseRequestData body, @QueryMap(encoded=true) DeleteStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageBase</code> method in a fluent style.
   */
  public static class DeleteStorageBaseQueryParams extends HashMap<String, Object> {
    public DeleteStorageBaseQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetStorageBaseResponse moveToCabinetStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetStorageBaseRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetStorageBase</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetStorageBaseResponse> moveToCabinetStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetStorageBaseRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetStorageBaseResponse moveToCabinetStorageBase(@Param("elid") String elid, MoveToCabinetStorageBaseRequestData body, @QueryMap(encoded=true) MoveToCabinetStorageBaseQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetStorageBaseResponse> moveToCabinetStorageBaseWithHttpInfo(@Param("elid") String elid, MoveToCabinetStorageBaseRequestData body, @QueryMap(encoded=true) MoveToCabinetStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetStorageBase</code> method in a fluent style.
   */
  public static class MoveToCabinetStorageBaseQueryParams extends HashMap<String, Object> {
    public MoveToCabinetStorageBaseQueryParams sessionId(final String value) {
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
   * @return MoveToSlotStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotStorageBaseResponse moveToSlotStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotStorageBaseRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotStorageBase</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotStorageBaseResponse> moveToSlotStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotStorageBaseRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotStorageBaseResponse moveToSlotStorageBase(@Param("elid") String elid, MoveToSlotStorageBaseRequestData body, @QueryMap(encoded=true) MoveToSlotStorageBaseQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotStorageBaseResponse> moveToSlotStorageBaseWithHttpInfo(@Param("elid") String elid, MoveToSlotStorageBaseRequestData body, @QueryMap(encoded=true) MoveToSlotStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotStorageBase</code> method in a fluent style.
   */
  public static class MoveToSlotStorageBaseQueryParams extends HashMap<String, Object> {
    public MoveToSlotStorageBaseQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseStorageBaseResponse moveToWarehouseStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseStorageBaseRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseStorageBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseStorageBaseResponse> moveToWarehouseStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseStorageBaseRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseStorageBaseResponse moveToWarehouseStorageBase(@Param("elid") String elid, MoveToWarehouseStorageBaseRequestData body, @QueryMap(encoded=true) MoveToWarehouseStorageBaseQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseStorageBaseResponse> moveToWarehouseStorageBaseWithHttpInfo(@Param("elid") String elid, MoveToWarehouseStorageBaseRequestData body, @QueryMap(encoded=true) MoveToWarehouseStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseStorageBase</code> method in a fluent style.
   */
  public static class MoveToWarehouseStorageBaseQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseStorageBaseQueryParams sessionId(final String value) {
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
   * @return MoveToZoneStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneStorageBaseResponse moveToZoneStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneStorageBaseRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneStorageBase</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneStorageBaseResponse> moveToZoneStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneStorageBaseRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneStorageBaseResponse moveToZoneStorageBase(@Param("elid") String elid, MoveToZoneStorageBaseRequestData body, @QueryMap(encoded=true) MoveToZoneStorageBaseQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneStorageBaseResponse> moveToZoneStorageBaseWithHttpInfo(@Param("elid") String elid, MoveToZoneStorageBaseRequestData body, @QueryMap(encoded=true) MoveToZoneStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneStorageBase</code> method in a fluent style.
   */
  public static class MoveToZoneStorageBaseQueryParams extends HashMap<String, Object> {
    public MoveToZoneStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetStorageBaseResponse placeInCabinetStorageBase(@Param("sessionId") String sessionId, PlaceInCabinetStorageBaseRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetStorageBase</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetStorageBaseResponse> placeInCabinetStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetStorageBaseRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetStorageBaseResponse placeInCabinetStorageBase(PlaceInCabinetStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInCabinetStorageBaseQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetStorageBaseResponse> placeInCabinetStorageBaseWithHttpInfo(PlaceInCabinetStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInCabinetStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetStorageBase</code> method in a fluent style.
   */
  public static class PlaceInCabinetStorageBaseQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotStorageBaseResponse placeInSlotStorageBase(@Param("sessionId") String sessionId, PlaceInSlotStorageBaseRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotStorageBase</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotStorageBaseResponse> placeInSlotStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotStorageBaseRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotStorageBaseResponse placeInSlotStorageBase(PlaceInSlotStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInSlotStorageBaseQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotStorageBaseResponse> placeInSlotStorageBaseWithHttpInfo(PlaceInSlotStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInSlotStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotStorageBase</code> method in a fluent style.
   */
  public static class PlaceInSlotStorageBaseQueryParams extends HashMap<String, Object> {
    public PlaceInSlotStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseStorageBaseResponse placeInWarehouseStorageBase(@Param("sessionId") String sessionId, PlaceInWarehouseStorageBaseRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseStorageBase</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseStorageBaseResponse> placeInWarehouseStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseStorageBaseRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseStorageBaseResponse placeInWarehouseStorageBase(PlaceInWarehouseStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInWarehouseStorageBaseQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseStorageBaseResponse> placeInWarehouseStorageBaseWithHttpInfo(PlaceInWarehouseStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInWarehouseStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseStorageBase</code> method in a fluent style.
   */
  public static class PlaceInWarehouseStorageBaseQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneStorageBaseResponse placeInZoneStorageBase(@Param("sessionId") String sessionId, PlaceInZoneStorageBaseRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneStorageBase</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneStorageBaseResponse> placeInZoneStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneStorageBaseRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneStorageBaseResponse placeInZoneStorageBase(PlaceInZoneStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInZoneStorageBaseQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneStorageBaseResponse> placeInZoneStorageBaseWithHttpInfo(PlaceInZoneStorageBaseRequestData body, @QueryMap(encoded=true) PlaceInZoneStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneStorageBase</code> method in a fluent style.
   */
  public static class PlaceInZoneStorageBaseQueryParams extends HashMap<String, Object> {
    public PlaceInZoneStorageBaseQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectStorageBaseResponse replaceObjectStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectStorageBaseRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectStorageBase</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectStorageBaseResponse> replaceObjectStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectStorageBaseRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectStorageBaseResponse replaceObjectStorageBase(@Param("elid") String elid, ReplaceObjectStorageBaseRequestData body, @QueryMap(encoded=true) ReplaceObjectStorageBaseQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectStorageBaseResponse> replaceObjectStorageBaseWithHttpInfo(@Param("elid") String elid, ReplaceObjectStorageBaseRequestData body, @QueryMap(encoded=true) ReplaceObjectStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectStorageBase</code> method in a fluent style.
   */
  public static class ReplaceObjectStorageBaseQueryParams extends HashMap<String, Object> {
    public ReplaceObjectStorageBaseQueryParams sessionId(final String value) {
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
   * @return StorageBaseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseContractsResponseData storageBaseContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>storageBaseContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseContractsResponseData> storageBaseContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>storageBaseContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseContractsResponseData storageBaseContracts(@Param("elid") String elid, StorageBaseContractsRequestData body, @QueryMap(encoded=true) StorageBaseContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>storageBaseContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseContractsResponseData> storageBaseContractsWithHttpInfo(@Param("elid") String elid, StorageBaseContractsRequestData body, @QueryMap(encoded=true) StorageBaseContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseContracts</code> method in a fluent style.
   */
  public static class StorageBaseContractsQueryParams extends HashMap<String, Object> {
    public StorageBaseContractsQueryParams sessionId(final String value) {
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
   * @return StorageBaseDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseDeviceMasterResponseData storageBaseDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>storageBaseDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseDeviceMasterResponseData> storageBaseDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>storageBaseDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseDeviceMasterResponseData storageBaseDeviceMaster(@Param("elid") String elid, StorageBaseDeviceMasterRequestData body, @QueryMap(encoded=true) StorageBaseDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>storageBaseDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseDeviceMasterResponseData> storageBaseDeviceMasterWithHttpInfo(@Param("elid") String elid, StorageBaseDeviceMasterRequestData body, @QueryMap(encoded=true) StorageBaseDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseDeviceMaster</code> method in a fluent style.
   */
  public static class StorageBaseDeviceMasterQueryParams extends HashMap<String, Object> {
    public StorageBaseDeviceMasterQueryParams sessionId(final String value) {
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
   * @return StorageBaseDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseDuctDataResponse storageBaseDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>storageBaseDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseDuctDataResponse> storageBaseDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>storageBaseDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseDuctDataResponse storageBaseDuctData(@Param("elid") String elid, StorageBaseDuctDataRequest body, @QueryMap(encoded=true) StorageBaseDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>storageBaseDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseDuctDataResponse> storageBaseDuctDataWithHttpInfo(@Param("elid") String elid, StorageBaseDuctDataRequest body, @QueryMap(encoded=true) StorageBaseDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseDuctData</code> method in a fluent style.
   */
  public static class StorageBaseDuctDataQueryParams extends HashMap<String, Object> {
    public StorageBaseDuctDataQueryParams sessionId(final String value) {
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
   * @return StorageBaseDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseDuctsResponseData storageBaseDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>storageBaseDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseDuctsResponseData> storageBaseDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>storageBaseDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseDuctsResponseData storageBaseDucts(@Param("elid") String elid, StorageBaseDuctsRequestData body, @QueryMap(encoded=true) StorageBaseDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>storageBaseDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseDuctsResponseData> storageBaseDuctsWithHttpInfo(@Param("elid") String elid, StorageBaseDuctsRequestData body, @QueryMap(encoded=true) StorageBaseDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseDucts</code> method in a fluent style.
   */
  public static class StorageBaseDuctsQueryParams extends HashMap<String, Object> {
    public StorageBaseDuctsQueryParams sessionId(final String value) {
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
   * @return StorageBaseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseFrameContractsResponseData storageBaseFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageBaseFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseFrameContractsResponseData> storageBaseFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageBaseFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseFrameContractsResponseData storageBaseFrameContracts(@Param("elid") String elid, StorageBaseFrameContractsRequestData body, @QueryMap(encoded=true) StorageBaseFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageBaseFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseFrameContractsResponseData> storageBaseFrameContractsWithHttpInfo(@Param("elid") String elid, StorageBaseFrameContractsRequestData body, @QueryMap(encoded=true) StorageBaseFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseFrameContracts</code> method in a fluent style.
   */
  public static class StorageBaseFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageBaseFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageBaseInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseInheritedGeoCoordinatesResponse storageBaseInheritedGeoCoordinates(@Param("sessionId") String sessionId, StorageBaseInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>storageBaseInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseInheritedGeoCoordinatesResponse> storageBaseInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, StorageBaseInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>storageBaseInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseInheritedGeoCoordinatesResponse storageBaseInheritedGeoCoordinates(StorageBaseInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageBaseInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>storageBaseInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseInheritedGeoCoordinatesResponse> storageBaseInheritedGeoCoordinatesWithHttpInfo(StorageBaseInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageBaseInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class StorageBaseInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public StorageBaseInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return StorageBaseInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseInstalledSubCardsResponse storageBaseInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>storageBaseInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseInstalledSubCardsResponse> storageBaseInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>storageBaseInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseInstalledSubCardsResponse storageBaseInstalledSubCards(@Param("elid") String elid, StorageBaseInstalledSubCardsRequest body, @QueryMap(encoded=true) StorageBaseInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>storageBaseInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseInstalledSubCardsResponse> storageBaseInstalledSubCardsWithHttpInfo(@Param("elid") String elid, StorageBaseInstalledSubCardsRequest body, @QueryMap(encoded=true) StorageBaseInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseInstalledSubCards</code> method in a fluent style.
   */
  public static class StorageBaseInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public StorageBaseInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return StorageBaseInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseInstalledSubCardsRecursiveResponse storageBaseInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>storageBaseInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseInstalledSubCardsRecursiveResponse> storageBaseInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>storageBaseInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseInstalledSubCardsRecursiveResponse storageBaseInstalledSubCardsRecursive(@Param("elid") String elid, StorageBaseInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) StorageBaseInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>storageBaseInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseInstalledSubCardsRecursiveResponse> storageBaseInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, StorageBaseInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) StorageBaseInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class StorageBaseInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public StorageBaseInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return StorageBaseInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseInterfacesResponseData storageBaseInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>storageBaseInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseInterfacesResponseData> storageBaseInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>storageBaseInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseInterfacesResponseData storageBaseInterfaces(@Param("elid") String elid, StorageBaseInterfacesRequestData body, @QueryMap(encoded=true) StorageBaseInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>storageBaseInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseInterfacesResponseData> storageBaseInterfacesWithHttpInfo(@Param("elid") String elid, StorageBaseInterfacesRequestData body, @QueryMap(encoded=true) StorageBaseInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseInterfaces</code> method in a fluent style.
   */
  public static class StorageBaseInterfacesQueryParams extends HashMap<String, Object> {
    public StorageBaseInterfacesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageBaseIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseIpAddressesResponse storageBaseIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>storageBaseIpAddresses</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseIpAddressesResponse> storageBaseIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpAddressesRequest body);


  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBaseIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseIpAddressesResponse storageBaseIpAddresses(@Param("elid") String elid, StorageBaseIpAddressesRequest body, @QueryMap(encoded=true) StorageBaseIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBaseIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseIpAddressesResponse> storageBaseIpAddressesWithHttpInfo(@Param("elid") String elid, StorageBaseIpAddressesRequest body, @QueryMap(encoded=true) StorageBaseIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseIpAddresses</code> method in a fluent style.
   */
  public static class StorageBaseIpAddressesQueryParams extends HashMap<String, Object> {
    public StorageBaseIpAddressesQueryParams sessionId(final String value) {
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
   * @return StorageBaseIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseIpv4AddressesResponseData storageBaseIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>storageBaseIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseIpv4AddressesResponseData> storageBaseIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>storageBaseIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseIpv4AddressesResponseData storageBaseIpv4Addresses(@Param("elid") String elid, StorageBaseIpv4AddressesRequestData body, @QueryMap(encoded=true) StorageBaseIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>storageBaseIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseIpv4AddressesResponseData> storageBaseIpv4AddressesWithHttpInfo(@Param("elid") String elid, StorageBaseIpv4AddressesRequestData body, @QueryMap(encoded=true) StorageBaseIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseIpv4Addresses</code> method in a fluent style.
   */
  public static class StorageBaseIpv4AddressesQueryParams extends HashMap<String, Object> {
    public StorageBaseIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return StorageBaseIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseIpv4NetrangesResponseData storageBaseIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>storageBaseIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseIpv4NetrangesResponseData> storageBaseIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>storageBaseIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseIpv4NetrangesResponseData storageBaseIpv4Netranges(@Param("elid") String elid, StorageBaseIpv4NetrangesRequestData body, @QueryMap(encoded=true) StorageBaseIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>storageBaseIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseIpv4NetrangesResponseData> storageBaseIpv4NetrangesWithHttpInfo(@Param("elid") String elid, StorageBaseIpv4NetrangesRequestData body, @QueryMap(encoded=true) StorageBaseIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseIpv4Netranges</code> method in a fluent style.
   */
  public static class StorageBaseIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public StorageBaseIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return StorageBaseIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseIpv4NetworksResponseData storageBaseIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>storageBaseIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseIpv4NetworksResponseData> storageBaseIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>storageBaseIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseIpv4NetworksResponseData storageBaseIpv4Networks(@Param("elid") String elid, StorageBaseIpv4NetworksRequestData body, @QueryMap(encoded=true) StorageBaseIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>storageBaseIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseIpv4NetworksResponseData> storageBaseIpv4NetworksWithHttpInfo(@Param("elid") String elid, StorageBaseIpv4NetworksRequestData body, @QueryMap(encoded=true) StorageBaseIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseIpv4Networks</code> method in a fluent style.
   */
  public static class StorageBaseIpv4NetworksQueryParams extends HashMap<String, Object> {
    public StorageBaseIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return StorageBaseLocationResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseLocationResponse storageBaseLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseLocationRequest body);

  /**
   * Location
   * Similar to <code>storageBaseLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseLocationResponse> storageBaseLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>storageBaseLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseLocationResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseLocationResponse storageBaseLocation(@Param("elid") String elid, StorageBaseLocationRequest body, @QueryMap(encoded=true) StorageBaseLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>storageBaseLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseLocationResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseLocationResponse> storageBaseLocationWithHttpInfo(@Param("elid") String elid, StorageBaseLocationRequest body, @QueryMap(encoded=true) StorageBaseLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseLocation</code> method in a fluent style.
   */
  public static class StorageBaseLocationQueryParams extends HashMap<String, Object> {
    public StorageBaseLocationQueryParams sessionId(final String value) {
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
   * @return StorageBaseLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseLogicalPortsResponseData storageBaseLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>storageBaseLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseLogicalPortsResponseData> storageBaseLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>storageBaseLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseLogicalPortsResponseData storageBaseLogicalPorts(@Param("elid") String elid, StorageBaseLogicalPortsRequestData body, @QueryMap(encoded=true) StorageBaseLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>storageBaseLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseLogicalPortsResponseData> storageBaseLogicalPortsWithHttpInfo(@Param("elid") String elid, StorageBaseLogicalPortsRequestData body, @QueryMap(encoded=true) StorageBaseLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseLogicalPorts</code> method in a fluent style.
   */
  public static class StorageBaseLogicalPortsQueryParams extends HashMap<String, Object> {
    public StorageBaseLogicalPortsQueryParams sessionId(final String value) {
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
   * @return StorageBaseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseMaintenanceContractsResponseData storageBaseMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>storageBaseMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseMaintenanceContractsResponseData> storageBaseMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>storageBaseMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseMaintenanceContractsResponseData storageBaseMaintenanceContracts(@Param("elid") String elid, StorageBaseMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageBaseMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>storageBaseMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseMaintenanceContractsResponseData> storageBaseMaintenanceContractsWithHttpInfo(@Param("elid") String elid, StorageBaseMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageBaseMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseMaintenanceContracts</code> method in a fluent style.
   */
  public static class StorageBaseMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public StorageBaseMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return StorageBaseMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseMultiDuctsResponseData storageBaseMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>storageBaseMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseMultiDuctsResponseData> storageBaseMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>storageBaseMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseMultiDuctsResponseData storageBaseMultiDucts(@Param("elid") String elid, StorageBaseMultiDuctsRequestData body, @QueryMap(encoded=true) StorageBaseMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>storageBaseMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseMultiDuctsResponseData> storageBaseMultiDuctsWithHttpInfo(@Param("elid") String elid, StorageBaseMultiDuctsRequestData body, @QueryMap(encoded=true) StorageBaseMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseMultiDucts</code> method in a fluent style.
   */
  public static class StorageBaseMultiDuctsQueryParams extends HashMap<String, Object> {
    public StorageBaseMultiDuctsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageBaseNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseNetworksAndNetrangesResponse storageBaseNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>storageBaseNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseNetworksAndNetrangesResponse> storageBaseNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBaseNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseNetworksAndNetrangesResponse storageBaseNetworksAndNetranges(@Param("elid") String elid, StorageBaseNetworksAndNetrangesRequest body, @QueryMap(encoded=true) StorageBaseNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBaseNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseNetworksAndNetrangesResponse> storageBaseNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, StorageBaseNetworksAndNetrangesRequest body, @QueryMap(encoded=true) StorageBaseNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseNetworksAndNetranges</code> method in a fluent style.
   */
  public static class StorageBaseNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public StorageBaseNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return StorageBaseOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseOperatingSystemInstallationResponseData storageBaseOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>storageBaseOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseOperatingSystemInstallationResponseData> storageBaseOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>storageBaseOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseOperatingSystemInstallationResponseData storageBaseOperatingSystemInstallation(@Param("elid") String elid, StorageBaseOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) StorageBaseOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>storageBaseOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseOperatingSystemInstallationResponseData> storageBaseOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, StorageBaseOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) StorageBaseOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class StorageBaseOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public StorageBaseOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return StorageBaseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseOrganizationsResponseData storageBaseOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageBaseOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseOrganizationsResponseData> storageBaseOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageBaseOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseOrganizationsResponseData storageBaseOrganizations(@Param("elid") String elid, StorageBaseOrganizationsRequestData body, @QueryMap(encoded=true) StorageBaseOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageBaseOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseOrganizationsResponseData> storageBaseOrganizationsWithHttpInfo(@Param("elid") String elid, StorageBaseOrganizationsRequestData body, @QueryMap(encoded=true) StorageBaseOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseOrganizations</code> method in a fluent style.
   */
  public static class StorageBaseOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageBaseOrganizationsQueryParams sessionId(final String value) {
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
   * @return StorageBasePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBasePersonGroupsResponseData storageBasePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storageBasePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBasePersonGroupsResponseData> storageBasePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storageBasePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBasePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBasePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBasePersonGroupsResponseData storageBasePersonGroups(@Param("elid") String elid, StorageBasePersonGroupsRequestData body, @QueryMap(encoded=true) StorageBasePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storageBasePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBasePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBasePersonGroupsResponseData> storageBasePersonGroupsWithHttpInfo(@Param("elid") String elid, StorageBasePersonGroupsRequestData body, @QueryMap(encoded=true) StorageBasePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBasePersonGroups</code> method in a fluent style.
   */
  public static class StorageBasePersonGroupsQueryParams extends HashMap<String, Object> {
    public StorageBasePersonGroupsQueryParams sessionId(final String value) {
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
   * @return StorageBasePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBasePersonsResponseData storageBasePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storageBasePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBasePersonsResponseData> storageBasePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storageBasePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBasePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBasePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBasePersonsResponseData storageBasePersons(@Param("elid") String elid, StorageBasePersonsRequestData body, @QueryMap(encoded=true) StorageBasePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storageBasePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBasePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBasePersonsResponseData> storageBasePersonsWithHttpInfo(@Param("elid") String elid, StorageBasePersonsRequestData body, @QueryMap(encoded=true) StorageBasePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBasePersons</code> method in a fluent style.
   */
  public static class StorageBasePersonsQueryParams extends HashMap<String, Object> {
    public StorageBasePersonsQueryParams sessionId(final String value) {
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
   * @return StorageBasePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBasePhysicalPortsDataResponseData storageBasePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>storageBasePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBasePhysicalPortsDataResponseData> storageBasePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>storageBasePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBasePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBasePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBasePhysicalPortsDataResponseData storageBasePhysicalPortsData(@Param("elid") String elid, StorageBasePhysicalPortsDataRequestData body, @QueryMap(encoded=true) StorageBasePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>storageBasePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBasePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBasePhysicalPortsDataResponseData> storageBasePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, StorageBasePhysicalPortsDataRequestData body, @QueryMap(encoded=true) StorageBasePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBasePhysicalPortsData</code> method in a fluent style.
   */
  public static class StorageBasePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public StorageBasePhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return StorageBasePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBasePhysicalPortsDataExtendedResponse storageBasePhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>storageBasePhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBasePhysicalPortsDataExtendedResponse> storageBasePhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBasePhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBasePhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBasePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBasePhysicalPortsDataExtendedResponse storageBasePhysicalPortsDataExtended(@Param("elid") String elid, StorageBasePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) StorageBasePhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBasePhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBasePhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBasePhysicalPortsDataExtendedResponse> storageBasePhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, StorageBasePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) StorageBasePhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBasePhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class StorageBasePhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public StorageBasePhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return StorageBasePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBasePhysicalPortsPowerResponseData storageBasePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>storageBasePhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBasePhysicalPortsPowerResponseData> storageBasePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>storageBasePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBasePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBasePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBasePhysicalPortsPowerResponseData storageBasePhysicalPortsPower(@Param("elid") String elid, StorageBasePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) StorageBasePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>storageBasePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBasePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBasePhysicalPortsPowerResponseData> storageBasePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, StorageBasePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) StorageBasePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBasePhysicalPortsPower</code> method in a fluent style.
   */
  public static class StorageBasePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public StorageBasePhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return StorageBasePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBasePhysicalPortsPowerExtendedResponse storageBasePhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>storageBasePhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBasePhysicalPortsPowerExtendedResponse> storageBasePhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBasePhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBasePhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBasePhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBasePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBasePhysicalPortsPowerExtendedResponse storageBasePhysicalPortsPowerExtended(@Param("elid") String elid, StorageBasePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) StorageBasePhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBasePhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBasePhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBasePhysicalPortsPowerExtendedResponse> storageBasePhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, StorageBasePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) StorageBasePhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBasePhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class StorageBasePhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public StorageBasePhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageBaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseQueryResponse storageBaseQuery(@Param("sessionId") String sessionId, StorageBaseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageBaseQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseQueryResponse> storageBaseQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageBaseQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBaseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseQueryResponse storageBaseQuery(StorageBaseQueryRequest body, @QueryMap(encoded=true) StorageBaseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBaseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseQueryResponse> storageBaseQueryWithHttpInfo(StorageBaseQueryRequest body, @QueryMap(encoded=true) StorageBaseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseQuery</code> method in a fluent style.
   */
  public static class StorageBaseQueryQueryParams extends HashMap<String, Object> {
    public StorageBaseQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageBaseQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseQueryExtendedResponse storageBaseQueryExtended(@Param("sessionId") String sessionId, StorageBaseQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>storageBaseQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseQueryExtendedResponse> storageBaseQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, StorageBaseQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data.
   * Note, this is equivalent to the other <code>storageBaseQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseQueryExtendedResponse storageBaseQueryExtended(StorageBaseQueryExtendedRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data.
  * Note, this is equivalent to the other <code>storageBaseQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseQueryExtendedResponse> storageBaseQueryExtendedWithHttpInfo(StorageBaseQueryExtendedRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseQueryExtended</code> method in a fluent style.
   */
  public static class StorageBaseQueryExtendedQueryParams extends HashMap<String, Object> {
    public StorageBaseQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageBaseQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseQueryExtendedGeoCoordinatesResponse storageBaseQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, StorageBaseQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>storageBaseQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseQueryExtendedGeoCoordinatesResponse> storageBaseQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, StorageBaseQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>storageBaseQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseQueryExtendedGeoCoordinatesResponse storageBaseQueryExtendedGeoCoordinates(StorageBaseQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>storageBaseQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseQueryExtendedGeoCoordinatesResponse> storageBaseQueryExtendedGeoCoordinatesWithHttpInfo(StorageBaseQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class StorageBaseQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public StorageBaseQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageBaseQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseQueryExtendedScrollFirstResponse storageBaseQueryExtendedScrollFirst(@Param("sessionId") String sessionId, StorageBaseQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>storageBaseQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseQueryExtendedScrollFirstResponse> storageBaseQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, StorageBaseQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>storageBaseQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseQueryExtendedScrollFirstResponse storageBaseQueryExtendedScrollFirst(StorageBaseQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>storageBaseQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseQueryExtendedScrollFirstResponse> storageBaseQueryExtendedScrollFirstWithHttpInfo(StorageBaseQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class StorageBaseQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public StorageBaseQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageBaseQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseQueryExtendedScrollMoreResponse storageBaseQueryExtendedScrollMore(@Param("sessionId") String sessionId, StorageBaseQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>storageBaseQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseQueryExtendedScrollMoreResponse> storageBaseQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, StorageBaseQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>storageBaseQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseQueryExtendedScrollMoreResponse storageBaseQueryExtendedScrollMore(StorageBaseQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>storageBaseQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseQueryExtendedScrollMoreResponse> storageBaseQueryExtendedScrollMoreWithHttpInfo(StorageBaseQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) StorageBaseQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class StorageBaseQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public StorageBaseQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return StorageBaseServicesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseServicesResponse storageBaseServices(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>storageBaseServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseServicesResponse> storageBaseServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>storageBaseServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseServicesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseServicesResponse storageBaseServices(@Param("elid") String elid, StorageBaseServicesRequest body, @QueryMap(encoded=true) StorageBaseServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>storageBaseServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseServicesResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseServicesResponse> storageBaseServicesWithHttpInfo(@Param("elid") String elid, StorageBaseServicesRequest body, @QueryMap(encoded=true) StorageBaseServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseServices</code> method in a fluent style.
   */
  public static class StorageBaseServicesQueryParams extends HashMap<String, Object> {
    public StorageBaseServicesQueryParams sessionId(final String value) {
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
   * @return StorageBaseSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseSitesResponseData storageBaseSites(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>storageBaseSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseSitesResponseData> storageBaseSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>storageBaseSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseSitesResponseData storageBaseSites(@Param("elid") String elid, StorageBaseSitesRequestData body, @QueryMap(encoded=true) StorageBaseSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>storageBaseSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseSitesResponseData> storageBaseSitesWithHttpInfo(@Param("elid") String elid, StorageBaseSitesRequestData body, @QueryMap(encoded=true) StorageBaseSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseSites</code> method in a fluent style.
   */
  public static class StorageBaseSitesQueryParams extends HashMap<String, Object> {
    public StorageBaseSitesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageBaseSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseSlotResponseData storageBaseSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>storageBaseSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseSlotResponseData> storageBaseSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed.
   * Note, this is equivalent to the other <code>storageBaseSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseSlotResponseData storageBaseSlot(@Param("elid") String elid, StorageBaseSlotRequestData body, @QueryMap(encoded=true) StorageBaseSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed.
  * Note, this is equivalent to the other <code>storageBaseSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseSlotResponseData> storageBaseSlotWithHttpInfo(@Param("elid") String elid, StorageBaseSlotRequestData body, @QueryMap(encoded=true) StorageBaseSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseSlot</code> method in a fluent style.
   */
  public static class StorageBaseSlotQueryParams extends HashMap<String, Object> {
    public StorageBaseSlotQueryParams sessionId(final String value) {
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
   * @return StorageBaseSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseSwitchCabinetResponseData storageBaseSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>storageBaseSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseSwitchCabinetResponseData> storageBaseSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>storageBaseSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseSwitchCabinetResponseData storageBaseSwitchCabinet(@Param("elid") String elid, StorageBaseSwitchCabinetRequestData body, @QueryMap(encoded=true) StorageBaseSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>storageBaseSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseSwitchCabinetResponseData> storageBaseSwitchCabinetWithHttpInfo(@Param("elid") String elid, StorageBaseSwitchCabinetRequestData body, @QueryMap(encoded=true) StorageBaseSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseSwitchCabinet</code> method in a fluent style.
   */
  public static class StorageBaseSwitchCabinetQueryParams extends HashMap<String, Object> {
    public StorageBaseSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return StorageBaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseSystemAttributesResponse storageBaseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageBaseSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseSystemAttributesResponse> storageBaseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>storageBaseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseSystemAttributesResponse storageBaseSystemAttributes(@Param("elid") String elid, StorageBaseSystemAttributesRequest body, @QueryMap(encoded=true) StorageBaseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>storageBaseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseSystemAttributesResponse> storageBaseSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageBaseSystemAttributesRequest body, @QueryMap(encoded=true) StorageBaseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseSystemAttributes</code> method in a fluent style.
   */
  public static class StorageBaseSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageBaseSystemAttributesQueryParams sessionId(final String value) {
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
   * @return StorageBaseVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseVirtualSwitchesResponseData storageBaseVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>storageBaseVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseVirtualSwitchesResponseData> storageBaseVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>storageBaseVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseVirtualSwitchesResponseData storageBaseVirtualSwitches(@Param("elid") String elid, StorageBaseVirtualSwitchesRequestData body, @QueryMap(encoded=true) StorageBaseVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>storageBaseVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseVirtualSwitchesResponseData> storageBaseVirtualSwitchesWithHttpInfo(@Param("elid") String elid, StorageBaseVirtualSwitchesRequestData body, @QueryMap(encoded=true) StorageBaseVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseVirtualSwitches</code> method in a fluent style.
   */
  public static class StorageBaseVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public StorageBaseVirtualSwitchesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageBaseVlansResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseVlansResponse storageBaseVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseVlansRequest body);

  /**
   * VLANs
   * Similar to <code>storageBaseVlans</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseVlansResponse> storageBaseVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseVlansRequest body);


  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBaseVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseVlansResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseVlansResponse storageBaseVlans(@Param("elid") String elid, StorageBaseVlansRequest body, @QueryMap(encoded=true) StorageBaseVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBaseVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseVlansResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseVlansResponse> storageBaseVlansWithHttpInfo(@Param("elid") String elid, StorageBaseVlansRequest body, @QueryMap(encoded=true) StorageBaseVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseVlans</code> method in a fluent style.
   */
  public static class StorageBaseVlansQueryParams extends HashMap<String, Object> {
    public StorageBaseVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLAN to slots
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageBaseVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseVlansAtSlotResponse storageBaseVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>storageBaseVlansAtSlot</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseVlansAtSlotResponse> storageBaseVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageBaseVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseVlansAtSlotResponse storageBaseVlansAtSlot(@Param("elid") String elid, StorageBaseVlansAtSlotRequest body, @QueryMap(encoded=true) StorageBaseVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageBaseVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseVlansAtSlotResponse> storageBaseVlansAtSlotWithHttpInfo(@Param("elid") String elid, StorageBaseVlansAtSlotRequest body, @QueryMap(encoded=true) StorageBaseVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseVlansAtSlot</code> method in a fluent style.
   */
  public static class StorageBaseVlansAtSlotQueryParams extends HashMap<String, Object> {
    public StorageBaseVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return StorageBaseWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseWarehouseResponseData storageBaseWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>storageBaseWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseWarehouseResponseData> storageBaseWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>storageBaseWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseWarehouseResponseData storageBaseWarehouse(@Param("elid") String elid, StorageBaseWarehouseRequestData body, @QueryMap(encoded=true) StorageBaseWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>storageBaseWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseWarehouseResponseData> storageBaseWarehouseWithHttpInfo(@Param("elid") String elid, StorageBaseWarehouseRequestData body, @QueryMap(encoded=true) StorageBaseWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseWarehouse</code> method in a fluent style.
   */
  public static class StorageBaseWarehouseQueryParams extends HashMap<String, Object> {
    public StorageBaseWarehouseQueryParams sessionId(final String value) {
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
   * @return StorageBaseZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageBaseZoneResponseData storageBaseZone(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>storageBaseZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageBaseZoneResponseData> storageBaseZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageBaseZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>storageBaseZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageBaseZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageBaseZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageBaseZoneResponseData storageBaseZone(@Param("elid") String elid, StorageBaseZoneRequestData body, @QueryMap(encoded=true) StorageBaseZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>storageBaseZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageBaseZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageBaseZoneResponseData> storageBaseZoneWithHttpInfo(@Param("elid") String elid, StorageBaseZoneRequestData body, @QueryMap(encoded=true) StorageBaseZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageBaseZone</code> method in a fluent style.
   */
  public static class StorageBaseZoneQueryParams extends HashMap<String, Object> {
    public StorageBaseZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateStorageBaseResponse updateStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageBaseRequestData body);

  /**
   * Modify
   * Similar to <code>updateStorageBase</code> but it also returns the http response headers .
   * Modify Storage
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateStorageBaseResponse> updateStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageBaseRequestData body);


  /**
   * Modify
   * Modify Storage
   * Note, this is equivalent to the other <code>updateStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateStorageBaseResponse updateStorageBase(@Param("elid") String elid, UpdateStorageBaseRequestData body, @QueryMap(encoded=true) UpdateStorageBaseQueryParams queryParams);

  /**
  * Modify
  * Modify Storage
  * Note, this is equivalent to the other <code>updateStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateStorageBaseResponse> updateStorageBaseWithHttpInfo(@Param("elid") String elid, UpdateStorageBaseRequestData body, @QueryMap(encoded=true) UpdateStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateStorageBase</code> method in a fluent style.
   */
  public static class UpdateStorageBaseQueryParams extends HashMap<String, Object> {
    public UpdateStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageBaseResponse updateSystemAttributesStorageBase(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageBaseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorageBase</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageBaseResponse> updateSystemAttributesStorageBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageBaseRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorageBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageBaseResponse
   */
  @RequestLine("POST /api/rest/entity/storageBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageBaseResponse updateSystemAttributesStorageBase(@Param("elid") String elid, UpdateSystemAttributesStorageBaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageBaseQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorageBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageBaseResponse
      */
      @RequestLine("POST /api/rest/entity/storageBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageBaseResponse> updateSystemAttributesStorageBaseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageBaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorageBase</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageBaseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
