package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddRoutePacketDataServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.AddRoutePacketDataServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.AddRouteServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.AddRouteServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.CreatePacketDataServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.CreatePacketDataServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.RemoveRouteServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.RemoveRouteServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrail100042RequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrail100042ResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailBandwidthBookingForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailBandwidthForPacketDataServiceRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailBandwidthForPacketDataServiceResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomPowerCablesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailCustomPowerCablesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailEndZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailEndZoneResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailHigherLevelServicesRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailHigherLevelServicesResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailLogicalPortEndRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailLogicalPortEndResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailLogicalPortStartRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailLogicalPortStartResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailPredecessorRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailPredecessorResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailRoutingCircuitSwitchedRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailRoutingCircuitSwitchedResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailRoutingPacketDataRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailRoutingPacketDataResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailServiceAccessPointsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailServiceAccessPointsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailServiceTypeDefinitionResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailStartZoneRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailStartZoneResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailStructuresRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailStructuresResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailSuccessorsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailSuccessorsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTelcoTrailVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePacketDataServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTelcoTrailResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoTrailRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoTrailResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServiceTelcoTrailApi extends ApiClient.Api {


  /**
   * Add route
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddRoutePacketDataServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoutePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddRoutePacketDataServiceTelcoTrailResponse addRoutePacketDataServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, AddRoutePacketDataServiceTelcoTrailRequestData body);

  /**
   * Add route
   * Similar to <code>addRoutePacketDataServiceTelcoTrail</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoutePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddRoutePacketDataServiceTelcoTrailResponse> addRoutePacketDataServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddRoutePacketDataServiceTelcoTrailRequestData body);


  /**
   * Add route
   * 
   * Note, this is equivalent to the other <code>addRoutePacketDataServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddRoutePacketDataServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddRoutePacketDataServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoutePacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddRoutePacketDataServiceTelcoTrailResponse addRoutePacketDataServiceTelcoTrail(@Param("elid") String elid, AddRoutePacketDataServiceTelcoTrailRequestData body, @QueryMap(encoded=true) AddRoutePacketDataServiceTelcoTrailQueryParams queryParams);

  /**
  * Add route
  * 
  * Note, this is equivalent to the other <code>addRoutePacketDataServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddRoutePacketDataServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoutePacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddRoutePacketDataServiceTelcoTrailResponse> addRoutePacketDataServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, AddRoutePacketDataServiceTelcoTrailRequestData body, @QueryMap(encoded=true) AddRoutePacketDataServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addRoutePacketDataServiceTelcoTrail</code> method in a fluent style.
   */
  public static class AddRoutePacketDataServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public AddRoutePacketDataServiceTelcoTrailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Add route
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddRouteServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddRouteServiceTelcoTrailResponse addRouteServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, AddRouteServiceTelcoTrailRequestData body);

  /**
   * Add route
   * Similar to <code>addRouteServiceTelcoTrail</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddRouteServiceTelcoTrailResponse> addRouteServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddRouteServiceTelcoTrailRequestData body);


  /**
   * Add route
   * 
   * Note, this is equivalent to the other <code>addRouteServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddRouteServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddRouteServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddRouteServiceTelcoTrailResponse addRouteServiceTelcoTrail(@Param("elid") String elid, AddRouteServiceTelcoTrailRequestData body, @QueryMap(encoded=true) AddRouteServiceTelcoTrailQueryParams queryParams);

  /**
  * Add route
  * 
  * Note, this is equivalent to the other <code>addRouteServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddRouteServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/addRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddRouteServiceTelcoTrailResponse> addRouteServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, AddRouteServiceTelcoTrailRequestData body, @QueryMap(encoded=true) AddRouteServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addRouteServiceTelcoTrail</code> method in a fluent style.
   */
  public static class AddRouteServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public AddRouteServiceTelcoTrailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create packet data
   * Create packet data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePacketDataServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/createPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePacketDataServiceTelcoTrailResponse createPacketDataServiceTelcoTrail(@Param("sessionId") String sessionId, CreatePacketDataServiceTelcoTrailRequestData body);

  /**
   * Create packet data
   * Similar to <code>createPacketDataServiceTelcoTrail</code> but it also returns the http response headers .
   * Create packet data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/createPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePacketDataServiceTelcoTrailResponse> createPacketDataServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, CreatePacketDataServiceTelcoTrailRequestData body);


  /**
   * Create packet data
   * Create packet data
   * Note, this is equivalent to the other <code>createPacketDataServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePacketDataServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePacketDataServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/createPacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePacketDataServiceTelcoTrailResponse createPacketDataServiceTelcoTrail(CreatePacketDataServiceTelcoTrailRequestData body, @QueryMap(encoded=true) CreatePacketDataServiceTelcoTrailQueryParams queryParams);

  /**
  * Create packet data
  * Create packet data
  * Note, this is equivalent to the other <code>createPacketDataServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePacketDataServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/createPacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePacketDataServiceTelcoTrailResponse> createPacketDataServiceTelcoTrailWithHttpInfo(CreatePacketDataServiceTelcoTrailRequestData body, @QueryMap(encoded=true) CreatePacketDataServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPacketDataServiceTelcoTrail</code> method in a fluent style.
   */
  public static class CreatePacketDataServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public CreatePacketDataServiceTelcoTrailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTelcoTrailResponse createServiceTelcoTrail(@Param("sessionId") String sessionId, CreateServiceTelcoTrailRequestData body);

  /**
   * Create
   * Similar to <code>createServiceTelcoTrail</code> but it also returns the http response headers .
   * Create Service (Telco)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTelcoTrailResponse> createServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTelcoTrailRequestData body);


  /**
   * Create
   * Create Service (Telco)
   * Note, this is equivalent to the other <code>createServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTelcoTrailResponse createServiceTelcoTrail(CreateServiceTelcoTrailRequestData body, @QueryMap(encoded=true) CreateServiceTelcoTrailQueryParams queryParams);

  /**
  * Create
  * Create Service (Telco)
  * Note, this is equivalent to the other <code>createServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTelcoTrailResponse> createServiceTelcoTrailWithHttpInfo(CreateServiceTelcoTrailRequestData body, @QueryMap(encoded=true) CreateServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTelcoTrail</code> method in a fluent style.
   */
  public static class CreateServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public CreateServiceTelcoTrailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTelcoTrailResponse deleteServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoTrailRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTelcoTrail</code> but it also returns the http response headers .
   * Delete Service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTelcoTrailResponse> deleteServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTelcoTrailRequestData body);


  /**
   * Delete
   * Delete Service (Telco)
   * Note, this is equivalent to the other <code>deleteServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTelcoTrailResponse deleteServiceTelcoTrail(@Param("elid") String elid, DeleteServiceTelcoTrailRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoTrailQueryParams queryParams);

  /**
  * Delete
  * Delete Service (Telco)
  * Note, this is equivalent to the other <code>deleteServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTelcoTrailResponse> deleteServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, DeleteServiceTelcoTrailRequestData body, @QueryMap(encoded=true) DeleteServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTelcoTrail</code> method in a fluent style.
   */
  public static class DeleteServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public DeleteServiceTelcoTrailQueryParams sessionId(final String value) {
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
   * @return RemoveRouteServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/removeRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RemoveRouteServiceTelcoTrailResponse removeRouteServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveRouteServiceTelcoTrailRequestData body);

  /**
   * Remove route
   * Similar to <code>removeRouteServiceTelcoTrail</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/removeRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RemoveRouteServiceTelcoTrailResponse> removeRouteServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RemoveRouteServiceTelcoTrailRequestData body);


  /**
   * Remove route
   * 
   * Note, this is equivalent to the other <code>removeRouteServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveRouteServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RemoveRouteServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/removeRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RemoveRouteServiceTelcoTrailResponse removeRouteServiceTelcoTrail(@Param("elid") String elid, RemoveRouteServiceTelcoTrailRequestData body, @QueryMap(encoded=true) RemoveRouteServiceTelcoTrailQueryParams queryParams);

  /**
  * Remove route
  * 
  * Note, this is equivalent to the other <code>removeRouteServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RemoveRouteServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/removeRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RemoveRouteServiceTelcoTrailResponse> removeRouteServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, RemoveRouteServiceTelcoTrailRequestData body, @QueryMap(encoded=true) RemoveRouteServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>removeRouteServiceTelcoTrail</code> method in a fluent style.
   */
  public static class RemoveRouteServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public RemoveRouteServiceTelcoTrailQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrail100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrail100042ResponseData serviceTelcoTrail100042(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrail100042RequestData body);

  /**
   * Get relations to OSPF-Area entities
   * Similar to <code>serviceTelcoTrail100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrail100042ResponseData> serviceTelcoTrail100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrail100042RequestData body);


  /**
   * Get relations to OSPF-Area entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrail100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrail100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrail100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrail100042ResponseData serviceTelcoTrail100042(@Param("elid") String elid, ServiceTelcoTrail100042RequestData body, @QueryMap(encoded=true) ServiceTelcoTrail100042QueryParams queryParams);

  /**
  * Get relations to OSPF-Area entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrail100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrail100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrail100042ResponseData> serviceTelcoTrail100042WithHttpInfo(@Param("elid") String elid, ServiceTelcoTrail100042RequestData body, @QueryMap(encoded=true) ServiceTelcoTrail100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrail100042</code> method in a fluent style.
   */
  public static class ServiceTelcoTrail100042QueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrail100042QueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse serviceTelcoTrailBandwidthBookingForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailBandwidthBookingForPacketDataServiceRequest body);

  /**
   * Bandwidth consumption
   * Similar to <code>serviceTelcoTrailBandwidthBookingForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse> serviceTelcoTrailBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailBandwidthBookingForPacketDataServiceRequest body);


  /**
   * Bandwidth consumption
   * Queries the bandwidth consumption (list of services) for a packet data service.
   * Note, this is equivalent to the other <code>serviceTelcoTrailBandwidthBookingForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailBandwidthBookingForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse serviceTelcoTrailBandwidthBookingForPacketDataService(@Param("elid") String elid, ServiceTelcoTrailBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoTrailBandwidthBookingForPacketDataServiceQueryParams queryParams);

  /**
  * Bandwidth consumption
  * Queries the bandwidth consumption (list of services) for a packet data service.
  * Note, this is equivalent to the other <code>serviceTelcoTrailBandwidthBookingForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthBookingForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailBandwidthBookingForPacketDataServiceResponse> serviceTelcoTrailBandwidthBookingForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailBandwidthBookingForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoTrailBandwidthBookingForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailBandwidthBookingForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailBandwidthBookingForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailBandwidthBookingForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailBandwidthForPacketDataServiceResponse serviceTelcoTrailBandwidthForPacketDataService(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailBandwidthForPacketDataServiceRequest body);

  /**
   * Query bandwidth
   * Similar to <code>serviceTelcoTrailBandwidthForPacketDataService</code> but it also returns the http response headers .
   * Queries the bandwidth values for a packet data service.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailBandwidthForPacketDataServiceResponse> serviceTelcoTrailBandwidthForPacketDataServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailBandwidthForPacketDataServiceRequest body);


  /**
   * Query bandwidth
   * Queries the bandwidth values for a packet data service.
   * Note, this is equivalent to the other <code>serviceTelcoTrailBandwidthForPacketDataService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailBandwidthForPacketDataServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailBandwidthForPacketDataServiceResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailBandwidthForPacketDataServiceResponse serviceTelcoTrailBandwidthForPacketDataService(@Param("elid") String elid, ServiceTelcoTrailBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoTrailBandwidthForPacketDataServiceQueryParams queryParams);

  /**
  * Query bandwidth
  * Queries the bandwidth values for a packet data service.
  * Note, this is equivalent to the other <code>serviceTelcoTrailBandwidthForPacketDataService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailBandwidthForPacketDataServiceResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/BandwidthForPacketDataService?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailBandwidthForPacketDataServiceResponse> serviceTelcoTrailBandwidthForPacketDataServiceWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailBandwidthForPacketDataServiceRequest body, @QueryMap(encoded=true) ServiceTelcoTrailBandwidthForPacketDataServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailBandwidthForPacketDataService</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailBandwidthForPacketDataServiceQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailBandwidthForPacketDataServiceQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailContractsResponseData serviceTelcoTrailContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTelcoTrailContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailContractsResponseData> serviceTelcoTrailContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailContractsResponseData serviceTelcoTrailContracts(@Param("elid") String elid, ServiceTelcoTrailContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailContractsResponseData> serviceTelcoTrailContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailCustomCablesResponseData serviceTelcoTrailCustomCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomCablesRequestData body);

  /**
   * Get relations to Leased line entities
   * Similar to <code>serviceTelcoTrailCustomCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailCustomCablesResponseData> serviceTelcoTrailCustomCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomCablesRequestData body);


  /**
   * Get relations to Leased line entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailCustomCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailCustomCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailCustomCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailCustomCablesResponseData serviceTelcoTrailCustomCables(@Param("elid") String elid, ServiceTelcoTrailCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomCablesQueryParams queryParams);

  /**
  * Get relations to Leased line entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailCustomCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailCustomCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailCustomCablesResponseData> serviceTelcoTrailCustomCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailCustomCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailCustomCables</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailCustomCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailCustomCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailCustomDataCablesResponseData serviceTelcoTrailCustomDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>serviceTelcoTrailCustomDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailCustomDataCablesResponseData> serviceTelcoTrailCustomDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailCustomDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailCustomDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailCustomDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomDataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailCustomDataCablesResponseData serviceTelcoTrailCustomDataCables(@Param("elid") String elid, ServiceTelcoTrailCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailCustomDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailCustomDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomDataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailCustomDataCablesResponseData> serviceTelcoTrailCustomDataCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailCustomDataCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailCustomDataCables</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailCustomDataCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailCustomDataCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailCustomIpaccessSvcResponseData serviceTelcoTrailCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>serviceTelcoTrailCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailCustomIpaccessSvcResponseData> serviceTelcoTrailCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailCustomIpaccessSvcResponseData serviceTelcoTrailCustomIpaccessSvc(@Param("elid") String elid, ServiceTelcoTrailCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailCustomIpaccessSvcResponseData> serviceTelcoTrailCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailCustomPowerCablesResponseData serviceTelcoTrailCustomPowerCables(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomPowerCablesRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>serviceTelcoTrailCustomPowerCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailCustomPowerCablesResponseData> serviceTelcoTrailCustomPowerCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailCustomPowerCablesRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailCustomPowerCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailCustomPowerCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailCustomPowerCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomPowerCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailCustomPowerCablesResponseData serviceTelcoTrailCustomPowerCables(@Param("elid") String elid, ServiceTelcoTrailCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomPowerCablesQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailCustomPowerCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailCustomPowerCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/CustomPowerCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailCustomPowerCablesResponseData> serviceTelcoTrailCustomPowerCablesWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailCustomPowerCablesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailCustomPowerCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailCustomPowerCables</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailCustomPowerCablesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailCustomPowerCablesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailDevicesAllResponseData serviceTelcoTrailDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceTelcoTrailDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailDevicesAllResponseData> serviceTelcoTrailDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailDevicesAllResponseData serviceTelcoTrailDevicesAll(@Param("elid") String elid, ServiceTelcoTrailDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailDevicesAllResponseData> serviceTelcoTrailDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailDevicesAllRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailDevicesAll</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailEndZoneResponseData serviceTelcoTrailEndZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailEndZoneRequestData body);

  /**
   * Get relations to End zone entities
   * Similar to <code>serviceTelcoTrailEndZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailEndZoneResponseData> serviceTelcoTrailEndZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailEndZoneRequestData body);


  /**
   * Get relations to End zone entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailEndZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailEndZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailEndZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/EndZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailEndZoneResponseData serviceTelcoTrailEndZone(@Param("elid") String elid, ServiceTelcoTrailEndZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailEndZoneQueryParams queryParams);

  /**
  * Get relations to End zone entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailEndZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailEndZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/EndZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailEndZoneResponseData> serviceTelcoTrailEndZoneWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailEndZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailEndZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailEndZone</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailEndZoneQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailEndZoneQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailFrameContractsResponseData serviceTelcoTrailFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTelcoTrailFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailFrameContractsResponseData> serviceTelcoTrailFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailFrameContractsResponseData serviceTelcoTrailFrameContracts(@Param("elid") String elid, ServiceTelcoTrailFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailFrameContractsResponseData> serviceTelcoTrailFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailHigherLevelServicesResponseData serviceTelcoTrailHigherLevelServices(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailHigherLevelServicesRequestData body);

  /**
   * Get relations to Higher level services entities
   * Similar to <code>serviceTelcoTrailHigherLevelServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailHigherLevelServicesResponseData> serviceTelcoTrailHigherLevelServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailHigherLevelServicesRequestData body);


  /**
   * Get relations to Higher level services entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailHigherLevelServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailHigherLevelServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailHigherLevelServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/HigherLevelServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailHigherLevelServicesResponseData serviceTelcoTrailHigherLevelServices(@Param("elid") String elid, ServiceTelcoTrailHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailHigherLevelServicesQueryParams queryParams);

  /**
  * Get relations to Higher level services entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailHigherLevelServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailHigherLevelServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/HigherLevelServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailHigherLevelServicesResponseData> serviceTelcoTrailHigherLevelServicesWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailHigherLevelServicesRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailHigherLevelServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailHigherLevelServices</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailHigherLevelServicesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailHigherLevelServicesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailLogicalPortEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailLogicalPortEndResponseData serviceTelcoTrailLogicalPortEnd(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailLogicalPortEndRequestData body);

  /**
   * Get relations to Logical port End point entities
   * Similar to <code>serviceTelcoTrailLogicalPortEnd</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortEnd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailLogicalPortEndResponseData> serviceTelcoTrailLogicalPortEndWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailLogicalPortEndRequestData body);


  /**
   * Get relations to Logical port End point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailLogicalPortEnd</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailLogicalPortEndQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailLogicalPortEndResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortEnd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailLogicalPortEndResponseData serviceTelcoTrailLogicalPortEnd(@Param("elid") String elid, ServiceTelcoTrailLogicalPortEndRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailLogicalPortEndQueryParams queryParams);

  /**
  * Get relations to Logical port End point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailLogicalPortEnd</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailLogicalPortEndResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortEnd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailLogicalPortEndResponseData> serviceTelcoTrailLogicalPortEndWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailLogicalPortEndRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailLogicalPortEndQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailLogicalPortEnd</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailLogicalPortEndQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailLogicalPortEndQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailLogicalPortStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailLogicalPortStartResponseData serviceTelcoTrailLogicalPortStart(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailLogicalPortStartRequestData body);

  /**
   * Get relations to Logical port Starting point entities
   * Similar to <code>serviceTelcoTrailLogicalPortStart</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortStart?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailLogicalPortStartResponseData> serviceTelcoTrailLogicalPortStartWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailLogicalPortStartRequestData body);


  /**
   * Get relations to Logical port Starting point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailLogicalPortStart</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailLogicalPortStartQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailLogicalPortStartResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortStart?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailLogicalPortStartResponseData serviceTelcoTrailLogicalPortStart(@Param("elid") String elid, ServiceTelcoTrailLogicalPortStartRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailLogicalPortStartQueryParams queryParams);

  /**
  * Get relations to Logical port Starting point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailLogicalPortStart</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailLogicalPortStartResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/LogicalPortStart?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailLogicalPortStartResponseData> serviceTelcoTrailLogicalPortStartWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailLogicalPortStartRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailLogicalPortStartQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailLogicalPortStart</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailLogicalPortStartQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailLogicalPortStartQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailMaintenanceContractsResponseData serviceTelcoTrailMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTelcoTrailMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailMaintenanceContractsResponseData> serviceTelcoTrailMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailMaintenanceContractsResponseData serviceTelcoTrailMaintenanceContracts(@Param("elid") String elid, ServiceTelcoTrailMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailMaintenanceContractsResponseData> serviceTelcoTrailMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailOrganizationsResponseData serviceTelcoTrailOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTelcoTrailOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailOrganizationsResponseData> serviceTelcoTrailOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailOrganizationsResponseData serviceTelcoTrailOrganizations(@Param("elid") String elid, ServiceTelcoTrailOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailOrganizationsResponseData> serviceTelcoTrailOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailOrganizations</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailPersonGroupsResponseData serviceTelcoTrailPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTelcoTrailPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailPersonGroupsResponseData> serviceTelcoTrailPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailPersonGroupsResponseData serviceTelcoTrailPersonGroups(@Param("elid") String elid, ServiceTelcoTrailPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailPersonGroupsResponseData> serviceTelcoTrailPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailPersonsResponseData serviceTelcoTrailPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTelcoTrailPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailPersonsResponseData> serviceTelcoTrailPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailPersonsResponseData serviceTelcoTrailPersons(@Param("elid") String elid, ServiceTelcoTrailPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailPersonsResponseData> serviceTelcoTrailPersonsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailPersonsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailPersons</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailPersonsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailPredecessorResponseData serviceTelcoTrailPredecessor(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailPredecessorRequestData body);

  /**
   * Get relations to Predecessor entities
   * Similar to <code>serviceTelcoTrailPredecessor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailPredecessorResponseData> serviceTelcoTrailPredecessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailPredecessorRequestData body);


  /**
   * Get relations to Predecessor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailPredecessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailPredecessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailPredecessorResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Predecessor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailPredecessorResponseData serviceTelcoTrailPredecessor(@Param("elid") String elid, ServiceTelcoTrailPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailPredecessorQueryParams queryParams);

  /**
  * Get relations to Predecessor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailPredecessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailPredecessorResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Predecessor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailPredecessorResponseData> serviceTelcoTrailPredecessorWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailPredecessorRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailPredecessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailPredecessor</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailPredecessorQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailPredecessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTelcoTrailQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailQueryResponse serviceTelcoTrailQuery(@Param("sessionId") String sessionId, ServiceTelcoTrailQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTelcoTrailQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailQueryResponse> serviceTelcoTrailQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTelcoTrailQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serviceTelcoTrailQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailQueryResponse serviceTelcoTrailQuery(ServiceTelcoTrailQueryRequest body, @QueryMap(encoded=true) ServiceTelcoTrailQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serviceTelcoTrailQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailQueryResponse> serviceTelcoTrailQueryWithHttpInfo(ServiceTelcoTrailQueryRequest body, @QueryMap(encoded=true) ServiceTelcoTrailQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailQuery</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailQueryQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailQueryQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailRoutingCircuitSwitchedResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailRoutingCircuitSwitchedResponseData serviceTelcoTrailRoutingCircuitSwitched(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailRoutingCircuitSwitchedRequestData body);

  /**
   * Get relations to Routing Circuit switched entities
   * Similar to <code>serviceTelcoTrailRoutingCircuitSwitched</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailRoutingCircuitSwitchedResponseData> serviceTelcoTrailRoutingCircuitSwitchedWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailRoutingCircuitSwitchedRequestData body);


  /**
   * Get relations to Routing Circuit switched entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailRoutingCircuitSwitched</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailRoutingCircuitSwitchedQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailRoutingCircuitSwitchedResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailRoutingCircuitSwitchedResponseData serviceTelcoTrailRoutingCircuitSwitched(@Param("elid") String elid, ServiceTelcoTrailRoutingCircuitSwitchedRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailRoutingCircuitSwitchedQueryParams queryParams);

  /**
  * Get relations to Routing Circuit switched entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailRoutingCircuitSwitched</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailRoutingCircuitSwitchedResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingCircuitSwitched?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailRoutingCircuitSwitchedResponseData> serviceTelcoTrailRoutingCircuitSwitchedWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailRoutingCircuitSwitchedRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailRoutingCircuitSwitchedQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailRoutingCircuitSwitched</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailRoutingCircuitSwitchedQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailRoutingCircuitSwitchedQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailRoutingPacketDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailRoutingPacketDataResponseData serviceTelcoTrailRoutingPacketData(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailRoutingPacketDataRequestData body);

  /**
   * Get relations to Routing Packet data entities
   * Similar to <code>serviceTelcoTrailRoutingPacketData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingPacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailRoutingPacketDataResponseData> serviceTelcoTrailRoutingPacketDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailRoutingPacketDataRequestData body);


  /**
   * Get relations to Routing Packet data entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailRoutingPacketData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailRoutingPacketDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailRoutingPacketDataResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingPacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailRoutingPacketDataResponseData serviceTelcoTrailRoutingPacketData(@Param("elid") String elid, ServiceTelcoTrailRoutingPacketDataRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailRoutingPacketDataQueryParams queryParams);

  /**
  * Get relations to Routing Packet data entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailRoutingPacketData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailRoutingPacketDataResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/RoutingPacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailRoutingPacketDataResponseData> serviceTelcoTrailRoutingPacketDataWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailRoutingPacketDataRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailRoutingPacketDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailRoutingPacketData</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailRoutingPacketDataQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailRoutingPacketDataQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailServiceAccessPointsResponseData serviceTelcoTrailServiceAccessPoints(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailServiceAccessPointsRequestData body);

  /**
   * Get relations to Service Access Point entities
   * Similar to <code>serviceTelcoTrailServiceAccessPoints</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailServiceAccessPointsResponseData> serviceTelcoTrailServiceAccessPointsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailServiceAccessPointsRequestData body);


  /**
   * Get relations to Service Access Point entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailServiceAccessPoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailServiceAccessPointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailServiceAccessPointsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceAccessPoints?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailServiceAccessPointsResponseData serviceTelcoTrailServiceAccessPoints(@Param("elid") String elid, ServiceTelcoTrailServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailServiceAccessPointsQueryParams queryParams);

  /**
  * Get relations to Service Access Point entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailServiceAccessPoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailServiceAccessPointsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceAccessPoints?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailServiceAccessPointsResponseData> serviceTelcoTrailServiceAccessPointsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailServiceAccessPointsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailServiceAccessPointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailServiceAccessPoints</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailServiceAccessPointsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailServiceAccessPointsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailServiceTypeDefinitionResponseData serviceTelcoTrailServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailServiceTypeDefinitionRequestData body);

  /**
   * Get relations to Service type definition entities
   * Similar to <code>serviceTelcoTrailServiceTypeDefinition</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailServiceTypeDefinitionResponseData> serviceTelcoTrailServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailServiceTypeDefinitionRequestData body);


  /**
   * Get relations to Service type definition entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailServiceTypeDefinitionResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailServiceTypeDefinitionResponseData serviceTelcoTrailServiceTypeDefinition(@Param("elid") String elid, ServiceTelcoTrailServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailServiceTypeDefinitionQueryParams queryParams);

  /**
  * Get relations to Service type definition entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailServiceTypeDefinitionResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServiceTypeDefinition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailServiceTypeDefinitionResponseData> serviceTelcoTrailServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailServiceTypeDefinition</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailServiceTypeDefinitionQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailServicesTelcoResponseData serviceTelcoTrailServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTelcoTrailServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailServicesTelcoResponseData> serviceTelcoTrailServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailServicesTelcoResponseData serviceTelcoTrailServicesTelco(@Param("elid") String elid, ServiceTelcoTrailServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailServicesTelcoResponseData> serviceTelcoTrailServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailStartZoneResponseData serviceTelcoTrailStartZone(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailStartZoneRequestData body);

  /**
   * Get relations to Start zone entities
   * Similar to <code>serviceTelcoTrailStartZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailStartZoneResponseData> serviceTelcoTrailStartZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailStartZoneRequestData body);


  /**
   * Get relations to Start zone entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailStartZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailStartZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailStartZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/StartZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailStartZoneResponseData serviceTelcoTrailStartZone(@Param("elid") String elid, ServiceTelcoTrailStartZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailStartZoneQueryParams queryParams);

  /**
  * Get relations to Start zone entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailStartZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailStartZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/StartZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailStartZoneResponseData> serviceTelcoTrailStartZoneWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailStartZoneRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailStartZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailStartZone</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailStartZoneQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailStartZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query structures
   * Quieries the structures from one object. The attribute INCLUDE_SERVICES determines if the allocation of services should additionally be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTelcoTrailStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailStructuresResponse serviceTelcoTrailStructures(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailStructuresRequest body);

  /**
   * Query structures
   * Similar to <code>serviceTelcoTrailStructures</code> but it also returns the http response headers .
   * Quieries the structures from one object. The attribute INCLUDE_SERVICES determines if the allocation of services should additionally be returned.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Structures?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailStructuresResponse> serviceTelcoTrailStructuresWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailStructuresRequest body);


  /**
   * Query structures
   * Quieries the structures from one object. The attribute INCLUDE_SERVICES determines if the allocation of services should additionally be returned.
   * Note, this is equivalent to the other <code>serviceTelcoTrailStructures</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailStructuresQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailStructuresResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Structures?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailStructuresResponse serviceTelcoTrailStructures(@Param("elid") String elid, ServiceTelcoTrailStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoTrailStructuresQueryParams queryParams);

  /**
  * Query structures
  * Quieries the structures from one object. The attribute INCLUDE_SERVICES determines if the allocation of services should additionally be returned.
  * Note, this is equivalent to the other <code>serviceTelcoTrailStructures</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailStructuresResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Structures?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailStructuresResponse> serviceTelcoTrailStructuresWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailStructuresRequest body, @QueryMap(encoded=true) ServiceTelcoTrailStructuresQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailStructures</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailStructuresQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailStructuresQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailSuccessorsResponseData serviceTelcoTrailSuccessors(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailSuccessorsRequestData body);

  /**
   * Get relations to Successor entities
   * Similar to <code>serviceTelcoTrailSuccessors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Successors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailSuccessorsResponseData> serviceTelcoTrailSuccessorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailSuccessorsRequestData body);


  /**
   * Get relations to Successor entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailSuccessors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailSuccessorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailSuccessorsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Successors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailSuccessorsResponseData serviceTelcoTrailSuccessors(@Param("elid") String elid, ServiceTelcoTrailSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailSuccessorsQueryParams queryParams);

  /**
  * Get relations to Successor entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailSuccessors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailSuccessorsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Successors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailSuccessorsResponseData> serviceTelcoTrailSuccessorsWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailSuccessorsRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailSuccessorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailSuccessors</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailSuccessorsQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailSuccessorsQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailSystemAttributesResponse serviceTelcoTrailSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTelcoTrailSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailSystemAttributesResponse> serviceTelcoTrailSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceTelcoTrailSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailSystemAttributesResponse serviceTelcoTrailSystemAttributes(@Param("elid") String elid, ServiceTelcoTrailSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoTrailSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceTelcoTrailSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailSystemAttributesResponse> serviceTelcoTrailSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTelcoTrailSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ServiceTelcoTrailVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTelcoTrailVlansResponseData serviceTelcoTrailVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceTelcoTrailVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTelcoTrailVlansResponseData> serviceTelcoTrailVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTelcoTrailVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceTelcoTrailVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTelcoTrailVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTelcoTrailVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTelcoTrailVlansResponseData serviceTelcoTrailVlans(@Param("elid") String elid, ServiceTelcoTrailVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceTelcoTrailVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTelcoTrailVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTelcoTrailVlansResponseData> serviceTelcoTrailVlansWithHttpInfo(@Param("elid") String elid, ServiceTelcoTrailVlansRequestData body, @QueryMap(encoded=true) ServiceTelcoTrailVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTelcoTrailVlans</code> method in a fluent style.
   */
  public static class ServiceTelcoTrailVlansQueryParams extends HashMap<String, Object> {
    public ServiceTelcoTrailVlansQueryParams sessionId(final String value) {
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
   * @return UpdatePacketDataServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePacketDataServiceTelcoTrailResponse updatePacketDataServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataServiceTelcoTrailRequestData body);

  /**
   * Modify packet data
   * Similar to <code>updatePacketDataServiceTelcoTrail</code> but it also returns the http response headers .
   * Modify packet data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePacketDataServiceTelcoTrailResponse> updatePacketDataServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePacketDataServiceTelcoTrailRequestData body);


  /**
   * Modify packet data
   * Modify packet data
   * Note, this is equivalent to the other <code>updatePacketDataServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePacketDataServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePacketDataServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updatePacketData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePacketDataServiceTelcoTrailResponse updatePacketDataServiceTelcoTrail(@Param("elid") String elid, UpdatePacketDataServiceTelcoTrailRequestData body, @QueryMap(encoded=true) UpdatePacketDataServiceTelcoTrailQueryParams queryParams);

  /**
  * Modify packet data
  * Modify packet data
  * Note, this is equivalent to the other <code>updatePacketDataServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePacketDataServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updatePacketData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePacketDataServiceTelcoTrailResponse> updatePacketDataServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, UpdatePacketDataServiceTelcoTrailRequestData body, @QueryMap(encoded=true) UpdatePacketDataServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePacketDataServiceTelcoTrail</code> method in a fluent style.
   */
  public static class UpdatePacketDataServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public UpdatePacketDataServiceTelcoTrailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTelcoTrailResponse updateServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoTrailRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTelcoTrail</code> but it also returns the http response headers .
   * Modify Service (Telco)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTelcoTrailResponse> updateServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTelcoTrailRequestData body);


  /**
   * Modify
   * Modify Service (Telco)
   * Note, this is equivalent to the other <code>updateServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTelcoTrailResponse updateServiceTelcoTrail(@Param("elid") String elid, UpdateServiceTelcoTrailRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoTrailQueryParams queryParams);

  /**
  * Modify
  * Modify Service (Telco)
  * Note, this is equivalent to the other <code>updateServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTelcoTrailResponse> updateServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, UpdateServiceTelcoTrailRequestData body, @QueryMap(encoded=true) UpdateServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTelcoTrail</code> method in a fluent style.
   */
  public static class UpdateServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public UpdateServiceTelcoTrailQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoTrailResponse updateSystemAttributesServiceTelcoTrail(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoTrailRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTelcoTrail</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTelcoTrailResponse> updateSystemAttributesServiceTelcoTrailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTelcoTrailRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoTrail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTelcoTrailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTelcoTrailResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTelcoTrailResponse updateSystemAttributesServiceTelcoTrail(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoTrailRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoTrailQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTelcoTrail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTelcoTrailResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTelcoTrail/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTelcoTrailResponse> updateSystemAttributesServiceTelcoTrailWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTelcoTrailRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTelcoTrailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTelcoTrail</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTelcoTrailQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTelcoTrailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
