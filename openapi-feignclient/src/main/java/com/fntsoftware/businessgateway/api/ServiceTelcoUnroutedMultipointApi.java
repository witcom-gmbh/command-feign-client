package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceTelcoUnroutedMultipointRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoUnroutedMultipointResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoUnroutedMultipointRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoUnroutedMultipointResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipoint100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipoint100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoUnroutedMultipointVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoUnroutedMultipointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoUnroutedMultipointResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ServiceTelcoUnroutedMultipointApi extends ApiClient.Api {


  /**
   * Create
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoUnroutedMultipointResponse createServiceTelcoUnroutedMultipoint(@Param("sessionId") String sessionId, CreateServiceTelcoUnroutedMultipointRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoUnroutedMultipoint</code> but it also returns the http response headers .
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoUnroutedMultipointResponse> createServiceTelcoUnroutedMultipointWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoUnroutedMultipointRequestData body);


  /**
   * Create
   * Create service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoUnroutedMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoUnroutedMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoUnroutedMultipointResponse createServiceTelcoUnroutedMultipoint(CreateServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) CreateServiceTelcoUnroutedMultipointQueryParams queryParams);

  /**
  * Create
  * Create service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoUnroutedMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoUnroutedMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoUnroutedMultipointResponse> createServiceTelcoUnroutedMultipointWithHttpInfo(CreateServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) CreateServiceTelcoUnroutedMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoUnroutedMultipoint</code> method in a fluent style.
   */
  public static class CreateServiceTelcoUnroutedMultipointQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoUnroutedMultipointQueryParams sessionId(final String value) {
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
   * @return DeleteServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoUnroutedMultipointResponse deleteServiceTelcoUnroutedMultipoint(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoUnroutedMultipointRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoUnroutedMultipoint</code> but it also returns the http response headers .
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoUnroutedMultipointResponse> deleteServiceTelcoUnroutedMultipointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoUnroutedMultipointRequestData body);


  /**
   * Delete
   * Delete service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoUnroutedMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoUnroutedMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoUnroutedMultipointResponse deleteServiceTelcoUnroutedMultipoint(@Param("elid") String elid, DeleteServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoUnroutedMultipointQueryParams queryParams);

  /**
  * Delete
  * Delete service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoUnroutedMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoUnroutedMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoUnroutedMultipointResponse> deleteServiceTelcoUnroutedMultipointWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoUnroutedMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoUnroutedMultipoint</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoUnroutedMultipointQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoUnroutedMultipointQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipoint100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipoint100042ResponseData serviceTelcoUnroutedMultipoint100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipoint100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoUnroutedMultipoint100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipoint100042ResponseData> serviceTelcoUnroutedMultipoint100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipoint100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipoint100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipoint100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipoint100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipoint100042ResponseData serviceTelcoUnroutedMultipoint100042(@Param("elid") String elid, ServiceTelcoUnroutedMultipoint100042RequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipoint100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipoint100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipoint100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipoint100042ResponseData> serviceTelcoUnroutedMultipoint100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipoint100042RequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipoint100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipoint100042</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipoint100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipoint100042QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse> serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataService(@Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service.
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceResponse> serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse serviceTelcoUnroutedMultipointBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>serviceTelcoUnroutedMultipointBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse> serviceTelcoUnroutedMultipointBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service.
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse serviceTelcoUnroutedMultipointBandwidthForPacketDataService(@Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service.
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceResponse> serviceTelcoUnroutedMultipointBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointContractsResponseData serviceTelcoUnroutedMultipointContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoUnroutedMultipointContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointContractsResponseData> serviceTelcoUnroutedMultipointContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointContractsResponseData serviceTelcoUnroutedMultipointContracts(@Param("elid") String elid, ServiceTelcoUnroutedMultipointContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointContractsResponseData> serviceTelcoUnroutedMultipointContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomCablesResponseData serviceTelcoUnroutedMultipointCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoUnroutedMultipointCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointCustomCablesResponseData> serviceTelcoUnroutedMultipointCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomCablesResponseData serviceTelcoUnroutedMultipointCustomCables(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointCustomCablesResponseData> serviceTelcoUnroutedMultipointCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomDataCablesResponseData serviceTelcoUnroutedMultipointCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoUnroutedMultipointCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointCustomDataCablesResponseData> serviceTelcoUnroutedMultipointCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomDataCablesResponseData serviceTelcoUnroutedMultipointCustomDataCables(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointCustomDataCablesResponseData> serviceTelcoUnroutedMultipointCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointCustomDataCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData serviceTelcoUnroutedMultipointCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoUnroutedMultipointCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData> serviceTelcoUnroutedMultipointCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData serviceTelcoUnroutedMultipointCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointCustomIpaccessSvcResponseData> serviceTelcoUnroutedMultipointCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData serviceTelcoUnroutedMultipointCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoUnroutedMultipointCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData> serviceTelcoUnroutedMultipointCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData serviceTelcoUnroutedMultipointCustomPowerCables(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointCustomPowerCablesResponseData> serviceTelcoUnroutedMultipointCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointDevicesAllResponseData serviceTelcoUnroutedMultipointDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoUnroutedMultipointDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointDevicesAllResponseData> serviceTelcoUnroutedMultipointDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointDevicesAllResponseData serviceTelcoUnroutedMultipointDevicesAll(@Param("elid") String elid, ServiceTelcoUnroutedMultipointDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointDevicesAllResponseData> serviceTelcoUnroutedMultipointDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointFrameContractsResponseData serviceTelcoUnroutedMultipointFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoUnroutedMultipointFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointFrameContractsResponseData> serviceTelcoUnroutedMultipointFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointFrameContractsResponseData serviceTelcoUnroutedMultipointFrameContracts(@Param("elid") String elid, ServiceTelcoUnroutedMultipointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointFrameContractsResponseData> serviceTelcoUnroutedMultipointFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData serviceTelcoUnroutedMultipointHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoUnroutedMultipointHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData> serviceTelcoUnroutedMultipointHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData serviceTelcoUnroutedMultipointHigherLevelServices(@Param("elid") String elid, ServiceTelcoUnroutedMultipointHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointHigherLevelServicesResponseData> serviceTelcoUnroutedMultipointHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointHigherLevelServicesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointLogicalPortsResponseData serviceTelcoUnroutedMultipointLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointLogicalPortsRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>serviceTelcoUnroutedMultipointLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointLogicalPortsResponseData> serviceTelcoUnroutedMultipointLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointLogicalPortsRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointLogicalPortsResponseData serviceTelcoUnroutedMultipointLogicalPorts(@Param("elid") String elid, ServiceTelcoUnroutedMultipointLogicalPortsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointLogicalPortsResponseData> serviceTelcoUnroutedMultipointLogicalPortsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointLogicalPortsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointLogicalPorts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointLogicalPortsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointLogicalPortsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData serviceTelcoUnroutedMultipointMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoUnroutedMultipointMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData> serviceTelcoUnroutedMultipointMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData serviceTelcoUnroutedMultipointMaintenanceContracts(@Param("elid") String elid, ServiceTelcoUnroutedMultipointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointMaintenanceContractsResponseData> serviceTelcoUnroutedMultipointMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointOrganizationsResponseData serviceTelcoUnroutedMultipointOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoUnroutedMultipointOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointOrganizationsResponseData> serviceTelcoUnroutedMultipointOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointOrganizationsResponseData serviceTelcoUnroutedMultipointOrganizations(@Param("elid") String elid, ServiceTelcoUnroutedMultipointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointOrganizationsResponseData> serviceTelcoUnroutedMultipointOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointPersonGroupsResponseData serviceTelcoUnroutedMultipointPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoUnroutedMultipointPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointPersonGroupsResponseData> serviceTelcoUnroutedMultipointPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointPersonGroupsResponseData serviceTelcoUnroutedMultipointPersonGroups(@Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointPersonGroupsResponseData> serviceTelcoUnroutedMultipointPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointPersonsResponseData serviceTelcoUnroutedMultipointPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoUnroutedMultipointPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointPersonsResponseData> serviceTelcoUnroutedMultipointPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointPersonsResponseData serviceTelcoUnroutedMultipointPersons(@Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointPersonsResponseData> serviceTelcoUnroutedMultipointPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoUnroutedMultipointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointQueryResponse serviceTelcoUnroutedMultipointQuery(@Param("sessionId") String sessionId, ServiceTelcoUnroutedMultipointQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoUnroutedMultipointQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointQueryResponse> serviceTelcoUnroutedMultipointQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoUnroutedMultipointQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointQueryResponse serviceTelcoUnroutedMultipointQuery(ServiceTelcoUnroutedMultipointQueryRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointQueryResponse> serviceTelcoUnroutedMultipointQueryWithHttpInfo(ServiceTelcoUnroutedMultipointQueryRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointQueryQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData serviceTelcoUnroutedMultipointServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoUnroutedMultipointServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData> serviceTelcoUnroutedMultipointServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData serviceTelcoUnroutedMultipointServiceAccessPoints(@Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointServiceAccessPointsResponseData> serviceTelcoUnroutedMultipointServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData serviceTelcoUnroutedMultipointServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoUnroutedMultipointServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData> serviceTelcoUnroutedMultipointServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData serviceTelcoUnroutedMultipointServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointServiceTypeDefinitionResponseData> serviceTelcoUnroutedMultipointServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointServicesTelcoResponseData serviceTelcoUnroutedMultipointServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoUnroutedMultipointServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointServicesTelcoResponseData> serviceTelcoUnroutedMultipointServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointServicesTelcoResponseData serviceTelcoUnroutedMultipointServicesTelco(@Param("elid") String elid, ServiceTelcoUnroutedMultipointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointServicesTelcoResponseData> serviceTelcoUnroutedMultipointServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointSystemAttributesResponse serviceTelcoUnroutedMultipointSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoUnroutedMultipointSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointSystemAttributesResponse> serviceTelcoUnroutedMultipointSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointSystemAttributesResponse serviceTelcoUnroutedMultipointSystemAttributes(@Param("elid") String elid, ServiceTelcoUnroutedMultipointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointSystemAttributesResponse> serviceTelcoUnroutedMultipointSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoUnroutedMultipointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointVlansResponseData serviceTelcoUnroutedMultipointVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoUnroutedMultipointVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoUnroutedMultipointVlansResponseData> serviceTelcoUnroutedMultipointVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoUnroutedMultipointVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoUnroutedMultipointVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoUnroutedMultipointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoUnroutedMultipointVlansResponseData serviceTelcoUnroutedMultipointVlans(@Param("elid") String elid, ServiceTelcoUnroutedMultipointVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoUnroutedMultipointVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoUnroutedMultipointVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoUnroutedMultipointVlansResponseData> serviceTelcoUnroutedMultipointVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoUnroutedMultipointVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoUnroutedMultipointVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoUnroutedMultipointVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoUnroutedMultipointVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoUnroutedMultipointVlansQueryParams sessionId(final String value) {
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
   * @return UpdateServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoUnroutedMultipointResponse updateServiceTelcoUnroutedMultipoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoUnroutedMultipointRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoUnroutedMultipoint</code> but it also returns the http response headers .
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoUnroutedMultipointResponse> updateServiceTelcoUnroutedMultipointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoUnroutedMultipointRequestData body);


  /**
   * Modify
   * Modify service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoUnroutedMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoUnroutedMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoUnroutedMultipointResponse updateServiceTelcoUnroutedMultipoint(@Param("elid") String elid, UpdateServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoUnroutedMultipointQueryParams queryParams);

  /**
  * Modify
  * Modify service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoUnroutedMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoUnroutedMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoUnroutedMultipointResponse> updateServiceTelcoUnroutedMultipointWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoUnroutedMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoUnroutedMultipoint</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoUnroutedMultipointQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoUnroutedMultipointQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse updateSystemAttributesServiceTelcoUnroutedMultipoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoUnroutedMultipoint</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse> updateSystemAttributesServiceTelcoUnroutedMultipointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoUnroutedMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoUnroutedMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse updateSystemAttributesServiceTelcoUnroutedMultipoint(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoUnroutedMultipointQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoUnroutedMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoUnroutedMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoUnroutedMultipointResponse> updateSystemAttributesServiceTelcoUnroutedMultipointWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoUnroutedMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoUnroutedMultipoint</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoUnroutedMultipointQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoUnroutedMultipointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
