package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceTelcoConcatenatedPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoConcatenatedPathResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoConcatenatedPathRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoConcatenatedPathResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPath100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPath100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathEndZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathEndZoneResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathLogicalPortOutputEndRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathLogicalPortOutputStartRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathPredecessorRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathPredecessorResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathRoutesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathRoutesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathStartZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathStartZoneResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathStructuresRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathStructuresResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathSuccessorsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathSuccessorsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoConcatenatedPathVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoConcatenatedPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoConcatenatedPathResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoConcatenatedPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoConcatenatedPathResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServiceTelcoConcatenatedPathApi extends ApiClient.Api {


  /**
   * Create
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoConcatenatedPathResponse createServiceTelcoConcatenatedPath(@Param("sessionId") String sessionId, CreateServiceTelcoConcatenatedPathRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoConcatenatedPath</code> but it also returns the http response headers .
   * Create service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoConcatenatedPathResponse> createServiceTelcoConcatenatedPathWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoConcatenatedPathRequestData body);


  /**
   * Create
   * Create service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoConcatenatedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoConcatenatedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoConcatenatedPathResponse createServiceTelcoConcatenatedPath(CreateServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) CreateServiceTelcoConcatenatedPathQueryParams queryParams);

  /**
  * Create
  * Create service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoConcatenatedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoConcatenatedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoConcatenatedPathResponse> createServiceTelcoConcatenatedPathWithHttpInfo(CreateServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) CreateServiceTelcoConcatenatedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoConcatenatedPath</code> method in a fluent style.
   */
  public static class CreateServiceTelcoConcatenatedPathQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoConcatenatedPathQueryParams sessionId(final String value) {
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
   * @return DeleteServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoConcatenatedPathResponse deleteServiceTelcoConcatenatedPath(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoConcatenatedPathRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoConcatenatedPath</code> but it also returns the http response headers .
   * Delete service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoConcatenatedPathResponse> deleteServiceTelcoConcatenatedPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoConcatenatedPathRequestData body);


  /**
   * Delete
   * Delete service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoConcatenatedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoConcatenatedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoConcatenatedPathResponse deleteServiceTelcoConcatenatedPath(@Param("elid") String elid, DeleteServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoConcatenatedPathQueryParams queryParams);

  /**
  * Delete
  * Delete service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoConcatenatedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoConcatenatedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoConcatenatedPathResponse> deleteServiceTelcoConcatenatedPathWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoConcatenatedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoConcatenatedPath</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoConcatenatedPathQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoConcatenatedPathQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPath100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPath100042ResponseData serviceTelcoConcatenatedPath100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPath100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoConcatenatedPath100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPath100042ResponseData> serviceTelcoConcatenatedPath100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPath100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPath100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPath100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPath100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPath100042ResponseData serviceTelcoConcatenatedPath100042(@Param("elid") String elid, ServiceTelcoConcatenatedPath100042RequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPath100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPath100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPath100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPath100042ResponseData> serviceTelcoConcatenatedPath100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPath100042RequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPath100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPath100042</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPath100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPath100042QueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathContractsResponseData serviceTelcoConcatenatedPathContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoConcatenatedPathContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathContractsResponseData> serviceTelcoConcatenatedPathContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathContractsResponseData serviceTelcoConcatenatedPathContracts(@Param("elid") String elid, ServiceTelcoConcatenatedPathContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathContractsResponseData> serviceTelcoConcatenatedPathContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomCablesResponseData serviceTelcoConcatenatedPathCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoConcatenatedPathCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathCustomCablesResponseData> serviceTelcoConcatenatedPathCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomCablesResponseData serviceTelcoConcatenatedPathCustomCables(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathCustomCablesResponseData> serviceTelcoConcatenatedPathCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomDataCablesResponseData serviceTelcoConcatenatedPathCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoConcatenatedPathCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathCustomDataCablesResponseData> serviceTelcoConcatenatedPathCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomDataCablesResponseData serviceTelcoConcatenatedPathCustomDataCables(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathCustomDataCablesResponseData> serviceTelcoConcatenatedPathCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathCustomDataCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData serviceTelcoConcatenatedPathCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoConcatenatedPathCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData> serviceTelcoConcatenatedPathCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData serviceTelcoConcatenatedPathCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathCustomIpaccessSvcResponseData> serviceTelcoConcatenatedPathCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomPowerCablesResponseData serviceTelcoConcatenatedPathCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoConcatenatedPathCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathCustomPowerCablesResponseData> serviceTelcoConcatenatedPathCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathCustomPowerCablesResponseData serviceTelcoConcatenatedPathCustomPowerCables(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathCustomPowerCablesResponseData> serviceTelcoConcatenatedPathCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathDevicesAllResponseData serviceTelcoConcatenatedPathDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoConcatenatedPathDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathDevicesAllResponseData> serviceTelcoConcatenatedPathDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathDevicesAllResponseData serviceTelcoConcatenatedPathDevicesAll(@Param("elid") String elid, ServiceTelcoConcatenatedPathDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathDevicesAllResponseData> serviceTelcoConcatenatedPathDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathEndZoneResponseData serviceTelcoConcatenatedPathEndZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathEndZoneRequestData body);

  /**
   * Get relations to End zone entities
   * Similar to <code>serviceTelcoConcatenatedPathEndZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathEndZoneResponseData> serviceTelcoConcatenatedPathEndZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathEndZoneRequestData body);


  /**
   * Get relations to End zone entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathEndZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathEndZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathEndZoneResponseData serviceTelcoConcatenatedPathEndZone(@Param("elid") String elid, ServiceTelcoConcatenatedPathEndZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathEndZoneQueryParams queryParams);

  /**
  * Get relations to End zone entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathEndZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathEndZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/EndZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathEndZoneResponseData> serviceTelcoConcatenatedPathEndZoneWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathEndZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathEndZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathEndZone</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathEndZoneQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathEndZoneQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathFrameContractsResponseData serviceTelcoConcatenatedPathFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoConcatenatedPathFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathFrameContractsResponseData> serviceTelcoConcatenatedPathFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathFrameContractsResponseData serviceTelcoConcatenatedPathFrameContracts(@Param("elid") String elid, ServiceTelcoConcatenatedPathFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathFrameContractsResponseData> serviceTelcoConcatenatedPathFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathHigherLevelServicesResponseData serviceTelcoConcatenatedPathHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoConcatenatedPathHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathHigherLevelServicesResponseData> serviceTelcoConcatenatedPathHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathHigherLevelServicesResponseData serviceTelcoConcatenatedPathHigherLevelServices(@Param("elid") String elid, ServiceTelcoConcatenatedPathHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathHigherLevelServicesResponseData> serviceTelcoConcatenatedPathHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathHigherLevelServicesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData serviceTelcoConcatenatedPathLogicalPortOutputEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputEndRequestData body);

  /**
   * Get relations to Output port end entities
   * Similar to <code>serviceTelcoConcatenatedPathLogicalPortOutputEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData> serviceTelcoConcatenatedPathLogicalPortOutputEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputEndRequestData body);


  /**
   * Get relations to Output port end entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathLogicalPortOutputEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathLogicalPortOutputEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData serviceTelcoConcatenatedPathLogicalPortOutputEnd(@Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathLogicalPortOutputEndQueryParams queryParams);

  /**
  * Get relations to Output port end entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathLogicalPortOutputEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathLogicalPortOutputEndResponseData> serviceTelcoConcatenatedPathLogicalPortOutputEndWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputEndRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathLogicalPortOutputEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathLogicalPortOutputEnd</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathLogicalPortOutputEndQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathLogicalPortOutputEndQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData serviceTelcoConcatenatedPathLogicalPortOutputStart(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputStartRequestData body);

  /**
   * Get relations to Output port start entities
   * Similar to <code>serviceTelcoConcatenatedPathLogicalPortOutputStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData> serviceTelcoConcatenatedPathLogicalPortOutputStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputStartRequestData body);


  /**
   * Get relations to Output port start entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathLogicalPortOutputStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathLogicalPortOutputStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData serviceTelcoConcatenatedPathLogicalPortOutputStart(@Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathLogicalPortOutputStartQueryParams queryParams);

  /**
  * Get relations to Output port start entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathLogicalPortOutputStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/LogicalPortOutputStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathLogicalPortOutputStartResponseData> serviceTelcoConcatenatedPathLogicalPortOutputStartWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathLogicalPortOutputStartRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathLogicalPortOutputStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathLogicalPortOutputStart</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathLogicalPortOutputStartQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathLogicalPortOutputStartQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathMaintenanceContractsResponseData serviceTelcoConcatenatedPathMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoConcatenatedPathMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathMaintenanceContractsResponseData> serviceTelcoConcatenatedPathMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathMaintenanceContractsResponseData serviceTelcoConcatenatedPathMaintenanceContracts(@Param("elid") String elid, ServiceTelcoConcatenatedPathMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathMaintenanceContractsResponseData> serviceTelcoConcatenatedPathMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathOrganizationsResponseData serviceTelcoConcatenatedPathOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoConcatenatedPathOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathOrganizationsResponseData> serviceTelcoConcatenatedPathOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathOrganizationsResponseData serviceTelcoConcatenatedPathOrganizations(@Param("elid") String elid, ServiceTelcoConcatenatedPathOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathOrganizationsResponseData> serviceTelcoConcatenatedPathOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathPersonGroupsResponseData serviceTelcoConcatenatedPathPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoConcatenatedPathPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathPersonGroupsResponseData> serviceTelcoConcatenatedPathPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathPersonGroupsResponseData serviceTelcoConcatenatedPathPersonGroups(@Param("elid") String elid, ServiceTelcoConcatenatedPathPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathPersonGroupsResponseData> serviceTelcoConcatenatedPathPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathPersonsResponseData serviceTelcoConcatenatedPathPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoConcatenatedPathPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathPersonsResponseData> serviceTelcoConcatenatedPathPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathPersonsResponseData serviceTelcoConcatenatedPathPersons(@Param("elid") String elid, ServiceTelcoConcatenatedPathPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathPersonsResponseData> serviceTelcoConcatenatedPathPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathPersonsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathPredecessorResponseData serviceTelcoConcatenatedPathPredecessor(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathPredecessorRequestData body);

  /**
   * Get relations to Predecessor entities
   * Similar to <code>serviceTelcoConcatenatedPathPredecessor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathPredecessorResponseData> serviceTelcoConcatenatedPathPredecessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathPredecessorRequestData body);


  /**
   * Get relations to Predecessor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathPredecessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathPredecessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathPredecessorResponseData serviceTelcoConcatenatedPathPredecessor(@Param("elid") String elid, ServiceTelcoConcatenatedPathPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathPredecessorQueryParams queryParams);

  /**
  * Get relations to Predecessor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathPredecessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathPredecessorResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Predecessor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathPredecessorResponseData> serviceTelcoConcatenatedPathPredecessorWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathPredecessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathPredecessor</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathPredecessorQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathPredecessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoConcatenatedPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathQueryResponse serviceTelcoConcatenatedPathQuery(@Param("sessionId") String sessionId, ServiceTelcoConcatenatedPathQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoConcatenatedPathQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathQueryResponse> serviceTelcoConcatenatedPathQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoConcatenatedPathQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathQueryResponse serviceTelcoConcatenatedPathQuery(ServiceTelcoConcatenatedPathQueryRequest body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathQueryResponse> serviceTelcoConcatenatedPathQueryWithHttpInfo(ServiceTelcoConcatenatedPathQueryRequest body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Path (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoConcatenatedPathRoutesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/RoutesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathRoutesTelcoResponseData serviceTelcoConcatenatedPathRoutesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathRoutesTelcoRequestData body);

  /**
   * Get relations to Path (Telco) entities
   * Similar to <code>serviceTelcoConcatenatedPathRoutesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/RoutesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathRoutesTelcoResponseData> serviceTelcoConcatenatedPathRoutesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathRoutesTelcoRequestData body);


  /**
   * Get relations to Path (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathRoutesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathRoutesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathRoutesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/RoutesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathRoutesTelcoResponseData serviceTelcoConcatenatedPathRoutesTelco(@Param("elid") String elid, ServiceTelcoConcatenatedPathRoutesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathRoutesTelcoQueryParams queryParams);

  /**
  * Get relations to Path (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathRoutesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathRoutesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/RoutesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathRoutesTelcoResponseData> serviceTelcoConcatenatedPathRoutesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathRoutesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathRoutesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathRoutesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathRoutesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathRoutesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathServiceAccessPointsResponseData serviceTelcoConcatenatedPathServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoConcatenatedPathServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathServiceAccessPointsResponseData> serviceTelcoConcatenatedPathServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathServiceAccessPointsResponseData serviceTelcoConcatenatedPathServiceAccessPoints(@Param("elid") String elid, ServiceTelcoConcatenatedPathServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathServiceAccessPointsResponseData> serviceTelcoConcatenatedPathServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData serviceTelcoConcatenatedPathServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoConcatenatedPathServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData> serviceTelcoConcatenatedPathServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData serviceTelcoConcatenatedPathServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoConcatenatedPathServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathServiceTypeDefinitionResponseData> serviceTelcoConcatenatedPathServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathServicesTelcoResponseData serviceTelcoConcatenatedPathServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoConcatenatedPathServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathServicesTelcoResponseData> serviceTelcoConcatenatedPathServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathServicesTelcoResponseData serviceTelcoConcatenatedPathServicesTelco(@Param("elid") String elid, ServiceTelcoConcatenatedPathServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathServicesTelcoResponseData> serviceTelcoConcatenatedPathServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathStartZoneResponseData serviceTelcoConcatenatedPathStartZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathStartZoneRequestData body);

  /**
   * Get relations to Start zone entities
   * Similar to <code>serviceTelcoConcatenatedPathStartZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathStartZoneResponseData> serviceTelcoConcatenatedPathStartZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathStartZoneRequestData body);


  /**
   * Get relations to Start zone entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathStartZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathStartZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathStartZoneResponseData serviceTelcoConcatenatedPathStartZone(@Param("elid") String elid, ServiceTelcoConcatenatedPathStartZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathStartZoneQueryParams queryParams);

  /**
  * Get relations to Start zone entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathStartZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathStartZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/StartZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathStartZoneResponseData> serviceTelcoConcatenatedPathStartZoneWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathStartZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathStartZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathStartZone</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathStartZoneQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathStartZoneQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathStructuresResponse serviceTelcoConcatenatedPathStructures(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathStructuresRequest body);

  /**
   * Query structures
   * Similar to <code>serviceTelcoConcatenatedPathStructures</code> but it also returns the http response headers .
   * Queries the structures from one object
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathStructuresResponse> serviceTelcoConcatenatedPathStructuresWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathStructuresRequest body);


  /**
   * Query structures
   * Queries the structures from one object
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathStructures</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathStructuresQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Structures?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathStructuresResponse serviceTelcoConcatenatedPathStructures(@Param("elid") String elid, ServiceTelcoConcatenatedPathStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathStructuresQueryParams queryParams);

  /**
  * Query structures
  * Queries the structures from one object
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathStructures</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathStructuresResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Structures?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathStructuresResponse> serviceTelcoConcatenatedPathStructuresWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathStructuresQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathStructures</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathStructuresQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathStructuresQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathSuccessorsResponseData serviceTelcoConcatenatedPathSuccessors(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathSuccessorsRequestData body);

  /**
   * Get relations to Successor entities
   * Similar to <code>serviceTelcoConcatenatedPathSuccessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathSuccessorsResponseData> serviceTelcoConcatenatedPathSuccessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathSuccessorsRequestData body);


  /**
   * Get relations to Successor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathSuccessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathSuccessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Successors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathSuccessorsResponseData serviceTelcoConcatenatedPathSuccessors(@Param("elid") String elid, ServiceTelcoConcatenatedPathSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathSuccessorsQueryParams queryParams);

  /**
  * Get relations to Successor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathSuccessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathSuccessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Successors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathSuccessorsResponseData> serviceTelcoConcatenatedPathSuccessorsWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathSuccessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathSuccessors</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathSuccessorsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathSuccessorsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathSystemAttributesResponse serviceTelcoConcatenatedPathSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoConcatenatedPathSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathSystemAttributesResponse> serviceTelcoConcatenatedPathSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathSystemAttributesResponse serviceTelcoConcatenatedPathSystemAttributes(@Param("elid") String elid, ServiceTelcoConcatenatedPathSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathSystemAttributesResponse> serviceTelcoConcatenatedPathSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoConcatenatedPathVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathVlansResponseData serviceTelcoConcatenatedPathVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoConcatenatedPathVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoConcatenatedPathVlansResponseData> serviceTelcoConcatenatedPathVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoConcatenatedPathVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoConcatenatedPathVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoConcatenatedPathVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoConcatenatedPathVlansResponseData serviceTelcoConcatenatedPathVlans(@Param("elid") String elid, ServiceTelcoConcatenatedPathVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoConcatenatedPathVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoConcatenatedPathVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoConcatenatedPathVlansResponseData> serviceTelcoConcatenatedPathVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoConcatenatedPathVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoConcatenatedPathVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoConcatenatedPathVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoConcatenatedPathVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoConcatenatedPathVlansQueryParams sessionId(final String value) {
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
   * @return UpdateServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoConcatenatedPathResponse updateServiceTelcoConcatenatedPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoConcatenatedPathRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoConcatenatedPath</code> but it also returns the http response headers .
   * Modify service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoConcatenatedPathResponse> updateServiceTelcoConcatenatedPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoConcatenatedPathRequestData body);


  /**
   * Modify
   * Modify service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoConcatenatedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoConcatenatedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoConcatenatedPathResponse updateServiceTelcoConcatenatedPath(@Param("elid") String elid, UpdateServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoConcatenatedPathQueryParams queryParams);

  /**
  * Modify
  * Modify service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoConcatenatedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoConcatenatedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoConcatenatedPathResponse> updateServiceTelcoConcatenatedPathWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoConcatenatedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoConcatenatedPath</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoConcatenatedPathQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoConcatenatedPathQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoConcatenatedPathResponse updateSystemAttributesServiceTelcoConcatenatedPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoConcatenatedPathRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoConcatenatedPath</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoConcatenatedPathResponse> updateSystemAttributesServiceTelcoConcatenatedPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoConcatenatedPathRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoConcatenatedPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoConcatenatedPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoConcatenatedPathResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoConcatenatedPathResponse updateSystemAttributesServiceTelcoConcatenatedPath(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoConcatenatedPathQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoConcatenatedPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoConcatenatedPathResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoConcatenatedPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoConcatenatedPathResponse> updateSystemAttributesServiceTelcoConcatenatedPathWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoConcatenatedPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoConcatenatedPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoConcatenatedPath</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoConcatenatedPathQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoConcatenatedPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
