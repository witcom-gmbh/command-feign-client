package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.CreateDuctTypeResponse;
import com.fntsoftware.businessgateway.entities.DeleteDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDuctTypeResponse;
import com.fntsoftware.businessgateway.entities.DuctTypeContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctTypeContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctTypeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctTypeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctTypeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctTypeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctTypeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DuctTypeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DuctTypePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DuctTypePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DuctTypePersonsRequestData;
import com.fntsoftware.businessgateway.entities.DuctTypePersonsResponseData;
import com.fntsoftware.businessgateway.entities.DuctTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.DuctTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.DuctTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DuctTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDuctTypeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DuctTypeApi extends ApiClient.Api {


  /**
   * Create
   * Create Duct type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDuctTypeResponse createDuctType(@Param("sessionId") String sessionId, CreateDuctTypeRequestData body);

  /**
   * Create
   * Similar to <code>createDuctType</code> but it also returns the http response headers .
   * Create Duct type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDuctTypeResponse> createDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, CreateDuctTypeRequestData body);


  /**
   * Create
   * Create Duct type
   * Note, this is equivalent to the other <code>createDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDuctTypeResponse createDuctType(CreateDuctTypeRequestData body, @QueryMap(encoded=true) CreateDuctTypeQueryParams queryParams);

  /**
  * Create
  * Create Duct type
  * Note, this is equivalent to the other <code>createDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductType/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDuctTypeResponse> createDuctTypeWithHttpInfo(CreateDuctTypeRequestData body, @QueryMap(encoded=true) CreateDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDuctType</code> method in a fluent style.
   */
  public static class CreateDuctTypeQueryParams extends HashMap<String, Object> {
    public CreateDuctTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Duct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDuctTypeResponse deleteDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctTypeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDuctType</code> but it also returns the http response headers .
   * Delete Duct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDuctTypeResponse> deleteDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctTypeRequestData body);


  /**
   * Delete
   * Delete Duct type
   * Note, this is equivalent to the other <code>deleteDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDuctTypeResponse deleteDuctType(@Param("elid") String elid, DeleteDuctTypeRequestData body, @QueryMap(encoded=true) DeleteDuctTypeQueryParams queryParams);

  /**
  * Delete
  * Delete Duct type
  * Note, this is equivalent to the other <code>deleteDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDuctTypeResponse> deleteDuctTypeWithHttpInfo(@Param("elid") String elid, DeleteDuctTypeRequestData body, @QueryMap(encoded=true) DeleteDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDuctType</code> method in a fluent style.
   */
  public static class DeleteDuctTypeQueryParams extends HashMap<String, Object> {
    public DeleteDuctTypeQueryParams sessionId(final String value) {
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
   * @return DuctTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypeContractsResponseData ductTypeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ductTypeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypeContractsResponseData> ductTypeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ductTypeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypeContractsResponseData ductTypeContracts(@Param("elid") String elid, DuctTypeContractsRequestData body, @QueryMap(encoded=true) DuctTypeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ductTypeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypeContractsResponseData> ductTypeContractsWithHttpInfo(@Param("elid") String elid, DuctTypeContractsRequestData body, @QueryMap(encoded=true) DuctTypeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypeContracts</code> method in a fluent style.
   */
  public static class DuctTypeContractsQueryParams extends HashMap<String, Object> {
    public DuctTypeContractsQueryParams sessionId(final String value) {
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
   * @return DuctTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypeFrameContractsResponseData ductTypeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ductTypeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypeFrameContractsResponseData> ductTypeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ductTypeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypeFrameContractsResponseData ductTypeFrameContracts(@Param("elid") String elid, DuctTypeFrameContractsRequestData body, @QueryMap(encoded=true) DuctTypeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ductTypeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypeFrameContractsResponseData> ductTypeFrameContractsWithHttpInfo(@Param("elid") String elid, DuctTypeFrameContractsRequestData body, @QueryMap(encoded=true) DuctTypeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypeFrameContracts</code> method in a fluent style.
   */
  public static class DuctTypeFrameContractsQueryParams extends HashMap<String, Object> {
    public DuctTypeFrameContractsQueryParams sessionId(final String value) {
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
   * @return DuctTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypeMaintenanceContractsResponseData ductTypeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ductTypeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypeMaintenanceContractsResponseData> ductTypeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ductTypeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypeMaintenanceContractsResponseData ductTypeMaintenanceContracts(@Param("elid") String elid, DuctTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) DuctTypeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ductTypeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypeMaintenanceContractsResponseData> ductTypeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DuctTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) DuctTypeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypeMaintenanceContracts</code> method in a fluent style.
   */
  public static class DuctTypeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DuctTypeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return DuctTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypeOrganizationsResponseData ductTypeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ductTypeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypeOrganizationsResponseData> ductTypeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ductTypeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypeOrganizationsResponseData ductTypeOrganizations(@Param("elid") String elid, DuctTypeOrganizationsRequestData body, @QueryMap(encoded=true) DuctTypeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ductTypeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypeOrganizationsResponseData> ductTypeOrganizationsWithHttpInfo(@Param("elid") String elid, DuctTypeOrganizationsRequestData body, @QueryMap(encoded=true) DuctTypeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypeOrganizations</code> method in a fluent style.
   */
  public static class DuctTypeOrganizationsQueryParams extends HashMap<String, Object> {
    public DuctTypeOrganizationsQueryParams sessionId(final String value) {
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
   * @return DuctTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypePersonGroupsResponseData ductTypePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ductTypePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypePersonGroupsResponseData> ductTypePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ductTypePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypePersonGroupsResponseData ductTypePersonGroups(@Param("elid") String elid, DuctTypePersonGroupsRequestData body, @QueryMap(encoded=true) DuctTypePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ductTypePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypePersonGroupsResponseData> ductTypePersonGroupsWithHttpInfo(@Param("elid") String elid, DuctTypePersonGroupsRequestData body, @QueryMap(encoded=true) DuctTypePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypePersonGroups</code> method in a fluent style.
   */
  public static class DuctTypePersonGroupsQueryParams extends HashMap<String, Object> {
    public DuctTypePersonGroupsQueryParams sessionId(final String value) {
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
   * @return DuctTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypePersonsResponseData ductTypePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ductTypePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypePersonsResponseData> ductTypePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ductTypePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypePersonsResponseData ductTypePersons(@Param("elid") String elid, DuctTypePersonsRequestData body, @QueryMap(encoded=true) DuctTypePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ductTypePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypePersonsResponseData> ductTypePersonsWithHttpInfo(@Param("elid") String elid, DuctTypePersonsRequestData body, @QueryMap(encoded=true) DuctTypePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypePersons</code> method in a fluent style.
   */
  public static class DuctTypePersonsQueryParams extends HashMap<String, Object> {
    public DuctTypePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DuctTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypeQueryResponse ductTypeQuery(@Param("sessionId") String sessionId, DuctTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ductTypeQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypeQueryResponse> ductTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, DuctTypeQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>ductTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypeQueryResponse ductTypeQuery(DuctTypeQueryRequest body, @QueryMap(encoded=true) DuctTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>ductTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ductType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypeQueryResponse> ductTypeQueryWithHttpInfo(DuctTypeQueryRequest body, @QueryMap(encoded=true) DuctTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypeQuery</code> method in a fluent style.
   */
  public static class DuctTypeQueryQueryParams extends HashMap<String, Object> {
    public DuctTypeQueryQueryParams sessionId(final String value) {
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
   * @return DuctTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctTypeSystemAttributesResponse ductTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ductTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctTypeSystemAttributesResponse> ductTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ductTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctTypeSystemAttributesResponse ductTypeSystemAttributes(@Param("elid") String elid, DuctTypeSystemAttributesRequest body, @QueryMap(encoded=true) DuctTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ductTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctTypeSystemAttributesResponse> ductTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, DuctTypeSystemAttributesRequest body, @QueryMap(encoded=true) DuctTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductTypeSystemAttributes</code> method in a fluent style.
   */
  public static class DuctTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public DuctTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Duct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDuctTypeResponse updateDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctTypeRequestData body);

  /**
   * Modify
   * Similar to <code>updateDuctType</code> but it also returns the http response headers .
   * Modify Duct type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDuctTypeResponse> updateDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctTypeRequestData body);


  /**
   * Modify
   * Modify Duct type
   * Note, this is equivalent to the other <code>updateDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDuctTypeResponse updateDuctType(@Param("elid") String elid, UpdateDuctTypeRequestData body, @QueryMap(encoded=true) UpdateDuctTypeQueryParams queryParams);

  /**
  * Modify
  * Modify Duct type
  * Note, this is equivalent to the other <code>updateDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDuctTypeResponse> updateDuctTypeWithHttpInfo(@Param("elid") String elid, UpdateDuctTypeRequestData body, @QueryMap(encoded=true) UpdateDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDuctType</code> method in a fluent style.
   */
  public static class UpdateDuctTypeQueryParams extends HashMap<String, Object> {
    public UpdateDuctTypeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDuctTypeResponse updateSystemAttributesDuctType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDuctType</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDuctTypeResponse> updateSystemAttributesDuctTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctTypeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDuctType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDuctTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDuctTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDuctTypeResponse updateSystemAttributesDuctType(@Param("elid") String elid, UpdateSystemAttributesDuctTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDuctType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDuctTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDuctTypeResponse> updateSystemAttributesDuctTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDuctTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDuctType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDuctTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDuctTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
