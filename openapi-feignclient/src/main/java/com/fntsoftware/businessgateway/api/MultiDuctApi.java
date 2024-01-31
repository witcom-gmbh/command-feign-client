package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateMultiDuctRequestData;
import com.fntsoftware.businessgateway.entities.CreateMultiDuctResponse;
import com.fntsoftware.businessgateway.entities.DeleteMultiDuctRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMultiDuctResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctContractsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctContractsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctDuctsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctDuctsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctFromDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctFromDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctFromNodeRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctFromNodeResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctMultiDuctContentRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctMultiDuctContentResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctMultiDuctRouteRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctMultiDuctRouteResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctMultiDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctMultiDuctTypeResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctPersonsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctPersonsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctQueryRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctQueryResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctToDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctToDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctToNodeRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctToNodeResponseData;
import com.fntsoftware.businessgateway.entities.UpdateMultiDuctRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMultiDuctResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface MultiDuctApi extends ApiClient.Api {


  /**
   * Create
   * Create Multiducts
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateMultiDuctResponse createMultiDuct(@Param("sessionId") String sessionId, CreateMultiDuctRequestData body);

  /**
   * Create
   * Similar to <code>createMultiDuct</code> but it also returns the http response headers .
   * Create Multiducts
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateMultiDuctResponse> createMultiDuctWithHttpInfo(@Param("sessionId") String sessionId, CreateMultiDuctRequestData body);


  /**
   * Create
   * Create Multiducts
   * Note, this is equivalent to the other <code>createMultiDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateMultiDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateMultiDuctResponse createMultiDuct(CreateMultiDuctRequestData body, @QueryMap(encoded=true) CreateMultiDuctQueryParams queryParams);

  /**
  * Create
  * Create Multiducts
  * Note, this is equivalent to the other <code>createMultiDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateMultiDuctResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateMultiDuctResponse> createMultiDuctWithHttpInfo(CreateMultiDuctRequestData body, @QueryMap(encoded=true) CreateMultiDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createMultiDuct</code> method in a fluent style.
   */
  public static class CreateMultiDuctQueryParams extends HashMap<String, Object> {
    public CreateMultiDuctQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Multiducts
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMultiDuctResponse deleteMultiDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMultiDuctRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMultiDuct</code> but it also returns the http response headers .
   * Delete Multiducts
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMultiDuctResponse> deleteMultiDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMultiDuctRequestData body);


  /**
   * Delete
   * Delete Multiducts
   * Note, this is equivalent to the other <code>deleteMultiDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMultiDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMultiDuctResponse deleteMultiDuct(@Param("elid") String elid, DeleteMultiDuctRequestData body, @QueryMap(encoded=true) DeleteMultiDuctQueryParams queryParams);

  /**
  * Delete
  * Delete Multiducts
  * Note, this is equivalent to the other <code>deleteMultiDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMultiDuctResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMultiDuctResponse> deleteMultiDuctWithHttpInfo(@Param("elid") String elid, DeleteMultiDuctRequestData body, @QueryMap(encoded=true) DeleteMultiDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMultiDuct</code> method in a fluent style.
   */
  public static class DeleteMultiDuctQueryParams extends HashMap<String, Object> {
    public DeleteMultiDuctQueryParams sessionId(final String value) {
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
   * @return MultiDuctContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctContractsResponseData multiDuctContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>multiDuctContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctContractsResponseData> multiDuctContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>multiDuctContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctContractsResponseData multiDuctContracts(@Param("elid") String elid, MultiDuctContractsRequestData body, @QueryMap(encoded=true) MultiDuctContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>multiDuctContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctContractsResponseData> multiDuctContractsWithHttpInfo(@Param("elid") String elid, MultiDuctContractsRequestData body, @QueryMap(encoded=true) MultiDuctContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctContracts</code> method in a fluent style.
   */
  public static class MultiDuctContractsQueryParams extends HashMap<String, Object> {
    public MultiDuctContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MultiDuctDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctDuctsResponseData multiDuctDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>multiDuctDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctDuctsResponseData> multiDuctDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>multiDuctDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctDuctsResponseData multiDuctDucts(@Param("elid") String elid, MultiDuctDuctsRequestData body, @QueryMap(encoded=true) MultiDuctDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>multiDuctDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctDuctsResponseData> multiDuctDuctsWithHttpInfo(@Param("elid") String elid, MultiDuctDuctsRequestData body, @QueryMap(encoded=true) MultiDuctDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctDucts</code> method in a fluent style.
   */
  public static class MultiDuctDuctsQueryParams extends HashMap<String, Object> {
    public MultiDuctDuctsQueryParams sessionId(final String value) {
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
   * @return MultiDuctFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctFrameContractsResponseData multiDuctFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>multiDuctFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctFrameContractsResponseData> multiDuctFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>multiDuctFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctFrameContractsResponseData multiDuctFrameContracts(@Param("elid") String elid, MultiDuctFrameContractsRequestData body, @QueryMap(encoded=true) MultiDuctFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>multiDuctFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctFrameContractsResponseData> multiDuctFrameContractsWithHttpInfo(@Param("elid") String elid, MultiDuctFrameContractsRequestData body, @QueryMap(encoded=true) MultiDuctFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctFrameContracts</code> method in a fluent style.
   */
  public static class MultiDuctFrameContractsQueryParams extends HashMap<String, Object> {
    public MultiDuctFrameContractsQueryParams sessionId(final String value) {
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
   * @return MultiDuctFromDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctFromDeviceAllResponseData multiDuctFromDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctFromDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>multiDuctFromDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctFromDeviceAllResponseData> multiDuctFromDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctFromDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>multiDuctFromDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctFromDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctFromDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromDeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctFromDeviceAllResponseData multiDuctFromDeviceAll(@Param("elid") String elid, MultiDuctFromDeviceAllRequestData body, @QueryMap(encoded=true) MultiDuctFromDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>multiDuctFromDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctFromDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromDeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctFromDeviceAllResponseData> multiDuctFromDeviceAllWithHttpInfo(@Param("elid") String elid, MultiDuctFromDeviceAllRequestData body, @QueryMap(encoded=true) MultiDuctFromDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctFromDeviceAll</code> method in a fluent style.
   */
  public static class MultiDuctFromDeviceAllQueryParams extends HashMap<String, Object> {
    public MultiDuctFromDeviceAllQueryParams sessionId(final String value) {
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
   * @return MultiDuctFromNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctFromNodeResponseData multiDuctFromNode(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctFromNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>multiDuctFromNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctFromNodeResponseData> multiDuctFromNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctFromNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>multiDuctFromNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctFromNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctFromNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctFromNodeResponseData multiDuctFromNode(@Param("elid") String elid, MultiDuctFromNodeRequestData body, @QueryMap(encoded=true) MultiDuctFromNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>multiDuctFromNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctFromNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/FromNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctFromNodeResponseData> multiDuctFromNodeWithHttpInfo(@Param("elid") String elid, MultiDuctFromNodeRequestData body, @QueryMap(encoded=true) MultiDuctFromNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctFromNode</code> method in a fluent style.
   */
  public static class MultiDuctFromNodeQueryParams extends HashMap<String, Object> {
    public MultiDuctFromNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MultiDuctInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctInheritedGeoCoordinatesResponse multiDuctInheritedGeoCoordinates(@Param("sessionId") String sessionId, MultiDuctInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>multiDuctInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctInheritedGeoCoordinatesResponse> multiDuctInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, MultiDuctInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>multiDuctInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctInheritedGeoCoordinatesResponse multiDuctInheritedGeoCoordinates(MultiDuctInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) MultiDuctInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>multiDuctInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctInheritedGeoCoordinatesResponse> multiDuctInheritedGeoCoordinatesWithHttpInfo(MultiDuctInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) MultiDuctInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class MultiDuctInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public MultiDuctInheritedGeoCoordinatesQueryParams sessionId(final String value) {
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
   * @return MultiDuctMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctMaintenanceContractsResponseData multiDuctMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>multiDuctMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctMaintenanceContractsResponseData> multiDuctMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>multiDuctMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctMaintenanceContractsResponseData multiDuctMaintenanceContracts(@Param("elid") String elid, MultiDuctMaintenanceContractsRequestData body, @QueryMap(encoded=true) MultiDuctMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>multiDuctMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctMaintenanceContractsResponseData> multiDuctMaintenanceContractsWithHttpInfo(@Param("elid") String elid, MultiDuctMaintenanceContractsRequestData body, @QueryMap(encoded=true) MultiDuctMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctMaintenanceContracts</code> method in a fluent style.
   */
  public static class MultiDuctMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public MultiDuctMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query multiduct content
   * Query all objects of the multiduct content.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MultiDuctMultiDuctContentResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctMultiDuctContentResponse multiDuctMultiDuctContent(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMultiDuctContentRequest body);

  /**
   * Query multiduct content
   * Similar to <code>multiDuctMultiDuctContent</code> but it also returns the http response headers .
   * Query all objects of the multiduct content.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctMultiDuctContentResponse> multiDuctMultiDuctContentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMultiDuctContentRequest body);


  /**
   * Query multiduct content
   * Query all objects of the multiduct content.
   * Note, this is equivalent to the other <code>multiDuctMultiDuctContent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctMultiDuctContentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctMultiDuctContentResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctContent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctMultiDuctContentResponse multiDuctMultiDuctContent(@Param("elid") String elid, MultiDuctMultiDuctContentRequest body, @QueryMap(encoded=true) MultiDuctMultiDuctContentQueryParams queryParams);

  /**
  * Query multiduct content
  * Query all objects of the multiduct content.
  * Note, this is equivalent to the other <code>multiDuctMultiDuctContent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctMultiDuctContentResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctContent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctMultiDuctContentResponse> multiDuctMultiDuctContentWithHttpInfo(@Param("elid") String elid, MultiDuctMultiDuctContentRequest body, @QueryMap(encoded=true) MultiDuctMultiDuctContentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctMultiDuctContent</code> method in a fluent style.
   */
  public static class MultiDuctMultiDuctContentQueryParams extends HashMap<String, Object> {
    public MultiDuctMultiDuctContentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query multiduct route
   * Query all objects of the multiduct route.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MultiDuctMultiDuctRouteResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctMultiDuctRouteResponse multiDuctMultiDuctRoute(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMultiDuctRouteRequest body);

  /**
   * Query multiduct route
   * Similar to <code>multiDuctMultiDuctRoute</code> but it also returns the http response headers .
   * Query all objects of the multiduct route.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctMultiDuctRouteResponse> multiDuctMultiDuctRouteWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMultiDuctRouteRequest body);


  /**
   * Query multiduct route
   * Query all objects of the multiduct route.
   * Note, this is equivalent to the other <code>multiDuctMultiDuctRoute</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctMultiDuctRouteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctMultiDuctRouteResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctMultiDuctRouteResponse multiDuctMultiDuctRoute(@Param("elid") String elid, MultiDuctMultiDuctRouteRequest body, @QueryMap(encoded=true) MultiDuctMultiDuctRouteQueryParams queryParams);

  /**
  * Query multiduct route
  * Query all objects of the multiduct route.
  * Note, this is equivalent to the other <code>multiDuctMultiDuctRoute</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctMultiDuctRouteResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctMultiDuctRouteResponse> multiDuctMultiDuctRouteWithHttpInfo(@Param("elid") String elid, MultiDuctMultiDuctRouteRequest body, @QueryMap(encoded=true) MultiDuctMultiDuctRouteQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctMultiDuctRoute</code> method in a fluent style.
   */
  public static class MultiDuctMultiDuctRouteQueryParams extends HashMap<String, Object> {
    public MultiDuctMultiDuctRouteQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Multiduct type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MultiDuctMultiDuctTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctMultiDuctTypeResponseData multiDuctMultiDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMultiDuctTypeRequestData body);

  /**
   * Get relations to Multiduct type entities
   * Similar to <code>multiDuctMultiDuctType</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctMultiDuctTypeResponseData> multiDuctMultiDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctMultiDuctTypeRequestData body);


  /**
   * Get relations to Multiduct type entities
   * 
   * Note, this is equivalent to the other <code>multiDuctMultiDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctMultiDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctMultiDuctTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctMultiDuctTypeResponseData multiDuctMultiDuctType(@Param("elid") String elid, MultiDuctMultiDuctTypeRequestData body, @QueryMap(encoded=true) MultiDuctMultiDuctTypeQueryParams queryParams);

  /**
  * Get relations to Multiduct type entities
  * 
  * Note, this is equivalent to the other <code>multiDuctMultiDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctMultiDuctTypeResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/MultiDuctType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctMultiDuctTypeResponseData> multiDuctMultiDuctTypeWithHttpInfo(@Param("elid") String elid, MultiDuctMultiDuctTypeRequestData body, @QueryMap(encoded=true) MultiDuctMultiDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctMultiDuctType</code> method in a fluent style.
   */
  public static class MultiDuctMultiDuctTypeQueryParams extends HashMap<String, Object> {
    public MultiDuctMultiDuctTypeQueryParams sessionId(final String value) {
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
   * @return MultiDuctOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctOrganizationsResponseData multiDuctOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>multiDuctOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctOrganizationsResponseData> multiDuctOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>multiDuctOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctOrganizationsResponseData multiDuctOrganizations(@Param("elid") String elid, MultiDuctOrganizationsRequestData body, @QueryMap(encoded=true) MultiDuctOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>multiDuctOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctOrganizationsResponseData> multiDuctOrganizationsWithHttpInfo(@Param("elid") String elid, MultiDuctOrganizationsRequestData body, @QueryMap(encoded=true) MultiDuctOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctOrganizations</code> method in a fluent style.
   */
  public static class MultiDuctOrganizationsQueryParams extends HashMap<String, Object> {
    public MultiDuctOrganizationsQueryParams sessionId(final String value) {
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
   * @return MultiDuctPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctPersonGroupsResponseData multiDuctPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>multiDuctPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctPersonGroupsResponseData> multiDuctPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>multiDuctPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctPersonGroupsResponseData multiDuctPersonGroups(@Param("elid") String elid, MultiDuctPersonGroupsRequestData body, @QueryMap(encoded=true) MultiDuctPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>multiDuctPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctPersonGroupsResponseData> multiDuctPersonGroupsWithHttpInfo(@Param("elid") String elid, MultiDuctPersonGroupsRequestData body, @QueryMap(encoded=true) MultiDuctPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctPersonGroups</code> method in a fluent style.
   */
  public static class MultiDuctPersonGroupsQueryParams extends HashMap<String, Object> {
    public MultiDuctPersonGroupsQueryParams sessionId(final String value) {
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
   * @return MultiDuctPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctPersonsResponseData multiDuctPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>multiDuctPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctPersonsResponseData> multiDuctPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>multiDuctPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctPersonsResponseData multiDuctPersons(@Param("elid") String elid, MultiDuctPersonsRequestData body, @QueryMap(encoded=true) MultiDuctPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>multiDuctPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctPersonsResponseData> multiDuctPersonsWithHttpInfo(@Param("elid") String elid, MultiDuctPersonsRequestData body, @QueryMap(encoded=true) MultiDuctPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctPersons</code> method in a fluent style.
   */
  public static class MultiDuctPersonsQueryParams extends HashMap<String, Object> {
    public MultiDuctPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MultiDuctQueryResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctQueryResponse multiDuctQuery(@Param("sessionId") String sessionId, MultiDuctQueryRequest body);

  /**
   * Basic query
   * Similar to <code>multiDuctQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctQueryResponse> multiDuctQueryWithHttpInfo(@Param("sessionId") String sessionId, MultiDuctQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>multiDuctQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctQueryResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctQueryResponse multiDuctQuery(MultiDuctQueryRequest body, @QueryMap(encoded=true) MultiDuctQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>multiDuctQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctQueryResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctQueryResponse> multiDuctQueryWithHttpInfo(MultiDuctQueryRequest body, @QueryMap(encoded=true) MultiDuctQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctQuery</code> method in a fluent style.
   */
  public static class MultiDuctQueryQueryParams extends HashMap<String, Object> {
    public MultiDuctQueryQueryParams sessionId(final String value) {
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
   * @return MultiDuctSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctSystemAttributesResponse multiDuctSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>multiDuctSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctSystemAttributesResponse> multiDuctSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>multiDuctSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctSystemAttributesResponse multiDuctSystemAttributes(@Param("elid") String elid, MultiDuctSystemAttributesRequest body, @QueryMap(encoded=true) MultiDuctSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>multiDuctSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctSystemAttributesResponse> multiDuctSystemAttributesWithHttpInfo(@Param("elid") String elid, MultiDuctSystemAttributesRequest body, @QueryMap(encoded=true) MultiDuctSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctSystemAttributes</code> method in a fluent style.
   */
  public static class MultiDuctSystemAttributesQueryParams extends HashMap<String, Object> {
    public MultiDuctSystemAttributesQueryParams sessionId(final String value) {
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
   * @return MultiDuctToDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctToDeviceAllResponseData multiDuctToDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctToDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>multiDuctToDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToDeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctToDeviceAllResponseData> multiDuctToDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctToDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>multiDuctToDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctToDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctToDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToDeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctToDeviceAllResponseData multiDuctToDeviceAll(@Param("elid") String elid, MultiDuctToDeviceAllRequestData body, @QueryMap(encoded=true) MultiDuctToDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>multiDuctToDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctToDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToDeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctToDeviceAllResponseData> multiDuctToDeviceAllWithHttpInfo(@Param("elid") String elid, MultiDuctToDeviceAllRequestData body, @QueryMap(encoded=true) MultiDuctToDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctToDeviceAll</code> method in a fluent style.
   */
  public static class MultiDuctToDeviceAllQueryParams extends HashMap<String, Object> {
    public MultiDuctToDeviceAllQueryParams sessionId(final String value) {
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
   * @return MultiDuctToNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctToNodeResponseData multiDuctToNode(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctToNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>multiDuctToNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctToNodeResponseData> multiDuctToNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctToNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>multiDuctToNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctToNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctToNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctToNodeResponseData multiDuctToNode(@Param("elid") String elid, MultiDuctToNodeRequestData body, @QueryMap(encoded=true) MultiDuctToNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>multiDuctToNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctToNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/ToNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctToNodeResponseData> multiDuctToNodeWithHttpInfo(@Param("elid") String elid, MultiDuctToNodeRequestData body, @QueryMap(encoded=true) MultiDuctToNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctToNode</code> method in a fluent style.
   */
  public static class MultiDuctToNodeQueryParams extends HashMap<String, Object> {
    public MultiDuctToNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Multiducts
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMultiDuctResponse updateMultiDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMultiDuctRequestData body);

  /**
   * Modify
   * Similar to <code>updateMultiDuct</code> but it also returns the http response headers .
   * Modify Multiducts
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMultiDuctResponse> updateMultiDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMultiDuctRequestData body);


  /**
   * Modify
   * Modify Multiducts
   * Note, this is equivalent to the other <code>updateMultiDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMultiDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMultiDuctResponse updateMultiDuct(@Param("elid") String elid, UpdateMultiDuctRequestData body, @QueryMap(encoded=true) UpdateMultiDuctQueryParams queryParams);

  /**
  * Modify
  * Modify Multiducts
  * Note, this is equivalent to the other <code>updateMultiDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMultiDuctResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMultiDuctResponse> updateMultiDuctWithHttpInfo(@Param("elid") String elid, UpdateMultiDuctRequestData body, @QueryMap(encoded=true) UpdateMultiDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMultiDuct</code> method in a fluent style.
   */
  public static class UpdateMultiDuctQueryParams extends HashMap<String, Object> {
    public UpdateMultiDuctQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMultiDuctResponse updateSystemAttributesMultiDuct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMultiDuctRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMultiDuct</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMultiDuctResponse> updateSystemAttributesMultiDuctWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMultiDuctRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMultiDuct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMultiDuctQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMultiDuctResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMultiDuctResponse updateSystemAttributesMultiDuct(@Param("elid") String elid, UpdateSystemAttributesMultiDuctRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMultiDuctQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMultiDuct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMultiDuctResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuct/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMultiDuctResponse> updateSystemAttributesMultiDuctWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMultiDuctRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMultiDuctQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMultiDuct</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMultiDuctQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMultiDuctQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
