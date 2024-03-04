package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ActivatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.CreatePlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.CreatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeactivateForAllLoggedInUsersPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeactivatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeleteAllPositionsPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeleteAllPositionsPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeletePlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeletePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeletePositionPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeletePositionPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeletePositionsPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeletePositionsPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.PlanningProtocolProtocolPositionsRequest;
import com.fntsoftware.businessgateway.entities.PlanningProtocolProtocolPositionsResponse;
import com.fntsoftware.businessgateway.entities.PlanningProtocolQueryRequest;
import com.fntsoftware.businessgateway.entities.PlanningProtocolQueryResponse;
import com.fntsoftware.businessgateway.entities.PlanningProtocolSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PlanningProtocolSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ReassignAllPositionPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllPositionPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.ReassignPositionPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.ReassignPositionPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.SetAllPositionsToActualPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.SetAllPositionsToActualPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.SetPositionToActualPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.SetPositionToActualPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.SetPositionWorkOrderStatusPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.SetPositionWorkOrderStatusPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.SetPositionsToActualPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.SetPositionsToActualPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.UpdatePlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPlanningProtocolResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PlanningProtocolApi extends ApiClient.Api {


  /**
   * Activate
   * Activates the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return ActivatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/activate?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ActivatePlanningProtocolResponse activatePlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Activate
   * Similar to <code>activatePlanningProtocol</code> but it also returns the http response headers .
   * Activates the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/activate?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ActivatePlanningProtocolResponse> activatePlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Activate
   * Activates the protocol
   * Note, this is equivalent to the other <code>activatePlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActivatePlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ActivatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/activate?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ActivatePlanningProtocolResponse activatePlanningProtocol(@Param("elid") String elid, Object body, @QueryMap(encoded=true) ActivatePlanningProtocolQueryParams queryParams);

  /**
  * Activate
  * Activates the protocol
  * Note, this is equivalent to the other <code>activatePlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ActivatePlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/activate?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ActivatePlanningProtocolResponse> activatePlanningProtocolWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) ActivatePlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>activatePlanningProtocol</code> method in a fluent style.
   */
  public static class ActivatePlanningProtocolQueryParams extends HashMap<String, Object> {
    public ActivatePlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Planning
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePlanningProtocolResponse createPlanningProtocol(@Param("sessionId") String sessionId, CreatePlanningProtocolRequestData body);

  /**
   * Create
   * Similar to <code>createPlanningProtocol</code> but it also returns the http response headers .
   * Create Planning
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePlanningProtocolResponse> createPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, CreatePlanningProtocolRequestData body);


  /**
   * Create
   * Create Planning
   * Note, this is equivalent to the other <code>createPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePlanningProtocolResponse createPlanningProtocol(CreatePlanningProtocolRequestData body, @QueryMap(encoded=true) CreatePlanningProtocolQueryParams queryParams);

  /**
  * Create
  * Create Planning
  * Note, this is equivalent to the other <code>createPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePlanningProtocolResponse> createPlanningProtocolWithHttpInfo(CreatePlanningProtocolRequestData body, @QueryMap(encoded=true) CreatePlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPlanningProtocol</code> method in a fluent style.
   */
  public static class CreatePlanningProtocolQueryParams extends HashMap<String, Object> {
    public CreatePlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Deactivate for all logged-in users
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return DeactivateForAllLoggedInUsersPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivateForAllLoggedInUsers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeactivateForAllLoggedInUsersPlanningProtocolResponse deactivateForAllLoggedInUsersPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Deactivate for all logged-in users
   * Similar to <code>deactivateForAllLoggedInUsersPlanningProtocol</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivateForAllLoggedInUsers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeactivateForAllLoggedInUsersPlanningProtocolResponse> deactivateForAllLoggedInUsersPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Deactivate for all logged-in users
   * 
   * Note, this is equivalent to the other <code>deactivateForAllLoggedInUsersPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeactivateForAllLoggedInUsersPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeactivateForAllLoggedInUsersPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivateForAllLoggedInUsers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeactivateForAllLoggedInUsersPlanningProtocolResponse deactivateForAllLoggedInUsersPlanningProtocol(@Param("elid") String elid, Object body, @QueryMap(encoded=true) DeactivateForAllLoggedInUsersPlanningProtocolQueryParams queryParams);

  /**
  * Deactivate for all logged-in users
  * 
  * Note, this is equivalent to the other <code>deactivateForAllLoggedInUsersPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeactivateForAllLoggedInUsersPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivateForAllLoggedInUsers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeactivateForAllLoggedInUsersPlanningProtocolResponse> deactivateForAllLoggedInUsersPlanningProtocolWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) DeactivateForAllLoggedInUsersPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deactivateForAllLoggedInUsersPlanningProtocol</code> method in a fluent style.
   */
  public static class DeactivateForAllLoggedInUsersPlanningProtocolQueryParams extends HashMap<String, Object> {
    public DeactivateForAllLoggedInUsersPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Deactivate
   * Deactivates the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return DeactivatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivate?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeactivatePlanningProtocolResponse deactivatePlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Deactivate
   * Similar to <code>deactivatePlanningProtocol</code> but it also returns the http response headers .
   * Deactivates the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivate?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeactivatePlanningProtocolResponse> deactivatePlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Deactivate
   * Deactivates the protocol
   * Note, this is equivalent to the other <code>deactivatePlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeactivatePlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeactivatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivate?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeactivatePlanningProtocolResponse deactivatePlanningProtocol(@Param("elid") String elid, Object body, @QueryMap(encoded=true) DeactivatePlanningProtocolQueryParams queryParams);

  /**
  * Deactivate
  * Deactivates the protocol
  * Note, this is equivalent to the other <code>deactivatePlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeactivatePlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deactivate?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeactivatePlanningProtocolResponse> deactivatePlanningProtocolWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) DeactivatePlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deactivatePlanningProtocol</code> method in a fluent style.
   */
  public static class DeactivatePlanningProtocolQueryParams extends HashMap<String, Object> {
    public DeactivatePlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete all positions
   * Deletes all positions from the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteAllPositionsPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deleteAllPositions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteAllPositionsPlanningProtocolResponse deleteAllPositionsPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAllPositionsPlanningProtocolRequestData body);

  /**
   * Delete all positions
   * Similar to <code>deleteAllPositionsPlanningProtocol</code> but it also returns the http response headers .
   * Deletes all positions from the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deleteAllPositions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteAllPositionsPlanningProtocolResponse> deleteAllPositionsPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAllPositionsPlanningProtocolRequestData body);


  /**
   * Delete all positions
   * Deletes all positions from the protocol
   * Note, this is equivalent to the other <code>deleteAllPositionsPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAllPositionsPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteAllPositionsPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deleteAllPositions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteAllPositionsPlanningProtocolResponse deleteAllPositionsPlanningProtocol(@Param("elid") String elid, DeleteAllPositionsPlanningProtocolRequestData body, @QueryMap(encoded=true) DeleteAllPositionsPlanningProtocolQueryParams queryParams);

  /**
  * Delete all positions
  * Deletes all positions from the protocol
  * Note, this is equivalent to the other <code>deleteAllPositionsPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteAllPositionsPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deleteAllPositions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteAllPositionsPlanningProtocolResponse> deleteAllPositionsPlanningProtocolWithHttpInfo(@Param("elid") String elid, DeleteAllPositionsPlanningProtocolRequestData body, @QueryMap(encoded=true) DeleteAllPositionsPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAllPositionsPlanningProtocol</code> method in a fluent style.
   */
  public static class DeleteAllPositionsPlanningProtocolQueryParams extends HashMap<String, Object> {
    public DeleteAllPositionsPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Planning
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePlanningProtocolResponse deletePlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePlanningProtocolRequestData body);

  /**
   * Delete
   * Similar to <code>deletePlanningProtocol</code> but it also returns the http response headers .
   * Delete Planning
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePlanningProtocolResponse> deletePlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePlanningProtocolRequestData body);


  /**
   * Delete
   * Delete Planning
   * Note, this is equivalent to the other <code>deletePlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePlanningProtocolResponse deletePlanningProtocol(@Param("elid") String elid, DeletePlanningProtocolRequestData body, @QueryMap(encoded=true) DeletePlanningProtocolQueryParams queryParams);

  /**
  * Delete
  * Delete Planning
  * Note, this is equivalent to the other <code>deletePlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePlanningProtocolResponse> deletePlanningProtocolWithHttpInfo(@Param("elid") String elid, DeletePlanningProtocolRequestData body, @QueryMap(encoded=true) DeletePlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePlanningProtocol</code> method in a fluent style.
   */
  public static class DeletePlanningProtocolQueryParams extends HashMap<String, Object> {
    public DeletePlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete position
   * Deletes position from the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePositionPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePosition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePositionPlanningProtocolResponse deletePositionPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePositionPlanningProtocolRequestData body);

  /**
   * Delete position
   * Similar to <code>deletePositionPlanningProtocol</code> but it also returns the http response headers .
   * Deletes position from the protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePosition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePositionPlanningProtocolResponse> deletePositionPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePositionPlanningProtocolRequestData body);


  /**
   * Delete position
   * Deletes position from the protocol
   * Note, this is equivalent to the other <code>deletePositionPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePositionPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePositionPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePosition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePositionPlanningProtocolResponse deletePositionPlanningProtocol(@Param("elid") String elid, DeletePositionPlanningProtocolRequestData body, @QueryMap(encoded=true) DeletePositionPlanningProtocolQueryParams queryParams);

  /**
  * Delete position
  * Deletes position from the protocol
  * Note, this is equivalent to the other <code>deletePositionPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePositionPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePosition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePositionPlanningProtocolResponse> deletePositionPlanningProtocolWithHttpInfo(@Param("elid") String elid, DeletePositionPlanningProtocolRequestData body, @QueryMap(encoded=true) DeletePositionPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePositionPlanningProtocol</code> method in a fluent style.
   */
  public static class DeletePositionPlanningProtocolQueryParams extends HashMap<String, Object> {
    public DeletePositionPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete positions
   * Deletes positions from the log
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePositionsPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePositions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePositionsPlanningProtocolResponse deletePositionsPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePositionsPlanningProtocolRequestData body);

  /**
   * Delete positions
   * Similar to <code>deletePositionsPlanningProtocol</code> but it also returns the http response headers .
   * Deletes positions from the log
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePositions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePositionsPlanningProtocolResponse> deletePositionsPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePositionsPlanningProtocolRequestData body);


  /**
   * Delete positions
   * Deletes positions from the log
   * Note, this is equivalent to the other <code>deletePositionsPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePositionsPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePositionsPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePositions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePositionsPlanningProtocolResponse deletePositionsPlanningProtocol(@Param("elid") String elid, DeletePositionsPlanningProtocolRequestData body, @QueryMap(encoded=true) DeletePositionsPlanningProtocolQueryParams queryParams);

  /**
  * Delete positions
  * Deletes positions from the log
  * Note, this is equivalent to the other <code>deletePositionsPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePositionsPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/deletePositions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePositionsPlanningProtocolResponse> deletePositionsPlanningProtocolWithHttpInfo(@Param("elid") String elid, DeletePositionsPlanningProtocolRequestData body, @QueryMap(encoded=true) DeletePositionsPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePositionsPlanningProtocol</code> method in a fluent style.
   */
  public static class DeletePositionsPlanningProtocolQueryParams extends HashMap<String, Object> {
    public DeletePositionsPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Positions
   * Query positions from protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PlanningProtocolProtocolPositionsResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/ProtocolPositions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlanningProtocolProtocolPositionsResponse planningProtocolProtocolPositions(@Param("sessionId") String sessionId, @Param("elid") String elid, PlanningProtocolProtocolPositionsRequest body);

  /**
   * Positions
   * Similar to <code>planningProtocolProtocolPositions</code> but it also returns the http response headers .
   * Query positions from protocol
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/ProtocolPositions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlanningProtocolProtocolPositionsResponse> planningProtocolProtocolPositionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PlanningProtocolProtocolPositionsRequest body);


  /**
   * Positions
   * Query positions from protocol
   * Note, this is equivalent to the other <code>planningProtocolProtocolPositions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlanningProtocolProtocolPositionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlanningProtocolProtocolPositionsResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/ProtocolPositions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlanningProtocolProtocolPositionsResponse planningProtocolProtocolPositions(@Param("elid") String elid, PlanningProtocolProtocolPositionsRequest body, @QueryMap(encoded=true) PlanningProtocolProtocolPositionsQueryParams queryParams);

  /**
  * Positions
  * Query positions from protocol
  * Note, this is equivalent to the other <code>planningProtocolProtocolPositions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlanningProtocolProtocolPositionsResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/ProtocolPositions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlanningProtocolProtocolPositionsResponse> planningProtocolProtocolPositionsWithHttpInfo(@Param("elid") String elid, PlanningProtocolProtocolPositionsRequest body, @QueryMap(encoded=true) PlanningProtocolProtocolPositionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>planningProtocolProtocolPositions</code> method in a fluent style.
   */
  public static class PlanningProtocolProtocolPositionsQueryParams extends HashMap<String, Object> {
    public PlanningProtocolProtocolPositionsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PlanningProtocolQueryResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlanningProtocolQueryResponse planningProtocolQuery(@Param("sessionId") String sessionId, PlanningProtocolQueryRequest body);

  /**
   * Basic query
   * Similar to <code>planningProtocolQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlanningProtocolQueryResponse> planningProtocolQueryWithHttpInfo(@Param("sessionId") String sessionId, PlanningProtocolQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>planningProtocolQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlanningProtocolQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlanningProtocolQueryResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlanningProtocolQueryResponse planningProtocolQuery(PlanningProtocolQueryRequest body, @QueryMap(encoded=true) PlanningProtocolQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>planningProtocolQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlanningProtocolQueryResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlanningProtocolQueryResponse> planningProtocolQueryWithHttpInfo(PlanningProtocolQueryRequest body, @QueryMap(encoded=true) PlanningProtocolQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>planningProtocolQuery</code> method in a fluent style.
   */
  public static class PlanningProtocolQueryQueryParams extends HashMap<String, Object> {
    public PlanningProtocolQueryQueryParams sessionId(final String value) {
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
   * @return PlanningProtocolSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlanningProtocolSystemAttributesResponse planningProtocolSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PlanningProtocolSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>planningProtocolSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlanningProtocolSystemAttributesResponse> planningProtocolSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PlanningProtocolSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>planningProtocolSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlanningProtocolSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlanningProtocolSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlanningProtocolSystemAttributesResponse planningProtocolSystemAttributes(@Param("elid") String elid, PlanningProtocolSystemAttributesRequest body, @QueryMap(encoded=true) PlanningProtocolSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>planningProtocolSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlanningProtocolSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlanningProtocolSystemAttributesResponse> planningProtocolSystemAttributesWithHttpInfo(@Param("elid") String elid, PlanningProtocolSystemAttributesRequest body, @QueryMap(encoded=true) PlanningProtocolSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>planningProtocolSystemAttributes</code> method in a fluent style.
   */
  public static class PlanningProtocolSystemAttributesQueryParams extends HashMap<String, Object> {
    public PlanningProtocolSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign All positions
   * Reassign All positions
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAllPositionPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignAllPosition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllPositionPlanningProtocolResponse reassignAllPositionPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllPositionPlanningProtocolRequestData body);

  /**
   * Reassign All positions
   * Similar to <code>reassignAllPositionPlanningProtocol</code> but it also returns the http response headers .
   * Reassign All positions
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignAllPosition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllPositionPlanningProtocolResponse> reassignAllPositionPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllPositionPlanningProtocolRequestData body);


  /**
   * Reassign All positions
   * Reassign All positions
   * Note, this is equivalent to the other <code>reassignAllPositionPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllPositionPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllPositionPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignAllPosition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllPositionPlanningProtocolResponse reassignAllPositionPlanningProtocol(@Param("elid") String elid, ReassignAllPositionPlanningProtocolRequestData body, @QueryMap(encoded=true) ReassignAllPositionPlanningProtocolQueryParams queryParams);

  /**
  * Reassign All positions
  * Reassign All positions
  * Note, this is equivalent to the other <code>reassignAllPositionPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllPositionPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignAllPosition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllPositionPlanningProtocolResponse> reassignAllPositionPlanningProtocolWithHttpInfo(@Param("elid") String elid, ReassignAllPositionPlanningProtocolRequestData body, @QueryMap(encoded=true) ReassignAllPositionPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllPositionPlanningProtocol</code> method in a fluent style.
   */
  public static class ReassignAllPositionPlanningProtocolQueryParams extends HashMap<String, Object> {
    public ReassignAllPositionPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign Position
   * Reassign Position
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignPositionPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignPosition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignPositionPlanningProtocolResponse reassignPositionPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignPositionPlanningProtocolRequestData body);

  /**
   * Reassign Position
   * Similar to <code>reassignPositionPlanningProtocol</code> but it also returns the http response headers .
   * Reassign Position
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignPosition?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignPositionPlanningProtocolResponse> reassignPositionPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignPositionPlanningProtocolRequestData body);


  /**
   * Reassign Position
   * Reassign Position
   * Note, this is equivalent to the other <code>reassignPositionPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignPositionPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignPositionPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignPosition?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignPositionPlanningProtocolResponse reassignPositionPlanningProtocol(@Param("elid") String elid, ReassignPositionPlanningProtocolRequestData body, @QueryMap(encoded=true) ReassignPositionPlanningProtocolQueryParams queryParams);

  /**
  * Reassign Position
  * Reassign Position
  * Note, this is equivalent to the other <code>reassignPositionPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignPositionPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/reassignPosition?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignPositionPlanningProtocolResponse> reassignPositionPlanningProtocolWithHttpInfo(@Param("elid") String elid, ReassignPositionPlanningProtocolRequestData body, @QueryMap(encoded=true) ReassignPositionPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignPositionPlanningProtocol</code> method in a fluent style.
   */
  public static class ReassignPositionPlanningProtocolQueryParams extends HashMap<String, Object> {
    public ReassignPositionPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * All positions plan -&gt; actual
   * Modifies all positions from plan to actual
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SetAllPositionsToActualPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setAllPositionsToActual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SetAllPositionsToActualPlanningProtocolResponse setAllPositionsToActualPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, SetAllPositionsToActualPlanningProtocolRequestData body);

  /**
   * All positions plan -&gt; actual
   * Similar to <code>setAllPositionsToActualPlanningProtocol</code> but it also returns the http response headers .
   * Modifies all positions from plan to actual
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setAllPositionsToActual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SetAllPositionsToActualPlanningProtocolResponse> setAllPositionsToActualPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SetAllPositionsToActualPlanningProtocolRequestData body);


  /**
   * All positions plan -&gt; actual
   * Modifies all positions from plan to actual
   * Note, this is equivalent to the other <code>setAllPositionsToActualPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SetAllPositionsToActualPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SetAllPositionsToActualPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setAllPositionsToActual?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SetAllPositionsToActualPlanningProtocolResponse setAllPositionsToActualPlanningProtocol(@Param("elid") String elid, SetAllPositionsToActualPlanningProtocolRequestData body, @QueryMap(encoded=true) SetAllPositionsToActualPlanningProtocolQueryParams queryParams);

  /**
  * All positions plan -&gt; actual
  * Modifies all positions from plan to actual
  * Note, this is equivalent to the other <code>setAllPositionsToActualPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SetAllPositionsToActualPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setAllPositionsToActual?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SetAllPositionsToActualPlanningProtocolResponse> setAllPositionsToActualPlanningProtocolWithHttpInfo(@Param("elid") String elid, SetAllPositionsToActualPlanningProtocolRequestData body, @QueryMap(encoded=true) SetAllPositionsToActualPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>setAllPositionsToActualPlanningProtocol</code> method in a fluent style.
   */
  public static class SetAllPositionsToActualPlanningProtocolQueryParams extends HashMap<String, Object> {
    public SetAllPositionsToActualPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Position plan -&gt; actual
   * Changes position from plan to actual
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SetPositionToActualPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionToActual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SetPositionToActualPlanningProtocolResponse setPositionToActualPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, SetPositionToActualPlanningProtocolRequestData body);

  /**
   * Position plan -&gt; actual
   * Similar to <code>setPositionToActualPlanningProtocol</code> but it also returns the http response headers .
   * Changes position from plan to actual
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionToActual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SetPositionToActualPlanningProtocolResponse> setPositionToActualPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SetPositionToActualPlanningProtocolRequestData body);


  /**
   * Position plan -&gt; actual
   * Changes position from plan to actual
   * Note, this is equivalent to the other <code>setPositionToActualPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SetPositionToActualPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SetPositionToActualPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionToActual?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SetPositionToActualPlanningProtocolResponse setPositionToActualPlanningProtocol(@Param("elid") String elid, SetPositionToActualPlanningProtocolRequestData body, @QueryMap(encoded=true) SetPositionToActualPlanningProtocolQueryParams queryParams);

  /**
  * Position plan -&gt; actual
  * Changes position from plan to actual
  * Note, this is equivalent to the other <code>setPositionToActualPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SetPositionToActualPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionToActual?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SetPositionToActualPlanningProtocolResponse> setPositionToActualPlanningProtocolWithHttpInfo(@Param("elid") String elid, SetPositionToActualPlanningProtocolRequestData body, @QueryMap(encoded=true) SetPositionToActualPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>setPositionToActualPlanningProtocol</code> method in a fluent style.
   */
  public static class SetPositionToActualPlanningProtocolQueryParams extends HashMap<String, Object> {
    public SetPositionToActualPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Work Order Status
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SetPositionWorkOrderStatusPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/setPositionWorkOrderStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SetPositionWorkOrderStatusPlanningProtocolResponse setPositionWorkOrderStatusPlanningProtocol(@Param("sessionId") String sessionId, SetPositionWorkOrderStatusPlanningProtocolRequestData body);

  /**
   * Work Order Status
   * Similar to <code>setPositionWorkOrderStatusPlanningProtocol</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/setPositionWorkOrderStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SetPositionWorkOrderStatusPlanningProtocolResponse> setPositionWorkOrderStatusPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, SetPositionWorkOrderStatusPlanningProtocolRequestData body);


  /**
   * Work Order Status
   * 
   * Note, this is equivalent to the other <code>setPositionWorkOrderStatusPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SetPositionWorkOrderStatusPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SetPositionWorkOrderStatusPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/setPositionWorkOrderStatus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SetPositionWorkOrderStatusPlanningProtocolResponse setPositionWorkOrderStatusPlanningProtocol(SetPositionWorkOrderStatusPlanningProtocolRequestData body, @QueryMap(encoded=true) SetPositionWorkOrderStatusPlanningProtocolQueryParams queryParams);

  /**
  * Work Order Status
  * 
  * Note, this is equivalent to the other <code>setPositionWorkOrderStatusPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SetPositionWorkOrderStatusPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/setPositionWorkOrderStatus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SetPositionWorkOrderStatusPlanningProtocolResponse> setPositionWorkOrderStatusPlanningProtocolWithHttpInfo(SetPositionWorkOrderStatusPlanningProtocolRequestData body, @QueryMap(encoded=true) SetPositionWorkOrderStatusPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>setPositionWorkOrderStatusPlanningProtocol</code> method in a fluent style.
   */
  public static class SetPositionWorkOrderStatusPlanningProtocolQueryParams extends HashMap<String, Object> {
    public SetPositionWorkOrderStatusPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Positions Planned -&gt; Actual
   * Changes positions from Planned to Actual
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SetPositionsToActualPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionsToActual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SetPositionsToActualPlanningProtocolResponse setPositionsToActualPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, SetPositionsToActualPlanningProtocolRequestData body);

  /**
   * Positions Planned -&gt; Actual
   * Similar to <code>setPositionsToActualPlanningProtocol</code> but it also returns the http response headers .
   * Changes positions from Planned to Actual
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionsToActual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SetPositionsToActualPlanningProtocolResponse> setPositionsToActualPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SetPositionsToActualPlanningProtocolRequestData body);


  /**
   * Positions Planned -&gt; Actual
   * Changes positions from Planned to Actual
   * Note, this is equivalent to the other <code>setPositionsToActualPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SetPositionsToActualPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SetPositionsToActualPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionsToActual?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SetPositionsToActualPlanningProtocolResponse setPositionsToActualPlanningProtocol(@Param("elid") String elid, SetPositionsToActualPlanningProtocolRequestData body, @QueryMap(encoded=true) SetPositionsToActualPlanningProtocolQueryParams queryParams);

  /**
  * Positions Planned -&gt; Actual
  * Changes positions from Planned to Actual
  * Note, this is equivalent to the other <code>setPositionsToActualPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SetPositionsToActualPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/setPositionsToActual?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SetPositionsToActualPlanningProtocolResponse> setPositionsToActualPlanningProtocolWithHttpInfo(@Param("elid") String elid, SetPositionsToActualPlanningProtocolRequestData body, @QueryMap(encoded=true) SetPositionsToActualPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>setPositionsToActualPlanningProtocol</code> method in a fluent style.
   */
  public static class SetPositionsToActualPlanningProtocolQueryParams extends HashMap<String, Object> {
    public SetPositionsToActualPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Planning
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePlanningProtocolResponse updatePlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePlanningProtocolRequestData body);

  /**
   * Modify
   * Similar to <code>updatePlanningProtocol</code> but it also returns the http response headers .
   * Modify Planning
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePlanningProtocolResponse> updatePlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePlanningProtocolRequestData body);


  /**
   * Modify
   * Modify Planning
   * Note, this is equivalent to the other <code>updatePlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePlanningProtocolResponse updatePlanningProtocol(@Param("elid") String elid, UpdatePlanningProtocolRequestData body, @QueryMap(encoded=true) UpdatePlanningProtocolQueryParams queryParams);

  /**
  * Modify
  * Modify Planning
  * Note, this is equivalent to the other <code>updatePlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePlanningProtocolResponse> updatePlanningProtocolWithHttpInfo(@Param("elid") String elid, UpdatePlanningProtocolRequestData body, @QueryMap(encoded=true) UpdatePlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePlanningProtocol</code> method in a fluent style.
   */
  public static class UpdatePlanningProtocolQueryParams extends HashMap<String, Object> {
    public UpdatePlanningProtocolQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPlanningProtocolResponse updateSystemAttributesPlanningProtocol(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPlanningProtocolRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPlanningProtocol</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPlanningProtocolResponse> updateSystemAttributesPlanningProtocolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPlanningProtocolRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPlanningProtocol</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPlanningProtocolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPlanningProtocolResponse
   */
  @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPlanningProtocolResponse updateSystemAttributesPlanningProtocol(@Param("elid") String elid, UpdateSystemAttributesPlanningProtocolRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPlanningProtocolQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPlanningProtocol</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPlanningProtocolResponse
      */
      @RequestLine("POST /api/rest/entity/planningProtocol/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPlanningProtocolResponse> updateSystemAttributesPlanningProtocolWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPlanningProtocolRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPlanningProtocolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPlanningProtocol</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPlanningProtocolQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPlanningProtocolQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
