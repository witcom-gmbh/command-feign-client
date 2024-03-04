package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateFileSystemRequestData;
import com.fntsoftware.businessgateway.entities.CreateFileSystemResponse;
import com.fntsoftware.businessgateway.entities.DeleteFileSystemRequestData;
import com.fntsoftware.businessgateway.entities.DeleteFileSystemResponse;
import com.fntsoftware.businessgateway.entities.FileSystem100033RequestData;
import com.fntsoftware.businessgateway.entities.FileSystem100033ResponseData;
import com.fntsoftware.businessgateway.entities.FileSystemHardDisksRequestData;
import com.fntsoftware.businessgateway.entities.FileSystemHardDisksResponseData;
import com.fntsoftware.businessgateway.entities.FileSystemQueryRequest;
import com.fntsoftware.businessgateway.entities.FileSystemQueryResponse;
import com.fntsoftware.businessgateway.entities.FileSystemResourceGroupsRequestData;
import com.fntsoftware.businessgateway.entities.FileSystemResourceGroupsResponseData;
import com.fntsoftware.businessgateway.entities.FileSystemServerRequestData;
import com.fntsoftware.businessgateway.entities.FileSystemServerResponseData;
import com.fntsoftware.businessgateway.entities.FileSystemSharesRequestData;
import com.fntsoftware.businessgateway.entities.FileSystemSharesResponseData;
import com.fntsoftware.businessgateway.entities.FileSystemStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.FileSystemStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.FileSystemSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.FileSystemSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.FileSystemVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.FileSystemVirtualServerResponseData;
import com.fntsoftware.businessgateway.entities.UpdateFileSystemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateFileSystemResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFileSystemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFileSystemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface FileSystemApi extends ApiClient.Api {


  /**
   * Create
   * Create file system
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateFileSystemResponse createFileSystem(@Param("sessionId") String sessionId, CreateFileSystemRequestData body);

  /**
   * Create
   * Similar to <code>createFileSystem</code> but it also returns the http response headers .
   * Create file system
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateFileSystemResponse> createFileSystemWithHttpInfo(@Param("sessionId") String sessionId, CreateFileSystemRequestData body);


  /**
   * Create
   * Create file system
   * Note, this is equivalent to the other <code>createFileSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateFileSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateFileSystemResponse createFileSystem(CreateFileSystemRequestData body, @QueryMap(encoded=true) CreateFileSystemQueryParams queryParams);

  /**
  * Create
  * Create file system
  * Note, this is equivalent to the other <code>createFileSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateFileSystemResponse
      */
      @RequestLine("POST /api/rest/entity/fileSystem/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateFileSystemResponse> createFileSystemWithHttpInfo(CreateFileSystemRequestData body, @QueryMap(encoded=true) CreateFileSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createFileSystem</code> method in a fluent style.
   */
  public static class CreateFileSystemQueryParams extends HashMap<String, Object> {
    public CreateFileSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete file system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteFileSystemResponse deleteFileSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFileSystemRequestData body);

  /**
   * Delete
   * Similar to <code>deleteFileSystem</code> but it also returns the http response headers .
   * Delete file system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteFileSystemResponse> deleteFileSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFileSystemRequestData body);


  /**
   * Delete
   * Delete file system
   * Note, this is equivalent to the other <code>deleteFileSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFileSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteFileSystemResponse deleteFileSystem(@Param("elid") String elid, DeleteFileSystemRequestData body, @QueryMap(encoded=true) DeleteFileSystemQueryParams queryParams);

  /**
  * Delete
  * Delete file system
  * Note, this is equivalent to the other <code>deleteFileSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteFileSystemResponse
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteFileSystemResponse> deleteFileSystemWithHttpInfo(@Param("elid") String elid, DeleteFileSystemRequestData body, @QueryMap(encoded=true) DeleteFileSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteFileSystem</code> method in a fluent style.
   */
  public static class DeleteFileSystemQueryParams extends HashMap<String, Object> {
    public DeleteFileSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VM datastore entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FileSystem100033ResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/100033?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystem100033ResponseData fileSystem100033(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystem100033RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>fileSystem100033</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/100033?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystem100033ResponseData> fileSystem100033WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystem100033RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>fileSystem100033</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystem100033QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystem100033ResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/100033?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystem100033ResponseData fileSystem100033(@Param("elid") String elid, FileSystem100033RequestData body, @QueryMap(encoded=true) FileSystem100033QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>fileSystem100033</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystem100033ResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/100033?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystem100033ResponseData> fileSystem100033WithHttpInfo(@Param("elid") String elid, FileSystem100033RequestData body, @QueryMap(encoded=true) FileSystem100033QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystem100033</code> method in a fluent style.
   */
  public static class FileSystem100033QueryParams extends HashMap<String, Object> {
    public FileSystem100033QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Hard disk entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FileSystemHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemHardDisksResponseData fileSystemHardDisks(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemHardDisksRequestData body);

  /**
   * Get relations to Hard disk entities
   * Similar to <code>fileSystemHardDisks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemHardDisksResponseData> fileSystemHardDisksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemHardDisksRequestData body);


  /**
   * Get relations to Hard disk entities
   * 
   * Note, this is equivalent to the other <code>fileSystemHardDisks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemHardDisksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemHardDisksResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/HardDisks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemHardDisksResponseData fileSystemHardDisks(@Param("elid") String elid, FileSystemHardDisksRequestData body, @QueryMap(encoded=true) FileSystemHardDisksQueryParams queryParams);

  /**
  * Get relations to Hard disk entities
  * 
  * Note, this is equivalent to the other <code>fileSystemHardDisks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemHardDisksResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/HardDisks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemHardDisksResponseData> fileSystemHardDisksWithHttpInfo(@Param("elid") String elid, FileSystemHardDisksRequestData body, @QueryMap(encoded=true) FileSystemHardDisksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemHardDisks</code> method in a fluent style.
   */
  public static class FileSystemHardDisksQueryParams extends HashMap<String, Object> {
    public FileSystemHardDisksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return FileSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemQueryResponse fileSystemQuery(@Param("sessionId") String sessionId, FileSystemQueryRequest body);

  /**
   * Basic query
   * Similar to <code>fileSystemQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemQueryResponse> fileSystemQueryWithHttpInfo(@Param("sessionId") String sessionId, FileSystemQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>fileSystemQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemQueryResponse fileSystemQuery(FileSystemQueryRequest body, @QueryMap(encoded=true) FileSystemQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>fileSystemQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemQueryResponse
      */
      @RequestLine("POST /api/rest/entity/fileSystem/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemQueryResponse> fileSystemQueryWithHttpInfo(FileSystemQueryRequest body, @QueryMap(encoded=true) FileSystemQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemQuery</code> method in a fluent style.
   */
  public static class FileSystemQueryQueryParams extends HashMap<String, Object> {
    public FileSystemQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Resource group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FileSystemResourceGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemResourceGroupsResponseData fileSystemResourceGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemResourceGroupsRequestData body);

  /**
   * Get relations to Resource group entities
   * Similar to <code>fileSystemResourceGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemResourceGroupsResponseData> fileSystemResourceGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemResourceGroupsRequestData body);


  /**
   * Get relations to Resource group entities
   * 
   * Note, this is equivalent to the other <code>fileSystemResourceGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemResourceGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemResourceGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemResourceGroupsResponseData fileSystemResourceGroups(@Param("elid") String elid, FileSystemResourceGroupsRequestData body, @QueryMap(encoded=true) FileSystemResourceGroupsQueryParams queryParams);

  /**
  * Get relations to Resource group entities
  * 
  * Note, this is equivalent to the other <code>fileSystemResourceGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemResourceGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/ResourceGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemResourceGroupsResponseData> fileSystemResourceGroupsWithHttpInfo(@Param("elid") String elid, FileSystemResourceGroupsRequestData body, @QueryMap(encoded=true) FileSystemResourceGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemResourceGroups</code> method in a fluent style.
   */
  public static class FileSystemResourceGroupsQueryParams extends HashMap<String, Object> {
    public FileSystemResourceGroupsQueryParams sessionId(final String value) {
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
   * @return FileSystemServerResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemServerResponseData fileSystemServer(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>fileSystemServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemServerResponseData> fileSystemServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>fileSystemServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemServerResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemServerResponseData fileSystemServer(@Param("elid") String elid, FileSystemServerRequestData body, @QueryMap(encoded=true) FileSystemServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>fileSystemServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemServerResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemServerResponseData> fileSystemServerWithHttpInfo(@Param("elid") String elid, FileSystemServerRequestData body, @QueryMap(encoded=true) FileSystemServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemServer</code> method in a fluent style.
   */
  public static class FileSystemServerQueryParams extends HashMap<String, Object> {
    public FileSystemServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Share entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FileSystemSharesResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Shares?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemSharesResponseData fileSystemShares(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemSharesRequestData body);

  /**
   * Get relations to Share entities
   * Similar to <code>fileSystemShares</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Shares?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemSharesResponseData> fileSystemSharesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemSharesRequestData body);


  /**
   * Get relations to Share entities
   * 
   * Note, this is equivalent to the other <code>fileSystemShares</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemSharesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemSharesResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Shares?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemSharesResponseData fileSystemShares(@Param("elid") String elid, FileSystemSharesRequestData body, @QueryMap(encoded=true) FileSystemSharesQueryParams queryParams);

  /**
  * Get relations to Share entities
  * 
  * Note, this is equivalent to the other <code>fileSystemShares</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemSharesResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/Shares?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemSharesResponseData> fileSystemSharesWithHttpInfo(@Param("elid") String elid, FileSystemSharesRequestData body, @QueryMap(encoded=true) FileSystemSharesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemShares</code> method in a fluent style.
   */
  public static class FileSystemSharesQueryParams extends HashMap<String, Object> {
    public FileSystemSharesQueryParams sessionId(final String value) {
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
   * @return FileSystemStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemStorageUnitsResponseData fileSystemStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>fileSystemStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemStorageUnitsResponseData> fileSystemStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>fileSystemStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemStorageUnitsResponseData fileSystemStorageUnits(@Param("elid") String elid, FileSystemStorageUnitsRequestData body, @QueryMap(encoded=true) FileSystemStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>fileSystemStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemStorageUnitsResponseData> fileSystemStorageUnitsWithHttpInfo(@Param("elid") String elid, FileSystemStorageUnitsRequestData body, @QueryMap(encoded=true) FileSystemStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemStorageUnits</code> method in a fluent style.
   */
  public static class FileSystemStorageUnitsQueryParams extends HashMap<String, Object> {
    public FileSystemStorageUnitsQueryParams sessionId(final String value) {
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
   * @return FileSystemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemSystemAttributesResponse fileSystemSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>fileSystemSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemSystemAttributesResponse> fileSystemSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>fileSystemSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemSystemAttributesResponse fileSystemSystemAttributes(@Param("elid") String elid, FileSystemSystemAttributesRequest body, @QueryMap(encoded=true) FileSystemSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>fileSystemSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemSystemAttributesResponse> fileSystemSystemAttributesWithHttpInfo(@Param("elid") String elid, FileSystemSystemAttributesRequest body, @QueryMap(encoded=true) FileSystemSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemSystemAttributes</code> method in a fluent style.
   */
  public static class FileSystemSystemAttributesQueryParams extends HashMap<String, Object> {
    public FileSystemSystemAttributesQueryParams sessionId(final String value) {
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
   * @return FileSystemVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileSystemVirtualServerResponseData fileSystemVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemVirtualServerRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>fileSystemVirtualServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FileSystemVirtualServerResponseData> fileSystemVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FileSystemVirtualServerRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>fileSystemVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FileSystemVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FileSystemVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FileSystemVirtualServerResponseData fileSystemVirtualServer(@Param("elid") String elid, FileSystemVirtualServerRequestData body, @QueryMap(encoded=true) FileSystemVirtualServerQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>fileSystemVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FileSystemVirtualServerResponseData
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/VirtualServer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FileSystemVirtualServerResponseData> fileSystemVirtualServerWithHttpInfo(@Param("elid") String elid, FileSystemVirtualServerRequestData body, @QueryMap(encoded=true) FileSystemVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fileSystemVirtualServer</code> method in a fluent style.
   */
  public static class FileSystemVirtualServerQueryParams extends HashMap<String, Object> {
    public FileSystemVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify file system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateFileSystemResponse updateFileSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFileSystemRequestData body);

  /**
   * Modify
   * Similar to <code>updateFileSystem</code> but it also returns the http response headers .
   * Modify file system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateFileSystemResponse> updateFileSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFileSystemRequestData body);


  /**
   * Modify
   * Modify file system
   * Note, this is equivalent to the other <code>updateFileSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateFileSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateFileSystemResponse updateFileSystem(@Param("elid") String elid, UpdateFileSystemRequestData body, @QueryMap(encoded=true) UpdateFileSystemQueryParams queryParams);

  /**
  * Modify
  * Modify file system
  * Note, this is equivalent to the other <code>updateFileSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateFileSystemResponse
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateFileSystemResponse> updateFileSystemWithHttpInfo(@Param("elid") String elid, UpdateFileSystemRequestData body, @QueryMap(encoded=true) UpdateFileSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateFileSystem</code> method in a fluent style.
   */
  public static class UpdateFileSystemQueryParams extends HashMap<String, Object> {
    public UpdateFileSystemQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesFileSystemResponse updateSystemAttributesFileSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFileSystemRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesFileSystem</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesFileSystemResponse> updateSystemAttributesFileSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFileSystemRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesFileSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesFileSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesFileSystemResponse
   */
  @RequestLine("POST /api/rest/entity/fileSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesFileSystemResponse updateSystemAttributesFileSystem(@Param("elid") String elid, UpdateSystemAttributesFileSystemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFileSystemQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesFileSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesFileSystemResponse
      */
      @RequestLine("POST /api/rest/entity/fileSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesFileSystemResponse> updateSystemAttributesFileSystemWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesFileSystemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFileSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesFileSystem</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesFileSystemQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesFileSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
