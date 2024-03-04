package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BreakSplicesJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.BreakSplicesJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.ChangeTypeJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.ConnectJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.ConnectJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.CutFibersJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.CutFibersJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.DeleteJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.DeleteJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.DisconnectJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.DisconnectJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxContractsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxContractsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxDeviceMasterJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxDeviceMasterJunctionBoxResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxDuctDataRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxDuctDataResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxDuctsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxDuctsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxLocationRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxLocationResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxNodeRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxNodeResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxPersonsRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxPersonsResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxQueryResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxServicesRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxServicesResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxSitesRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxSitesResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.JunctionBoxSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.JunctionBoxWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.JunctionBoxZoneRequestData;
import com.fntsoftware.businessgateway.entities.JunctionBoxZoneResponseData;
import com.fntsoftware.businessgateway.entities.LoopInCableJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.LoopInCableJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.ModifyConnectionJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.ModifyConnectionJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.MoveConnectionJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.MoveConnectionJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.MoveToNodeJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.MoveToNodeJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.PlaceInNodeJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInNodeJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.RemoveCableJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.RemoveCableJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.SpliceFibersJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.SpliceFibersJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.UpdateJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.UpdateJunctionBoxResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesJunctionBoxRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesJunctionBoxResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface JunctionBoxApi extends ApiClient.Api {


  /**
   * Break splices
   * Break splices
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BreakSplicesJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/breakSplices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BreakSplicesJunctionBoxResponse breakSplicesJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, BreakSplicesJunctionBoxRequestData body);

  /**
   * Break splices
   * Similar to <code>breakSplicesJunctionBox</code> but it also returns the http response headers .
   * Break splices
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/breakSplices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BreakSplicesJunctionBoxResponse> breakSplicesJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BreakSplicesJunctionBoxRequestData body);


  /**
   * Break splices
   * Break splices
   * Note, this is equivalent to the other <code>breakSplicesJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BreakSplicesJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BreakSplicesJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/breakSplices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BreakSplicesJunctionBoxResponse breakSplicesJunctionBox(@Param("elid") String elid, BreakSplicesJunctionBoxRequestData body, @QueryMap(encoded=true) BreakSplicesJunctionBoxQueryParams queryParams);

  /**
  * Break splices
  * Break splices
  * Note, this is equivalent to the other <code>breakSplicesJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BreakSplicesJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/breakSplices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BreakSplicesJunctionBoxResponse> breakSplicesJunctionBoxWithHttpInfo(@Param("elid") String elid, BreakSplicesJunctionBoxRequestData body, @QueryMap(encoded=true) BreakSplicesJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>breakSplicesJunctionBox</code> method in a fluent style.
   */
  public static class BreakSplicesJunctionBoxQueryParams extends HashMap<String, Object> {
    public BreakSplicesJunctionBoxQueryParams sessionId(final String value) {
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
   * @return ChangeTypeJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeJunctionBoxResponse changeTypeJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeJunctionBoxRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeJunctionBox</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeJunctionBoxResponse> changeTypeJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeJunctionBoxRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeJunctionBoxResponse changeTypeJunctionBox(@Param("elid") String elid, ChangeTypeJunctionBoxRequestData body, @QueryMap(encoded=true) ChangeTypeJunctionBoxQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeJunctionBoxResponse> changeTypeJunctionBoxWithHttpInfo(@Param("elid") String elid, ChangeTypeJunctionBoxRequestData body, @QueryMap(encoded=true) ChangeTypeJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeJunctionBox</code> method in a fluent style.
   */
  public static class ChangeTypeJunctionBoxQueryParams extends HashMap<String, Object> {
    public ChangeTypeJunctionBoxQueryParams sessionId(final String value) {
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
   * @return ConnectJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConnectJunctionBoxResponse connectJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, ConnectJunctionBoxRequestData body);

  /**
   * Connect
   * Similar to <code>connectJunctionBox</code> but it also returns the http response headers .
   * Connect
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/connect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConnectJunctionBoxResponse> connectJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConnectJunctionBoxRequestData body);


  /**
   * Connect
   * Connect
   * Note, this is equivalent to the other <code>connectJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConnectJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConnectJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/connect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConnectJunctionBoxResponse connectJunctionBox(@Param("elid") String elid, ConnectJunctionBoxRequestData body, @QueryMap(encoded=true) ConnectJunctionBoxQueryParams queryParams);

  /**
  * Connect
  * Connect
  * Note, this is equivalent to the other <code>connectJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConnectJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/connect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConnectJunctionBoxResponse> connectJunctionBoxWithHttpInfo(@Param("elid") String elid, ConnectJunctionBoxRequestData body, @QueryMap(encoded=true) ConnectJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>connectJunctionBox</code> method in a fluent style.
   */
  public static class ConnectJunctionBoxQueryParams extends HashMap<String, Object> {
    public ConnectJunctionBoxQueryParams sessionId(final String value) {
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
   * @return CutFibersJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/cutFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CutFibersJunctionBoxResponse cutFibersJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, CutFibersJunctionBoxRequestData body);

  /**
   * Cut fibers
   * Similar to <code>cutFibersJunctionBox</code> but it also returns the http response headers .
   * Cut fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/cutFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CutFibersJunctionBoxResponse> cutFibersJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CutFibersJunctionBoxRequestData body);


  /**
   * Cut fibers
   * Cut fibers
   * Note, this is equivalent to the other <code>cutFibersJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CutFibersJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CutFibersJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/cutFibers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CutFibersJunctionBoxResponse cutFibersJunctionBox(@Param("elid") String elid, CutFibersJunctionBoxRequestData body, @QueryMap(encoded=true) CutFibersJunctionBoxQueryParams queryParams);

  /**
  * Cut fibers
  * Cut fibers
  * Note, this is equivalent to the other <code>cutFibersJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CutFibersJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/cutFibers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CutFibersJunctionBoxResponse> cutFibersJunctionBoxWithHttpInfo(@Param("elid") String elid, CutFibersJunctionBoxRequestData body, @QueryMap(encoded=true) CutFibersJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cutFibersJunctionBox</code> method in a fluent style.
   */
  public static class CutFibersJunctionBoxQueryParams extends HashMap<String, Object> {
    public CutFibersJunctionBoxQueryParams sessionId(final String value) {
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
   * @return DeleteJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteJunctionBoxResponse deleteJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteJunctionBoxRequestData body);

  /**
   * Delete
   * Similar to <code>deleteJunctionBox</code> but it also returns the http response headers .
   * Delete Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteJunctionBoxResponse> deleteJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteJunctionBoxRequestData body);


  /**
   * Delete
   * Delete Junction box
   * Note, this is equivalent to the other <code>deleteJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteJunctionBoxResponse deleteJunctionBox(@Param("elid") String elid, DeleteJunctionBoxRequestData body, @QueryMap(encoded=true) DeleteJunctionBoxQueryParams queryParams);

  /**
  * Delete
  * Delete Junction box
  * Note, this is equivalent to the other <code>deleteJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteJunctionBoxResponse> deleteJunctionBoxWithHttpInfo(@Param("elid") String elid, DeleteJunctionBoxRequestData body, @QueryMap(encoded=true) DeleteJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteJunctionBox</code> method in a fluent style.
   */
  public static class DeleteJunctionBoxQueryParams extends HashMap<String, Object> {
    public DeleteJunctionBoxQueryParams sessionId(final String value) {
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
   * @return DisconnectJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/disconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DisconnectJunctionBoxResponse disconnectJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, DisconnectJunctionBoxRequestData body);

  /**
   * Delete connection
   * Similar to <code>disconnectJunctionBox</code> but it also returns the http response headers .
   * Delete connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/disconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DisconnectJunctionBoxResponse> disconnectJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DisconnectJunctionBoxRequestData body);


  /**
   * Delete connection
   * Delete connection
   * Note, this is equivalent to the other <code>disconnectJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DisconnectJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DisconnectJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/disconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DisconnectJunctionBoxResponse disconnectJunctionBox(@Param("elid") String elid, DisconnectJunctionBoxRequestData body, @QueryMap(encoded=true) DisconnectJunctionBoxQueryParams queryParams);

  /**
  * Delete connection
  * Delete connection
  * Note, this is equivalent to the other <code>disconnectJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DisconnectJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/disconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DisconnectJunctionBoxResponse> disconnectJunctionBoxWithHttpInfo(@Param("elid") String elid, DisconnectJunctionBoxRequestData body, @QueryMap(encoded=true) DisconnectJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>disconnectJunctionBox</code> method in a fluent style.
   */
  public static class DisconnectJunctionBoxQueryParams extends HashMap<String, Object> {
    public DisconnectJunctionBoxQueryParams sessionId(final String value) {
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
   * @return JunctionBoxContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxContractsResponseData junctionBoxContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>junctionBoxContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxContractsResponseData> junctionBoxContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxContractsResponseData junctionBoxContracts(@Param("elid") String elid, JunctionBoxContractsRequestData body, @QueryMap(encoded=true) JunctionBoxContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxContractsResponseData> junctionBoxContractsWithHttpInfo(@Param("elid") String elid, JunctionBoxContractsRequestData body, @QueryMap(encoded=true) JunctionBoxContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxContracts</code> method in a fluent style.
   */
  public static class JunctionBoxContractsQueryParams extends HashMap<String, Object> {
    public JunctionBoxContractsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxDataCablesResponseData junctionBoxDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>junctionBoxDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxDataCablesResponseData> junctionBoxDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxDataCablesResponseData junctionBoxDataCables(@Param("elid") String elid, JunctionBoxDataCablesRequestData body, @QueryMap(encoded=true) JunctionBoxDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxDataCablesResponseData> junctionBoxDataCablesWithHttpInfo(@Param("elid") String elid, JunctionBoxDataCablesRequestData body, @QueryMap(encoded=true) JunctionBoxDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxDataCables</code> method in a fluent style.
   */
  public static class JunctionBoxDataCablesQueryParams extends HashMap<String, Object> {
    public JunctionBoxDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master junction box entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return JunctionBoxDeviceMasterJunctionBoxResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DeviceMasterJunctionBox?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxDeviceMasterJunctionBoxResponseData junctionBoxDeviceMasterJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDeviceMasterJunctionBoxRequestData body);

  /**
   * Get relations to Device master junction box entities
   * Similar to <code>junctionBoxDeviceMasterJunctionBox</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DeviceMasterJunctionBox?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxDeviceMasterJunctionBoxResponseData> junctionBoxDeviceMasterJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDeviceMasterJunctionBoxRequestData body);


  /**
   * Get relations to Device master junction box entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxDeviceMasterJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxDeviceMasterJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxDeviceMasterJunctionBoxResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DeviceMasterJunctionBox?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxDeviceMasterJunctionBoxResponseData junctionBoxDeviceMasterJunctionBox(@Param("elid") String elid, JunctionBoxDeviceMasterJunctionBoxRequestData body, @QueryMap(encoded=true) JunctionBoxDeviceMasterJunctionBoxQueryParams queryParams);

  /**
  * Get relations to Device master junction box entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxDeviceMasterJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxDeviceMasterJunctionBoxResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DeviceMasterJunctionBox?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxDeviceMasterJunctionBoxResponseData> junctionBoxDeviceMasterJunctionBoxWithHttpInfo(@Param("elid") String elid, JunctionBoxDeviceMasterJunctionBoxRequestData body, @QueryMap(encoded=true) JunctionBoxDeviceMasterJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxDeviceMasterJunctionBox</code> method in a fluent style.
   */
  public static class JunctionBoxDeviceMasterJunctionBoxQueryParams extends HashMap<String, Object> {
    public JunctionBoxDeviceMasterJunctionBoxQueryParams sessionId(final String value) {
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
   * @return JunctionBoxDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxDuctDataResponse junctionBoxDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>junctionBoxDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxDuctDataResponse> junctionBoxDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>junctionBoxDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxDuctDataResponse junctionBoxDuctData(@Param("elid") String elid, JunctionBoxDuctDataRequest body, @QueryMap(encoded=true) JunctionBoxDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>junctionBoxDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxDuctDataResponse> junctionBoxDuctDataWithHttpInfo(@Param("elid") String elid, JunctionBoxDuctDataRequest body, @QueryMap(encoded=true) JunctionBoxDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxDuctData</code> method in a fluent style.
   */
  public static class JunctionBoxDuctDataQueryParams extends HashMap<String, Object> {
    public JunctionBoxDuctDataQueryParams sessionId(final String value) {
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
   * @return JunctionBoxDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxDuctsResponseData junctionBoxDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>junctionBoxDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxDuctsResponseData> junctionBoxDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxDuctsResponseData junctionBoxDucts(@Param("elid") String elid, JunctionBoxDuctsRequestData body, @QueryMap(encoded=true) JunctionBoxDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxDuctsResponseData> junctionBoxDuctsWithHttpInfo(@Param("elid") String elid, JunctionBoxDuctsRequestData body, @QueryMap(encoded=true) JunctionBoxDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxDucts</code> method in a fluent style.
   */
  public static class JunctionBoxDuctsQueryParams extends HashMap<String, Object> {
    public JunctionBoxDuctsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxFrameContractsResponseData junctionBoxFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>junctionBoxFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxFrameContractsResponseData> junctionBoxFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxFrameContractsResponseData junctionBoxFrameContracts(@Param("elid") String elid, JunctionBoxFrameContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxFrameContractsResponseData> junctionBoxFrameContractsWithHttpInfo(@Param("elid") String elid, JunctionBoxFrameContractsRequestData body, @QueryMap(encoded=true) JunctionBoxFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxFrameContracts</code> method in a fluent style.
   */
  public static class JunctionBoxFrameContractsQueryParams extends HashMap<String, Object> {
    public JunctionBoxFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxInheritedGeoCoordinatesResponse junctionBoxInheritedGeoCoordinates(@Param("sessionId") String sessionId, JunctionBoxInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>junctionBoxInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxInheritedGeoCoordinatesResponse> junctionBoxInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>junctionBoxInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxInheritedGeoCoordinatesResponse junctionBoxInheritedGeoCoordinates(JunctionBoxInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) JunctionBoxInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>junctionBoxInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxInheritedGeoCoordinatesResponse> junctionBoxInheritedGeoCoordinatesWithHttpInfo(JunctionBoxInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) JunctionBoxInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class JunctionBoxInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public JunctionBoxInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return JunctionBoxLocationResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxLocationResponse junctionBoxLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxLocationRequest body);

  /**
   * Location
   * Similar to <code>junctionBoxLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxLocationResponse> junctionBoxLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>junctionBoxLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxLocationResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxLocationResponse junctionBoxLocation(@Param("elid") String elid, JunctionBoxLocationRequest body, @QueryMap(encoded=true) JunctionBoxLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>junctionBoxLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxLocationResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxLocationResponse> junctionBoxLocationWithHttpInfo(@Param("elid") String elid, JunctionBoxLocationRequest body, @QueryMap(encoded=true) JunctionBoxLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxLocation</code> method in a fluent style.
   */
  public static class JunctionBoxLocationQueryParams extends HashMap<String, Object> {
    public JunctionBoxLocationQueryParams sessionId(final String value) {
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
   * @return JunctionBoxMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxMaintenanceContractsResponseData junctionBoxMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>junctionBoxMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxMaintenanceContractsResponseData> junctionBoxMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxMaintenanceContractsResponseData junctionBoxMaintenanceContracts(@Param("elid") String elid, JunctionBoxMaintenanceContractsRequestData body, @QueryMap(encoded=true) JunctionBoxMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxMaintenanceContractsResponseData> junctionBoxMaintenanceContractsWithHttpInfo(@Param("elid") String elid, JunctionBoxMaintenanceContractsRequestData body, @QueryMap(encoded=true) JunctionBoxMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxMaintenanceContracts</code> method in a fluent style.
   */
  public static class JunctionBoxMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public JunctionBoxMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxMultiDuctsResponseData junctionBoxMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>junctionBoxMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxMultiDuctsResponseData> junctionBoxMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxMultiDuctsResponseData junctionBoxMultiDucts(@Param("elid") String elid, JunctionBoxMultiDuctsRequestData body, @QueryMap(encoded=true) JunctionBoxMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxMultiDuctsResponseData> junctionBoxMultiDuctsWithHttpInfo(@Param("elid") String elid, JunctionBoxMultiDuctsRequestData body, @QueryMap(encoded=true) JunctionBoxMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxMultiDucts</code> method in a fluent style.
   */
  public static class JunctionBoxMultiDuctsQueryParams extends HashMap<String, Object> {
    public JunctionBoxMultiDuctsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Node?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxNodeResponseData junctionBoxNode(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>junctionBoxNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Node?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxNodeResponseData> junctionBoxNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Node?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxNodeResponseData junctionBoxNode(@Param("elid") String elid, JunctionBoxNodeRequestData body, @QueryMap(encoded=true) JunctionBoxNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Node?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxNodeResponseData> junctionBoxNodeWithHttpInfo(@Param("elid") String elid, JunctionBoxNodeRequestData body, @QueryMap(encoded=true) JunctionBoxNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxNode</code> method in a fluent style.
   */
  public static class JunctionBoxNodeQueryParams extends HashMap<String, Object> {
    public JunctionBoxNodeQueryParams sessionId(final String value) {
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
   * @return JunctionBoxOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxOperatingSystemInstallationResponseData junctionBoxOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>junctionBoxOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxOperatingSystemInstallationResponseData> junctionBoxOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxOperatingSystemInstallationResponseData junctionBoxOperatingSystemInstallation(@Param("elid") String elid, JunctionBoxOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) JunctionBoxOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxOperatingSystemInstallationResponseData> junctionBoxOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, JunctionBoxOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) JunctionBoxOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class JunctionBoxOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public JunctionBoxOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return JunctionBoxOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxOrganizationsResponseData junctionBoxOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>junctionBoxOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxOrganizationsResponseData> junctionBoxOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxOrganizationsResponseData junctionBoxOrganizations(@Param("elid") String elid, JunctionBoxOrganizationsRequestData body, @QueryMap(encoded=true) JunctionBoxOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxOrganizationsResponseData> junctionBoxOrganizationsWithHttpInfo(@Param("elid") String elid, JunctionBoxOrganizationsRequestData body, @QueryMap(encoded=true) JunctionBoxOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxOrganizations</code> method in a fluent style.
   */
  public static class JunctionBoxOrganizationsQueryParams extends HashMap<String, Object> {
    public JunctionBoxOrganizationsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxPersonGroupsResponseData junctionBoxPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>junctionBoxPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxPersonGroupsResponseData> junctionBoxPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxPersonGroupsResponseData junctionBoxPersonGroups(@Param("elid") String elid, JunctionBoxPersonGroupsRequestData body, @QueryMap(encoded=true) JunctionBoxPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxPersonGroupsResponseData> junctionBoxPersonGroupsWithHttpInfo(@Param("elid") String elid, JunctionBoxPersonGroupsRequestData body, @QueryMap(encoded=true) JunctionBoxPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxPersonGroups</code> method in a fluent style.
   */
  public static class JunctionBoxPersonGroupsQueryParams extends HashMap<String, Object> {
    public JunctionBoxPersonGroupsQueryParams sessionId(final String value) {
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
   * @return JunctionBoxPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxPersonsResponseData junctionBoxPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>junctionBoxPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxPersonsResponseData> junctionBoxPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxPersonsResponseData junctionBoxPersons(@Param("elid") String elid, JunctionBoxPersonsRequestData body, @QueryMap(encoded=true) JunctionBoxPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxPersonsResponseData> junctionBoxPersonsWithHttpInfo(@Param("elid") String elid, JunctionBoxPersonsRequestData body, @QueryMap(encoded=true) JunctionBoxPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxPersons</code> method in a fluent style.
   */
  public static class JunctionBoxPersonsQueryParams extends HashMap<String, Object> {
    public JunctionBoxPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxQueryResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxQueryResponse junctionBoxQuery(@Param("sessionId") String sessionId, JunctionBoxQueryRequest body);

  /**
   * Basic query
   * Similar to <code>junctionBoxQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxQueryResponse> junctionBoxQueryWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>junctionBoxQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxQueryResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxQueryResponse junctionBoxQuery(JunctionBoxQueryRequest body, @QueryMap(encoded=true) JunctionBoxQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>junctionBoxQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxQueryResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxQueryResponse> junctionBoxQueryWithHttpInfo(JunctionBoxQueryRequest body, @QueryMap(encoded=true) JunctionBoxQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxQuery</code> method in a fluent style.
   */
  public static class JunctionBoxQueryQueryParams extends HashMap<String, Object> {
    public JunctionBoxQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxQueryExtendedResponse junctionBoxQueryExtended(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>junctionBoxQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxQueryExtendedResponse> junctionBoxQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data.
   * Note, this is equivalent to the other <code>junctionBoxQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxQueryExtendedResponse junctionBoxQueryExtended(JunctionBoxQueryExtendedRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data.
  * Note, this is equivalent to the other <code>junctionBoxQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxQueryExtendedResponse> junctionBoxQueryExtendedWithHttpInfo(JunctionBoxQueryExtendedRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxQueryExtended</code> method in a fluent style.
   */
  public static class JunctionBoxQueryExtendedQueryParams extends HashMap<String, Object> {
    public JunctionBoxQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxQueryExtendedGeoCoordinatesResponse junctionBoxQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>junctionBoxQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxQueryExtendedGeoCoordinatesResponse> junctionBoxQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>junctionBoxQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxQueryExtendedGeoCoordinatesResponse junctionBoxQueryExtendedGeoCoordinates(JunctionBoxQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>junctionBoxQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxQueryExtendedGeoCoordinatesResponse> junctionBoxQueryExtendedGeoCoordinatesWithHttpInfo(JunctionBoxQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class JunctionBoxQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public JunctionBoxQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxQueryExtendedScrollFirstResponse junctionBoxQueryExtendedScrollFirst(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>junctionBoxQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxQueryExtendedScrollFirstResponse> junctionBoxQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>junctionBoxQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxQueryExtendedScrollFirstResponse junctionBoxQueryExtendedScrollFirst(JunctionBoxQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>junctionBoxQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxQueryExtendedScrollFirstResponse> junctionBoxQueryExtendedScrollFirstWithHttpInfo(JunctionBoxQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class JunctionBoxQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public JunctionBoxQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JunctionBoxQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxQueryExtendedScrollMoreResponse junctionBoxQueryExtendedScrollMore(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>junctionBoxQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxQueryExtendedScrollMoreResponse> junctionBoxQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, JunctionBoxQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>junctionBoxQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxQueryExtendedScrollMoreResponse junctionBoxQueryExtendedScrollMore(JunctionBoxQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>junctionBoxQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxQueryExtendedScrollMoreResponse> junctionBoxQueryExtendedScrollMoreWithHttpInfo(JunctionBoxQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) JunctionBoxQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class JunctionBoxQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public JunctionBoxQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return JunctionBoxServicesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxServicesResponse junctionBoxServices(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>junctionBoxServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxServicesResponse> junctionBoxServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>junctionBoxServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxServicesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxServicesResponse junctionBoxServices(@Param("elid") String elid, JunctionBoxServicesRequest body, @QueryMap(encoded=true) JunctionBoxServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>junctionBoxServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxServicesResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxServicesResponse> junctionBoxServicesWithHttpInfo(@Param("elid") String elid, JunctionBoxServicesRequest body, @QueryMap(encoded=true) JunctionBoxServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxServices</code> method in a fluent style.
   */
  public static class JunctionBoxServicesQueryParams extends HashMap<String, Object> {
    public JunctionBoxServicesQueryParams sessionId(final String value) {
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
   * @return JunctionBoxSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxSitesResponseData junctionBoxSites(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>junctionBoxSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxSitesResponseData> junctionBoxSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxSitesResponseData junctionBoxSites(@Param("elid") String elid, JunctionBoxSitesRequestData body, @QueryMap(encoded=true) JunctionBoxSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxSitesResponseData> junctionBoxSitesWithHttpInfo(@Param("elid") String elid, JunctionBoxSitesRequestData body, @QueryMap(encoded=true) JunctionBoxSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxSites</code> method in a fluent style.
   */
  public static class JunctionBoxSitesQueryParams extends HashMap<String, Object> {
    public JunctionBoxSitesQueryParams sessionId(final String value) {
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
   * @return JunctionBoxSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxSwitchCabinetResponseData junctionBoxSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>junctionBoxSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxSwitchCabinetResponseData> junctionBoxSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxSwitchCabinetResponseData junctionBoxSwitchCabinet(@Param("elid") String elid, JunctionBoxSwitchCabinetRequestData body, @QueryMap(encoded=true) JunctionBoxSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxSwitchCabinetResponseData> junctionBoxSwitchCabinetWithHttpInfo(@Param("elid") String elid, JunctionBoxSwitchCabinetRequestData body, @QueryMap(encoded=true) JunctionBoxSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxSwitchCabinet</code> method in a fluent style.
   */
  public static class JunctionBoxSwitchCabinetQueryParams extends HashMap<String, Object> {
    public JunctionBoxSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return JunctionBoxSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxSystemAttributesResponse junctionBoxSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>junctionBoxSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxSystemAttributesResponse> junctionBoxSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>junctionBoxSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxSystemAttributesResponse junctionBoxSystemAttributes(@Param("elid") String elid, JunctionBoxSystemAttributesRequest body, @QueryMap(encoded=true) JunctionBoxSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>junctionBoxSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxSystemAttributesResponse> junctionBoxSystemAttributesWithHttpInfo(@Param("elid") String elid, JunctionBoxSystemAttributesRequest body, @QueryMap(encoded=true) JunctionBoxSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxSystemAttributes</code> method in a fluent style.
   */
  public static class JunctionBoxSystemAttributesQueryParams extends HashMap<String, Object> {
    public JunctionBoxSystemAttributesQueryParams sessionId(final String value) {
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
   * @return JunctionBoxWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxWarehouseResponseData junctionBoxWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>junctionBoxWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxWarehouseResponseData> junctionBoxWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxWarehouseResponseData junctionBoxWarehouse(@Param("elid") String elid, JunctionBoxWarehouseRequestData body, @QueryMap(encoded=true) JunctionBoxWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxWarehouseResponseData> junctionBoxWarehouseWithHttpInfo(@Param("elid") String elid, JunctionBoxWarehouseRequestData body, @QueryMap(encoded=true) JunctionBoxWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxWarehouse</code> method in a fluent style.
   */
  public static class JunctionBoxWarehouseQueryParams extends HashMap<String, Object> {
    public JunctionBoxWarehouseQueryParams sessionId(final String value) {
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
   * @return JunctionBoxZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JunctionBoxZoneResponseData junctionBoxZone(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>junctionBoxZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JunctionBoxZoneResponseData> junctionBoxZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, JunctionBoxZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>junctionBoxZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JunctionBoxZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JunctionBoxZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JunctionBoxZoneResponseData junctionBoxZone(@Param("elid") String elid, JunctionBoxZoneRequestData body, @QueryMap(encoded=true) JunctionBoxZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>junctionBoxZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JunctionBoxZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JunctionBoxZoneResponseData> junctionBoxZoneWithHttpInfo(@Param("elid") String elid, JunctionBoxZoneRequestData body, @QueryMap(encoded=true) JunctionBoxZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>junctionBoxZone</code> method in a fluent style.
   */
  public static class JunctionBoxZoneQueryParams extends HashMap<String, Object> {
    public JunctionBoxZoneQueryParams sessionId(final String value) {
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
   * @return LoopInCableJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/loopInCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoopInCableJunctionBoxResponse loopInCableJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInCableJunctionBoxRequestData body);

  /**
   * Loop-in cable
   * Similar to <code>loopInCableJunctionBox</code> but it also returns the http response headers .
   * Loop-in cable into junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/loopInCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoopInCableJunctionBoxResponse> loopInCableJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInCableJunctionBoxRequestData body);


  /**
   * Loop-in cable
   * Loop-in cable into junction box
   * Note, this is equivalent to the other <code>loopInCableJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoopInCableJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoopInCableJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/loopInCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoopInCableJunctionBoxResponse loopInCableJunctionBox(@Param("elid") String elid, LoopInCableJunctionBoxRequestData body, @QueryMap(encoded=true) LoopInCableJunctionBoxQueryParams queryParams);

  /**
  * Loop-in cable
  * Loop-in cable into junction box
  * Note, this is equivalent to the other <code>loopInCableJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoopInCableJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/loopInCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoopInCableJunctionBoxResponse> loopInCableJunctionBoxWithHttpInfo(@Param("elid") String elid, LoopInCableJunctionBoxRequestData body, @QueryMap(encoded=true) LoopInCableJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loopInCableJunctionBox</code> method in a fluent style.
   */
  public static class LoopInCableJunctionBoxQueryParams extends HashMap<String, Object> {
    public LoopInCableJunctionBoxQueryParams sessionId(final String value) {
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
   * @return ModifyConnectionJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/modifyConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModifyConnectionJunctionBoxResponse modifyConnectionJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectionJunctionBoxRequestData body);

  /**
   * Edit connection
   * Similar to <code>modifyConnectionJunctionBox</code> but it also returns the http response headers .
   * Edit connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/modifyConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModifyConnectionJunctionBoxResponse> modifyConnectionJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModifyConnectionJunctionBoxRequestData body);


  /**
   * Edit connection
   * Edit connection
   * Note, this is equivalent to the other <code>modifyConnectionJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModifyConnectionJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModifyConnectionJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/modifyConnection?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModifyConnectionJunctionBoxResponse modifyConnectionJunctionBox(@Param("elid") String elid, ModifyConnectionJunctionBoxRequestData body, @QueryMap(encoded=true) ModifyConnectionJunctionBoxQueryParams queryParams);

  /**
  * Edit connection
  * Edit connection
  * Note, this is equivalent to the other <code>modifyConnectionJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModifyConnectionJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/modifyConnection?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModifyConnectionJunctionBoxResponse> modifyConnectionJunctionBoxWithHttpInfo(@Param("elid") String elid, ModifyConnectionJunctionBoxRequestData body, @QueryMap(encoded=true) ModifyConnectionJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modifyConnectionJunctionBox</code> method in a fluent style.
   */
  public static class ModifyConnectionJunctionBoxQueryParams extends HashMap<String, Object> {
    public ModifyConnectionJunctionBoxQueryParams sessionId(final String value) {
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
   * @return MoveConnectionJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveConnectionJunctionBoxResponse moveConnectionJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveConnectionJunctionBoxRequestData body);

  /**
   * Move connection
   * Similar to <code>moveConnectionJunctionBox</code> but it also returns the http response headers .
   * Move connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveConnection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveConnectionJunctionBoxResponse> moveConnectionJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveConnectionJunctionBoxRequestData body);


  /**
   * Move connection
   * Move connection
   * Note, this is equivalent to the other <code>moveConnectionJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveConnectionJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveConnectionJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveConnection?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveConnectionJunctionBoxResponse moveConnectionJunctionBox(@Param("elid") String elid, MoveConnectionJunctionBoxRequestData body, @QueryMap(encoded=true) MoveConnectionJunctionBoxQueryParams queryParams);

  /**
  * Move connection
  * Move connection
  * Note, this is equivalent to the other <code>moveConnectionJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveConnectionJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveConnection?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveConnectionJunctionBoxResponse> moveConnectionJunctionBoxWithHttpInfo(@Param("elid") String elid, MoveConnectionJunctionBoxRequestData body, @QueryMap(encoded=true) MoveConnectionJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveConnectionJunctionBox</code> method in a fluent style.
   */
  public static class MoveConnectionJunctionBoxQueryParams extends HashMap<String, Object> {
    public MoveConnectionJunctionBoxQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetJunctionBoxResponse moveToCabinetJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetJunctionBoxRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetJunctionBox</code> but it also returns the http response headers .
   * Move to cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetJunctionBoxResponse> moveToCabinetJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetJunctionBoxRequestData body);


  /**
   * Move to cabinet
   * Move to cabinet
   * Note, this is equivalent to the other <code>moveToCabinetJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetJunctionBoxResponse moveToCabinetJunctionBox(@Param("elid") String elid, MoveToCabinetJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToCabinetJunctionBoxQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to cabinet
  * Note, this is equivalent to the other <code>moveToCabinetJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetJunctionBoxResponse> moveToCabinetJunctionBoxWithHttpInfo(@Param("elid") String elid, MoveToCabinetJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToCabinetJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetJunctionBox</code> method in a fluent style.
   */
  public static class MoveToCabinetJunctionBoxQueryParams extends HashMap<String, Object> {
    public MoveToCabinetJunctionBoxQueryParams sessionId(final String value) {
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
   * @return MoveToNodeJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToNodeJunctionBoxResponse moveToNodeJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToNodeJunctionBoxRequestData body);

  /**
   * Move to node
   * Similar to <code>moveToNodeJunctionBox</code> but it also returns the http response headers .
   * Move to node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToNodeJunctionBoxResponse> moveToNodeJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToNodeJunctionBoxRequestData body);


  /**
   * Move to node
   * Move to node
   * Note, this is equivalent to the other <code>moveToNodeJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToNodeJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToNodeJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToNodeJunctionBoxResponse moveToNodeJunctionBox(@Param("elid") String elid, MoveToNodeJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToNodeJunctionBoxQueryParams queryParams);

  /**
  * Move to node
  * Move to node
  * Note, this is equivalent to the other <code>moveToNodeJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToNodeJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToNodeJunctionBoxResponse> moveToNodeJunctionBoxWithHttpInfo(@Param("elid") String elid, MoveToNodeJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToNodeJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToNodeJunctionBox</code> method in a fluent style.
   */
  public static class MoveToNodeJunctionBoxQueryParams extends HashMap<String, Object> {
    public MoveToNodeJunctionBoxQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseJunctionBoxResponse moveToWarehouseJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseJunctionBoxRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseJunctionBox</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseJunctionBoxResponse> moveToWarehouseJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseJunctionBoxRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseJunctionBoxResponse moveToWarehouseJunctionBox(@Param("elid") String elid, MoveToWarehouseJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToWarehouseJunctionBoxQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseJunctionBoxResponse> moveToWarehouseJunctionBoxWithHttpInfo(@Param("elid") String elid, MoveToWarehouseJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToWarehouseJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseJunctionBox</code> method in a fluent style.
   */
  public static class MoveToWarehouseJunctionBoxQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseJunctionBoxQueryParams sessionId(final String value) {
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
   * @return MoveToZoneJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneJunctionBoxResponse moveToZoneJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneJunctionBoxRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneJunctionBox</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneJunctionBoxResponse> moveToZoneJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneJunctionBoxRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneJunctionBoxResponse moveToZoneJunctionBox(@Param("elid") String elid, MoveToZoneJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToZoneJunctionBoxQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneJunctionBoxResponse> moveToZoneJunctionBoxWithHttpInfo(@Param("elid") String elid, MoveToZoneJunctionBoxRequestData body, @QueryMap(encoded=true) MoveToZoneJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneJunctionBox</code> method in a fluent style.
   */
  public static class MoveToZoneJunctionBoxQueryParams extends HashMap<String, Object> {
    public MoveToZoneJunctionBoxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetJunctionBoxResponse placeInCabinetJunctionBox(@Param("sessionId") String sessionId, PlaceInCabinetJunctionBoxRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetJunctionBox</code> but it also returns the http response headers .
   * Place in cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetJunctionBoxResponse> placeInCabinetJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetJunctionBoxRequestData body);


  /**
   * Place in cabinet
   * Place in cabinet
   * Note, this is equivalent to the other <code>placeInCabinetJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetJunctionBoxResponse placeInCabinetJunctionBox(PlaceInCabinetJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInCabinetJunctionBoxQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in cabinet
  * Note, this is equivalent to the other <code>placeInCabinetJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetJunctionBoxResponse> placeInCabinetJunctionBoxWithHttpInfo(PlaceInCabinetJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInCabinetJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetJunctionBox</code> method in a fluent style.
   */
  public static class PlaceInCabinetJunctionBoxQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetJunctionBoxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in node
   * Place in node
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInNodeJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInNodeJunctionBoxResponse placeInNodeJunctionBox(@Param("sessionId") String sessionId, PlaceInNodeJunctionBoxRequestData body);

  /**
   * Place in node
   * Similar to <code>placeInNodeJunctionBox</code> but it also returns the http response headers .
   * Place in node
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInNodeJunctionBoxResponse> placeInNodeJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, PlaceInNodeJunctionBoxRequestData body);


  /**
   * Place in node
   * Place in node
   * Note, this is equivalent to the other <code>placeInNodeJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInNodeJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInNodeJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInNodeJunctionBoxResponse placeInNodeJunctionBox(PlaceInNodeJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInNodeJunctionBoxQueryParams queryParams);

  /**
  * Place in node
  * Place in node
  * Note, this is equivalent to the other <code>placeInNodeJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInNodeJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/placeInNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInNodeJunctionBoxResponse> placeInNodeJunctionBoxWithHttpInfo(PlaceInNodeJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInNodeJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInNodeJunctionBox</code> method in a fluent style.
   */
  public static class PlaceInNodeJunctionBoxQueryParams extends HashMap<String, Object> {
    public PlaceInNodeJunctionBoxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseJunctionBoxResponse placeInWarehouseJunctionBox(@Param("sessionId") String sessionId, PlaceInWarehouseJunctionBoxRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseJunctionBox</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseJunctionBoxResponse> placeInWarehouseJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseJunctionBoxRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseJunctionBoxResponse placeInWarehouseJunctionBox(PlaceInWarehouseJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInWarehouseJunctionBoxQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseJunctionBoxResponse> placeInWarehouseJunctionBoxWithHttpInfo(PlaceInWarehouseJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInWarehouseJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseJunctionBox</code> method in a fluent style.
   */
  public static class PlaceInWarehouseJunctionBoxQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseJunctionBoxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneJunctionBoxResponse placeInZoneJunctionBox(@Param("sessionId") String sessionId, PlaceInZoneJunctionBoxRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneJunctionBox</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneJunctionBoxResponse> placeInZoneJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneJunctionBoxRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneJunctionBoxResponse placeInZoneJunctionBox(PlaceInZoneJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInZoneJunctionBoxQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneJunctionBoxResponse> placeInZoneJunctionBoxWithHttpInfo(PlaceInZoneJunctionBoxRequestData body, @QueryMap(encoded=true) PlaceInZoneJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneJunctionBox</code> method in a fluent style.
   */
  public static class PlaceInZoneJunctionBoxQueryParams extends HashMap<String, Object> {
    public PlaceInZoneJunctionBoxQueryParams sessionId(final String value) {
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
   * @return RemoveCableJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/removeCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveCableJunctionBoxResponse removeCableJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveCableJunctionBoxRequestData body);

  /**
   * Remove cable from junction box
   * Similar to <code>removeCableJunctionBox</code> but it also returns the http response headers .
   * Remove cable from junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/removeCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveCableJunctionBoxResponse> removeCableJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveCableJunctionBoxRequestData body);


  /**
   * Remove cable from junction box
   * Remove cable from junction box
   * Note, this is equivalent to the other <code>removeCableJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveCableJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveCableJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/removeCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveCableJunctionBoxResponse removeCableJunctionBox(@Param("elid") String elid, RemoveCableJunctionBoxRequestData body, @QueryMap(encoded=true) RemoveCableJunctionBoxQueryParams queryParams);

  /**
  * Remove cable from junction box
  * Remove cable from junction box
  * Note, this is equivalent to the other <code>removeCableJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveCableJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/removeCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveCableJunctionBoxResponse> removeCableJunctionBoxWithHttpInfo(@Param("elid") String elid, RemoveCableJunctionBoxRequestData body, @QueryMap(encoded=true) RemoveCableJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeCableJunctionBox</code> method in a fluent style.
   */
  public static class RemoveCableJunctionBoxQueryParams extends HashMap<String, Object> {
    public RemoveCableJunctionBoxQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectJunctionBoxResponse replaceObjectJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectJunctionBoxRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectJunctionBox</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectJunctionBoxResponse> replaceObjectJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectJunctionBoxRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectJunctionBoxResponse replaceObjectJunctionBox(@Param("elid") String elid, ReplaceObjectJunctionBoxRequestData body, @QueryMap(encoded=true) ReplaceObjectJunctionBoxQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectJunctionBoxResponse> replaceObjectJunctionBoxWithHttpInfo(@Param("elid") String elid, ReplaceObjectJunctionBoxRequestData body, @QueryMap(encoded=true) ReplaceObjectJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectJunctionBox</code> method in a fluent style.
   */
  public static class ReplaceObjectJunctionBoxQueryParams extends HashMap<String, Object> {
    public ReplaceObjectJunctionBoxQueryParams sessionId(final String value) {
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
   * @return SpliceFibersJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/spliceFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpliceFibersJunctionBoxResponse spliceFibersJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceFibersJunctionBoxRequestData body);

  /**
   * Splice fibers
   * Similar to <code>spliceFibersJunctionBox</code> but it also returns the http response headers .
   * Splice fibers
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/spliceFibers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpliceFibersJunctionBoxResponse> spliceFibersJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceFibersJunctionBoxRequestData body);


  /**
   * Splice fibers
   * Splice fibers
   * Note, this is equivalent to the other <code>spliceFibersJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SpliceFibersJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SpliceFibersJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/spliceFibers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SpliceFibersJunctionBoxResponse spliceFibersJunctionBox(@Param("elid") String elid, SpliceFibersJunctionBoxRequestData body, @QueryMap(encoded=true) SpliceFibersJunctionBoxQueryParams queryParams);

  /**
  * Splice fibers
  * Splice fibers
  * Note, this is equivalent to the other <code>spliceFibersJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SpliceFibersJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/spliceFibers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SpliceFibersJunctionBoxResponse> spliceFibersJunctionBoxWithHttpInfo(@Param("elid") String elid, SpliceFibersJunctionBoxRequestData body, @QueryMap(encoded=true) SpliceFibersJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>spliceFibersJunctionBox</code> method in a fluent style.
   */
  public static class SpliceFibersJunctionBoxQueryParams extends HashMap<String, Object> {
    public SpliceFibersJunctionBoxQueryParams sessionId(final String value) {
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
   * @return UpdateJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateJunctionBoxResponse updateJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateJunctionBoxRequestData body);

  /**
   * Modify
   * Similar to <code>updateJunctionBox</code> but it also returns the http response headers .
   * Modify Junction box
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateJunctionBoxResponse> updateJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateJunctionBoxRequestData body);


  /**
   * Modify
   * Modify Junction box
   * Note, this is equivalent to the other <code>updateJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateJunctionBoxResponse updateJunctionBox(@Param("elid") String elid, UpdateJunctionBoxRequestData body, @QueryMap(encoded=true) UpdateJunctionBoxQueryParams queryParams);

  /**
  * Modify
  * Modify Junction box
  * Note, this is equivalent to the other <code>updateJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateJunctionBoxResponse> updateJunctionBoxWithHttpInfo(@Param("elid") String elid, UpdateJunctionBoxRequestData body, @QueryMap(encoded=true) UpdateJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateJunctionBox</code> method in a fluent style.
   */
  public static class UpdateJunctionBoxQueryParams extends HashMap<String, Object> {
    public UpdateJunctionBoxQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesJunctionBoxResponse updateSystemAttributesJunctionBox(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesJunctionBoxRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesJunctionBox</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesJunctionBoxResponse> updateSystemAttributesJunctionBoxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesJunctionBoxRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesJunctionBox</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesJunctionBoxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesJunctionBoxResponse
   */
  @RequestLine("POST /api/rest/entity/junctionBox/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesJunctionBoxResponse updateSystemAttributesJunctionBox(@Param("elid") String elid, UpdateSystemAttributesJunctionBoxRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesJunctionBoxQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesJunctionBox</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesJunctionBoxResponse
      */
      @RequestLine("POST /api/rest/entity/junctionBox/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesJunctionBoxResponse> updateSystemAttributesJunctionBoxWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesJunctionBoxRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesJunctionBoxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesJunctionBox</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesJunctionBoxQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesJunctionBoxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
