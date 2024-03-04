package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreatePostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.CreatePostalAddressResponse;
import com.fntsoftware.businessgateway.entities.DeletePostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.DeletePostalAddressResponse;
import com.fntsoftware.businessgateway.entities.PostalAddressAssignmentsRequest;
import com.fntsoftware.businessgateway.entities.PostalAddressAssignmentsResponse;
import com.fntsoftware.businessgateway.entities.PostalAddressBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressCampusesRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressCampusesResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressContractsRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressContractsResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressFloorsRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressFloorsResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressPersonsRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressPersonsResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressQueryRequest;
import com.fntsoftware.businessgateway.entities.PostalAddressQueryResponse;
import com.fntsoftware.businessgateway.entities.PostalAddressRoomsRequestData;
import com.fntsoftware.businessgateway.entities.PostalAddressRoomsResponseData;
import com.fntsoftware.businessgateway.entities.PostalAddressSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PostalAddressSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAllAssignmentsPostalAddressResponse;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.ReassignAssignmentsPartiallyPostalAddressResponse;
import com.fntsoftware.businessgateway.entities.UpdatePostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePostalAddressResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPostalAddressResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PostalAddressApi extends ApiClient.Api {


  /**
   * Create
   * Create Postal address
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePostalAddressResponse createPostalAddress(@Param("sessionId") String sessionId, CreatePostalAddressRequestData body);

  /**
   * Create
   * Similar to <code>createPostalAddress</code> but it also returns the http response headers .
   * Create Postal address
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePostalAddressResponse> createPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, CreatePostalAddressRequestData body);


  /**
   * Create
   * Create Postal address
   * Note, this is equivalent to the other <code>createPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePostalAddressResponse createPostalAddress(CreatePostalAddressRequestData body, @QueryMap(encoded=true) CreatePostalAddressQueryParams queryParams);

  /**
  * Create
  * Create Postal address
  * Note, this is equivalent to the other <code>createPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePostalAddressResponse> createPostalAddressWithHttpInfo(CreatePostalAddressRequestData body, @QueryMap(encoded=true) CreatePostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPostalAddress</code> method in a fluent style.
   */
  public static class CreatePostalAddressQueryParams extends HashMap<String, Object> {
    public CreatePostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePostalAddressResponse deletePostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePostalAddressRequestData body);

  /**
   * Delete
   * Similar to <code>deletePostalAddress</code> but it also returns the http response headers .
   * Delete Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePostalAddressResponse> deletePostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePostalAddressRequestData body);


  /**
   * Delete
   * Delete Postal address
   * Note, this is equivalent to the other <code>deletePostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePostalAddressResponse deletePostalAddress(@Param("elid") String elid, DeletePostalAddressRequestData body, @QueryMap(encoded=true) DeletePostalAddressQueryParams queryParams);

  /**
  * Delete
  * Delete Postal address
  * Note, this is equivalent to the other <code>deletePostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePostalAddressResponse> deletePostalAddressWithHttpInfo(@Param("elid") String elid, DeletePostalAddressRequestData body, @QueryMap(encoded=true) DeletePostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePostalAddress</code> method in a fluent style.
   */
  public static class DeletePostalAddressQueryParams extends HashMap<String, Object> {
    public DeletePostalAddressQueryParams sessionId(final String value) {
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
   * @return PostalAddressAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressAssignmentsResponse postalAddressAssignments(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressAssignmentsRequest body);

  /**
   * Query Assignments
   * Similar to <code>postalAddressAssignments</code> but it also returns the http response headers .
   * Query of the Assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressAssignmentsResponse> postalAddressAssignmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressAssignmentsRequest body);


  /**
   * Query Assignments
   * Query of the Assignments
   * Note, this is equivalent to the other <code>postalAddressAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressAssignmentsResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Assignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressAssignmentsResponse postalAddressAssignments(@Param("elid") String elid, PostalAddressAssignmentsRequest body, @QueryMap(encoded=true) PostalAddressAssignmentsQueryParams queryParams);

  /**
  * Query Assignments
  * Query of the Assignments
  * Note, this is equivalent to the other <code>postalAddressAssignments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressAssignmentsResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Assignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressAssignmentsResponse> postalAddressAssignmentsWithHttpInfo(@Param("elid") String elid, PostalAddressAssignmentsRequest body, @QueryMap(encoded=true) PostalAddressAssignmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressAssignments</code> method in a fluent style.
   */
  public static class PostalAddressAssignmentsQueryParams extends HashMap<String, Object> {
    public PostalAddressAssignmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Building entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressBuildingsResponseData postalAddressBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>postalAddressBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressBuildingsResponseData> postalAddressBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>postalAddressBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressBuildingsResponseData postalAddressBuildings(@Param("elid") String elid, PostalAddressBuildingsRequestData body, @QueryMap(encoded=true) PostalAddressBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>postalAddressBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressBuildingsResponseData> postalAddressBuildingsWithHttpInfo(@Param("elid") String elid, PostalAddressBuildingsRequestData body, @QueryMap(encoded=true) PostalAddressBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressBuildings</code> method in a fluent style.
   */
  public static class PostalAddressBuildingsQueryParams extends HashMap<String, Object> {
    public PostalAddressBuildingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Campus entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressCampusesResponseData postalAddressCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>postalAddressCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressCampusesResponseData> postalAddressCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>postalAddressCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressCampusesResponseData postalAddressCampuses(@Param("elid") String elid, PostalAddressCampusesRequestData body, @QueryMap(encoded=true) PostalAddressCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>postalAddressCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressCampusesResponseData> postalAddressCampusesWithHttpInfo(@Param("elid") String elid, PostalAddressCampusesRequestData body, @QueryMap(encoded=true) PostalAddressCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressCampuses</code> method in a fluent style.
   */
  public static class PostalAddressCampusesQueryParams extends HashMap<String, Object> {
    public PostalAddressCampusesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressContractsResponseData postalAddressContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>postalAddressContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressContractsResponseData> postalAddressContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>postalAddressContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressContractsResponseData postalAddressContracts(@Param("elid") String elid, PostalAddressContractsRequestData body, @QueryMap(encoded=true) PostalAddressContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>postalAddressContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressContractsResponseData> postalAddressContractsWithHttpInfo(@Param("elid") String elid, PostalAddressContractsRequestData body, @QueryMap(encoded=true) PostalAddressContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressContracts</code> method in a fluent style.
   */
  public static class PostalAddressContractsQueryParams extends HashMap<String, Object> {
    public PostalAddressContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Floor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressFloorsResponseData postalAddressFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>postalAddressFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressFloorsResponseData> postalAddressFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>postalAddressFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressFloorsResponseData postalAddressFloors(@Param("elid") String elid, PostalAddressFloorsRequestData body, @QueryMap(encoded=true) PostalAddressFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>postalAddressFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressFloorsResponseData> postalAddressFloorsWithHttpInfo(@Param("elid") String elid, PostalAddressFloorsRequestData body, @QueryMap(encoded=true) PostalAddressFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressFloors</code> method in a fluent style.
   */
  public static class PostalAddressFloorsQueryParams extends HashMap<String, Object> {
    public PostalAddressFloorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressPersonGroupsResponseData postalAddressPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>postalAddressPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressPersonGroupsResponseData> postalAddressPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>postalAddressPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressPersonGroupsResponseData postalAddressPersonGroups(@Param("elid") String elid, PostalAddressPersonGroupsRequestData body, @QueryMap(encoded=true) PostalAddressPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>postalAddressPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressPersonGroupsResponseData> postalAddressPersonGroupsWithHttpInfo(@Param("elid") String elid, PostalAddressPersonGroupsRequestData body, @QueryMap(encoded=true) PostalAddressPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressPersonGroups</code> method in a fluent style.
   */
  public static class PostalAddressPersonGroupsQueryParams extends HashMap<String, Object> {
    public PostalAddressPersonGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressPersonsResponseData postalAddressPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>postalAddressPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressPersonsResponseData> postalAddressPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>postalAddressPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressPersonsResponseData postalAddressPersons(@Param("elid") String elid, PostalAddressPersonsRequestData body, @QueryMap(encoded=true) PostalAddressPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>postalAddressPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressPersonsResponseData> postalAddressPersonsWithHttpInfo(@Param("elid") String elid, PostalAddressPersonsRequestData body, @QueryMap(encoded=true) PostalAddressPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressPersons</code> method in a fluent style.
   */
  public static class PostalAddressPersonsQueryParams extends HashMap<String, Object> {
    public PostalAddressPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PostalAddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressQueryResponse postalAddressQuery(@Param("sessionId") String sessionId, PostalAddressQueryRequest body);

  /**
   * Basic query
   * Similar to <code>postalAddressQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressQueryResponse> postalAddressQueryWithHttpInfo(@Param("sessionId") String sessionId, PostalAddressQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>postalAddressQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressQueryResponse postalAddressQuery(PostalAddressQueryRequest body, @QueryMap(encoded=true) PostalAddressQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>postalAddressQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressQueryResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressQueryResponse> postalAddressQueryWithHttpInfo(PostalAddressQueryRequest body, @QueryMap(encoded=true) PostalAddressQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressQuery</code> method in a fluent style.
   */
  public static class PostalAddressQueryQueryParams extends HashMap<String, Object> {
    public PostalAddressQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Room entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PostalAddressRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressRoomsResponseData postalAddressRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>postalAddressRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressRoomsResponseData> postalAddressRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>postalAddressRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressRoomsResponseData postalAddressRooms(@Param("elid") String elid, PostalAddressRoomsRequestData body, @QueryMap(encoded=true) PostalAddressRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>postalAddressRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressRoomsResponseData> postalAddressRoomsWithHttpInfo(@Param("elid") String elid, PostalAddressRoomsRequestData body, @QueryMap(encoded=true) PostalAddressRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressRooms</code> method in a fluent style.
   */
  public static class PostalAddressRoomsQueryParams extends HashMap<String, Object> {
    public PostalAddressRoomsQueryParams sessionId(final String value) {
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
   * @return PostalAddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PostalAddressSystemAttributesResponse postalAddressSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>postalAddressSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PostalAddressSystemAttributesResponse> postalAddressSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PostalAddressSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>postalAddressSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostalAddressSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PostalAddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PostalAddressSystemAttributesResponse postalAddressSystemAttributes(@Param("elid") String elid, PostalAddressSystemAttributesRequest body, @QueryMap(encoded=true) PostalAddressSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>postalAddressSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PostalAddressSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PostalAddressSystemAttributesResponse> postalAddressSystemAttributesWithHttpInfo(@Param("elid") String elid, PostalAddressSystemAttributesRequest body, @QueryMap(encoded=true) PostalAddressSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>postalAddressSystemAttributes</code> method in a fluent style.
   */
  public static class PostalAddressSystemAttributesQueryParams extends HashMap<String, Object> {
    public PostalAddressSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign all assignments
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAllAssignmentsPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllAssignmentsPostalAddressResponse reassignAllAssignmentsPostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsPostalAddressRequestData body);

  /**
   * Reassign all assignments
   * Similar to <code>reassignAllAssignmentsPostalAddress</code> but it also returns the http response headers .
   * Reassign all assignments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllAssignmentsPostalAddressResponse> reassignAllAssignmentsPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAllAssignmentsPostalAddressRequestData body);


  /**
   * Reassign all assignments
   * Reassign all assignments
   * Note, this is equivalent to the other <code>reassignAllAssignmentsPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllAssignmentsPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllAssignmentsPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAllAssignments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllAssignmentsPostalAddressResponse reassignAllAssignmentsPostalAddress(@Param("elid") String elid, ReassignAllAssignmentsPostalAddressRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsPostalAddressQueryParams queryParams);

  /**
  * Reassign all assignments
  * Reassign all assignments
  * Note, this is equivalent to the other <code>reassignAllAssignmentsPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllAssignmentsPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAllAssignments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllAssignmentsPostalAddressResponse> reassignAllAssignmentsPostalAddressWithHttpInfo(@Param("elid") String elid, ReassignAllAssignmentsPostalAddressRequestData body, @QueryMap(encoded=true) ReassignAllAssignmentsPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllAssignmentsPostalAddress</code> method in a fluent style.
   */
  public static class ReassignAllAssignmentsPostalAddressQueryParams extends HashMap<String, Object> {
    public ReassignAllAssignmentsPostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignAssignmentsPartiallyPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAssignmentsPartiallyPostalAddressResponse reassignAssignmentsPartiallyPostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyPostalAddressRequestData body);

  /**
   * Reassign assignments partially
   * Similar to <code>reassignAssignmentsPartiallyPostalAddress</code> but it also returns the http response headers .
   * Reassign assignments partially
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAssignmentsPartiallyPostalAddressResponse> reassignAssignmentsPartiallyPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignAssignmentsPartiallyPostalAddressRequestData body);


  /**
   * Reassign assignments partially
   * Reassign assignments partially
   * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAssignmentsPartiallyPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAssignmentsPartiallyPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAssignmentsPartiallyPostalAddressResponse reassignAssignmentsPartiallyPostalAddress(@Param("elid") String elid, ReassignAssignmentsPartiallyPostalAddressRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyPostalAddressQueryParams queryParams);

  /**
  * Reassign assignments partially
  * Reassign assignments partially
  * Note, this is equivalent to the other <code>reassignAssignmentsPartiallyPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAssignmentsPartiallyPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/reassignAssignmentsPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAssignmentsPartiallyPostalAddressResponse> reassignAssignmentsPartiallyPostalAddressWithHttpInfo(@Param("elid") String elid, ReassignAssignmentsPartiallyPostalAddressRequestData body, @QueryMap(encoded=true) ReassignAssignmentsPartiallyPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAssignmentsPartiallyPostalAddress</code> method in a fluent style.
   */
  public static class ReassignAssignmentsPartiallyPostalAddressQueryParams extends HashMap<String, Object> {
    public ReassignAssignmentsPartiallyPostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePostalAddressResponse updatePostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePostalAddressRequestData body);

  /**
   * Modify
   * Similar to <code>updatePostalAddress</code> but it also returns the http response headers .
   * Modify Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePostalAddressResponse> updatePostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePostalAddressRequestData body);


  /**
   * Modify
   * Modify Postal address
   * Note, this is equivalent to the other <code>updatePostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePostalAddressResponse updatePostalAddress(@Param("elid") String elid, UpdatePostalAddressRequestData body, @QueryMap(encoded=true) UpdatePostalAddressQueryParams queryParams);

  /**
  * Modify
  * Modify Postal address
  * Note, this is equivalent to the other <code>updatePostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePostalAddressResponse> updatePostalAddressWithHttpInfo(@Param("elid") String elid, UpdatePostalAddressRequestData body, @QueryMap(encoded=true) UpdatePostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePostalAddress</code> method in a fluent style.
   */
  public static class UpdatePostalAddressQueryParams extends HashMap<String, Object> {
    public UpdatePostalAddressQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPostalAddressResponse updateSystemAttributesPostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPostalAddressRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPostalAddress</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPostalAddressResponse> updateSystemAttributesPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPostalAddressRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPostalAddressResponse updateSystemAttributesPostalAddress(@Param("elid") String elid, UpdateSystemAttributesPostalAddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPostalAddressQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPostalAddressResponse> updateSystemAttributesPostalAddressWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPostalAddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPostalAddress</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPostalAddressQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
