package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeTerminalRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeTerminalResponse;
import com.fntsoftware.businessgateway.entities.DeleteTerminalRequestData;
import com.fntsoftware.businessgateway.entities.DeleteTerminalResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetTerminalRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetTerminalResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotTerminalRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotTerminalResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseTerminalRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseTerminalResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneTerminalRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneTerminalResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetTerminalRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetTerminalResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotTerminalRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotTerminalResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseTerminalRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseTerminalResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneTerminalRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneTerminalResponse;
import com.fntsoftware.businessgateway.entities.TerminalContractsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalContractsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.TerminalDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.TerminalFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.TerminalInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.TerminalInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.TerminalInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.TerminalIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.TerminalIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.TerminalIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.TerminalIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.TerminalIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.TerminalIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.TerminalIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.TerminalIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.TerminalLocationRequest;
import com.fntsoftware.businessgateway.entities.TerminalLocationResponse;
import com.fntsoftware.businessgateway.entities.TerminalLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.TerminalNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.TerminalOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.TerminalOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.TerminalOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalPersonsRequestData;
import com.fntsoftware.businessgateway.entities.TerminalPersonsResponseData;
import com.fntsoftware.businessgateway.entities.TerminalPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.TerminalPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.TerminalPhysicalPortsPowerRequest;
import com.fntsoftware.businessgateway.entities.TerminalPhysicalPortsPowerResponse;
import com.fntsoftware.businessgateway.entities.TerminalQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.TerminalQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.TerminalQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.TerminalQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.TerminalQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.TerminalQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.TerminalQueryRequest;
import com.fntsoftware.businessgateway.entities.TerminalQueryResponse;
import com.fntsoftware.businessgateway.entities.TerminalSlotRequestData;
import com.fntsoftware.businessgateway.entities.TerminalSlotResponseData;
import com.fntsoftware.businessgateway.entities.TerminalSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.TerminalSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.TerminalSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TerminalSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.TerminalVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.TerminalVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.TerminalVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.TerminalVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.TerminalVlansRequest;
import com.fntsoftware.businessgateway.entities.TerminalVlansResponse;
import com.fntsoftware.businessgateway.entities.TerminalWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.TerminalWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.TerminalZoneRequestData;
import com.fntsoftware.businessgateway.entities.TerminalZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTerminalRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTerminalResponse;
import com.fntsoftware.businessgateway.entities.UpdateTerminalRequestData;
import com.fntsoftware.businessgateway.entities.UpdateTerminalResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface TerminalApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeTerminalResponse changeTypeTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeTerminalRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeTerminal</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeTerminalResponse> changeTypeTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeTerminalRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeTerminalResponse changeTypeTerminal(@Param("elid") String elid, ChangeTypeTerminalRequestData body, @QueryMap(encoded=true) ChangeTypeTerminalQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeTerminalResponse> changeTypeTerminalWithHttpInfo(@Param("elid") String elid, ChangeTypeTerminalRequestData body, @QueryMap(encoded=true) ChangeTypeTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeTerminal</code> method in a fluent style.
   */
  public static class ChangeTypeTerminalQueryParams extends HashMap<String, Object> {
    public ChangeTypeTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete terminal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteTerminalResponse deleteTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTerminalRequestData body);

  /**
   * Delete
   * Similar to <code>deleteTerminal</code> but it also returns the http response headers .
   * Delete terminal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteTerminalResponse> deleteTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTerminalRequestData body);


  /**
   * Delete
   * Delete terminal
   * Note, this is equivalent to the other <code>deleteTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteTerminalResponse deleteTerminal(@Param("elid") String elid, DeleteTerminalRequestData body, @QueryMap(encoded=true) DeleteTerminalQueryParams queryParams);

  /**
  * Delete
  * Delete terminal
  * Note, this is equivalent to the other <code>deleteTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteTerminalResponse> deleteTerminalWithHttpInfo(@Param("elid") String elid, DeleteTerminalRequestData body, @QueryMap(encoded=true) DeleteTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTerminal</code> method in a fluent style.
   */
  public static class DeleteTerminalQueryParams extends HashMap<String, Object> {
    public DeleteTerminalQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetTerminalResponse moveToCabinetTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetTerminalRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetTerminal</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetTerminalResponse> moveToCabinetTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetTerminalRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetTerminalResponse moveToCabinetTerminal(@Param("elid") String elid, MoveToCabinetTerminalRequestData body, @QueryMap(encoded=true) MoveToCabinetTerminalQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetTerminalResponse> moveToCabinetTerminalWithHttpInfo(@Param("elid") String elid, MoveToCabinetTerminalRequestData body, @QueryMap(encoded=true) MoveToCabinetTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetTerminal</code> method in a fluent style.
   */
  public static class MoveToCabinetTerminalQueryParams extends HashMap<String, Object> {
    public MoveToCabinetTerminalQueryParams sessionId(final String value) {
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
   * @return MoveToSlotTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotTerminalResponse moveToSlotTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotTerminalRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotTerminal</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotTerminalResponse> moveToSlotTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotTerminalRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotTerminalResponse moveToSlotTerminal(@Param("elid") String elid, MoveToSlotTerminalRequestData body, @QueryMap(encoded=true) MoveToSlotTerminalQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotTerminalResponse> moveToSlotTerminalWithHttpInfo(@Param("elid") String elid, MoveToSlotTerminalRequestData body, @QueryMap(encoded=true) MoveToSlotTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotTerminal</code> method in a fluent style.
   */
  public static class MoveToSlotTerminalQueryParams extends HashMap<String, Object> {
    public MoveToSlotTerminalQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseTerminalResponse moveToWarehouseTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseTerminalRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseTerminal</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseTerminalResponse> moveToWarehouseTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseTerminalRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseTerminalResponse moveToWarehouseTerminal(@Param("elid") String elid, MoveToWarehouseTerminalRequestData body, @QueryMap(encoded=true) MoveToWarehouseTerminalQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseTerminalResponse> moveToWarehouseTerminalWithHttpInfo(@Param("elid") String elid, MoveToWarehouseTerminalRequestData body, @QueryMap(encoded=true) MoveToWarehouseTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseTerminal</code> method in a fluent style.
   */
  public static class MoveToWarehouseTerminalQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseTerminalQueryParams sessionId(final String value) {
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
   * @return MoveToZoneTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneTerminalResponse moveToZoneTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneTerminalRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneTerminal</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneTerminalResponse> moveToZoneTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneTerminalRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneTerminalResponse moveToZoneTerminal(@Param("elid") String elid, MoveToZoneTerminalRequestData body, @QueryMap(encoded=true) MoveToZoneTerminalQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneTerminalResponse> moveToZoneTerminalWithHttpInfo(@Param("elid") String elid, MoveToZoneTerminalRequestData body, @QueryMap(encoded=true) MoveToZoneTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneTerminal</code> method in a fluent style.
   */
  public static class MoveToZoneTerminalQueryParams extends HashMap<String, Object> {
    public MoveToZoneTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetTerminalResponse placeInCabinetTerminal(@Param("sessionId") String sessionId, PlaceInCabinetTerminalRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetTerminal</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetTerminalResponse> placeInCabinetTerminalWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetTerminalRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetTerminalResponse placeInCabinetTerminal(PlaceInCabinetTerminalRequestData body, @QueryMap(encoded=true) PlaceInCabinetTerminalQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetTerminalResponse> placeInCabinetTerminalWithHttpInfo(PlaceInCabinetTerminalRequestData body, @QueryMap(encoded=true) PlaceInCabinetTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetTerminal</code> method in a fluent style.
   */
  public static class PlaceInCabinetTerminalQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotTerminalResponse placeInSlotTerminal(@Param("sessionId") String sessionId, PlaceInSlotTerminalRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotTerminal</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotTerminalResponse> placeInSlotTerminalWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotTerminalRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotTerminalResponse placeInSlotTerminal(PlaceInSlotTerminalRequestData body, @QueryMap(encoded=true) PlaceInSlotTerminalQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotTerminalResponse> placeInSlotTerminalWithHttpInfo(PlaceInSlotTerminalRequestData body, @QueryMap(encoded=true) PlaceInSlotTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotTerminal</code> method in a fluent style.
   */
  public static class PlaceInSlotTerminalQueryParams extends HashMap<String, Object> {
    public PlaceInSlotTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseTerminalResponse placeInWarehouseTerminal(@Param("sessionId") String sessionId, PlaceInWarehouseTerminalRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseTerminal</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseTerminalResponse> placeInWarehouseTerminalWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseTerminalRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseTerminalResponse placeInWarehouseTerminal(PlaceInWarehouseTerminalRequestData body, @QueryMap(encoded=true) PlaceInWarehouseTerminalQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseTerminalResponse> placeInWarehouseTerminalWithHttpInfo(PlaceInWarehouseTerminalRequestData body, @QueryMap(encoded=true) PlaceInWarehouseTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseTerminal</code> method in a fluent style.
   */
  public static class PlaceInWarehouseTerminalQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneTerminalResponse placeInZoneTerminal(@Param("sessionId") String sessionId, PlaceInZoneTerminalRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneTerminal</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneTerminalResponse> placeInZoneTerminalWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneTerminalRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneTerminalResponse placeInZoneTerminal(PlaceInZoneTerminalRequestData body, @QueryMap(encoded=true) PlaceInZoneTerminalQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneTerminalResponse> placeInZoneTerminalWithHttpInfo(PlaceInZoneTerminalRequestData body, @QueryMap(encoded=true) PlaceInZoneTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneTerminal</code> method in a fluent style.
   */
  public static class PlaceInZoneTerminalQueryParams extends HashMap<String, Object> {
    public PlaceInZoneTerminalQueryParams sessionId(final String value) {
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
   * @return TerminalContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalContractsResponseData terminalContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>terminalContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalContractsResponseData> terminalContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>terminalContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalContractsResponseData terminalContracts(@Param("elid") String elid, TerminalContractsRequestData body, @QueryMap(encoded=true) TerminalContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>terminalContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalContractsResponseData> terminalContractsWithHttpInfo(@Param("elid") String elid, TerminalContractsRequestData body, @QueryMap(encoded=true) TerminalContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalContracts</code> method in a fluent style.
   */
  public static class TerminalContractsQueryParams extends HashMap<String, Object> {
    public TerminalContractsQueryParams sessionId(final String value) {
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
   * @return TerminalDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalDeviceMasterResponseData terminalDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>terminalDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalDeviceMasterResponseData> terminalDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>terminalDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalDeviceMasterResponseData terminalDeviceMaster(@Param("elid") String elid, TerminalDeviceMasterRequestData body, @QueryMap(encoded=true) TerminalDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>terminalDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalDeviceMasterResponseData> terminalDeviceMasterWithHttpInfo(@Param("elid") String elid, TerminalDeviceMasterRequestData body, @QueryMap(encoded=true) TerminalDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalDeviceMaster</code> method in a fluent style.
   */
  public static class TerminalDeviceMasterQueryParams extends HashMap<String, Object> {
    public TerminalDeviceMasterQueryParams sessionId(final String value) {
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
   * @return TerminalFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalFrameContractsResponseData terminalFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>terminalFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalFrameContractsResponseData> terminalFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>terminalFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalFrameContractsResponseData terminalFrameContracts(@Param("elid") String elid, TerminalFrameContractsRequestData body, @QueryMap(encoded=true) TerminalFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>terminalFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalFrameContractsResponseData> terminalFrameContractsWithHttpInfo(@Param("elid") String elid, TerminalFrameContractsRequestData body, @QueryMap(encoded=true) TerminalFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalFrameContracts</code> method in a fluent style.
   */
  public static class TerminalFrameContractsQueryParams extends HashMap<String, Object> {
    public TerminalFrameContractsQueryParams sessionId(final String value) {
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
   * @return TerminalInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalInstalledSubCardsResponse terminalInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>terminalInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalInstalledSubCardsResponse> terminalInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>terminalInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalInstalledSubCardsResponse terminalInstalledSubCards(@Param("elid") String elid, TerminalInstalledSubCardsRequest body, @QueryMap(encoded=true) TerminalInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>terminalInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalInstalledSubCardsResponse> terminalInstalledSubCardsWithHttpInfo(@Param("elid") String elid, TerminalInstalledSubCardsRequest body, @QueryMap(encoded=true) TerminalInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalInstalledSubCards</code> method in a fluent style.
   */
  public static class TerminalInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public TerminalInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return TerminalInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalInterfacesResponseData terminalInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>terminalInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalInterfacesResponseData> terminalInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>terminalInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalInterfacesResponseData terminalInterfaces(@Param("elid") String elid, TerminalInterfacesRequestData body, @QueryMap(encoded=true) TerminalInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>terminalInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalInterfacesResponseData> terminalInterfacesWithHttpInfo(@Param("elid") String elid, TerminalInterfacesRequestData body, @QueryMap(encoded=true) TerminalInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalInterfaces</code> method in a fluent style.
   */
  public static class TerminalInterfacesQueryParams extends HashMap<String, Object> {
    public TerminalInterfacesQueryParams sessionId(final String value) {
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
   * @return TerminalIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalIpAddressesResponse terminalIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>terminalIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalIpAddressesResponse> terminalIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>terminalIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalIpAddressesResponse terminalIpAddresses(@Param("elid") String elid, TerminalIpAddressesRequest body, @QueryMap(encoded=true) TerminalIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>terminalIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalIpAddressesResponse> terminalIpAddressesWithHttpInfo(@Param("elid") String elid, TerminalIpAddressesRequest body, @QueryMap(encoded=true) TerminalIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalIpAddresses</code> method in a fluent style.
   */
  public static class TerminalIpAddressesQueryParams extends HashMap<String, Object> {
    public TerminalIpAddressesQueryParams sessionId(final String value) {
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
   * @return TerminalIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalIpv4AddressesResponseData terminalIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>terminalIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalIpv4AddressesResponseData> terminalIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>terminalIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalIpv4AddressesResponseData terminalIpv4Addresses(@Param("elid") String elid, TerminalIpv4AddressesRequestData body, @QueryMap(encoded=true) TerminalIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>terminalIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalIpv4AddressesResponseData> terminalIpv4AddressesWithHttpInfo(@Param("elid") String elid, TerminalIpv4AddressesRequestData body, @QueryMap(encoded=true) TerminalIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalIpv4Addresses</code> method in a fluent style.
   */
  public static class TerminalIpv4AddressesQueryParams extends HashMap<String, Object> {
    public TerminalIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return TerminalIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalIpv4NetrangesResponseData terminalIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>terminalIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalIpv4NetrangesResponseData> terminalIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>terminalIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalIpv4NetrangesResponseData terminalIpv4Netranges(@Param("elid") String elid, TerminalIpv4NetrangesRequestData body, @QueryMap(encoded=true) TerminalIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>terminalIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalIpv4NetrangesResponseData> terminalIpv4NetrangesWithHttpInfo(@Param("elid") String elid, TerminalIpv4NetrangesRequestData body, @QueryMap(encoded=true) TerminalIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalIpv4Netranges</code> method in a fluent style.
   */
  public static class TerminalIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public TerminalIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return TerminalIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalIpv4NetworksResponseData terminalIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>terminalIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalIpv4NetworksResponseData> terminalIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>terminalIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalIpv4NetworksResponseData terminalIpv4Networks(@Param("elid") String elid, TerminalIpv4NetworksRequestData body, @QueryMap(encoded=true) TerminalIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>terminalIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalIpv4NetworksResponseData> terminalIpv4NetworksWithHttpInfo(@Param("elid") String elid, TerminalIpv4NetworksRequestData body, @QueryMap(encoded=true) TerminalIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalIpv4Networks</code> method in a fluent style.
   */
  public static class TerminalIpv4NetworksQueryParams extends HashMap<String, Object> {
    public TerminalIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return TerminalLocationResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalLocationResponse terminalLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalLocationRequest body);

  /**
   * Location
   * Similar to <code>terminalLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalLocationResponse> terminalLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>terminalLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalLocationResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalLocationResponse terminalLocation(@Param("elid") String elid, TerminalLocationRequest body, @QueryMap(encoded=true) TerminalLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>terminalLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalLocationResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalLocationResponse> terminalLocationWithHttpInfo(@Param("elid") String elid, TerminalLocationRequest body, @QueryMap(encoded=true) TerminalLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalLocation</code> method in a fluent style.
   */
  public static class TerminalLocationQueryParams extends HashMap<String, Object> {
    public TerminalLocationQueryParams sessionId(final String value) {
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
   * @return TerminalLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalLogicalPortsResponseData terminalLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>terminalLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalLogicalPortsResponseData> terminalLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>terminalLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalLogicalPortsResponseData terminalLogicalPorts(@Param("elid") String elid, TerminalLogicalPortsRequestData body, @QueryMap(encoded=true) TerminalLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>terminalLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalLogicalPortsResponseData> terminalLogicalPortsWithHttpInfo(@Param("elid") String elid, TerminalLogicalPortsRequestData body, @QueryMap(encoded=true) TerminalLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalLogicalPorts</code> method in a fluent style.
   */
  public static class TerminalLogicalPortsQueryParams extends HashMap<String, Object> {
    public TerminalLogicalPortsQueryParams sessionId(final String value) {
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
   * @return TerminalMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalMaintenanceContractsResponseData terminalMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>terminalMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalMaintenanceContractsResponseData> terminalMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>terminalMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalMaintenanceContractsResponseData terminalMaintenanceContracts(@Param("elid") String elid, TerminalMaintenanceContractsRequestData body, @QueryMap(encoded=true) TerminalMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>terminalMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalMaintenanceContractsResponseData> terminalMaintenanceContractsWithHttpInfo(@Param("elid") String elid, TerminalMaintenanceContractsRequestData body, @QueryMap(encoded=true) TerminalMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalMaintenanceContracts</code> method in a fluent style.
   */
  public static class TerminalMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public TerminalMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return TerminalNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalNetworksAndNetrangesResponse terminalNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>terminalNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalNetworksAndNetrangesResponse> terminalNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>terminalNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalNetworksAndNetrangesResponse terminalNetworksAndNetranges(@Param("elid") String elid, TerminalNetworksAndNetrangesRequest body, @QueryMap(encoded=true) TerminalNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>terminalNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalNetworksAndNetrangesResponse> terminalNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, TerminalNetworksAndNetrangesRequest body, @QueryMap(encoded=true) TerminalNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalNetworksAndNetranges</code> method in a fluent style.
   */
  public static class TerminalNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public TerminalNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return TerminalOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalOperatingSystemInstallationResponseData terminalOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>terminalOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalOperatingSystemInstallationResponseData> terminalOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>terminalOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalOperatingSystemInstallationResponseData terminalOperatingSystemInstallation(@Param("elid") String elid, TerminalOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) TerminalOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>terminalOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalOperatingSystemInstallationResponseData> terminalOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, TerminalOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) TerminalOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class TerminalOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public TerminalOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return TerminalOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalOrganizationsResponseData terminalOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>terminalOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalOrganizationsResponseData> terminalOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>terminalOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalOrganizationsResponseData terminalOrganizations(@Param("elid") String elid, TerminalOrganizationsRequestData body, @QueryMap(encoded=true) TerminalOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>terminalOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalOrganizationsResponseData> terminalOrganizationsWithHttpInfo(@Param("elid") String elid, TerminalOrganizationsRequestData body, @QueryMap(encoded=true) TerminalOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalOrganizations</code> method in a fluent style.
   */
  public static class TerminalOrganizationsQueryParams extends HashMap<String, Object> {
    public TerminalOrganizationsQueryParams sessionId(final String value) {
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
   * @return TerminalPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalPersonGroupsResponseData terminalPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>terminalPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalPersonGroupsResponseData> terminalPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>terminalPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalPersonGroupsResponseData terminalPersonGroups(@Param("elid") String elid, TerminalPersonGroupsRequestData body, @QueryMap(encoded=true) TerminalPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>terminalPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalPersonGroupsResponseData> terminalPersonGroupsWithHttpInfo(@Param("elid") String elid, TerminalPersonGroupsRequestData body, @QueryMap(encoded=true) TerminalPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalPersonGroups</code> method in a fluent style.
   */
  public static class TerminalPersonGroupsQueryParams extends HashMap<String, Object> {
    public TerminalPersonGroupsQueryParams sessionId(final String value) {
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
   * @return TerminalPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalPersonsResponseData terminalPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>terminalPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalPersonsResponseData> terminalPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>terminalPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalPersonsResponseData terminalPersons(@Param("elid") String elid, TerminalPersonsRequestData body, @QueryMap(encoded=true) TerminalPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>terminalPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalPersonsResponseData> terminalPersonsWithHttpInfo(@Param("elid") String elid, TerminalPersonsRequestData body, @QueryMap(encoded=true) TerminalPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalPersons</code> method in a fluent style.
   */
  public static class TerminalPersonsQueryParams extends HashMap<String, Object> {
    public TerminalPersonsQueryParams sessionId(final String value) {
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
   * @return TerminalPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalPhysicalPortsDataResponseData terminalPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>terminalPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalPhysicalPortsDataResponseData> terminalPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>terminalPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalPhysicalPortsDataResponseData terminalPhysicalPortsData(@Param("elid") String elid, TerminalPhysicalPortsDataRequestData body, @QueryMap(encoded=true) TerminalPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>terminalPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalPhysicalPortsDataResponseData> terminalPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, TerminalPhysicalPortsDataRequestData body, @QueryMap(encoded=true) TerminalPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalPhysicalPortsData</code> method in a fluent style.
   */
  public static class TerminalPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public TerminalPhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return TerminalPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalPhysicalPortsPowerResponse terminalPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPhysicalPortsPowerRequest body);

  /**
   * Query Power ports
   * Similar to <code>terminalPhysicalPortsPower</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalPhysicalPortsPowerResponse> terminalPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalPhysicalPortsPowerRequest body);


  /**
   * Query Power ports
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>terminalPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalPhysicalPortsPowerResponse terminalPhysicalPortsPower(@Param("elid") String elid, TerminalPhysicalPortsPowerRequest body, @QueryMap(encoded=true) TerminalPhysicalPortsPowerQueryParams queryParams);

  /**
  * Query Power ports
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>terminalPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalPhysicalPortsPowerResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalPhysicalPortsPowerResponse> terminalPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, TerminalPhysicalPortsPowerRequest body, @QueryMap(encoded=true) TerminalPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalPhysicalPortsPower</code> method in a fluent style.
   */
  public static class TerminalPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public TerminalPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TerminalQueryResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalQueryResponse terminalQuery(@Param("sessionId") String sessionId, TerminalQueryRequest body);

  /**
   * Basic query
   * Similar to <code>terminalQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalQueryResponse> terminalQueryWithHttpInfo(@Param("sessionId") String sessionId, TerminalQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>terminalQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalQueryResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalQueryResponse terminalQuery(TerminalQueryRequest body, @QueryMap(encoded=true) TerminalQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>terminalQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalQueryResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalQueryResponse> terminalQueryWithHttpInfo(TerminalQueryRequest body, @QueryMap(encoded=true) TerminalQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalQuery</code> method in a fluent style.
   */
  public static class TerminalQueryQueryParams extends HashMap<String, Object> {
    public TerminalQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TerminalQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalQueryExtendedResponse terminalQueryExtended(@Param("sessionId") String sessionId, TerminalQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>terminalQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalQueryExtendedResponse> terminalQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, TerminalQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>terminalQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalQueryExtendedResponse terminalQueryExtended(TerminalQueryExtendedRequest body, @QueryMap(encoded=true) TerminalQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>terminalQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalQueryExtendedResponse> terminalQueryExtendedWithHttpInfo(TerminalQueryExtendedRequest body, @QueryMap(encoded=true) TerminalQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalQueryExtended</code> method in a fluent style.
   */
  public static class TerminalQueryExtendedQueryParams extends HashMap<String, Object> {
    public TerminalQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TerminalQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalQueryExtendedScrollFirstResponse terminalQueryExtendedScrollFirst(@Param("sessionId") String sessionId, TerminalQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>terminalQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalQueryExtendedScrollFirstResponse> terminalQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, TerminalQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>terminalQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalQueryExtendedScrollFirstResponse terminalQueryExtendedScrollFirst(TerminalQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) TerminalQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>terminalQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalQueryExtendedScrollFirstResponse> terminalQueryExtendedScrollFirstWithHttpInfo(TerminalQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) TerminalQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class TerminalQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public TerminalQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TerminalQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalQueryExtendedScrollMoreResponse terminalQueryExtendedScrollMore(@Param("sessionId") String sessionId, TerminalQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>terminalQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalQueryExtendedScrollMoreResponse> terminalQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, TerminalQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>terminalQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalQueryExtendedScrollMoreResponse terminalQueryExtendedScrollMore(TerminalQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) TerminalQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>terminalQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalQueryExtendedScrollMoreResponse> terminalQueryExtendedScrollMoreWithHttpInfo(TerminalQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) TerminalQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class TerminalQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public TerminalQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return TerminalSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalSlotResponseData terminalSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>terminalSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalSlotResponseData> terminalSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>terminalSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalSlotResponseData terminalSlot(@Param("elid") String elid, TerminalSlotRequestData body, @QueryMap(encoded=true) TerminalSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>terminalSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalSlotResponseData> terminalSlotWithHttpInfo(@Param("elid") String elid, TerminalSlotRequestData body, @QueryMap(encoded=true) TerminalSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalSlot</code> method in a fluent style.
   */
  public static class TerminalSlotQueryParams extends HashMap<String, Object> {
    public TerminalSlotQueryParams sessionId(final String value) {
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
   * @return TerminalSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalSwitchCabinetResponseData terminalSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>terminalSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalSwitchCabinetResponseData> terminalSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>terminalSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalSwitchCabinetResponseData terminalSwitchCabinet(@Param("elid") String elid, TerminalSwitchCabinetRequestData body, @QueryMap(encoded=true) TerminalSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>terminalSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalSwitchCabinetResponseData> terminalSwitchCabinetWithHttpInfo(@Param("elid") String elid, TerminalSwitchCabinetRequestData body, @QueryMap(encoded=true) TerminalSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalSwitchCabinet</code> method in a fluent style.
   */
  public static class TerminalSwitchCabinetQueryParams extends HashMap<String, Object> {
    public TerminalSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return TerminalSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalSystemAttributesResponse terminalSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>terminalSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalSystemAttributesResponse> terminalSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>terminalSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalSystemAttributesResponse terminalSystemAttributes(@Param("elid") String elid, TerminalSystemAttributesRequest body, @QueryMap(encoded=true) TerminalSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>terminalSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalSystemAttributesResponse> terminalSystemAttributesWithHttpInfo(@Param("elid") String elid, TerminalSystemAttributesRequest body, @QueryMap(encoded=true) TerminalSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalSystemAttributes</code> method in a fluent style.
   */
  public static class TerminalSystemAttributesQueryParams extends HashMap<String, Object> {
    public TerminalSystemAttributesQueryParams sessionId(final String value) {
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
   * @return TerminalVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalVirtualSwitchesResponseData terminalVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>terminalVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalVirtualSwitchesResponseData> terminalVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>terminalVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalVirtualSwitchesResponseData terminalVirtualSwitches(@Param("elid") String elid, TerminalVirtualSwitchesRequestData body, @QueryMap(encoded=true) TerminalVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>terminalVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalVirtualSwitchesResponseData> terminalVirtualSwitchesWithHttpInfo(@Param("elid") String elid, TerminalVirtualSwitchesRequestData body, @QueryMap(encoded=true) TerminalVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalVirtualSwitches</code> method in a fluent style.
   */
  public static class TerminalVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public TerminalVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return TerminalVlansResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalVlansResponse terminalVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalVlansRequest body);

  /**
   * VLANs
   * Similar to <code>terminalVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalVlansResponse> terminalVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>terminalVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalVlansResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalVlansResponse terminalVlans(@Param("elid") String elid, TerminalVlansRequest body, @QueryMap(encoded=true) TerminalVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>terminalVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalVlansResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalVlansResponse> terminalVlansWithHttpInfo(@Param("elid") String elid, TerminalVlansRequest body, @QueryMap(encoded=true) TerminalVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalVlans</code> method in a fluent style.
   */
  public static class TerminalVlansQueryParams extends HashMap<String, Object> {
    public TerminalVlansQueryParams sessionId(final String value) {
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
   * @return TerminalVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalVlansAtSlotResponse terminalVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>terminalVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalVlansAtSlotResponse> terminalVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>terminalVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalVlansAtSlotResponse terminalVlansAtSlot(@Param("elid") String elid, TerminalVlansAtSlotRequest body, @QueryMap(encoded=true) TerminalVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>terminalVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalVlansAtSlotResponse> terminalVlansAtSlotWithHttpInfo(@Param("elid") String elid, TerminalVlansAtSlotRequest body, @QueryMap(encoded=true) TerminalVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalVlansAtSlot</code> method in a fluent style.
   */
  public static class TerminalVlansAtSlotQueryParams extends HashMap<String, Object> {
    public TerminalVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return TerminalWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalWarehouseResponseData terminalWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>terminalWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalWarehouseResponseData> terminalWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>terminalWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalWarehouseResponseData terminalWarehouse(@Param("elid") String elid, TerminalWarehouseRequestData body, @QueryMap(encoded=true) TerminalWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>terminalWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalWarehouseResponseData> terminalWarehouseWithHttpInfo(@Param("elid") String elid, TerminalWarehouseRequestData body, @QueryMap(encoded=true) TerminalWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalWarehouse</code> method in a fluent style.
   */
  public static class TerminalWarehouseQueryParams extends HashMap<String, Object> {
    public TerminalWarehouseQueryParams sessionId(final String value) {
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
   * @return TerminalZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TerminalZoneResponseData terminalZone(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>terminalZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TerminalZoneResponseData> terminalZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TerminalZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>terminalZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TerminalZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TerminalZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TerminalZoneResponseData terminalZone(@Param("elid") String elid, TerminalZoneRequestData body, @QueryMap(encoded=true) TerminalZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>terminalZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TerminalZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TerminalZoneResponseData> terminalZoneWithHttpInfo(@Param("elid") String elid, TerminalZoneRequestData body, @QueryMap(encoded=true) TerminalZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>terminalZone</code> method in a fluent style.
   */
  public static class TerminalZoneQueryParams extends HashMap<String, Object> {
    public TerminalZoneQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTerminalResponse updateSystemAttributesTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTerminalRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTerminal</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTerminalResponse> updateSystemAttributesTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTerminalRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTerminalResponse updateSystemAttributesTerminal(@Param("elid") String elid, UpdateSystemAttributesTerminalRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTerminalQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTerminalResponse> updateSystemAttributesTerminalWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTerminalRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTerminal</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTerminalQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify terminal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateTerminalResponse updateTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTerminalRequestData body);

  /**
   * Modify
   * Similar to <code>updateTerminal</code> but it also returns the http response headers .
   * Modify terminal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateTerminalResponse> updateTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTerminalRequestData body);


  /**
   * Modify
   * Modify terminal
   * Note, this is equivalent to the other <code>updateTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/terminal/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateTerminalResponse updateTerminal(@Param("elid") String elid, UpdateTerminalRequestData body, @QueryMap(encoded=true) UpdateTerminalQueryParams queryParams);

  /**
  * Modify
  * Modify terminal
  * Note, this is equivalent to the other <code>updateTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/terminal/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateTerminalResponse> updateTerminalWithHttpInfo(@Param("elid") String elid, UpdateTerminalRequestData body, @QueryMap(encoded=true) UpdateTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateTerminal</code> method in a fluent style.
   */
  public static class UpdateTerminalQueryParams extends HashMap<String, Object> {
    public UpdateTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
