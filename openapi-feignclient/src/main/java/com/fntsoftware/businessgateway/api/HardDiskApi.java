package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateHardDiskRequestData;
import com.fntsoftware.businessgateway.entities.CreateHardDiskResponse;
import com.fntsoftware.businessgateway.entities.DeleteHardDiskRequestData;
import com.fntsoftware.businessgateway.entities.DeleteHardDiskResponse;
import com.fntsoftware.businessgateway.entities.HardDiskFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.HardDiskFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.HardDiskQueryRequest;
import com.fntsoftware.businessgateway.entities.HardDiskQueryResponse;
import com.fntsoftware.businessgateway.entities.HardDiskServerRequestData;
import com.fntsoftware.businessgateway.entities.HardDiskServerResponseData;
import com.fntsoftware.businessgateway.entities.HardDiskSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.HardDiskSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateHardDiskRequestData;
import com.fntsoftware.businessgateway.entities.UpdateHardDiskResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesHardDiskRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesHardDiskResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface HardDiskApi extends ApiClient.Api {


  /**
   * Create
   * Create hard disk
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateHardDiskResponse createHardDisk(@Param("sessionId") String sessionId, CreateHardDiskRequestData body);

  /**
   * Create
   * Similar to <code>createHardDisk</code> but it also returns the http response headers .
   * Create hard disk
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateHardDiskResponse> createHardDiskWithHttpInfo(@Param("sessionId") String sessionId, CreateHardDiskRequestData body);


  /**
   * Create
   * Create hard disk
   * Note, this is equivalent to the other <code>createHardDisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateHardDiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateHardDiskResponse createHardDisk(CreateHardDiskRequestData body, @QueryMap(encoded=true) CreateHardDiskQueryParams queryParams);

  /**
  * Create
  * Create hard disk
  * Note, this is equivalent to the other <code>createHardDisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateHardDiskResponse
      */
      @RequestLine("POST /api/rest/entity/hardDisk/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateHardDiskResponse> createHardDiskWithHttpInfo(CreateHardDiskRequestData body, @QueryMap(encoded=true) CreateHardDiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createHardDisk</code> method in a fluent style.
   */
  public static class CreateHardDiskQueryParams extends HashMap<String, Object> {
    public CreateHardDiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete hard disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteHardDiskResponse deleteHardDisk(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteHardDiskRequestData body);

  /**
   * Delete
   * Similar to <code>deleteHardDisk</code> but it also returns the http response headers .
   * Delete hard disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteHardDiskResponse> deleteHardDiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteHardDiskRequestData body);


  /**
   * Delete
   * Delete hard disk
   * Note, this is equivalent to the other <code>deleteHardDisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteHardDiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteHardDiskResponse deleteHardDisk(@Param("elid") String elid, DeleteHardDiskRequestData body, @QueryMap(encoded=true) DeleteHardDiskQueryParams queryParams);

  /**
  * Delete
  * Delete hard disk
  * Note, this is equivalent to the other <code>deleteHardDisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteHardDiskResponse
      */
      @RequestLine("POST /api/rest/entity/hardDisk/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteHardDiskResponse> deleteHardDiskWithHttpInfo(@Param("elid") String elid, DeleteHardDiskRequestData body, @QueryMap(encoded=true) DeleteHardDiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteHardDisk</code> method in a fluent style.
   */
  public static class DeleteHardDiskQueryParams extends HashMap<String, Object> {
    public DeleteHardDiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to File system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return HardDiskFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HardDiskFileSystemsResponseData hardDiskFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, HardDiskFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>hardDiskFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HardDiskFileSystemsResponseData> hardDiskFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HardDiskFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>hardDiskFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HardDiskFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HardDiskFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HardDiskFileSystemsResponseData hardDiskFileSystems(@Param("elid") String elid, HardDiskFileSystemsRequestData body, @QueryMap(encoded=true) HardDiskFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>hardDiskFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HardDiskFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/hardDisk/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HardDiskFileSystemsResponseData> hardDiskFileSystemsWithHttpInfo(@Param("elid") String elid, HardDiskFileSystemsRequestData body, @QueryMap(encoded=true) HardDiskFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hardDiskFileSystems</code> method in a fluent style.
   */
  public static class HardDiskFileSystemsQueryParams extends HashMap<String, Object> {
    public HardDiskFileSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HardDiskQueryResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HardDiskQueryResponse hardDiskQuery(@Param("sessionId") String sessionId, HardDiskQueryRequest body);

  /**
   * Basic query
   * Similar to <code>hardDiskQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HardDiskQueryResponse> hardDiskQueryWithHttpInfo(@Param("sessionId") String sessionId, HardDiskQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>hardDiskQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HardDiskQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HardDiskQueryResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HardDiskQueryResponse hardDiskQuery(HardDiskQueryRequest body, @QueryMap(encoded=true) HardDiskQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>hardDiskQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HardDiskQueryResponse
      */
      @RequestLine("POST /api/rest/entity/hardDisk/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HardDiskQueryResponse> hardDiskQueryWithHttpInfo(HardDiskQueryRequest body, @QueryMap(encoded=true) HardDiskQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hardDiskQuery</code> method in a fluent style.
   */
  public static class HardDiskQueryQueryParams extends HashMap<String, Object> {
    public HardDiskQueryQueryParams sessionId(final String value) {
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
   * @return HardDiskServerResponseData
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HardDiskServerResponseData hardDiskServer(@Param("sessionId") String sessionId, @Param("elid") String elid, HardDiskServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>hardDiskServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HardDiskServerResponseData> hardDiskServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HardDiskServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>hardDiskServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HardDiskServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HardDiskServerResponseData
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HardDiskServerResponseData hardDiskServer(@Param("elid") String elid, HardDiskServerRequestData body, @QueryMap(encoded=true) HardDiskServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>hardDiskServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HardDiskServerResponseData
      */
      @RequestLine("POST /api/rest/entity/hardDisk/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HardDiskServerResponseData> hardDiskServerWithHttpInfo(@Param("elid") String elid, HardDiskServerRequestData body, @QueryMap(encoded=true) HardDiskServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hardDiskServer</code> method in a fluent style.
   */
  public static class HardDiskServerQueryParams extends HashMap<String, Object> {
    public HardDiskServerQueryParams sessionId(final String value) {
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
   * @return HardDiskSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HardDiskSystemAttributesResponse hardDiskSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, HardDiskSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>hardDiskSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HardDiskSystemAttributesResponse> hardDiskSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, HardDiskSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>hardDiskSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HardDiskSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HardDiskSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HardDiskSystemAttributesResponse hardDiskSystemAttributes(@Param("elid") String elid, HardDiskSystemAttributesRequest body, @QueryMap(encoded=true) HardDiskSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>hardDiskSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HardDiskSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/hardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HardDiskSystemAttributesResponse> hardDiskSystemAttributesWithHttpInfo(@Param("elid") String elid, HardDiskSystemAttributesRequest body, @QueryMap(encoded=true) HardDiskSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>hardDiskSystemAttributes</code> method in a fluent style.
   */
  public static class HardDiskSystemAttributesQueryParams extends HashMap<String, Object> {
    public HardDiskSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify hard disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateHardDiskResponse updateHardDisk(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateHardDiskRequestData body);

  /**
   * Modify
   * Similar to <code>updateHardDisk</code> but it also returns the http response headers .
   * Modify hard disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateHardDiskResponse> updateHardDiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateHardDiskRequestData body);


  /**
   * Modify
   * Modify hard disk
   * Note, this is equivalent to the other <code>updateHardDisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateHardDiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateHardDiskResponse updateHardDisk(@Param("elid") String elid, UpdateHardDiskRequestData body, @QueryMap(encoded=true) UpdateHardDiskQueryParams queryParams);

  /**
  * Modify
  * Modify hard disk
  * Note, this is equivalent to the other <code>updateHardDisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateHardDiskResponse
      */
      @RequestLine("POST /api/rest/entity/hardDisk/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateHardDiskResponse> updateHardDiskWithHttpInfo(@Param("elid") String elid, UpdateHardDiskRequestData body, @QueryMap(encoded=true) UpdateHardDiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateHardDisk</code> method in a fluent style.
   */
  public static class UpdateHardDiskQueryParams extends HashMap<String, Object> {
    public UpdateHardDiskQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesHardDiskResponse updateSystemAttributesHardDisk(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesHardDiskRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesHardDisk</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesHardDiskResponse> updateSystemAttributesHardDiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesHardDiskRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesHardDisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesHardDiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/hardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesHardDiskResponse updateSystemAttributesHardDisk(@Param("elid") String elid, UpdateSystemAttributesHardDiskRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesHardDiskQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesHardDisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesHardDiskResponse
      */
      @RequestLine("POST /api/rest/entity/hardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesHardDiskResponse> updateSystemAttributesHardDiskWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesHardDiskRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesHardDiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesHardDisk</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesHardDiskQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesHardDiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
