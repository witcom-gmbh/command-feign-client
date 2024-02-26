package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtServiceMasterSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtServiceMasterSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtSignalPathsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtSignalPathsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceSignalmgmtApi extends ApiClient.Api {


  /**
   * Delete
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceSignalmgmtResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceSignalmgmtResponse deleteServiceSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceSignalmgmt</code> but it also returns the http response headers .
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceSignalmgmtResponse> deleteServiceSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtRequestData body);


  /**
   * Delete
   * Delete Service
   * Note, this is equivalent to the other <code>deleteServiceSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceSignalmgmtResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceSignalmgmtResponse deleteServiceSignalmgmt(@Param("elid") String elid, DeleteServiceSignalmgmtRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtQueryParams queryParams);

  /**
  * Delete
  * Delete Service
  * Note, this is equivalent to the other <code>deleteServiceSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceSignalmgmtResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceSignalmgmtResponse> deleteServiceSignalmgmtWithHttpInfo(@Param("elid") String elid, DeleteServiceSignalmgmtRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceSignalmgmt</code> method in a fluent style.
   */
  public static class DeleteServiceSignalmgmtQueryParams extends HashMap<String, Object> {
    public DeleteServiceSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtContractsResponseData serviceSignalmgmtContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceSignalmgmtContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtContractsResponseData> serviceSignalmgmtContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtContractsResponseData serviceSignalmgmtContracts(@Param("elid") String elid, ServiceSignalmgmtContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtContractsResponseData> serviceSignalmgmtContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtDevicesAllResponseData serviceSignalmgmtDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceSignalmgmtDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtDevicesAllResponseData> serviceSignalmgmtDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtDevicesAllResponseData serviceSignalmgmtDevicesAll(@Param("elid") String elid, ServiceSignalmgmtDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtDevicesAllResponseData> serviceSignalmgmtDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtDevicesAll</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFrameContractsResponseData serviceSignalmgmtFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceSignalmgmtFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFrameContractsResponseData> serviceSignalmgmtFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFrameContractsResponseData serviceSignalmgmtFrameContracts(@Param("elid") String elid, ServiceSignalmgmtFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFrameContractsResponseData> serviceSignalmgmtFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFrameContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtOrganizationsResponseData serviceSignalmgmtOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceSignalmgmtOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtOrganizationsResponseData> serviceSignalmgmtOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtOrganizationsResponseData serviceSignalmgmtOrganizations(@Param("elid") String elid, ServiceSignalmgmtOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtOrganizationsResponseData> serviceSignalmgmtOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtOrganizations</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtPersonGroupsResponseData serviceSignalmgmtPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceSignalmgmtPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtPersonGroupsResponseData> serviceSignalmgmtPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtPersonGroupsResponseData serviceSignalmgmtPersonGroups(@Param("elid") String elid, ServiceSignalmgmtPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtPersonGroupsResponseData> serviceSignalmgmtPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtPersonGroups</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtPersonsResponseData serviceSignalmgmtPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceSignalmgmtPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtPersonsResponseData> serviceSignalmgmtPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtPersonsResponseData serviceSignalmgmtPersons(@Param("elid") String elid, ServiceSignalmgmtPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtPersonsResponseData> serviceSignalmgmtPersonsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtPersons</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtPersonsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceSignalmgmtQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtQueryResponse serviceSignalmgmtQuery(@Param("sessionId") String sessionId, ServiceSignalmgmtQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceSignalmgmtQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtQueryResponse> serviceSignalmgmtQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceSignalmgmtQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceSignalmgmtQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtQueryResponse serviceSignalmgmtQuery(ServiceSignalmgmtQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceSignalmgmtQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtQueryResponse> serviceSignalmgmtQueryWithHttpInfo(ServiceSignalmgmtQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtQuery</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtQueryQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtQueryQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtServiceMasterSignalmgmtResponseData serviceSignalmgmtServiceMasterSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtServiceMasterSignalmgmtRequestData body);

  /**
   * Get relations to Service master (Signal Management) entities
   * Similar to <code>serviceSignalmgmtServiceMasterSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtServiceMasterSignalmgmtResponseData> serviceSignalmgmtServiceMasterSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtServiceMasterSignalmgmtRequestData body);


  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtServiceMasterSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtServiceMasterSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtServiceMasterSignalmgmtResponseData serviceSignalmgmtServiceMasterSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtServiceMasterSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service master (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtServiceMasterSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtServiceMasterSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtServiceMasterSignalmgmtResponseData> serviceSignalmgmtServiceMasterSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtServiceMasterSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtServiceMasterSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtServiceMasterSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtServiceMasterSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtServicesSignalmgmtResponseData serviceSignalmgmtServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceSignalmgmtServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtServicesSignalmgmtResponseData> serviceSignalmgmtServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtServicesSignalmgmtResponseData serviceSignalmgmtServicesSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtServicesSignalmgmtResponseData> serviceSignalmgmtServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtSignalPathsResponseData serviceSignalmgmtSignalPaths(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtSignalPathsRequestData body);

  /**
   * Get relations to Signal path entities
   * Similar to <code>serviceSignalmgmtSignalPaths</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtSignalPathsResponseData> serviceSignalmgmtSignalPathsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtSignalPathsRequestData body);


  /**
   * Get relations to Signal path entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtSignalPaths</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtSignalPathsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtSignalPathsResponseData serviceSignalmgmtSignalPaths(@Param("elid") String elid, ServiceSignalmgmtSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtSignalPathsQueryParams queryParams);

  /**
  * Get relations to Signal path entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtSignalPaths</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtSignalPathsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SignalPaths?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtSignalPathsResponseData> serviceSignalmgmtSignalPathsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtSignalPathsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtSignalPaths</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtSignalPathsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtSignalPathsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtSystemAttributesResponse serviceSignalmgmtSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceSignalmgmtSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtSystemAttributesResponse> serviceSignalmgmtSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceSignalmgmtSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtSystemAttributesResponse serviceSignalmgmtSystemAttributes(@Param("elid") String elid, ServiceSignalmgmtSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceSignalmgmtSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtSystemAttributesResponse> serviceSignalmgmtSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceSignalmgmtResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtResponse updateSystemAttributesServiceSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceSignalmgmt</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceSignalmgmtResponse> updateSystemAttributesServiceSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceSignalmgmtResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtResponse updateSystemAttributesServiceSignalmgmt(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceSignalmgmtResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceSignalmgmtResponse> updateSystemAttributesServiceSignalmgmtWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceSignalmgmt</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceSignalmgmtQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceSignalmgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
