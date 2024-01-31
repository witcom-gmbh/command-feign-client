package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateHypervisorRequestData;
import com.fntsoftware.businessgateway.entities.CreateHypervisorResponse;
import com.fntsoftware.businessgateway.entities.DeleteHypervisorRequestData;
import com.fntsoftware.businessgateway.entities.DeleteHypervisorResponse;
import com.fntsoftware.businessgateway.entities.HypervisorQueryRequest;
import com.fntsoftware.businessgateway.entities.HypervisorQueryResponse;
import com.fntsoftware.businessgateway.entities.HypervisorSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.HypervisorSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateHypervisorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateHypervisorResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesHypervisorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesHypervisorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface HypervisorApi extends ApiClient.Api {


  /**
   * Create
   * Create Hypervisor
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateHypervisorResponse createHypervisor(@Param("sessionId") String sessionId, CreateHypervisorRequestData body);

  /**
   * Create
   * Similar to <code>createHypervisor</code> but it also returns the http response headers .
   * Create Hypervisor
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hypervisor/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateHypervisorResponse> createHypervisorWithHttpInfo(@Param("sessionId") String sessionId, CreateHypervisorRequestData body);


  /**
   * Create
   * Create Hypervisor
   * Note, this is equivalent to the other <code>createHypervisor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateHypervisorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateHypervisorResponse createHypervisor(CreateHypervisorRequestData body, @QueryMap(encoded=true) CreateHypervisorQueryParams queryParams);

  /**
  * Create
  * Create Hypervisor
  * Note, this is equivalent to the other <code>createHypervisor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateHypervisorResponse
      */
      @RequestLine("POST /api/rest/entity/hypervisor/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateHypervisorResponse> createHypervisorWithHttpInfo(CreateHypervisorRequestData body, @QueryMap(encoded=true) CreateHypervisorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createHypervisor</code> method in a fluent style.
   */
  public static class CreateHypervisorQueryParams extends HashMap<String, Object> {
    public CreateHypervisorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Hypervisor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteHypervisorResponse deleteHypervisor(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteHypervisorRequestData body);

  /**
   * Delete
   * Similar to <code>deleteHypervisor</code> but it also returns the http response headers .
   * Delete Hypervisor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteHypervisorResponse> deleteHypervisorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteHypervisorRequestData body);


  /**
   * Delete
   * Delete Hypervisor
   * Note, this is equivalent to the other <code>deleteHypervisor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteHypervisorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteHypervisorResponse deleteHypervisor(@Param("elid") String elid, DeleteHypervisorRequestData body, @QueryMap(encoded=true) DeleteHypervisorQueryParams queryParams);

  /**
  * Delete
  * Delete Hypervisor
  * Note, this is equivalent to the other <code>deleteHypervisor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteHypervisorResponse
      */
      @RequestLine("POST /api/rest/entity/hypervisor/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteHypervisorResponse> deleteHypervisorWithHttpInfo(@Param("elid") String elid, DeleteHypervisorRequestData body, @QueryMap(encoded=true) DeleteHypervisorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteHypervisor</code> method in a fluent style.
   */
  public static class DeleteHypervisorQueryParams extends HashMap<String, Object> {
    public DeleteHypervisorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HypervisorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HypervisorQueryResponse hypervisorQuery(@Param("sessionId") String sessionId, HypervisorQueryRequest body);

  /**
   * Basic query
   * Similar to <code>hypervisorQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hypervisor/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HypervisorQueryResponse> hypervisorQueryWithHttpInfo(@Param("sessionId") String sessionId, HypervisorQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>hypervisorQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HypervisorQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HypervisorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HypervisorQueryResponse hypervisorQuery(HypervisorQueryRequest body, @QueryMap(encoded=true) HypervisorQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>hypervisorQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HypervisorQueryResponse
      */
      @RequestLine("POST /api/rest/entity/hypervisor/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HypervisorQueryResponse> hypervisorQueryWithHttpInfo(HypervisorQueryRequest body, @QueryMap(encoded=true) HypervisorQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hypervisorQuery</code> method in a fluent style.
   */
  public static class HypervisorQueryQueryParams extends HashMap<String, Object> {
    public HypervisorQueryQueryParams sessionId(final String value) {
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
   * @return HypervisorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HypervisorSystemAttributesResponse hypervisorSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, HypervisorSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>hypervisorSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HypervisorSystemAttributesResponse> hypervisorSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HypervisorSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>hypervisorSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HypervisorSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HypervisorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HypervisorSystemAttributesResponse hypervisorSystemAttributes(@Param("elid") String elid, HypervisorSystemAttributesRequest body, @QueryMap(encoded=true) HypervisorSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>hypervisorSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HypervisorSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/hypervisor/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HypervisorSystemAttributesResponse> hypervisorSystemAttributesWithHttpInfo(@Param("elid") String elid, HypervisorSystemAttributesRequest body, @QueryMap(encoded=true) HypervisorSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hypervisorSystemAttributes</code> method in a fluent style.
   */
  public static class HypervisorSystemAttributesQueryParams extends HashMap<String, Object> {
    public HypervisorSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Hypervisor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateHypervisorResponse updateHypervisor(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateHypervisorRequestData body);

  /**
   * Modify
   * Similar to <code>updateHypervisor</code> but it also returns the http response headers .
   * Modify Hypervisor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateHypervisorResponse> updateHypervisorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateHypervisorRequestData body);


  /**
   * Modify
   * Modify Hypervisor
   * Note, this is equivalent to the other <code>updateHypervisor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateHypervisorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateHypervisorResponse updateHypervisor(@Param("elid") String elid, UpdateHypervisorRequestData body, @QueryMap(encoded=true) UpdateHypervisorQueryParams queryParams);

  /**
  * Modify
  * Modify Hypervisor
  * Note, this is equivalent to the other <code>updateHypervisor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateHypervisorResponse
      */
      @RequestLine("POST /api/rest/entity/hypervisor/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateHypervisorResponse> updateHypervisorWithHttpInfo(@Param("elid") String elid, UpdateHypervisorRequestData body, @QueryMap(encoded=true) UpdateHypervisorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateHypervisor</code> method in a fluent style.
   */
  public static class UpdateHypervisorQueryParams extends HashMap<String, Object> {
    public UpdateHypervisorQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesHypervisorResponse updateSystemAttributesHypervisor(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesHypervisorRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesHypervisor</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesHypervisorResponse> updateSystemAttributesHypervisorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesHypervisorRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesHypervisor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesHypervisorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesHypervisorResponse
   */
  @RequestLine("POST /api/rest/entity/hypervisor/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesHypervisorResponse updateSystemAttributesHypervisor(@Param("elid") String elid, UpdateSystemAttributesHypervisorRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesHypervisorQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesHypervisor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesHypervisorResponse
      */
      @RequestLine("POST /api/rest/entity/hypervisor/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesHypervisorResponse> updateSystemAttributesHypervisorWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesHypervisorRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesHypervisorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesHypervisor</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesHypervisorQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesHypervisorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
