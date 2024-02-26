package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.DeletePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.DeletePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetPassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetPassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotPassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotPassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehousePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehousePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.MoveToZonePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZonePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleContractsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleContractsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleLocationRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleLocationResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModulePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModulePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModulePersonsRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModulePersonsResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModulePhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModulePhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModulePhysicalPortsPowerRequest;
import com.fntsoftware.businessgateway.entities.PassiveModulePhysicalPortsPowerResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleQueryResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleSlotRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleSlotResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleVlansRequest;
import com.fntsoftware.businessgateway.entities.PassiveModuleVlansResponse;
import com.fntsoftware.businessgateway.entities.PassiveModuleWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.PassiveModuleZoneRequestData;
import com.fntsoftware.businessgateway.entities.PassiveModuleZoneResponseData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotPassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotPassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZonePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZonePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.UpdatePassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePassiveModuleResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPassiveModuleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPassiveModuleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface PassiveModuleApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypePassiveModuleResponse changeTypePassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypePassiveModuleRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypePassiveModule</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypePassiveModuleResponse> changeTypePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypePassiveModuleRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypePassiveModuleResponse changeTypePassiveModule(@Param("elid") String elid, ChangeTypePassiveModuleRequestData body, @QueryMap(encoded=true) ChangeTypePassiveModuleQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypePassiveModuleResponse> changeTypePassiveModuleWithHttpInfo(@Param("elid") String elid, ChangeTypePassiveModuleRequestData body, @QueryMap(encoded=true) ChangeTypePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypePassiveModule</code> method in a fluent style.
   */
  public static class ChangeTypePassiveModuleQueryParams extends HashMap<String, Object> {
    public ChangeTypePassiveModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete passive module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePassiveModuleResponse deletePassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePassiveModuleRequestData body);

  /**
   * Delete
   * Similar to <code>deletePassiveModule</code> but it also returns the http response headers .
   * Delete passive module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePassiveModuleResponse> deletePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePassiveModuleRequestData body);


  /**
   * Delete
   * Delete passive module
   * Note, this is equivalent to the other <code>deletePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePassiveModuleResponse deletePassiveModule(@Param("elid") String elid, DeletePassiveModuleRequestData body, @QueryMap(encoded=true) DeletePassiveModuleQueryParams queryParams);

  /**
  * Delete
  * Delete passive module
  * Note, this is equivalent to the other <code>deletePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePassiveModuleResponse> deletePassiveModuleWithHttpInfo(@Param("elid") String elid, DeletePassiveModuleRequestData body, @QueryMap(encoded=true) DeletePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePassiveModule</code> method in a fluent style.
   */
  public static class DeletePassiveModuleQueryParams extends HashMap<String, Object> {
    public DeletePassiveModuleQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetPassiveModuleResponse moveToCabinetPassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetPassiveModuleRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetPassiveModule</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetPassiveModuleResponse> moveToCabinetPassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetPassiveModuleRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetPassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetPassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetPassiveModuleResponse moveToCabinetPassiveModule(@Param("elid") String elid, MoveToCabinetPassiveModuleRequestData body, @QueryMap(encoded=true) MoveToCabinetPassiveModuleQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetPassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetPassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetPassiveModuleResponse> moveToCabinetPassiveModuleWithHttpInfo(@Param("elid") String elid, MoveToCabinetPassiveModuleRequestData body, @QueryMap(encoded=true) MoveToCabinetPassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetPassiveModule</code> method in a fluent style.
   */
  public static class MoveToCabinetPassiveModuleQueryParams extends HashMap<String, Object> {
    public MoveToCabinetPassiveModuleQueryParams sessionId(final String value) {
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
   * @return MoveToSlotPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotPassiveModuleResponse moveToSlotPassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotPassiveModuleRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotPassiveModule</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotPassiveModuleResponse> moveToSlotPassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotPassiveModuleRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotPassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotPassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotPassiveModuleResponse moveToSlotPassiveModule(@Param("elid") String elid, MoveToSlotPassiveModuleRequestData body, @QueryMap(encoded=true) MoveToSlotPassiveModuleQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotPassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotPassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotPassiveModuleResponse> moveToSlotPassiveModuleWithHttpInfo(@Param("elid") String elid, MoveToSlotPassiveModuleRequestData body, @QueryMap(encoded=true) MoveToSlotPassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotPassiveModule</code> method in a fluent style.
   */
  public static class MoveToSlotPassiveModuleQueryParams extends HashMap<String, Object> {
    public MoveToSlotPassiveModuleQueryParams sessionId(final String value) {
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
   * @return MoveToWarehousePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehousePassiveModuleResponse moveToWarehousePassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehousePassiveModuleRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehousePassiveModule</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehousePassiveModuleResponse> moveToWarehousePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehousePassiveModuleRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehousePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehousePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehousePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehousePassiveModuleResponse moveToWarehousePassiveModule(@Param("elid") String elid, MoveToWarehousePassiveModuleRequestData body, @QueryMap(encoded=true) MoveToWarehousePassiveModuleQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehousePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehousePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehousePassiveModuleResponse> moveToWarehousePassiveModuleWithHttpInfo(@Param("elid") String elid, MoveToWarehousePassiveModuleRequestData body, @QueryMap(encoded=true) MoveToWarehousePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehousePassiveModule</code> method in a fluent style.
   */
  public static class MoveToWarehousePassiveModuleQueryParams extends HashMap<String, Object> {
    public MoveToWarehousePassiveModuleQueryParams sessionId(final String value) {
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
   * @return MoveToZonePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZonePassiveModuleResponse moveToZonePassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZonePassiveModuleRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZonePassiveModule</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZonePassiveModuleResponse> moveToZonePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZonePassiveModuleRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZonePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZonePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZonePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZonePassiveModuleResponse moveToZonePassiveModule(@Param("elid") String elid, MoveToZonePassiveModuleRequestData body, @QueryMap(encoded=true) MoveToZonePassiveModuleQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZonePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZonePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZonePassiveModuleResponse> moveToZonePassiveModuleWithHttpInfo(@Param("elid") String elid, MoveToZonePassiveModuleRequestData body, @QueryMap(encoded=true) MoveToZonePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZonePassiveModule</code> method in a fluent style.
   */
  public static class MoveToZonePassiveModuleQueryParams extends HashMap<String, Object> {
    public MoveToZonePassiveModuleQueryParams sessionId(final String value) {
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
   * @return PassiveModuleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleContractsResponseData passiveModuleContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>passiveModuleContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleContractsResponseData> passiveModuleContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleContractsResponseData passiveModuleContracts(@Param("elid") String elid, PassiveModuleContractsRequestData body, @QueryMap(encoded=true) PassiveModuleContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleContractsResponseData> passiveModuleContractsWithHttpInfo(@Param("elid") String elid, PassiveModuleContractsRequestData body, @QueryMap(encoded=true) PassiveModuleContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleContracts</code> method in a fluent style.
   */
  public static class PassiveModuleContractsQueryParams extends HashMap<String, Object> {
    public PassiveModuleContractsQueryParams sessionId(final String value) {
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
   * @return PassiveModuleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleDeviceMasterResponseData passiveModuleDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>passiveModuleDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleDeviceMasterResponseData> passiveModuleDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleDeviceMasterResponseData passiveModuleDeviceMaster(@Param("elid") String elid, PassiveModuleDeviceMasterRequestData body, @QueryMap(encoded=true) PassiveModuleDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleDeviceMasterResponseData> passiveModuleDeviceMasterWithHttpInfo(@Param("elid") String elid, PassiveModuleDeviceMasterRequestData body, @QueryMap(encoded=true) PassiveModuleDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleDeviceMaster</code> method in a fluent style.
   */
  public static class PassiveModuleDeviceMasterQueryParams extends HashMap<String, Object> {
    public PassiveModuleDeviceMasterQueryParams sessionId(final String value) {
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
   * @return PassiveModuleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleFrameContractsResponseData passiveModuleFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>passiveModuleFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleFrameContractsResponseData> passiveModuleFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleFrameContractsResponseData passiveModuleFrameContracts(@Param("elid") String elid, PassiveModuleFrameContractsRequestData body, @QueryMap(encoded=true) PassiveModuleFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleFrameContractsResponseData> passiveModuleFrameContractsWithHttpInfo(@Param("elid") String elid, PassiveModuleFrameContractsRequestData body, @QueryMap(encoded=true) PassiveModuleFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleFrameContracts</code> method in a fluent style.
   */
  public static class PassiveModuleFrameContractsQueryParams extends HashMap<String, Object> {
    public PassiveModuleFrameContractsQueryParams sessionId(final String value) {
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
   * @return PassiveModuleInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleInstalledSubCardsResponse passiveModuleInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>passiveModuleInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleInstalledSubCardsResponse> passiveModuleInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>passiveModuleInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleInstalledSubCardsResponse passiveModuleInstalledSubCards(@Param("elid") String elid, PassiveModuleInstalledSubCardsRequest body, @QueryMap(encoded=true) PassiveModuleInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>passiveModuleInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleInstalledSubCardsResponse> passiveModuleInstalledSubCardsWithHttpInfo(@Param("elid") String elid, PassiveModuleInstalledSubCardsRequest body, @QueryMap(encoded=true) PassiveModuleInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleInstalledSubCards</code> method in a fluent style.
   */
  public static class PassiveModuleInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public PassiveModuleInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return PassiveModuleInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleInterfacesResponseData passiveModuleInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>passiveModuleInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleInterfacesResponseData> passiveModuleInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleInterfacesResponseData passiveModuleInterfaces(@Param("elid") String elid, PassiveModuleInterfacesRequestData body, @QueryMap(encoded=true) PassiveModuleInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleInterfacesResponseData> passiveModuleInterfacesWithHttpInfo(@Param("elid") String elid, PassiveModuleInterfacesRequestData body, @QueryMap(encoded=true) PassiveModuleInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleInterfaces</code> method in a fluent style.
   */
  public static class PassiveModuleInterfacesQueryParams extends HashMap<String, Object> {
    public PassiveModuleInterfacesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleIpAddressesResponse passiveModuleIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>passiveModuleIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleIpAddressesResponse> passiveModuleIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>passiveModuleIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleIpAddressesResponse passiveModuleIpAddresses(@Param("elid") String elid, PassiveModuleIpAddressesRequest body, @QueryMap(encoded=true) PassiveModuleIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>passiveModuleIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleIpAddressesResponse> passiveModuleIpAddressesWithHttpInfo(@Param("elid") String elid, PassiveModuleIpAddressesRequest body, @QueryMap(encoded=true) PassiveModuleIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleIpAddresses</code> method in a fluent style.
   */
  public static class PassiveModuleIpAddressesQueryParams extends HashMap<String, Object> {
    public PassiveModuleIpAddressesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleIpv4AddressesResponseData passiveModuleIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>passiveModuleIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleIpv4AddressesResponseData> passiveModuleIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleIpv4AddressesResponseData passiveModuleIpv4Addresses(@Param("elid") String elid, PassiveModuleIpv4AddressesRequestData body, @QueryMap(encoded=true) PassiveModuleIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleIpv4AddressesResponseData> passiveModuleIpv4AddressesWithHttpInfo(@Param("elid") String elid, PassiveModuleIpv4AddressesRequestData body, @QueryMap(encoded=true) PassiveModuleIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleIpv4Addresses</code> method in a fluent style.
   */
  public static class PassiveModuleIpv4AddressesQueryParams extends HashMap<String, Object> {
    public PassiveModuleIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleIpv4NetrangesResponseData passiveModuleIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>passiveModuleIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleIpv4NetrangesResponseData> passiveModuleIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleIpv4NetrangesResponseData passiveModuleIpv4Netranges(@Param("elid") String elid, PassiveModuleIpv4NetrangesRequestData body, @QueryMap(encoded=true) PassiveModuleIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleIpv4NetrangesResponseData> passiveModuleIpv4NetrangesWithHttpInfo(@Param("elid") String elid, PassiveModuleIpv4NetrangesRequestData body, @QueryMap(encoded=true) PassiveModuleIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleIpv4Netranges</code> method in a fluent style.
   */
  public static class PassiveModuleIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public PassiveModuleIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleIpv4NetworksResponseData passiveModuleIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>passiveModuleIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleIpv4NetworksResponseData> passiveModuleIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleIpv4NetworksResponseData passiveModuleIpv4Networks(@Param("elid") String elid, PassiveModuleIpv4NetworksRequestData body, @QueryMap(encoded=true) PassiveModuleIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleIpv4NetworksResponseData> passiveModuleIpv4NetworksWithHttpInfo(@Param("elid") String elid, PassiveModuleIpv4NetworksRequestData body, @QueryMap(encoded=true) PassiveModuleIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleIpv4Networks</code> method in a fluent style.
   */
  public static class PassiveModuleIpv4NetworksQueryParams extends HashMap<String, Object> {
    public PassiveModuleIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return PassiveModuleLocationResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleLocationResponse passiveModuleLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleLocationRequest body);

  /**
   * Location
   * Similar to <code>passiveModuleLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleLocationResponse> passiveModuleLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>passiveModuleLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleLocationResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleLocationResponse passiveModuleLocation(@Param("elid") String elid, PassiveModuleLocationRequest body, @QueryMap(encoded=true) PassiveModuleLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>passiveModuleLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleLocationResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleLocationResponse> passiveModuleLocationWithHttpInfo(@Param("elid") String elid, PassiveModuleLocationRequest body, @QueryMap(encoded=true) PassiveModuleLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleLocation</code> method in a fluent style.
   */
  public static class PassiveModuleLocationQueryParams extends HashMap<String, Object> {
    public PassiveModuleLocationQueryParams sessionId(final String value) {
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
   * @return PassiveModuleLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleLogicalPortsResponseData passiveModuleLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>passiveModuleLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleLogicalPortsResponseData> passiveModuleLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleLogicalPortsResponseData passiveModuleLogicalPorts(@Param("elid") String elid, PassiveModuleLogicalPortsRequestData body, @QueryMap(encoded=true) PassiveModuleLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleLogicalPortsResponseData> passiveModuleLogicalPortsWithHttpInfo(@Param("elid") String elid, PassiveModuleLogicalPortsRequestData body, @QueryMap(encoded=true) PassiveModuleLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleLogicalPorts</code> method in a fluent style.
   */
  public static class PassiveModuleLogicalPortsQueryParams extends HashMap<String, Object> {
    public PassiveModuleLogicalPortsQueryParams sessionId(final String value) {
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
   * @return PassiveModuleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleMaintenanceContractsResponseData passiveModuleMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>passiveModuleMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleMaintenanceContractsResponseData> passiveModuleMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleMaintenanceContractsResponseData passiveModuleMaintenanceContracts(@Param("elid") String elid, PassiveModuleMaintenanceContractsRequestData body, @QueryMap(encoded=true) PassiveModuleMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleMaintenanceContractsResponseData> passiveModuleMaintenanceContractsWithHttpInfo(@Param("elid") String elid, PassiveModuleMaintenanceContractsRequestData body, @QueryMap(encoded=true) PassiveModuleMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleMaintenanceContracts</code> method in a fluent style.
   */
  public static class PassiveModuleMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public PassiveModuleMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return PassiveModuleNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleNetworksAndNetrangesResponse passiveModuleNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>passiveModuleNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleNetworksAndNetrangesResponse> passiveModuleNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>passiveModuleNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleNetworksAndNetrangesResponse passiveModuleNetworksAndNetranges(@Param("elid") String elid, PassiveModuleNetworksAndNetrangesRequest body, @QueryMap(encoded=true) PassiveModuleNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>passiveModuleNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleNetworksAndNetrangesResponse> passiveModuleNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, PassiveModuleNetworksAndNetrangesRequest body, @QueryMap(encoded=true) PassiveModuleNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleNetworksAndNetranges</code> method in a fluent style.
   */
  public static class PassiveModuleNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public PassiveModuleNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleOperatingSystemInstallationResponseData passiveModuleOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>passiveModuleOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleOperatingSystemInstallationResponseData> passiveModuleOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleOperatingSystemInstallationResponseData passiveModuleOperatingSystemInstallation(@Param("elid") String elid, PassiveModuleOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) PassiveModuleOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleOperatingSystemInstallationResponseData> passiveModuleOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, PassiveModuleOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) PassiveModuleOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class PassiveModuleOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public PassiveModuleOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return PassiveModuleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleOrganizationsResponseData passiveModuleOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>passiveModuleOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleOrganizationsResponseData> passiveModuleOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleOrganizationsResponseData passiveModuleOrganizations(@Param("elid") String elid, PassiveModuleOrganizationsRequestData body, @QueryMap(encoded=true) PassiveModuleOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleOrganizationsResponseData> passiveModuleOrganizationsWithHttpInfo(@Param("elid") String elid, PassiveModuleOrganizationsRequestData body, @QueryMap(encoded=true) PassiveModuleOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleOrganizations</code> method in a fluent style.
   */
  public static class PassiveModuleOrganizationsQueryParams extends HashMap<String, Object> {
    public PassiveModuleOrganizationsQueryParams sessionId(final String value) {
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
   * @return PassiveModulePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModulePersonGroupsResponseData passiveModulePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>passiveModulePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModulePersonGroupsResponseData> passiveModulePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>passiveModulePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModulePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModulePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModulePersonGroupsResponseData passiveModulePersonGroups(@Param("elid") String elid, PassiveModulePersonGroupsRequestData body, @QueryMap(encoded=true) PassiveModulePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>passiveModulePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModulePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModulePersonGroupsResponseData> passiveModulePersonGroupsWithHttpInfo(@Param("elid") String elid, PassiveModulePersonGroupsRequestData body, @QueryMap(encoded=true) PassiveModulePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModulePersonGroups</code> method in a fluent style.
   */
  public static class PassiveModulePersonGroupsQueryParams extends HashMap<String, Object> {
    public PassiveModulePersonGroupsQueryParams sessionId(final String value) {
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
   * @return PassiveModulePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModulePersonsResponseData passiveModulePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>passiveModulePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModulePersonsResponseData> passiveModulePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>passiveModulePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModulePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModulePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModulePersonsResponseData passiveModulePersons(@Param("elid") String elid, PassiveModulePersonsRequestData body, @QueryMap(encoded=true) PassiveModulePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>passiveModulePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModulePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModulePersonsResponseData> passiveModulePersonsWithHttpInfo(@Param("elid") String elid, PassiveModulePersonsRequestData body, @QueryMap(encoded=true) PassiveModulePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModulePersons</code> method in a fluent style.
   */
  public static class PassiveModulePersonsQueryParams extends HashMap<String, Object> {
    public PassiveModulePersonsQueryParams sessionId(final String value) {
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
   * @return PassiveModulePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModulePhysicalPortsDataResponseData passiveModulePhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>passiveModulePhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModulePhysicalPortsDataResponseData> passiveModulePhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>passiveModulePhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModulePhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModulePhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModulePhysicalPortsDataResponseData passiveModulePhysicalPortsData(@Param("elid") String elid, PassiveModulePhysicalPortsDataRequestData body, @QueryMap(encoded=true) PassiveModulePhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>passiveModulePhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModulePhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModulePhysicalPortsDataResponseData> passiveModulePhysicalPortsDataWithHttpInfo(@Param("elid") String elid, PassiveModulePhysicalPortsDataRequestData body, @QueryMap(encoded=true) PassiveModulePhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModulePhysicalPortsData</code> method in a fluent style.
   */
  public static class PassiveModulePhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public PassiveModulePhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return PassiveModulePhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModulePhysicalPortsPowerResponse passiveModulePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePhysicalPortsPowerRequest body);

  /**
   * Query Power ports
   * Similar to <code>passiveModulePhysicalPortsPower</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModulePhysicalPortsPowerResponse> passiveModulePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModulePhysicalPortsPowerRequest body);


  /**
   * Query Power ports
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>passiveModulePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModulePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModulePhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModulePhysicalPortsPowerResponse passiveModulePhysicalPortsPower(@Param("elid") String elid, PassiveModulePhysicalPortsPowerRequest body, @QueryMap(encoded=true) PassiveModulePhysicalPortsPowerQueryParams queryParams);

  /**
  * Query Power ports
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>passiveModulePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModulePhysicalPortsPowerResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModulePhysicalPortsPowerResponse> passiveModulePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, PassiveModulePhysicalPortsPowerRequest body, @QueryMap(encoded=true) PassiveModulePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModulePhysicalPortsPower</code> method in a fluent style.
   */
  public static class PassiveModulePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public PassiveModulePhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PassiveModuleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleQueryResponse passiveModuleQuery(@Param("sessionId") String sessionId, PassiveModuleQueryRequest body);

  /**
   * Basic query
   * Similar to <code>passiveModuleQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleQueryResponse> passiveModuleQueryWithHttpInfo(@Param("sessionId") String sessionId, PassiveModuleQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>passiveModuleQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleQueryResponse passiveModuleQuery(PassiveModuleQueryRequest body, @QueryMap(encoded=true) PassiveModuleQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>passiveModuleQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleQueryResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleQueryResponse> passiveModuleQueryWithHttpInfo(PassiveModuleQueryRequest body, @QueryMap(encoded=true) PassiveModuleQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleQuery</code> method in a fluent style.
   */
  public static class PassiveModuleQueryQueryParams extends HashMap<String, Object> {
    public PassiveModuleQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PassiveModuleQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleQueryExtendedResponse passiveModuleQueryExtended(@Param("sessionId") String sessionId, PassiveModuleQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>passiveModuleQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleQueryExtendedResponse> passiveModuleQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, PassiveModuleQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>passiveModuleQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleQueryExtendedResponse passiveModuleQueryExtended(PassiveModuleQueryExtendedRequest body, @QueryMap(encoded=true) PassiveModuleQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>passiveModuleQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleQueryExtendedResponse> passiveModuleQueryExtendedWithHttpInfo(PassiveModuleQueryExtendedRequest body, @QueryMap(encoded=true) PassiveModuleQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleQueryExtended</code> method in a fluent style.
   */
  public static class PassiveModuleQueryExtendedQueryParams extends HashMap<String, Object> {
    public PassiveModuleQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PassiveModuleQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleQueryExtendedScrollFirstResponse passiveModuleQueryExtendedScrollFirst(@Param("sessionId") String sessionId, PassiveModuleQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>passiveModuleQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleQueryExtendedScrollFirstResponse> passiveModuleQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, PassiveModuleQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>passiveModuleQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleQueryExtendedScrollFirstResponse passiveModuleQueryExtendedScrollFirst(PassiveModuleQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) PassiveModuleQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>passiveModuleQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleQueryExtendedScrollFirstResponse> passiveModuleQueryExtendedScrollFirstWithHttpInfo(PassiveModuleQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) PassiveModuleQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class PassiveModuleQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public PassiveModuleQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PassiveModuleQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleQueryExtendedScrollMoreResponse passiveModuleQueryExtendedScrollMore(@Param("sessionId") String sessionId, PassiveModuleQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>passiveModuleQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleQueryExtendedScrollMoreResponse> passiveModuleQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, PassiveModuleQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>passiveModuleQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleQueryExtendedScrollMoreResponse passiveModuleQueryExtendedScrollMore(PassiveModuleQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) PassiveModuleQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>passiveModuleQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleQueryExtendedScrollMoreResponse> passiveModuleQueryExtendedScrollMoreWithHttpInfo(PassiveModuleQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) PassiveModuleQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class PassiveModuleQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public PassiveModuleQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return PassiveModuleSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleSlotResponseData passiveModuleSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>passiveModuleSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleSlotResponseData> passiveModuleSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>passiveModuleSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleSlotResponseData passiveModuleSlot(@Param("elid") String elid, PassiveModuleSlotRequestData body, @QueryMap(encoded=true) PassiveModuleSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>passiveModuleSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleSlotResponseData> passiveModuleSlotWithHttpInfo(@Param("elid") String elid, PassiveModuleSlotRequestData body, @QueryMap(encoded=true) PassiveModuleSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleSlot</code> method in a fluent style.
   */
  public static class PassiveModuleSlotQueryParams extends HashMap<String, Object> {
    public PassiveModuleSlotQueryParams sessionId(final String value) {
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
   * @return PassiveModuleSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleSwitchCabinetResponseData passiveModuleSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>passiveModuleSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleSwitchCabinetResponseData> passiveModuleSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleSwitchCabinetResponseData passiveModuleSwitchCabinet(@Param("elid") String elid, PassiveModuleSwitchCabinetRequestData body, @QueryMap(encoded=true) PassiveModuleSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleSwitchCabinetResponseData> passiveModuleSwitchCabinetWithHttpInfo(@Param("elid") String elid, PassiveModuleSwitchCabinetRequestData body, @QueryMap(encoded=true) PassiveModuleSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleSwitchCabinet</code> method in a fluent style.
   */
  public static class PassiveModuleSwitchCabinetQueryParams extends HashMap<String, Object> {
    public PassiveModuleSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return PassiveModuleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleSystemAttributesResponse passiveModuleSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>passiveModuleSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleSystemAttributesResponse> passiveModuleSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>passiveModuleSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleSystemAttributesResponse passiveModuleSystemAttributes(@Param("elid") String elid, PassiveModuleSystemAttributesRequest body, @QueryMap(encoded=true) PassiveModuleSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>passiveModuleSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleSystemAttributesResponse> passiveModuleSystemAttributesWithHttpInfo(@Param("elid") String elid, PassiveModuleSystemAttributesRequest body, @QueryMap(encoded=true) PassiveModuleSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleSystemAttributes</code> method in a fluent style.
   */
  public static class PassiveModuleSystemAttributesQueryParams extends HashMap<String, Object> {
    public PassiveModuleSystemAttributesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleVirtualSwitchesResponseData passiveModuleVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>passiveModuleVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleVirtualSwitchesResponseData> passiveModuleVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleVirtualSwitchesResponseData passiveModuleVirtualSwitches(@Param("elid") String elid, PassiveModuleVirtualSwitchesRequestData body, @QueryMap(encoded=true) PassiveModuleVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleVirtualSwitchesResponseData> passiveModuleVirtualSwitchesWithHttpInfo(@Param("elid") String elid, PassiveModuleVirtualSwitchesRequestData body, @QueryMap(encoded=true) PassiveModuleVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleVirtualSwitches</code> method in a fluent style.
   */
  public static class PassiveModuleVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public PassiveModuleVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return PassiveModuleVlansResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleVlansResponse passiveModuleVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleVlansRequest body);

  /**
   * VLANs
   * Similar to <code>passiveModuleVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleVlansResponse> passiveModuleVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>passiveModuleVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleVlansResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleVlansResponse passiveModuleVlans(@Param("elid") String elid, PassiveModuleVlansRequest body, @QueryMap(encoded=true) PassiveModuleVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>passiveModuleVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleVlansResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleVlansResponse> passiveModuleVlansWithHttpInfo(@Param("elid") String elid, PassiveModuleVlansRequest body, @QueryMap(encoded=true) PassiveModuleVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleVlans</code> method in a fluent style.
   */
  public static class PassiveModuleVlansQueryParams extends HashMap<String, Object> {
    public PassiveModuleVlansQueryParams sessionId(final String value) {
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
   * @return PassiveModuleVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleVlansAtSlotResponse passiveModuleVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>passiveModuleVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleVlansAtSlotResponse> passiveModuleVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>passiveModuleVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleVlansAtSlotResponse passiveModuleVlansAtSlot(@Param("elid") String elid, PassiveModuleVlansAtSlotRequest body, @QueryMap(encoded=true) PassiveModuleVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>passiveModuleVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleVlansAtSlotResponse> passiveModuleVlansAtSlotWithHttpInfo(@Param("elid") String elid, PassiveModuleVlansAtSlotRequest body, @QueryMap(encoded=true) PassiveModuleVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleVlansAtSlot</code> method in a fluent style.
   */
  public static class PassiveModuleVlansAtSlotQueryParams extends HashMap<String, Object> {
    public PassiveModuleVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return PassiveModuleWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleWarehouseResponseData passiveModuleWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>passiveModuleWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleWarehouseResponseData> passiveModuleWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleWarehouseResponseData passiveModuleWarehouse(@Param("elid") String elid, PassiveModuleWarehouseRequestData body, @QueryMap(encoded=true) PassiveModuleWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleWarehouseResponseData> passiveModuleWarehouseWithHttpInfo(@Param("elid") String elid, PassiveModuleWarehouseRequestData body, @QueryMap(encoded=true) PassiveModuleWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleWarehouse</code> method in a fluent style.
   */
  public static class PassiveModuleWarehouseQueryParams extends HashMap<String, Object> {
    public PassiveModuleWarehouseQueryParams sessionId(final String value) {
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
   * @return PassiveModuleZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PassiveModuleZoneResponseData passiveModuleZone(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>passiveModuleZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PassiveModuleZoneResponseData> passiveModuleZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PassiveModuleZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>passiveModuleZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PassiveModuleZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PassiveModuleZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PassiveModuleZoneResponseData passiveModuleZone(@Param("elid") String elid, PassiveModuleZoneRequestData body, @QueryMap(encoded=true) PassiveModuleZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>passiveModuleZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PassiveModuleZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PassiveModuleZoneResponseData> passiveModuleZoneWithHttpInfo(@Param("elid") String elid, PassiveModuleZoneRequestData body, @QueryMap(encoded=true) PassiveModuleZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>passiveModuleZone</code> method in a fluent style.
   */
  public static class PassiveModuleZoneQueryParams extends HashMap<String, Object> {
    public PassiveModuleZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetPassiveModuleResponse placeInCabinetPassiveModule(@Param("sessionId") String sessionId, PlaceInCabinetPassiveModuleRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetPassiveModule</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetPassiveModuleResponse> placeInCabinetPassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetPassiveModuleRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetPassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetPassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetPassiveModuleResponse placeInCabinetPassiveModule(PlaceInCabinetPassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInCabinetPassiveModuleQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetPassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetPassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetPassiveModuleResponse> placeInCabinetPassiveModuleWithHttpInfo(PlaceInCabinetPassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInCabinetPassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetPassiveModule</code> method in a fluent style.
   */
  public static class PlaceInCabinetPassiveModuleQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetPassiveModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotPassiveModuleResponse placeInSlotPassiveModule(@Param("sessionId") String sessionId, PlaceInSlotPassiveModuleRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotPassiveModule</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotPassiveModuleResponse> placeInSlotPassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotPassiveModuleRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotPassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotPassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotPassiveModuleResponse placeInSlotPassiveModule(PlaceInSlotPassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInSlotPassiveModuleQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotPassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotPassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotPassiveModuleResponse> placeInSlotPassiveModuleWithHttpInfo(PlaceInSlotPassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInSlotPassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotPassiveModule</code> method in a fluent style.
   */
  public static class PlaceInSlotPassiveModuleQueryParams extends HashMap<String, Object> {
    public PlaceInSlotPassiveModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehousePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehousePassiveModuleResponse placeInWarehousePassiveModule(@Param("sessionId") String sessionId, PlaceInWarehousePassiveModuleRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehousePassiveModule</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehousePassiveModuleResponse> placeInWarehousePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehousePassiveModuleRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehousePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehousePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehousePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehousePassiveModuleResponse placeInWarehousePassiveModule(PlaceInWarehousePassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInWarehousePassiveModuleQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehousePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehousePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehousePassiveModuleResponse> placeInWarehousePassiveModuleWithHttpInfo(PlaceInWarehousePassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInWarehousePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehousePassiveModule</code> method in a fluent style.
   */
  public static class PlaceInWarehousePassiveModuleQueryParams extends HashMap<String, Object> {
    public PlaceInWarehousePassiveModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZonePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZonePassiveModuleResponse placeInZonePassiveModule(@Param("sessionId") String sessionId, PlaceInZonePassiveModuleRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZonePassiveModule</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZonePassiveModuleResponse> placeInZonePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZonePassiveModuleRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZonePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZonePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZonePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZonePassiveModuleResponse placeInZonePassiveModule(PlaceInZonePassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInZonePassiveModuleQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZonePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZonePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZonePassiveModuleResponse> placeInZonePassiveModuleWithHttpInfo(PlaceInZonePassiveModuleRequestData body, @QueryMap(encoded=true) PlaceInZonePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZonePassiveModule</code> method in a fluent style.
   */
  public static class PlaceInZonePassiveModuleQueryParams extends HashMap<String, Object> {
    public PlaceInZonePassiveModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify passive module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePassiveModuleResponse updatePassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePassiveModuleRequestData body);

  /**
   * Modify
   * Similar to <code>updatePassiveModule</code> but it also returns the http response headers .
   * Modify passive module
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePassiveModuleResponse> updatePassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePassiveModuleRequestData body);


  /**
   * Modify
   * Modify passive module
   * Note, this is equivalent to the other <code>updatePassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePassiveModuleResponse updatePassiveModule(@Param("elid") String elid, UpdatePassiveModuleRequestData body, @QueryMap(encoded=true) UpdatePassiveModuleQueryParams queryParams);

  /**
  * Modify
  * Modify passive module
  * Note, this is equivalent to the other <code>updatePassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePassiveModuleResponse> updatePassiveModuleWithHttpInfo(@Param("elid") String elid, UpdatePassiveModuleRequestData body, @QueryMap(encoded=true) UpdatePassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePassiveModule</code> method in a fluent style.
   */
  public static class UpdatePassiveModuleQueryParams extends HashMap<String, Object> {
    public UpdatePassiveModuleQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPassiveModuleResponse updateSystemAttributesPassiveModule(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPassiveModuleRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPassiveModule</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPassiveModuleResponse> updateSystemAttributesPassiveModuleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPassiveModuleRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPassiveModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPassiveModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPassiveModuleResponse
   */
  @RequestLine("POST /api/rest/entity/passiveModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPassiveModuleResponse updateSystemAttributesPassiveModule(@Param("elid") String elid, UpdateSystemAttributesPassiveModuleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPassiveModuleQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPassiveModule</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPassiveModuleResponse
      */
      @RequestLine("POST /api/rest/entity/passiveModule/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPassiveModuleResponse> updateSystemAttributesPassiveModuleWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPassiveModuleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPassiveModuleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPassiveModule</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPassiveModuleQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPassiveModuleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
