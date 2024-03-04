package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeDuctTypeDuctRequestData;
import com.fntsoftware.businessgateway.entities.ChangeDuctTypeDuctResponse;
import com.fntsoftware.businessgateway.entities.CreateDuctRequestData;
import com.fntsoftware.businessgateway.entities.CreateDuctResponse;
import com.fntsoftware.businessgateway.entities.DeleteDuctRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDuctResponse;
import com.fntsoftware.businessgateway.entities.DuctContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.DuctDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.DuctDuctContentRequest;
import com.fntsoftware.businessgateway.entities.DuctDuctContentResponse;
import com.fntsoftware.businessgateway.entities.DuctDuctRouteRequest;
import com.fntsoftware.businessgateway.entities.DuctDuctRouteResponse;
import com.fntsoftware.businessgateway.entities.DuctDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.DuctDuctTypeResponseData;
import com.fntsoftware.businessgateway.entities.DuctFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctFromDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.DuctFromDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.DuctFromNodeRequestData;
import com.fntsoftware.businessgateway.entities.DuctFromNodeResponseData;
import com.fntsoftware.businessgateway.entities.DuctInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.DuctInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.DuctMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DuctOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DuctPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DuctPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DuctPersonsRequestData;
import com.fntsoftware.businessgateway.entities.DuctPersonsResponseData;
import com.fntsoftware.businessgateway.entities.DuctQueryRequest;
import com.fntsoftware.businessgateway.entities.DuctQueryResponse;
import com.fntsoftware.businessgateway.entities.DuctSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DuctSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DuctToDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.DuctToDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.DuctToNodeRequestData;
import com.fntsoftware.businessgateway.entities.DuctToNodeResponseData;
import com.fntsoftware.businessgateway.entities.LockReleaseDuctDuctRequestData;
import com.fntsoftware.businessgateway.entities.LockReleaseDuctDuctResponse;
import com.fntsoftware.businessgateway.entities.UpdateDuctRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDuctResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DuctApi extends ApiClient.Api {


  /**
   * Replace duct type
   * Modifies the Duct Type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeDuctTypeDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/changeDuctType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeDuctTypeDuctResponse changeDuctTypeDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeDuctTypeDuctRequestData body);

  /**
   * Replace duct type
   * Similar to <code>changeDuctTypeDuct</code> but it also returns the http response headers .
   * Modifies the Duct Type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/changeDuctType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeDuctTypeDuctResponse> changeDuctTypeDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeDuctTypeDuctRequestData body);


  /**
   * Replace duct type
   * Modifies the Duct Type
   * Note, this is equivalent to the other <code>changeDuctTypeDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeDuctTypeDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeDuctTypeDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/changeDuctType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeDuctTypeDuctResponse changeDuctTypeDuct(@Param("elid") String elid, ChangeDuctTypeDuctRequestData body, @QueryMap(encoded=true) ChangeDuctTypeDuctQueryParams queryParams);

  /**
  * Replace duct type
  * Modifies the Duct Type
  * Note, this is equivalent to the other <code>changeDuctTypeDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeDuctTypeDuctResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/changeDuctType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeDuctTypeDuctResponse> changeDuctTypeDuctWithHttpInfo(@Param("elid") String elid, ChangeDuctTypeDuctRequestData body, @QueryMap(encoded=true) ChangeDuctTypeDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeDuctTypeDuct</code> method in a fluent style.
   */
  public static class ChangeDuctTypeDuctQueryParams extends HashMap<String, Object> {
    public ChangeDuctTypeDuctQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Duct
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDuctResponse createDuct(@Param("sessionId") String sessionId, CreateDuctRequestData body);

  /**
   * Create
   * Similar to <code>createDuct</code> but it also returns the http response headers .
   * Create Duct
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDuctResponse> createDuctWithHttpInfo(@Param("sessionId") String sessionId, CreateDuctRequestData body);


  /**
   * Create
   * Create Duct
   * Note, this is equivalent to the other <code>createDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDuctResponse createDuct(CreateDuctRequestData body, @QueryMap(encoded=true) CreateDuctQueryParams queryParams);

  /**
  * Create
  * Create Duct
  * Note, this is equivalent to the other <code>createDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDuctResponse
      */
      @RequestLine("POST /api/rest/entity/duct/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDuctResponse> createDuctWithHttpInfo(CreateDuctRequestData body, @QueryMap(encoded=true) CreateDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDuct</code> method in a fluent style.
   */
  public static class CreateDuctQueryParams extends HashMap<String, Object> {
    public CreateDuctQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Duct
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDuctResponse deleteDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDuct</code> but it also returns the http response headers .
   * Delete Duct
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDuctResponse> deleteDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctRequestData body);


  /**
   * Delete
   * Delete Duct
   * Note, this is equivalent to the other <code>deleteDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDuctResponse deleteDuct(@Param("elid") String elid, DeleteDuctRequestData body, @QueryMap(encoded=true) DeleteDuctQueryParams queryParams);

  /**
  * Delete
  * Delete Duct
  * Note, this is equivalent to the other <code>deleteDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDuctResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDuctResponse> deleteDuctWithHttpInfo(@Param("elid") String elid, DeleteDuctRequestData body, @QueryMap(encoded=true) DeleteDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDuct</code> method in a fluent style.
   */
  public static class DeleteDuctQueryParams extends HashMap<String, Object> {
    public DeleteDuctQueryParams sessionId(final String value) {
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
   * @return DuctContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctContractsResponseData ductContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ductContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctContractsResponseData> ductContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ductContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctContractsResponseData ductContracts(@Param("elid") String elid, DuctContractsRequestData body, @QueryMap(encoded=true) DuctContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ductContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctContractsResponseData> ductContractsWithHttpInfo(@Param("elid") String elid, DuctContractsRequestData body, @QueryMap(encoded=true) DuctContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductContracts</code> method in a fluent style.
   */
  public static class DuctContractsQueryParams extends HashMap<String, Object> {
    public DuctContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctDataCablesResponseData ductDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>ductDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctDataCablesResponseData> ductDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>ductDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctDataCablesResponseData ductDataCables(@Param("elid") String elid, DuctDataCablesRequestData body, @QueryMap(encoded=true) DuctDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>ductDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/DataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctDataCablesResponseData> ductDataCablesWithHttpInfo(@Param("elid") String elid, DuctDataCablesRequestData body, @QueryMap(encoded=true) DuctDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductDataCables</code> method in a fluent style.
   */
  public static class DuctDataCablesQueryParams extends HashMap<String, Object> {
    public DuctDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query duct content
   * Query for fetching all objects from duct content
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctDuctContentResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctDuctContentResponse ductDuctContent(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDuctContentRequest body);

  /**
   * Query duct content
   * Similar to <code>ductDuctContent</code> but it also returns the http response headers .
   * Query for fetching all objects from duct content
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctDuctContentResponse> ductDuctContentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDuctContentRequest body);


  /**
   * Query duct content
   * Query for fetching all objects from duct content
   * Note, this is equivalent to the other <code>ductDuctContent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctDuctContentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctDuctContentResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctContent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctDuctContentResponse ductDuctContent(@Param("elid") String elid, DuctDuctContentRequest body, @QueryMap(encoded=true) DuctDuctContentQueryParams queryParams);

  /**
  * Query duct content
  * Query for fetching all objects from duct content
  * Note, this is equivalent to the other <code>ductDuctContent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctDuctContentResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/DuctContent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctDuctContentResponse> ductDuctContentWithHttpInfo(@Param("elid") String elid, DuctDuctContentRequest body, @QueryMap(encoded=true) DuctDuctContentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductDuctContent</code> method in a fluent style.
   */
  public static class DuctDuctContentQueryParams extends HashMap<String, Object> {
    public DuctDuctContentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query duct route
   * Query for fetching all objects from duct route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctDuctRouteResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctDuctRouteResponse ductDuctRoute(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDuctRouteRequest body);

  /**
   * Query duct route
   * Similar to <code>ductDuctRoute</code> but it also returns the http response headers .
   * Query for fetching all objects from duct route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctDuctRouteResponse> ductDuctRouteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDuctRouteRequest body);


  /**
   * Query duct route
   * Query for fetching all objects from duct route
   * Note, this is equivalent to the other <code>ductDuctRoute</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctDuctRouteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctDuctRouteResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctDuctRouteResponse ductDuctRoute(@Param("elid") String elid, DuctDuctRouteRequest body, @QueryMap(encoded=true) DuctDuctRouteQueryParams queryParams);

  /**
  * Query duct route
  * Query for fetching all objects from duct route
  * Note, this is equivalent to the other <code>ductDuctRoute</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctDuctRouteResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/DuctRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctDuctRouteResponse> ductDuctRouteWithHttpInfo(@Param("elid") String elid, DuctDuctRouteRequest body, @QueryMap(encoded=true) DuctDuctRouteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductDuctRoute</code> method in a fluent style.
   */
  public static class DuctDuctRouteQueryParams extends HashMap<String, Object> {
    public DuctDuctRouteQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctDuctTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctDuctTypeResponseData ductDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDuctTypeRequestData body);

  /**
   * Get relations to Duct type entities
   * Similar to <code>ductDuctType</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctDuctTypeResponseData> ductDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctDuctTypeRequestData body);


  /**
   * Get relations to Duct type entities
   * 
   * Note, this is equivalent to the other <code>ductDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctDuctTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/DuctType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctDuctTypeResponseData ductDuctType(@Param("elid") String elid, DuctDuctTypeRequestData body, @QueryMap(encoded=true) DuctDuctTypeQueryParams queryParams);

  /**
  * Get relations to Duct type entities
  * 
  * Note, this is equivalent to the other <code>ductDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctDuctTypeResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/DuctType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctDuctTypeResponseData> ductDuctTypeWithHttpInfo(@Param("elid") String elid, DuctDuctTypeRequestData body, @QueryMap(encoded=true) DuctDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductDuctType</code> method in a fluent style.
   */
  public static class DuctDuctTypeQueryParams extends HashMap<String, Object> {
    public DuctDuctTypeQueryParams sessionId(final String value) {
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
   * @return DuctFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctFrameContractsResponseData ductFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ductFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctFrameContractsResponseData> ductFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ductFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctFrameContractsResponseData ductFrameContracts(@Param("elid") String elid, DuctFrameContractsRequestData body, @QueryMap(encoded=true) DuctFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ductFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctFrameContractsResponseData> ductFrameContractsWithHttpInfo(@Param("elid") String elid, DuctFrameContractsRequestData body, @QueryMap(encoded=true) DuctFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductFrameContracts</code> method in a fluent style.
   */
  public static class DuctFrameContractsQueryParams extends HashMap<String, Object> {
    public DuctFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctFromDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FromDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctFromDeviceAllResponseData ductFromDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctFromDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>ductFromDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FromDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctFromDeviceAllResponseData> ductFromDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctFromDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>ductFromDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctFromDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctFromDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FromDeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctFromDeviceAllResponseData ductFromDeviceAll(@Param("elid") String elid, DuctFromDeviceAllRequestData body, @QueryMap(encoded=true) DuctFromDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>ductFromDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctFromDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/FromDeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctFromDeviceAllResponseData> ductFromDeviceAllWithHttpInfo(@Param("elid") String elid, DuctFromDeviceAllRequestData body, @QueryMap(encoded=true) DuctFromDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductFromDeviceAll</code> method in a fluent style.
   */
  public static class DuctFromDeviceAllQueryParams extends HashMap<String, Object> {
    public DuctFromDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctFromNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctFromNodeResponseData ductFromNode(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctFromNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>ductFromNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctFromNodeResponseData> ductFromNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctFromNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>ductFromNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctFromNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctFromNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctFromNodeResponseData ductFromNode(@Param("elid") String elid, DuctFromNodeRequestData body, @QueryMap(encoded=true) DuctFromNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>ductFromNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctFromNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/FromNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctFromNodeResponseData> ductFromNodeWithHttpInfo(@Param("elid") String elid, DuctFromNodeRequestData body, @QueryMap(encoded=true) DuctFromNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductFromNode</code> method in a fluent style.
   */
  public static class DuctFromNodeQueryParams extends HashMap<String, Object> {
    public DuctFromNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DuctInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/duct/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctInheritedGeoCoordinatesResponse ductInheritedGeoCoordinates(@Param("sessionId") String sessionId, DuctInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>ductInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctInheritedGeoCoordinatesResponse> ductInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, DuctInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>ductInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/duct/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctInheritedGeoCoordinatesResponse ductInheritedGeoCoordinates(DuctInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) DuctInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>ductInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/duct/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctInheritedGeoCoordinatesResponse> ductInheritedGeoCoordinatesWithHttpInfo(DuctInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) DuctInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class DuctInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public DuctInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return DuctMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctMaintenanceContractsResponseData ductMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ductMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctMaintenanceContractsResponseData> ductMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ductMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctMaintenanceContractsResponseData ductMaintenanceContracts(@Param("elid") String elid, DuctMaintenanceContractsRequestData body, @QueryMap(encoded=true) DuctMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ductMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctMaintenanceContractsResponseData> ductMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DuctMaintenanceContractsRequestData body, @QueryMap(encoded=true) DuctMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductMaintenanceContracts</code> method in a fluent style.
   */
  public static class DuctMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DuctMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return DuctOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctOrganizationsResponseData ductOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ductOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctOrganizationsResponseData> ductOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ductOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctOrganizationsResponseData ductOrganizations(@Param("elid") String elid, DuctOrganizationsRequestData body, @QueryMap(encoded=true) DuctOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ductOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctOrganizationsResponseData> ductOrganizationsWithHttpInfo(@Param("elid") String elid, DuctOrganizationsRequestData body, @QueryMap(encoded=true) DuctOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductOrganizations</code> method in a fluent style.
   */
  public static class DuctOrganizationsQueryParams extends HashMap<String, Object> {
    public DuctOrganizationsQueryParams sessionId(final String value) {
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
   * @return DuctPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctPersonGroupsResponseData ductPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ductPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctPersonGroupsResponseData> ductPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ductPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctPersonGroupsResponseData ductPersonGroups(@Param("elid") String elid, DuctPersonGroupsRequestData body, @QueryMap(encoded=true) DuctPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ductPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctPersonGroupsResponseData> ductPersonGroupsWithHttpInfo(@Param("elid") String elid, DuctPersonGroupsRequestData body, @QueryMap(encoded=true) DuctPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductPersonGroups</code> method in a fluent style.
   */
  public static class DuctPersonGroupsQueryParams extends HashMap<String, Object> {
    public DuctPersonGroupsQueryParams sessionId(final String value) {
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
   * @return DuctPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctPersonsResponseData ductPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ductPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctPersonsResponseData> ductPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ductPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctPersonsResponseData ductPersons(@Param("elid") String elid, DuctPersonsRequestData body, @QueryMap(encoded=true) DuctPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ductPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctPersonsResponseData> ductPersonsWithHttpInfo(@Param("elid") String elid, DuctPersonsRequestData body, @QueryMap(encoded=true) DuctPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductPersons</code> method in a fluent style.
   */
  public static class DuctPersonsQueryParams extends HashMap<String, Object> {
    public DuctPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DuctQueryResponse
   */
  @RequestLine("POST /api/rest/entity/duct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctQueryResponse ductQuery(@Param("sessionId") String sessionId, DuctQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ductQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctQueryResponse> ductQueryWithHttpInfo(@Param("sessionId") String sessionId, DuctQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>ductQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctQueryResponse
   */
  @RequestLine("POST /api/rest/entity/duct/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctQueryResponse ductQuery(DuctQueryRequest body, @QueryMap(encoded=true) DuctQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>ductQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctQueryResponse
      */
      @RequestLine("POST /api/rest/entity/duct/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctQueryResponse> ductQueryWithHttpInfo(DuctQueryRequest body, @QueryMap(encoded=true) DuctQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductQuery</code> method in a fluent style.
   */
  public static class DuctQueryQueryParams extends HashMap<String, Object> {
    public DuctQueryQueryParams sessionId(final String value) {
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
   * @return DuctSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctSystemAttributesResponse ductSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ductSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctSystemAttributesResponse> ductSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ductSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctSystemAttributesResponse ductSystemAttributes(@Param("elid") String elid, DuctSystemAttributesRequest body, @QueryMap(encoded=true) DuctSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ductSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctSystemAttributesResponse> ductSystemAttributesWithHttpInfo(@Param("elid") String elid, DuctSystemAttributesRequest body, @QueryMap(encoded=true) DuctSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductSystemAttributes</code> method in a fluent style.
   */
  public static class DuctSystemAttributesQueryParams extends HashMap<String, Object> {
    public DuctSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctToDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/ToDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctToDeviceAllResponseData ductToDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctToDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>ductToDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/ToDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctToDeviceAllResponseData> ductToDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctToDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>ductToDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctToDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctToDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/ToDeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctToDeviceAllResponseData ductToDeviceAll(@Param("elid") String elid, DuctToDeviceAllRequestData body, @QueryMap(encoded=true) DuctToDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>ductToDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctToDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/ToDeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctToDeviceAllResponseData> ductToDeviceAllWithHttpInfo(@Param("elid") String elid, DuctToDeviceAllRequestData body, @QueryMap(encoded=true) DuctToDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductToDeviceAll</code> method in a fluent style.
   */
  public static class DuctToDeviceAllQueryParams extends HashMap<String, Object> {
    public DuctToDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctToNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctToNodeResponseData ductToNode(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctToNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>ductToNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctToNodeResponseData> ductToNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctToNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>ductToNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctToNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctToNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctToNodeResponseData ductToNode(@Param("elid") String elid, DuctToNodeRequestData body, @QueryMap(encoded=true) DuctToNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>ductToNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctToNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/ToNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctToNodeResponseData> ductToNodeWithHttpInfo(@Param("elid") String elid, DuctToNodeRequestData body, @QueryMap(encoded=true) DuctToNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductToNode</code> method in a fluent style.
   */
  public static class DuctToNodeQueryParams extends HashMap<String, Object> {
    public DuctToNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Lock / release duct
   * Modifies the status of a Duct
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LockReleaseDuctDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/lockReleaseDuct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LockReleaseDuctDuctResponse lockReleaseDuctDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, LockReleaseDuctDuctRequestData body);

  /**
   * Lock / release duct
   * Similar to <code>lockReleaseDuctDuct</code> but it also returns the http response headers .
   * Modifies the status of a Duct
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/lockReleaseDuct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LockReleaseDuctDuctResponse> lockReleaseDuctDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LockReleaseDuctDuctRequestData body);


  /**
   * Lock / release duct
   * Modifies the status of a Duct
   * Note, this is equivalent to the other <code>lockReleaseDuctDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LockReleaseDuctDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LockReleaseDuctDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/lockReleaseDuct?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LockReleaseDuctDuctResponse lockReleaseDuctDuct(@Param("elid") String elid, LockReleaseDuctDuctRequestData body, @QueryMap(encoded=true) LockReleaseDuctDuctQueryParams queryParams);

  /**
  * Lock / release duct
  * Modifies the status of a Duct
  * Note, this is equivalent to the other <code>lockReleaseDuctDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LockReleaseDuctDuctResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/lockReleaseDuct?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LockReleaseDuctDuctResponse> lockReleaseDuctDuctWithHttpInfo(@Param("elid") String elid, LockReleaseDuctDuctRequestData body, @QueryMap(encoded=true) LockReleaseDuctDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lockReleaseDuctDuct</code> method in a fluent style.
   */
  public static class LockReleaseDuctDuctQueryParams extends HashMap<String, Object> {
    public LockReleaseDuctDuctQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Duct
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDuctResponse updateDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctRequestData body);

  /**
   * Modify
   * Similar to <code>updateDuct</code> but it also returns the http response headers .
   * Modify Duct
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDuctResponse> updateDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctRequestData body);


  /**
   * Modify
   * Modify Duct
   * Note, this is equivalent to the other <code>updateDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDuctResponse updateDuct(@Param("elid") String elid, UpdateDuctRequestData body, @QueryMap(encoded=true) UpdateDuctQueryParams queryParams);

  /**
  * Modify
  * Modify Duct
  * Note, this is equivalent to the other <code>updateDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDuctResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDuctResponse> updateDuctWithHttpInfo(@Param("elid") String elid, UpdateDuctRequestData body, @QueryMap(encoded=true) UpdateDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDuct</code> method in a fluent style.
   */
  public static class UpdateDuctQueryParams extends HashMap<String, Object> {
    public UpdateDuctQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDuctResponse updateSystemAttributesDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDuct</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDuctResponse> updateSystemAttributesDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDuctResponse
   */
  @RequestLine("POST /api/rest/entity/duct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDuctResponse updateSystemAttributesDuct(@Param("elid") String elid, UpdateSystemAttributesDuctRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDuctResponse
      */
      @RequestLine("POST /api/rest/entity/duct/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDuctResponse> updateSystemAttributesDuctWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDuctRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDuct</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDuctQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDuctQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
