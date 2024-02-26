package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTypeChassisRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTypeChassisResponse;
import com.fntsoftware.businessgateway.entities.ChassisContractsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisContractsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.ChassisCustomL2CpeSegmentResponseData;
import com.fntsoftware.businessgateway.entities.ChassisDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ChassisDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ChassisFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisInstalledSubCardsRequest;
import com.fntsoftware.businessgateway.entities.ChassisInstalledSubCardsResponse;
import com.fntsoftware.businessgateway.entities.ChassisInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.ChassisInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.ChassisIpAddressesRequest;
import com.fntsoftware.businessgateway.entities.ChassisIpAddressesResponse;
import com.fntsoftware.businessgateway.entities.ChassisIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.ChassisIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.ChassisIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.ChassisIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.ChassisIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.ChassisIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.ChassisLocationRequest;
import com.fntsoftware.businessgateway.entities.ChassisLocationResponse;
import com.fntsoftware.businessgateway.entities.ChassisLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.ChassisNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.ChassisOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.ChassisOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.ChassisOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ChassisPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ChassisPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.ChassisPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.ChassisPhysicalPortsPowerRequest;
import com.fntsoftware.businessgateway.entities.ChassisPhysicalPortsPowerResponse;
import com.fntsoftware.businessgateway.entities.ChassisQueryExtendedRequest;
import com.fntsoftware.businessgateway.entities.ChassisQueryExtendedResponse;
import com.fntsoftware.businessgateway.entities.ChassisQueryExtendedScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.ChassisQueryExtendedScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.ChassisQueryExtendedScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.ChassisQueryExtendedScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.ChassisQueryRequest;
import com.fntsoftware.businessgateway.entities.ChassisQueryResponse;
import com.fntsoftware.businessgateway.entities.ChassisSlotRequestData;
import com.fntsoftware.businessgateway.entities.ChassisSlotResponseData;
import com.fntsoftware.businessgateway.entities.ChassisSwitchCabinetRequestData;
import com.fntsoftware.businessgateway.entities.ChassisSwitchCabinetResponseData;
import com.fntsoftware.businessgateway.entities.ChassisSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ChassisSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ChassisVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.ChassisVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.ChassisVlansAtSlotRequest;
import com.fntsoftware.businessgateway.entities.ChassisVlansAtSlotResponse;
import com.fntsoftware.businessgateway.entities.ChassisVlansRequest;
import com.fntsoftware.businessgateway.entities.ChassisVlansResponse;
import com.fntsoftware.businessgateway.entities.ChassisWarehouseRequestData;
import com.fntsoftware.businessgateway.entities.ChassisWarehouseResponseData;
import com.fntsoftware.businessgateway.entities.ChassisZoneRequestData;
import com.fntsoftware.businessgateway.entities.ChassisZoneResponseData;
import com.fntsoftware.businessgateway.entities.DeleteChassisRequestData;
import com.fntsoftware.businessgateway.entities.DeleteChassisResponse;
import com.fntsoftware.businessgateway.entities.MoveToCabinetChassisRequestData;
import com.fntsoftware.businessgateway.entities.MoveToCabinetChassisResponse;
import com.fntsoftware.businessgateway.entities.MoveToSlotChassisRequestData;
import com.fntsoftware.businessgateway.entities.MoveToSlotChassisResponse;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseChassisRequestData;
import com.fntsoftware.businessgateway.entities.MoveToWarehouseChassisResponse;
import com.fntsoftware.businessgateway.entities.MoveToZoneChassisRequestData;
import com.fntsoftware.businessgateway.entities.MoveToZoneChassisResponse;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetChassisRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInCabinetChassisResponse;
import com.fntsoftware.businessgateway.entities.PlaceInSlotChassisRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInSlotChassisResponse;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseChassisRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInWarehouseChassisResponse;
import com.fntsoftware.businessgateway.entities.PlaceInZoneChassisRequestData;
import com.fntsoftware.businessgateway.entities.PlaceInZoneChassisResponse;
import com.fntsoftware.businessgateway.entities.UpdateChassisRequestData;
import com.fntsoftware.businessgateway.entities.UpdateChassisResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesChassisRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesChassisResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ChassisApi extends ApiClient.Api {


  /**
   * Change type
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTypeChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTypeChassisResponse changeTypeChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeChassisRequestData body);

  /**
   * Change type
   * Similar to <code>changeTypeChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/changeType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTypeChassisResponse> changeTypeChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTypeChassisRequestData body);


  /**
   * Change type
   * 
   * Note, this is equivalent to the other <code>changeTypeChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTypeChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTypeChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/changeType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTypeChassisResponse changeTypeChassis(@Param("elid") String elid, ChangeTypeChassisRequestData body, @QueryMap(encoded=true) ChangeTypeChassisQueryParams queryParams);

  /**
  * Change type
  * 
  * Note, this is equivalent to the other <code>changeTypeChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTypeChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/changeType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTypeChassisResponse> changeTypeChassisWithHttpInfo(@Param("elid") String elid, ChangeTypeChassisRequestData body, @QueryMap(encoded=true) ChangeTypeChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTypeChassis</code> method in a fluent style.
   */
  public static class ChangeTypeChassisQueryParams extends HashMap<String, Object> {
    public ChangeTypeChassisQueryParams sessionId(final String value) {
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
   * @return ChassisContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisContractsResponseData chassisContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>chassisContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisContractsResponseData> chassisContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>chassisContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisContractsResponseData chassisContracts(@Param("elid") String elid, ChassisContractsRequestData body, @QueryMap(encoded=true) ChassisContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>chassisContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisContractsResponseData> chassisContractsWithHttpInfo(@Param("elid") String elid, ChassisContractsRequestData body, @QueryMap(encoded=true) ChassisContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisContracts</code> method in a fluent style.
   */
  public static class ChassisContractsQueryParams extends HashMap<String, Object> {
    public ChassisContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to L2-CPE Segment entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChassisCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisCustomL2CpeSegmentResponseData chassisCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisCustomL2CpeSegmentRequestData body);

  /**
   * Get relations to L2-CPE Segment entities
   * Similar to <code>chassisCustomL2CpeSegment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisCustomL2CpeSegmentResponseData> chassisCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisCustomL2CpeSegmentRequestData body);


  /**
   * Get relations to L2-CPE Segment entities
   * 
   * Note, this is equivalent to the other <code>chassisCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisCustomL2CpeSegmentResponseData chassisCustomL2CpeSegment(@Param("elid") String elid, ChassisCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) ChassisCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Get relations to L2-CPE Segment entities
  * 
  * Note, this is equivalent to the other <code>chassisCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisCustomL2CpeSegmentResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisCustomL2CpeSegmentResponseData> chassisCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, ChassisCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) ChassisCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class ChassisCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public ChassisCustomL2CpeSegmentQueryParams sessionId(final String value) {
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
   * @return ChassisDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisDeviceMasterResponseData chassisDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>chassisDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisDeviceMasterResponseData> chassisDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>chassisDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisDeviceMasterResponseData chassisDeviceMaster(@Param("elid") String elid, ChassisDeviceMasterRequestData body, @QueryMap(encoded=true) ChassisDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>chassisDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisDeviceMasterResponseData> chassisDeviceMasterWithHttpInfo(@Param("elid") String elid, ChassisDeviceMasterRequestData body, @QueryMap(encoded=true) ChassisDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisDeviceMaster</code> method in a fluent style.
   */
  public static class ChassisDeviceMasterQueryParams extends HashMap<String, Object> {
    public ChassisDeviceMasterQueryParams sessionId(final String value) {
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
   * @return ChassisFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisFrameContractsResponseData chassisFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>chassisFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisFrameContractsResponseData> chassisFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>chassisFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisFrameContractsResponseData chassisFrameContracts(@Param("elid") String elid, ChassisFrameContractsRequestData body, @QueryMap(encoded=true) ChassisFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>chassisFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisFrameContractsResponseData> chassisFrameContractsWithHttpInfo(@Param("elid") String elid, ChassisFrameContractsRequestData body, @QueryMap(encoded=true) ChassisFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisFrameContracts</code> method in a fluent style.
   */
  public static class ChassisFrameContractsQueryParams extends HashMap<String, Object> {
    public ChassisFrameContractsQueryParams sessionId(final String value) {
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
   * @return ChassisInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisInstalledSubCardsResponse chassisInstalledSubCards(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisInstalledSubCardsRequest body);

  /**
   * Query installed subcards
   * Similar to <code>chassisInstalledSubCards</code> but it also returns the http response headers .
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisInstalledSubCardsResponse> chassisInstalledSubCardsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisInstalledSubCardsRequest body);


  /**
   * Query installed subcards
   * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
   * Note, this is equivalent to the other <code>chassisInstalledSubCards</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisInstalledSubCardsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisInstalledSubCardsResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/InstalledSubCards?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisInstalledSubCardsResponse chassisInstalledSubCards(@Param("elid") String elid, ChassisInstalledSubCardsRequest body, @QueryMap(encoded=true) ChassisInstalledSubCardsQueryParams queryParams);

  /**
  * Query installed subcards
  * Queries installed subcards. Only direct subcards will be returned. Free slot positions will not be returned.
  * Note, this is equivalent to the other <code>chassisInstalledSubCards</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisInstalledSubCardsResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/InstalledSubCards?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisInstalledSubCardsResponse> chassisInstalledSubCardsWithHttpInfo(@Param("elid") String elid, ChassisInstalledSubCardsRequest body, @QueryMap(encoded=true) ChassisInstalledSubCardsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisInstalledSubCards</code> method in a fluent style.
   */
  public static class ChassisInstalledSubCardsQueryParams extends HashMap<String, Object> {
    public ChassisInstalledSubCardsQueryParams sessionId(final String value) {
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
   * @return ChassisInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisInterfacesResponseData chassisInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>chassisInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisInterfacesResponseData> chassisInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>chassisInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisInterfacesResponseData chassisInterfaces(@Param("elid") String elid, ChassisInterfacesRequestData body, @QueryMap(encoded=true) ChassisInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>chassisInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisInterfacesResponseData> chassisInterfacesWithHttpInfo(@Param("elid") String elid, ChassisInterfacesRequestData body, @QueryMap(encoded=true) ChassisInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisInterfaces</code> method in a fluent style.
   */
  public static class ChassisInterfacesQueryParams extends HashMap<String, Object> {
    public ChassisInterfacesQueryParams sessionId(final String value) {
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
   * @return ChassisIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisIpAddressesResponse chassisIpAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpAddressesRequest body);

  /**
   * IP addresses
   * Similar to <code>chassisIpAddresses</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisIpAddressesResponse> chassisIpAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpAddressesRequest body);


  /**
   * IP addresses
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>chassisIpAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisIpAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisIpAddressesResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/IpAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisIpAddressesResponse chassisIpAddresses(@Param("elid") String elid, ChassisIpAddressesRequest body, @QueryMap(encoded=true) ChassisIpAddressesQueryParams queryParams);

  /**
  * IP addresses
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>chassisIpAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisIpAddressesResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/IpAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisIpAddressesResponse> chassisIpAddressesWithHttpInfo(@Param("elid") String elid, ChassisIpAddressesRequest body, @QueryMap(encoded=true) ChassisIpAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisIpAddresses</code> method in a fluent style.
   */
  public static class ChassisIpAddressesQueryParams extends HashMap<String, Object> {
    public ChassisIpAddressesQueryParams sessionId(final String value) {
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
   * @return ChassisIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisIpv4AddressesResponseData chassisIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>chassisIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisIpv4AddressesResponseData> chassisIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>chassisIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisIpv4AddressesResponseData chassisIpv4Addresses(@Param("elid") String elid, ChassisIpv4AddressesRequestData body, @QueryMap(encoded=true) ChassisIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>chassisIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisIpv4AddressesResponseData> chassisIpv4AddressesWithHttpInfo(@Param("elid") String elid, ChassisIpv4AddressesRequestData body, @QueryMap(encoded=true) ChassisIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisIpv4Addresses</code> method in a fluent style.
   */
  public static class ChassisIpv4AddressesQueryParams extends HashMap<String, Object> {
    public ChassisIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return ChassisIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisIpv4NetrangesResponseData chassisIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>chassisIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisIpv4NetrangesResponseData> chassisIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>chassisIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisIpv4NetrangesResponseData chassisIpv4Netranges(@Param("elid") String elid, ChassisIpv4NetrangesRequestData body, @QueryMap(encoded=true) ChassisIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>chassisIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisIpv4NetrangesResponseData> chassisIpv4NetrangesWithHttpInfo(@Param("elid") String elid, ChassisIpv4NetrangesRequestData body, @QueryMap(encoded=true) ChassisIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisIpv4Netranges</code> method in a fluent style.
   */
  public static class ChassisIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public ChassisIpv4NetrangesQueryParams sessionId(final String value) {
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
   * @return ChassisIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisIpv4NetworksResponseData chassisIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>chassisIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisIpv4NetworksResponseData> chassisIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>chassisIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisIpv4NetworksResponseData chassisIpv4Networks(@Param("elid") String elid, ChassisIpv4NetworksRequestData body, @QueryMap(encoded=true) ChassisIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>chassisIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisIpv4NetworksResponseData> chassisIpv4NetworksWithHttpInfo(@Param("elid") String elid, ChassisIpv4NetworksRequestData body, @QueryMap(encoded=true) ChassisIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisIpv4Networks</code> method in a fluent style.
   */
  public static class ChassisIpv4NetworksQueryParams extends HashMap<String, Object> {
    public ChassisIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return ChassisLocationResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisLocationResponse chassisLocation(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisLocationRequest body);

  /**
   * Location
   * Similar to <code>chassisLocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Location?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisLocationResponse> chassisLocationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisLocationRequest body);


  /**
   * Location
   * 
   * Note, this is equivalent to the other <code>chassisLocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisLocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisLocationResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Location?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisLocationResponse chassisLocation(@Param("elid") String elid, ChassisLocationRequest body, @QueryMap(encoded=true) ChassisLocationQueryParams queryParams);

  /**
  * Location
  * 
  * Note, this is equivalent to the other <code>chassisLocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisLocationResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Location?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisLocationResponse> chassisLocationWithHttpInfo(@Param("elid") String elid, ChassisLocationRequest body, @QueryMap(encoded=true) ChassisLocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisLocation</code> method in a fluent style.
   */
  public static class ChassisLocationQueryParams extends HashMap<String, Object> {
    public ChassisLocationQueryParams sessionId(final String value) {
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
   * @return ChassisLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisLogicalPortsResponseData chassisLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>chassisLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisLogicalPortsResponseData> chassisLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>chassisLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisLogicalPortsResponseData chassisLogicalPorts(@Param("elid") String elid, ChassisLogicalPortsRequestData body, @QueryMap(encoded=true) ChassisLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>chassisLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisLogicalPortsResponseData> chassisLogicalPortsWithHttpInfo(@Param("elid") String elid, ChassisLogicalPortsRequestData body, @QueryMap(encoded=true) ChassisLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisLogicalPorts</code> method in a fluent style.
   */
  public static class ChassisLogicalPortsQueryParams extends HashMap<String, Object> {
    public ChassisLogicalPortsQueryParams sessionId(final String value) {
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
   * @return ChassisMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisMaintenanceContractsResponseData chassisMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>chassisMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisMaintenanceContractsResponseData> chassisMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>chassisMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisMaintenanceContractsResponseData chassisMaintenanceContracts(@Param("elid") String elid, ChassisMaintenanceContractsRequestData body, @QueryMap(encoded=true) ChassisMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>chassisMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisMaintenanceContractsResponseData> chassisMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ChassisMaintenanceContractsRequestData body, @QueryMap(encoded=true) ChassisMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisMaintenanceContracts</code> method in a fluent style.
   */
  public static class ChassisMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ChassisMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ChassisNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisNetworksAndNetrangesResponse chassisNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>chassisNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisNetworksAndNetrangesResponse> chassisNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>chassisNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisNetworksAndNetrangesResponse chassisNetworksAndNetranges(@Param("elid") String elid, ChassisNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ChassisNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>chassisNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisNetworksAndNetrangesResponse> chassisNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, ChassisNetworksAndNetrangesRequest body, @QueryMap(encoded=true) ChassisNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisNetworksAndNetranges</code> method in a fluent style.
   */
  public static class ChassisNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public ChassisNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return ChassisOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisOperatingSystemInstallationResponseData chassisOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>chassisOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisOperatingSystemInstallationResponseData> chassisOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>chassisOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisOperatingSystemInstallationResponseData chassisOperatingSystemInstallation(@Param("elid") String elid, ChassisOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ChassisOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>chassisOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisOperatingSystemInstallationResponseData> chassisOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, ChassisOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) ChassisOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class ChassisOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public ChassisOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return ChassisOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisOrganizationsResponseData chassisOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>chassisOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisOrganizationsResponseData> chassisOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>chassisOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisOrganizationsResponseData chassisOrganizations(@Param("elid") String elid, ChassisOrganizationsRequestData body, @QueryMap(encoded=true) ChassisOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>chassisOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisOrganizationsResponseData> chassisOrganizationsWithHttpInfo(@Param("elid") String elid, ChassisOrganizationsRequestData body, @QueryMap(encoded=true) ChassisOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisOrganizations</code> method in a fluent style.
   */
  public static class ChassisOrganizationsQueryParams extends HashMap<String, Object> {
    public ChassisOrganizationsQueryParams sessionId(final String value) {
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
   * @return ChassisPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisPersonGroupsResponseData chassisPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>chassisPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisPersonGroupsResponseData> chassisPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>chassisPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisPersonGroupsResponseData chassisPersonGroups(@Param("elid") String elid, ChassisPersonGroupsRequestData body, @QueryMap(encoded=true) ChassisPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>chassisPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisPersonGroupsResponseData> chassisPersonGroupsWithHttpInfo(@Param("elid") String elid, ChassisPersonGroupsRequestData body, @QueryMap(encoded=true) ChassisPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisPersonGroups</code> method in a fluent style.
   */
  public static class ChassisPersonGroupsQueryParams extends HashMap<String, Object> {
    public ChassisPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ChassisPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisPersonsResponseData chassisPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>chassisPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisPersonsResponseData> chassisPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>chassisPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisPersonsResponseData chassisPersons(@Param("elid") String elid, ChassisPersonsRequestData body, @QueryMap(encoded=true) ChassisPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>chassisPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisPersonsResponseData> chassisPersonsWithHttpInfo(@Param("elid") String elid, ChassisPersonsRequestData body, @QueryMap(encoded=true) ChassisPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisPersons</code> method in a fluent style.
   */
  public static class ChassisPersonsQueryParams extends HashMap<String, Object> {
    public ChassisPersonsQueryParams sessionId(final String value) {
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
   * @return ChassisPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisPhysicalPortsDataResponseData chassisPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>chassisPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisPhysicalPortsDataResponseData> chassisPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>chassisPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisPhysicalPortsDataResponseData chassisPhysicalPortsData(@Param("elid") String elid, ChassisPhysicalPortsDataRequestData body, @QueryMap(encoded=true) ChassisPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>chassisPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisPhysicalPortsDataResponseData> chassisPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, ChassisPhysicalPortsDataRequestData body, @QueryMap(encoded=true) ChassisPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisPhysicalPortsData</code> method in a fluent style.
   */
  public static class ChassisPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public ChassisPhysicalPortsDataQueryParams sessionId(final String value) {
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
   * @return ChassisPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisPhysicalPortsPowerResponse chassisPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPhysicalPortsPowerRequest body);

  /**
   * Query Power ports
   * Similar to <code>chassisPhysicalPortsPower</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisPhysicalPortsPowerResponse> chassisPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisPhysicalPortsPowerRequest body);


  /**
   * Query Power ports
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>chassisPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisPhysicalPortsPowerResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisPhysicalPortsPowerResponse chassisPhysicalPortsPower(@Param("elid") String elid, ChassisPhysicalPortsPowerRequest body, @QueryMap(encoded=true) ChassisPhysicalPortsPowerQueryParams queryParams);

  /**
  * Query Power ports
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>chassisPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisPhysicalPortsPowerResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisPhysicalPortsPowerResponse> chassisPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, ChassisPhysicalPortsPowerRequest body, @QueryMap(encoded=true) ChassisPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisPhysicalPortsPower</code> method in a fluent style.
   */
  public static class ChassisPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public ChassisPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ChassisQueryResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisQueryResponse chassisQuery(@Param("sessionId") String sessionId, ChassisQueryRequest body);

  /**
   * Basic query
   * Similar to <code>chassisQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisQueryResponse> chassisQueryWithHttpInfo(@Param("sessionId") String sessionId, ChassisQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>chassisQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisQueryResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisQueryResponse chassisQuery(ChassisQueryRequest body, @QueryMap(encoded=true) ChassisQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>chassisQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisQueryResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisQueryResponse> chassisQueryWithHttpInfo(ChassisQueryRequest body, @QueryMap(encoded=true) ChassisQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisQuery</code> method in a fluent style.
   */
  public static class ChassisQueryQueryParams extends HashMap<String, Object> {
    public ChassisQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ChassisQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisQueryExtendedResponse chassisQueryExtended(@Param("sessionId") String sessionId, ChassisQueryExtendedRequest body);

  /**
   * Extended query
   * Similar to <code>chassisQueryExtended</code> but it also returns the http response headers .
   * Queries linked master data and zone data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtended?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisQueryExtendedResponse> chassisQueryExtendedWithHttpInfo(@Param("sessionId") String sessionId, ChassisQueryExtendedRequest body);


  /**
   * Extended query
   * Queries linked master data and zone data
   * Note, this is equivalent to the other <code>chassisQueryExtended</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisQueryExtendedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisQueryExtendedResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtended?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisQueryExtendedResponse chassisQueryExtended(ChassisQueryExtendedRequest body, @QueryMap(encoded=true) ChassisQueryExtendedQueryParams queryParams);

  /**
  * Extended query
  * Queries linked master data and zone data
  * Note, this is equivalent to the other <code>chassisQueryExtended</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisQueryExtendedResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/queryExtended?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisQueryExtendedResponse> chassisQueryExtendedWithHttpInfo(ChassisQueryExtendedRequest body, @QueryMap(encoded=true) ChassisQueryExtendedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisQueryExtended</code> method in a fluent style.
   */
  public static class ChassisQueryExtendedQueryParams extends HashMap<String, Object> {
    public ChassisQueryExtendedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ChassisQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisQueryExtendedScrollFirstResponse chassisQueryExtendedScrollFirst(@Param("sessionId") String sessionId, ChassisQueryExtendedScrollFirstRequest body);

  /**
   * Extended query scroll first
   * Similar to <code>chassisQueryExtendedScrollFirst</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisQueryExtendedScrollFirstResponse> chassisQueryExtendedScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, ChassisQueryExtendedScrollFirstRequest body);


  /**
   * Extended query scroll first
   * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>chassisQueryExtendedScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisQueryExtendedScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisQueryExtendedScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisQueryExtendedScrollFirstResponse chassisQueryExtendedScrollFirst(ChassisQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ChassisQueryExtendedScrollFirstQueryParams queryParams);

  /**
  * Extended query scroll first
  * Queries linked master data and zone data. This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>chassisQueryExtendedScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisQueryExtendedScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisQueryExtendedScrollFirstResponse> chassisQueryExtendedScrollFirstWithHttpInfo(ChassisQueryExtendedScrollFirstRequest body, @QueryMap(encoded=true) ChassisQueryExtendedScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisQueryExtendedScrollFirst</code> method in a fluent style.
   */
  public static class ChassisQueryExtendedScrollFirstQueryParams extends HashMap<String, Object> {
    public ChassisQueryExtendedScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ChassisQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisQueryExtendedScrollMoreResponse chassisQueryExtendedScrollMore(@Param("sessionId") String sessionId, ChassisQueryExtendedScrollMoreRequest body);

  /**
   * Extended query scroll more
   * Similar to <code>chassisQueryExtendedScrollMore</code> but it also returns the http response headers .
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisQueryExtendedScrollMoreResponse> chassisQueryExtendedScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, ChassisQueryExtendedScrollMoreRequest body);


  /**
   * Extended query scroll more
   * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>chassisQueryExtendedScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisQueryExtendedScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisQueryExtendedScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisQueryExtendedScrollMoreResponse chassisQueryExtendedScrollMore(ChassisQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ChassisQueryExtendedScrollMoreQueryParams queryParams);

  /**
  * Extended query scroll more
  * Queries linked master data and zone data. This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>chassisQueryExtendedScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisQueryExtendedScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/queryExtendedScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisQueryExtendedScrollMoreResponse> chassisQueryExtendedScrollMoreWithHttpInfo(ChassisQueryExtendedScrollMoreRequest body, @QueryMap(encoded=true) ChassisQueryExtendedScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisQueryExtendedScrollMore</code> method in a fluent style.
   */
  public static class ChassisQueryExtendedScrollMoreQueryParams extends HashMap<String, Object> {
    public ChassisQueryExtendedScrollMoreQueryParams sessionId(final String value) {
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
   * @return ChassisSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisSlotResponseData chassisSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisSlotRequestData body);

  /**
   * Get relations to Slot entities
   * Similar to <code>chassisSlot</code> but it also returns the http response headers .
   * Relation query returns information about the slot position in which the device is installed
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Slot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisSlotResponseData> chassisSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisSlotRequestData body);


  /**
   * Get relations to Slot entities
   * Relation query returns information about the slot position in which the device is installed
   * Note, this is equivalent to the other <code>chassisSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisSlotResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Slot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisSlotResponseData chassisSlot(@Param("elid") String elid, ChassisSlotRequestData body, @QueryMap(encoded=true) ChassisSlotQueryParams queryParams);

  /**
  * Get relations to Slot entities
  * Relation query returns information about the slot position in which the device is installed
  * Note, this is equivalent to the other <code>chassisSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisSlotResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Slot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisSlotResponseData> chassisSlotWithHttpInfo(@Param("elid") String elid, ChassisSlotRequestData body, @QueryMap(encoded=true) ChassisSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisSlot</code> method in a fluent style.
   */
  public static class ChassisSlotQueryParams extends HashMap<String, Object> {
    public ChassisSlotQueryParams sessionId(final String value) {
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
   * @return ChassisSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisSwitchCabinetResponseData chassisSwitchCabinet(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisSwitchCabinetRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>chassisSwitchCabinet</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisSwitchCabinetResponseData> chassisSwitchCabinetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisSwitchCabinetRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>chassisSwitchCabinet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisSwitchCabinetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisSwitchCabinetResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/SwitchCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisSwitchCabinetResponseData chassisSwitchCabinet(@Param("elid") String elid, ChassisSwitchCabinetRequestData body, @QueryMap(encoded=true) ChassisSwitchCabinetQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>chassisSwitchCabinet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisSwitchCabinetResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/SwitchCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisSwitchCabinetResponseData> chassisSwitchCabinetWithHttpInfo(@Param("elid") String elid, ChassisSwitchCabinetRequestData body, @QueryMap(encoded=true) ChassisSwitchCabinetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisSwitchCabinet</code> method in a fluent style.
   */
  public static class ChassisSwitchCabinetQueryParams extends HashMap<String, Object> {
    public ChassisSwitchCabinetQueryParams sessionId(final String value) {
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
   * @return ChassisSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisSystemAttributesResponse chassisSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>chassisSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisSystemAttributesResponse> chassisSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>chassisSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisSystemAttributesResponse chassisSystemAttributes(@Param("elid") String elid, ChassisSystemAttributesRequest body, @QueryMap(encoded=true) ChassisSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>chassisSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisSystemAttributesResponse> chassisSystemAttributesWithHttpInfo(@Param("elid") String elid, ChassisSystemAttributesRequest body, @QueryMap(encoded=true) ChassisSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisSystemAttributes</code> method in a fluent style.
   */
  public static class ChassisSystemAttributesQueryParams extends HashMap<String, Object> {
    public ChassisSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ChassisVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisVirtualSwitchesResponseData chassisVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>chassisVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisVirtualSwitchesResponseData> chassisVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>chassisVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisVirtualSwitchesResponseData chassisVirtualSwitches(@Param("elid") String elid, ChassisVirtualSwitchesRequestData body, @QueryMap(encoded=true) ChassisVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>chassisVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisVirtualSwitchesResponseData> chassisVirtualSwitchesWithHttpInfo(@Param("elid") String elid, ChassisVirtualSwitchesRequestData body, @QueryMap(encoded=true) ChassisVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisVirtualSwitches</code> method in a fluent style.
   */
  public static class ChassisVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public ChassisVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return ChassisVlansResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisVlansResponse chassisVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisVlansRequest body);

  /**
   * VLANs
   * Similar to <code>chassisVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisVlansResponse> chassisVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>chassisVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisVlansResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisVlansResponse chassisVlans(@Param("elid") String elid, ChassisVlansRequest body, @QueryMap(encoded=true) ChassisVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>chassisVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisVlansResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisVlansResponse> chassisVlansWithHttpInfo(@Param("elid") String elid, ChassisVlansRequest body, @QueryMap(encoded=true) ChassisVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisVlans</code> method in a fluent style.
   */
  public static class ChassisVlansQueryParams extends HashMap<String, Object> {
    public ChassisVlansQueryParams sessionId(final String value) {
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
   * @return ChassisVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisVlansAtSlotResponse chassisVlansAtSlot(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisVlansAtSlotRequest body);

  /**
   * VLAN to slots
   * Similar to <code>chassisVlansAtSlot</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisVlansAtSlotResponse> chassisVlansAtSlotWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisVlansAtSlotRequest body);


  /**
   * VLAN to slots
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>chassisVlansAtSlot</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisVlansAtSlotQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisVlansAtSlotResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/VlansAtSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisVlansAtSlotResponse chassisVlansAtSlot(@Param("elid") String elid, ChassisVlansAtSlotRequest body, @QueryMap(encoded=true) ChassisVlansAtSlotQueryParams queryParams);

  /**
  * VLAN to slots
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>chassisVlansAtSlot</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisVlansAtSlotResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/VlansAtSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisVlansAtSlotResponse> chassisVlansAtSlotWithHttpInfo(@Param("elid") String elid, ChassisVlansAtSlotRequest body, @QueryMap(encoded=true) ChassisVlansAtSlotQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisVlansAtSlot</code> method in a fluent style.
   */
  public static class ChassisVlansAtSlotQueryParams extends HashMap<String, Object> {
    public ChassisVlansAtSlotQueryParams sessionId(final String value) {
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
   * @return ChassisWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisWarehouseResponseData chassisWarehouse(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisWarehouseRequestData body);

  /**
   * Get relations to Warehouse entities
   * Similar to <code>chassisWarehouse</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisWarehouseResponseData> chassisWarehouseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisWarehouseRequestData body);


  /**
   * Get relations to Warehouse entities
   * 
   * Note, this is equivalent to the other <code>chassisWarehouse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisWarehouseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisWarehouseResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Warehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisWarehouseResponseData chassisWarehouse(@Param("elid") String elid, ChassisWarehouseRequestData body, @QueryMap(encoded=true) ChassisWarehouseQueryParams queryParams);

  /**
  * Get relations to Warehouse entities
  * 
  * Note, this is equivalent to the other <code>chassisWarehouse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisWarehouseResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Warehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisWarehouseResponseData> chassisWarehouseWithHttpInfo(@Param("elid") String elid, ChassisWarehouseRequestData body, @QueryMap(encoded=true) ChassisWarehouseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisWarehouse</code> method in a fluent style.
   */
  public static class ChassisWarehouseQueryParams extends HashMap<String, Object> {
    public ChassisWarehouseQueryParams sessionId(final String value) {
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
   * @return ChassisZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChassisZoneResponseData chassisZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>chassisZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChassisZoneResponseData> chassisZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChassisZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>chassisZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChassisZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChassisZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChassisZoneResponseData chassisZone(@Param("elid") String elid, ChassisZoneRequestData body, @QueryMap(encoded=true) ChassisZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>chassisZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChassisZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChassisZoneResponseData> chassisZoneWithHttpInfo(@Param("elid") String elid, ChassisZoneRequestData body, @QueryMap(encoded=true) ChassisZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>chassisZone</code> method in a fluent style.
   */
  public static class ChassisZoneQueryParams extends HashMap<String, Object> {
    public ChassisZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete chassis
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteChassisResponse deleteChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteChassisRequestData body);

  /**
   * Delete
   * Similar to <code>deleteChassis</code> but it also returns the http response headers .
   * Delete chassis
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteChassisResponse> deleteChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteChassisRequestData body);


  /**
   * Delete
   * Delete chassis
   * Note, this is equivalent to the other <code>deleteChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteChassisResponse deleteChassis(@Param("elid") String elid, DeleteChassisRequestData body, @QueryMap(encoded=true) DeleteChassisQueryParams queryParams);

  /**
  * Delete
  * Delete chassis
  * Note, this is equivalent to the other <code>deleteChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteChassisResponse> deleteChassisWithHttpInfo(@Param("elid") String elid, DeleteChassisRequestData body, @QueryMap(encoded=true) DeleteChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteChassis</code> method in a fluent style.
   */
  public static class DeleteChassisQueryParams extends HashMap<String, Object> {
    public DeleteChassisQueryParams sessionId(final String value) {
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
   * @return MoveToCabinetChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToCabinetChassisResponse moveToCabinetChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetChassisRequestData body);

  /**
   * Move to cabinet
   * Similar to <code>moveToCabinetChassis</code> but it also returns the http response headers .
   * Move to switch cabinet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToCabinetChassisResponse> moveToCabinetChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToCabinetChassisRequestData body);


  /**
   * Move to cabinet
   * Move to switch cabinet
   * Note, this is equivalent to the other <code>moveToCabinetChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToCabinetChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToCabinetChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToCabinetChassisResponse moveToCabinetChassis(@Param("elid") String elid, MoveToCabinetChassisRequestData body, @QueryMap(encoded=true) MoveToCabinetChassisQueryParams queryParams);

  /**
  * Move to cabinet
  * Move to switch cabinet
  * Note, this is equivalent to the other <code>moveToCabinetChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToCabinetChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToCabinetChassisResponse> moveToCabinetChassisWithHttpInfo(@Param("elid") String elid, MoveToCabinetChassisRequestData body, @QueryMap(encoded=true) MoveToCabinetChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToCabinetChassis</code> method in a fluent style.
   */
  public static class MoveToCabinetChassisQueryParams extends HashMap<String, Object> {
    public MoveToCabinetChassisQueryParams sessionId(final String value) {
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
   * @return MoveToSlotChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToSlotChassisResponse moveToSlotChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotChassisRequestData body);

  /**
   * Move to slot
   * Similar to <code>moveToSlotChassis</code> but it also returns the http response headers .
   * Move to slot
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToSlotChassisResponse> moveToSlotChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToSlotChassisRequestData body);


  /**
   * Move to slot
   * Move to slot
   * Note, this is equivalent to the other <code>moveToSlotChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToSlotChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToSlotChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToSlotChassisResponse moveToSlotChassis(@Param("elid") String elid, MoveToSlotChassisRequestData body, @QueryMap(encoded=true) MoveToSlotChassisQueryParams queryParams);

  /**
  * Move to slot
  * Move to slot
  * Note, this is equivalent to the other <code>moveToSlotChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToSlotChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToSlotChassisResponse> moveToSlotChassisWithHttpInfo(@Param("elid") String elid, MoveToSlotChassisRequestData body, @QueryMap(encoded=true) MoveToSlotChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToSlotChassis</code> method in a fluent style.
   */
  public static class MoveToSlotChassisQueryParams extends HashMap<String, Object> {
    public MoveToSlotChassisQueryParams sessionId(final String value) {
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
   * @return MoveToWarehouseChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToWarehouseChassisResponse moveToWarehouseChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseChassisRequestData body);

  /**
   * Move to warehouse
   * Similar to <code>moveToWarehouseChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToWarehouseChassisResponse> moveToWarehouseChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToWarehouseChassisRequestData body);


  /**
   * Move to warehouse
   * 
   * Note, this is equivalent to the other <code>moveToWarehouseChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToWarehouseChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToWarehouseChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToWarehouseChassisResponse moveToWarehouseChassis(@Param("elid") String elid, MoveToWarehouseChassisRequestData body, @QueryMap(encoded=true) MoveToWarehouseChassisQueryParams queryParams);

  /**
  * Move to warehouse
  * 
  * Note, this is equivalent to the other <code>moveToWarehouseChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToWarehouseChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToWarehouseChassisResponse> moveToWarehouseChassisWithHttpInfo(@Param("elid") String elid, MoveToWarehouseChassisRequestData body, @QueryMap(encoded=true) MoveToWarehouseChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToWarehouseChassis</code> method in a fluent style.
   */
  public static class MoveToWarehouseChassisQueryParams extends HashMap<String, Object> {
    public MoveToWarehouseChassisQueryParams sessionId(final String value) {
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
   * @return MoveToZoneChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveToZoneChassisResponse moveToZoneChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneChassisRequestData body);

  /**
   * Move to zone
   * Similar to <code>moveToZoneChassis</code> but it also returns the http response headers .
   * Move to zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveToZoneChassisResponse> moveToZoneChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveToZoneChassisRequestData body);


  /**
   * Move to zone
   * Move to zone
   * Note, this is equivalent to the other <code>moveToZoneChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveToZoneChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveToZoneChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveToZoneChassisResponse moveToZoneChassis(@Param("elid") String elid, MoveToZoneChassisRequestData body, @QueryMap(encoded=true) MoveToZoneChassisQueryParams queryParams);

  /**
  * Move to zone
  * Move to zone
  * Note, this is equivalent to the other <code>moveToZoneChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveToZoneChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/moveToZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveToZoneChassisResponse> moveToZoneChassisWithHttpInfo(@Param("elid") String elid, MoveToZoneChassisRequestData body, @QueryMap(encoded=true) MoveToZoneChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveToZoneChassis</code> method in a fluent style.
   */
  public static class MoveToZoneChassisQueryParams extends HashMap<String, Object> {
    public MoveToZoneChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in cabinet
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInCabinetChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInCabinetChassisResponse placeInCabinetChassis(@Param("sessionId") String sessionId, PlaceInCabinetChassisRequestData body);

  /**
   * Place in cabinet
   * Similar to <code>placeInCabinetChassis</code> but it also returns the http response headers .
   * Place in switch cabinet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInCabinet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInCabinetChassisResponse> placeInCabinetChassisWithHttpInfo(@Param("sessionId") String sessionId, PlaceInCabinetChassisRequestData body);


  /**
   * Place in cabinet
   * Place in switch cabinet
   * Note, this is equivalent to the other <code>placeInCabinetChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInCabinetChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInCabinetChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInCabinet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInCabinetChassisResponse placeInCabinetChassis(PlaceInCabinetChassisRequestData body, @QueryMap(encoded=true) PlaceInCabinetChassisQueryParams queryParams);

  /**
  * Place in cabinet
  * Place in switch cabinet
  * Note, this is equivalent to the other <code>placeInCabinetChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInCabinetChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/placeInCabinet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInCabinetChassisResponse> placeInCabinetChassisWithHttpInfo(PlaceInCabinetChassisRequestData body, @QueryMap(encoded=true) PlaceInCabinetChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInCabinetChassis</code> method in a fluent style.
   */
  public static class PlaceInCabinetChassisQueryParams extends HashMap<String, Object> {
    public PlaceInCabinetChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInSlotChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInSlotChassisResponse placeInSlotChassis(@Param("sessionId") String sessionId, PlaceInSlotChassisRequestData body);

  /**
   * Place in slot
   * Similar to <code>placeInSlotChassis</code> but it also returns the http response headers .
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInSlot?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInSlotChassisResponse> placeInSlotChassisWithHttpInfo(@Param("sessionId") String sessionId, PlaceInSlotChassisRequestData body);


  /**
   * Place in slot
   * Places a device (super) in a slot. The device to be placed must be flagged as a card.
   * Note, this is equivalent to the other <code>placeInSlotChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInSlotChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInSlotChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInSlot?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInSlotChassisResponse placeInSlotChassis(PlaceInSlotChassisRequestData body, @QueryMap(encoded=true) PlaceInSlotChassisQueryParams queryParams);

  /**
  * Place in slot
  * Places a device (super) in a slot. The device to be placed must be flagged as a card.
  * Note, this is equivalent to the other <code>placeInSlotChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInSlotChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/placeInSlot?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInSlotChassisResponse> placeInSlotChassisWithHttpInfo(PlaceInSlotChassisRequestData body, @QueryMap(encoded=true) PlaceInSlotChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInSlotChassis</code> method in a fluent style.
   */
  public static class PlaceInSlotChassisQueryParams extends HashMap<String, Object> {
    public PlaceInSlotChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in warehouse
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInWarehouseChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInWarehouseChassisResponse placeInWarehouseChassis(@Param("sessionId") String sessionId, PlaceInWarehouseChassisRequestData body);

  /**
   * Place in warehouse
   * Similar to <code>placeInWarehouseChassis</code> but it also returns the http response headers .
   * Place in warehouse
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInWarehouse?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInWarehouseChassisResponse> placeInWarehouseChassisWithHttpInfo(@Param("sessionId") String sessionId, PlaceInWarehouseChassisRequestData body);


  /**
   * Place in warehouse
   * Place in warehouse
   * Note, this is equivalent to the other <code>placeInWarehouseChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInWarehouseChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInWarehouseChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInWarehouse?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInWarehouseChassisResponse placeInWarehouseChassis(PlaceInWarehouseChassisRequestData body, @QueryMap(encoded=true) PlaceInWarehouseChassisQueryParams queryParams);

  /**
  * Place in warehouse
  * Place in warehouse
  * Note, this is equivalent to the other <code>placeInWarehouseChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInWarehouseChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/placeInWarehouse?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInWarehouseChassisResponse> placeInWarehouseChassisWithHttpInfo(PlaceInWarehouseChassisRequestData body, @QueryMap(encoded=true) PlaceInWarehouseChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInWarehouseChassis</code> method in a fluent style.
   */
  public static class PlaceInWarehouseChassisQueryParams extends HashMap<String, Object> {
    public PlaceInWarehouseChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Place in zone
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlaceInZoneChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlaceInZoneChassisResponse placeInZoneChassis(@Param("sessionId") String sessionId, PlaceInZoneChassisRequestData body);

  /**
   * Place in zone
   * Similar to <code>placeInZoneChassis</code> but it also returns the http response headers .
   * Place in zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlaceInZoneChassisResponse> placeInZoneChassisWithHttpInfo(@Param("sessionId") String sessionId, PlaceInZoneChassisRequestData body);


  /**
   * Place in zone
   * Place in zone
   * Note, this is equivalent to the other <code>placeInZoneChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlaceInZoneChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlaceInZoneChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/placeInZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlaceInZoneChassisResponse placeInZoneChassis(PlaceInZoneChassisRequestData body, @QueryMap(encoded=true) PlaceInZoneChassisQueryParams queryParams);

  /**
  * Place in zone
  * Place in zone
  * Note, this is equivalent to the other <code>placeInZoneChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlaceInZoneChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/placeInZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlaceInZoneChassisResponse> placeInZoneChassisWithHttpInfo(PlaceInZoneChassisRequestData body, @QueryMap(encoded=true) PlaceInZoneChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>placeInZoneChassis</code> method in a fluent style.
   */
  public static class PlaceInZoneChassisQueryParams extends HashMap<String, Object> {
    public PlaceInZoneChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify chassis
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateChassisResponse updateChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateChassisRequestData body);

  /**
   * Modify
   * Similar to <code>updateChassis</code> but it also returns the http response headers .
   * Modify chassis
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateChassisResponse> updateChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateChassisRequestData body);


  /**
   * Modify
   * Modify chassis
   * Note, this is equivalent to the other <code>updateChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateChassisResponse updateChassis(@Param("elid") String elid, UpdateChassisRequestData body, @QueryMap(encoded=true) UpdateChassisQueryParams queryParams);

  /**
  * Modify
  * Modify chassis
  * Note, this is equivalent to the other <code>updateChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateChassisResponse> updateChassisWithHttpInfo(@Param("elid") String elid, UpdateChassisRequestData body, @QueryMap(encoded=true) UpdateChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateChassis</code> method in a fluent style.
   */
  public static class UpdateChassisQueryParams extends HashMap<String, Object> {
    public UpdateChassisQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesChassisResponse updateSystemAttributesChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesChassisRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesChassis</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesChassisResponse> updateSystemAttributesChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesChassisRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesChassisResponse
   */
  @RequestLine("POST /api/rest/entity/chassis/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesChassisResponse updateSystemAttributesChassis(@Param("elid") String elid, UpdateSystemAttributesChassisRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesChassisQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesChassisResponse
      */
      @RequestLine("POST /api/rest/entity/chassis/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesChassisResponse> updateSystemAttributesChassisWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesChassisRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesChassis</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesChassisQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesChassisQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
