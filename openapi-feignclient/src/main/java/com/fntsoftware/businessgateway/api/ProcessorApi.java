package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateProcessorRequestData;
import com.fntsoftware.businessgateway.entities.CreateProcessorResponse;
import com.fntsoftware.businessgateway.entities.DeleteProcessorRequestData;
import com.fntsoftware.businessgateway.entities.DeleteProcessorResponse;
import com.fntsoftware.businessgateway.entities.ProcessorQueryRequest;
import com.fntsoftware.businessgateway.entities.ProcessorQueryResponse;
import com.fntsoftware.businessgateway.entities.ProcessorServerRequestData;
import com.fntsoftware.businessgateway.entities.ProcessorServerResponseData;
import com.fntsoftware.businessgateway.entities.ProcessorSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ProcessorSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateProcessorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateProcessorResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesProcessorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesProcessorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ProcessorApi extends ApiClient.Api {


  /**
   * Create
   * Create processor
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateProcessorResponse createProcessor(@Param("sessionId") String sessionId, CreateProcessorRequestData body);

  /**
   * Create
   * Similar to <code>createProcessor</code> but it also returns the http response headers .
   * Create processor
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateProcessorResponse> createProcessorWithHttpInfo(@Param("sessionId") String sessionId, CreateProcessorRequestData body);


  /**
   * Create
   * Create processor
   * Note, this is equivalent to the other <code>createProcessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateProcessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateProcessorResponse createProcessor(CreateProcessorRequestData body, @QueryMap(encoded=true) CreateProcessorQueryParams queryParams);

  /**
  * Create
  * Create processor
  * Note, this is equivalent to the other <code>createProcessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateProcessorResponse
      */
      @RequestLine("POST /api/rest/entity/processor/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateProcessorResponse> createProcessorWithHttpInfo(CreateProcessorRequestData body, @QueryMap(encoded=true) CreateProcessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createProcessor</code> method in a fluent style.
   */
  public static class CreateProcessorQueryParams extends HashMap<String, Object> {
    public CreateProcessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete processor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteProcessorResponse deleteProcessor(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteProcessorRequestData body);

  /**
   * Delete
   * Similar to <code>deleteProcessor</code> but it also returns the http response headers .
   * Delete processor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteProcessorResponse> deleteProcessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteProcessorRequestData body);


  /**
   * Delete
   * Delete processor
   * Note, this is equivalent to the other <code>deleteProcessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteProcessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteProcessorResponse deleteProcessor(@Param("elid") String elid, DeleteProcessorRequestData body, @QueryMap(encoded=true) DeleteProcessorQueryParams queryParams);

  /**
  * Delete
  * Delete processor
  * Note, this is equivalent to the other <code>deleteProcessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteProcessorResponse
      */
      @RequestLine("POST /api/rest/entity/processor/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteProcessorResponse> deleteProcessorWithHttpInfo(@Param("elid") String elid, DeleteProcessorRequestData body, @QueryMap(encoded=true) DeleteProcessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteProcessor</code> method in a fluent style.
   */
  public static class DeleteProcessorQueryParams extends HashMap<String, Object> {
    public DeleteProcessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ProcessorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/processor/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProcessorQueryResponse processorQuery(@Param("sessionId") String sessionId, ProcessorQueryRequest body);

  /**
   * Basic query
   * Similar to <code>processorQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ProcessorQueryResponse> processorQueryWithHttpInfo(@Param("sessionId") String sessionId, ProcessorQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>processorQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ProcessorQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ProcessorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/processor/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ProcessorQueryResponse processorQuery(ProcessorQueryRequest body, @QueryMap(encoded=true) ProcessorQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>processorQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ProcessorQueryResponse
      */
      @RequestLine("POST /api/rest/entity/processor/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ProcessorQueryResponse> processorQueryWithHttpInfo(ProcessorQueryRequest body, @QueryMap(encoded=true) ProcessorQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>processorQuery</code> method in a fluent style.
   */
  public static class ProcessorQueryQueryParams extends HashMap<String, Object> {
    public ProcessorQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ProcessorServerResponseData
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProcessorServerResponseData processorServer(@Param("sessionId") String sessionId, @Param("elid") String elid, ProcessorServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>processorServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ProcessorServerResponseData> processorServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ProcessorServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>processorServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ProcessorServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ProcessorServerResponseData
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ProcessorServerResponseData processorServer(@Param("elid") String elid, ProcessorServerRequestData body, @QueryMap(encoded=true) ProcessorServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>processorServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ProcessorServerResponseData
      */
      @RequestLine("POST /api/rest/entity/processor/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ProcessorServerResponseData> processorServerWithHttpInfo(@Param("elid") String elid, ProcessorServerRequestData body, @QueryMap(encoded=true) ProcessorServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>processorServer</code> method in a fluent style.
   */
  public static class ProcessorServerQueryParams extends HashMap<String, Object> {
    public ProcessorServerQueryParams sessionId(final String value) {
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
   * @return ProcessorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProcessorSystemAttributesResponse processorSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ProcessorSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>processorSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ProcessorSystemAttributesResponse> processorSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ProcessorSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>processorSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ProcessorSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ProcessorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ProcessorSystemAttributesResponse processorSystemAttributes(@Param("elid") String elid, ProcessorSystemAttributesRequest body, @QueryMap(encoded=true) ProcessorSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>processorSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ProcessorSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/processor/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ProcessorSystemAttributesResponse> processorSystemAttributesWithHttpInfo(@Param("elid") String elid, ProcessorSystemAttributesRequest body, @QueryMap(encoded=true) ProcessorSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>processorSystemAttributes</code> method in a fluent style.
   */
  public static class ProcessorSystemAttributesQueryParams extends HashMap<String, Object> {
    public ProcessorSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify processor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateProcessorResponse updateProcessor(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateProcessorRequestData body);

  /**
   * Modify
   * Similar to <code>updateProcessor</code> but it also returns the http response headers .
   * Modify processor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateProcessorResponse> updateProcessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateProcessorRequestData body);


  /**
   * Modify
   * Modify processor
   * Note, this is equivalent to the other <code>updateProcessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateProcessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateProcessorResponse updateProcessor(@Param("elid") String elid, UpdateProcessorRequestData body, @QueryMap(encoded=true) UpdateProcessorQueryParams queryParams);

  /**
  * Modify
  * Modify processor
  * Note, this is equivalent to the other <code>updateProcessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateProcessorResponse
      */
      @RequestLine("POST /api/rest/entity/processor/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateProcessorResponse> updateProcessorWithHttpInfo(@Param("elid") String elid, UpdateProcessorRequestData body, @QueryMap(encoded=true) UpdateProcessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateProcessor</code> method in a fluent style.
   */
  public static class UpdateProcessorQueryParams extends HashMap<String, Object> {
    public UpdateProcessorQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesProcessorResponse updateSystemAttributesProcessor(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesProcessorRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesProcessor</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesProcessorResponse> updateSystemAttributesProcessorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesProcessorRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesProcessor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesProcessorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesProcessorResponse
   */
  @RequestLine("POST /api/rest/entity/processor/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesProcessorResponse updateSystemAttributesProcessor(@Param("elid") String elid, UpdateSystemAttributesProcessorRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesProcessorQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesProcessor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesProcessorResponse
      */
      @RequestLine("POST /api/rest/entity/processor/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesProcessorResponse> updateSystemAttributesProcessorWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesProcessorRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesProcessorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesProcessor</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesProcessorQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesProcessorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
