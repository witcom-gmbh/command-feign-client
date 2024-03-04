package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.BearerBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.BearerBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.BearerBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.BearerBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.BearerContractsRequestData;
import com.fntsoftware.businessgateway.entities.BearerContractsResponseData;
import com.fntsoftware.businessgateway.entities.BearerEndZoneRequestData;
import com.fntsoftware.businessgateway.entities.BearerEndZoneResponseData;
import com.fntsoftware.businessgateway.entities.BearerFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.BearerFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.BearerHardwareRequest;
import com.fntsoftware.businessgateway.entities.BearerHardwareResponse;
import com.fntsoftware.businessgateway.entities.BearerHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.BearerHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.BearerLogicalPortsEndRequestData;
import com.fntsoftware.businessgateway.entities.BearerLogicalPortsEndResponseData;
import com.fntsoftware.businessgateway.entities.BearerLogicalPortsStartRequestData;
import com.fntsoftware.businessgateway.entities.BearerLogicalPortsStartResponseData;
import com.fntsoftware.businessgateway.entities.BearerMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.BearerMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.BearerMultisectionProtectionRequestData;
import com.fntsoftware.businessgateway.entities.BearerMultisectionProtectionResponseData;
import com.fntsoftware.businessgateway.entities.BearerOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.BearerOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.BearerPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.BearerPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.BearerPersonsRequestData;
import com.fntsoftware.businessgateway.entities.BearerPersonsResponseData;
import com.fntsoftware.businessgateway.entities.BearerPredecessorRequestData;
import com.fntsoftware.businessgateway.entities.BearerPredecessorResponseData;
import com.fntsoftware.businessgateway.entities.BearerQueryRequest;
import com.fntsoftware.businessgateway.entities.BearerQueryResponse;
import com.fntsoftware.businessgateway.entities.BearerRoutesRequestData;
import com.fntsoftware.businessgateway.entities.BearerRoutesResponseData;
import com.fntsoftware.businessgateway.entities.BearerServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.BearerServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.BearerStartZoneRequestData;
import com.fntsoftware.businessgateway.entities.BearerStartZoneResponseData;
import com.fntsoftware.businessgateway.entities.BearerStructuresForSpecialServicesRequest;
import com.fntsoftware.businessgateway.entities.BearerStructuresForSpecialServicesResponse;
import com.fntsoftware.businessgateway.entities.BearerStructuresRequest;
import com.fntsoftware.businessgateway.entities.BearerStructuresResponse;
import com.fntsoftware.businessgateway.entities.BearerSuccessorsRequestData;
import com.fntsoftware.businessgateway.entities.BearerSuccessorsResponseData;
import com.fntsoftware.businessgateway.entities.BearerSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.BearerSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ChangeServiceTypeBearerRequestData;
import com.fntsoftware.businessgateway.entities.ChangeServiceTypeBearerResponse;
import com.fntsoftware.businessgateway.entities.CreateBearerRequestData;
import com.fntsoftware.businessgateway.entities.CreateBearerResponse;
import com.fntsoftware.businessgateway.entities.CreateImaBearerRequestData;
import com.fntsoftware.businessgateway.entities.CreateImaBearerResponse;
import com.fntsoftware.businessgateway.entities.DeleteBearerRequestData;
import com.fntsoftware.businessgateway.entities.DeleteBearerResponse;
import com.fntsoftware.businessgateway.entities.LoopInNetNodeBearerRequestData;
import com.fntsoftware.businessgateway.entities.LoopInNetNodeBearerResponse;
import com.fntsoftware.businessgateway.entities.LoopOutNetNodeBearerRequestData;
import com.fntsoftware.businessgateway.entities.LoopOutNetNodeBearerResponse;
import com.fntsoftware.businessgateway.entities.UpdateAsiBearerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateAsiBearerResponse;
import com.fntsoftware.businessgateway.entities.UpdateBearerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateBearerResponse;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataBearerRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataBearerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSpvcBearerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSpvcBearerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSpvpBearerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSpvpBearerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesBearerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesBearerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface BearerApi extends ApiClient.Api {


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerBandwidthBookingForPacketDataServiceResponse bearerBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>bearerBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerBandwidthBookingForPacketDataServiceResponse> bearerBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service
   * Note, this is equivalent to the other <code>bearerBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerBandwidthBookingForPacketDataServiceResponse bearerBandwidthBookingForPacketDataService(@Param("elid") String elid, BearerBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) BearerBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service
  * Note, this is equivalent to the other <code>bearerBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerBandwidthBookingForPacketDataServiceResponse> bearerBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, BearerBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) BearerBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class BearerBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public BearerBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerBandwidthForPacketDataServiceResponse bearerBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>bearerBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerBandwidthForPacketDataServiceResponse> bearerBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service
   * Note, this is equivalent to the other <code>bearerBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerBandwidthForPacketDataServiceResponse bearerBandwidthForPacketDataService(@Param("elid") String elid, BearerBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) BearerBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service
  * Note, this is equivalent to the other <code>bearerBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerBandwidthForPacketDataServiceResponse> bearerBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, BearerBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) BearerBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class BearerBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public BearerBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return BearerContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerContractsResponseData bearerContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>bearerContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerContractsResponseData> bearerContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>bearerContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerContractsResponseData bearerContracts(@Param("elid") String elid, BearerContractsRequestData body, @QueryMap(encoded=true) BearerContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>bearerContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerContractsResponseData> bearerContractsWithHttpInfo(@Param("elid") String elid, BearerContractsRequestData body, @QueryMap(encoded=true) BearerContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerContracts</code> method in a fluent style.
   */
  public static class BearerContractsQueryParams extends HashMap<String, Object> {
    public BearerContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to End zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerEndZoneResponseData bearerEndZone(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerEndZoneRequestData body);

  /**
   * Get relations to End zone entities
   * Similar to <code>bearerEndZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerEndZoneResponseData> bearerEndZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerEndZoneRequestData body);


  /**
   * Get relations to End zone entities
   * 
   * Note, this is equivalent to the other <code>bearerEndZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerEndZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerEndZoneResponseData bearerEndZone(@Param("elid") String elid, BearerEndZoneRequestData body, @QueryMap(encoded=true) BearerEndZoneQueryParams queryParams);

  /**
  * Get relations to End zone entities
  * 
  * Note, this is equivalent to the other <code>bearerEndZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerEndZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/EndZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerEndZoneResponseData> bearerEndZoneWithHttpInfo(@Param("elid") String elid, BearerEndZoneRequestData body, @QueryMap(encoded=true) BearerEndZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerEndZone</code> method in a fluent style.
   */
  public static class BearerEndZoneQueryParams extends HashMap<String, Object> {
    public BearerEndZoneQueryParams sessionId(final String value) {
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
   * @return BearerFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerFrameContractsResponseData bearerFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>bearerFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerFrameContractsResponseData> bearerFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>bearerFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerFrameContractsResponseData bearerFrameContracts(@Param("elid") String elid, BearerFrameContractsRequestData body, @QueryMap(encoded=true) BearerFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>bearerFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerFrameContractsResponseData> bearerFrameContractsWithHttpInfo(@Param("elid") String elid, BearerFrameContractsRequestData body, @QueryMap(encoded=true) BearerFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerFrameContracts</code> method in a fluent style.
   */
  public static class BearerFrameContractsQueryParams extends HashMap<String, Object> {
    public BearerFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Hardware query
   * Supplies the hardware that belongs to the selected bearer
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerHardwareResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Hardware?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerHardwareResponse bearerHardware(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerHardwareRequest body);

  /**
   * Hardware query
   * Similar to <code>bearerHardware</code> but it also returns the http response headers .
   * Supplies the hardware that belongs to the selected bearer
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Hardware?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerHardwareResponse> bearerHardwareWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerHardwareRequest body);


  /**
   * Hardware query
   * Supplies the hardware that belongs to the selected bearer
   * Note, this is equivalent to the other <code>bearerHardware</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerHardwareQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerHardwareResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Hardware?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerHardwareResponse bearerHardware(@Param("elid") String elid, BearerHardwareRequest body, @QueryMap(encoded=true) BearerHardwareQueryParams queryParams);

  /**
  * Hardware query
  * Supplies the hardware that belongs to the selected bearer
  * Note, this is equivalent to the other <code>bearerHardware</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerHardwareResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Hardware?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerHardwareResponse> bearerHardwareWithHttpInfo(@Param("elid") String elid, BearerHardwareRequest body, @QueryMap(encoded=true) BearerHardwareQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerHardware</code> method in a fluent style.
   */
  public static class BearerHardwareQueryParams extends HashMap<String, Object> {
    public BearerHardwareQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Higher level services entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerHigherLevelServicesResponseData bearerHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>bearerHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerHigherLevelServicesResponseData> bearerHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>bearerHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerHigherLevelServicesResponseData bearerHigherLevelServices(@Param("elid") String elid, BearerHigherLevelServicesRequestData body, @QueryMap(encoded=true) BearerHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>bearerHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerHigherLevelServicesResponseData> bearerHigherLevelServicesWithHttpInfo(@Param("elid") String elid, BearerHigherLevelServicesRequestData body, @QueryMap(encoded=true) BearerHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerHigherLevelServices</code> method in a fluent style.
   */
  public static class BearerHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public BearerHigherLevelServicesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port End point entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerLogicalPortsEndResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerLogicalPortsEndResponseData bearerLogicalPortsEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerLogicalPortsEndRequestData body);

  /**
   * Get relations to Logical port End point entities
   * Similar to <code>bearerLogicalPortsEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerLogicalPortsEndResponseData> bearerLogicalPortsEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerLogicalPortsEndRequestData body);


  /**
   * Get relations to Logical port End point entities
   * 
   * Note, this is equivalent to the other <code>bearerLogicalPortsEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerLogicalPortsEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerLogicalPortsEndResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerLogicalPortsEndResponseData bearerLogicalPortsEnd(@Param("elid") String elid, BearerLogicalPortsEndRequestData body, @QueryMap(encoded=true) BearerLogicalPortsEndQueryParams queryParams);

  /**
  * Get relations to Logical port End point entities
  * 
  * Note, this is equivalent to the other <code>bearerLogicalPortsEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerLogicalPortsEndResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerLogicalPortsEndResponseData> bearerLogicalPortsEndWithHttpInfo(@Param("elid") String elid, BearerLogicalPortsEndRequestData body, @QueryMap(encoded=true) BearerLogicalPortsEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerLogicalPortsEnd</code> method in a fluent style.
   */
  public static class BearerLogicalPortsEndQueryParams extends HashMap<String, Object> {
    public BearerLogicalPortsEndQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port Starting point entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerLogicalPortsStartResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerLogicalPortsStartResponseData bearerLogicalPortsStart(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerLogicalPortsStartRequestData body);

  /**
   * Get relations to Logical port Starting point entities
   * Similar to <code>bearerLogicalPortsStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerLogicalPortsStartResponseData> bearerLogicalPortsStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerLogicalPortsStartRequestData body);


  /**
   * Get relations to Logical port Starting point entities
   * 
   * Note, this is equivalent to the other <code>bearerLogicalPortsStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerLogicalPortsStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerLogicalPortsStartResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerLogicalPortsStartResponseData bearerLogicalPortsStart(@Param("elid") String elid, BearerLogicalPortsStartRequestData body, @QueryMap(encoded=true) BearerLogicalPortsStartQueryParams queryParams);

  /**
  * Get relations to Logical port Starting point entities
  * 
  * Note, this is equivalent to the other <code>bearerLogicalPortsStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerLogicalPortsStartResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/LogicalPortsStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerLogicalPortsStartResponseData> bearerLogicalPortsStartWithHttpInfo(@Param("elid") String elid, BearerLogicalPortsStartRequestData body, @QueryMap(encoded=true) BearerLogicalPortsStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerLogicalPortsStart</code> method in a fluent style.
   */
  public static class BearerLogicalPortsStartQueryParams extends HashMap<String, Object> {
    public BearerLogicalPortsStartQueryParams sessionId(final String value) {
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
   * @return BearerMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerMaintenanceContractsResponseData bearerMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>bearerMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerMaintenanceContractsResponseData> bearerMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>bearerMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerMaintenanceContractsResponseData bearerMaintenanceContracts(@Param("elid") String elid, BearerMaintenanceContractsRequestData body, @QueryMap(encoded=true) BearerMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>bearerMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerMaintenanceContractsResponseData> bearerMaintenanceContractsWithHttpInfo(@Param("elid") String elid, BearerMaintenanceContractsRequestData body, @QueryMap(encoded=true) BearerMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerMaintenanceContracts</code> method in a fluent style.
   */
  public static class BearerMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public BearerMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Multisection Protection entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerMultisectionProtectionResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/MultisectionProtection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerMultisectionProtectionResponseData bearerMultisectionProtection(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerMultisectionProtectionRequestData body);

  /**
   * Get relations to Multisection Protection entities
   * Similar to <code>bearerMultisectionProtection</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/MultisectionProtection?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerMultisectionProtectionResponseData> bearerMultisectionProtectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerMultisectionProtectionRequestData body);


  /**
   * Get relations to Multisection Protection entities
   * 
   * Note, this is equivalent to the other <code>bearerMultisectionProtection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerMultisectionProtectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerMultisectionProtectionResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/MultisectionProtection?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerMultisectionProtectionResponseData bearerMultisectionProtection(@Param("elid") String elid, BearerMultisectionProtectionRequestData body, @QueryMap(encoded=true) BearerMultisectionProtectionQueryParams queryParams);

  /**
  * Get relations to Multisection Protection entities
  * 
  * Note, this is equivalent to the other <code>bearerMultisectionProtection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerMultisectionProtectionResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/MultisectionProtection?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerMultisectionProtectionResponseData> bearerMultisectionProtectionWithHttpInfo(@Param("elid") String elid, BearerMultisectionProtectionRequestData body, @QueryMap(encoded=true) BearerMultisectionProtectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerMultisectionProtection</code> method in a fluent style.
   */
  public static class BearerMultisectionProtectionQueryParams extends HashMap<String, Object> {
    public BearerMultisectionProtectionQueryParams sessionId(final String value) {
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
   * @return BearerOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerOrganizationsResponseData bearerOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>bearerOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerOrganizationsResponseData> bearerOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>bearerOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerOrganizationsResponseData bearerOrganizations(@Param("elid") String elid, BearerOrganizationsRequestData body, @QueryMap(encoded=true) BearerOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>bearerOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerOrganizationsResponseData> bearerOrganizationsWithHttpInfo(@Param("elid") String elid, BearerOrganizationsRequestData body, @QueryMap(encoded=true) BearerOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerOrganizations</code> method in a fluent style.
   */
  public static class BearerOrganizationsQueryParams extends HashMap<String, Object> {
    public BearerOrganizationsQueryParams sessionId(final String value) {
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
   * @return BearerPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerPersonGroupsResponseData bearerPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>bearerPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerPersonGroupsResponseData> bearerPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>bearerPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerPersonGroupsResponseData bearerPersonGroups(@Param("elid") String elid, BearerPersonGroupsRequestData body, @QueryMap(encoded=true) BearerPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>bearerPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerPersonGroupsResponseData> bearerPersonGroupsWithHttpInfo(@Param("elid") String elid, BearerPersonGroupsRequestData body, @QueryMap(encoded=true) BearerPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerPersonGroups</code> method in a fluent style.
   */
  public static class BearerPersonGroupsQueryParams extends HashMap<String, Object> {
    public BearerPersonGroupsQueryParams sessionId(final String value) {
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
   * @return BearerPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerPersonsResponseData bearerPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>bearerPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerPersonsResponseData> bearerPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>bearerPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerPersonsResponseData bearerPersons(@Param("elid") String elid, BearerPersonsRequestData body, @QueryMap(encoded=true) BearerPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>bearerPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerPersonsResponseData> bearerPersonsWithHttpInfo(@Param("elid") String elid, BearerPersonsRequestData body, @QueryMap(encoded=true) BearerPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerPersons</code> method in a fluent style.
   */
  public static class BearerPersonsQueryParams extends HashMap<String, Object> {
    public BearerPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Predecessor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerPredecessorResponseData bearerPredecessor(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerPredecessorRequestData body);

  /**
   * Get relations to Predecessor entities
   * Similar to <code>bearerPredecessor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerPredecessorResponseData> bearerPredecessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerPredecessorRequestData body);


  /**
   * Get relations to Predecessor entities
   * 
   * Note, this is equivalent to the other <code>bearerPredecessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerPredecessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerPredecessorResponseData bearerPredecessor(@Param("elid") String elid, BearerPredecessorRequestData body, @QueryMap(encoded=true) BearerPredecessorQueryParams queryParams);

  /**
  * Get relations to Predecessor entities
  * 
  * Note, this is equivalent to the other <code>bearerPredecessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerPredecessorResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Predecessor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerPredecessorResponseData> bearerPredecessorWithHttpInfo(@Param("elid") String elid, BearerPredecessorRequestData body, @QueryMap(encoded=true) BearerPredecessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerPredecessor</code> method in a fluent style.
   */
  public static class BearerPredecessorQueryParams extends HashMap<String, Object> {
    public BearerPredecessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return BearerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerQueryResponse bearerQuery(@Param("sessionId") String sessionId, BearerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>bearerQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerQueryResponse> bearerQueryWithHttpInfo(@Param("sessionId") String sessionId, BearerQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>bearerQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerQueryResponse bearerQuery(BearerQueryRequest body, @QueryMap(encoded=true) BearerQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>bearerQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerQueryResponse> bearerQueryWithHttpInfo(BearerQueryRequest body, @QueryMap(encoded=true) BearerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerQuery</code> method in a fluent style.
   */
  public static class BearerQueryQueryParams extends HashMap<String, Object> {
    public BearerQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Routes entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerRoutesResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Routes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerRoutesResponseData bearerRoutes(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerRoutesRequestData body);

  /**
   * Get relations to Routes entities
   * Similar to <code>bearerRoutes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Routes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerRoutesResponseData> bearerRoutesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerRoutesRequestData body);


  /**
   * Get relations to Routes entities
   * 
   * Note, this is equivalent to the other <code>bearerRoutes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerRoutesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerRoutesResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Routes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerRoutesResponseData bearerRoutes(@Param("elid") String elid, BearerRoutesRequestData body, @QueryMap(encoded=true) BearerRoutesQueryParams queryParams);

  /**
  * Get relations to Routes entities
  * 
  * Note, this is equivalent to the other <code>bearerRoutes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerRoutesResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Routes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerRoutesResponseData> bearerRoutesWithHttpInfo(@Param("elid") String elid, BearerRoutesRequestData body, @QueryMap(encoded=true) BearerRoutesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerRoutes</code> method in a fluent style.
   */
  public static class BearerRoutesQueryParams extends HashMap<String, Object> {
    public BearerRoutesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service type definition entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerServiceTypeDefinitionResponseData bearerServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>bearerServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerServiceTypeDefinitionResponseData> bearerServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>bearerServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerServiceTypeDefinitionResponseData bearerServiceTypeDefinition(@Param("elid") String elid, BearerServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) BearerServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>bearerServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerServiceTypeDefinitionResponseData> bearerServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, BearerServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) BearerServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerServiceTypeDefinition</code> method in a fluent style.
   */
  public static class BearerServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public BearerServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Start zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerStartZoneResponseData bearerStartZone(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerStartZoneRequestData body);

  /**
   * Get relations to Start zone entities
   * Similar to <code>bearerStartZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerStartZoneResponseData> bearerStartZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerStartZoneRequestData body);


  /**
   * Get relations to Start zone entities
   * 
   * Note, this is equivalent to the other <code>bearerStartZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerStartZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerStartZoneResponseData bearerStartZone(@Param("elid") String elid, BearerStartZoneRequestData body, @QueryMap(encoded=true) BearerStartZoneQueryParams queryParams);

  /**
  * Get relations to Start zone entities
  * 
  * Note, this is equivalent to the other <code>bearerStartZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerStartZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/StartZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerStartZoneResponseData> bearerStartZoneWithHttpInfo(@Param("elid") String elid, BearerStartZoneRequestData body, @QueryMap(encoded=true) BearerStartZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerStartZone</code> method in a fluent style.
   */
  public static class BearerStartZoneQueryParams extends HashMap<String, Object> {
    public BearerStartZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query structures
   * Queries the structures from one object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerStructuresResponse bearerStructures(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerStructuresRequest body);

  /**
   * Query structures
   * Similar to <code>bearerStructures</code> but it also returns the http response headers .
   * Queries the structures from one object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerStructuresResponse> bearerStructuresWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerStructuresRequest body);


  /**
   * Query structures
   * Queries the structures from one object
   * Note, this is equivalent to the other <code>bearerStructures</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerStructuresQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Structures?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerStructuresResponse bearerStructures(@Param("elid") String elid, BearerStructuresRequest body, @QueryMap(encoded=true) BearerStructuresQueryParams queryParams);

  /**
  * Query structures
  * Queries the structures from one object
  * Note, this is equivalent to the other <code>bearerStructures</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerStructuresResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Structures?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerStructuresResponse> bearerStructuresWithHttpInfo(@Param("elid") String elid, BearerStructuresRequest body, @QueryMap(encoded=true) BearerStructuresQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerStructures</code> method in a fluent style.
   */
  public static class BearerStructuresQueryParams extends HashMap<String, Object> {
    public BearerStructuresQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query structures PVP, PVC, ASI
   * Queries the structures from one object of type PVP, PVC or ASI
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerStructuresForSpecialServicesResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/StructuresForSpecialServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerStructuresForSpecialServicesResponse bearerStructuresForSpecialServices(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerStructuresForSpecialServicesRequest body);

  /**
   * Query structures PVP, PVC, ASI
   * Similar to <code>bearerStructuresForSpecialServices</code> but it also returns the http response headers .
   * Queries the structures from one object of type PVP, PVC or ASI
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/StructuresForSpecialServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerStructuresForSpecialServicesResponse> bearerStructuresForSpecialServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerStructuresForSpecialServicesRequest body);


  /**
   * Query structures PVP, PVC, ASI
   * Queries the structures from one object of type PVP, PVC or ASI
   * Note, this is equivalent to the other <code>bearerStructuresForSpecialServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerStructuresForSpecialServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerStructuresForSpecialServicesResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/StructuresForSpecialServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerStructuresForSpecialServicesResponse bearerStructuresForSpecialServices(@Param("elid") String elid, BearerStructuresForSpecialServicesRequest body, @QueryMap(encoded=true) BearerStructuresForSpecialServicesQueryParams queryParams);

  /**
  * Query structures PVP, PVC, ASI
  * Queries the structures from one object of type PVP, PVC or ASI
  * Note, this is equivalent to the other <code>bearerStructuresForSpecialServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerStructuresForSpecialServicesResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/StructuresForSpecialServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerStructuresForSpecialServicesResponse> bearerStructuresForSpecialServicesWithHttpInfo(@Param("elid") String elid, BearerStructuresForSpecialServicesRequest body, @QueryMap(encoded=true) BearerStructuresForSpecialServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerStructuresForSpecialServices</code> method in a fluent style.
   */
  public static class BearerStructuresForSpecialServicesQueryParams extends HashMap<String, Object> {
    public BearerStructuresForSpecialServicesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Successor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return BearerSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerSuccessorsResponseData bearerSuccessors(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerSuccessorsRequestData body);

  /**
   * Get relations to Successor entities
   * Similar to <code>bearerSuccessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerSuccessorsResponseData> bearerSuccessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerSuccessorsRequestData body);


  /**
   * Get relations to Successor entities
   * 
   * Note, this is equivalent to the other <code>bearerSuccessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerSuccessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/Successors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerSuccessorsResponseData bearerSuccessors(@Param("elid") String elid, BearerSuccessorsRequestData body, @QueryMap(encoded=true) BearerSuccessorsQueryParams queryParams);

  /**
  * Get relations to Successor entities
  * 
  * Note, this is equivalent to the other <code>bearerSuccessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerSuccessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/Successors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerSuccessorsResponseData> bearerSuccessorsWithHttpInfo(@Param("elid") String elid, BearerSuccessorsRequestData body, @QueryMap(encoded=true) BearerSuccessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerSuccessors</code> method in a fluent style.
   */
  public static class BearerSuccessorsQueryParams extends HashMap<String, Object> {
    public BearerSuccessorsQueryParams sessionId(final String value) {
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
   * @return BearerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BearerSystemAttributesResponse bearerSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>bearerSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BearerSystemAttributesResponse> bearerSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BearerSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>bearerSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BearerSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BearerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BearerSystemAttributesResponse bearerSystemAttributes(@Param("elid") String elid, BearerSystemAttributesRequest body, @QueryMap(encoded=true) BearerSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>bearerSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BearerSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BearerSystemAttributesResponse> bearerSystemAttributesWithHttpInfo(@Param("elid") String elid, BearerSystemAttributesRequest body, @QueryMap(encoded=true) BearerSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>bearerSystemAttributes</code> method in a fluent style.
   */
  public static class BearerSystemAttributesQueryParams extends HashMap<String, Object> {
    public BearerSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Service type replacement
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeServiceTypeBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/changeServiceType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeServiceTypeBearerResponse changeServiceTypeBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeServiceTypeBearerRequestData body);

  /**
   * Service type replacement
   * Similar to <code>changeServiceTypeBearer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/changeServiceType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeServiceTypeBearerResponse> changeServiceTypeBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeServiceTypeBearerRequestData body);


  /**
   * Service type replacement
   * 
   * Note, this is equivalent to the other <code>changeServiceTypeBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeServiceTypeBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeServiceTypeBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/changeServiceType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeServiceTypeBearerResponse changeServiceTypeBearer(@Param("elid") String elid, ChangeServiceTypeBearerRequestData body, @QueryMap(encoded=true) ChangeServiceTypeBearerQueryParams queryParams);

  /**
  * Service type replacement
  * 
  * Note, this is equivalent to the other <code>changeServiceTypeBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeServiceTypeBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/changeServiceType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeServiceTypeBearerResponse> changeServiceTypeBearerWithHttpInfo(@Param("elid") String elid, ChangeServiceTypeBearerRequestData body, @QueryMap(encoded=true) ChangeServiceTypeBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeServiceTypeBearer</code> method in a fluent style.
   */
  public static class ChangeServiceTypeBearerQueryParams extends HashMap<String, Object> {
    public ChangeServiceTypeBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Creates a bearer. This operation can be used for all transmission technologies except IMA. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateBearerResponse createBearer(@Param("sessionId") String sessionId, CreateBearerRequestData body);

  /**
   * Create
   * Similar to <code>createBearer</code> but it also returns the http response headers .
   * Creates a bearer. This operation can be used for all transmission technologies except IMA. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateBearerResponse> createBearerWithHttpInfo(@Param("sessionId") String sessionId, CreateBearerRequestData body);


  /**
   * Create
   * Creates a bearer. This operation can be used for all transmission technologies except IMA. If the ID is not passed, it will be generated automatically by the system.
   * Note, this is equivalent to the other <code>createBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateBearerResponse createBearer(CreateBearerRequestData body, @QueryMap(encoded=true) CreateBearerQueryParams queryParams);

  /**
  * Create
  * Creates a bearer. This operation can be used for all transmission technologies except IMA. If the ID is not passed, it will be generated automatically by the system.
  * Note, this is equivalent to the other <code>createBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateBearerResponse> createBearerWithHttpInfo(CreateBearerRequestData body, @QueryMap(encoded=true) CreateBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createBearer</code> method in a fluent style.
   */
  public static class CreateBearerQueryParams extends HashMap<String, Object> {
    public CreateBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create IMA
   * Creates a bearer with the transmission technology IMA. The count of the linked logical ports must match the count of the base resources. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateImaBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/createIma?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateImaBearerResponse createImaBearer(@Param("sessionId") String sessionId, CreateImaBearerRequestData body);

  /**
   * Create IMA
   * Similar to <code>createImaBearer</code> but it also returns the http response headers .
   * Creates a bearer with the transmission technology IMA. The count of the linked logical ports must match the count of the base resources. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/createIma?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateImaBearerResponse> createImaBearerWithHttpInfo(@Param("sessionId") String sessionId, CreateImaBearerRequestData body);


  /**
   * Create IMA
   * Creates a bearer with the transmission technology IMA. The count of the linked logical ports must match the count of the base resources. If the ID is not passed, it will be generated automatically by the system.
   * Note, this is equivalent to the other <code>createImaBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateImaBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateImaBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/createIma?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateImaBearerResponse createImaBearer(CreateImaBearerRequestData body, @QueryMap(encoded=true) CreateImaBearerQueryParams queryParams);

  /**
  * Create IMA
  * Creates a bearer with the transmission technology IMA. The count of the linked logical ports must match the count of the base resources. If the ID is not passed, it will be generated automatically by the system.
  * Note, this is equivalent to the other <code>createImaBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateImaBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/createIma?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateImaBearerResponse> createImaBearerWithHttpInfo(CreateImaBearerRequestData body, @QueryMap(encoded=true) CreateImaBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createImaBearer</code> method in a fluent style.
   */
  public static class CreateImaBearerQueryParams extends HashMap<String, Object> {
    public CreateImaBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete bearer
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteBearerResponse deleteBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteBearerRequestData body);

  /**
   * Delete
   * Similar to <code>deleteBearer</code> but it also returns the http response headers .
   * Delete bearer
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteBearerResponse> deleteBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteBearerRequestData body);


  /**
   * Delete
   * Delete bearer
   * Note, this is equivalent to the other <code>deleteBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteBearerResponse deleteBearer(@Param("elid") String elid, DeleteBearerRequestData body, @QueryMap(encoded=true) DeleteBearerQueryParams queryParams);

  /**
  * Delete
  * Delete bearer
  * Note, this is equivalent to the other <code>deleteBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteBearerResponse> deleteBearerWithHttpInfo(@Param("elid") String elid, DeleteBearerRequestData body, @QueryMap(encoded=true) DeleteBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteBearer</code> method in a fluent style.
   */
  public static class DeleteBearerQueryParams extends HashMap<String, Object> {
    public DeleteBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Loop-in net nodes
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LoopInNetNodeBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/loopInNetNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoopInNetNodeBearerResponse loopInNetNodeBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInNetNodeBearerRequestData body);

  /**
   * Loop-in net nodes
   * Similar to <code>loopInNetNodeBearer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/loopInNetNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoopInNetNodeBearerResponse> loopInNetNodeBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInNetNodeBearerRequestData body);


  /**
   * Loop-in net nodes
   * 
   * Note, this is equivalent to the other <code>loopInNetNodeBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoopInNetNodeBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoopInNetNodeBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/loopInNetNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoopInNetNodeBearerResponse loopInNetNodeBearer(@Param("elid") String elid, LoopInNetNodeBearerRequestData body, @QueryMap(encoded=true) LoopInNetNodeBearerQueryParams queryParams);

  /**
  * Loop-in net nodes
  * 
  * Note, this is equivalent to the other <code>loopInNetNodeBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoopInNetNodeBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/loopInNetNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoopInNetNodeBearerResponse> loopInNetNodeBearerWithHttpInfo(@Param("elid") String elid, LoopInNetNodeBearerRequestData body, @QueryMap(encoded=true) LoopInNetNodeBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loopInNetNodeBearer</code> method in a fluent style.
   */
  public static class LoopInNetNodeBearerQueryParams extends HashMap<String, Object> {
    public LoopInNetNodeBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Loop-out net nodes
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LoopOutNetNodeBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/loopOutNetNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoopOutNetNodeBearerResponse loopOutNetNodeBearer(@Param("sessionId") String sessionId, LoopOutNetNodeBearerRequestData body);

  /**
   * Loop-out net nodes
   * Similar to <code>loopOutNetNodeBearer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/loopOutNetNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoopOutNetNodeBearerResponse> loopOutNetNodeBearerWithHttpInfo(@Param("sessionId") String sessionId, LoopOutNetNodeBearerRequestData body);


  /**
   * Loop-out net nodes
   * 
   * Note, this is equivalent to the other <code>loopOutNetNodeBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoopOutNetNodeBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoopOutNetNodeBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/loopOutNetNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoopOutNetNodeBearerResponse loopOutNetNodeBearer(LoopOutNetNodeBearerRequestData body, @QueryMap(encoded=true) LoopOutNetNodeBearerQueryParams queryParams);

  /**
  * Loop-out net nodes
  * 
  * Note, this is equivalent to the other <code>loopOutNetNodeBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoopOutNetNodeBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/loopOutNetNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoopOutNetNodeBearerResponse> loopOutNetNodeBearerWithHttpInfo(LoopOutNetNodeBearerRequestData body, @QueryMap(encoded=true) LoopOutNetNodeBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loopOutNetNodeBearer</code> method in a fluent style.
   */
  public static class LoopOutNetNodeBearerQueryParams extends HashMap<String, Object> {
    public LoopOutNetNodeBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify ASI
   * Modifies a bearer with the transmission technology ASI
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateAsiBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateAsi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateAsiBearerResponse updateAsiBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateAsiBearerRequestData body);

  /**
   * Modify ASI
   * Similar to <code>updateAsiBearer</code> but it also returns the http response headers .
   * Modifies a bearer with the transmission technology ASI
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateAsi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateAsiBearerResponse> updateAsiBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateAsiBearerRequestData body);


  /**
   * Modify ASI
   * Modifies a bearer with the transmission technology ASI
   * Note, this is equivalent to the other <code>updateAsiBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateAsiBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateAsiBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateAsi?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateAsiBearerResponse updateAsiBearer(@Param("elid") String elid, UpdateAsiBearerRequestData body, @QueryMap(encoded=true) UpdateAsiBearerQueryParams queryParams);

  /**
  * Modify ASI
  * Modifies a bearer with the transmission technology ASI
  * Note, this is equivalent to the other <code>updateAsiBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateAsiBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/updateAsi?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateAsiBearerResponse> updateAsiBearerWithHttpInfo(@Param("elid") String elid, UpdateAsiBearerRequestData body, @QueryMap(encoded=true) UpdateAsiBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateAsiBearer</code> method in a fluent style.
   */
  public static class UpdateAsiBearerQueryParams extends HashMap<String, Object> {
    public UpdateAsiBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modifies a bearer. The transmission technology must not be packet data, SPVP, SPVC or ASI.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateBearerResponse updateBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateBearerRequestData body);

  /**
   * Modify
   * Similar to <code>updateBearer</code> but it also returns the http response headers .
   * Modifies a bearer. The transmission technology must not be packet data, SPVP, SPVC or ASI.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateBearerResponse> updateBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateBearerRequestData body);


  /**
   * Modify
   * Modifies a bearer. The transmission technology must not be packet data, SPVP, SPVC or ASI.
   * Note, this is equivalent to the other <code>updateBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateBearerResponse updateBearer(@Param("elid") String elid, UpdateBearerRequestData body, @QueryMap(encoded=true) UpdateBearerQueryParams queryParams);

  /**
  * Modify
  * Modifies a bearer. The transmission technology must not be packet data, SPVP, SPVC or ASI.
  * Note, this is equivalent to the other <code>updateBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateBearerResponse> updateBearerWithHttpInfo(@Param("elid") String elid, UpdateBearerRequestData body, @QueryMap(encoded=true) UpdateBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateBearer</code> method in a fluent style.
   */
  public static class UpdateBearerQueryParams extends HashMap<String, Object> {
    public UpdateBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify packet data
   * Modifies a bearer with the transmission technology packet data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePacketDataBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePacketDataBearerResponse updatePacketDataBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataBearerRequestData body);

  /**
   * Modify packet data
   * Similar to <code>updatePacketDataBearer</code> but it also returns the http response headers .
   * Modifies a bearer with the transmission technology packet data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePacketDataBearerResponse> updatePacketDataBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataBearerRequestData body);


  /**
   * Modify packet data
   * Modifies a bearer with the transmission technology packet data
   * Note, this is equivalent to the other <code>updatePacketDataBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePacketDataBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePacketDataBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePacketDataBearerResponse updatePacketDataBearer(@Param("elid") String elid, UpdatePacketDataBearerRequestData body, @QueryMap(encoded=true) UpdatePacketDataBearerQueryParams queryParams);

  /**
  * Modify packet data
  * Modifies a bearer with the transmission technology packet data
  * Note, this is equivalent to the other <code>updatePacketDataBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePacketDataBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/updatePacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePacketDataBearerResponse> updatePacketDataBearerWithHttpInfo(@Param("elid") String elid, UpdatePacketDataBearerRequestData body, @QueryMap(encoded=true) UpdatePacketDataBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePacketDataBearer</code> method in a fluent style.
   */
  public static class UpdatePacketDataBearerQueryParams extends HashMap<String, Object> {
    public UpdatePacketDataBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify SPVC
   * Modifies a bearer with the transmission technology SPVC
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSpvcBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSpvcBearerResponse updateSpvcBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSpvcBearerRequestData body);

  /**
   * Modify SPVC
   * Similar to <code>updateSpvcBearer</code> but it also returns the http response headers .
   * Modifies a bearer with the transmission technology SPVC
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSpvcBearerResponse> updateSpvcBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSpvcBearerRequestData body);


  /**
   * Modify SPVC
   * Modifies a bearer with the transmission technology SPVC
   * Note, this is equivalent to the other <code>updateSpvcBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSpvcBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSpvcBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSpvcBearerResponse updateSpvcBearer(@Param("elid") String elid, UpdateSpvcBearerRequestData body, @QueryMap(encoded=true) UpdateSpvcBearerQueryParams queryParams);

  /**
  * Modify SPVC
  * Modifies a bearer with the transmission technology SPVC
  * Note, this is equivalent to the other <code>updateSpvcBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSpvcBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSpvcBearerResponse> updateSpvcBearerWithHttpInfo(@Param("elid") String elid, UpdateSpvcBearerRequestData body, @QueryMap(encoded=true) UpdateSpvcBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSpvcBearer</code> method in a fluent style.
   */
  public static class UpdateSpvcBearerQueryParams extends HashMap<String, Object> {
    public UpdateSpvcBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify SPVP
   * Modifies a bearer with the transmission technology SPVP
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSpvpBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvp?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSpvpBearerResponse updateSpvpBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSpvpBearerRequestData body);

  /**
   * Modify SPVP
   * Similar to <code>updateSpvpBearer</code> but it also returns the http response headers .
   * Modifies a bearer with the transmission technology SPVP
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvp?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSpvpBearerResponse> updateSpvpBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSpvpBearerRequestData body);


  /**
   * Modify SPVP
   * Modifies a bearer with the transmission technology SPVP
   * Note, this is equivalent to the other <code>updateSpvpBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSpvpBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSpvpBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvp?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSpvpBearerResponse updateSpvpBearer(@Param("elid") String elid, UpdateSpvpBearerRequestData body, @QueryMap(encoded=true) UpdateSpvpBearerQueryParams queryParams);

  /**
  * Modify SPVP
  * Modifies a bearer with the transmission technology SPVP
  * Note, this is equivalent to the other <code>updateSpvpBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSpvpBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSpvp?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSpvpBearerResponse> updateSpvpBearerWithHttpInfo(@Param("elid") String elid, UpdateSpvpBearerRequestData body, @QueryMap(encoded=true) UpdateSpvpBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSpvpBearer</code> method in a fluent style.
   */
  public static class UpdateSpvpBearerQueryParams extends HashMap<String, Object> {
    public UpdateSpvpBearerQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesBearerResponse updateSystemAttributesBearer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesBearerRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesBearer</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesBearerResponse> updateSystemAttributesBearerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesBearerRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesBearer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesBearerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesBearerResponse
   */
  @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesBearerResponse updateSystemAttributesBearer(@Param("elid") String elid, UpdateSystemAttributesBearerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesBearerQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesBearer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesBearerResponse
      */
      @RequestLine("POST /api/rest/entity/bearer/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesBearerResponse> updateSystemAttributesBearerWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesBearerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesBearerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesBearer</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesBearerQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesBearerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
