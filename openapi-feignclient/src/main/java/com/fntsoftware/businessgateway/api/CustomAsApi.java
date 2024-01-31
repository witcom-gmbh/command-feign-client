package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomAsRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomAsResponse;
import com.fntsoftware.businessgateway.entities.CustomAsQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomAsQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomAsSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomAsSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomAsRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomAsResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomAsRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomAsResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomAsRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomAsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomAsApi extends ApiClient.Api {


  /**
   * Create
   * Create AS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomAsResponse createCustomAs(@Param("sessionId") String sessionId, CreateCustomAsRequestData body);

  /**
   * Create
   * Similar to <code>createCustomAs</code> but it also returns the http response headers .
   * Create AS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/as/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomAsResponse> createCustomAsWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomAsRequestData body);


  /**
   * Create
   * Create AS
   * Note, this is equivalent to the other <code>createCustomAs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomAsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomAsResponse createCustomAs(CreateCustomAsRequestData body, @QueryMap(encoded=true) CreateCustomAsQueryParams queryParams);

  /**
  * Create
  * Create AS
  * Note, this is equivalent to the other <code>createCustomAs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomAsResponse
      */
      @RequestLine("POST /api/rest/entity/custom/as/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomAsResponse> createCustomAsWithHttpInfo(CreateCustomAsRequestData body, @QueryMap(encoded=true) CreateCustomAsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomAs</code> method in a fluent style.
   */
  public static class CreateCustomAsQueryParams extends HashMap<String, Object> {
    public CreateCustomAsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomAsQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomAsQueryResponse customAsQuery(@Param("sessionId") String sessionId, CustomAsQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customAsQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/as/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomAsQueryResponse> customAsQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomAsQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customAsQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomAsQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomAsQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomAsQueryResponse customAsQuery(CustomAsQueryRequest body, @QueryMap(encoded=true) CustomAsQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customAsQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomAsQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/as/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomAsQueryResponse> customAsQueryWithHttpInfo(CustomAsQueryRequest body, @QueryMap(encoded=true) CustomAsQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customAsQuery</code> method in a fluent style.
   */
  public static class CustomAsQueryQueryParams extends HashMap<String, Object> {
    public CustomAsQueryQueryParams sessionId(final String value) {
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
   * @return CustomAsSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomAsSystemAttributesResponse customAsSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomAsSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customAsSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomAsSystemAttributesResponse> customAsSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomAsSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customAsSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomAsSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomAsSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomAsSystemAttributesResponse customAsSystemAttributes(@Param("elid") String elid, CustomAsSystemAttributesRequest body, @QueryMap(encoded=true) CustomAsSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customAsSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomAsSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/as/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomAsSystemAttributesResponse> customAsSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomAsSystemAttributesRequest body, @QueryMap(encoded=true) CustomAsSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customAsSystemAttributes</code> method in a fluent style.
   */
  public static class CustomAsSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomAsSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete AS
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomAsResponse deleteCustomAs(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomAsRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomAs</code> but it also returns the http response headers .
   * Delete AS
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomAsResponse> deleteCustomAsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomAsRequestData body);


  /**
   * Delete
   * Delete AS
   * Note, this is equivalent to the other <code>deleteCustomAs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomAsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomAsResponse deleteCustomAs(@Param("elid") String elid, DeleteCustomAsRequestData body, @QueryMap(encoded=true) DeleteCustomAsQueryParams queryParams);

  /**
  * Delete
  * Delete AS
  * Note, this is equivalent to the other <code>deleteCustomAs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomAsResponse
      */
      @RequestLine("POST /api/rest/entity/custom/as/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomAsResponse> deleteCustomAsWithHttpInfo(@Param("elid") String elid, DeleteCustomAsRequestData body, @QueryMap(encoded=true) DeleteCustomAsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomAs</code> method in a fluent style.
   */
  public static class DeleteCustomAsQueryParams extends HashMap<String, Object> {
    public DeleteCustomAsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify AS
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomAsResponse updateCustomAs(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomAsRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomAs</code> but it also returns the http response headers .
   * Modify AS
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomAsResponse> updateCustomAsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomAsRequestData body);


  /**
   * Modify
   * Modify AS
   * Note, this is equivalent to the other <code>updateCustomAs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomAsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomAsResponse updateCustomAs(@Param("elid") String elid, UpdateCustomAsRequestData body, @QueryMap(encoded=true) UpdateCustomAsQueryParams queryParams);

  /**
  * Modify
  * Modify AS
  * Note, this is equivalent to the other <code>updateCustomAs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomAsResponse
      */
      @RequestLine("POST /api/rest/entity/custom/as/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomAsResponse> updateCustomAsWithHttpInfo(@Param("elid") String elid, UpdateCustomAsRequestData body, @QueryMap(encoded=true) UpdateCustomAsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomAs</code> method in a fluent style.
   */
  public static class UpdateCustomAsQueryParams extends HashMap<String, Object> {
    public UpdateCustomAsQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomAsResponse updateSystemAttributesCustomAs(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomAsRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomAs</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomAsResponse> updateSystemAttributesCustomAsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomAsRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomAs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomAsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomAsResponse
   */
  @RequestLine("POST /api/rest/entity/custom/as/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomAsResponse updateSystemAttributesCustomAs(@Param("elid") String elid, UpdateSystemAttributesCustomAsRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomAsQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomAs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomAsResponse
      */
      @RequestLine("POST /api/rest/entity/custom/as/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomAsResponse> updateSystemAttributesCustomAsWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomAsRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomAsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomAs</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomAsQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomAsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
