package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceTelcoUnroutedPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoUnroutedPathResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoUnroutedPathRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoUnroutedPathResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPath100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPath100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortEndRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortEndResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortOutputEndRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortOutputStartRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortStartRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathLogicalPortStartResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathPredecessorRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathPredecessorResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathSuccessorsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathSuccessorsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedPathVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoUnroutedPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoUnroutedPathResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedPathResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceTelcoUnroutedPathApi extends ApiClient.Api {


  /**
   * Create
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoUnroutedPathResponse createServiceTelcoUnroutedPath(@Param("sessionId") String sessionId, CreateServiceTelcoUnroutedPathRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoUnroutedPath</code> but it also returns the http response headers .
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoUnroutedPathResponse> createServiceTelcoUnroutedPathWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoUnroutedPathRequestData body);


  /**
   * Create
   * Create service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoUnroutedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoUnroutedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoUnroutedPathResponse createServiceTelcoUnroutedPath(CreateServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) CreateServiceTelcoUnroutedPathQueryParams queryParams);

  /**
  * Create
  * Create service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoUnroutedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoUnroutedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoUnroutedPathResponse> createServiceTelcoUnroutedPathWithHttpInfo(CreateServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) CreateServiceTelcoUnroutedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoUnroutedPath</code> method in a fluent style.
   */
  public static class CreateServiceTelcoUnroutedPathQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoUnroutedPathQueryParams sessionId(final String value) {
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
   * @return DeleteServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoUnroutedPathResponse deleteServiceTelcoUnroutedPath(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoUnroutedPathRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoUnroutedPath</code> but it also returns the http response headers .
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoUnroutedPathResponse> deleteServiceTelcoUnroutedPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoUnroutedPathRequestData body);


  /**
   * Delete
   * Delete service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoUnroutedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoUnroutedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoUnroutedPathResponse deleteServiceTelcoUnroutedPath(@Param("elid") String elid, DeleteServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoUnroutedPathQueryParams queryParams);

  /**
  * Delete
  * Delete service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoUnroutedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoUnroutedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoUnroutedPathResponse> deleteServiceTelcoUnroutedPathWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoUnroutedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoUnroutedPath</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoUnroutedPathQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoUnroutedPathQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPath100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPath100042ResponseData serviceTelcoUnroutedPath100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPath100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoUnroutedPath100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPath100042ResponseData> serviceTelcoUnroutedPath100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPath100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPath100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPath100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPath100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPath100042ResponseData serviceTelcoUnroutedPath100042(@Param("elid") String elid, ServiceTelcoUnroutedPath100042RequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPath100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPath100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPath100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPath100042ResponseData> serviceTelcoUnroutedPath100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPath100042RequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPath100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPath100042</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPath100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPath100042QueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse serviceTelcoUnroutedPathBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>serviceTelcoUnroutedPathBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse> serviceTelcoUnroutedPathBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse serviceTelcoUnroutedPathBandwidthBookingForPacketDataService(@Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceResponse> serviceTelcoUnroutedPathBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse serviceTelcoUnroutedPathBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>serviceTelcoUnroutedPathBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse> serviceTelcoUnroutedPathBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse serviceTelcoUnroutedPathBandwidthForPacketDataService(@Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathBandwidthForPacketDataServiceResponse> serviceTelcoUnroutedPathBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathContractsResponseData serviceTelcoUnroutedPathContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoUnroutedPathContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathContractsResponseData> serviceTelcoUnroutedPathContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathContractsResponseData serviceTelcoUnroutedPathContracts(@Param("elid") String elid, ServiceTelcoUnroutedPathContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathContractsResponseData> serviceTelcoUnroutedPathContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomCablesResponseData serviceTelcoUnroutedPathCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoUnroutedPathCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathCustomCablesResponseData> serviceTelcoUnroutedPathCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomCablesResponseData serviceTelcoUnroutedPathCustomCables(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathCustomCablesResponseData> serviceTelcoUnroutedPathCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomDataCablesResponseData serviceTelcoUnroutedPathCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoUnroutedPathCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathCustomDataCablesResponseData> serviceTelcoUnroutedPathCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomDataCablesResponseData serviceTelcoUnroutedPathCustomDataCables(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathCustomDataCablesResponseData> serviceTelcoUnroutedPathCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathCustomDataCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData serviceTelcoUnroutedPathCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoUnroutedPathCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData> serviceTelcoUnroutedPathCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData serviceTelcoUnroutedPathCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathCustomIpaccessSvcResponseData> serviceTelcoUnroutedPathCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomPowerCablesResponseData serviceTelcoUnroutedPathCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoUnroutedPathCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathCustomPowerCablesResponseData> serviceTelcoUnroutedPathCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathCustomPowerCablesResponseData serviceTelcoUnroutedPathCustomPowerCables(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathCustomPowerCablesResponseData> serviceTelcoUnroutedPathCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathDevicesAllResponseData serviceTelcoUnroutedPathDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoUnroutedPathDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathDevicesAllResponseData> serviceTelcoUnroutedPathDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathDevicesAllResponseData serviceTelcoUnroutedPathDevicesAll(@Param("elid") String elid, ServiceTelcoUnroutedPathDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathDevicesAllResponseData> serviceTelcoUnroutedPathDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathFrameContractsResponseData serviceTelcoUnroutedPathFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoUnroutedPathFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathFrameContractsResponseData> serviceTelcoUnroutedPathFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathFrameContractsResponseData serviceTelcoUnroutedPathFrameContracts(@Param("elid") String elid, ServiceTelcoUnroutedPathFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathFrameContractsResponseData> serviceTelcoUnroutedPathFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathHigherLevelServicesResponseData serviceTelcoUnroutedPathHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoUnroutedPathHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathHigherLevelServicesResponseData> serviceTelcoUnroutedPathHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathHigherLevelServicesResponseData serviceTelcoUnroutedPathHigherLevelServices(@Param("elid") String elid, ServiceTelcoUnroutedPathHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathHigherLevelServicesResponseData> serviceTelcoUnroutedPathHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathHigherLevelServicesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathLogicalPortEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortEndResponseData serviceTelcoUnroutedPathLogicalPortEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortEndRequestData body);

  /**
   * Get relations to Logical port End point entities
   * Similar to <code>serviceTelcoUnroutedPathLogicalPortEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathLogicalPortEndResponseData> serviceTelcoUnroutedPathLogicalPortEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortEndRequestData body);


  /**
   * Get relations to Logical port End point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathLogicalPortEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathLogicalPortEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortEndResponseData serviceTelcoUnroutedPathLogicalPortEnd(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortEndRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortEndQueryParams queryParams);

  /**
  * Get relations to Logical port End point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathLogicalPortEndResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathLogicalPortEndResponseData> serviceTelcoUnroutedPathLogicalPortEndWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortEndRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathLogicalPortEnd</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathLogicalPortEndQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathLogicalPortEndQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData serviceTelcoUnroutedPathLogicalPortOutputEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputEndRequestData body);

  /**
   * Get relations to Output port end entities
   * Similar to <code>serviceTelcoUnroutedPathLogicalPortOutputEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData> serviceTelcoUnroutedPathLogicalPortOutputEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputEndRequestData body);


  /**
   * Get relations to Output port end entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortOutputEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathLogicalPortOutputEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData serviceTelcoUnroutedPathLogicalPortOutputEnd(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortOutputEndQueryParams queryParams);

  /**
  * Get relations to Output port end entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortOutputEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathLogicalPortOutputEndResponseData> serviceTelcoUnroutedPathLogicalPortOutputEndWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortOutputEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathLogicalPortOutputEnd</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathLogicalPortOutputEndQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathLogicalPortOutputEndQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData serviceTelcoUnroutedPathLogicalPortOutputStart(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputStartRequestData body);

  /**
   * Get relations to Output port start entities
   * Similar to <code>serviceTelcoUnroutedPathLogicalPortOutputStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData> serviceTelcoUnroutedPathLogicalPortOutputStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputStartRequestData body);


  /**
   * Get relations to Output port start entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortOutputStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathLogicalPortOutputStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData serviceTelcoUnroutedPathLogicalPortOutputStart(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortOutputStartQueryParams queryParams);

  /**
  * Get relations to Output port start entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortOutputStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathLogicalPortOutputStartResponseData> serviceTelcoUnroutedPathLogicalPortOutputStartWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortOutputStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathLogicalPortOutputStart</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathLogicalPortOutputStartQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathLogicalPortOutputStartQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathLogicalPortStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortStartResponseData serviceTelcoUnroutedPathLogicalPortStart(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortStartRequestData body);

  /**
   * Get relations to Logical port Starting point entities
   * Similar to <code>serviceTelcoUnroutedPathLogicalPortStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathLogicalPortStartResponseData> serviceTelcoUnroutedPathLogicalPortStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortStartRequestData body);


  /**
   * Get relations to Logical port Starting point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathLogicalPortStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathLogicalPortStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathLogicalPortStartResponseData serviceTelcoUnroutedPathLogicalPortStart(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortStartRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortStartQueryParams queryParams);

  /**
  * Get relations to Logical port Starting point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathLogicalPortStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathLogicalPortStartResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/LogicalPortStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathLogicalPortStartResponseData> serviceTelcoUnroutedPathLogicalPortStartWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathLogicalPortStartRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathLogicalPortStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathLogicalPortStart</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathLogicalPortStartQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathLogicalPortStartQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathMaintenanceContractsResponseData serviceTelcoUnroutedPathMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoUnroutedPathMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathMaintenanceContractsResponseData> serviceTelcoUnroutedPathMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathMaintenanceContractsResponseData serviceTelcoUnroutedPathMaintenanceContracts(@Param("elid") String elid, ServiceTelcoUnroutedPathMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathMaintenanceContractsResponseData> serviceTelcoUnroutedPathMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathOrganizationsResponseData serviceTelcoUnroutedPathOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoUnroutedPathOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathOrganizationsResponseData> serviceTelcoUnroutedPathOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathOrganizationsResponseData serviceTelcoUnroutedPathOrganizations(@Param("elid") String elid, ServiceTelcoUnroutedPathOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathOrganizationsResponseData> serviceTelcoUnroutedPathOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathPersonGroupsResponseData serviceTelcoUnroutedPathPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoUnroutedPathPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathPersonGroupsResponseData> serviceTelcoUnroutedPathPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathPersonGroupsResponseData serviceTelcoUnroutedPathPersonGroups(@Param("elid") String elid, ServiceTelcoUnroutedPathPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathPersonGroupsResponseData> serviceTelcoUnroutedPathPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathPersonsResponseData serviceTelcoUnroutedPathPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoUnroutedPathPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathPersonsResponseData> serviceTelcoUnroutedPathPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathPersonsResponseData serviceTelcoUnroutedPathPersons(@Param("elid") String elid, ServiceTelcoUnroutedPathPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathPersonsResponseData> serviceTelcoUnroutedPathPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathPersonsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathPredecessorResponseData serviceTelcoUnroutedPathPredecessor(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathPredecessorRequestData body);

  /**
   * Get relations to Predecessor entities
   * Similar to <code>serviceTelcoUnroutedPathPredecessor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathPredecessorResponseData> serviceTelcoUnroutedPathPredecessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathPredecessorRequestData body);


  /**
   * Get relations to Predecessor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathPredecessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathPredecessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathPredecessorResponseData serviceTelcoUnroutedPathPredecessor(@Param("elid") String elid, ServiceTelcoUnroutedPathPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathPredecessorQueryParams queryParams);

  /**
  * Get relations to Predecessor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathPredecessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathPredecessorResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Predecessor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathPredecessorResponseData> serviceTelcoUnroutedPathPredecessorWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathPredecessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathPredecessor</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathPredecessorQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathPredecessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoUnroutedPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathQueryResponse serviceTelcoUnroutedPathQuery(@Param("sessionId") String sessionId, ServiceTelcoUnroutedPathQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoUnroutedPathQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathQueryResponse> serviceTelcoUnroutedPathQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoUnroutedPathQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathQueryResponse serviceTelcoUnroutedPathQuery(ServiceTelcoUnroutedPathQueryRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathQueryResponse> serviceTelcoUnroutedPathQueryWithHttpInfo(ServiceTelcoUnroutedPathQueryRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathQueryQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathServiceAccessPointsResponseData serviceTelcoUnroutedPathServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoUnroutedPathServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathServiceAccessPointsResponseData> serviceTelcoUnroutedPathServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathServiceAccessPointsResponseData serviceTelcoUnroutedPathServiceAccessPoints(@Param("elid") String elid, ServiceTelcoUnroutedPathServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathServiceAccessPointsResponseData> serviceTelcoUnroutedPathServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData serviceTelcoUnroutedPathServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoUnroutedPathServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData> serviceTelcoUnroutedPathServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData serviceTelcoUnroutedPathServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoUnroutedPathServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathServiceTypeDefinitionResponseData> serviceTelcoUnroutedPathServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathServicesTelcoResponseData serviceTelcoUnroutedPathServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoUnroutedPathServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathServicesTelcoResponseData> serviceTelcoUnroutedPathServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathServicesTelcoResponseData serviceTelcoUnroutedPathServicesTelco(@Param("elid") String elid, ServiceTelcoUnroutedPathServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathServicesTelcoResponseData> serviceTelcoUnroutedPathServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathSuccessorsResponseData serviceTelcoUnroutedPathSuccessors(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathSuccessorsRequestData body);

  /**
   * Get relations to Successor entities
   * Similar to <code>serviceTelcoUnroutedPathSuccessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathSuccessorsResponseData> serviceTelcoUnroutedPathSuccessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathSuccessorsRequestData body);


  /**
   * Get relations to Successor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathSuccessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathSuccessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathSuccessorsResponseData serviceTelcoUnroutedPathSuccessors(@Param("elid") String elid, ServiceTelcoUnroutedPathSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathSuccessorsQueryParams queryParams);

  /**
  * Get relations to Successor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathSuccessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathSuccessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Successors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathSuccessorsResponseData> serviceTelcoUnroutedPathSuccessorsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathSuccessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathSuccessors</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathSuccessorsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathSuccessorsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathSystemAttributesResponse serviceTelcoUnroutedPathSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoUnroutedPathSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathSystemAttributesResponse> serviceTelcoUnroutedPathSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathSystemAttributesResponse serviceTelcoUnroutedPathSystemAttributes(@Param("elid") String elid, ServiceTelcoUnroutedPathSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathSystemAttributesResponse> serviceTelcoUnroutedPathSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedPathVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedPathVlansResponseData serviceTelcoUnroutedPathVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoUnroutedPathVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedPathVlansResponseData> serviceTelcoUnroutedPathVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedPathVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedPathVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedPathVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedPathVlansResponseData serviceTelcoUnroutedPathVlans(@Param("elid") String elid, ServiceTelcoUnroutedPathVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedPathVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedPathVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedPathVlansResponseData> serviceTelcoUnroutedPathVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedPathVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedPathVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedPathVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedPathVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedPathVlansQueryParams sessionId(final String value) {
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
   * @return UpdateServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoUnroutedPathResponse updateServiceTelcoUnroutedPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoUnroutedPathRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoUnroutedPath</code> but it also returns the http response headers .
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoUnroutedPathResponse> updateServiceTelcoUnroutedPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoUnroutedPathRequestData body);


  /**
   * Modify
   * Modify service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoUnroutedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoUnroutedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoUnroutedPathResponse updateServiceTelcoUnroutedPath(@Param("elid") String elid, UpdateServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoUnroutedPathQueryParams queryParams);

  /**
  * Modify
  * Modify service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoUnroutedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoUnroutedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoUnroutedPathResponse> updateServiceTelcoUnroutedPathWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoUnroutedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoUnroutedPath</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoUnroutedPathQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoUnroutedPathQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoUnroutedPathResponse updateSystemAttributesServiceTelcoUnroutedPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedPathRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoUnroutedPath</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoUnroutedPathResponse> updateSystemAttributesServiceTelcoUnroutedPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedPathRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoUnroutedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoUnroutedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoUnroutedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoUnroutedPathResponse updateSystemAttributesServiceTelcoUnroutedPath(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoUnroutedPathQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoUnroutedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoUnroutedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoUnroutedPathResponse> updateSystemAttributesServiceTelcoUnroutedPathWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoUnroutedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoUnroutedPath</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoUnroutedPathQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoUnroutedPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
