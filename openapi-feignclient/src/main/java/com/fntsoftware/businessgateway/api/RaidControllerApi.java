package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateRaidControllerRequestData;
import com.fntsoftware.businessgateway.entities.CreateRaidControllerResponse;
import com.fntsoftware.businessgateway.entities.DeleteRaidControllerRequestData;
import com.fntsoftware.businessgateway.entities.DeleteRaidControllerResponse;
import com.fntsoftware.businessgateway.entities.RaidControllerQueryRequest;
import com.fntsoftware.businessgateway.entities.RaidControllerQueryResponse;
import com.fntsoftware.businessgateway.entities.RaidControllerServerRequestData;
import com.fntsoftware.businessgateway.entities.RaidControllerServerResponseData;
import com.fntsoftware.businessgateway.entities.RaidControllerSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.RaidControllerSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateRaidControllerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateRaidControllerResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesRaidControllerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesRaidControllerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface RaidControllerApi extends ApiClient.Api {


  /**
   * Create
   * Create RAID controller
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateRaidControllerResponse createRaidController(@Param("sessionId") String sessionId, CreateRaidControllerRequestData body);

  /**
   * Create
   * Similar to <code>createRaidController</code> but it also returns the http response headers .
   * Create RAID controller
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateRaidControllerResponse> createRaidControllerWithHttpInfo(@Param("sessionId") String sessionId, CreateRaidControllerRequestData body);


  /**
   * Create
   * Create RAID controller
   * Note, this is equivalent to the other <code>createRaidController</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateRaidControllerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateRaidControllerResponse createRaidController(CreateRaidControllerRequestData body, @QueryMap(encoded=true) CreateRaidControllerQueryParams queryParams);

  /**
  * Create
  * Create RAID controller
  * Note, this is equivalent to the other <code>createRaidController</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateRaidControllerResponse
      */
      @RequestLine("POST /api/rest/entity/raidController/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateRaidControllerResponse> createRaidControllerWithHttpInfo(CreateRaidControllerRequestData body, @QueryMap(encoded=true) CreateRaidControllerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createRaidController</code> method in a fluent style.
   */
  public static class CreateRaidControllerQueryParams extends HashMap<String, Object> {
    public CreateRaidControllerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete RAID controller
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteRaidControllerResponse deleteRaidController(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteRaidControllerRequestData body);

  /**
   * Delete
   * Similar to <code>deleteRaidController</code> but it also returns the http response headers .
   * Delete RAID controller
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteRaidControllerResponse> deleteRaidControllerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteRaidControllerRequestData body);


  /**
   * Delete
   * Delete RAID controller
   * Note, this is equivalent to the other <code>deleteRaidController</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteRaidControllerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteRaidControllerResponse deleteRaidController(@Param("elid") String elid, DeleteRaidControllerRequestData body, @QueryMap(encoded=true) DeleteRaidControllerQueryParams queryParams);

  /**
  * Delete
  * Delete RAID controller
  * Note, this is equivalent to the other <code>deleteRaidController</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteRaidControllerResponse
      */
      @RequestLine("POST /api/rest/entity/raidController/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteRaidControllerResponse> deleteRaidControllerWithHttpInfo(@Param("elid") String elid, DeleteRaidControllerRequestData body, @QueryMap(encoded=true) DeleteRaidControllerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteRaidController</code> method in a fluent style.
   */
  public static class DeleteRaidControllerQueryParams extends HashMap<String, Object> {
    public DeleteRaidControllerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return RaidControllerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RaidControllerQueryResponse raidControllerQuery(@Param("sessionId") String sessionId, RaidControllerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>raidControllerQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RaidControllerQueryResponse> raidControllerQueryWithHttpInfo(@Param("sessionId") String sessionId, RaidControllerQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>raidControllerQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RaidControllerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RaidControllerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RaidControllerQueryResponse raidControllerQuery(RaidControllerQueryRequest body, @QueryMap(encoded=true) RaidControllerQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>raidControllerQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RaidControllerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/raidController/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RaidControllerQueryResponse> raidControllerQueryWithHttpInfo(RaidControllerQueryRequest body, @QueryMap(encoded=true) RaidControllerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>raidControllerQuery</code> method in a fluent style.
   */
  public static class RaidControllerQueryQueryParams extends HashMap<String, Object> {
    public RaidControllerQueryQueryParams sessionId(final String value) {
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
   * @return RaidControllerServerResponseData
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RaidControllerServerResponseData raidControllerServer(@Param("sessionId") String sessionId, @Param("elid") String elid, RaidControllerServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>raidControllerServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RaidControllerServerResponseData> raidControllerServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RaidControllerServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>raidControllerServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RaidControllerServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RaidControllerServerResponseData
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RaidControllerServerResponseData raidControllerServer(@Param("elid") String elid, RaidControllerServerRequestData body, @QueryMap(encoded=true) RaidControllerServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>raidControllerServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RaidControllerServerResponseData
      */
      @RequestLine("POST /api/rest/entity/raidController/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RaidControllerServerResponseData> raidControllerServerWithHttpInfo(@Param("elid") String elid, RaidControllerServerRequestData body, @QueryMap(encoded=true) RaidControllerServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>raidControllerServer</code> method in a fluent style.
   */
  public static class RaidControllerServerQueryParams extends HashMap<String, Object> {
    public RaidControllerServerQueryParams sessionId(final String value) {
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
   * @return RaidControllerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RaidControllerSystemAttributesResponse raidControllerSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, RaidControllerSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>raidControllerSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RaidControllerSystemAttributesResponse> raidControllerSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RaidControllerSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>raidControllerSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RaidControllerSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RaidControllerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RaidControllerSystemAttributesResponse raidControllerSystemAttributes(@Param("elid") String elid, RaidControllerSystemAttributesRequest body, @QueryMap(encoded=true) RaidControllerSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>raidControllerSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RaidControllerSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/raidController/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RaidControllerSystemAttributesResponse> raidControllerSystemAttributesWithHttpInfo(@Param("elid") String elid, RaidControllerSystemAttributesRequest body, @QueryMap(encoded=true) RaidControllerSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>raidControllerSystemAttributes</code> method in a fluent style.
   */
  public static class RaidControllerSystemAttributesQueryParams extends HashMap<String, Object> {
    public RaidControllerSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify RAID controller
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateRaidControllerResponse updateRaidController(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateRaidControllerRequestData body);

  /**
   * Modify
   * Similar to <code>updateRaidController</code> but it also returns the http response headers .
   * Modify RAID controller
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateRaidControllerResponse> updateRaidControllerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateRaidControllerRequestData body);


  /**
   * Modify
   * Modify RAID controller
   * Note, this is equivalent to the other <code>updateRaidController</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateRaidControllerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateRaidControllerResponse updateRaidController(@Param("elid") String elid, UpdateRaidControllerRequestData body, @QueryMap(encoded=true) UpdateRaidControllerQueryParams queryParams);

  /**
  * Modify
  * Modify RAID controller
  * Note, this is equivalent to the other <code>updateRaidController</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateRaidControllerResponse
      */
      @RequestLine("POST /api/rest/entity/raidController/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateRaidControllerResponse> updateRaidControllerWithHttpInfo(@Param("elid") String elid, UpdateRaidControllerRequestData body, @QueryMap(encoded=true) UpdateRaidControllerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateRaidController</code> method in a fluent style.
   */
  public static class UpdateRaidControllerQueryParams extends HashMap<String, Object> {
    public UpdateRaidControllerQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesRaidControllerResponse updateSystemAttributesRaidController(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesRaidControllerRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesRaidController</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesRaidControllerResponse> updateSystemAttributesRaidControllerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesRaidControllerRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesRaidController</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesRaidControllerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesRaidControllerResponse
   */
  @RequestLine("POST /api/rest/entity/raidController/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesRaidControllerResponse updateSystemAttributesRaidController(@Param("elid") String elid, UpdateSystemAttributesRaidControllerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesRaidControllerQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesRaidController</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesRaidControllerResponse
      */
      @RequestLine("POST /api/rest/entity/raidController/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesRaidControllerResponse> updateSystemAttributesRaidControllerWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesRaidControllerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesRaidControllerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesRaidController</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesRaidControllerQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesRaidControllerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
