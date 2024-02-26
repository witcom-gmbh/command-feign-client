package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateMaintenanceContractResponse;
import com.fntsoftware.businessgateway.entities.DeleteMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMaintenanceContractResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceContractAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.MaintenanceContractAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceContractCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractFrameContractRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractFrameContractResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractPersonsRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractPersonsResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceContractQueryRequest;
import com.fntsoftware.businessgateway.entities.MaintenanceContractQueryResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceContractSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MaintenanceContractSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsMaintenanceContractResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyMaintenanceContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMaintenanceContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMaintenanceContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMaintenanceContractResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface MaintenanceContractApi extends ApiClient.Api {


  /**
   * Create
   * Create contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateMaintenanceContractResponse createMaintenanceContract(@Param("sessionId") String sessionId, CreateMaintenanceContractRequestData body);

  /**
   * Create
   * Similar to <code>createMaintenanceContract</code> but it also returns the http response headers .
   * Create contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateMaintenanceContractResponse> createMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, CreateMaintenanceContractRequestData body);


  /**
   * Create
   * Create contract / maintenance contract
   * Note, this is equivalent to the other <code>createMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateMaintenanceContractResponse createMaintenanceContract(CreateMaintenanceContractRequestData body, @QueryMap(encoded=true) CreateMaintenanceContractQueryParams queryParams);

  /**
  * Create
  * Create contract / maintenance contract
  * Note, this is equivalent to the other <code>createMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateMaintenanceContractResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateMaintenanceContractResponse> createMaintenanceContractWithHttpInfo(CreateMaintenanceContractRequestData body, @QueryMap(encoded=true) CreateMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createMaintenanceContract</code> method in a fluent style.
   */
  public static class CreateMaintenanceContractQueryParams extends HashMap<String, Object> {
    public CreateMaintenanceContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMaintenanceContractResponse deleteMaintenanceContract(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMaintenanceContractRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMaintenanceContract</code> but it also returns the http response headers .
   * Delete contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMaintenanceContractResponse> deleteMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMaintenanceContractRequestData body);


  /**
   * Delete
   * Delete contract / maintenance contract
   * Note, this is equivalent to the other <code>deleteMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMaintenanceContractResponse deleteMaintenanceContract(@Param("elid") String elid, DeleteMaintenanceContractRequestData body, @QueryMap(encoded=true) DeleteMaintenanceContractQueryParams queryParams);

  /**
  * Delete
  * Delete contract / maintenance contract
  * Note, this is equivalent to the other <code>deleteMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMaintenanceContractResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMaintenanceContractResponse> deleteMaintenanceContractWithHttpInfo(@Param("elid") String elid, DeleteMaintenanceContractRequestData body, @QueryMap(encoded=true) DeleteMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMaintenanceContract</code> method in a fluent style.
   */
  public static class DeleteMaintenanceContractQueryParams extends HashMap<String, Object> {
    public DeleteMaintenanceContractQueryParams sessionId(final String value) {
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
   * @return MaintenanceContractAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractAssignmentsResponse maintenanceContractAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>maintenanceContractAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractAssignmentsResponse> maintenanceContractAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>maintenanceContractAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractAssignmentsResponse maintenanceContractAssignments(@Param("elid") String elid, MaintenanceContractAssignmentsRequest body, @QueryMap(encoded=true) MaintenanceContractAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>maintenanceContractAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractAssignmentsResponse> maintenanceContractAssignmentsWithHttpInfo(@Param("elid") String elid, MaintenanceContractAssignmentsRequest body, @QueryMap(encoded=true) MaintenanceContractAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractAssignments</code> method in a fluent style.
   */
  public static class MaintenanceContractAssignmentsQueryParams extends HashMap<String, Object> {
    public MaintenanceContractAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP-Access Service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MaintenanceContractCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractCustomIpaccessSvcResponseData maintenanceContractCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>maintenanceContractCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractCustomIpaccessSvcResponseData> maintenanceContractCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>maintenanceContractCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractCustomIpaccessSvcResponseData maintenanceContractCustomIpaccessSvc(@Param("elid") String elid, MaintenanceContractCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) MaintenanceContractCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>maintenanceContractCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractCustomIpaccessSvcResponseData> maintenanceContractCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, MaintenanceContractCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) MaintenanceContractCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class MaintenanceContractCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public MaintenanceContractCustomIpaccessSvcQueryParams sessionId(final String value) {
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
   * @return MaintenanceContractFrameContractResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/FrameContract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractFrameContractResponseData maintenanceContractFrameContract(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractFrameContractRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>maintenanceContractFrameContract</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/FrameContract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractFrameContractResponseData> maintenanceContractFrameContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractFrameContractRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>maintenanceContractFrameContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractFrameContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractFrameContractResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/FrameContract?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractFrameContractResponseData maintenanceContractFrameContract(@Param("elid") String elid, MaintenanceContractFrameContractRequestData body, @QueryMap(encoded=true) MaintenanceContractFrameContractQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>maintenanceContractFrameContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractFrameContractResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/FrameContract?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractFrameContractResponseData> maintenanceContractFrameContractWithHttpInfo(@Param("elid") String elid, MaintenanceContractFrameContractRequestData body, @QueryMap(encoded=true) MaintenanceContractFrameContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractFrameContract</code> method in a fluent style.
   */
  public static class MaintenanceContractFrameContractQueryParams extends HashMap<String, Object> {
    public MaintenanceContractFrameContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance window entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MaintenanceContractMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractMaintenanceWindowsResponseData maintenanceContractMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>maintenanceContractMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractMaintenanceWindowsResponseData> maintenanceContractMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>maintenanceContractMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractMaintenanceWindowsResponseData maintenanceContractMaintenanceWindows(@Param("elid") String elid, MaintenanceContractMaintenanceWindowsRequestData body, @QueryMap(encoded=true) MaintenanceContractMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>maintenanceContractMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractMaintenanceWindowsResponseData> maintenanceContractMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, MaintenanceContractMaintenanceWindowsRequestData body, @QueryMap(encoded=true) MaintenanceContractMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractMaintenanceWindows</code> method in a fluent style.
   */
  public static class MaintenanceContractMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public MaintenanceContractMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return MaintenanceContractOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractOrganizationsResponseData maintenanceContractOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>maintenanceContractOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractOrganizationsResponseData> maintenanceContractOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>maintenanceContractOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractOrganizationsResponseData maintenanceContractOrganizations(@Param("elid") String elid, MaintenanceContractOrganizationsRequestData body, @QueryMap(encoded=true) MaintenanceContractOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>maintenanceContractOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractOrganizationsResponseData> maintenanceContractOrganizationsWithHttpInfo(@Param("elid") String elid, MaintenanceContractOrganizationsRequestData body, @QueryMap(encoded=true) MaintenanceContractOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractOrganizations</code> method in a fluent style.
   */
  public static class MaintenanceContractOrganizationsQueryParams extends HashMap<String, Object> {
    public MaintenanceContractOrganizationsQueryParams sessionId(final String value) {
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
   * @return MaintenanceContractPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractPersonGroupsResponseData maintenanceContractPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>maintenanceContractPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractPersonGroupsResponseData> maintenanceContractPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>maintenanceContractPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractPersonGroupsResponseData maintenanceContractPersonGroups(@Param("elid") String elid, MaintenanceContractPersonGroupsRequestData body, @QueryMap(encoded=true) MaintenanceContractPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>maintenanceContractPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractPersonGroupsResponseData> maintenanceContractPersonGroupsWithHttpInfo(@Param("elid") String elid, MaintenanceContractPersonGroupsRequestData body, @QueryMap(encoded=true) MaintenanceContractPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractPersonGroups</code> method in a fluent style.
   */
  public static class MaintenanceContractPersonGroupsQueryParams extends HashMap<String, Object> {
    public MaintenanceContractPersonGroupsQueryParams sessionId(final String value) {
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
   * @return MaintenanceContractPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractPersonsResponseData maintenanceContractPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>maintenanceContractPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractPersonsResponseData> maintenanceContractPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>maintenanceContractPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractPersonsResponseData maintenanceContractPersons(@Param("elid") String elid, MaintenanceContractPersonsRequestData body, @QueryMap(encoded=true) MaintenanceContractPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>maintenanceContractPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractPersonsResponseData> maintenanceContractPersonsWithHttpInfo(@Param("elid") String elid, MaintenanceContractPersonsRequestData body, @QueryMap(encoded=true) MaintenanceContractPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractPersons</code> method in a fluent style.
   */
  public static class MaintenanceContractPersonsQueryParams extends HashMap<String, Object> {
    public MaintenanceContractPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MaintenanceContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractQueryResponse maintenanceContractQuery(@Param("sessionId") String sessionId, MaintenanceContractQueryRequest body);

  /**
   * Basic query
   * Similar to <code>maintenanceContractQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractQueryResponse> maintenanceContractQueryWithHttpInfo(@Param("sessionId") String sessionId, MaintenanceContractQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>maintenanceContractQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractQueryResponse maintenanceContractQuery(MaintenanceContractQueryRequest body, @QueryMap(encoded=true) MaintenanceContractQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>maintenanceContractQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractQueryResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractQueryResponse> maintenanceContractQueryWithHttpInfo(MaintenanceContractQueryRequest body, @QueryMap(encoded=true) MaintenanceContractQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractQuery</code> method in a fluent style.
   */
  public static class MaintenanceContractQueryQueryParams extends HashMap<String, Object> {
    public MaintenanceContractQueryQueryParams sessionId(final String value) {
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
   * @return MaintenanceContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceContractSystemAttributesResponse maintenanceContractSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>maintenanceContractSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceContractSystemAttributesResponse> maintenanceContractSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceContractSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>maintenanceContractSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceContractSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceContractSystemAttributesResponse maintenanceContractSystemAttributes(@Param("elid") String elid, MaintenanceContractSystemAttributesRequest body, @QueryMap(encoded=true) MaintenanceContractSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>maintenanceContractSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceContractSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceContractSystemAttributesResponse> maintenanceContractSystemAttributesWithHttpInfo(@Param("elid") String elid, MaintenanceContractSystemAttributesRequest body, @QueryMap(encoded=true) MaintenanceContractSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceContractSystemAttributes</code> method in a fluent style.
   */
  public static class MaintenanceContractSystemAttributesQueryParams extends HashMap<String, Object> {
    public MaintenanceContractSystemAttributesQueryParams sessionId(final String value) {
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
   * @return ReassignAllAssignmentsMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsMaintenanceContractResponse reassignAllAssignmentsMaintenanceContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsMaintenanceContractRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsMaintenanceContract</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsMaintenanceContractResponse> reassignAllAssignmentsMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsMaintenanceContractRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsMaintenanceContractResponse reassignAllAssignmentsMaintenanceContract(@Param("elid") String elid, ReassignAllAssignmentsMaintenanceContractRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsMaintenanceContractQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsMaintenanceContractResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsMaintenanceContractResponse> reassignAllAssignmentsMaintenanceContractWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsMaintenanceContractRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsMaintenanceContract</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsMaintenanceContractQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsMaintenanceContractQueryParams sessionId(final String value) {
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
   * @return ReassignAssignmentsPartiallyMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyMaintenanceContractResponse reassignAssignmentsPartiallyMaintenanceContract(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyMaintenanceContractRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyMaintenanceContract</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyMaintenanceContractResponse> reassignAssignmentsPartiallyMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyMaintenanceContractRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyMaintenanceContractResponse reassignAssignmentsPartiallyMaintenanceContract(@Param("elid") String elid, ReassignAssignmentsPartiallyMaintenanceContractRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyMaintenanceContractQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyMaintenanceContractResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyMaintenanceContractResponse> reassignAssignmentsPartiallyMaintenanceContractWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyMaintenanceContractRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyMaintenanceContract</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyMaintenanceContractQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyMaintenanceContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMaintenanceContractResponse updateMaintenanceContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMaintenanceContractRequestData body);

  /**
   * Modify
   * Similar to <code>updateMaintenanceContract</code> but it also returns the http response headers .
   * Modify contract / maintenance contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMaintenanceContractResponse> updateMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMaintenanceContractRequestData body);


  /**
   * Modify
   * Modify contract / maintenance contract
   * Note, this is equivalent to the other <code>updateMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMaintenanceContractResponse updateMaintenanceContract(@Param("elid") String elid, UpdateMaintenanceContractRequestData body, @QueryMap(encoded=true) UpdateMaintenanceContractQueryParams queryParams);

  /**
  * Modify
  * Modify contract / maintenance contract
  * Note, this is equivalent to the other <code>updateMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMaintenanceContractResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMaintenanceContractResponse> updateMaintenanceContractWithHttpInfo(@Param("elid") String elid, UpdateMaintenanceContractRequestData body, @QueryMap(encoded=true) UpdateMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMaintenanceContract</code> method in a fluent style.
   */
  public static class UpdateMaintenanceContractQueryParams extends HashMap<String, Object> {
    public UpdateMaintenanceContractQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMaintenanceContractResponse updateSystemAttributesMaintenanceContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMaintenanceContractRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMaintenanceContract</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMaintenanceContractResponse> updateSystemAttributesMaintenanceContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMaintenanceContractRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMaintenanceContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMaintenanceContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMaintenanceContractResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMaintenanceContractResponse updateSystemAttributesMaintenanceContract(@Param("elid") String elid, UpdateSystemAttributesMaintenanceContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMaintenanceContractQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMaintenanceContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMaintenanceContractResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMaintenanceContractResponse> updateSystemAttributesMaintenanceContractWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMaintenanceContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMaintenanceContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMaintenanceContract</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMaintenanceContractQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMaintenanceContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
