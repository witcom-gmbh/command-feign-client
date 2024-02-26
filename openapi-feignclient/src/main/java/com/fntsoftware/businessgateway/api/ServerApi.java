package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeServerRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeServerResponse;
import com.fntsoftware.businessgateway.entities.DeleteServerRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServerResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetServerRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetServerResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotServerRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotServerResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseServerRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseServerResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneServerRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneServerResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetServerRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetServerResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotServerRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotServerResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseServerRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseServerResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneServerRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneServerResponse;
import com.fntsoftware.businessgateway.entities.Server100030RequestData;
import com.fntsoftware.businessgateway.entities.Server100030ResponseData;
import com.fntsoftware.businessgateway.entities.Server100036RequestData;
import com.fntsoftware.businessgateway.entities.Server100036ResponseData;
import com.fntsoftware.businessgateway.entities.ServerContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerCustomStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.ServerCustomStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.ServerDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServerDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServerDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServerDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServerDrivesRequestData;
import com.fntsoftware.businessgateway.entities.ServerDrivesResponseData;
import com.fntsoftware.businessgateway.entities.ServerFailoverClustersRequestData;
import com.fntsoftware.businessgateway.entities.ServerFailoverClustersResponseData;
import com.fntsoftware.businessgateway.entities.ServerFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.ServerFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.ServerFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerHardDisksRequestData;
import com.fntsoftware.businessgateway.entities.ServerHardDisksResponseData;
import com.fntsoftware.businessgateway.entities.ServerInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.ServerInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.ServerInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.ServerInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.ServerIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.ServerIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.ServerIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.ServerIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.ServerIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.ServerIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.ServerIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.ServerIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.ServerLocationRequest;
import com.fntsoftware.businessgateway.entities.ServerLocationResponse;
import com.fntsoftware.businessgateway.entities.ServerLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.ServerLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.ServerMainMemoryRequestData;
import com.fntsoftware.businessgateway.entities.ServerMainMemoryResponseData;
import com.fntsoftware.businessgateway.entities.ServerMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.ServerMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.ServerModemsRequestData;
import com.fntsoftware.businessgateway.entities.ServerModemsResponseData;
import com.fntsoftware.businessgateway.entities.ServerNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.ServerNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.ServerOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.ServerOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.ServerOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServerOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServerPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServerPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServerPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServerPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServerPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.ServerPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.ServerPhysicalPortsPowerRequest;
import com.fntsoftware.businessgateway.entities.ServerPhysicalPortsPowerResponse;
import com.fntsoftware.businessgateway.entities.ServerPluginCardsRequestData;
import com.fntsoftware.businessgateway.entities.ServerPluginCardsResponseData;
import com.fntsoftware.businessgateway.entities.ServerProcessorsRequestData;
import com.fntsoftware.businessgateway.entities.ServerProcessorsResponseData;
import com.fntsoftware.businessgateway.entities.ServerQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.ServerQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.ServerQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.ServerQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.ServerQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.ServerQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.ServerQueryRequest;
import com.fntsoftware.businessgateway.entities.ServerQueryResponse;
import com.fntsoftware.businessgateway.entities.ServerRaidControllersRequestData;
import com.fntsoftware.businessgateway.entities.ServerRaidControllersResponseData;
import com.fntsoftware.businessgateway.entities.ServerServerfarmsRequestData;
import com.fntsoftware.businessgateway.entities.ServerServerfarmsResponseData;
import com.fntsoftware.businessgateway.entities.ServerSlotRequestData;
import com.fntsoftware.businessgateway.entities.ServerSlotResponseData;
import com.fntsoftware.businessgateway.entities.ServerSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.ServerSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.ServerSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.ServerSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.ServerSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServerSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServerVirtualClientsRequestData;
import com.fntsoftware.businessgateway.entities.ServerVirtualClientsResponseData;
import com.fntsoftware.businessgateway.entities.ServerVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.ServerVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.ServerVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.ServerVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.ServerVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.ServerVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.ServerVlansRequest;
import com.fntsoftware.businessgateway.entities.ServerVlansResponse;
import com.fntsoftware.businessgateway.entities.ServerWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.ServerWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.ServerZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServerZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServerApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeServerResponse changeTypeServer(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeServerRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeServerResponse> changeTypeServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeServerRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeServerResponse changeTypeServer(@Param("elid") String elid, ChangeTypeServerRequestData body, @QueryMap(encoded=true) ChangeTypeServerQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeServerResponse> changeTypeServerWithHttpInfo(@Param("elid") String elid, ChangeTypeServerRequestData body, @QueryMap(encoded=true) ChangeTypeServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeServer</code> method in a fluent style.
   */
  public static class ChangeTypeServerQueryParams extends HashMap<String, Object> {
    public ChangeTypeServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServerResponse deleteServer(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServerRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServer</code> but it also returns the http response headers .
   * Delete server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServerResponse> deleteServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServerRequestData body);


  /**
   * Delete
   * Delete server
   * Note, this is equivalent to the other <code>deleteServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServerResponse deleteServer(@Param("elid") String elid, DeleteServerRequestData body, @QueryMap(encoded=true) DeleteServerQueryParams queryParams);

  /**
  * Delete
  * Delete server
  * Note, this is equivalent to the other <code>deleteServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServerResponse> deleteServerWithHttpInfo(@Param("elid") String elid, DeleteServerRequestData body, @QueryMap(encoded=true) DeleteServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServer</code> method in a fluent style.
   */
  public static class DeleteServerQueryParams extends HashMap<String, Object> {
    public DeleteServerQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetServerResponse moveToCabinetServer(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetServerRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetServer</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetServerResponse> moveToCabinetServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetServerRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetServerResponse moveToCabinetServer(@Param("elid") String elid, MoveToCabinetServerRequestData body, @QueryMap(encoded=true) MoveToCabinetServerQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetServerResponse> moveToCabinetServerWithHttpInfo(@Param("elid") String elid, MoveToCabinetServerRequestData body, @QueryMap(encoded=true) MoveToCabinetServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetServer</code> method in a fluent style.
   */
  public static class MoveToCabinetServerQueryParams extends HashMap<String, Object> {
    public MoveToCabinetServerQueryParams sessionId(final String value) {
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
   * @return MoveToSlotServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotServerResponse moveToSlotServer(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotServerRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotServer</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotServerResponse> moveToSlotServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotServerRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotServerResponse moveToSlotServer(@Param("elid") String elid, MoveToSlotServerRequestData body, @QueryMap(encoded=true) MoveToSlotServerQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotServerResponse> moveToSlotServerWithHttpInfo(@Param("elid") String elid, MoveToSlotServerRequestData body, @QueryMap(encoded=true) MoveToSlotServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotServer</code> method in a fluent style.
   */
  public static class MoveToSlotServerQueryParams extends HashMap<String, Object> {
    public MoveToSlotServerQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseServerResponse moveToWarehouseServer(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseServerRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseServerResponse> moveToWarehouseServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseServerRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseServerResponse moveToWarehouseServer(@Param("elid") String elid, MoveToWarehouseServerRequestData body, @QueryMap(encoded=true) MoveToWarehouseServerQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseServerResponse> moveToWarehouseServerWithHttpInfo(@Param("elid") String elid, MoveToWarehouseServerRequestData body, @QueryMap(encoded=true) MoveToWarehouseServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseServer</code> method in a fluent style.
   */
  public static class MoveToWarehouseServerQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseServerQueryParams sessionId(final String value) {
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
   * @return MoveToZoneServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneServerResponse moveToZoneServer(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneServerRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneServer</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneServerResponse> moveToZoneServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneServerRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneServerResponse moveToZoneServer(@Param("elid") String elid, MoveToZoneServerRequestData body, @QueryMap(encoded=true) MoveToZoneServerQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneServerResponse> moveToZoneServerWithHttpInfo(@Param("elid") String elid, MoveToZoneServerRequestData body, @QueryMap(encoded=true) MoveToZoneServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneServer</code> method in a fluent style.
   */
  public static class MoveToZoneServerQueryParams extends HashMap<String, Object> {
    public MoveToZoneServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetServerResponse placeInCabinetServer(@Param("sessionId") String sessionId, PlaceInCabinetServerRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetServer</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetServerResponse> placeInCabinetServerWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetServerRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetServerResponse placeInCabinetServer(PlaceInCabinetServerRequestData body, @QueryMap(encoded=true) PlaceInCabinetServerQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetServerResponse> placeInCabinetServerWithHttpInfo(PlaceInCabinetServerRequestData body, @QueryMap(encoded=true) PlaceInCabinetServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetServer</code> method in a fluent style.
   */
  public static class PlaceInCabinetServerQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotServerResponse placeInSlotServer(@Param("sessionId") String sessionId, PlaceInSlotServerRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotServer</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotServerResponse> placeInSlotServerWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotServerRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotServerResponse placeInSlotServer(PlaceInSlotServerRequestData body, @QueryMap(encoded=true) PlaceInSlotServerQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotServerResponse> placeInSlotServerWithHttpInfo(PlaceInSlotServerRequestData body, @QueryMap(encoded=true) PlaceInSlotServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotServer</code> method in a fluent style.
   */
  public static class PlaceInSlotServerQueryParams extends HashMap<String, Object> {
    public PlaceInSlotServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseServerResponse placeInWarehouseServer(@Param("sessionId") String sessionId, PlaceInWarehouseServerRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseServer</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseServerResponse> placeInWarehouseServerWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseServerRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseServerResponse placeInWarehouseServer(PlaceInWarehouseServerRequestData body, @QueryMap(encoded=true) PlaceInWarehouseServerQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseServerResponse> placeInWarehouseServerWithHttpInfo(PlaceInWarehouseServerRequestData body, @QueryMap(encoded=true) PlaceInWarehouseServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseServer</code> method in a fluent style.
   */
  public static class PlaceInWarehouseServerQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneServerResponse placeInZoneServer(@Param("sessionId") String sessionId, PlaceInZoneServerRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneServer</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneServerResponse> placeInZoneServerWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneServerRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneServerResponse placeInZoneServer(PlaceInZoneServerRequestData body, @QueryMap(encoded=true) PlaceInZoneServerQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneServerResponse> placeInZoneServerWithHttpInfo(PlaceInZoneServerRequestData body, @QueryMap(encoded=true) PlaceInZoneServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneServer</code> method in a fluent style.
   */
  public static class PlaceInZoneServerQueryParams extends HashMap<String, Object> {
    public PlaceInZoneServerQueryParams sessionId(final String value) {
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
   * @return Server100030ResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/100030?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Server100030ResponseData server100030(@Param("sessionId") String sessionId, @Param("elid") String elid, Server100030RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>server100030</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/100030?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Server100030ResponseData> server100030WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Server100030RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>server100030</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Server100030QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Server100030ResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/100030?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Server100030ResponseData server100030(@Param("elid") String elid, Server100030RequestData body, @QueryMap(encoded=true) Server100030QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>server100030</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Server100030ResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/100030?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Server100030ResponseData> server100030WithHttpInfo(@Param("elid") String elid, Server100030RequestData body, @QueryMap(encoded=true) Server100030QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>server100030</code> method in a fluent style.
   */
  public static class Server100030QueryParams extends HashMap<String, Object> {
    public Server100030QueryParams sessionId(final String value) {
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
   * @return Server100036ResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/100036?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Server100036ResponseData server100036(@Param("sessionId") String sessionId, @Param("elid") String elid, Server100036RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>server100036</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/100036?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Server100036ResponseData> server100036WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Server100036RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>server100036</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Server100036QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Server100036ResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/100036?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Server100036ResponseData server100036(@Param("elid") String elid, Server100036RequestData body, @QueryMap(encoded=true) Server100036QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>server100036</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Server100036ResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/100036?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Server100036ResponseData> server100036WithHttpInfo(@Param("elid") String elid, Server100036RequestData body, @QueryMap(encoded=true) Server100036QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>server100036</code> method in a fluent style.
   */
  public static class Server100036QueryParams extends HashMap<String, Object> {
    public Server100036QueryParams sessionId(final String value) {
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
   * @return ServerContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerContractsResponseData serverContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serverContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerContractsResponseData> serverContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serverContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerContractsResponseData serverContracts(@Param("elid") String elid, ServerContractsRequestData body, @QueryMap(encoded=true) ServerContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serverContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerContractsResponseData> serverContractsWithHttpInfo(@Param("elid") String elid, ServerContractsRequestData body, @QueryMap(encoded=true) ServerContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverContracts</code> method in a fluent style.
   */
  public static class ServerContractsQueryParams extends HashMap<String, Object> {
    public ServerContractsQueryParams sessionId(final String value) {
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
   * @return ServerCustomStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/CustomStorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerCustomStorageUnitsResponseData serverCustomStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerCustomStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>serverCustomStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/CustomStorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerCustomStorageUnitsResponseData> serverCustomStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerCustomStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>serverCustomStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerCustomStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerCustomStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/CustomStorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerCustomStorageUnitsResponseData serverCustomStorageUnits(@Param("elid") String elid, ServerCustomStorageUnitsRequestData body, @QueryMap(encoded=true) ServerCustomStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>serverCustomStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerCustomStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/CustomStorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerCustomStorageUnitsResponseData> serverCustomStorageUnitsWithHttpInfo(@Param("elid") String elid, ServerCustomStorageUnitsRequestData body, @QueryMap(encoded=true) ServerCustomStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverCustomStorageUnits</code> method in a fluent style.
   */
  public static class ServerCustomStorageUnitsQueryParams extends HashMap<String, Object> {
    public ServerCustomStorageUnitsQueryParams sessionId(final String value) {
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
   * @return ServerDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerDeviceMasterResponseData serverDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serverDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerDeviceMasterResponseData> serverDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serverDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerDeviceMasterResponseData serverDeviceMaster(@Param("elid") String elid, ServerDeviceMasterRequestData body, @QueryMap(encoded=true) ServerDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serverDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerDeviceMasterResponseData> serverDeviceMasterWithHttpInfo(@Param("elid") String elid, ServerDeviceMasterRequestData body, @QueryMap(encoded=true) ServerDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverDeviceMaster</code> method in a fluent style.
   */
  public static class ServerDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServerDeviceMasterQueryParams sessionId(final String value) {
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
   * @return ServerDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerDevicesAllResponseData serverDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serverDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerDevicesAllResponseData> serverDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serverDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerDevicesAllResponseData serverDevicesAll(@Param("elid") String elid, ServerDevicesAllRequestData body, @QueryMap(encoded=true) ServerDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serverDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerDevicesAllResponseData> serverDevicesAllWithHttpInfo(@Param("elid") String elid, ServerDevicesAllRequestData body, @QueryMap(encoded=true) ServerDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverDevicesAll</code> method in a fluent style.
   */
  public static class ServerDevicesAllQueryParams extends HashMap<String, Object> {
    public ServerDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServerDrivesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Drives?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerDrivesResponseData serverDrives(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerDrivesRequestData body);

  /**
   * Get relations to Drive entities
   * Similar to <code>serverDrives</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Drives?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerDrivesResponseData> serverDrivesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerDrivesRequestData body);


  /**
   * Get relations to Drive entities
   * 
   * Note, this is equivalent to the other <code>serverDrives</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerDrivesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerDrivesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Drives?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerDrivesResponseData serverDrives(@Param("elid") String elid, ServerDrivesRequestData body, @QueryMap(encoded=true) ServerDrivesQueryParams queryParams);

  /**
  * Get relations to Drive entities
  * 
  * Note, this is equivalent to the other <code>serverDrives</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerDrivesResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Drives?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerDrivesResponseData> serverDrivesWithHttpInfo(@Param("elid") String elid, ServerDrivesRequestData body, @QueryMap(encoded=true) ServerDrivesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverDrives</code> method in a fluent style.
   */
  public static class ServerDrivesQueryParams extends HashMap<String, Object> {
    public ServerDrivesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Failover Cluster entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerFailoverClustersResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerFailoverClustersResponseData serverFailoverClusters(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerFailoverClustersRequestData body);

  /**
   * Get relations to Failover Cluster entities
   * Similar to <code>serverFailoverClusters</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerFailoverClustersResponseData> serverFailoverClustersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerFailoverClustersRequestData body);


  /**
   * Get relations to Failover Cluster entities
   * 
   * Note, this is equivalent to the other <code>serverFailoverClusters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerFailoverClustersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerFailoverClustersResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FailoverClusters?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerFailoverClustersResponseData serverFailoverClusters(@Param("elid") String elid, ServerFailoverClustersRequestData body, @QueryMap(encoded=true) ServerFailoverClustersQueryParams queryParams);

  /**
  * Get relations to Failover Cluster entities
  * 
  * Note, this is equivalent to the other <code>serverFailoverClusters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerFailoverClustersResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/FailoverClusters?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerFailoverClustersResponseData> serverFailoverClustersWithHttpInfo(@Param("elid") String elid, ServerFailoverClustersRequestData body, @QueryMap(encoded=true) ServerFailoverClustersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverFailoverClusters</code> method in a fluent style.
   */
  public static class ServerFailoverClustersQueryParams extends HashMap<String, Object> {
    public ServerFailoverClustersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to File system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerFileSystemsResponseData serverFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>serverFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerFileSystemsResponseData> serverFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>serverFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerFileSystemsResponseData serverFileSystems(@Param("elid") String elid, ServerFileSystemsRequestData body, @QueryMap(encoded=true) ServerFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>serverFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerFileSystemsResponseData> serverFileSystemsWithHttpInfo(@Param("elid") String elid, ServerFileSystemsRequestData body, @QueryMap(encoded=true) ServerFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverFileSystems</code> method in a fluent style.
   */
  public static class ServerFileSystemsQueryParams extends HashMap<String, Object> {
    public ServerFileSystemsQueryParams sessionId(final String value) {
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
   * @return ServerFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerFrameContractsResponseData serverFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serverFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerFrameContractsResponseData> serverFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serverFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerFrameContractsResponseData serverFrameContracts(@Param("elid") String elid, ServerFrameContractsRequestData body, @QueryMap(encoded=true) ServerFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serverFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerFrameContractsResponseData> serverFrameContractsWithHttpInfo(@Param("elid") String elid, ServerFrameContractsRequestData body, @QueryMap(encoded=true) ServerFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverFrameContracts</code> method in a fluent style.
   */
  public static class ServerFrameContractsQueryParams extends HashMap<String, Object> {
    public ServerFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServerHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerHardDisksResponseData serverHardDisks(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerHardDisksRequestData body);

  /**
   * Get relations to Hard disk entities
   * Similar to <code>serverHardDisks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerHardDisksResponseData> serverHardDisksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerHardDisksRequestData body);


  /**
   * Get relations to Hard disk entities
   * 
   * Note, this is equivalent to the other <code>serverHardDisks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerHardDisksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerHardDisksResponseData serverHardDisks(@Param("elid") String elid, ServerHardDisksRequestData body, @QueryMap(encoded=true) ServerHardDisksQueryParams queryParams);

  /**
  * Get relations to Hard disk entities
  * 
  * Note, this is equivalent to the other <code>serverHardDisks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerHardDisksResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/HardDisks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerHardDisksResponseData> serverHardDisksWithHttpInfo(@Param("elid") String elid, ServerHardDisksRequestData body, @QueryMap(encoded=true) ServerHardDisksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverHardDisks</code> method in a fluent style.
   */
  public static class ServerHardDisksQueryParams extends HashMap<String, Object> {
    public ServerHardDisksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query installed subcards
   * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerInstalledSubCardsResponse serverInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>serverInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerInstalledSubCardsResponse> serverInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>serverInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerInstalledSubCardsResponse serverInstalledSubCards(@Param("elid") String elid, ServerInstalledSubCardsRequest body, @QueryMap(encoded=true) ServerInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>serverInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerInstalledSubCardsResponse> serverInstalledSubCardsWithHttpInfo(@Param("elid") String elid, ServerInstalledSubCardsRequest body, @QueryMap(encoded=true) ServerInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverInstalledSubCards</code> method in a fluent style.
   */
  public static class ServerInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public ServerInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return ServerInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerInterfacesResponseData serverInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>serverInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerInterfacesResponseData> serverInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>serverInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerInterfacesResponseData serverInterfaces(@Param("elid") String elid, ServerInterfacesRequestData body, @QueryMap(encoded=true) ServerInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>serverInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerInterfacesResponseData> serverInterfacesWithHttpInfo(@Param("elid") String elid, ServerInterfacesRequestData body, @QueryMap(encoded=true) ServerInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverInterfaces</code> method in a fluent style.
   */
  public static class ServerInterfacesQueryParams extends HashMap<String, Object> {
    public ServerInterfacesQueryParams sessionId(final String value) {
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
   * @return ServerIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerIpAddressesResponse serverIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>serverIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerIpAddressesResponse> serverIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serverIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerIpAddressesResponse serverIpAddresses(@Param("elid") String elid, ServerIpAddressesRequest body, @QueryMap(encoded=true) ServerIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serverIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerIpAddressesResponse> serverIpAddressesWithHttpInfo(@Param("elid") String elid, ServerIpAddressesRequest body, @QueryMap(encoded=true) ServerIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverIpAddresses</code> method in a fluent style.
   */
  public static class ServerIpAddressesQueryParams extends HashMap<String, Object> {
    public ServerIpAddressesQueryParams sessionId(final String value) {
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
   * @return ServerIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerIpv4AddressesResponseData serverIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>serverIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerIpv4AddressesResponseData> serverIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>serverIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerIpv4AddressesResponseData serverIpv4Addresses(@Param("elid") String elid, ServerIpv4AddressesRequestData body, @QueryMap(encoded=true) ServerIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>serverIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerIpv4AddressesResponseData> serverIpv4AddressesWithHttpInfo(@Param("elid") String elid, ServerIpv4AddressesRequestData body, @QueryMap(encoded=true) ServerIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverIpv4Addresses</code> method in a fluent style.
   */
  public static class ServerIpv4AddressesQueryParams extends HashMap<String, Object> {
    public ServerIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return ServerIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerIpv4NetrangesResponseData serverIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>serverIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerIpv4NetrangesResponseData> serverIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>serverIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerIpv4NetrangesResponseData serverIpv4Netranges(@Param("elid") String elid, ServerIpv4NetrangesRequestData body, @QueryMap(encoded=true) ServerIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>serverIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerIpv4NetrangesResponseData> serverIpv4NetrangesWithHttpInfo(@Param("elid") String elid, ServerIpv4NetrangesRequestData body, @QueryMap(encoded=true) ServerIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverIpv4Netranges</code> method in a fluent style.
   */
  public static class ServerIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public ServerIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return ServerIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerIpv4NetworksResponseData serverIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>serverIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerIpv4NetworksResponseData> serverIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>serverIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerIpv4NetworksResponseData serverIpv4Networks(@Param("elid") String elid, ServerIpv4NetworksRequestData body, @QueryMap(encoded=true) ServerIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>serverIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerIpv4NetworksResponseData> serverIpv4NetworksWithHttpInfo(@Param("elid") String elid, ServerIpv4NetworksRequestData body, @QueryMap(encoded=true) ServerIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverIpv4Networks</code> method in a fluent style.
   */
  public static class ServerIpv4NetworksQueryParams extends HashMap<String, Object> {
    public ServerIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return ServerLocationResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerLocationResponse serverLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerLocationRequest body);

  /**
   * Location
   * Similar to <code>serverLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerLocationResponse> serverLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>serverLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerLocationResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerLocationResponse serverLocation(@Param("elid") String elid, ServerLocationRequest body, @QueryMap(encoded=true) ServerLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>serverLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerLocationResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerLocationResponse> serverLocationWithHttpInfo(@Param("elid") String elid, ServerLocationRequest body, @QueryMap(encoded=true) ServerLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverLocation</code> method in a fluent style.
   */
  public static class ServerLocationQueryParams extends HashMap<String, Object> {
    public ServerLocationQueryParams sessionId(final String value) {
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
   * @return ServerLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerLogicalPortsResponseData serverLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>serverLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerLogicalPortsResponseData> serverLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>serverLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerLogicalPortsResponseData serverLogicalPorts(@Param("elid") String elid, ServerLogicalPortsRequestData body, @QueryMap(encoded=true) ServerLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>serverLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerLogicalPortsResponseData> serverLogicalPortsWithHttpInfo(@Param("elid") String elid, ServerLogicalPortsRequestData body, @QueryMap(encoded=true) ServerLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverLogicalPorts</code> method in a fluent style.
   */
  public static class ServerLogicalPortsQueryParams extends HashMap<String, Object> {
    public ServerLogicalPortsQueryParams sessionId(final String value) {
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
   * @return ServerMainMemoryResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MainMemory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerMainMemoryResponseData serverMainMemory(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerMainMemoryRequestData body);

  /**
   * Get relations to Main memory entities
   * Similar to <code>serverMainMemory</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MainMemory?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerMainMemoryResponseData> serverMainMemoryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerMainMemoryRequestData body);


  /**
   * Get relations to Main memory entities
   * 
   * Note, this is equivalent to the other <code>serverMainMemory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerMainMemoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerMainMemoryResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MainMemory?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerMainMemoryResponseData serverMainMemory(@Param("elid") String elid, ServerMainMemoryRequestData body, @QueryMap(encoded=true) ServerMainMemoryQueryParams queryParams);

  /**
  * Get relations to Main memory entities
  * 
  * Note, this is equivalent to the other <code>serverMainMemory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerMainMemoryResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/MainMemory?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerMainMemoryResponseData> serverMainMemoryWithHttpInfo(@Param("elid") String elid, ServerMainMemoryRequestData body, @QueryMap(encoded=true) ServerMainMemoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverMainMemory</code> method in a fluent style.
   */
  public static class ServerMainMemoryQueryParams extends HashMap<String, Object> {
    public ServerMainMemoryQueryParams sessionId(final String value) {
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
   * @return ServerMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerMaintenanceContractsResponseData serverMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serverMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerMaintenanceContractsResponseData> serverMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serverMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerMaintenanceContractsResponseData serverMaintenanceContracts(@Param("elid") String elid, ServerMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServerMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serverMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerMaintenanceContractsResponseData> serverMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServerMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServerMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServerMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServerMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServerMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerMaintenanceWindowsResponseData serverMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>serverMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerMaintenanceWindowsResponseData> serverMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>serverMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerMaintenanceWindowsResponseData serverMaintenanceWindows(@Param("elid") String elid, ServerMaintenanceWindowsRequestData body, @QueryMap(encoded=true) ServerMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>serverMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerMaintenanceWindowsResponseData> serverMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, ServerMaintenanceWindowsRequestData body, @QueryMap(encoded=true) ServerMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverMaintenanceWindows</code> method in a fluent style.
   */
  public static class ServerMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public ServerMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return ServerModemsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Modems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerModemsResponseData serverModems(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerModemsRequestData body);

  /**
   * Get relations to Modem entities
   * Similar to <code>serverModems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Modems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerModemsResponseData> serverModemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerModemsRequestData body);


  /**
   * Get relations to Modem entities
   * 
   * Note, this is equivalent to the other <code>serverModems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerModemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerModemsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Modems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerModemsResponseData serverModems(@Param("elid") String elid, ServerModemsRequestData body, @QueryMap(encoded=true) ServerModemsQueryParams queryParams);

  /**
  * Get relations to Modem entities
  * 
  * Note, this is equivalent to the other <code>serverModems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerModemsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Modems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerModemsResponseData> serverModemsWithHttpInfo(@Param("elid") String elid, ServerModemsRequestData body, @QueryMap(encoded=true) ServerModemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverModems</code> method in a fluent style.
   */
  public static class ServerModemsQueryParams extends HashMap<String, Object> {
    public ServerModemsQueryParams sessionId(final String value) {
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
   * @return ServerNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerNetworksAndNetrangesResponse serverNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>serverNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerNetworksAndNetrangesResponse> serverNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serverNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerNetworksAndNetrangesResponse serverNetworksAndNetranges(@Param("elid") String elid, ServerNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ServerNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serverNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerNetworksAndNetrangesResponse> serverNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, ServerNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ServerNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverNetworksAndNetranges</code> method in a fluent style.
   */
  public static class ServerNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public ServerNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return ServerOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerOperatingSystemInstallationResponseData serverOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>serverOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerOperatingSystemInstallationResponseData> serverOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>serverOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerOperatingSystemInstallationResponseData serverOperatingSystemInstallation(@Param("elid") String elid, ServerOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ServerOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>serverOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerOperatingSystemInstallationResponseData> serverOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, ServerOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ServerOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class ServerOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public ServerOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return ServerOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerOrganizationsResponseData serverOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serverOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerOrganizationsResponseData> serverOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serverOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerOrganizationsResponseData serverOrganizations(@Param("elid") String elid, ServerOrganizationsRequestData body, @QueryMap(encoded=true) ServerOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serverOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerOrganizationsResponseData> serverOrganizationsWithHttpInfo(@Param("elid") String elid, ServerOrganizationsRequestData body, @QueryMap(encoded=true) ServerOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverOrganizations</code> method in a fluent style.
   */
  public static class ServerOrganizationsQueryParams extends HashMap<String, Object> {
    public ServerOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServerPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerPersonGroupsResponseData serverPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serverPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerPersonGroupsResponseData> serverPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serverPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerPersonGroupsResponseData serverPersonGroups(@Param("elid") String elid, ServerPersonGroupsRequestData body, @QueryMap(encoded=true) ServerPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serverPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerPersonGroupsResponseData> serverPersonGroupsWithHttpInfo(@Param("elid") String elid, ServerPersonGroupsRequestData body, @QueryMap(encoded=true) ServerPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverPersonGroups</code> method in a fluent style.
   */
  public static class ServerPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServerPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServerPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerPersonsResponseData serverPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serverPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerPersonsResponseData> serverPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serverPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerPersonsResponseData serverPersons(@Param("elid") String elid, ServerPersonsRequestData body, @QueryMap(encoded=true) ServerPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serverPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerPersonsResponseData> serverPersonsWithHttpInfo(@Param("elid") String elid, ServerPersonsRequestData body, @QueryMap(encoded=true) ServerPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverPersons</code> method in a fluent style.
   */
  public static class ServerPersonsQueryParams extends HashMap<String, Object> {
    public ServerPersonsQueryParams sessionId(final String value) {
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
   * @return ServerPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerPhysicalPortsDataResponseData serverPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>serverPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerPhysicalPortsDataResponseData> serverPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>serverPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerPhysicalPortsDataResponseData serverPhysicalPortsData(@Param("elid") String elid, ServerPhysicalPortsDataRequestData body, @QueryMap(encoded=true) ServerPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>serverPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerPhysicalPortsDataResponseData> serverPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, ServerPhysicalPortsDataRequestData body, @QueryMap(encoded=true) ServerPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverPhysicalPortsData</code> method in a fluent style.
   */
  public static class ServerPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public ServerPhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return ServerPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerPhysicalPortsPowerResponse serverPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPhysicalPortsPowerRequest body);

  /**
   * Query Power ports
   * Similar to <code>serverPhysicalPortsPower</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerPhysicalPortsPowerResponse> serverPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPhysicalPortsPowerRequest body);


  /**
   * Query Power ports
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serverPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerPhysicalPortsPowerResponse serverPhysicalPortsPower(@Param("elid") String elid, ServerPhysicalPortsPowerRequest body, @QueryMap(encoded=true) ServerPhysicalPortsPowerQueryParams queryParams);

  /**
  * Query Power ports
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serverPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerPhysicalPortsPowerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerPhysicalPortsPowerResponse> serverPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, ServerPhysicalPortsPowerRequest body, @QueryMap(encoded=true) ServerPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverPhysicalPortsPower</code> method in a fluent style.
   */
  public static class ServerPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public ServerPhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return ServerPluginCardsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PluginCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerPluginCardsResponseData serverPluginCards(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPluginCardsRequestData body);

  /**
   * Get relations to Plugin card entities
   * Similar to <code>serverPluginCards</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PluginCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerPluginCardsResponseData> serverPluginCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerPluginCardsRequestData body);


  /**
   * Get relations to Plugin card entities
   * 
   * Note, this is equivalent to the other <code>serverPluginCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerPluginCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerPluginCardsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/PluginCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerPluginCardsResponseData serverPluginCards(@Param("elid") String elid, ServerPluginCardsRequestData body, @QueryMap(encoded=true) ServerPluginCardsQueryParams queryParams);

  /**
  * Get relations to Plugin card entities
  * 
  * Note, this is equivalent to the other <code>serverPluginCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerPluginCardsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/PluginCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerPluginCardsResponseData> serverPluginCardsWithHttpInfo(@Param("elid") String elid, ServerPluginCardsRequestData body, @QueryMap(encoded=true) ServerPluginCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverPluginCards</code> method in a fluent style.
   */
  public static class ServerPluginCardsQueryParams extends HashMap<String, Object> {
    public ServerPluginCardsQueryParams sessionId(final String value) {
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
   * @return ServerProcessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Processors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerProcessorsResponseData serverProcessors(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerProcessorsRequestData body);

  /**
   * Get relations to Processor entities
   * Similar to <code>serverProcessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Processors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerProcessorsResponseData> serverProcessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerProcessorsRequestData body);


  /**
   * Get relations to Processor entities
   * 
   * Note, this is equivalent to the other <code>serverProcessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerProcessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerProcessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Processors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerProcessorsResponseData serverProcessors(@Param("elid") String elid, ServerProcessorsRequestData body, @QueryMap(encoded=true) ServerProcessorsQueryParams queryParams);

  /**
  * Get relations to Processor entities
  * 
  * Note, this is equivalent to the other <code>serverProcessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerProcessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Processors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerProcessorsResponseData> serverProcessorsWithHttpInfo(@Param("elid") String elid, ServerProcessorsRequestData body, @QueryMap(encoded=true) ServerProcessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverProcessors</code> method in a fluent style.
   */
  public static class ServerProcessorsQueryParams extends HashMap<String, Object> {
    public ServerProcessorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/server/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerQueryResponse serverQuery(@Param("sessionId") String sessionId, ServerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serverQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerQueryResponse> serverQueryWithHttpInfo(@Param("sessionId") String sessionId, ServerQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serverQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/server/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerQueryResponse serverQuery(ServerQueryRequest body, @QueryMap(encoded=true) ServerQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serverQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/server/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerQueryResponse> serverQueryWithHttpInfo(ServerQueryRequest body, @QueryMap(encoded=true) ServerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverQuery</code> method in a fluent style.
   */
  public static class ServerQueryQueryParams extends HashMap<String, Object> {
    public ServerQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/server/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerQueryExtendedResponse serverQueryExtended(@Param("sessionId") String sessionId, ServerQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>serverQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerQueryExtendedResponse> serverQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, ServerQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>serverQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/server/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerQueryExtendedResponse serverQueryExtended(ServerQueryExtendedRequest body, @QueryMap(encoded=true) ServerQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>serverQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/server/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerQueryExtendedResponse> serverQueryExtendedWithHttpInfo(ServerQueryExtendedRequest body, @QueryMap(encoded=true) ServerQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverQueryExtended</code> method in a fluent style.
   */
  public static class ServerQueryExtendedQueryParams extends HashMap<String, Object> {
    public ServerQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/server/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerQueryExtendedScrollFirstResponse serverQueryExtendedScrollFirst(@Param("sessionId") String sessionId, ServerQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>serverQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerQueryExtendedScrollFirstResponse> serverQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, ServerQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>serverQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/server/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerQueryExtendedScrollFirstResponse serverQueryExtendedScrollFirst(ServerQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ServerQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>serverQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/server/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerQueryExtendedScrollFirstResponse> serverQueryExtendedScrollFirstWithHttpInfo(ServerQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ServerQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class ServerQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public ServerQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/server/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerQueryExtendedScrollMoreResponse serverQueryExtendedScrollMore(@Param("sessionId") String sessionId, ServerQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>serverQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerQueryExtendedScrollMoreResponse> serverQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, ServerQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>serverQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/server/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerQueryExtendedScrollMoreResponse serverQueryExtendedScrollMore(ServerQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ServerQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>serverQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/server/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerQueryExtendedScrollMoreResponse> serverQueryExtendedScrollMoreWithHttpInfo(ServerQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ServerQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class ServerQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public ServerQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return ServerRaidControllersResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/RaidControllers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerRaidControllersResponseData serverRaidControllers(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerRaidControllersRequestData body);

  /**
   * Get relations to RAID controller entities
   * Similar to <code>serverRaidControllers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/RaidControllers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerRaidControllersResponseData> serverRaidControllersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerRaidControllersRequestData body);


  /**
   * Get relations to RAID controller entities
   * 
   * Note, this is equivalent to the other <code>serverRaidControllers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerRaidControllersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerRaidControllersResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/RaidControllers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerRaidControllersResponseData serverRaidControllers(@Param("elid") String elid, ServerRaidControllersRequestData body, @QueryMap(encoded=true) ServerRaidControllersQueryParams queryParams);

  /**
  * Get relations to RAID controller entities
  * 
  * Note, this is equivalent to the other <code>serverRaidControllers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerRaidControllersResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/RaidControllers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerRaidControllersResponseData> serverRaidControllersWithHttpInfo(@Param("elid") String elid, ServerRaidControllersRequestData body, @QueryMap(encoded=true) ServerRaidControllersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverRaidControllers</code> method in a fluent style.
   */
  public static class ServerRaidControllersQueryParams extends HashMap<String, Object> {
    public ServerRaidControllersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Serverfarm entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerServerfarmsResponseData serverServerfarms(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerServerfarmsRequestData body);

  /**
   * Get relations to Serverfarm entities
   * Similar to <code>serverServerfarms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerServerfarmsResponseData> serverServerfarmsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerServerfarmsRequestData body);


  /**
   * Get relations to Serverfarm entities
   * 
   * Note, this is equivalent to the other <code>serverServerfarms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerServerfarmsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerServerfarmsResponseData serverServerfarms(@Param("elid") String elid, ServerServerfarmsRequestData body, @QueryMap(encoded=true) ServerServerfarmsQueryParams queryParams);

  /**
  * Get relations to Serverfarm entities
  * 
  * Note, this is equivalent to the other <code>serverServerfarms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerServerfarmsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Serverfarms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerServerfarmsResponseData> serverServerfarmsWithHttpInfo(@Param("elid") String elid, ServerServerfarmsRequestData body, @QueryMap(encoded=true) ServerServerfarmsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverServerfarms</code> method in a fluent style.
   */
  public static class ServerServerfarmsQueryParams extends HashMap<String, Object> {
    public ServerServerfarmsQueryParams sessionId(final String value) {
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
   * @return ServerSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerSlotResponseData serverSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>serverSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerSlotResponseData> serverSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>serverSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerSlotResponseData serverSlot(@Param("elid") String elid, ServerSlotRequestData body, @QueryMap(encoded=true) ServerSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>serverSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerSlotResponseData> serverSlotWithHttpInfo(@Param("elid") String elid, ServerSlotRequestData body, @QueryMap(encoded=true) ServerSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverSlot</code> method in a fluent style.
   */
  public static class ServerSlotQueryParams extends HashMap<String, Object> {
    public ServerSlotQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerSoftwareInstallationsResponseData serverSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>serverSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerSoftwareInstallationsResponseData> serverSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>serverSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerSoftwareInstallationsResponseData serverSoftwareInstallations(@Param("elid") String elid, ServerSoftwareInstallationsRequestData body, @QueryMap(encoded=true) ServerSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>serverSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerSoftwareInstallationsResponseData> serverSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, ServerSoftwareInstallationsRequestData body, @QueryMap(encoded=true) ServerSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverSoftwareInstallations</code> method in a fluent style.
   */
  public static class ServerSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public ServerSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return ServerSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerSwitchCabinetResponseData serverSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>serverSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerSwitchCabinetResponseData> serverSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>serverSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerSwitchCabinetResponseData serverSwitchCabinet(@Param("elid") String elid, ServerSwitchCabinetRequestData body, @QueryMap(encoded=true) ServerSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>serverSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerSwitchCabinetResponseData> serverSwitchCabinetWithHttpInfo(@Param("elid") String elid, ServerSwitchCabinetRequestData body, @QueryMap(encoded=true) ServerSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverSwitchCabinet</code> method in a fluent style.
   */
  public static class ServerSwitchCabinetQueryParams extends HashMap<String, Object> {
    public ServerSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return ServerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerSystemAttributesResponse serverSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serverSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerSystemAttributesResponse> serverSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serverSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerSystemAttributesResponse serverSystemAttributes(@Param("elid") String elid, ServerSystemAttributesRequest body, @QueryMap(encoded=true) ServerSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serverSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerSystemAttributesResponse> serverSystemAttributesWithHttpInfo(@Param("elid") String elid, ServerSystemAttributesRequest body, @QueryMap(encoded=true) ServerSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverSystemAttributes</code> method in a fluent style.
   */
  public static class ServerSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServerSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual client entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerVirtualClientsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerVirtualClientsResponseData serverVirtualClients(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVirtualClientsRequestData body);

  /**
   * Get relations to Virtual client entities
   * Similar to <code>serverVirtualClients</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerVirtualClientsResponseData> serverVirtualClientsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVirtualClientsRequestData body);


  /**
   * Get relations to Virtual client entities
   * 
   * Note, this is equivalent to the other <code>serverVirtualClients</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerVirtualClientsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerVirtualClientsResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerVirtualClientsResponseData serverVirtualClients(@Param("elid") String elid, ServerVirtualClientsRequestData body, @QueryMap(encoded=true) ServerVirtualClientsQueryParams queryParams);

  /**
  * Get relations to Virtual client entities
  * 
  * Note, this is equivalent to the other <code>serverVirtualClients</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerVirtualClientsResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/VirtualClients?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerVirtualClientsResponseData> serverVirtualClientsWithHttpInfo(@Param("elid") String elid, ServerVirtualClientsRequestData body, @QueryMap(encoded=true) ServerVirtualClientsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverVirtualClients</code> method in a fluent style.
   */
  public static class ServerVirtualClientsQueryParams extends HashMap<String, Object> {
    public ServerVirtualClientsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerVirtualServersResponseData serverVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>serverVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerVirtualServersResponseData> serverVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>serverVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerVirtualServersResponseData serverVirtualServers(@Param("elid") String elid, ServerVirtualServersRequestData body, @QueryMap(encoded=true) ServerVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>serverVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerVirtualServersResponseData> serverVirtualServersWithHttpInfo(@Param("elid") String elid, ServerVirtualServersRequestData body, @QueryMap(encoded=true) ServerVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverVirtualServers</code> method in a fluent style.
   */
  public static class ServerVirtualServersQueryParams extends HashMap<String, Object> {
    public ServerVirtualServersQueryParams sessionId(final String value) {
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
   * @return ServerVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerVirtualSwitchesResponseData serverVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>serverVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerVirtualSwitchesResponseData> serverVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>serverVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerVirtualSwitchesResponseData serverVirtualSwitches(@Param("elid") String elid, ServerVirtualSwitchesRequestData body, @QueryMap(encoded=true) ServerVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>serverVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerVirtualSwitchesResponseData> serverVirtualSwitchesWithHttpInfo(@Param("elid") String elid, ServerVirtualSwitchesRequestData body, @QueryMap(encoded=true) ServerVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverVirtualSwitches</code> method in a fluent style.
   */
  public static class ServerVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public ServerVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return ServerVlansResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerVlansResponse serverVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVlansRequest body);

  /**
   * VLANs
   * Similar to <code>serverVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerVlansResponse> serverVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serverVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerVlansResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerVlansResponse serverVlans(@Param("elid") String elid, ServerVlansRequest body, @QueryMap(encoded=true) ServerVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serverVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerVlansResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerVlansResponse> serverVlansWithHttpInfo(@Param("elid") String elid, ServerVlansRequest body, @QueryMap(encoded=true) ServerVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverVlans</code> method in a fluent style.
   */
  public static class ServerVlansQueryParams extends HashMap<String, Object> {
    public ServerVlansQueryParams sessionId(final String value) {
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
   * @return ServerVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerVlansAtSlotResponse serverVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>serverVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerVlansAtSlotResponse> serverVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serverVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerVlansAtSlotResponse serverVlansAtSlot(@Param("elid") String elid, ServerVlansAtSlotRequest body, @QueryMap(encoded=true) ServerVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serverVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerVlansAtSlotResponse> serverVlansAtSlotWithHttpInfo(@Param("elid") String elid, ServerVlansAtSlotRequest body, @QueryMap(encoded=true) ServerVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverVlansAtSlot</code> method in a fluent style.
   */
  public static class ServerVlansAtSlotQueryParams extends HashMap<String, Object> {
    public ServerVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return ServerWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerWarehouseResponseData serverWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>serverWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerWarehouseResponseData> serverWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>serverWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerWarehouseResponseData serverWarehouse(@Param("elid") String elid, ServerWarehouseRequestData body, @QueryMap(encoded=true) ServerWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>serverWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerWarehouseResponseData> serverWarehouseWithHttpInfo(@Param("elid") String elid, ServerWarehouseRequestData body, @QueryMap(encoded=true) ServerWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverWarehouse</code> method in a fluent style.
   */
  public static class ServerWarehouseQueryParams extends HashMap<String, Object> {
    public ServerWarehouseQueryParams sessionId(final String value) {
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
   * @return ServerZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerZoneResponseData serverZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>serverZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerZoneResponseData> serverZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>serverZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerZoneResponseData serverZone(@Param("elid") String elid, ServerZoneRequestData body, @QueryMap(encoded=true) ServerZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>serverZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerZoneResponseData> serverZoneWithHttpInfo(@Param("elid") String elid, ServerZoneRequestData body, @QueryMap(encoded=true) ServerZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverZone</code> method in a fluent style.
   */
  public static class ServerZoneQueryParams extends HashMap<String, Object> {
    public ServerZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServerResponse updateServer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServerRequestData body);

  /**
   * Modify
   * Similar to <code>updateServer</code> but it also returns the http response headers .
   * Modify server
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServerResponse> updateServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServerRequestData body);


  /**
   * Modify
   * Modify server
   * Note, this is equivalent to the other <code>updateServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServerResponse updateServer(@Param("elid") String elid, UpdateServerRequestData body, @QueryMap(encoded=true) UpdateServerQueryParams queryParams);

  /**
  * Modify
  * Modify server
  * Note, this is equivalent to the other <code>updateServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServerResponse> updateServerWithHttpInfo(@Param("elid") String elid, UpdateServerRequestData body, @QueryMap(encoded=true) UpdateServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServer</code> method in a fluent style.
   */
  public static class UpdateServerQueryParams extends HashMap<String, Object> {
    public UpdateServerQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServerResponse updateSystemAttributesServer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServerRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServer</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServerResponse> updateSystemAttributesServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServerRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServerResponse
   */
  @RequestLine("POST /api/rest/entity/server/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServerResponse updateSystemAttributesServer(@Param("elid") String elid, UpdateSystemAttributesServerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServerQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServerResponse
      */
      @RequestLine("POST /api/rest/entity/server/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServerResponse> updateSystemAttributesServerWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServer</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServerQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
