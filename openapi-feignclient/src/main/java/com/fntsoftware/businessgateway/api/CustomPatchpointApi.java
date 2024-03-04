package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomPatchpointRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomPatchpointResponse;
import com.fntsoftware.businessgateway.entities.CustomPatchpointQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomPatchpointQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomPatchpointSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomPatchpointSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomPatchpointRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomPatchpointResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomPatchpointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomPatchpointResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomPatchpointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomPatchpointResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CustomPatchpointApi extends ApiClient.Api {


  /**
   * Create
   * Create Patchpoint
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomPatchpointResponse createCustomPatchpoint(@Param("sessionId") String sessionId, CreateCustomPatchpointRequestData body);

  /**
   * Create
   * Similar to <code>createCustomPatchpoint</code> but it also returns the http response headers .
   * Create Patchpoint
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomPatchpointResponse> createCustomPatchpointWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomPatchpointRequestData body);


  /**
   * Create
   * Create Patchpoint
   * Note, this is equivalent to the other <code>createCustomPatchpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomPatchpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomPatchpointResponse createCustomPatchpoint(CreateCustomPatchpointRequestData body, @QueryMap(encoded=true) CreateCustomPatchpointQueryParams queryParams);

  /**
  * Create
  * Create Patchpoint
  * Note, this is equivalent to the other <code>createCustomPatchpoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomPatchpointResponse
      */
      @RequestLine("POST /api/rest/entity/custom/patchpoint/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomPatchpointResponse> createCustomPatchpointWithHttpInfo(CreateCustomPatchpointRequestData body, @QueryMap(encoded=true) CreateCustomPatchpointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomPatchpoint</code> method in a fluent style.
   */
  public static class CreateCustomPatchpointQueryParams extends HashMap<String, Object> {
    public CreateCustomPatchpointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomPatchpointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomPatchpointQueryResponse customPatchpointQuery(@Param("sessionId") String sessionId, CustomPatchpointQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customPatchpointQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomPatchpointQueryResponse> customPatchpointQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomPatchpointQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customPatchpointQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomPatchpointQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomPatchpointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomPatchpointQueryResponse customPatchpointQuery(CustomPatchpointQueryRequest body, @QueryMap(encoded=true) CustomPatchpointQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customPatchpointQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomPatchpointQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/patchpoint/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomPatchpointQueryResponse> customPatchpointQueryWithHttpInfo(CustomPatchpointQueryRequest body, @QueryMap(encoded=true) CustomPatchpointQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customPatchpointQuery</code> method in a fluent style.
   */
  public static class CustomPatchpointQueryQueryParams extends HashMap<String, Object> {
    public CustomPatchpointQueryQueryParams sessionId(final String value) {
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
   * @return CustomPatchpointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomPatchpointSystemAttributesResponse customPatchpointSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPatchpointSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customPatchpointSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomPatchpointSystemAttributesResponse> customPatchpointSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPatchpointSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customPatchpointSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomPatchpointSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomPatchpointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomPatchpointSystemAttributesResponse customPatchpointSystemAttributes(@Param("elid") String elid, CustomPatchpointSystemAttributesRequest body, @QueryMap(encoded=true) CustomPatchpointSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customPatchpointSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomPatchpointSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomPatchpointSystemAttributesResponse> customPatchpointSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomPatchpointSystemAttributesRequest body, @QueryMap(encoded=true) CustomPatchpointSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customPatchpointSystemAttributes</code> method in a fluent style.
   */
  public static class CustomPatchpointSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomPatchpointSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Patchpoint
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomPatchpointResponse deleteCustomPatchpoint(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomPatchpointRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomPatchpoint</code> but it also returns the http response headers .
   * Delete Patchpoint
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomPatchpointResponse> deleteCustomPatchpointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomPatchpointRequestData body);


  /**
   * Delete
   * Delete Patchpoint
   * Note, this is equivalent to the other <code>deleteCustomPatchpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomPatchpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomPatchpointResponse deleteCustomPatchpoint(@Param("elid") String elid, DeleteCustomPatchpointRequestData body, @QueryMap(encoded=true) DeleteCustomPatchpointQueryParams queryParams);

  /**
  * Delete
  * Delete Patchpoint
  * Note, this is equivalent to the other <code>deleteCustomPatchpoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomPatchpointResponse
      */
      @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomPatchpointResponse> deleteCustomPatchpointWithHttpInfo(@Param("elid") String elid, DeleteCustomPatchpointRequestData body, @QueryMap(encoded=true) DeleteCustomPatchpointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomPatchpoint</code> method in a fluent style.
   */
  public static class DeleteCustomPatchpointQueryParams extends HashMap<String, Object> {
    public DeleteCustomPatchpointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Patchpoint
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomPatchpointResponse updateCustomPatchpoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomPatchpointRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomPatchpoint</code> but it also returns the http response headers .
   * Modify Patchpoint
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomPatchpointResponse> updateCustomPatchpointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomPatchpointRequestData body);


  /**
   * Modify
   * Modify Patchpoint
   * Note, this is equivalent to the other <code>updateCustomPatchpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomPatchpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomPatchpointResponse updateCustomPatchpoint(@Param("elid") String elid, UpdateCustomPatchpointRequestData body, @QueryMap(encoded=true) UpdateCustomPatchpointQueryParams queryParams);

  /**
  * Modify
  * Modify Patchpoint
  * Note, this is equivalent to the other <code>updateCustomPatchpoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomPatchpointResponse
      */
      @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomPatchpointResponse> updateCustomPatchpointWithHttpInfo(@Param("elid") String elid, UpdateCustomPatchpointRequestData body, @QueryMap(encoded=true) UpdateCustomPatchpointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomPatchpoint</code> method in a fluent style.
   */
  public static class UpdateCustomPatchpointQueryParams extends HashMap<String, Object> {
    public UpdateCustomPatchpointQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomPatchpointResponse updateSystemAttributesCustomPatchpoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomPatchpointRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomPatchpoint</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomPatchpointResponse> updateSystemAttributesCustomPatchpointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomPatchpointRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomPatchpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomPatchpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomPatchpointResponse
   */
  @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomPatchpointResponse updateSystemAttributesCustomPatchpoint(@Param("elid") String elid, UpdateSystemAttributesCustomPatchpointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomPatchpointQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomPatchpoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomPatchpointResponse
      */
      @RequestLine("POST /api/rest/entity/custom/patchpoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomPatchpointResponse> updateSystemAttributesCustomPatchpointWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomPatchpointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomPatchpointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomPatchpoint</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomPatchpointQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomPatchpointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
