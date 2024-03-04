package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ApplicationReleaseApplicationDeploymentsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseApplicationDeploymentsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseContractsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseContractsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleasePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleasePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleasePersonsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleasePersonsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseQueryRequest;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseQueryResponse;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseSoftwareProductsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseSoftwareProductsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ApplicationReleaseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationReleaseResponse;
import com.fntsoftware.businessgateway.entities.DeleteApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.DeleteApplicationReleaseResponse;
import com.fntsoftware.businessgateway.entities.UpdateApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateApplicationReleaseResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesApplicationReleaseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ApplicationReleaseApi extends ApiClient.Api {


  /**
   * Get relations to Application Deployment entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationReleaseApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseApplicationDeploymentsResponseData applicationReleaseApplicationDeployments(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseApplicationDeploymentsRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>applicationReleaseApplicationDeployments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseApplicationDeploymentsResponseData> applicationReleaseApplicationDeploymentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseApplicationDeploymentsRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>applicationReleaseApplicationDeployments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseApplicationDeploymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseApplicationDeploymentsResponseData applicationReleaseApplicationDeployments(@Param("elid") String elid, ApplicationReleaseApplicationDeploymentsRequestData body, @QueryMap(encoded=true) ApplicationReleaseApplicationDeploymentsQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>applicationReleaseApplicationDeployments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseApplicationDeploymentsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/ApplicationDeployments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseApplicationDeploymentsResponseData> applicationReleaseApplicationDeploymentsWithHttpInfo(@Param("elid") String elid, ApplicationReleaseApplicationDeploymentsRequestData body, @QueryMap(encoded=true) ApplicationReleaseApplicationDeploymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseApplicationDeployments</code> method in a fluent style.
   */
  public static class ApplicationReleaseApplicationDeploymentsQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseApplicationDeploymentsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleaseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseContractsResponseData applicationReleaseContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>applicationReleaseContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseContractsResponseData> applicationReleaseContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>applicationReleaseContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseContractsResponseData applicationReleaseContracts(@Param("elid") String elid, ApplicationReleaseContractsRequestData body, @QueryMap(encoded=true) ApplicationReleaseContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>applicationReleaseContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseContractsResponseData> applicationReleaseContractsWithHttpInfo(@Param("elid") String elid, ApplicationReleaseContractsRequestData body, @QueryMap(encoded=true) ApplicationReleaseContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseContracts</code> method in a fluent style.
   */
  public static class ApplicationReleaseContractsQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseContractsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleaseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseFrameContractsResponseData applicationReleaseFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>applicationReleaseFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseFrameContractsResponseData> applicationReleaseFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>applicationReleaseFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseFrameContractsResponseData applicationReleaseFrameContracts(@Param("elid") String elid, ApplicationReleaseFrameContractsRequestData body, @QueryMap(encoded=true) ApplicationReleaseFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>applicationReleaseFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseFrameContractsResponseData> applicationReleaseFrameContractsWithHttpInfo(@Param("elid") String elid, ApplicationReleaseFrameContractsRequestData body, @QueryMap(encoded=true) ApplicationReleaseFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseFrameContracts</code> method in a fluent style.
   */
  public static class ApplicationReleaseFrameContractsQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseFrameContractsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleaseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseMaintenanceContractsResponseData applicationReleaseMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>applicationReleaseMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseMaintenanceContractsResponseData> applicationReleaseMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>applicationReleaseMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseMaintenanceContractsResponseData applicationReleaseMaintenanceContracts(@Param("elid") String elid, ApplicationReleaseMaintenanceContractsRequestData body, @QueryMap(encoded=true) ApplicationReleaseMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>applicationReleaseMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseMaintenanceContractsResponseData> applicationReleaseMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ApplicationReleaseMaintenanceContractsRequestData body, @QueryMap(encoded=true) ApplicationReleaseMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseMaintenanceContracts</code> method in a fluent style.
   */
  public static class ApplicationReleaseMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleaseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseOrganizationsResponseData applicationReleaseOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>applicationReleaseOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseOrganizationsResponseData> applicationReleaseOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>applicationReleaseOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseOrganizationsResponseData applicationReleaseOrganizations(@Param("elid") String elid, ApplicationReleaseOrganizationsRequestData body, @QueryMap(encoded=true) ApplicationReleaseOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>applicationReleaseOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseOrganizationsResponseData> applicationReleaseOrganizationsWithHttpInfo(@Param("elid") String elid, ApplicationReleaseOrganizationsRequestData body, @QueryMap(encoded=true) ApplicationReleaseOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseOrganizations</code> method in a fluent style.
   */
  public static class ApplicationReleaseOrganizationsQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseOrganizationsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleasePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleasePersonGroupsResponseData applicationReleasePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleasePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>applicationReleasePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleasePersonGroupsResponseData> applicationReleasePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleasePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>applicationReleasePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleasePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleasePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleasePersonGroupsResponseData applicationReleasePersonGroups(@Param("elid") String elid, ApplicationReleasePersonGroupsRequestData body, @QueryMap(encoded=true) ApplicationReleasePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>applicationReleasePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleasePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleasePersonGroupsResponseData> applicationReleasePersonGroupsWithHttpInfo(@Param("elid") String elid, ApplicationReleasePersonGroupsRequestData body, @QueryMap(encoded=true) ApplicationReleasePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleasePersonGroups</code> method in a fluent style.
   */
  public static class ApplicationReleasePersonGroupsQueryParams extends HashMap<String, Object> {
    public ApplicationReleasePersonGroupsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleasePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleasePersonsResponseData applicationReleasePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleasePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>applicationReleasePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleasePersonsResponseData> applicationReleasePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleasePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>applicationReleasePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleasePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleasePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleasePersonsResponseData applicationReleasePersons(@Param("elid") String elid, ApplicationReleasePersonsRequestData body, @QueryMap(encoded=true) ApplicationReleasePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>applicationReleasePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleasePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleasePersonsResponseData> applicationReleasePersonsWithHttpInfo(@Param("elid") String elid, ApplicationReleasePersonsRequestData body, @QueryMap(encoded=true) ApplicationReleasePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleasePersons</code> method in a fluent style.
   */
  public static class ApplicationReleasePersonsQueryParams extends HashMap<String, Object> {
    public ApplicationReleasePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ApplicationReleaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseQueryResponse applicationReleaseQuery(@Param("sessionId") String sessionId, ApplicationReleaseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>applicationReleaseQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseQueryResponse> applicationReleaseQueryWithHttpInfo(@Param("sessionId") String sessionId, ApplicationReleaseQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>applicationReleaseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseQueryResponse applicationReleaseQuery(ApplicationReleaseQueryRequest body, @QueryMap(encoded=true) ApplicationReleaseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>applicationReleaseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseQueryResponse> applicationReleaseQueryWithHttpInfo(ApplicationReleaseQueryRequest body, @QueryMap(encoded=true) ApplicationReleaseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseQuery</code> method in a fluent style.
   */
  public static class ApplicationReleaseQueryQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software product entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationReleaseSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseSoftwareProductsResponseData applicationReleaseSoftwareProducts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseSoftwareProductsRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>applicationReleaseSoftwareProducts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseSoftwareProductsResponseData> applicationReleaseSoftwareProductsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseSoftwareProductsRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>applicationReleaseSoftwareProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseSoftwareProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseSoftwareProductsResponseData applicationReleaseSoftwareProducts(@Param("elid") String elid, ApplicationReleaseSoftwareProductsRequestData body, @QueryMap(encoded=true) ApplicationReleaseSoftwareProductsQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>applicationReleaseSoftwareProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseSoftwareProductsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SoftwareProducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseSoftwareProductsResponseData> applicationReleaseSoftwareProductsWithHttpInfo(@Param("elid") String elid, ApplicationReleaseSoftwareProductsRequestData body, @QueryMap(encoded=true) ApplicationReleaseSoftwareProductsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseSoftwareProducts</code> method in a fluent style.
   */
  public static class ApplicationReleaseSoftwareProductsQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseSoftwareProductsQueryParams sessionId(final String value) {
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
   * @return ApplicationReleaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationReleaseSystemAttributesResponse applicationReleaseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>applicationReleaseSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationReleaseSystemAttributesResponse> applicationReleaseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationReleaseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>applicationReleaseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationReleaseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationReleaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationReleaseSystemAttributesResponse applicationReleaseSystemAttributes(@Param("elid") String elid, ApplicationReleaseSystemAttributesRequest body, @QueryMap(encoded=true) ApplicationReleaseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>applicationReleaseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationReleaseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationReleaseSystemAttributesResponse> applicationReleaseSystemAttributesWithHttpInfo(@Param("elid") String elid, ApplicationReleaseSystemAttributesRequest body, @QueryMap(encoded=true) ApplicationReleaseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationReleaseSystemAttributes</code> method in a fluent style.
   */
  public static class ApplicationReleaseSystemAttributesQueryParams extends HashMap<String, Object> {
    public ApplicationReleaseSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create application
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateApplicationReleaseResponse createApplicationRelease(@Param("sessionId") String sessionId, CreateApplicationReleaseRequestData body);

  /**
   * Create
   * Similar to <code>createApplicationRelease</code> but it also returns the http response headers .
   * Create application
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateApplicationReleaseResponse> createApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, CreateApplicationReleaseRequestData body);


  /**
   * Create
   * Create application
   * Note, this is equivalent to the other <code>createApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateApplicationReleaseResponse createApplicationRelease(CreateApplicationReleaseRequestData body, @QueryMap(encoded=true) CreateApplicationReleaseQueryParams queryParams);

  /**
  * Create
  * Create application
  * Note, this is equivalent to the other <code>createApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateApplicationReleaseResponse
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateApplicationReleaseResponse> createApplicationReleaseWithHttpInfo(CreateApplicationReleaseRequestData body, @QueryMap(encoded=true) CreateApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createApplicationRelease</code> method in a fluent style.
   */
  public static class CreateApplicationReleaseQueryParams extends HashMap<String, Object> {
    public CreateApplicationReleaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete application
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteApplicationReleaseResponse deleteApplicationRelease(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteApplicationReleaseRequestData body);

  /**
   * Delete
   * Similar to <code>deleteApplicationRelease</code> but it also returns the http response headers .
   * Delete application
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteApplicationReleaseResponse> deleteApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteApplicationReleaseRequestData body);


  /**
   * Delete
   * Delete application
   * Note, this is equivalent to the other <code>deleteApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteApplicationReleaseResponse deleteApplicationRelease(@Param("elid") String elid, DeleteApplicationReleaseRequestData body, @QueryMap(encoded=true) DeleteApplicationReleaseQueryParams queryParams);

  /**
  * Delete
  * Delete application
  * Note, this is equivalent to the other <code>deleteApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteApplicationReleaseResponse
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteApplicationReleaseResponse> deleteApplicationReleaseWithHttpInfo(@Param("elid") String elid, DeleteApplicationReleaseRequestData body, @QueryMap(encoded=true) DeleteApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteApplicationRelease</code> method in a fluent style.
   */
  public static class DeleteApplicationReleaseQueryParams extends HashMap<String, Object> {
    public DeleteApplicationReleaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify application
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateApplicationReleaseResponse updateApplicationRelease(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateApplicationReleaseRequestData body);

  /**
   * Modify
   * Similar to <code>updateApplicationRelease</code> but it also returns the http response headers .
   * Modify application
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateApplicationReleaseResponse> updateApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateApplicationReleaseRequestData body);


  /**
   * Modify
   * Modify application
   * Note, this is equivalent to the other <code>updateApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateApplicationReleaseResponse updateApplicationRelease(@Param("elid") String elid, UpdateApplicationReleaseRequestData body, @QueryMap(encoded=true) UpdateApplicationReleaseQueryParams queryParams);

  /**
  * Modify
  * Modify application
  * Note, this is equivalent to the other <code>updateApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateApplicationReleaseResponse
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateApplicationReleaseResponse> updateApplicationReleaseWithHttpInfo(@Param("elid") String elid, UpdateApplicationReleaseRequestData body, @QueryMap(encoded=true) UpdateApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateApplicationRelease</code> method in a fluent style.
   */
  public static class UpdateApplicationReleaseQueryParams extends HashMap<String, Object> {
    public UpdateApplicationReleaseQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesApplicationReleaseResponse updateSystemAttributesApplicationRelease(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesApplicationReleaseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesApplicationRelease</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesApplicationReleaseResponse> updateSystemAttributesApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesApplicationReleaseRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesApplicationReleaseResponse
   */
  @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesApplicationReleaseResponse updateSystemAttributesApplicationRelease(@Param("elid") String elid, UpdateSystemAttributesApplicationReleaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesApplicationReleaseQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesApplicationReleaseResponse
      */
      @RequestLine("POST /api/rest/entity/applicationRelease/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesApplicationReleaseResponse> updateSystemAttributesApplicationReleaseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesApplicationReleaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesApplicationRelease</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesApplicationReleaseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesApplicationReleaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
