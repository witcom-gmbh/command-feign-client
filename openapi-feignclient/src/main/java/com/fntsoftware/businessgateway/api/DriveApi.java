package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDriveRequestData;
import com.fntsoftware.businessgateway.entities.CreateDriveResponse;
import com.fntsoftware.businessgateway.entities.DeleteDriveRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDriveResponse;
import com.fntsoftware.businessgateway.entities.DriveQueryRequest;
import com.fntsoftware.businessgateway.entities.DriveQueryResponse;
import com.fntsoftware.businessgateway.entities.DriveServerRequestData;
import com.fntsoftware.businessgateway.entities.DriveServerResponseData;
import com.fntsoftware.businessgateway.entities.DriveSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DriveSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateDriveRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDriveResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDriveRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDriveResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DriveApi extends ApiClient.Api {


  /**
   * Create
   * Create drive
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDriveResponse createDrive(@Param("sessionId") String sessionId, CreateDriveRequestData body);

  /**
   * Create
   * Similar to <code>createDrive</code> but it also returns the http response headers .
   * Create drive
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDriveResponse> createDriveWithHttpInfo(@Param("sessionId") String sessionId, CreateDriveRequestData body);


  /**
   * Create
   * Create drive
   * Note, this is equivalent to the other <code>createDrive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDriveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDriveResponse createDrive(CreateDriveRequestData body, @QueryMap(encoded=true) CreateDriveQueryParams queryParams);

  /**
  * Create
  * Create drive
  * Note, this is equivalent to the other <code>createDrive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDriveResponse
      */
      @RequestLine("POST /api/rest/entity/drive/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDriveResponse> createDriveWithHttpInfo(CreateDriveRequestData body, @QueryMap(encoded=true) CreateDriveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDrive</code> method in a fluent style.
   */
  public static class CreateDriveQueryParams extends HashMap<String, Object> {
    public CreateDriveQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete drive
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDriveResponse deleteDrive(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDriveRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDrive</code> but it also returns the http response headers .
   * Delete drive
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDriveResponse> deleteDriveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDriveRequestData body);


  /**
   * Delete
   * Delete drive
   * Note, this is equivalent to the other <code>deleteDrive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDriveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDriveResponse deleteDrive(@Param("elid") String elid, DeleteDriveRequestData body, @QueryMap(encoded=true) DeleteDriveQueryParams queryParams);

  /**
  * Delete
  * Delete drive
  * Note, this is equivalent to the other <code>deleteDrive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDriveResponse
      */
      @RequestLine("POST /api/rest/entity/drive/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDriveResponse> deleteDriveWithHttpInfo(@Param("elid") String elid, DeleteDriveRequestData body, @QueryMap(encoded=true) DeleteDriveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDrive</code> method in a fluent style.
   */
  public static class DeleteDriveQueryParams extends HashMap<String, Object> {
    public DeleteDriveQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DriveQueryResponse
   */
  @RequestLine("POST /api/rest/entity/drive/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DriveQueryResponse driveQuery(@Param("sessionId") String sessionId, DriveQueryRequest body);

  /**
   * Basic query
   * Similar to <code>driveQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DriveQueryResponse> driveQueryWithHttpInfo(@Param("sessionId") String sessionId, DriveQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>driveQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DriveQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DriveQueryResponse
   */
  @RequestLine("POST /api/rest/entity/drive/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DriveQueryResponse driveQuery(DriveQueryRequest body, @QueryMap(encoded=true) DriveQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>driveQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DriveQueryResponse
      */
      @RequestLine("POST /api/rest/entity/drive/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DriveQueryResponse> driveQueryWithHttpInfo(DriveQueryRequest body, @QueryMap(encoded=true) DriveQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>driveQuery</code> method in a fluent style.
   */
  public static class DriveQueryQueryParams extends HashMap<String, Object> {
    public DriveQueryQueryParams sessionId(final String value) {
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
   * @return DriveServerResponseData
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DriveServerResponseData driveServer(@Param("sessionId") String sessionId, @Param("elid") String elid, DriveServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>driveServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DriveServerResponseData> driveServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DriveServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>driveServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DriveServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DriveServerResponseData
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DriveServerResponseData driveServer(@Param("elid") String elid, DriveServerRequestData body, @QueryMap(encoded=true) DriveServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>driveServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DriveServerResponseData
      */
      @RequestLine("POST /api/rest/entity/drive/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DriveServerResponseData> driveServerWithHttpInfo(@Param("elid") String elid, DriveServerRequestData body, @QueryMap(encoded=true) DriveServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>driveServer</code> method in a fluent style.
   */
  public static class DriveServerQueryParams extends HashMap<String, Object> {
    public DriveServerQueryParams sessionId(final String value) {
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
   * @return DriveSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DriveSystemAttributesResponse driveSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DriveSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>driveSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DriveSystemAttributesResponse> driveSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DriveSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>driveSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DriveSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DriveSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DriveSystemAttributesResponse driveSystemAttributes(@Param("elid") String elid, DriveSystemAttributesRequest body, @QueryMap(encoded=true) DriveSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>driveSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DriveSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/drive/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DriveSystemAttributesResponse> driveSystemAttributesWithHttpInfo(@Param("elid") String elid, DriveSystemAttributesRequest body, @QueryMap(encoded=true) DriveSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>driveSystemAttributes</code> method in a fluent style.
   */
  public static class DriveSystemAttributesQueryParams extends HashMap<String, Object> {
    public DriveSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify drive
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDriveResponse updateDrive(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDriveRequestData body);

  /**
   * Modify
   * Similar to <code>updateDrive</code> but it also returns the http response headers .
   * Modify drive
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDriveResponse> updateDriveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDriveRequestData body);


  /**
   * Modify
   * Modify drive
   * Note, this is equivalent to the other <code>updateDrive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDriveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDriveResponse updateDrive(@Param("elid") String elid, UpdateDriveRequestData body, @QueryMap(encoded=true) UpdateDriveQueryParams queryParams);

  /**
  * Modify
  * Modify drive
  * Note, this is equivalent to the other <code>updateDrive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDriveResponse
      */
      @RequestLine("POST /api/rest/entity/drive/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDriveResponse> updateDriveWithHttpInfo(@Param("elid") String elid, UpdateDriveRequestData body, @QueryMap(encoded=true) UpdateDriveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDrive</code> method in a fluent style.
   */
  public static class UpdateDriveQueryParams extends HashMap<String, Object> {
    public UpdateDriveQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDriveResponse updateSystemAttributesDrive(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDriveRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDrive</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDriveResponse> updateSystemAttributesDriveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDriveRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDrive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDriveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDriveResponse
   */
  @RequestLine("POST /api/rest/entity/drive/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDriveResponse updateSystemAttributesDrive(@Param("elid") String elid, UpdateSystemAttributesDriveRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDriveQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDrive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDriveResponse
      */
      @RequestLine("POST /api/rest/entity/drive/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDriveResponse> updateSystemAttributesDriveWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDriveRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDriveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDrive</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDriveQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDriveQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
