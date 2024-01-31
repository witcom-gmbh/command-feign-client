package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateMultiDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.CreateMultiDuctTypeResponse;
import com.fntsoftware.businessgateway.entities.DeleteMultiDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMultiDuctTypeResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeContractsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeContractsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeDuctTypesRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeDuctTypesResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypePersonsRequestData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypePersonsResponseData;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MultiDuctTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateMultiDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMultiDuctTypeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface MultiDuctTypeApi extends ApiClient.Api {


  /**
   * Create
   * Create Multiduct type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateMultiDuctTypeResponse createMultiDuctType(@Param("sessionId") String sessionId, CreateMultiDuctTypeRequestData body);

  /**
   * Create
   * Similar to <code>createMultiDuctType</code> but it also returns the http response headers .
   * Create Multiduct type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateMultiDuctTypeResponse> createMultiDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, CreateMultiDuctTypeRequestData body);


  /**
   * Create
   * Create Multiduct type
   * Note, this is equivalent to the other <code>createMultiDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateMultiDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateMultiDuctTypeResponse createMultiDuctType(CreateMultiDuctTypeRequestData body, @QueryMap(encoded=true) CreateMultiDuctTypeQueryParams queryParams);

  /**
  * Create
  * Create Multiduct type
  * Note, this is equivalent to the other <code>createMultiDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateMultiDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateMultiDuctTypeResponse> createMultiDuctTypeWithHttpInfo(CreateMultiDuctTypeRequestData body, @QueryMap(encoded=true) CreateMultiDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createMultiDuctType</code> method in a fluent style.
   */
  public static class CreateMultiDuctTypeQueryParams extends HashMap<String, Object> {
    public CreateMultiDuctTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Multiduct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMultiDuctTypeResponse deleteMultiDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMultiDuctTypeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMultiDuctType</code> but it also returns the http response headers .
   * Delete Multiduct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMultiDuctTypeResponse> deleteMultiDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMultiDuctTypeRequestData body);


  /**
   * Delete
   * Delete Multiduct type
   * Note, this is equivalent to the other <code>deleteMultiDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMultiDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMultiDuctTypeResponse deleteMultiDuctType(@Param("elid") String elid, DeleteMultiDuctTypeRequestData body, @QueryMap(encoded=true) DeleteMultiDuctTypeQueryParams queryParams);

  /**
  * Delete
  * Delete Multiduct type
  * Note, this is equivalent to the other <code>deleteMultiDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMultiDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMultiDuctTypeResponse> deleteMultiDuctTypeWithHttpInfo(@Param("elid") String elid, DeleteMultiDuctTypeRequestData body, @QueryMap(encoded=true) DeleteMultiDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMultiDuctType</code> method in a fluent style.
   */
  public static class DeleteMultiDuctTypeQueryParams extends HashMap<String, Object> {
    public DeleteMultiDuctTypeQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeContractsResponseData multiDuctTypeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>multiDuctTypeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeContractsResponseData> multiDuctTypeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeContractsResponseData multiDuctTypeContracts(@Param("elid") String elid, MultiDuctTypeContractsRequestData body, @QueryMap(encoded=true) MultiDuctTypeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeContractsResponseData> multiDuctTypeContractsWithHttpInfo(@Param("elid") String elid, MultiDuctTypeContractsRequestData body, @QueryMap(encoded=true) MultiDuctTypeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeContracts</code> method in a fluent style.
   */
  public static class MultiDuctTypeContractsQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeContractsQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypeDuctTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeDuctTypesResponseData multiDuctTypeDuctTypes(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeDuctTypesRequestData body);

  /**
   * Get relations to Duct type entities
   * Similar to <code>multiDuctTypeDuctTypes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeDuctTypesResponseData> multiDuctTypeDuctTypesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeDuctTypesRequestData body);


  /**
   * Get relations to Duct type entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypeDuctTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeDuctTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeDuctTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeDuctTypesResponseData multiDuctTypeDuctTypes(@Param("elid") String elid, MultiDuctTypeDuctTypesRequestData body, @QueryMap(encoded=true) MultiDuctTypeDuctTypesQueryParams queryParams);

  /**
  * Get relations to Duct type entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypeDuctTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeDuctTypesResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/DuctTypes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeDuctTypesResponseData> multiDuctTypeDuctTypesWithHttpInfo(@Param("elid") String elid, MultiDuctTypeDuctTypesRequestData body, @QueryMap(encoded=true) MultiDuctTypeDuctTypesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeDuctTypes</code> method in a fluent style.
   */
  public static class MultiDuctTypeDuctTypesQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeDuctTypesQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeFrameContractsResponseData multiDuctTypeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>multiDuctTypeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeFrameContractsResponseData> multiDuctTypeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeFrameContractsResponseData multiDuctTypeFrameContracts(@Param("elid") String elid, MultiDuctTypeFrameContractsRequestData body, @QueryMap(encoded=true) MultiDuctTypeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeFrameContractsResponseData> multiDuctTypeFrameContractsWithHttpInfo(@Param("elid") String elid, MultiDuctTypeFrameContractsRequestData body, @QueryMap(encoded=true) MultiDuctTypeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeFrameContracts</code> method in a fluent style.
   */
  public static class MultiDuctTypeFrameContractsQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeFrameContractsQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeMaintenanceContractsResponseData multiDuctTypeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>multiDuctTypeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeMaintenanceContractsResponseData> multiDuctTypeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeMaintenanceContractsResponseData multiDuctTypeMaintenanceContracts(@Param("elid") String elid, MultiDuctTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) MultiDuctTypeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeMaintenanceContractsResponseData> multiDuctTypeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, MultiDuctTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) MultiDuctTypeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeMaintenanceContracts</code> method in a fluent style.
   */
  public static class MultiDuctTypeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeOrganizationsResponseData multiDuctTypeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>multiDuctTypeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeOrganizationsResponseData> multiDuctTypeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeOrganizationsResponseData multiDuctTypeOrganizations(@Param("elid") String elid, MultiDuctTypeOrganizationsRequestData body, @QueryMap(encoded=true) MultiDuctTypeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeOrganizationsResponseData> multiDuctTypeOrganizationsWithHttpInfo(@Param("elid") String elid, MultiDuctTypeOrganizationsRequestData body, @QueryMap(encoded=true) MultiDuctTypeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeOrganizations</code> method in a fluent style.
   */
  public static class MultiDuctTypeOrganizationsQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeOrganizationsQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypePersonGroupsResponseData multiDuctTypePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>multiDuctTypePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypePersonGroupsResponseData> multiDuctTypePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypePersonGroupsResponseData multiDuctTypePersonGroups(@Param("elid") String elid, MultiDuctTypePersonGroupsRequestData body, @QueryMap(encoded=true) MultiDuctTypePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypePersonGroupsResponseData> multiDuctTypePersonGroupsWithHttpInfo(@Param("elid") String elid, MultiDuctTypePersonGroupsRequestData body, @QueryMap(encoded=true) MultiDuctTypePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypePersonGroups</code> method in a fluent style.
   */
  public static class MultiDuctTypePersonGroupsQueryParams extends HashMap<String, Object> {
    public MultiDuctTypePersonGroupsQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypePersonsResponseData multiDuctTypePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>multiDuctTypePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypePersonsResponseData> multiDuctTypePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>multiDuctTypePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypePersonsResponseData multiDuctTypePersons(@Param("elid") String elid, MultiDuctTypePersonsRequestData body, @QueryMap(encoded=true) MultiDuctTypePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>multiDuctTypePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypePersonsResponseData> multiDuctTypePersonsWithHttpInfo(@Param("elid") String elid, MultiDuctTypePersonsRequestData body, @QueryMap(encoded=true) MultiDuctTypePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypePersons</code> method in a fluent style.
   */
  public static class MultiDuctTypePersonsQueryParams extends HashMap<String, Object> {
    public MultiDuctTypePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MultiDuctTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeQueryResponse multiDuctTypeQuery(@Param("sessionId") String sessionId, MultiDuctTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>multiDuctTypeQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeQueryResponse> multiDuctTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, MultiDuctTypeQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>multiDuctTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeQueryResponse multiDuctTypeQuery(MultiDuctTypeQueryRequest body, @QueryMap(encoded=true) MultiDuctTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>multiDuctTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeQueryResponse> multiDuctTypeQueryWithHttpInfo(MultiDuctTypeQueryRequest body, @QueryMap(encoded=true) MultiDuctTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeQuery</code> method in a fluent style.
   */
  public static class MultiDuctTypeQueryQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeQueryQueryParams sessionId(final String value) {
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
   * @return MultiDuctTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MultiDuctTypeSystemAttributesResponse multiDuctTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>multiDuctTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MultiDuctTypeSystemAttributesResponse> multiDuctTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MultiDuctTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>multiDuctTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MultiDuctTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MultiDuctTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MultiDuctTypeSystemAttributesResponse multiDuctTypeSystemAttributes(@Param("elid") String elid, MultiDuctTypeSystemAttributesRequest body, @QueryMap(encoded=true) MultiDuctTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>multiDuctTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MultiDuctTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MultiDuctTypeSystemAttributesResponse> multiDuctTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, MultiDuctTypeSystemAttributesRequest body, @QueryMap(encoded=true) MultiDuctTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>multiDuctTypeSystemAttributes</code> method in a fluent style.
   */
  public static class MultiDuctTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public MultiDuctTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Multiduct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMultiDuctTypeResponse updateMultiDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMultiDuctTypeRequestData body);

  /**
   * Modify
   * Similar to <code>updateMultiDuctType</code> but it also returns the http response headers .
   * Modify Multiduct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMultiDuctTypeResponse> updateMultiDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMultiDuctTypeRequestData body);


  /**
   * Modify
   * Modify Multiduct type
   * Note, this is equivalent to the other <code>updateMultiDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMultiDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMultiDuctTypeResponse updateMultiDuctType(@Param("elid") String elid, UpdateMultiDuctTypeRequestData body, @QueryMap(encoded=true) UpdateMultiDuctTypeQueryParams queryParams);

  /**
  * Modify
  * Modify Multiduct type
  * Note, this is equivalent to the other <code>updateMultiDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMultiDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMultiDuctTypeResponse> updateMultiDuctTypeWithHttpInfo(@Param("elid") String elid, UpdateMultiDuctTypeRequestData body, @QueryMap(encoded=true) UpdateMultiDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMultiDuctType</code> method in a fluent style.
   */
  public static class UpdateMultiDuctTypeQueryParams extends HashMap<String, Object> {
    public UpdateMultiDuctTypeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMultiDuctTypeResponse updateSystemAttributesMultiDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMultiDuctTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMultiDuctType</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMultiDuctTypeResponse> updateSystemAttributesMultiDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMultiDuctTypeRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMultiDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMultiDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMultiDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMultiDuctTypeResponse updateSystemAttributesMultiDuctType(@Param("elid") String elid, UpdateSystemAttributesMultiDuctTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMultiDuctTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMultiDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMultiDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/multiDuctType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMultiDuctTypeResponse> updateSystemAttributesMultiDuctTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMultiDuctTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMultiDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMultiDuctType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMultiDuctTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMultiDuctTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
