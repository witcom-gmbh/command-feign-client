package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateMaintenanceWindowRequestData;
import com.fntsoftware.businessgateway.entities.CreateMaintenanceWindowResponse;
import com.fntsoftware.businessgateway.entities.DeleteMaintenanceWindowRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMaintenanceWindowResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowQueryRequest;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowQueryResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowServersRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowServersResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.MaintenanceWindowVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateMaintenanceWindowRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMaintenanceWindowResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMaintenanceWindowRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMaintenanceWindowResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface MaintenanceWindowApi extends ApiClient.Api {


  /**
   * Create
   * Create maintenance window
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateMaintenanceWindowResponse createMaintenanceWindow(@Param("sessionId") String sessionId, CreateMaintenanceWindowRequestData body);

  /**
   * Create
   * Similar to <code>createMaintenanceWindow</code> but it also returns the http response headers .
   * Create maintenance window
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateMaintenanceWindowResponse> createMaintenanceWindowWithHttpInfo(@Param("sessionId") String sessionId, CreateMaintenanceWindowRequestData body);


  /**
   * Create
   * Create maintenance window
   * Note, this is equivalent to the other <code>createMaintenanceWindow</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateMaintenanceWindowQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateMaintenanceWindowResponse createMaintenanceWindow(CreateMaintenanceWindowRequestData body, @QueryMap(encoded=true) CreateMaintenanceWindowQueryParams queryParams);

  /**
  * Create
  * Create maintenance window
  * Note, this is equivalent to the other <code>createMaintenanceWindow</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateMaintenanceWindowResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateMaintenanceWindowResponse> createMaintenanceWindowWithHttpInfo(CreateMaintenanceWindowRequestData body, @QueryMap(encoded=true) CreateMaintenanceWindowQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createMaintenanceWindow</code> method in a fluent style.
   */
  public static class CreateMaintenanceWindowQueryParams extends HashMap<String, Object> {
    public CreateMaintenanceWindowQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete maintenance window
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMaintenanceWindowResponse deleteMaintenanceWindow(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMaintenanceWindowRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMaintenanceWindow</code> but it also returns the http response headers .
   * Delete maintenance window
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMaintenanceWindowResponse> deleteMaintenanceWindowWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMaintenanceWindowRequestData body);


  /**
   * Delete
   * Delete maintenance window
   * Note, this is equivalent to the other <code>deleteMaintenanceWindow</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMaintenanceWindowQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMaintenanceWindowResponse deleteMaintenanceWindow(@Param("elid") String elid, DeleteMaintenanceWindowRequestData body, @QueryMap(encoded=true) DeleteMaintenanceWindowQueryParams queryParams);

  /**
  * Delete
  * Delete maintenance window
  * Note, this is equivalent to the other <code>deleteMaintenanceWindow</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMaintenanceWindowResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMaintenanceWindowResponse> deleteMaintenanceWindowWithHttpInfo(@Param("elid") String elid, DeleteMaintenanceWindowRequestData body, @QueryMap(encoded=true) DeleteMaintenanceWindowQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMaintenanceWindow</code> method in a fluent style.
   */
  public static class DeleteMaintenanceWindowQueryParams extends HashMap<String, Object> {
    public DeleteMaintenanceWindowQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Assignments
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MaintenanceWindowAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceWindowAssignmentsResponse maintenanceWindowAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>maintenanceWindowAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceWindowAssignmentsResponse> maintenanceWindowAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>maintenanceWindowAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceWindowAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceWindowAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceWindowAssignmentsResponse maintenanceWindowAssignments(@Param("elid") String elid, MaintenanceWindowAssignmentsRequest body, @QueryMap(encoded=true) MaintenanceWindowAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>maintenanceWindowAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceWindowAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceWindowAssignmentsResponse> maintenanceWindowAssignmentsWithHttpInfo(@Param("elid") String elid, MaintenanceWindowAssignmentsRequest body, @QueryMap(encoded=true) MaintenanceWindowAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceWindowAssignments</code> method in a fluent style.
   */
  public static class MaintenanceWindowAssignmentsQueryParams extends HashMap<String, Object> {
    public MaintenanceWindowAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MaintenanceWindowQueryResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceWindowQueryResponse maintenanceWindowQuery(@Param("sessionId") String sessionId, MaintenanceWindowQueryRequest body);

  /**
   * Basic query
   * Similar to <code>maintenanceWindowQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceWindowQueryResponse> maintenanceWindowQueryWithHttpInfo(@Param("sessionId") String sessionId, MaintenanceWindowQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>maintenanceWindowQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceWindowQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceWindowQueryResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceWindowQueryResponse maintenanceWindowQuery(MaintenanceWindowQueryRequest body, @QueryMap(encoded=true) MaintenanceWindowQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>maintenanceWindowQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceWindowQueryResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceWindowQueryResponse> maintenanceWindowQueryWithHttpInfo(MaintenanceWindowQueryRequest body, @QueryMap(encoded=true) MaintenanceWindowQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceWindowQuery</code> method in a fluent style.
   */
  public static class MaintenanceWindowQueryQueryParams extends HashMap<String, Object> {
    public MaintenanceWindowQueryQueryParams sessionId(final String value) {
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
   * @return MaintenanceWindowServersResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceWindowServersResponseData maintenanceWindowServers(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>maintenanceWindowServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceWindowServersResponseData> maintenanceWindowServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>maintenanceWindowServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceWindowServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceWindowServersResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceWindowServersResponseData maintenanceWindowServers(@Param("elid") String elid, MaintenanceWindowServersRequestData body, @QueryMap(encoded=true) MaintenanceWindowServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>maintenanceWindowServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceWindowServersResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceWindowServersResponseData> maintenanceWindowServersWithHttpInfo(@Param("elid") String elid, MaintenanceWindowServersRequestData body, @QueryMap(encoded=true) MaintenanceWindowServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceWindowServers</code> method in a fluent style.
   */
  public static class MaintenanceWindowServersQueryParams extends HashMap<String, Object> {
    public MaintenanceWindowServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MaintenanceWindowStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceWindowStorageUnitsResponseData maintenanceWindowStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>maintenanceWindowStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceWindowStorageUnitsResponseData> maintenanceWindowStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>maintenanceWindowStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceWindowStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceWindowStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceWindowStorageUnitsResponseData maintenanceWindowStorageUnits(@Param("elid") String elid, MaintenanceWindowStorageUnitsRequestData body, @QueryMap(encoded=true) MaintenanceWindowStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>maintenanceWindowStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceWindowStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceWindowStorageUnitsResponseData> maintenanceWindowStorageUnitsWithHttpInfo(@Param("elid") String elid, MaintenanceWindowStorageUnitsRequestData body, @QueryMap(encoded=true) MaintenanceWindowStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceWindowStorageUnits</code> method in a fluent style.
   */
  public static class MaintenanceWindowStorageUnitsQueryParams extends HashMap<String, Object> {
    public MaintenanceWindowStorageUnitsQueryParams sessionId(final String value) {
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
   * @return MaintenanceWindowSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceWindowSystemAttributesResponse maintenanceWindowSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>maintenanceWindowSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceWindowSystemAttributesResponse> maintenanceWindowSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>maintenanceWindowSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceWindowSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceWindowSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceWindowSystemAttributesResponse maintenanceWindowSystemAttributes(@Param("elid") String elid, MaintenanceWindowSystemAttributesRequest body, @QueryMap(encoded=true) MaintenanceWindowSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>maintenanceWindowSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceWindowSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceWindowSystemAttributesResponse> maintenanceWindowSystemAttributesWithHttpInfo(@Param("elid") String elid, MaintenanceWindowSystemAttributesRequest body, @QueryMap(encoded=true) MaintenanceWindowSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceWindowSystemAttributes</code> method in a fluent style.
   */
  public static class MaintenanceWindowSystemAttributesQueryParams extends HashMap<String, Object> {
    public MaintenanceWindowSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MaintenanceWindowVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MaintenanceWindowVirtualServersResponseData maintenanceWindowVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>maintenanceWindowVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MaintenanceWindowVirtualServersResponseData> maintenanceWindowVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MaintenanceWindowVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>maintenanceWindowVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MaintenanceWindowVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MaintenanceWindowVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MaintenanceWindowVirtualServersResponseData maintenanceWindowVirtualServers(@Param("elid") String elid, MaintenanceWindowVirtualServersRequestData body, @QueryMap(encoded=true) MaintenanceWindowVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>maintenanceWindowVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MaintenanceWindowVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MaintenanceWindowVirtualServersResponseData> maintenanceWindowVirtualServersWithHttpInfo(@Param("elid") String elid, MaintenanceWindowVirtualServersRequestData body, @QueryMap(encoded=true) MaintenanceWindowVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>maintenanceWindowVirtualServers</code> method in a fluent style.
   */
  public static class MaintenanceWindowVirtualServersQueryParams extends HashMap<String, Object> {
    public MaintenanceWindowVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify maintenance window
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMaintenanceWindowResponse updateMaintenanceWindow(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMaintenanceWindowRequestData body);

  /**
   * Modify
   * Similar to <code>updateMaintenanceWindow</code> but it also returns the http response headers .
   * Modify maintenance window
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMaintenanceWindowResponse> updateMaintenanceWindowWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMaintenanceWindowRequestData body);


  /**
   * Modify
   * Modify maintenance window
   * Note, this is equivalent to the other <code>updateMaintenanceWindow</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMaintenanceWindowQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMaintenanceWindowResponse updateMaintenanceWindow(@Param("elid") String elid, UpdateMaintenanceWindowRequestData body, @QueryMap(encoded=true) UpdateMaintenanceWindowQueryParams queryParams);

  /**
  * Modify
  * Modify maintenance window
  * Note, this is equivalent to the other <code>updateMaintenanceWindow</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMaintenanceWindowResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMaintenanceWindowResponse> updateMaintenanceWindowWithHttpInfo(@Param("elid") String elid, UpdateMaintenanceWindowRequestData body, @QueryMap(encoded=true) UpdateMaintenanceWindowQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMaintenanceWindow</code> method in a fluent style.
   */
  public static class UpdateMaintenanceWindowQueryParams extends HashMap<String, Object> {
    public UpdateMaintenanceWindowQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMaintenanceWindowResponse updateSystemAttributesMaintenanceWindow(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMaintenanceWindowRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMaintenanceWindow</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMaintenanceWindowResponse> updateSystemAttributesMaintenanceWindowWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMaintenanceWindowRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMaintenanceWindow</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMaintenanceWindowQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMaintenanceWindowResponse
   */
  @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMaintenanceWindowResponse updateSystemAttributesMaintenanceWindow(@Param("elid") String elid, UpdateSystemAttributesMaintenanceWindowRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMaintenanceWindowQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMaintenanceWindow</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMaintenanceWindowResponse
      */
      @RequestLine("POST /api/rest/entity/maintenanceWindow/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMaintenanceWindowResponse> updateSystemAttributesMaintenanceWindowWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMaintenanceWindowRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMaintenanceWindowQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMaintenanceWindow</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMaintenanceWindowQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMaintenanceWindowQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
