package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtLanResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtLanResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanServiceMasterSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanSignalPathsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanSignalPathsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtLanSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtLanResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtLanResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceSignalmgmtLanApi extends ApiClient.Api {


  /**
   * Create
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceSignalmgmtLanResponse createServiceSignalmgmtLan(@Param("sessionId") String sessionId, CreateServiceSignalmgmtLanRequestData body);

  /**
   * Create
   * Similar to <code>createServiceSignalmgmtLan</code> but it also returns the http response headers .
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceSignalmgmtLanResponse> createServiceSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceSignalmgmtLanRequestData body);


  /**
   * Create
   * Create Service
   * Note, this is equivalent to the other <code>createServiceSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceSignalmgmtLanResponse createServiceSignalmgmtLan(CreateServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtLanQueryParams queryParams);

  /**
  * Create
  * Create Service
  * Note, this is equivalent to the other <code>createServiceSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceSignalmgmtLanResponse> createServiceSignalmgmtLanWithHttpInfo(CreateServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceSignalmgmtLan</code> method in a fluent style.
   */
  public static class CreateServiceSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public CreateServiceSignalmgmtLanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceSignalmgmtLanResponse deleteServiceSignalmgmtLan(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtLanRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceSignalmgmtLan</code> but it also returns the http response headers .
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceSignalmgmtLanResponse> deleteServiceSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtLanRequestData body);


  /**
   * Delete
   * Delete Service
   * Note, this is equivalent to the other <code>deleteServiceSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceSignalmgmtLanResponse deleteServiceSignalmgmtLan(@Param("elid") String elid, DeleteServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtLanQueryParams queryParams);

  /**
  * Delete
  * Delete Service
  * Note, this is equivalent to the other <code>deleteServiceSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceSignalmgmtLanResponse> deleteServiceSignalmgmtLanWithHttpInfo(@Param("elid") String elid, DeleteServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceSignalmgmtLan</code> method in a fluent style.
   */
  public static class DeleteServiceSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public DeleteServiceSignalmgmtLanQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanContractsResponseData serviceSignalmgmtLanContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceSignalmgmtLanContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanContractsResponseData> serviceSignalmgmtLanContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanContractsResponseData serviceSignalmgmtLanContracts(@Param("elid") String elid, ServiceSignalmgmtLanContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanContractsResponseData> serviceSignalmgmtLanContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanDevicesAllResponseData serviceSignalmgmtLanDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceSignalmgmtLanDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanDevicesAllResponseData> serviceSignalmgmtLanDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanDevicesAllResponseData serviceSignalmgmtLanDevicesAll(@Param("elid") String elid, ServiceSignalmgmtLanDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanDevicesAllResponseData> serviceSignalmgmtLanDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanDevicesAll</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanFrameContractsResponseData serviceSignalmgmtLanFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceSignalmgmtLanFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanFrameContractsResponseData> serviceSignalmgmtLanFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanFrameContractsResponseData serviceSignalmgmtLanFrameContracts(@Param("elid") String elid, ServiceSignalmgmtLanFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanFrameContractsResponseData> serviceSignalmgmtLanFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanFrameContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanOrganizationsResponseData serviceSignalmgmtLanOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceSignalmgmtLanOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanOrganizationsResponseData> serviceSignalmgmtLanOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanOrganizationsResponseData serviceSignalmgmtLanOrganizations(@Param("elid") String elid, ServiceSignalmgmtLanOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanOrganizationsResponseData> serviceSignalmgmtLanOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanOrganizations</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanPersonGroupsResponseData serviceSignalmgmtLanPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceSignalmgmtLanPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanPersonGroupsResponseData> serviceSignalmgmtLanPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanPersonGroupsResponseData serviceSignalmgmtLanPersonGroups(@Param("elid") String elid, ServiceSignalmgmtLanPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanPersonGroupsResponseData> serviceSignalmgmtLanPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanPersonGroups</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanPersonsResponseData serviceSignalmgmtLanPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceSignalmgmtLanPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanPersonsResponseData> serviceSignalmgmtLanPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanPersonsResponseData serviceSignalmgmtLanPersons(@Param("elid") String elid, ServiceSignalmgmtLanPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanPersonsResponseData> serviceSignalmgmtLanPersonsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanPersons</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanPersonsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceSignalmgmtLanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanQueryResponse serviceSignalmgmtLanQuery(@Param("sessionId") String sessionId, ServiceSignalmgmtLanQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceSignalmgmtLanQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanQueryResponse> serviceSignalmgmtLanQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceSignalmgmtLanQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanQueryResponse serviceSignalmgmtLanQuery(ServiceSignalmgmtLanQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtLanQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanQueryResponse> serviceSignalmgmtLanQueryWithHttpInfo(ServiceSignalmgmtLanQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtLanQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanQuery</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanQueryQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData serviceSignalmgmtLanServiceMasterSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanServiceMasterSignalmgmtRequestData body);

  /**
   * Get relations to Service master (Signal Management) entities
   * Similar to <code>serviceSignalmgmtLanServiceMasterSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData> serviceSignalmgmtLanServiceMasterSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanServiceMasterSignalmgmtRequestData body);


  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanServiceMasterSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanServiceMasterSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData serviceSignalmgmtLanServiceMasterSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtLanServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanServiceMasterSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service master (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanServiceMasterSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanServiceMasterSignalmgmtResponseData> serviceSignalmgmtLanServiceMasterSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanServiceMasterSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanServiceMasterSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanServiceMasterSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanServiceMasterSignalmgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Signal Management) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSignalmgmtLanServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanServicesSignalmgmtResponseData serviceSignalmgmtLanServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceSignalmgmtLanServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanServicesSignalmgmtResponseData> serviceSignalmgmtLanServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanServicesSignalmgmtResponseData serviceSignalmgmtLanServicesSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtLanServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanServicesSignalmgmtResponseData> serviceSignalmgmtLanServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanServicesSignalmgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Signal path entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSignalmgmtLanSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanSignalPathsResponseData serviceSignalmgmtLanSignalPaths(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanSignalPathsRequestData body);

  /**
   * Get relations to Signal path entities
   * Similar to <code>serviceSignalmgmtLanSignalPaths</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanSignalPathsResponseData> serviceSignalmgmtLanSignalPathsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanSignalPathsRequestData body);


  /**
   * Get relations to Signal path entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanSignalPaths</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanSignalPathsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanSignalPathsResponseData serviceSignalmgmtLanSignalPaths(@Param("elid") String elid, ServiceSignalmgmtLanSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanSignalPathsQueryParams queryParams);

  /**
  * Get relations to Signal path entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanSignalPaths</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanSignalPathsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SignalPaths?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanSignalPathsResponseData> serviceSignalmgmtLanSignalPathsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtLanSignalPathsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanSignalPaths</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanSignalPathsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanSignalPathsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtLanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtLanSystemAttributesResponse serviceSignalmgmtLanSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceSignalmgmtLanSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtLanSystemAttributesResponse> serviceSignalmgmtLanSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtLanSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceSignalmgmtLanSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtLanSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtLanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtLanSystemAttributesResponse serviceSignalmgmtLanSystemAttributes(@Param("elid") String elid, ServiceSignalmgmtLanSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtLanSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceSignalmgmtLanSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtLanSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtLanSystemAttributesResponse> serviceSignalmgmtLanSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtLanSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtLanSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtLanSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtLanSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtLanSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceSignalmgmtLanResponse updateServiceSignalmgmtLan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtLanRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceSignalmgmtLan</code> but it also returns the http response headers .
   * Modify Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceSignalmgmtLanResponse> updateServiceSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtLanRequestData body);


  /**
   * Modify
   * Modify Service
   * Note, this is equivalent to the other <code>updateServiceSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceSignalmgmtLanResponse updateServiceSignalmgmtLan(@Param("elid") String elid, UpdateServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtLanQueryParams queryParams);

  /**
  * Modify
  * Modify Service
  * Note, this is equivalent to the other <code>updateServiceSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceSignalmgmtLanResponse> updateServiceSignalmgmtLanWithHttpInfo(@Param("elid") String elid, UpdateServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceSignalmgmtLan</code> method in a fluent style.
   */
  public static class UpdateServiceSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public UpdateServiceSignalmgmtLanQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtLanResponse updateSystemAttributesServiceSignalmgmtLan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtLanRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceSignalmgmtLan</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceSignalmgmtLanResponse> updateSystemAttributesServiceSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtLanRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtLanResponse updateSystemAttributesServiceSignalmgmtLan(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtLanQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtLan/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceSignalmgmtLanResponse> updateSystemAttributesServiceSignalmgmtLanWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtLanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceSignalmgmtLan</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceSignalmgmtLanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
