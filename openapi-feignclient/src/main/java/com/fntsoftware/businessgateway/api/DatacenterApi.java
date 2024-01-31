package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDatacenterRequestData;
import com.fntsoftware.businessgateway.entities.CreateDatacenterResponse;
import com.fntsoftware.businessgateway.entities.DatacenterQueryRequest;
import com.fntsoftware.businessgateway.entities.DatacenterQueryResponse;
import com.fntsoftware.businessgateway.entities.DatacenterServerfarmsRequestData;
import com.fntsoftware.businessgateway.entities.DatacenterServerfarmsResponseData;
import com.fntsoftware.businessgateway.entities.DatacenterSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DatacenterSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteDatacenterRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDatacenterResponse;
import com.fntsoftware.businessgateway.entities.UpdateDatacenterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDatacenterResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDatacenterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDatacenterResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DatacenterApi extends ApiClient.Api {


  /**
   * Create
   * Create Datacenter
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDatacenterResponse createDatacenter(@Param("sessionId") String sessionId, CreateDatacenterRequestData body);

  /**
   * Create
   * Similar to <code>createDatacenter</code> but it also returns the http response headers .
   * Create Datacenter
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDatacenterResponse> createDatacenterWithHttpInfo(@Param("sessionId") String sessionId, CreateDatacenterRequestData body);


  /**
   * Create
   * Create Datacenter
   * Note, this is equivalent to the other <code>createDatacenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDatacenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDatacenterResponse createDatacenter(CreateDatacenterRequestData body, @QueryMap(encoded=true) CreateDatacenterQueryParams queryParams);

  /**
  * Create
  * Create Datacenter
  * Note, this is equivalent to the other <code>createDatacenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDatacenterResponse
      */
      @RequestLine("POST /api/rest/entity/datacenter/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDatacenterResponse> createDatacenterWithHttpInfo(CreateDatacenterRequestData body, @QueryMap(encoded=true) CreateDatacenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDatacenter</code> method in a fluent style.
   */
  public static class CreateDatacenterQueryParams extends HashMap<String, Object> {
    public CreateDatacenterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DatacenterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatacenterQueryResponse datacenterQuery(@Param("sessionId") String sessionId, DatacenterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>datacenterQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatacenterQueryResponse> datacenterQueryWithHttpInfo(@Param("sessionId") String sessionId, DatacenterQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * Note, this is equivalent to the other <code>datacenterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DatacenterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DatacenterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DatacenterQueryResponse datacenterQuery(DatacenterQueryRequest body, @QueryMap(encoded=true) DatacenterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data
  * Note, this is equivalent to the other <code>datacenterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DatacenterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/datacenter/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DatacenterQueryResponse> datacenterQueryWithHttpInfo(DatacenterQueryRequest body, @QueryMap(encoded=true) DatacenterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>datacenterQuery</code> method in a fluent style.
   */
  public static class DatacenterQueryQueryParams extends HashMap<String, Object> {
    public DatacenterQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Serverfarm entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DatacenterServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatacenterServerfarmsResponseData datacenterServerfarms(@Param("sessionId") String sessionId, @Param("elid") String elid, DatacenterServerfarmsRequestData body);

  /**
   * Get relations to Serverfarm entities
   * Similar to <code>datacenterServerfarms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatacenterServerfarmsResponseData> datacenterServerfarmsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DatacenterServerfarmsRequestData body);


  /**
   * Get relations to Serverfarm entities
   * 
   * Note, this is equivalent to the other <code>datacenterServerfarms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DatacenterServerfarmsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DatacenterServerfarmsResponseData
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/Serverfarms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DatacenterServerfarmsResponseData datacenterServerfarms(@Param("elid") String elid, DatacenterServerfarmsRequestData body, @QueryMap(encoded=true) DatacenterServerfarmsQueryParams queryParams);

  /**
  * Get relations to Serverfarm entities
  * 
  * Note, this is equivalent to the other <code>datacenterServerfarms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DatacenterServerfarmsResponseData
      */
      @RequestLine("POST /api/rest/entity/datacenter/{elid}/Serverfarms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DatacenterServerfarmsResponseData> datacenterServerfarmsWithHttpInfo(@Param("elid") String elid, DatacenterServerfarmsRequestData body, @QueryMap(encoded=true) DatacenterServerfarmsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>datacenterServerfarms</code> method in a fluent style.
   */
  public static class DatacenterServerfarmsQueryParams extends HashMap<String, Object> {
    public DatacenterServerfarmsQueryParams sessionId(final String value) {
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
   * @return DatacenterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DatacenterSystemAttributesResponse datacenterSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DatacenterSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>datacenterSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DatacenterSystemAttributesResponse> datacenterSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DatacenterSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>datacenterSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DatacenterSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DatacenterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DatacenterSystemAttributesResponse datacenterSystemAttributes(@Param("elid") String elid, DatacenterSystemAttributesRequest body, @QueryMap(encoded=true) DatacenterSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>datacenterSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DatacenterSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/datacenter/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DatacenterSystemAttributesResponse> datacenterSystemAttributesWithHttpInfo(@Param("elid") String elid, DatacenterSystemAttributesRequest body, @QueryMap(encoded=true) DatacenterSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>datacenterSystemAttributes</code> method in a fluent style.
   */
  public static class DatacenterSystemAttributesQueryParams extends HashMap<String, Object> {
    public DatacenterSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDatacenterResponse deleteDatacenter(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDatacenterRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDatacenter</code> but it also returns the http response headers .
   * Delete Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDatacenterResponse> deleteDatacenterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDatacenterRequestData body);


  /**
   * Delete
   * Delete Datacenter
   * Note, this is equivalent to the other <code>deleteDatacenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDatacenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDatacenterResponse deleteDatacenter(@Param("elid") String elid, DeleteDatacenterRequestData body, @QueryMap(encoded=true) DeleteDatacenterQueryParams queryParams);

  /**
  * Delete
  * Delete Datacenter
  * Note, this is equivalent to the other <code>deleteDatacenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDatacenterResponse
      */
      @RequestLine("POST /api/rest/entity/datacenter/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDatacenterResponse> deleteDatacenterWithHttpInfo(@Param("elid") String elid, DeleteDatacenterRequestData body, @QueryMap(encoded=true) DeleteDatacenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDatacenter</code> method in a fluent style.
   */
  public static class DeleteDatacenterQueryParams extends HashMap<String, Object> {
    public DeleteDatacenterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDatacenterResponse updateDatacenter(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDatacenterRequestData body);

  /**
   * Modify
   * Similar to <code>updateDatacenter</code> but it also returns the http response headers .
   * Modify Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDatacenterResponse> updateDatacenterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDatacenterRequestData body);


  /**
   * Modify
   * Modify Datacenter
   * Note, this is equivalent to the other <code>updateDatacenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDatacenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDatacenterResponse updateDatacenter(@Param("elid") String elid, UpdateDatacenterRequestData body, @QueryMap(encoded=true) UpdateDatacenterQueryParams queryParams);

  /**
  * Modify
  * Modify Datacenter
  * Note, this is equivalent to the other <code>updateDatacenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDatacenterResponse
      */
      @RequestLine("POST /api/rest/entity/datacenter/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDatacenterResponse> updateDatacenterWithHttpInfo(@Param("elid") String elid, UpdateDatacenterRequestData body, @QueryMap(encoded=true) UpdateDatacenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDatacenter</code> method in a fluent style.
   */
  public static class UpdateDatacenterQueryParams extends HashMap<String, Object> {
    public UpdateDatacenterQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDatacenterResponse updateSystemAttributesDatacenter(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDatacenterRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDatacenter</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDatacenterResponse> updateSystemAttributesDatacenterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDatacenterRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDatacenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDatacenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDatacenterResponse
   */
  @RequestLine("POST /api/rest/entity/datacenter/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDatacenterResponse updateSystemAttributesDatacenter(@Param("elid") String elid, UpdateSystemAttributesDatacenterRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDatacenterQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDatacenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDatacenterResponse
      */
      @RequestLine("POST /api/rest/entity/datacenter/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDatacenterResponse> updateSystemAttributesDatacenterWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDatacenterRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDatacenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDatacenter</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDatacenterQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDatacenterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
