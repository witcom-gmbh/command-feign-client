package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateLifecycleRequestData;
import com.fntsoftware.businessgateway.entities.CreateLifecycleResponse;
import com.fntsoftware.businessgateway.entities.DeleteLifecycleRequestData;
import com.fntsoftware.businessgateway.entities.DeleteLifecycleResponse;
import com.fntsoftware.businessgateway.entities.LifecycleDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.LifecycleDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.LifecycleLifecyclePhasesRequest;
import com.fntsoftware.businessgateway.entities.LifecycleLifecyclePhasesResponse;
import com.fntsoftware.businessgateway.entities.LifecycleQueryActivePhaseRequest;
import com.fntsoftware.businessgateway.entities.LifecycleQueryActivePhaseResponse;
import com.fntsoftware.businessgateway.entities.LifecycleQueryRequest;
import com.fntsoftware.businessgateway.entities.LifecycleQueryResponse;
import com.fntsoftware.businessgateway.entities.LifecycleSoftwareProductsRequestData;
import com.fntsoftware.businessgateway.entities.LifecycleSoftwareProductsResponseData;
import com.fntsoftware.businessgateway.entities.LifecycleSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LifecycleSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLifecycleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface LifecycleApi extends ApiClient.Api {


  /**
   * Create
   * Create lifecycle
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateLifecycleResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLifecycleResponse createLifecycle(@Param("sessionId") String sessionId, CreateLifecycleRequestData body);

  /**
   * Create
   * Similar to <code>createLifecycle</code> but it also returns the http response headers .
   * Create lifecycle
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLifecycleResponse> createLifecycleWithHttpInfo(@Param("sessionId") String sessionId, CreateLifecycleRequestData body);


  /**
   * Create
   * Create lifecycle
   * Note, this is equivalent to the other <code>createLifecycle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLifecycleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLifecycleResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLifecycleResponse createLifecycle(CreateLifecycleRequestData body, @QueryMap(encoded=true) CreateLifecycleQueryParams queryParams);

  /**
  * Create
  * Create lifecycle
  * Note, this is equivalent to the other <code>createLifecycle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLifecycleResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLifecycleResponse> createLifecycleWithHttpInfo(CreateLifecycleRequestData body, @QueryMap(encoded=true) CreateLifecycleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLifecycle</code> method in a fluent style.
   */
  public static class CreateLifecycleQueryParams extends HashMap<String, Object> {
    public CreateLifecycleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete lifecycle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteLifecycleResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteLifecycleResponse deleteLifecycle(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLifecycleRequestData body);

  /**
   * Delete
   * Similar to <code>deleteLifecycle</code> but it also returns the http response headers .
   * Delete lifecycle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteLifecycleResponse> deleteLifecycleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLifecycleRequestData body);


  /**
   * Delete
   * Delete lifecycle
   * Note, this is equivalent to the other <code>deleteLifecycle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLifecycleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteLifecycleResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteLifecycleResponse deleteLifecycle(@Param("elid") String elid, DeleteLifecycleRequestData body, @QueryMap(encoded=true) DeleteLifecycleQueryParams queryParams);

  /**
  * Delete
  * Delete lifecycle
  * Note, this is equivalent to the other <code>deleteLifecycle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteLifecycleResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteLifecycleResponse> deleteLifecycleWithHttpInfo(@Param("elid") String elid, DeleteLifecycleRequestData body, @QueryMap(encoded=true) DeleteLifecycleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLifecycle</code> method in a fluent style.
   */
  public static class DeleteLifecycleQueryParams extends HashMap<String, Object> {
    public DeleteLifecycleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LifecycleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifecycleDeviceMasterResponseData lifecycleDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>lifecycleDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifecycleDeviceMasterResponseData> lifecycleDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>lifecycleDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LifecycleDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LifecycleDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LifecycleDeviceMasterResponseData lifecycleDeviceMaster(@Param("elid") String elid, LifecycleDeviceMasterRequestData body, @QueryMap(encoded=true) LifecycleDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>lifecycleDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LifecycleDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/lifecycle/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LifecycleDeviceMasterResponseData> lifecycleDeviceMasterWithHttpInfo(@Param("elid") String elid, LifecycleDeviceMasterRequestData body, @QueryMap(encoded=true) LifecycleDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lifecycleDeviceMaster</code> method in a fluent style.
   */
  public static class LifecycleDeviceMasterQueryParams extends HashMap<String, Object> {
    public LifecycleDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Lifecycle phases
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LifecycleLifecyclePhasesResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/LifecyclePhases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifecycleLifecyclePhasesResponse lifecycleLifecyclePhases(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleLifecyclePhasesRequest body);

  /**
   * Lifecycle phases
   * Similar to <code>lifecycleLifecyclePhases</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/LifecyclePhases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifecycleLifecyclePhasesResponse> lifecycleLifecyclePhasesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleLifecyclePhasesRequest body);


  /**
   * Lifecycle phases
   * 
   * Note, this is equivalent to the other <code>lifecycleLifecyclePhases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LifecycleLifecyclePhasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LifecycleLifecyclePhasesResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/LifecyclePhases?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LifecycleLifecyclePhasesResponse lifecycleLifecyclePhases(@Param("elid") String elid, LifecycleLifecyclePhasesRequest body, @QueryMap(encoded=true) LifecycleLifecyclePhasesQueryParams queryParams);

  /**
  * Lifecycle phases
  * 
  * Note, this is equivalent to the other <code>lifecycleLifecyclePhases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LifecycleLifecyclePhasesResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/{elid}/LifecyclePhases?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LifecycleLifecyclePhasesResponse> lifecycleLifecyclePhasesWithHttpInfo(@Param("elid") String elid, LifecycleLifecyclePhasesRequest body, @QueryMap(encoded=true) LifecycleLifecyclePhasesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lifecycleLifecyclePhases</code> method in a fluent style.
   */
  public static class LifecycleLifecyclePhasesQueryParams extends HashMap<String, Object> {
    public LifecycleLifecyclePhasesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LifecycleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifecycleQueryResponse lifecycleQuery(@Param("sessionId") String sessionId, LifecycleQueryRequest body);

  /**
   * Basic query
   * Similar to <code>lifecycleQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifecycleQueryResponse> lifecycleQueryWithHttpInfo(@Param("sessionId") String sessionId, LifecycleQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>lifecycleQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LifecycleQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LifecycleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LifecycleQueryResponse lifecycleQuery(LifecycleQueryRequest body, @QueryMap(encoded=true) LifecycleQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>lifecycleQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LifecycleQueryResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LifecycleQueryResponse> lifecycleQueryWithHttpInfo(LifecycleQueryRequest body, @QueryMap(encoded=true) LifecycleQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lifecycleQuery</code> method in a fluent style.
   */
  public static class LifecycleQueryQueryParams extends HashMap<String, Object> {
    public LifecycleQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Active phase
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LifecycleQueryActivePhaseResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/queryActivePhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifecycleQueryActivePhaseResponse lifecycleQueryActivePhase(@Param("sessionId") String sessionId, LifecycleQueryActivePhaseRequest body);

  /**
   * Active phase
   * Similar to <code>lifecycleQueryActivePhase</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/queryActivePhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifecycleQueryActivePhaseResponse> lifecycleQueryActivePhaseWithHttpInfo(@Param("sessionId") String sessionId, LifecycleQueryActivePhaseRequest body);


  /**
   * Active phase
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>lifecycleQueryActivePhase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LifecycleQueryActivePhaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LifecycleQueryActivePhaseResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/queryActivePhase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LifecycleQueryActivePhaseResponse lifecycleQueryActivePhase(LifecycleQueryActivePhaseRequest body, @QueryMap(encoded=true) LifecycleQueryActivePhaseQueryParams queryParams);

  /**
  * Active phase
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>lifecycleQueryActivePhase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LifecycleQueryActivePhaseResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/queryActivePhase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LifecycleQueryActivePhaseResponse> lifecycleQueryActivePhaseWithHttpInfo(LifecycleQueryActivePhaseRequest body, @QueryMap(encoded=true) LifecycleQueryActivePhaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lifecycleQueryActivePhase</code> method in a fluent style.
   */
  public static class LifecycleQueryActivePhaseQueryParams extends HashMap<String, Object> {
    public LifecycleQueryActivePhaseQueryParams sessionId(final String value) {
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
   * @return LifecycleSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifecycleSoftwareProductsResponseData lifecycleSoftwareProducts(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleSoftwareProductsRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>lifecycleSoftwareProducts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifecycleSoftwareProductsResponseData> lifecycleSoftwareProductsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleSoftwareProductsRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>lifecycleSoftwareProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LifecycleSoftwareProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LifecycleSoftwareProductsResponseData
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SoftwareProducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LifecycleSoftwareProductsResponseData lifecycleSoftwareProducts(@Param("elid") String elid, LifecycleSoftwareProductsRequestData body, @QueryMap(encoded=true) LifecycleSoftwareProductsQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>lifecycleSoftwareProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LifecycleSoftwareProductsResponseData
      */
      @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SoftwareProducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LifecycleSoftwareProductsResponseData> lifecycleSoftwareProductsWithHttpInfo(@Param("elid") String elid, LifecycleSoftwareProductsRequestData body, @QueryMap(encoded=true) LifecycleSoftwareProductsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lifecycleSoftwareProducts</code> method in a fluent style.
   */
  public static class LifecycleSoftwareProductsQueryParams extends HashMap<String, Object> {
    public LifecycleSoftwareProductsQueryParams sessionId(final String value) {
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
   * @return LifecycleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifecycleSystemAttributesResponse lifecycleSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>lifecycleSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifecycleSystemAttributesResponse> lifecycleSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LifecycleSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>lifecycleSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LifecycleSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LifecycleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LifecycleSystemAttributesResponse lifecycleSystemAttributes(@Param("elid") String elid, LifecycleSystemAttributesRequest body, @QueryMap(encoded=true) LifecycleSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>lifecycleSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LifecycleSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LifecycleSystemAttributesResponse> lifecycleSystemAttributesWithHttpInfo(@Param("elid") String elid, LifecycleSystemAttributesRequest body, @QueryMap(encoded=true) LifecycleSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lifecycleSystemAttributes</code> method in a fluent style.
   */
  public static class LifecycleSystemAttributesQueryParams extends HashMap<String, Object> {
    public LifecycleSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify lifecycle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateLifecycleResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLifecycleResponse updateLifecycle(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLifecycleRequestData body);

  /**
   * Modify
   * Similar to <code>updateLifecycle</code> but it also returns the http response headers .
   * Modify lifecycle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLifecycleResponse> updateLifecycleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLifecycleRequestData body);


  /**
   * Modify
   * Modify lifecycle
   * Note, this is equivalent to the other <code>updateLifecycle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLifecycleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLifecycleResponse
   */
  @RequestLine("POST /api/rest/entity/lifecycle/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLifecycleResponse updateLifecycle(@Param("elid") String elid, UpdateLifecycleRequestData body, @QueryMap(encoded=true) UpdateLifecycleQueryParams queryParams);

  /**
  * Modify
  * Modify lifecycle
  * Note, this is equivalent to the other <code>updateLifecycle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLifecycleResponse
      */
      @RequestLine("POST /api/rest/entity/lifecycle/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLifecycleResponse> updateLifecycleWithHttpInfo(@Param("elid") String elid, UpdateLifecycleRequestData body, @QueryMap(encoded=true) UpdateLifecycleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLifecycle</code> method in a fluent style.
   */
  public static class UpdateLifecycleQueryParams extends HashMap<String, Object> {
    public UpdateLifecycleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
