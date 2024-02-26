package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddRouteServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.AddRouteServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.CreatePacketDataServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.CreatePacketDataServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.RemoveRouteServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.RemoveRouteServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPath100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPath100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathLogicalPortOutputEndRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathLogicalPortOutputEndResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathLogicalPortOutputStartRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathLogicalPortOutputStartResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathPredecessorRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathPredecessorResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathRoutingCircuitSwitchedRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathRoutingCircuitSwitchedResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathRoutingPacketDataRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathRoutingPacketDataResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathStructuresRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathStructuresResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathSuccessorsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathSuccessorsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoPathVlansResponseData;
import com.fntsoftware.businessgateway.entities.SwitchRouteServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.SwitchRouteServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoPathResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoPathResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceTelcoPathApi extends ApiClient.Api {


  /**
   * Add route
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddRouteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/addRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddRouteServiceTelcoPathResponse addRouteServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, AddRouteServiceTelcoPathRequestData body);

  /**
   * Add route
   * Similar to <code>addRouteServiceTelcoPath</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/addRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddRouteServiceTelcoPathResponse> addRouteServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddRouteServiceTelcoPathRequestData body);


  /**
   * Add route
   * 
   * Note, this is equivalent to the other <code>addRouteServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddRouteServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddRouteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/addRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddRouteServiceTelcoPathResponse addRouteServiceTelcoPath(@Param("elid") String elid, AddRouteServiceTelcoPathRequestData body, @QueryMap(encoded=true) AddRouteServiceTelcoPathQueryParams queryParams);

  /**
  * Add route
  * 
  * Note, this is equivalent to the other <code>addRouteServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddRouteServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/addRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddRouteServiceTelcoPathResponse> addRouteServiceTelcoPathWithHttpInfo(@Param("elid") String elid, AddRouteServiceTelcoPathRequestData body, @QueryMap(encoded=true) AddRouteServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addRouteServiceTelcoPath</code> method in a fluent style.
   */
  public static class AddRouteServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public AddRouteServiceTelcoPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create packet data
   * Create packet data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePacketDataServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/createPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePacketDataServiceTelcoPathResponse createPacketDataServiceTelcoPath(@Param("sessionId") String sessionId, CreatePacketDataServiceTelcoPathRequestData body);

  /**
   * Create packet data
   * Similar to <code>createPacketDataServiceTelcoPath</code> but it also returns the http response headers .
   * Create packet data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/createPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePacketDataServiceTelcoPathResponse> createPacketDataServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, CreatePacketDataServiceTelcoPathRequestData body);


  /**
   * Create packet data
   * Create packet data
   * Note, this is equivalent to the other <code>createPacketDataServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePacketDataServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePacketDataServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/createPacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePacketDataServiceTelcoPathResponse createPacketDataServiceTelcoPath(CreatePacketDataServiceTelcoPathRequestData body, @QueryMap(encoded=true) CreatePacketDataServiceTelcoPathQueryParams queryParams);

  /**
  * Create packet data
  * Create packet data
  * Note, this is equivalent to the other <code>createPacketDataServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePacketDataServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/createPacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePacketDataServiceTelcoPathResponse> createPacketDataServiceTelcoPathWithHttpInfo(CreatePacketDataServiceTelcoPathRequestData body, @QueryMap(encoded=true) CreatePacketDataServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPacketDataServiceTelcoPath</code> method in a fluent style.
   */
  public static class CreatePacketDataServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public CreatePacketDataServiceTelcoPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoPathResponse createServiceTelcoPath(@Param("sessionId") String sessionId, CreateServiceTelcoPathRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoPath</code> but it also returns the http response headers .
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoPathResponse> createServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoPathRequestData body);


  /**
   * Create
   * Create service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoPathResponse createServiceTelcoPath(CreateServiceTelcoPathRequestData body, @QueryMap(encoded=true) CreateServiceTelcoPathQueryParams queryParams);

  /**
  * Create
  * Create service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoPathResponse> createServiceTelcoPathWithHttpInfo(CreateServiceTelcoPathRequestData body, @QueryMap(encoded=true) CreateServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoPath</code> method in a fluent style.
   */
  public static class CreateServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoPathQueryParams sessionId(final String value) {
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
   * @return DeleteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoPathResponse deleteServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoPathRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoPath</code> but it also returns the http response headers .
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoPathResponse> deleteServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoPathRequestData body);


  /**
   * Delete
   * Delete service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoPathResponse deleteServiceTelcoPath(@Param("elid") String elid, DeleteServiceTelcoPathRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoPathQueryParams queryParams);

  /**
  * Delete
  * Delete service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoPathResponse> deleteServiceTelcoPathWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoPathRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoPath</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Remove route
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RemoveRouteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/removeRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveRouteServiceTelcoPathResponse removeRouteServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveRouteServiceTelcoPathRequestData body);

  /**
   * Remove route
   * Similar to <code>removeRouteServiceTelcoPath</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/removeRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveRouteServiceTelcoPathResponse> removeRouteServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveRouteServiceTelcoPathRequestData body);


  /**
   * Remove route
   * 
   * Note, this is equivalent to the other <code>removeRouteServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveRouteServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveRouteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/removeRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveRouteServiceTelcoPathResponse removeRouteServiceTelcoPath(@Param("elid") String elid, RemoveRouteServiceTelcoPathRequestData body, @QueryMap(encoded=true) RemoveRouteServiceTelcoPathQueryParams queryParams);

  /**
  * Remove route
  * 
  * Note, this is equivalent to the other <code>removeRouteServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveRouteServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/removeRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveRouteServiceTelcoPathResponse> removeRouteServiceTelcoPathWithHttpInfo(@Param("elid") String elid, RemoveRouteServiceTelcoPathRequestData body, @QueryMap(encoded=true) RemoveRouteServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeRouteServiceTelcoPath</code> method in a fluent style.
   */
  public static class RemoveRouteServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public RemoveRouteServiceTelcoPathQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPath100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPath100042ResponseData serviceTelcoPath100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPath100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoPath100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPath100042ResponseData> serviceTelcoPath100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPath100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPath100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPath100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPath100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPath100042ResponseData serviceTelcoPath100042(@Param("elid") String elid, ServiceTelcoPath100042RequestData body, @QueryMap(encoded=true) ServiceTelcoPath100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPath100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPath100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPath100042ResponseData> serviceTelcoPath100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoPath100042RequestData body, @QueryMap(encoded=true) ServiceTelcoPath100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPath100042</code> method in a fluent style.
   */
  public static class ServiceTelcoPath100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoPath100042QueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse serviceTelcoPathBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>serviceTelcoPathBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse> serviceTelcoPathBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service
   * Note, this is equivalent to the other <code>serviceTelcoPathBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse serviceTelcoPathBandwidthBookingForPacketDataService(@Param("elid") String elid, ServiceTelcoPathBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPathBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service
  * Note, this is equivalent to the other <code>serviceTelcoPathBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathBandwidthBookingForPacketDataServiceResponse> serviceTelcoPathBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPathBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoPathBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathBandwidthForPacketDataServiceResponse serviceTelcoPathBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>serviceTelcoPathBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathBandwidthForPacketDataServiceResponse> serviceTelcoPathBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service
   * Note, this is equivalent to the other <code>serviceTelcoPathBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathBandwidthForPacketDataServiceResponse serviceTelcoPathBandwidthForPacketDataService(@Param("elid") String elid, ServiceTelcoPathBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPathBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service
  * Note, this is equivalent to the other <code>serviceTelcoPathBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathBandwidthForPacketDataServiceResponse> serviceTelcoPathBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoPathBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoPathBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathContractsResponseData serviceTelcoPathContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoPathContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathContractsResponseData> serviceTelcoPathContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathContractsResponseData serviceTelcoPathContracts(@Param("elid") String elid, ServiceTelcoPathContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathContractsResponseData> serviceTelcoPathContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoPathContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathCustomCablesResponseData serviceTelcoPathCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoPathCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathCustomCablesResponseData> serviceTelcoPathCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathCustomCablesResponseData serviceTelcoPathCustomCables(@Param("elid") String elid, ServiceTelcoPathCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathCustomCablesResponseData> serviceTelcoPathCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoPathCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathCustomDataCablesResponseData serviceTelcoPathCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoPathCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathCustomDataCablesResponseData> serviceTelcoPathCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathCustomDataCablesResponseData serviceTelcoPathCustomDataCables(@Param("elid") String elid, ServiceTelcoPathCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathCustomDataCablesResponseData> serviceTelcoPathCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoPathCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathCustomDataCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathCustomIpaccessSvcResponseData serviceTelcoPathCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoPathCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathCustomIpaccessSvcResponseData> serviceTelcoPathCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathCustomIpaccessSvcResponseData serviceTelcoPathCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoPathCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathCustomIpaccessSvcResponseData> serviceTelcoPathCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoPathCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathCustomPowerCablesResponseData serviceTelcoPathCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoPathCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathCustomPowerCablesResponseData> serviceTelcoPathCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathCustomPowerCablesResponseData serviceTelcoPathCustomPowerCables(@Param("elid") String elid, ServiceTelcoPathCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathCustomPowerCablesResponseData> serviceTelcoPathCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoPathCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathDevicesAllResponseData serviceTelcoPathDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoPathDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathDevicesAllResponseData> serviceTelcoPathDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathDevicesAllResponseData serviceTelcoPathDevicesAll(@Param("elid") String elid, ServiceTelcoPathDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoPathDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathDevicesAllResponseData> serviceTelcoPathDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoPathDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoPathDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathFrameContractsResponseData serviceTelcoPathFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoPathFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathFrameContractsResponseData> serviceTelcoPathFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathFrameContractsResponseData serviceTelcoPathFrameContracts(@Param("elid") String elid, ServiceTelcoPathFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathFrameContractsResponseData> serviceTelcoPathFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoPathFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathHigherLevelServicesResponseData serviceTelcoPathHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoPathHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathHigherLevelServicesResponseData> serviceTelcoPathHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathHigherLevelServicesResponseData serviceTelcoPathHigherLevelServices(@Param("elid") String elid, ServiceTelcoPathHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathHigherLevelServicesResponseData> serviceTelcoPathHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoPathHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoPathHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathHigherLevelServicesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathLogicalPortOutputEndResponseData serviceTelcoPathLogicalPortOutputEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathLogicalPortOutputEndRequestData body);

  /**
   * Get relations to Output port end entities
   * Similar to <code>serviceTelcoPathLogicalPortOutputEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathLogicalPortOutputEndResponseData> serviceTelcoPathLogicalPortOutputEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathLogicalPortOutputEndRequestData body);


  /**
   * Get relations to Output port end entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathLogicalPortOutputEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathLogicalPortOutputEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathLogicalPortOutputEndResponseData serviceTelcoPathLogicalPortOutputEnd(@Param("elid") String elid, ServiceTelcoPathLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoPathLogicalPortOutputEndQueryParams queryParams);

  /**
  * Get relations to Output port end entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathLogicalPortOutputEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathLogicalPortOutputEndResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathLogicalPortOutputEndResponseData> serviceTelcoPathLogicalPortOutputEndWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoPathLogicalPortOutputEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathLogicalPortOutputEnd</code> method in a fluent style.
   */
  public static class ServiceTelcoPathLogicalPortOutputEndQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathLogicalPortOutputEndQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathLogicalPortOutputStartResponseData serviceTelcoPathLogicalPortOutputStart(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathLogicalPortOutputStartRequestData body);

  /**
   * Get relations to Output port start entities
   * Similar to <code>serviceTelcoPathLogicalPortOutputStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathLogicalPortOutputStartResponseData> serviceTelcoPathLogicalPortOutputStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathLogicalPortOutputStartRequestData body);


  /**
   * Get relations to Output port start entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathLogicalPortOutputStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathLogicalPortOutputStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathLogicalPortOutputStartResponseData serviceTelcoPathLogicalPortOutputStart(@Param("elid") String elid, ServiceTelcoPathLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoPathLogicalPortOutputStartQueryParams queryParams);

  /**
  * Get relations to Output port start entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathLogicalPortOutputStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathLogicalPortOutputStartResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathLogicalPortOutputStartResponseData> serviceTelcoPathLogicalPortOutputStartWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoPathLogicalPortOutputStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathLogicalPortOutputStart</code> method in a fluent style.
   */
  public static class ServiceTelcoPathLogicalPortOutputStartQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathLogicalPortOutputStartQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathMaintenanceContractsResponseData serviceTelcoPathMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoPathMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathMaintenanceContractsResponseData> serviceTelcoPathMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathMaintenanceContractsResponseData serviceTelcoPathMaintenanceContracts(@Param("elid") String elid, ServiceTelcoPathMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathMaintenanceContractsResponseData> serviceTelcoPathMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoPathMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathOrganizationsResponseData serviceTelcoPathOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoPathOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathOrganizationsResponseData> serviceTelcoPathOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathOrganizationsResponseData serviceTelcoPathOrganizations(@Param("elid") String elid, ServiceTelcoPathOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathOrganizationsResponseData> serviceTelcoPathOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoPathOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathPersonGroupsResponseData serviceTelcoPathPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoPathPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathPersonGroupsResponseData> serviceTelcoPathPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathPersonGroupsResponseData serviceTelcoPathPersonGroups(@Param("elid") String elid, ServiceTelcoPathPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathPersonGroupsResponseData> serviceTelcoPathPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoPathPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathPersonsResponseData serviceTelcoPathPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoPathPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathPersonsResponseData> serviceTelcoPathPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathPersonsResponseData serviceTelcoPathPersons(@Param("elid") String elid, ServiceTelcoPathPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathPersonsResponseData> serviceTelcoPathPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoPathPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathPersonsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathPredecessorResponseData serviceTelcoPathPredecessor(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathPredecessorRequestData body);

  /**
   * Get relations to Predecessor entities
   * Similar to <code>serviceTelcoPathPredecessor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathPredecessorResponseData> serviceTelcoPathPredecessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathPredecessorRequestData body);


  /**
   * Get relations to Predecessor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathPredecessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathPredecessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathPredecessorResponseData serviceTelcoPathPredecessor(@Param("elid") String elid, ServiceTelcoPathPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoPathPredecessorQueryParams queryParams);

  /**
  * Get relations to Predecessor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathPredecessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathPredecessorResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Predecessor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathPredecessorResponseData> serviceTelcoPathPredecessorWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoPathPredecessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathPredecessor</code> method in a fluent style.
   */
  public static class ServiceTelcoPathPredecessorQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathPredecessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathQueryResponse serviceTelcoPathQuery(@Param("sessionId") String sessionId, ServiceTelcoPathQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoPathQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathQueryResponse> serviceTelcoPathQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoPathQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoPathQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathQueryResponse serviceTelcoPathQuery(ServiceTelcoPathQueryRequest body, @QueryMap(encoded=true) ServiceTelcoPathQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoPathQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathQueryResponse> serviceTelcoPathQueryWithHttpInfo(ServiceTelcoPathQueryRequest body, @QueryMap(encoded=true) ServiceTelcoPathQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoPathQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Routing Circuit switched entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoPathRoutingCircuitSwitchedResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathRoutingCircuitSwitchedResponseData serviceTelcoPathRoutingCircuitSwitched(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathRoutingCircuitSwitchedRequestData body);

  /**
   * Get relations to Routing Circuit switched entities
   * Similar to <code>serviceTelcoPathRoutingCircuitSwitched</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathRoutingCircuitSwitchedResponseData> serviceTelcoPathRoutingCircuitSwitchedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathRoutingCircuitSwitchedRequestData body);


  /**
   * Get relations to Routing Circuit switched entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathRoutingCircuitSwitched</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathRoutingCircuitSwitchedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathRoutingCircuitSwitchedResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathRoutingCircuitSwitchedResponseData serviceTelcoPathRoutingCircuitSwitched(@Param("elid") String elid, ServiceTelcoPathRoutingCircuitSwitchedRequestData body, @QueryMap(encoded=true) ServiceTelcoPathRoutingCircuitSwitchedQueryParams queryParams);

  /**
  * Get relations to Routing Circuit switched entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathRoutingCircuitSwitched</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathRoutingCircuitSwitchedResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathRoutingCircuitSwitchedResponseData> serviceTelcoPathRoutingCircuitSwitchedWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathRoutingCircuitSwitchedRequestData body, @QueryMap(encoded=true) ServiceTelcoPathRoutingCircuitSwitchedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathRoutingCircuitSwitched</code> method in a fluent style.
   */
  public static class ServiceTelcoPathRoutingCircuitSwitchedQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathRoutingCircuitSwitchedQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathRoutingPacketDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathRoutingPacketDataResponseData serviceTelcoPathRoutingPacketData(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathRoutingPacketDataRequestData body);

  /**
   * Get relations to Routing Packet data entities
   * Similar to <code>serviceTelcoPathRoutingPacketData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathRoutingPacketDataResponseData> serviceTelcoPathRoutingPacketDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathRoutingPacketDataRequestData body);


  /**
   * Get relations to Routing Packet data entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathRoutingPacketData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathRoutingPacketDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathRoutingPacketDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingPacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathRoutingPacketDataResponseData serviceTelcoPathRoutingPacketData(@Param("elid") String elid, ServiceTelcoPathRoutingPacketDataRequestData body, @QueryMap(encoded=true) ServiceTelcoPathRoutingPacketDataQueryParams queryParams);

  /**
  * Get relations to Routing Packet data entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathRoutingPacketData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathRoutingPacketDataResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/RoutingPacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathRoutingPacketDataResponseData> serviceTelcoPathRoutingPacketDataWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathRoutingPacketDataRequestData body, @QueryMap(encoded=true) ServiceTelcoPathRoutingPacketDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathRoutingPacketData</code> method in a fluent style.
   */
  public static class ServiceTelcoPathRoutingPacketDataQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathRoutingPacketDataQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathServiceAccessPointsResponseData serviceTelcoPathServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoPathServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathServiceAccessPointsResponseData> serviceTelcoPathServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathServiceAccessPointsResponseData serviceTelcoPathServiceAccessPoints(@Param("elid") String elid, ServiceTelcoPathServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathServiceAccessPointsResponseData> serviceTelcoPathServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoPathServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathServiceTypeDefinitionResponseData serviceTelcoPathServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoPathServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathServiceTypeDefinitionResponseData> serviceTelcoPathServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathServiceTypeDefinitionResponseData serviceTelcoPathServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoPathServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoPathServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathServiceTypeDefinitionResponseData> serviceTelcoPathServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoPathServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoPathServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathServicesTelcoResponseData serviceTelcoPathServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoPathServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathServicesTelcoResponseData> serviceTelcoPathServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathServicesTelcoResponseData serviceTelcoPathServicesTelco(@Param("elid") String elid, ServiceTelcoPathServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoPathServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathServicesTelcoResponseData> serviceTelcoPathServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoPathServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoPathServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathStructuresResponse serviceTelcoPathStructures(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathStructuresRequest body);

  /**
   * Query structures
   * Similar to <code>serviceTelcoPathStructures</code> but it also returns the http response headers .
   * Queries the structures from one object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathStructuresResponse> serviceTelcoPathStructuresWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathStructuresRequest body);


  /**
   * Query structures
   * Queries the structures from one object
   * Note, this is equivalent to the other <code>serviceTelcoPathStructures</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathStructuresQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Structures?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathStructuresResponse serviceTelcoPathStructures(@Param("elid") String elid, ServiceTelcoPathStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoPathStructuresQueryParams queryParams);

  /**
  * Query structures
  * Queries the structures from one object
  * Note, this is equivalent to the other <code>serviceTelcoPathStructures</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathStructuresResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Structures?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathStructuresResponse> serviceTelcoPathStructuresWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoPathStructuresQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathStructures</code> method in a fluent style.
   */
  public static class ServiceTelcoPathStructuresQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathStructuresQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathSuccessorsResponseData serviceTelcoPathSuccessors(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathSuccessorsRequestData body);

  /**
   * Get relations to Successor entities
   * Similar to <code>serviceTelcoPathSuccessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathSuccessorsResponseData> serviceTelcoPathSuccessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathSuccessorsRequestData body);


  /**
   * Get relations to Successor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathSuccessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathSuccessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathSuccessorsResponseData serviceTelcoPathSuccessors(@Param("elid") String elid, ServiceTelcoPathSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathSuccessorsQueryParams queryParams);

  /**
  * Get relations to Successor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathSuccessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathSuccessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Successors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathSuccessorsResponseData> serviceTelcoPathSuccessorsWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoPathSuccessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathSuccessors</code> method in a fluent style.
   */
  public static class ServiceTelcoPathSuccessorsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathSuccessorsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathSystemAttributesResponse serviceTelcoPathSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoPathSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathSystemAttributesResponse> serviceTelcoPathSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoPathSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathSystemAttributesResponse serviceTelcoPathSystemAttributes(@Param("elid") String elid, ServiceTelcoPathSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoPathSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoPathSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathSystemAttributesResponse> serviceTelcoPathSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoPathSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoPathSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoPathVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoPathVlansResponseData serviceTelcoPathVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoPathVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoPathVlansResponseData> serviceTelcoPathVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoPathVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoPathVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoPathVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoPathVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoPathVlansResponseData serviceTelcoPathVlans(@Param("elid") String elid, ServiceTelcoPathVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoPathVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoPathVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoPathVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoPathVlansResponseData> serviceTelcoPathVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoPathVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoPathVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoPathVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoPathVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoPathVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Switch route
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SwitchRouteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/switchRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwitchRouteServiceTelcoPathResponse switchRouteServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchRouteServiceTelcoPathRequestData body);

  /**
   * Switch route
   * Similar to <code>switchRouteServiceTelcoPath</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/switchRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwitchRouteServiceTelcoPathResponse> switchRouteServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwitchRouteServiceTelcoPathRequestData body);


  /**
   * Switch route
   * 
   * Note, this is equivalent to the other <code>switchRouteServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwitchRouteServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwitchRouteServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/switchRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwitchRouteServiceTelcoPathResponse switchRouteServiceTelcoPath(@Param("elid") String elid, SwitchRouteServiceTelcoPathRequestData body, @QueryMap(encoded=true) SwitchRouteServiceTelcoPathQueryParams queryParams);

  /**
  * Switch route
  * 
  * Note, this is equivalent to the other <code>switchRouteServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwitchRouteServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/switchRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwitchRouteServiceTelcoPathResponse> switchRouteServiceTelcoPathWithHttpInfo(@Param("elid") String elid, SwitchRouteServiceTelcoPathRequestData body, @QueryMap(encoded=true) SwitchRouteServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>switchRouteServiceTelcoPath</code> method in a fluent style.
   */
  public static class SwitchRouteServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public SwitchRouteServiceTelcoPathQueryParams sessionId(final String value) {
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
   * @return UpdatePacketDataServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePacketDataServiceTelcoPathResponse updatePacketDataServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataServiceTelcoPathRequestData body);

  /**
   * Modify packet data
   * Similar to <code>updatePacketDataServiceTelcoPath</code> but it also returns the http response headers .
   * Modify packet data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePacketDataServiceTelcoPathResponse> updatePacketDataServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataServiceTelcoPathRequestData body);


  /**
   * Modify packet data
   * Modify packet data
   * Note, this is equivalent to the other <code>updatePacketDataServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePacketDataServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePacketDataServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePacketDataServiceTelcoPathResponse updatePacketDataServiceTelcoPath(@Param("elid") String elid, UpdatePacketDataServiceTelcoPathRequestData body, @QueryMap(encoded=true) UpdatePacketDataServiceTelcoPathQueryParams queryParams);

  /**
  * Modify packet data
  * Modify packet data
  * Note, this is equivalent to the other <code>updatePacketDataServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePacketDataServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updatePacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePacketDataServiceTelcoPathResponse> updatePacketDataServiceTelcoPathWithHttpInfo(@Param("elid") String elid, UpdatePacketDataServiceTelcoPathRequestData body, @QueryMap(encoded=true) UpdatePacketDataServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePacketDataServiceTelcoPath</code> method in a fluent style.
   */
  public static class UpdatePacketDataServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public UpdatePacketDataServiceTelcoPathQueryParams sessionId(final String value) {
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
   * @return UpdateServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoPathResponse updateServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoPathRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoPath</code> but it also returns the http response headers .
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoPathResponse> updateServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoPathRequestData body);


  /**
   * Modify
   * Modify service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoPathResponse updateServiceTelcoPath(@Param("elid") String elid, UpdateServiceTelcoPathRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoPathQueryParams queryParams);

  /**
  * Modify
  * Modify service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoPathResponse> updateServiceTelcoPathWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoPathRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoPath</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoPathQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoPathResponse updateSystemAttributesServiceTelcoPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoPathRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoPath</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoPathResponse> updateSystemAttributesServiceTelcoPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoPathRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoPathResponse updateSystemAttributesServiceTelcoPath(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoPathQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoPathResponse> updateSystemAttributesServiceTelcoPathWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoPath</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoPathQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
