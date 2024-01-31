package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypePduRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypePduResponse;
import com.fntsoftware.businessgateway.entities.DeletePduRequestData;
import com.fntsoftware.businessgateway.entities.DeletePduResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetPduRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetPduResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotPduRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotPduResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehousePduRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehousePduResponse;
import com.fntsoftware.businessgateway.entities.MoveToZonePduRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZonePduResponse;
import com.fntsoftware.businessgateway.entities.PduContractsRequestData;
import com.fntsoftware.businessgateway.entities.PduContractsResponseData;
import com.fntsoftware.businessgateway.entities.PduDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.PduDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.PduDuctDataRequest;
import com.fntsoftware.businessgateway.entities.PduDuctDataResponse;
import com.fntsoftware.businessgateway.entities.PduDuctsRequestData;
import com.fntsoftware.businessgateway.entities.PduDuctsResponseData;
import com.fntsoftware.businessgateway.entities.PduFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.PduFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.PduInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.PduInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.PduInstalledSubCardsRecursiveRequest;
import com.fntsoftware.businessgateway.entities.PduInstalledSubCardsRecursiveResponse;
import com.fntsoftware.businessgateway.entities.PduInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.PduInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.PduInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.PduInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.PduIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.PduIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.PduIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.PduIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.PduIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.PduIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.PduIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.PduIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.PduLocationRequest;
import com.fntsoftware.businessgateway.entities.PduLocationResponse;
import com.fntsoftware.businessgateway.entities.PduLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.PduLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.PduMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.PduMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.PduMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.PduMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.PduNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.PduNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.PduOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.PduOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.PduOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.PduOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.PduPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.PduPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.PduPersonsRequestData;
import com.fntsoftware.businessgateway.entities.PduPersonsResponseData;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsDataExtendedRequest;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsDataExtendedResponse;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsPowerExtendedRequest;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsPowerExtendedResponse;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.PduPhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.PduQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.PduQueryRequest;
import com.fntsoftware.businessgateway.entities.PduQueryResponse;
import com.fntsoftware.businessgateway.entities.PduServicesRequest;
import com.fntsoftware.businessgateway.entities.PduServicesResponse;
import com.fntsoftware.businessgateway.entities.PduSitesRequestData;
import com.fntsoftware.businessgateway.entities.PduSitesResponseData;
import com.fntsoftware.businessgateway.entities.PduSlotRequestData;
import com.fntsoftware.businessgateway.entities.PduSlotResponseData;
import com.fntsoftware.businessgateway.entities.PduSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.PduSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.PduSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PduSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.PduVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.PduVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.PduVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.PduVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.PduVlansRequest;
import com.fntsoftware.businessgateway.entities.PduVlansResponse;
import com.fntsoftware.businessgateway.entities.PduWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.PduWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.PduZoneRequestData;
import com.fntsoftware.businessgateway.entities.PduZoneResponseData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPduRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetPduResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotPduRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotPduResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehousePduResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZonePduRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZonePduResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectPduRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectPduResponse;
import com.fntsoftware.businessgateway.entities.UpdatePduRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePduResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPduRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPduResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PduApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypePduResponse changeTypePdu(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypePduRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypePdu</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypePduResponse> changeTypePduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypePduRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypePduResponse changeTypePdu(@Param("elid") String elid, ChangeTypePduRequestData body, @QueryMap(encoded=true) ChangeTypePduQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypePduResponse> changeTypePduWithHttpInfo(@Param("elid") String elid, ChangeTypePduRequestData body, @QueryMap(encoded=true) ChangeTypePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypePdu</code> method in a fluent style.
   */
  public static class ChangeTypePduQueryParams extends HashMap<String, Object> {
    public ChangeTypePduQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete PDU
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePduResponse deletePdu(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePduRequestData body);

  /**
   * Delete
   * Similar to <code>deletePdu</code> but it also returns the http response headers .
   * Delete PDU
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePduResponse> deletePduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePduRequestData body);


  /**
   * Delete
   * Delete PDU
   * Note, this is equivalent to the other <code>deletePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePduResponse deletePdu(@Param("elid") String elid, DeletePduRequestData body, @QueryMap(encoded=true) DeletePduQueryParams queryParams);

  /**
  * Delete
  * Delete PDU
  * Note, this is equivalent to the other <code>deletePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePduResponse> deletePduWithHttpInfo(@Param("elid") String elid, DeletePduRequestData body, @QueryMap(encoded=true) DeletePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePdu</code> method in a fluent style.
   */
  public static class DeletePduQueryParams extends HashMap<String, Object> {
    public DeletePduQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetPduResponse moveToCabinetPdu(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetPduRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetPdu</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetPduResponse> moveToCabinetPduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetPduRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetPdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetPduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetPduResponse moveToCabinetPdu(@Param("elid") String elid, MoveToCabinetPduRequestData body, @QueryMap(encoded=true) MoveToCabinetPduQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetPdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetPduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetPduResponse> moveToCabinetPduWithHttpInfo(@Param("elid") String elid, MoveToCabinetPduRequestData body, @QueryMap(encoded=true) MoveToCabinetPduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetPdu</code> method in a fluent style.
   */
  public static class MoveToCabinetPduQueryParams extends HashMap<String, Object> {
    public MoveToCabinetPduQueryParams sessionId(final String value) {
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
   * @return MoveToSlotPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotPduResponse moveToSlotPdu(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotPduRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotPdu</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotPduResponse> moveToSlotPduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotPduRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotPdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotPduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotPduResponse moveToSlotPdu(@Param("elid") String elid, MoveToSlotPduRequestData body, @QueryMap(encoded=true) MoveToSlotPduQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotPdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotPduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotPduResponse> moveToSlotPduWithHttpInfo(@Param("elid") String elid, MoveToSlotPduRequestData body, @QueryMap(encoded=true) MoveToSlotPduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotPdu</code> method in a fluent style.
   */
  public static class MoveToSlotPduQueryParams extends HashMap<String, Object> {
    public MoveToSlotPduQueryParams sessionId(final String value) {
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
   * @return MoveToWarehousePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehousePduResponse moveToWarehousePdu(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehousePduRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehousePdu</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehousePduResponse> moveToWarehousePduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehousePduRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehousePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehousePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehousePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehousePduResponse moveToWarehousePdu(@Param("elid") String elid, MoveToWarehousePduRequestData body, @QueryMap(encoded=true) MoveToWarehousePduQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehousePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehousePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehousePduResponse> moveToWarehousePduWithHttpInfo(@Param("elid") String elid, MoveToWarehousePduRequestData body, @QueryMap(encoded=true) MoveToWarehousePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehousePdu</code> method in a fluent style.
   */
  public static class MoveToWarehousePduQueryParams extends HashMap<String, Object> {
    public MoveToWarehousePduQueryParams sessionId(final String value) {
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
   * @return MoveToZonePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZonePduResponse moveToZonePdu(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZonePduRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZonePdu</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZonePduResponse> moveToZonePduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZonePduRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZonePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZonePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZonePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZonePduResponse moveToZonePdu(@Param("elid") String elid, MoveToZonePduRequestData body, @QueryMap(encoded=true) MoveToZonePduQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZonePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZonePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZonePduResponse> moveToZonePduWithHttpInfo(@Param("elid") String elid, MoveToZonePduRequestData body, @QueryMap(encoded=true) MoveToZonePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZonePdu</code> method in a fluent style.
   */
  public static class MoveToZonePduQueryParams extends HashMap<String, Object> {
    public MoveToZonePduQueryParams sessionId(final String value) {
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
   * @return PduContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduContractsResponseData pduContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PduContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>pduContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduContractsResponseData> pduContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>pduContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduContractsResponseData pduContracts(@Param("elid") String elid, PduContractsRequestData body, @QueryMap(encoded=true) PduContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>pduContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduContractsResponseData> pduContractsWithHttpInfo(@Param("elid") String elid, PduContractsRequestData body, @QueryMap(encoded=true) PduContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduContracts</code> method in a fluent style.
   */
  public static class PduContractsQueryParams extends HashMap<String, Object> {
    public PduContractsQueryParams sessionId(final String value) {
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
   * @return PduDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduDeviceMasterResponseData pduDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, PduDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>pduDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduDeviceMasterResponseData> pduDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>pduDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduDeviceMasterResponseData pduDeviceMaster(@Param("elid") String elid, PduDeviceMasterRequestData body, @QueryMap(encoded=true) PduDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>pduDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduDeviceMasterResponseData> pduDeviceMasterWithHttpInfo(@Param("elid") String elid, PduDeviceMasterRequestData body, @QueryMap(encoded=true) PduDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduDeviceMaster</code> method in a fluent style.
   */
  public static class PduDeviceMasterQueryParams extends HashMap<String, Object> {
    public PduDeviceMasterQueryParams sessionId(final String value) {
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
   * @return PduDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduDuctDataResponse pduDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, PduDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>pduDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduDuctDataResponse> pduDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>pduDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduDuctDataResponse pduDuctData(@Param("elid") String elid, PduDuctDataRequest body, @QueryMap(encoded=true) PduDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>pduDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduDuctDataResponse> pduDuctDataWithHttpInfo(@Param("elid") String elid, PduDuctDataRequest body, @QueryMap(encoded=true) PduDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduDuctData</code> method in a fluent style.
   */
  public static class PduDuctDataQueryParams extends HashMap<String, Object> {
    public PduDuctDataQueryParams sessionId(final String value) {
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
   * @return PduDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduDuctsResponseData pduDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, PduDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>pduDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduDuctsResponseData> pduDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>pduDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduDuctsResponseData pduDucts(@Param("elid") String elid, PduDuctsRequestData body, @QueryMap(encoded=true) PduDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>pduDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduDuctsResponseData> pduDuctsWithHttpInfo(@Param("elid") String elid, PduDuctsRequestData body, @QueryMap(encoded=true) PduDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduDucts</code> method in a fluent style.
   */
  public static class PduDuctsQueryParams extends HashMap<String, Object> {
    public PduDuctsQueryParams sessionId(final String value) {
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
   * @return PduFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduFrameContractsResponseData pduFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PduFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>pduFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduFrameContractsResponseData> pduFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>pduFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduFrameContractsResponseData pduFrameContracts(@Param("elid") String elid, PduFrameContractsRequestData body, @QueryMap(encoded=true) PduFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>pduFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduFrameContractsResponseData> pduFrameContractsWithHttpInfo(@Param("elid") String elid, PduFrameContractsRequestData body, @QueryMap(encoded=true) PduFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduFrameContracts</code> method in a fluent style.
   */
  public static class PduFrameContractsQueryParams extends HashMap<String, Object> {
    public PduFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PduInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduInheritedGeoCoordinatesResponse pduInheritedGeoCoordinates(@Param("sessionId") String sessionId, PduInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>pduInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduInheritedGeoCoordinatesResponse> pduInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, PduInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>pduInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduInheritedGeoCoordinatesResponse pduInheritedGeoCoordinates(PduInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) PduInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>pduInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduInheritedGeoCoordinatesResponse> pduInheritedGeoCoordinatesWithHttpInfo(PduInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) PduInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class PduInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public PduInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return PduInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduInstalledSubCardsResponse pduInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, PduInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>pduInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduInstalledSubCardsResponse> pduInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>pduInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduInstalledSubCardsResponse pduInstalledSubCards(@Param("elid") String elid, PduInstalledSubCardsRequest body, @QueryMap(encoded=true) PduInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>pduInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduInstalledSubCardsResponse> pduInstalledSubCardsWithHttpInfo(@Param("elid") String elid, PduInstalledSubCardsRequest body, @QueryMap(encoded=true) PduInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduInstalledSubCards</code> method in a fluent style.
   */
  public static class PduInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public PduInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return PduInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduInstalledSubCardsRecursiveResponse pduInstalledSubCardsRecursive(@Param("sessionId") String sessionId, @Param("elid") String elid, PduInstalledSubCardsRecursiveRequest body);

  /**
   * Query installed sub-cards recursively
   * Similar to <code>pduInstalledSubCardsRecursive</code> but it also returns the http response headers .
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduInstalledSubCardsRecursiveResponse> pduInstalledSubCardsRecursiveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduInstalledSubCardsRecursiveRequest body);


  /**
   * Query installed sub-cards recursively
   * Queries installed sub-cards from a device. Free slot positions are not supplied.
   * Note, this is equivalent to the other <code>pduInstalledSubCardsRecursive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduInstalledSubCardsRecursiveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduInstalledSubCardsRecursiveResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduInstalledSubCardsRecursiveResponse pduInstalledSubCardsRecursive(@Param("elid") String elid, PduInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) PduInstalledSubCardsRecursiveQueryParams queryParams);

  /**
  * Query installed sub-cards recursively
  * Queries installed sub-cards from a device. Free slot positions are not supplied.
  * Note, this is equivalent to the other <code>pduInstalledSubCardsRecursive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduInstalledSubCardsRecursiveResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/InstalledSubCardsRecursive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduInstalledSubCardsRecursiveResponse> pduInstalledSubCardsRecursiveWithHttpInfo(@Param("elid") String elid, PduInstalledSubCardsRecursiveRequest body, @QueryMap(encoded=true) PduInstalledSubCardsRecursiveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduInstalledSubCardsRecursive</code> method in a fluent style.
   */
  public static class PduInstalledSubCardsRecursiveQueryParams extends HashMap<String, Object> {
    public PduInstalledSubCardsRecursiveQueryParams sessionId(final String value) {
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
   * @return PduInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduInterfacesResponseData pduInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, PduInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>pduInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduInterfacesResponseData> pduInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>pduInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduInterfacesResponseData pduInterfaces(@Param("elid") String elid, PduInterfacesRequestData body, @QueryMap(encoded=true) PduInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>pduInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduInterfacesResponseData> pduInterfacesWithHttpInfo(@Param("elid") String elid, PduInterfacesRequestData body, @QueryMap(encoded=true) PduInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduInterfaces</code> method in a fluent style.
   */
  public static class PduInterfacesQueryParams extends HashMap<String, Object> {
    public PduInterfacesQueryParams sessionId(final String value) {
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
   * @return PduIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduIpAddressesResponse pduIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>pduIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduIpAddressesResponse> pduIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>pduIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduIpAddressesResponse pduIpAddresses(@Param("elid") String elid, PduIpAddressesRequest body, @QueryMap(encoded=true) PduIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>pduIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduIpAddressesResponse> pduIpAddressesWithHttpInfo(@Param("elid") String elid, PduIpAddressesRequest body, @QueryMap(encoded=true) PduIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduIpAddresses</code> method in a fluent style.
   */
  public static class PduIpAddressesQueryParams extends HashMap<String, Object> {
    public PduIpAddressesQueryParams sessionId(final String value) {
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
   * @return PduIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduIpv4AddressesResponseData pduIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>pduIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduIpv4AddressesResponseData> pduIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>pduIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduIpv4AddressesResponseData pduIpv4Addresses(@Param("elid") String elid, PduIpv4AddressesRequestData body, @QueryMap(encoded=true) PduIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>pduIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduIpv4AddressesResponseData> pduIpv4AddressesWithHttpInfo(@Param("elid") String elid, PduIpv4AddressesRequestData body, @QueryMap(encoded=true) PduIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduIpv4Addresses</code> method in a fluent style.
   */
  public static class PduIpv4AddressesQueryParams extends HashMap<String, Object> {
    public PduIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return PduIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduIpv4NetrangesResponseData pduIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>pduIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduIpv4NetrangesResponseData> pduIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>pduIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduIpv4NetrangesResponseData pduIpv4Netranges(@Param("elid") String elid, PduIpv4NetrangesRequestData body, @QueryMap(encoded=true) PduIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>pduIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduIpv4NetrangesResponseData> pduIpv4NetrangesWithHttpInfo(@Param("elid") String elid, PduIpv4NetrangesRequestData body, @QueryMap(encoded=true) PduIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduIpv4Netranges</code> method in a fluent style.
   */
  public static class PduIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public PduIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return PduIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduIpv4NetworksResponseData pduIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>pduIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduIpv4NetworksResponseData> pduIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>pduIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduIpv4NetworksResponseData pduIpv4Networks(@Param("elid") String elid, PduIpv4NetworksRequestData body, @QueryMap(encoded=true) PduIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>pduIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduIpv4NetworksResponseData> pduIpv4NetworksWithHttpInfo(@Param("elid") String elid, PduIpv4NetworksRequestData body, @QueryMap(encoded=true) PduIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduIpv4Networks</code> method in a fluent style.
   */
  public static class PduIpv4NetworksQueryParams extends HashMap<String, Object> {
    public PduIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return PduLocationResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduLocationResponse pduLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, PduLocationRequest body);

  /**
   * Location
   * Similar to <code>pduLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduLocationResponse> pduLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>pduLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduLocationResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduLocationResponse pduLocation(@Param("elid") String elid, PduLocationRequest body, @QueryMap(encoded=true) PduLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>pduLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduLocationResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduLocationResponse> pduLocationWithHttpInfo(@Param("elid") String elid, PduLocationRequest body, @QueryMap(encoded=true) PduLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduLocation</code> method in a fluent style.
   */
  public static class PduLocationQueryParams extends HashMap<String, Object> {
    public PduLocationQueryParams sessionId(final String value) {
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
   * @return PduLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduLogicalPortsResponseData pduLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, PduLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>pduLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduLogicalPortsResponseData> pduLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>pduLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduLogicalPortsResponseData pduLogicalPorts(@Param("elid") String elid, PduLogicalPortsRequestData body, @QueryMap(encoded=true) PduLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>pduLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduLogicalPortsResponseData> pduLogicalPortsWithHttpInfo(@Param("elid") String elid, PduLogicalPortsRequestData body, @QueryMap(encoded=true) PduLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduLogicalPorts</code> method in a fluent style.
   */
  public static class PduLogicalPortsQueryParams extends HashMap<String, Object> {
    public PduLogicalPortsQueryParams sessionId(final String value) {
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
   * @return PduMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduMaintenanceContractsResponseData pduMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PduMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>pduMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduMaintenanceContractsResponseData> pduMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>pduMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduMaintenanceContractsResponseData pduMaintenanceContracts(@Param("elid") String elid, PduMaintenanceContractsRequestData body, @QueryMap(encoded=true) PduMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>pduMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduMaintenanceContractsResponseData> pduMaintenanceContractsWithHttpInfo(@Param("elid") String elid, PduMaintenanceContractsRequestData body, @QueryMap(encoded=true) PduMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduMaintenanceContracts</code> method in a fluent style.
   */
  public static class PduMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public PduMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return PduMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduMultiDuctsResponseData pduMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, PduMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>pduMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduMultiDuctsResponseData> pduMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>pduMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduMultiDuctsResponseData pduMultiDucts(@Param("elid") String elid, PduMultiDuctsRequestData body, @QueryMap(encoded=true) PduMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>pduMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduMultiDuctsResponseData> pduMultiDuctsWithHttpInfo(@Param("elid") String elid, PduMultiDuctsRequestData body, @QueryMap(encoded=true) PduMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduMultiDucts</code> method in a fluent style.
   */
  public static class PduMultiDuctsQueryParams extends HashMap<String, Object> {
    public PduMultiDuctsQueryParams sessionId(final String value) {
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
   * @return PduNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduNetworksAndNetrangesResponse pduNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, PduNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>pduNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduNetworksAndNetrangesResponse> pduNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>pduNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduNetworksAndNetrangesResponse pduNetworksAndNetranges(@Param("elid") String elid, PduNetworksAndNetrangesRequest body, @QueryMap(encoded=true) PduNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>pduNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduNetworksAndNetrangesResponse> pduNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, PduNetworksAndNetrangesRequest body, @QueryMap(encoded=true) PduNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduNetworksAndNetranges</code> method in a fluent style.
   */
  public static class PduNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public PduNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return PduOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduOperatingSystemInstallationResponseData pduOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, PduOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>pduOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduOperatingSystemInstallationResponseData> pduOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>pduOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduOperatingSystemInstallationResponseData pduOperatingSystemInstallation(@Param("elid") String elid, PduOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) PduOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>pduOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduOperatingSystemInstallationResponseData> pduOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, PduOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) PduOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class PduOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public PduOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return PduOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduOrganizationsResponseData pduOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, PduOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>pduOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduOrganizationsResponseData> pduOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>pduOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduOrganizationsResponseData pduOrganizations(@Param("elid") String elid, PduOrganizationsRequestData body, @QueryMap(encoded=true) PduOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>pduOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduOrganizationsResponseData> pduOrganizationsWithHttpInfo(@Param("elid") String elid, PduOrganizationsRequestData body, @QueryMap(encoded=true) PduOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduOrganizations</code> method in a fluent style.
   */
  public static class PduOrganizationsQueryParams extends HashMap<String, Object> {
    public PduOrganizationsQueryParams sessionId(final String value) {
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
   * @return PduPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduPersonGroupsResponseData pduPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>pduPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduPersonGroupsResponseData> pduPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>pduPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduPersonGroupsResponseData pduPersonGroups(@Param("elid") String elid, PduPersonGroupsRequestData body, @QueryMap(encoded=true) PduPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>pduPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduPersonGroupsResponseData> pduPersonGroupsWithHttpInfo(@Param("elid") String elid, PduPersonGroupsRequestData body, @QueryMap(encoded=true) PduPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduPersonGroups</code> method in a fluent style.
   */
  public static class PduPersonGroupsQueryParams extends HashMap<String, Object> {
    public PduPersonGroupsQueryParams sessionId(final String value) {
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
   * @return PduPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduPersonsResponseData pduPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>pduPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduPersonsResponseData> pduPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>pduPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduPersonsResponseData pduPersons(@Param("elid") String elid, PduPersonsRequestData body, @QueryMap(encoded=true) PduPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>pduPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduPersonsResponseData> pduPersonsWithHttpInfo(@Param("elid") String elid, PduPersonsRequestData body, @QueryMap(encoded=true) PduPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduPersons</code> method in a fluent style.
   */
  public static class PduPersonsQueryParams extends HashMap<String, Object> {
    public PduPersonsQueryParams sessionId(final String value) {
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
   * @return PduPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduPhysicalPortsDataResponseData pduPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>pduPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduPhysicalPortsDataResponseData> pduPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>pduPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduPhysicalPortsDataResponseData pduPhysicalPortsData(@Param("elid") String elid, PduPhysicalPortsDataRequestData body, @QueryMap(encoded=true) PduPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>pduPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduPhysicalPortsDataResponseData> pduPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, PduPhysicalPortsDataRequestData body, @QueryMap(encoded=true) PduPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduPhysicalPortsData</code> method in a fluent style.
   */
  public static class PduPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public PduPhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return PduPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduPhysicalPortsDataExtendedResponse pduPhysicalPortsDataExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsDataExtendedRequest body);

  /**
   * Query physical ports data extended
   * Similar to <code>pduPhysicalPortsDataExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduPhysicalPortsDataExtendedResponse> pduPhysicalPortsDataExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsDataExtendedRequest body);


  /**
   * Query physical ports data extended
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>pduPhysicalPortsDataExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduPhysicalPortsDataExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduPhysicalPortsDataExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduPhysicalPortsDataExtendedResponse pduPhysicalPortsDataExtended(@Param("elid") String elid, PduPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) PduPhysicalPortsDataExtendedQueryParams queryParams);

  /**
  * Query physical ports data extended
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>pduPhysicalPortsDataExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduPhysicalPortsDataExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsDataExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduPhysicalPortsDataExtendedResponse> pduPhysicalPortsDataExtendedWithHttpInfo(@Param("elid") String elid, PduPhysicalPortsDataExtendedRequest body, @QueryMap(encoded=true) PduPhysicalPortsDataExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduPhysicalPortsDataExtended</code> method in a fluent style.
   */
  public static class PduPhysicalPortsDataExtendedQueryParams extends HashMap<String, Object> {
    public PduPhysicalPortsDataExtendedQueryParams sessionId(final String value) {
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
   * @return PduPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduPhysicalPortsPowerResponseData pduPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>pduPhysicalPortsPower</code> but it also returns the http response headers .
   * For more information call the basic query of the power port entity
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduPhysicalPortsPowerResponseData> pduPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * For more information call the basic query of the power port entity
   * Note, this is equivalent to the other <code>pduPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduPhysicalPortsPowerResponseData pduPhysicalPortsPower(@Param("elid") String elid, PduPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) PduPhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * For more information call the basic query of the power port entity
  * Note, this is equivalent to the other <code>pduPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduPhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduPhysicalPortsPowerResponseData> pduPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, PduPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) PduPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduPhysicalPortsPower</code> method in a fluent style.
   */
  public static class PduPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public PduPhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return PduPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduPhysicalPortsPowerExtendedResponse pduPhysicalPortsPowerExtended(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsPowerExtendedRequest body);

  /**
   * Query Power ports
   * Similar to <code>pduPhysicalPortsPowerExtended</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduPhysicalPortsPowerExtendedResponse> pduPhysicalPortsPowerExtendedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduPhysicalPortsPowerExtendedRequest body);


  /**
   * Query Power ports
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>pduPhysicalPortsPowerExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduPhysicalPortsPowerExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduPhysicalPortsPowerExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduPhysicalPortsPowerExtendedResponse pduPhysicalPortsPowerExtended(@Param("elid") String elid, PduPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) PduPhysicalPortsPowerExtendedQueryParams queryParams);

  /**
  * Query Power ports
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>pduPhysicalPortsPowerExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduPhysicalPortsPowerExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/PhysicalPortsPowerExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduPhysicalPortsPowerExtendedResponse> pduPhysicalPortsPowerExtendedWithHttpInfo(@Param("elid") String elid, PduPhysicalPortsPowerExtendedRequest body, @QueryMap(encoded=true) PduPhysicalPortsPowerExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduPhysicalPortsPowerExtended</code> method in a fluent style.
   */
  public static class PduPhysicalPortsPowerExtendedQueryParams extends HashMap<String, Object> {
    public PduPhysicalPortsPowerExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PduQueryResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduQueryResponse pduQuery(@Param("sessionId") String sessionId, PduQueryRequest body);

  /**
   * Basic query
   * Similar to <code>pduQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduQueryResponse> pduQueryWithHttpInfo(@Param("sessionId") String sessionId, PduQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>pduQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduQueryResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduQueryResponse pduQuery(PduQueryRequest body, @QueryMap(encoded=true) PduQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>pduQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduQueryResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduQueryResponse> pduQueryWithHttpInfo(PduQueryRequest body, @QueryMap(encoded=true) PduQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduQuery</code> method in a fluent style.
   */
  public static class PduQueryQueryParams extends HashMap<String, Object> {
    public PduQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PduQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduQueryExtendedResponse pduQueryExtended(@Param("sessionId") String sessionId, PduQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>pduQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduQueryExtendedResponse> pduQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, PduQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>pduQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduQueryExtendedResponse pduQueryExtended(PduQueryExtendedRequest body, @QueryMap(encoded=true) PduQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>pduQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduQueryExtendedResponse> pduQueryExtendedWithHttpInfo(PduQueryExtendedRequest body, @QueryMap(encoded=true) PduQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduQueryExtended</code> method in a fluent style.
   */
  public static class PduQueryExtendedQueryParams extends HashMap<String, Object> {
    public PduQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PduQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduQueryExtendedGeoCoordinatesResponse pduQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, PduQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>pduQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduQueryExtendedGeoCoordinatesResponse> pduQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, PduQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>pduQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduQueryExtendedGeoCoordinatesResponse pduQueryExtendedGeoCoordinates(PduQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) PduQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>pduQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduQueryExtendedGeoCoordinatesResponse> pduQueryExtendedGeoCoordinatesWithHttpInfo(PduQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) PduQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class PduQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public PduQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PduQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduQueryExtendedScrollFirstResponse pduQueryExtendedScrollFirst(@Param("sessionId") String sessionId, PduQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>pduQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduQueryExtendedScrollFirstResponse> pduQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, PduQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>pduQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduQueryExtendedScrollFirstResponse pduQueryExtendedScrollFirst(PduQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) PduQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>pduQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduQueryExtendedScrollFirstResponse> pduQueryExtendedScrollFirstWithHttpInfo(PduQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) PduQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class PduQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public PduQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PduQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduQueryExtendedScrollMoreResponse pduQueryExtendedScrollMore(@Param("sessionId") String sessionId, PduQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>pduQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduQueryExtendedScrollMoreResponse> pduQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, PduQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>pduQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduQueryExtendedScrollMoreResponse pduQueryExtendedScrollMore(PduQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) PduQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>pduQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduQueryExtendedScrollMoreResponse> pduQueryExtendedScrollMoreWithHttpInfo(PduQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) PduQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class PduQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public PduQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return PduServicesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduServicesResponse pduServices(@Param("sessionId") String sessionId, @Param("elid") String elid, PduServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>pduServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduServicesResponse> pduServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>pduServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduServicesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduServicesResponse pduServices(@Param("elid") String elid, PduServicesRequest body, @QueryMap(encoded=true) PduServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>pduServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduServicesResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduServicesResponse> pduServicesWithHttpInfo(@Param("elid") String elid, PduServicesRequest body, @QueryMap(encoded=true) PduServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduServices</code> method in a fluent style.
   */
  public static class PduServicesQueryParams extends HashMap<String, Object> {
    public PduServicesQueryParams sessionId(final String value) {
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
   * @return PduSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduSitesResponseData pduSites(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>pduSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduSitesResponseData> pduSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>pduSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduSitesResponseData pduSites(@Param("elid") String elid, PduSitesRequestData body, @QueryMap(encoded=true) PduSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>pduSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduSitesResponseData> pduSitesWithHttpInfo(@Param("elid") String elid, PduSitesRequestData body, @QueryMap(encoded=true) PduSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduSites</code> method in a fluent style.
   */
  public static class PduSitesQueryParams extends HashMap<String, Object> {
    public PduSitesQueryParams sessionId(final String value) {
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
   * @return PduSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduSlotResponseData pduSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>pduSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduSlotResponseData> pduSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>pduSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduSlotResponseData pduSlot(@Param("elid") String elid, PduSlotRequestData body, @QueryMap(encoded=true) PduSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>pduSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduSlotResponseData> pduSlotWithHttpInfo(@Param("elid") String elid, PduSlotRequestData body, @QueryMap(encoded=true) PduSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduSlot</code> method in a fluent style.
   */
  public static class PduSlotQueryParams extends HashMap<String, Object> {
    public PduSlotQueryParams sessionId(final String value) {
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
   * @return PduSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduSwitchCabinetResponseData pduSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>pduSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduSwitchCabinetResponseData> pduSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>pduSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduSwitchCabinetResponseData pduSwitchCabinet(@Param("elid") String elid, PduSwitchCabinetRequestData body, @QueryMap(encoded=true) PduSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>pduSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduSwitchCabinetResponseData> pduSwitchCabinetWithHttpInfo(@Param("elid") String elid, PduSwitchCabinetRequestData body, @QueryMap(encoded=true) PduSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduSwitchCabinet</code> method in a fluent style.
   */
  public static class PduSwitchCabinetQueryParams extends HashMap<String, Object> {
    public PduSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return PduSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduSystemAttributesResponse pduSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>pduSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduSystemAttributesResponse> pduSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>pduSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduSystemAttributesResponse pduSystemAttributes(@Param("elid") String elid, PduSystemAttributesRequest body, @QueryMap(encoded=true) PduSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>pduSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduSystemAttributesResponse> pduSystemAttributesWithHttpInfo(@Param("elid") String elid, PduSystemAttributesRequest body, @QueryMap(encoded=true) PduSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduSystemAttributes</code> method in a fluent style.
   */
  public static class PduSystemAttributesQueryParams extends HashMap<String, Object> {
    public PduSystemAttributesQueryParams sessionId(final String value) {
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
   * @return PduVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduVirtualSwitchesResponseData pduVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, PduVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>pduVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduVirtualSwitchesResponseData> pduVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>pduVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduVirtualSwitchesResponseData pduVirtualSwitches(@Param("elid") String elid, PduVirtualSwitchesRequestData body, @QueryMap(encoded=true) PduVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>pduVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduVirtualSwitchesResponseData> pduVirtualSwitchesWithHttpInfo(@Param("elid") String elid, PduVirtualSwitchesRequestData body, @QueryMap(encoded=true) PduVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduVirtualSwitches</code> method in a fluent style.
   */
  public static class PduVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public PduVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return PduVlansResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduVlansResponse pduVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, PduVlansRequest body);

  /**
   * VLANs
   * Similar to <code>pduVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduVlansResponse> pduVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>pduVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduVlansResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduVlansResponse pduVlans(@Param("elid") String elid, PduVlansRequest body, @QueryMap(encoded=true) PduVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>pduVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduVlansResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduVlansResponse> pduVlansWithHttpInfo(@Param("elid") String elid, PduVlansRequest body, @QueryMap(encoded=true) PduVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduVlans</code> method in a fluent style.
   */
  public static class PduVlansQueryParams extends HashMap<String, Object> {
    public PduVlansQueryParams sessionId(final String value) {
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
   * @return PduVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduVlansAtSlotResponse pduVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, PduVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>pduVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduVlansAtSlotResponse> pduVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>pduVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduVlansAtSlotResponse pduVlansAtSlot(@Param("elid") String elid, PduVlansAtSlotRequest body, @QueryMap(encoded=true) PduVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>pduVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduVlansAtSlotResponse> pduVlansAtSlotWithHttpInfo(@Param("elid") String elid, PduVlansAtSlotRequest body, @QueryMap(encoded=true) PduVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduVlansAtSlot</code> method in a fluent style.
   */
  public static class PduVlansAtSlotQueryParams extends HashMap<String, Object> {
    public PduVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return PduWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduWarehouseResponseData pduWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, PduWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>pduWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduWarehouseResponseData> pduWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>pduWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduWarehouseResponseData pduWarehouse(@Param("elid") String elid, PduWarehouseRequestData body, @QueryMap(encoded=true) PduWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>pduWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduWarehouseResponseData> pduWarehouseWithHttpInfo(@Param("elid") String elid, PduWarehouseRequestData body, @QueryMap(encoded=true) PduWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduWarehouse</code> method in a fluent style.
   */
  public static class PduWarehouseQueryParams extends HashMap<String, Object> {
    public PduWarehouseQueryParams sessionId(final String value) {
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
   * @return PduZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PduZoneResponseData pduZone(@Param("sessionId") String sessionId, @Param("elid") String elid, PduZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>pduZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PduZoneResponseData> pduZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PduZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>pduZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PduZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PduZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PduZoneResponseData pduZone(@Param("elid") String elid, PduZoneRequestData body, @QueryMap(encoded=true) PduZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>pduZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PduZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PduZoneResponseData> pduZoneWithHttpInfo(@Param("elid") String elid, PduZoneRequestData body, @QueryMap(encoded=true) PduZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pduZone</code> method in a fluent style.
   */
  public static class PduZoneQueryParams extends HashMap<String, Object> {
    public PduZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetPduResponse placeInCabinetPdu(@Param("sessionId") String sessionId, PlaceInCabinetPduRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetPdu</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetPduResponse> placeInCabinetPduWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetPduRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetPdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetPduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetPduResponse placeInCabinetPdu(PlaceInCabinetPduRequestData body, @QueryMap(encoded=true) PlaceInCabinetPduQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetPdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetPduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetPduResponse> placeInCabinetPduWithHttpInfo(PlaceInCabinetPduRequestData body, @QueryMap(encoded=true) PlaceInCabinetPduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetPdu</code> method in a fluent style.
   */
  public static class PlaceInCabinetPduQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetPduQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotPduResponse placeInSlotPdu(@Param("sessionId") String sessionId, PlaceInSlotPduRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotPdu</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotPduResponse> placeInSlotPduWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotPduRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotPdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotPduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotPduResponse placeInSlotPdu(PlaceInSlotPduRequestData body, @QueryMap(encoded=true) PlaceInSlotPduQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotPdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotPduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotPduResponse> placeInSlotPduWithHttpInfo(PlaceInSlotPduRequestData body, @QueryMap(encoded=true) PlaceInSlotPduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotPdu</code> method in a fluent style.
   */
  public static class PlaceInSlotPduQueryParams extends HashMap<String, Object> {
    public PlaceInSlotPduQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehousePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehousePduResponse placeInWarehousePdu(@Param("sessionId") String sessionId, PlaceInWarehousePduRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehousePdu</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehousePduResponse> placeInWarehousePduWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehousePduRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehousePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehousePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehousePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehousePduResponse placeInWarehousePdu(PlaceInWarehousePduRequestData body, @QueryMap(encoded=true) PlaceInWarehousePduQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehousePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehousePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehousePduResponse> placeInWarehousePduWithHttpInfo(PlaceInWarehousePduRequestData body, @QueryMap(encoded=true) PlaceInWarehousePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehousePdu</code> method in a fluent style.
   */
  public static class PlaceInWarehousePduQueryParams extends HashMap<String, Object> {
    public PlaceInWarehousePduQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZonePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZonePduResponse placeInZonePdu(@Param("sessionId") String sessionId, PlaceInZonePduRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZonePdu</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZonePduResponse> placeInZonePduWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZonePduRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZonePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZonePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZonePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZonePduResponse placeInZonePdu(PlaceInZonePduRequestData body, @QueryMap(encoded=true) PlaceInZonePduQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZonePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZonePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZonePduResponse> placeInZonePduWithHttpInfo(PlaceInZonePduRequestData body, @QueryMap(encoded=true) PlaceInZonePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZonePdu</code> method in a fluent style.
   */
  public static class PlaceInZonePduQueryParams extends HashMap<String, Object> {
    public PlaceInZonePduQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectPduResponse replaceObjectPdu(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectPduRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectPdu</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectPduResponse> replaceObjectPduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectPduRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectPdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectPduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectPduResponse replaceObjectPdu(@Param("elid") String elid, ReplaceObjectPduRequestData body, @QueryMap(encoded=true) ReplaceObjectPduQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectPdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectPduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectPduResponse> replaceObjectPduWithHttpInfo(@Param("elid") String elid, ReplaceObjectPduRequestData body, @QueryMap(encoded=true) ReplaceObjectPduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectPdu</code> method in a fluent style.
   */
  public static class ReplaceObjectPduQueryParams extends HashMap<String, Object> {
    public ReplaceObjectPduQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify PDU
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePduResponse updatePdu(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePduRequestData body);

  /**
   * Modify
   * Similar to <code>updatePdu</code> but it also returns the http response headers .
   * Modify PDU
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePduResponse> updatePduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePduRequestData body);


  /**
   * Modify
   * Modify PDU
   * Note, this is equivalent to the other <code>updatePdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePduResponse updatePdu(@Param("elid") String elid, UpdatePduRequestData body, @QueryMap(encoded=true) UpdatePduQueryParams queryParams);

  /**
  * Modify
  * Modify PDU
  * Note, this is equivalent to the other <code>updatePdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePduResponse> updatePduWithHttpInfo(@Param("elid") String elid, UpdatePduRequestData body, @QueryMap(encoded=true) UpdatePduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePdu</code> method in a fluent style.
   */
  public static class UpdatePduQueryParams extends HashMap<String, Object> {
    public UpdatePduQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPduResponse updateSystemAttributesPdu(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPduRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPdu</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPduResponse> updateSystemAttributesPduWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPduRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPdu</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPduQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPduResponse
   */
  @RequestLine("POST /api/rest/entity/pdu/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPduResponse updateSystemAttributesPdu(@Param("elid") String elid, UpdateSystemAttributesPduRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPduQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPdu</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPduResponse
      */
      @RequestLine("POST /api/rest/entity/pdu/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPduResponse> updateSystemAttributesPduWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPduRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPduQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPdu</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPduQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPduQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
