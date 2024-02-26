package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BreakCassetteSplicesJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.BreakCassetteSplicesJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.BreakSplicesJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.BreakSplicesJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.ChangeTypeJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.ConnectJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.ConnectJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.CutFibersJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.CutFibersJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.DeleteCassetteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCassetteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.DeleteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.DeleteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.DeleteSplitterJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSplitterJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.DisconnectJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.DisconnectJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistContractsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistContractsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistDeviceMasterJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistDeviceMasterJunctionBoxFistResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistLocationRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistLocationResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistNodeRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistNodeResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistPersonsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistPersonsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistQueryResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistZoneRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFistZoneResponseData;
import com.fntsoftware.businessgateway.entities.LayFiberIntoCassetteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.LayFiberIntoCassetteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.LoopInCableJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.LoopInCableJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.ModifyConnectionJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.ModifyConnectionJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveCassetteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveCassetteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveConnectionJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveConnectionJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveFiberJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveFiberJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveSplitterJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveSplitterJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveToNodeJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveToNodeJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.PlaceCassetteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.PlaceCassetteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.PlaceInNodeJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInNodeJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.PlaceSplitterJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.PlaceSplitterJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.RemoveCableJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.RemoveCableJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.RemoveFiberFromCassetteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.RemoveFiberFromCassetteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.SpliceFiber1To1JunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.SpliceFiber1To1JunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.SpliceFibersJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.SpliceFibersJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.SpliceSplitterJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.SpliceSplitterJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.UpdateCassetteJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCassetteJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.UpdateJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.UpdateJunctionBoxFistResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesJunctionBoxFistRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesJunctionBoxFistResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface JunctionBoxFistApi extends ApiClient.Api {


  /**
   * Break all splices in a cassette
   * Break all splices in a cassette
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BreakCassetteSplicesJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakCassetteSplices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BreakCassetteSplicesJunctionBoxFistResponse breakCassetteSplicesJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, BreakCassetteSplicesJunctionBoxFistRequestData body);

  /**
   * Break all splices in a cassette
   * Similar to <code>breakCassetteSplicesJunctionBoxFist</code> but it also returns the http response headers .
   * Break all splices in a cassette
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakCassetteSplices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BreakCassetteSplicesJunctionBoxFistResponse> breakCassetteSplicesJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BreakCassetteSplicesJunctionBoxFistRequestData body);


  /**
   * Break all splices in a cassette
   * Break all splices in a cassette
   * Note, this is equivalent to the other <code>breakCassetteSplicesJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BreakCassetteSplicesJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BreakCassetteSplicesJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakCassetteSplices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BreakCassetteSplicesJunctionBoxFistResponse breakCassetteSplicesJunctionBoxFist(@Param("elid") String elid, BreakCassetteSplicesJunctionBoxFistRequestData body, @QueryMap(encoded=true) BreakCassetteSplicesJunctionBoxFistQueryParams queryParams);

  /**
  * Break all splices in a cassette
  * Break all splices in a cassette
  * Note, this is equivalent to the other <code>breakCassetteSplicesJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BreakCassetteSplicesJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakCassetteSplices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BreakCassetteSplicesJunctionBoxFistResponse> breakCassetteSplicesJunctionBoxFistWithHttpInfo(@Param("elid") String elid, BreakCassetteSplicesJunctionBoxFistRequestData body, @QueryMap(encoded=true) BreakCassetteSplicesJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>breakCassetteSplicesJunctionBoxFist</code> method in a fluent style.
   */
  public static class BreakCassetteSplicesJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public BreakCassetteSplicesJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Break splices
   * Break splices
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BreakSplicesJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakSplices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BreakSplicesJunctionBoxFistResponse breakSplicesJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, BreakSplicesJunctionBoxFistRequestData body);

  /**
   * Break splices
   * Similar to <code>breakSplicesJunctionBoxFist</code> but it also returns the http response headers .
   * Break splices
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakSplices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BreakSplicesJunctionBoxFistResponse> breakSplicesJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BreakSplicesJunctionBoxFistRequestData body);


  /**
   * Break splices
   * Break splices
   * Note, this is equivalent to the other <code>breakSplicesJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BreakSplicesJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BreakSplicesJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakSplices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BreakSplicesJunctionBoxFistResponse breakSplicesJunctionBoxFist(@Param("elid") String elid, BreakSplicesJunctionBoxFistRequestData body, @QueryMap(encoded=true) BreakSplicesJunctionBoxFistQueryParams queryParams);

  /**
  * Break splices
  * Break splices
  * Note, this is equivalent to the other <code>breakSplicesJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BreakSplicesJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/breakSplices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BreakSplicesJunctionBoxFistResponse> breakSplicesJunctionBoxFistWithHttpInfo(@Param("elid") String elid, BreakSplicesJunctionBoxFistRequestData body, @QueryMap(encoded=true) BreakSplicesJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>breakSplicesJunctionBoxFist</code> method in a fluent style.
   */
  public static class BreakSplicesJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public BreakSplicesJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return ChangeTypeJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeJunctionBoxFistResponse changeTypeJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeJunctionBoxFistRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeJunctionBoxFist</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeJunctionBoxFistResponse> changeTypeJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeJunctionBoxFistRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeJunctionBoxFistResponse changeTypeJunctionBoxFist(@Param("elid") String elid, ChangeTypeJunctionBoxFistRequestData body, @QueryMap(encoded=true) ChangeTypeJunctionBoxFistQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeJunctionBoxFistResponse> changeTypeJunctionBoxFistWithHttpInfo(@Param("elid") String elid, ChangeTypeJunctionBoxFistRequestData body, @QueryMap(encoded=true) ChangeTypeJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeJunctionBoxFist</code> method in a fluent style.
   */
  public static class ChangeTypeJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public ChangeTypeJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Connect
   * Connect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ConnectJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConnectJunctionBoxFistResponse connectJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, ConnectJunctionBoxFistRequestData body);

  /**
   * Connect
   * Similar to <code>connectJunctionBoxFist</code> but it also returns the http response headers .
   * Connect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConnectJunctionBoxFistResponse> connectJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConnectJunctionBoxFistRequestData body);


  /**
   * Connect
   * Connect
   * Note, this is equivalent to the other <code>connectJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConnectJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConnectJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/connect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConnectJunctionBoxFistResponse connectJunctionBoxFist(@Param("elid") String elid, ConnectJunctionBoxFistRequestData body, @QueryMap(encoded=true) ConnectJunctionBoxFistQueryParams queryParams);

  /**
  * Connect
  * Connect
  * Note, this is equivalent to the other <code>connectJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConnectJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/connect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConnectJunctionBoxFistResponse> connectJunctionBoxFistWithHttpInfo(@Param("elid") String elid, ConnectJunctionBoxFistRequestData body, @QueryMap(encoded=true) ConnectJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>connectJunctionBoxFist</code> method in a fluent style.
   */
  public static class ConnectJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public ConnectJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Cut fibers
   * Cut fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CutFibersJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/cutFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CutFibersJunctionBoxFistResponse cutFibersJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, CutFibersJunctionBoxFistRequestData body);

  /**
   * Cut fibers
   * Similar to <code>cutFibersJunctionBoxFist</code> but it also returns the http response headers .
   * Cut fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/cutFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CutFibersJunctionBoxFistResponse> cutFibersJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CutFibersJunctionBoxFistRequestData body);


  /**
   * Cut fibers
   * Cut fibers
   * Note, this is equivalent to the other <code>cutFibersJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CutFibersJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CutFibersJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/cutFibers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CutFibersJunctionBoxFistResponse cutFibersJunctionBoxFist(@Param("elid") String elid, CutFibersJunctionBoxFistRequestData body, @QueryMap(encoded=true) CutFibersJunctionBoxFistQueryParams queryParams);

  /**
  * Cut fibers
  * Cut fibers
  * Note, this is equivalent to the other <code>cutFibersJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CutFibersJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/cutFibers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CutFibersJunctionBoxFistResponse> cutFibersJunctionBoxFistWithHttpInfo(@Param("elid") String elid, CutFibersJunctionBoxFistRequestData body, @QueryMap(encoded=true) CutFibersJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cutFibersJunctionBoxFist</code> method in a fluent style.
   */
  public static class CutFibersJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public CutFibersJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete cassette
   * Delete cassette
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCassetteJunctionBoxFistResponse deleteCassetteJunctionBoxFist(@Param("sessionId") String sessionId, DeleteCassetteJunctionBoxFistRequestData body);

  /**
   * Delete cassette
   * Similar to <code>deleteCassetteJunctionBoxFist</code> but it also returns the http response headers .
   * Delete cassette
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCassetteJunctionBoxFistResponse> deleteCassetteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, DeleteCassetteJunctionBoxFistRequestData body);


  /**
   * Delete cassette
   * Delete cassette
   * Note, this is equivalent to the other <code>deleteCassetteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCassetteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteCassette?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCassetteJunctionBoxFistResponse deleteCassetteJunctionBoxFist(DeleteCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) DeleteCassetteJunctionBoxFistQueryParams queryParams);

  /**
  * Delete cassette
  * Delete cassette
  * Note, this is equivalent to the other <code>deleteCassetteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCassetteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteCassette?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCassetteJunctionBoxFistResponse> deleteCassetteJunctionBoxFistWithHttpInfo(DeleteCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) DeleteCassetteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCassetteJunctionBoxFist</code> method in a fluent style.
   */
  public static class DeleteCassetteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public DeleteCassetteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteJunctionBoxFistResponse deleteJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteJunctionBoxFistRequestData body);

  /**
   * Delete
   * Similar to <code>deleteJunctionBoxFist</code> but it also returns the http response headers .
   * Delete Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteJunctionBoxFistResponse> deleteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteJunctionBoxFistRequestData body);


  /**
   * Delete
   * Delete Junction box
   * Note, this is equivalent to the other <code>deleteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteJunctionBoxFistResponse deleteJunctionBoxFist(@Param("elid") String elid, DeleteJunctionBoxFistRequestData body, @QueryMap(encoded=true) DeleteJunctionBoxFistQueryParams queryParams);

  /**
  * Delete
  * Delete Junction box
  * Note, this is equivalent to the other <code>deleteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteJunctionBoxFistResponse> deleteJunctionBoxFistWithHttpInfo(@Param("elid") String elid, DeleteJunctionBoxFistRequestData body, @QueryMap(encoded=true) DeleteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteJunctionBoxFist</code> method in a fluent style.
   */
  public static class DeleteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public DeleteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove splitter
   * Remove splitter
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSplitterJunctionBoxFistResponse deleteSplitterJunctionBoxFist(@Param("sessionId") String sessionId, DeleteSplitterJunctionBoxFistRequestData body);

  /**
   * Remove splitter
   * Similar to <code>deleteSplitterJunctionBoxFist</code> but it also returns the http response headers .
   * Remove splitter
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSplitterJunctionBoxFistResponse> deleteSplitterJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, DeleteSplitterJunctionBoxFistRequestData body);


  /**
   * Remove splitter
   * Remove splitter
   * Note, this is equivalent to the other <code>deleteSplitterJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSplitterJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteSplitter?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSplitterJunctionBoxFistResponse deleteSplitterJunctionBoxFist(DeleteSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) DeleteSplitterJunctionBoxFistQueryParams queryParams);

  /**
  * Remove splitter
  * Remove splitter
  * Note, this is equivalent to the other <code>deleteSplitterJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSplitterJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/deleteSplitter?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSplitterJunctionBoxFistResponse> deleteSplitterJunctionBoxFistWithHttpInfo(DeleteSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) DeleteSplitterJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSplitterJunctionBoxFist</code> method in a fluent style.
   */
  public static class DeleteSplitterJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public DeleteSplitterJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete connection
   * Delete connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DisconnectJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/disconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DisconnectJunctionBoxFistResponse disconnectJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, DisconnectJunctionBoxFistRequestData body);

  /**
   * Delete connection
   * Similar to <code>disconnectJunctionBoxFist</code> but it also returns the http response headers .
   * Delete connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/disconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DisconnectJunctionBoxFistResponse> disconnectJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DisconnectJunctionBoxFistRequestData body);


  /**
   * Delete connection
   * Delete connection
   * Note, this is equivalent to the other <code>disconnectJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DisconnectJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DisconnectJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/disconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DisconnectJunctionBoxFistResponse disconnectJunctionBoxFist(@Param("elid") String elid, DisconnectJunctionBoxFistRequestData body, @QueryMap(encoded=true) DisconnectJunctionBoxFistQueryParams queryParams);

  /**
  * Delete connection
  * Delete connection
  * Note, this is equivalent to the other <code>disconnectJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DisconnectJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/disconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DisconnectJunctionBoxFistResponse> disconnectJunctionBoxFistWithHttpInfo(@Param("elid") String elid, DisconnectJunctionBoxFistRequestData body, @QueryMap(encoded=true) DisconnectJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>disconnectJunctionBoxFist</code> method in a fluent style.
   */
  public static class DisconnectJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public DisconnectJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistContractsResponseData junctionBoxFistContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>junctionBoxFistContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistContractsResponseData> junctionBoxFistContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistContractsResponseData junctionBoxFistContracts(@Param("elid") String elid, JunctionBoxFistContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFistContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistContractsResponseData> junctionBoxFistContractsWithHttpInfo(@Param("elid") String elid, JunctionBoxFistContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFistContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistContracts</code> method in a fluent style.
   */
  public static class JunctionBoxFistContractsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return JunctionBoxFistDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistDataCablesResponseData junctionBoxFistDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>junctionBoxFistDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistDataCablesResponseData> junctionBoxFistDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistDataCablesResponseData junctionBoxFistDataCables(@Param("elid") String elid, JunctionBoxFistDataCablesRequestData body, @QueryMap(encoded=true) JunctionBoxFistDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistDataCablesResponseData> junctionBoxFistDataCablesWithHttpInfo(@Param("elid") String elid, JunctionBoxFistDataCablesRequestData body, @QueryMap(encoded=true) JunctionBoxFistDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistDataCables</code> method in a fluent style.
   */
  public static class JunctionBoxFistDataCablesQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master junction box fist entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return JunctionBoxFistDeviceMasterJunctionBoxFistResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DeviceMasterJunctionBoxFist?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistDeviceMasterJunctionBoxFistResponseData junctionBoxFistDeviceMasterJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistDeviceMasterJunctionBoxFistRequestData body);

  /**
   * Get relations to Device master junction box fist entities
   * Similar to <code>junctionBoxFistDeviceMasterJunctionBoxFist</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DeviceMasterJunctionBoxFist?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistDeviceMasterJunctionBoxFistResponseData> junctionBoxFistDeviceMasterJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistDeviceMasterJunctionBoxFistRequestData body);


  /**
   * Get relations to Device master junction box fist entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistDeviceMasterJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistDeviceMasterJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistDeviceMasterJunctionBoxFistResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DeviceMasterJunctionBoxFist?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistDeviceMasterJunctionBoxFistResponseData junctionBoxFistDeviceMasterJunctionBoxFist(@Param("elid") String elid, JunctionBoxFistDeviceMasterJunctionBoxFistRequestData body, @QueryMap(encoded=true) JunctionBoxFistDeviceMasterJunctionBoxFistQueryParams queryParams);

  /**
  * Get relations to Device master junction box fist entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistDeviceMasterJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistDeviceMasterJunctionBoxFistResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/DeviceMasterJunctionBoxFist?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistDeviceMasterJunctionBoxFistResponseData> junctionBoxFistDeviceMasterJunctionBoxFistWithHttpInfo(@Param("elid") String elid, JunctionBoxFistDeviceMasterJunctionBoxFistRequestData body, @QueryMap(encoded=true) JunctionBoxFistDeviceMasterJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistDeviceMasterJunctionBoxFist</code> method in a fluent style.
   */
  public static class JunctionBoxFistDeviceMasterJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistDeviceMasterJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistFrameContractsResponseData junctionBoxFistFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>junctionBoxFistFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistFrameContractsResponseData> junctionBoxFistFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistFrameContractsResponseData junctionBoxFistFrameContracts(@Param("elid") String elid, JunctionBoxFistFrameContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFistFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistFrameContractsResponseData> junctionBoxFistFrameContractsWithHttpInfo(@Param("elid") String elid, JunctionBoxFistFrameContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFistFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistFrameContracts</code> method in a fluent style.
   */
  public static class JunctionBoxFistFrameContractsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistFrameContractsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistLocationResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistLocationResponse junctionBoxFistLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistLocationRequest body);

  /**
   * Location
   * Similar to <code>junctionBoxFistLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistLocationResponse> junctionBoxFistLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistLocationResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistLocationResponse junctionBoxFistLocation(@Param("elid") String elid, JunctionBoxFistLocationRequest body, @QueryMap(encoded=true) JunctionBoxFistLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistLocationResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistLocationResponse> junctionBoxFistLocationWithHttpInfo(@Param("elid") String elid, JunctionBoxFistLocationRequest body, @QueryMap(encoded=true) JunctionBoxFistLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistLocation</code> method in a fluent style.
   */
  public static class JunctionBoxFistLocationQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistLocationQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistMaintenanceContractsResponseData junctionBoxFistMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>junctionBoxFistMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistMaintenanceContractsResponseData> junctionBoxFistMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistMaintenanceContractsResponseData junctionBoxFistMaintenanceContracts(@Param("elid") String elid, JunctionBoxFistMaintenanceContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFistMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistMaintenanceContractsResponseData> junctionBoxFistMaintenanceContractsWithHttpInfo(@Param("elid") String elid, JunctionBoxFistMaintenanceContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFistMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistMaintenanceContracts</code> method in a fluent style.
   */
  public static class JunctionBoxFistMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return JunctionBoxFistNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Node?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistNodeResponseData junctionBoxFistNode(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>junctionBoxFistNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Node?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistNodeResponseData> junctionBoxFistNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Node?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistNodeResponseData junctionBoxFistNode(@Param("elid") String elid, JunctionBoxFistNodeRequestData body, @QueryMap(encoded=true) JunctionBoxFistNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Node?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistNodeResponseData> junctionBoxFistNodeWithHttpInfo(@Param("elid") String elid, JunctionBoxFistNodeRequestData body, @QueryMap(encoded=true) JunctionBoxFistNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistNode</code> method in a fluent style.
   */
  public static class JunctionBoxFistNodeQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistNodeQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistOperatingSystemInstallationResponseData junctionBoxFistOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>junctionBoxFistOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistOperatingSystemInstallationResponseData> junctionBoxFistOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistOperatingSystemInstallationResponseData junctionBoxFistOperatingSystemInstallation(@Param("elid") String elid, JunctionBoxFistOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) JunctionBoxFistOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistOperatingSystemInstallationResponseData> junctionBoxFistOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, JunctionBoxFistOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) JunctionBoxFistOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class JunctionBoxFistOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistOrganizationsResponseData junctionBoxFistOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>junctionBoxFistOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistOrganizationsResponseData> junctionBoxFistOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistOrganizationsResponseData junctionBoxFistOrganizations(@Param("elid") String elid, JunctionBoxFistOrganizationsRequestData body, @QueryMap(encoded=true) JunctionBoxFistOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistOrganizationsResponseData> junctionBoxFistOrganizationsWithHttpInfo(@Param("elid") String elid, JunctionBoxFistOrganizationsRequestData body, @QueryMap(encoded=true) JunctionBoxFistOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistOrganizations</code> method in a fluent style.
   */
  public static class JunctionBoxFistOrganizationsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistOrganizationsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistPersonGroupsResponseData junctionBoxFistPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>junctionBoxFistPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistPersonGroupsResponseData> junctionBoxFistPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistPersonGroupsResponseData junctionBoxFistPersonGroups(@Param("elid") String elid, JunctionBoxFistPersonGroupsRequestData body, @QueryMap(encoded=true) JunctionBoxFistPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistPersonGroupsResponseData> junctionBoxFistPersonGroupsWithHttpInfo(@Param("elid") String elid, JunctionBoxFistPersonGroupsRequestData body, @QueryMap(encoded=true) JunctionBoxFistPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistPersonGroups</code> method in a fluent style.
   */
  public static class JunctionBoxFistPersonGroupsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistPersonGroupsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistPersonsResponseData junctionBoxFistPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>junctionBoxFistPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistPersonsResponseData> junctionBoxFistPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistPersonsResponseData junctionBoxFistPersons(@Param("elid") String elid, JunctionBoxFistPersonsRequestData body, @QueryMap(encoded=true) JunctionBoxFistPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistPersonsResponseData> junctionBoxFistPersonsWithHttpInfo(@Param("elid") String elid, JunctionBoxFistPersonsRequestData body, @QueryMap(encoded=true) JunctionBoxFistPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistPersons</code> method in a fluent style.
   */
  public static class JunctionBoxFistPersonsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxFistQueryResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistQueryResponse junctionBoxFistQuery(@Param("sessionId") String sessionId, JunctionBoxFistQueryRequest body);

  /**
   * Basic query
   * Similar to <code>junctionBoxFistQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistQueryResponse> junctionBoxFistQueryWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxFistQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>junctionBoxFistQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistQueryResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistQueryResponse junctionBoxFistQuery(JunctionBoxFistQueryRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>junctionBoxFistQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistQueryResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistQueryResponse> junctionBoxFistQueryWithHttpInfo(JunctionBoxFistQueryRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistQuery</code> method in a fluent style.
   */
  public static class JunctionBoxFistQueryQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxFistQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistQueryExtendedResponse junctionBoxFistQueryExtended(@Param("sessionId") String sessionId, JunctionBoxFistQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>junctionBoxFistQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistQueryExtendedResponse> junctionBoxFistQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxFistQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data.
   * Note, this is equivalent to the other <code>junctionBoxFistQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistQueryExtendedResponse junctionBoxFistQueryExtended(JunctionBoxFistQueryExtendedRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data.
  * Note, this is equivalent to the other <code>junctionBoxFistQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistQueryExtendedResponse> junctionBoxFistQueryExtendedWithHttpInfo(JunctionBoxFistQueryExtendedRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistQueryExtended</code> method in a fluent style.
   */
  public static class JunctionBoxFistQueryExtendedQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxFistQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistQueryExtendedScrollFirstResponse junctionBoxFistQueryExtendedScrollFirst(@Param("sessionId") String sessionId, JunctionBoxFistQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>junctionBoxFistQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistQueryExtendedScrollFirstResponse> junctionBoxFistQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxFistQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>junctionBoxFistQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistQueryExtendedScrollFirstResponse junctionBoxFistQueryExtendedScrollFirst(JunctionBoxFistQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>junctionBoxFistQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistQueryExtendedScrollFirstResponse> junctionBoxFistQueryExtendedScrollFirstWithHttpInfo(JunctionBoxFistQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class JunctionBoxFistQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxFistQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistQueryExtendedScrollMoreResponse junctionBoxFistQueryExtendedScrollMore(@Param("sessionId") String sessionId, JunctionBoxFistQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>junctionBoxFistQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistQueryExtendedScrollMoreResponse> junctionBoxFistQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxFistQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>junctionBoxFistQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistQueryExtendedScrollMoreResponse junctionBoxFistQueryExtendedScrollMore(JunctionBoxFistQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>junctionBoxFistQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistQueryExtendedScrollMoreResponse> junctionBoxFistQueryExtendedScrollMoreWithHttpInfo(JunctionBoxFistQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) JunctionBoxFistQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class JunctionBoxFistQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistSwitchCabinetResponseData junctionBoxFistSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>junctionBoxFistSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistSwitchCabinetResponseData> junctionBoxFistSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistSwitchCabinetResponseData junctionBoxFistSwitchCabinet(@Param("elid") String elid, JunctionBoxFistSwitchCabinetRequestData body, @QueryMap(encoded=true) JunctionBoxFistSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistSwitchCabinetResponseData> junctionBoxFistSwitchCabinetWithHttpInfo(@Param("elid") String elid, JunctionBoxFistSwitchCabinetRequestData body, @QueryMap(encoded=true) JunctionBoxFistSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistSwitchCabinet</code> method in a fluent style.
   */
  public static class JunctionBoxFistSwitchCabinetQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistSystemAttributesResponse junctionBoxFistSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>junctionBoxFistSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistSystemAttributesResponse> junctionBoxFistSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>junctionBoxFistSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistSystemAttributesResponse junctionBoxFistSystemAttributes(@Param("elid") String elid, JunctionBoxFistSystemAttributesRequest body, @QueryMap(encoded=true) JunctionBoxFistSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>junctionBoxFistSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistSystemAttributesResponse> junctionBoxFistSystemAttributesWithHttpInfo(@Param("elid") String elid, JunctionBoxFistSystemAttributesRequest body, @QueryMap(encoded=true) JunctionBoxFistSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistSystemAttributes</code> method in a fluent style.
   */
  public static class JunctionBoxFistSystemAttributesQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistSystemAttributesQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistWarehouseResponseData junctionBoxFistWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>junctionBoxFistWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistWarehouseResponseData> junctionBoxFistWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistWarehouseResponseData junctionBoxFistWarehouse(@Param("elid") String elid, JunctionBoxFistWarehouseRequestData body, @QueryMap(encoded=true) JunctionBoxFistWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistWarehouseResponseData> junctionBoxFistWarehouseWithHttpInfo(@Param("elid") String elid, JunctionBoxFistWarehouseRequestData body, @QueryMap(encoded=true) JunctionBoxFistWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistWarehouse</code> method in a fluent style.
   */
  public static class JunctionBoxFistWarehouseQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistWarehouseQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFistZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFistZoneResponseData junctionBoxFistZone(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>junctionBoxFistZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFistZoneResponseData> junctionBoxFistZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFistZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFistZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFistZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFistZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFistZoneResponseData junctionBoxFistZone(@Param("elid") String elid, JunctionBoxFistZoneRequestData body, @QueryMap(encoded=true) JunctionBoxFistZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFistZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFistZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFistZoneResponseData> junctionBoxFistZoneWithHttpInfo(@Param("elid") String elid, JunctionBoxFistZoneRequestData body, @QueryMap(encoded=true) JunctionBoxFistZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFistZone</code> method in a fluent style.
   */
  public static class JunctionBoxFistZoneQueryParams extends HashMap<String, Object> {
    public JunctionBoxFistZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Lay in fiber
   * Lay in fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LayFiberIntoCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/layFiberIntoCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LayFiberIntoCassetteJunctionBoxFistResponse layFiberIntoCassetteJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, LayFiberIntoCassetteJunctionBoxFistRequestData body);

  /**
   * Lay in fiber
   * Similar to <code>layFiberIntoCassetteJunctionBoxFist</code> but it also returns the http response headers .
   * Lay in fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/layFiberIntoCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LayFiberIntoCassetteJunctionBoxFistResponse> layFiberIntoCassetteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LayFiberIntoCassetteJunctionBoxFistRequestData body);


  /**
   * Lay in fiber
   * Lay in fiber
   * Note, this is equivalent to the other <code>layFiberIntoCassetteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LayFiberIntoCassetteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LayFiberIntoCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/layFiberIntoCassette?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LayFiberIntoCassetteJunctionBoxFistResponse layFiberIntoCassetteJunctionBoxFist(@Param("elid") String elid, LayFiberIntoCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) LayFiberIntoCassetteJunctionBoxFistQueryParams queryParams);

  /**
  * Lay in fiber
  * Lay in fiber
  * Note, this is equivalent to the other <code>layFiberIntoCassetteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LayFiberIntoCassetteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/layFiberIntoCassette?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LayFiberIntoCassetteJunctionBoxFistResponse> layFiberIntoCassetteJunctionBoxFistWithHttpInfo(@Param("elid") String elid, LayFiberIntoCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) LayFiberIntoCassetteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>layFiberIntoCassetteJunctionBoxFist</code> method in a fluent style.
   */
  public static class LayFiberIntoCassetteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public LayFiberIntoCassetteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Loop-in cable
   * Loop-in cable into junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LoopInCableJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/loopInCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoopInCableJunctionBoxFistResponse loopInCableJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInCableJunctionBoxFistRequestData body);

  /**
   * Loop-in cable
   * Similar to <code>loopInCableJunctionBoxFist</code> but it also returns the http response headers .
   * Loop-in cable into junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/loopInCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoopInCableJunctionBoxFistResponse> loopInCableJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInCableJunctionBoxFistRequestData body);


  /**
   * Loop-in cable
   * Loop-in cable into junction box
   * Note, this is equivalent to the other <code>loopInCableJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoopInCableJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoopInCableJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/loopInCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoopInCableJunctionBoxFistResponse loopInCableJunctionBoxFist(@Param("elid") String elid, LoopInCableJunctionBoxFistRequestData body, @QueryMap(encoded=true) LoopInCableJunctionBoxFistQueryParams queryParams);

  /**
  * Loop-in cable
  * Loop-in cable into junction box
  * Note, this is equivalent to the other <code>loopInCableJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoopInCableJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/loopInCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoopInCableJunctionBoxFistResponse> loopInCableJunctionBoxFistWithHttpInfo(@Param("elid") String elid, LoopInCableJunctionBoxFistRequestData body, @QueryMap(encoded=true) LoopInCableJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loopInCableJunctionBoxFist</code> method in a fluent style.
   */
  public static class LoopInCableJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public LoopInCableJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Edit connection
   * Edit connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ModifyConnectionJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/modifyConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModifyConnectionJunctionBoxFistResponse modifyConnectionJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectionJunctionBoxFistRequestData body);

  /**
   * Edit connection
   * Similar to <code>modifyConnectionJunctionBoxFist</code> but it also returns the http response headers .
   * Edit connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/modifyConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModifyConnectionJunctionBoxFistResponse> modifyConnectionJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectionJunctionBoxFistRequestData body);


  /**
   * Edit connection
   * Edit connection
   * Note, this is equivalent to the other <code>modifyConnectionJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModifyConnectionJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModifyConnectionJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/modifyConnection?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModifyConnectionJunctionBoxFistResponse modifyConnectionJunctionBoxFist(@Param("elid") String elid, ModifyConnectionJunctionBoxFistRequestData body, @QueryMap(encoded=true) ModifyConnectionJunctionBoxFistQueryParams queryParams);

  /**
  * Edit connection
  * Edit connection
  * Note, this is equivalent to the other <code>modifyConnectionJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModifyConnectionJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/modifyConnection?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModifyConnectionJunctionBoxFistResponse> modifyConnectionJunctionBoxFistWithHttpInfo(@Param("elid") String elid, ModifyConnectionJunctionBoxFistRequestData body, @QueryMap(encoded=true) ModifyConnectionJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modifyConnectionJunctionBoxFist</code> method in a fluent style.
   */
  public static class ModifyConnectionJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public ModifyConnectionJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move cassette
   * Move cassette
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveCassetteJunctionBoxFistResponse moveCassetteJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveCassetteJunctionBoxFistRequestData body);

  /**
   * Move cassette
   * Similar to <code>moveCassetteJunctionBoxFist</code> but it also returns the http response headers .
   * Move cassette
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveCassetteJunctionBoxFistResponse> moveCassetteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveCassetteJunctionBoxFistRequestData body);


  /**
   * Move cassette
   * Move cassette
   * Note, this is equivalent to the other <code>moveCassetteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveCassetteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveCassette?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveCassetteJunctionBoxFistResponse moveCassetteJunctionBoxFist(@Param("elid") String elid, MoveCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveCassetteJunctionBoxFistQueryParams queryParams);

  /**
  * Move cassette
  * Move cassette
  * Note, this is equivalent to the other <code>moveCassetteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveCassetteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveCassette?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveCassetteJunctionBoxFistResponse> moveCassetteJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveCassetteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveCassetteJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveCassetteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveCassetteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move connection
   * Move connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveConnectionJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveConnectionJunctionBoxFistResponse moveConnectionJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveConnectionJunctionBoxFistRequestData body);

  /**
   * Move connection
   * Similar to <code>moveConnectionJunctionBoxFist</code> but it also returns the http response headers .
   * Move connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveConnectionJunctionBoxFistResponse> moveConnectionJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveConnectionJunctionBoxFistRequestData body);


  /**
   * Move connection
   * Move connection
   * Note, this is equivalent to the other <code>moveConnectionJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveConnectionJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveConnectionJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveConnection?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveConnectionJunctionBoxFistResponse moveConnectionJunctionBoxFist(@Param("elid") String elid, MoveConnectionJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveConnectionJunctionBoxFistQueryParams queryParams);

  /**
  * Move connection
  * Move connection
  * Note, this is equivalent to the other <code>moveConnectionJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveConnectionJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveConnection?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveConnectionJunctionBoxFistResponse> moveConnectionJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveConnectionJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveConnectionJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveConnectionJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveConnectionJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveConnectionJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move fiber
   * Move fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveFiberJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveFiberJunctionBoxFistResponse moveFiberJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveFiberJunctionBoxFistRequestData body);

  /**
   * Move fiber
   * Similar to <code>moveFiberJunctionBoxFist</code> but it also returns the http response headers .
   * Move fiber
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveFiber?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveFiberJunctionBoxFistResponse> moveFiberJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveFiberJunctionBoxFistRequestData body);


  /**
   * Move fiber
   * Move fiber
   * Note, this is equivalent to the other <code>moveFiberJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveFiberJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveFiberJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveFiber?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveFiberJunctionBoxFistResponse moveFiberJunctionBoxFist(@Param("elid") String elid, MoveFiberJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveFiberJunctionBoxFistQueryParams queryParams);

  /**
  * Move fiber
  * Move fiber
  * Note, this is equivalent to the other <code>moveFiberJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveFiberJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveFiber?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveFiberJunctionBoxFistResponse> moveFiberJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveFiberJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveFiberJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveFiberJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveFiberJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveFiberJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move splitter
   * Move splitter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveSplitterJunctionBoxFistResponse moveSplitterJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveSplitterJunctionBoxFistRequestData body);

  /**
   * Move splitter
   * Similar to <code>moveSplitterJunctionBoxFist</code> but it also returns the http response headers .
   * Move splitter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveSplitterJunctionBoxFistResponse> moveSplitterJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveSplitterJunctionBoxFistRequestData body);


  /**
   * Move splitter
   * Move splitter
   * Note, this is equivalent to the other <code>moveSplitterJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveSplitterJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveSplitter?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveSplitterJunctionBoxFistResponse moveSplitterJunctionBoxFist(@Param("elid") String elid, MoveSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveSplitterJunctionBoxFistQueryParams queryParams);

  /**
  * Move splitter
  * Move splitter
  * Note, this is equivalent to the other <code>moveSplitterJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveSplitterJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveSplitter?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveSplitterJunctionBoxFistResponse> moveSplitterJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveSplitterJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveSplitterJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveSplitterJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveSplitterJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetJunctionBoxFistResponse moveToCabinetJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetJunctionBoxFistRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetJunctionBoxFist</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetJunctionBoxFistResponse> moveToCabinetJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetJunctionBoxFistRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetJunctionBoxFistResponse moveToCabinetJunctionBoxFist(@Param("elid") String elid, MoveToCabinetJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToCabinetJunctionBoxFistQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetJunctionBoxFistResponse> moveToCabinetJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveToCabinetJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToCabinetJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveToCabinetJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveToCabinetJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move to node
   * Move to node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveToNodeJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToNodeJunctionBoxFistResponse moveToNodeJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToNodeJunctionBoxFistRequestData body);

  /**
   * Move to node
   * Similar to <code>moveToNodeJunctionBoxFist</code> but it also returns the http response headers .
   * Move to node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToNodeJunctionBoxFistResponse> moveToNodeJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToNodeJunctionBoxFistRequestData body);


  /**
   * Move to node
   * Move to node
   * Note, this is equivalent to the other <code>moveToNodeJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToNodeJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToNodeJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToNodeJunctionBoxFistResponse moveToNodeJunctionBoxFist(@Param("elid") String elid, MoveToNodeJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToNodeJunctionBoxFistQueryParams queryParams);

  /**
  * Move to node
  * Move to node
  * Note, this is equivalent to the other <code>moveToNodeJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToNodeJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToNodeJunctionBoxFistResponse> moveToNodeJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveToNodeJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToNodeJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToNodeJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveToNodeJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveToNodeJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseJunctionBoxFistResponse moveToWarehouseJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseJunctionBoxFistRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseJunctionBoxFist</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseJunctionBoxFistResponse> moveToWarehouseJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseJunctionBoxFistRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseJunctionBoxFistResponse moveToWarehouseJunctionBoxFist(@Param("elid") String elid, MoveToWarehouseJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToWarehouseJunctionBoxFistQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseJunctionBoxFistResponse> moveToWarehouseJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveToWarehouseJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToWarehouseJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveToWarehouseJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return MoveToZoneJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneJunctionBoxFistResponse moveToZoneJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneJunctionBoxFistRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneJunctionBoxFist</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneJunctionBoxFistResponse> moveToZoneJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneJunctionBoxFistRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneJunctionBoxFistResponse moveToZoneJunctionBoxFist(@Param("elid") String elid, MoveToZoneJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToZoneJunctionBoxFistQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneJunctionBoxFistResponse> moveToZoneJunctionBoxFistWithHttpInfo(@Param("elid") String elid, MoveToZoneJunctionBoxFistRequestData body, @QueryMap(encoded=true) MoveToZoneJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneJunctionBoxFist</code> method in a fluent style.
   */
  public static class MoveToZoneJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public MoveToZoneJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Add splice cassette
   * Add splice cassette
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PlaceCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceCassetteJunctionBoxFistResponse placeCassetteJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, PlaceCassetteJunctionBoxFistRequestData body);

  /**
   * Add splice cassette
   * Similar to <code>placeCassetteJunctionBoxFist</code> but it also returns the http response headers .
   * Add splice cassette
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceCassetteJunctionBoxFistResponse> placeCassetteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PlaceCassetteJunctionBoxFistRequestData body);


  /**
   * Add splice cassette
   * Add splice cassette
   * Note, this is equivalent to the other <code>placeCassetteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceCassetteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeCassette?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceCassetteJunctionBoxFistResponse placeCassetteJunctionBoxFist(@Param("elid") String elid, PlaceCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceCassetteJunctionBoxFistQueryParams queryParams);

  /**
  * Add splice cassette
  * Add splice cassette
  * Note, this is equivalent to the other <code>placeCassetteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceCassetteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeCassette?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceCassetteJunctionBoxFistResponse> placeCassetteJunctionBoxFistWithHttpInfo(@Param("elid") String elid, PlaceCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceCassetteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeCassetteJunctionBoxFist</code> method in a fluent style.
   */
  public static class PlaceCassetteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public PlaceCassetteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetJunctionBoxFistResponse placeInCabinetJunctionBoxFist(@Param("sessionId") String sessionId, PlaceInCabinetJunctionBoxFistRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetJunctionBoxFist</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetJunctionBoxFistResponse> placeInCabinetJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetJunctionBoxFistRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetJunctionBoxFistResponse placeInCabinetJunctionBoxFist(PlaceInCabinetJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInCabinetJunctionBoxFistQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetJunctionBoxFistResponse> placeInCabinetJunctionBoxFistWithHttpInfo(PlaceInCabinetJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInCabinetJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetJunctionBoxFist</code> method in a fluent style.
   */
  public static class PlaceInCabinetJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in node
   * Place in node
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInNodeJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInNodeJunctionBoxFistResponse placeInNodeJunctionBoxFist(@Param("sessionId") String sessionId, PlaceInNodeJunctionBoxFistRequestData body);

  /**
   * Place in node
   * Similar to <code>placeInNodeJunctionBoxFist</code> but it also returns the http response headers .
   * Place in node
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInNodeJunctionBoxFistResponse> placeInNodeJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, PlaceInNodeJunctionBoxFistRequestData body);


  /**
   * Place in node
   * Place in node
   * Note, this is equivalent to the other <code>placeInNodeJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInNodeJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInNodeJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInNodeJunctionBoxFistResponse placeInNodeJunctionBoxFist(PlaceInNodeJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInNodeJunctionBoxFistQueryParams queryParams);

  /**
  * Place in node
  * Place in node
  * Note, this is equivalent to the other <code>placeInNodeJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInNodeJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInNodeJunctionBoxFistResponse> placeInNodeJunctionBoxFistWithHttpInfo(PlaceInNodeJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInNodeJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInNodeJunctionBoxFist</code> method in a fluent style.
   */
  public static class PlaceInNodeJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public PlaceInNodeJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseJunctionBoxFistResponse placeInWarehouseJunctionBoxFist(@Param("sessionId") String sessionId, PlaceInWarehouseJunctionBoxFistRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseJunctionBoxFist</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseJunctionBoxFistResponse> placeInWarehouseJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseJunctionBoxFistRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseJunctionBoxFistResponse placeInWarehouseJunctionBoxFist(PlaceInWarehouseJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInWarehouseJunctionBoxFistQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseJunctionBoxFistResponse> placeInWarehouseJunctionBoxFistWithHttpInfo(PlaceInWarehouseJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInWarehouseJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseJunctionBoxFist</code> method in a fluent style.
   */
  public static class PlaceInWarehouseJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneJunctionBoxFistResponse placeInZoneJunctionBoxFist(@Param("sessionId") String sessionId, PlaceInZoneJunctionBoxFistRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneJunctionBoxFist</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneJunctionBoxFistResponse> placeInZoneJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneJunctionBoxFistRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneJunctionBoxFistResponse placeInZoneJunctionBoxFist(PlaceInZoneJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInZoneJunctionBoxFistQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneJunctionBoxFistResponse> placeInZoneJunctionBoxFistWithHttpInfo(PlaceInZoneJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceInZoneJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneJunctionBoxFist</code> method in a fluent style.
   */
  public static class PlaceInZoneJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public PlaceInZoneJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place splitter
   * Place splitter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PlaceSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceSplitterJunctionBoxFistResponse placeSplitterJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, PlaceSplitterJunctionBoxFistRequestData body);

  /**
   * Place splitter
   * Similar to <code>placeSplitterJunctionBoxFist</code> but it also returns the http response headers .
   * Place splitter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceSplitterJunctionBoxFistResponse> placeSplitterJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PlaceSplitterJunctionBoxFistRequestData body);


  /**
   * Place splitter
   * Place splitter
   * Note, this is equivalent to the other <code>placeSplitterJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceSplitterJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeSplitter?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceSplitterJunctionBoxFistResponse placeSplitterJunctionBoxFist(@Param("elid") String elid, PlaceSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceSplitterJunctionBoxFistQueryParams queryParams);

  /**
  * Place splitter
  * Place splitter
  * Note, this is equivalent to the other <code>placeSplitterJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceSplitterJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/placeSplitter?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceSplitterJunctionBoxFistResponse> placeSplitterJunctionBoxFistWithHttpInfo(@Param("elid") String elid, PlaceSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) PlaceSplitterJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeSplitterJunctionBoxFist</code> method in a fluent style.
   */
  public static class PlaceSplitterJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public PlaceSplitterJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove cable from junction box
   * Remove cable from junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RemoveCableJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveCableJunctionBoxFistResponse removeCableJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveCableJunctionBoxFistRequestData body);

  /**
   * Remove cable from junction box
   * Similar to <code>removeCableJunctionBoxFist</code> but it also returns the http response headers .
   * Remove cable from junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveCableJunctionBoxFistResponse> removeCableJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveCableJunctionBoxFistRequestData body);


  /**
   * Remove cable from junction box
   * Remove cable from junction box
   * Note, this is equivalent to the other <code>removeCableJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveCableJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveCableJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveCableJunctionBoxFistResponse removeCableJunctionBoxFist(@Param("elid") String elid, RemoveCableJunctionBoxFistRequestData body, @QueryMap(encoded=true) RemoveCableJunctionBoxFistQueryParams queryParams);

  /**
  * Remove cable from junction box
  * Remove cable from junction box
  * Note, this is equivalent to the other <code>removeCableJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveCableJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveCableJunctionBoxFistResponse> removeCableJunctionBoxFistWithHttpInfo(@Param("elid") String elid, RemoveCableJunctionBoxFistRequestData body, @QueryMap(encoded=true) RemoveCableJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeCableJunctionBoxFist</code> method in a fluent style.
   */
  public static class RemoveCableJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public RemoveCableJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove fibers
   * Remove fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RemoveFiberFromCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeFiberFromCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveFiberFromCassetteJunctionBoxFistResponse removeFiberFromCassetteJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveFiberFromCassetteJunctionBoxFistRequestData body);

  /**
   * Remove fibers
   * Similar to <code>removeFiberFromCassetteJunctionBoxFist</code> but it also returns the http response headers .
   * Remove fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeFiberFromCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveFiberFromCassetteJunctionBoxFistResponse> removeFiberFromCassetteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveFiberFromCassetteJunctionBoxFistRequestData body);


  /**
   * Remove fibers
   * Remove fibers
   * Note, this is equivalent to the other <code>removeFiberFromCassetteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveFiberFromCassetteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveFiberFromCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeFiberFromCassette?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveFiberFromCassetteJunctionBoxFistResponse removeFiberFromCassetteJunctionBoxFist(@Param("elid") String elid, RemoveFiberFromCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) RemoveFiberFromCassetteJunctionBoxFistQueryParams queryParams);

  /**
  * Remove fibers
  * Remove fibers
  * Note, this is equivalent to the other <code>removeFiberFromCassetteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveFiberFromCassetteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/removeFiberFromCassette?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveFiberFromCassetteJunctionBoxFistResponse> removeFiberFromCassetteJunctionBoxFistWithHttpInfo(@Param("elid") String elid, RemoveFiberFromCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) RemoveFiberFromCassetteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeFiberFromCassetteJunctionBoxFist</code> method in a fluent style.
   */
  public static class RemoveFiberFromCassetteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public RemoveFiberFromCassetteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Splice fibers 1:1
   * Splice fibers 1:1
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SpliceFiber1To1JunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFiber1To1?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpliceFiber1To1JunctionBoxFistResponse spliceFiber1To1JunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceFiber1To1JunctionBoxFistRequestData body);

  /**
   * Splice fibers 1:1
   * Similar to <code>spliceFiber1To1JunctionBoxFist</code> but it also returns the http response headers .
   * Splice fibers 1:1
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFiber1To1?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpliceFiber1To1JunctionBoxFistResponse> spliceFiber1To1JunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceFiber1To1JunctionBoxFistRequestData body);


  /**
   * Splice fibers 1:1
   * Splice fibers 1:1
   * Note, this is equivalent to the other <code>spliceFiber1To1JunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SpliceFiber1To1JunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SpliceFiber1To1JunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFiber1To1?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SpliceFiber1To1JunctionBoxFistResponse spliceFiber1To1JunctionBoxFist(@Param("elid") String elid, SpliceFiber1To1JunctionBoxFistRequestData body, @QueryMap(encoded=true) SpliceFiber1To1JunctionBoxFistQueryParams queryParams);

  /**
  * Splice fibers 1:1
  * Splice fibers 1:1
  * Note, this is equivalent to the other <code>spliceFiber1To1JunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SpliceFiber1To1JunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFiber1To1?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SpliceFiber1To1JunctionBoxFistResponse> spliceFiber1To1JunctionBoxFistWithHttpInfo(@Param("elid") String elid, SpliceFiber1To1JunctionBoxFistRequestData body, @QueryMap(encoded=true) SpliceFiber1To1JunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>spliceFiber1To1JunctionBoxFist</code> method in a fluent style.
   */
  public static class SpliceFiber1To1JunctionBoxFistQueryParams extends HashMap<String, Object> {
    public SpliceFiber1To1JunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Splice fibers
   * Splice fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SpliceFibersJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpliceFibersJunctionBoxFistResponse spliceFibersJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceFibersJunctionBoxFistRequestData body);

  /**
   * Splice fibers
   * Similar to <code>spliceFibersJunctionBoxFist</code> but it also returns the http response headers .
   * Splice fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpliceFibersJunctionBoxFistResponse> spliceFibersJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceFibersJunctionBoxFistRequestData body);


  /**
   * Splice fibers
   * Splice fibers
   * Note, this is equivalent to the other <code>spliceFibersJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SpliceFibersJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SpliceFibersJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFibers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SpliceFibersJunctionBoxFistResponse spliceFibersJunctionBoxFist(@Param("elid") String elid, SpliceFibersJunctionBoxFistRequestData body, @QueryMap(encoded=true) SpliceFibersJunctionBoxFistQueryParams queryParams);

  /**
  * Splice fibers
  * Splice fibers
  * Note, this is equivalent to the other <code>spliceFibersJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SpliceFibersJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceFibers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SpliceFibersJunctionBoxFistResponse> spliceFibersJunctionBoxFistWithHttpInfo(@Param("elid") String elid, SpliceFibersJunctionBoxFistRequestData body, @QueryMap(encoded=true) SpliceFibersJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>spliceFibersJunctionBoxFist</code> method in a fluent style.
   */
  public static class SpliceFibersJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public SpliceFibersJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Splice splitter
   * Splice splitter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SpliceSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpliceSplitterJunctionBoxFistResponse spliceSplitterJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceSplitterJunctionBoxFistRequestData body);

  /**
   * Splice splitter
   * Similar to <code>spliceSplitterJunctionBoxFist</code> but it also returns the http response headers .
   * Splice splitter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceSplitter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpliceSplitterJunctionBoxFistResponse> spliceSplitterJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceSplitterJunctionBoxFistRequestData body);


  /**
   * Splice splitter
   * Splice splitter
   * Note, this is equivalent to the other <code>spliceSplitterJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SpliceSplitterJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SpliceSplitterJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceSplitter?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SpliceSplitterJunctionBoxFistResponse spliceSplitterJunctionBoxFist(@Param("elid") String elid, SpliceSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) SpliceSplitterJunctionBoxFistQueryParams queryParams);

  /**
  * Splice splitter
  * Splice splitter
  * Note, this is equivalent to the other <code>spliceSplitterJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SpliceSplitterJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/spliceSplitter?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SpliceSplitterJunctionBoxFistResponse> spliceSplitterJunctionBoxFistWithHttpInfo(@Param("elid") String elid, SpliceSplitterJunctionBoxFistRequestData body, @QueryMap(encoded=true) SpliceSplitterJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>spliceSplitterJunctionBoxFist</code> method in a fluent style.
   */
  public static class SpliceSplitterJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public SpliceSplitterJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change cassette
   * Change cassette
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UpdateCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/updateCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCassetteJunctionBoxFistResponse updateCassetteJunctionBoxFist(@Param("sessionId") String sessionId, UpdateCassetteJunctionBoxFistRequestData body);

  /**
   * Change cassette
   * Similar to <code>updateCassetteJunctionBoxFist</code> but it also returns the http response headers .
   * Change cassette
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/updateCassette?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCassetteJunctionBoxFistResponse> updateCassetteJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, UpdateCassetteJunctionBoxFistRequestData body);


  /**
   * Change cassette
   * Change cassette
   * Note, this is equivalent to the other <code>updateCassetteJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCassetteJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCassetteJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/updateCassette?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCassetteJunctionBoxFistResponse updateCassetteJunctionBoxFist(UpdateCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) UpdateCassetteJunctionBoxFistQueryParams queryParams);

  /**
  * Change cassette
  * Change cassette
  * Note, this is equivalent to the other <code>updateCassetteJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCassetteJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/updateCassette?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCassetteJunctionBoxFistResponse> updateCassetteJunctionBoxFistWithHttpInfo(UpdateCassetteJunctionBoxFistRequestData body, @QueryMap(encoded=true) UpdateCassetteJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCassetteJunctionBoxFist</code> method in a fluent style.
   */
  public static class UpdateCassetteJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public UpdateCassetteJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateJunctionBoxFistResponse updateJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateJunctionBoxFistRequestData body);

  /**
   * Modify
   * Similar to <code>updateJunctionBoxFist</code> but it also returns the http response headers .
   * Modify Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateJunctionBoxFistResponse> updateJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateJunctionBoxFistRequestData body);


  /**
   * Modify
   * Modify Junction box
   * Note, this is equivalent to the other <code>updateJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateJunctionBoxFistResponse updateJunctionBoxFist(@Param("elid") String elid, UpdateJunctionBoxFistRequestData body, @QueryMap(encoded=true) UpdateJunctionBoxFistQueryParams queryParams);

  /**
  * Modify
  * Modify Junction box
  * Note, this is equivalent to the other <code>updateJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateJunctionBoxFistResponse> updateJunctionBoxFistWithHttpInfo(@Param("elid") String elid, UpdateJunctionBoxFistRequestData body, @QueryMap(encoded=true) UpdateJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateJunctionBoxFist</code> method in a fluent style.
   */
  public static class UpdateJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public UpdateJunctionBoxFistQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesJunctionBoxFistResponse updateSystemAttributesJunctionBoxFist(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesJunctionBoxFistRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesJunctionBoxFist</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesJunctionBoxFistResponse> updateSystemAttributesJunctionBoxFistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesJunctionBoxFistRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesJunctionBoxFist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesJunctionBoxFistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesJunctionBoxFistResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesJunctionBoxFistResponse updateSystemAttributesJunctionBoxFist(@Param("elid") String elid, UpdateSystemAttributesJunctionBoxFistRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesJunctionBoxFistQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesJunctionBoxFist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesJunctionBoxFistResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBoxFist/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesJunctionBoxFistResponse> updateSystemAttributesJunctionBoxFistWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesJunctionBoxFistRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesJunctionBoxFistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesJunctionBoxFist</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesJunctionBoxFistQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesJunctionBoxFistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
