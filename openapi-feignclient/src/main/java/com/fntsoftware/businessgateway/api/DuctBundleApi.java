package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateDuctBundleRequestData;
import com.fntsoftware.businessgateway.entities.CreateDuctBundleResponse;
import com.fntsoftware.businessgateway.entities.DeleteDuctBundleRequestData;
import com.fntsoftware.businessgateway.entities.DeleteDuctBundleResponse;
import com.fntsoftware.businessgateway.entities.DuctBundleContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundleContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundleDuctBundleTypesRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundleDuctBundleTypesResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundleDuctsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundleDuctsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundleFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundleFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundleMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundleMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundleOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundleOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundlePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundlePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundlePersonsRequestData;
import com.fntsoftware.businessgateway.entities.DuctBundlePersonsResponseData;
import com.fntsoftware.businessgateway.entities.DuctBundleQueryRequest;
import com.fntsoftware.businessgateway.entities.DuctBundleQueryResponse;
import com.fntsoftware.businessgateway.entities.DuctBundleSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DuctBundleSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateDuctBundleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateDuctBundleResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctBundleRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctBundleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface DuctBundleApi extends ApiClient.Api {


  /**
   * Create
   * Create Duct bundle
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateDuctBundleResponse createDuctBundle(@Param("sessionId") String sessionId, CreateDuctBundleRequestData body);

  /**
   * Create
   * Similar to <code>createDuctBundle</code> but it also returns the http response headers .
   * Create Duct bundle
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateDuctBundleResponse> createDuctBundleWithHttpInfo(@Param("sessionId") String sessionId, CreateDuctBundleRequestData body);


  /**
   * Create
   * Create Duct bundle
   * Note, this is equivalent to the other <code>createDuctBundle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateDuctBundleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateDuctBundleResponse createDuctBundle(CreateDuctBundleRequestData body, @QueryMap(encoded=true) CreateDuctBundleQueryParams queryParams);

  /**
  * Create
  * Create Duct bundle
  * Note, this is equivalent to the other <code>createDuctBundle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateDuctBundleResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundle/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateDuctBundleResponse> createDuctBundleWithHttpInfo(CreateDuctBundleRequestData body, @QueryMap(encoded=true) CreateDuctBundleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createDuctBundle</code> method in a fluent style.
   */
  public static class CreateDuctBundleQueryParams extends HashMap<String, Object> {
    public CreateDuctBundleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Duct bundle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteDuctBundleResponse deleteDuctBundle(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctBundleRequestData body);

  /**
   * Delete
   * Similar to <code>deleteDuctBundle</code> but it also returns the http response headers .
   * Delete Duct bundle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteDuctBundleResponse> deleteDuctBundleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteDuctBundleRequestData body);


  /**
   * Delete
   * Delete Duct bundle
   * Note, this is equivalent to the other <code>deleteDuctBundle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteDuctBundleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteDuctBundleResponse deleteDuctBundle(@Param("elid") String elid, DeleteDuctBundleRequestData body, @QueryMap(encoded=true) DeleteDuctBundleQueryParams queryParams);

  /**
  * Delete
  * Delete Duct bundle
  * Note, this is equivalent to the other <code>deleteDuctBundle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteDuctBundleResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteDuctBundleResponse> deleteDuctBundleWithHttpInfo(@Param("elid") String elid, DeleteDuctBundleRequestData body, @QueryMap(encoded=true) DeleteDuctBundleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteDuctBundle</code> method in a fluent style.
   */
  public static class DeleteDuctBundleQueryParams extends HashMap<String, Object> {
    public DeleteDuctBundleQueryParams sessionId(final String value) {
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
   * @return DuctBundleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleContractsResponseData ductBundleContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ductBundleContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleContractsResponseData> ductBundleContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ductBundleContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleContractsResponseData ductBundleContracts(@Param("elid") String elid, DuctBundleContractsRequestData body, @QueryMap(encoded=true) DuctBundleContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ductBundleContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleContractsResponseData> ductBundleContractsWithHttpInfo(@Param("elid") String elid, DuctBundleContractsRequestData body, @QueryMap(encoded=true) DuctBundleContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleContracts</code> method in a fluent style.
   */
  public static class DuctBundleContractsQueryParams extends HashMap<String, Object> {
    public DuctBundleContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct bundle type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DuctBundleDuctBundleTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/DuctBundleTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleDuctBundleTypesResponseData ductBundleDuctBundleTypes(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleDuctBundleTypesRequestData body);

  /**
   * Get relations to Duct bundle type entities
   * Similar to <code>ductBundleDuctBundleTypes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/DuctBundleTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleDuctBundleTypesResponseData> ductBundleDuctBundleTypesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleDuctBundleTypesRequestData body);


  /**
   * Get relations to Duct bundle type entities
   * 
   * Note, this is equivalent to the other <code>ductBundleDuctBundleTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleDuctBundleTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleDuctBundleTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/DuctBundleTypes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleDuctBundleTypesResponseData ductBundleDuctBundleTypes(@Param("elid") String elid, DuctBundleDuctBundleTypesRequestData body, @QueryMap(encoded=true) DuctBundleDuctBundleTypesQueryParams queryParams);

  /**
  * Get relations to Duct bundle type entities
  * 
  * Note, this is equivalent to the other <code>ductBundleDuctBundleTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleDuctBundleTypesResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/DuctBundleTypes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleDuctBundleTypesResponseData> ductBundleDuctBundleTypesWithHttpInfo(@Param("elid") String elid, DuctBundleDuctBundleTypesRequestData body, @QueryMap(encoded=true) DuctBundleDuctBundleTypesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleDuctBundleTypes</code> method in a fluent style.
   */
  public static class DuctBundleDuctBundleTypesQueryParams extends HashMap<String, Object> {
    public DuctBundleDuctBundleTypesQueryParams sessionId(final String value) {
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
   * @return DuctBundleDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleDuctsResponseData ductBundleDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>ductBundleDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleDuctsResponseData> ductBundleDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>ductBundleDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleDuctsResponseData ductBundleDucts(@Param("elid") String elid, DuctBundleDuctsRequestData body, @QueryMap(encoded=true) DuctBundleDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>ductBundleDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleDuctsResponseData> ductBundleDuctsWithHttpInfo(@Param("elid") String elid, DuctBundleDuctsRequestData body, @QueryMap(encoded=true) DuctBundleDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleDucts</code> method in a fluent style.
   */
  public static class DuctBundleDuctsQueryParams extends HashMap<String, Object> {
    public DuctBundleDuctsQueryParams sessionId(final String value) {
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
   * @return DuctBundleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleFrameContractsResponseData ductBundleFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ductBundleFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleFrameContractsResponseData> ductBundleFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ductBundleFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleFrameContractsResponseData ductBundleFrameContracts(@Param("elid") String elid, DuctBundleFrameContractsRequestData body, @QueryMap(encoded=true) DuctBundleFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ductBundleFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleFrameContractsResponseData> ductBundleFrameContractsWithHttpInfo(@Param("elid") String elid, DuctBundleFrameContractsRequestData body, @QueryMap(encoded=true) DuctBundleFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleFrameContracts</code> method in a fluent style.
   */
  public static class DuctBundleFrameContractsQueryParams extends HashMap<String, Object> {
    public DuctBundleFrameContractsQueryParams sessionId(final String value) {
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
   * @return DuctBundleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleMaintenanceContractsResponseData ductBundleMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ductBundleMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleMaintenanceContractsResponseData> ductBundleMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ductBundleMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleMaintenanceContractsResponseData ductBundleMaintenanceContracts(@Param("elid") String elid, DuctBundleMaintenanceContractsRequestData body, @QueryMap(encoded=true) DuctBundleMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ductBundleMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleMaintenanceContractsResponseData> ductBundleMaintenanceContractsWithHttpInfo(@Param("elid") String elid, DuctBundleMaintenanceContractsRequestData body, @QueryMap(encoded=true) DuctBundleMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleMaintenanceContracts</code> method in a fluent style.
   */
  public static class DuctBundleMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public DuctBundleMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return DuctBundleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleOrganizationsResponseData ductBundleOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ductBundleOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleOrganizationsResponseData> ductBundleOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ductBundleOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleOrganizationsResponseData ductBundleOrganizations(@Param("elid") String elid, DuctBundleOrganizationsRequestData body, @QueryMap(encoded=true) DuctBundleOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ductBundleOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleOrganizationsResponseData> ductBundleOrganizationsWithHttpInfo(@Param("elid") String elid, DuctBundleOrganizationsRequestData body, @QueryMap(encoded=true) DuctBundleOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleOrganizations</code> method in a fluent style.
   */
  public static class DuctBundleOrganizationsQueryParams extends HashMap<String, Object> {
    public DuctBundleOrganizationsQueryParams sessionId(final String value) {
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
   * @return DuctBundlePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundlePersonGroupsResponseData ductBundlePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundlePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ductBundlePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundlePersonGroupsResponseData> ductBundlePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundlePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ductBundlePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundlePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundlePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundlePersonGroupsResponseData ductBundlePersonGroups(@Param("elid") String elid, DuctBundlePersonGroupsRequestData body, @QueryMap(encoded=true) DuctBundlePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ductBundlePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundlePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundlePersonGroupsResponseData> ductBundlePersonGroupsWithHttpInfo(@Param("elid") String elid, DuctBundlePersonGroupsRequestData body, @QueryMap(encoded=true) DuctBundlePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundlePersonGroups</code> method in a fluent style.
   */
  public static class DuctBundlePersonGroupsQueryParams extends HashMap<String, Object> {
    public DuctBundlePersonGroupsQueryParams sessionId(final String value) {
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
   * @return DuctBundlePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundlePersonsResponseData ductBundlePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundlePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ductBundlePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundlePersonsResponseData> ductBundlePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundlePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ductBundlePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundlePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundlePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundlePersonsResponseData ductBundlePersons(@Param("elid") String elid, DuctBundlePersonsRequestData body, @QueryMap(encoded=true) DuctBundlePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ductBundlePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundlePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundlePersonsResponseData> ductBundlePersonsWithHttpInfo(@Param("elid") String elid, DuctBundlePersonsRequestData body, @QueryMap(encoded=true) DuctBundlePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundlePersons</code> method in a fluent style.
   */
  public static class DuctBundlePersonsQueryParams extends HashMap<String, Object> {
    public DuctBundlePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DuctBundleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleQueryResponse ductBundleQuery(@Param("sessionId") String sessionId, DuctBundleQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ductBundleQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleQueryResponse> ductBundleQueryWithHttpInfo(@Param("sessionId") String sessionId, DuctBundleQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>ductBundleQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleQueryResponse ductBundleQuery(DuctBundleQueryRequest body, @QueryMap(encoded=true) DuctBundleQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>ductBundleQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundle/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleQueryResponse> ductBundleQueryWithHttpInfo(DuctBundleQueryRequest body, @QueryMap(encoded=true) DuctBundleQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleQuery</code> method in a fluent style.
   */
  public static class DuctBundleQueryQueryParams extends HashMap<String, Object> {
    public DuctBundleQueryQueryParams sessionId(final String value) {
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
   * @return DuctBundleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleSystemAttributesResponse ductBundleSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ductBundleSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleSystemAttributesResponse> ductBundleSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ductBundleSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleSystemAttributesResponse ductBundleSystemAttributes(@Param("elid") String elid, DuctBundleSystemAttributesRequest body, @QueryMap(encoded=true) DuctBundleSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ductBundleSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleSystemAttributesResponse> ductBundleSystemAttributesWithHttpInfo(@Param("elid") String elid, DuctBundleSystemAttributesRequest body, @QueryMap(encoded=true) DuctBundleSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleSystemAttributes</code> method in a fluent style.
   */
  public static class DuctBundleSystemAttributesQueryParams extends HashMap<String, Object> {
    public DuctBundleSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Duct bundle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateDuctBundleResponse updateDuctBundle(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctBundleRequestData body);

  /**
   * Modify
   * Similar to <code>updateDuctBundle</code> but it also returns the http response headers .
   * Modify Duct bundle
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateDuctBundleResponse> updateDuctBundleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateDuctBundleRequestData body);


  /**
   * Modify
   * Modify Duct bundle
   * Note, this is equivalent to the other <code>updateDuctBundle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDuctBundleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateDuctBundleResponse updateDuctBundle(@Param("elid") String elid, UpdateDuctBundleRequestData body, @QueryMap(encoded=true) UpdateDuctBundleQueryParams queryParams);

  /**
  * Modify
  * Modify Duct bundle
  * Note, this is equivalent to the other <code>updateDuctBundle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateDuctBundleResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateDuctBundleResponse> updateDuctBundleWithHttpInfo(@Param("elid") String elid, UpdateDuctBundleRequestData body, @QueryMap(encoded=true) UpdateDuctBundleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateDuctBundle</code> method in a fluent style.
   */
  public static class UpdateDuctBundleQueryParams extends HashMap<String, Object> {
    public UpdateDuctBundleQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDuctBundleResponse updateSystemAttributesDuctBundle(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctBundleRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDuctBundle</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDuctBundleResponse> updateSystemAttributesDuctBundleWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctBundleRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDuctBundle</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDuctBundleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDuctBundleResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundle/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDuctBundleResponse updateSystemAttributesDuctBundle(@Param("elid") String elid, UpdateSystemAttributesDuctBundleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctBundleQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDuctBundle</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDuctBundleResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundle/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDuctBundleResponse> updateSystemAttributesDuctBundleWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDuctBundleRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctBundleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDuctBundle</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDuctBundleQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDuctBundleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
