package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.CreateOrganizationResponse;
import com.fntsoftware.businessgateway.entities.DeleteOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.DeleteOrganizationResponse;
import com.fntsoftware.businessgateway.entities.Organization100026RequestData;
import com.fntsoftware.businessgateway.entities.Organization100026ResponseData;
import com.fntsoftware.businessgateway.entities.Organization100027RequestData;
import com.fntsoftware.businessgateway.entities.Organization100027ResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationApplicationDeploymentRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationApplicationDeploymentResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationApplicationReleaseResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.OrganizationAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.OrganizationBearersRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationBearersResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCampusesRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCampusesResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationChassisRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationChassisResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationContractsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationContractsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomBgpnbv4RequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomBgpnbv4ResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomBgpnbv6RequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomBgpnbv6ResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomIpaccessSvcsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomIpaccessSvcsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomKeyringsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomKeyringsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomKeysRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomKeysResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationFloorsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationFloorsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationPersonsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationPersonsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationQueryRequest;
import com.fntsoftware.businessgateway.entities.OrganizationQueryResponse;
import com.fntsoftware.businessgateway.entities.OrganizationRoomsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationRoomsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationServersRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationServersResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareLicenseRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareLicenseResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationSoftwareProductResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.OrganizationSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.OrganizationTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.OrganizationVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.OrganizationVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsOrganizationResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyOrganizationResponse;
import com.fntsoftware.businessgateway.entities.UpdateOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateOrganizationResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOrganizationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOrganizationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface OrganizationApi extends ApiClient.Api {


  /**
   * Create
   * Create organization
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateOrganizationResponse createOrganization(@Param("sessionId") String sessionId, CreateOrganizationRequestData body);

  /**
   * Create
   * Similar to <code>createOrganization</code> but it also returns the http response headers .
   * Create organization
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateOrganizationResponse> createOrganizationWithHttpInfo(@Param("sessionId") String sessionId, CreateOrganizationRequestData body);


  /**
   * Create
   * Create organization
   * Note, this is equivalent to the other <code>createOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateOrganizationResponse createOrganization(CreateOrganizationRequestData body, @QueryMap(encoded=true) CreateOrganizationQueryParams queryParams);

  /**
  * Create
  * Create organization
  * Note, this is equivalent to the other <code>createOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateOrganizationResponse
      */
      @RequestLine("POST /api/rest/entity/organization/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateOrganizationResponse> createOrganizationWithHttpInfo(CreateOrganizationRequestData body, @QueryMap(encoded=true) CreateOrganizationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createOrganization</code> method in a fluent style.
   */
  public static class CreateOrganizationQueryParams extends HashMap<String, Object> {
    public CreateOrganizationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete organization
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteOrganizationResponse deleteOrganization(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOrganizationRequestData body);

  /**
   * Delete
   * Similar to <code>deleteOrganization</code> but it also returns the http response headers .
   * Delete organization
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteOrganizationResponse> deleteOrganizationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOrganizationRequestData body);


  /**
   * Delete
   * Delete organization
   * Note, this is equivalent to the other <code>deleteOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteOrganizationResponse deleteOrganization(@Param("elid") String elid, DeleteOrganizationRequestData body, @QueryMap(encoded=true) DeleteOrganizationQueryParams queryParams);

  /**
  * Delete
  * Delete organization
  * Note, this is equivalent to the other <code>deleteOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteOrganizationResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteOrganizationResponse> deleteOrganizationWithHttpInfo(@Param("elid") String elid, DeleteOrganizationRequestData body, @QueryMap(encoded=true) DeleteOrganizationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOrganization</code> method in a fluent style.
   */
  public static class DeleteOrganizationQueryParams extends HashMap<String, Object> {
    public DeleteOrganizationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual Datacenter entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Organization100026ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/100026?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Organization100026ResponseData organization100026(@Param("sessionId") String sessionId, @Param("elid") String elid, Organization100026RequestData body);

  /**
   * Get relations to Virtual Datacenter entities
   * Similar to <code>organization100026</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/100026?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Organization100026ResponseData> organization100026WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Organization100026RequestData body);


  /**
   * Get relations to Virtual Datacenter entities
   * 
   * Note, this is equivalent to the other <code>organization100026</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Organization100026QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Organization100026ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/100026?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Organization100026ResponseData organization100026(@Param("elid") String elid, Organization100026RequestData body, @QueryMap(encoded=true) Organization100026QueryParams queryParams);

  /**
  * Get relations to Virtual Datacenter entities
  * 
  * Note, this is equivalent to the other <code>organization100026</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Organization100026ResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/100026?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Organization100026ResponseData> organization100026WithHttpInfo(@Param("elid") String elid, Organization100026RequestData body, @QueryMap(encoded=true) Organization100026QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organization100026</code> method in a fluent style.
   */
  public static class Organization100026QueryParams extends HashMap<String, Object> {
    public Organization100026QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage product entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Organization100027ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/100027?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Organization100027ResponseData organization100027(@Param("sessionId") String sessionId, @Param("elid") String elid, Organization100027RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>organization100027</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/100027?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Organization100027ResponseData> organization100027WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Organization100027RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>organization100027</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Organization100027QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Organization100027ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/100027?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Organization100027ResponseData organization100027(@Param("elid") String elid, Organization100027RequestData body, @QueryMap(encoded=true) Organization100027QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>organization100027</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Organization100027ResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/100027?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Organization100027ResponseData> organization100027WithHttpInfo(@Param("elid") String elid, Organization100027RequestData body, @QueryMap(encoded=true) Organization100027QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organization100027</code> method in a fluent style.
   */
  public static class Organization100027QueryParams extends HashMap<String, Object> {
    public Organization100027QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Application Deployment entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationApplicationDeploymentResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationDeployment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationApplicationDeploymentResponseData organizationApplicationDeployment(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationApplicationDeploymentRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>organizationApplicationDeployment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationDeployment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationApplicationDeploymentResponseData> organizationApplicationDeploymentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationApplicationDeploymentRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>organizationApplicationDeployment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationApplicationDeploymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationApplicationDeploymentResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationDeployment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationApplicationDeploymentResponseData organizationApplicationDeployment(@Param("elid") String elid, OrganizationApplicationDeploymentRequestData body, @QueryMap(encoded=true) OrganizationApplicationDeploymentQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>organizationApplicationDeployment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationApplicationDeploymentResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationDeployment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationApplicationDeploymentResponseData> organizationApplicationDeploymentWithHttpInfo(@Param("elid") String elid, OrganizationApplicationDeploymentRequestData body, @QueryMap(encoded=true) OrganizationApplicationDeploymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationApplicationDeployment</code> method in a fluent style.
   */
  public static class OrganizationApplicationDeploymentQueryParams extends HashMap<String, Object> {
    public OrganizationApplicationDeploymentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Application Release entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationApplicationReleaseResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationApplicationReleaseResponseData organizationApplicationRelease(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationApplicationReleaseRequestData body);

  /**
   * Get relations to Application Release entities
   * Similar to <code>organizationApplicationRelease</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationApplicationReleaseResponseData> organizationApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationApplicationReleaseRequestData body);


  /**
   * Get relations to Application Release entities
   * 
   * Note, this is equivalent to the other <code>organizationApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationApplicationReleaseResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationApplicationReleaseResponseData organizationApplicationRelease(@Param("elid") String elid, OrganizationApplicationReleaseRequestData body, @QueryMap(encoded=true) OrganizationApplicationReleaseQueryParams queryParams);

  /**
  * Get relations to Application Release entities
  * 
  * Note, this is equivalent to the other <code>organizationApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationApplicationReleaseResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/ApplicationRelease?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationApplicationReleaseResponseData> organizationApplicationReleaseWithHttpInfo(@Param("elid") String elid, OrganizationApplicationReleaseRequestData body, @QueryMap(encoded=true) OrganizationApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationApplicationRelease</code> method in a fluent style.
   */
  public static class OrganizationApplicationReleaseQueryParams extends HashMap<String, Object> {
    public OrganizationApplicationReleaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Assignments
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationAssignmentsResponse organizationAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>organizationAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationAssignmentsResponse> organizationAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>organizationAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationAssignmentsResponse organizationAssignments(@Param("elid") String elid, OrganizationAssignmentsRequest body, @QueryMap(encoded=true) OrganizationAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>organizationAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationAssignmentsResponse> organizationAssignmentsWithHttpInfo(@Param("elid") String elid, OrganizationAssignmentsRequest body, @QueryMap(encoded=true) OrganizationAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationAssignments</code> method in a fluent style.
   */
  public static class OrganizationAssignmentsQueryParams extends HashMap<String, Object> {
    public OrganizationAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Bearer entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationBearersResponseData organizationBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>organizationBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationBearersResponseData> organizationBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>organizationBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationBearersResponseData organizationBearers(@Param("elid") String elid, OrganizationBearersRequestData body, @QueryMap(encoded=true) OrganizationBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>organizationBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationBearersResponseData> organizationBearersWithHttpInfo(@Param("elid") String elid, OrganizationBearersRequestData body, @QueryMap(encoded=true) OrganizationBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationBearers</code> method in a fluent style.
   */
  public static class OrganizationBearersQueryParams extends HashMap<String, Object> {
    public OrganizationBearersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Building entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationBuildingsResponseData organizationBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>organizationBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationBuildingsResponseData> organizationBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>organizationBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationBuildingsResponseData organizationBuildings(@Param("elid") String elid, OrganizationBuildingsRequestData body, @QueryMap(encoded=true) OrganizationBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>organizationBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationBuildingsResponseData> organizationBuildingsWithHttpInfo(@Param("elid") String elid, OrganizationBuildingsRequestData body, @QueryMap(encoded=true) OrganizationBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationBuildings</code> method in a fluent style.
   */
  public static class OrganizationBuildingsQueryParams extends HashMap<String, Object> {
    public OrganizationBuildingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Campus entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCampusesResponseData organizationCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>organizationCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCampusesResponseData> organizationCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>organizationCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCampusesResponseData organizationCampuses(@Param("elid") String elid, OrganizationCampusesRequestData body, @QueryMap(encoded=true) OrganizationCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>organizationCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCampusesResponseData> organizationCampusesWithHttpInfo(@Param("elid") String elid, OrganizationCampusesRequestData body, @QueryMap(encoded=true) OrganizationCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCampuses</code> method in a fluent style.
   */
  public static class OrganizationCampusesQueryParams extends HashMap<String, Object> {
    public OrganizationCampusesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Chassis entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationChassisResponseData organizationChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>organizationChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationChassisResponseData> organizationChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>organizationChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationChassisResponseData organizationChassis(@Param("elid") String elid, OrganizationChassisRequestData body, @QueryMap(encoded=true) OrganizationChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>organizationChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationChassisResponseData> organizationChassisWithHttpInfo(@Param("elid") String elid, OrganizationChassisRequestData body, @QueryMap(encoded=true) OrganizationChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationChassis</code> method in a fluent style.
   */
  public static class OrganizationChassisQueryParams extends HashMap<String, Object> {
    public OrganizationChassisQueryParams sessionId(final String value) {
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
   * @return OrganizationContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationContractsResponseData organizationContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>organizationContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationContractsResponseData> organizationContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>organizationContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationContractsResponseData organizationContracts(@Param("elid") String elid, OrganizationContractsRequestData body, @QueryMap(encoded=true) OrganizationContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>organizationContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationContractsResponseData> organizationContractsWithHttpInfo(@Param("elid") String elid, OrganizationContractsRequestData body, @QueryMap(encoded=true) OrganizationContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationContracts</code> method in a fluent style.
   */
  public static class OrganizationContractsQueryParams extends HashMap<String, Object> {
    public OrganizationContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to BGP-Peerings IPv4 entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationCustomBgpnbv4ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv4?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCustomBgpnbv4ResponseData organizationCustomBgpnbv4(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomBgpnbv4RequestData body);

  /**
   * Get relations to BGP-Peerings IPv4 entities
   * Similar to <code>organizationCustomBgpnbv4</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv4?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCustomBgpnbv4ResponseData> organizationCustomBgpnbv4WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomBgpnbv4RequestData body);


  /**
   * Get relations to BGP-Peerings IPv4 entities
   * 
   * Note, this is equivalent to the other <code>organizationCustomBgpnbv4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCustomBgpnbv4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCustomBgpnbv4ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv4?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCustomBgpnbv4ResponseData organizationCustomBgpnbv4(@Param("elid") String elid, OrganizationCustomBgpnbv4RequestData body, @QueryMap(encoded=true) OrganizationCustomBgpnbv4QueryParams queryParams);

  /**
  * Get relations to BGP-Peerings IPv4 entities
  * 
  * Note, this is equivalent to the other <code>organizationCustomBgpnbv4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCustomBgpnbv4ResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv4?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCustomBgpnbv4ResponseData> organizationCustomBgpnbv4WithHttpInfo(@Param("elid") String elid, OrganizationCustomBgpnbv4RequestData body, @QueryMap(encoded=true) OrganizationCustomBgpnbv4QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCustomBgpnbv4</code> method in a fluent style.
   */
  public static class OrganizationCustomBgpnbv4QueryParams extends HashMap<String, Object> {
    public OrganizationCustomBgpnbv4QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to BGP-Peering IPv6 entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationCustomBgpnbv6ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv6?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCustomBgpnbv6ResponseData organizationCustomBgpnbv6(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomBgpnbv6RequestData body);

  /**
   * Get relations to BGP-Peering IPv6 entities
   * Similar to <code>organizationCustomBgpnbv6</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv6?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCustomBgpnbv6ResponseData> organizationCustomBgpnbv6WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomBgpnbv6RequestData body);


  /**
   * Get relations to BGP-Peering IPv6 entities
   * 
   * Note, this is equivalent to the other <code>organizationCustomBgpnbv6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCustomBgpnbv6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCustomBgpnbv6ResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv6?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCustomBgpnbv6ResponseData organizationCustomBgpnbv6(@Param("elid") String elid, OrganizationCustomBgpnbv6RequestData body, @QueryMap(encoded=true) OrganizationCustomBgpnbv6QueryParams queryParams);

  /**
  * Get relations to BGP-Peering IPv6 entities
  * 
  * Note, this is equivalent to the other <code>organizationCustomBgpnbv6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCustomBgpnbv6ResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/CustomBgpnbv6?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCustomBgpnbv6ResponseData> organizationCustomBgpnbv6WithHttpInfo(@Param("elid") String elid, OrganizationCustomBgpnbv6RequestData body, @QueryMap(encoded=true) OrganizationCustomBgpnbv6QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCustomBgpnbv6</code> method in a fluent style.
   */
  public static class OrganizationCustomBgpnbv6QueryParams extends HashMap<String, Object> {
    public OrganizationCustomBgpnbv6QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP-Access Services entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationCustomIpaccessSvcsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCustomIpaccessSvcsResponseData organizationCustomIpaccessSvcs(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomIpaccessSvcsRequestData body);

  /**
   * Get relations to IP-Access Services entities
   * Similar to <code>organizationCustomIpaccessSvcs</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCustomIpaccessSvcsResponseData> organizationCustomIpaccessSvcsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomIpaccessSvcsRequestData body);


  /**
   * Get relations to IP-Access Services entities
   * 
   * Note, this is equivalent to the other <code>organizationCustomIpaccessSvcs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCustomIpaccessSvcsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCustomIpaccessSvcsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCustomIpaccessSvcsResponseData organizationCustomIpaccessSvcs(@Param("elid") String elid, OrganizationCustomIpaccessSvcsRequestData body, @QueryMap(encoded=true) OrganizationCustomIpaccessSvcsQueryParams queryParams);

  /**
  * Get relations to IP-Access Services entities
  * 
  * Note, this is equivalent to the other <code>organizationCustomIpaccessSvcs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCustomIpaccessSvcsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCustomIpaccessSvcsResponseData> organizationCustomIpaccessSvcsWithHttpInfo(@Param("elid") String elid, OrganizationCustomIpaccessSvcsRequestData body, @QueryMap(encoded=true) OrganizationCustomIpaccessSvcsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCustomIpaccessSvcs</code> method in a fluent style.
   */
  public static class OrganizationCustomIpaccessSvcsQueryParams extends HashMap<String, Object> {
    public OrganizationCustomIpaccessSvcsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Keyrings entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationCustomKeyringsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeyrings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCustomKeyringsResponseData organizationCustomKeyrings(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomKeyringsRequestData body);

  /**
   * Get relations to Keyrings entities
   * Similar to <code>organizationCustomKeyrings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeyrings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCustomKeyringsResponseData> organizationCustomKeyringsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomKeyringsRequestData body);


  /**
   * Get relations to Keyrings entities
   * 
   * Note, this is equivalent to the other <code>organizationCustomKeyrings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCustomKeyringsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCustomKeyringsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeyrings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCustomKeyringsResponseData organizationCustomKeyrings(@Param("elid") String elid, OrganizationCustomKeyringsRequestData body, @QueryMap(encoded=true) OrganizationCustomKeyringsQueryParams queryParams);

  /**
  * Get relations to Keyrings entities
  * 
  * Note, this is equivalent to the other <code>organizationCustomKeyrings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCustomKeyringsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeyrings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCustomKeyringsResponseData> organizationCustomKeyringsWithHttpInfo(@Param("elid") String elid, OrganizationCustomKeyringsRequestData body, @QueryMap(encoded=true) OrganizationCustomKeyringsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCustomKeyrings</code> method in a fluent style.
   */
  public static class OrganizationCustomKeyringsQueryParams extends HashMap<String, Object> {
    public OrganizationCustomKeyringsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Key entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCustomKeysResponseData organizationCustomKeys(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomKeysRequestData body);

  /**
   * Get relations to Key entities
   * Similar to <code>organizationCustomKeys</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCustomKeysResponseData> organizationCustomKeysWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomKeysRequestData body);


  /**
   * Get relations to Key entities
   * 
   * Note, this is equivalent to the other <code>organizationCustomKeys</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCustomKeysQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCustomKeysResponseData organizationCustomKeys(@Param("elid") String elid, OrganizationCustomKeysRequestData body, @QueryMap(encoded=true) OrganizationCustomKeysQueryParams queryParams);

  /**
  * Get relations to Key entities
  * 
  * Note, this is equivalent to the other <code>organizationCustomKeys</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCustomKeysResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/CustomKeys?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCustomKeysResponseData> organizationCustomKeysWithHttpInfo(@Param("elid") String elid, OrganizationCustomKeysRequestData body, @QueryMap(encoded=true) OrganizationCustomKeysQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCustomKeys</code> method in a fluent style.
   */
  public static class OrganizationCustomKeysQueryParams extends HashMap<String, Object> {
    public OrganizationCustomKeysQueryParams sessionId(final String value) {
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
   * @return OrganizationCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationCustomTcoInterconnectResponseData organizationCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>organizationCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationCustomTcoInterconnectResponseData> organizationCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>organizationCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationCustomTcoInterconnectResponseData organizationCustomTcoInterconnect(@Param("elid") String elid, OrganizationCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) OrganizationCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>organizationCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationCustomTcoInterconnectResponseData> organizationCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, OrganizationCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) OrganizationCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class OrganizationCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public OrganizationCustomTcoInterconnectQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Floor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationFloorsResponseData organizationFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>organizationFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationFloorsResponseData> organizationFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>organizationFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationFloorsResponseData organizationFloors(@Param("elid") String elid, OrganizationFloorsRequestData body, @QueryMap(encoded=true) OrganizationFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>organizationFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationFloorsResponseData> organizationFloorsWithHttpInfo(@Param("elid") String elid, OrganizationFloorsRequestData body, @QueryMap(encoded=true) OrganizationFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationFloors</code> method in a fluent style.
   */
  public static class OrganizationFloorsQueryParams extends HashMap<String, Object> {
    public OrganizationFloorsQueryParams sessionId(final String value) {
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
   * @return OrganizationFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationFrameContractsResponseData organizationFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>organizationFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationFrameContractsResponseData> organizationFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>organizationFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationFrameContractsResponseData organizationFrameContracts(@Param("elid") String elid, OrganizationFrameContractsRequestData body, @QueryMap(encoded=true) OrganizationFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>organizationFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationFrameContractsResponseData> organizationFrameContractsWithHttpInfo(@Param("elid") String elid, OrganizationFrameContractsRequestData body, @QueryMap(encoded=true) OrganizationFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationFrameContracts</code> method in a fluent style.
   */
  public static class OrganizationFrameContractsQueryParams extends HashMap<String, Object> {
    public OrganizationFrameContractsQueryParams sessionId(final String value) {
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
   * @return OrganizationMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationMaintenanceContractsResponseData organizationMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>organizationMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationMaintenanceContractsResponseData> organizationMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>organizationMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationMaintenanceContractsResponseData organizationMaintenanceContracts(@Param("elid") String elid, OrganizationMaintenanceContractsRequestData body, @QueryMap(encoded=true) OrganizationMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>organizationMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationMaintenanceContractsResponseData> organizationMaintenanceContractsWithHttpInfo(@Param("elid") String elid, OrganizationMaintenanceContractsRequestData body, @QueryMap(encoded=true) OrganizationMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationMaintenanceContracts</code> method in a fluent style.
   */
  public static class OrganizationMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public OrganizationMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return OrganizationPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationPersonGroupsResponseData organizationPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>organizationPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationPersonGroupsResponseData> organizationPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>organizationPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationPersonGroupsResponseData organizationPersonGroups(@Param("elid") String elid, OrganizationPersonGroupsRequestData body, @QueryMap(encoded=true) OrganizationPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>organizationPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationPersonGroupsResponseData> organizationPersonGroupsWithHttpInfo(@Param("elid") String elid, OrganizationPersonGroupsRequestData body, @QueryMap(encoded=true) OrganizationPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationPersonGroups</code> method in a fluent style.
   */
  public static class OrganizationPersonGroupsQueryParams extends HashMap<String, Object> {
    public OrganizationPersonGroupsQueryParams sessionId(final String value) {
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
   * @return OrganizationPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationPersonsResponseData organizationPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>organizationPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationPersonsResponseData> organizationPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>organizationPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationPersonsResponseData organizationPersons(@Param("elid") String elid, OrganizationPersonsRequestData body, @QueryMap(encoded=true) OrganizationPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>organizationPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationPersonsResponseData> organizationPersonsWithHttpInfo(@Param("elid") String elid, OrganizationPersonsRequestData body, @QueryMap(encoded=true) OrganizationPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationPersons</code> method in a fluent style.
   */
  public static class OrganizationPersonsQueryParams extends HashMap<String, Object> {
    public OrganizationPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return OrganizationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/organization/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationQueryResponse organizationQuery(@Param("sessionId") String sessionId, OrganizationQueryRequest body);

  /**
   * Basic query
   * Similar to <code>organizationQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationQueryResponse> organizationQueryWithHttpInfo(@Param("sessionId") String sessionId, OrganizationQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>organizationQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/organization/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationQueryResponse organizationQuery(OrganizationQueryRequest body, @QueryMap(encoded=true) OrganizationQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>organizationQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationQueryResponse
      */
      @RequestLine("POST /api/rest/entity/organization/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationQueryResponse> organizationQueryWithHttpInfo(OrganizationQueryRequest body, @QueryMap(encoded=true) OrganizationQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationQuery</code> method in a fluent style.
   */
  public static class OrganizationQueryQueryParams extends HashMap<String, Object> {
    public OrganizationQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Room entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationRoomsResponseData organizationRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>organizationRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationRoomsResponseData> organizationRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>organizationRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationRoomsResponseData organizationRooms(@Param("elid") String elid, OrganizationRoomsRequestData body, @QueryMap(encoded=true) OrganizationRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>organizationRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationRoomsResponseData> organizationRoomsWithHttpInfo(@Param("elid") String elid, OrganizationRoomsRequestData body, @QueryMap(encoded=true) OrganizationRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationRooms</code> method in a fluent style.
   */
  public static class OrganizationRoomsQueryParams extends HashMap<String, Object> {
    public OrganizationRoomsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationServersResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationServersResponseData organizationServers(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>organizationServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationServersResponseData> organizationServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>organizationServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationServersResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationServersResponseData organizationServers(@Param("elid") String elid, OrganizationServersRequestData body, @QueryMap(encoded=true) OrganizationServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>organizationServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationServersResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationServersResponseData> organizationServersWithHttpInfo(@Param("elid") String elid, OrganizationServersRequestData body, @QueryMap(encoded=true) OrganizationServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationServers</code> method in a fluent style.
   */
  public static class OrganizationServersQueryParams extends HashMap<String, Object> {
    public OrganizationServersQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstallationResponseData organizationSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>organizationSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstallationResponseData> organizationSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstallationResponseData organizationSoftwareInstallation(@Param("elid") String elid, OrganizationSoftwareInstallationRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstallationResponseData> organizationSoftwareInstallationWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstallationRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstallation</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstancesResponseData organizationSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>organizationSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstancesResponseData> organizationSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstancesResponseData organizationSoftwareInstances(@Param("elid") String elid, OrganizationSoftwareInstancesRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstancesResponseData> organizationSoftwareInstancesWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstancesRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstances</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstancesQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstancesMssqldbResponseData organizationSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>organizationSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstancesMssqldbResponseData> organizationSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstancesMssqldbResponseData organizationSoftwareInstancesMssqldb(@Param("elid") String elid, OrganizationSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstancesMssqldbResponseData> organizationSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstancesOracledbResponseData organizationSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>organizationSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstancesOracledbResponseData> organizationSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstancesOracledbResponseData organizationSoftwareInstancesOracledb(@Param("elid") String elid, OrganizationSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstancesOracledbResponseData> organizationSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstancesOracledbQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstancesSapResponseData organizationSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>organizationSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstancesSapResponseData> organizationSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstancesSapResponseData organizationSoftwareInstancesSap(@Param("elid") String elid, OrganizationSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstancesSapResponseData> organizationSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstancesSapQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstancesWebResponseData organizationSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>organizationSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstancesWebResponseData> organizationSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstancesWebResponseData organizationSoftwareInstancesWeb(@Param("elid") String elid, OrganizationSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstancesWebResponseData> organizationSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstancesWebQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareInstancesWindowsserviceResponseData organizationSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>organizationSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareInstancesWindowsserviceResponseData> organizationSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareInstancesWindowsserviceResponseData organizationSoftwareInstancesWindowsservice(@Param("elid") String elid, OrganizationSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareInstancesWindowsserviceResponseData> organizationSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) OrganizationSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class OrganizationSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software license entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationSoftwareLicenseResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareLicense?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareLicenseResponseData organizationSoftwareLicense(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareLicenseRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>organizationSoftwareLicense</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareLicense?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareLicenseResponseData> organizationSoftwareLicenseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareLicenseRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareLicense</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareLicenseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareLicenseResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareLicense?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareLicenseResponseData organizationSoftwareLicense(@Param("elid") String elid, OrganizationSoftwareLicenseRequestData body, @QueryMap(encoded=true) OrganizationSoftwareLicenseQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareLicense</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareLicenseResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareLicense?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareLicenseResponseData> organizationSoftwareLicenseWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareLicenseRequestData body, @QueryMap(encoded=true) OrganizationSoftwareLicenseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareLicense</code> method in a fluent style.
   */
  public static class OrganizationSoftwareLicenseQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareLicenseQueryParams sessionId(final String value) {
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
   * @return OrganizationSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSoftwareProductResponseData organizationSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareProductRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>organizationSoftwareProduct</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSoftwareProductResponseData> organizationSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSoftwareProductRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>organizationSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSoftwareProductResponseData organizationSoftwareProduct(@Param("elid") String elid, OrganizationSoftwareProductRequestData body, @QueryMap(encoded=true) OrganizationSoftwareProductQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>organizationSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSoftwareProductResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SoftwareProduct?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSoftwareProductResponseData> organizationSoftwareProductWithHttpInfo(@Param("elid") String elid, OrganizationSoftwareProductRequestData body, @QueryMap(encoded=true) OrganizationSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSoftwareProduct</code> method in a fluent style.
   */
  public static class OrganizationSoftwareProductQueryParams extends HashMap<String, Object> {
    public OrganizationSoftwareProductQueryParams sessionId(final String value) {
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
   * @return OrganizationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationSystemAttributesResponse organizationSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>organizationSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationSystemAttributesResponse> organizationSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>organizationSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationSystemAttributesResponse organizationSystemAttributes(@Param("elid") String elid, OrganizationSystemAttributesRequest body, @QueryMap(encoded=true) OrganizationSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>organizationSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationSystemAttributesResponse> organizationSystemAttributesWithHttpInfo(@Param("elid") String elid, OrganizationSystemAttributesRequest body, @QueryMap(encoded=true) OrganizationSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationSystemAttributes</code> method in a fluent style.
   */
  public static class OrganizationSystemAttributesQueryParams extends HashMap<String, Object> {
    public OrganizationSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Terminal entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationTerminalsResponseData organizationTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>organizationTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationTerminalsResponseData> organizationTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>organizationTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationTerminalsResponseData organizationTerminals(@Param("elid") String elid, OrganizationTerminalsRequestData body, @QueryMap(encoded=true) OrganizationTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>organizationTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationTerminalsResponseData> organizationTerminalsWithHttpInfo(@Param("elid") String elid, OrganizationTerminalsRequestData body, @QueryMap(encoded=true) OrganizationTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationTerminals</code> method in a fluent style.
   */
  public static class OrganizationTerminalsQueryParams extends HashMap<String, Object> {
    public OrganizationTerminalsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Topzone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationTopzonesResponseData organizationTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>organizationTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationTopzonesResponseData> organizationTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>organizationTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationTopzonesResponseData organizationTopzones(@Param("elid") String elid, OrganizationTopzonesRequestData body, @QueryMap(encoded=true) OrganizationTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>organizationTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationTopzonesResponseData> organizationTopzonesWithHttpInfo(@Param("elid") String elid, OrganizationTopzonesRequestData body, @QueryMap(encoded=true) OrganizationTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationTopzones</code> method in a fluent style.
   */
  public static class OrganizationTopzonesQueryParams extends HashMap<String, Object> {
    public OrganizationTopzonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OrganizationVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OrganizationVirtualServersResponseData organizationVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>organizationVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OrganizationVirtualServersResponseData> organizationVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OrganizationVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>organizationVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OrganizationVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OrganizationVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OrganizationVirtualServersResponseData organizationVirtualServers(@Param("elid") String elid, OrganizationVirtualServersRequestData body, @QueryMap(encoded=true) OrganizationVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>organizationVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OrganizationVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OrganizationVirtualServersResponseData> organizationVirtualServersWithHttpInfo(@Param("elid") String elid, OrganizationVirtualServersRequestData body, @QueryMap(encoded=true) OrganizationVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>organizationVirtualServers</code> method in a fluent style.
   */
  public static class OrganizationVirtualServersQueryParams extends HashMap<String, Object> {
    public OrganizationVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign all assignments
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAllAssignmentsOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsOrganizationResponse reassignAllAssignmentsOrganization(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsOrganizationRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsOrganization</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsOrganizationResponse> reassignAllAssignmentsOrganizationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsOrganizationRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsOrganizationResponse reassignAllAssignmentsOrganization(@Param("elid") String elid, ReassignAllAssignmentsOrganizationRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsOrganizationQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsOrganizationResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsOrganizationResponse> reassignAllAssignmentsOrganizationWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsOrganizationRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsOrganizationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsOrganization</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsOrganizationQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsOrganizationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAssignmentsPartiallyOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyOrganizationResponse reassignAssignmentsPartiallyOrganization(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyOrganizationRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyOrganization</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyOrganizationResponse> reassignAssignmentsPartiallyOrganizationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyOrganizationRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyOrganizationResponse reassignAssignmentsPartiallyOrganization(@Param("elid") String elid, ReassignAssignmentsPartiallyOrganizationRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyOrganizationQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyOrganizationResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyOrganizationResponse> reassignAssignmentsPartiallyOrganizationWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyOrganizationRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyOrganizationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyOrganization</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyOrganizationQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyOrganizationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify organization
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateOrganizationResponse updateOrganization(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateOrganizationRequestData body);

  /**
   * Modify
   * Similar to <code>updateOrganization</code> but it also returns the http response headers .
   * Modify organization
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateOrganizationResponse> updateOrganizationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateOrganizationRequestData body);


  /**
   * Modify
   * Modify organization
   * Note, this is equivalent to the other <code>updateOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateOrganizationResponse updateOrganization(@Param("elid") String elid, UpdateOrganizationRequestData body, @QueryMap(encoded=true) UpdateOrganizationQueryParams queryParams);

  /**
  * Modify
  * Modify organization
  * Note, this is equivalent to the other <code>updateOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateOrganizationResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateOrganizationResponse> updateOrganizationWithHttpInfo(@Param("elid") String elid, UpdateOrganizationRequestData body, @QueryMap(encoded=true) UpdateOrganizationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateOrganization</code> method in a fluent style.
   */
  public static class UpdateOrganizationQueryParams extends HashMap<String, Object> {
    public UpdateOrganizationQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesOrganizationResponse updateSystemAttributesOrganization(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOrganizationRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesOrganization</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesOrganizationResponse> updateSystemAttributesOrganizationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOrganizationRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesOrganization</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesOrganizationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesOrganizationResponse
   */
  @RequestLine("POST /api/rest/entity/organization/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesOrganizationResponse updateSystemAttributesOrganization(@Param("elid") String elid, UpdateSystemAttributesOrganizationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOrganizationQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesOrganization</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesOrganizationResponse
      */
      @RequestLine("POST /api/rest/entity/organization/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesOrganizationResponse> updateSystemAttributesOrganizationWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesOrganizationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOrganizationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesOrganization</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesOrganizationQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesOrganizationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
