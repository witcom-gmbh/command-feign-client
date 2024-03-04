package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceSamResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceSamResponse;
import com.fntsoftware.businessgateway.entities.ReassignAllCiServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllCiServiceSamResponse;
import com.fntsoftware.businessgateway.entities.ReassignCiPartiallyServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.ReassignCiPartiallyServiceSamResponse;
import com.fntsoftware.businessgateway.entities.ServiceSamContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSamContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSamOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSamOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSamPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSamPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSamPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSamPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSamQueryCiRequest;
import com.fntsoftware.businessgateway.entities.ServiceSamQueryCiResponse;
import com.fntsoftware.businessgateway.entities.ServiceSamQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceSamQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceSamServiceAssetsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSamServiceAssetsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSamServicesChildRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSamServicesChildResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSamSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceSamSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceSamResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSamResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServiceSamApi extends ApiClient.Api {


  /**
   * Create
   * Create Service (SAM)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceSamResponse createServiceSam(@Param("sessionId") String sessionId, CreateServiceSamRequestData body);

  /**
   * Create
   * Similar to <code>createServiceSam</code> but it also returns the http response headers .
   * Create Service (SAM)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceSamResponse> createServiceSamWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceSamRequestData body);


  /**
   * Create
   * Create Service (SAM)
   * Note, this is equivalent to the other <code>createServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceSamResponse createServiceSam(CreateServiceSamRequestData body, @QueryMap(encoded=true) CreateServiceSamQueryParams queryParams);

  /**
  * Create
  * Create Service (SAM)
  * Note, this is equivalent to the other <code>createServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceSamResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceSamResponse> createServiceSamWithHttpInfo(CreateServiceSamRequestData body, @QueryMap(encoded=true) CreateServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceSam</code> method in a fluent style.
   */
  public static class CreateServiceSamQueryParams extends HashMap<String, Object> {
    public CreateServiceSamQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service (SAM)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceSamResponse deleteServiceSam(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSamRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceSam</code> but it also returns the http response headers .
   * Delete Service (SAM)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceSamResponse> deleteServiceSamWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSamRequestData body);


  /**
   * Delete
   * Delete Service (SAM)
   * Note, this is equivalent to the other <code>deleteServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceSamResponse deleteServiceSam(@Param("elid") String elid, DeleteServiceSamRequestData body, @QueryMap(encoded=true) DeleteServiceSamQueryParams queryParams);

  /**
  * Delete
  * Delete Service (SAM)
  * Note, this is equivalent to the other <code>deleteServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceSamResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceSamResponse> deleteServiceSamWithHttpInfo(@Param("elid") String elid, DeleteServiceSamRequestData body, @QueryMap(encoded=true) DeleteServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceSam</code> method in a fluent style.
   */
  public static class DeleteServiceSamQueryParams extends HashMap<String, Object> {
    public DeleteServiceSamQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign all CIs
   * Reassign all CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAllCiServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignAllCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllCiServiceSamResponse reassignAllCiServiceSam(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllCiServiceSamRequestData body);

  /**
   * Reassign all CIs
   * Similar to <code>reassignAllCiServiceSam</code> but it also returns the http response headers .
   * Reassign all CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignAllCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllCiServiceSamResponse> reassignAllCiServiceSamWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllCiServiceSamRequestData body);


  /**
   * Reassign all CIs
   * Reassign all CIs
   * Note, this is equivalent to the other <code>reassignAllCiServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllCiServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllCiServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignAllCi?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllCiServiceSamResponse reassignAllCiServiceSam(@Param("elid") String elid, ReassignAllCiServiceSamRequestData body, @QueryMap(encoded=true) ReassignAllCiServiceSamQueryParams queryParams);

  /**
  * Reassign all CIs
  * Reassign all CIs
  * Note, this is equivalent to the other <code>reassignAllCiServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllCiServiceSamResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignAllCi?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllCiServiceSamResponse> reassignAllCiServiceSamWithHttpInfo(@Param("elid") String elid, ReassignAllCiServiceSamRequestData body, @QueryMap(encoded=true) ReassignAllCiServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllCiServiceSam</code> method in a fluent style.
   */
  public static class ReassignAllCiServiceSamQueryParams extends HashMap<String, Object> {
    public ReassignAllCiServiceSamQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign CIs
   * Reassign CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignCiPartiallyServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignCiPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignCiPartiallyServiceSamResponse reassignCiPartiallyServiceSam(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignCiPartiallyServiceSamRequestData body);

  /**
   * Reassign CIs
   * Similar to <code>reassignCiPartiallyServiceSam</code> but it also returns the http response headers .
   * Reassign CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignCiPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignCiPartiallyServiceSamResponse> reassignCiPartiallyServiceSamWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignCiPartiallyServiceSamRequestData body);


  /**
   * Reassign CIs
   * Reassign CIs
   * Note, this is equivalent to the other <code>reassignCiPartiallyServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignCiPartiallyServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignCiPartiallyServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignCiPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignCiPartiallyServiceSamResponse reassignCiPartiallyServiceSam(@Param("elid") String elid, ReassignCiPartiallyServiceSamRequestData body, @QueryMap(encoded=true) ReassignCiPartiallyServiceSamQueryParams queryParams);

  /**
  * Reassign CIs
  * Reassign CIs
  * Note, this is equivalent to the other <code>reassignCiPartiallyServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignCiPartiallyServiceSamResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/reassignCiPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignCiPartiallyServiceSamResponse> reassignCiPartiallyServiceSamWithHttpInfo(@Param("elid") String elid, ReassignCiPartiallyServiceSamRequestData body, @QueryMap(encoded=true) ReassignCiPartiallyServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignCiPartiallyServiceSam</code> method in a fluent style.
   */
  public static class ReassignCiPartiallyServiceSamQueryParams extends HashMap<String, Object> {
    public ReassignCiPartiallyServiceSamQueryParams sessionId(final String value) {
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
   * @return ServiceSamContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamContractsResponseData serviceSamContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceSamContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamContractsResponseData> serviceSamContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSamContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamContractsResponseData serviceSamContracts(@Param("elid") String elid, ServiceSamContractsRequestData body, @QueryMap(encoded=true) ServiceSamContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSamContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamContractsResponseData> serviceSamContractsWithHttpInfo(@Param("elid") String elid, ServiceSamContractsRequestData body, @QueryMap(encoded=true) ServiceSamContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamContracts</code> method in a fluent style.
   */
  public static class ServiceSamContractsQueryParams extends HashMap<String, Object> {
    public ServiceSamContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSamOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamOrganizationsResponseData serviceSamOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceSamOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamOrganizationsResponseData> serviceSamOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceSamOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamOrganizationsResponseData serviceSamOrganizations(@Param("elid") String elid, ServiceSamOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSamOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceSamOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamOrganizationsResponseData> serviceSamOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceSamOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSamOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamOrganizations</code> method in a fluent style.
   */
  public static class ServiceSamOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceSamOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceSamPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamPersonGroupsResponseData serviceSamPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceSamPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamPersonGroupsResponseData> serviceSamPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceSamPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamPersonGroupsResponseData serviceSamPersonGroups(@Param("elid") String elid, ServiceSamPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSamPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceSamPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamPersonGroupsResponseData> serviceSamPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceSamPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSamPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamPersonGroups</code> method in a fluent style.
   */
  public static class ServiceSamPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceSamPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceSamPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamPersonsResponseData serviceSamPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceSamPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamPersonsResponseData> serviceSamPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceSamPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamPersonsResponseData serviceSamPersons(@Param("elid") String elid, ServiceSamPersonsRequestData body, @QueryMap(encoded=true) ServiceSamPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceSamPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamPersonsResponseData> serviceSamPersonsWithHttpInfo(@Param("elid") String elid, ServiceSamPersonsRequestData body, @QueryMap(encoded=true) ServiceSamPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamPersons</code> method in a fluent style.
   */
  public static class ServiceSamPersonsQueryParams extends HashMap<String, Object> {
    public ServiceSamPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceSamQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamQueryResponse serviceSamQuery(@Param("sessionId") String sessionId, ServiceSamQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceSamQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamQueryResponse> serviceSamQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceSamQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serviceSamQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamQueryResponse serviceSamQuery(ServiceSamQueryRequest body, @QueryMap(encoded=true) ServiceSamQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serviceSamQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamQueryResponse> serviceSamQueryWithHttpInfo(ServiceSamQueryRequest body, @QueryMap(encoded=true) ServiceSamQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamQuery</code> method in a fluent style.
   */
  public static class ServiceSamQueryQueryParams extends HashMap<String, Object> {
    public ServiceSamQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CIs
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSamQueryCiResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/QueryCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamQueryCiResponse serviceSamQueryCi(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamQueryCiRequest body);

  /**
   * CIs
   * Similar to <code>serviceSamQueryCi</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/QueryCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamQueryCiResponse> serviceSamQueryCiWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamQueryCiRequest body);


  /**
   * CIs
   * 
   * Note, this is equivalent to the other <code>serviceSamQueryCi</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamQueryCiQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamQueryCiResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/QueryCi?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamQueryCiResponse serviceSamQueryCi(@Param("elid") String elid, ServiceSamQueryCiRequest body, @QueryMap(encoded=true) ServiceSamQueryCiQueryParams queryParams);

  /**
  * CIs
  * 
  * Note, this is equivalent to the other <code>serviceSamQueryCi</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamQueryCiResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/QueryCi?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamQueryCiResponse> serviceSamQueryCiWithHttpInfo(@Param("elid") String elid, ServiceSamQueryCiRequest body, @QueryMap(encoded=true) ServiceSamQueryCiQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamQueryCi</code> method in a fluent style.
   */
  public static class ServiceSamQueryCiQueryParams extends HashMap<String, Object> {
    public ServiceSamQueryCiQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service Asset entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSamServiceAssetsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServiceAssets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamServiceAssetsResponseData serviceSamServiceAssets(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamServiceAssetsRequestData body);

  /**
   * Get relations to Service Asset entities
   * Similar to <code>serviceSamServiceAssets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServiceAssets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamServiceAssetsResponseData> serviceSamServiceAssetsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamServiceAssetsRequestData body);


  /**
   * Get relations to Service Asset entities
   * 
   * Note, this is equivalent to the other <code>serviceSamServiceAssets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamServiceAssetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamServiceAssetsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServiceAssets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamServiceAssetsResponseData serviceSamServiceAssets(@Param("elid") String elid, ServiceSamServiceAssetsRequestData body, @QueryMap(encoded=true) ServiceSamServiceAssetsQueryParams queryParams);

  /**
  * Get relations to Service Asset entities
  * 
  * Note, this is equivalent to the other <code>serviceSamServiceAssets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamServiceAssetsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServiceAssets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamServiceAssetsResponseData> serviceSamServiceAssetsWithHttpInfo(@Param("elid") String elid, ServiceSamServiceAssetsRequestData body, @QueryMap(encoded=true) ServiceSamServiceAssetsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamServiceAssets</code> method in a fluent style.
   */
  public static class ServiceSamServiceAssetsQueryParams extends HashMap<String, Object> {
    public ServiceSamServiceAssetsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (SAM) (child) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSamServicesChildResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServicesChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamServicesChildResponseData serviceSamServicesChild(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamServicesChildRequestData body);

  /**
   * Get relations to Service (SAM) (child) entities
   * Similar to <code>serviceSamServicesChild</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServicesChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamServicesChildResponseData> serviceSamServicesChildWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamServicesChildRequestData body);


  /**
   * Get relations to Service (SAM) (child) entities
   * 
   * Note, this is equivalent to the other <code>serviceSamServicesChild</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamServicesChildQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamServicesChildResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServicesChild?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamServicesChildResponseData serviceSamServicesChild(@Param("elid") String elid, ServiceSamServicesChildRequestData body, @QueryMap(encoded=true) ServiceSamServicesChildQueryParams queryParams);

  /**
  * Get relations to Service (SAM) (child) entities
  * 
  * Note, this is equivalent to the other <code>serviceSamServicesChild</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamServicesChildResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/ServicesChild?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamServicesChildResponseData> serviceSamServicesChildWithHttpInfo(@Param("elid") String elid, ServiceSamServicesChildRequestData body, @QueryMap(encoded=true) ServiceSamServicesChildQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamServicesChild</code> method in a fluent style.
   */
  public static class ServiceSamServicesChildQueryParams extends HashMap<String, Object> {
    public ServiceSamServicesChildQueryParams sessionId(final String value) {
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
   * @return ServiceSamSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSamSystemAttributesResponse serviceSamSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceSamSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSamSystemAttributesResponse> serviceSamSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSamSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceSamSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSamSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSamSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSamSystemAttributesResponse serviceSamSystemAttributes(@Param("elid") String elid, ServiceSamSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSamSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceSamSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSamSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSamSystemAttributesResponse> serviceSamSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceSamSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSamSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSamSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceSamSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceSamSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service (SAM)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceSamResponse updateServiceSam(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSamRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceSam</code> but it also returns the http response headers .
   * Modify Service (SAM)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceSamResponse> updateServiceSamWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSamRequestData body);


  /**
   * Modify
   * Modify Service (SAM)
   * Note, this is equivalent to the other <code>updateServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceSamResponse updateServiceSam(@Param("elid") String elid, UpdateServiceSamRequestData body, @QueryMap(encoded=true) UpdateServiceSamQueryParams queryParams);

  /**
  * Modify
  * Modify Service (SAM)
  * Note, this is equivalent to the other <code>updateServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceSamResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceSamResponse> updateServiceSamWithHttpInfo(@Param("elid") String elid, UpdateServiceSamRequestData body, @QueryMap(encoded=true) UpdateServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceSam</code> method in a fluent style.
   */
  public static class UpdateServiceSamQueryParams extends HashMap<String, Object> {
    public UpdateServiceSamQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceSamResponse updateSystemAttributesServiceSam(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSamRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceSam</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceSamResponse> updateSystemAttributesServiceSamWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSamRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceSamResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSam/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceSamResponse updateSystemAttributesServiceSam(@Param("elid") String elid, UpdateSystemAttributesServiceSamRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSamQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceSamResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSam/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceSamResponse> updateSystemAttributesServiceSamWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceSamRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceSam</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceSamQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceSamQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
