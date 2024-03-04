package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreatePersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreatePersonGroupResponse;
import com.fntsoftware.businessgateway.entities.DeletePersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.DeletePersonGroupResponse;
import com.fntsoftware.businessgateway.entities.PersonGroupApplicationDeploymentsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupApplicationDeploymentsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupApplicationReleasesRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupApplicationReleasesResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.PersonGroupAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.PersonGroupBearersRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupBearersResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupCampusesRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupCampusesResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupChassisRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupChassisResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupContractsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupContractsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupFloorsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupFloorsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupPersonsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupPersonsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupQueryRequest;
import com.fntsoftware.businessgateway.entities.PersonGroupQueryResponse;
import com.fntsoftware.businessgateway.entities.PersonGroupRoomsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupRoomsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupServersRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupServersResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareLicensesRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareLicensesResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareProductsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupSoftwareProductsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PersonGroupSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.PersonGroupTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.PersonGroupVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.PersonGroupVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsPersonGroupResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyPersonGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdatePersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePersonGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPersonGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPersonGroupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PersonGroupApi extends ApiClient.Api {


  /**
   * Create
   * Create person group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePersonGroupResponse createPersonGroup(@Param("sessionId") String sessionId, CreatePersonGroupRequestData body);

  /**
   * Create
   * Similar to <code>createPersonGroup</code> but it also returns the http response headers .
   * Create person group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePersonGroupResponse> createPersonGroupWithHttpInfo(@Param("sessionId") String sessionId, CreatePersonGroupRequestData body);


  /**
   * Create
   * Create person group
   * Note, this is equivalent to the other <code>createPersonGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePersonGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePersonGroupResponse createPersonGroup(CreatePersonGroupRequestData body, @QueryMap(encoded=true) CreatePersonGroupQueryParams queryParams);

  /**
  * Create
  * Create person group
  * Note, this is equivalent to the other <code>createPersonGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePersonGroupResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePersonGroupResponse> createPersonGroupWithHttpInfo(CreatePersonGroupRequestData body, @QueryMap(encoded=true) CreatePersonGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPersonGroup</code> method in a fluent style.
   */
  public static class CreatePersonGroupQueryParams extends HashMap<String, Object> {
    public CreatePersonGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete person group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePersonGroupResponse deletePersonGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePersonGroupRequestData body);

  /**
   * Delete
   * Similar to <code>deletePersonGroup</code> but it also returns the http response headers .
   * Delete person group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePersonGroupResponse> deletePersonGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePersonGroupRequestData body);


  /**
   * Delete
   * Delete person group
   * Note, this is equivalent to the other <code>deletePersonGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePersonGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePersonGroupResponse deletePersonGroup(@Param("elid") String elid, DeletePersonGroupRequestData body, @QueryMap(encoded=true) DeletePersonGroupQueryParams queryParams);

  /**
  * Delete
  * Delete person group
  * Note, this is equivalent to the other <code>deletePersonGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePersonGroupResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePersonGroupResponse> deletePersonGroupWithHttpInfo(@Param("elid") String elid, DeletePersonGroupRequestData body, @QueryMap(encoded=true) DeletePersonGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePersonGroup</code> method in a fluent style.
   */
  public static class DeletePersonGroupQueryParams extends HashMap<String, Object> {
    public DeletePersonGroupQueryParams sessionId(final String value) {
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
   * @return PersonGroupApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupApplicationDeploymentsResponseData personGroupApplicationDeployments(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupApplicationDeploymentsRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>personGroupApplicationDeployments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupApplicationDeploymentsResponseData> personGroupApplicationDeploymentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupApplicationDeploymentsRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>personGroupApplicationDeployments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupApplicationDeploymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupApplicationDeploymentsResponseData personGroupApplicationDeployments(@Param("elid") String elid, PersonGroupApplicationDeploymentsRequestData body, @QueryMap(encoded=true) PersonGroupApplicationDeploymentsQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>personGroupApplicationDeployments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupApplicationDeploymentsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationDeployments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupApplicationDeploymentsResponseData> personGroupApplicationDeploymentsWithHttpInfo(@Param("elid") String elid, PersonGroupApplicationDeploymentsRequestData body, @QueryMap(encoded=true) PersonGroupApplicationDeploymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupApplicationDeployments</code> method in a fluent style.
   */
  public static class PersonGroupApplicationDeploymentsQueryParams extends HashMap<String, Object> {
    public PersonGroupApplicationDeploymentsQueryParams sessionId(final String value) {
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
   * @return PersonGroupApplicationReleasesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupApplicationReleasesResponseData personGroupApplicationReleases(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupApplicationReleasesRequestData body);

  /**
   * Get relations to Application Release entities
   * Similar to <code>personGroupApplicationReleases</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupApplicationReleasesResponseData> personGroupApplicationReleasesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupApplicationReleasesRequestData body);


  /**
   * Get relations to Application Release entities
   * 
   * Note, this is equivalent to the other <code>personGroupApplicationReleases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupApplicationReleasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupApplicationReleasesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupApplicationReleasesResponseData personGroupApplicationReleases(@Param("elid") String elid, PersonGroupApplicationReleasesRequestData body, @QueryMap(encoded=true) PersonGroupApplicationReleasesQueryParams queryParams);

  /**
  * Get relations to Application Release entities
  * 
  * Note, this is equivalent to the other <code>personGroupApplicationReleases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupApplicationReleasesResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/ApplicationReleases?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupApplicationReleasesResponseData> personGroupApplicationReleasesWithHttpInfo(@Param("elid") String elid, PersonGroupApplicationReleasesRequestData body, @QueryMap(encoded=true) PersonGroupApplicationReleasesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupApplicationReleases</code> method in a fluent style.
   */
  public static class PersonGroupApplicationReleasesQueryParams extends HashMap<String, Object> {
    public PersonGroupApplicationReleasesQueryParams sessionId(final String value) {
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
   * @return PersonGroupAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupAssignmentsResponse personGroupAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>personGroupAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupAssignmentsResponse> personGroupAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>personGroupAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupAssignmentsResponse personGroupAssignments(@Param("elid") String elid, PersonGroupAssignmentsRequest body, @QueryMap(encoded=true) PersonGroupAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>personGroupAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupAssignmentsResponse> personGroupAssignmentsWithHttpInfo(@Param("elid") String elid, PersonGroupAssignmentsRequest body, @QueryMap(encoded=true) PersonGroupAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupAssignments</code> method in a fluent style.
   */
  public static class PersonGroupAssignmentsQueryParams extends HashMap<String, Object> {
    public PersonGroupAssignmentsQueryParams sessionId(final String value) {
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
   * @return PersonGroupBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupBearersResponseData personGroupBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>personGroupBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupBearersResponseData> personGroupBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>personGroupBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupBearersResponseData personGroupBearers(@Param("elid") String elid, PersonGroupBearersRequestData body, @QueryMap(encoded=true) PersonGroupBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>personGroupBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupBearersResponseData> personGroupBearersWithHttpInfo(@Param("elid") String elid, PersonGroupBearersRequestData body, @QueryMap(encoded=true) PersonGroupBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupBearers</code> method in a fluent style.
   */
  public static class PersonGroupBearersQueryParams extends HashMap<String, Object> {
    public PersonGroupBearersQueryParams sessionId(final String value) {
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
   * @return PersonGroupBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupBuildingsResponseData personGroupBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>personGroupBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupBuildingsResponseData> personGroupBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>personGroupBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupBuildingsResponseData personGroupBuildings(@Param("elid") String elid, PersonGroupBuildingsRequestData body, @QueryMap(encoded=true) PersonGroupBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>personGroupBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupBuildingsResponseData> personGroupBuildingsWithHttpInfo(@Param("elid") String elid, PersonGroupBuildingsRequestData body, @QueryMap(encoded=true) PersonGroupBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupBuildings</code> method in a fluent style.
   */
  public static class PersonGroupBuildingsQueryParams extends HashMap<String, Object> {
    public PersonGroupBuildingsQueryParams sessionId(final String value) {
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
   * @return PersonGroupCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupCampusesResponseData personGroupCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>personGroupCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupCampusesResponseData> personGroupCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>personGroupCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupCampusesResponseData personGroupCampuses(@Param("elid") String elid, PersonGroupCampusesRequestData body, @QueryMap(encoded=true) PersonGroupCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>personGroupCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupCampusesResponseData> personGroupCampusesWithHttpInfo(@Param("elid") String elid, PersonGroupCampusesRequestData body, @QueryMap(encoded=true) PersonGroupCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupCampuses</code> method in a fluent style.
   */
  public static class PersonGroupCampusesQueryParams extends HashMap<String, Object> {
    public PersonGroupCampusesQueryParams sessionId(final String value) {
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
   * @return PersonGroupChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupChassisResponseData personGroupChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>personGroupChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupChassisResponseData> personGroupChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>personGroupChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupChassisResponseData personGroupChassis(@Param("elid") String elid, PersonGroupChassisRequestData body, @QueryMap(encoded=true) PersonGroupChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>personGroupChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupChassisResponseData> personGroupChassisWithHttpInfo(@Param("elid") String elid, PersonGroupChassisRequestData body, @QueryMap(encoded=true) PersonGroupChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupChassis</code> method in a fluent style.
   */
  public static class PersonGroupChassisQueryParams extends HashMap<String, Object> {
    public PersonGroupChassisQueryParams sessionId(final String value) {
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
   * @return PersonGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupContractsResponseData personGroupContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>personGroupContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupContractsResponseData> personGroupContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>personGroupContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupContractsResponseData personGroupContracts(@Param("elid") String elid, PersonGroupContractsRequestData body, @QueryMap(encoded=true) PersonGroupContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>personGroupContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupContractsResponseData> personGroupContractsWithHttpInfo(@Param("elid") String elid, PersonGroupContractsRequestData body, @QueryMap(encoded=true) PersonGroupContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupContracts</code> method in a fluent style.
   */
  public static class PersonGroupContractsQueryParams extends HashMap<String, Object> {
    public PersonGroupContractsQueryParams sessionId(final String value) {
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
   * @return PersonGroupFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupFloorsResponseData personGroupFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>personGroupFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupFloorsResponseData> personGroupFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>personGroupFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupFloorsResponseData personGroupFloors(@Param("elid") String elid, PersonGroupFloorsRequestData body, @QueryMap(encoded=true) PersonGroupFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>personGroupFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupFloorsResponseData> personGroupFloorsWithHttpInfo(@Param("elid") String elid, PersonGroupFloorsRequestData body, @QueryMap(encoded=true) PersonGroupFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupFloors</code> method in a fluent style.
   */
  public static class PersonGroupFloorsQueryParams extends HashMap<String, Object> {
    public PersonGroupFloorsQueryParams sessionId(final String value) {
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
   * @return PersonGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupFrameContractsResponseData personGroupFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>personGroupFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupFrameContractsResponseData> personGroupFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>personGroupFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupFrameContractsResponseData personGroupFrameContracts(@Param("elid") String elid, PersonGroupFrameContractsRequestData body, @QueryMap(encoded=true) PersonGroupFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>personGroupFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupFrameContractsResponseData> personGroupFrameContractsWithHttpInfo(@Param("elid") String elid, PersonGroupFrameContractsRequestData body, @QueryMap(encoded=true) PersonGroupFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupFrameContracts</code> method in a fluent style.
   */
  public static class PersonGroupFrameContractsQueryParams extends HashMap<String, Object> {
    public PersonGroupFrameContractsQueryParams sessionId(final String value) {
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
   * @return PersonGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupMaintenanceContractsResponseData personGroupMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>personGroupMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupMaintenanceContractsResponseData> personGroupMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>personGroupMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupMaintenanceContractsResponseData personGroupMaintenanceContracts(@Param("elid") String elid, PersonGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) PersonGroupMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>personGroupMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupMaintenanceContractsResponseData> personGroupMaintenanceContractsWithHttpInfo(@Param("elid") String elid, PersonGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) PersonGroupMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupMaintenanceContracts</code> method in a fluent style.
   */
  public static class PersonGroupMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public PersonGroupMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return PersonGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupOrganizationsResponseData personGroupOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>personGroupOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupOrganizationsResponseData> personGroupOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>personGroupOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupOrganizationsResponseData personGroupOrganizations(@Param("elid") String elid, PersonGroupOrganizationsRequestData body, @QueryMap(encoded=true) PersonGroupOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>personGroupOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupOrganizationsResponseData> personGroupOrganizationsWithHttpInfo(@Param("elid") String elid, PersonGroupOrganizationsRequestData body, @QueryMap(encoded=true) PersonGroupOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupOrganizations</code> method in a fluent style.
   */
  public static class PersonGroupOrganizationsQueryParams extends HashMap<String, Object> {
    public PersonGroupOrganizationsQueryParams sessionId(final String value) {
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
   * @return PersonGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupPersonsResponseData personGroupPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>personGroupPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupPersonsResponseData> personGroupPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>personGroupPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupPersonsResponseData personGroupPersons(@Param("elid") String elid, PersonGroupPersonsRequestData body, @QueryMap(encoded=true) PersonGroupPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>personGroupPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupPersonsResponseData> personGroupPersonsWithHttpInfo(@Param("elid") String elid, PersonGroupPersonsRequestData body, @QueryMap(encoded=true) PersonGroupPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupPersons</code> method in a fluent style.
   */
  public static class PersonGroupPersonsQueryParams extends HashMap<String, Object> {
    public PersonGroupPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PersonGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupQueryResponse personGroupQuery(@Param("sessionId") String sessionId, PersonGroupQueryRequest body);

  /**
   * Basic query
   * Similar to <code>personGroupQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupQueryResponse> personGroupQueryWithHttpInfo(@Param("sessionId") String sessionId, PersonGroupQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>personGroupQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupQueryResponse personGroupQuery(PersonGroupQueryRequest body, @QueryMap(encoded=true) PersonGroupQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>personGroupQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupQueryResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupQueryResponse> personGroupQueryWithHttpInfo(PersonGroupQueryRequest body, @QueryMap(encoded=true) PersonGroupQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupQuery</code> method in a fluent style.
   */
  public static class PersonGroupQueryQueryParams extends HashMap<String, Object> {
    public PersonGroupQueryQueryParams sessionId(final String value) {
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
   * @return PersonGroupRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupRoomsResponseData personGroupRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>personGroupRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupRoomsResponseData> personGroupRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>personGroupRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupRoomsResponseData personGroupRooms(@Param("elid") String elid, PersonGroupRoomsRequestData body, @QueryMap(encoded=true) PersonGroupRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>personGroupRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupRoomsResponseData> personGroupRoomsWithHttpInfo(@Param("elid") String elid, PersonGroupRoomsRequestData body, @QueryMap(encoded=true) PersonGroupRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupRooms</code> method in a fluent style.
   */
  public static class PersonGroupRoomsQueryParams extends HashMap<String, Object> {
    public PersonGroupRoomsQueryParams sessionId(final String value) {
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
   * @return PersonGroupServersResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupServersResponseData personGroupServers(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>personGroupServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupServersResponseData> personGroupServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>personGroupServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupServersResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupServersResponseData personGroupServers(@Param("elid") String elid, PersonGroupServersRequestData body, @QueryMap(encoded=true) PersonGroupServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>personGroupServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupServersResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupServersResponseData> personGroupServersWithHttpInfo(@Param("elid") String elid, PersonGroupServersRequestData body, @QueryMap(encoded=true) PersonGroupServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupServers</code> method in a fluent style.
   */
  public static class PersonGroupServersQueryParams extends HashMap<String, Object> {
    public PersonGroupServersQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstallationsResponseData personGroupSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>personGroupSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstallationsResponseData> personGroupSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstallationsResponseData personGroupSoftwareInstallations(@Param("elid") String elid, PersonGroupSoftwareInstallationsRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstallationsResponseData> personGroupSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstallationsRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstallations</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstancesResponseData personGroupSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>personGroupSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstancesResponseData> personGroupSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstancesResponseData personGroupSoftwareInstances(@Param("elid") String elid, PersonGroupSoftwareInstancesRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstancesResponseData> personGroupSoftwareInstancesWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstancesRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstances</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstancesQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstancesMssqldbResponseData personGroupSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>personGroupSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstancesMssqldbResponseData> personGroupSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstancesMssqldbResponseData personGroupSoftwareInstancesMssqldb(@Param("elid") String elid, PersonGroupSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstancesMssqldbResponseData> personGroupSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstancesOracledbResponseData personGroupSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>personGroupSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstancesOracledbResponseData> personGroupSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstancesOracledbResponseData personGroupSoftwareInstancesOracledb(@Param("elid") String elid, PersonGroupSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstancesOracledbResponseData> personGroupSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstancesOracledbQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstancesSapResponseData personGroupSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>personGroupSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstancesSapResponseData> personGroupSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstancesSapResponseData personGroupSoftwareInstancesSap(@Param("elid") String elid, PersonGroupSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstancesSapResponseData> personGroupSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstancesSapQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstancesWebResponseData personGroupSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>personGroupSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstancesWebResponseData> personGroupSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstancesWebResponseData personGroupSoftwareInstancesWeb(@Param("elid") String elid, PersonGroupSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstancesWebResponseData> personGroupSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstancesWebQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareInstancesWindowsserviceResponseData personGroupSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>personGroupSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareInstancesWindowsserviceResponseData> personGroupSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareInstancesWindowsserviceResponseData personGroupSoftwareInstancesWindowsservice(@Param("elid") String elid, PersonGroupSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareInstancesWindowsserviceResponseData> personGroupSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareLicensesResponseData personGroupSoftwareLicenses(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareLicensesRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>personGroupSoftwareLicenses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareLicensesResponseData> personGroupSoftwareLicensesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareLicensesRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareLicenses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareLicensesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareLicensesResponseData personGroupSoftwareLicenses(@Param("elid") String elid, PersonGroupSoftwareLicensesRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareLicensesQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareLicenses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareLicensesResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareLicenses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareLicensesResponseData> personGroupSoftwareLicensesWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareLicensesRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareLicensesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareLicenses</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareLicensesQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareLicensesQueryParams sessionId(final String value) {
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
   * @return PersonGroupSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSoftwareProductsResponseData personGroupSoftwareProducts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareProductsRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>personGroupSoftwareProducts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSoftwareProductsResponseData> personGroupSoftwareProductsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSoftwareProductsRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>personGroupSoftwareProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSoftwareProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSoftwareProductsResponseData personGroupSoftwareProducts(@Param("elid") String elid, PersonGroupSoftwareProductsRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareProductsQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>personGroupSoftwareProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSoftwareProductsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SoftwareProducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSoftwareProductsResponseData> personGroupSoftwareProductsWithHttpInfo(@Param("elid") String elid, PersonGroupSoftwareProductsRequestData body, @QueryMap(encoded=true) PersonGroupSoftwareProductsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSoftwareProducts</code> method in a fluent style.
   */
  public static class PersonGroupSoftwareProductsQueryParams extends HashMap<String, Object> {
    public PersonGroupSoftwareProductsQueryParams sessionId(final String value) {
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
   * @return PersonGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupSystemAttributesResponse personGroupSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>personGroupSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupSystemAttributesResponse> personGroupSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>personGroupSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupSystemAttributesResponse personGroupSystemAttributes(@Param("elid") String elid, PersonGroupSystemAttributesRequest body, @QueryMap(encoded=true) PersonGroupSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>personGroupSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupSystemAttributesResponse> personGroupSystemAttributesWithHttpInfo(@Param("elid") String elid, PersonGroupSystemAttributesRequest body, @QueryMap(encoded=true) PersonGroupSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupSystemAttributes</code> method in a fluent style.
   */
  public static class PersonGroupSystemAttributesQueryParams extends HashMap<String, Object> {
    public PersonGroupSystemAttributesQueryParams sessionId(final String value) {
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
   * @return PersonGroupTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupTerminalsResponseData personGroupTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>personGroupTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupTerminalsResponseData> personGroupTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>personGroupTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupTerminalsResponseData personGroupTerminals(@Param("elid") String elid, PersonGroupTerminalsRequestData body, @QueryMap(encoded=true) PersonGroupTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>personGroupTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupTerminalsResponseData> personGroupTerminalsWithHttpInfo(@Param("elid") String elid, PersonGroupTerminalsRequestData body, @QueryMap(encoded=true) PersonGroupTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupTerminals</code> method in a fluent style.
   */
  public static class PersonGroupTerminalsQueryParams extends HashMap<String, Object> {
    public PersonGroupTerminalsQueryParams sessionId(final String value) {
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
   * @return PersonGroupTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupTopzonesResponseData personGroupTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>personGroupTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupTopzonesResponseData> personGroupTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>personGroupTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupTopzonesResponseData personGroupTopzones(@Param("elid") String elid, PersonGroupTopzonesRequestData body, @QueryMap(encoded=true) PersonGroupTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>personGroupTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupTopzonesResponseData> personGroupTopzonesWithHttpInfo(@Param("elid") String elid, PersonGroupTopzonesRequestData body, @QueryMap(encoded=true) PersonGroupTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupTopzones</code> method in a fluent style.
   */
  public static class PersonGroupTopzonesQueryParams extends HashMap<String, Object> {
    public PersonGroupTopzonesQueryParams sessionId(final String value) {
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
   * @return PersonGroupVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonGroupVirtualServersResponseData personGroupVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>personGroupVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonGroupVirtualServersResponseData> personGroupVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonGroupVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>personGroupVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonGroupVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonGroupVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonGroupVirtualServersResponseData personGroupVirtualServers(@Param("elid") String elid, PersonGroupVirtualServersRequestData body, @QueryMap(encoded=true) PersonGroupVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>personGroupVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonGroupVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonGroupVirtualServersResponseData> personGroupVirtualServersWithHttpInfo(@Param("elid") String elid, PersonGroupVirtualServersRequestData body, @QueryMap(encoded=true) PersonGroupVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personGroupVirtualServers</code> method in a fluent style.
   */
  public static class PersonGroupVirtualServersQueryParams extends HashMap<String, Object> {
    public PersonGroupVirtualServersQueryParams sessionId(final String value) {
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
   * @return ReassignAllAssignmentsPersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsPersonGroupResponse reassignAllAssignmentsPersonGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsPersonGroupRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsPersonGroup</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsPersonGroupResponse> reassignAllAssignmentsPersonGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsPersonGroupRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsPersonGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsPersonGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsPersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsPersonGroupResponse reassignAllAssignmentsPersonGroup(@Param("elid") String elid, ReassignAllAssignmentsPersonGroupRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsPersonGroupQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsPersonGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsPersonGroupResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsPersonGroupResponse> reassignAllAssignmentsPersonGroupWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsPersonGroupRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsPersonGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsPersonGroup</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsPersonGroupQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsPersonGroupQueryParams sessionId(final String value) {
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
   * @return ReassignAssignmentsPartiallyPersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyPersonGroupResponse reassignAssignmentsPartiallyPersonGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyPersonGroupRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyPersonGroup</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyPersonGroupResponse> reassignAssignmentsPartiallyPersonGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyPersonGroupRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyPersonGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyPersonGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyPersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyPersonGroupResponse reassignAssignmentsPartiallyPersonGroup(@Param("elid") String elid, ReassignAssignmentsPartiallyPersonGroupRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyPersonGroupQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyPersonGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyPersonGroupResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyPersonGroupResponse> reassignAssignmentsPartiallyPersonGroupWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyPersonGroupRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyPersonGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyPersonGroup</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyPersonGroupQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyPersonGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify person group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePersonGroupResponse updatePersonGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePersonGroupRequestData body);

  /**
   * Modify
   * Similar to <code>updatePersonGroup</code> but it also returns the http response headers .
   * Modify person group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePersonGroupResponse> updatePersonGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePersonGroupRequestData body);


  /**
   * Modify
   * Modify person group
   * Note, this is equivalent to the other <code>updatePersonGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePersonGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePersonGroupResponse updatePersonGroup(@Param("elid") String elid, UpdatePersonGroupRequestData body, @QueryMap(encoded=true) UpdatePersonGroupQueryParams queryParams);

  /**
  * Modify
  * Modify person group
  * Note, this is equivalent to the other <code>updatePersonGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePersonGroupResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePersonGroupResponse> updatePersonGroupWithHttpInfo(@Param("elid") String elid, UpdatePersonGroupRequestData body, @QueryMap(encoded=true) UpdatePersonGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePersonGroup</code> method in a fluent style.
   */
  public static class UpdatePersonGroupQueryParams extends HashMap<String, Object> {
    public UpdatePersonGroupQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPersonGroupResponse updateSystemAttributesPersonGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPersonGroupRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPersonGroup</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPersonGroupResponse> updateSystemAttributesPersonGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPersonGroupRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPersonGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPersonGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPersonGroupResponse
   */
  @RequestLine("POST /api/rest/entity/personGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPersonGroupResponse updateSystemAttributesPersonGroup(@Param("elid") String elid, UpdateSystemAttributesPersonGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPersonGroupQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPersonGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPersonGroupResponse
      */
      @RequestLine("POST /api/rest/entity/personGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPersonGroupResponse> updateSystemAttributesPersonGroupWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPersonGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPersonGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPersonGroup</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPersonGroupQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPersonGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
