package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateFrameContractResponse;
import com.fntsoftware.businessgateway.entities.DeleteFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.DeleteFrameContractResponse;
import com.fntsoftware.businessgateway.entities.FrameContractApplicationDeploymentRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractApplicationDeploymentResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractApplicationReleaseRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractApplicationReleaseResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.FrameContractAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.FrameContractBearersRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractBearersResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractCampusesRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractCampusesResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractChassisRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractChassisResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractContractsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractContractsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractFloorsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractFloorsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractPersonsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractPersonsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractQueryRequest;
import com.fntsoftware.businessgateway.entities.FrameContractQueryResponse;
import com.fntsoftware.businessgateway.entities.FrameContractRoomsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractRoomsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractServersRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractServersResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceOracledbRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceOracledbResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceSapRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceSapResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceWebRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceWebResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareInstanceWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareLicenseRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareLicenseResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractSoftwareProductResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.FrameContractSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.FrameContractTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.FrameContractVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.FrameContractVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsFrameContractResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyFrameContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateFrameContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface FrameContractApi extends ApiClient.Api {


  /**
   * Create
   * Create frame contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateFrameContractResponse createFrameContract(@Param("sessionId") String sessionId, CreateFrameContractRequestData body);

  /**
   * Create
   * Similar to <code>createFrameContract</code> but it also returns the http response headers .
   * Create frame contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateFrameContractResponse> createFrameContractWithHttpInfo(@Param("sessionId") String sessionId, CreateFrameContractRequestData body);


  /**
   * Create
   * Create frame contract
   * Note, this is equivalent to the other <code>createFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateFrameContractResponse createFrameContract(CreateFrameContractRequestData body, @QueryMap(encoded=true) CreateFrameContractQueryParams queryParams);

  /**
  * Create
  * Create frame contract
  * Note, this is equivalent to the other <code>createFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateFrameContractResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateFrameContractResponse> createFrameContractWithHttpInfo(CreateFrameContractRequestData body, @QueryMap(encoded=true) CreateFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createFrameContract</code> method in a fluent style.
   */
  public static class CreateFrameContractQueryParams extends HashMap<String, Object> {
    public CreateFrameContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete frame contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteFrameContractResponse deleteFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFrameContractRequestData body);

  /**
   * Delete
   * Similar to <code>deleteFrameContract</code> but it also returns the http response headers .
   * Delete frame contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteFrameContractResponse> deleteFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFrameContractRequestData body);


  /**
   * Delete
   * Delete frame contract
   * Note, this is equivalent to the other <code>deleteFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteFrameContractResponse deleteFrameContract(@Param("elid") String elid, DeleteFrameContractRequestData body, @QueryMap(encoded=true) DeleteFrameContractQueryParams queryParams);

  /**
  * Delete
  * Delete frame contract
  * Note, this is equivalent to the other <code>deleteFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteFrameContractResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteFrameContractResponse> deleteFrameContractWithHttpInfo(@Param("elid") String elid, DeleteFrameContractRequestData body, @QueryMap(encoded=true) DeleteFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteFrameContract</code> method in a fluent style.
   */
  public static class DeleteFrameContractQueryParams extends HashMap<String, Object> {
    public DeleteFrameContractQueryParams sessionId(final String value) {
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
   * @return FrameContractApplicationDeploymentResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationDeployment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractApplicationDeploymentResponseData frameContractApplicationDeployment(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractApplicationDeploymentRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>frameContractApplicationDeployment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationDeployment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractApplicationDeploymentResponseData> frameContractApplicationDeploymentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractApplicationDeploymentRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>frameContractApplicationDeployment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractApplicationDeploymentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractApplicationDeploymentResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationDeployment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractApplicationDeploymentResponseData frameContractApplicationDeployment(@Param("elid") String elid, FrameContractApplicationDeploymentRequestData body, @QueryMap(encoded=true) FrameContractApplicationDeploymentQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>frameContractApplicationDeployment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractApplicationDeploymentResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationDeployment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractApplicationDeploymentResponseData> frameContractApplicationDeploymentWithHttpInfo(@Param("elid") String elid, FrameContractApplicationDeploymentRequestData body, @QueryMap(encoded=true) FrameContractApplicationDeploymentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractApplicationDeployment</code> method in a fluent style.
   */
  public static class FrameContractApplicationDeploymentQueryParams extends HashMap<String, Object> {
    public FrameContractApplicationDeploymentQueryParams sessionId(final String value) {
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
   * @return FrameContractApplicationReleaseResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractApplicationReleaseResponseData frameContractApplicationRelease(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractApplicationReleaseRequestData body);

  /**
   * Get relations to Application Release entities
   * Similar to <code>frameContractApplicationRelease</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractApplicationReleaseResponseData> frameContractApplicationReleaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractApplicationReleaseRequestData body);


  /**
   * Get relations to Application Release entities
   * 
   * Note, this is equivalent to the other <code>frameContractApplicationRelease</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractApplicationReleaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractApplicationReleaseResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationRelease?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractApplicationReleaseResponseData frameContractApplicationRelease(@Param("elid") String elid, FrameContractApplicationReleaseRequestData body, @QueryMap(encoded=true) FrameContractApplicationReleaseQueryParams queryParams);

  /**
  * Get relations to Application Release entities
  * 
  * Note, this is equivalent to the other <code>frameContractApplicationRelease</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractApplicationReleaseResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/ApplicationRelease?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractApplicationReleaseResponseData> frameContractApplicationReleaseWithHttpInfo(@Param("elid") String elid, FrameContractApplicationReleaseRequestData body, @QueryMap(encoded=true) FrameContractApplicationReleaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractApplicationRelease</code> method in a fluent style.
   */
  public static class FrameContractApplicationReleaseQueryParams extends HashMap<String, Object> {
    public FrameContractApplicationReleaseQueryParams sessionId(final String value) {
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
   * @return FrameContractAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractAssignmentsResponse frameContractAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>frameContractAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractAssignmentsResponse> frameContractAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>frameContractAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractAssignmentsResponse frameContractAssignments(@Param("elid") String elid, FrameContractAssignmentsRequest body, @QueryMap(encoded=true) FrameContractAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>frameContractAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractAssignmentsResponse> frameContractAssignmentsWithHttpInfo(@Param("elid") String elid, FrameContractAssignmentsRequest body, @QueryMap(encoded=true) FrameContractAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractAssignments</code> method in a fluent style.
   */
  public static class FrameContractAssignmentsQueryParams extends HashMap<String, Object> {
    public FrameContractAssignmentsQueryParams sessionId(final String value) {
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
   * @return FrameContractBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractBearersResponseData frameContractBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>frameContractBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractBearersResponseData> frameContractBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>frameContractBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractBearersResponseData frameContractBearers(@Param("elid") String elid, FrameContractBearersRequestData body, @QueryMap(encoded=true) FrameContractBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>frameContractBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractBearersResponseData> frameContractBearersWithHttpInfo(@Param("elid") String elid, FrameContractBearersRequestData body, @QueryMap(encoded=true) FrameContractBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractBearers</code> method in a fluent style.
   */
  public static class FrameContractBearersQueryParams extends HashMap<String, Object> {
    public FrameContractBearersQueryParams sessionId(final String value) {
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
   * @return FrameContractBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractBuildingsResponseData frameContractBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>frameContractBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractBuildingsResponseData> frameContractBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>frameContractBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractBuildingsResponseData frameContractBuildings(@Param("elid") String elid, FrameContractBuildingsRequestData body, @QueryMap(encoded=true) FrameContractBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>frameContractBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractBuildingsResponseData> frameContractBuildingsWithHttpInfo(@Param("elid") String elid, FrameContractBuildingsRequestData body, @QueryMap(encoded=true) FrameContractBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractBuildings</code> method in a fluent style.
   */
  public static class FrameContractBuildingsQueryParams extends HashMap<String, Object> {
    public FrameContractBuildingsQueryParams sessionId(final String value) {
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
   * @return FrameContractCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractCampusesResponseData frameContractCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>frameContractCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractCampusesResponseData> frameContractCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>frameContractCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractCampusesResponseData frameContractCampuses(@Param("elid") String elid, FrameContractCampusesRequestData body, @QueryMap(encoded=true) FrameContractCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>frameContractCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractCampusesResponseData> frameContractCampusesWithHttpInfo(@Param("elid") String elid, FrameContractCampusesRequestData body, @QueryMap(encoded=true) FrameContractCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractCampuses</code> method in a fluent style.
   */
  public static class FrameContractCampusesQueryParams extends HashMap<String, Object> {
    public FrameContractCampusesQueryParams sessionId(final String value) {
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
   * @return FrameContractChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractChassisResponseData frameContractChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>frameContractChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractChassisResponseData> frameContractChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>frameContractChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractChassisResponseData frameContractChassis(@Param("elid") String elid, FrameContractChassisRequestData body, @QueryMap(encoded=true) FrameContractChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>frameContractChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractChassisResponseData> frameContractChassisWithHttpInfo(@Param("elid") String elid, FrameContractChassisRequestData body, @QueryMap(encoded=true) FrameContractChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractChassis</code> method in a fluent style.
   */
  public static class FrameContractChassisQueryParams extends HashMap<String, Object> {
    public FrameContractChassisQueryParams sessionId(final String value) {
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
   * @return FrameContractContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractContractsResponseData frameContractContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>frameContractContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractContractsResponseData> frameContractContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>frameContractContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractContractsResponseData frameContractContracts(@Param("elid") String elid, FrameContractContractsRequestData body, @QueryMap(encoded=true) FrameContractContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>frameContractContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractContractsResponseData> frameContractContractsWithHttpInfo(@Param("elid") String elid, FrameContractContractsRequestData body, @QueryMap(encoded=true) FrameContractContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractContracts</code> method in a fluent style.
   */
  public static class FrameContractContractsQueryParams extends HashMap<String, Object> {
    public FrameContractContractsQueryParams sessionId(final String value) {
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
   * @return FrameContractFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractFloorsResponseData frameContractFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>frameContractFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractFloorsResponseData> frameContractFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>frameContractFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractFloorsResponseData frameContractFloors(@Param("elid") String elid, FrameContractFloorsRequestData body, @QueryMap(encoded=true) FrameContractFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>frameContractFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractFloorsResponseData> frameContractFloorsWithHttpInfo(@Param("elid") String elid, FrameContractFloorsRequestData body, @QueryMap(encoded=true) FrameContractFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractFloors</code> method in a fluent style.
   */
  public static class FrameContractFloorsQueryParams extends HashMap<String, Object> {
    public FrameContractFloorsQueryParams sessionId(final String value) {
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
   * @return FrameContractMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractMaintenanceContractsResponseData frameContractMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>frameContractMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractMaintenanceContractsResponseData> frameContractMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>frameContractMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractMaintenanceContractsResponseData frameContractMaintenanceContracts(@Param("elid") String elid, FrameContractMaintenanceContractsRequestData body, @QueryMap(encoded=true) FrameContractMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>frameContractMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractMaintenanceContractsResponseData> frameContractMaintenanceContractsWithHttpInfo(@Param("elid") String elid, FrameContractMaintenanceContractsRequestData body, @QueryMap(encoded=true) FrameContractMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractMaintenanceContracts</code> method in a fluent style.
   */
  public static class FrameContractMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public FrameContractMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return FrameContractOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractOrganizationsResponseData frameContractOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>frameContractOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractOrganizationsResponseData> frameContractOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>frameContractOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractOrganizationsResponseData frameContractOrganizations(@Param("elid") String elid, FrameContractOrganizationsRequestData body, @QueryMap(encoded=true) FrameContractOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>frameContractOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractOrganizationsResponseData> frameContractOrganizationsWithHttpInfo(@Param("elid") String elid, FrameContractOrganizationsRequestData body, @QueryMap(encoded=true) FrameContractOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractOrganizations</code> method in a fluent style.
   */
  public static class FrameContractOrganizationsQueryParams extends HashMap<String, Object> {
    public FrameContractOrganizationsQueryParams sessionId(final String value) {
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
   * @return FrameContractPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractPersonGroupsResponseData frameContractPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>frameContractPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractPersonGroupsResponseData> frameContractPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>frameContractPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractPersonGroupsResponseData frameContractPersonGroups(@Param("elid") String elid, FrameContractPersonGroupsRequestData body, @QueryMap(encoded=true) FrameContractPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>frameContractPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractPersonGroupsResponseData> frameContractPersonGroupsWithHttpInfo(@Param("elid") String elid, FrameContractPersonGroupsRequestData body, @QueryMap(encoded=true) FrameContractPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractPersonGroups</code> method in a fluent style.
   */
  public static class FrameContractPersonGroupsQueryParams extends HashMap<String, Object> {
    public FrameContractPersonGroupsQueryParams sessionId(final String value) {
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
   * @return FrameContractPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractPersonsResponseData frameContractPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>frameContractPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractPersonsResponseData> frameContractPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>frameContractPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractPersonsResponseData frameContractPersons(@Param("elid") String elid, FrameContractPersonsRequestData body, @QueryMap(encoded=true) FrameContractPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>frameContractPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractPersonsResponseData> frameContractPersonsWithHttpInfo(@Param("elid") String elid, FrameContractPersonsRequestData body, @QueryMap(encoded=true) FrameContractPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractPersons</code> method in a fluent style.
   */
  public static class FrameContractPersonsQueryParams extends HashMap<String, Object> {
    public FrameContractPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return FrameContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractQueryResponse frameContractQuery(@Param("sessionId") String sessionId, FrameContractQueryRequest body);

  /**
   * Basic query
   * Similar to <code>frameContractQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractQueryResponse> frameContractQueryWithHttpInfo(@Param("sessionId") String sessionId, FrameContractQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>frameContractQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractQueryResponse frameContractQuery(FrameContractQueryRequest body, @QueryMap(encoded=true) FrameContractQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>frameContractQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractQueryResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractQueryResponse> frameContractQueryWithHttpInfo(FrameContractQueryRequest body, @QueryMap(encoded=true) FrameContractQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractQuery</code> method in a fluent style.
   */
  public static class FrameContractQueryQueryParams extends HashMap<String, Object> {
    public FrameContractQueryQueryParams sessionId(final String value) {
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
   * @return FrameContractRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractRoomsResponseData frameContractRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>frameContractRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractRoomsResponseData> frameContractRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>frameContractRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractRoomsResponseData frameContractRooms(@Param("elid") String elid, FrameContractRoomsRequestData body, @QueryMap(encoded=true) FrameContractRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>frameContractRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractRoomsResponseData> frameContractRoomsWithHttpInfo(@Param("elid") String elid, FrameContractRoomsRequestData body, @QueryMap(encoded=true) FrameContractRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractRooms</code> method in a fluent style.
   */
  public static class FrameContractRoomsQueryParams extends HashMap<String, Object> {
    public FrameContractRoomsQueryParams sessionId(final String value) {
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
   * @return FrameContractServersResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractServersResponseData frameContractServers(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>frameContractServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractServersResponseData> frameContractServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>frameContractServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractServersResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractServersResponseData frameContractServers(@Param("elid") String elid, FrameContractServersRequestData body, @QueryMap(encoded=true) FrameContractServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>frameContractServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractServersResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractServersResponseData> frameContractServersWithHttpInfo(@Param("elid") String elid, FrameContractServersRequestData body, @QueryMap(encoded=true) FrameContractServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractServers</code> method in a fluent style.
   */
  public static class FrameContractServersQueryParams extends HashMap<String, Object> {
    public FrameContractServersQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstallationResponseData frameContractSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>frameContractSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstallationResponseData> frameContractSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstallationResponseData frameContractSoftwareInstallation(@Param("elid") String elid, FrameContractSoftwareInstallationRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstallationResponseData> frameContractSoftwareInstallationWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstallationRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstallation</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstanceResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstance?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstanceResponseData frameContractSoftwareInstance(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>frameContractSoftwareInstance</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstance?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstanceResponseData> frameContractSoftwareInstanceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstance</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstanceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstanceResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstance?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstanceResponseData frameContractSoftwareInstance(@Param("elid") String elid, FrameContractSoftwareInstanceRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstance</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstanceResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstance?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstanceResponseData> frameContractSoftwareInstanceWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstanceRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstance</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstanceQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstanceQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstanceMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstanceMssqldbResponseData frameContractSoftwareInstanceMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>frameContractSoftwareInstanceMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstanceMssqldbResponseData> frameContractSoftwareInstanceMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstanceMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstanceMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstanceMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstanceMssqldbResponseData frameContractSoftwareInstanceMssqldb(@Param("elid") String elid, FrameContractSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstanceMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstanceMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstanceMssqldbResponseData> frameContractSoftwareInstanceMssqldbWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstanceMssqldb</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstanceMssqldbQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstanceMssqldbQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstanceOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstanceOracledbResponseData frameContractSoftwareInstanceOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>frameContractSoftwareInstanceOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstanceOracledbResponseData> frameContractSoftwareInstanceOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstanceOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstanceOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstanceOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstanceOracledbResponseData frameContractSoftwareInstanceOracledb(@Param("elid") String elid, FrameContractSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstanceOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstanceOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstanceOracledbResponseData> frameContractSoftwareInstanceOracledbWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstanceOracledbRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstanceOracledb</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstanceOracledbQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstanceOracledbQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstanceSapResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstanceSapResponseData frameContractSoftwareInstanceSap(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>frameContractSoftwareInstanceSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstanceSapResponseData> frameContractSoftwareInstanceSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstanceSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstanceSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstanceSapResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstanceSapResponseData frameContractSoftwareInstanceSap(@Param("elid") String elid, FrameContractSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstanceSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstanceSapResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstanceSapResponseData> frameContractSoftwareInstanceSapWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstanceSap</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstanceSapQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstanceSapQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstanceWebResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstanceWebResponseData frameContractSoftwareInstanceWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>frameContractSoftwareInstanceWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstanceWebResponseData> frameContractSoftwareInstanceWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstanceWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstanceWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstanceWebResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstanceWebResponseData frameContractSoftwareInstanceWeb(@Param("elid") String elid, FrameContractSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstanceWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstanceWebResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstanceWebResponseData> frameContractSoftwareInstanceWebWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstanceWeb</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstanceWebQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstanceWebQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareInstanceWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareInstanceWindowsserviceResponseData frameContractSoftwareInstanceWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>frameContractSoftwareInstanceWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareInstanceWindowsserviceResponseData> frameContractSoftwareInstanceWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareInstanceWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareInstanceWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareInstanceWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareInstanceWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareInstanceWindowsserviceResponseData frameContractSoftwareInstanceWindowsservice(@Param("elid") String elid, FrameContractSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareInstanceWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareInstanceWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareInstanceWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareInstanceWindowsserviceResponseData> frameContractSoftwareInstanceWindowsserviceWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) FrameContractSoftwareInstanceWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareInstanceWindowsservice</code> method in a fluent style.
   */
  public static class FrameContractSoftwareInstanceWindowsserviceQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareInstanceWindowsserviceQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareLicenseResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareLicense?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareLicenseResponseData frameContractSoftwareLicense(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareLicenseRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>frameContractSoftwareLicense</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareLicense?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareLicenseResponseData> frameContractSoftwareLicenseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareLicenseRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareLicense</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareLicenseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareLicenseResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareLicense?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareLicenseResponseData frameContractSoftwareLicense(@Param("elid") String elid, FrameContractSoftwareLicenseRequestData body, @QueryMap(encoded=true) FrameContractSoftwareLicenseQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareLicense</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareLicenseResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareLicense?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareLicenseResponseData> frameContractSoftwareLicenseWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareLicenseRequestData body, @QueryMap(encoded=true) FrameContractSoftwareLicenseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareLicense</code> method in a fluent style.
   */
  public static class FrameContractSoftwareLicenseQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareLicenseQueryParams sessionId(final String value) {
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
   * @return FrameContractSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSoftwareProductResponseData frameContractSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareProductRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>frameContractSoftwareProduct</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSoftwareProductResponseData> frameContractSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSoftwareProductRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>frameContractSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSoftwareProductResponseData frameContractSoftwareProduct(@Param("elid") String elid, FrameContractSoftwareProductRequestData body, @QueryMap(encoded=true) FrameContractSoftwareProductQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>frameContractSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSoftwareProductResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SoftwareProduct?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSoftwareProductResponseData> frameContractSoftwareProductWithHttpInfo(@Param("elid") String elid, FrameContractSoftwareProductRequestData body, @QueryMap(encoded=true) FrameContractSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSoftwareProduct</code> method in a fluent style.
   */
  public static class FrameContractSoftwareProductQueryParams extends HashMap<String, Object> {
    public FrameContractSoftwareProductQueryParams sessionId(final String value) {
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
   * @return FrameContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractSystemAttributesResponse frameContractSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>frameContractSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractSystemAttributesResponse> frameContractSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>frameContractSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractSystemAttributesResponse frameContractSystemAttributes(@Param("elid") String elid, FrameContractSystemAttributesRequest body, @QueryMap(encoded=true) FrameContractSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>frameContractSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractSystemAttributesResponse> frameContractSystemAttributesWithHttpInfo(@Param("elid") String elid, FrameContractSystemAttributesRequest body, @QueryMap(encoded=true) FrameContractSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractSystemAttributes</code> method in a fluent style.
   */
  public static class FrameContractSystemAttributesQueryParams extends HashMap<String, Object> {
    public FrameContractSystemAttributesQueryParams sessionId(final String value) {
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
   * @return FrameContractTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractTerminalsResponseData frameContractTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>frameContractTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractTerminalsResponseData> frameContractTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>frameContractTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractTerminalsResponseData frameContractTerminals(@Param("elid") String elid, FrameContractTerminalsRequestData body, @QueryMap(encoded=true) FrameContractTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>frameContractTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractTerminalsResponseData> frameContractTerminalsWithHttpInfo(@Param("elid") String elid, FrameContractTerminalsRequestData body, @QueryMap(encoded=true) FrameContractTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractTerminals</code> method in a fluent style.
   */
  public static class FrameContractTerminalsQueryParams extends HashMap<String, Object> {
    public FrameContractTerminalsQueryParams sessionId(final String value) {
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
   * @return FrameContractTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractTopzonesResponseData frameContractTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>frameContractTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractTopzonesResponseData> frameContractTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>frameContractTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractTopzonesResponseData frameContractTopzones(@Param("elid") String elid, FrameContractTopzonesRequestData body, @QueryMap(encoded=true) FrameContractTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>frameContractTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractTopzonesResponseData> frameContractTopzonesWithHttpInfo(@Param("elid") String elid, FrameContractTopzonesRequestData body, @QueryMap(encoded=true) FrameContractTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractTopzones</code> method in a fluent style.
   */
  public static class FrameContractTopzonesQueryParams extends HashMap<String, Object> {
    public FrameContractTopzonesQueryParams sessionId(final String value) {
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
   * @return FrameContractVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FrameContractVirtualServersResponseData frameContractVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>frameContractVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FrameContractVirtualServersResponseData> frameContractVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FrameContractVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>frameContractVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FrameContractVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FrameContractVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FrameContractVirtualServersResponseData frameContractVirtualServers(@Param("elid") String elid, FrameContractVirtualServersRequestData body, @QueryMap(encoded=true) FrameContractVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>frameContractVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FrameContractVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FrameContractVirtualServersResponseData> frameContractVirtualServersWithHttpInfo(@Param("elid") String elid, FrameContractVirtualServersRequestData body, @QueryMap(encoded=true) FrameContractVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>frameContractVirtualServers</code> method in a fluent style.
   */
  public static class FrameContractVirtualServersQueryParams extends HashMap<String, Object> {
    public FrameContractVirtualServersQueryParams sessionId(final String value) {
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
   * @return ReassignAllAssignmentsFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsFrameContractResponse reassignAllAssignmentsFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsFrameContractRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsFrameContract</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsFrameContractResponse> reassignAllAssignmentsFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsFrameContractRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsFrameContractResponse reassignAllAssignmentsFrameContract(@Param("elid") String elid, ReassignAllAssignmentsFrameContractRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsFrameContractQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsFrameContractResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsFrameContractResponse> reassignAllAssignmentsFrameContractWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsFrameContractRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsFrameContract</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsFrameContractQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsFrameContractQueryParams sessionId(final String value) {
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
   * @return ReassignAssignmentsPartiallyFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyFrameContractResponse reassignAssignmentsPartiallyFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyFrameContractRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyFrameContract</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyFrameContractResponse> reassignAssignmentsPartiallyFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyFrameContractRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyFrameContractResponse reassignAssignmentsPartiallyFrameContract(@Param("elid") String elid, ReassignAssignmentsPartiallyFrameContractRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyFrameContractQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyFrameContractResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyFrameContractResponse> reassignAssignmentsPartiallyFrameContractWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyFrameContractRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyFrameContract</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyFrameContractQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyFrameContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify frame contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateFrameContractResponse updateFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFrameContractRequestData body);

  /**
   * Modify
   * Similar to <code>updateFrameContract</code> but it also returns the http response headers .
   * Modify frame contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateFrameContractResponse> updateFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFrameContractRequestData body);


  /**
   * Modify
   * Modify frame contract
   * Note, this is equivalent to the other <code>updateFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateFrameContractResponse updateFrameContract(@Param("elid") String elid, UpdateFrameContractRequestData body, @QueryMap(encoded=true) UpdateFrameContractQueryParams queryParams);

  /**
  * Modify
  * Modify frame contract
  * Note, this is equivalent to the other <code>updateFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateFrameContractResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateFrameContractResponse> updateFrameContractWithHttpInfo(@Param("elid") String elid, UpdateFrameContractRequestData body, @QueryMap(encoded=true) UpdateFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateFrameContract</code> method in a fluent style.
   */
  public static class UpdateFrameContractQueryParams extends HashMap<String, Object> {
    public UpdateFrameContractQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesFrameContractResponse updateSystemAttributesFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFrameContractRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesFrameContract</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesFrameContractResponse> updateSystemAttributesFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFrameContractRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesFrameContractResponse
   */
  @RequestLine("POST /api/rest/entity/frameContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesFrameContractResponse updateSystemAttributesFrameContract(@Param("elid") String elid, UpdateSystemAttributesFrameContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFrameContractQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesFrameContractResponse
      */
      @RequestLine("POST /api/rest/entity/frameContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesFrameContractResponse> updateSystemAttributesFrameContractWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesFrameContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesFrameContract</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesFrameContractQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesFrameContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
