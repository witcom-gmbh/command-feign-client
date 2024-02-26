package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CabinetSuppliesContractsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesContractsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesLocationRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesLocationResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPhysicalPortsPowerRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesPhysicalPortsPowerResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesQueryResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesSlotRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesSlotResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesZoneRequestData;
import com.fntsoftware.businessgateway.entities.CabinetSuppliesZoneResponseData;
import com.fntsoftware.businessgateway.entities.ChangeTypeCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.UpdateCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCabinetSuppliesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCabinetSuppliesRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCabinetSuppliesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CabinetSuppliesApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CabinetSuppliesContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesContractsResponseData cabinetSuppliesContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>cabinetSuppliesContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesContractsResponseData> cabinetSuppliesContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesContractsResponseData cabinetSuppliesContracts(@Param("elid") String elid, CabinetSuppliesContractsRequestData body, @QueryMap(encoded=true) CabinetSuppliesContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesContractsResponseData> cabinetSuppliesContractsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesContractsRequestData body, @QueryMap(encoded=true) CabinetSuppliesContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesContracts</code> method in a fluent style.
   */
  public static class CabinetSuppliesContractsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesContractsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesDeviceMasterResponseData cabinetSuppliesDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>cabinetSuppliesDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesDeviceMasterResponseData> cabinetSuppliesDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesDeviceMasterResponseData cabinetSuppliesDeviceMaster(@Param("elid") String elid, CabinetSuppliesDeviceMasterRequestData body, @QueryMap(encoded=true) CabinetSuppliesDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesDeviceMasterResponseData> cabinetSuppliesDeviceMasterWithHttpInfo(@Param("elid") String elid, CabinetSuppliesDeviceMasterRequestData body, @QueryMap(encoded=true) CabinetSuppliesDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesDeviceMaster</code> method in a fluent style.
   */
  public static class CabinetSuppliesDeviceMasterQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesDeviceMasterQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesFrameContractsResponseData cabinetSuppliesFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>cabinetSuppliesFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesFrameContractsResponseData> cabinetSuppliesFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesFrameContractsResponseData cabinetSuppliesFrameContracts(@Param("elid") String elid, CabinetSuppliesFrameContractsRequestData body, @QueryMap(encoded=true) CabinetSuppliesFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesFrameContractsResponseData> cabinetSuppliesFrameContractsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesFrameContractsRequestData body, @QueryMap(encoded=true) CabinetSuppliesFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesFrameContracts</code> method in a fluent style.
   */
  public static class CabinetSuppliesFrameContractsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesFrameContractsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesInstalledSubCardsResponse cabinetSuppliesInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>cabinetSuppliesInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesInstalledSubCardsResponse> cabinetSuppliesInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>cabinetSuppliesInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesInstalledSubCardsResponse cabinetSuppliesInstalledSubCards(@Param("elid") String elid, CabinetSuppliesInstalledSubCardsRequest body, @QueryMap(encoded=true) CabinetSuppliesInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards of a device. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>cabinetSuppliesInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesInstalledSubCardsResponse> cabinetSuppliesInstalledSubCardsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesInstalledSubCardsRequest body, @QueryMap(encoded=true) CabinetSuppliesInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesInstalledSubCards</code> method in a fluent style.
   */
  public static class CabinetSuppliesInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesLocationResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesLocationResponse cabinetSuppliesLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesLocationRequest body);

  /**
   * Location
   * Similar to <code>cabinetSuppliesLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesLocationResponse> cabinetSuppliesLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesLocationResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesLocationResponse cabinetSuppliesLocation(@Param("elid") String elid, CabinetSuppliesLocationRequest body, @QueryMap(encoded=true) CabinetSuppliesLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesLocationResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesLocationResponse> cabinetSuppliesLocationWithHttpInfo(@Param("elid") String elid, CabinetSuppliesLocationRequest body, @QueryMap(encoded=true) CabinetSuppliesLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesLocation</code> method in a fluent style.
   */
  public static class CabinetSuppliesLocationQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesLocationQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesLogicalPortsResponseData cabinetSuppliesLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>cabinetSuppliesLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesLogicalPortsResponseData> cabinetSuppliesLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesLogicalPortsResponseData cabinetSuppliesLogicalPorts(@Param("elid") String elid, CabinetSuppliesLogicalPortsRequestData body, @QueryMap(encoded=true) CabinetSuppliesLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesLogicalPortsResponseData> cabinetSuppliesLogicalPortsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesLogicalPortsRequestData body, @QueryMap(encoded=true) CabinetSuppliesLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesLogicalPorts</code> method in a fluent style.
   */
  public static class CabinetSuppliesLogicalPortsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesLogicalPortsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesMaintenanceContractsResponseData cabinetSuppliesMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>cabinetSuppliesMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesMaintenanceContractsResponseData> cabinetSuppliesMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesMaintenanceContractsResponseData cabinetSuppliesMaintenanceContracts(@Param("elid") String elid, CabinetSuppliesMaintenanceContractsRequestData body, @QueryMap(encoded=true) CabinetSuppliesMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesMaintenanceContractsResponseData> cabinetSuppliesMaintenanceContractsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesMaintenanceContractsRequestData body, @QueryMap(encoded=true) CabinetSuppliesMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesMaintenanceContracts</code> method in a fluent style.
   */
  public static class CabinetSuppliesMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesOrganizationsResponseData cabinetSuppliesOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>cabinetSuppliesOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesOrganizationsResponseData> cabinetSuppliesOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesOrganizationsResponseData cabinetSuppliesOrganizations(@Param("elid") String elid, CabinetSuppliesOrganizationsRequestData body, @QueryMap(encoded=true) CabinetSuppliesOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesOrganizationsResponseData> cabinetSuppliesOrganizationsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesOrganizationsRequestData body, @QueryMap(encoded=true) CabinetSuppliesOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesOrganizations</code> method in a fluent style.
   */
  public static class CabinetSuppliesOrganizationsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesOrganizationsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesPersonGroupsResponseData cabinetSuppliesPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>cabinetSuppliesPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesPersonGroupsResponseData> cabinetSuppliesPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesPersonGroupsResponseData cabinetSuppliesPersonGroups(@Param("elid") String elid, CabinetSuppliesPersonGroupsRequestData body, @QueryMap(encoded=true) CabinetSuppliesPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesPersonGroupsResponseData> cabinetSuppliesPersonGroupsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesPersonGroupsRequestData body, @QueryMap(encoded=true) CabinetSuppliesPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesPersonGroups</code> method in a fluent style.
   */
  public static class CabinetSuppliesPersonGroupsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesPersonGroupsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesPersonsResponseData cabinetSuppliesPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>cabinetSuppliesPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesPersonsResponseData> cabinetSuppliesPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesPersonsResponseData cabinetSuppliesPersons(@Param("elid") String elid, CabinetSuppliesPersonsRequestData body, @QueryMap(encoded=true) CabinetSuppliesPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesPersonsResponseData> cabinetSuppliesPersonsWithHttpInfo(@Param("elid") String elid, CabinetSuppliesPersonsRequestData body, @QueryMap(encoded=true) CabinetSuppliesPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesPersons</code> method in a fluent style.
   */
  public static class CabinetSuppliesPersonsQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesPersonsQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesPhysicalPortsDataResponseData cabinetSuppliesPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>cabinetSuppliesPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesPhysicalPortsDataResponseData> cabinetSuppliesPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesPhysicalPortsDataResponseData cabinetSuppliesPhysicalPortsData(@Param("elid") String elid, CabinetSuppliesPhysicalPortsDataRequestData body, @QueryMap(encoded=true) CabinetSuppliesPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesPhysicalPortsDataResponseData> cabinetSuppliesPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, CabinetSuppliesPhysicalPortsDataRequestData body, @QueryMap(encoded=true) CabinetSuppliesPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesPhysicalPortsData</code> method in a fluent style.
   */
  public static class CabinetSuppliesPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Power ports
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CabinetSuppliesPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesPhysicalPortsPowerResponse cabinetSuppliesPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPhysicalPortsPowerRequest body);

  /**
   * Query Power ports
   * Similar to <code>cabinetSuppliesPhysicalPortsPower</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesPhysicalPortsPowerResponse> cabinetSuppliesPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesPhysicalPortsPowerRequest body);


  /**
   * Query Power ports
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>cabinetSuppliesPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesPhysicalPortsPowerResponse cabinetSuppliesPhysicalPortsPower(@Param("elid") String elid, CabinetSuppliesPhysicalPortsPowerRequest body, @QueryMap(encoded=true) CabinetSuppliesPhysicalPortsPowerQueryParams queryParams);

  /**
  * Query Power ports
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>cabinetSuppliesPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesPhysicalPortsPowerResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesPhysicalPortsPowerResponse> cabinetSuppliesPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, CabinetSuppliesPhysicalPortsPowerRequest body, @QueryMap(encoded=true) CabinetSuppliesPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesPhysicalPortsPower</code> method in a fluent style.
   */
  public static class CabinetSuppliesPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CabinetSuppliesQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesQueryResponse cabinetSuppliesQuery(@Param("sessionId") String sessionId, CabinetSuppliesQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cabinetSuppliesQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesQueryResponse> cabinetSuppliesQueryWithHttpInfo(@Param("sessionId") String sessionId, CabinetSuppliesQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>cabinetSuppliesQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesQueryResponse cabinetSuppliesQuery(CabinetSuppliesQueryRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>cabinetSuppliesQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesQueryResponse> cabinetSuppliesQueryWithHttpInfo(CabinetSuppliesQueryRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesQuery</code> method in a fluent style.
   */
  public static class CabinetSuppliesQueryQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CabinetSuppliesQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesQueryExtendedResponse cabinetSuppliesQueryExtended(@Param("sessionId") String sessionId, CabinetSuppliesQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>cabinetSuppliesQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesQueryExtendedResponse> cabinetSuppliesQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, CabinetSuppliesQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>cabinetSuppliesQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesQueryExtendedResponse cabinetSuppliesQueryExtended(CabinetSuppliesQueryExtendedRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>cabinetSuppliesQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesQueryExtendedResponse> cabinetSuppliesQueryExtendedWithHttpInfo(CabinetSuppliesQueryExtendedRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesQueryExtended</code> method in a fluent style.
   */
  public static class CabinetSuppliesQueryExtendedQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CabinetSuppliesQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesQueryExtendedScrollFirstResponse cabinetSuppliesQueryExtendedScrollFirst(@Param("sessionId") String sessionId, CabinetSuppliesQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>cabinetSuppliesQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesQueryExtendedScrollFirstResponse> cabinetSuppliesQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, CabinetSuppliesQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>cabinetSuppliesQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesQueryExtendedScrollFirstResponse cabinetSuppliesQueryExtendedScrollFirst(CabinetSuppliesQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>cabinetSuppliesQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesQueryExtendedScrollFirstResponse> cabinetSuppliesQueryExtendedScrollFirstWithHttpInfo(CabinetSuppliesQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class CabinetSuppliesQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CabinetSuppliesQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesQueryExtendedScrollMoreResponse cabinetSuppliesQueryExtendedScrollMore(@Param("sessionId") String sessionId, CabinetSuppliesQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>cabinetSuppliesQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesQueryExtendedScrollMoreResponse> cabinetSuppliesQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, CabinetSuppliesQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>cabinetSuppliesQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesQueryExtendedScrollMoreResponse cabinetSuppliesQueryExtendedScrollMore(CabinetSuppliesQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>cabinetSuppliesQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesQueryExtendedScrollMoreResponse> cabinetSuppliesQueryExtendedScrollMoreWithHttpInfo(CabinetSuppliesQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) CabinetSuppliesQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class CabinetSuppliesQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesSlotResponseData cabinetSuppliesSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>cabinetSuppliesSlot</code> but it also returns the http response headers .
   * The relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesSlotResponseData> cabinetSuppliesSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesSlotRequestData body);


  /**
   * Get relations to Slot entities
   * The relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>cabinetSuppliesSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesSlotResponseData cabinetSuppliesSlot(@Param("elid") String elid, CabinetSuppliesSlotRequestData body, @QueryMap(encoded=true) CabinetSuppliesSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * The relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>cabinetSuppliesSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesSlotResponseData> cabinetSuppliesSlotWithHttpInfo(@Param("elid") String elid, CabinetSuppliesSlotRequestData body, @QueryMap(encoded=true) CabinetSuppliesSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesSlot</code> method in a fluent style.
   */
  public static class CabinetSuppliesSlotQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesSlotQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesSwitchCabinetResponseData cabinetSuppliesSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>cabinetSuppliesSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesSwitchCabinetResponseData> cabinetSuppliesSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesSwitchCabinetResponseData cabinetSuppliesSwitchCabinet(@Param("elid") String elid, CabinetSuppliesSwitchCabinetRequestData body, @QueryMap(encoded=true) CabinetSuppliesSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesSwitchCabinetResponseData> cabinetSuppliesSwitchCabinetWithHttpInfo(@Param("elid") String elid, CabinetSuppliesSwitchCabinetRequestData body, @QueryMap(encoded=true) CabinetSuppliesSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesSwitchCabinet</code> method in a fluent style.
   */
  public static class CabinetSuppliesSwitchCabinetQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesSystemAttributesResponse cabinetSuppliesSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cabinetSuppliesSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesSystemAttributesResponse> cabinetSuppliesSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>cabinetSuppliesSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesSystemAttributesResponse cabinetSuppliesSystemAttributes(@Param("elid") String elid, CabinetSuppliesSystemAttributesRequest body, @QueryMap(encoded=true) CabinetSuppliesSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>cabinetSuppliesSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesSystemAttributesResponse> cabinetSuppliesSystemAttributesWithHttpInfo(@Param("elid") String elid, CabinetSuppliesSystemAttributesRequest body, @QueryMap(encoded=true) CabinetSuppliesSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesSystemAttributes</code> method in a fluent style.
   */
  public static class CabinetSuppliesSystemAttributesQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesSystemAttributesQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesVirtualSwitchesResponseData cabinetSuppliesVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>cabinetSuppliesVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesVirtualSwitchesResponseData> cabinetSuppliesVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesVirtualSwitchesResponseData cabinetSuppliesVirtualSwitches(@Param("elid") String elid, CabinetSuppliesVirtualSwitchesRequestData body, @QueryMap(encoded=true) CabinetSuppliesVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesVirtualSwitchesResponseData> cabinetSuppliesVirtualSwitchesWithHttpInfo(@Param("elid") String elid, CabinetSuppliesVirtualSwitchesRequestData body, @QueryMap(encoded=true) CabinetSuppliesVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesVirtualSwitches</code> method in a fluent style.
   */
  public static class CabinetSuppliesVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesWarehouseResponseData cabinetSuppliesWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>cabinetSuppliesWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesWarehouseResponseData> cabinetSuppliesWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesWarehouseResponseData cabinetSuppliesWarehouse(@Param("elid") String elid, CabinetSuppliesWarehouseRequestData body, @QueryMap(encoded=true) CabinetSuppliesWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesWarehouseResponseData> cabinetSuppliesWarehouseWithHttpInfo(@Param("elid") String elid, CabinetSuppliesWarehouseRequestData body, @QueryMap(encoded=true) CabinetSuppliesWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesWarehouse</code> method in a fluent style.
   */
  public static class CabinetSuppliesWarehouseQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesWarehouseQueryParams sessionId(final String value) {
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
   * @return CabinetSuppliesZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CabinetSuppliesZoneResponseData cabinetSuppliesZone(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>cabinetSuppliesZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CabinetSuppliesZoneResponseData> cabinetSuppliesZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CabinetSuppliesZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>cabinetSuppliesZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CabinetSuppliesZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CabinetSuppliesZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CabinetSuppliesZoneResponseData cabinetSuppliesZone(@Param("elid") String elid, CabinetSuppliesZoneRequestData body, @QueryMap(encoded=true) CabinetSuppliesZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>cabinetSuppliesZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CabinetSuppliesZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CabinetSuppliesZoneResponseData> cabinetSuppliesZoneWithHttpInfo(@Param("elid") String elid, CabinetSuppliesZoneRequestData body, @QueryMap(encoded=true) CabinetSuppliesZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cabinetSuppliesZone</code> method in a fluent style.
   */
  public static class CabinetSuppliesZoneQueryParams extends HashMap<String, Object> {
    public CabinetSuppliesZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeCabinetSuppliesResponse changeTypeCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeCabinetSuppliesRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeCabinetSupplies</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeCabinetSuppliesResponse> changeTypeCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeCabinetSuppliesRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeCabinetSuppliesResponse changeTypeCabinetSupplies(@Param("elid") String elid, ChangeTypeCabinetSuppliesRequestData body, @QueryMap(encoded=true) ChangeTypeCabinetSuppliesQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeCabinetSuppliesResponse> changeTypeCabinetSuppliesWithHttpInfo(@Param("elid") String elid, ChangeTypeCabinetSuppliesRequestData body, @QueryMap(encoded=true) ChangeTypeCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeCabinetSupplies</code> method in a fluent style.
   */
  public static class ChangeTypeCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public ChangeTypeCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cabinet supplies
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCabinetSuppliesResponse deleteCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCabinetSuppliesRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCabinetSupplies</code> but it also returns the http response headers .
   * Delete Cabinet supplies
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCabinetSuppliesResponse> deleteCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCabinetSuppliesRequestData body);


  /**
   * Delete
   * Delete Cabinet supplies
   * Note, this is equivalent to the other <code>deleteCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCabinetSuppliesResponse deleteCabinetSupplies(@Param("elid") String elid, DeleteCabinetSuppliesRequestData body, @QueryMap(encoded=true) DeleteCabinetSuppliesQueryParams queryParams);

  /**
  * Delete
  * Delete Cabinet supplies
  * Note, this is equivalent to the other <code>deleteCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCabinetSuppliesResponse> deleteCabinetSuppliesWithHttpInfo(@Param("elid") String elid, DeleteCabinetSuppliesRequestData body, @QueryMap(encoded=true) DeleteCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCabinetSupplies</code> method in a fluent style.
   */
  public static class DeleteCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public DeleteCabinetSuppliesQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetCabinetSuppliesResponse moveToCabinetCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetCabinetSuppliesRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetCabinetSupplies</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetCabinetSuppliesResponse> moveToCabinetCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetCabinetSuppliesRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetCabinetSuppliesResponse moveToCabinetCabinetSupplies(@Param("elid") String elid, MoveToCabinetCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToCabinetCabinetSuppliesQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetCabinetSuppliesResponse> moveToCabinetCabinetSuppliesWithHttpInfo(@Param("elid") String elid, MoveToCabinetCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToCabinetCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetCabinetSupplies</code> method in a fluent style.
   */
  public static class MoveToCabinetCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public MoveToCabinetCabinetSuppliesQueryParams sessionId(final String value) {
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
   * @return MoveToSlotCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotCabinetSuppliesResponse moveToSlotCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotCabinetSuppliesRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotCabinetSupplies</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotCabinetSuppliesResponse> moveToSlotCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotCabinetSuppliesRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotCabinetSuppliesResponse moveToSlotCabinetSupplies(@Param("elid") String elid, MoveToSlotCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToSlotCabinetSuppliesQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotCabinetSuppliesResponse> moveToSlotCabinetSuppliesWithHttpInfo(@Param("elid") String elid, MoveToSlotCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToSlotCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotCabinetSupplies</code> method in a fluent style.
   */
  public static class MoveToSlotCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public MoveToSlotCabinetSuppliesQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseCabinetSuppliesResponse moveToWarehouseCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseCabinetSuppliesRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseCabinetSupplies</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseCabinetSuppliesResponse> moveToWarehouseCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseCabinetSuppliesRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseCabinetSuppliesResponse moveToWarehouseCabinetSupplies(@Param("elid") String elid, MoveToWarehouseCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToWarehouseCabinetSuppliesQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseCabinetSuppliesResponse> moveToWarehouseCabinetSuppliesWithHttpInfo(@Param("elid") String elid, MoveToWarehouseCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToWarehouseCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseCabinetSupplies</code> method in a fluent style.
   */
  public static class MoveToWarehouseCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseCabinetSuppliesQueryParams sessionId(final String value) {
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
   * @return MoveToZoneCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneCabinetSuppliesResponse moveToZoneCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneCabinetSuppliesRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneCabinetSupplies</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneCabinetSuppliesResponse> moveToZoneCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneCabinetSuppliesRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneCabinetSuppliesResponse moveToZoneCabinetSupplies(@Param("elid") String elid, MoveToZoneCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToZoneCabinetSuppliesQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneCabinetSuppliesResponse> moveToZoneCabinetSuppliesWithHttpInfo(@Param("elid") String elid, MoveToZoneCabinetSuppliesRequestData body, @QueryMap(encoded=true) MoveToZoneCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneCabinetSupplies</code> method in a fluent style.
   */
  public static class MoveToZoneCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public MoveToZoneCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetCabinetSuppliesResponse placeInCabinetCabinetSupplies(@Param("sessionId") String sessionId, PlaceInCabinetCabinetSuppliesRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetCabinetSupplies</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetCabinetSuppliesResponse> placeInCabinetCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetCabinetSuppliesRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetCabinetSuppliesResponse placeInCabinetCabinetSupplies(PlaceInCabinetCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInCabinetCabinetSuppliesQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetCabinetSuppliesResponse> placeInCabinetCabinetSuppliesWithHttpInfo(PlaceInCabinetCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInCabinetCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetCabinetSupplies</code> method in a fluent style.
   */
  public static class PlaceInCabinetCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotCabinetSuppliesResponse placeInSlotCabinetSupplies(@Param("sessionId") String sessionId, PlaceInSlotCabinetSuppliesRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotCabinetSupplies</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotCabinetSuppliesResponse> placeInSlotCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotCabinetSuppliesRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to place has to be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotCabinetSuppliesResponse placeInSlotCabinetSupplies(PlaceInSlotCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInSlotCabinetSuppliesQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to place has to be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotCabinetSuppliesResponse> placeInSlotCabinetSuppliesWithHttpInfo(PlaceInSlotCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInSlotCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotCabinetSupplies</code> method in a fluent style.
   */
  public static class PlaceInSlotCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public PlaceInSlotCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseCabinetSuppliesResponse placeInWarehouseCabinetSupplies(@Param("sessionId") String sessionId, PlaceInWarehouseCabinetSuppliesRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseCabinetSupplies</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseCabinetSuppliesResponse> placeInWarehouseCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseCabinetSuppliesRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseCabinetSuppliesResponse placeInWarehouseCabinetSupplies(PlaceInWarehouseCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInWarehouseCabinetSuppliesQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseCabinetSuppliesResponse> placeInWarehouseCabinetSuppliesWithHttpInfo(PlaceInWarehouseCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInWarehouseCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseCabinetSupplies</code> method in a fluent style.
   */
  public static class PlaceInWarehouseCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneCabinetSuppliesResponse placeInZoneCabinetSupplies(@Param("sessionId") String sessionId, PlaceInZoneCabinetSuppliesRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneCabinetSupplies</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneCabinetSuppliesResponse> placeInZoneCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneCabinetSuppliesRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneCabinetSuppliesResponse placeInZoneCabinetSupplies(PlaceInZoneCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInZoneCabinetSuppliesQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneCabinetSuppliesResponse> placeInZoneCabinetSuppliesWithHttpInfo(PlaceInZoneCabinetSuppliesRequestData body, @QueryMap(encoded=true) PlaceInZoneCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneCabinetSupplies</code> method in a fluent style.
   */
  public static class PlaceInZoneCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public PlaceInZoneCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Cabinet supplies
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCabinetSuppliesResponse updateCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCabinetSuppliesRequestData body);

  /**
   * Modify
   * Similar to <code>updateCabinetSupplies</code> but it also returns the http response headers .
   * Modify Cabinet supplies
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCabinetSuppliesResponse> updateCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCabinetSuppliesRequestData body);


  /**
   * Modify
   * Modify Cabinet supplies
   * Note, this is equivalent to the other <code>updateCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCabinetSuppliesResponse updateCabinetSupplies(@Param("elid") String elid, UpdateCabinetSuppliesRequestData body, @QueryMap(encoded=true) UpdateCabinetSuppliesQueryParams queryParams);

  /**
  * Modify
  * Modify Cabinet supplies
  * Note, this is equivalent to the other <code>updateCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCabinetSuppliesResponse> updateCabinetSuppliesWithHttpInfo(@Param("elid") String elid, UpdateCabinetSuppliesRequestData body, @QueryMap(encoded=true) UpdateCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCabinetSupplies</code> method in a fluent style.
   */
  public static class UpdateCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public UpdateCabinetSuppliesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCabinetSuppliesResponse updateSystemAttributesCabinetSupplies(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCabinetSuppliesRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCabinetSupplies</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCabinetSuppliesResponse> updateSystemAttributesCabinetSuppliesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCabinetSuppliesRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCabinetSupplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCabinetSuppliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCabinetSuppliesResponse
   */
  @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCabinetSuppliesResponse updateSystemAttributesCabinetSupplies(@Param("elid") String elid, UpdateSystemAttributesCabinetSuppliesRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCabinetSuppliesQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCabinetSupplies</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCabinetSuppliesResponse
      */
      @RequestLine("POST /api/rest/entity/cabinetSupplies/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCabinetSuppliesResponse> updateSystemAttributesCabinetSuppliesWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCabinetSuppliesRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCabinetSuppliesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCabinetSupplies</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCabinetSuppliesQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCabinetSuppliesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
