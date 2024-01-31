package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreatePersonRequestData;
import com.fntsoftware.businessgateway.entities.CreatePersonResponse;
import com.fntsoftware.businessgateway.entities.DeletePersonRequestData;
import com.fntsoftware.businessgateway.entities.DeletePersonResponse;
import com.fntsoftware.businessgateway.entities.PersonApplicationDeploymentsRequestData;
import com.fntsoftware.businessgateway.entities.PersonApplicationDeploymentsResponseData;
import com.fntsoftware.businessgateway.entities.PersonApplicationReleasesRequestData;
import com.fntsoftware.businessgateway.entities.PersonApplicationReleasesResponseData;
import com.fntsoftware.businessgateway.entities.PersonAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.PersonAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.PersonAttachmentsRequestData;
import com.fntsoftware.businessgateway.entities.PersonAttachmentsResponseData;
import com.fntsoftware.businessgateway.entities.PersonBearersRequestData;
import com.fntsoftware.businessgateway.entities.PersonBearersResponseData;
import com.fntsoftware.businessgateway.entities.PersonBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.PersonBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.PersonCampusesRequestData;
import com.fntsoftware.businessgateway.entities.PersonCampusesResponseData;
import com.fntsoftware.businessgateway.entities.PersonChassisRequestData;
import com.fntsoftware.businessgateway.entities.PersonChassisResponseData;
import com.fntsoftware.businessgateway.entities.PersonContractsRequestData;
import com.fntsoftware.businessgateway.entities.PersonContractsResponseData;
import com.fntsoftware.businessgateway.entities.PersonCustomKeyringsRequestData;
import com.fntsoftware.businessgateway.entities.PersonCustomKeyringsResponseData;
import com.fntsoftware.businessgateway.entities.PersonCustomKeysRequestData;
import com.fntsoftware.businessgateway.entities.PersonCustomKeysResponseData;
import com.fntsoftware.businessgateway.entities.PersonFloorsRequestData;
import com.fntsoftware.businessgateway.entities.PersonFloorsResponseData;
import com.fntsoftware.businessgateway.entities.PersonFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.PersonFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.PersonMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.PersonMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.PersonOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.PersonOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.PersonPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.PersonPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.PersonQueryRequest;
import com.fntsoftware.businessgateway.entities.PersonQueryResponse;
import com.fntsoftware.businessgateway.entities.PersonRoomsRequestData;
import com.fntsoftware.businessgateway.entities.PersonRoomsResponseData;
import com.fntsoftware.businessgateway.entities.PersonServersRequestData;
import com.fntsoftware.businessgateway.entities.PersonServersResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareLicensesRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareLicensesResponseData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareProductsRequestData;
import com.fntsoftware.businessgateway.entities.PersonSoftwareProductsResponseData;
import com.fntsoftware.businessgateway.entities.PersonSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PersonSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.PersonTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.PersonTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.PersonTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.PersonTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.PersonVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.PersonVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsPersonRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsPersonResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyPersonRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyPersonResponse;
import com.fntsoftware.businessgateway.entities.UpdatePersonRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePersonResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPersonRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPersonResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PersonApi extends ApiClient.Api {


  /**
   * Create
   * Create person
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePersonResponse createPerson(@Param("sessionId") String sessionId, CreatePersonRequestData body);

  /**
   * Create
   * Similar to <code>createPerson</code> but it also returns the http response headers .
   * Create person
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePersonResponse> createPersonWithHttpInfo(@Param("sessionId") String sessionId, CreatePersonRequestData body);


  /**
   * Create
   * Create person
   * Note, this is equivalent to the other <code>createPerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePersonResponse createPerson(CreatePersonRequestData body, @QueryMap(encoded=true) CreatePersonQueryParams queryParams);

  /**
  * Create
  * Create person
  * Note, this is equivalent to the other <code>createPerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePersonResponse
      */
      @RequestLine("POST /api/rest/entity/person/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePersonResponse> createPersonWithHttpInfo(CreatePersonRequestData body, @QueryMap(encoded=true) CreatePersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPerson</code> method in a fluent style.
   */
  public static class CreatePersonQueryParams extends HashMap<String, Object> {
    public CreatePersonQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete person
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePersonResponse deletePerson(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePersonRequestData body);

  /**
   * Delete
   * Similar to <code>deletePerson</code> but it also returns the http response headers .
   * Delete person
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePersonResponse> deletePersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePersonRequestData body);


  /**
   * Delete
   * Delete person
   * Note, this is equivalent to the other <code>deletePerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePersonResponse deletePerson(@Param("elid") String elid, DeletePersonRequestData body, @QueryMap(encoded=true) DeletePersonQueryParams queryParams);

  /**
  * Delete
  * Delete person
  * Note, this is equivalent to the other <code>deletePerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePersonResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePersonResponse> deletePersonWithHttpInfo(@Param("elid") String elid, DeletePersonRequestData body, @QueryMap(encoded=true) DeletePersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePerson</code> method in a fluent style.
   */
  public static class DeletePersonQueryParams extends HashMap<String, Object> {
    public DeletePersonQueryParams sessionId(final String value) {
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
   * @return PersonApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonApplicationDeploymentsResponseData personApplicationDeployments(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonApplicationDeploymentsRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>personApplicationDeployments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonApplicationDeploymentsResponseData> personApplicationDeploymentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonApplicationDeploymentsRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>personApplicationDeployments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonApplicationDeploymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonApplicationDeploymentsResponseData personApplicationDeployments(@Param("elid") String elid, PersonApplicationDeploymentsRequestData body, @QueryMap(encoded=true) PersonApplicationDeploymentsQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>personApplicationDeployments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonApplicationDeploymentsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationDeployments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonApplicationDeploymentsResponseData> personApplicationDeploymentsWithHttpInfo(@Param("elid") String elid, PersonApplicationDeploymentsRequestData body, @QueryMap(encoded=true) PersonApplicationDeploymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personApplicationDeployments</code> method in a fluent style.
   */
  public static class PersonApplicationDeploymentsQueryParams extends HashMap<String, Object> {
    public PersonApplicationDeploymentsQueryParams sessionId(final String value) {
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
   * @return PersonApplicationReleasesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonApplicationReleasesResponseData personApplicationReleases(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonApplicationReleasesRequestData body);

  /**
   * Get relations to Application Release entities
   * Similar to <code>personApplicationReleases</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonApplicationReleasesResponseData> personApplicationReleasesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonApplicationReleasesRequestData body);


  /**
   * Get relations to Application Release entities
   * 
   * Note, this is equivalent to the other <code>personApplicationReleases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonApplicationReleasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonApplicationReleasesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonApplicationReleasesResponseData personApplicationReleases(@Param("elid") String elid, PersonApplicationReleasesRequestData body, @QueryMap(encoded=true) PersonApplicationReleasesQueryParams queryParams);

  /**
  * Get relations to Application Release entities
  * 
  * Note, this is equivalent to the other <code>personApplicationReleases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonApplicationReleasesResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/ApplicationReleases?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonApplicationReleasesResponseData> personApplicationReleasesWithHttpInfo(@Param("elid") String elid, PersonApplicationReleasesRequestData body, @QueryMap(encoded=true) PersonApplicationReleasesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personApplicationReleases</code> method in a fluent style.
   */
  public static class PersonApplicationReleasesQueryParams extends HashMap<String, Object> {
    public PersonApplicationReleasesQueryParams sessionId(final String value) {
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
   * @return PersonAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonAssignmentsResponse personAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>personAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonAssignmentsResponse> personAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>personAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonAssignmentsResponse personAssignments(@Param("elid") String elid, PersonAssignmentsRequest body, @QueryMap(encoded=true) PersonAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>personAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonAssignmentsResponse> personAssignmentsWithHttpInfo(@Param("elid") String elid, PersonAssignmentsRequest body, @QueryMap(encoded=true) PersonAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personAssignments</code> method in a fluent style.
   */
  public static class PersonAssignmentsQueryParams extends HashMap<String, Object> {
    public PersonAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Attachments entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PersonAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonAttachmentsResponseData personAttachments(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonAttachmentsRequestData body);

  /**
   * Get relations to Attachments entities
   * Similar to <code>personAttachments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonAttachmentsResponseData> personAttachmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonAttachmentsRequestData body);


  /**
   * Get relations to Attachments entities
   * 
   * Note, this is equivalent to the other <code>personAttachments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonAttachmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonAttachmentsResponseData personAttachments(@Param("elid") String elid, PersonAttachmentsRequestData body, @QueryMap(encoded=true) PersonAttachmentsQueryParams queryParams);

  /**
  * Get relations to Attachments entities
  * 
  * Note, this is equivalent to the other <code>personAttachments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonAttachmentsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Attachments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonAttachmentsResponseData> personAttachmentsWithHttpInfo(@Param("elid") String elid, PersonAttachmentsRequestData body, @QueryMap(encoded=true) PersonAttachmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personAttachments</code> method in a fluent style.
   */
  public static class PersonAttachmentsQueryParams extends HashMap<String, Object> {
    public PersonAttachmentsQueryParams sessionId(final String value) {
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
   * @return PersonBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonBearersResponseData personBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>personBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonBearersResponseData> personBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>personBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonBearersResponseData personBearers(@Param("elid") String elid, PersonBearersRequestData body, @QueryMap(encoded=true) PersonBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>personBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonBearersResponseData> personBearersWithHttpInfo(@Param("elid") String elid, PersonBearersRequestData body, @QueryMap(encoded=true) PersonBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personBearers</code> method in a fluent style.
   */
  public static class PersonBearersQueryParams extends HashMap<String, Object> {
    public PersonBearersQueryParams sessionId(final String value) {
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
   * @return PersonBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonBuildingsResponseData personBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>personBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonBuildingsResponseData> personBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>personBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonBuildingsResponseData personBuildings(@Param("elid") String elid, PersonBuildingsRequestData body, @QueryMap(encoded=true) PersonBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>personBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonBuildingsResponseData> personBuildingsWithHttpInfo(@Param("elid") String elid, PersonBuildingsRequestData body, @QueryMap(encoded=true) PersonBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personBuildings</code> method in a fluent style.
   */
  public static class PersonBuildingsQueryParams extends HashMap<String, Object> {
    public PersonBuildingsQueryParams sessionId(final String value) {
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
   * @return PersonCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonCampusesResponseData personCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>personCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonCampusesResponseData> personCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>personCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonCampusesResponseData personCampuses(@Param("elid") String elid, PersonCampusesRequestData body, @QueryMap(encoded=true) PersonCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>personCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonCampusesResponseData> personCampusesWithHttpInfo(@Param("elid") String elid, PersonCampusesRequestData body, @QueryMap(encoded=true) PersonCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personCampuses</code> method in a fluent style.
   */
  public static class PersonCampusesQueryParams extends HashMap<String, Object> {
    public PersonCampusesQueryParams sessionId(final String value) {
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
   * @return PersonChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonChassisResponseData personChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>personChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonChassisResponseData> personChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>personChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonChassisResponseData personChassis(@Param("elid") String elid, PersonChassisRequestData body, @QueryMap(encoded=true) PersonChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>personChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonChassisResponseData> personChassisWithHttpInfo(@Param("elid") String elid, PersonChassisRequestData body, @QueryMap(encoded=true) PersonChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personChassis</code> method in a fluent style.
   */
  public static class PersonChassisQueryParams extends HashMap<String, Object> {
    public PersonChassisQueryParams sessionId(final String value) {
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
   * @return PersonContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonContractsResponseData personContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>personContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonContractsResponseData> personContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>personContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonContractsResponseData personContracts(@Param("elid") String elid, PersonContractsRequestData body, @QueryMap(encoded=true) PersonContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>personContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonContractsResponseData> personContractsWithHttpInfo(@Param("elid") String elid, PersonContractsRequestData body, @QueryMap(encoded=true) PersonContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personContracts</code> method in a fluent style.
   */
  public static class PersonContractsQueryParams extends HashMap<String, Object> {
    public PersonContractsQueryParams sessionId(final String value) {
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
   * @return PersonCustomKeyringsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeyrings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonCustomKeyringsResponseData personCustomKeyrings(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonCustomKeyringsRequestData body);

  /**
   * Get relations to Keyrings entities
   * Similar to <code>personCustomKeyrings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeyrings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonCustomKeyringsResponseData> personCustomKeyringsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonCustomKeyringsRequestData body);


  /**
   * Get relations to Keyrings entities
   * 
   * Note, this is equivalent to the other <code>personCustomKeyrings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonCustomKeyringsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonCustomKeyringsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeyrings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonCustomKeyringsResponseData personCustomKeyrings(@Param("elid") String elid, PersonCustomKeyringsRequestData body, @QueryMap(encoded=true) PersonCustomKeyringsQueryParams queryParams);

  /**
  * Get relations to Keyrings entities
  * 
  * Note, this is equivalent to the other <code>personCustomKeyrings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonCustomKeyringsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeyrings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonCustomKeyringsResponseData> personCustomKeyringsWithHttpInfo(@Param("elid") String elid, PersonCustomKeyringsRequestData body, @QueryMap(encoded=true) PersonCustomKeyringsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personCustomKeyrings</code> method in a fluent style.
   */
  public static class PersonCustomKeyringsQueryParams extends HashMap<String, Object> {
    public PersonCustomKeyringsQueryParams sessionId(final String value) {
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
   * @return PersonCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonCustomKeysResponseData personCustomKeys(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonCustomKeysRequestData body);

  /**
   * Get relations to Key entities
   * Similar to <code>personCustomKeys</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonCustomKeysResponseData> personCustomKeysWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonCustomKeysRequestData body);


  /**
   * Get relations to Key entities
   * 
   * Note, this is equivalent to the other <code>personCustomKeys</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonCustomKeysQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonCustomKeysResponseData personCustomKeys(@Param("elid") String elid, PersonCustomKeysRequestData body, @QueryMap(encoded=true) PersonCustomKeysQueryParams queryParams);

  /**
  * Get relations to Key entities
  * 
  * Note, this is equivalent to the other <code>personCustomKeys</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonCustomKeysResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/CustomKeys?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonCustomKeysResponseData> personCustomKeysWithHttpInfo(@Param("elid") String elid, PersonCustomKeysRequestData body, @QueryMap(encoded=true) PersonCustomKeysQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personCustomKeys</code> method in a fluent style.
   */
  public static class PersonCustomKeysQueryParams extends HashMap<String, Object> {
    public PersonCustomKeysQueryParams sessionId(final String value) {
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
   * @return PersonFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonFloorsResponseData personFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>personFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonFloorsResponseData> personFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>personFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonFloorsResponseData personFloors(@Param("elid") String elid, PersonFloorsRequestData body, @QueryMap(encoded=true) PersonFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>personFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonFloorsResponseData> personFloorsWithHttpInfo(@Param("elid") String elid, PersonFloorsRequestData body, @QueryMap(encoded=true) PersonFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personFloors</code> method in a fluent style.
   */
  public static class PersonFloorsQueryParams extends HashMap<String, Object> {
    public PersonFloorsQueryParams sessionId(final String value) {
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
   * @return PersonFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonFrameContractsResponseData personFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>personFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonFrameContractsResponseData> personFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>personFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonFrameContractsResponseData personFrameContracts(@Param("elid") String elid, PersonFrameContractsRequestData body, @QueryMap(encoded=true) PersonFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>personFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonFrameContractsResponseData> personFrameContractsWithHttpInfo(@Param("elid") String elid, PersonFrameContractsRequestData body, @QueryMap(encoded=true) PersonFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personFrameContracts</code> method in a fluent style.
   */
  public static class PersonFrameContractsQueryParams extends HashMap<String, Object> {
    public PersonFrameContractsQueryParams sessionId(final String value) {
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
   * @return PersonMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonMaintenanceContractsResponseData personMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>personMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonMaintenanceContractsResponseData> personMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>personMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonMaintenanceContractsResponseData personMaintenanceContracts(@Param("elid") String elid, PersonMaintenanceContractsRequestData body, @QueryMap(encoded=true) PersonMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>personMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonMaintenanceContractsResponseData> personMaintenanceContractsWithHttpInfo(@Param("elid") String elid, PersonMaintenanceContractsRequestData body, @QueryMap(encoded=true) PersonMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personMaintenanceContracts</code> method in a fluent style.
   */
  public static class PersonMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public PersonMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return PersonOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonOrganizationsResponseData personOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>personOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonOrganizationsResponseData> personOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>personOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonOrganizationsResponseData personOrganizations(@Param("elid") String elid, PersonOrganizationsRequestData body, @QueryMap(encoded=true) PersonOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>personOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonOrganizationsResponseData> personOrganizationsWithHttpInfo(@Param("elid") String elid, PersonOrganizationsRequestData body, @QueryMap(encoded=true) PersonOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personOrganizations</code> method in a fluent style.
   */
  public static class PersonOrganizationsQueryParams extends HashMap<String, Object> {
    public PersonOrganizationsQueryParams sessionId(final String value) {
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
   * @return PersonPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonPersonGroupsResponseData personPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>personPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonPersonGroupsResponseData> personPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>personPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonPersonGroupsResponseData personPersonGroups(@Param("elid") String elid, PersonPersonGroupsRequestData body, @QueryMap(encoded=true) PersonPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>personPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonPersonGroupsResponseData> personPersonGroupsWithHttpInfo(@Param("elid") String elid, PersonPersonGroupsRequestData body, @QueryMap(encoded=true) PersonPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personPersonGroups</code> method in a fluent style.
   */
  public static class PersonPersonGroupsQueryParams extends HashMap<String, Object> {
    public PersonPersonGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PersonQueryResponse
   */
  @RequestLine("POST /api/rest/entity/person/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonQueryResponse personQuery(@Param("sessionId") String sessionId, PersonQueryRequest body);

  /**
   * Basic query
   * Similar to <code>personQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonQueryResponse> personQueryWithHttpInfo(@Param("sessionId") String sessionId, PersonQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>personQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonQueryResponse
   */
  @RequestLine("POST /api/rest/entity/person/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonQueryResponse personQuery(PersonQueryRequest body, @QueryMap(encoded=true) PersonQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>personQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonQueryResponse
      */
      @RequestLine("POST /api/rest/entity/person/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonQueryResponse> personQueryWithHttpInfo(PersonQueryRequest body, @QueryMap(encoded=true) PersonQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personQuery</code> method in a fluent style.
   */
  public static class PersonQueryQueryParams extends HashMap<String, Object> {
    public PersonQueryQueryParams sessionId(final String value) {
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
   * @return PersonRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonRoomsResponseData personRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>personRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonRoomsResponseData> personRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>personRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonRoomsResponseData personRooms(@Param("elid") String elid, PersonRoomsRequestData body, @QueryMap(encoded=true) PersonRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>personRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonRoomsResponseData> personRoomsWithHttpInfo(@Param("elid") String elid, PersonRoomsRequestData body, @QueryMap(encoded=true) PersonRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personRooms</code> method in a fluent style.
   */
  public static class PersonRoomsQueryParams extends HashMap<String, Object> {
    public PersonRoomsQueryParams sessionId(final String value) {
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
   * @return PersonServersResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonServersResponseData personServers(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>personServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonServersResponseData> personServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>personServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonServersResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonServersResponseData personServers(@Param("elid") String elid, PersonServersRequestData body, @QueryMap(encoded=true) PersonServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>personServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonServersResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonServersResponseData> personServersWithHttpInfo(@Param("elid") String elid, PersonServersRequestData body, @QueryMap(encoded=true) PersonServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personServers</code> method in a fluent style.
   */
  public static class PersonServersQueryParams extends HashMap<String, Object> {
    public PersonServersQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstallationsResponseData personSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>personSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstallationsResponseData> personSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstallationsResponseData personSoftwareInstallations(@Param("elid") String elid, PersonSoftwareInstallationsRequestData body, @QueryMap(encoded=true) PersonSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstallationsResponseData> personSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstallationsRequestData body, @QueryMap(encoded=true) PersonSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstallations</code> method in a fluent style.
   */
  public static class PersonSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstancesResponseData personSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>personSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstancesResponseData> personSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstancesResponseData personSoftwareInstances(@Param("elid") String elid, PersonSoftwareInstancesRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstancesResponseData> personSoftwareInstancesWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstancesRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstances</code> method in a fluent style.
   */
  public static class PersonSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstancesQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstancesMssqldbResponseData personSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>personSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstancesMssqldbResponseData> personSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstancesMssqldbResponseData personSoftwareInstancesMssqldb(@Param("elid") String elid, PersonSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstancesMssqldbResponseData> personSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class PersonSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstancesOracledbResponseData personSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>personSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstancesOracledbResponseData> personSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstancesOracledbResponseData personSoftwareInstancesOracledb(@Param("elid") String elid, PersonSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstancesOracledbResponseData> personSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class PersonSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstancesOracledbQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstancesSapResponseData personSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>personSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstancesSapResponseData> personSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstancesSapResponseData personSoftwareInstancesSap(@Param("elid") String elid, PersonSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstancesSapResponseData> personSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class PersonSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstancesSapQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstancesWebResponseData personSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>personSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstancesWebResponseData> personSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstancesWebResponseData personSoftwareInstancesWeb(@Param("elid") String elid, PersonSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstancesWebResponseData> personSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class PersonSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstancesWebQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareInstancesWindowsserviceResponseData personSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>personSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareInstancesWindowsserviceResponseData> personSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareInstancesWindowsserviceResponseData personSoftwareInstancesWindowsservice(@Param("elid") String elid, PersonSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareInstancesWindowsserviceResponseData> personSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, PersonSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) PersonSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class PersonSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public PersonSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareLicensesResponseData personSoftwareLicenses(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareLicensesRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>personSoftwareLicenses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareLicensesResponseData> personSoftwareLicensesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareLicensesRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareLicenses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareLicensesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareLicensesResponseData personSoftwareLicenses(@Param("elid") String elid, PersonSoftwareLicensesRequestData body, @QueryMap(encoded=true) PersonSoftwareLicensesQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareLicenses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareLicensesResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareLicenses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareLicensesResponseData> personSoftwareLicensesWithHttpInfo(@Param("elid") String elid, PersonSoftwareLicensesRequestData body, @QueryMap(encoded=true) PersonSoftwareLicensesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareLicenses</code> method in a fluent style.
   */
  public static class PersonSoftwareLicensesQueryParams extends HashMap<String, Object> {
    public PersonSoftwareLicensesQueryParams sessionId(final String value) {
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
   * @return PersonSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSoftwareProductsResponseData personSoftwareProducts(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareProductsRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>personSoftwareProducts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSoftwareProductsResponseData> personSoftwareProductsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSoftwareProductsRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>personSoftwareProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSoftwareProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSoftwareProductsResponseData personSoftwareProducts(@Param("elid") String elid, PersonSoftwareProductsRequestData body, @QueryMap(encoded=true) PersonSoftwareProductsQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>personSoftwareProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSoftwareProductsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SoftwareProducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSoftwareProductsResponseData> personSoftwareProductsWithHttpInfo(@Param("elid") String elid, PersonSoftwareProductsRequestData body, @QueryMap(encoded=true) PersonSoftwareProductsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSoftwareProducts</code> method in a fluent style.
   */
  public static class PersonSoftwareProductsQueryParams extends HashMap<String, Object> {
    public PersonSoftwareProductsQueryParams sessionId(final String value) {
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
   * @return PersonSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonSystemAttributesResponse personSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>personSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonSystemAttributesResponse> personSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>personSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonSystemAttributesResponse personSystemAttributes(@Param("elid") String elid, PersonSystemAttributesRequest body, @QueryMap(encoded=true) PersonSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>personSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonSystemAttributesResponse> personSystemAttributesWithHttpInfo(@Param("elid") String elid, PersonSystemAttributesRequest body, @QueryMap(encoded=true) PersonSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personSystemAttributes</code> method in a fluent style.
   */
  public static class PersonSystemAttributesQueryParams extends HashMap<String, Object> {
    public PersonSystemAttributesQueryParams sessionId(final String value) {
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
   * @return PersonTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonTerminalsResponseData personTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>personTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonTerminalsResponseData> personTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>personTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonTerminalsResponseData personTerminals(@Param("elid") String elid, PersonTerminalsRequestData body, @QueryMap(encoded=true) PersonTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>personTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonTerminalsResponseData> personTerminalsWithHttpInfo(@Param("elid") String elid, PersonTerminalsRequestData body, @QueryMap(encoded=true) PersonTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personTerminals</code> method in a fluent style.
   */
  public static class PersonTerminalsQueryParams extends HashMap<String, Object> {
    public PersonTerminalsQueryParams sessionId(final String value) {
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
   * @return PersonTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonTopzonesResponseData personTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>personTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonTopzonesResponseData> personTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>personTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonTopzonesResponseData personTopzones(@Param("elid") String elid, PersonTopzonesRequestData body, @QueryMap(encoded=true) PersonTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>personTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonTopzonesResponseData> personTopzonesWithHttpInfo(@Param("elid") String elid, PersonTopzonesRequestData body, @QueryMap(encoded=true) PersonTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personTopzones</code> method in a fluent style.
   */
  public static class PersonTopzonesQueryParams extends HashMap<String, Object> {
    public PersonTopzonesQueryParams sessionId(final String value) {
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
   * @return PersonVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonVirtualServersResponseData personVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>personVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonVirtualServersResponseData> personVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PersonVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>personVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PersonVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PersonVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonVirtualServersResponseData personVirtualServers(@Param("elid") String elid, PersonVirtualServersRequestData body, @QueryMap(encoded=true) PersonVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>personVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PersonVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonVirtualServersResponseData> personVirtualServersWithHttpInfo(@Param("elid") String elid, PersonVirtualServersRequestData body, @QueryMap(encoded=true) PersonVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>personVirtualServers</code> method in a fluent style.
   */
  public static class PersonVirtualServersQueryParams extends HashMap<String, Object> {
    public PersonVirtualServersQueryParams sessionId(final String value) {
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
   * @return ReassignAllAssignmentsPersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsPersonResponse reassignAllAssignmentsPerson(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsPersonRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsPerson</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsPersonResponse> reassignAllAssignmentsPersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsPersonRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsPerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsPersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsPersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsPersonResponse reassignAllAssignmentsPerson(@Param("elid") String elid, ReassignAllAssignmentsPersonRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsPersonQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsPerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsPersonResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsPersonResponse> reassignAllAssignmentsPersonWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsPersonRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsPersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsPerson</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsPersonQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsPersonQueryParams sessionId(final String value) {
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
   * @return ReassignAssignmentsPartiallyPersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyPersonResponse reassignAssignmentsPartiallyPerson(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyPersonRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyPerson</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyPersonResponse> reassignAssignmentsPartiallyPersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyPersonRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyPerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyPersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyPersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyPersonResponse reassignAssignmentsPartiallyPerson(@Param("elid") String elid, ReassignAssignmentsPartiallyPersonRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyPersonQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyPerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyPersonResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyPersonResponse> reassignAssignmentsPartiallyPersonWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyPersonRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyPersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyPerson</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyPersonQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyPersonQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify person
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePersonResponse updatePerson(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePersonRequestData body);

  /**
   * Modify
   * Similar to <code>updatePerson</code> but it also returns the http response headers .
   * Modify person
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePersonResponse> updatePersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePersonRequestData body);


  /**
   * Modify
   * Modify person
   * Note, this is equivalent to the other <code>updatePerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePersonResponse updatePerson(@Param("elid") String elid, UpdatePersonRequestData body, @QueryMap(encoded=true) UpdatePersonQueryParams queryParams);

  /**
  * Modify
  * Modify person
  * Note, this is equivalent to the other <code>updatePerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePersonResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePersonResponse> updatePersonWithHttpInfo(@Param("elid") String elid, UpdatePersonRequestData body, @QueryMap(encoded=true) UpdatePersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePerson</code> method in a fluent style.
   */
  public static class UpdatePersonQueryParams extends HashMap<String, Object> {
    public UpdatePersonQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPersonResponse updateSystemAttributesPerson(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPersonRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPerson</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPersonResponse> updateSystemAttributesPersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPersonRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPersonResponse
   */
  @RequestLine("POST /api/rest/entity/person/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPersonResponse updateSystemAttributesPerson(@Param("elid") String elid, UpdateSystemAttributesPersonRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPersonQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPersonResponse
      */
      @RequestLine("POST /api/rest/entity/person/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPersonResponse> updateSystemAttributesPersonWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPersonRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPerson</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPersonQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPersonQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
