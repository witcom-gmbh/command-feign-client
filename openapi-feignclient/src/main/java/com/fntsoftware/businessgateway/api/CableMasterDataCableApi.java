package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CableMasterDataCableDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableQueryConductorMasterRequest;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableQueryConductorMasterResponse;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableQueryRequest;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableQueryResponse;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CableMasterDataCableSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.CreateCableMasterDataCableResponse;
import com.fntsoftware.businessgateway.entities.DeleteCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCableMasterDataCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCableMasterDataCableResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCableMasterDataCableResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CableMasterDataCableApi extends ApiClient.Api {


  /**
   * Get relations to Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CableMasterDataCableDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterDataCableDataCablesResponseData cableMasterDataCableDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterDataCableDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>cableMasterDataCableDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterDataCableDataCablesResponseData> cableMasterDataCableDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterDataCableDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>cableMasterDataCableDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterDataCableDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterDataCableDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterDataCableDataCablesResponseData cableMasterDataCableDataCables(@Param("elid") String elid, CableMasterDataCableDataCablesRequestData body, @QueryMap(encoded=true) CableMasterDataCableDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>cableMasterDataCableDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterDataCableDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/DataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterDataCableDataCablesResponseData> cableMasterDataCableDataCablesWithHttpInfo(@Param("elid") String elid, CableMasterDataCableDataCablesRequestData body, @QueryMap(encoded=true) CableMasterDataCableDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterDataCableDataCables</code> method in a fluent style.
   */
  public static class CableMasterDataCableDataCablesQueryParams extends HashMap<String, Object> {
    public CableMasterDataCableDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CableMasterDataCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterDataCableQueryResponse cableMasterDataCableQuery(@Param("sessionId") String sessionId, CableMasterDataCableQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cableMasterDataCableQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterDataCableQueryResponse> cableMasterDataCableQueryWithHttpInfo(@Param("sessionId") String sessionId, CableMasterDataCableQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>cableMasterDataCableQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterDataCableQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterDataCableQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterDataCableQueryResponse cableMasterDataCableQuery(CableMasterDataCableQueryRequest body, @QueryMap(encoded=true) CableMasterDataCableQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>cableMasterDataCableQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterDataCableQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterDataCableQueryResponse> cableMasterDataCableQueryWithHttpInfo(CableMasterDataCableQueryRequest body, @QueryMap(encoded=true) CableMasterDataCableQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterDataCableQuery</code> method in a fluent style.
   */
  public static class CableMasterDataCableQueryQueryParams extends HashMap<String, Object> {
    public CableMasterDataCableQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query conductors (master data)
   * Query cable conductors (master data)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CableMasterDataCableQueryConductorMasterResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/queryConductorMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterDataCableQueryConductorMasterResponse cableMasterDataCableQueryConductorMaster(@Param("sessionId") String sessionId, CableMasterDataCableQueryConductorMasterRequest body);

  /**
   * Query conductors (master data)
   * Similar to <code>cableMasterDataCableQueryConductorMaster</code> but it also returns the http response headers .
   * Query cable conductors (master data)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/queryConductorMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterDataCableQueryConductorMasterResponse> cableMasterDataCableQueryConductorMasterWithHttpInfo(@Param("sessionId") String sessionId, CableMasterDataCableQueryConductorMasterRequest body);


  /**
   * Query conductors (master data)
   * Query cable conductors (master data)
   * Note, this is equivalent to the other <code>cableMasterDataCableQueryConductorMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterDataCableQueryConductorMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterDataCableQueryConductorMasterResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/queryConductorMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterDataCableQueryConductorMasterResponse cableMasterDataCableQueryConductorMaster(CableMasterDataCableQueryConductorMasterRequest body, @QueryMap(encoded=true) CableMasterDataCableQueryConductorMasterQueryParams queryParams);

  /**
  * Query conductors (master data)
  * Query cable conductors (master data)
  * Note, this is equivalent to the other <code>cableMasterDataCableQueryConductorMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterDataCableQueryConductorMasterResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/queryConductorMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterDataCableQueryConductorMasterResponse> cableMasterDataCableQueryConductorMasterWithHttpInfo(CableMasterDataCableQueryConductorMasterRequest body, @QueryMap(encoded=true) CableMasterDataCableQueryConductorMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterDataCableQueryConductorMaster</code> method in a fluent style.
   */
  public static class CableMasterDataCableQueryConductorMasterQueryParams extends HashMap<String, Object> {
    public CableMasterDataCableQueryConductorMasterQueryParams sessionId(final String value) {
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
   * @return CableMasterDataCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CableMasterDataCableSystemAttributesResponse cableMasterDataCableSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterDataCableSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cableMasterDataCableSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CableMasterDataCableSystemAttributesResponse> cableMasterDataCableSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CableMasterDataCableSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>cableMasterDataCableSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CableMasterDataCableSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CableMasterDataCableSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CableMasterDataCableSystemAttributesResponse cableMasterDataCableSystemAttributes(@Param("elid") String elid, CableMasterDataCableSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterDataCableSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>cableMasterDataCableSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CableMasterDataCableSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CableMasterDataCableSystemAttributesResponse> cableMasterDataCableSystemAttributesWithHttpInfo(@Param("elid") String elid, CableMasterDataCableSystemAttributesRequest body, @QueryMap(encoded=true) CableMasterDataCableSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cableMasterDataCableSystemAttributes</code> method in a fluent style.
   */
  public static class CableMasterDataCableSystemAttributesQueryParams extends HashMap<String, Object> {
    public CableMasterDataCableSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create cable master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCableMasterDataCableResponse createCableMasterDataCable(@Param("sessionId") String sessionId, CreateCableMasterDataCableRequestData body);

  /**
   * Create
   * Similar to <code>createCableMasterDataCable</code> but it also returns the http response headers .
   * Create cable master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCableMasterDataCableResponse> createCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, CreateCableMasterDataCableRequestData body);


  /**
   * Create
   * Create cable master
   * Note, this is equivalent to the other <code>createCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCableMasterDataCableResponse createCableMasterDataCable(CreateCableMasterDataCableRequestData body, @QueryMap(encoded=true) CreateCableMasterDataCableQueryParams queryParams);

  /**
  * Create
  * Create cable master
  * Note, this is equivalent to the other <code>createCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCableMasterDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCableMasterDataCableResponse> createCableMasterDataCableWithHttpInfo(CreateCableMasterDataCableRequestData body, @QueryMap(encoded=true) CreateCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCableMasterDataCable</code> method in a fluent style.
   */
  public static class CreateCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public CreateCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return DeleteCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCableMasterDataCableResponse deleteCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCableMasterDataCableRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCableMasterDataCable</code> but it also returns the http response headers .
   * Delete cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCableMasterDataCableResponse> deleteCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCableMasterDataCableRequestData body);


  /**
   * Delete
   * Delete cable master
   * Note, this is equivalent to the other <code>deleteCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCableMasterDataCableResponse deleteCableMasterDataCable(@Param("elid") String elid, DeleteCableMasterDataCableRequestData body, @QueryMap(encoded=true) DeleteCableMasterDataCableQueryParams queryParams);

  /**
  * Delete
  * Delete cable master
  * Note, this is equivalent to the other <code>deleteCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCableMasterDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCableMasterDataCableResponse> deleteCableMasterDataCableWithHttpInfo(@Param("elid") String elid, DeleteCableMasterDataCableRequestData body, @QueryMap(encoded=true) DeleteCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCableMasterDataCable</code> method in a fluent style.
   */
  public static class DeleteCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public DeleteCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return UpdateCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCableMasterDataCableResponse updateCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCableMasterDataCableRequestData body);

  /**
   * Modify
   * Similar to <code>updateCableMasterDataCable</code> but it also returns the http response headers .
   * Modify cable master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCableMasterDataCableResponse> updateCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCableMasterDataCableRequestData body);


  /**
   * Modify
   * Modify cable master
   * Note, this is equivalent to the other <code>updateCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCableMasterDataCableResponse updateCableMasterDataCable(@Param("elid") String elid, UpdateCableMasterDataCableRequestData body, @QueryMap(encoded=true) UpdateCableMasterDataCableQueryParams queryParams);

  /**
  * Modify
  * Modify cable master
  * Note, this is equivalent to the other <code>updateCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCableMasterDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCableMasterDataCableResponse> updateCableMasterDataCableWithHttpInfo(@Param("elid") String elid, UpdateCableMasterDataCableRequestData body, @QueryMap(encoded=true) UpdateCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCableMasterDataCable</code> method in a fluent style.
   */
  public static class UpdateCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public UpdateCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCableMasterDataCableResponse updateSystemAttributesCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCableMasterDataCableRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCableMasterDataCable</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCableMasterDataCableResponse> updateSystemAttributesCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCableMasterDataCableRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCableMasterDataCableResponse
   */
  @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCableMasterDataCableResponse updateSystemAttributesCableMasterDataCable(@Param("elid") String elid, UpdateSystemAttributesCableMasterDataCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCableMasterDataCableQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCableMasterDataCableResponse
      */
      @RequestLine("POST /api/rest/entity/cableMasterDataCable/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCableMasterDataCableResponse> updateSystemAttributesCableMasterDataCableWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCableMasterDataCableRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCableMasterDataCable</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCableMasterDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
