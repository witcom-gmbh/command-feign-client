package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateMandatorRequestData;
import com.fntsoftware.businessgateway.entities.CreateMandatorResponse;
import com.fntsoftware.businessgateway.entities.DeleteMandatorRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMandatorResponse;
import com.fntsoftware.businessgateway.entities.MandatorQueryRequest;
import com.fntsoftware.businessgateway.entities.MandatorQueryResponse;
import com.fntsoftware.businessgateway.entities.MandatorUserGroupsRequestData;
import com.fntsoftware.businessgateway.entities.MandatorUserGroupsResponseData;
import com.fntsoftware.businessgateway.entities.MandatorUsersRequestData;
import com.fntsoftware.businessgateway.entities.MandatorUsersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface MandatorApi extends ApiClient.Api {


  /**
   * Create
   * Create Mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateMandatorResponse createMandator(@Param("sessionId") String sessionId, CreateMandatorRequestData body);

  /**
   * Create
   * Similar to <code>createMandator</code> but it also returns the http response headers .
   * Create Mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mandator/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateMandatorResponse> createMandatorWithHttpInfo(@Param("sessionId") String sessionId, CreateMandatorRequestData body);


  /**
   * Create
   * Create Mandator
   * Note, this is equivalent to the other <code>createMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateMandatorResponse createMandator(CreateMandatorRequestData body, @QueryMap(encoded=true) CreateMandatorQueryParams queryParams);

  /**
  * Create
  * Create Mandator
  * Note, this is equivalent to the other <code>createMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/mandator/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateMandatorResponse> createMandatorWithHttpInfo(CreateMandatorRequestData body, @QueryMap(encoded=true) CreateMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createMandator</code> method in a fluent style.
   */
  public static class CreateMandatorQueryParams extends HashMap<String, Object> {
    public CreateMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMandatorResponse deleteMandator(@Param("sessionId") String sessionId, DeleteMandatorRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMandator</code> but it also returns the http response headers .
   * Delete Mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mandator/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMandatorResponse> deleteMandatorWithHttpInfo(@Param("sessionId") String sessionId, DeleteMandatorRequestData body);


  /**
   * Delete
   * Delete Mandator
   * Note, this is equivalent to the other <code>deleteMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMandatorResponse deleteMandator(DeleteMandatorRequestData body, @QueryMap(encoded=true) DeleteMandatorQueryParams queryParams);

  /**
  * Delete
  * Delete Mandator
  * Note, this is equivalent to the other <code>deleteMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/mandator/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMandatorResponse> deleteMandatorWithHttpInfo(DeleteMandatorRequestData body, @QueryMap(encoded=true) DeleteMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMandator</code> method in a fluent style.
   */
  public static class DeleteMandatorQueryParams extends HashMap<String, Object> {
    public DeleteMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MandatorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MandatorQueryResponse mandatorQuery(@Param("sessionId") String sessionId, MandatorQueryRequest body);

  /**
   * Basic query
   * Similar to <code>mandatorQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mandator/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MandatorQueryResponse> mandatorQueryWithHttpInfo(@Param("sessionId") String sessionId, MandatorQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>mandatorQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MandatorQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MandatorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MandatorQueryResponse mandatorQuery(MandatorQueryRequest body, @QueryMap(encoded=true) MandatorQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>mandatorQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MandatorQueryResponse
      */
      @RequestLine("POST /api/rest/entity/mandator/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MandatorQueryResponse> mandatorQueryWithHttpInfo(MandatorQueryRequest body, @QueryMap(encoded=true) MandatorQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mandatorQuery</code> method in a fluent style.
   */
  public static class MandatorQueryQueryParams extends HashMap<String, Object> {
    public MandatorQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to User group entities
   * 
   * @param sessionId Session-ID (required)
   * @param manId  (required)
   * @param body  (required)
   * @return MandatorUserGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/UserGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MandatorUserGroupsResponseData mandatorUserGroups(@Param("sessionId") String sessionId, @Param("manId") String manId, MandatorUserGroupsRequestData body);

  /**
   * Get relations to User group entities
   * Similar to <code>mandatorUserGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param manId  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/UserGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MandatorUserGroupsResponseData> mandatorUserGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("manId") String manId, MandatorUserGroupsRequestData body);


  /**
   * Get relations to User group entities
   * 
   * Note, this is equivalent to the other <code>mandatorUserGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MandatorUserGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param manId  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MandatorUserGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/UserGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MandatorUserGroupsResponseData mandatorUserGroups(@Param("manId") String manId, MandatorUserGroupsRequestData body, @QueryMap(encoded=true) MandatorUserGroupsQueryParams queryParams);

  /**
  * Get relations to User group entities
  * 
  * Note, this is equivalent to the other <code>mandatorUserGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param manId  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MandatorUserGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/mandator/{manId}/UserGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MandatorUserGroupsResponseData> mandatorUserGroupsWithHttpInfo(@Param("manId") String manId, MandatorUserGroupsRequestData body, @QueryMap(encoded=true) MandatorUserGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mandatorUserGroups</code> method in a fluent style.
   */
  public static class MandatorUserGroupsQueryParams extends HashMap<String, Object> {
    public MandatorUserGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to User entities
   * 
   * @param sessionId Session-ID (required)
   * @param manId  (required)
   * @param body  (required)
   * @return MandatorUsersResponseData
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/Users?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MandatorUsersResponseData mandatorUsers(@Param("sessionId") String sessionId, @Param("manId") String manId, MandatorUsersRequestData body);

  /**
   * Get relations to User entities
   * Similar to <code>mandatorUsers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param manId  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/Users?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MandatorUsersResponseData> mandatorUsersWithHttpInfo(@Param("sessionId") String sessionId, @Param("manId") String manId, MandatorUsersRequestData body);


  /**
   * Get relations to User entities
   * 
   * Note, this is equivalent to the other <code>mandatorUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MandatorUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param manId  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MandatorUsersResponseData
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/Users?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MandatorUsersResponseData mandatorUsers(@Param("manId") String manId, MandatorUsersRequestData body, @QueryMap(encoded=true) MandatorUsersQueryParams queryParams);

  /**
  * Get relations to User entities
  * 
  * Note, this is equivalent to the other <code>mandatorUsers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param manId  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MandatorUsersResponseData
      */
      @RequestLine("POST /api/rest/entity/mandator/{manId}/Users?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MandatorUsersResponseData> mandatorUsersWithHttpInfo(@Param("manId") String manId, MandatorUsersRequestData body, @QueryMap(encoded=true) MandatorUsersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mandatorUsers</code> method in a fluent style.
   */
  public static class MandatorUsersQueryParams extends HashMap<String, Object> {
    public MandatorUsersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Mandator
   * @param sessionId Session-ID (required)
   * @param manId  (required)
   * @param body  (required)
   * @return UpdateMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMandatorResponse updateMandator(@Param("sessionId") String sessionId, @Param("manId") String manId, UpdateMandatorRequestData body);

  /**
   * Modify
   * Similar to <code>updateMandator</code> but it also returns the http response headers .
   * Modify Mandator
   * @param sessionId Session-ID (required)
   * @param manId  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMandatorResponse> updateMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("manId") String manId, UpdateMandatorRequestData body);


  /**
   * Modify
   * Modify Mandator
   * Note, this is equivalent to the other <code>updateMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param manId  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/mandator/{manId}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMandatorResponse updateMandator(@Param("manId") String manId, UpdateMandatorRequestData body, @QueryMap(encoded=true) UpdateMandatorQueryParams queryParams);

  /**
  * Modify
  * Modify Mandator
  * Note, this is equivalent to the other <code>updateMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param manId  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/mandator/{manId}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMandatorResponse> updateMandatorWithHttpInfo(@Param("manId") String manId, UpdateMandatorRequestData body, @QueryMap(encoded=true) UpdateMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMandator</code> method in a fluent style.
   */
  public static class UpdateMandatorQueryParams extends HashMap<String, Object> {
    public UpdateMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
