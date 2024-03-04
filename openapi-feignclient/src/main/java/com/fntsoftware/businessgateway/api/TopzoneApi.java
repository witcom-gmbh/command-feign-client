package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateTopzoneRequestData;
import com.fntsoftware.businessgateway.entities.CreateTopzoneResponse;
import com.fntsoftware.businessgateway.entities.DeleteTopzoneRequestData;
import com.fntsoftware.businessgateway.entities.DeleteTopzoneResponse;
import com.fntsoftware.businessgateway.entities.MoveTopzoneRequestData;
import com.fntsoftware.businessgateway.entities.MoveTopzoneResponse;
import com.fntsoftware.businessgateway.entities.RenameTopzoneRequestData;
import com.fntsoftware.businessgateway.entities.RenameTopzoneResponse;
import com.fntsoftware.businessgateway.entities.TopzoneBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneCampusesRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneCampusesResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneContractsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneContractsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneFloorsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneFloorsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.TopzoneInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.TopzoneMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.TopzonePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.TopzonePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.TopzonePersonsRequestData;
import com.fntsoftware.businessgateway.entities.TopzonePersonsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneQueryRequest;
import com.fntsoftware.businessgateway.entities.TopzoneQueryResponse;
import com.fntsoftware.businessgateway.entities.TopzoneRoomsRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneRoomsResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TopzoneSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.TopzoneTopzoneChildRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneTopzoneChildResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneTopzoneParentRequestData;
import com.fntsoftware.businessgateway.entities.TopzoneTopzoneParentResponseData;
import com.fntsoftware.businessgateway.entities.TopzoneZonesRequest;
import com.fntsoftware.businessgateway.entities.TopzoneZonesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTopzoneRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTopzoneResponse;
import com.fntsoftware.businessgateway.entities.UpdateTopzoneRequestData;
import com.fntsoftware.businessgateway.entities.UpdateTopzoneResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface TopzoneApi extends ApiClient.Api {


  /**
   * Create
   * Create Topzone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateTopzoneResponse createTopzone(@Param("sessionId") String sessionId, CreateTopzoneRequestData body);

  /**
   * Create
   * Similar to <code>createTopzone</code> but it also returns the http response headers .
   * Create Topzone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateTopzoneResponse> createTopzoneWithHttpInfo(@Param("sessionId") String sessionId, CreateTopzoneRequestData body);


  /**
   * Create
   * Create Topzone
   * Note, this is equivalent to the other <code>createTopzone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateTopzoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateTopzoneResponse createTopzone(CreateTopzoneRequestData body, @QueryMap(encoded=true) CreateTopzoneQueryParams queryParams);

  /**
  * Create
  * Create Topzone
  * Note, this is equivalent to the other <code>createTopzone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateTopzoneResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateTopzoneResponse> createTopzoneWithHttpInfo(CreateTopzoneRequestData body, @QueryMap(encoded=true) CreateTopzoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createTopzone</code> method in a fluent style.
   */
  public static class CreateTopzoneQueryParams extends HashMap<String, Object> {
    public CreateTopzoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteTopzoneResponse deleteTopzone(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTopzoneRequestData body);

  /**
   * Delete
   * Similar to <code>deleteTopzone</code> but it also returns the http response headers .
   * Delete topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteTopzoneResponse> deleteTopzoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTopzoneRequestData body);


  /**
   * Delete
   * Delete topzone
   * Note, this is equivalent to the other <code>deleteTopzone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTopzoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteTopzoneResponse deleteTopzone(@Param("elid") String elid, DeleteTopzoneRequestData body, @QueryMap(encoded=true) DeleteTopzoneQueryParams queryParams);

  /**
  * Delete
  * Delete topzone
  * Note, this is equivalent to the other <code>deleteTopzone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteTopzoneResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteTopzoneResponse> deleteTopzoneWithHttpInfo(@Param("elid") String elid, DeleteTopzoneRequestData body, @QueryMap(encoded=true) DeleteTopzoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTopzone</code> method in a fluent style.
   */
  public static class DeleteTopzoneQueryParams extends HashMap<String, Object> {
    public DeleteTopzoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Move
   * Move Topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MoveTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/move?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MoveTopzoneResponse moveTopzone(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveTopzoneRequestData body);

  /**
   * Move
   * Similar to <code>moveTopzone</code> but it also returns the http response headers .
   * Move Topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/move?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MoveTopzoneResponse> moveTopzoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MoveTopzoneRequestData body);


  /**
   * Move
   * Move Topzone
   * Note, this is equivalent to the other <code>moveTopzone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MoveTopzoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MoveTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/move?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MoveTopzoneResponse moveTopzone(@Param("elid") String elid, MoveTopzoneRequestData body, @QueryMap(encoded=true) MoveTopzoneQueryParams queryParams);

  /**
  * Move
  * Move Topzone
  * Note, this is equivalent to the other <code>moveTopzone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MoveTopzoneResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/move?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MoveTopzoneResponse> moveTopzoneWithHttpInfo(@Param("elid") String elid, MoveTopzoneRequestData body, @QueryMap(encoded=true) MoveTopzoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>moveTopzone</code> method in a fluent style.
   */
  public static class MoveTopzoneQueryParams extends HashMap<String, Object> {
    public MoveTopzoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Rename
   * Rename topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RenameTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RenameTopzoneResponse renameTopzone(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameTopzoneRequestData body);

  /**
   * Rename
   * Similar to <code>renameTopzone</code> but it also returns the http response headers .
   * Rename topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RenameTopzoneResponse> renameTopzoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameTopzoneRequestData body);


  /**
   * Rename
   * Rename topzone
   * Note, this is equivalent to the other <code>renameTopzone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RenameTopzoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RenameTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/rename?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RenameTopzoneResponse renameTopzone(@Param("elid") String elid, RenameTopzoneRequestData body, @QueryMap(encoded=true) RenameTopzoneQueryParams queryParams);

  /**
  * Rename
  * Rename topzone
  * Note, this is equivalent to the other <code>renameTopzone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RenameTopzoneResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/rename?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RenameTopzoneResponse> renameTopzoneWithHttpInfo(@Param("elid") String elid, RenameTopzoneRequestData body, @QueryMap(encoded=true) RenameTopzoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>renameTopzone</code> method in a fluent style.
   */
  public static class RenameTopzoneQueryParams extends HashMap<String, Object> {
    public RenameTopzoneQueryParams sessionId(final String value) {
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
   * @return TopzoneBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneBuildingsResponseData topzoneBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>topzoneBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneBuildingsResponseData> topzoneBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>topzoneBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneBuildingsResponseData topzoneBuildings(@Param("elid") String elid, TopzoneBuildingsRequestData body, @QueryMap(encoded=true) TopzoneBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>topzoneBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneBuildingsResponseData> topzoneBuildingsWithHttpInfo(@Param("elid") String elid, TopzoneBuildingsRequestData body, @QueryMap(encoded=true) TopzoneBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneBuildings</code> method in a fluent style.
   */
  public static class TopzoneBuildingsQueryParams extends HashMap<String, Object> {
    public TopzoneBuildingsQueryParams sessionId(final String value) {
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
   * @return TopzoneCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneCampusesResponseData topzoneCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>topzoneCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneCampusesResponseData> topzoneCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>topzoneCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneCampusesResponseData topzoneCampuses(@Param("elid") String elid, TopzoneCampusesRequestData body, @QueryMap(encoded=true) TopzoneCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>topzoneCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneCampusesResponseData> topzoneCampusesWithHttpInfo(@Param("elid") String elid, TopzoneCampusesRequestData body, @QueryMap(encoded=true) TopzoneCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneCampuses</code> method in a fluent style.
   */
  public static class TopzoneCampusesQueryParams extends HashMap<String, Object> {
    public TopzoneCampusesQueryParams sessionId(final String value) {
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
   * @return TopzoneContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneContractsResponseData topzoneContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>topzoneContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneContractsResponseData> topzoneContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>topzoneContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneContractsResponseData topzoneContracts(@Param("elid") String elid, TopzoneContractsRequestData body, @QueryMap(encoded=true) TopzoneContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>topzoneContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneContractsResponseData> topzoneContractsWithHttpInfo(@Param("elid") String elid, TopzoneContractsRequestData body, @QueryMap(encoded=true) TopzoneContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneContracts</code> method in a fluent style.
   */
  public static class TopzoneContractsQueryParams extends HashMap<String, Object> {
    public TopzoneContractsQueryParams sessionId(final String value) {
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
   * @return TopzoneFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneFloorsResponseData topzoneFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>topzoneFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneFloorsResponseData> topzoneFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>topzoneFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneFloorsResponseData topzoneFloors(@Param("elid") String elid, TopzoneFloorsRequestData body, @QueryMap(encoded=true) TopzoneFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>topzoneFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneFloorsResponseData> topzoneFloorsWithHttpInfo(@Param("elid") String elid, TopzoneFloorsRequestData body, @QueryMap(encoded=true) TopzoneFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneFloors</code> method in a fluent style.
   */
  public static class TopzoneFloorsQueryParams extends HashMap<String, Object> {
    public TopzoneFloorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Frame contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TopzoneFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneFrameContractsResponseData topzoneFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>topzoneFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneFrameContractsResponseData> topzoneFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>topzoneFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneFrameContractsResponseData topzoneFrameContracts(@Param("elid") String elid, TopzoneFrameContractsRequestData body, @QueryMap(encoded=true) TopzoneFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>topzoneFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneFrameContractsResponseData> topzoneFrameContractsWithHttpInfo(@Param("elid") String elid, TopzoneFrameContractsRequestData body, @QueryMap(encoded=true) TopzoneFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneFrameContracts</code> method in a fluent style.
   */
  public static class TopzoneFrameContractsQueryParams extends HashMap<String, Object> {
    public TopzoneFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TopzoneInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneInheritedGeoCoordinatesResponse topzoneInheritedGeoCoordinates(@Param("sessionId") String sessionId, TopzoneInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>topzoneInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneInheritedGeoCoordinatesResponse> topzoneInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, TopzoneInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>topzoneInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneInheritedGeoCoordinatesResponse topzoneInheritedGeoCoordinates(TopzoneInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) TopzoneInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>topzoneInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneInheritedGeoCoordinatesResponse> topzoneInheritedGeoCoordinatesWithHttpInfo(TopzoneInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) TopzoneInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class TopzoneInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public TopzoneInheritedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TopzoneMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneMaintenanceContractsResponseData topzoneMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>topzoneMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneMaintenanceContractsResponseData> topzoneMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>topzoneMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneMaintenanceContractsResponseData topzoneMaintenanceContracts(@Param("elid") String elid, TopzoneMaintenanceContractsRequestData body, @QueryMap(encoded=true) TopzoneMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>topzoneMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneMaintenanceContractsResponseData> topzoneMaintenanceContractsWithHttpInfo(@Param("elid") String elid, TopzoneMaintenanceContractsRequestData body, @QueryMap(encoded=true) TopzoneMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneMaintenanceContracts</code> method in a fluent style.
   */
  public static class TopzoneMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public TopzoneMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Organization entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TopzoneOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneOrganizationsResponseData topzoneOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>topzoneOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneOrganizationsResponseData> topzoneOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>topzoneOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneOrganizationsResponseData topzoneOrganizations(@Param("elid") String elid, TopzoneOrganizationsRequestData body, @QueryMap(encoded=true) TopzoneOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>topzoneOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneOrganizationsResponseData> topzoneOrganizationsWithHttpInfo(@Param("elid") String elid, TopzoneOrganizationsRequestData body, @QueryMap(encoded=true) TopzoneOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneOrganizations</code> method in a fluent style.
   */
  public static class TopzoneOrganizationsQueryParams extends HashMap<String, Object> {
    public TopzoneOrganizationsQueryParams sessionId(final String value) {
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
   * @return TopzonePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzonePersonGroupsResponseData topzonePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzonePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>topzonePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzonePersonGroupsResponseData> topzonePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzonePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>topzonePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzonePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzonePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzonePersonGroupsResponseData topzonePersonGroups(@Param("elid") String elid, TopzonePersonGroupsRequestData body, @QueryMap(encoded=true) TopzonePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>topzonePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzonePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzonePersonGroupsResponseData> topzonePersonGroupsWithHttpInfo(@Param("elid") String elid, TopzonePersonGroupsRequestData body, @QueryMap(encoded=true) TopzonePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzonePersonGroups</code> method in a fluent style.
   */
  public static class TopzonePersonGroupsQueryParams extends HashMap<String, Object> {
    public TopzonePersonGroupsQueryParams sessionId(final String value) {
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
   * @return TopzonePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzonePersonsResponseData topzonePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzonePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>topzonePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzonePersonsResponseData> topzonePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzonePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>topzonePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzonePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzonePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzonePersonsResponseData topzonePersons(@Param("elid") String elid, TopzonePersonsRequestData body, @QueryMap(encoded=true) TopzonePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>topzonePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzonePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzonePersonsResponseData> topzonePersonsWithHttpInfo(@Param("elid") String elid, TopzonePersonsRequestData body, @QueryMap(encoded=true) TopzonePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzonePersons</code> method in a fluent style.
   */
  public static class TopzonePersonsQueryParams extends HashMap<String, Object> {
    public TopzonePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TopzoneQueryResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneQueryResponse topzoneQuery(@Param("sessionId") String sessionId, TopzoneQueryRequest body);

  /**
   * Basic query
   * Similar to <code>topzoneQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneQueryResponse> topzoneQueryWithHttpInfo(@Param("sessionId") String sessionId, TopzoneQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>topzoneQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneQueryResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneQueryResponse topzoneQuery(TopzoneQueryRequest body, @QueryMap(encoded=true) TopzoneQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>topzoneQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneQueryResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneQueryResponse> topzoneQueryWithHttpInfo(TopzoneQueryRequest body, @QueryMap(encoded=true) TopzoneQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneQuery</code> method in a fluent style.
   */
  public static class TopzoneQueryQueryParams extends HashMap<String, Object> {
    public TopzoneQueryQueryParams sessionId(final String value) {
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
   * @return TopzoneRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneRoomsResponseData topzoneRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>topzoneRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneRoomsResponseData> topzoneRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>topzoneRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneRoomsResponseData topzoneRooms(@Param("elid") String elid, TopzoneRoomsRequestData body, @QueryMap(encoded=true) TopzoneRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>topzoneRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneRoomsResponseData> topzoneRoomsWithHttpInfo(@Param("elid") String elid, TopzoneRoomsRequestData body, @QueryMap(encoded=true) TopzoneRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneRooms</code> method in a fluent style.
   */
  public static class TopzoneRoomsQueryParams extends HashMap<String, Object> {
    public TopzoneRoomsQueryParams sessionId(final String value) {
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
   * @return TopzoneSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneSystemAttributesResponse topzoneSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>topzoneSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneSystemAttributesResponse> topzoneSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>topzoneSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneSystemAttributesResponse topzoneSystemAttributes(@Param("elid") String elid, TopzoneSystemAttributesRequest body, @QueryMap(encoded=true) TopzoneSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>topzoneSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneSystemAttributesResponse> topzoneSystemAttributesWithHttpInfo(@Param("elid") String elid, TopzoneSystemAttributesRequest body, @QueryMap(encoded=true) TopzoneSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneSystemAttributes</code> method in a fluent style.
   */
  public static class TopzoneSystemAttributesQueryParams extends HashMap<String, Object> {
    public TopzoneSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Topzone (child) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TopzoneTopzoneChildResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneTopzoneChildResponseData topzoneTopzoneChild(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneTopzoneChildRequestData body);

  /**
   * Get relations to Topzone (child) entities
   * Similar to <code>topzoneTopzoneChild</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneTopzoneChildResponseData> topzoneTopzoneChildWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneTopzoneChildRequestData body);


  /**
   * Get relations to Topzone (child) entities
   * 
   * Note, this is equivalent to the other <code>topzoneTopzoneChild</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneTopzoneChildQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneTopzoneChildResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneChild?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneTopzoneChildResponseData topzoneTopzoneChild(@Param("elid") String elid, TopzoneTopzoneChildRequestData body, @QueryMap(encoded=true) TopzoneTopzoneChildQueryParams queryParams);

  /**
  * Get relations to Topzone (child) entities
  * 
  * Note, this is equivalent to the other <code>topzoneTopzoneChild</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneTopzoneChildResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneChild?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneTopzoneChildResponseData> topzoneTopzoneChildWithHttpInfo(@Param("elid") String elid, TopzoneTopzoneChildRequestData body, @QueryMap(encoded=true) TopzoneTopzoneChildQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneTopzoneChild</code> method in a fluent style.
   */
  public static class TopzoneTopzoneChildQueryParams extends HashMap<String, Object> {
    public TopzoneTopzoneChildQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Topzone (parent) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TopzoneTopzoneParentResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneTopzoneParentResponseData topzoneTopzoneParent(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneTopzoneParentRequestData body);

  /**
   * Get relations to Topzone (parent) entities
   * Similar to <code>topzoneTopzoneParent</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneTopzoneParentResponseData> topzoneTopzoneParentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneTopzoneParentRequestData body);


  /**
   * Get relations to Topzone (parent) entities
   * 
   * Note, this is equivalent to the other <code>topzoneTopzoneParent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneTopzoneParentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneTopzoneParentResponseData
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneParent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneTopzoneParentResponseData topzoneTopzoneParent(@Param("elid") String elid, TopzoneTopzoneParentRequestData body, @QueryMap(encoded=true) TopzoneTopzoneParentQueryParams queryParams);

  /**
  * Get relations to Topzone (parent) entities
  * 
  * Note, this is equivalent to the other <code>topzoneTopzoneParent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneTopzoneParentResponseData
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/TopzoneParent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneTopzoneParentResponseData> topzoneTopzoneParentWithHttpInfo(@Param("elid") String elid, TopzoneTopzoneParentRequestData body, @QueryMap(encoded=true) TopzoneTopzoneParentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneTopzoneParent</code> method in a fluent style.
   */
  public static class TopzoneTopzoneParentQueryParams extends HashMap<String, Object> {
    public TopzoneTopzoneParentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Zone query
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TopzoneZonesResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TopzoneZonesResponse topzoneZones(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneZonesRequest body);

  /**
   * Zone query
   * Similar to <code>topzoneZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TopzoneZonesResponse> topzoneZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TopzoneZonesRequest body);


  /**
   * Zone query
   * 
   * Note, this is equivalent to the other <code>topzoneZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TopzoneZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TopzoneZonesResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TopzoneZonesResponse topzoneZones(@Param("elid") String elid, TopzoneZonesRequest body, @QueryMap(encoded=true) TopzoneZonesQueryParams queryParams);

  /**
  * Zone query
  * 
  * Note, this is equivalent to the other <code>topzoneZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TopzoneZonesResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TopzoneZonesResponse> topzoneZonesWithHttpInfo(@Param("elid") String elid, TopzoneZonesRequest body, @QueryMap(encoded=true) TopzoneZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>topzoneZones</code> method in a fluent style.
   */
  public static class TopzoneZonesQueryParams extends HashMap<String, Object> {
    public TopzoneZonesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTopzoneResponse updateSystemAttributesTopzone(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTopzoneRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTopzone</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTopzoneResponse> updateSystemAttributesTopzoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTopzoneRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTopzone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTopzoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTopzoneResponse updateSystemAttributesTopzone(@Param("elid") String elid, UpdateSystemAttributesTopzoneRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTopzoneQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTopzone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTopzoneResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTopzoneResponse> updateSystemAttributesTopzoneWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTopzoneRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTopzoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTopzone</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTopzoneQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTopzoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateTopzoneResponse updateTopzone(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTopzoneRequestData body);

  /**
   * Modify
   * Similar to <code>updateTopzone</code> but it also returns the http response headers .
   * Modify topzone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateTopzoneResponse> updateTopzoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTopzoneRequestData body);


  /**
   * Modify
   * Modify topzone
   * Note, this is equivalent to the other <code>updateTopzone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateTopzoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateTopzoneResponse
   */
  @RequestLine("POST /api/rest/entity/topzone/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateTopzoneResponse updateTopzone(@Param("elid") String elid, UpdateTopzoneRequestData body, @QueryMap(encoded=true) UpdateTopzoneQueryParams queryParams);

  /**
  * Modify
  * Modify topzone
  * Note, this is equivalent to the other <code>updateTopzone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateTopzoneResponse
      */
      @RequestLine("POST /api/rest/entity/topzone/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateTopzoneResponse> updateTopzoneWithHttpInfo(@Param("elid") String elid, UpdateTopzoneRequestData body, @QueryMap(encoded=true) UpdateTopzoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateTopzone</code> method in a fluent style.
   */
  public static class UpdateTopzoneQueryParams extends HashMap<String, Object> {
    public UpdateTopzoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
