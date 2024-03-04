package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreatePacketDataServiceTelcoPointToPointRequestData;
import com.fntsoftware.businessgateway.entities.CreatePacketDataServiceTelcoPointToPointResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoPointToPointRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoPointToPointResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoPointToPointRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoPointToPointResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPoint100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPoint100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointEndZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointEndZoneResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointLogicalPortOutputEndRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointLogicalPortOutputEndResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointLogicalPortOutputStartRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointLogicalPortOutputStartResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointMainRouteRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointMainRouteResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointPredecessorRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointPredecessorResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSpareRouteCircuitSwitchedRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSpareRoutePacketDataRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSpareRoutePacketDataResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointStartZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointStartZoneResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointStructuresRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointStructuresResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSuccessorsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSuccessorsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPointToPointVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataServiceTelcoPointToPointRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataServiceTelcoPointToPointResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoPointToPointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoPointToPointResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoPointToPointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoPointToPointResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServiceTelcoPointToPointApi extends ApiClient.Api {


  /**
   * Create packet data
   * Create packet data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePacketDataServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/createPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePacketDataServiceTelcoPointToPointResponse createPacketDataServiceTelcoPointToPoint(@Param("sessionId") String sessionId, CreatePacketDataServiceTelcoPointToPointRequestData body);

  /**
   * Create packet data
   * Similar to <code>createPacketDataServiceTelcoPointToPoint</code> but it also returns the http response headers .
   * Create packet data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/createPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePacketDataServiceTelcoPointToPointResponse> createPacketDataServiceTelcoPointToPointWithHttpInfo(@Param("sessionId") String sessionId, CreatePacketDataServiceTelcoPointToPointRequestData body);


  /**
   * Create packet data
   * Create packet data
   * Note, this is equivalent to the other <code>createPacketDataServiceTelcoPointToPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePacketDataServiceTelcoPointToPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePacketDataServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/createPacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePacketDataServiceTelcoPointToPointResponse createPacketDataServiceTelcoPointToPoint(CreatePacketDataServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) CreatePacketDataServiceTelcoPointToPointQueryParams queryParams);

  /**
  * Create packet data
  * Create packet data
  * Note, this is equivalent to the other <code>createPacketDataServiceTelcoPointToPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePacketDataServiceTelcoPointToPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/createPacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePacketDataServiceTelcoPointToPointResponse> createPacketDataServiceTelcoPointToPointWithHttpInfo(CreatePacketDataServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) CreatePacketDataServiceTelcoPointToPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPacketDataServiceTelcoPointToPoint</code> method in a fluent style.
   */
  public static class CreatePacketDataServiceTelcoPointToPointQueryParams extends HashMap<String, Object> {
    public CreatePacketDataServiceTelcoPointToPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoPointToPointResponse createServiceTelcoPointToPoint(@Param("sessionId") String sessionId, CreateServiceTelcoPointToPointRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoPointToPoint</code> but it also returns the http response headers .
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoPointToPointResponse> createServiceTelcoPointToPointWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoPointToPointRequestData body);


  /**
   * Create
   * Create service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoPointToPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoPointToPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoPointToPointResponse createServiceTelcoPointToPoint(CreateServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) CreateServiceTelcoPointToPointQueryParams queryParams);

  /**
  * Create
  * Create service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoPointToPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoPointToPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoPointToPointResponse> createServiceTelcoPointToPointWithHttpInfo(CreateServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) CreateServiceTelcoPointToPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoPointToPoint</code> method in a fluent style.
   */
  public static class CreateServiceTelcoPointToPointQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoPointToPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoPointToPointResponse deleteServiceTelcoPointToPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoPointToPointRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoPointToPoint</code> but it also returns the http response headers .
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoPointToPointResponse> deleteServiceTelcoPointToPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoPointToPointRequestData body);


  /**
   * Delete
   * Delete service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoPointToPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoPointToPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoPointToPointResponse deleteServiceTelcoPointToPoint(@Param("elid") String elid, DeleteServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoPointToPointQueryParams queryParams);

  /**
  * Delete
  * Delete service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoPointToPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoPointToPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoPointToPointResponse> deleteServiceTelcoPointToPointWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoPointToPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoPointToPoint</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoPointToPointQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoPointToPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to OSPF-Area entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPoint100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPoint100042ResponseData serviceTelcoPointToPoint100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPoint100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoPointToPoint100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPoint100042ResponseData> serviceTelcoPointToPoint100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPoint100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPoint100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPoint100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPoint100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPoint100042ResponseData serviceTelcoPointToPoint100042(@Param("elid") String elid, ServiceTelcoPointToPoint100042RequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPoint100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPoint100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPoint100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPoint100042ResponseData> serviceTelcoPointToPoint100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPoint100042RequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPoint100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPoint100042</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPoint100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPoint100042QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse serviceTelcoPointToPointBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>serviceTelcoPointToPointBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse> serviceTelcoPointToPointBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse serviceTelcoPointToPointBandwidthBookingForPacketDataService(@Param("elid") String elid, ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceResponse> serviceTelcoPointToPointBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse serviceTelcoPointToPointBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>serviceTelcoPointToPointBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse> serviceTelcoPointToPointBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse serviceTelcoPointToPointBandwidthForPacketDataService(@Param("elid") String elid, ServiceTelcoPointToPointBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointBandwidthForPacketDataServiceResponse> serviceTelcoPointToPointBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointContractsResponseData serviceTelcoPointToPointContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoPointToPointContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointContractsResponseData> serviceTelcoPointToPointContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointContractsResponseData serviceTelcoPointToPointContracts(@Param("elid") String elid, ServiceTelcoPointToPointContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointContractsResponseData> serviceTelcoPointToPointContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Leased line entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomCablesResponseData serviceTelcoPointToPointCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoPointToPointCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointCustomCablesResponseData> serviceTelcoPointToPointCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomCablesResponseData serviceTelcoPointToPointCustomCables(@Param("elid") String elid, ServiceTelcoPointToPointCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointCustomCablesResponseData> serviceTelcoPointToPointCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomDataCablesResponseData serviceTelcoPointToPointCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoPointToPointCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointCustomDataCablesResponseData> serviceTelcoPointToPointCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomDataCablesResponseData serviceTelcoPointToPointCustomDataCables(@Param("elid") String elid, ServiceTelcoPointToPointCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointCustomDataCablesResponseData> serviceTelcoPointToPointCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointCustomDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP-Access Service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomIpaccessSvcResponseData serviceTelcoPointToPointCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoPointToPointCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointCustomIpaccessSvcResponseData> serviceTelcoPointToPointCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomIpaccessSvcResponseData serviceTelcoPointToPointCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoPointToPointCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointCustomIpaccessSvcResponseData> serviceTelcoPointToPointCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointCustomIpaccessSvcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomPowerCablesResponseData serviceTelcoPointToPointCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoPointToPointCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointCustomPowerCablesResponseData> serviceTelcoPointToPointCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointCustomPowerCablesResponseData serviceTelcoPointToPointCustomPowerCables(@Param("elid") String elid, ServiceTelcoPointToPointCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointCustomPowerCablesResponseData> serviceTelcoPointToPointCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointCustomPowerCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointDevicesAllResponseData serviceTelcoPointToPointDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoPointToPointDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointDevicesAllResponseData> serviceTelcoPointToPointDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointDevicesAllResponseData serviceTelcoPointToPointDevicesAll(@Param("elid") String elid, ServiceTelcoPointToPointDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointDevicesAllResponseData> serviceTelcoPointToPointDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointEndZoneResponseData serviceTelcoPointToPointEndZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointEndZoneRequestData body);

  /**
   * Get relations to End zone entities
   * Similar to <code>serviceTelcoPointToPointEndZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointEndZoneResponseData> serviceTelcoPointToPointEndZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointEndZoneRequestData body);


  /**
   * Get relations to End zone entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointEndZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointEndZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointEndZoneResponseData serviceTelcoPointToPointEndZone(@Param("elid") String elid, ServiceTelcoPointToPointEndZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointEndZoneQueryParams queryParams);

  /**
  * Get relations to End zone entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointEndZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointEndZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/EndZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointEndZoneResponseData> serviceTelcoPointToPointEndZoneWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointEndZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointEndZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointEndZone</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointEndZoneQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointEndZoneQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointFrameContractsResponseData serviceTelcoPointToPointFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoPointToPointFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointFrameContractsResponseData> serviceTelcoPointToPointFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointFrameContractsResponseData serviceTelcoPointToPointFrameContracts(@Param("elid") String elid, ServiceTelcoPointToPointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointFrameContractsResponseData> serviceTelcoPointToPointFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointHigherLevelServicesResponseData serviceTelcoPointToPointHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoPointToPointHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointHigherLevelServicesResponseData> serviceTelcoPointToPointHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointHigherLevelServicesResponseData serviceTelcoPointToPointHigherLevelServices(@Param("elid") String elid, ServiceTelcoPointToPointHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointHigherLevelServicesResponseData> serviceTelcoPointToPointHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointHigherLevelServicesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Output port end entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointLogicalPortOutputEndResponseData serviceTelcoPointToPointLogicalPortOutputEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputEndRequestData body);

  /**
   * Get relations to Output port end entities
   * Similar to <code>serviceTelcoPointToPointLogicalPortOutputEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointLogicalPortOutputEndResponseData> serviceTelcoPointToPointLogicalPortOutputEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputEndRequestData body);


  /**
   * Get relations to Output port end entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointLogicalPortOutputEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointLogicalPortOutputEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointLogicalPortOutputEndResponseData serviceTelcoPointToPointLogicalPortOutputEnd(@Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointLogicalPortOutputEndQueryParams queryParams);

  /**
  * Get relations to Output port end entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointLogicalPortOutputEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointLogicalPortOutputEndResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointLogicalPortOutputEndResponseData> serviceTelcoPointToPointLogicalPortOutputEndWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointLogicalPortOutputEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointLogicalPortOutputEnd</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointLogicalPortOutputEndQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointLogicalPortOutputEndQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Output port start entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointLogicalPortOutputStartResponseData serviceTelcoPointToPointLogicalPortOutputStart(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputStartRequestData body);

  /**
   * Get relations to Output port start entities
   * Similar to <code>serviceTelcoPointToPointLogicalPortOutputStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointLogicalPortOutputStartResponseData> serviceTelcoPointToPointLogicalPortOutputStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputStartRequestData body);


  /**
   * Get relations to Output port start entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointLogicalPortOutputStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointLogicalPortOutputStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointLogicalPortOutputStartResponseData serviceTelcoPointToPointLogicalPortOutputStart(@Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointLogicalPortOutputStartQueryParams queryParams);

  /**
  * Get relations to Output port start entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointLogicalPortOutputStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointLogicalPortOutputStartResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointLogicalPortOutputStartResponseData> serviceTelcoPointToPointLogicalPortOutputStartWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointLogicalPortOutputStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointLogicalPortOutputStart</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointLogicalPortOutputStartQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointLogicalPortOutputStartQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Main route entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointMainRouteResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MainRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointMainRouteResponseData serviceTelcoPointToPointMainRoute(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointMainRouteRequestData body);

  /**
   * Get relations to Main route entities
   * Similar to <code>serviceTelcoPointToPointMainRoute</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MainRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointMainRouteResponseData> serviceTelcoPointToPointMainRouteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointMainRouteRequestData body);


  /**
   * Get relations to Main route entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointMainRoute</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointMainRouteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointMainRouteResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MainRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointMainRouteResponseData serviceTelcoPointToPointMainRoute(@Param("elid") String elid, ServiceTelcoPointToPointMainRouteRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointMainRouteQueryParams queryParams);

  /**
  * Get relations to Main route entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointMainRoute</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointMainRouteResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MainRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointMainRouteResponseData> serviceTelcoPointToPointMainRouteWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointMainRouteRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointMainRouteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointMainRoute</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointMainRouteQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointMainRouteQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointMaintenanceContractsResponseData serviceTelcoPointToPointMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoPointToPointMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointMaintenanceContractsResponseData> serviceTelcoPointToPointMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointMaintenanceContractsResponseData serviceTelcoPointToPointMaintenanceContracts(@Param("elid") String elid, ServiceTelcoPointToPointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointMaintenanceContractsResponseData> serviceTelcoPointToPointMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointOrganizationsResponseData serviceTelcoPointToPointOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoPointToPointOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointOrganizationsResponseData> serviceTelcoPointToPointOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointOrganizationsResponseData serviceTelcoPointToPointOrganizations(@Param("elid") String elid, ServiceTelcoPointToPointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointOrganizationsResponseData> serviceTelcoPointToPointOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointPersonGroupsResponseData serviceTelcoPointToPointPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoPointToPointPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointPersonGroupsResponseData> serviceTelcoPointToPointPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointPersonGroupsResponseData serviceTelcoPointToPointPersonGroups(@Param("elid") String elid, ServiceTelcoPointToPointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointPersonGroupsResponseData> serviceTelcoPointToPointPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointPersonsResponseData serviceTelcoPointToPointPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoPointToPointPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointPersonsResponseData> serviceTelcoPointToPointPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointPersonsResponseData serviceTelcoPointToPointPersons(@Param("elid") String elid, ServiceTelcoPointToPointPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointPersonsResponseData> serviceTelcoPointToPointPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointPersonsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointPredecessorResponseData serviceTelcoPointToPointPredecessor(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointPredecessorRequestData body);

  /**
   * Get relations to Predecessor entities
   * Similar to <code>serviceTelcoPointToPointPredecessor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointPredecessorResponseData> serviceTelcoPointToPointPredecessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointPredecessorRequestData body);


  /**
   * Get relations to Predecessor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointPredecessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointPredecessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointPredecessorResponseData serviceTelcoPointToPointPredecessor(@Param("elid") String elid, ServiceTelcoPointToPointPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointPredecessorQueryParams queryParams);

  /**
  * Get relations to Predecessor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointPredecessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointPredecessorResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Predecessor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointPredecessorResponseData> serviceTelcoPointToPointPredecessorWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointPredecessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointPredecessor</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointPredecessorQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointPredecessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointQueryResponse serviceTelcoPointToPointQuery(@Param("sessionId") String sessionId, ServiceTelcoPointToPointQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoPointToPointQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointQueryResponse> serviceTelcoPointToPointQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoPointToPointQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointQueryResponse serviceTelcoPointToPointQuery(ServiceTelcoPointToPointQueryRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointQueryResponse> serviceTelcoPointToPointQueryWithHttpInfo(ServiceTelcoPointToPointQueryRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service Access Point entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointServiceAccessPointsResponseData serviceTelcoPointToPointServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoPointToPointServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointServiceAccessPointsResponseData> serviceTelcoPointToPointServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointServiceAccessPointsResponseData serviceTelcoPointToPointServiceAccessPoints(@Param("elid") String elid, ServiceTelcoPointToPointServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointServiceAccessPointsResponseData> serviceTelcoPointToPointServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointServiceTypeDefinitionResponseData serviceTelcoPointToPointServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoPointToPointServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointServiceTypeDefinitionResponseData> serviceTelcoPointToPointServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointServiceTypeDefinitionResponseData serviceTelcoPointToPointServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoPointToPointServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointServiceTypeDefinitionResponseData> serviceTelcoPointToPointServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointServicesTelcoResponseData serviceTelcoPointToPointServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoPointToPointServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointServicesTelcoResponseData> serviceTelcoPointToPointServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointServicesTelcoResponseData serviceTelcoPointToPointServicesTelco(@Param("elid") String elid, ServiceTelcoPointToPointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointServicesTelcoResponseData> serviceTelcoPointToPointServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointServicesTelcoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Spare route circuit switched entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRouteCircuitSwitched?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData serviceTelcoPointToPointSpareRouteCircuitSwitched(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSpareRouteCircuitSwitchedRequestData body);

  /**
   * Get relations to Spare route circuit switched entities
   * Similar to <code>serviceTelcoPointToPointSpareRouteCircuitSwitched</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRouteCircuitSwitched?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData> serviceTelcoPointToPointSpareRouteCircuitSwitchedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSpareRouteCircuitSwitchedRequestData body);


  /**
   * Get relations to Spare route circuit switched entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointSpareRouteCircuitSwitched</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointSpareRouteCircuitSwitchedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRouteCircuitSwitched?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData serviceTelcoPointToPointSpareRouteCircuitSwitched(@Param("elid") String elid, ServiceTelcoPointToPointSpareRouteCircuitSwitchedRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointSpareRouteCircuitSwitchedQueryParams queryParams);

  /**
  * Get relations to Spare route circuit switched entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointSpareRouteCircuitSwitched</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRouteCircuitSwitched?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointSpareRouteCircuitSwitchedResponseData> serviceTelcoPointToPointSpareRouteCircuitSwitchedWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointSpareRouteCircuitSwitchedRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointSpareRouteCircuitSwitchedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointSpareRouteCircuitSwitched</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointSpareRouteCircuitSwitchedQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointSpareRouteCircuitSwitchedQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Spare route packet data entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointSpareRoutePacketDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRoutePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointSpareRoutePacketDataResponseData serviceTelcoPointToPointSpareRoutePacketData(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSpareRoutePacketDataRequestData body);

  /**
   * Get relations to Spare route packet data entities
   * Similar to <code>serviceTelcoPointToPointSpareRoutePacketData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRoutePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointSpareRoutePacketDataResponseData> serviceTelcoPointToPointSpareRoutePacketDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSpareRoutePacketDataRequestData body);


  /**
   * Get relations to Spare route packet data entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointSpareRoutePacketData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointSpareRoutePacketDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointSpareRoutePacketDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRoutePacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointSpareRoutePacketDataResponseData serviceTelcoPointToPointSpareRoutePacketData(@Param("elid") String elid, ServiceTelcoPointToPointSpareRoutePacketDataRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointSpareRoutePacketDataQueryParams queryParams);

  /**
  * Get relations to Spare route packet data entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointSpareRoutePacketData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointSpareRoutePacketDataResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SpareRoutePacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointSpareRoutePacketDataResponseData> serviceTelcoPointToPointSpareRoutePacketDataWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointSpareRoutePacketDataRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointSpareRoutePacketDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointSpareRoutePacketData</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointSpareRoutePacketDataQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointSpareRoutePacketDataQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointStartZoneResponseData serviceTelcoPointToPointStartZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointStartZoneRequestData body);

  /**
   * Get relations to Start zone entities
   * Similar to <code>serviceTelcoPointToPointStartZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointStartZoneResponseData> serviceTelcoPointToPointStartZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointStartZoneRequestData body);


  /**
   * Get relations to Start zone entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointStartZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointStartZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointStartZoneResponseData serviceTelcoPointToPointStartZone(@Param("elid") String elid, ServiceTelcoPointToPointStartZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointStartZoneQueryParams queryParams);

  /**
  * Get relations to Start zone entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointStartZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointStartZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/StartZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointStartZoneResponseData> serviceTelcoPointToPointStartZoneWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointStartZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointStartZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointStartZone</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointStartZoneQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointStartZoneQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointStructuresResponse serviceTelcoPointToPointStructures(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointStructuresRequest body);

  /**
   * Query structures
   * Similar to <code>serviceTelcoPointToPointStructures</code> but it also returns the http response headers .
   * Queries the structures from one object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointStructuresResponse> serviceTelcoPointToPointStructuresWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointStructuresRequest body);


  /**
   * Query structures
   * Queries the structures from one object
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointStructures</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointStructuresQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Structures?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointStructuresResponse serviceTelcoPointToPointStructures(@Param("elid") String elid, ServiceTelcoPointToPointStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointStructuresQueryParams queryParams);

  /**
  * Query structures
  * Queries the structures from one object
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointStructures</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointStructuresResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Structures?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointStructuresResponse> serviceTelcoPointToPointStructuresWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointStructuresQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointStructures</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointStructuresQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointStructuresQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointSuccessorsResponseData serviceTelcoPointToPointSuccessors(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSuccessorsRequestData body);

  /**
   * Get relations to Successor entities
   * Similar to <code>serviceTelcoPointToPointSuccessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointSuccessorsResponseData> serviceTelcoPointToPointSuccessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSuccessorsRequestData body);


  /**
   * Get relations to Successor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointSuccessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointSuccessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Successors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointSuccessorsResponseData serviceTelcoPointToPointSuccessors(@Param("elid") String elid, ServiceTelcoPointToPointSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointSuccessorsQueryParams queryParams);

  /**
  * Get relations to Successor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointSuccessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointSuccessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Successors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointSuccessorsResponseData> serviceTelcoPointToPointSuccessorsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointSuccessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointSuccessors</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointSuccessorsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointSuccessorsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPointToPointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointSystemAttributesResponse serviceTelcoPointToPointSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoPointToPointSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointSystemAttributesResponse> serviceTelcoPointToPointSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointSystemAttributesResponse serviceTelcoPointToPointSystemAttributes(@Param("elid") String elid, ServiceTelcoPointToPointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointSystemAttributesResponse> serviceTelcoPointToPointSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoPointToPointSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPointToPointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPointToPointVlansResponseData serviceTelcoPointToPointVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoPointToPointVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPointToPointVlansResponseData> serviceTelcoPointToPointVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPointToPointVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPointToPointVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPointToPointVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPointToPointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPointToPointVlansResponseData serviceTelcoPointToPointVlans(@Param("elid") String elid, ServiceTelcoPointToPointVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPointToPointVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPointToPointVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPointToPointVlansResponseData> serviceTelcoPointToPointVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoPointToPointVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoPointToPointVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPointToPointVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoPointToPointVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPointToPointVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify packet data
   * Modify packet data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePacketDataServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePacketDataServiceTelcoPointToPointResponse updatePacketDataServiceTelcoPointToPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataServiceTelcoPointToPointRequestData body);

  /**
   * Modify packet data
   * Similar to <code>updatePacketDataServiceTelcoPointToPoint</code> but it also returns the http response headers .
   * Modify packet data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePacketDataServiceTelcoPointToPointResponse> updatePacketDataServiceTelcoPointToPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataServiceTelcoPointToPointRequestData body);


  /**
   * Modify packet data
   * Modify packet data
   * Note, this is equivalent to the other <code>updatePacketDataServiceTelcoPointToPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePacketDataServiceTelcoPointToPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePacketDataServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePacketDataServiceTelcoPointToPointResponse updatePacketDataServiceTelcoPointToPoint(@Param("elid") String elid, UpdatePacketDataServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) UpdatePacketDataServiceTelcoPointToPointQueryParams queryParams);

  /**
  * Modify packet data
  * Modify packet data
  * Note, this is equivalent to the other <code>updatePacketDataServiceTelcoPointToPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePacketDataServiceTelcoPointToPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updatePacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePacketDataServiceTelcoPointToPointResponse> updatePacketDataServiceTelcoPointToPointWithHttpInfo(@Param("elid") String elid, UpdatePacketDataServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) UpdatePacketDataServiceTelcoPointToPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePacketDataServiceTelcoPointToPoint</code> method in a fluent style.
   */
  public static class UpdatePacketDataServiceTelcoPointToPointQueryParams extends HashMap<String, Object> {
    public UpdatePacketDataServiceTelcoPointToPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoPointToPointResponse updateServiceTelcoPointToPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoPointToPointRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoPointToPoint</code> but it also returns the http response headers .
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoPointToPointResponse> updateServiceTelcoPointToPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoPointToPointRequestData body);


  /**
   * Modify
   * Modify service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoPointToPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoPointToPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoPointToPointResponse updateServiceTelcoPointToPoint(@Param("elid") String elid, UpdateServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoPointToPointQueryParams queryParams);

  /**
  * Modify
  * Modify service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoPointToPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoPointToPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoPointToPointResponse> updateServiceTelcoPointToPointWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoPointToPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoPointToPoint</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoPointToPointQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoPointToPointQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoPointToPointResponse updateSystemAttributesServiceTelcoPointToPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoPointToPointRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoPointToPoint</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoPointToPointResponse> updateSystemAttributesServiceTelcoPointToPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoPointToPointRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoPointToPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoPointToPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoPointToPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoPointToPointResponse updateSystemAttributesServiceTelcoPointToPoint(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoPointToPointQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoPointToPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoPointToPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPointToPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoPointToPointResponse> updateSystemAttributesServiceTelcoPointToPointWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoPointToPointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoPointToPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoPointToPoint</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoPointToPointQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoPointToPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
