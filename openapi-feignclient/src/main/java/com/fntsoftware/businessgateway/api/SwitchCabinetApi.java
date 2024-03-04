package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.DeleteSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.ReplaceObjectSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.ReplaceObjectSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetContractsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetContractsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetDuctDataRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetDuctDataResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetDuctsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetDuctsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetLocationRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetLocationResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetMultiDuctsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetMultiDuctsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetPlaceableObjectsRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetPlaceableObjectsResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetQueryResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetServicesRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetServicesResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetSitesRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetSitesResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetSubDevicesRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetSubDevicesResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SwitchCabinetSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.SwitchCabinetVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetZoneRequestData;
import com.fntsoftware.businessgateway.entities.SwitchCabinetZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSwitchCabinetResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface SwitchCabinetApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeSwitchCabinetResponse changeTypeSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeSwitchCabinetRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeSwitchCabinetResponse> changeTypeSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeSwitchCabinetRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeSwitchCabinetResponse changeTypeSwitchCabinet(@Param("elid") String elid, ChangeTypeSwitchCabinetRequestData body, @QueryMap(encoded=true) ChangeTypeSwitchCabinetQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeSwitchCabinetResponse> changeTypeSwitchCabinetWithHttpInfo(@Param("elid") String elid, ChangeTypeSwitchCabinetRequestData body, @QueryMap(encoded=true) ChangeTypeSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeSwitchCabinet</code> method in a fluent style.
   */
  public static class ChangeTypeSwitchCabinetQueryParams extends HashMap<String, Object> {
    public ChangeTypeSwitchCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSwitchCabinetResponse deleteSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSwitchCabinetRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSwitchCabinet</code> but it also returns the http response headers .
   * Delete Cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSwitchCabinetResponse> deleteSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSwitchCabinetRequestData body);


  /**
   * Delete
   * Delete Cabinet
   * Note, this is equivalent to the other <code>deleteSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSwitchCabinetResponse deleteSwitchCabinet(@Param("elid") String elid, DeleteSwitchCabinetRequestData body, @QueryMap(encoded=true) DeleteSwitchCabinetQueryParams queryParams);

  /**
  * Delete
  * Delete Cabinet
  * Note, this is equivalent to the other <code>deleteSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSwitchCabinetResponse> deleteSwitchCabinetWithHttpInfo(@Param("elid") String elid, DeleteSwitchCabinetRequestData body, @QueryMap(encoded=true) DeleteSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSwitchCabinet</code> method in a fluent style.
   */
  public static class DeleteSwitchCabinetQueryParams extends HashMap<String, Object> {
    public DeleteSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseSwitchCabinetResponse moveToWarehouseSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseSwitchCabinetRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseSwitchCabinetResponse> moveToWarehouseSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseSwitchCabinetRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseSwitchCabinetResponse moveToWarehouseSwitchCabinet(@Param("elid") String elid, MoveToWarehouseSwitchCabinetRequestData body, @QueryMap(encoded=true) MoveToWarehouseSwitchCabinetQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseSwitchCabinetResponse> moveToWarehouseSwitchCabinetWithHttpInfo(@Param("elid") String elid, MoveToWarehouseSwitchCabinetRequestData body, @QueryMap(encoded=true) MoveToWarehouseSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseSwitchCabinet</code> method in a fluent style.
   */
  public static class MoveToWarehouseSwitchCabinetQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return MoveToZoneSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneSwitchCabinetResponse moveToZoneSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneSwitchCabinetRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneSwitchCabinet</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneSwitchCabinetResponse> moveToZoneSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneSwitchCabinetRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneSwitchCabinetResponse moveToZoneSwitchCabinet(@Param("elid") String elid, MoveToZoneSwitchCabinetRequestData body, @QueryMap(encoded=true) MoveToZoneSwitchCabinetQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneSwitchCabinetResponse> moveToZoneSwitchCabinetWithHttpInfo(@Param("elid") String elid, MoveToZoneSwitchCabinetRequestData body, @QueryMap(encoded=true) MoveToZoneSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneSwitchCabinet</code> method in a fluent style.
   */
  public static class MoveToZoneSwitchCabinetQueryParams extends HashMap<String, Object> {
    public MoveToZoneSwitchCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseSwitchCabinetResponse placeInWarehouseSwitchCabinet(@Param("sessionId") String sessionId, PlaceInWarehouseSwitchCabinetRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseSwitchCabinet</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseSwitchCabinetResponse> placeInWarehouseSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseSwitchCabinetRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseSwitchCabinetResponse placeInWarehouseSwitchCabinet(PlaceInWarehouseSwitchCabinetRequestData body, @QueryMap(encoded=true) PlaceInWarehouseSwitchCabinetQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseSwitchCabinetResponse> placeInWarehouseSwitchCabinetWithHttpInfo(PlaceInWarehouseSwitchCabinetRequestData body, @QueryMap(encoded=true) PlaceInWarehouseSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseSwitchCabinet</code> method in a fluent style.
   */
  public static class PlaceInWarehouseSwitchCabinetQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseSwitchCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneSwitchCabinetResponse placeInZoneSwitchCabinet(@Param("sessionId") String sessionId, PlaceInZoneSwitchCabinetRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneSwitchCabinet</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneSwitchCabinetResponse> placeInZoneSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneSwitchCabinetRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneSwitchCabinetResponse placeInZoneSwitchCabinet(PlaceInZoneSwitchCabinetRequestData body, @QueryMap(encoded=true) PlaceInZoneSwitchCabinetQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneSwitchCabinetResponse> placeInZoneSwitchCabinetWithHttpInfo(PlaceInZoneSwitchCabinetRequestData body, @QueryMap(encoded=true) PlaceInZoneSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneSwitchCabinet</code> method in a fluent style.
   */
  public static class PlaceInZoneSwitchCabinetQueryParams extends HashMap<String, Object> {
    public PlaceInZoneSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return ReplaceObjectSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReplaceObjectSwitchCabinetResponse replaceObjectSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectSwitchCabinetRequestData body);

  /**
   * Replace object
   * Similar to <code>replaceObjectSwitchCabinet</code> but it also returns the http response headers .
   * Replace object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReplaceObjectSwitchCabinetResponse> replaceObjectSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReplaceObjectSwitchCabinetRequestData body);


  /**
   * Replace object
   * Replace object
   * Note, this is equivalent to the other <code>replaceObjectSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplaceObjectSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReplaceObjectSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/replaceObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReplaceObjectSwitchCabinetResponse replaceObjectSwitchCabinet(@Param("elid") String elid, ReplaceObjectSwitchCabinetRequestData body, @QueryMap(encoded=true) ReplaceObjectSwitchCabinetQueryParams queryParams);

  /**
  * Replace object
  * Replace object
  * Note, this is equivalent to the other <code>replaceObjectSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReplaceObjectSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/replaceObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReplaceObjectSwitchCabinetResponse> replaceObjectSwitchCabinetWithHttpInfo(@Param("elid") String elid, ReplaceObjectSwitchCabinetRequestData body, @QueryMap(encoded=true) ReplaceObjectSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>replaceObjectSwitchCabinet</code> method in a fluent style.
   */
  public static class ReplaceObjectSwitchCabinetQueryParams extends HashMap<String, Object> {
    public ReplaceObjectSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetContractsResponseData switchCabinetContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>switchCabinetContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetContractsResponseData> switchCabinetContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetContractsResponseData switchCabinetContracts(@Param("elid") String elid, SwitchCabinetContractsRequestData body, @QueryMap(encoded=true) SwitchCabinetContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetContractsResponseData> switchCabinetContractsWithHttpInfo(@Param("elid") String elid, SwitchCabinetContractsRequestData body, @QueryMap(encoded=true) SwitchCabinetContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetContracts</code> method in a fluent style.
   */
  public static class SwitchCabinetContractsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Locks entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SwitchCabinetCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetCustomLocksResponseData switchCabinetCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>switchCabinetCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetCustomLocksResponseData> switchCabinetCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetCustomLocksResponseData switchCabinetCustomLocks(@Param("elid") String elid, SwitchCabinetCustomLocksRequestData body, @QueryMap(encoded=true) SwitchCabinetCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetCustomLocksResponseData> switchCabinetCustomLocksWithHttpInfo(@Param("elid") String elid, SwitchCabinetCustomLocksRequestData body, @QueryMap(encoded=true) SwitchCabinetCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetCustomLocks</code> method in a fluent style.
   */
  public static class SwitchCabinetCustomLocksQueryParams extends HashMap<String, Object> {
    public SwitchCabinetCustomLocksQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetDeviceMasterResponseData switchCabinetDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>switchCabinetDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetDeviceMasterResponseData> switchCabinetDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetDeviceMasterResponseData switchCabinetDeviceMaster(@Param("elid") String elid, SwitchCabinetDeviceMasterRequestData body, @QueryMap(encoded=true) SwitchCabinetDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetDeviceMasterResponseData> switchCabinetDeviceMasterWithHttpInfo(@Param("elid") String elid, SwitchCabinetDeviceMasterRequestData body, @QueryMap(encoded=true) SwitchCabinetDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetDeviceMaster</code> method in a fluent style.
   */
  public static class SwitchCabinetDeviceMasterQueryParams extends HashMap<String, Object> {
    public SwitchCabinetDeviceMasterQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetDuctDataResponse switchCabinetDuctData(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetDuctDataRequest body);

  /**
   * Query duct data
   * Similar to <code>switchCabinetDuctData</code> but it also returns the http response headers .
   * Query associated ducts and multipipes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetDuctDataResponse> switchCabinetDuctDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetDuctDataRequest body);


  /**
   * Query duct data
   * Query associated ducts and multipipes
   * Note, this is equivalent to the other <code>switchCabinetDuctData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetDuctDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetDuctDataResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DuctData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetDuctDataResponse switchCabinetDuctData(@Param("elid") String elid, SwitchCabinetDuctDataRequest body, @QueryMap(encoded=true) SwitchCabinetDuctDataQueryParams queryParams);

  /**
  * Query duct data
  * Query associated ducts and multipipes
  * Note, this is equivalent to the other <code>switchCabinetDuctData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetDuctDataResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/DuctData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetDuctDataResponse> switchCabinetDuctDataWithHttpInfo(@Param("elid") String elid, SwitchCabinetDuctDataRequest body, @QueryMap(encoded=true) SwitchCabinetDuctDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetDuctData</code> method in a fluent style.
   */
  public static class SwitchCabinetDuctDataQueryParams extends HashMap<String, Object> {
    public SwitchCabinetDuctDataQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetDuctsResponseData switchCabinetDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>switchCabinetDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetDuctsResponseData> switchCabinetDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetDuctsResponseData switchCabinetDucts(@Param("elid") String elid, SwitchCabinetDuctsRequestData body, @QueryMap(encoded=true) SwitchCabinetDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetDuctsResponseData> switchCabinetDuctsWithHttpInfo(@Param("elid") String elid, SwitchCabinetDuctsRequestData body, @QueryMap(encoded=true) SwitchCabinetDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetDucts</code> method in a fluent style.
   */
  public static class SwitchCabinetDuctsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetDuctsQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetFrameContractsResponseData switchCabinetFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>switchCabinetFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetFrameContractsResponseData> switchCabinetFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetFrameContractsResponseData switchCabinetFrameContracts(@Param("elid") String elid, SwitchCabinetFrameContractsRequestData body, @QueryMap(encoded=true) SwitchCabinetFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetFrameContractsResponseData> switchCabinetFrameContractsWithHttpInfo(@Param("elid") String elid, SwitchCabinetFrameContractsRequestData body, @QueryMap(encoded=true) SwitchCabinetFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetFrameContracts</code> method in a fluent style.
   */
  public static class SwitchCabinetFrameContractsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwitchCabinetInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetInheritedGeoCoordinatesResponse switchCabinetInheritedGeoCoordinates(@Param("sessionId") String sessionId, SwitchCabinetInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>switchCabinetInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetInheritedGeoCoordinatesResponse> switchCabinetInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, SwitchCabinetInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>switchCabinetInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetInheritedGeoCoordinatesResponse switchCabinetInheritedGeoCoordinates(SwitchCabinetInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) SwitchCabinetInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>switchCabinetInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetInheritedGeoCoordinatesResponse> switchCabinetInheritedGeoCoordinatesWithHttpInfo(SwitchCabinetInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) SwitchCabinetInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class SwitchCabinetInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetLocationResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetLocationResponse switchCabinetLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetLocationRequest body);

  /**
   * Location
   * Similar to <code>switchCabinetLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetLocationResponse> switchCabinetLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>switchCabinetLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetLocationResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetLocationResponse switchCabinetLocation(@Param("elid") String elid, SwitchCabinetLocationRequest body, @QueryMap(encoded=true) SwitchCabinetLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>switchCabinetLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetLocationResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetLocationResponse> switchCabinetLocationWithHttpInfo(@Param("elid") String elid, SwitchCabinetLocationRequest body, @QueryMap(encoded=true) SwitchCabinetLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetLocation</code> method in a fluent style.
   */
  public static class SwitchCabinetLocationQueryParams extends HashMap<String, Object> {
    public SwitchCabinetLocationQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetMaintenanceContractsResponseData switchCabinetMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>switchCabinetMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetMaintenanceContractsResponseData> switchCabinetMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetMaintenanceContractsResponseData switchCabinetMaintenanceContracts(@Param("elid") String elid, SwitchCabinetMaintenanceContractsRequestData body, @QueryMap(encoded=true) SwitchCabinetMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetMaintenanceContractsResponseData> switchCabinetMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SwitchCabinetMaintenanceContractsRequestData body, @QueryMap(encoded=true) SwitchCabinetMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetMaintenanceContracts</code> method in a fluent style.
   */
  public static class SwitchCabinetMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetMultiDuctsResponseData switchCabinetMultiDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetMultiDuctsRequestData body);

  /**
   * Get relations to Multiducts entities
   * Similar to <code>switchCabinetMultiDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetMultiDuctsResponseData> switchCabinetMultiDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetMultiDuctsRequestData body);


  /**
   * Get relations to Multiducts entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetMultiDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetMultiDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetMultiDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MultiDucts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetMultiDuctsResponseData switchCabinetMultiDucts(@Param("elid") String elid, SwitchCabinetMultiDuctsRequestData body, @QueryMap(encoded=true) SwitchCabinetMultiDuctsQueryParams queryParams);

  /**
  * Get relations to Multiducts entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetMultiDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetMultiDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/MultiDucts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetMultiDuctsResponseData> switchCabinetMultiDuctsWithHttpInfo(@Param("elid") String elid, SwitchCabinetMultiDuctsRequestData body, @QueryMap(encoded=true) SwitchCabinetMultiDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetMultiDucts</code> method in a fluent style.
   */
  public static class SwitchCabinetMultiDuctsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetMultiDuctsQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetOrganizationsResponseData switchCabinetOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>switchCabinetOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetOrganizationsResponseData> switchCabinetOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetOrganizationsResponseData switchCabinetOrganizations(@Param("elid") String elid, SwitchCabinetOrganizationsRequestData body, @QueryMap(encoded=true) SwitchCabinetOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetOrganizationsResponseData> switchCabinetOrganizationsWithHttpInfo(@Param("elid") String elid, SwitchCabinetOrganizationsRequestData body, @QueryMap(encoded=true) SwitchCabinetOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetOrganizations</code> method in a fluent style.
   */
  public static class SwitchCabinetOrganizationsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetOrganizationsQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetPersonGroupsResponseData switchCabinetPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>switchCabinetPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetPersonGroupsResponseData> switchCabinetPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetPersonGroupsResponseData switchCabinetPersonGroups(@Param("elid") String elid, SwitchCabinetPersonGroupsRequestData body, @QueryMap(encoded=true) SwitchCabinetPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetPersonGroupsResponseData> switchCabinetPersonGroupsWithHttpInfo(@Param("elid") String elid, SwitchCabinetPersonGroupsRequestData body, @QueryMap(encoded=true) SwitchCabinetPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetPersonGroups</code> method in a fluent style.
   */
  public static class SwitchCabinetPersonGroupsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetPersonsResponseData switchCabinetPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>switchCabinetPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetPersonsResponseData> switchCabinetPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetPersonsResponseData switchCabinetPersons(@Param("elid") String elid, SwitchCabinetPersonsRequestData body, @QueryMap(encoded=true) SwitchCabinetPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetPersonsResponseData> switchCabinetPersonsWithHttpInfo(@Param("elid") String elid, SwitchCabinetPersonsRequestData body, @QueryMap(encoded=true) SwitchCabinetPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetPersons</code> method in a fluent style.
   */
  public static class SwitchCabinetPersonsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query placeable objects
   * Queries for objects that can be placed in the switch cabinet.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SwitchCabinetPlaceableObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PlaceableObjects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetPlaceableObjectsResponse switchCabinetPlaceableObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetPlaceableObjectsRequest body);

  /**
   * Query placeable objects
   * Similar to <code>switchCabinetPlaceableObjects</code> but it also returns the http response headers .
   * Queries for objects that can be placed in the switch cabinet.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PlaceableObjects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetPlaceableObjectsResponse> switchCabinetPlaceableObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetPlaceableObjectsRequest body);


  /**
   * Query placeable objects
   * Queries for objects that can be placed in the switch cabinet.
   * Note, this is equivalent to the other <code>switchCabinetPlaceableObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetPlaceableObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetPlaceableObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PlaceableObjects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetPlaceableObjectsResponse switchCabinetPlaceableObjects(@Param("elid") String elid, SwitchCabinetPlaceableObjectsRequest body, @QueryMap(encoded=true) SwitchCabinetPlaceableObjectsQueryParams queryParams);

  /**
  * Query placeable objects
  * Queries for objects that can be placed in the switch cabinet.
  * Note, this is equivalent to the other <code>switchCabinetPlaceableObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetPlaceableObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/PlaceableObjects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetPlaceableObjectsResponse> switchCabinetPlaceableObjectsWithHttpInfo(@Param("elid") String elid, SwitchCabinetPlaceableObjectsRequest body, @QueryMap(encoded=true) SwitchCabinetPlaceableObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetPlaceableObjects</code> method in a fluent style.
   */
  public static class SwitchCabinetPlaceableObjectsQueryParams extends HashMap<String, Object> {
    public SwitchCabinetPlaceableObjectsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwitchCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetQueryResponse switchCabinetQuery(@Param("sessionId") String sessionId, SwitchCabinetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>switchCabinetQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetQueryResponse> switchCabinetQueryWithHttpInfo(@Param("sessionId") String sessionId, SwitchCabinetQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>switchCabinetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetQueryResponse switchCabinetQuery(SwitchCabinetQueryRequest body, @QueryMap(encoded=true) SwitchCabinetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>switchCabinetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetQueryResponse> switchCabinetQueryWithHttpInfo(SwitchCabinetQueryRequest body, @QueryMap(encoded=true) SwitchCabinetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetQuery</code> method in a fluent style.
   */
  public static class SwitchCabinetQueryQueryParams extends HashMap<String, Object> {
    public SwitchCabinetQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwitchCabinetQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetQueryExtendedResponse switchCabinetQueryExtended(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>switchCabinetQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetQueryExtendedResponse> switchCabinetQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>switchCabinetQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetQueryExtendedResponse switchCabinetQueryExtended(SwitchCabinetQueryExtendedRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>switchCabinetQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetQueryExtendedResponse> switchCabinetQueryExtendedWithHttpInfo(SwitchCabinetQueryExtendedRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetQueryExtended</code> method in a fluent style.
   */
  public static class SwitchCabinetQueryExtendedQueryParams extends HashMap<String, Object> {
    public SwitchCabinetQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended geo coordinates
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwitchCabinetQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetQueryExtendedGeoCoordinatesResponse switchCabinetQueryExtendedGeoCoordinates(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedGeoCoordinatesRequest body);

  /**
   * Extended geo coordinates
   * Similar to <code>switchCabinetQueryExtendedGeoCoordinates</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetQueryExtendedGeoCoordinatesResponse> switchCabinetQueryExtendedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedGeoCoordinatesRequest body);


  /**
   * Extended geo coordinates
   * 
   * Note, this is equivalent to the other <code>switchCabinetQueryExtendedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetQueryExtendedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetQueryExtendedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetQueryExtendedGeoCoordinatesResponse switchCabinetQueryExtendedGeoCoordinates(SwitchCabinetQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedGeoCoordinatesQueryParams queryParams);

  /**
  * Extended geo coordinates
  * 
  * Note, this is equivalent to the other <code>switchCabinetQueryExtendedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetQueryExtendedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetQueryExtendedGeoCoordinatesResponse> switchCabinetQueryExtendedGeoCoordinatesWithHttpInfo(SwitchCabinetQueryExtendedGeoCoordinatesRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetQueryExtendedGeoCoordinates</code> method in a fluent style.
   */
  public static class SwitchCabinetQueryExtendedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetQueryExtendedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwitchCabinetQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetQueryExtendedScrollFirstResponse switchCabinetQueryExtendedScrollFirst(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>switchCabinetQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetQueryExtendedScrollFirstResponse> switchCabinetQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>switchCabinetQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetQueryExtendedScrollFirstResponse switchCabinetQueryExtendedScrollFirst(SwitchCabinetQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>switchCabinetQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetQueryExtendedScrollFirstResponse> switchCabinetQueryExtendedScrollFirstWithHttpInfo(SwitchCabinetQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class SwitchCabinetQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public SwitchCabinetQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwitchCabinetQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetQueryExtendedScrollMoreResponse switchCabinetQueryExtendedScrollMore(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>switchCabinetQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetQueryExtendedScrollMoreResponse> switchCabinetQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, SwitchCabinetQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>switchCabinetQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetQueryExtendedScrollMoreResponse switchCabinetQueryExtendedScrollMore(SwitchCabinetQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>switchCabinetQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetQueryExtendedScrollMoreResponse> switchCabinetQueryExtendedScrollMoreWithHttpInfo(SwitchCabinetQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) SwitchCabinetQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class SwitchCabinetQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public SwitchCabinetQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetServicesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetServicesResponse switchCabinetServices(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetServicesRequest body);

  /**
   * Query device services 
   * Similar to <code>switchCabinetServices</code> but it also returns the http response headers .
   * Query services for device 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Services?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetServicesResponse> switchCabinetServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetServicesRequest body);


  /**
   * Query device services 
   * Query services for device 
   * Note, this is equivalent to the other <code>switchCabinetServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetServicesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Services?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetServicesResponse switchCabinetServices(@Param("elid") String elid, SwitchCabinetServicesRequest body, @QueryMap(encoded=true) SwitchCabinetServicesQueryParams queryParams);

  /**
  * Query device services 
  * Query services for device 
  * Note, this is equivalent to the other <code>switchCabinetServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetServicesResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Services?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetServicesResponse> switchCabinetServicesWithHttpInfo(@Param("elid") String elid, SwitchCabinetServicesRequest body, @QueryMap(encoded=true) SwitchCabinetServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetServices</code> method in a fluent style.
   */
  public static class SwitchCabinetServicesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetServicesQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetSitesResponseData switchCabinetSites(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>switchCabinetSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetSitesResponseData> switchCabinetSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetSitesResponseData switchCabinetSites(@Param("elid") String elid, SwitchCabinetSitesRequestData body, @QueryMap(encoded=true) SwitchCabinetSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetSitesResponseData> switchCabinetSitesWithHttpInfo(@Param("elid") String elid, SwitchCabinetSitesRequestData body, @QueryMap(encoded=true) SwitchCabinetSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetSites</code> method in a fluent style.
   */
  public static class SwitchCabinetSitesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetSitesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query subdevices
   * Queries subdevices in a switch cabinet. Only direct subdevices will be returned. Free cabinet positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SwitchCabinetSubDevicesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SubDevices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetSubDevicesResponse switchCabinetSubDevices(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetSubDevicesRequest body);

  /**
   * Query subdevices
   * Similar to <code>switchCabinetSubDevices</code> but it also returns the http response headers .
   * Queries subdevices in a switch cabinet. Only direct subdevices will be returned. Free cabinet positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SubDevices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetSubDevicesResponse> switchCabinetSubDevicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetSubDevicesRequest body);


  /**
   * Query subdevices
   * Queries subdevices in a switch cabinet. Only direct subdevices will be returned. Free cabinet positions will not be returned.
   * Note, this is equivalent to the other <code>switchCabinetSubDevices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetSubDevicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetSubDevicesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SubDevices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetSubDevicesResponse switchCabinetSubDevices(@Param("elid") String elid, SwitchCabinetSubDevicesRequest body, @QueryMap(encoded=true) SwitchCabinetSubDevicesQueryParams queryParams);

  /**
  * Query subdevices
  * Queries subdevices in a switch cabinet. Only direct subdevices will be returned. Free cabinet positions will not be returned.
  * Note, this is equivalent to the other <code>switchCabinetSubDevices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetSubDevicesResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SubDevices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetSubDevicesResponse> switchCabinetSubDevicesWithHttpInfo(@Param("elid") String elid, SwitchCabinetSubDevicesRequest body, @QueryMap(encoded=true) SwitchCabinetSubDevicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetSubDevices</code> method in a fluent style.
   */
  public static class SwitchCabinetSubDevicesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetSubDevicesQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetSystemAttributesResponse switchCabinetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>switchCabinetSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetSystemAttributesResponse> switchCabinetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>switchCabinetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetSystemAttributesResponse switchCabinetSystemAttributes(@Param("elid") String elid, SwitchCabinetSystemAttributesRequest body, @QueryMap(encoded=true) SwitchCabinetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>switchCabinetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetSystemAttributesResponse> switchCabinetSystemAttributesWithHttpInfo(@Param("elid") String elid, SwitchCabinetSystemAttributesRequest body, @QueryMap(encoded=true) SwitchCabinetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetSystemAttributes</code> method in a fluent style.
   */
  public static class SwitchCabinetSystemAttributesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetSystemAttributesQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetVirtualSwitchesResponseData switchCabinetVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>switchCabinetVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetVirtualSwitchesResponseData> switchCabinetVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetVirtualSwitchesResponseData switchCabinetVirtualSwitches(@Param("elid") String elid, SwitchCabinetVirtualSwitchesRequestData body, @QueryMap(encoded=true) SwitchCabinetVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetVirtualSwitchesResponseData> switchCabinetVirtualSwitchesWithHttpInfo(@Param("elid") String elid, SwitchCabinetVirtualSwitchesRequestData body, @QueryMap(encoded=true) SwitchCabinetVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetVirtualSwitches</code> method in a fluent style.
   */
  public static class SwitchCabinetVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public SwitchCabinetVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetWarehouseResponseData switchCabinetWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>switchCabinetWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetWarehouseResponseData> switchCabinetWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetWarehouseResponseData switchCabinetWarehouse(@Param("elid") String elid, SwitchCabinetWarehouseRequestData body, @QueryMap(encoded=true) SwitchCabinetWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetWarehouseResponseData> switchCabinetWarehouseWithHttpInfo(@Param("elid") String elid, SwitchCabinetWarehouseRequestData body, @QueryMap(encoded=true) SwitchCabinetWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetWarehouse</code> method in a fluent style.
   */
  public static class SwitchCabinetWarehouseQueryParams extends HashMap<String, Object> {
    public SwitchCabinetWarehouseQueryParams sessionId(final String value) {
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
   * @return SwitchCabinetZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchCabinetZoneResponseData switchCabinetZone(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>switchCabinetZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchCabinetZoneResponseData> switchCabinetZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchCabinetZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>switchCabinetZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchCabinetZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchCabinetZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchCabinetZoneResponseData switchCabinetZone(@Param("elid") String elid, SwitchCabinetZoneRequestData body, @QueryMap(encoded=true) SwitchCabinetZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>switchCabinetZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchCabinetZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchCabinetZoneResponseData> switchCabinetZoneWithHttpInfo(@Param("elid") String elid, SwitchCabinetZoneRequestData body, @QueryMap(encoded=true) SwitchCabinetZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchCabinetZone</code> method in a fluent style.
   */
  public static class SwitchCabinetZoneQueryParams extends HashMap<String, Object> {
    public SwitchCabinetZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSwitchCabinetResponse updateSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSwitchCabinetRequestData body);

  /**
   * Modify
   * Similar to <code>updateSwitchCabinet</code> but it also returns the http response headers .
   * Modify Cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSwitchCabinetResponse> updateSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSwitchCabinetRequestData body);


  /**
   * Modify
   * Modify Cabinet
   * Note, this is equivalent to the other <code>updateSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSwitchCabinetResponse updateSwitchCabinet(@Param("elid") String elid, UpdateSwitchCabinetRequestData body, @QueryMap(encoded=true) UpdateSwitchCabinetQueryParams queryParams);

  /**
  * Modify
  * Modify Cabinet
  * Note, this is equivalent to the other <code>updateSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSwitchCabinetResponse> updateSwitchCabinetWithHttpInfo(@Param("elid") String elid, UpdateSwitchCabinetRequestData body, @QueryMap(encoded=true) UpdateSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSwitchCabinet</code> method in a fluent style.
   */
  public static class UpdateSwitchCabinetQueryParams extends HashMap<String, Object> {
    public UpdateSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSwitchCabinetResponse updateSystemAttributesSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSwitchCabinetRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSwitchCabinet</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSwitchCabinetResponse> updateSystemAttributesSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSwitchCabinetRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSwitchCabinetResponse
   */
  @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSwitchCabinetResponse updateSystemAttributesSwitchCabinet(@Param("elid") String elid, UpdateSystemAttributesSwitchCabinetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSwitchCabinetQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSwitchCabinetResponse
      */
      @RequestLine("POST /api/rest/entity/switchCabinet/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSwitchCabinetResponse> updateSystemAttributesSwitchCabinetWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSwitchCabinetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSwitchCabinet</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSwitchCabinetQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSwitchCabinetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
