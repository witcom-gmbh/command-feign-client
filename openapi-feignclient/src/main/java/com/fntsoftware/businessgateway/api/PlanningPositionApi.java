package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PlanningPositionPlanningPositionRequest;
import com.fntsoftware.businessgateway.entities.PlanningPositionPlanningPositionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PlanningPositionApi extends ApiClient.Api {


  /**
   * Planning item
   * Query a specific planning item
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PlanningPositionPlanningPositionResponse
   */
  @RequestLine("POST /api/rest/entity/planningPosition/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PlanningPositionPlanningPositionResponse planningPositionPlanningPosition(@Param("sessionId") String sessionId, @Param("elid") String elid, PlanningPositionPlanningPositionRequest body);

  /**
   * Planning item
   * Similar to <code>planningPositionPlanningPosition</code> but it also returns the http response headers .
   * Query a specific planning item
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/planningPosition/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PlanningPositionPlanningPositionResponse> planningPositionPlanningPositionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PlanningPositionPlanningPositionRequest body);


  /**
   * Planning item
   * Query a specific planning item
   * Note, this is equivalent to the other <code>planningPositionPlanningPosition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PlanningPositionPlanningPositionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PlanningPositionPlanningPositionResponse
   */
  @RequestLine("POST /api/rest/entity/planningPosition/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PlanningPositionPlanningPositionResponse planningPositionPlanningPosition(@Param("elid") String elid, PlanningPositionPlanningPositionRequest body, @QueryMap(encoded=true) PlanningPositionPlanningPositionQueryParams queryParams);

  /**
  * Planning item
  * Query a specific planning item
  * Note, this is equivalent to the other <code>planningPositionPlanningPosition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PlanningPositionPlanningPositionResponse
      */
      @RequestLine("POST /api/rest/entity/planningPosition/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PlanningPositionPlanningPositionResponse> planningPositionPlanningPositionWithHttpInfo(@Param("elid") String elid, PlanningPositionPlanningPositionRequest body, @QueryMap(encoded=true) PlanningPositionPlanningPositionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>planningPositionPlanningPosition</code> method in a fluent style.
   */
  public static class PlanningPositionPlanningPositionQueryParams extends HashMap<String, Object> {
    public PlanningPositionPlanningPositionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
