package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDomainRequestData;
import com.fntsoftware.businessgateway.entities.CreateDomainResponse;
import com.fntsoftware.businessgateway.entities.DeleteDomainRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDomainResponse;
import com.fntsoftware.businessgateway.entities.DomainContractsRequestData;
import com.fntsoftware.businessgateway.entities.DomainContractsResponseData;
import com.fntsoftware.businessgateway.entities.DomainFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DomainFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DomainMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DomainMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DomainOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DomainOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DomainPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DomainPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DomainPersonsRequestData;
import com.fntsoftware.businessgateway.entities.DomainPersonsResponseData;
import com.fntsoftware.businessgateway.entities.DomainQueryRequest;
import com.fntsoftware.businessgateway.entities.DomainQueryResponse;
import com.fntsoftware.businessgateway.entities.DomainSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DomainSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateDomainRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDomainResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDomainRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDomainResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DomainApi extends ApiClient.Api {


  /**
   * Create
   * Create domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDomainResponse createDomain(@Param("sessionId") String sessionId, CreateDomainRequestData body);

  /**
   * Create
   * Similar to <code>createDomain</code> but it also returns the http response headers .
   * Create domain
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDomainResponse> createDomainWithHttpInfo(@Param("sessionId") String sessionId, CreateDomainRequestData body);


  /**
   * Create
   * Create domain
   * Note, this is equivalent to the other <code>createDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDomainResponse createDomain(CreateDomainRequestData body, @QueryMap(encoded=true) CreateDomainQueryParams queryParams);

  /**
  * Create
  * Create domain
  * Note, this is equivalent to the other <code>createDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDomainResponse
      */
      @RequestLine("POST /api/rest/entity/domain/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDomainResponse> createDomainWithHttpInfo(CreateDomainRequestData body, @QueryMap(encoded=true) CreateDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDomain</code> method in a fluent style.
   */
  public static class CreateDomainQueryParams extends HashMap<String, Object> {
    public CreateDomainQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete domain
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDomainResponse deleteDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDomainRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDomain</code> but it also returns the http response headers .
   * Delete domain
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDomainResponse> deleteDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDomainRequestData body);


  /**
   * Delete
   * Delete domain
   * Note, this is equivalent to the other <code>deleteDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDomainResponse deleteDomain(@Param("elid") String elid, DeleteDomainRequestData body, @QueryMap(encoded=true) DeleteDomainQueryParams queryParams);

  /**
  * Delete
  * Delete domain
  * Note, this is equivalent to the other <code>deleteDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDomainResponse
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDomainResponse> deleteDomainWithHttpInfo(@Param("elid") String elid, DeleteDomainRequestData body, @QueryMap(encoded=true) DeleteDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDomain</code> method in a fluent style.
   */
  public static class DeleteDomainQueryParams extends HashMap<String, Object> {
    public DeleteDomainQueryParams sessionId(final String value) {
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
   * @return DomainContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainContractsResponseData domainContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>domainContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainContractsResponseData> domainContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>domainContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainContractsResponseData domainContracts(@Param("elid") String elid, DomainContractsRequestData body, @QueryMap(encoded=true) DomainContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>domainContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainContractsResponseData> domainContractsWithHttpInfo(@Param("elid") String elid, DomainContractsRequestData body, @QueryMap(encoded=true) DomainContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainContracts</code> method in a fluent style.
   */
  public static class DomainContractsQueryParams extends HashMap<String, Object> {
    public DomainContractsQueryParams sessionId(final String value) {
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
   * @return DomainFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainFrameContractsResponseData domainFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>domainFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainFrameContractsResponseData> domainFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>domainFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainFrameContractsResponseData domainFrameContracts(@Param("elid") String elid, DomainFrameContractsRequestData body, @QueryMap(encoded=true) DomainFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>domainFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainFrameContractsResponseData> domainFrameContractsWithHttpInfo(@Param("elid") String elid, DomainFrameContractsRequestData body, @QueryMap(encoded=true) DomainFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainFrameContracts</code> method in a fluent style.
   */
  public static class DomainFrameContractsQueryParams extends HashMap<String, Object> {
    public DomainFrameContractsQueryParams sessionId(final String value) {
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
   * @return DomainMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainMaintenanceContractsResponseData domainMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>domainMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainMaintenanceContractsResponseData> domainMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>domainMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainMaintenanceContractsResponseData domainMaintenanceContracts(@Param("elid") String elid, DomainMaintenanceContractsRequestData body, @QueryMap(encoded=true) DomainMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>domainMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainMaintenanceContractsResponseData> domainMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DomainMaintenanceContractsRequestData body, @QueryMap(encoded=true) DomainMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainMaintenanceContracts</code> method in a fluent style.
   */
  public static class DomainMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DomainMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return DomainOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainOrganizationsResponseData domainOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>domainOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainOrganizationsResponseData> domainOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>domainOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainOrganizationsResponseData domainOrganizations(@Param("elid") String elid, DomainOrganizationsRequestData body, @QueryMap(encoded=true) DomainOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>domainOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainOrganizationsResponseData> domainOrganizationsWithHttpInfo(@Param("elid") String elid, DomainOrganizationsRequestData body, @QueryMap(encoded=true) DomainOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainOrganizations</code> method in a fluent style.
   */
  public static class DomainOrganizationsQueryParams extends HashMap<String, Object> {
    public DomainOrganizationsQueryParams sessionId(final String value) {
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
   * @return DomainPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainPersonGroupsResponseData domainPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>domainPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainPersonGroupsResponseData> domainPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>domainPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainPersonGroupsResponseData domainPersonGroups(@Param("elid") String elid, DomainPersonGroupsRequestData body, @QueryMap(encoded=true) DomainPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>domainPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainPersonGroupsResponseData> domainPersonGroupsWithHttpInfo(@Param("elid") String elid, DomainPersonGroupsRequestData body, @QueryMap(encoded=true) DomainPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainPersonGroups</code> method in a fluent style.
   */
  public static class DomainPersonGroupsQueryParams extends HashMap<String, Object> {
    public DomainPersonGroupsQueryParams sessionId(final String value) {
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
   * @return DomainPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainPersonsResponseData domainPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>domainPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainPersonsResponseData> domainPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>domainPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainPersonsResponseData domainPersons(@Param("elid") String elid, DomainPersonsRequestData body, @QueryMap(encoded=true) DomainPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>domainPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainPersonsResponseData> domainPersonsWithHttpInfo(@Param("elid") String elid, DomainPersonsRequestData body, @QueryMap(encoded=true) DomainPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainPersons</code> method in a fluent style.
   */
  public static class DomainPersonsQueryParams extends HashMap<String, Object> {
    public DomainPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DomainQueryResponse
   */
  @RequestLine("POST /api/rest/entity/domain/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainQueryResponse domainQuery(@Param("sessionId") String sessionId, DomainQueryRequest body);

  /**
   * Basic query
   * Similar to <code>domainQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainQueryResponse> domainQueryWithHttpInfo(@Param("sessionId") String sessionId, DomainQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>domainQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainQueryResponse
   */
  @RequestLine("POST /api/rest/entity/domain/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainQueryResponse domainQuery(DomainQueryRequest body, @QueryMap(encoded=true) DomainQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>domainQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainQueryResponse
      */
      @RequestLine("POST /api/rest/entity/domain/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainQueryResponse> domainQueryWithHttpInfo(DomainQueryRequest body, @QueryMap(encoded=true) DomainQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainQuery</code> method in a fluent style.
   */
  public static class DomainQueryQueryParams extends HashMap<String, Object> {
    public DomainQueryQueryParams sessionId(final String value) {
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
   * @return DomainSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DomainSystemAttributesResponse domainSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>domainSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DomainSystemAttributesResponse> domainSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DomainSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>domainSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DomainSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DomainSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DomainSystemAttributesResponse domainSystemAttributes(@Param("elid") String elid, DomainSystemAttributesRequest body, @QueryMap(encoded=true) DomainSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>domainSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DomainSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DomainSystemAttributesResponse> domainSystemAttributesWithHttpInfo(@Param("elid") String elid, DomainSystemAttributesRequest body, @QueryMap(encoded=true) DomainSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>domainSystemAttributes</code> method in a fluent style.
   */
  public static class DomainSystemAttributesQueryParams extends HashMap<String, Object> {
    public DomainSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify domain
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDomainResponse updateDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDomainRequestData body);

  /**
   * Modify
   * Similar to <code>updateDomain</code> but it also returns the http response headers .
   * Modify domain
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDomainResponse> updateDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDomainRequestData body);


  /**
   * Modify
   * Modify domain
   * Note, this is equivalent to the other <code>updateDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDomainResponse updateDomain(@Param("elid") String elid, UpdateDomainRequestData body, @QueryMap(encoded=true) UpdateDomainQueryParams queryParams);

  /**
  * Modify
  * Modify domain
  * Note, this is equivalent to the other <code>updateDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDomainResponse
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDomainResponse> updateDomainWithHttpInfo(@Param("elid") String elid, UpdateDomainRequestData body, @QueryMap(encoded=true) UpdateDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDomain</code> method in a fluent style.
   */
  public static class UpdateDomainQueryParams extends HashMap<String, Object> {
    public UpdateDomainQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDomainResponse updateSystemAttributesDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDomainRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDomain</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDomainResponse> updateSystemAttributesDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDomainRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDomainResponse
   */
  @RequestLine("POST /api/rest/entity/domain/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDomainResponse updateSystemAttributesDomain(@Param("elid") String elid, UpdateSystemAttributesDomainRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDomainQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDomainResponse
      */
      @RequestLine("POST /api/rest/entity/domain/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDomainResponse> updateSystemAttributesDomainWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDomainRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDomain</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDomainQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDomainQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
