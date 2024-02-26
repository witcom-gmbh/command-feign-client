package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CpuMappingQueryRequest;
import com.fntsoftware.businessgateway.entities.CpuMappingQueryResponse;
import com.fntsoftware.businessgateway.entities.CpuMappingSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CpuMappingSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateCpuMappingRequestData;
import com.fntsoftware.businessgateway.entities.CreateCpuMappingResponse;
import com.fntsoftware.businessgateway.entities.DeleteCpuMappingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCpuMappingResponse;
import com.fntsoftware.businessgateway.entities.UpdateCpuMappingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCpuMappingResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCpuMappingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCpuMappingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CpuMappingApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CpuMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CpuMappingQueryResponse cpuMappingQuery(@Param("sessionId") String sessionId, CpuMappingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cpuMappingQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CpuMappingQueryResponse> cpuMappingQueryWithHttpInfo(@Param("sessionId") String sessionId, CpuMappingQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * Note, this is equivalent to the other <code>cpuMappingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CpuMappingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CpuMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CpuMappingQueryResponse cpuMappingQuery(CpuMappingQueryRequest body, @QueryMap(encoded=true) CpuMappingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data
  * Note, this is equivalent to the other <code>cpuMappingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CpuMappingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cpuMapping/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CpuMappingQueryResponse> cpuMappingQueryWithHttpInfo(CpuMappingQueryRequest body, @QueryMap(encoded=true) CpuMappingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cpuMappingQuery</code> method in a fluent style.
   */
  public static class CpuMappingQueryQueryParams extends HashMap<String, Object> {
    public CpuMappingQueryQueryParams sessionId(final String value) {
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
   * @return CpuMappingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CpuMappingSystemAttributesResponse cpuMappingSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CpuMappingSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cpuMappingSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CpuMappingSystemAttributesResponse> cpuMappingSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CpuMappingSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>cpuMappingSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CpuMappingSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CpuMappingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CpuMappingSystemAttributesResponse cpuMappingSystemAttributes(@Param("elid") String elid, CpuMappingSystemAttributesRequest body, @QueryMap(encoded=true) CpuMappingSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>cpuMappingSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CpuMappingSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CpuMappingSystemAttributesResponse> cpuMappingSystemAttributesWithHttpInfo(@Param("elid") String elid, CpuMappingSystemAttributesRequest body, @QueryMap(encoded=true) CpuMappingSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cpuMappingSystemAttributes</code> method in a fluent style.
   */
  public static class CpuMappingSystemAttributesQueryParams extends HashMap<String, Object> {
    public CpuMappingSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create CPU Mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCpuMappingResponse createCpuMapping(@Param("sessionId") String sessionId, CreateCpuMappingRequestData body);

  /**
   * Create
   * Similar to <code>createCpuMapping</code> but it also returns the http response headers .
   * Create CPU Mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCpuMappingResponse> createCpuMappingWithHttpInfo(@Param("sessionId") String sessionId, CreateCpuMappingRequestData body);


  /**
   * Create
   * Create CPU Mapping
   * Note, this is equivalent to the other <code>createCpuMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCpuMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCpuMappingResponse createCpuMapping(CreateCpuMappingRequestData body, @QueryMap(encoded=true) CreateCpuMappingQueryParams queryParams);

  /**
  * Create
  * Create CPU Mapping
  * Note, this is equivalent to the other <code>createCpuMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCpuMappingResponse
      */
      @RequestLine("POST /api/rest/entity/cpuMapping/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCpuMappingResponse> createCpuMappingWithHttpInfo(CreateCpuMappingRequestData body, @QueryMap(encoded=true) CreateCpuMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCpuMapping</code> method in a fluent style.
   */
  public static class CreateCpuMappingQueryParams extends HashMap<String, Object> {
    public CreateCpuMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete CPU Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCpuMappingResponse deleteCpuMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCpuMappingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCpuMapping</code> but it also returns the http response headers .
   * Delete CPU Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCpuMappingResponse> deleteCpuMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCpuMappingRequestData body);


  /**
   * Delete
   * Delete CPU Mapping
   * Note, this is equivalent to the other <code>deleteCpuMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCpuMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCpuMappingResponse deleteCpuMapping(@Param("elid") String elid, DeleteCpuMappingRequestData body, @QueryMap(encoded=true) DeleteCpuMappingQueryParams queryParams);

  /**
  * Delete
  * Delete CPU Mapping
  * Note, this is equivalent to the other <code>deleteCpuMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCpuMappingResponse
      */
      @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCpuMappingResponse> deleteCpuMappingWithHttpInfo(@Param("elid") String elid, DeleteCpuMappingRequestData body, @QueryMap(encoded=true) DeleteCpuMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCpuMapping</code> method in a fluent style.
   */
  public static class DeleteCpuMappingQueryParams extends HashMap<String, Object> {
    public DeleteCpuMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify CPU Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCpuMappingResponse updateCpuMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCpuMappingRequestData body);

  /**
   * Modify
   * Similar to <code>updateCpuMapping</code> but it also returns the http response headers .
   * Modify CPU Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCpuMappingResponse> updateCpuMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCpuMappingRequestData body);


  /**
   * Modify
   * Modify CPU Mapping
   * Note, this is equivalent to the other <code>updateCpuMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCpuMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCpuMappingResponse updateCpuMapping(@Param("elid") String elid, UpdateCpuMappingRequestData body, @QueryMap(encoded=true) UpdateCpuMappingQueryParams queryParams);

  /**
  * Modify
  * Modify CPU Mapping
  * Note, this is equivalent to the other <code>updateCpuMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCpuMappingResponse
      */
      @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCpuMappingResponse> updateCpuMappingWithHttpInfo(@Param("elid") String elid, UpdateCpuMappingRequestData body, @QueryMap(encoded=true) UpdateCpuMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCpuMapping</code> method in a fluent style.
   */
  public static class UpdateCpuMappingQueryParams extends HashMap<String, Object> {
    public UpdateCpuMappingQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCpuMappingResponse updateSystemAttributesCpuMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCpuMappingRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCpuMapping</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCpuMappingResponse> updateSystemAttributesCpuMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCpuMappingRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCpuMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCpuMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCpuMappingResponse
   */
  @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCpuMappingResponse updateSystemAttributesCpuMapping(@Param("elid") String elid, UpdateSystemAttributesCpuMappingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCpuMappingQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCpuMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCpuMappingResponse
      */
      @RequestLine("POST /api/rest/entity/cpuMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCpuMappingResponse> updateSystemAttributesCpuMappingWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCpuMappingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCpuMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCpuMapping</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCpuMappingQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCpuMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
