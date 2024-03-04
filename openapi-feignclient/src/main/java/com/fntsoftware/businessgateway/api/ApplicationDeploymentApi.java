package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ApplicationDeploymentApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentApplicationReleaseResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentContractsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentContractsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentOperatingSystemInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentOperatingSystemInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentQueryRequest;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentQueryResponse;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ApplicationDeploymentSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateApplicationDeploymentRequestData;
import com.fntsoftware.businessgateway.entities.CreateApplicationDeploymentResponse;
import com.fntsoftware.businessgateway.entities.DeleteApplicationDeploymentRequestData;
import com.fntsoftware.businessgateway.entities.DeleteApplicationDeploymentResponse;
import com.fntsoftware.businessgateway.entities.UpdateApplicationDeploymentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateApplicationDeploymentResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesApplicationDeploymentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesApplicationDeploymentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ApplicationDeploymentApi extends ApiClient.Api {


  /**
   * Get relations to Application Release entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentApplicationReleaseResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentApplicationReleaseResponseData applicationDeploymentApplicationRelease(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentApplicationReleaseRequestData body);

  /**
   * Get relations to Application Release entities
   * Similar to <code>applicationDeploymentApplicationRelease</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentApplicationReleaseResponseData> applicationDeploymentApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentApplicationReleaseRequestData body);


  /**
   * Get relations to Application Release entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentApplicationReleaseResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentApplicationReleaseResponseData applicationDeploymentApplicationRelease(@Param("elid") String elid, ApplicationDeploymentApplicationReleaseRequestData body, @QueryMap(encoded=true) ApplicationDeploymentApplicationReleaseQueryParams queryParams);

  /**
  * Get relations to Application Release entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentApplicationReleaseResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/ApplicationRelease?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentApplicationReleaseResponseData> applicationDeploymentApplicationReleaseWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentApplicationReleaseRequestData body, @QueryMap(encoded=true) ApplicationDeploymentApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentApplicationRelease</code> method in a fluent style.
   */
  public static class ApplicationDeploymentApplicationReleaseQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentApplicationReleaseQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentContractsResponseData applicationDeploymentContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>applicationDeploymentContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentContractsResponseData> applicationDeploymentContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentContractsResponseData applicationDeploymentContracts(@Param("elid") String elid, ApplicationDeploymentContractsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentContractsResponseData> applicationDeploymentContractsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentContractsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentContracts</code> method in a fluent style.
   */
  public static class ApplicationDeploymentContractsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentContractsQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentFrameContractsResponseData applicationDeploymentFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>applicationDeploymentFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentFrameContractsResponseData> applicationDeploymentFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentFrameContractsResponseData applicationDeploymentFrameContracts(@Param("elid") String elid, ApplicationDeploymentFrameContractsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentFrameContractsResponseData> applicationDeploymentFrameContractsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentFrameContractsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentFrameContracts</code> method in a fluent style.
   */
  public static class ApplicationDeploymentFrameContractsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentFrameContractsQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentMaintenanceContractsResponseData applicationDeploymentMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>applicationDeploymentMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentMaintenanceContractsResponseData> applicationDeploymentMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentMaintenanceContractsResponseData applicationDeploymentMaintenanceContracts(@Param("elid") String elid, ApplicationDeploymentMaintenanceContractsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentMaintenanceContractsResponseData> applicationDeploymentMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentMaintenanceContractsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentMaintenanceContracts</code> method in a fluent style.
   */
  public static class ApplicationDeploymentMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Operating system installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentOperatingSystemInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentOperatingSystemInstallationsResponseData applicationDeploymentOperatingSystemInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentOperatingSystemInstallationsRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>applicationDeploymentOperatingSystemInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentOperatingSystemInstallationsResponseData> applicationDeploymentOperatingSystemInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentOperatingSystemInstallationsRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentOperatingSystemInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentOperatingSystemInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentOperatingSystemInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentOperatingSystemInstallationsResponseData applicationDeploymentOperatingSystemInstallations(@Param("elid") String elid, ApplicationDeploymentOperatingSystemInstallationsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentOperatingSystemInstallationsQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentOperatingSystemInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentOperatingSystemInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentOperatingSystemInstallationsResponseData> applicationDeploymentOperatingSystemInstallationsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentOperatingSystemInstallationsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentOperatingSystemInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentOperatingSystemInstallations</code> method in a fluent style.
   */
  public static class ApplicationDeploymentOperatingSystemInstallationsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentOperatingSystemInstallationsQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentOrganizationsResponseData applicationDeploymentOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>applicationDeploymentOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentOrganizationsResponseData> applicationDeploymentOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentOrganizationsResponseData applicationDeploymentOrganizations(@Param("elid") String elid, ApplicationDeploymentOrganizationsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentOrganizationsResponseData> applicationDeploymentOrganizationsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentOrganizationsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentOrganizations</code> method in a fluent style.
   */
  public static class ApplicationDeploymentOrganizationsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentOrganizationsQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentPersonGroupsResponseData applicationDeploymentPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>applicationDeploymentPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentPersonGroupsResponseData> applicationDeploymentPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentPersonGroupsResponseData applicationDeploymentPersonGroups(@Param("elid") String elid, ApplicationDeploymentPersonGroupsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentPersonGroupsResponseData> applicationDeploymentPersonGroupsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentPersonGroupsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentPersonGroups</code> method in a fluent style.
   */
  public static class ApplicationDeploymentPersonGroupsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentPersonsResponseData applicationDeploymentPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>applicationDeploymentPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentPersonsResponseData> applicationDeploymentPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentPersonsResponseData applicationDeploymentPersons(@Param("elid") String elid, ApplicationDeploymentPersonsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentPersonsResponseData> applicationDeploymentPersonsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentPersonsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentPersons</code> method in a fluent style.
   */
  public static class ApplicationDeploymentPersonsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ApplicationDeploymentQueryResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentQueryResponse applicationDeploymentQuery(@Param("sessionId") String sessionId, ApplicationDeploymentQueryRequest body);

  /**
   * Basic query
   * Similar to <code>applicationDeploymentQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentQueryResponse> applicationDeploymentQueryWithHttpInfo(@Param("sessionId") String sessionId, ApplicationDeploymentQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>applicationDeploymentQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentQueryResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentQueryResponse applicationDeploymentQuery(ApplicationDeploymentQueryRequest body, @QueryMap(encoded=true) ApplicationDeploymentQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>applicationDeploymentQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentQueryResponse
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentQueryResponse> applicationDeploymentQueryWithHttpInfo(ApplicationDeploymentQueryRequest body, @QueryMap(encoded=true) ApplicationDeploymentQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentQuery</code> method in a fluent style.
   */
  public static class ApplicationDeploymentQueryQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstallationsResponseData applicationDeploymentSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>applicationDeploymentSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstallationsResponseData> applicationDeploymentSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstallationsResponseData applicationDeploymentSoftwareInstallations(@Param("elid") String elid, ApplicationDeploymentSoftwareInstallationsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstallationsResponseData> applicationDeploymentSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstallationsRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstallations</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstallationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesResponseData applicationDeploymentSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>applicationDeploymentSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstancesResponseData> applicationDeploymentSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesResponseData applicationDeploymentSoftwareInstances(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstancesResponseData> applicationDeploymentSoftwareInstancesWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstances</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstancesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesMssqldbResponseData applicationDeploymentSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>applicationDeploymentSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstancesMssqldbResponseData> applicationDeploymentSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesMssqldbResponseData applicationDeploymentSoftwareInstancesMssqldb(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstancesMssqldbResponseData> applicationDeploymentSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesOracledbResponseData applicationDeploymentSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>applicationDeploymentSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstancesOracledbResponseData> applicationDeploymentSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesOracledbResponseData applicationDeploymentSoftwareInstancesOracledb(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstancesOracledbResponseData> applicationDeploymentSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstancesOracledbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance SAP entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesSapResponseData applicationDeploymentSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>applicationDeploymentSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstancesSapResponseData> applicationDeploymentSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesSapResponseData applicationDeploymentSoftwareInstancesSap(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstancesSapResponseData> applicationDeploymentSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstancesSapQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Web entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesWebResponseData applicationDeploymentSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>applicationDeploymentSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstancesWebResponseData> applicationDeploymentSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesWebResponseData applicationDeploymentSoftwareInstancesWeb(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstancesWebResponseData> applicationDeploymentSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstancesWebQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Windows service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData applicationDeploymentSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>applicationDeploymentSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData> applicationDeploymentSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData applicationDeploymentSoftwareInstancesWindowsservice(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>applicationDeploymentSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSoftwareInstancesWindowsserviceResponseData> applicationDeploymentSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) ApplicationDeploymentSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
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
   * @return ApplicationDeploymentSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApplicationDeploymentSystemAttributesResponse applicationDeploymentSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>applicationDeploymentSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ApplicationDeploymentSystemAttributesResponse> applicationDeploymentSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ApplicationDeploymentSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>applicationDeploymentSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ApplicationDeploymentSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ApplicationDeploymentSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ApplicationDeploymentSystemAttributesResponse applicationDeploymentSystemAttributes(@Param("elid") String elid, ApplicationDeploymentSystemAttributesRequest body, @QueryMap(encoded=true) ApplicationDeploymentSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>applicationDeploymentSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ApplicationDeploymentSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ApplicationDeploymentSystemAttributesResponse> applicationDeploymentSystemAttributesWithHttpInfo(@Param("elid") String elid, ApplicationDeploymentSystemAttributesRequest body, @QueryMap(encoded=true) ApplicationDeploymentSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>applicationDeploymentSystemAttributes</code> method in a fluent style.
   */
  public static class ApplicationDeploymentSystemAttributesQueryParams extends HashMap<String, Object> {
    public ApplicationDeploymentSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create application
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateApplicationDeploymentResponse createApplicationDeployment(@Param("sessionId") String sessionId, CreateApplicationDeploymentRequestData body);

  /**
   * Create
   * Similar to <code>createApplicationDeployment</code> but it also returns the http response headers .
   * Create application
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateApplicationDeploymentResponse> createApplicationDeploymentWithHttpInfo(@Param("sessionId") String sessionId, CreateApplicationDeploymentRequestData body);


  /**
   * Create
   * Create application
   * Note, this is equivalent to the other <code>createApplicationDeployment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateApplicationDeploymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateApplicationDeploymentResponse createApplicationDeployment(CreateApplicationDeploymentRequestData body, @QueryMap(encoded=true) CreateApplicationDeploymentQueryParams queryParams);

  /**
  * Create
  * Create application
  * Note, this is equivalent to the other <code>createApplicationDeployment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateApplicationDeploymentResponse
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateApplicationDeploymentResponse> createApplicationDeploymentWithHttpInfo(CreateApplicationDeploymentRequestData body, @QueryMap(encoded=true) CreateApplicationDeploymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createApplicationDeployment</code> method in a fluent style.
   */
  public static class CreateApplicationDeploymentQueryParams extends HashMap<String, Object> {
    public CreateApplicationDeploymentQueryParams sessionId(final String value) {
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
   * @return DeleteApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteApplicationDeploymentResponse deleteApplicationDeployment(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteApplicationDeploymentRequestData body);

  /**
   * Delete
   * Similar to <code>deleteApplicationDeployment</code> but it also returns the http response headers .
   * Delete application
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteApplicationDeploymentResponse> deleteApplicationDeploymentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteApplicationDeploymentRequestData body);


  /**
   * Delete
   * Delete application
   * Note, this is equivalent to the other <code>deleteApplicationDeployment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteApplicationDeploymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteApplicationDeploymentResponse deleteApplicationDeployment(@Param("elid") String elid, DeleteApplicationDeploymentRequestData body, @QueryMap(encoded=true) DeleteApplicationDeploymentQueryParams queryParams);

  /**
  * Delete
  * Delete application
  * Note, this is equivalent to the other <code>deleteApplicationDeployment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteApplicationDeploymentResponse
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteApplicationDeploymentResponse> deleteApplicationDeploymentWithHttpInfo(@Param("elid") String elid, DeleteApplicationDeploymentRequestData body, @QueryMap(encoded=true) DeleteApplicationDeploymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteApplicationDeployment</code> method in a fluent style.
   */
  public static class DeleteApplicationDeploymentQueryParams extends HashMap<String, Object> {
    public DeleteApplicationDeploymentQueryParams sessionId(final String value) {
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
   * @return UpdateApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateApplicationDeploymentResponse updateApplicationDeployment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateApplicationDeploymentRequestData body);

  /**
   * Modify
   * Similar to <code>updateApplicationDeployment</code> but it also returns the http response headers .
   * Modify application
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateApplicationDeploymentResponse> updateApplicationDeploymentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateApplicationDeploymentRequestData body);


  /**
   * Modify
   * Modify application
   * Note, this is equivalent to the other <code>updateApplicationDeployment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateApplicationDeploymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateApplicationDeploymentResponse updateApplicationDeployment(@Param("elid") String elid, UpdateApplicationDeploymentRequestData body, @QueryMap(encoded=true) UpdateApplicationDeploymentQueryParams queryParams);

  /**
  * Modify
  * Modify application
  * Note, this is equivalent to the other <code>updateApplicationDeployment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateApplicationDeploymentResponse
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateApplicationDeploymentResponse> updateApplicationDeploymentWithHttpInfo(@Param("elid") String elid, UpdateApplicationDeploymentRequestData body, @QueryMap(encoded=true) UpdateApplicationDeploymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateApplicationDeployment</code> method in a fluent style.
   */
  public static class UpdateApplicationDeploymentQueryParams extends HashMap<String, Object> {
    public UpdateApplicationDeploymentQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesApplicationDeploymentResponse updateSystemAttributesApplicationDeployment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesApplicationDeploymentRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesApplicationDeployment</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesApplicationDeploymentResponse> updateSystemAttributesApplicationDeploymentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesApplicationDeploymentRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesApplicationDeployment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesApplicationDeploymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesApplicationDeploymentResponse
   */
  @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesApplicationDeploymentResponse updateSystemAttributesApplicationDeployment(@Param("elid") String elid, UpdateSystemAttributesApplicationDeploymentRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesApplicationDeploymentQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesApplicationDeployment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesApplicationDeploymentResponse
      */
      @RequestLine("POST /api/rest/entity/applicationDeployment/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesApplicationDeploymentResponse> updateSystemAttributesApplicationDeploymentWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesApplicationDeploymentRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesApplicationDeploymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesApplicationDeployment</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesApplicationDeploymentQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesApplicationDeploymentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
