package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeServerBaseResponse;
import com.fntsoftware.businessgateway.entities.DeleteServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServerBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetServerBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotServerBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseServerBaseResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneServerBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetServerBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotServerBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseServerBaseResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneServerBaseResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectServerBaseResponse;
import com.fntsoftware.businessgateway.entities.ServerBase100030RequestData;
import com.fntsoftware.businessgateway.entities.ServerBase100030ResponseData;
import com.fntsoftware.businessgateway.entities.ServerBase100036RequestData;
import com.fntsoftware.businessgateway.entities.ServerBase100036ResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseCustomStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseCustomStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseDuctDataRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseDuctDataResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseDuctsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseDuctsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseLocationRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseLocationResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBasePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBasePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBasePersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServerBasePersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.ServerBasePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseQueryResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseServicesRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseServicesResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseSitesRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseSitesResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseSlotRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseSlotResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseVlansRequest;
import com.fntsoftware.businessgateway.entities.ServerBaseVlansResponse;
import com.fntsoftware.businessgateway.entities.ServerBaseWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.ServerBaseZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServerBaseZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServerBaseResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServerBaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServerBaseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServerBaseApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeServerBaseResponse changeTypeServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeServerBaseRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeServerBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeServerBaseResponse> changeTypeServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeServerBaseRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeServerBaseResponse changeTypeServerBase(@Param("elid") String elid, ChangeTypeServerBaseRequestData body, @QueryMap(encoded=true) ChangeTypeServerBaseQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeServerBaseResponse> changeTypeServerBaseWithHttpInfo(@Param("elid") String elid, ChangeTypeServerBaseRequestData body, @QueryMap(encoded=true) ChangeTypeServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeServerBase</code> method in a fluent style.
   */
  public static class ChangeTypeServerBaseQueryParams extends HashMap<String, Object> {
    public ChangeTypeServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServerBaseResponse deleteServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServerBaseRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServerBase</code> but it also returns the http response headers .
   * Delete Server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServerBaseResponse> deleteServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServerBaseRequestData body);


  /**
   * Delete
   * Delete Server
   * Note, this is equivalent to the other <code>deleteServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServerBaseResponse deleteServerBase(@Param("elid") String elid, DeleteServerBaseRequestData body, @QueryMap(encoded=true) DeleteServerBaseQueryParams queryParams);

  /**
  * Delete
  * Delete Server
  * Note, this is equivalent to the other <code>deleteServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServerBaseResponse> deleteServerBaseWithHttpInfo(@Param("elid") String elid, DeleteServerBaseRequestData body, @QueryMap(encoded=true) DeleteServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServerBase</code> method in a fluent style.
   */
  public static class DeleteServerBaseQueryParams extends HashMap<String, Object> {
    public DeleteServerBaseQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetServerBaseResponse moveToCabinetServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetServerBaseRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetServerBase</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetServerBaseResponse> moveToCabinetServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetServerBaseRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetServerBaseResponse moveToCabinetServerBase(@Param("elid") String elid, MoveToCabinetServerBaseRequestData body, @QueryMap(encoded=true) MoveToCabinetServerBaseQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetServerBaseResponse> moveToCabinetServerBaseWithHttpInfo(@Param("elid") String elid, MoveToCabinetServerBaseRequestData body, @QueryMap(encoded=true) MoveToCabinetServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetServerBase</code> method in a fluent style.
   */
  public static class MoveToCabinetServerBaseQueryParams extends HashMap<String, Object> {
    public MoveToCabinetServerBaseQueryParams sessionId(final String value) {
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
   * @return MoveToSlotServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotServerBaseResponse moveToSlotServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotServerBaseRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotServerBase</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotServerBaseResponse> moveToSlotServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotServerBaseRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotServerBaseResponse moveToSlotServerBase(@Param("elid") String elid, MoveToSlotServerBaseRequestData body, @QueryMap(encoded=true) MoveToSlotServerBaseQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotServerBaseResponse> moveToSlotServerBaseWithHttpInfo(@Param("elid") String elid, MoveToSlotServerBaseRequestData body, @QueryMap(encoded=true) MoveToSlotServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotServerBase</code> method in a fluent style.
   */
  public static class MoveToSlotServerBaseQueryParams extends HashMap<String, Object> {
    public MoveToSlotServerBaseQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseServerBaseResponse moveToWarehouseServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseServerBaseRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseServerBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseServerBaseResponse> moveToWarehouseServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseServerBaseRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseServerBaseResponse moveToWarehouseServerBase(@Param("elid") String elid, MoveToWarehouseServerBaseRequestData body, @QueryMap(encoded=true) MoveToWarehouseServerBaseQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseServerBaseResponse> moveToWarehouseServerBaseWithHttpInfo(@Param("elid") String elid, MoveToWarehouseServerBaseRequestData body, @QueryMap(encoded=true) MoveToWarehouseServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseServerBase</code> method in a fluent style.
   */
  public static class MoveToWarehouseServerBaseQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseServerBaseQueryParams sessionId(final String value) {
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
   * @return MoveToZoneServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneServerBaseResponse moveToZoneServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneServerBaseRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneServerBase</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneServerBaseResponse> moveToZoneServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneServerBaseRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneServerBaseResponse moveToZoneServerBase(@Param("elid") String elid, MoveToZoneServerBaseRequestData body, @QueryMap(encoded=true) MoveToZoneServerBaseQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneServerBaseResponse> moveToZoneServerBaseWithHttpInfo(@Param("elid") String elid, MoveToZoneServerBaseRequestData body, @QueryMap(encoded=true) MoveToZoneServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneServerBase</code> method in a fluent style.
   */
  public static class MoveToZoneServerBaseQueryParams extends HashMap<String, Object> {
    public MoveToZoneServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetServerBaseResponse placeInCabinetServerBase(@Param("sessionId") String sessionId, PlaceInCabinetServerBaseRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetServerBase</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetServerBaseResponse> placeInCabinetServerBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetServerBaseRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetServerBaseResponse placeInCabinetServerBase(PlaceInCabinetServerBaseRequestData body, @QueryMap(encoded=true) PlaceInCabinetServerBaseQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetServerBaseResponse> placeInCabinetServerBaseWithHttpInfo(PlaceInCabinetServerBaseRequestData body, @QueryMap(encoded=true) PlaceInCabinetServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetServerBase</code> method in a fluent style.
   */
  public static class PlaceInCabinetServerBaseQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotServerBaseResponse placeInSlotServerBase(@Param("sessionId") String sessionId, PlaceInSlotServerBaseRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotServerBase</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotServerBaseResponse> placeInSlotServerBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotServerBaseRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotServerBaseResponse placeInSlotServerBase(PlaceInSlotServerBaseRequestData body, @QueryMap(encoded=true) PlaceInSlotServerBaseQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotServerBaseResponse> placeInSlotServerBaseWithHttpInfo(PlaceInSlotServerBaseRequestData body, @QueryMap(encoded=true) PlaceInSlotServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotServerBase</code> method in a fluent style.
   */
  public static class PlaceInSlotServerBaseQueryParams extends HashMap<String, Object> {
    public PlaceInSlotServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseServerBaseResponse placeInWarehouseServerBase(@Param("sessionId") String sessionId, PlaceInWarehouseServerBaseRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseServerBase</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseServerBaseResponse> placeInWarehouseServerBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseServerBaseRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseServerBaseResponse placeInWarehouseServerBase(PlaceInWarehouseServerBaseRequestData body, @QueryMap(encoded=true) PlaceInWarehouseServerBaseQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseServerBaseResponse> placeInWarehouseServerBaseWithHttpInfo(PlaceInWarehouseServerBaseRequestData body, @QueryMap(encoded=true) PlaceInWarehouseServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseServerBase</code> method in a fluent style.
   */
  public static class PlaceInWarehouseServerBaseQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneServerBaseResponse placeInZoneServerBase(@Param("sessionId") String sessionId, PlaceInZoneServerBaseRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneServerBase</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneServerBaseResponse> placeInZoneServerBaseWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneServerBaseRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneServerBaseResponse placeInZoneServerBase(PlaceInZoneServerBaseRequestData body, @QueryMap(encoded=true) PlaceInZoneServerBaseQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneServerBaseResponse> placeInZoneServerBaseWithHttpInfo(PlaceInZoneServerBaseRequestData body, @QueryMap(encoded=true) PlaceInZoneServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneServerBase</code> method in a fluent style.
   */
  public static class PlaceInZoneServerBaseQueryParams extends HashMap<String, Object> {
    public PlaceInZoneServerBaseQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectServerBaseResponse replaceObjectServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectServerBaseRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectServerBase</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectServerBaseResponse> replaceObjectServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectServerBaseRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectServerBaseResponse replaceObjectServerBase(@Param("elid") String elid, ReplaceObjectServerBaseRequestData body, @QueryMap(encoded=true) ReplaceObjectServerBaseQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectServerBaseResponse> replaceObjectServerBaseWithHttpInfo(@Param("elid") String elid, ReplaceObjectServerBaseRequestData body, @QueryMap(encoded=true) ReplaceObjectServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectServerBase</code> method in a fluent style.
   */
  public static class ReplaceObjectServerBaseQueryParams extends HashMap<String, Object> {
    public ReplaceObjectServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual disk entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerBase100030ResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/100030?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBase100030ResponseData serverBase100030(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBase100030RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>serverBase100030</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/100030?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBase100030ResponseData> serverBase100030WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBase100030RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>serverBase100030</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBase100030QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBase100030ResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/100030?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBase100030ResponseData serverBase100030(@Param("elid") String elid, ServerBase100030RequestData body, @QueryMap(encoded=true) ServerBase100030QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>serverBase100030</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBase100030ResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/100030?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBase100030ResponseData> serverBase100030WithHttpInfo(@Param("elid") String elid, ServerBase100030RequestData body, @QueryMap(encoded=true) ServerBase100030QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBase100030</code> method in a fluent style.
   */
  public static class ServerBase100030QueryParams extends HashMap<String, Object> {
    public ServerBase100030QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VM datastore entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerBase100036ResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/100036?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBase100036ResponseData serverBase100036(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBase100036RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>serverBase100036</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/100036?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBase100036ResponseData> serverBase100036WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBase100036RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>serverBase100036</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBase100036QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBase100036ResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/100036?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBase100036ResponseData serverBase100036(@Param("elid") String elid, ServerBase100036RequestData body, @QueryMap(encoded=true) ServerBase100036QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>serverBase100036</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBase100036ResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/100036?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBase100036ResponseData> serverBase100036WithHttpInfo(@Param("elid") String elid, ServerBase100036RequestData body, @QueryMap(encoded=true) ServerBase100036QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBase100036</code> method in a fluent style.
   */
  public static class ServerBase100036QueryParams extends HashMap<String, Object> {
    public ServerBase100036QueryParams sessionId(final String value) {
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
   * @return ServerBaseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseContractsResponseData serverBaseContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serverBaseContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseContractsResponseData> serverBaseContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serverBaseContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseContractsResponseData serverBaseContracts(@Param("elid") String elid, ServerBaseContractsRequestData body, @QueryMap(encoded=true) ServerBaseContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serverBaseContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseContractsResponseData> serverBaseContractsWithHttpInfo(@Param("elid") String elid, ServerBaseContractsRequestData body, @QueryMap(encoded=true) ServerBaseContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseContracts</code> method in a fluent style.
   */
  public static class ServerBaseContractsQueryParams extends HashMap<String, Object> {
    public ServerBaseContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerBaseCustomStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/CustomStorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseCustomStorageUnitsResponseData serverBaseCustomStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseCustomStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>serverBaseCustomStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/CustomStorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseCustomStorageUnitsResponseData> serverBaseCustomStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseCustomStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>serverBaseCustomStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseCustomStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseCustomStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/CustomStorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseCustomStorageUnitsResponseData serverBaseCustomStorageUnits(@Param("elid") String elid, ServerBaseCustomStorageUnitsRequestData body, @QueryMap(encoded=true) ServerBaseCustomStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>serverBaseCustomStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseCustomStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/CustomStorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseCustomStorageUnitsResponseData> serverBaseCustomStorageUnitsWithHttpInfo(@Param("elid") String elid, ServerBaseCustomStorageUnitsRequestData body, @QueryMap(encoded=true) ServerBaseCustomStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseCustomStorageUnits</code> method in a fluent style.
   */
  public static class ServerBaseCustomStorageUnitsQueryParams extends HashMap<String, Object> {
    public ServerBaseCustomStorageUnitsQueryParams sessionId(final String value) {
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
   * @return ServerBaseDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseDeviceMasterResponseData serverBaseDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serverBaseDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseDeviceMasterResponseData> serverBaseDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serverBaseDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseDeviceMasterResponseData serverBaseDeviceMaster(@Param("elid") String elid, ServerBaseDeviceMasterRequestData body, @QueryMap(encoded=true) ServerBaseDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serverBaseDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseDeviceMasterResponseData> serverBaseDeviceMasterWithHttpInfo(@Param("elid") String elid, ServerBaseDeviceMasterRequestData body, @QueryMap(encoded=true) ServerBaseDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseDeviceMaster</code> method in a fluent style.
   */
  public static class ServerBaseDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServerBaseDeviceMasterQueryParams sessionId(final String value) {
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
   * @return ServerBaseDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseDuctDataResponse serverBaseDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>serverBaseDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseDuctDataResponse> serverBaseDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>serverBaseDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseDuctDataResponse serverBaseDuctData(@Param("elid") String elid, ServerBaseDuctDataRequest body, @QueryMap(encoded=true) ServerBaseDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>serverBaseDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseDuctDataResponse> serverBaseDuctDataWithHttpInfo(@Param("elid") String elid, ServerBaseDuctDataRequest body, @QueryMap(encoded=true) ServerBaseDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseDuctData</code> method in a fluent style.
   */
  public static class ServerBaseDuctDataQueryParams extends HashMap<String, Object> {
    public ServerBaseDuctDataQueryParams sessionId(final String value) {
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
   * @return ServerBaseDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseDuctsResponseData serverBaseDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>serverBaseDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseDuctsResponseData> serverBaseDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>serverBaseDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseDuctsResponseData serverBaseDucts(@Param("elid") String elid, ServerBaseDuctsRequestData body, @QueryMap(encoded=true) ServerBaseDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>serverBaseDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseDuctsResponseData> serverBaseDuctsWithHttpInfo(@Param("elid") String elid, ServerBaseDuctsRequestData body, @QueryMap(encoded=true) ServerBaseDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseDucts</code> method in a fluent style.
   */
  public static class ServerBaseDuctsQueryParams extends HashMap<String, Object> {
    public ServerBaseDuctsQueryParams sessionId(final String value) {
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
   * @return ServerBaseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseFrameContractsResponseData serverBaseFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serverBaseFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseFrameContractsResponseData> serverBaseFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serverBaseFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseFrameContractsResponseData serverBaseFrameContracts(@Param("elid") String elid, ServerBaseFrameContractsRequestData body, @QueryMap(encoded=true) ServerBaseFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serverBaseFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseFrameContractsResponseData> serverBaseFrameContractsWithHttpInfo(@Param("elid") String elid, ServerBaseFrameContractsRequestData body, @QueryMap(encoded=true) ServerBaseFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseFrameContracts</code> method in a fluent style.
   */
  public static class ServerBaseFrameContractsQueryParams extends HashMap<String, Object> {
    public ServerBaseFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerBaseInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseInheritedGeoCoordinatesResponse serverBaseInheritedGeoCoordinates(@Param("sessionId") String sessionId, ServerBaseInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>serverBaseInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseInheritedGeoCoordinatesResponse> serverBaseInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, ServerBaseInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>serverBaseInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseInheritedGeoCoordinatesResponse serverBaseInheritedGeoCoordinates(ServerBaseInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) ServerBaseInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>serverBaseInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseInheritedGeoCoordinatesResponse> serverBaseInheritedGeoCoordinatesWithHttpInfo(ServerBaseInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) ServerBaseInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class ServerBaseInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public ServerBaseInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return ServerBaseInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseInstalledSubCardsResponse serverBaseInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>serverBaseInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseInstalledSubCardsResponse> serverBaseInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>serverBaseInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseInstalledSubCardsResponse serverBaseInstalledSubCards(@Param("elid") String elid, ServerBaseInstalledSubCardsRequest body, @QueryMap(encoded=true) ServerBaseInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>serverBaseInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseInstalledSubCardsResponse> serverBaseInstalledSubCardsWithHttpInfo(@Param("elid") String elid, ServerBaseInstalledSubCardsRequest body, @QueryMap(encoded=true) ServerBaseInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseInstalledSubCards</code> method in a fluent style.
   */
  public static class ServerBaseInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public ServerBaseInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return ServerBaseInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseInstalledSubCardsRecursiveResponse serverBaseInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>serverBaseInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseInstalledSubCardsRecursiveResponse> serverBaseInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>serverBaseInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseInstalledSubCardsRecursiveResponse serverBaseInstalledSubCardsRecursive(@Param("elid") String elid, ServerBaseInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) ServerBaseInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>serverBaseInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseInstalledSubCardsRecursiveResponse> serverBaseInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, ServerBaseInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) ServerBaseInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class ServerBaseInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public ServerBaseInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return ServerBaseInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseInterfacesResponseData serverBaseInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>serverBaseInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseInterfacesResponseData> serverBaseInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>serverBaseInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseInterfacesResponseData serverBaseInterfaces(@Param("elid") String elid, ServerBaseInterfacesRequestData body, @QueryMap(encoded=true) ServerBaseInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>serverBaseInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseInterfacesResponseData> serverBaseInterfacesWithHttpInfo(@Param("elid") String elid, ServerBaseInterfacesRequestData body, @QueryMap(encoded=true) ServerBaseInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseInterfaces</code> method in a fluent style.
   */
  public static class ServerBaseInterfacesQueryParams extends HashMap<String, Object> {
    public ServerBaseInterfacesQueryParams sessionId(final String value) {
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
   * @return ServerBaseIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseIpAddressesResponse serverBaseIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>serverBaseIpAddresses</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseIpAddressesResponse> serverBaseIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpAddressesRequest body);


  /**
   * IP addresses
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBaseIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseIpAddressesResponse serverBaseIpAddresses(@Param("elid") String elid, ServerBaseIpAddressesRequest body, @QueryMap(encoded=true) ServerBaseIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBaseIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseIpAddressesResponse> serverBaseIpAddressesWithHttpInfo(@Param("elid") String elid, ServerBaseIpAddressesRequest body, @QueryMap(encoded=true) ServerBaseIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseIpAddresses</code> method in a fluent style.
   */
  public static class ServerBaseIpAddressesQueryParams extends HashMap<String, Object> {
    public ServerBaseIpAddressesQueryParams sessionId(final String value) {
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
   * @return ServerBaseIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseIpv4AddressesResponseData serverBaseIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>serverBaseIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseIpv4AddressesResponseData> serverBaseIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>serverBaseIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseIpv4AddressesResponseData serverBaseIpv4Addresses(@Param("elid") String elid, ServerBaseIpv4AddressesRequestData body, @QueryMap(encoded=true) ServerBaseIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>serverBaseIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseIpv4AddressesResponseData> serverBaseIpv4AddressesWithHttpInfo(@Param("elid") String elid, ServerBaseIpv4AddressesRequestData body, @QueryMap(encoded=true) ServerBaseIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseIpv4Addresses</code> method in a fluent style.
   */
  public static class ServerBaseIpv4AddressesQueryParams extends HashMap<String, Object> {
    public ServerBaseIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return ServerBaseIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseIpv4NetrangesResponseData serverBaseIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>serverBaseIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseIpv4NetrangesResponseData> serverBaseIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>serverBaseIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseIpv4NetrangesResponseData serverBaseIpv4Netranges(@Param("elid") String elid, ServerBaseIpv4NetrangesRequestData body, @QueryMap(encoded=true) ServerBaseIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>serverBaseIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseIpv4NetrangesResponseData> serverBaseIpv4NetrangesWithHttpInfo(@Param("elid") String elid, ServerBaseIpv4NetrangesRequestData body, @QueryMap(encoded=true) ServerBaseIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseIpv4Netranges</code> method in a fluent style.
   */
  public static class ServerBaseIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public ServerBaseIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return ServerBaseIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseIpv4NetworksResponseData serverBaseIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>serverBaseIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseIpv4NetworksResponseData> serverBaseIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>serverBaseIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseIpv4NetworksResponseData serverBaseIpv4Networks(@Param("elid") String elid, ServerBaseIpv4NetworksRequestData body, @QueryMap(encoded=true) ServerBaseIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>serverBaseIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseIpv4NetworksResponseData> serverBaseIpv4NetworksWithHttpInfo(@Param("elid") String elid, ServerBaseIpv4NetworksRequestData body, @QueryMap(encoded=true) ServerBaseIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseIpv4Networks</code> method in a fluent style.
   */
  public static class ServerBaseIpv4NetworksQueryParams extends HashMap<String, Object> {
    public ServerBaseIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return ServerBaseLocationResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseLocationResponse serverBaseLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseLocationRequest body);

  /**
   * Location
   * Similar to <code>serverBaseLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseLocationResponse> serverBaseLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>serverBaseLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseLocationResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseLocationResponse serverBaseLocation(@Param("elid") String elid, ServerBaseLocationRequest body, @QueryMap(encoded=true) ServerBaseLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>serverBaseLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseLocationResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseLocationResponse> serverBaseLocationWithHttpInfo(@Param("elid") String elid, ServerBaseLocationRequest body, @QueryMap(encoded=true) ServerBaseLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseLocation</code> method in a fluent style.
   */
  public static class ServerBaseLocationQueryParams extends HashMap<String, Object> {
    public ServerBaseLocationQueryParams sessionId(final String value) {
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
   * @return ServerBaseLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseLogicalPortsResponseData serverBaseLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>serverBaseLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseLogicalPortsResponseData> serverBaseLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>serverBaseLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseLogicalPortsResponseData serverBaseLogicalPorts(@Param("elid") String elid, ServerBaseLogicalPortsRequestData body, @QueryMap(encoded=true) ServerBaseLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>serverBaseLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseLogicalPortsResponseData> serverBaseLogicalPortsWithHttpInfo(@Param("elid") String elid, ServerBaseLogicalPortsRequestData body, @QueryMap(encoded=true) ServerBaseLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseLogicalPorts</code> method in a fluent style.
   */
  public static class ServerBaseLogicalPortsQueryParams extends HashMap<String, Object> {
    public ServerBaseLogicalPortsQueryParams sessionId(final String value) {
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
   * @return ServerBaseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseMaintenanceContractsResponseData serverBaseMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serverBaseMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseMaintenanceContractsResponseData> serverBaseMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serverBaseMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseMaintenanceContractsResponseData serverBaseMaintenanceContracts(@Param("elid") String elid, ServerBaseMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServerBaseMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serverBaseMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseMaintenanceContractsResponseData> serverBaseMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServerBaseMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServerBaseMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServerBaseMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServerBaseMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServerBaseMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseMultiDuctsResponseData serverBaseMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>serverBaseMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseMultiDuctsResponseData> serverBaseMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>serverBaseMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseMultiDuctsResponseData serverBaseMultiDucts(@Param("elid") String elid, ServerBaseMultiDuctsRequestData body, @QueryMap(encoded=true) ServerBaseMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>serverBaseMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseMultiDuctsResponseData> serverBaseMultiDuctsWithHttpInfo(@Param("elid") String elid, ServerBaseMultiDuctsRequestData body, @QueryMap(encoded=true) ServerBaseMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseMultiDucts</code> method in a fluent style.
   */
  public static class ServerBaseMultiDuctsQueryParams extends HashMap<String, Object> {
    public ServerBaseMultiDuctsQueryParams sessionId(final String value) {
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
   * @return ServerBaseNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseNetworksAndNetrangesResponse serverBaseNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>serverBaseNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseNetworksAndNetrangesResponse> serverBaseNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBaseNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseNetworksAndNetrangesResponse serverBaseNetworksAndNetranges(@Param("elid") String elid, ServerBaseNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ServerBaseNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBaseNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseNetworksAndNetrangesResponse> serverBaseNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, ServerBaseNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ServerBaseNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseNetworksAndNetranges</code> method in a fluent style.
   */
  public static class ServerBaseNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public ServerBaseNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return ServerBaseOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseOperatingSystemInstallationResponseData serverBaseOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>serverBaseOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseOperatingSystemInstallationResponseData> serverBaseOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>serverBaseOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseOperatingSystemInstallationResponseData serverBaseOperatingSystemInstallation(@Param("elid") String elid, ServerBaseOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ServerBaseOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>serverBaseOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseOperatingSystemInstallationResponseData> serverBaseOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, ServerBaseOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ServerBaseOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class ServerBaseOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public ServerBaseOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return ServerBaseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseOrganizationsResponseData serverBaseOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serverBaseOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseOrganizationsResponseData> serverBaseOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serverBaseOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseOrganizationsResponseData serverBaseOrganizations(@Param("elid") String elid, ServerBaseOrganizationsRequestData body, @QueryMap(encoded=true) ServerBaseOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serverBaseOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseOrganizationsResponseData> serverBaseOrganizationsWithHttpInfo(@Param("elid") String elid, ServerBaseOrganizationsRequestData body, @QueryMap(encoded=true) ServerBaseOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseOrganizations</code> method in a fluent style.
   */
  public static class ServerBaseOrganizationsQueryParams extends HashMap<String, Object> {
    public ServerBaseOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServerBasePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBasePersonGroupsResponseData serverBasePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serverBasePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBasePersonGroupsResponseData> serverBasePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serverBasePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBasePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBasePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBasePersonGroupsResponseData serverBasePersonGroups(@Param("elid") String elid, ServerBasePersonGroupsRequestData body, @QueryMap(encoded=true) ServerBasePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serverBasePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBasePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBasePersonGroupsResponseData> serverBasePersonGroupsWithHttpInfo(@Param("elid") String elid, ServerBasePersonGroupsRequestData body, @QueryMap(encoded=true) ServerBasePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBasePersonGroups</code> method in a fluent style.
   */
  public static class ServerBasePersonGroupsQueryParams extends HashMap<String, Object> {
    public ServerBasePersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServerBasePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBasePersonsResponseData serverBasePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serverBasePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBasePersonsResponseData> serverBasePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serverBasePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBasePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBasePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBasePersonsResponseData serverBasePersons(@Param("elid") String elid, ServerBasePersonsRequestData body, @QueryMap(encoded=true) ServerBasePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serverBasePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBasePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBasePersonsResponseData> serverBasePersonsWithHttpInfo(@Param("elid") String elid, ServerBasePersonsRequestData body, @QueryMap(encoded=true) ServerBasePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBasePersons</code> method in a fluent style.
   */
  public static class ServerBasePersonsQueryParams extends HashMap<String, Object> {
    public ServerBasePersonsQueryParams sessionId(final String value) {
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
   * @return ServerBasePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBasePhysicalPortsDataResponseData serverBasePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>serverBasePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBasePhysicalPortsDataResponseData> serverBasePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>serverBasePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBasePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBasePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBasePhysicalPortsDataResponseData serverBasePhysicalPortsData(@Param("elid") String elid, ServerBasePhysicalPortsDataRequestData body, @QueryMap(encoded=true) ServerBasePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>serverBasePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBasePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBasePhysicalPortsDataResponseData> serverBasePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, ServerBasePhysicalPortsDataRequestData body, @QueryMap(encoded=true) ServerBasePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBasePhysicalPortsData</code> method in a fluent style.
   */
  public static class ServerBasePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public ServerBasePhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return ServerBasePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBasePhysicalPortsDataExtendedResponse serverBasePhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>serverBasePhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBasePhysicalPortsDataExtendedResponse> serverBasePhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBasePhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBasePhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBasePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBasePhysicalPortsDataExtendedResponse serverBasePhysicalPortsDataExtended(@Param("elid") String elid, ServerBasePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) ServerBasePhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBasePhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBasePhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBasePhysicalPortsDataExtendedResponse> serverBasePhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, ServerBasePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) ServerBasePhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBasePhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class ServerBasePhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public ServerBasePhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return ServerBasePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBasePhysicalPortsPowerResponseData serverBasePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>serverBasePhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBasePhysicalPortsPowerResponseData> serverBasePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>serverBasePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBasePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBasePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBasePhysicalPortsPowerResponseData serverBasePhysicalPortsPower(@Param("elid") String elid, ServerBasePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) ServerBasePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>serverBasePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBasePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBasePhysicalPortsPowerResponseData> serverBasePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, ServerBasePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) ServerBasePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBasePhysicalPortsPower</code> method in a fluent style.
   */
  public static class ServerBasePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public ServerBasePhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return ServerBasePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBasePhysicalPortsPowerExtendedResponse serverBasePhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>serverBasePhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBasePhysicalPortsPowerExtendedResponse> serverBasePhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBasePhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBasePhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBasePhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBasePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBasePhysicalPortsPowerExtendedResponse serverBasePhysicalPortsPowerExtended(@Param("elid") String elid, ServerBasePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) ServerBasePhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBasePhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBasePhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBasePhysicalPortsPowerExtendedResponse> serverBasePhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, ServerBasePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) ServerBasePhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBasePhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class ServerBasePhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public ServerBasePhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerBaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseQueryResponse serverBaseQuery(@Param("sessionId") String sessionId, ServerBaseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serverBaseQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseQueryResponse> serverBaseQueryWithHttpInfo(@Param("sessionId") String sessionId, ServerBaseQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBaseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseQueryResponse serverBaseQuery(ServerBaseQueryRequest body, @QueryMap(encoded=true) ServerBaseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBaseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseQueryResponse> serverBaseQueryWithHttpInfo(ServerBaseQueryRequest body, @QueryMap(encoded=true) ServerBaseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseQuery</code> method in a fluent style.
   */
  public static class ServerBaseQueryQueryParams extends HashMap<String, Object> {
    public ServerBaseQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerBaseQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseQueryExtendedResponse serverBaseQueryExtended(@Param("sessionId") String sessionId, ServerBaseQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>serverBaseQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseQueryExtendedResponse> serverBaseQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, ServerBaseQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data.
   * Note, this is equivalent to the other <code>serverBaseQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseQueryExtendedResponse serverBaseQueryExtended(ServerBaseQueryExtendedRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data.
  * Note, this is equivalent to the other <code>serverBaseQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseQueryExtendedResponse> serverBaseQueryExtendedWithHttpInfo(ServerBaseQueryExtendedRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseQueryExtended</code> method in a fluent style.
   */
  public static class ServerBaseQueryExtendedQueryParams extends HashMap<String, Object> {
    public ServerBaseQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerBaseQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseQueryExtendedGeoCoordinatesResponse serverBaseQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, ServerBaseQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>serverBaseQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseQueryExtendedGeoCoordinatesResponse> serverBaseQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, ServerBaseQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>serverBaseQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseQueryExtendedGeoCoordinatesResponse serverBaseQueryExtendedGeoCoordinates(ServerBaseQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>serverBaseQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseQueryExtendedGeoCoordinatesResponse> serverBaseQueryExtendedGeoCoordinatesWithHttpInfo(ServerBaseQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class ServerBaseQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public ServerBaseQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerBaseQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseQueryExtendedScrollFirstResponse serverBaseQueryExtendedScrollFirst(@Param("sessionId") String sessionId, ServerBaseQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>serverBaseQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseQueryExtendedScrollFirstResponse> serverBaseQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, ServerBaseQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>serverBaseQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseQueryExtendedScrollFirstResponse serverBaseQueryExtendedScrollFirst(ServerBaseQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>serverBaseQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseQueryExtendedScrollFirstResponse> serverBaseQueryExtendedScrollFirstWithHttpInfo(ServerBaseQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class ServerBaseQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public ServerBaseQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerBaseQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseQueryExtendedScrollMoreResponse serverBaseQueryExtendedScrollMore(@Param("sessionId") String sessionId, ServerBaseQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>serverBaseQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseQueryExtendedScrollMoreResponse> serverBaseQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, ServerBaseQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>serverBaseQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseQueryExtendedScrollMoreResponse serverBaseQueryExtendedScrollMore(ServerBaseQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>serverBaseQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseQueryExtendedScrollMoreResponse> serverBaseQueryExtendedScrollMoreWithHttpInfo(ServerBaseQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ServerBaseQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class ServerBaseQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public ServerBaseQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return ServerBaseServicesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseServicesResponse serverBaseServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>serverBaseServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseServicesResponse> serverBaseServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>serverBaseServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseServicesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseServicesResponse serverBaseServices(@Param("elid") String elid, ServerBaseServicesRequest body, @QueryMap(encoded=true) ServerBaseServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>serverBaseServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseServicesResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseServicesResponse> serverBaseServicesWithHttpInfo(@Param("elid") String elid, ServerBaseServicesRequest body, @QueryMap(encoded=true) ServerBaseServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseServices</code> method in a fluent style.
   */
  public static class ServerBaseServicesQueryParams extends HashMap<String, Object> {
    public ServerBaseServicesQueryParams sessionId(final String value) {
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
   * @return ServerBaseSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseSitesResponseData serverBaseSites(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>serverBaseSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseSitesResponseData> serverBaseSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>serverBaseSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseSitesResponseData serverBaseSites(@Param("elid") String elid, ServerBaseSitesRequestData body, @QueryMap(encoded=true) ServerBaseSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>serverBaseSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseSitesResponseData> serverBaseSitesWithHttpInfo(@Param("elid") String elid, ServerBaseSitesRequestData body, @QueryMap(encoded=true) ServerBaseSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseSites</code> method in a fluent style.
   */
  public static class ServerBaseSitesQueryParams extends HashMap<String, Object> {
    public ServerBaseSitesQueryParams sessionId(final String value) {
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
   * @return ServerBaseSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseSlotResponseData serverBaseSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>serverBaseSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseSlotResponseData> serverBaseSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed.
   * Note, this is equivalent to the other <code>serverBaseSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseSlotResponseData serverBaseSlot(@Param("elid") String elid, ServerBaseSlotRequestData body, @QueryMap(encoded=true) ServerBaseSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed.
  * Note, this is equivalent to the other <code>serverBaseSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseSlotResponseData> serverBaseSlotWithHttpInfo(@Param("elid") String elid, ServerBaseSlotRequestData body, @QueryMap(encoded=true) ServerBaseSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseSlot</code> method in a fluent style.
   */
  public static class ServerBaseSlotQueryParams extends HashMap<String, Object> {
    public ServerBaseSlotQueryParams sessionId(final String value) {
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
   * @return ServerBaseSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseSwitchCabinetResponseData serverBaseSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>serverBaseSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseSwitchCabinetResponseData> serverBaseSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>serverBaseSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseSwitchCabinetResponseData serverBaseSwitchCabinet(@Param("elid") String elid, ServerBaseSwitchCabinetRequestData body, @QueryMap(encoded=true) ServerBaseSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>serverBaseSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseSwitchCabinetResponseData> serverBaseSwitchCabinetWithHttpInfo(@Param("elid") String elid, ServerBaseSwitchCabinetRequestData body, @QueryMap(encoded=true) ServerBaseSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseSwitchCabinet</code> method in a fluent style.
   */
  public static class ServerBaseSwitchCabinetQueryParams extends HashMap<String, Object> {
    public ServerBaseSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return ServerBaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseSystemAttributesResponse serverBaseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serverBaseSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseSystemAttributesResponse> serverBaseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serverBaseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseSystemAttributesResponse serverBaseSystemAttributes(@Param("elid") String elid, ServerBaseSystemAttributesRequest body, @QueryMap(encoded=true) ServerBaseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serverBaseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseSystemAttributesResponse> serverBaseSystemAttributesWithHttpInfo(@Param("elid") String elid, ServerBaseSystemAttributesRequest body, @QueryMap(encoded=true) ServerBaseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseSystemAttributes</code> method in a fluent style.
   */
  public static class ServerBaseSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServerBaseSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServerBaseVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseVirtualSwitchesResponseData serverBaseVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>serverBaseVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseVirtualSwitchesResponseData> serverBaseVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>serverBaseVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseVirtualSwitchesResponseData serverBaseVirtualSwitches(@Param("elid") String elid, ServerBaseVirtualSwitchesRequestData body, @QueryMap(encoded=true) ServerBaseVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>serverBaseVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseVirtualSwitchesResponseData> serverBaseVirtualSwitchesWithHttpInfo(@Param("elid") String elid, ServerBaseVirtualSwitchesRequestData body, @QueryMap(encoded=true) ServerBaseVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseVirtualSwitches</code> method in a fluent style.
   */
  public static class ServerBaseVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public ServerBaseVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return ServerBaseVlansResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseVlansResponse serverBaseVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseVlansRequest body);

  /**
   * VLANs
   * Similar to <code>serverBaseVlans</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseVlansResponse> serverBaseVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseVlansRequest body);


  /**
   * VLANs
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBaseVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseVlansResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseVlansResponse serverBaseVlans(@Param("elid") String elid, ServerBaseVlansRequest body, @QueryMap(encoded=true) ServerBaseVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBaseVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseVlansResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseVlansResponse> serverBaseVlansWithHttpInfo(@Param("elid") String elid, ServerBaseVlansRequest body, @QueryMap(encoded=true) ServerBaseVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseVlans</code> method in a fluent style.
   */
  public static class ServerBaseVlansQueryParams extends HashMap<String, Object> {
    public ServerBaseVlansQueryParams sessionId(final String value) {
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
   * @return ServerBaseVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseVlansAtSlotResponse serverBaseVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>serverBaseVlansAtSlot</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseVlansAtSlotResponse> serverBaseVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serverBaseVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseVlansAtSlotResponse serverBaseVlansAtSlot(@Param("elid") String elid, ServerBaseVlansAtSlotRequest body, @QueryMap(encoded=true) ServerBaseVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serverBaseVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseVlansAtSlotResponse> serverBaseVlansAtSlotWithHttpInfo(@Param("elid") String elid, ServerBaseVlansAtSlotRequest body, @QueryMap(encoded=true) ServerBaseVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseVlansAtSlot</code> method in a fluent style.
   */
  public static class ServerBaseVlansAtSlotQueryParams extends HashMap<String, Object> {
    public ServerBaseVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return ServerBaseWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseWarehouseResponseData serverBaseWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>serverBaseWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseWarehouseResponseData> serverBaseWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>serverBaseWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseWarehouseResponseData serverBaseWarehouse(@Param("elid") String elid, ServerBaseWarehouseRequestData body, @QueryMap(encoded=true) ServerBaseWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>serverBaseWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseWarehouseResponseData> serverBaseWarehouseWithHttpInfo(@Param("elid") String elid, ServerBaseWarehouseRequestData body, @QueryMap(encoded=true) ServerBaseWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseWarehouse</code> method in a fluent style.
   */
  public static class ServerBaseWarehouseQueryParams extends HashMap<String, Object> {
    public ServerBaseWarehouseQueryParams sessionId(final String value) {
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
   * @return ServerBaseZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerBaseZoneResponseData serverBaseZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>serverBaseZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerBaseZoneResponseData> serverBaseZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerBaseZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>serverBaseZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerBaseZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerBaseZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerBaseZoneResponseData serverBaseZone(@Param("elid") String elid, ServerBaseZoneRequestData body, @QueryMap(encoded=true) ServerBaseZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>serverBaseZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerBaseZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerBaseZoneResponseData> serverBaseZoneWithHttpInfo(@Param("elid") String elid, ServerBaseZoneRequestData body, @QueryMap(encoded=true) ServerBaseZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverBaseZone</code> method in a fluent style.
   */
  public static class ServerBaseZoneQueryParams extends HashMap<String, Object> {
    public ServerBaseZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServerBaseResponse updateServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServerBaseRequestData body);

  /**
   * Modify
   * Similar to <code>updateServerBase</code> but it also returns the http response headers .
   * Modify Server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServerBaseResponse> updateServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServerBaseRequestData body);


  /**
   * Modify
   * Modify Server
   * Note, this is equivalent to the other <code>updateServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServerBaseResponse updateServerBase(@Param("elid") String elid, UpdateServerBaseRequestData body, @QueryMap(encoded=true) UpdateServerBaseQueryParams queryParams);

  /**
  * Modify
  * Modify Server
  * Note, this is equivalent to the other <code>updateServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServerBaseResponse> updateServerBaseWithHttpInfo(@Param("elid") String elid, UpdateServerBaseRequestData body, @QueryMap(encoded=true) UpdateServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServerBase</code> method in a fluent style.
   */
  public static class UpdateServerBaseQueryParams extends HashMap<String, Object> {
    public UpdateServerBaseQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServerBaseResponse updateSystemAttributesServerBase(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServerBaseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServerBase</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServerBaseResponse> updateSystemAttributesServerBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServerBaseRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServerBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServerBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServerBaseResponse
   */
  @RequestLine("POST /api/rest/entity/serverBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServerBaseResponse updateSystemAttributesServerBase(@Param("elid") String elid, UpdateSystemAttributesServerBaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServerBaseQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServerBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServerBaseResponse
      */
      @RequestLine("POST /api/rest/entity/serverBase/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServerBaseResponse> updateSystemAttributesServerBaseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServerBaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServerBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServerBase</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServerBaseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServerBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
