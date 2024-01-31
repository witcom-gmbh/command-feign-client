package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeNmModuleResponse;
import com.fntsoftware.businessgateway.entities.DeleteNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNmModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetNmModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotNmModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseNmModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneNmModuleResponse;
import com.fntsoftware.businessgateway.entities.NmModuleContractsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleContractsResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleDuctDataRequest;
import com.fntsoftware.businessgateway.entities.NmModuleDuctDataResponse;
import com.fntsoftware.businessgateway.entities.NmModuleDuctsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleDuctsResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.NmModuleInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.NmModuleInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.NmModuleInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.NmModuleInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.NmModuleInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.NmModuleInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.NmModuleIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.NmModuleIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleLocationRequest;
import com.fntsoftware.businessgateway.entities.NmModuleLocationResponse;
import com.fntsoftware.businessgateway.entities.NmModuleLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.NmModuleNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.NmModuleOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NmModulePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NmModulePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NmModulePersonsRequestData;
import com.fntsoftware.businessgateway.entities.NmModulePersonsResponseData;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.NmModulePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.NmModuleQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.NmModuleQueryRequest;
import com.fntsoftware.businessgateway.entities.NmModuleQueryResponse;
import com.fntsoftware.businessgateway.entities.NmModuleServicesRequest;
import com.fntsoftware.businessgateway.entities.NmModuleServicesResponse;
import com.fntsoftware.businessgateway.entities.NmModuleSitesRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleSitesResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleSlotRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleSlotResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NmModuleSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.NmModuleVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.NmModuleVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.NmModuleVlansRequest;
import com.fntsoftware.businessgateway.entities.NmModuleVlansResponse;
import com.fntsoftware.businessgateway.entities.NmModuleWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.NmModuleZoneRequestData;
import com.fntsoftware.businessgateway.entities.NmModuleZoneResponseData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetNmModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotNmModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseNmModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneNmModuleResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectNmModuleResponse;
import com.fntsoftware.businessgateway.entities.UpdateNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNmModuleResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNmModuleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNmModuleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface NmModuleApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeNmModuleResponse changeTypeNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeNmModuleRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeNmModule</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeNmModuleResponse> changeTypeNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeNmModuleRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeNmModuleResponse changeTypeNmModule(@Param("elid") String elid, ChangeTypeNmModuleRequestData body, @QueryMap(encoded=true) ChangeTypeNmModuleQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeNmModuleResponse> changeTypeNmModuleWithHttpInfo(@Param("elid") String elid, ChangeTypeNmModuleRequestData body, @QueryMap(encoded=true) ChangeTypeNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeNmModule</code> method in a fluent style.
   */
  public static class ChangeTypeNmModuleQueryParams extends HashMap<String, Object> {
    public ChangeTypeNmModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete NM Module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNmModuleResponse deleteNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNmModuleRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNmModule</code> but it also returns the http response headers .
   * Delete NM Module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNmModuleResponse> deleteNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNmModuleRequestData body);


  /**
   * Delete
   * Delete NM Module
   * Note, this is equivalent to the other <code>deleteNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNmModuleResponse deleteNmModule(@Param("elid") String elid, DeleteNmModuleRequestData body, @QueryMap(encoded=true) DeleteNmModuleQueryParams queryParams);

  /**
  * Delete
  * Delete NM Module
  * Note, this is equivalent to the other <code>deleteNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNmModuleResponse> deleteNmModuleWithHttpInfo(@Param("elid") String elid, DeleteNmModuleRequestData body, @QueryMap(encoded=true) DeleteNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNmModule</code> method in a fluent style.
   */
  public static class DeleteNmModuleQueryParams extends HashMap<String, Object> {
    public DeleteNmModuleQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetNmModuleResponse moveToCabinetNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetNmModuleRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetNmModule</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetNmModuleResponse> moveToCabinetNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetNmModuleRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetNmModuleResponse moveToCabinetNmModule(@Param("elid") String elid, MoveToCabinetNmModuleRequestData body, @QueryMap(encoded=true) MoveToCabinetNmModuleQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetNmModuleResponse> moveToCabinetNmModuleWithHttpInfo(@Param("elid") String elid, MoveToCabinetNmModuleRequestData body, @QueryMap(encoded=true) MoveToCabinetNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetNmModule</code> method in a fluent style.
   */
  public static class MoveToCabinetNmModuleQueryParams extends HashMap<String, Object> {
    public MoveToCabinetNmModuleQueryParams sessionId(final String value) {
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
   * @return MoveToSlotNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotNmModuleResponse moveToSlotNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotNmModuleRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotNmModule</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotNmModuleResponse> moveToSlotNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotNmModuleRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotNmModuleResponse moveToSlotNmModule(@Param("elid") String elid, MoveToSlotNmModuleRequestData body, @QueryMap(encoded=true) MoveToSlotNmModuleQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotNmModuleResponse> moveToSlotNmModuleWithHttpInfo(@Param("elid") String elid, MoveToSlotNmModuleRequestData body, @QueryMap(encoded=true) MoveToSlotNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotNmModule</code> method in a fluent style.
   */
  public static class MoveToSlotNmModuleQueryParams extends HashMap<String, Object> {
    public MoveToSlotNmModuleQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseNmModuleResponse moveToWarehouseNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseNmModuleRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseNmModule</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseNmModuleResponse> moveToWarehouseNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseNmModuleRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseNmModuleResponse moveToWarehouseNmModule(@Param("elid") String elid, MoveToWarehouseNmModuleRequestData body, @QueryMap(encoded=true) MoveToWarehouseNmModuleQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseNmModuleResponse> moveToWarehouseNmModuleWithHttpInfo(@Param("elid") String elid, MoveToWarehouseNmModuleRequestData body, @QueryMap(encoded=true) MoveToWarehouseNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseNmModule</code> method in a fluent style.
   */
  public static class MoveToWarehouseNmModuleQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseNmModuleQueryParams sessionId(final String value) {
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
   * @return MoveToZoneNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneNmModuleResponse moveToZoneNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneNmModuleRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneNmModule</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneNmModuleResponse> moveToZoneNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneNmModuleRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneNmModuleResponse moveToZoneNmModule(@Param("elid") String elid, MoveToZoneNmModuleRequestData body, @QueryMap(encoded=true) MoveToZoneNmModuleQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneNmModuleResponse> moveToZoneNmModuleWithHttpInfo(@Param("elid") String elid, MoveToZoneNmModuleRequestData body, @QueryMap(encoded=true) MoveToZoneNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneNmModule</code> method in a fluent style.
   */
  public static class MoveToZoneNmModuleQueryParams extends HashMap<String, Object> {
    public MoveToZoneNmModuleQueryParams sessionId(final String value) {
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
   * @return NmModuleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleContractsResponseData nmModuleContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>nmModuleContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleContractsResponseData> nmModuleContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>nmModuleContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleContractsResponseData nmModuleContracts(@Param("elid") String elid, NmModuleContractsRequestData body, @QueryMap(encoded=true) NmModuleContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>nmModuleContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleContractsResponseData> nmModuleContractsWithHttpInfo(@Param("elid") String elid, NmModuleContractsRequestData body, @QueryMap(encoded=true) NmModuleContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleContracts</code> method in a fluent style.
   */
  public static class NmModuleContractsQueryParams extends HashMap<String, Object> {
    public NmModuleContractsQueryParams sessionId(final String value) {
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
   * @return NmModuleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleDeviceMasterResponseData nmModuleDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>nmModuleDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleDeviceMasterResponseData> nmModuleDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>nmModuleDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleDeviceMasterResponseData nmModuleDeviceMaster(@Param("elid") String elid, NmModuleDeviceMasterRequestData body, @QueryMap(encoded=true) NmModuleDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>nmModuleDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleDeviceMasterResponseData> nmModuleDeviceMasterWithHttpInfo(@Param("elid") String elid, NmModuleDeviceMasterRequestData body, @QueryMap(encoded=true) NmModuleDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleDeviceMaster</code> method in a fluent style.
   */
  public static class NmModuleDeviceMasterQueryParams extends HashMap<String, Object> {
    public NmModuleDeviceMasterQueryParams sessionId(final String value) {
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
   * @return NmModuleDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleDuctDataResponse nmModuleDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>nmModuleDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleDuctDataResponse> nmModuleDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>nmModuleDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleDuctDataResponse nmModuleDuctData(@Param("elid") String elid, NmModuleDuctDataRequest body, @QueryMap(encoded=true) NmModuleDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>nmModuleDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleDuctDataResponse> nmModuleDuctDataWithHttpInfo(@Param("elid") String elid, NmModuleDuctDataRequest body, @QueryMap(encoded=true) NmModuleDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleDuctData</code> method in a fluent style.
   */
  public static class NmModuleDuctDataQueryParams extends HashMap<String, Object> {
    public NmModuleDuctDataQueryParams sessionId(final String value) {
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
   * @return NmModuleDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleDuctsResponseData nmModuleDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>nmModuleDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleDuctsResponseData> nmModuleDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>nmModuleDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleDuctsResponseData nmModuleDucts(@Param("elid") String elid, NmModuleDuctsRequestData body, @QueryMap(encoded=true) NmModuleDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>nmModuleDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleDuctsResponseData> nmModuleDuctsWithHttpInfo(@Param("elid") String elid, NmModuleDuctsRequestData body, @QueryMap(encoded=true) NmModuleDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleDucts</code> method in a fluent style.
   */
  public static class NmModuleDuctsQueryParams extends HashMap<String, Object> {
    public NmModuleDuctsQueryParams sessionId(final String value) {
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
   * @return NmModuleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleFrameContractsResponseData nmModuleFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>nmModuleFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleFrameContractsResponseData> nmModuleFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>nmModuleFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleFrameContractsResponseData nmModuleFrameContracts(@Param("elid") String elid, NmModuleFrameContractsRequestData body, @QueryMap(encoded=true) NmModuleFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>nmModuleFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleFrameContractsResponseData> nmModuleFrameContractsWithHttpInfo(@Param("elid") String elid, NmModuleFrameContractsRequestData body, @QueryMap(encoded=true) NmModuleFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleFrameContracts</code> method in a fluent style.
   */
  public static class NmModuleFrameContractsQueryParams extends HashMap<String, Object> {
    public NmModuleFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NmModuleInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleInheritedGeoCoordinatesResponse nmModuleInheritedGeoCoordinates(@Param("sessionId") String sessionId, NmModuleInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>nmModuleInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleInheritedGeoCoordinatesResponse> nmModuleInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, NmModuleInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>nmModuleInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleInheritedGeoCoordinatesResponse nmModuleInheritedGeoCoordinates(NmModuleInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) NmModuleInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>nmModuleInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleInheritedGeoCoordinatesResponse> nmModuleInheritedGeoCoordinatesWithHttpInfo(NmModuleInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) NmModuleInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class NmModuleInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public NmModuleInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return NmModuleInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleInstalledSubCardsResponse nmModuleInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>nmModuleInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleInstalledSubCardsResponse> nmModuleInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>nmModuleInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleInstalledSubCardsResponse nmModuleInstalledSubCards(@Param("elid") String elid, NmModuleInstalledSubCardsRequest body, @QueryMap(encoded=true) NmModuleInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>nmModuleInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleInstalledSubCardsResponse> nmModuleInstalledSubCardsWithHttpInfo(@Param("elid") String elid, NmModuleInstalledSubCardsRequest body, @QueryMap(encoded=true) NmModuleInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleInstalledSubCards</code> method in a fluent style.
   */
  public static class NmModuleInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public NmModuleInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return NmModuleInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleInstalledSubCardsRecursiveResponse nmModuleInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>nmModuleInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleInstalledSubCardsRecursiveResponse> nmModuleInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>nmModuleInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleInstalledSubCardsRecursiveResponse nmModuleInstalledSubCardsRecursive(@Param("elid") String elid, NmModuleInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) NmModuleInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>nmModuleInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleInstalledSubCardsRecursiveResponse> nmModuleInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, NmModuleInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) NmModuleInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class NmModuleInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public NmModuleInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return NmModuleInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleInterfacesResponseData nmModuleInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>nmModuleInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleInterfacesResponseData> nmModuleInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>nmModuleInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleInterfacesResponseData nmModuleInterfaces(@Param("elid") String elid, NmModuleInterfacesRequestData body, @QueryMap(encoded=true) NmModuleInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>nmModuleInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleInterfacesResponseData> nmModuleInterfacesWithHttpInfo(@Param("elid") String elid, NmModuleInterfacesRequestData body, @QueryMap(encoded=true) NmModuleInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleInterfaces</code> method in a fluent style.
   */
  public static class NmModuleInterfacesQueryParams extends HashMap<String, Object> {
    public NmModuleInterfacesQueryParams sessionId(final String value) {
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
   * @return NmModuleIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleIpAddressesResponse nmModuleIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>nmModuleIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleIpAddressesResponse> nmModuleIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nmModuleIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleIpAddressesResponse nmModuleIpAddresses(@Param("elid") String elid, NmModuleIpAddressesRequest body, @QueryMap(encoded=true) NmModuleIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nmModuleIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleIpAddressesResponse> nmModuleIpAddressesWithHttpInfo(@Param("elid") String elid, NmModuleIpAddressesRequest body, @QueryMap(encoded=true) NmModuleIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleIpAddresses</code> method in a fluent style.
   */
  public static class NmModuleIpAddressesQueryParams extends HashMap<String, Object> {
    public NmModuleIpAddressesQueryParams sessionId(final String value) {
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
   * @return NmModuleIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleIpv4AddressesResponseData nmModuleIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>nmModuleIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleIpv4AddressesResponseData> nmModuleIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>nmModuleIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleIpv4AddressesResponseData nmModuleIpv4Addresses(@Param("elid") String elid, NmModuleIpv4AddressesRequestData body, @QueryMap(encoded=true) NmModuleIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>nmModuleIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleIpv4AddressesResponseData> nmModuleIpv4AddressesWithHttpInfo(@Param("elid") String elid, NmModuleIpv4AddressesRequestData body, @QueryMap(encoded=true) NmModuleIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleIpv4Addresses</code> method in a fluent style.
   */
  public static class NmModuleIpv4AddressesQueryParams extends HashMap<String, Object> {
    public NmModuleIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return NmModuleIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleIpv4NetrangesResponseData nmModuleIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>nmModuleIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleIpv4NetrangesResponseData> nmModuleIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>nmModuleIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleIpv4NetrangesResponseData nmModuleIpv4Netranges(@Param("elid") String elid, NmModuleIpv4NetrangesRequestData body, @QueryMap(encoded=true) NmModuleIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>nmModuleIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleIpv4NetrangesResponseData> nmModuleIpv4NetrangesWithHttpInfo(@Param("elid") String elid, NmModuleIpv4NetrangesRequestData body, @QueryMap(encoded=true) NmModuleIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleIpv4Netranges</code> method in a fluent style.
   */
  public static class NmModuleIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public NmModuleIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return NmModuleIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleIpv4NetworksResponseData nmModuleIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>nmModuleIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleIpv4NetworksResponseData> nmModuleIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>nmModuleIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleIpv4NetworksResponseData nmModuleIpv4Networks(@Param("elid") String elid, NmModuleIpv4NetworksRequestData body, @QueryMap(encoded=true) NmModuleIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>nmModuleIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleIpv4NetworksResponseData> nmModuleIpv4NetworksWithHttpInfo(@Param("elid") String elid, NmModuleIpv4NetworksRequestData body, @QueryMap(encoded=true) NmModuleIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleIpv4Networks</code> method in a fluent style.
   */
  public static class NmModuleIpv4NetworksQueryParams extends HashMap<String, Object> {
    public NmModuleIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return NmModuleLocationResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleLocationResponse nmModuleLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleLocationRequest body);

  /**
   * Location
   * Similar to <code>nmModuleLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleLocationResponse> nmModuleLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>nmModuleLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleLocationResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleLocationResponse nmModuleLocation(@Param("elid") String elid, NmModuleLocationRequest body, @QueryMap(encoded=true) NmModuleLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>nmModuleLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleLocationResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleLocationResponse> nmModuleLocationWithHttpInfo(@Param("elid") String elid, NmModuleLocationRequest body, @QueryMap(encoded=true) NmModuleLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleLocation</code> method in a fluent style.
   */
  public static class NmModuleLocationQueryParams extends HashMap<String, Object> {
    public NmModuleLocationQueryParams sessionId(final String value) {
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
   * @return NmModuleLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleLogicalPortsResponseData nmModuleLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>nmModuleLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleLogicalPortsResponseData> nmModuleLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>nmModuleLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleLogicalPortsResponseData nmModuleLogicalPorts(@Param("elid") String elid, NmModuleLogicalPortsRequestData body, @QueryMap(encoded=true) NmModuleLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>nmModuleLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleLogicalPortsResponseData> nmModuleLogicalPortsWithHttpInfo(@Param("elid") String elid, NmModuleLogicalPortsRequestData body, @QueryMap(encoded=true) NmModuleLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleLogicalPorts</code> method in a fluent style.
   */
  public static class NmModuleLogicalPortsQueryParams extends HashMap<String, Object> {
    public NmModuleLogicalPortsQueryParams sessionId(final String value) {
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
   * @return NmModuleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleMaintenanceContractsResponseData nmModuleMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>nmModuleMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleMaintenanceContractsResponseData> nmModuleMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>nmModuleMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleMaintenanceContractsResponseData nmModuleMaintenanceContracts(@Param("elid") String elid, NmModuleMaintenanceContractsRequestData body, @QueryMap(encoded=true) NmModuleMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>nmModuleMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleMaintenanceContractsResponseData> nmModuleMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NmModuleMaintenanceContractsRequestData body, @QueryMap(encoded=true) NmModuleMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleMaintenanceContracts</code> method in a fluent style.
   */
  public static class NmModuleMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NmModuleMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return NmModuleMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleMultiDuctsResponseData nmModuleMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>nmModuleMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleMultiDuctsResponseData> nmModuleMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>nmModuleMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleMultiDuctsResponseData nmModuleMultiDucts(@Param("elid") String elid, NmModuleMultiDuctsRequestData body, @QueryMap(encoded=true) NmModuleMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>nmModuleMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleMultiDuctsResponseData> nmModuleMultiDuctsWithHttpInfo(@Param("elid") String elid, NmModuleMultiDuctsRequestData body, @QueryMap(encoded=true) NmModuleMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleMultiDucts</code> method in a fluent style.
   */
  public static class NmModuleMultiDuctsQueryParams extends HashMap<String, Object> {
    public NmModuleMultiDuctsQueryParams sessionId(final String value) {
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
   * @return NmModuleNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleNetworksAndNetrangesResponse nmModuleNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>nmModuleNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleNetworksAndNetrangesResponse> nmModuleNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nmModuleNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleNetworksAndNetrangesResponse nmModuleNetworksAndNetranges(@Param("elid") String elid, NmModuleNetworksAndNetrangesRequest body, @QueryMap(encoded=true) NmModuleNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nmModuleNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleNetworksAndNetrangesResponse> nmModuleNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, NmModuleNetworksAndNetrangesRequest body, @QueryMap(encoded=true) NmModuleNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleNetworksAndNetranges</code> method in a fluent style.
   */
  public static class NmModuleNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public NmModuleNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return NmModuleOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleOperatingSystemInstallationResponseData nmModuleOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>nmModuleOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleOperatingSystemInstallationResponseData> nmModuleOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>nmModuleOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleOperatingSystemInstallationResponseData nmModuleOperatingSystemInstallation(@Param("elid") String elid, NmModuleOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) NmModuleOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>nmModuleOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleOperatingSystemInstallationResponseData> nmModuleOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, NmModuleOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) NmModuleOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class NmModuleOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public NmModuleOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return NmModuleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleOrganizationsResponseData nmModuleOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>nmModuleOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleOrganizationsResponseData> nmModuleOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>nmModuleOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleOrganizationsResponseData nmModuleOrganizations(@Param("elid") String elid, NmModuleOrganizationsRequestData body, @QueryMap(encoded=true) NmModuleOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>nmModuleOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleOrganizationsResponseData> nmModuleOrganizationsWithHttpInfo(@Param("elid") String elid, NmModuleOrganizationsRequestData body, @QueryMap(encoded=true) NmModuleOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleOrganizations</code> method in a fluent style.
   */
  public static class NmModuleOrganizationsQueryParams extends HashMap<String, Object> {
    public NmModuleOrganizationsQueryParams sessionId(final String value) {
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
   * @return NmModulePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModulePersonGroupsResponseData nmModulePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>nmModulePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModulePersonGroupsResponseData> nmModulePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>nmModulePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModulePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModulePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModulePersonGroupsResponseData nmModulePersonGroups(@Param("elid") String elid, NmModulePersonGroupsRequestData body, @QueryMap(encoded=true) NmModulePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>nmModulePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModulePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModulePersonGroupsResponseData> nmModulePersonGroupsWithHttpInfo(@Param("elid") String elid, NmModulePersonGroupsRequestData body, @QueryMap(encoded=true) NmModulePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModulePersonGroups</code> method in a fluent style.
   */
  public static class NmModulePersonGroupsQueryParams extends HashMap<String, Object> {
    public NmModulePersonGroupsQueryParams sessionId(final String value) {
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
   * @return NmModulePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModulePersonsResponseData nmModulePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>nmModulePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModulePersonsResponseData> nmModulePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>nmModulePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModulePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModulePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModulePersonsResponseData nmModulePersons(@Param("elid") String elid, NmModulePersonsRequestData body, @QueryMap(encoded=true) NmModulePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>nmModulePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModulePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModulePersonsResponseData> nmModulePersonsWithHttpInfo(@Param("elid") String elid, NmModulePersonsRequestData body, @QueryMap(encoded=true) NmModulePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModulePersons</code> method in a fluent style.
   */
  public static class NmModulePersonsQueryParams extends HashMap<String, Object> {
    public NmModulePersonsQueryParams sessionId(final String value) {
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
   * @return NmModulePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModulePhysicalPortsDataResponseData nmModulePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>nmModulePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModulePhysicalPortsDataResponseData> nmModulePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>nmModulePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModulePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModulePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModulePhysicalPortsDataResponseData nmModulePhysicalPortsData(@Param("elid") String elid, NmModulePhysicalPortsDataRequestData body, @QueryMap(encoded=true) NmModulePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>nmModulePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModulePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModulePhysicalPortsDataResponseData> nmModulePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, NmModulePhysicalPortsDataRequestData body, @QueryMap(encoded=true) NmModulePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModulePhysicalPortsData</code> method in a fluent style.
   */
  public static class NmModulePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public NmModulePhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return NmModulePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModulePhysicalPortsDataExtendedResponse nmModulePhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>nmModulePhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModulePhysicalPortsDataExtendedResponse> nmModulePhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>nmModulePhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModulePhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModulePhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModulePhysicalPortsDataExtendedResponse nmModulePhysicalPortsDataExtended(@Param("elid") String elid, NmModulePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) NmModulePhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>nmModulePhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModulePhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModulePhysicalPortsDataExtendedResponse> nmModulePhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, NmModulePhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) NmModulePhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModulePhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class NmModulePhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public NmModulePhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return NmModulePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModulePhysicalPortsPowerResponseData nmModulePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>nmModulePhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModulePhysicalPortsPowerResponseData> nmModulePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>nmModulePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModulePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModulePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModulePhysicalPortsPowerResponseData nmModulePhysicalPortsPower(@Param("elid") String elid, NmModulePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) NmModulePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>nmModulePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModulePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModulePhysicalPortsPowerResponseData> nmModulePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, NmModulePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) NmModulePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModulePhysicalPortsPower</code> method in a fluent style.
   */
  public static class NmModulePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public NmModulePhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return NmModulePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModulePhysicalPortsPowerExtendedResponse nmModulePhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>nmModulePhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModulePhysicalPortsPowerExtendedResponse> nmModulePhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModulePhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>nmModulePhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModulePhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModulePhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModulePhysicalPortsPowerExtendedResponse nmModulePhysicalPortsPowerExtended(@Param("elid") String elid, NmModulePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) NmModulePhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>nmModulePhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModulePhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModulePhysicalPortsPowerExtendedResponse> nmModulePhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, NmModulePhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) NmModulePhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModulePhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class NmModulePhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public NmModulePhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NmModuleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleQueryResponse nmModuleQuery(@Param("sessionId") String sessionId, NmModuleQueryRequest body);

  /**
   * Basic query
   * Similar to <code>nmModuleQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleQueryResponse> nmModuleQueryWithHttpInfo(@Param("sessionId") String sessionId, NmModuleQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nmModuleQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleQueryResponse nmModuleQuery(NmModuleQueryRequest body, @QueryMap(encoded=true) NmModuleQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nmModuleQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleQueryResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleQueryResponse> nmModuleQueryWithHttpInfo(NmModuleQueryRequest body, @QueryMap(encoded=true) NmModuleQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleQuery</code> method in a fluent style.
   */
  public static class NmModuleQueryQueryParams extends HashMap<String, Object> {
    public NmModuleQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NmModuleQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleQueryExtendedResponse nmModuleQueryExtended(@Param("sessionId") String sessionId, NmModuleQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>nmModuleQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleQueryExtendedResponse> nmModuleQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, NmModuleQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>nmModuleQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleQueryExtendedResponse nmModuleQueryExtended(NmModuleQueryExtendedRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>nmModuleQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleQueryExtendedResponse> nmModuleQueryExtendedWithHttpInfo(NmModuleQueryExtendedRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleQueryExtended</code> method in a fluent style.
   */
  public static class NmModuleQueryExtendedQueryParams extends HashMap<String, Object> {
    public NmModuleQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NmModuleQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleQueryExtendedGeoCoordinatesResponse nmModuleQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, NmModuleQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>nmModuleQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleQueryExtendedGeoCoordinatesResponse> nmModuleQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, NmModuleQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>nmModuleQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleQueryExtendedGeoCoordinatesResponse nmModuleQueryExtendedGeoCoordinates(NmModuleQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>nmModuleQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleQueryExtendedGeoCoordinatesResponse> nmModuleQueryExtendedGeoCoordinatesWithHttpInfo(NmModuleQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class NmModuleQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public NmModuleQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NmModuleQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleQueryExtendedScrollFirstResponse nmModuleQueryExtendedScrollFirst(@Param("sessionId") String sessionId, NmModuleQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>nmModuleQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleQueryExtendedScrollFirstResponse> nmModuleQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, NmModuleQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>nmModuleQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleQueryExtendedScrollFirstResponse nmModuleQueryExtendedScrollFirst(NmModuleQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>nmModuleQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleQueryExtendedScrollFirstResponse> nmModuleQueryExtendedScrollFirstWithHttpInfo(NmModuleQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class NmModuleQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public NmModuleQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NmModuleQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleQueryExtendedScrollMoreResponse nmModuleQueryExtendedScrollMore(@Param("sessionId") String sessionId, NmModuleQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>nmModuleQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleQueryExtendedScrollMoreResponse> nmModuleQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, NmModuleQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>nmModuleQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleQueryExtendedScrollMoreResponse nmModuleQueryExtendedScrollMore(NmModuleQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>nmModuleQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleQueryExtendedScrollMoreResponse> nmModuleQueryExtendedScrollMoreWithHttpInfo(NmModuleQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) NmModuleQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class NmModuleQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public NmModuleQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return NmModuleServicesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleServicesResponse nmModuleServices(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>nmModuleServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleServicesResponse> nmModuleServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>nmModuleServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleServicesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleServicesResponse nmModuleServices(@Param("elid") String elid, NmModuleServicesRequest body, @QueryMap(encoded=true) NmModuleServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>nmModuleServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleServicesResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleServicesResponse> nmModuleServicesWithHttpInfo(@Param("elid") String elid, NmModuleServicesRequest body, @QueryMap(encoded=true) NmModuleServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleServices</code> method in a fluent style.
   */
  public static class NmModuleServicesQueryParams extends HashMap<String, Object> {
    public NmModuleServicesQueryParams sessionId(final String value) {
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
   * @return NmModuleSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleSitesResponseData nmModuleSites(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>nmModuleSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleSitesResponseData> nmModuleSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>nmModuleSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleSitesResponseData nmModuleSites(@Param("elid") String elid, NmModuleSitesRequestData body, @QueryMap(encoded=true) NmModuleSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>nmModuleSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleSitesResponseData> nmModuleSitesWithHttpInfo(@Param("elid") String elid, NmModuleSitesRequestData body, @QueryMap(encoded=true) NmModuleSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleSites</code> method in a fluent style.
   */
  public static class NmModuleSitesQueryParams extends HashMap<String, Object> {
    public NmModuleSitesQueryParams sessionId(final String value) {
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
   * @return NmModuleSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleSlotResponseData nmModuleSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>nmModuleSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleSlotResponseData> nmModuleSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>nmModuleSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleSlotResponseData nmModuleSlot(@Param("elid") String elid, NmModuleSlotRequestData body, @QueryMap(encoded=true) NmModuleSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>nmModuleSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleSlotResponseData> nmModuleSlotWithHttpInfo(@Param("elid") String elid, NmModuleSlotRequestData body, @QueryMap(encoded=true) NmModuleSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleSlot</code> method in a fluent style.
   */
  public static class NmModuleSlotQueryParams extends HashMap<String, Object> {
    public NmModuleSlotQueryParams sessionId(final String value) {
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
   * @return NmModuleSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleSwitchCabinetResponseData nmModuleSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>nmModuleSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleSwitchCabinetResponseData> nmModuleSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>nmModuleSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleSwitchCabinetResponseData nmModuleSwitchCabinet(@Param("elid") String elid, NmModuleSwitchCabinetRequestData body, @QueryMap(encoded=true) NmModuleSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>nmModuleSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleSwitchCabinetResponseData> nmModuleSwitchCabinetWithHttpInfo(@Param("elid") String elid, NmModuleSwitchCabinetRequestData body, @QueryMap(encoded=true) NmModuleSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleSwitchCabinet</code> method in a fluent style.
   */
  public static class NmModuleSwitchCabinetQueryParams extends HashMap<String, Object> {
    public NmModuleSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return NmModuleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleSystemAttributesResponse nmModuleSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>nmModuleSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleSystemAttributesResponse> nmModuleSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>nmModuleSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleSystemAttributesResponse nmModuleSystemAttributes(@Param("elid") String elid, NmModuleSystemAttributesRequest body, @QueryMap(encoded=true) NmModuleSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>nmModuleSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleSystemAttributesResponse> nmModuleSystemAttributesWithHttpInfo(@Param("elid") String elid, NmModuleSystemAttributesRequest body, @QueryMap(encoded=true) NmModuleSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleSystemAttributes</code> method in a fluent style.
   */
  public static class NmModuleSystemAttributesQueryParams extends HashMap<String, Object> {
    public NmModuleSystemAttributesQueryParams sessionId(final String value) {
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
   * @return NmModuleVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleVirtualSwitchesResponseData nmModuleVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>nmModuleVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleVirtualSwitchesResponseData> nmModuleVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>nmModuleVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleVirtualSwitchesResponseData nmModuleVirtualSwitches(@Param("elid") String elid, NmModuleVirtualSwitchesRequestData body, @QueryMap(encoded=true) NmModuleVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>nmModuleVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleVirtualSwitchesResponseData> nmModuleVirtualSwitchesWithHttpInfo(@Param("elid") String elid, NmModuleVirtualSwitchesRequestData body, @QueryMap(encoded=true) NmModuleVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleVirtualSwitches</code> method in a fluent style.
   */
  public static class NmModuleVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public NmModuleVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return NmModuleVlansResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleVlansResponse nmModuleVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleVlansRequest body);

  /**
   * VLANs
   * Similar to <code>nmModuleVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleVlansResponse> nmModuleVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nmModuleVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleVlansResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleVlansResponse nmModuleVlans(@Param("elid") String elid, NmModuleVlansRequest body, @QueryMap(encoded=true) NmModuleVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nmModuleVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleVlansResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleVlansResponse> nmModuleVlansWithHttpInfo(@Param("elid") String elid, NmModuleVlansRequest body, @QueryMap(encoded=true) NmModuleVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleVlans</code> method in a fluent style.
   */
  public static class NmModuleVlansQueryParams extends HashMap<String, Object> {
    public NmModuleVlansQueryParams sessionId(final String value) {
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
   * @return NmModuleVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleVlansAtSlotResponse nmModuleVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>nmModuleVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleVlansAtSlotResponse> nmModuleVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>nmModuleVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleVlansAtSlotResponse nmModuleVlansAtSlot(@Param("elid") String elid, NmModuleVlansAtSlotRequest body, @QueryMap(encoded=true) NmModuleVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>nmModuleVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleVlansAtSlotResponse> nmModuleVlansAtSlotWithHttpInfo(@Param("elid") String elid, NmModuleVlansAtSlotRequest body, @QueryMap(encoded=true) NmModuleVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleVlansAtSlot</code> method in a fluent style.
   */
  public static class NmModuleVlansAtSlotQueryParams extends HashMap<String, Object> {
    public NmModuleVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return NmModuleWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleWarehouseResponseData nmModuleWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>nmModuleWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleWarehouseResponseData> nmModuleWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>nmModuleWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleWarehouseResponseData nmModuleWarehouse(@Param("elid") String elid, NmModuleWarehouseRequestData body, @QueryMap(encoded=true) NmModuleWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>nmModuleWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleWarehouseResponseData> nmModuleWarehouseWithHttpInfo(@Param("elid") String elid, NmModuleWarehouseRequestData body, @QueryMap(encoded=true) NmModuleWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleWarehouse</code> method in a fluent style.
   */
  public static class NmModuleWarehouseQueryParams extends HashMap<String, Object> {
    public NmModuleWarehouseQueryParams sessionId(final String value) {
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
   * @return NmModuleZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NmModuleZoneResponseData nmModuleZone(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>nmModuleZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NmModuleZoneResponseData> nmModuleZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NmModuleZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>nmModuleZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NmModuleZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NmModuleZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NmModuleZoneResponseData nmModuleZone(@Param("elid") String elid, NmModuleZoneRequestData body, @QueryMap(encoded=true) NmModuleZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>nmModuleZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NmModuleZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NmModuleZoneResponseData> nmModuleZoneWithHttpInfo(@Param("elid") String elid, NmModuleZoneRequestData body, @QueryMap(encoded=true) NmModuleZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nmModuleZone</code> method in a fluent style.
   */
  public static class NmModuleZoneQueryParams extends HashMap<String, Object> {
    public NmModuleZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetNmModuleResponse placeInCabinetNmModule(@Param("sessionId") String sessionId, PlaceInCabinetNmModuleRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetNmModule</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetNmModuleResponse> placeInCabinetNmModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetNmModuleRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetNmModuleResponse placeInCabinetNmModule(PlaceInCabinetNmModuleRequestData body, @QueryMap(encoded=true) PlaceInCabinetNmModuleQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetNmModuleResponse> placeInCabinetNmModuleWithHttpInfo(PlaceInCabinetNmModuleRequestData body, @QueryMap(encoded=true) PlaceInCabinetNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetNmModule</code> method in a fluent style.
   */
  public static class PlaceInCabinetNmModuleQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetNmModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotNmModuleResponse placeInSlotNmModule(@Param("sessionId") String sessionId, PlaceInSlotNmModuleRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotNmModule</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotNmModuleResponse> placeInSlotNmModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotNmModuleRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotNmModuleResponse placeInSlotNmModule(PlaceInSlotNmModuleRequestData body, @QueryMap(encoded=true) PlaceInSlotNmModuleQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotNmModuleResponse> placeInSlotNmModuleWithHttpInfo(PlaceInSlotNmModuleRequestData body, @QueryMap(encoded=true) PlaceInSlotNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotNmModule</code> method in a fluent style.
   */
  public static class PlaceInSlotNmModuleQueryParams extends HashMap<String, Object> {
    public PlaceInSlotNmModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseNmModuleResponse placeInWarehouseNmModule(@Param("sessionId") String sessionId, PlaceInWarehouseNmModuleRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseNmModule</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseNmModuleResponse> placeInWarehouseNmModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseNmModuleRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseNmModuleResponse placeInWarehouseNmModule(PlaceInWarehouseNmModuleRequestData body, @QueryMap(encoded=true) PlaceInWarehouseNmModuleQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseNmModuleResponse> placeInWarehouseNmModuleWithHttpInfo(PlaceInWarehouseNmModuleRequestData body, @QueryMap(encoded=true) PlaceInWarehouseNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseNmModule</code> method in a fluent style.
   */
  public static class PlaceInWarehouseNmModuleQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseNmModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneNmModuleResponse placeInZoneNmModule(@Param("sessionId") String sessionId, PlaceInZoneNmModuleRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneNmModule</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneNmModuleResponse> placeInZoneNmModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneNmModuleRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneNmModuleResponse placeInZoneNmModule(PlaceInZoneNmModuleRequestData body, @QueryMap(encoded=true) PlaceInZoneNmModuleQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneNmModuleResponse> placeInZoneNmModuleWithHttpInfo(PlaceInZoneNmModuleRequestData body, @QueryMap(encoded=true) PlaceInZoneNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneNmModule</code> method in a fluent style.
   */
  public static class PlaceInZoneNmModuleQueryParams extends HashMap<String, Object> {
    public PlaceInZoneNmModuleQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectNmModuleResponse replaceObjectNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectNmModuleRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectNmModule</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectNmModuleResponse> replaceObjectNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectNmModuleRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectNmModuleResponse replaceObjectNmModule(@Param("elid") String elid, ReplaceObjectNmModuleRequestData body, @QueryMap(encoded=true) ReplaceObjectNmModuleQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectNmModuleResponse> replaceObjectNmModuleWithHttpInfo(@Param("elid") String elid, ReplaceObjectNmModuleRequestData body, @QueryMap(encoded=true) ReplaceObjectNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectNmModule</code> method in a fluent style.
   */
  public static class ReplaceObjectNmModuleQueryParams extends HashMap<String, Object> {
    public ReplaceObjectNmModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify NM Module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNmModuleResponse updateNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNmModuleRequestData body);

  /**
   * Modify
   * Similar to <code>updateNmModule</code> but it also returns the http response headers .
   * Modify NM Module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNmModuleResponse> updateNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNmModuleRequestData body);


  /**
   * Modify
   * Modify NM Module
   * Note, this is equivalent to the other <code>updateNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNmModuleResponse updateNmModule(@Param("elid") String elid, UpdateNmModuleRequestData body, @QueryMap(encoded=true) UpdateNmModuleQueryParams queryParams);

  /**
  * Modify
  * Modify NM Module
  * Note, this is equivalent to the other <code>updateNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNmModuleResponse> updateNmModuleWithHttpInfo(@Param("elid") String elid, UpdateNmModuleRequestData body, @QueryMap(encoded=true) UpdateNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNmModule</code> method in a fluent style.
   */
  public static class UpdateNmModuleQueryParams extends HashMap<String, Object> {
    public UpdateNmModuleQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNmModuleResponse updateSystemAttributesNmModule(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNmModuleRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNmModule</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNmModuleResponse> updateSystemAttributesNmModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNmModuleRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNmModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNmModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNmModuleResponse
   */
  @RequestLine("POST /api/rest/entity/nmModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNmModuleResponse updateSystemAttributesNmModule(@Param("elid") String elid, UpdateSystemAttributesNmModuleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNmModuleQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNmModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNmModuleResponse
      */
      @RequestLine("POST /api/rest/entity/nmModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNmModuleResponse> updateSystemAttributesNmModuleWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNmModuleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNmModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNmModule</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNmModuleQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNmModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
