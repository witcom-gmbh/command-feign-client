package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ActivatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.CreatePlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.CreatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeactivatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeleteAllPositionsPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeleteAllPositionsPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeletePlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeletePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.DeletePositionPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.DeletePositionPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.PlanningProtocolProtocolPositionsRequest;
import com.fntsoftware.businessgateway.entities.PlanningProtocolProtocolPositionsResponse;
import com.fntsoftware.businessgateway.entities.PlanningProtocolQueryRequest;
import com.fntsoftware.businessgateway.entities.PlanningProtocolQueryResponse;
import com.fntsoftware.businessgateway.entities.PlanningProtocolSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PlanningProtocolSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.SetAllPositionsToActualPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.SetAllPositionsToActualPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.SetPositionToActualPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.SetPositionToActualPlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.UpdatePlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePlanningProtocolResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPlanningProtocolRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPlanningProtocolResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
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
