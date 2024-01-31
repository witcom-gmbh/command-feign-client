package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateShareRequestData;
import com.fntsoftware.businessgateway.entities.CreateShareResponse;
import com.fntsoftware.businessgateway.entities.DeleteShareRequestData;
import com.fntsoftware.businessgateway.entities.DeleteShareResponse;
import com.fntsoftware.businessgateway.entities.ShareFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.ShareFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.ShareQueryRequest;
import com.fntsoftware.businessgateway.entities.ShareQueryResponse;
import com.fntsoftware.businessgateway.entities.ShareStorageUnitRequestData;
import com.fntsoftware.businessgateway.entities.ShareStorageUnitResponseData;
import com.fntsoftware.businessgateway.entities.ShareSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ShareSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateShareRequestData;
import com.fntsoftware.businessgateway.entities.UpdateShareResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesShareRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesShareResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ShareApi extends ApiClient.Api {


  /**
   * Create
   * Create Share
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateShareResponse createShare(@Param("sessionId") String sessionId, CreateShareRequestData body);

  /**
   * Create
   * Similar to <code>createShare</code> but it also returns the http response headers .
   * Create Share
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateShareResponse> createShareWithHttpInfo(@Param("sessionId") String sessionId, CreateShareRequestData body);


  /**
   * Create
   * Create Share
   * Note, this is equivalent to the other <code>createShare</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateShareQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateShareResponse createShare(CreateShareRequestData body, @QueryMap(encoded=true) CreateShareQueryParams queryParams);

  /**
  * Create
  * Create Share
  * Note, this is equivalent to the other <code>createShare</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateShareResponse
      */
      @RequestLine("POST /api/rest/entity/share/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateShareResponse> createShareWithHttpInfo(CreateShareRequestData body, @QueryMap(encoded=true) CreateShareQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createShare</code> method in a fluent style.
   */
  public static class CreateShareQueryParams extends HashMap<String, Object> {
    public CreateShareQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Share
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteShareResponse deleteShare(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteShareRequestData body);

  /**
   * Delete
   * Similar to <code>deleteShare</code> but it also returns the http response headers .
   * Delete Share
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteShareResponse> deleteShareWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteShareRequestData body);


  /**
   * Delete
   * Delete Share
   * Note, this is equivalent to the other <code>deleteShare</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteShareQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteShareResponse deleteShare(@Param("elid") String elid, DeleteShareRequestData body, @QueryMap(encoded=true) DeleteShareQueryParams queryParams);

  /**
  * Delete
  * Delete Share
  * Note, this is equivalent to the other <code>deleteShare</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteShareResponse
      */
      @RequestLine("POST /api/rest/entity/share/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteShareResponse> deleteShareWithHttpInfo(@Param("elid") String elid, DeleteShareRequestData body, @QueryMap(encoded=true) DeleteShareQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteShare</code> method in a fluent style.
   */
  public static class DeleteShareQueryParams extends HashMap<String, Object> {
    public DeleteShareQueryParams sessionId(final String value) {
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
   * @return ShareFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ShareFileSystemsResponseData shareFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, ShareFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>shareFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ShareFileSystemsResponseData> shareFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ShareFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>shareFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShareFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ShareFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ShareFileSystemsResponseData shareFileSystems(@Param("elid") String elid, ShareFileSystemsRequestData body, @QueryMap(encoded=true) ShareFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>shareFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ShareFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/share/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ShareFileSystemsResponseData> shareFileSystemsWithHttpInfo(@Param("elid") String elid, ShareFileSystemsRequestData body, @QueryMap(encoded=true) ShareFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>shareFileSystems</code> method in a fluent style.
   */
  public static class ShareFileSystemsQueryParams extends HashMap<String, Object> {
    public ShareFileSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ShareQueryResponse
   */
  @RequestLine("POST /api/rest/entity/share/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ShareQueryResponse shareQuery(@Param("sessionId") String sessionId, ShareQueryRequest body);

  /**
   * Basic query
   * Similar to <code>shareQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ShareQueryResponse> shareQueryWithHttpInfo(@Param("sessionId") String sessionId, ShareQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>shareQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShareQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ShareQueryResponse
   */
  @RequestLine("POST /api/rest/entity/share/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ShareQueryResponse shareQuery(ShareQueryRequest body, @QueryMap(encoded=true) ShareQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>shareQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ShareQueryResponse
      */
      @RequestLine("POST /api/rest/entity/share/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ShareQueryResponse> shareQueryWithHttpInfo(ShareQueryRequest body, @QueryMap(encoded=true) ShareQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>shareQuery</code> method in a fluent style.
   */
  public static class ShareQueryQueryParams extends HashMap<String, Object> {
    public ShareQueryQueryParams sessionId(final String value) {
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
   * @return ShareStorageUnitResponseData
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/StorageUnit?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ShareStorageUnitResponseData shareStorageUnit(@Param("sessionId") String sessionId, @Param("elid") String elid, ShareStorageUnitRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>shareStorageUnit</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/StorageUnit?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ShareStorageUnitResponseData> shareStorageUnitWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ShareStorageUnitRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>shareStorageUnit</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShareStorageUnitQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ShareStorageUnitResponseData
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/StorageUnit?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ShareStorageUnitResponseData shareStorageUnit(@Param("elid") String elid, ShareStorageUnitRequestData body, @QueryMap(encoded=true) ShareStorageUnitQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>shareStorageUnit</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ShareStorageUnitResponseData
      */
      @RequestLine("POST /api/rest/entity/share/{elid}/StorageUnit?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ShareStorageUnitResponseData> shareStorageUnitWithHttpInfo(@Param("elid") String elid, ShareStorageUnitRequestData body, @QueryMap(encoded=true) ShareStorageUnitQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>shareStorageUnit</code> method in a fluent style.
   */
  public static class ShareStorageUnitQueryParams extends HashMap<String, Object> {
    public ShareStorageUnitQueryParams sessionId(final String value) {
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
   * @return ShareSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ShareSystemAttributesResponse shareSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ShareSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>shareSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ShareSystemAttributesResponse> shareSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ShareSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>shareSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShareSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ShareSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ShareSystemAttributesResponse shareSystemAttributes(@Param("elid") String elid, ShareSystemAttributesRequest body, @QueryMap(encoded=true) ShareSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>shareSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ShareSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/share/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ShareSystemAttributesResponse> shareSystemAttributesWithHttpInfo(@Param("elid") String elid, ShareSystemAttributesRequest body, @QueryMap(encoded=true) ShareSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>shareSystemAttributes</code> method in a fluent style.
   */
  public static class ShareSystemAttributesQueryParams extends HashMap<String, Object> {
    public ShareSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Share
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateShareResponse updateShare(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateShareRequestData body);

  /**
   * Modify
   * Similar to <code>updateShare</code> but it also returns the http response headers .
   * Modify Share
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateShareResponse> updateShareWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateShareRequestData body);


  /**
   * Modify
   * Modify Share
   * Note, this is equivalent to the other <code>updateShare</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateShareQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateShareResponse updateShare(@Param("elid") String elid, UpdateShareRequestData body, @QueryMap(encoded=true) UpdateShareQueryParams queryParams);

  /**
  * Modify
  * Modify Share
  * Note, this is equivalent to the other <code>updateShare</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateShareResponse
      */
      @RequestLine("POST /api/rest/entity/share/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateShareResponse> updateShareWithHttpInfo(@Param("elid") String elid, UpdateShareRequestData body, @QueryMap(encoded=true) UpdateShareQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateShare</code> method in a fluent style.
   */
  public static class UpdateShareQueryParams extends HashMap<String, Object> {
    public UpdateShareQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesShareResponse updateSystemAttributesShare(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesShareRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesShare</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesShareResponse> updateSystemAttributesShareWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesShareRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesShare</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesShareQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesShareResponse
   */
  @RequestLine("POST /api/rest/entity/share/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesShareResponse updateSystemAttributesShare(@Param("elid") String elid, UpdateSystemAttributesShareRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesShareQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesShare</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesShareResponse
      */
      @RequestLine("POST /api/rest/entity/share/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesShareResponse> updateSystemAttributesShareWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesShareRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesShareQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesShare</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesShareQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesShareQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
