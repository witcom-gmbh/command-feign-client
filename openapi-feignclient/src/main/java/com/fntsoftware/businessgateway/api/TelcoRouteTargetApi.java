package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateTelcoRouteTargetRequestData;
import com.fntsoftware.businessgateway.entities.CreateTelcoRouteTargetResponse;
import com.fntsoftware.businessgateway.entities.DeleteTelcoRouteTargetRequestData;
import com.fntsoftware.businessgateway.entities.DeleteTelcoRouteTargetResponse;
import com.fntsoftware.businessgateway.entities.TelcoRouteTargetQueryRequest;
import com.fntsoftware.businessgateway.entities.TelcoRouteTargetQueryResponse;
import com.fntsoftware.businessgateway.entities.TelcoRouteTargetServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.TelcoRouteTargetServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.TelcoRouteTargetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TelcoRouteTargetSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTelcoRouteTargetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTelcoRouteTargetResponse;
import com.fntsoftware.businessgateway.entities.UpdateTelcoRouteTargetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateTelcoRouteTargetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface TelcoRouteTargetApi extends ApiClient.Api {


  /**
   * Create
   * Create Route Target
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateTelcoRouteTargetResponse createTelcoRouteTarget(@Param("sessionId") String sessionId, CreateTelcoRouteTargetRequestData body);

  /**
   * Create
   * Similar to <code>createTelcoRouteTarget</code> but it also returns the http response headers .
   * Create Route Target
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateTelcoRouteTargetResponse> createTelcoRouteTargetWithHttpInfo(@Param("sessionId") String sessionId, CreateTelcoRouteTargetRequestData body);


  /**
   * Create
   * Create Route Target
   * Note, this is equivalent to the other <code>createTelcoRouteTarget</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateTelcoRouteTargetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateTelcoRouteTargetResponse createTelcoRouteTarget(CreateTelcoRouteTargetRequestData body, @QueryMap(encoded=true) CreateTelcoRouteTargetQueryParams queryParams);

  /**
  * Create
  * Create Route Target
  * Note, this is equivalent to the other <code>createTelcoRouteTarget</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateTelcoRouteTargetResponse
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateTelcoRouteTargetResponse> createTelcoRouteTargetWithHttpInfo(CreateTelcoRouteTargetRequestData body, @QueryMap(encoded=true) CreateTelcoRouteTargetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createTelcoRouteTarget</code> method in a fluent style.
   */
  public static class CreateTelcoRouteTargetQueryParams extends HashMap<String, Object> {
    public CreateTelcoRouteTargetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Route Target
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteTelcoRouteTargetResponse deleteTelcoRouteTarget(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTelcoRouteTargetRequestData body);

  /**
   * Delete
   * Similar to <code>deleteTelcoRouteTarget</code> but it also returns the http response headers .
   * Delete Route Target
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteTelcoRouteTargetResponse> deleteTelcoRouteTargetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTelcoRouteTargetRequestData body);


  /**
   * Delete
   * Delete Route Target
   * Note, this is equivalent to the other <code>deleteTelcoRouteTarget</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTelcoRouteTargetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteTelcoRouteTargetResponse deleteTelcoRouteTarget(@Param("elid") String elid, DeleteTelcoRouteTargetRequestData body, @QueryMap(encoded=true) DeleteTelcoRouteTargetQueryParams queryParams);

  /**
  * Delete
  * Delete Route Target
  * Note, this is equivalent to the other <code>deleteTelcoRouteTarget</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteTelcoRouteTargetResponse
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteTelcoRouteTargetResponse> deleteTelcoRouteTargetWithHttpInfo(@Param("elid") String elid, DeleteTelcoRouteTargetRequestData body, @QueryMap(encoded=true) DeleteTelcoRouteTargetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTelcoRouteTarget</code> method in a fluent style.
   */
  public static class DeleteTelcoRouteTargetQueryParams extends HashMap<String, Object> {
    public DeleteTelcoRouteTargetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TelcoRouteTargetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoRouteTargetQueryResponse telcoRouteTargetQuery(@Param("sessionId") String sessionId, TelcoRouteTargetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>telcoRouteTargetQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoRouteTargetQueryResponse> telcoRouteTargetQueryWithHttpInfo(@Param("sessionId") String sessionId, TelcoRouteTargetQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>telcoRouteTargetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoRouteTargetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoRouteTargetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoRouteTargetQueryResponse telcoRouteTargetQuery(TelcoRouteTargetQueryRequest body, @QueryMap(encoded=true) TelcoRouteTargetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>telcoRouteTargetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoRouteTargetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoRouteTargetQueryResponse> telcoRouteTargetQueryWithHttpInfo(TelcoRouteTargetQueryRequest body, @QueryMap(encoded=true) TelcoRouteTargetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoRouteTargetQuery</code> method in a fluent style.
   */
  public static class TelcoRouteTargetQueryQueryParams extends HashMap<String, Object> {
    public TelcoRouteTargetQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TelcoRouteTargetServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoRouteTargetServicesTelcoResponseData telcoRouteTargetServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoRouteTargetServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>telcoRouteTargetServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoRouteTargetServicesTelcoResponseData> telcoRouteTargetServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoRouteTargetServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>telcoRouteTargetServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoRouteTargetServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoRouteTargetServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoRouteTargetServicesTelcoResponseData telcoRouteTargetServicesTelco(@Param("elid") String elid, TelcoRouteTargetServicesTelcoRequestData body, @QueryMap(encoded=true) TelcoRouteTargetServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>telcoRouteTargetServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoRouteTargetServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoRouteTargetServicesTelcoResponseData> telcoRouteTargetServicesTelcoWithHttpInfo(@Param("elid") String elid, TelcoRouteTargetServicesTelcoRequestData body, @QueryMap(encoded=true) TelcoRouteTargetServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoRouteTargetServicesTelco</code> method in a fluent style.
   */
  public static class TelcoRouteTargetServicesTelcoQueryParams extends HashMap<String, Object> {
    public TelcoRouteTargetServicesTelcoQueryParams sessionId(final String value) {
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
   * @return TelcoRouteTargetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TelcoRouteTargetSystemAttributesResponse telcoRouteTargetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoRouteTargetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>telcoRouteTargetSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TelcoRouteTargetSystemAttributesResponse> telcoRouteTargetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TelcoRouteTargetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>telcoRouteTargetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TelcoRouteTargetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TelcoRouteTargetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TelcoRouteTargetSystemAttributesResponse telcoRouteTargetSystemAttributes(@Param("elid") String elid, TelcoRouteTargetSystemAttributesRequest body, @QueryMap(encoded=true) TelcoRouteTargetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>telcoRouteTargetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TelcoRouteTargetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TelcoRouteTargetSystemAttributesResponse> telcoRouteTargetSystemAttributesWithHttpInfo(@Param("elid") String elid, TelcoRouteTargetSystemAttributesRequest body, @QueryMap(encoded=true) TelcoRouteTargetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>telcoRouteTargetSystemAttributes</code> method in a fluent style.
   */
  public static class TelcoRouteTargetSystemAttributesQueryParams extends HashMap<String, Object> {
    public TelcoRouteTargetSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTelcoRouteTargetResponse updateSystemAttributesTelcoRouteTarget(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTelcoRouteTargetRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTelcoRouteTarget</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTelcoRouteTargetResponse> updateSystemAttributesTelcoRouteTargetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTelcoRouteTargetRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTelcoRouteTarget</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTelcoRouteTargetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTelcoRouteTargetResponse updateSystemAttributesTelcoRouteTarget(@Param("elid") String elid, UpdateSystemAttributesTelcoRouteTargetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTelcoRouteTargetQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTelcoRouteTarget</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTelcoRouteTargetResponse
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTelcoRouteTargetResponse> updateSystemAttributesTelcoRouteTargetWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTelcoRouteTargetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTelcoRouteTargetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTelcoRouteTarget</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTelcoRouteTargetQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTelcoRouteTargetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Route Target
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateTelcoRouteTargetResponse updateTelcoRouteTarget(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTelcoRouteTargetRequestData body);

  /**
   * Modify
   * Similar to <code>updateTelcoRouteTarget</code> but it also returns the http response headers .
   * Modify Route Target
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateTelcoRouteTargetResponse> updateTelcoRouteTargetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTelcoRouteTargetRequestData body);


  /**
   * Modify
   * Modify Route Target
   * Note, this is equivalent to the other <code>updateTelcoRouteTarget</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateTelcoRouteTargetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateTelcoRouteTargetResponse
   */
  @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateTelcoRouteTargetResponse updateTelcoRouteTarget(@Param("elid") String elid, UpdateTelcoRouteTargetRequestData body, @QueryMap(encoded=true) UpdateTelcoRouteTargetQueryParams queryParams);

  /**
  * Modify
  * Modify Route Target
  * Note, this is equivalent to the other <code>updateTelcoRouteTarget</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateTelcoRouteTargetResponse
      */
      @RequestLine("POST /api/rest/entity/telcoRouteTarget/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateTelcoRouteTargetResponse> updateTelcoRouteTargetWithHttpInfo(@Param("elid") String elid, UpdateTelcoRouteTargetRequestData body, @QueryMap(encoded=true) UpdateTelcoRouteTargetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateTelcoRouteTarget</code> method in a fluent style.
   */
  public static class UpdateTelcoRouteTargetQueryParams extends HashMap<String, Object> {
    public UpdateTelcoRouteTargetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
