package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CableMasterPowerCableQueryRequest;
import com.fntsoftware.businessgateway.entities.CableMasterPowerCableQueryResponse;
import com.fntsoftware.businessgateway.entities.CableMasterPowerCableSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CableMasterPowerCableSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateCableMasterPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.CreateCableMasterPowerCableResponse;
import com.fntsoftware.businessgateway.entities.DeleteCableMasterPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCableMasterPowerCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateCableMasterPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCableMasterPowerCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCableMasterPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCableMasterPowerCableResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CableMasterPowerCableApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CableMasterPowerCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterPowerCableQueryResponse cableMasterPowerCableQuery(@Param("sessionId") String sessionId, CableMasterPowerCableQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cableMasterPowerCableQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterPowerCableQueryResponse> cableMasterPowerCableQueryWithHttpInfo(@Param("sessionId") String sessionId, CableMasterPowerCableQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>cableMasterPowerCableQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterPowerCableQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterPowerCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterPowerCableQueryResponse cableMasterPowerCableQuery(CableMasterPowerCableQueryRequest body, @QueryMap(encoded=true) CableMasterPowerCableQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>cableMasterPowerCableQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterPowerCableQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterPowerCable/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterPowerCableQueryResponse> cableMasterPowerCableQueryWithHttpInfo(CableMasterPowerCableQueryRequest body, @QueryMap(encoded=true) CableMasterPowerCableQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterPowerCableQuery</code> method in a fluent style.
   */
  public static class CableMasterPowerCableQueryQueryParams extends HashMap<String, Object> {
    public CableMasterPowerCableQueryQueryParams sessionId(final String value) {
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
   * @return CableMasterPowerCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterPowerCableSystemAttributesResponse cableMasterPowerCableSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterPowerCableSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cableMasterPowerCableSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterPowerCableSystemAttributesResponse> cableMasterPowerCableSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterPowerCableSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>cableMasterPowerCableSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterPowerCableSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterPowerCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterPowerCableSystemAttributesResponse cableMasterPowerCableSystemAttributes(@Param("elid") String elid, CableMasterPowerCableSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterPowerCableSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>cableMasterPowerCableSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterPowerCableSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterPowerCableSystemAttributesResponse> cableMasterPowerCableSystemAttributesWithHttpInfo(@Param("elid") String elid, CableMasterPowerCableSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterPowerCableSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterPowerCableSystemAttributes</code> method in a fluent style.
   */
  public static class CableMasterPowerCableSystemAttributesQueryParams extends HashMap<String, Object> {
    public CableMasterPowerCableSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create cable master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCableMasterPowerCableResponse createCableMasterPowerCable(@Param("sessionId") String sessionId, CreateCableMasterPowerCableRequestData body);

  /**
   * Create
   * Similar to <code>createCableMasterPowerCable</code> but it also returns the http response headers .
   * Create cable master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCableMasterPowerCableResponse> createCableMasterPowerCableWithHttpInfo(@Param("sessionId") String sessionId, CreateCableMasterPowerCableRequestData body);


  /**
   * Create
   * Create cable master
   * Note, this is equivalent to the other <code>createCableMasterPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCableMasterPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCableMasterPowerCableResponse createCableMasterPowerCable(CreateCableMasterPowerCableRequestData body, @QueryMap(encoded=true) CreateCableMasterPowerCableQueryParams queryParams);

  /**
  * Create
  * Create cable master
  * Note, this is equivalent to the other <code>createCableMasterPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCableMasterPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterPowerCable/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCableMasterPowerCableResponse> createCableMasterPowerCableWithHttpInfo(CreateCableMasterPowerCableRequestData body, @QueryMap(encoded=true) CreateCableMasterPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCableMasterPowerCable</code> method in a fluent style.
   */
  public static class CreateCableMasterPowerCableQueryParams extends HashMap<String, Object> {
    public CreateCableMasterPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCableMasterPowerCableResponse deleteCableMasterPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCableMasterPowerCableRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCableMasterPowerCable</code> but it also returns the http response headers .
   * Delete cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCableMasterPowerCableResponse> deleteCableMasterPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCableMasterPowerCableRequestData body);


  /**
   * Delete
   * Delete cable master
   * Note, this is equivalent to the other <code>deleteCableMasterPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCableMasterPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCableMasterPowerCableResponse deleteCableMasterPowerCable(@Param("elid") String elid, DeleteCableMasterPowerCableRequestData body, @QueryMap(encoded=true) DeleteCableMasterPowerCableQueryParams queryParams);

  /**
  * Delete
  * Delete cable master
  * Note, this is equivalent to the other <code>deleteCableMasterPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCableMasterPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCableMasterPowerCableResponse> deleteCableMasterPowerCableWithHttpInfo(@Param("elid") String elid, DeleteCableMasterPowerCableRequestData body, @QueryMap(encoded=true) DeleteCableMasterPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCableMasterPowerCable</code> method in a fluent style.
   */
  public static class DeleteCableMasterPowerCableQueryParams extends HashMap<String, Object> {
    public DeleteCableMasterPowerCableQueryParams sessionId(final String value) {
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
   * @return UpdateCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCableMasterPowerCableResponse updateCableMasterPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCableMasterPowerCableRequestData body);

  /**
   * Modify
   * Similar to <code>updateCableMasterPowerCable</code> but it also returns the http response headers .
   * Modify cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCableMasterPowerCableResponse> updateCableMasterPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCableMasterPowerCableRequestData body);


  /**
   * Modify
   * Modify cable master
   * Note, this is equivalent to the other <code>updateCableMasterPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCableMasterPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCableMasterPowerCableResponse updateCableMasterPowerCable(@Param("elid") String elid, UpdateCableMasterPowerCableRequestData body, @QueryMap(encoded=true) UpdateCableMasterPowerCableQueryParams queryParams);

  /**
  * Modify
  * Modify cable master
  * Note, this is equivalent to the other <code>updateCableMasterPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCableMasterPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCableMasterPowerCableResponse> updateCableMasterPowerCableWithHttpInfo(@Param("elid") String elid, UpdateCableMasterPowerCableRequestData body, @QueryMap(encoded=true) UpdateCableMasterPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCableMasterPowerCable</code> method in a fluent style.
   */
  public static class UpdateCableMasterPowerCableQueryParams extends HashMap<String, Object> {
    public UpdateCableMasterPowerCableQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCableMasterPowerCableResponse updateSystemAttributesCableMasterPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCableMasterPowerCableRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCableMasterPowerCable</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCableMasterPowerCableResponse> updateSystemAttributesCableMasterPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCableMasterPowerCableRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCableMasterPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCableMasterPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCableMasterPowerCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCableMasterPowerCableResponse updateSystemAttributesCableMasterPowerCable(@Param("elid") String elid, UpdateSystemAttributesCableMasterPowerCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCableMasterPowerCableQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCableMasterPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCableMasterPowerCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterPowerCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCableMasterPowerCableResponse> updateSystemAttributesCableMasterPowerCableWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCableMasterPowerCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCableMasterPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCableMasterPowerCable</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCableMasterPowerCableQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCableMasterPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
