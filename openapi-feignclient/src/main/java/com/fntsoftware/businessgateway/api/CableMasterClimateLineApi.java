package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CableMasterClimateLineQueryRequest;
import com.fntsoftware.businessgateway.entities.CableMasterClimateLineQueryResponse;
import com.fntsoftware.businessgateway.entities.CableMasterClimateLineSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CableMasterClimateLineSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateCableMasterClimateLineRequestData;
import com.fntsoftware.businessgateway.entities.CreateCableMasterClimateLineResponse;
import com.fntsoftware.businessgateway.entities.DeleteCableMasterClimateLineRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCableMasterClimateLineResponse;
import com.fntsoftware.businessgateway.entities.UpdateCableMasterClimateLineRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCableMasterClimateLineResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCableMasterClimateLineRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCableMasterClimateLineResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CableMasterClimateLineApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CableMasterClimateLineQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterClimateLineQueryResponse cableMasterClimateLineQuery(@Param("sessionId") String sessionId, CableMasterClimateLineQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cableMasterClimateLineQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterClimateLineQueryResponse> cableMasterClimateLineQueryWithHttpInfo(@Param("sessionId") String sessionId, CableMasterClimateLineQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>cableMasterClimateLineQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterClimateLineQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterClimateLineQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterClimateLineQueryResponse cableMasterClimateLineQuery(CableMasterClimateLineQueryRequest body, @QueryMap(encoded=true) CableMasterClimateLineQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>cableMasterClimateLineQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterClimateLineQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterClimateLine/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterClimateLineQueryResponse> cableMasterClimateLineQueryWithHttpInfo(CableMasterClimateLineQueryRequest body, @QueryMap(encoded=true) CableMasterClimateLineQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterClimateLineQuery</code> method in a fluent style.
   */
  public static class CableMasterClimateLineQueryQueryParams extends HashMap<String, Object> {
    public CableMasterClimateLineQueryQueryParams sessionId(final String value) {
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
   * @return CableMasterClimateLineSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterClimateLineSystemAttributesResponse cableMasterClimateLineSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterClimateLineSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cableMasterClimateLineSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterClimateLineSystemAttributesResponse> cableMasterClimateLineSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterClimateLineSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>cableMasterClimateLineSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterClimateLineSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterClimateLineSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterClimateLineSystemAttributesResponse cableMasterClimateLineSystemAttributes(@Param("elid") String elid, CableMasterClimateLineSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterClimateLineSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>cableMasterClimateLineSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterClimateLineSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterClimateLineSystemAttributesResponse> cableMasterClimateLineSystemAttributesWithHttpInfo(@Param("elid") String elid, CableMasterClimateLineSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterClimateLineSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterClimateLineSystemAttributes</code> method in a fluent style.
   */
  public static class CableMasterClimateLineSystemAttributesQueryParams extends HashMap<String, Object> {
    public CableMasterClimateLineSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Cable master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCableMasterClimateLineResponse createCableMasterClimateLine(@Param("sessionId") String sessionId, CreateCableMasterClimateLineRequestData body);

  /**
   * Create
   * Similar to <code>createCableMasterClimateLine</code> but it also returns the http response headers .
   * Create Cable master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCableMasterClimateLineResponse> createCableMasterClimateLineWithHttpInfo(@Param("sessionId") String sessionId, CreateCableMasterClimateLineRequestData body);


  /**
   * Create
   * Create Cable master
   * Note, this is equivalent to the other <code>createCableMasterClimateLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCableMasterClimateLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCableMasterClimateLineResponse createCableMasterClimateLine(CreateCableMasterClimateLineRequestData body, @QueryMap(encoded=true) CreateCableMasterClimateLineQueryParams queryParams);

  /**
  * Create
  * Create Cable master
  * Note, this is equivalent to the other <code>createCableMasterClimateLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCableMasterClimateLineResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterClimateLine/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCableMasterClimateLineResponse> createCableMasterClimateLineWithHttpInfo(CreateCableMasterClimateLineRequestData body, @QueryMap(encoded=true) CreateCableMasterClimateLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCableMasterClimateLine</code> method in a fluent style.
   */
  public static class CreateCableMasterClimateLineQueryParams extends HashMap<String, Object> {
    public CreateCableMasterClimateLineQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCableMasterClimateLineResponse deleteCableMasterClimateLine(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCableMasterClimateLineRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCableMasterClimateLine</code> but it also returns the http response headers .
   * Delete Cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCableMasterClimateLineResponse> deleteCableMasterClimateLineWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCableMasterClimateLineRequestData body);


  /**
   * Delete
   * Delete Cable master
   * Note, this is equivalent to the other <code>deleteCableMasterClimateLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCableMasterClimateLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCableMasterClimateLineResponse deleteCableMasterClimateLine(@Param("elid") String elid, DeleteCableMasterClimateLineRequestData body, @QueryMap(encoded=true) DeleteCableMasterClimateLineQueryParams queryParams);

  /**
  * Delete
  * Delete Cable master
  * Note, this is equivalent to the other <code>deleteCableMasterClimateLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCableMasterClimateLineResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCableMasterClimateLineResponse> deleteCableMasterClimateLineWithHttpInfo(@Param("elid") String elid, DeleteCableMasterClimateLineRequestData body, @QueryMap(encoded=true) DeleteCableMasterClimateLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCableMasterClimateLine</code> method in a fluent style.
   */
  public static class DeleteCableMasterClimateLineQueryParams extends HashMap<String, Object> {
    public DeleteCableMasterClimateLineQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCableMasterClimateLineResponse updateCableMasterClimateLine(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCableMasterClimateLineRequestData body);

  /**
   * Modify
   * Similar to <code>updateCableMasterClimateLine</code> but it also returns the http response headers .
   * Modify cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCableMasterClimateLineResponse> updateCableMasterClimateLineWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCableMasterClimateLineRequestData body);


  /**
   * Modify
   * Modify cable master
   * Note, this is equivalent to the other <code>updateCableMasterClimateLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCableMasterClimateLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCableMasterClimateLineResponse updateCableMasterClimateLine(@Param("elid") String elid, UpdateCableMasterClimateLineRequestData body, @QueryMap(encoded=true) UpdateCableMasterClimateLineQueryParams queryParams);

  /**
  * Modify
  * Modify cable master
  * Note, this is equivalent to the other <code>updateCableMasterClimateLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCableMasterClimateLineResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCableMasterClimateLineResponse> updateCableMasterClimateLineWithHttpInfo(@Param("elid") String elid, UpdateCableMasterClimateLineRequestData body, @QueryMap(encoded=true) UpdateCableMasterClimateLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCableMasterClimateLine</code> method in a fluent style.
   */
  public static class UpdateCableMasterClimateLineQueryParams extends HashMap<String, Object> {
    public UpdateCableMasterClimateLineQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCableMasterClimateLineResponse updateSystemAttributesCableMasterClimateLine(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCableMasterClimateLineRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCableMasterClimateLine</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCableMasterClimateLineResponse> updateSystemAttributesCableMasterClimateLineWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCableMasterClimateLineRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCableMasterClimateLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCableMasterClimateLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCableMasterClimateLineResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCableMasterClimateLineResponse updateSystemAttributesCableMasterClimateLine(@Param("elid") String elid, UpdateSystemAttributesCableMasterClimateLineRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCableMasterClimateLineQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCableMasterClimateLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCableMasterClimateLineResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterClimateLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCableMasterClimateLineResponse> updateSystemAttributesCableMasterClimateLineWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCableMasterClimateLineRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCableMasterClimateLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCableMasterClimateLine</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCableMasterClimateLineQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCableMasterClimateLineQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
