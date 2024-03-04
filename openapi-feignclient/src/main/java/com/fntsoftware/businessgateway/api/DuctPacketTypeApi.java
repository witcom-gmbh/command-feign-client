package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDuctPacketTypeRequestData;
import com.fntsoftware.businessgateway.entities.CreateDuctPacketTypeResponse;
import com.fntsoftware.businessgateway.entities.DeleteDuctPacketTypeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDuctPacketTypeResponse;
import com.fntsoftware.businessgateway.entities.DuctPacketTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.DuctPacketTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.DuctPacketTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DuctPacketTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateDuctPacketTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDuctPacketTypeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctPacketTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctPacketTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DuctPacketTypeApi extends ApiClient.Api {


  /**
   * Create
   * Create Duct packet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDuctPacketTypeResponse createDuctPacketType(@Param("sessionId") String sessionId, CreateDuctPacketTypeRequestData body);

  /**
   * Create
   * Similar to <code>createDuctPacketType</code> but it also returns the http response headers .
   * Create Duct packet
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDuctPacketTypeResponse> createDuctPacketTypeWithHttpInfo(@Param("sessionId") String sessionId, CreateDuctPacketTypeRequestData body);


  /**
   * Create
   * Create Duct packet
   * Note, this is equivalent to the other <code>createDuctPacketType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDuctPacketTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDuctPacketTypeResponse createDuctPacketType(CreateDuctPacketTypeRequestData body, @QueryMap(encoded=true) CreateDuctPacketTypeQueryParams queryParams);

  /**
  * Create
  * Create Duct packet
  * Note, this is equivalent to the other <code>createDuctPacketType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDuctPacketTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductPacketType/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDuctPacketTypeResponse> createDuctPacketTypeWithHttpInfo(CreateDuctPacketTypeRequestData body, @QueryMap(encoded=true) CreateDuctPacketTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDuctPacketType</code> method in a fluent style.
   */
  public static class CreateDuctPacketTypeQueryParams extends HashMap<String, Object> {
    public CreateDuctPacketTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Duct packet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDuctPacketTypeResponse deleteDuctPacketType(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctPacketTypeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDuctPacketType</code> but it also returns the http response headers .
   * Delete Duct packet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDuctPacketTypeResponse> deleteDuctPacketTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctPacketTypeRequestData body);


  /**
   * Delete
   * Delete Duct packet
   * Note, this is equivalent to the other <code>deleteDuctPacketType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDuctPacketTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDuctPacketTypeResponse deleteDuctPacketType(@Param("elid") String elid, DeleteDuctPacketTypeRequestData body, @QueryMap(encoded=true) DeleteDuctPacketTypeQueryParams queryParams);

  /**
  * Delete
  * Delete Duct packet
  * Note, this is equivalent to the other <code>deleteDuctPacketType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDuctPacketTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDuctPacketTypeResponse> deleteDuctPacketTypeWithHttpInfo(@Param("elid") String elid, DeleteDuctPacketTypeRequestData body, @QueryMap(encoded=true) DeleteDuctPacketTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDuctPacketType</code> method in a fluent style.
   */
  public static class DeleteDuctPacketTypeQueryParams extends HashMap<String, Object> {
    public DeleteDuctPacketTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DuctPacketTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctPacketTypeQueryResponse ductPacketTypeQuery(@Param("sessionId") String sessionId, DuctPacketTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ductPacketTypeQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctPacketTypeQueryResponse> ductPacketTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, DuctPacketTypeQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>ductPacketTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctPacketTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctPacketTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctPacketTypeQueryResponse ductPacketTypeQuery(DuctPacketTypeQueryRequest body, @QueryMap(encoded=true) DuctPacketTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>ductPacketTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctPacketTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ductPacketType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctPacketTypeQueryResponse> ductPacketTypeQueryWithHttpInfo(DuctPacketTypeQueryRequest body, @QueryMap(encoded=true) DuctPacketTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductPacketTypeQuery</code> method in a fluent style.
   */
  public static class DuctPacketTypeQueryQueryParams extends HashMap<String, Object> {
    public DuctPacketTypeQueryQueryParams sessionId(final String value) {
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
   * @return DuctPacketTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctPacketTypeSystemAttributesResponse ductPacketTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctPacketTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ductPacketTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctPacketTypeSystemAttributesResponse> ductPacketTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctPacketTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ductPacketTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctPacketTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctPacketTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctPacketTypeSystemAttributesResponse ductPacketTypeSystemAttributes(@Param("elid") String elid, DuctPacketTypeSystemAttributesRequest body, @QueryMap(encoded=true) DuctPacketTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ductPacketTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctPacketTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctPacketTypeSystemAttributesResponse> ductPacketTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, DuctPacketTypeSystemAttributesRequest body, @QueryMap(encoded=true) DuctPacketTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductPacketTypeSystemAttributes</code> method in a fluent style.
   */
  public static class DuctPacketTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public DuctPacketTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Duct packet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDuctPacketTypeResponse updateDuctPacketType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctPacketTypeRequestData body);

  /**
   * Modify
   * Similar to <code>updateDuctPacketType</code> but it also returns the http response headers .
   * Modify Duct packet
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDuctPacketTypeResponse> updateDuctPacketTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctPacketTypeRequestData body);


  /**
   * Modify
   * Modify Duct packet
   * Note, this is equivalent to the other <code>updateDuctPacketType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDuctPacketTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDuctPacketTypeResponse updateDuctPacketType(@Param("elid") String elid, UpdateDuctPacketTypeRequestData body, @QueryMap(encoded=true) UpdateDuctPacketTypeQueryParams queryParams);

  /**
  * Modify
  * Modify Duct packet
  * Note, this is equivalent to the other <code>updateDuctPacketType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDuctPacketTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDuctPacketTypeResponse> updateDuctPacketTypeWithHttpInfo(@Param("elid") String elid, UpdateDuctPacketTypeRequestData body, @QueryMap(encoded=true) UpdateDuctPacketTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDuctPacketType</code> method in a fluent style.
   */
  public static class UpdateDuctPacketTypeQueryParams extends HashMap<String, Object> {
    public UpdateDuctPacketTypeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDuctPacketTypeResponse updateSystemAttributesDuctPacketType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctPacketTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDuctPacketType</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDuctPacketTypeResponse> updateSystemAttributesDuctPacketTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctPacketTypeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDuctPacketType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDuctPacketTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDuctPacketTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDuctPacketTypeResponse updateSystemAttributesDuctPacketType(@Param("elid") String elid, UpdateSystemAttributesDuctPacketTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctPacketTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDuctPacketType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDuctPacketTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductPacketType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDuctPacketTypeResponse> updateSystemAttributesDuctPacketTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDuctPacketTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctPacketTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDuctPacketType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDuctPacketTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDuctPacketTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
