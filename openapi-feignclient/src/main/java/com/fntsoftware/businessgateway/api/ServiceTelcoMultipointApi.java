package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceTelcoMultipointRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoMultipointResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoMultipointRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoMultipointResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipoint100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipoint100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointRoutingRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointRoutingResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoMultipointVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoMultipointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoMultipointResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoMultipointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoMultipointResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ServiceTelcoMultipointApi extends ApiClient.Api {


  /**
   * Create
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoMultipointResponse createServiceTelcoMultipoint(@Param("sessionId") String sessionId, CreateServiceTelcoMultipointRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoMultipoint</code> but it also returns the http response headers .
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoMultipointResponse> createServiceTelcoMultipointWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoMultipointRequestData body);


  /**
   * Create
   * Create service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoMultipointResponse createServiceTelcoMultipoint(CreateServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) CreateServiceTelcoMultipointQueryParams queryParams);

  /**
  * Create
  * Create service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoMultipointResponse> createServiceTelcoMultipointWithHttpInfo(CreateServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) CreateServiceTelcoMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoMultipoint</code> method in a fluent style.
   */
  public static class CreateServiceTelcoMultipointQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoMultipointQueryParams sessionId(final String value) {
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
   * @return DeleteServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoMultipointResponse deleteServiceTelcoMultipoint(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoMultipointRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoMultipoint</code> but it also returns the http response headers .
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoMultipointResponse> deleteServiceTelcoMultipointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoMultipointRequestData body);


  /**
   * Delete
   * Delete service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoMultipointResponse deleteServiceTelcoMultipoint(@Param("elid") String elid, DeleteServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoMultipointQueryParams queryParams);

  /**
  * Delete
  * Delete service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoMultipointResponse> deleteServiceTelcoMultipointWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoMultipoint</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoMultipointQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoMultipointQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipoint100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipoint100042ResponseData serviceTelcoMultipoint100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipoint100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoMultipoint100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipoint100042ResponseData> serviceTelcoMultipoint100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipoint100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipoint100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipoint100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipoint100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipoint100042ResponseData serviceTelcoMultipoint100042(@Param("elid") String elid, ServiceTelcoMultipoint100042RequestData body, @QueryMap(encoded=true) ServiceTelcoMultipoint100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipoint100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipoint100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipoint100042ResponseData> serviceTelcoMultipoint100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipoint100042RequestData body, @QueryMap(encoded=true) ServiceTelcoMultipoint100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipoint100042</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipoint100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipoint100042QueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse serviceTelcoMultipointBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>serviceTelcoMultipointBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse> serviceTelcoMultipointBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * Note, this is equivalent to the other <code>serviceTelcoMultipointBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse serviceTelcoMultipointBandwidthBookingForPacketDataService(@Param("elid") String elid, ServiceTelcoMultipointBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service.
  * Note, this is equivalent to the other <code>serviceTelcoMultipointBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointBandwidthBookingForPacketDataServiceResponse> serviceTelcoMultipointBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointBandwidthForPacketDataServiceResponse serviceTelcoMultipointBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>serviceTelcoMultipointBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointBandwidthForPacketDataServiceResponse> serviceTelcoMultipointBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service.
   * Note, this is equivalent to the other <code>serviceTelcoMultipointBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointBandwidthForPacketDataServiceResponse serviceTelcoMultipointBandwidthForPacketDataService(@Param("elid") String elid, ServiceTelcoMultipointBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service.
  * Note, this is equivalent to the other <code>serviceTelcoMultipointBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointBandwidthForPacketDataServiceResponse> serviceTelcoMultipointBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointContractsResponseData serviceTelcoMultipointContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoMultipointContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointContractsResponseData> serviceTelcoMultipointContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointContractsResponseData serviceTelcoMultipointContracts(@Param("elid") String elid, ServiceTelcoMultipointContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointContractsResponseData> serviceTelcoMultipointContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointCustomCablesResponseData serviceTelcoMultipointCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoMultipointCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointCustomCablesResponseData> serviceTelcoMultipointCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointCustomCablesResponseData serviceTelcoMultipointCustomCables(@Param("elid") String elid, ServiceTelcoMultipointCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointCustomCablesResponseData> serviceTelcoMultipointCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointCustomDataCablesResponseData serviceTelcoMultipointCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoMultipointCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointCustomDataCablesResponseData> serviceTelcoMultipointCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointCustomDataCablesResponseData serviceTelcoMultipointCustomDataCables(@Param("elid") String elid, ServiceTelcoMultipointCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointCustomDataCablesResponseData> serviceTelcoMultipointCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointCustomDataCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointCustomIpaccessSvcResponseData serviceTelcoMultipointCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoMultipointCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointCustomIpaccessSvcResponseData> serviceTelcoMultipointCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointCustomIpaccessSvcResponseData serviceTelcoMultipointCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoMultipointCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointCustomIpaccessSvcResponseData> serviceTelcoMultipointCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointCustomPowerCablesResponseData serviceTelcoMultipointCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoMultipointCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointCustomPowerCablesResponseData> serviceTelcoMultipointCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointCustomPowerCablesResponseData serviceTelcoMultipointCustomPowerCables(@Param("elid") String elid, ServiceTelcoMultipointCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointCustomPowerCablesResponseData> serviceTelcoMultipointCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointDevicesAllResponseData serviceTelcoMultipointDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoMultipointDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointDevicesAllResponseData> serviceTelcoMultipointDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointDevicesAllResponseData serviceTelcoMultipointDevicesAll(@Param("elid") String elid, ServiceTelcoMultipointDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointDevicesAllResponseData> serviceTelcoMultipointDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointFrameContractsResponseData serviceTelcoMultipointFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoMultipointFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointFrameContractsResponseData> serviceTelcoMultipointFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointFrameContractsResponseData serviceTelcoMultipointFrameContracts(@Param("elid") String elid, ServiceTelcoMultipointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointFrameContractsResponseData> serviceTelcoMultipointFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointHigherLevelServicesResponseData serviceTelcoMultipointHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoMultipointHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointHigherLevelServicesResponseData> serviceTelcoMultipointHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointHigherLevelServicesResponseData serviceTelcoMultipointHigherLevelServices(@Param("elid") String elid, ServiceTelcoMultipointHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointHigherLevelServicesResponseData> serviceTelcoMultipointHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointHigherLevelServicesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointMaintenanceContractsResponseData serviceTelcoMultipointMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoMultipointMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointMaintenanceContractsResponseData> serviceTelcoMultipointMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointMaintenanceContractsResponseData serviceTelcoMultipointMaintenanceContracts(@Param("elid") String elid, ServiceTelcoMultipointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointMaintenanceContractsResponseData> serviceTelcoMultipointMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointOrganizationsResponseData serviceTelcoMultipointOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoMultipointOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointOrganizationsResponseData> serviceTelcoMultipointOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointOrganizationsResponseData serviceTelcoMultipointOrganizations(@Param("elid") String elid, ServiceTelcoMultipointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointOrganizationsResponseData> serviceTelcoMultipointOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointPersonGroupsResponseData serviceTelcoMultipointPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoMultipointPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointPersonGroupsResponseData> serviceTelcoMultipointPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointPersonGroupsResponseData serviceTelcoMultipointPersonGroups(@Param("elid") String elid, ServiceTelcoMultipointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointPersonGroupsResponseData> serviceTelcoMultipointPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointPersonsResponseData serviceTelcoMultipointPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoMultipointPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointPersonsResponseData> serviceTelcoMultipointPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointPersonsResponseData serviceTelcoMultipointPersons(@Param("elid") String elid, ServiceTelcoMultipointPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointPersonsResponseData> serviceTelcoMultipointPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoMultipointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointQueryResponse serviceTelcoMultipointQuery(@Param("sessionId") String sessionId, ServiceTelcoMultipointQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoMultipointQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointQueryResponse> serviceTelcoMultipointQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoMultipointQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoMultipointQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointQueryResponse serviceTelcoMultipointQuery(ServiceTelcoMultipointQueryRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoMultipointQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointQueryResponse> serviceTelcoMultipointQueryWithHttpInfo(ServiceTelcoMultipointQueryRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Routing Packet data entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoMultipointRoutingResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Routing?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointRoutingResponseData serviceTelcoMultipointRouting(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointRoutingRequestData body);

  /**
   * Get relations to Routing Packet data entities
   * Similar to <code>serviceTelcoMultipointRouting</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Routing?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointRoutingResponseData> serviceTelcoMultipointRoutingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointRoutingRequestData body);


  /**
   * Get relations to Routing Packet data entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointRouting</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointRoutingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointRoutingResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Routing?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointRoutingResponseData serviceTelcoMultipointRouting(@Param("elid") String elid, ServiceTelcoMultipointRoutingRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointRoutingQueryParams queryParams);

  /**
  * Get relations to Routing Packet data entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointRouting</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointRoutingResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Routing?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointRoutingResponseData> serviceTelcoMultipointRoutingWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointRoutingRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointRoutingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointRouting</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointRoutingQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointRoutingQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointServiceAccessPointsResponseData serviceTelcoMultipointServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoMultipointServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointServiceAccessPointsResponseData> serviceTelcoMultipointServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointServiceAccessPointsResponseData serviceTelcoMultipointServiceAccessPoints(@Param("elid") String elid, ServiceTelcoMultipointServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointServiceAccessPointsResponseData> serviceTelcoMultipointServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointServiceTypeDefinitionResponseData serviceTelcoMultipointServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoMultipointServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointServiceTypeDefinitionResponseData> serviceTelcoMultipointServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointServiceTypeDefinitionResponseData serviceTelcoMultipointServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoMultipointServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointServiceTypeDefinitionResponseData> serviceTelcoMultipointServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointServicesTelcoResponseData serviceTelcoMultipointServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoMultipointServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointServicesTelcoResponseData> serviceTelcoMultipointServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointServicesTelcoResponseData serviceTelcoMultipointServicesTelco(@Param("elid") String elid, ServiceTelcoMultipointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointServicesTelcoResponseData> serviceTelcoMultipointServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointSystemAttributesResponse serviceTelcoMultipointSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoMultipointSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointSystemAttributesResponse> serviceTelcoMultipointSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoMultipointSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointSystemAttributesResponse serviceTelcoMultipointSystemAttributes(@Param("elid") String elid, ServiceTelcoMultipointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoMultipointSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointSystemAttributesResponse> serviceTelcoMultipointSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoMultipointSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoMultipointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoMultipointVlansResponseData serviceTelcoMultipointVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoMultipointVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoMultipointVlansResponseData> serviceTelcoMultipointVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoMultipointVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoMultipointVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoMultipointVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoMultipointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoMultipointVlansResponseData serviceTelcoMultipointVlans(@Param("elid") String elid, ServiceTelcoMultipointVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoMultipointVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoMultipointVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoMultipointVlansResponseData> serviceTelcoMultipointVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoMultipointVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoMultipointVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoMultipointVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoMultipointVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoMultipointVlansQueryParams sessionId(final String value) {
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
   * @return UpdateServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoMultipointResponse updateServiceTelcoMultipoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoMultipointRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoMultipoint</code> but it also returns the http response headers .
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoMultipointResponse> updateServiceTelcoMultipointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoMultipointRequestData body);


  /**
   * Modify
   * Modify service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoMultipointResponse updateServiceTelcoMultipoint(@Param("elid") String elid, UpdateServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoMultipointQueryParams queryParams);

  /**
  * Modify
  * Modify service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoMultipointResponse> updateServiceTelcoMultipointWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoMultipoint</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoMultipointQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoMultipointQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoMultipointResponse updateSystemAttributesServiceTelcoMultipoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoMultipointRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoMultipoint</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoMultipointResponse> updateSystemAttributesServiceTelcoMultipointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoMultipointRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoMultipoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoMultipointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoMultipointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoMultipointResponse updateSystemAttributesServiceTelcoMultipoint(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoMultipointQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoMultipoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoMultipointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoMultipoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoMultipointResponse> updateSystemAttributesServiceTelcoMultipointWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoMultipointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoMultipointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoMultipoint</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoMultipointQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoMultipointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
