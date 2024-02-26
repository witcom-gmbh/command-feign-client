package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateWorkplaceRequestData;
import com.fntsoftware.businessgateway.entities.CreateWorkplaceResponse;
import com.fntsoftware.businessgateway.entities.DeleteWorkplaceRequestData;
import com.fntsoftware.businessgateway.entities.DeleteWorkplaceResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesWorkplaceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesWorkplaceResponse;
import com.fntsoftware.businessgateway.entities.UpdateWorkplaceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateWorkplaceResponse;
import com.fntsoftware.businessgateway.entities.WorkplaceContractsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceContractsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplaceFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplaceMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplaceMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplaceOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplacePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplacePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplacePersonsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplacePersonsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplaceQueryRequest;
import com.fntsoftware.businessgateway.entities.WorkplaceQueryResponse;
import com.fntsoftware.businessgateway.entities.WorkplaceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.WorkplaceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.WorkplaceTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.WorkplaceVirtualClientsRequestData;
import com.fntsoftware.businessgateway.entities.WorkplaceVirtualClientsResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface WorkplaceApi extends ApiClient.Api {


  /**
   * Create
   * Create Workplace
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateWorkplaceResponse createWorkplace(@Param("sessionId") String sessionId, CreateWorkplaceRequestData body);

  /**
   * Create
   * Similar to <code>createWorkplace</code> but it also returns the http response headers .
   * Create Workplace
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateWorkplaceResponse> createWorkplaceWithHttpInfo(@Param("sessionId") String sessionId, CreateWorkplaceRequestData body);


  /**
   * Create
   * Create Workplace
   * Note, this is equivalent to the other <code>createWorkplace</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateWorkplaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateWorkplaceResponse createWorkplace(CreateWorkplaceRequestData body, @QueryMap(encoded=true) CreateWorkplaceQueryParams queryParams);

  /**
  * Create
  * Create Workplace
  * Note, this is equivalent to the other <code>createWorkplace</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateWorkplaceResponse
      */
      @RequestLine("POST /api/rest/entity/workplace/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateWorkplaceResponse> createWorkplaceWithHttpInfo(CreateWorkplaceRequestData body, @QueryMap(encoded=true) CreateWorkplaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createWorkplace</code> method in a fluent style.
   */
  public static class CreateWorkplaceQueryParams extends HashMap<String, Object> {
    public CreateWorkplaceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Workplace
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteWorkplaceResponse deleteWorkplace(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteWorkplaceRequestData body);

  /**
   * Delete
   * Similar to <code>deleteWorkplace</code> but it also returns the http response headers .
   * Delete Workplace
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteWorkplaceResponse> deleteWorkplaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteWorkplaceRequestData body);


  /**
   * Delete
   * Delete Workplace
   * Note, this is equivalent to the other <code>deleteWorkplace</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteWorkplaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteWorkplaceResponse deleteWorkplace(@Param("elid") String elid, DeleteWorkplaceRequestData body, @QueryMap(encoded=true) DeleteWorkplaceQueryParams queryParams);

  /**
  * Delete
  * Delete Workplace
  * Note, this is equivalent to the other <code>deleteWorkplace</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteWorkplaceResponse
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteWorkplaceResponse> deleteWorkplaceWithHttpInfo(@Param("elid") String elid, DeleteWorkplaceRequestData body, @QueryMap(encoded=true) DeleteWorkplaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteWorkplace</code> method in a fluent style.
   */
  public static class DeleteWorkplaceQueryParams extends HashMap<String, Object> {
    public DeleteWorkplaceQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesWorkplaceResponse updateSystemAttributesWorkplace(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesWorkplaceRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesWorkplace</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesWorkplaceResponse> updateSystemAttributesWorkplaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesWorkplaceRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesWorkplace</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesWorkplaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesWorkplaceResponse updateSystemAttributesWorkplace(@Param("elid") String elid, UpdateSystemAttributesWorkplaceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesWorkplaceQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesWorkplace</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesWorkplaceResponse
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesWorkplaceResponse> updateSystemAttributesWorkplaceWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesWorkplaceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesWorkplaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesWorkplace</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesWorkplaceQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesWorkplaceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Workplace
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateWorkplaceResponse updateWorkplace(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateWorkplaceRequestData body);

  /**
   * Modify
   * Similar to <code>updateWorkplace</code> but it also returns the http response headers .
   * Modify Workplace
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateWorkplaceResponse> updateWorkplaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateWorkplaceRequestData body);


  /**
   * Modify
   * Modify Workplace
   * Note, this is equivalent to the other <code>updateWorkplace</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateWorkplaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateWorkplaceResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateWorkplaceResponse updateWorkplace(@Param("elid") String elid, UpdateWorkplaceRequestData body, @QueryMap(encoded=true) UpdateWorkplaceQueryParams queryParams);

  /**
  * Modify
  * Modify Workplace
  * Note, this is equivalent to the other <code>updateWorkplace</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateWorkplaceResponse
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateWorkplaceResponse> updateWorkplaceWithHttpInfo(@Param("elid") String elid, UpdateWorkplaceRequestData body, @QueryMap(encoded=true) UpdateWorkplaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateWorkplace</code> method in a fluent style.
   */
  public static class UpdateWorkplaceQueryParams extends HashMap<String, Object> {
    public UpdateWorkplaceQueryParams sessionId(final String value) {
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
   * @return WorkplaceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceContractsResponseData workplaceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>workplaceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceContractsResponseData> workplaceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>workplaceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceContractsResponseData workplaceContracts(@Param("elid") String elid, WorkplaceContractsRequestData body, @QueryMap(encoded=true) WorkplaceContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>workplaceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceContractsResponseData> workplaceContractsWithHttpInfo(@Param("elid") String elid, WorkplaceContractsRequestData body, @QueryMap(encoded=true) WorkplaceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceContracts</code> method in a fluent style.
   */
  public static class WorkplaceContractsQueryParams extends HashMap<String, Object> {
    public WorkplaceContractsQueryParams sessionId(final String value) {
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
   * @return WorkplaceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceFrameContractsResponseData workplaceFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>workplaceFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceFrameContractsResponseData> workplaceFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>workplaceFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceFrameContractsResponseData workplaceFrameContracts(@Param("elid") String elid, WorkplaceFrameContractsRequestData body, @QueryMap(encoded=true) WorkplaceFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>workplaceFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceFrameContractsResponseData> workplaceFrameContractsWithHttpInfo(@Param("elid") String elid, WorkplaceFrameContractsRequestData body, @QueryMap(encoded=true) WorkplaceFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceFrameContracts</code> method in a fluent style.
   */
  public static class WorkplaceFrameContractsQueryParams extends HashMap<String, Object> {
    public WorkplaceFrameContractsQueryParams sessionId(final String value) {
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
   * @return WorkplaceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceMaintenanceContractsResponseData workplaceMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>workplaceMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceMaintenanceContractsResponseData> workplaceMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>workplaceMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceMaintenanceContractsResponseData workplaceMaintenanceContracts(@Param("elid") String elid, WorkplaceMaintenanceContractsRequestData body, @QueryMap(encoded=true) WorkplaceMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>workplaceMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceMaintenanceContractsResponseData> workplaceMaintenanceContractsWithHttpInfo(@Param("elid") String elid, WorkplaceMaintenanceContractsRequestData body, @QueryMap(encoded=true) WorkplaceMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceMaintenanceContracts</code> method in a fluent style.
   */
  public static class WorkplaceMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public WorkplaceMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return WorkplaceMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceMaintenanceWindowsResponseData workplaceMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>workplaceMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceMaintenanceWindowsResponseData> workplaceMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>workplaceMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceMaintenanceWindowsResponseData workplaceMaintenanceWindows(@Param("elid") String elid, WorkplaceMaintenanceWindowsRequestData body, @QueryMap(encoded=true) WorkplaceMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>workplaceMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceMaintenanceWindowsResponseData> workplaceMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, WorkplaceMaintenanceWindowsRequestData body, @QueryMap(encoded=true) WorkplaceMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceMaintenanceWindows</code> method in a fluent style.
   */
  public static class WorkplaceMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public WorkplaceMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return WorkplaceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceOrganizationsResponseData workplaceOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>workplaceOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceOrganizationsResponseData> workplaceOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>workplaceOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceOrganizationsResponseData workplaceOrganizations(@Param("elid") String elid, WorkplaceOrganizationsRequestData body, @QueryMap(encoded=true) WorkplaceOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>workplaceOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceOrganizationsResponseData> workplaceOrganizationsWithHttpInfo(@Param("elid") String elid, WorkplaceOrganizationsRequestData body, @QueryMap(encoded=true) WorkplaceOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceOrganizations</code> method in a fluent style.
   */
  public static class WorkplaceOrganizationsQueryParams extends HashMap<String, Object> {
    public WorkplaceOrganizationsQueryParams sessionId(final String value) {
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
   * @return WorkplacePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplacePersonGroupsResponseData workplacePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplacePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>workplacePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplacePersonGroupsResponseData> workplacePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplacePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>workplacePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplacePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplacePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplacePersonGroupsResponseData workplacePersonGroups(@Param("elid") String elid, WorkplacePersonGroupsRequestData body, @QueryMap(encoded=true) WorkplacePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>workplacePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplacePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplacePersonGroupsResponseData> workplacePersonGroupsWithHttpInfo(@Param("elid") String elid, WorkplacePersonGroupsRequestData body, @QueryMap(encoded=true) WorkplacePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplacePersonGroups</code> method in a fluent style.
   */
  public static class WorkplacePersonGroupsQueryParams extends HashMap<String, Object> {
    public WorkplacePersonGroupsQueryParams sessionId(final String value) {
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
   * @return WorkplacePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplacePersonsResponseData workplacePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplacePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>workplacePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplacePersonsResponseData> workplacePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplacePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>workplacePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplacePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplacePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplacePersonsResponseData workplacePersons(@Param("elid") String elid, WorkplacePersonsRequestData body, @QueryMap(encoded=true) WorkplacePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>workplacePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplacePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplacePersonsResponseData> workplacePersonsWithHttpInfo(@Param("elid") String elid, WorkplacePersonsRequestData body, @QueryMap(encoded=true) WorkplacePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplacePersons</code> method in a fluent style.
   */
  public static class WorkplacePersonsQueryParams extends HashMap<String, Object> {
    public WorkplacePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return WorkplaceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceQueryResponse workplaceQuery(@Param("sessionId") String sessionId, WorkplaceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>workplaceQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceQueryResponse> workplaceQueryWithHttpInfo(@Param("sessionId") String sessionId, WorkplaceQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>workplaceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceQueryResponse workplaceQuery(WorkplaceQueryRequest body, @QueryMap(encoded=true) WorkplaceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>workplaceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/workplace/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceQueryResponse> workplaceQueryWithHttpInfo(WorkplaceQueryRequest body, @QueryMap(encoded=true) WorkplaceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceQuery</code> method in a fluent style.
   */
  public static class WorkplaceQueryQueryParams extends HashMap<String, Object> {
    public WorkplaceQueryQueryParams sessionId(final String value) {
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
   * @return WorkplaceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceSystemAttributesResponse workplaceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>workplaceSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceSystemAttributesResponse> workplaceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>workplaceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceSystemAttributesResponse workplaceSystemAttributes(@Param("elid") String elid, WorkplaceSystemAttributesRequest body, @QueryMap(encoded=true) WorkplaceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>workplaceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceSystemAttributesResponse> workplaceSystemAttributesWithHttpInfo(@Param("elid") String elid, WorkplaceSystemAttributesRequest body, @QueryMap(encoded=true) WorkplaceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceSystemAttributes</code> method in a fluent style.
   */
  public static class WorkplaceSystemAttributesQueryParams extends HashMap<String, Object> {
    public WorkplaceSystemAttributesQueryParams sessionId(final String value) {
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
   * @return WorkplaceTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceTerminalsResponseData workplaceTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceTerminalsRequestData body);

  /**
   * Get relations to Terminal entities
   * Similar to <code>workplaceTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceTerminalsResponseData> workplaceTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceTerminalsRequestData body);


  /**
   * Get relations to Terminal entities
   * 
   * Note, this is equivalent to the other <code>workplaceTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/Terminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceTerminalsResponseData workplaceTerminals(@Param("elid") String elid, WorkplaceTerminalsRequestData body, @QueryMap(encoded=true) WorkplaceTerminalsQueryParams queryParams);

  /**
  * Get relations to Terminal entities
  * 
  * Note, this is equivalent to the other <code>workplaceTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/Terminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceTerminalsResponseData> workplaceTerminalsWithHttpInfo(@Param("elid") String elid, WorkplaceTerminalsRequestData body, @QueryMap(encoded=true) WorkplaceTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceTerminals</code> method in a fluent style.
   */
  public static class WorkplaceTerminalsQueryParams extends HashMap<String, Object> {
    public WorkplaceTerminalsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual client entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return WorkplaceVirtualClientsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WorkplaceVirtualClientsResponseData workplaceVirtualClients(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceVirtualClientsRequestData body);

  /**
   * Get relations to Virtual client entities
   * Similar to <code>workplaceVirtualClients</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WorkplaceVirtualClientsResponseData> workplaceVirtualClientsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WorkplaceVirtualClientsRequestData body);


  /**
   * Get relations to Virtual client entities
   * 
   * Note, this is equivalent to the other <code>workplaceVirtualClients</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WorkplaceVirtualClientsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WorkplaceVirtualClientsResponseData
   */
  @RequestLine("POST /api/rest/entity/workplace/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WorkplaceVirtualClientsResponseData workplaceVirtualClients(@Param("elid") String elid, WorkplaceVirtualClientsRequestData body, @QueryMap(encoded=true) WorkplaceVirtualClientsQueryParams queryParams);

  /**
  * Get relations to Virtual client entities
  * 
  * Note, this is equivalent to the other <code>workplaceVirtualClients</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WorkplaceVirtualClientsResponseData
      */
      @RequestLine("POST /api/rest/entity/workplace/{elid}/VirtualClients?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WorkplaceVirtualClientsResponseData> workplaceVirtualClientsWithHttpInfo(@Param("elid") String elid, WorkplaceVirtualClientsRequestData body, @QueryMap(encoded=true) WorkplaceVirtualClientsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>workplaceVirtualClients</code> method in a fluent style.
   */
  public static class WorkplaceVirtualClientsQueryParams extends HashMap<String, Object> {
    public WorkplaceVirtualClientsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
